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
package com.amazonaws.services.datasync.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datasync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateLocationFsxOpenZfsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateLocationFsxOpenZfsRequestMarshaller {

    private static final MarshallingInfo<String> FSXFILESYSTEMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FsxFilesystemArn").build();
    private static final MarshallingInfo<StructuredPojo> PROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Protocol").build();
    private static final MarshallingInfo<List> SECURITYGROUPARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityGroupArns").build();
    private static final MarshallingInfo<String> SUBDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Subdirectory").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateLocationFsxOpenZfsRequestMarshaller instance = new CreateLocationFsxOpenZfsRequestMarshaller();

    public static CreateLocationFsxOpenZfsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateLocationFsxOpenZfsRequest createLocationFsxOpenZfsRequest, ProtocolMarshaller protocolMarshaller) {

        if (createLocationFsxOpenZfsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createLocationFsxOpenZfsRequest.getFsxFilesystemArn(), FSXFILESYSTEMARN_BINDING);
            protocolMarshaller.marshall(createLocationFsxOpenZfsRequest.getProtocol(), PROTOCOL_BINDING);
            protocolMarshaller.marshall(createLocationFsxOpenZfsRequest.getSecurityGroupArns(), SECURITYGROUPARNS_BINDING);
            protocolMarshaller.marshall(createLocationFsxOpenZfsRequest.getSubdirectory(), SUBDIRECTORY_BINDING);
            protocolMarshaller.marshall(createLocationFsxOpenZfsRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
