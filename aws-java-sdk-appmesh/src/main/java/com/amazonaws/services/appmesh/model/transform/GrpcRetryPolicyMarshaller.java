/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.appmesh.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appmesh.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GrpcRetryPolicyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GrpcRetryPolicyMarshaller {

    private static final MarshallingInfo<List> GRPCRETRYEVENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("grpcRetryEvents").build();
    private static final MarshallingInfo<List> HTTPRETRYEVENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("httpRetryEvents").build();
    private static final MarshallingInfo<Long> MAXRETRIES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("maxRetries").build();
    private static final MarshallingInfo<StructuredPojo> PERRETRYTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("perRetryTimeout").build();
    private static final MarshallingInfo<List> TCPRETRYEVENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tcpRetryEvents").build();

    private static final GrpcRetryPolicyMarshaller instance = new GrpcRetryPolicyMarshaller();

    public static GrpcRetryPolicyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GrpcRetryPolicy grpcRetryPolicy, ProtocolMarshaller protocolMarshaller) {

        if (grpcRetryPolicy == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(grpcRetryPolicy.getGrpcRetryEvents(), GRPCRETRYEVENTS_BINDING);
            protocolMarshaller.marshall(grpcRetryPolicy.getHttpRetryEvents(), HTTPRETRYEVENTS_BINDING);
            protocolMarshaller.marshall(grpcRetryPolicy.getMaxRetries(), MAXRETRIES_BINDING);
            protocolMarshaller.marshall(grpcRetryPolicy.getPerRetryTimeout(), PERRETRYTIMEOUT_BINDING);
            protocolMarshaller.marshall(grpcRetryPolicy.getTcpRetryEvents(), TCPRETRYEVENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
