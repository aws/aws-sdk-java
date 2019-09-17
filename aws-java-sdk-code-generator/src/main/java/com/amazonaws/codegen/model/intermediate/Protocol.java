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

import com.amazonaws.codegen.protocol.ApiGatewayProtocolMetadataProvider;
import com.amazonaws.codegen.protocol.AwsCborProtocolMetadataProvider;
import com.amazonaws.codegen.protocol.AwsJsonProtocolMetadataProvider;
import com.amazonaws.codegen.protocol.Ec2ProtocolMetdataProvider;
import com.amazonaws.codegen.protocol.IonProtocolMetadataProvider;
import com.amazonaws.codegen.protocol.ProtocolMetadataProvider;
import com.amazonaws.codegen.protocol.QueryProtocolMetadataProvider;
import com.amazonaws.codegen.protocol.RestJsonProtocolMetdataProvider;
import com.amazonaws.codegen.protocol.RestXmlProtocolMetadataProvider;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Protocol {
    EC2("ec2", new Ec2ProtocolMetdataProvider()),
    AWS_JSON("json", new AwsJsonProtocolMetadataProvider()),
    REST_JSON("rest-json", new RestJsonProtocolMetdataProvider()),
    CBOR("cbor", new AwsCborProtocolMetadataProvider()),
    QUERY("query", new QueryProtocolMetadataProvider()),
    REST_XML("rest-xml", new RestXmlProtocolMetadataProvider()),
    API_GATEWAY("api-gateway", new ApiGatewayProtocolMetadataProvider()),
    ION("ion", new IonProtocolMetadataProvider());

    private String protocol;
    private ProtocolMetadataProvider metadataProvider;

    Protocol(String protocol, ProtocolMetadataProvider metadataProvider) {
        this.protocol = protocol;
        this.metadataProvider = metadataProvider;
    }

    @JsonCreator
    public static Protocol fromValue(String strProtocol) {
        if (strProtocol == null) {
            return null;
        }

        for (Protocol protocol : Protocol.values()) {
            if (protocol.protocol.equals(strProtocol)) {
                return protocol;
            }
        }

        throw new IllegalArgumentException("Unknown enum value for Protocol : " + strProtocol);
    }

    @JsonValue
    public String getValue() {
        return protocol;
    }

    public ProtocolMetadataProvider getProvider() {
        return metadataProvider;
    }
}