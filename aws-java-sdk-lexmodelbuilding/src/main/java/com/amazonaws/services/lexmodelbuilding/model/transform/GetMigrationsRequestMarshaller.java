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
package com.amazonaws.services.lexmodelbuilding.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelbuilding.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetMigrationsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetMigrationsRequestMarshaller {

    private static final MarshallingInfo<String> SORTBYATTRIBUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("sortByAttribute").build();
    private static final MarshallingInfo<String> SORTBYORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("sortByOrder").build();
    private static final MarshallingInfo<String> V1BOTNAMECONTAINS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("v1BotNameContains").build();
    private static final MarshallingInfo<String> MIGRATIONSTATUSEQUALS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("migrationStatusEquals").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();

    private static final GetMigrationsRequestMarshaller instance = new GetMigrationsRequestMarshaller();

    public static GetMigrationsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetMigrationsRequest getMigrationsRequest, ProtocolMarshaller protocolMarshaller) {

        if (getMigrationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getMigrationsRequest.getSortByAttribute(), SORTBYATTRIBUTE_BINDING);
            protocolMarshaller.marshall(getMigrationsRequest.getSortByOrder(), SORTBYORDER_BINDING);
            protocolMarshaller.marshall(getMigrationsRequest.getV1BotNameContains(), V1BOTNAMECONTAINS_BINDING);
            protocolMarshaller.marshall(getMigrationsRequest.getMigrationStatusEquals(), MIGRATIONSTATUSEQUALS_BINDING);
            protocolMarshaller.marshall(getMigrationsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(getMigrationsRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
