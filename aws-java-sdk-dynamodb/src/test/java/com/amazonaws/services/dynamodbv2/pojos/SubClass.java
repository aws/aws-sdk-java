/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

import java.nio.ByteBuffer;

@DynamoDBDocument
public class SubClass {

    private String name;
    private Integer value;
    private ByteBuffer bb;

    public SubClass() {
        name = "name";
        value = 123;
    }

    public String getName() { return name; }
    public void setName(String n) { name = n; }

    public Integer getValue() { return value; }
    public void setValue(Integer i) { value = i; }

    public ByteBuffer getNull() { return bb; }
    public void setNull(ByteBuffer b) { bb = b; }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubClass)) {
            return false;
        }

        SubClass that = (SubClass) o;

        return equals(this.name, that.name)
                && equals(this.value, that.value)
                && equals(this.bb, that.bb);
    }

    @Override
    public String toString() {
        return "{name=" + name + ", value=" + value + ", bb=" + bb + "}";
    }

    public static <T> boolean equals(T one, T two) {
        if (one == null) {
            return (two == null);
        } else {
            return one.equals(two);
        }
    }
}
