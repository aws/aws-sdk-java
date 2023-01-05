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
package com.amazonaws.services.pipes.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pipes.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PipeTargetHttpParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PipeTargetHttpParametersMarshaller {

    private static final MarshallingInfo<Map> HEADERPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HeaderParameters").build();
    private static final MarshallingInfo<List> PATHPARAMETERVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PathParameterValues").build();
    private static final MarshallingInfo<Map> QUERYSTRINGPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryStringParameters").build();

    private static final PipeTargetHttpParametersMarshaller instance = new PipeTargetHttpParametersMarshaller();

    public static PipeTargetHttpParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PipeTargetHttpParameters pipeTargetHttpParameters, ProtocolMarshaller protocolMarshaller) {

        if (pipeTargetHttpParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pipeTargetHttpParameters.getHeaderParameters(), HEADERPARAMETERS_BINDING);
            protocolMarshaller.marshall(pipeTargetHttpParameters.getPathParameterValues(), PATHPARAMETERVALUES_BINDING);
            protocolMarshaller.marshall(pipeTargetHttpParameters.getQueryStringParameters(), QUERYSTRINGPARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
