/*
 *
 * Copyright (c) 2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 *
 */
package com.amazonaws.protocol.json;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.util.TimestampFormat;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.dataformat.cbor.CBORGenerator;

import java.io.IOException;
import java.util.Date;

import static com.amazonaws.SDKGlobalConfiguration.AWS_CBOR_DISABLE_ENV_VAR;
import static com.amazonaws.SDKGlobalConfiguration.AWS_CBOR_DISABLE_SYSTEM_PROPERTY;

/**
 * Thin wrapper around Jackson's JSON generator for CBOR.
 */
@SdkInternalApi
class SdkCborGenerator extends SdkJsonGenerator {

    private static final int CBOR_TAG_TIMESTAP = 1;

    public SdkCborGenerator(JsonFactory factory, String contentType) {
        super(factory, contentType);
    }

    /**
     * Jackson doesn't have native support for timestamp. As per the RFC 7049
     * (https://tools.ietf.org/html/rfc7049#section-2.4.1) we will need to
     * write a tag and write the epoch.
     */
    @Override
    public StructuredJsonGenerator writeValue(Date date, TimestampFormat timestampFormat) {

        if (!(getGenerator() instanceof CBORGenerator)) {
            throw new IllegalStateException("SdkCborGenerator is not created with a CBORGenerator.");
        }

        CBORGenerator generator = (CBORGenerator) getGenerator();
        try {
            generator.writeTag(CBOR_TAG_TIMESTAP);
            generator.writeNumber(date.getTime());
        } catch (IOException e) {
            throw new JsonGenerationException(e);
        }
        return this;
    }

    @Override
    public byte[] getBytes() {
        try {
            return super.getBytes();
        } catch (NoSuchMethodError e) {
            throw new RuntimeException(
                    "Jackson jackson-core/jackson-dataformat-cbor incompatible library version detected.\nYou have two possible resolutions:\n" +
                            "\t\t1) Ensure the com.fasterxml.jackson.core:jackson-core & com.fasterxml.jackson.dataformat:jackson-dataformat-cbor libraries " +
                            "on your classpath have the same version number\n" +
                            "\t\t2) Disable CBOR wire-protocol by passing the -D" + AWS_CBOR_DISABLE_SYSTEM_PROPERTY + " property or setting the " +
                            AWS_CBOR_DISABLE_ENV_VAR + " environment variable (warning this may affect performance)",
                    e);
        }
    }
}
