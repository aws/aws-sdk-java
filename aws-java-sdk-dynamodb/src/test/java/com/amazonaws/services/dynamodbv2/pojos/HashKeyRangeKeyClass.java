/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.pojos;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "aws-java-sdk-hash-range-test")
public class HashKeyRangeKeyClass {

    private long hashKey;
    private double rangeKey;

    private String stringAttribute;

    @DynamoDBHashKey
    public long getHashKey() {
        return hashKey;
    }

    public void setHashKey(long hashKey) {
        this.hashKey = hashKey;
    }

    @DynamoDBRangeKey
    public double getRangeKey() {
        return rangeKey;
    }

    public void setRangeKey(double rangeKey) {
        this.rangeKey = rangeKey;
    }

    @DynamoDBAttribute
    public String getStringAttribute() {
        return stringAttribute;
    }

    public void setStringAttribute(String stringAttribute) {
        this.stringAttribute = stringAttribute;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (hashKey ^ (hashKey >>> 32));
        long temp;
        temp = Double.doubleToLongBits(rangeKey);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((stringAttribute == null) ? 0 : stringAttribute.hashCode());
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
        HashKeyRangeKeyClass other = (HashKeyRangeKeyClass) obj;
        if ( hashKey != other.hashKey )
            return false;
        if ( Double.doubleToLongBits(rangeKey) != Double.doubleToLongBits(other.rangeKey) )
            return false;
        if ( stringAttribute == null ) {
            if ( other.stringAttribute != null )
                return false;
        } else if ( !stringAttribute.equals(other.stringAttribute) )
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "HashKeyRangeKeyClass [hashKey=" + hashKey + ", rangeKey=" + rangeKey + ", stringAttribute=" + stringAttribute + "]";
    }

}
