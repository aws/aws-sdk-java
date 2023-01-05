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
package com.amazonaws.services.securitylake.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securitylake.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateAwsLogSourceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateAwsLogSourceRequestMarshaller {

    private static final MarshallingInfo<Map> ENABLEALLDIMENSIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableAllDimensions").build();
    private static final MarshallingInfo<List> ENABLESINGLEDIMENSION_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableSingleDimension").build();
    private static final MarshallingInfo<Map> ENABLETWODIMENSIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableTwoDimensions").build();
    private static final MarshallingInfo<List> INPUTORDER_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("inputOrder").build();

    private static final CreateAwsLogSourceRequestMarshaller instance = new CreateAwsLogSourceRequestMarshaller();

    public static CreateAwsLogSourceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateAwsLogSourceRequest createAwsLogSourceRequest, ProtocolMarshaller protocolMarshaller) {

        if (createAwsLogSourceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createAwsLogSourceRequest.getEnableAllDimensions(), ENABLEALLDIMENSIONS_BINDING);
            protocolMarshaller.marshall(createAwsLogSourceRequest.getEnableSingleDimension(), ENABLESINGLEDIMENSION_BINDING);
            protocolMarshaller.marshall(createAwsLogSourceRequest.getEnableTwoDimensions(), ENABLETWODIMENSIONS_BINDING);
            protocolMarshaller.marshall(createAwsLogSourceRequest.getInputOrder(), INPUTORDER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
