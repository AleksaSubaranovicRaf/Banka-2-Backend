package rs.edu.raf.IAMService.data.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rs.edu.raf.IAMService.data.entites.Permission;
import rs.edu.raf.IAMService.data.entites.Role;
import rs.edu.raf.IAMService.data.enums.RoleType;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class CorporateClientDto extends UserDto {

    private String name;
    private String primaryAccountNumber;


    public CorporateClientDto(
            Long id,
            Date dateOfBirth,
            String email,
            String username,
            String phone,
            String address,
            List<Permission> permissions,
            String name,
            String primaryAccountNumber
    ) {
        super(id, dateOfBirth, email, username, phone, address, new Role(RoleType.USER), permissions);
        this.name = name;
        this.primaryAccountNumber = primaryAccountNumber;
    }
}
