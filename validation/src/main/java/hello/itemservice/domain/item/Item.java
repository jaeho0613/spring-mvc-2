package hello.itemservice.domain.item;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
// 기능이 약해서 권장하지 않음
// @ScriptAssert(lang = "javascript", script = "_this.price * _this.quantity >= 10000", message = "총합이 10000원이 넘게 해주세요.")
public class Item {

    private Long id;

    @NotBlank(message = "공백X")
    private String itemName;

    @NotNull
    @Range(min = 1000, max = 10000)
    private Integer price;

    @NotNull
    @Max(1000)
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
