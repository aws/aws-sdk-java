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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProjectMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProjectMarshaller {

    private static final MarshallingInfo<String> PROJECTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProjectArn").build();
    private static final MarshallingInfo<String> PROJECTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProjectName").build();
    private static final MarshallingInfo<String> PROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProjectId").build();
    private static final MarshallingInfo<String> PROJECTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProjectDescription").build();
    private static final MarshallingInfo<StructuredPojo> SERVICECATALOGPROVISIONINGDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceCatalogProvisioningDetails").build();
    private static final MarshallingInfo<StructuredPojo> SERVICECATALOGPROVISIONEDPRODUCTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceCatalogProvisionedProductDetails").build();
    private static final MarshallingInfo<String> PROJECTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProjectStatus").build();
    private static final MarshallingInfo<StructuredPojo> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedBy").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> LASTMODIFIEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedBy").build();

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
            protocolMarshaller.marshall(project.getProjectArn(), PROJECTARN_BINDING);
            protocolMarshaller.marshall(project.getProjectName(), PROJECTNAME_BINDING);
            protocolMarshaller.marshall(project.getProjectId(), PROJECTID_BINDING);
            protocolMarshaller.marshall(project.getProjectDescription(), PROJECTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(project.getServiceCatalogProvisioningDetails(), SERVICECATALOGPROVISIONINGDETAILS_BINDING);
            protocolMarshaller.marshall(project.getServiceCatalogProvisionedProductDetails(), SERVICECATALOGPROVISIONEDPRODUCTDETAILS_BINDING);
            protocolMarshaller.marshall(project.getProjectStatus(), PROJECTSTATUS_BINDING);
            protocolMarshaller.marshall(project.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(project.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(project.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(project.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(project.getLastModifiedBy(), LASTMODIFIEDBY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
