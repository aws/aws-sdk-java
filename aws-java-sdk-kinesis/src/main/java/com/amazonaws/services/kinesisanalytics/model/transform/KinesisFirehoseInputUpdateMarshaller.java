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
package com.amazonaws.services.kinesisanalytics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalytics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KinesisFirehoseInputUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KinesisFirehoseInputUpdateMarshaller {

    private static final MarshallingInfo<String> RESOURCEARNUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceARNUpdate").build();
    private static final MarshallingInfo<String> ROLEARNUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RoleARNUpdate").build();

    private static final KinesisFirehoseInputUpdateMarshaller instance = new KinesisFirehoseInputUpdateMarshaller();

    public static KinesisFirehoseInputUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KinesisFirehoseInputUpdate kinesisFirehoseInputUpdate, ProtocolMarshaller protocolMarshaller) {

        if (kinesisFirehoseInputUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(kinesisFirehoseInputUpdate.getResourceARNUpdate(), RESOURCEARNUPDATE_BINDING);
            protocolMarshaller.marshall(kinesisFirehoseInputUpdate.getRoleARNUpdate(), ROLEARNUPDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
