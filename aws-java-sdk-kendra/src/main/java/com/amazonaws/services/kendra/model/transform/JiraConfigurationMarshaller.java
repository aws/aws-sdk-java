/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JiraConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JiraConfigurationMarshaller {

    private static final MarshallingInfo<String> JIRAACCOUNTURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JiraAccountUrl").build();
    private static final MarshallingInfo<String> SECRETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SecretArn").build();
    private static final MarshallingInfo<Boolean> USECHANGELOG_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseChangeLog").build();
    private static final MarshallingInfo<List> PROJECT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Project").build();
    private static final MarshallingInfo<List> ISSUETYPE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IssueType").build();
    private static final MarshallingInfo<List> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<List> ISSUESUBENTITYFILTER_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IssueSubEntityFilter").build();
    private static final MarshallingInfo<List> ATTACHMENTFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachmentFieldMappings").build();
    private static final MarshallingInfo<List> COMMENTFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CommentFieldMappings").build();
    private static final MarshallingInfo<List> ISSUEFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IssueFieldMappings").build();
    private static final MarshallingInfo<List> PROJECTFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProjectFieldMappings").build();
    private static final MarshallingInfo<List> WORKLOGFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkLogFieldMappings").build();
    private static final MarshallingInfo<List> INCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InclusionPatterns").build();
    private static final MarshallingInfo<List> EXCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExclusionPatterns").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfiguration").build();

    private static final JiraConfigurationMarshaller instance = new JiraConfigurationMarshaller();

    public static JiraConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JiraConfiguration jiraConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (jiraConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jiraConfiguration.getJiraAccountUrl(), JIRAACCOUNTURL_BINDING);
            protocolMarshaller.marshall(jiraConfiguration.getSecretArn(), SECRETARN_BINDING);
            protocolMarshaller.marshall(jiraConfiguration.getUseChangeLog(), USECHANGELOG_BINDING);
            protocolMarshaller.marshall(jiraConfiguration.getProject(), PROJECT_BINDING);
            protocolMarshaller.marshall(jiraConfiguration.getIssueType(), ISSUETYPE_BINDING);
            protocolMarshaller.marshall(jiraConfiguration.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(jiraConfiguration.getIssueSubEntityFilter(), ISSUESUBENTITYFILTER_BINDING);
            protocolMarshaller.marshall(jiraConfiguration.getAttachmentFieldMappings(), ATTACHMENTFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(jiraConfiguration.getCommentFieldMappings(), COMMENTFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(jiraConfiguration.getIssueFieldMappings(), ISSUEFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(jiraConfiguration.getProjectFieldMappings(), PROJECTFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(jiraConfiguration.getWorkLogFieldMappings(), WORKLOGFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(jiraConfiguration.getInclusionPatterns(), INCLUSIONPATTERNS_BINDING);
            protocolMarshaller.marshall(jiraConfiguration.getExclusionPatterns(), EXCLUSIONPATTERNS_BINDING);
            protocolMarshaller.marshall(jiraConfiguration.getVpcConfiguration(), VPCCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
