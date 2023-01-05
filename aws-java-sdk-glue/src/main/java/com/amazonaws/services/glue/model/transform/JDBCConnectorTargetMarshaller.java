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
 * JDBCConnectorTargetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JDBCConnectorTargetMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<List> INPUTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Inputs").build();
    private static final MarshallingInfo<String> CONNECTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionName").build();
    private static final MarshallingInfo<String> CONNECTIONTABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionTable").build();
    private static final MarshallingInfo<String> CONNECTORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectorName").build();
    private static final MarshallingInfo<String> CONNECTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionType").build();
    private static final MarshallingInfo<Map> ADDITIONALOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalOptions").build();
    private static final MarshallingInfo<List> OUTPUTSCHEMAS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutputSchemas").build();

    private static final JDBCConnectorTargetMarshaller instance = new JDBCConnectorTargetMarshaller();

    public static JDBCConnectorTargetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JDBCConnectorTarget jDBCConnectorTarget, ProtocolMarshaller protocolMarshaller) {

        if (jDBCConnectorTarget == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jDBCConnectorTarget.getName(), NAME_BINDING);
            protocolMarshaller.marshall(jDBCConnectorTarget.getInputs(), INPUTS_BINDING);
            protocolMarshaller.marshall(jDBCConnectorTarget.getConnectionName(), CONNECTIONNAME_BINDING);
            protocolMarshaller.marshall(jDBCConnectorTarget.getConnectionTable(), CONNECTIONTABLE_BINDING);
            protocolMarshaller.marshall(jDBCConnectorTarget.getConnectorName(), CONNECTORNAME_BINDING);
            protocolMarshaller.marshall(jDBCConnectorTarget.getConnectionType(), CONNECTIONTYPE_BINDING);
            protocolMarshaller.marshall(jDBCConnectorTarget.getAdditionalOptions(), ADDITIONALOPTIONS_BINDING);
            protocolMarshaller.marshall(jDBCConnectorTarget.getOutputSchemas(), OUTPUTSCHEMAS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
