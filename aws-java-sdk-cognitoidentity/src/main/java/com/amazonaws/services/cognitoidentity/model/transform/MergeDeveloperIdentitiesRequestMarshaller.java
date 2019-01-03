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
package com.amazonaws.services.cognitoidentity.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidentity.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MergeDeveloperIdentitiesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MergeDeveloperIdentitiesRequestMarshaller {

    private static final MarshallingInfo<String> SOURCEUSERIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceUserIdentifier").build();
    private static final MarshallingInfo<String> DESTINATIONUSERIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationUserIdentifier").build();
    private static final MarshallingInfo<String> DEVELOPERPROVIDERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeveloperProviderName").build();
    private static final MarshallingInfo<String> IDENTITYPOOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityPoolId").build();

    private static final MergeDeveloperIdentitiesRequestMarshaller instance = new MergeDeveloperIdentitiesRequestMarshaller();

    public static MergeDeveloperIdentitiesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MergeDeveloperIdentitiesRequest mergeDeveloperIdentitiesRequest, ProtocolMarshaller protocolMarshaller) {

        if (mergeDeveloperIdentitiesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mergeDeveloperIdentitiesRequest.getSourceUserIdentifier(), SOURCEUSERIDENTIFIER_BINDING);
            protocolMarshaller.marshall(mergeDeveloperIdentitiesRequest.getDestinationUserIdentifier(), DESTINATIONUSERIDENTIFIER_BINDING);
            protocolMarshaller.marshall(mergeDeveloperIdentitiesRequest.getDeveloperProviderName(), DEVELOPERPROVIDERNAME_BINDING);
            protocolMarshaller.marshall(mergeDeveloperIdentitiesRequest.getIdentityPoolId(), IDENTITYPOOLID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
