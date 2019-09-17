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

import static com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTyped;

@DynamoDBTable(tableName = "custom-boolean-class")
public class CustomBooleanClass {
    private String key;
    private CustomBoolean customBooleanAttribute;

    @DynamoDBHashKey
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @DynamoDBTyped(DynamoDBAttributeType.S)
    @DynamoDBAttribute
    public CustomBoolean getCustomBooleanAttribute() {
        return customBooleanAttribute;
    }

    public void setCustomBooleanAttribute(CustomBoolean customBooleanAttribute) {
        this.customBooleanAttribute = customBooleanAttribute;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        result = prime * result + ((customBooleanAttribute == null) ? 0 : customBooleanAttribute.hashCode());
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
        CustomBooleanClass other = (CustomBooleanClass) obj;
        if ( key == null ) {
            if ( other.key != null )
                return false;
        } else if ( !key.equals(other.key) )
            return false;
        if ( customBooleanAttribute == null ) {
            if ( other.customBooleanAttribute != null )
                return false;
        } else if ( !customBooleanAttribute.equals(other.customBooleanAttribute) )
            return false;
        return true;
    }

    public static class CustomBoolean {
        private final boolean value;

        public CustomBoolean(boolean value) {
            this.value = value;
        }

        public boolean getValue() {
            return value;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + (value ? 1231 : 1237);
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
            CustomBoolean other = (CustomBoolean) obj;
            return value == other.value;
        }
    }
}
