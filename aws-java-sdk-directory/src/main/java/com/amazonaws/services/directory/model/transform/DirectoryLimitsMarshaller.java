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
package com.amazonaws.services.directory.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DirectoryLimitsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DirectoryLimitsMarshaller {

    private static final MarshallingInfo<Integer> CLOUDONLYDIRECTORIESLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudOnlyDirectoriesLimit").build();
    private static final MarshallingInfo<Integer> CLOUDONLYDIRECTORIESCURRENTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudOnlyDirectoriesCurrentCount").build();
    private static final MarshallingInfo<Boolean> CLOUDONLYDIRECTORIESLIMITREACHED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudOnlyDirectoriesLimitReached").build();
    private static final MarshallingInfo<Integer> CLOUDONLYMICROSOFTADLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudOnlyMicrosoftADLimit").build();
    private static final MarshallingInfo<Integer> CLOUDONLYMICROSOFTADCURRENTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudOnlyMicrosoftADCurrentCount").build();
    private static final MarshallingInfo<Boolean> CLOUDONLYMICROSOFTADLIMITREACHED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudOnlyMicrosoftADLimitReached").build();
    private static final MarshallingInfo<Integer> CONNECTEDDIRECTORIESLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectedDirectoriesLimit").build();
    private static final MarshallingInfo<Integer> CONNECTEDDIRECTORIESCURRENTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectedDirectoriesCurrentCount").build();
    private static final MarshallingInfo<Boolean> CONNECTEDDIRECTORIESLIMITREACHED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectedDirectoriesLimitReached").build();

    private static final DirectoryLimitsMarshaller instance = new DirectoryLimitsMarshaller();

    public static DirectoryLimitsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DirectoryLimits directoryLimits, ProtocolMarshaller protocolMarshaller) {

        if (directoryLimits == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(directoryLimits.getCloudOnlyDirectoriesLimit(), CLOUDONLYDIRECTORIESLIMIT_BINDING);
            protocolMarshaller.marshall(directoryLimits.getCloudOnlyDirectoriesCurrentCount(), CLOUDONLYDIRECTORIESCURRENTCOUNT_BINDING);
            protocolMarshaller.marshall(directoryLimits.getCloudOnlyDirectoriesLimitReached(), CLOUDONLYDIRECTORIESLIMITREACHED_BINDING);
            protocolMarshaller.marshall(directoryLimits.getCloudOnlyMicrosoftADLimit(), CLOUDONLYMICROSOFTADLIMIT_BINDING);
            protocolMarshaller.marshall(directoryLimits.getCloudOnlyMicrosoftADCurrentCount(), CLOUDONLYMICROSOFTADCURRENTCOUNT_BINDING);
            protocolMarshaller.marshall(directoryLimits.getCloudOnlyMicrosoftADLimitReached(), CLOUDONLYMICROSOFTADLIMITREACHED_BINDING);
            protocolMarshaller.marshall(directoryLimits.getConnectedDirectoriesLimit(), CONNECTEDDIRECTORIESLIMIT_BINDING);
            protocolMarshaller.marshall(directoryLimits.getConnectedDirectoriesCurrentCount(), CONNECTEDDIRECTORIESCURRENTCOUNT_BINDING);
            protocolMarshaller.marshall(directoryLimits.getConnectedDirectoriesLimitReached(), CONNECTEDDIRECTORIESLIMITREACHED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
