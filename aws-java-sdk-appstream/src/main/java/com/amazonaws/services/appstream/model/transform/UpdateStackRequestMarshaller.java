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
 * UpdateStackRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateStackRequestMarshaller {

    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<List> STORAGECONNECTORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageConnectors").build();
    private static final MarshallingInfo<Boolean> DELETESTORAGECONNECTORS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeleteStorageConnectors").build();
    private static final MarshallingInfo<String> REDIRECTURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RedirectURL").build();
    private static final MarshallingInfo<String> FEEDBACKURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FeedbackURL").build();
    private static final MarshallingInfo<List> ATTRIBUTESTODELETE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttributesToDelete").build();
    private static final MarshallingInfo<List> USERSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserSettings").build();
    private static final MarshallingInfo<StructuredPojo> APPLICATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationSettings").build();

    private static final UpdateStackRequestMarshaller instance = new UpdateStackRequestMarshaller();

    public static UpdateStackRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateStackRequest updateStackRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateStackRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateStackRequest.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(updateStackRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateStackRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateStackRequest.getStorageConnectors(), STORAGECONNECTORS_BINDING);
            protocolMarshaller.marshall(updateStackRequest.getDeleteStorageConnectors(), DELETESTORAGECONNECTORS_BINDING);
            protocolMarshaller.marshall(updateStackRequest.getRedirectURL(), REDIRECTURL_BINDING);
            protocolMarshaller.marshall(updateStackRequest.getFeedbackURL(), FEEDBACKURL_BINDING);
            protocolMarshaller.marshall(updateStackRequest.getAttributesToDelete(), ATTRIBUTESTODELETE_BINDING);
            protocolMarshaller.marshall(updateStackRequest.getUserSettings(), USERSETTINGS_BINDING);
            protocolMarshaller.marshall(updateStackRequest.getApplicationSettings(), APPLICATIONSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
