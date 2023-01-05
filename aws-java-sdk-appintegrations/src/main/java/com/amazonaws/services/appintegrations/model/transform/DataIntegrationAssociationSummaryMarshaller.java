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
package com.amazonaws.services.appintegrations.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appintegrations.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataIntegrationAssociationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataIntegrationAssociationSummaryMarshaller {

    private static final MarshallingInfo<String> DATAINTEGRATIONASSOCIATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataIntegrationAssociationArn").build();
    private static final MarshallingInfo<String> DATAINTEGRATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataIntegrationArn").build();
    private static final MarshallingInfo<String> CLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ClientId").build();

    private static final DataIntegrationAssociationSummaryMarshaller instance = new DataIntegrationAssociationSummaryMarshaller();

    public static DataIntegrationAssociationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataIntegrationAssociationSummary dataIntegrationAssociationSummary, ProtocolMarshaller protocolMarshaller) {

        if (dataIntegrationAssociationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataIntegrationAssociationSummary.getDataIntegrationAssociationArn(), DATAINTEGRATIONASSOCIATIONARN_BINDING);
            protocolMarshaller.marshall(dataIntegrationAssociationSummary.getDataIntegrationArn(), DATAINTEGRATIONARN_BINDING);
            protocolMarshaller.marshall(dataIntegrationAssociationSummary.getClientId(), CLIENTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
