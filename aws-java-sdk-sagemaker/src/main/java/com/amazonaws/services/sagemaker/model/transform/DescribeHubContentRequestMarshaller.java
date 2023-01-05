/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeHubContentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeHubContentRequestMarshaller {

    private static final MarshallingInfo<String> HUBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HubName").build();
    private static final MarshallingInfo<String> HUBCONTENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubContentType").build();
    private static final MarshallingInfo<String> HUBCONTENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubContentName").build();
    private static final MarshallingInfo<String> HUBCONTENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubContentVersion").build();

    private static final DescribeHubContentRequestMarshaller instance = new DescribeHubContentRequestMarshaller();

    public static DescribeHubContentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeHubContentRequest describeHubContentRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeHubContentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeHubContentRequest.getHubName(), HUBNAME_BINDING);
            protocolMarshaller.marshall(describeHubContentRequest.getHubContentType(), HUBCONTENTTYPE_BINDING);
            protocolMarshaller.marshall(describeHubContentRequest.getHubContentName(), HUBCONTENTNAME_BINDING);
            protocolMarshaller.marshall(describeHubContentRequest.getHubContentVersion(), HUBCONTENTVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
