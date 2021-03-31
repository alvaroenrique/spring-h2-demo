package com.bcpdemo.demo;

import com.bcpdemo.demo.model.Change;
import com.bcpdemo.demo.model.ExchangeRate;
import com.bcpdemo.demo.service.ExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExchangeRateController {

    @Autowired
    private ExchangeRateService exchangeRateService;

    @RequestMapping(value = "/exchange-rate", method = RequestMethod.GET)
    List<ExchangeRate> getAllEmployee(){
        return exchangeRateService.findAll();
    }

    @RequestMapping(value = "/exchange-rate/{id}", method = RequestMethod.GET)
    ExchangeRate getEmployee(@PathVariable String id){
        return  exchangeRateService.findById(id).get();
    }

    @RequestMapping(value = "/exchange-rate", method = RequestMethod.PUT)
    ExchangeRate updateEmployee(@RequestBody ExchangeRate exchangeRate){
        return exchangeRateService.save(exchangeRate);
    }

    @RequestMapping(value = "/exchange-rate", method = RequestMethod.POST)
    String addEmployee(@RequestBody ExchangeRate exchangeRate){
        ExchangeRate newExchangeRate = exchangeRateService.save(exchangeRate);
        return "SUCCESS";
    }

    @RequestMapping(value = "/exchange-rate/change", method = RequestMethod.GET)
    Change change(@RequestParam double monto, @RequestParam String moneda_origen, @RequestParam String moneda_destino){
        double precioMonedaOrigen = exchangeRateService.findById(moneda_origen).get().getDolarPrice();
        double precioMonedaDestino = exchangeRateService.findById(moneda_destino).get().getDolarPrice();

        double montoConCambio =  (monto * precioMonedaOrigen) / precioMonedaDestino ;
        double tipoDeCambio = precioMonedaOrigen / precioMonedaDestino;

        return new Change(monto, montoConCambio, moneda_origen, moneda_destino, tipoDeCambio);
    }

}
