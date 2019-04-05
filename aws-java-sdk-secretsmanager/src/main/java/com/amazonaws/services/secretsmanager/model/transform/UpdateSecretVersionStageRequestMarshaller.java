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
package com.amazonaws.services.secretsmanager.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.secretsmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateSecretVersionStageRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateSecretVersionStageRequestMarshaller {

    private static final MarshallingInfo<String> SECRETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SecretId").build();
    private static final MarshallingInfo<String> VERSIONSTAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VersionStage").build();
    private static final MarshallingInfo<String> REMOVEFROMVERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RemoveFromVersionId").build();
    private static final MarshallingInfo<String> MOVETOVERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MoveToVersionId").build();

    private static final UpdateSecretVersionStageRequestMarshaller instance = new UpdateSecretVersionStageRequestMarshaller();

    public static UpdateSecretVersionStageRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateSecretVersionStageRequest updateSecretVersionStageRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateSecretVersionStageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateSecretVersionStageRequest.getSecretId(), SECRETID_BINDING);
            protocolMarshaller.marshall(updateSecretVersionStageRequest.getVersionStage(), VERSIONSTAGE_BINDING);
            protocolMarshaller.marshall(updateSecretVersionStageRequest.getRemoveFromVersionId(), REMOVEFROMVERSIONID_BINDING);
            protocolMarshaller.marshall(updateSecretVersionStageRequest.getMoveToVersionId(), MOVETOVERSIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
