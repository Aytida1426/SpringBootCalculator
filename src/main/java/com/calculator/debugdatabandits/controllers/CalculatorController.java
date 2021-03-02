package com.calculator.debugdatabandits.controllers;

import com.calculator.debugdatabandits.service.CalculateSimple;
import com.calculator.debugdatabandits.model.OperationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {

    OperationModel operationModel = new OperationModel();

    @Autowired
    private CalculateSimple calculateSimple;

    @RequestMapping("/")
    public String getCalculatorPage(Model model){
        model.addAttribute("operationModel",operationModel);
        return "Calculator";
    }

    @RequestMapping(value="/", params="add", method = RequestMethod.POST)
    public String add(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("Result", calculateSimple.add(operationModel));
        return "Calculator";
    }

    @RequestMapping(value="/", params="subtract", method = RequestMethod.POST)
    public String subtract(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("Result", calculateSimple.subtract(operationModel));
        return "Calculator";
    }

    @RequestMapping(value="/", params="multiply", method = RequestMethod.POST)
    public String multiply(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("Result", calculateSimple.multiply(operationModel));
        return "Calculator";
    }

    @RequestMapping(value="/", params="divide", method = RequestMethod.POST)
    public String divide(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("Result", calculateSimple.divide(operationModel));
        return "Calculator";
    }

    @RequestMapping(value="/", params="fibonacci", method = RequestMethod.POST)
    public String fibonacci(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("Result", calculateSimple.fibonacci(operationModel));
        return "Calculator";
    }

    @RequestMapping(value="/", params="sqrt", method = RequestMethod.POST)
    public String sqrt(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("Result", calculateSimple.sqrt(operationModel));
        return "Calculator";
    }

    @RequestMapping(value="/", params="power", method = RequestMethod.POST)
    public String power(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("Result", calculateSimple.power(operationModel));
        return "Calculator";
    }

    @RequestMapping(value="/", params="factorial", method = RequestMethod.POST)
    public String factorial(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("Result", calculateSimple.factorial(operationModel));
        return "Calculator";
    }

    @RequestMapping(value="/", params="clearSimple", method = RequestMethod.POST)
    public String clearSimple(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("operationModel",  calculateSimple.clearSimple(operationModel));
        model.addAttribute("Result", 0);
        return "Calculator";
    }

    @RequestMapping(value="/", params="clearAdvanced", method = RequestMethod.POST)
    public String clearAdvanced(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("operationModel",  calculateSimple.clearAdvanced(operationModel));
        model.addAttribute("Result", 0);
        return "Calculator";
    }
}