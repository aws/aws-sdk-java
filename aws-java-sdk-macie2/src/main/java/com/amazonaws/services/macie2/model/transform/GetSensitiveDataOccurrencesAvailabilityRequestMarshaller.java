/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetSensitiveDataOccurrencesAvailabilityRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetSensitiveDataOccurrencesAvailabilityRequestMarshaller {

    private static final MarshallingInfo<String> FINDINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("findingId").build();

    private static final GetSensitiveDataOccurrencesAvailabilityRequestMarshaller instance = new GetSensitiveDataOccurrencesAvailabilityRequestMarshaller();

    public static GetSensitiveDataOccurrencesAvailabilityRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetSensitiveDataOccurrencesAvailabilityRequest getSensitiveDataOccurrencesAvailabilityRequest, ProtocolMarshaller protocolMarshaller) {

        if (getSensitiveDataOccurrencesAvailabilityRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getSensitiveDataOccurrencesAvailabilityRequest.getFindingId(), FINDINGID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
