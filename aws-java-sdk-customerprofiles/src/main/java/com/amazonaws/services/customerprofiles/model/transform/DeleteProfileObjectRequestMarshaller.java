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
package com.amazonaws.services.customerprofiles.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.customerprofiles.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeleteProfileObjectRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteProfileObjectRequestMarshaller {

    private static final MarshallingInfo<String> PROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProfileId").build();
    private static final MarshallingInfo<String> PROFILEOBJECTUNIQUEKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProfileObjectUniqueKey").build();
    private static final MarshallingInfo<String> OBJECTTYPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObjectTypeName").build();
    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("DomainName").build();

    private static final DeleteProfileObjectRequestMarshaller instance = new DeleteProfileObjectRequestMarshaller();

    public static DeleteProfileObjectRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteProfileObjectRequest deleteProfileObjectRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteProfileObjectRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deleteProfileObjectRequest.getProfileId(), PROFILEID_BINDING);
            protocolMarshaller.marshall(deleteProfileObjectRequest.getProfileObjectUniqueKey(), PROFILEOBJECTUNIQUEKEY_BINDING);
            protocolMarshaller.marshall(deleteProfileObjectRequest.getObjectTypeName(), OBJECTTYPENAME_BINDING);
            protocolMarshaller.marshall(deleteProfileObjectRequest.getDomainName(), DOMAINNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
