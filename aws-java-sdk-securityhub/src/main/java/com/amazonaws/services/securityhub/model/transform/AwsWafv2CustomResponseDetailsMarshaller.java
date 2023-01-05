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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsWafv2CustomResponseDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsWafv2CustomResponseDetailsMarshaller {

    private static final MarshallingInfo<String> CUSTOMRESPONSEBODYKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomResponseBodyKey").build();
    private static final MarshallingInfo<Integer> RESPONSECODE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResponseCode").build();
    private static final MarshallingInfo<List> RESPONSEHEADERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResponseHeaders").build();

    private static final AwsWafv2CustomResponseDetailsMarshaller instance = new AwsWafv2CustomResponseDetailsMarshaller();

    public static AwsWafv2CustomResponseDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsWafv2CustomResponseDetails awsWafv2CustomResponseDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsWafv2CustomResponseDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsWafv2CustomResponseDetails.getCustomResponseBodyKey(), CUSTOMRESPONSEBODYKEY_BINDING);
            protocolMarshaller.marshall(awsWafv2CustomResponseDetails.getResponseCode(), RESPONSECODE_BINDING);
            protocolMarshaller.marshall(awsWafv2CustomResponseDetails.getResponseHeaders(), RESPONSEHEADERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
