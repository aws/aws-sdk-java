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
package com.amazonaws.services.config.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeOrganizationConfigRuleStatusesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeOrganizationConfigRuleStatusesRequestMarshaller {

    private static final MarshallingInfo<List> ORGANIZATIONCONFIGRULENAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationConfigRuleNames").build();
    private static final MarshallingInfo<Integer> LIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Limit").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();

    private static final DescribeOrganizationConfigRuleStatusesRequestMarshaller instance = new DescribeOrganizationConfigRuleStatusesRequestMarshaller();

    public static DescribeOrganizationConfigRuleStatusesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeOrganizationConfigRuleStatusesRequest describeOrganizationConfigRuleStatusesRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeOrganizationConfigRuleStatusesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeOrganizationConfigRuleStatusesRequest.getOrganizationConfigRuleNames(), ORGANIZATIONCONFIGRULENAMES_BINDING);
            protocolMarshaller.marshall(describeOrganizationConfigRuleStatusesRequest.getLimit(), LIMIT_BINDING);
            protocolMarshaller.marshall(describeOrganizationConfigRuleStatusesRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
