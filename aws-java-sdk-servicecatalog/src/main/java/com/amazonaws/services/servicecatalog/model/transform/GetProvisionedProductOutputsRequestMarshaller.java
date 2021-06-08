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
package com.amazonaws.services.servicecatalog.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicecatalog.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetProvisionedProductOutputsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetProvisionedProductOutputsRequestMarshaller {

    private static final MarshallingInfo<String> ACCEPTLANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceptLanguage").build();
    private static final MarshallingInfo<String> PROVISIONEDPRODUCTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedProductId").build();
    private static final MarshallingInfo<String> PROVISIONEDPRODUCTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedProductName").build();
    private static final MarshallingInfo<List> OUTPUTKEYS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutputKeys").build();
    private static final MarshallingInfo<Integer> PAGESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PageSize").build();
    private static final MarshallingInfo<String> PAGETOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PageToken").build();

    private static final GetProvisionedProductOutputsRequestMarshaller instance = new GetProvisionedProductOutputsRequestMarshaller();

    public static GetProvisionedProductOutputsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetProvisionedProductOutputsRequest getProvisionedProductOutputsRequest, ProtocolMarshaller protocolMarshaller) {

        if (getProvisionedProductOutputsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getProvisionedProductOutputsRequest.getAcceptLanguage(), ACCEPTLANGUAGE_BINDING);
            protocolMarshaller.marshall(getProvisionedProductOutputsRequest.getProvisionedProductId(), PROVISIONEDPRODUCTID_BINDING);
            protocolMarshaller.marshall(getProvisionedProductOutputsRequest.getProvisionedProductName(), PROVISIONEDPRODUCTNAME_BINDING);
            protocolMarshaller.marshall(getProvisionedProductOutputsRequest.getOutputKeys(), OUTPUTKEYS_BINDING);
            protocolMarshaller.marshall(getProvisionedProductOutputsRequest.getPageSize(), PAGESIZE_BINDING);
            protocolMarshaller.marshall(getProvisionedProductOutputsRequest.getPageToken(), PAGETOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
