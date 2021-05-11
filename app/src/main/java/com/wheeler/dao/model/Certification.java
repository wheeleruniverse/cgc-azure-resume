package com.wheeler.dao.model;

import com.wheeler.dao.model.partial.MonthYear;
import lombok.Data;

@Data
public class Certification {

    private String id;
    private String name;
    private String credentialId;
    private String description;
    private MonthYear expiry;
    private MonthYear issued;
    private String level;
    private String vendor;
}