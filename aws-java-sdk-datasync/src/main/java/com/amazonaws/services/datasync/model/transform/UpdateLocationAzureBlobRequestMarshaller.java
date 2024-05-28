/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datasync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateLocationAzureBlobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateLocationAzureBlobRequestMarshaller {

    private static final MarshallingInfo<String> LOCATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LocationArn").build();
    private static final MarshallingInfo<String> SUBDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Subdirectory").build();
    private static final MarshallingInfo<String> AUTHENTICATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthenticationType").build();
    private static final MarshallingInfo<StructuredPojo> SASCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SasConfiguration").build();
    private static final MarshallingInfo<String> BLOBTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BlobType").build();
    private static final MarshallingInfo<String> ACCESSTIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessTier").build();
    private static final MarshallingInfo<List> AGENTARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AgentArns").build();

    private static final UpdateLocationAzureBlobRequestMarshaller instance = new UpdateLocationAzureBlobRequestMarshaller();

    public static UpdateLocationAzureBlobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateLocationAzureBlobRequest updateLocationAzureBlobRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateLocationAzureBlobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateLocationAzureBlobRequest.getLocationArn(), LOCATIONARN_BINDING);
            protocolMarshaller.marshall(updateLocationAzureBlobRequest.getSubdirectory(), SUBDIRECTORY_BINDING);
            protocolMarshaller.marshall(updateLocationAzureBlobRequest.getAuthenticationType(), AUTHENTICATIONTYPE_BINDING);
            protocolMarshaller.marshall(updateLocationAzureBlobRequest.getSasConfiguration(), SASCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateLocationAzureBlobRequest.getBlobType(), BLOBTYPE_BINDING);
            protocolMarshaller.marshall(updateLocationAzureBlobRequest.getAccessTier(), ACCESSTIER_BINDING);
            protocolMarshaller.marshall(updateLocationAzureBlobRequest.getAgentArns(), AGENTARNS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
