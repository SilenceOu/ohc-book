package com.ohc.dto;

import com.ohc.pojo.User;
import lombok.Data;
import lombok.ToString;

/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2022/1/24 17:56
 */
@Data
@ToString
public class UserDTO implements com.gm.wj.dto.base.OutputConverter<UserDTO, User> {

    private int id;

    private String username;

    private String name;

    private String phone;

    private String email;

    private boolean enabled;

    private List<AdminRole> roles;

}