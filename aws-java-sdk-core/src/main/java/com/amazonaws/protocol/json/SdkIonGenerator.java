/*
 * Copyright 2016-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Date;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.BinaryUtils;
import software.amazon.ion.IonType;
import software.amazon.ion.IonWriter;
import software.amazon.ion.Timestamp;
import software.amazon.ion.system.IonBinaryWriterBuilder;

class SdkIonGenerator implements StructuredJsonGenerator {
    private final String contentType;
    private final ByteArrayOutputStream bytes;
    private final IonWriter writer;

    public SdkIonGenerator(IonBinaryWriterBuilder writerBuilder, String contentType) {
        this.contentType = contentType;
        this.bytes = new ByteArrayOutputStream();
        this.writer = writerBuilder.build(bytes);
    }

    @Override
    public StructuredJsonGenerator writeStartArray() {
        try {
            writer.stepIn(IonType.LIST);
        } catch (IOException e) {
            throw new AmazonClientException(e);
        }
        return this;
    }

    @Override
    public StructuredJsonGenerator writeEndArray() {
        try {
            writer.stepOut();
        } catch (IOException e) {
            throw new AmazonClientException(e);
        }
        return this;
    }

    @Override
    public StructuredJsonGenerator writeStartObject() {
        try {
            writer.stepIn(IonType.STRUCT);
        } catch (IOException e) {
            throw new AmazonClientException(e);
        }
        return this;
    }

    @Override
    public StructuredJsonGenerator writeEndObject() {
        try {
            writer.stepOut();
        } catch (IOException e) {
            throw new AmazonClientException(e);
        }
        return this;
    }

    @Override
    public StructuredJsonGenerator writeFieldName(String fieldName) {
        writer.setFieldName(fieldName);
        return this;
    }

    @Override
    public StructuredJsonGenerator writeValue(String val) {
        try {
            writer.writeString(val);
        } catch (IOException e) {
            throw new AmazonClientException(e);
        }
        return this;
    }

    @Override
    public StructuredJsonGenerator writeValue(boolean bool) {
        try {
            writer.writeBool(bool);
        } catch (IOException e) {
            throw new AmazonClientException(e);
        }
        return this;
    }

    @Override
    public StructuredJsonGenerator writeValue(long val) {
        try {
            writer.writeInt(val);
        } catch (IOException e) {
            throw new AmazonClientException(e);
        }
        return this;
    }

    @Override
    public StructuredJsonGenerator writeValue(double val) {
        try {
            writer.writeFloat(val);
        } catch (IOException e) {
            throw new AmazonClientException(e);
        }
        return this;
    }

    @Override
    public StructuredJsonGenerator writeValue(float val) {
        try {
            writer.writeFloat(val);
        } catch (IOException e) {
            throw new AmazonClientException(e);
        }
        return this;
    }

    @Override
    public StructuredJsonGenerator writeValue(short val) {
        try {
            writer.writeInt(val);
        } catch (IOException e) {
            throw new AmazonClientException(e);
        }
        return this;
    }

    @Override
    public StructuredJsonGenerator writeValue(int val) {
        try {
            writer.writeInt(val);
        } catch (IOException e) {
            throw new AmazonClientException(e);
        }
        return this;
    }

    @Override
    public StructuredJsonGenerator writeValue(ByteBuffer bytes) {
        try {
            writer.writeBlob(BinaryUtils.copyAllBytesFrom(bytes));
        } catch (IOException e) {
            throw new AmazonClientException(e);
        }
        return this;
    }

    @Override
    public StructuredJsonGenerator writeValue(Date date) {
        try {
            writer.writeTimestamp(Timestamp.forDateZ(date));
        } catch (IOException e) {
            throw new AmazonClientException(e);
        }
        return this;
    }

    @Override
    public StructuredJsonGenerator writeValue(BigDecimal value) {
        try {
            writer.writeDecimal(value);
        } catch (IOException e) {
            throw new AmazonClientException(e);
        }
        return this;
    }

    @Override
    public StructuredJsonGenerator writeValue(BigInteger value) {
        try {
            writer.writeInt(value);
        } catch (IOException e) {
            throw new AmazonClientException(e);
        }
        return this;
    }

    @Override
    public byte[] getBytes() {
        try {
            writer.finish();
        } catch (IOException e) {
            throw new AmazonClientException(e);
        }
        return bytes.toByteArray();
    }

    @Override
    public String getContentType() {
        return contentType;
    }
}
