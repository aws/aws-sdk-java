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
package com.amazonaws.services.dynamodbv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContinuousBackupsDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContinuousBackupsDescriptionMarshaller {

    private static final MarshallingInfo<String> CONTINUOUSBACKUPSSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContinuousBackupsStatus").build();
    private static final MarshallingInfo<StructuredPojo> POINTINTIMERECOVERYDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PointInTimeRecoveryDescription").build();

    private static final ContinuousBackupsDescriptionMarshaller instance = new ContinuousBackupsDescriptionMarshaller();

    public static ContinuousBackupsDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContinuousBackupsDescription continuousBackupsDescription, ProtocolMarshaller protocolMarshaller) {

        if (continuousBackupsDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(continuousBackupsDescription.getContinuousBackupsStatus(), CONTINUOUSBACKUPSSTATUS_BINDING);
            protocolMarshaller.marshall(continuousBackupsDescription.getPointInTimeRecoveryDescription(), POINTINTIMERECOVERYDESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
