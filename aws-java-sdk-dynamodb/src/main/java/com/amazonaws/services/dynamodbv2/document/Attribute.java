/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.document;

import com.amazonaws.services.dynamodbv2.document.internal.InternalUtils;

/**
 * A key/value pair.
 */
public class Attribute {
    private final String name;
    private final Object value;

    public Attribute(String attrName, Object value) {
        InternalUtils.checkInvalidAttrName(attrName);
        this.name = attrName;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{" + name + ": " + value + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        // attribute name is never null as enforced in ctor
        hashCode = prime * hashCode + getName().hashCode();
        hashCode = prime * hashCode
                + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object in) {
        if (in instanceof Attribute) {
            Attribute that = (Attribute)in;
            if (this.name.equals(that.name)) {
                if (this.value == null)
                    return that.value == null;
                else
                    return this.value.equals(that.value);
            }
        }
        return false;
    }
}
