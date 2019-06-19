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

@DynamoDBTable(tableName = "aws-java-sdk-dynamodb-mapper-save-config-test")
public class SlimAttributeNamesClass {
    private String hashKey;
    private Long rangeKey;
    private String z;
    private String a;
    private String l;
    private String c;
    private String g;
    private String m;


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

    @DynamoDBAttribute
    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }

    @DynamoDBAttribute
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @DynamoDBAttribute
    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    @DynamoDBAttribute
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @DynamoDBAttribute
    public String getG() {
        return g;
    }

    public void setG(String g) {
        this.g = g;
    }

    @DynamoDBAttribute
    public String getM() {
        return m;
    }

    public void setM(String a) {
        this.m = m;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((hashKey == null) ? 0 : hashKey.hashCode());
        result = prime * result + ((rangeKey == null) ? 0 : rangeKey.hashCode());
        result = prime * result + ((z == null) ? 0 : z.hashCode());
        result = prime * result + ((a == null) ? 0 : a.hashCode());
        result = prime * result + ((l == null) ? 0 : l.hashCode());
        result = prime * result + ((c == null) ? 0 : c.hashCode());
        result = prime * result + ((g == null) ? 0 : g.hashCode());
        result = prime * result + ((m == null) ? 0 : m.hashCode());
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
        SlimAttributeNamesClass other = (SlimAttributeNamesClass) obj;
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
        if ( z == null ) {
            if ( other.z != null )
                return false;
        } else if ( !z.equals(other.z) )
            return false;
        if ( a == null ) {
            if ( other.a != null )
                return false;
        } else if ( !a.equals(other.a) )
            return false;
        if ( l == null ) {
            if ( other.l != null )
                return false;
        } else if ( !l.equals(other.l) )
            return false;
        if ( c == null ) {
            if ( other.c != null )
                return false;
        } else if ( !c.equals(other.c) )
            return false;
        if ( g == null ) {
            if ( other.g != null )
                return false;
        } else if ( !g.equals(other.g) )
            return false;
        if ( m == null ) {
            if ( other.m != null )
                return false;
        } else if ( !m.equals(other.m) )
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "{SlimAttributeNamesClass: hashKey=" + hashKey + ", rangeKey=" + rangeKey
                       + ", z=" + z + ", a=" + a + ", l=" + l + ", c=" + c + ", g=" + g + ", m=" + m + "}";
    }


}
