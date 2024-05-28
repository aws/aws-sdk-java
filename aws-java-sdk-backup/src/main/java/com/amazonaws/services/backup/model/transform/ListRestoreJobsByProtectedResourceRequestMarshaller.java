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
package com.amazonaws.services.backup.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backup.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListRestoreJobsByProtectedResourceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListRestoreJobsByProtectedResourceRequestMarshaller {

    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("resourceArn").build();
    private static final MarshallingInfo<String> BYSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("status").build();
    private static final MarshallingInfo<java.util.Date> BYRECOVERYPOINTCREATIONDATEAFTER_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("recoveryPointCreationDateAfter").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> BYRECOVERYPOINTCREATIONDATEBEFORE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("recoveryPointCreationDateBefore").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();

    private static final ListRestoreJobsByProtectedResourceRequestMarshaller instance = new ListRestoreJobsByProtectedResourceRequestMarshaller();

    public static ListRestoreJobsByProtectedResourceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListRestoreJobsByProtectedResourceRequest listRestoreJobsByProtectedResourceRequest, ProtocolMarshaller protocolMarshaller) {

        if (listRestoreJobsByProtectedResourceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listRestoreJobsByProtectedResourceRequest.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(listRestoreJobsByProtectedResourceRequest.getByStatus(), BYSTATUS_BINDING);
            protocolMarshaller.marshall(listRestoreJobsByProtectedResourceRequest.getByRecoveryPointCreationDateAfter(),
                    BYRECOVERYPOINTCREATIONDATEAFTER_BINDING);
            protocolMarshaller.marshall(listRestoreJobsByProtectedResourceRequest.getByRecoveryPointCreationDateBefore(),
                    BYRECOVERYPOINTCREATIONDATEBEFORE_BINDING);
            protocolMarshaller.marshall(listRestoreJobsByProtectedResourceRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listRestoreJobsByProtectedResourceRequest.getMaxResults(), MAXRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
