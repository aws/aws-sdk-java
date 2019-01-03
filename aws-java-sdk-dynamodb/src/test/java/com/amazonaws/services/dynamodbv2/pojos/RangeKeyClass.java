/*
 * Copyright 2013-2019 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.pojos;

import java.math.BigDecimal;
import java.util.Set;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBVersionAttribute;

/**
 * Comprehensive domain class
 */
@DynamoDBTable(tableName = "aws-java-sdk-range-test")
public class RangeKeyClass {

    private long key;
    private double rangeKey;
    private Long version;

    private Set<Integer> integerSetAttribute;
    private Set<String> stringSetAttribute;
    private BigDecimal bigDecimalAttribute;
    private String stringAttribute;

    @DynamoDBHashKey
    public long getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
    }

    @DynamoDBRangeKey
    public double getRangeKey() {
        return rangeKey;
    }

    public void setRangeKey(double rangeKey) {
        this.rangeKey = rangeKey;
    }

    @DynamoDBAttribute(attributeName = "integerSetAttribute")
    public Set<Integer> getIntegerAttribute() {
        return integerSetAttribute;
    }

    public void setIntegerAttribute(Set<Integer> integerAttribute) {
        this.integerSetAttribute = integerAttribute;
    }

    @DynamoDBAttribute
    public Set<String> getStringSetAttribute() {
        return stringSetAttribute;
    }

    public void setStringSetAttribute(Set<String> stringSetAttribute) {
        this.stringSetAttribute = stringSetAttribute;
    }

    @DynamoDBAttribute
    public BigDecimal getBigDecimalAttribute() {
        return bigDecimalAttribute;
    }

    public void setBigDecimalAttribute(BigDecimal bigDecimalAttribute) {
        this.bigDecimalAttribute = bigDecimalAttribute;
    }

    @DynamoDBAttribute
    public String getStringAttribute() {
        return stringAttribute;
    }

    public void setStringAttribute(String stringAttribute) {
        this.stringAttribute = stringAttribute;
    }

    @DynamoDBVersionAttribute
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bigDecimalAttribute == null) ? 0 : bigDecimalAttribute.hashCode());
        result = prime * result + ((integerSetAttribute == null) ? 0 : integerSetAttribute.hashCode());
        result = prime * result + (int) (key ^ (key >>> 32));
        long temp;
        temp = Double.doubleToLongBits(rangeKey);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((stringAttribute == null) ? 0 : stringAttribute.hashCode());
        result = prime * result + ((stringSetAttribute == null) ? 0 : stringSetAttribute.hashCode());
        result = prime * result + ((version == null) ? 0 : version.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if ( this == obj )
            return true;
        if ( obj == null )
            return false;
        if ( getClass() != obj.getClass() )
            return false;
        RangeKeyClass other = (RangeKeyClass) obj;
        if ( bigDecimalAttribute == null ) {
            if ( other.bigDecimalAttribute != null )
                return false;
        } else if ( !bigDecimalAttribute.equals(other.bigDecimalAttribute) )
            return false;
        if ( integerSetAttribute == null ) {
            if ( other.integerSetAttribute != null )
                return false;
        } else if ( !integerSetAttribute.equals(other.integerSetAttribute) )
            return false;
        if ( key != other.key )
            return false;
        if ( Double.doubleToLongBits(rangeKey) != Double.doubleToLongBits(other.rangeKey) )
            return false;
        if ( stringAttribute == null ) {
            if ( other.stringAttribute != null )
                return false;
        } else if ( !stringAttribute.equals(other.stringAttribute) )
            return false;
        if ( stringSetAttribute == null ) {
            if ( other.stringSetAttribute != null )
                return false;
        } else if ( !stringSetAttribute.equals(other.stringSetAttribute) )
            return false;
        if ( version == null ) {
            if ( other.version != null )
                return false;
        } else if ( !version.equals(other.version) )
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "RangeKeyClass [key=" + key + ", rangeKey=" + rangeKey + ", version=" + version
                + ", integerSetAttribute=" + integerSetAttribute + ", stringSetAttribute=" + stringSetAttribute
                + ", bigDecimalAttribute=" + bigDecimalAttribute + ", stringAttribute=" + stringAttribute + "]";
    }

}
