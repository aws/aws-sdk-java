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
 * OrganizationCustomRuleMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OrganizationCustomRuleMetadataMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> LAMBDAFUNCTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LambdaFunctionArn").build();
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

    private static final OrganizationCustomRuleMetadataMarshaller instance = new OrganizationCustomRuleMetadataMarshaller();

    public static OrganizationCustomRuleMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OrganizationCustomRuleMetadata organizationCustomRuleMetadata, ProtocolMarshaller protocolMarshaller) {

        if (organizationCustomRuleMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(organizationCustomRuleMetadata.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(organizationCustomRuleMetadata.getLambdaFunctionArn(), LAMBDAFUNCTIONARN_BINDING);
            protocolMarshaller.marshall(organizationCustomRuleMetadata.getOrganizationConfigRuleTriggerTypes(), ORGANIZATIONCONFIGRULETRIGGERTYPES_BINDING);
            protocolMarshaller.marshall(organizationCustomRuleMetadata.getInputParameters(), INPUTPARAMETERS_BINDING);
            protocolMarshaller.marshall(organizationCustomRuleMetadata.getMaximumExecutionFrequency(), MAXIMUMEXECUTIONFREQUENCY_BINDING);
            protocolMarshaller.marshall(organizationCustomRuleMetadata.getResourceTypesScope(), RESOURCETYPESSCOPE_BINDING);
            protocolMarshaller.marshall(organizationCustomRuleMetadata.getResourceIdScope(), RESOURCEIDSCOPE_BINDING);
            protocolMarshaller.marshall(organizationCustomRuleMetadata.getTagKeyScope(), TAGKEYSCOPE_BINDING);
            protocolMarshaller.marshall(organizationCustomRuleMetadata.getTagValueScope(), TAGVALUESCOPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
