package lk.ijse.gdse65.AAD_Course_Work.dto;

import lk.ijse.gdse65.AAD_Course_Work.entity.Gender;
import lk.ijse.gdse65.AAD_Course_Work.entity.Level;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {
    private String customer_code;
    private String customer_name;
    private Gender gender;
    private Date join_date;
    private Level level;
    private int total_points;
    private Date dob;
    private String address;
}