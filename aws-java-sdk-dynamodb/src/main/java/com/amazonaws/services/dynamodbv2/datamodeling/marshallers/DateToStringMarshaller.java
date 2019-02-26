/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.datamodeling.marshallers;

import java.util.Date;

import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentMarshaller.StringAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.util.DateUtils;

/**
 * A marshaller that marshals Java {@code Date} objects into DynamoDB Strings
 * (in ISO 8601 format, ie "2014-01-01T00:00:00Z").
 */
public class DateToStringMarshaller implements StringAttributeMarshaller {

    private static final DateToStringMarshaller INSTANCE =
            new DateToStringMarshaller();

    public static DateToStringMarshaller instance() {
        return INSTANCE;
    }

    private DateToStringMarshaller() {
    }

    @Override
    public AttributeValue marshall(Object obj) {
        return new AttributeValue().withS(
                DateUtils.formatISO8601Date((Date) obj));
    }
}
