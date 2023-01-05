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
package com.amazonaws.services.route53recoverycontrolconfig.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.route53recoverycontrolconfig.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListAssociatedRoute53HealthChecksRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListAssociatedRoute53HealthChecksRequestMarshaller {

    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("NextToken").build();
    private static final MarshallingInfo<String> ROUTINGCONTROLARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("RoutingControlArn").build();

    private static final ListAssociatedRoute53HealthChecksRequestMarshaller instance = new ListAssociatedRoute53HealthChecksRequestMarshaller();

    public static ListAssociatedRoute53HealthChecksRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListAssociatedRoute53HealthChecksRequest listAssociatedRoute53HealthChecksRequest, ProtocolMarshaller protocolMarshaller) {

        if (listAssociatedRoute53HealthChecksRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listAssociatedRoute53HealthChecksRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listAssociatedRoute53HealthChecksRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listAssociatedRoute53HealthChecksRequest.getRoutingControlArn(), ROUTINGCONTROLARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
