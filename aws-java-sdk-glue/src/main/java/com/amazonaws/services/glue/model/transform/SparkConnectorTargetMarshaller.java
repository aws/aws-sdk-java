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
package com.amazonaws.services.glue.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SparkConnectorTargetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SparkConnectorTargetMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<List> INPUTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Inputs").build();
    private static final MarshallingInfo<String> CONNECTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionName").build();
    private static final MarshallingInfo<String> CONNECTORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectorName").build();
    private static final MarshallingInfo<String> CONNECTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionType").build();
    private static final MarshallingInfo<Map> ADDITIONALOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalOptions").build();
    private static final MarshallingInfo<List> OUTPUTSCHEMAS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutputSchemas").build();

    private static final SparkConnectorTargetMarshaller instance = new SparkConnectorTargetMarshaller();

    public static SparkConnectorTargetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SparkConnectorTarget sparkConnectorTarget, ProtocolMarshaller protocolMarshaller) {

        if (sparkConnectorTarget == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sparkConnectorTarget.getName(), NAME_BINDING);
            protocolMarshaller.marshall(sparkConnectorTarget.getInputs(), INPUTS_BINDING);
            protocolMarshaller.marshall(sparkConnectorTarget.getConnectionName(), CONNECTIONNAME_BINDING);
            protocolMarshaller.marshall(sparkConnectorTarget.getConnectorName(), CONNECTORNAME_BINDING);
            protocolMarshaller.marshall(sparkConnectorTarget.getConnectionType(), CONNECTIONTYPE_BINDING);
            protocolMarshaller.marshall(sparkConnectorTarget.getAdditionalOptions(), ADDITIONALOPTIONS_BINDING);
            protocolMarshaller.marshall(sparkConnectorTarget.getOutputSchemas(), OUTPUTSCHEMAS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
