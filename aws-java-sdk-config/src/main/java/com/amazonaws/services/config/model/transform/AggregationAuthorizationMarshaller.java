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
package com.amazonaws.services.config.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AggregationAuthorizationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AggregationAuthorizationMarshaller {

    private static final MarshallingInfo<String> AGGREGATIONAUTHORIZATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AggregationAuthorizationArn").build();
    private static final MarshallingInfo<String> AUTHORIZEDACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthorizedAccountId").build();
    private static final MarshallingInfo<String> AUTHORIZEDAWSREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthorizedAwsRegion").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();

    private static final AggregationAuthorizationMarshaller instance = new AggregationAuthorizationMarshaller();

    public static AggregationAuthorizationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AggregationAuthorization aggregationAuthorization, ProtocolMarshaller protocolMarshaller) {

        if (aggregationAuthorization == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(aggregationAuthorization.getAggregationAuthorizationArn(), AGGREGATIONAUTHORIZATIONARN_BINDING);
            protocolMarshaller.marshall(aggregationAuthorization.getAuthorizedAccountId(), AUTHORIZEDACCOUNTID_BINDING);
            protocolMarshaller.marshall(aggregationAuthorization.getAuthorizedAwsRegion(), AUTHORIZEDAWSREGION_BINDING);
            protocolMarshaller.marshall(aggregationAuthorization.getCreationTime(), CREATIONTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
