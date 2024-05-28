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
package com.amazonaws.services.lookoutequipment.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutequipment.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateRetrainingSchedulerRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateRetrainingSchedulerRequestMarshaller {

    private static final MarshallingInfo<String> MODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelName").build();
    private static final MarshallingInfo<java.util.Date> RETRAININGSTARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetrainingStartDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> RETRAININGFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetrainingFrequency").build();
    private static final MarshallingInfo<String> LOOKBACKWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LookbackWindow").build();
    private static final MarshallingInfo<String> PROMOTEMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PromoteMode").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final CreateRetrainingSchedulerRequestMarshaller instance = new CreateRetrainingSchedulerRequestMarshaller();

    public static CreateRetrainingSchedulerRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateRetrainingSchedulerRequest createRetrainingSchedulerRequest, ProtocolMarshaller protocolMarshaller) {

        if (createRetrainingSchedulerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createRetrainingSchedulerRequest.getModelName(), MODELNAME_BINDING);
            protocolMarshaller.marshall(createRetrainingSchedulerRequest.getRetrainingStartDate(), RETRAININGSTARTDATE_BINDING);
            protocolMarshaller.marshall(createRetrainingSchedulerRequest.getRetrainingFrequency(), RETRAININGFREQUENCY_BINDING);
            protocolMarshaller.marshall(createRetrainingSchedulerRequest.getLookbackWindow(), LOOKBACKWINDOW_BINDING);
            protocolMarshaller.marshall(createRetrainingSchedulerRequest.getPromoteMode(), PROMOTEMODE_BINDING);
            protocolMarshaller.marshall(createRetrainingSchedulerRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
