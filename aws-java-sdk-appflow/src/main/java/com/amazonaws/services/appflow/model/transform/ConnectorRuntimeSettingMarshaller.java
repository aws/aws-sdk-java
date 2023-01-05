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
package com.amazonaws.services.appflow.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConnectorRuntimeSettingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConnectorRuntimeSettingMarshaller {

    private static final MarshallingInfo<String> KEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("key").build();
    private static final MarshallingInfo<String> DATATYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dataType").build();
    private static final MarshallingInfo<Boolean> ISREQUIRED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isRequired").build();
    private static final MarshallingInfo<String> LABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("label").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> SCOPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scope").build();
    private static final MarshallingInfo<List> CONNECTORSUPPLIEDVALUEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorSuppliedValueOptions").build();

    private static final ConnectorRuntimeSettingMarshaller instance = new ConnectorRuntimeSettingMarshaller();

    public static ConnectorRuntimeSettingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConnectorRuntimeSetting connectorRuntimeSetting, ProtocolMarshaller protocolMarshaller) {

        if (connectorRuntimeSetting == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(connectorRuntimeSetting.getKey(), KEY_BINDING);
            protocolMarshaller.marshall(connectorRuntimeSetting.getDataType(), DATATYPE_BINDING);
            protocolMarshaller.marshall(connectorRuntimeSetting.getIsRequired(), ISREQUIRED_BINDING);
            protocolMarshaller.marshall(connectorRuntimeSetting.getLabel(), LABEL_BINDING);
            protocolMarshaller.marshall(connectorRuntimeSetting.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(connectorRuntimeSetting.getScope(), SCOPE_BINDING);
            protocolMarshaller.marshall(connectorRuntimeSetting.getConnectorSuppliedValueOptions(), CONNECTORSUPPLIEDVALUEOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
