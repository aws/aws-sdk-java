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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicecatalog.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdatePortfolioShareRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdatePortfolioShareRequestMarshaller {

    private static final MarshallingInfo<String> ACCEPTLANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceptLanguage").build();
    private static final MarshallingInfo<String> PORTFOLIOID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PortfolioId").build();
    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountId").build();
    private static final MarshallingInfo<StructuredPojo> ORGANIZATIONNODE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationNode").build();
    private static final MarshallingInfo<Boolean> SHARETAGOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShareTagOptions").build();

    private static final UpdatePortfolioShareRequestMarshaller instance = new UpdatePortfolioShareRequestMarshaller();

    public static UpdatePortfolioShareRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdatePortfolioShareRequest updatePortfolioShareRequest, ProtocolMarshaller protocolMarshaller) {

        if (updatePortfolioShareRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updatePortfolioShareRequest.getAcceptLanguage(), ACCEPTLANGUAGE_BINDING);
            protocolMarshaller.marshall(updatePortfolioShareRequest.getPortfolioId(), PORTFOLIOID_BINDING);
            protocolMarshaller.marshall(updatePortfolioShareRequest.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(updatePortfolioShareRequest.getOrganizationNode(), ORGANIZATIONNODE_BINDING);
            protocolMarshaller.marshall(updatePortfolioShareRequest.getShareTagOptions(), SHARETAGOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
