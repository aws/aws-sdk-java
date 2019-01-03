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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NotebookInstanceSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NotebookInstanceSummaryMarshaller {

    private static final MarshallingInfo<String> NOTEBOOKINSTANCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotebookInstanceName").build();
    private static final MarshallingInfo<String> NOTEBOOKINSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotebookInstanceArn").build();
    private static final MarshallingInfo<String> NOTEBOOKINSTANCESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotebookInstanceStatus").build();
    private static final MarshallingInfo<String> URL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Url").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> NOTEBOOKINSTANCELIFECYCLECONFIGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotebookInstanceLifecycleConfigName").build();
    private static final MarshallingInfo<String> DEFAULTCODEREPOSITORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultCodeRepository").build();
    private static final MarshallingInfo<List> ADDITIONALCODEREPOSITORIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalCodeRepositories").build();

    private static final NotebookInstanceSummaryMarshaller instance = new NotebookInstanceSummaryMarshaller();

    public static NotebookInstanceSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NotebookInstanceSummary notebookInstanceSummary, ProtocolMarshaller protocolMarshaller) {

        if (notebookInstanceSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(notebookInstanceSummary.getNotebookInstanceName(), NOTEBOOKINSTANCENAME_BINDING);
            protocolMarshaller.marshall(notebookInstanceSummary.getNotebookInstanceArn(), NOTEBOOKINSTANCEARN_BINDING);
            protocolMarshaller.marshall(notebookInstanceSummary.getNotebookInstanceStatus(), NOTEBOOKINSTANCESTATUS_BINDING);
            protocolMarshaller.marshall(notebookInstanceSummary.getUrl(), URL_BINDING);
            protocolMarshaller.marshall(notebookInstanceSummary.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(notebookInstanceSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(notebookInstanceSummary.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(notebookInstanceSummary.getNotebookInstanceLifecycleConfigName(), NOTEBOOKINSTANCELIFECYCLECONFIGNAME_BINDING);
            protocolMarshaller.marshall(notebookInstanceSummary.getDefaultCodeRepository(), DEFAULTCODEREPOSITORY_BINDING);
            protocolMarshaller.marshall(notebookInstanceSummary.getAdditionalCodeRepositories(), ADDITIONALCODEREPOSITORIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
