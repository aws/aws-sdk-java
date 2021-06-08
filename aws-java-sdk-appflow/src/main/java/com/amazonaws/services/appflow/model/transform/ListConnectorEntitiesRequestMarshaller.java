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
 * ListConnectorEntitiesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListConnectorEntitiesRequestMarshaller {

    private static final MarshallingInfo<String> CONNECTORPROFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorProfileName").build();
    private static final MarshallingInfo<String> CONNECTORTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorType").build();
    private static final MarshallingInfo<String> ENTITIESPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("entitiesPath").build();

    private static final ListConnectorEntitiesRequestMarshaller instance = new ListConnectorEntitiesRequestMarshaller();

    public static ListConnectorEntitiesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListConnectorEntitiesRequest listConnectorEntitiesRequest, ProtocolMarshaller protocolMarshaller) {

        if (listConnectorEntitiesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listConnectorEntitiesRequest.getConnectorProfileName(), CONNECTORPROFILENAME_BINDING);
            protocolMarshaller.marshall(listConnectorEntitiesRequest.getConnectorType(), CONNECTORTYPE_BINDING);
            protocolMarshaller.marshall(listConnectorEntitiesRequest.getEntitiesPath(), ENTITIESPATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
