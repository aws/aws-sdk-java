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
package com.amazonaws.services.lightsail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateRelationalDatabaseRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateRelationalDatabaseRequestMarshaller {

    private static final MarshallingInfo<String> RELATIONALDATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("relationalDatabaseName").build();
    private static final MarshallingInfo<String> MASTERUSERPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("masterUserPassword").build();
    private static final MarshallingInfo<Boolean> ROTATEMASTERUSERPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rotateMasterUserPassword").build();
    private static final MarshallingInfo<String> PREFERREDBACKUPWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("preferredBackupWindow").build();
    private static final MarshallingInfo<String> PREFERREDMAINTENANCEWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("preferredMaintenanceWindow").build();
    private static final MarshallingInfo<Boolean> ENABLEBACKUPRETENTION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableBackupRetention").build();
    private static final MarshallingInfo<Boolean> DISABLEBACKUPRETENTION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("disableBackupRetention").build();
    private static final MarshallingInfo<Boolean> PUBLICLYACCESSIBLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publiclyAccessible").build();
    private static final MarshallingInfo<Boolean> APPLYIMMEDIATELY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applyImmediately").build();

    private static final UpdateRelationalDatabaseRequestMarshaller instance = new UpdateRelationalDatabaseRequestMarshaller();

    public static UpdateRelationalDatabaseRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateRelationalDatabaseRequest updateRelationalDatabaseRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateRelationalDatabaseRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateRelationalDatabaseRequest.getRelationalDatabaseName(), RELATIONALDATABASENAME_BINDING);
            protocolMarshaller.marshall(updateRelationalDatabaseRequest.getMasterUserPassword(), MASTERUSERPASSWORD_BINDING);
            protocolMarshaller.marshall(updateRelationalDatabaseRequest.getRotateMasterUserPassword(), ROTATEMASTERUSERPASSWORD_BINDING);
            protocolMarshaller.marshall(updateRelationalDatabaseRequest.getPreferredBackupWindow(), PREFERREDBACKUPWINDOW_BINDING);
            protocolMarshaller.marshall(updateRelationalDatabaseRequest.getPreferredMaintenanceWindow(), PREFERREDMAINTENANCEWINDOW_BINDING);
            protocolMarshaller.marshall(updateRelationalDatabaseRequest.getEnableBackupRetention(), ENABLEBACKUPRETENTION_BINDING);
            protocolMarshaller.marshall(updateRelationalDatabaseRequest.getDisableBackupRetention(), DISABLEBACKUPRETENTION_BINDING);
            protocolMarshaller.marshall(updateRelationalDatabaseRequest.getPubliclyAccessible(), PUBLICLYACCESSIBLE_BINDING);
            protocolMarshaller.marshall(updateRelationalDatabaseRequest.getApplyImmediately(), APPLYIMMEDIATELY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
