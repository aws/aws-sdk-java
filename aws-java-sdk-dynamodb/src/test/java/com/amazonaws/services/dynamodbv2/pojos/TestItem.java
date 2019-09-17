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

import java.util.Set;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "aws-java-sdk-dynamodb-mapper-save-config-test")
public class TestItem {

    private String hashKey;
    private Long rangeKey;
    private String stringAttribute;
    private String nonKeyAttribute;
    private Set<String> stringSetAttribute;

    @DynamoDBHashKey(attributeName = "hashKey")
    public String getHashKey() {
        return hashKey;
    }

    public void setHashKey(String hashKey) {
        this.hashKey = hashKey;
    }

    @DynamoDBRangeKey(attributeName = "rangeKey")
    public Long getRangeKey() {
        return rangeKey;
    }

    public void setRangeKey(Long rangeKey) {
        this.rangeKey = rangeKey;
    }

    @DynamoDBAttribute(attributeName = "nonKeyAttribute")
    public String getNonKeyAttribute() {
        return nonKeyAttribute;
    }

    public void setNonKeyAttribute(String nonKeyAttribute) {
        this.nonKeyAttribute = nonKeyAttribute;
    }

    @DynamoDBAttribute
    public String getStringAttribute() {
        return stringAttribute;
    }

    public void setStringAttribute(String stringAttribute) {
        this.stringAttribute = stringAttribute;
    }


    @DynamoDBAttribute(attributeName = "stringSetAttribute")
    public Set<String> getStringSetAttribute() {
        return stringSetAttribute;
    }

    public void setStringSetAttribute(Set<String> stringSetAttribute) {
        this.stringSetAttribute = stringSetAttribute;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((hashKey == null) ? 0 : hashKey.hashCode());
        result = prime * result + ((rangeKey == null) ? 0 : rangeKey.hashCode());
        result = prime * result + ((nonKeyAttribute == null) ? 0 : nonKeyAttribute.hashCode());
        result = prime * result + ((stringAttribute == null) ? 0 : stringAttribute.hashCode());
        result = prime * result + ((stringSetAttribute == null) ? 0 : stringSetAttribute.hashCode());
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
        TestItem other = (TestItem) obj;
        if ( hashKey == null ) {
            if ( other.hashKey != null )
                return false;
        } else if ( !hashKey.equals(other.hashKey) )
            return false;
        if ( rangeKey == null ) {
            if ( other.rangeKey != null )
                return false;
        } else if ( !rangeKey.equals(other.rangeKey) )
            return false;
        if ( nonKeyAttribute == null ) {
            if ( other.nonKeyAttribute != null )
                return false;
        } else if ( !nonKeyAttribute.equals(other.nonKeyAttribute) )
            return false;
        if ( stringSetAttribute == null ) {
            if ( other.stringSetAttribute != null )
                return false;
        } else if ( !stringSetAttribute.equals(other.stringSetAttribute) )
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "TestItem: {hashKey=" + hashKey + ", rangeKey=" + rangeKey
                       + ", stringAttribute=" + stringAttribute + ", stringSetAttribute="
                       + stringSetAttribute + ", nonKeyAttribute=" + nonKeyAttribute + "}";
    }

}
