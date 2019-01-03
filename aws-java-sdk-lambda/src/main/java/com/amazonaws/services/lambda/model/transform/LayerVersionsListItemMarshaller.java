/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lambda.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LayerVersionsListItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LayerVersionsListItemMarshaller {

    private static final MarshallingInfo<String> LAYERVERSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LayerVersionArn").build();
    private static final MarshallingInfo<Long> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Version").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> CREATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedDate").build();
    private static final MarshallingInfo<List> COMPATIBLERUNTIMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompatibleRuntimes").build();
    private static final MarshallingInfo<String> LICENSEINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseInfo").build();

    private static final LayerVersionsListItemMarshaller instance = new LayerVersionsListItemMarshaller();

    public static LayerVersionsListItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LayerVersionsListItem layerVersionsListItem, ProtocolMarshaller protocolMarshaller) {

        if (layerVersionsListItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(layerVersionsListItem.getLayerVersionArn(), LAYERVERSIONARN_BINDING);
            protocolMarshaller.marshall(layerVersionsListItem.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(layerVersionsListItem.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(layerVersionsListItem.getCreatedDate(), CREATEDDATE_BINDING);
            protocolMarshaller.marshall(layerVersionsListItem.getCompatibleRuntimes(), COMPATIBLERUNTIMES_BINDING);
            protocolMarshaller.marshall(layerVersionsListItem.getLicenseInfo(), LICENSEINFO_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
