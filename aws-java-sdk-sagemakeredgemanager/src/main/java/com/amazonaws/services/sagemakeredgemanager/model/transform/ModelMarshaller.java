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
package com.amazonaws.services.sagemakeredgemanager.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemakeredgemanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ModelMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ModelMarshaller {

    private static final MarshallingInfo<String> MODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelName").build();
    private static final MarshallingInfo<String> MODELVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelVersion").build();
    private static final MarshallingInfo<java.util.Date> LATESTSAMPLETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestSampleTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LATESTINFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestInference").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> MODELMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelMetrics").build();

    private static final ModelMarshaller instance = new ModelMarshaller();

    public static ModelMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Model model, ProtocolMarshaller protocolMarshaller) {

        if (model == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(model.getModelName(), MODELNAME_BINDING);
            protocolMarshaller.marshall(model.getModelVersion(), MODELVERSION_BINDING);
            protocolMarshaller.marshall(model.getLatestSampleTime(), LATESTSAMPLETIME_BINDING);
            protocolMarshaller.marshall(model.getLatestInference(), LATESTINFERENCE_BINDING);
            protocolMarshaller.marshall(model.getModelMetrics(), MODELMETRICS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
