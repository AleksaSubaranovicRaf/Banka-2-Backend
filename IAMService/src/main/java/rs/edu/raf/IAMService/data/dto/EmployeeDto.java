package rs.edu.raf.IAMService.data.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rs.edu.raf.IAMService.data.entites.Permission;
import rs.edu.raf.IAMService.data.entites.Role;

import java.util.Date;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
public class EmployeeDto extends UserDto {

    private String name;
    private String surname;
    private String gender;
    private String position;
    private String department;

    public EmployeeDto(
            Long id,
            Date dateOfBirth,
            String email,
            String username,
            String phone,
            String address,
            Role role,
            List<Permission> permissions,
            boolean active,
            String name,
            String gender,
            String position,
            String department
    ) {
        super(id, dateOfBirth, email, username, phone, address, role, permissions, active);
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.position = position;
        this.department = department;
    }
}
