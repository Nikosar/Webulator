package controller;

import calc.Calculator;
import dto.RequestDTO;
import dto.ResultDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CalcController {
    private Calculator calculator;
    private final Logger LOGGER = LoggerFactory.getLogger(CalcController.class);

    @Autowired
    public CalcController(Calculator calculator) {
        this.calculator = calculator;
    }

    @PostMapping(value = "/sum")
    public ResultDTO sum(@RequestBody RequestDTO dto) {
        LOGGER.info("sum: dto={}", dto);

        return calculator.sum(dto);
    }

    @PostMapping(value = "/sub")
    public ResultDTO sub(@RequestBody RequestDTO dto) {
        LOGGER.info("sub: dto={}", dto);

        return calculator.sub(dto);
    }

    @PostMapping(value = "/div")
    public ResultDTO div(@RequestBody RequestDTO dto) {
        LOGGER.info("div: dto={}", dto);

        return calculator.div(dto);
    }

    @PostMapping(value = "/mul")
    public ResultDTO mul(@RequestBody RequestDTO dto) {
        LOGGER.info("mul: dto={}", dto);

        return calculator.mul(dto);
    }


}
