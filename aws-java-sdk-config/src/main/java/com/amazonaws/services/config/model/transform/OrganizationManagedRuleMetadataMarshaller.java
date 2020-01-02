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
package com.amazonaws.services.config.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OrganizationManagedRuleMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OrganizationManagedRuleMetadataMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> RULEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleIdentifier").build();
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

    private static final OrganizationManagedRuleMetadataMarshaller instance = new OrganizationManagedRuleMetadataMarshaller();

    public static OrganizationManagedRuleMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OrganizationManagedRuleMetadata organizationManagedRuleMetadata, ProtocolMarshaller protocolMarshaller) {

        if (organizationManagedRuleMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(organizationManagedRuleMetadata.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(organizationManagedRuleMetadata.getRuleIdentifier(), RULEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(organizationManagedRuleMetadata.getInputParameters(), INPUTPARAMETERS_BINDING);
            protocolMarshaller.marshall(organizationManagedRuleMetadata.getMaximumExecutionFrequency(), MAXIMUMEXECUTIONFREQUENCY_BINDING);
            protocolMarshaller.marshall(organizationManagedRuleMetadata.getResourceTypesScope(), RESOURCETYPESSCOPE_BINDING);
            protocolMarshaller.marshall(organizationManagedRuleMetadata.getResourceIdScope(), RESOURCEIDSCOPE_BINDING);
            protocolMarshaller.marshall(organizationManagedRuleMetadata.getTagKeyScope(), TAGKEYSCOPE_BINDING);
            protocolMarshaller.marshall(organizationManagedRuleMetadata.getTagValueScope(), TAGVALUESCOPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
