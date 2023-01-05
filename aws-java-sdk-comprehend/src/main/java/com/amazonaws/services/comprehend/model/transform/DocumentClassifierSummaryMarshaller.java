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
package com.amazonaws.services.comprehend.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.comprehend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DocumentClassifierSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DocumentClassifierSummaryMarshaller {

    private static final MarshallingInfo<String> DOCUMENTCLASSIFIERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentClassifierName").build();
    private static final MarshallingInfo<Integer> NUMBEROFVERSIONS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfVersions").build();
    private static final MarshallingInfo<java.util.Date> LATESTVERSIONCREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestVersionCreatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LATESTVERSIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestVersionName").build();
    private static final MarshallingInfo<String> LATESTVERSIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestVersionStatus").build();

    private static final DocumentClassifierSummaryMarshaller instance = new DocumentClassifierSummaryMarshaller();

    public static DocumentClassifierSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DocumentClassifierSummary documentClassifierSummary, ProtocolMarshaller protocolMarshaller) {

        if (documentClassifierSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(documentClassifierSummary.getDocumentClassifierName(), DOCUMENTCLASSIFIERNAME_BINDING);
            protocolMarshaller.marshall(documentClassifierSummary.getNumberOfVersions(), NUMBEROFVERSIONS_BINDING);
            protocolMarshaller.marshall(documentClassifierSummary.getLatestVersionCreatedAt(), LATESTVERSIONCREATEDAT_BINDING);
            protocolMarshaller.marshall(documentClassifierSummary.getLatestVersionName(), LATESTVERSIONNAME_BINDING);
            protocolMarshaller.marshall(documentClassifierSummary.getLatestVersionStatus(), LATESTVERSIONSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
