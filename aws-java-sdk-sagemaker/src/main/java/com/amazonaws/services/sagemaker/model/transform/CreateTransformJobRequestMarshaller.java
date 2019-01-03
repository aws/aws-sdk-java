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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateTransformJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateTransformJobRequestMarshaller {

    private static final MarshallingInfo<String> TRANSFORMJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransformJobName").build();
    private static final MarshallingInfo<String> MODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelName").build();
    private static final MarshallingInfo<Integer> MAXCONCURRENTTRANSFORMS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxConcurrentTransforms").build();
    private static final MarshallingInfo<Integer> MAXPAYLOADINMB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxPayloadInMB").build();
    private static final MarshallingInfo<String> BATCHSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchStrategy").build();
    private static final MarshallingInfo<Map> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Environment").build();
    private static final MarshallingInfo<StructuredPojo> TRANSFORMINPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransformInput").build();
    private static final MarshallingInfo<StructuredPojo> TRANSFORMOUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransformOutput").build();
    private static final MarshallingInfo<StructuredPojo> TRANSFORMRESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransformResources").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateTransformJobRequestMarshaller instance = new CreateTransformJobRequestMarshaller();

    public static CreateTransformJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateTransformJobRequest createTransformJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createTransformJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createTransformJobRequest.getTransformJobName(), TRANSFORMJOBNAME_BINDING);
            protocolMarshaller.marshall(createTransformJobRequest.getModelName(), MODELNAME_BINDING);
            protocolMarshaller.marshall(createTransformJobRequest.getMaxConcurrentTransforms(), MAXCONCURRENTTRANSFORMS_BINDING);
            protocolMarshaller.marshall(createTransformJobRequest.getMaxPayloadInMB(), MAXPAYLOADINMB_BINDING);
            protocolMarshaller.marshall(createTransformJobRequest.getBatchStrategy(), BATCHSTRATEGY_BINDING);
            protocolMarshaller.marshall(createTransformJobRequest.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(createTransformJobRequest.getTransformInput(), TRANSFORMINPUT_BINDING);
            protocolMarshaller.marshall(createTransformJobRequest.getTransformOutput(), TRANSFORMOUTPUT_BINDING);
            protocolMarshaller.marshall(createTransformJobRequest.getTransformResources(), TRANSFORMRESOURCES_BINDING);
            protocolMarshaller.marshall(createTransformJobRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
