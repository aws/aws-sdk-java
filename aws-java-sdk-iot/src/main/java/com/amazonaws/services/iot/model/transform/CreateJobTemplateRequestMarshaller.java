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
package com.amazonaws.services.iot.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateJobTemplateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateJobTemplateRequestMarshaller {

    private static final MarshallingInfo<String> JOBTEMPLATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("jobTemplateId").build();
    private static final MarshallingInfo<String> JOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobArn").build();
    private static final MarshallingInfo<String> DOCUMENTSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("documentSource").build();
    private static final MarshallingInfo<String> DOCUMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("document").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<StructuredPojo> PRESIGNEDURLCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("presignedUrlConfig").build();
    private static final MarshallingInfo<StructuredPojo> JOBEXECUTIONSROLLOUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobExecutionsRolloutConfig").build();
    private static final MarshallingInfo<StructuredPojo> ABORTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("abortConfig").build();
    private static final MarshallingInfo<StructuredPojo> TIMEOUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeoutConfig").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateJobTemplateRequestMarshaller instance = new CreateJobTemplateRequestMarshaller();

    public static CreateJobTemplateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateJobTemplateRequest createJobTemplateRequest, ProtocolMarshaller protocolMarshaller) {

        if (createJobTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createJobTemplateRequest.getJobTemplateId(), JOBTEMPLATEID_BINDING);
            protocolMarshaller.marshall(createJobTemplateRequest.getJobArn(), JOBARN_BINDING);
            protocolMarshaller.marshall(createJobTemplateRequest.getDocumentSource(), DOCUMENTSOURCE_BINDING);
            protocolMarshaller.marshall(createJobTemplateRequest.getDocument(), DOCUMENT_BINDING);
            protocolMarshaller.marshall(createJobTemplateRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createJobTemplateRequest.getPresignedUrlConfig(), PRESIGNEDURLCONFIG_BINDING);
            protocolMarshaller.marshall(createJobTemplateRequest.getJobExecutionsRolloutConfig(), JOBEXECUTIONSROLLOUTCONFIG_BINDING);
            protocolMarshaller.marshall(createJobTemplateRequest.getAbortConfig(), ABORTCONFIG_BINDING);
            protocolMarshaller.marshall(createJobTemplateRequest.getTimeoutConfig(), TIMEOUTCONFIG_BINDING);
            protocolMarshaller.marshall(createJobTemplateRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
