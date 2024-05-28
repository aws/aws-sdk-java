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
package com.amazonaws.services.datasync.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datasync.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AddStorageSystemRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AddStorageSystemRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> SERVERCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerConfiguration").build();
    private static final MarshallingInfo<String> SYSTEMTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SystemType").build();
    private static final MarshallingInfo<List> AGENTARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AgentArns").build();
    private static final MarshallingInfo<String> CLOUDWATCHLOGGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLogGroupArn").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<StructuredPojo> CREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Credentials").build();

    private static final AddStorageSystemRequestMarshaller instance = new AddStorageSystemRequestMarshaller();

    public static AddStorageSystemRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AddStorageSystemRequest addStorageSystemRequest, ProtocolMarshaller protocolMarshaller) {

        if (addStorageSystemRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(addStorageSystemRequest.getServerConfiguration(), SERVERCONFIGURATION_BINDING);
            protocolMarshaller.marshall(addStorageSystemRequest.getSystemType(), SYSTEMTYPE_BINDING);
            protocolMarshaller.marshall(addStorageSystemRequest.getAgentArns(), AGENTARNS_BINDING);
            protocolMarshaller.marshall(addStorageSystemRequest.getCloudWatchLogGroupArn(), CLOUDWATCHLOGGROUPARN_BINDING);
            protocolMarshaller.marshall(addStorageSystemRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(addStorageSystemRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(addStorageSystemRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(addStorageSystemRequest.getCredentials(), CREDENTIALS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
