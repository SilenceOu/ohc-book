package com.ohc.dto;

import com.ohc.dto.base.OutputConverter;
import com.ohc.entity.AdminRole;
import com.ohc.entity.User;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2022/1/24 17:56
 */
@Data
@ToString
public class UserDTO implements OutputConverter<UserDTO, User> {

    private int id;

    private String username;

    private String name;

    private String phone;

    private String email;

    private boolean enabled;

    private List<AdminRole> roles;

}