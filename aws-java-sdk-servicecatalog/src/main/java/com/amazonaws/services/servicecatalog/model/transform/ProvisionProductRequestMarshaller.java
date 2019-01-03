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
package com.amazonaws.services.servicecatalog.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicecatalog.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProvisionProductRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProvisionProductRequestMarshaller {

    private static final MarshallingInfo<String> ACCEPTLANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceptLanguage").build();
    private static final MarshallingInfo<String> PRODUCTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProductId").build();
    private static final MarshallingInfo<String> PROVISIONINGARTIFACTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisioningArtifactId").build();
    private static final MarshallingInfo<String> PATHID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PathId").build();
    private static final MarshallingInfo<String> PROVISIONEDPRODUCTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedProductName").build();
    private static final MarshallingInfo<List> PROVISIONINGPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisioningParameters").build();
    private static final MarshallingInfo<StructuredPojo> PROVISIONINGPREFERENCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisioningPreferences").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<List> NOTIFICATIONARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotificationArns").build();
    private static final MarshallingInfo<String> PROVISIONTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final ProvisionProductRequestMarshaller instance = new ProvisionProductRequestMarshaller();

    public static ProvisionProductRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProvisionProductRequest provisionProductRequest, ProtocolMarshaller protocolMarshaller) {

        if (provisionProductRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(provisionProductRequest.getAcceptLanguage(), ACCEPTLANGUAGE_BINDING);
            protocolMarshaller.marshall(provisionProductRequest.getProductId(), PRODUCTID_BINDING);
            protocolMarshaller.marshall(provisionProductRequest.getProvisioningArtifactId(), PROVISIONINGARTIFACTID_BINDING);
            protocolMarshaller.marshall(provisionProductRequest.getPathId(), PATHID_BINDING);
            protocolMarshaller.marshall(provisionProductRequest.getProvisionedProductName(), PROVISIONEDPRODUCTNAME_BINDING);
            protocolMarshaller.marshall(provisionProductRequest.getProvisioningParameters(), PROVISIONINGPARAMETERS_BINDING);
            protocolMarshaller.marshall(provisionProductRequest.getProvisioningPreferences(), PROVISIONINGPREFERENCES_BINDING);
            protocolMarshaller.marshall(provisionProductRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(provisionProductRequest.getNotificationArns(), NOTIFICATIONARNS_BINDING);
            protocolMarshaller.marshall(provisionProductRequest.getProvisionToken(), PROVISIONTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
