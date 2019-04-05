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
package com.amazonaws.services.clouddirectory.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.clouddirectory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpgradePublishedSchemaRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpgradePublishedSchemaRequestMarshaller {

    private static final MarshallingInfo<String> DEVELOPMENTSCHEMAARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DevelopmentSchemaArn").build();
    private static final MarshallingInfo<String> PUBLISHEDSCHEMAARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PublishedSchemaArn").build();
    private static final MarshallingInfo<String> MINORVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinorVersion").build();
    private static final MarshallingInfo<Boolean> DRYRUN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DryRun").build();

    private static final UpgradePublishedSchemaRequestMarshaller instance = new UpgradePublishedSchemaRequestMarshaller();

    public static UpgradePublishedSchemaRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpgradePublishedSchemaRequest upgradePublishedSchemaRequest, ProtocolMarshaller protocolMarshaller) {

        if (upgradePublishedSchemaRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(upgradePublishedSchemaRequest.getDevelopmentSchemaArn(), DEVELOPMENTSCHEMAARN_BINDING);
            protocolMarshaller.marshall(upgradePublishedSchemaRequest.getPublishedSchemaArn(), PUBLISHEDSCHEMAARN_BINDING);
            protocolMarshaller.marshall(upgradePublishedSchemaRequest.getMinorVersion(), MINORVERSION_BINDING);
            protocolMarshaller.marshall(upgradePublishedSchemaRequest.getDryRun(), DRYRUN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
