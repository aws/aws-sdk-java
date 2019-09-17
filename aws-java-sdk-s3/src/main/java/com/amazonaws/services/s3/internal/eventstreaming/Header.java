/*
 * Copyright 2017-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal.eventstreaming;

import com.amazonaws.util.ValidationUtils;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;

class Header {
    private final String name;
    private final HeaderValue value;

    Header(String name, HeaderValue value) {
        this.name = ValidationUtils.assertNotNull(name, "value");
        this.value = ValidationUtils.assertNotNull(value, "value");
    }

    Header(String name, String value) {
        this(name, HeaderValue.fromString(value));
    }

    public String getName() {
        return name;
    }

    public HeaderValue getValue() {
        return value;
    }

    static Header decode(ByteBuffer buf) {
        String name = Utils.readShortString(buf);
        return new Header(name, HeaderValue.decode(buf));
    }

    static void encode(Map.Entry<String, HeaderValue> header, DataOutputStream dos) throws IOException {
        new Header(header.getKey(), header.getValue()).encode(dos);
    }

    void encode(DataOutputStream dos) throws IOException {
        Utils.writeShortString(dos, name);
        value.encode(dos);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Header header = (Header) o;

        if (!name.equals(header.name)) return false;
        return value.equals(header.value);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + value.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Header{"
            + "name='" + name + '\''
            + ", value=" + value
            + '}';
    }
}
