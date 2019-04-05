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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HlsWebdavSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HlsWebdavSettingsMarshaller {

    private static final MarshallingInfo<Integer> CONNECTIONRETRYINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectionRetryInterval").build();
    private static final MarshallingInfo<Integer> FILECACHEDURATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filecacheDuration").build();
    private static final MarshallingInfo<String> HTTPTRANSFERMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("httpTransferMode").build();
    private static final MarshallingInfo<Integer> NUMRETRIES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numRetries").build();
    private static final MarshallingInfo<Integer> RESTARTDELAY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("restartDelay").build();

    private static final HlsWebdavSettingsMarshaller instance = new HlsWebdavSettingsMarshaller();

    public static HlsWebdavSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HlsWebdavSettings hlsWebdavSettings, ProtocolMarshaller protocolMarshaller) {

        if (hlsWebdavSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hlsWebdavSettings.getConnectionRetryInterval(), CONNECTIONRETRYINTERVAL_BINDING);
            protocolMarshaller.marshall(hlsWebdavSettings.getFilecacheDuration(), FILECACHEDURATION_BINDING);
            protocolMarshaller.marshall(hlsWebdavSettings.getHttpTransferMode(), HTTPTRANSFERMODE_BINDING);
            protocolMarshaller.marshall(hlsWebdavSettings.getNumRetries(), NUMRETRIES_BINDING);
            protocolMarshaller.marshall(hlsWebdavSettings.getRestartDelay(), RESTARTDELAY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
