/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutforvision.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutforvision.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListDatasetEntriesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListDatasetEntriesRequestMarshaller {

    private static final MarshallingInfo<String> PROJECTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("projectName").build();
    private static final MarshallingInfo<String> DATASETTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("datasetType").build();
    private static final MarshallingInfo<Boolean> LABELED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("labeled").build();
    private static final MarshallingInfo<String> ANOMALYCLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("anomalyClass").build();
    private static final MarshallingInfo<java.util.Date> BEFORECREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("createdBefore").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> AFTERCREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("createdAfter").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> SOURCEREFCONTAINS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("sourceRefContains").build();

    private static final ListDatasetEntriesRequestMarshaller instance = new ListDatasetEntriesRequestMarshaller();

    public static ListDatasetEntriesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListDatasetEntriesRequest listDatasetEntriesRequest, ProtocolMarshaller protocolMarshaller) {

        if (listDatasetEntriesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listDatasetEntriesRequest.getProjectName(), PROJECTNAME_BINDING);
            protocolMarshaller.marshall(listDatasetEntriesRequest.getDatasetType(), DATASETTYPE_BINDING);
            protocolMarshaller.marshall(listDatasetEntriesRequest.getLabeled(), LABELED_BINDING);
            protocolMarshaller.marshall(listDatasetEntriesRequest.getAnomalyClass(), ANOMALYCLASS_BINDING);
            protocolMarshaller.marshall(listDatasetEntriesRequest.getBeforeCreationDate(), BEFORECREATIONDATE_BINDING);
            protocolMarshaller.marshall(listDatasetEntriesRequest.getAfterCreationDate(), AFTERCREATIONDATE_BINDING);
            protocolMarshaller.marshall(listDatasetEntriesRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listDatasetEntriesRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listDatasetEntriesRequest.getSourceRefContains(), SOURCEREFCONTAINS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
