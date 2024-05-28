/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eks.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.eks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ClientStatMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ClientStatMarshaller {

    private static final MarshallingInfo<String> USERAGENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("userAgent").build();
    private static final MarshallingInfo<Integer> NUMBEROFREQUESTSLAST30DAYS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfRequestsLast30Days").build();
    private static final MarshallingInfo<java.util.Date> LASTREQUESTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastRequestTime").timestampFormat("unixTimestamp").build();

    private static final ClientStatMarshaller instance = new ClientStatMarshaller();

    public static ClientStatMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ClientStat clientStat, ProtocolMarshaller protocolMarshaller) {

        if (clientStat == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(clientStat.getUserAgent(), USERAGENT_BINDING);
            protocolMarshaller.marshall(clientStat.getNumberOfRequestsLast30Days(), NUMBEROFREQUESTSLAST30DAYS_BINDING);
            protocolMarshaller.marshall(clientStat.getLastRequestTime(), LASTREQUESTTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
