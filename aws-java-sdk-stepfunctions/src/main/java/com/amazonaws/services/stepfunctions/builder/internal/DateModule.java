/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.stepfunctions.builder.internal;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import java.io.IOException;
import java.util.Date;

/**
 * Contains Jackson module for serializing dates to ISO8601 format per the <a href="https://states-language.net/spec.html#timestamps">spec</a>.
 */
public class DateModule {

    private static final DateTimeFormatter FORMATTER = ISODateTimeFormat.dateTime();
    public static final SimpleModule INSTANCE = new SimpleModule();

    static {
        INSTANCE.addSerializer(Date.class, new StdSerializer<Date>(Date.class) {
            @Override
            public void serialize(Date date,
                                  JsonGenerator jsonGenerator,
                                  SerializerProvider serializerProvider) throws
                                                                         IOException {
                jsonGenerator.writeString(FORMATTER.print(new DateTime(date, DateTimeZone.UTC)));
            }
        });
        INSTANCE.addDeserializer(Date.class, new StdDeserializer<Date>(Date.class) {
            @Override
            public Date deserialize(JsonParser jsonParser,
                                    DeserializationContext deserializationContext) throws IOException {

                return fromJson(jsonParser.getValueAsString());
            }
        });
    }

    public static Date fromJson(String jsonText) {
        return FORMATTER.parseDateTime(jsonText).toDate();
    }

}
