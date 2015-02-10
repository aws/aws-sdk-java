/*
* Copyright 2014-2015 Amazon Technologies, Inc.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at:
*
* http://aws.amazon.com/apache2.0
*
* This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
* OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and
* limitations under the License.
*/
package com.amazonaws.services.dynamodbv2.datamodeling.marshallers;

import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentMarshaller.StringAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
* A marshaller that marshals Java {@code Object} objects into DynamoDB
* Strings.
*
* @author Sergei Egorov
*/
public class ObjectToStringMarshaller implements StringAttributeMarshaller {

    private static final ObjectToStringMarshaller INSTANCE =
            new ObjectToStringMarshaller();

    public static ObjectToStringMarshaller instance() {
        return INSTANCE;
    }

    private ObjectToStringMarshaller() {
    }

    @Override
    public AttributeValue marshall(Object obj) {
        return new AttributeValue().withS(obj.toString());
    }
}
