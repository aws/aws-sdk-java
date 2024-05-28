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
package com.amazonaws.services.marketplacedeployment.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.marketplacedeployment.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutDeploymentParameterRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutDeploymentParameterRequestMarshaller {

    private static final MarshallingInfo<String> AGREEMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agreementId").build();
    private static final MarshallingInfo<String> CATALOG_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("catalog").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<StructuredPojo> DEPLOYMENTPARAMETER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentParameter").build();
    private static final MarshallingInfo<java.util.Date> EXPIRATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expirationDate").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> PRODUCTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("productId").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final PutDeploymentParameterRequestMarshaller instance = new PutDeploymentParameterRequestMarshaller();

    public static PutDeploymentParameterRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutDeploymentParameterRequest putDeploymentParameterRequest, ProtocolMarshaller protocolMarshaller) {

        if (putDeploymentParameterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putDeploymentParameterRequest.getAgreementId(), AGREEMENTID_BINDING);
            protocolMarshaller.marshall(putDeploymentParameterRequest.getCatalog(), CATALOG_BINDING);
            protocolMarshaller.marshall(putDeploymentParameterRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(putDeploymentParameterRequest.getDeploymentParameter(), DEPLOYMENTPARAMETER_BINDING);
            protocolMarshaller.marshall(putDeploymentParameterRequest.getExpirationDate(), EXPIRATIONDATE_BINDING);
            protocolMarshaller.marshall(putDeploymentParameterRequest.getProductId(), PRODUCTID_BINDING);
            protocolMarshaller.marshall(putDeploymentParameterRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
