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
package com.amazonaws.services.amplifyuibuilder.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplifyuibuilder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GraphQLRenderConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GraphQLRenderConfigMarshaller {

    private static final MarshallingInfo<String> TYPESFILEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("typesFilePath").build();
    private static final MarshallingInfo<String> QUERIESFILEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queriesFilePath").build();
    private static final MarshallingInfo<String> MUTATIONSFILEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mutationsFilePath").build();
    private static final MarshallingInfo<String> SUBSCRIPTIONSFILEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subscriptionsFilePath").build();
    private static final MarshallingInfo<String> FRAGMENTSFILEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fragmentsFilePath").build();

    private static final GraphQLRenderConfigMarshaller instance = new GraphQLRenderConfigMarshaller();

    public static GraphQLRenderConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GraphQLRenderConfig graphQLRenderConfig, ProtocolMarshaller protocolMarshaller) {

        if (graphQLRenderConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(graphQLRenderConfig.getTypesFilePath(), TYPESFILEPATH_BINDING);
            protocolMarshaller.marshall(graphQLRenderConfig.getQueriesFilePath(), QUERIESFILEPATH_BINDING);
            protocolMarshaller.marshall(graphQLRenderConfig.getMutationsFilePath(), MUTATIONSFILEPATH_BINDING);
            protocolMarshaller.marshall(graphQLRenderConfig.getSubscriptionsFilePath(), SUBSCRIPTIONSFILEPATH_BINDING);
            protocolMarshaller.marshall(graphQLRenderConfig.getFragmentsFilePath(), FRAGMENTSFILEPATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
