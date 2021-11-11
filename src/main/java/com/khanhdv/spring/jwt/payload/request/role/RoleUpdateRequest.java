package com.khanhdv.spring.jwt.payload.request.role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleUpdateRequest {

    private Long id;

    private String name;

    private List<Long> permissions;

}
