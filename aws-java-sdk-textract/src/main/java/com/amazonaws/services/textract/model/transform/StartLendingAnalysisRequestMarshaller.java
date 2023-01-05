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
package com.amazonaws.services.textract.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.textract.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartLendingAnalysisRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartLendingAnalysisRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> DOCUMENTLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentLocation").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientRequestToken").build();
    private static final MarshallingInfo<String> JOBTAG_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobTag").build();
    private static final MarshallingInfo<StructuredPojo> NOTIFICATIONCHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotificationChannel").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputConfig").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KMSKeyId").build();

    private static final StartLendingAnalysisRequestMarshaller instance = new StartLendingAnalysisRequestMarshaller();

    public static StartLendingAnalysisRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartLendingAnalysisRequest startLendingAnalysisRequest, ProtocolMarshaller protocolMarshaller) {

        if (startLendingAnalysisRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startLendingAnalysisRequest.getDocumentLocation(), DOCUMENTLOCATION_BINDING);
            protocolMarshaller.marshall(startLendingAnalysisRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
            protocolMarshaller.marshall(startLendingAnalysisRequest.getJobTag(), JOBTAG_BINDING);
            protocolMarshaller.marshall(startLendingAnalysisRequest.getNotificationChannel(), NOTIFICATIONCHANNEL_BINDING);
            protocolMarshaller.marshall(startLendingAnalysisRequest.getOutputConfig(), OUTPUTCONFIG_BINDING);
            protocolMarshaller.marshall(startLendingAnalysisRequest.getKMSKeyId(), KMSKEYID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
