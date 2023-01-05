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
package com.amazonaws.services.auditmanager.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.auditmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssessmentFrameworkShareRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssessmentFrameworkShareRequestMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> FRAMEWORKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("frameworkId").build();
    private static final MarshallingInfo<String> FRAMEWORKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("frameworkName").build();
    private static final MarshallingInfo<String> FRAMEWORKDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("frameworkDescription").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> SOURCEACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceAccount").build();
    private static final MarshallingInfo<String> DESTINATIONACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationAccount").build();
    private static final MarshallingInfo<String> DESTINATIONREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationRegion").build();
    private static final MarshallingInfo<java.util.Date> EXPIRATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expirationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdated").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> COMMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("comment").build();
    private static final MarshallingInfo<Integer> STANDARDCONTROLSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("standardControlsCount").build();
    private static final MarshallingInfo<Integer> CUSTOMCONTROLSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customControlsCount").build();
    private static final MarshallingInfo<String> COMPLIANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("complianceType").build();

    private static final AssessmentFrameworkShareRequestMarshaller instance = new AssessmentFrameworkShareRequestMarshaller();

    public static AssessmentFrameworkShareRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssessmentFrameworkShareRequest assessmentFrameworkShareRequest, ProtocolMarshaller protocolMarshaller) {

        if (assessmentFrameworkShareRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(assessmentFrameworkShareRequest.getId(), ID_BINDING);
            protocolMarshaller.marshall(assessmentFrameworkShareRequest.getFrameworkId(), FRAMEWORKID_BINDING);
            protocolMarshaller.marshall(assessmentFrameworkShareRequest.getFrameworkName(), FRAMEWORKNAME_BINDING);
            protocolMarshaller.marshall(assessmentFrameworkShareRequest.getFrameworkDescription(), FRAMEWORKDESCRIPTION_BINDING);
            protocolMarshaller.marshall(assessmentFrameworkShareRequest.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(assessmentFrameworkShareRequest.getSourceAccount(), SOURCEACCOUNT_BINDING);
            protocolMarshaller.marshall(assessmentFrameworkShareRequest.getDestinationAccount(), DESTINATIONACCOUNT_BINDING);
            protocolMarshaller.marshall(assessmentFrameworkShareRequest.getDestinationRegion(), DESTINATIONREGION_BINDING);
            protocolMarshaller.marshall(assessmentFrameworkShareRequest.getExpirationTime(), EXPIRATIONTIME_BINDING);
            protocolMarshaller.marshall(assessmentFrameworkShareRequest.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(assessmentFrameworkShareRequest.getLastUpdated(), LASTUPDATED_BINDING);
            protocolMarshaller.marshall(assessmentFrameworkShareRequest.getComment(), COMMENT_BINDING);
            protocolMarshaller.marshall(assessmentFrameworkShareRequest.getStandardControlsCount(), STANDARDCONTROLSCOUNT_BINDING);
            protocolMarshaller.marshall(assessmentFrameworkShareRequest.getCustomControlsCount(), CUSTOMCONTROLSCOUNT_BINDING);
            protocolMarshaller.marshall(assessmentFrameworkShareRequest.getComplianceType(), COMPLIANCETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
