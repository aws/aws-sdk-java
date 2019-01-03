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
package com.amazonaws.services.appstream.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appstream.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateDirectoryConfigRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateDirectoryConfigRequestMarshaller {

    private static final MarshallingInfo<String> DIRECTORYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectoryName").build();
    private static final MarshallingInfo<List> ORGANIZATIONALUNITDISTINGUISHEDNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationalUnitDistinguishedNames").build();
    private static final MarshallingInfo<StructuredPojo> SERVICEACCOUNTCREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceAccountCredentials").build();

    private static final UpdateDirectoryConfigRequestMarshaller instance = new UpdateDirectoryConfigRequestMarshaller();

    public static UpdateDirectoryConfigRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateDirectoryConfigRequest updateDirectoryConfigRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateDirectoryConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateDirectoryConfigRequest.getDirectoryName(), DIRECTORYNAME_BINDING);
            protocolMarshaller.marshall(updateDirectoryConfigRequest.getOrganizationalUnitDistinguishedNames(), ORGANIZATIONALUNITDISTINGUISHEDNAMES_BINDING);
            protocolMarshaller.marshall(updateDirectoryConfigRequest.getServiceAccountCredentials(), SERVICEACCOUNTCREDENTIALS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
