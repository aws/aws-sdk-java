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
package com.amazonaws.services.appsync.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appsync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssociateSourceGraphqlApiRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssociateSourceGraphqlApiRequestMarshaller {

    private static final MarshallingInfo<String> MERGEDAPIIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("mergedApiIdentifier").build();
    private static final MarshallingInfo<String> SOURCEAPIIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceApiIdentifier").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<StructuredPojo> SOURCEAPIASSOCIATIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceApiAssociationConfig").build();

    private static final AssociateSourceGraphqlApiRequestMarshaller instance = new AssociateSourceGraphqlApiRequestMarshaller();

    public static AssociateSourceGraphqlApiRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssociateSourceGraphqlApiRequest associateSourceGraphqlApiRequest, ProtocolMarshaller protocolMarshaller) {

        if (associateSourceGraphqlApiRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(associateSourceGraphqlApiRequest.getMergedApiIdentifier(), MERGEDAPIIDENTIFIER_BINDING);
            protocolMarshaller.marshall(associateSourceGraphqlApiRequest.getSourceApiIdentifier(), SOURCEAPIIDENTIFIER_BINDING);
            protocolMarshaller.marshall(associateSourceGraphqlApiRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(associateSourceGraphqlApiRequest.getSourceApiAssociationConfig(), SOURCEAPIASSOCIATIONCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
