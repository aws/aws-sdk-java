/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.internal;

import java.io.IOException;

import org.joda.time.DateTime;

import com.amazonaws.util.DateUtils;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * A Jackson serializer for Joda {@code DateTime}s.
 */
public final class DateTimeJsonSerializer extends JsonSerializer<DateTime> {

    @Override
    public void serialize(
            DateTime value,
            JsonGenerator jgen,
            SerializerProvider provider) throws IOException {

        jgen.writeString(DateUtils.formatISO8601Date(value));
    }
}
