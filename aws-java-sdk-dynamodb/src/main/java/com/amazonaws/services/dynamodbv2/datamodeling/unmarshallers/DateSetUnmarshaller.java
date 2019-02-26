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

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.util.DateUtils;

/**
 * An unmarshaller that unmarshals sets of ISO-8601-formatted dates as sets of
 * Java {@code Date} objects.
 */
public class DateSetUnmarshaller extends SSUnmarshaller {

    private static final DateSetUnmarshaller INSTANCE =
            new DateSetUnmarshaller();

    public static DateSetUnmarshaller instance() {
        return INSTANCE;
    }

    private DateSetUnmarshaller() {
    }

    @Override
    public Object unmarshall(AttributeValue value) {
        Set<Date> result = new HashSet<Date>();

        for (String s : value.getSS()) {
            result.add(DateUtils.parseISO8601Date(s));
        }

        return result;
    }
}
