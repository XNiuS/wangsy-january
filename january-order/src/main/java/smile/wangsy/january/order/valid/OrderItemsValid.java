package smile.wangsy.january.order.valid;

import java.io.Serializable;
import lombok.Data;

/**
 * @author wangsy
 * @date 2018/08/31
 */
@Data
public class OrderItemsValid implements Serializable {

    /**
     * 当前页号
     */
    private Integer pageNumber;

    /**
     * 总页数
     */
    private Integer pageSize;

}
