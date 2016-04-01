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

package com.amazonaws.codegen.model.intermediate;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Protocol {
    EC2("ec2"),
    JSON("json"),
    REST_JSON("rest-json"),
    CBOR("cbor"),
    REST_CBOR("rest-cbor"),
    QUERY("query"),
    REST_XML("rest-xml");

    private String protocol;

    private Protocol(String protocol) {
        this.protocol = protocol;
    }

    @JsonCreator
    public static Protocol fromValue(String protocol) {
        if (protocol == null)
            return null;
        if (EC2.protocol.equals(protocol))
            return EC2;
        if (JSON.protocol.equals(protocol))
            return JSON;
        if (REST_JSON.protocol.equals(protocol))
            return REST_JSON;
        if (CBOR.protocol.equals(protocol))
            return CBOR;
        if (REST_CBOR.protocol.equals(protocol))
            return REST_CBOR;
        if (QUERY.protocol.equals(protocol))
            return QUERY;
        if (REST_XML.protocol.equals(protocol))
            return REST_XML;

        throw new IllegalArgumentException(
                "Unknown enum value for Protocol : " + protocol);
    }

    @JsonValue
    public String getValue() {
        return protocol;
    }
}