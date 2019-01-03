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
package com.amazonaws.services.iotanalytics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotanalytics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PipelineActivityMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PipelineActivityMarshaller {

    private static final MarshallingInfo<StructuredPojo> CHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("channel").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambda").build();
    private static final MarshallingInfo<StructuredPojo> DATASTORE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("datastore").build();
    private static final MarshallingInfo<StructuredPojo> ADDATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("addAttributes").build();
    private static final MarshallingInfo<StructuredPojo> REMOVEATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("removeAttributes").build();
    private static final MarshallingInfo<StructuredPojo> SELECTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("selectAttributes").build();
    private static final MarshallingInfo<StructuredPojo> FILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filter").build();
    private static final MarshallingInfo<StructuredPojo> MATH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("math").build();
    private static final MarshallingInfo<StructuredPojo> DEVICEREGISTRYENRICH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deviceRegistryEnrich").build();
    private static final MarshallingInfo<StructuredPojo> DEVICESHADOWENRICH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deviceShadowEnrich").build();

    private static final PipelineActivityMarshaller instance = new PipelineActivityMarshaller();

    public static PipelineActivityMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PipelineActivity pipelineActivity, ProtocolMarshaller protocolMarshaller) {

        if (pipelineActivity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pipelineActivity.getChannel(), CHANNEL_BINDING);
            protocolMarshaller.marshall(pipelineActivity.getLambda(), LAMBDA_BINDING);
            protocolMarshaller.marshall(pipelineActivity.getDatastore(), DATASTORE_BINDING);
            protocolMarshaller.marshall(pipelineActivity.getAddAttributes(), ADDATTRIBUTES_BINDING);
            protocolMarshaller.marshall(pipelineActivity.getRemoveAttributes(), REMOVEATTRIBUTES_BINDING);
            protocolMarshaller.marshall(pipelineActivity.getSelectAttributes(), SELECTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(pipelineActivity.getFilter(), FILTER_BINDING);
            protocolMarshaller.marshall(pipelineActivity.getMath(), MATH_BINDING);
            protocolMarshaller.marshall(pipelineActivity.getDeviceRegistryEnrich(), DEVICEREGISTRYENRICH_BINDING);
            protocolMarshaller.marshall(pipelineActivity.getDeviceShadowEnrich(), DEVICESHADOWENRICH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
