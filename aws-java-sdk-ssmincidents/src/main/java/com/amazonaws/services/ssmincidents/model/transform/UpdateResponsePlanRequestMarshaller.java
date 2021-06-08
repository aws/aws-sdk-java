/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmincidents.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ssmincidents.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateResponsePlanRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateResponsePlanRequestMarshaller {

    private static final MarshallingInfo<List> ACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("actions").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<StructuredPojo> CHATCHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("chatChannel").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("displayName").build();
    private static final MarshallingInfo<List> ENGAGEMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("engagements").build();
    private static final MarshallingInfo<String> INCIDENTTEMPLATEDEDUPESTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("incidentTemplateDedupeString").build();
    private static final MarshallingInfo<Integer> INCIDENTTEMPLATEIMPACT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("incidentTemplateImpact").build();
    private static final MarshallingInfo<List> INCIDENTTEMPLATENOTIFICATIONTARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("incidentTemplateNotificationTargets").build();
    private static final MarshallingInfo<String> INCIDENTTEMPLATESUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("incidentTemplateSummary").build();
    private static final MarshallingInfo<String> INCIDENTTEMPLATETITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("incidentTemplateTitle").build();

    private static final UpdateResponsePlanRequestMarshaller instance = new UpdateResponsePlanRequestMarshaller();

    public static UpdateResponsePlanRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateResponsePlanRequest updateResponsePlanRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateResponsePlanRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateResponsePlanRequest.getActions(), ACTIONS_BINDING);
            protocolMarshaller.marshall(updateResponsePlanRequest.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(updateResponsePlanRequest.getChatChannel(), CHATCHANNEL_BINDING);
            protocolMarshaller.marshall(updateResponsePlanRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(updateResponsePlanRequest.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(updateResponsePlanRequest.getEngagements(), ENGAGEMENTS_BINDING);
            protocolMarshaller.marshall(updateResponsePlanRequest.getIncidentTemplateDedupeString(), INCIDENTTEMPLATEDEDUPESTRING_BINDING);
            protocolMarshaller.marshall(updateResponsePlanRequest.getIncidentTemplateImpact(), INCIDENTTEMPLATEIMPACT_BINDING);
            protocolMarshaller.marshall(updateResponsePlanRequest.getIncidentTemplateNotificationTargets(), INCIDENTTEMPLATENOTIFICATIONTARGETS_BINDING);
            protocolMarshaller.marshall(updateResponsePlanRequest.getIncidentTemplateSummary(), INCIDENTTEMPLATESUMMARY_BINDING);
            protocolMarshaller.marshall(updateResponsePlanRequest.getIncidentTemplateTitle(), INCIDENTTEMPLATETITLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
