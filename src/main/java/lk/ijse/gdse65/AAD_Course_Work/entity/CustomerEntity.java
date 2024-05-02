package lk.ijse.gdse65.AAD_Course_Work.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "customer")
public class CustomerEntity implements SuperEntity{
    @Id
    private String customer_code;
    private String customer_name;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Date join_date;
    @Enumerated(EnumType.STRING)
    private Level level;
    private int total_points;
    private Date dob;
    private String address;

//    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
//    private List<Sale> sales = new ArrayList<>();

}