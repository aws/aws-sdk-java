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
package com.amazonaws.services.lookoutequipment.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutequipment.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateInferenceSchedulerRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateInferenceSchedulerRequestMarshaller {

    private static final MarshallingInfo<String> MODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelName").build();
    private static final MarshallingInfo<String> INFERENCESCHEDULERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InferenceSchedulerName").build();
    private static final MarshallingInfo<Long> DATADELAYOFFSETINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataDelayOffsetInMinutes").build();
    private static final MarshallingInfo<String> DATAUPLOADFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataUploadFrequency").build();
    private static final MarshallingInfo<StructuredPojo> DATAINPUTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataInputConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> DATAOUTPUTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataOutputConfiguration").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<String> SERVERSIDEKMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerSideKmsKeyId").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateInferenceSchedulerRequestMarshaller instance = new CreateInferenceSchedulerRequestMarshaller();

    public static CreateInferenceSchedulerRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateInferenceSchedulerRequest createInferenceSchedulerRequest, ProtocolMarshaller protocolMarshaller) {

        if (createInferenceSchedulerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createInferenceSchedulerRequest.getModelName(), MODELNAME_BINDING);
            protocolMarshaller.marshall(createInferenceSchedulerRequest.getInferenceSchedulerName(), INFERENCESCHEDULERNAME_BINDING);
            protocolMarshaller.marshall(createInferenceSchedulerRequest.getDataDelayOffsetInMinutes(), DATADELAYOFFSETINMINUTES_BINDING);
            protocolMarshaller.marshall(createInferenceSchedulerRequest.getDataUploadFrequency(), DATAUPLOADFREQUENCY_BINDING);
            protocolMarshaller.marshall(createInferenceSchedulerRequest.getDataInputConfiguration(), DATAINPUTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createInferenceSchedulerRequest.getDataOutputConfiguration(), DATAOUTPUTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createInferenceSchedulerRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createInferenceSchedulerRequest.getServerSideKmsKeyId(), SERVERSIDEKMSKEYID_BINDING);
            protocolMarshaller.marshall(createInferenceSchedulerRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createInferenceSchedulerRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
