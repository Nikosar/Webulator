package calc;

import dto.RequestDTO;
import dto.ResultDTO;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Component
public class Calculator {
    //TODO output format

    public ResultDTO sum(RequestDTO dto) {
        BigDecimal sum = dto.getA().add(dto.getB());
        return new ResultDTO(sum.toString());
    }

    public ResultDTO sub(RequestDTO dto) {
        BigDecimal sub = dto.getA().subtract(dto.getB());
        return new ResultDTO(sub.toString());
    }

    public ResultDTO div(RequestDTO dto) {
        //TODO scale format
        BigDecimal div = dto.getA().divide(dto.getB(), 4, RoundingMode.HALF_DOWN);
        return new ResultDTO(div.toString());
    }

    public ResultDTO mul(RequestDTO dto) {
        BigDecimal mul = dto.getA().multiply(dto.getB());
        return new ResultDTO(mul.toString());
    }
}
