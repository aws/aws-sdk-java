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
package com.amazonaws.services.kendra.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GitHubConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GitHubConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> SAASCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SaaSConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> ONPREMISECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OnPremiseConfiguration").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> SECRETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SecretArn").build();
    private static final MarshallingInfo<Boolean> USECHANGELOG_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseChangeLog").build();
    private static final MarshallingInfo<StructuredPojo> GITHUBDOCUMENTCRAWLPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GitHubDocumentCrawlProperties").build();
    private static final MarshallingInfo<List> REPOSITORYFILTER_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RepositoryFilter").build();
    private static final MarshallingInfo<List> INCLUSIONFOLDERNAMEPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InclusionFolderNamePatterns").build();
    private static final MarshallingInfo<List> INCLUSIONFILETYPEPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InclusionFileTypePatterns").build();
    private static final MarshallingInfo<List> INCLUSIONFILENAMEPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InclusionFileNamePatterns").build();
    private static final MarshallingInfo<List> EXCLUSIONFOLDERNAMEPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExclusionFolderNamePatterns").build();
    private static final MarshallingInfo<List> EXCLUSIONFILETYPEPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExclusionFileTypePatterns").build();
    private static final MarshallingInfo<List> EXCLUSIONFILENAMEPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExclusionFileNamePatterns").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfiguration").build();
    private static final MarshallingInfo<List> GITHUBREPOSITORYCONFIGURATIONFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GitHubRepositoryConfigurationFieldMappings").build();
    private static final MarshallingInfo<List> GITHUBCOMMITCONFIGURATIONFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GitHubCommitConfigurationFieldMappings").build();
    private static final MarshallingInfo<List> GITHUBISSUEDOCUMENTCONFIGURATIONFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GitHubIssueDocumentConfigurationFieldMappings").build();
    private static final MarshallingInfo<List> GITHUBISSUECOMMENTCONFIGURATIONFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GitHubIssueCommentConfigurationFieldMappings").build();
    private static final MarshallingInfo<List> GITHUBISSUEATTACHMENTCONFIGURATIONFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GitHubIssueAttachmentConfigurationFieldMappings").build();
    private static final MarshallingInfo<List> GITHUBPULLREQUESTCOMMENTCONFIGURATIONFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GitHubPullRequestCommentConfigurationFieldMappings").build();
    private static final MarshallingInfo<List> GITHUBPULLREQUESTDOCUMENTCONFIGURATIONFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GitHubPullRequestDocumentConfigurationFieldMappings").build();
    private static final MarshallingInfo<List> GITHUBPULLREQUESTDOCUMENTATTACHMENTCONFIGURATIONFIELDMAPPINGS_BINDING = MarshallingInfo
            .builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GitHubPullRequestDocumentAttachmentConfigurationFieldMappings").build();

    private static final GitHubConfigurationMarshaller instance = new GitHubConfigurationMarshaller();

    public static GitHubConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GitHubConfiguration gitHubConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (gitHubConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(gitHubConfiguration.getSaaSConfiguration(), SAASCONFIGURATION_BINDING);
            protocolMarshaller.marshall(gitHubConfiguration.getOnPremiseConfiguration(), ONPREMISECONFIGURATION_BINDING);
            protocolMarshaller.marshall(gitHubConfiguration.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(gitHubConfiguration.getSecretArn(), SECRETARN_BINDING);
            protocolMarshaller.marshall(gitHubConfiguration.getUseChangeLog(), USECHANGELOG_BINDING);
            protocolMarshaller.marshall(gitHubConfiguration.getGitHubDocumentCrawlProperties(), GITHUBDOCUMENTCRAWLPROPERTIES_BINDING);
            protocolMarshaller.marshall(gitHubConfiguration.getRepositoryFilter(), REPOSITORYFILTER_BINDING);
            protocolMarshaller.marshall(gitHubConfiguration.getInclusionFolderNamePatterns(), INCLUSIONFOLDERNAMEPATTERNS_BINDING);
            protocolMarshaller.marshall(gitHubConfiguration.getInclusionFileTypePatterns(), INCLUSIONFILETYPEPATTERNS_BINDING);
            protocolMarshaller.marshall(gitHubConfiguration.getInclusionFileNamePatterns(), INCLUSIONFILENAMEPATTERNS_BINDING);
            protocolMarshaller.marshall(gitHubConfiguration.getExclusionFolderNamePatterns(), EXCLUSIONFOLDERNAMEPATTERNS_BINDING);
            protocolMarshaller.marshall(gitHubConfiguration.getExclusionFileTypePatterns(), EXCLUSIONFILETYPEPATTERNS_BINDING);
            protocolMarshaller.marshall(gitHubConfiguration.getExclusionFileNamePatterns(), EXCLUSIONFILENAMEPATTERNS_BINDING);
            protocolMarshaller.marshall(gitHubConfiguration.getVpcConfiguration(), VPCCONFIGURATION_BINDING);
            protocolMarshaller
                    .marshall(gitHubConfiguration.getGitHubRepositoryConfigurationFieldMappings(), GITHUBREPOSITORYCONFIGURATIONFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(gitHubConfiguration.getGitHubCommitConfigurationFieldMappings(), GITHUBCOMMITCONFIGURATIONFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(gitHubConfiguration.getGitHubIssueDocumentConfigurationFieldMappings(),
                    GITHUBISSUEDOCUMENTCONFIGURATIONFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(gitHubConfiguration.getGitHubIssueCommentConfigurationFieldMappings(),
                    GITHUBISSUECOMMENTCONFIGURATIONFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(gitHubConfiguration.getGitHubIssueAttachmentConfigurationFieldMappings(),
                    GITHUBISSUEATTACHMENTCONFIGURATIONFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(gitHubConfiguration.getGitHubPullRequestCommentConfigurationFieldMappings(),
                    GITHUBPULLREQUESTCOMMENTCONFIGURATIONFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(gitHubConfiguration.getGitHubPullRequestDocumentConfigurationFieldMappings(),
                    GITHUBPULLREQUESTDOCUMENTCONFIGURATIONFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(gitHubConfiguration.getGitHubPullRequestDocumentAttachmentConfigurationFieldMappings(),
                    GITHUBPULLREQUESTDOCUMENTATTACHMENTCONFIGURATIONFIELDMAPPINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
