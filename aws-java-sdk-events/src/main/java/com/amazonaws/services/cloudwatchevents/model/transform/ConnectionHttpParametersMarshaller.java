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
package com.amazonaws.services.cloudwatchevents.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchevents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConnectionHttpParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConnectionHttpParametersMarshaller {

    private static final MarshallingInfo<List> HEADERPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HeaderParameters").build();
    private static final MarshallingInfo<List> QUERYSTRINGPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryStringParameters").build();
    private static final MarshallingInfo<List> BODYPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BodyParameters").build();

    private static final ConnectionHttpParametersMarshaller instance = new ConnectionHttpParametersMarshaller();

    public static ConnectionHttpParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConnectionHttpParameters connectionHttpParameters, ProtocolMarshaller protocolMarshaller) {

        if (connectionHttpParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(connectionHttpParameters.getHeaderParameters(), HEADERPARAMETERS_BINDING);
            protocolMarshaller.marshall(connectionHttpParameters.getQueryStringParameters(), QUERYSTRINGPARAMETERS_BINDING);
            protocolMarshaller.marshall(connectionHttpParameters.getBodyParameters(), BODYPARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
