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
package com.amazonaws.services.athena.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.athena.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * QueryResultsS3AccessGrantsConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class QueryResultsS3AccessGrantsConfigurationMarshaller {

    private static final MarshallingInfo<Boolean> ENABLES3ACCESSGRANTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableS3AccessGrants").build();
    private static final MarshallingInfo<Boolean> CREATEUSERLEVELPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateUserLevelPrefix").build();
    private static final MarshallingInfo<String> AUTHENTICATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthenticationType").build();

    private static final QueryResultsS3AccessGrantsConfigurationMarshaller instance = new QueryResultsS3AccessGrantsConfigurationMarshaller();

    public static QueryResultsS3AccessGrantsConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(QueryResultsS3AccessGrantsConfiguration queryResultsS3AccessGrantsConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (queryResultsS3AccessGrantsConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(queryResultsS3AccessGrantsConfiguration.getEnableS3AccessGrants(), ENABLES3ACCESSGRANTS_BINDING);
            protocolMarshaller.marshall(queryResultsS3AccessGrantsConfiguration.getCreateUserLevelPrefix(), CREATEUSERLEVELPREFIX_BINDING);
            protocolMarshaller.marshall(queryResultsS3AccessGrantsConfiguration.getAuthenticationType(), AUTHENTICATIONTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
