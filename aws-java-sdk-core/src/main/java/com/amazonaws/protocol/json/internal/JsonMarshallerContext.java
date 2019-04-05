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
package com.amazonaws.protocol.json.internal;

import com.amazonaws.Request;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.protocol.MarshallingInfo;
import com.amazonaws.protocol.MarshallingType;
import com.amazonaws.protocol.json.StructuredJsonGenerator;
import com.amazonaws.protocol.MarshallLocation;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Dependencies needed by implemenatations of {@link JsonMarshaller}.
 */
@SdkInternalApi
public class JsonMarshallerContext {

    private final StructuredJsonGenerator jsonGenerator;
    private final JsonProtocolMarshaller protocolHandler;
    private final MarshallerRegistry marshallerRegistry;
    private final Request<?> request;

    private JsonMarshallerContext(Builder builder) {
        this.jsonGenerator = builder.jsonGenerator;
        this.protocolHandler = builder.protocolHandler;
        this.marshallerRegistry = builder.marshallerRegistry;
        this.request = builder.request;
    }

    /**
     * @return StructuredJsonGenerator used to produce the JSON document for a request.
     */
    public StructuredJsonGenerator jsonGenerator() {
        return jsonGenerator;
    }

    /**
     * @return Implementation of {@link ProtocolMarshaller} that can be used to call back out to marshall structured data (i.e.
     * lists of objects).
     */
    public ProtocolMarshaller protocolHandler() {
        return protocolHandler;
    }

    /**
     * @return Marshaller registry to obtain marshaller implementations for nested types (i.e. lists of objects or maps of string
     * to string).
     */
    public MarshallerRegistry marshallerRegistry() {
        return marshallerRegistry;
    }

    /**
     * @return Mutable {@link Request} object that can be used to add headers, query params, modify request URI, etc.
     */
    public Request<?> request() {
        return request;
    }

    /**
     * Convenience method to marshall a nested object (may be simple or structured) at the given location.
     *
     * @param marshallLocation Current {@link MarshallLocation}
     * @param val              Value to marshall.
     */
    public void marshall(MarshallLocation marshallLocation, Object val) {
        marshallerRegistry().getMarshaller(marshallLocation, val).marshall(val, this, null);
    }

    /**
     * Convenience method to marshall a nested object (may be simple or structured) at the given location.
     *
     * @param marshallLocation Current {@link MarshallLocation}
     * @param val              Value to marshall.
     * @param marshallingInfo        Name of parameter to marshall.
     */
    public void marshall(MarshallLocation marshallLocation, Object val, MarshallingInfo marshallingInfo) {
        marshallerRegistry().getMarshaller(marshallLocation, val).marshall(val, this, marshallingInfo);
    }

    public void marshall(MarshallLocation marshallLocation, Object val, String paramName) {
        marshallerRegistry().getMarshaller(marshallLocation, val)
                            // construct a new MarshallingInfo to pass the marshallLocationName
                            .marshall(val, this, MarshallingInfo.builder(new MarshallingType<Object>() {
                                @Override
                                public boolean isDefaultMarshallerForType(Class<?> type) {
                                    return false;
                                }
                            }).marshallLocationName(paramName).build());
    }

    /**
     * @return Builder instance to construct a {@link JsonMarshallerContext}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link JsonMarshallerContext}.
     */
    public static final class Builder {

        private StructuredJsonGenerator jsonGenerator;
        private JsonProtocolMarshaller protocolHandler;
        private MarshallerRegistry marshallerRegistry;
        private Request<?> request;

        private Builder() {
        }

        public Builder jsonGenerator(StructuredJsonGenerator jsonGenerator) {
            this.jsonGenerator = jsonGenerator;
            return this;
        }

        public Builder protocolHandler(JsonProtocolMarshaller protocolHandler) {
            this.protocolHandler = protocolHandler;
            return this;
        }

        public Builder marshallerRegistry(MarshallerRegistry marshallerRegistry) {
            this.marshallerRegistry = marshallerRegistry;
            return this;
        }

        public Builder request(Request<?> request) {
            this.request = request;
            return this;
        }

        /**
         * @return An immutable {@link JsonMarshallerContext} object.
         */
        public JsonMarshallerContext build() {
            return new JsonMarshallerContext(this);
        }
    }
}
