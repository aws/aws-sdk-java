/*
 * Copyright 2011-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.protocol.json;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.amazonaws.transform.JsonErrorUnmarshaller;
import java.util.Collections;
import org.junit.Test;

public class SdkJsonProtocolFactoryTest {
    @Test
    public void ionBinaryEnabledGeneratorWritesIonBinary() {
        StructuredJsonGenerator generator = protocolFactory(IonEnabled.YES, IonBinaryEnabled.YES).createGenerator();
        generator.writeValue(true);
        byte[] actual = generator.getBytes();
        byte[] expected = bytes(0xE0, 0x01, 0x00, 0xEA, 0x11);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void ionBinaryDisabledGeneratorWritesIonText() throws Exception {
        StructuredJsonGenerator generator = protocolFactory(IonEnabled.YES, IonBinaryEnabled.NO).createGenerator();
        generator.writeValue(true);
        byte[] actual = generator.getBytes();
        byte[] expected = "true".getBytes("UTF-8");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void ionBinaryEnabledUsesIonBinaryContentType() {
        SdkJsonProtocolFactory protocolFactory = protocolFactory(IonEnabled.YES, IonBinaryEnabled.YES);
        assertEquals("application/x-amz-ion-1.0", protocolFactory.getContentType());
    }

    @Test
    public void ionBinaryDisabledUsesIonTextContentType() {
        SdkJsonProtocolFactory protocolFactory = protocolFactory(IonEnabled.YES, IonBinaryEnabled.NO);
        assertEquals("text/x-amz-ion-1.0", protocolFactory.getContentType());
    }

    @Test
    public void errorShapeMetadata_hasCustomUnmarshaller_doesNotUseExceptionClass() {
        JsonErrorUnmarshaller customUnmarshaller = mock(JsonErrorUnmarshaller.class);

        JsonErrorShapeMetadata mockErrorMetadata = mock(JsonErrorShapeMetadata.class);
        when(mockErrorMetadata.getErrorCode()).thenReturn("SomeError");
        when(mockErrorMetadata.getModeledClass()).thenReturn((Class) RuntimeException.class);
        when(mockErrorMetadata.getExceptionUnmarshaller()).thenReturn(customUnmarshaller);

        JsonClientMetadata metadata = new JsonClientMetadata()
                .withSupportsIon(false)
                .withProtocolVersion("1.0")
                .addErrorMetadata(mockErrorMetadata);

        new SdkJsonProtocolFactory(metadata).createErrorResponseHandler(new JsonErrorResponseMetadata());

        verify(mockErrorMetadata, atLeastOnce()).getExceptionUnmarshaller();
        verify(mockErrorMetadata, never()).getErrorCode();
        verify(mockErrorMetadata, never()).getModeledClass();
    }

    @Test
    public void errorShapeMetadata_noCustomUnmarshaller_usesExceptionClass() {
        JsonErrorShapeMetadata mockErrorMetadata = mock(JsonErrorShapeMetadata.class);
        when(mockErrorMetadata.getErrorCode()).thenReturn("SomeError");
        when(mockErrorMetadata.getModeledClass()).thenReturn((Class) RuntimeException.class);

        JsonClientMetadata metadata = new JsonClientMetadata()
                .withSupportsIon(false)
                .withProtocolVersion("1.0")
                .addErrorMetadata(mockErrorMetadata);

        new SdkJsonProtocolFactory(metadata).createErrorResponseHandler(new JsonErrorResponseMetadata());

        verify(mockErrorMetadata).getExceptionUnmarshaller();
        verify(mockErrorMetadata, atLeastOnce()).getErrorCode();
        verify(mockErrorMetadata, atLeastOnce()).getModeledClass();
    }

    @Test
    public void errorShapeMetadata_baseExceptionGiven_usesBaseException() {
        JsonClientMetadata metadata = mock(JsonClientMetadata.class);
        when(metadata.getBaseServiceExceptionClass()).thenReturn((Class) RuntimeException.class);
        when(metadata.getErrorShapeMetadata()).thenReturn(Collections.<JsonErrorShapeMetadata>emptyList());

        new SdkJsonProtocolFactory(metadata).createErrorResponseHandler(new JsonErrorResponseMetadata());

        verify(metadata, atLeastOnce()).getBaseServiceExceptionClass();
    }

    private SdkJsonProtocolFactory protocolFactory(IonEnabled ionEnabled, final IonBinaryEnabled ionBinaryEnabled) {
        JsonClientMetadata metadata = new JsonClientMetadata()
                .withSupportsIon(ionEnabled == IonEnabled.YES)
                .withProtocolVersion("1.0");
        SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(metadata) {
            @Override
            boolean isIonBinaryEnabled() {
                return ionBinaryEnabled == IonBinaryEnabled.YES;
            }
        };
        return protocolFactory;
    }

    private enum IonEnabled {
        YES,
        NO;
    }

    private enum IonBinaryEnabled {
        YES,
        NO;
    }

    private static byte[] bytes(int... ints) {
        byte[] bytes = new byte[ints.length];
        for (int i = 0; i < ints.length; i++) {
            bytes[i] = (byte) (0xFF & ints[i]);
        }
        return bytes;
    }
}
