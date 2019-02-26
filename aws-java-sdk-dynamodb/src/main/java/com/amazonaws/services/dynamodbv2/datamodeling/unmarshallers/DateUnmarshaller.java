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
package com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.util.DateUtils;

/**
 * An unmarshaller that unmarshals ISO-8601-formatted dates as Java
 * {@code Date} objects.
 */
public class DateUnmarshaller extends SUnmarshaller {

    private static final DateUnmarshaller INSTANCE =
            new DateUnmarshaller();

    public static DateUnmarshaller instance() {
        return INSTANCE;
    }

    private DateUnmarshaller() {
    }

    @Override
    public Object unmarshall(AttributeValue value) {
        return DateUtils.parseISO8601Date(value.getS());
    }
}
