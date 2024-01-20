package com.zht.maven.pojo;

import com.zht.Demo01;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: User
 * Package: com.zht.maven.pojo
 * Description:
 *
 * @Author ZHT
 * @Create 2023/12/26 22:47
 * @Version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;

}
