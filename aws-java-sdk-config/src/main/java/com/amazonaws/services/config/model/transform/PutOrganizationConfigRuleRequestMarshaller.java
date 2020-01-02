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
 * PutOrganizationConfigRuleRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutOrganizationConfigRuleRequestMarshaller {

    private static final MarshallingInfo<String> ORGANIZATIONCONFIGRULENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationConfigRuleName").build();
    private static final MarshallingInfo<StructuredPojo> ORGANIZATIONMANAGEDRULEMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationManagedRuleMetadata").build();
    private static final MarshallingInfo<StructuredPojo> ORGANIZATIONCUSTOMRULEMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationCustomRuleMetadata").build();
    private static final MarshallingInfo<List> EXCLUDEDACCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludedAccounts").build();

    private static final PutOrganizationConfigRuleRequestMarshaller instance = new PutOrganizationConfigRuleRequestMarshaller();

    public static PutOrganizationConfigRuleRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutOrganizationConfigRuleRequest putOrganizationConfigRuleRequest, ProtocolMarshaller protocolMarshaller) {

        if (putOrganizationConfigRuleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putOrganizationConfigRuleRequest.getOrganizationConfigRuleName(), ORGANIZATIONCONFIGRULENAME_BINDING);
            protocolMarshaller.marshall(putOrganizationConfigRuleRequest.getOrganizationManagedRuleMetadata(), ORGANIZATIONMANAGEDRULEMETADATA_BINDING);
            protocolMarshaller.marshall(putOrganizationConfigRuleRequest.getOrganizationCustomRuleMetadata(), ORGANIZATIONCUSTOMRULEMETADATA_BINDING);
            protocolMarshaller.marshall(putOrganizationConfigRuleRequest.getExcludedAccounts(), EXCLUDEDACCOUNTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
