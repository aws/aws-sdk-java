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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalytics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ApplicationUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ApplicationUpdateMarshaller {

    private static final MarshallingInfo<List> INPUTUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InputUpdates").build();
    private static final MarshallingInfo<String> APPLICATIONCODEUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationCodeUpdate").build();
    private static final MarshallingInfo<List> OUTPUTUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutputUpdates").build();
    private static final MarshallingInfo<List> REFERENCEDATASOURCEUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReferenceDataSourceUpdates").build();
    private static final MarshallingInfo<List> CLOUDWATCHLOGGINGOPTIONUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLoggingOptionUpdates").build();

    private static final ApplicationUpdateMarshaller instance = new ApplicationUpdateMarshaller();

    public static ApplicationUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ApplicationUpdate applicationUpdate, ProtocolMarshaller protocolMarshaller) {

        if (applicationUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(applicationUpdate.getInputUpdates(), INPUTUPDATES_BINDING);
            protocolMarshaller.marshall(applicationUpdate.getApplicationCodeUpdate(), APPLICATIONCODEUPDATE_BINDING);
            protocolMarshaller.marshall(applicationUpdate.getOutputUpdates(), OUTPUTUPDATES_BINDING);
            protocolMarshaller.marshall(applicationUpdate.getReferenceDataSourceUpdates(), REFERENCEDATASOURCEUPDATES_BINDING);
            protocolMarshaller.marshall(applicationUpdate.getCloudWatchLoggingOptionUpdates(), CLOUDWATCHLOGGINGOPTIONUPDATES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
