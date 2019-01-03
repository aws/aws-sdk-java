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

import java.nio.ByteBuffer;
import java.util.Set;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/**
 * Test domain class with byteBuffer attribute, byteBuffer set and a string key
 */
@DynamoDBTable(tableName = "aws-java-sdk-util")
public class BinaryAttributeByteBufferClass {

    private String key;
    private ByteBuffer binaryAttribute;
    private Set<ByteBuffer> binarySetAttribute;

    @DynamoDBHashKey(attributeName = "key")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @DynamoDBAttribute(attributeName = "binaryAttribute")
    public ByteBuffer getBinaryAttribute() {
        return binaryAttribute;
    }

    public void setBinaryAttribute(ByteBuffer binaryAttribute) {
        this.binaryAttribute = binaryAttribute;
    }

    @DynamoDBAttribute(attributeName = "binarySetAttribute")
    public Set<ByteBuffer> getBinarySetAttribute() {
        return binarySetAttribute;
    }

    public void setBinarySetAttribute(Set<ByteBuffer> binarySetAttribute) {
        this.binarySetAttribute = binarySetAttribute;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        result = prime * result + ((binaryAttribute == null) ? 0 : binaryAttribute.hashCode());
        result = prime * result + ((binarySetAttribute == null) ? 0 : binarySetAttribute.hashCode());
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
        BinaryAttributeByteBufferClass other = (BinaryAttributeByteBufferClass) obj;
        if ( key == null ) {
            if ( other.key != null )
                return false;
        } else if ( !key.equals(other.key) )
            return false;
        if ( binaryAttribute == null ) {
            if ( other.binaryAttribute != null )
                return false;
        } else if ( !binaryAttribute.equals(other.binaryAttribute) )
            return false;
        if ( binarySetAttribute == null ) {
            if ( other.binarySetAttribute != null )
                return false;
        } else if ( !binarySetAttribute.equals(other.binarySetAttribute) )
            return false;
        return true;
    }

}
