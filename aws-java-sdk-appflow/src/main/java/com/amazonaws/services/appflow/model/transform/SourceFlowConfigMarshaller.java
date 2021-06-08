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
package com.amazonaws.services.appflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SourceFlowConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SourceFlowConfigMarshaller {

    private static final MarshallingInfo<String> CONNECTORTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorType").build();
    private static final MarshallingInfo<String> CONNECTORPROFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorProfileName").build();
    private static final MarshallingInfo<StructuredPojo> SOURCECONNECTORPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceConnectorProperties").build();
    private static final MarshallingInfo<StructuredPojo> INCREMENTALPULLCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("incrementalPullConfig").build();

    private static final SourceFlowConfigMarshaller instance = new SourceFlowConfigMarshaller();

    public static SourceFlowConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SourceFlowConfig sourceFlowConfig, ProtocolMarshaller protocolMarshaller) {

        if (sourceFlowConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sourceFlowConfig.getConnectorType(), CONNECTORTYPE_BINDING);
            protocolMarshaller.marshall(sourceFlowConfig.getConnectorProfileName(), CONNECTORPROFILENAME_BINDING);
            protocolMarshaller.marshall(sourceFlowConfig.getSourceConnectorProperties(), SOURCECONNECTORPROPERTIES_BINDING);
            protocolMarshaller.marshall(sourceFlowConfig.getIncrementalPullConfig(), INCREMENTALPULLCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
