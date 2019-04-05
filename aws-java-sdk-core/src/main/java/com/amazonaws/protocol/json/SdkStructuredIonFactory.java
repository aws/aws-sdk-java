/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.protocol.json;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.internal.http.CompositeErrorCodeParser;
import com.amazonaws.internal.http.ErrorCodeParser;
import com.amazonaws.internal.http.IonErrorCodeParser;
import com.amazonaws.internal.http.JsonErrorCodeParser;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeIonUnmarshallers.BigDecimalIonUnmarshaller;
import com.amazonaws.transform.SimpleTypeIonUnmarshallers.BigIntegerIonUnmarshaller;
import com.amazonaws.transform.SimpleTypeIonUnmarshallers.BooleanIonUnmarshaller;
import com.amazonaws.transform.SimpleTypeIonUnmarshallers.ByteBufferIonUnmarshaller;
import com.amazonaws.transform.SimpleTypeIonUnmarshallers.ByteIonUnmarshaller;
import com.amazonaws.transform.SimpleTypeIonUnmarshallers.DateIonUnmarshaller;
import com.amazonaws.transform.SimpleTypeIonUnmarshallers.DoubleIonUnmarshaller;
import com.amazonaws.transform.SimpleTypeIonUnmarshallers.FloatIonUnmarshaller;
import com.amazonaws.transform.SimpleTypeIonUnmarshallers.IntegerIonUnmarshaller;
import com.amazonaws.transform.SimpleTypeIonUnmarshallers.LongIonUnmarshaller;
import com.amazonaws.transform.SimpleTypeIonUnmarshallers.ShortIonUnmarshaller;
import com.amazonaws.transform.SimpleTypeIonUnmarshallers.StringIonUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.ImmutableMapParameter;
import com.fasterxml.jackson.core.JsonFactory;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import software.amazon.ion.IonSystem;
import software.amazon.ion.system.IonBinaryWriterBuilder;
import software.amazon.ion.system.IonSystemBuilder;
import software.amazon.ion.system.IonTextWriterBuilder;
import software.amazon.ion.system.IonWriterBuilder;

@SdkInternalApi
class SdkStructuredIonFactory extends SdkStructuredJsonFactoryImpl {
    private static final IonSystem ION_SYSTEM = IonSystemBuilder.standard().build();
    private static final JsonFactory JSON_FACTORY = new IonFactory(ION_SYSTEM);
    private static final Map<Class<?>, Unmarshaller<?, JsonUnmarshallerContext>> UNMARSHALLERS =
            new ImmutableMapParameter.Builder<Class<?>, Unmarshaller<?, JsonUnmarshallerContext>>()
            .put(BigDecimal.class, BigDecimalIonUnmarshaller.getInstance())
            .put(BigInteger.class, BigIntegerIonUnmarshaller.getInstance())
            .put(Boolean.class, BooleanIonUnmarshaller.getInstance())
            .put(ByteBuffer.class, ByteBufferIonUnmarshaller.getInstance())
            .put(Byte.class, ByteIonUnmarshaller.getInstance())
            .put(Date.class, DateIonUnmarshaller.getInstance())
            .put(Double.class, DoubleIonUnmarshaller.getInstance())
            .put(Float.class, FloatIonUnmarshaller.getInstance())
            .put(Integer.class, IntegerIonUnmarshaller.getInstance())
            .put(Long.class, LongIonUnmarshaller.getInstance())
            .put(Short.class, ShortIonUnmarshaller.getInstance())
            .put(String.class, StringIonUnmarshaller.getInstance())
            .build();

    private static final IonBinaryWriterBuilder BINARY_WRITER_BUILDER = IonBinaryWriterBuilder.standard().immutable();
    private static final IonTextWriterBuilder TEXT_WRITER_BUILDER = IonTextWriterBuilder.standard().immutable();

    public static final SdkStructuredIonFactory SDK_ION_BINARY_FACTORY = new SdkStructuredIonFactory(BINARY_WRITER_BUILDER);
    public static final SdkStructuredIonFactory SDK_ION_TEXT_FACTORY = new SdkStructuredIonFactory(TEXT_WRITER_BUILDER);

    private final IonWriterBuilder builder;

    private SdkStructuredIonFactory(IonWriterBuilder builder) {
        super(JSON_FACTORY, UNMARSHALLERS,
              Collections.<JsonUnmarshallerContext.UnmarshallerType, Unmarshaller<?, JsonUnmarshallerContext>>emptyMap());
        this.builder = builder;
    }

    @Override
    protected StructuredJsonGenerator createWriter(JsonFactory jsonFactory, String contentType) {
        return SdkIonGenerator.create(builder, contentType);
    }

    @Override
    protected ErrorCodeParser getErrorCodeParser(String customErrorCodeFieldName) {
        return new CompositeErrorCodeParser(
                new IonErrorCodeParser(ION_SYSTEM),
                new JsonErrorCodeParser(customErrorCodeFieldName));
    }
}
