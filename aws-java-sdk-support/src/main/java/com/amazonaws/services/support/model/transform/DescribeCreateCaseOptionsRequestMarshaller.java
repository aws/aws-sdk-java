/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.support.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.support.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeCreateCaseOptionsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeCreateCaseOptionsRequestMarshaller {

    private static final MarshallingInfo<String> ISSUETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("issueType").build();
    private static final MarshallingInfo<String> SERVICECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceCode").build();
    private static final MarshallingInfo<String> LANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("language").build();
    private static final MarshallingInfo<String> CATEGORYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("categoryCode").build();

    private static final DescribeCreateCaseOptionsRequestMarshaller instance = new DescribeCreateCaseOptionsRequestMarshaller();

    public static DescribeCreateCaseOptionsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeCreateCaseOptionsRequest describeCreateCaseOptionsRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeCreateCaseOptionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeCreateCaseOptionsRequest.getIssueType(), ISSUETYPE_BINDING);
            protocolMarshaller.marshall(describeCreateCaseOptionsRequest.getServiceCode(), SERVICECODE_BINDING);
            protocolMarshaller.marshall(describeCreateCaseOptionsRequest.getLanguage(), LANGUAGE_BINDING);
            protocolMarshaller.marshall(describeCreateCaseOptionsRequest.getCategoryCode(), CATEGORYCODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
