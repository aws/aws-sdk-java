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
package com.amazonaws.services.datazone.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datazone.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListNotificationsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListNotificationsRequestMarshaller {

    private static final MarshallingInfo<java.util.Date> AFTERTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("afterTimestamp").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> BEFORETIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("beforeTimestamp").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> DOMAINIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("domainIdentifier").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();
    private static final MarshallingInfo<List> SUBJECTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("subjects").build();
    private static final MarshallingInfo<String> TASKSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("taskStatus").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("type").build();

    private static final ListNotificationsRequestMarshaller instance = new ListNotificationsRequestMarshaller();

    public static ListNotificationsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListNotificationsRequest listNotificationsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listNotificationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listNotificationsRequest.getAfterTimestamp(), AFTERTIMESTAMP_BINDING);
            protocolMarshaller.marshall(listNotificationsRequest.getBeforeTimestamp(), BEFORETIMESTAMP_BINDING);
            protocolMarshaller.marshall(listNotificationsRequest.getDomainIdentifier(), DOMAINIDENTIFIER_BINDING);
            protocolMarshaller.marshall(listNotificationsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listNotificationsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listNotificationsRequest.getSubjects(), SUBJECTS_BINDING);
            protocolMarshaller.marshall(listNotificationsRequest.getTaskStatus(), TASKSTATUS_BINDING);
            protocolMarshaller.marshall(listNotificationsRequest.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
