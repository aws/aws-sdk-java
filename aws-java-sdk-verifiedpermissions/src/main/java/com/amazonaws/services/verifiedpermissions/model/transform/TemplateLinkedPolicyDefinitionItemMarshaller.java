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
package com.amazonaws.services.verifiedpermissions.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.verifiedpermissions.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TemplateLinkedPolicyDefinitionItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TemplateLinkedPolicyDefinitionItemMarshaller {

    private static final MarshallingInfo<String> POLICYTEMPLATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("policyTemplateId").build();
    private static final MarshallingInfo<StructuredPojo> PRINCIPAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("principal").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resource").build();

    private static final TemplateLinkedPolicyDefinitionItemMarshaller instance = new TemplateLinkedPolicyDefinitionItemMarshaller();

    public static TemplateLinkedPolicyDefinitionItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TemplateLinkedPolicyDefinitionItem templateLinkedPolicyDefinitionItem, ProtocolMarshaller protocolMarshaller) {

        if (templateLinkedPolicyDefinitionItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(templateLinkedPolicyDefinitionItem.getPolicyTemplateId(), POLICYTEMPLATEID_BINDING);
            protocolMarshaller.marshall(templateLinkedPolicyDefinitionItem.getPrincipal(), PRINCIPAL_BINDING);
            protocolMarshaller.marshall(templateLinkedPolicyDefinitionItem.getResource(), RESOURCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
