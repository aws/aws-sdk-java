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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ServiceCatalogProvisioningDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServiceCatalogProvisioningDetailsMarshaller {

    private static final MarshallingInfo<String> PRODUCTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProductId").build();
    private static final MarshallingInfo<String> PROVISIONINGARTIFACTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisioningArtifactId").build();
    private static final MarshallingInfo<String> PATHID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PathId").build();
    private static final MarshallingInfo<List> PROVISIONINGPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisioningParameters").build();

    private static final ServiceCatalogProvisioningDetailsMarshaller instance = new ServiceCatalogProvisioningDetailsMarshaller();

    public static ServiceCatalogProvisioningDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServiceCatalogProvisioningDetails serviceCatalogProvisioningDetails, ProtocolMarshaller protocolMarshaller) {

        if (serviceCatalogProvisioningDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serviceCatalogProvisioningDetails.getProductId(), PRODUCTID_BINDING);
            protocolMarshaller.marshall(serviceCatalogProvisioningDetails.getProvisioningArtifactId(), PROVISIONINGARTIFACTID_BINDING);
            protocolMarshaller.marshall(serviceCatalogProvisioningDetails.getPathId(), PATHID_BINDING);
            protocolMarshaller.marshall(serviceCatalogProvisioningDetails.getProvisioningParameters(), PROVISIONINGPARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
