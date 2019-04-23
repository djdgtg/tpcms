package com.retech.tpcms;

import com.alibaba.fastjson.JSONObject;
import com.retech.tpcms.aspect.LogAspect;
import com.retech.tpcms.entity.Approval;
import com.retech.tpcms.entity.Log;
import com.retech.tpcms.entity.Resource;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Field;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TpcmsApplicationTests {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Test
    public void contextLoads() {
        elasticsearchTemplate.createIndex(Resource.class);
    }

}
