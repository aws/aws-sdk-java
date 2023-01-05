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
package com.amazonaws.services.config.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OrganizationCustomPolicyRuleMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OrganizationCustomPolicyRuleMetadataMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> ORGANIZATIONCONFIGRULETRIGGERTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationConfigRuleTriggerTypes").build();
    private static final MarshallingInfo<String> INPUTPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputParameters").build();
    private static final MarshallingInfo<String> MAXIMUMEXECUTIONFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumExecutionFrequency").build();
    private static final MarshallingInfo<List> RESOURCETYPESSCOPE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceTypesScope").build();
    private static final MarshallingInfo<String> RESOURCEIDSCOPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceIdScope").build();
    private static final MarshallingInfo<String> TAGKEYSCOPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TagKeyScope").build();
    private static final MarshallingInfo<String> TAGVALUESCOPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TagValueScope").build();
    private static final MarshallingInfo<String> POLICYRUNTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyRuntime").build();
    private static final MarshallingInfo<String> POLICYTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyText").build();
    private static final MarshallingInfo<List> DEBUGLOGDELIVERYACCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DebugLogDeliveryAccounts").build();

    private static final OrganizationCustomPolicyRuleMetadataMarshaller instance = new OrganizationCustomPolicyRuleMetadataMarshaller();

    public static OrganizationCustomPolicyRuleMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OrganizationCustomPolicyRuleMetadata organizationCustomPolicyRuleMetadata, ProtocolMarshaller protocolMarshaller) {

        if (organizationCustomPolicyRuleMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(organizationCustomPolicyRuleMetadata.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(organizationCustomPolicyRuleMetadata.getOrganizationConfigRuleTriggerTypes(),
                    ORGANIZATIONCONFIGRULETRIGGERTYPES_BINDING);
            protocolMarshaller.marshall(organizationCustomPolicyRuleMetadata.getInputParameters(), INPUTPARAMETERS_BINDING);
            protocolMarshaller.marshall(organizationCustomPolicyRuleMetadata.getMaximumExecutionFrequency(), MAXIMUMEXECUTIONFREQUENCY_BINDING);
            protocolMarshaller.marshall(organizationCustomPolicyRuleMetadata.getResourceTypesScope(), RESOURCETYPESSCOPE_BINDING);
            protocolMarshaller.marshall(organizationCustomPolicyRuleMetadata.getResourceIdScope(), RESOURCEIDSCOPE_BINDING);
            protocolMarshaller.marshall(organizationCustomPolicyRuleMetadata.getTagKeyScope(), TAGKEYSCOPE_BINDING);
            protocolMarshaller.marshall(organizationCustomPolicyRuleMetadata.getTagValueScope(), TAGVALUESCOPE_BINDING);
            protocolMarshaller.marshall(organizationCustomPolicyRuleMetadata.getPolicyRuntime(), POLICYRUNTIME_BINDING);
            protocolMarshaller.marshall(organizationCustomPolicyRuleMetadata.getPolicyText(), POLICYTEXT_BINDING);
            protocolMarshaller.marshall(organizationCustomPolicyRuleMetadata.getDebugLogDeliveryAccounts(), DEBUGLOGDELIVERYACCOUNTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
