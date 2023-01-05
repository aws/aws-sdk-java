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
package com.amazonaws.services.route53recoveryreadiness.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.route53recoveryreadiness.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetReadinessCheckResourceStatusRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetReadinessCheckResourceStatusRequestMarshaller {

    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();
    private static final MarshallingInfo<String> READINESSCHECKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("readinessCheckName").build();
    private static final MarshallingInfo<String> RESOURCEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("resourceIdentifier").build();

    private static final GetReadinessCheckResourceStatusRequestMarshaller instance = new GetReadinessCheckResourceStatusRequestMarshaller();

    public static GetReadinessCheckResourceStatusRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetReadinessCheckResourceStatusRequest getReadinessCheckResourceStatusRequest, ProtocolMarshaller protocolMarshaller) {

        if (getReadinessCheckResourceStatusRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getReadinessCheckResourceStatusRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(getReadinessCheckResourceStatusRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(getReadinessCheckResourceStatusRequest.getReadinessCheckName(), READINESSCHECKNAME_BINDING);
            protocolMarshaller.marshall(getReadinessCheckResourceStatusRequest.getResourceIdentifier(), RESOURCEIDENTIFIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
