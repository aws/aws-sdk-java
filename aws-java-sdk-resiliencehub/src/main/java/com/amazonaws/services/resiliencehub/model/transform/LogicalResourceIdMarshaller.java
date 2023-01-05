/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.resiliencehub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.resiliencehub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LogicalResourceIdMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LogicalResourceIdMarshaller {

    private static final MarshallingInfo<String> IDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("identifier").build();
    private static final MarshallingInfo<String> LOGICALSTACKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logicalStackName").build();
    private static final MarshallingInfo<String> RESOURCEGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceGroupName").build();
    private static final MarshallingInfo<String> TERRAFORMSOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("terraformSourceName").build();

    private static final LogicalResourceIdMarshaller instance = new LogicalResourceIdMarshaller();

    public static LogicalResourceIdMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LogicalResourceId logicalResourceId, ProtocolMarshaller protocolMarshaller) {

        if (logicalResourceId == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(logicalResourceId.getIdentifier(), IDENTIFIER_BINDING);
            protocolMarshaller.marshall(logicalResourceId.getLogicalStackName(), LOGICALSTACKNAME_BINDING);
            protocolMarshaller.marshall(logicalResourceId.getResourceGroupName(), RESOURCEGROUPNAME_BINDING);
            protocolMarshaller.marshall(logicalResourceId.getTerraformSourceName(), TERRAFORMSOURCENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
