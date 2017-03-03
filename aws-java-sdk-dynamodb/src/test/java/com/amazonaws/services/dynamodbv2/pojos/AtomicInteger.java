package com.amazonaws.services.dynamodbv2.pojos;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAtomicInteger;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/**
 * Created by magrnw on 3/3/17.
 */
@DynamoDBTable(tableName = "atomicIntTable")
public class AtomicInteger {

    @DynamoDBHashKey(attributeName = "jobId")
    private String jobId;

    @DynamoDBAttribute(attributeName = "val")
    private String val;

    @DynamoDBAtomicInteger(attributeName = "AI", incr = 2)
    private Integer atomicInt;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public Integer getAtomicInt() {
        return atomicInt;
    }

    public void setAtomicInt(Integer atomicInt) {
        this.atomicInt = atomicInt;
    }
}
