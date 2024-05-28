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
package com.amazonaws.services.cleanrooms.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanrooms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CollaborationPrivacyBudgetTemplateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CollaborationPrivacyBudgetTemplateMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> COLLABORATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collaborationId").build();
    private static final MarshallingInfo<String> COLLABORATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collaborationArn").build();
    private static final MarshallingInfo<String> CREATORACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creatorAccountId").build();
    private static final MarshallingInfo<java.util.Date> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> PRIVACYBUDGETTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privacyBudgetType").build();
    private static final MarshallingInfo<String> AUTOREFRESH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoRefresh").build();
    private static final MarshallingInfo<StructuredPojo> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parameters").build();

    private static final CollaborationPrivacyBudgetTemplateMarshaller instance = new CollaborationPrivacyBudgetTemplateMarshaller();

    public static CollaborationPrivacyBudgetTemplateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CollaborationPrivacyBudgetTemplate collaborationPrivacyBudgetTemplate, ProtocolMarshaller protocolMarshaller) {

        if (collaborationPrivacyBudgetTemplate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(collaborationPrivacyBudgetTemplate.getId(), ID_BINDING);
            protocolMarshaller.marshall(collaborationPrivacyBudgetTemplate.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(collaborationPrivacyBudgetTemplate.getCollaborationId(), COLLABORATIONID_BINDING);
            protocolMarshaller.marshall(collaborationPrivacyBudgetTemplate.getCollaborationArn(), COLLABORATIONARN_BINDING);
            protocolMarshaller.marshall(collaborationPrivacyBudgetTemplate.getCreatorAccountId(), CREATORACCOUNTID_BINDING);
            protocolMarshaller.marshall(collaborationPrivacyBudgetTemplate.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(collaborationPrivacyBudgetTemplate.getUpdateTime(), UPDATETIME_BINDING);
            protocolMarshaller.marshall(collaborationPrivacyBudgetTemplate.getPrivacyBudgetType(), PRIVACYBUDGETTYPE_BINDING);
            protocolMarshaller.marshall(collaborationPrivacyBudgetTemplate.getAutoRefresh(), AUTOREFRESH_BINDING);
            protocolMarshaller.marshall(collaborationPrivacyBudgetTemplate.getParameters(), PARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
