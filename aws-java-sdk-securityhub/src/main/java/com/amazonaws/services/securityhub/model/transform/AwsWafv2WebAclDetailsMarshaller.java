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
 * AwsWafv2WebAclDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsWafv2WebAclDetailsMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<Boolean> MANAGEDBYFIREWALLMANAGER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManagedbyFirewallManager").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<Long> CAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Capacity").build();
    private static final MarshallingInfo<StructuredPojo> CAPTCHACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CaptchaConfig").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultAction").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> RULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Rules").build();
    private static final MarshallingInfo<StructuredPojo> VISIBILITYCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VisibilityConfig").build();

    private static final AwsWafv2WebAclDetailsMarshaller instance = new AwsWafv2WebAclDetailsMarshaller();

    public static AwsWafv2WebAclDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsWafv2WebAclDetails awsWafv2WebAclDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsWafv2WebAclDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsWafv2WebAclDetails.getName(), NAME_BINDING);
            protocolMarshaller.marshall(awsWafv2WebAclDetails.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(awsWafv2WebAclDetails.getManagedbyFirewallManager(), MANAGEDBYFIREWALLMANAGER_BINDING);
            protocolMarshaller.marshall(awsWafv2WebAclDetails.getId(), ID_BINDING);
            protocolMarshaller.marshall(awsWafv2WebAclDetails.getCapacity(), CAPACITY_BINDING);
            protocolMarshaller.marshall(awsWafv2WebAclDetails.getCaptchaConfig(), CAPTCHACONFIG_BINDING);
            protocolMarshaller.marshall(awsWafv2WebAclDetails.getDefaultAction(), DEFAULTACTION_BINDING);
            protocolMarshaller.marshall(awsWafv2WebAclDetails.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(awsWafv2WebAclDetails.getRules(), RULES_BINDING);
            protocolMarshaller.marshall(awsWafv2WebAclDetails.getVisibilityConfig(), VISIBILITYCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
