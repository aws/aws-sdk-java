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
package com.amazonaws.services.mediaconvert.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateJobRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACCELERATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accelerationSettings").build();
    private static final MarshallingInfo<String> BILLINGTAGSSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("billingTagsSource").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> JOBTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobTemplate").build();
    private static final MarshallingInfo<String> QUEUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("queue").build();
    private static final MarshallingInfo<String> ROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("role").build();
    private static final MarshallingInfo<StructuredPojo> SETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("settings").build();
    private static final MarshallingInfo<String> STATUSUPDATEINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusUpdateInterval").build();
    private static final MarshallingInfo<Map> USERMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("userMetadata").build();

    private static final CreateJobRequestMarshaller instance = new CreateJobRequestMarshaller();

    public static CreateJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateJobRequest createJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createJobRequest.getAccelerationSettings(), ACCELERATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(createJobRequest.getBillingTagsSource(), BILLINGTAGSSOURCE_BINDING);
            protocolMarshaller.marshall(createJobRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
            protocolMarshaller.marshall(createJobRequest.getJobTemplate(), JOBTEMPLATE_BINDING);
            protocolMarshaller.marshall(createJobRequest.getQueue(), QUEUE_BINDING);
            protocolMarshaller.marshall(createJobRequest.getRole(), ROLE_BINDING);
            protocolMarshaller.marshall(createJobRequest.getSettings(), SETTINGS_BINDING);
            protocolMarshaller.marshall(createJobRequest.getStatusUpdateInterval(), STATUSUPDATEINTERVAL_BINDING);
            protocolMarshaller.marshall(createJobRequest.getUserMetadata(), USERMETADATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
