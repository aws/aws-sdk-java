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
package com.amazonaws.services.dynamodbv2.datamodeling;

import java.util.UUID;

public class RandomUUIDMarshaller implements DynamoDBMarshaller<Object>, DynamoDBTypeConverter<String,Object> {

    public static final String randomUUID = UUID.randomUUID().toString();

    @Override
    public String marshall(Object getterReturnResult) {
        return randomUUID;
    }

    @Override
    public Object unmarshall(Class<Object> clazz, String obj) {
        return null;
    }

    @Override
    public String convert(final Object object) {
        return randomUUID;
    }

    @Override
    public Object unconvert(final String object) {
        return null;
    }

}
