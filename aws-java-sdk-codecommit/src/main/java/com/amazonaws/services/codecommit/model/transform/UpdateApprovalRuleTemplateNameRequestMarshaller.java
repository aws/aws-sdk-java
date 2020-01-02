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
package com.amazonaws.services.codecommit.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codecommit.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateApprovalRuleTemplateNameRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateApprovalRuleTemplateNameRequestMarshaller {

    private static final MarshallingInfo<String> OLDAPPROVALRULETEMPLATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("oldApprovalRuleTemplateName").build();
    private static final MarshallingInfo<String> NEWAPPROVALRULETEMPLATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("newApprovalRuleTemplateName").build();

    private static final UpdateApprovalRuleTemplateNameRequestMarshaller instance = new UpdateApprovalRuleTemplateNameRequestMarshaller();

    public static UpdateApprovalRuleTemplateNameRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateApprovalRuleTemplateNameRequest updateApprovalRuleTemplateNameRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateApprovalRuleTemplateNameRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateApprovalRuleTemplateNameRequest.getOldApprovalRuleTemplateName(), OLDAPPROVALRULETEMPLATENAME_BINDING);
            protocolMarshaller.marshall(updateApprovalRuleTemplateNameRequest.getNewApprovalRuleTemplateName(), NEWAPPROVALRULETEMPLATENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
