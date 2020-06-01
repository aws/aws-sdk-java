/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fsx.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fsx.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AdministrativeActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AdministrativeActionMarshaller {

    private static final MarshallingInfo<String> ADMINISTRATIVEACTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdministrativeActionType").build();
    private static final MarshallingInfo<Integer> PROGRESSPERCENT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProgressPercent").build();
    private static final MarshallingInfo<java.util.Date> REQUESTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<StructuredPojo> TARGETFILESYSTEMVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetFileSystemValues").build();
    private static final MarshallingInfo<StructuredPojo> FAILUREDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureDetails").build();

    private static final AdministrativeActionMarshaller instance = new AdministrativeActionMarshaller();

    public static AdministrativeActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AdministrativeAction administrativeAction, ProtocolMarshaller protocolMarshaller) {

        if (administrativeAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(administrativeAction.getAdministrativeActionType(), ADMINISTRATIVEACTIONTYPE_BINDING);
            protocolMarshaller.marshall(administrativeAction.getProgressPercent(), PROGRESSPERCENT_BINDING);
            protocolMarshaller.marshall(administrativeAction.getRequestTime(), REQUESTTIME_BINDING);
            protocolMarshaller.marshall(administrativeAction.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(administrativeAction.getTargetFileSystemValues(), TARGETFILESYSTEMVALUES_BINDING);
            protocolMarshaller.marshall(administrativeAction.getFailureDetails(), FAILUREDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
