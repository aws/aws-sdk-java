/*
 * Copyright 2012-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.DeserializationFeature;

/**
 * Implements conversion through Jackson JSON processor. Consult its
 * documentation on how to ensure that classes are serializable, configure their
 * serialization through annotations and {@link ObjectMapper} parameters.
 * 
 * <p>
 * Note that default configuration used by this class includes class name of the
 * every serialized value into the produced JSON. It is done to support
 * polymorphic types out of the box. But in some cases it might be beneficial to
 * disable polymorphic support as it produces much more concise and portable
 * output.
 * 
 * @author fateev
 */
public class JsonDataConverter extends DataConverter {

    protected final ObjectMapper mapper;

    /**
     * Create instance of the converter that uses ObjectMapper with
     * {@link Feature#FAIL_ON_UNKNOWN_PROPERTIES} set to <code>false</code> and
     * default typing set to {@link DefaultTyping#NON_FINAL}.
     */
    public JsonDataConverter() {
        this(new ObjectMapper());
        // ignoring unknown properties makes us more robust to changes in the schema
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

        // This will allow including type information all non-final types.  This allows correct 
        // serialization/deserialization of generic collections, for example List<MyType>. 
        mapper.enableDefaultTyping(DefaultTyping.NON_FINAL);
    }

    /**
     * Create instance of the converter that uses {@link ObjectMapper}
     * configured externally.
     */
    public JsonDataConverter(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public String toData(Object value) throws DataConverterException {
        try {
            return mapper.writeValueAsString(value);
        }
        catch (JsonGenerationException e) {
            throwDataConverterException(e, value);
        }
        catch (JsonMappingException e) {
            throwDataConverterException(e, value);
        }
        catch (IOException e) {
            throwDataConverterException(e, value);
        }
        throw new IllegalStateException("not reachable");
    }

    private void throwDataConverterException(Throwable e, Object value) {
        if (value == null) {
            throw new DataConverterException("Failure serializing null value", e);
        }
        throw new DataConverterException("Failure serializing \"" + value + "\" of type \"" + value.getClass() + "\"", e);
    }

    @Override
    public <T> T fromData(String serialized, Class<T> valueType) throws DataConverterException {
        try {
            return mapper.readValue(serialized, valueType);
        }
        catch (JsonParseException e) {
            throw new DataConverterException(e);
        }
        catch (JsonMappingException e) {
            throw new DataConverterException(e);
        }
        catch (IOException e) {
            throw new DataConverterException(e);
        }
    }
}
