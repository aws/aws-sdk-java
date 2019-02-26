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
 * A key attribute which consists of an attribute name and value.
 */
public class KeyAttribute extends Attribute {

    /**
     * A key attribute which consists of an attribute name and value.
     */
    public KeyAttribute(String attrName, Object value) {
        super(attrName, value);
        InternalUtils.checkInvalidAttrName(attrName);
    }
}
