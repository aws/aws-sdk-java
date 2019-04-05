/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directconnect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeInterconnectLoaRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeInterconnectLoaRequestMarshaller {

    private static final MarshallingInfo<String> INTERCONNECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("interconnectId").build();
    private static final MarshallingInfo<String> PROVIDERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("providerName").build();
    private static final MarshallingInfo<String> LOACONTENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loaContentType").build();

    private static final DescribeInterconnectLoaRequestMarshaller instance = new DescribeInterconnectLoaRequestMarshaller();

    public static DescribeInterconnectLoaRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeInterconnectLoaRequest describeInterconnectLoaRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeInterconnectLoaRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeInterconnectLoaRequest.getInterconnectId(), INTERCONNECTID_BINDING);
            protocolMarshaller.marshall(describeInterconnectLoaRequest.getProviderName(), PROVIDERNAME_BINDING);
            protocolMarshaller.marshall(describeInterconnectLoaRequest.getLoaContentType(), LOACONTENTTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
