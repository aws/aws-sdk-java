/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreateLocationFsxWindowsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateLocationFsxWindowsRequestMarshaller {

    private static final MarshallingInfo<String> SUBDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Subdirectory").build();
    private static final MarshallingInfo<String> FSXFILESYSTEMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FsxFilesystemArn").build();
    private static final MarshallingInfo<List> SECURITYGROUPARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityGroupArns").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> USER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("User").build();
    private static final MarshallingInfo<String> DOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Domain").build();
    private static final MarshallingInfo<String> PASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Password").build();

    private static final CreateLocationFsxWindowsRequestMarshaller instance = new CreateLocationFsxWindowsRequestMarshaller();

    public static CreateLocationFsxWindowsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateLocationFsxWindowsRequest createLocationFsxWindowsRequest, ProtocolMarshaller protocolMarshaller) {

        if (createLocationFsxWindowsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createLocationFsxWindowsRequest.getSubdirectory(), SUBDIRECTORY_BINDING);
            protocolMarshaller.marshall(createLocationFsxWindowsRequest.getFsxFilesystemArn(), FSXFILESYSTEMARN_BINDING);
            protocolMarshaller.marshall(createLocationFsxWindowsRequest.getSecurityGroupArns(), SECURITYGROUPARNS_BINDING);
            protocolMarshaller.marshall(createLocationFsxWindowsRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createLocationFsxWindowsRequest.getUser(), USER_BINDING);
            protocolMarshaller.marshall(createLocationFsxWindowsRequest.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(createLocationFsxWindowsRequest.getPassword(), PASSWORD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
