package com.zhuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by 86175 on 2020/3/28.
 */
@Data //省略get set 方法
@AllArgsConstructor //有参构造
@NoArgsConstructor //无参构造
public class TestStudent {
    private Long studentId;
    private String studentName;
    private String studentSex;
    private Long studentAge;
    private String studentCode;

}
