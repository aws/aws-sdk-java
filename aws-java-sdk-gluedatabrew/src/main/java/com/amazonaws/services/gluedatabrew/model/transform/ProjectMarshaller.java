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
package com.amazonaws.services.gluedatabrew.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gluedatabrew.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProjectMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProjectMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountId").build();
    private static final MarshallingInfo<java.util.Date> CREATEDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CreatedBy").build();
    private static final MarshallingInfo<String> DATASETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatasetName").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LASTMODIFIEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedBy").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> RECIPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecipeName").build();
    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceArn").build();
    private static final MarshallingInfo<StructuredPojo> SAMPLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Sample").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<String> OPENEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OpenedBy").build();
    private static final MarshallingInfo<java.util.Date> OPENDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OpenDate").timestampFormat("unixTimestamp").build();

    private static final ProjectMarshaller instance = new ProjectMarshaller();

    public static ProjectMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Project project, ProtocolMarshaller protocolMarshaller) {

        if (project == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(project.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(project.getCreateDate(), CREATEDATE_BINDING);
            protocolMarshaller.marshall(project.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(project.getDatasetName(), DATASETNAME_BINDING);
            protocolMarshaller.marshall(project.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
            protocolMarshaller.marshall(project.getLastModifiedBy(), LASTMODIFIEDBY_BINDING);
            protocolMarshaller.marshall(project.getName(), NAME_BINDING);
            protocolMarshaller.marshall(project.getRecipeName(), RECIPENAME_BINDING);
            protocolMarshaller.marshall(project.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(project.getSample(), SAMPLE_BINDING);
            protocolMarshaller.marshall(project.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(project.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(project.getOpenedBy(), OPENEDBY_BINDING);
            protocolMarshaller.marshall(project.getOpenDate(), OPENDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
