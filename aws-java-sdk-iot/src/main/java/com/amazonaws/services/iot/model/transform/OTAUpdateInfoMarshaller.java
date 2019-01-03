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
package com.amazonaws.services.iot.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OTAUpdateInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OTAUpdateInfoMarshaller {

    private static final MarshallingInfo<String> OTAUPDATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("otaUpdateId").build();
    private static final MarshallingInfo<String> OTAUPDATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("otaUpdateArn").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> TARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("targets").build();
    private static final MarshallingInfo<StructuredPojo> AWSJOBEXECUTIONSROLLOUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsJobExecutionsRolloutConfig").build();
    private static final MarshallingInfo<String> TARGETSELECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetSelection").build();
    private static final MarshallingInfo<List> OTAUPDATEFILES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("otaUpdateFiles").build();
    private static final MarshallingInfo<String> OTAUPDATESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("otaUpdateStatus").build();
    private static final MarshallingInfo<String> AWSIOTJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsIotJobId").build();
    private static final MarshallingInfo<String> AWSIOTJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsIotJobArn").build();
    private static final MarshallingInfo<StructuredPojo> ERRORINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorInfo").build();
    private static final MarshallingInfo<Map> ADDITIONALPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("additionalParameters").build();

    private static final OTAUpdateInfoMarshaller instance = new OTAUpdateInfoMarshaller();

    public static OTAUpdateInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OTAUpdateInfo oTAUpdateInfo, ProtocolMarshaller protocolMarshaller) {

        if (oTAUpdateInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(oTAUpdateInfo.getOtaUpdateId(), OTAUPDATEID_BINDING);
            protocolMarshaller.marshall(oTAUpdateInfo.getOtaUpdateArn(), OTAUPDATEARN_BINDING);
            protocolMarshaller.marshall(oTAUpdateInfo.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(oTAUpdateInfo.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
            protocolMarshaller.marshall(oTAUpdateInfo.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(oTAUpdateInfo.getTargets(), TARGETS_BINDING);
            protocolMarshaller.marshall(oTAUpdateInfo.getAwsJobExecutionsRolloutConfig(), AWSJOBEXECUTIONSROLLOUTCONFIG_BINDING);
            protocolMarshaller.marshall(oTAUpdateInfo.getTargetSelection(), TARGETSELECTION_BINDING);
            protocolMarshaller.marshall(oTAUpdateInfo.getOtaUpdateFiles(), OTAUPDATEFILES_BINDING);
            protocolMarshaller.marshall(oTAUpdateInfo.getOtaUpdateStatus(), OTAUPDATESTATUS_BINDING);
            protocolMarshaller.marshall(oTAUpdateInfo.getAwsIotJobId(), AWSIOTJOBID_BINDING);
            protocolMarshaller.marshall(oTAUpdateInfo.getAwsIotJobArn(), AWSIOTJOBARN_BINDING);
            protocolMarshaller.marshall(oTAUpdateInfo.getErrorInfo(), ERRORINFO_BINDING);
            protocolMarshaller.marshall(oTAUpdateInfo.getAdditionalParameters(), ADDITIONALPARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
