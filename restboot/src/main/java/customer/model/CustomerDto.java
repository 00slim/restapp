package customer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

/**
 * Created by Filip Burlaga on 2016-12-24.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "customer")
@XmlAccessorType(value = XmlAccessType.NONE)
public class CustomerDto {

    @XmlAttribute
    private Long id;
    @XmlElement
    private String name;

}
