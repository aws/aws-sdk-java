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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StandardsControlMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StandardsControlMarshaller {

    private static final MarshallingInfo<String> STANDARDSCONTROLARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StandardsControlArn").build();
    private static final MarshallingInfo<String> CONTROLSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ControlStatus").build();
    private static final MarshallingInfo<String> DISABLEDREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisabledReason").build();
    private static final MarshallingInfo<java.util.Date> CONTROLSTATUSUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ControlStatusUpdatedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> CONTROLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ControlId").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> REMEDIATIONURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RemediationUrl").build();
    private static final MarshallingInfo<String> SEVERITYRATING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SeverityRating").build();
    private static final MarshallingInfo<List> RELATEDREQUIREMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RelatedRequirements").build();

    private static final StandardsControlMarshaller instance = new StandardsControlMarshaller();

    public static StandardsControlMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StandardsControl standardsControl, ProtocolMarshaller protocolMarshaller) {

        if (standardsControl == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(standardsControl.getStandardsControlArn(), STANDARDSCONTROLARN_BINDING);
            protocolMarshaller.marshall(standardsControl.getControlStatus(), CONTROLSTATUS_BINDING);
            protocolMarshaller.marshall(standardsControl.getDisabledReason(), DISABLEDREASON_BINDING);
            protocolMarshaller.marshall(standardsControl.getControlStatusUpdatedAt(), CONTROLSTATUSUPDATEDAT_BINDING);
            protocolMarshaller.marshall(standardsControl.getControlId(), CONTROLID_BINDING);
            protocolMarshaller.marshall(standardsControl.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(standardsControl.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(standardsControl.getRemediationUrl(), REMEDIATIONURL_BINDING);
            protocolMarshaller.marshall(standardsControl.getSeverityRating(), SEVERITYRATING_BINDING);
            protocolMarshaller.marshall(standardsControl.getRelatedRequirements(), RELATEDREQUIREMENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
