package pe.edu.upc.streamfunctional.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Account {
    private Integer id;
    private String numberAccount;
    private Float amount;
    private String customer;
}
