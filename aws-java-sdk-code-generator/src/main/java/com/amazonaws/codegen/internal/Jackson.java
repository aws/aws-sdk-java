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

package com.amazonaws.codegen.internal;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;

public class Jackson {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    private static final ObjectWriter WRITER = MAPPER
            .configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true)
            .configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true)
            .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
            .writerWithDefaultPrettyPrinter();

    static {
        MAPPER.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        // TODO: Un comment this once we know for sure, we capture everything in C2j model.
        MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static <T> T load(Class<T> clazz, File file)
            throws JsonParseException, JsonMappingException, IOException {
        return load(clazz, new FileInputStream(file));
    }

    public static <T> T load(Class<T> clazz, InputStream is)
            throws JsonParseException, JsonMappingException, IOException {
        return MAPPER.readValue(is, clazz);
    }

    public static <T> T load(Class<T> clazz, String fileLocation)
            throws JsonParseException, JsonMappingException, IOException {
        InputStream is = Jackson.class.getClassLoader().getResourceAsStream(
                fileLocation);
        return MAPPER.readValue(is, clazz);
    }

    public static void write(Object value, Writer w)
            throws JsonGenerationException, JsonMappingException, IOException {
        WRITER.writeValue(w, value);
    }

}
