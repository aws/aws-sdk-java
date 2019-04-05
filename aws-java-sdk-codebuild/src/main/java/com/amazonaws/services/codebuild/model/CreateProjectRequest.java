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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/CreateProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the build project.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description that makes the build project easy to identify.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the build input source code for the build project.
     * </p>
     */
    private ProjectSource source;
    /**
     * <p>
     * An array of <code>ProjectSource</code> objects.
     * </p>
     */
    private java.util.List<ProjectSource> secondarySources;
    /**
     * <p>
     * Information about the build output artifacts for the build project.
     * </p>
     */
    private ProjectArtifacts artifacts;
    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     */
    private java.util.List<ProjectArtifacts> secondaryArtifacts;
    /**
     * <p>
     * Stores recently used information so that it can be quickly accessed at a later time.
     * </p>
     */
    private ProjectCache cache;
    /**
     * <p>
     * Information about the build environment for the build project.
     * </p>
     */
    private ProjectEnvironment environment;
    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with
     * dependent AWS services on behalf of the AWS account.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before it times out any build that has
     * not been marked as completed. The default is 60 minutes.
     * </p>
     */
    private Integer timeoutInMinutes;
    /**
     * <p>
     * The number of minutes a build is allowed to be queued before it times out.
     * </p>
     */
    private Integer queuedTimeoutInMinutes;
    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output
     * artifacts.
     * </p>
     * <note>
     * <p>
     * You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to
     * that key.
     * </p>
     * </note>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the
     * format <code>alias/<i>alias-name</i> </code>).
     * </p>
     */
    private String encryptionKey;
    /**
     * <p>
     * A set of tags for this build project.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * VpcConfig enables AWS CodeBuild to access resources in an Amazon VPC.
     * </p>
     */
    private VpcConfig vpcConfig;
    /**
     * <p>
     * Set this to true to generate a publicly accessible URL for your project's build badge.
     * </p>
     */
    private Boolean badgeEnabled;
    /**
     * <p>
     * Information about logs for the build project. These can be logs in Amazon CloudWatch Logs, logs uploaded to a
     * specified S3 bucket, or both.
     * </p>
     */
    private LogsConfig logsConfig;

    /**
     * <p>
     * The name of the build project.
     * </p>
     * 
     * @param name
     *        The name of the build project.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the build project.
     * </p>
     * 
     * @return The name of the build project.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the build project.
     * </p>
     * 
     * @param name
     *        The name of the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description that makes the build project easy to identify.
     * </p>
     * 
     * @param description
     *        A description that makes the build project easy to identify.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description that makes the build project easy to identify.
     * </p>
     * 
     * @return A description that makes the build project easy to identify.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description that makes the build project easy to identify.
     * </p>
     * 
     * @param description
     *        A description that makes the build project easy to identify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the build input source code for the build project.
     * </p>
     * 
     * @param source
     *        Information about the build input source code for the build project.
     */

    public void setSource(ProjectSource source) {
        this.source = source;
    }

    /**
     * <p>
     * Information about the build input source code for the build project.
     * </p>
     * 
     * @return Information about the build input source code for the build project.
     */

    public ProjectSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * Information about the build input source code for the build project.
     * </p>
     * 
     * @param source
     *        Information about the build input source code for the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withSource(ProjectSource source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects.
     * </p>
     * 
     * @return An array of <code>ProjectSource</code> objects.
     */

    public java.util.List<ProjectSource> getSecondarySources() {
        return secondarySources;
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects.
     * </p>
     * 
     * @param secondarySources
     *        An array of <code>ProjectSource</code> objects.
     */

    public void setSecondarySources(java.util.Collection<ProjectSource> secondarySources) {
        if (secondarySources == null) {
            this.secondarySources = null;
            return;
        }

        this.secondarySources = new java.util.ArrayList<ProjectSource>(secondarySources);
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecondarySources(java.util.Collection)} or {@link #withSecondarySources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param secondarySources
     *        An array of <code>ProjectSource</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withSecondarySources(ProjectSource... secondarySources) {
        if (this.secondarySources == null) {
            setSecondarySources(new java.util.ArrayList<ProjectSource>(secondarySources.length));
        }
        for (ProjectSource ele : secondarySources) {
            this.secondarySources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects.
     * </p>
     * 
     * @param secondarySources
     *        An array of <code>ProjectSource</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withSecondarySources(java.util.Collection<ProjectSource> secondarySources) {
        setSecondarySources(secondarySources);
        return this;
    }

    /**
     * <p>
     * Information about the build output artifacts for the build project.
     * </p>
     * 
     * @param artifacts
     *        Information about the build output artifacts for the build project.
     */

    public void setArtifacts(ProjectArtifacts artifacts) {
        this.artifacts = artifacts;
    }

    /**
     * <p>
     * Information about the build output artifacts for the build project.
     * </p>
     * 
     * @return Information about the build output artifacts for the build project.
     */

    public ProjectArtifacts getArtifacts() {
        return this.artifacts;
    }

    /**
     * <p>
     * Information about the build output artifacts for the build project.
     * </p>
     * 
     * @param artifacts
     *        Information about the build output artifacts for the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withArtifacts(ProjectArtifacts artifacts) {
        setArtifacts(artifacts);
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     * 
     * @return An array of <code>ProjectArtifacts</code> objects.
     */

    public java.util.List<ProjectArtifacts> getSecondaryArtifacts() {
        return secondaryArtifacts;
    }

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     * 
     * @param secondaryArtifacts
     *        An array of <code>ProjectArtifacts</code> objects.
     */

    public void setSecondaryArtifacts(java.util.Collection<ProjectArtifacts> secondaryArtifacts) {
        if (secondaryArtifacts == null) {
            this.secondaryArtifacts = null;
            return;
        }

        this.secondaryArtifacts = new java.util.ArrayList<ProjectArtifacts>(secondaryArtifacts);
    }

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecondaryArtifacts(java.util.Collection)} or {@link #withSecondaryArtifacts(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param secondaryArtifacts
     *        An array of <code>ProjectArtifacts</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withSecondaryArtifacts(ProjectArtifacts... secondaryArtifacts) {
        if (this.secondaryArtifacts == null) {
            setSecondaryArtifacts(new java.util.ArrayList<ProjectArtifacts>(secondaryArtifacts.length));
        }
        for (ProjectArtifacts ele : secondaryArtifacts) {
            this.secondaryArtifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     * 
     * @param secondaryArtifacts
     *        An array of <code>ProjectArtifacts</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withSecondaryArtifacts(java.util.Collection<ProjectArtifacts> secondaryArtifacts) {
        setSecondaryArtifacts(secondaryArtifacts);
        return this;
    }

    /**
     * <p>
     * Stores recently used information so that it can be quickly accessed at a later time.
     * </p>
     * 
     * @param cache
     *        Stores recently used information so that it can be quickly accessed at a later time.
     */

    public void setCache(ProjectCache cache) {
        this.cache = cache;
    }

    /**
     * <p>
     * Stores recently used information so that it can be quickly accessed at a later time.
     * </p>
     * 
     * @return Stores recently used information so that it can be quickly accessed at a later time.
     */

    public ProjectCache getCache() {
        return this.cache;
    }

    /**
     * <p>
     * Stores recently used information so that it can be quickly accessed at a later time.
     * </p>
     * 
     * @param cache
     *        Stores recently used information so that it can be quickly accessed at a later time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withCache(ProjectCache cache) {
        setCache(cache);
        return this;
    }

    /**
     * <p>
     * Information about the build environment for the build project.
     * </p>
     * 
     * @param environment
     *        Information about the build environment for the build project.
     */

    public void setEnvironment(ProjectEnvironment environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * Information about the build environment for the build project.
     * </p>
     * 
     * @return Information about the build environment for the build project.
     */

    public ProjectEnvironment getEnvironment() {
        return this.environment;
    }

    /**
     * <p>
     * Information about the build environment for the build project.
     * </p>
     * 
     * @param environment
     *        Information about the build environment for the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withEnvironment(ProjectEnvironment environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with
     * dependent AWS services on behalf of the AWS account.
     * </p>
     * 
     * @param serviceRole
     *        The ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with
     *        dependent AWS services on behalf of the AWS account.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with
     * dependent AWS services on behalf of the AWS account.
     * </p>
     * 
     * @return The ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with
     *         dependent AWS services on behalf of the AWS account.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with
     * dependent AWS services on behalf of the AWS account.
     * </p>
     * 
     * @param serviceRole
     *        The ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with
     *        dependent AWS services on behalf of the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before it times out any build that has
     * not been marked as completed. The default is 60 minutes.
     * </p>
     * 
     * @param timeoutInMinutes
     *        How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before it times out any build
     *        that has not been marked as completed. The default is 60 minutes.
     */

    public void setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }

    /**
     * <p>
     * How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before it times out any build that has
     * not been marked as completed. The default is 60 minutes.
     * </p>
     * 
     * @return How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before it times out any build
     *         that has not been marked as completed. The default is 60 minutes.
     */

    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    /**
     * <p>
     * How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before it times out any build that has
     * not been marked as completed. The default is 60 minutes.
     * </p>
     * 
     * @param timeoutInMinutes
     *        How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before it times out any build
     *        that has not been marked as completed. The default is 60 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withTimeoutInMinutes(Integer timeoutInMinutes) {
        setTimeoutInMinutes(timeoutInMinutes);
        return this;
    }

    /**
     * <p>
     * The number of minutes a build is allowed to be queued before it times out.
     * </p>
     * 
     * @param queuedTimeoutInMinutes
     *        The number of minutes a build is allowed to be queued before it times out.
     */

    public void setQueuedTimeoutInMinutes(Integer queuedTimeoutInMinutes) {
        this.queuedTimeoutInMinutes = queuedTimeoutInMinutes;
    }

    /**
     * <p>
     * The number of minutes a build is allowed to be queued before it times out.
     * </p>
     * 
     * @return The number of minutes a build is allowed to be queued before it times out.
     */

    public Integer getQueuedTimeoutInMinutes() {
        return this.queuedTimeoutInMinutes;
    }

    /**
     * <p>
     * The number of minutes a build is allowed to be queued before it times out.
     * </p>
     * 
     * @param queuedTimeoutInMinutes
     *        The number of minutes a build is allowed to be queued before it times out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withQueuedTimeoutInMinutes(Integer queuedTimeoutInMinutes) {
        setQueuedTimeoutInMinutes(queuedTimeoutInMinutes);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output
     * artifacts.
     * </p>
     * <note>
     * <p>
     * You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to
     * that key.
     * </p>
     * </note>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the
     * format <code>alias/<i>alias-name</i> </code>).
     * </p>
     * 
     * @param encryptionKey
     *        The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build
     *        output artifacts.</p> <note>
     *        <p>
     *        You can use a cross-account KMS key to encrypt the build output artifacts if your service role has
     *        permission to that key.
     *        </p>
     *        </note>
     *        <p>
     *        You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using
     *        the format <code>alias/<i>alias-name</i> </code>).
     */

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output
     * artifacts.
     * </p>
     * <note>
     * <p>
     * You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to
     * that key.
     * </p>
     * </note>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the
     * format <code>alias/<i>alias-name</i> </code>).
     * </p>
     * 
     * @return The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build
     *         output artifacts.</p> <note>
     *         <p>
     *         You can use a cross-account KMS key to encrypt the build output artifacts if your service role has
     *         permission to that key.
     *         </p>
     *         </note>
     *         <p>
     *         You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using
     *         the format <code>alias/<i>alias-name</i> </code>).
     */

    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output
     * artifacts.
     * </p>
     * <note>
     * <p>
     * You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to
     * that key.
     * </p>
     * </note>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the
     * format <code>alias/<i>alias-name</i> </code>).
     * </p>
     * 
     * @param encryptionKey
     *        The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build
     *        output artifacts.</p> <note>
     *        <p>
     *        You can use a cross-account KMS key to encrypt the build output artifacts if your service role has
     *        permission to that key.
     *        </p>
     *        </note>
     *        <p>
     *        You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using
     *        the format <code>alias/<i>alias-name</i> </code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withEncryptionKey(String encryptionKey) {
        setEncryptionKey(encryptionKey);
        return this;
    }

    /**
     * <p>
     * A set of tags for this build project.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     * </p>
     * 
     * @return A set of tags for this build project.</p>
     *         <p>
     *         These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A set of tags for this build project.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     * </p>
     * 
     * @param tags
     *        A set of tags for this build project.</p>
     *        <p>
     *        These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A set of tags for this build project.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A set of tags for this build project.</p>
     *        <p>
     *        These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of tags for this build project.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     * </p>
     * 
     * @param tags
     *        A set of tags for this build project.</p>
     *        <p>
     *        These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * VpcConfig enables AWS CodeBuild to access resources in an Amazon VPC.
     * </p>
     * 
     * @param vpcConfig
     *        VpcConfig enables AWS CodeBuild to access resources in an Amazon VPC.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * VpcConfig enables AWS CodeBuild to access resources in an Amazon VPC.
     * </p>
     * 
     * @return VpcConfig enables AWS CodeBuild to access resources in an Amazon VPC.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * VpcConfig enables AWS CodeBuild to access resources in an Amazon VPC.
     * </p>
     * 
     * @param vpcConfig
     *        VpcConfig enables AWS CodeBuild to access resources in an Amazon VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * Set this to true to generate a publicly accessible URL for your project's build badge.
     * </p>
     * 
     * @param badgeEnabled
     *        Set this to true to generate a publicly accessible URL for your project's build badge.
     */

    public void setBadgeEnabled(Boolean badgeEnabled) {
        this.badgeEnabled = badgeEnabled;
    }

    /**
     * <p>
     * Set this to true to generate a publicly accessible URL for your project's build badge.
     * </p>
     * 
     * @return Set this to true to generate a publicly accessible URL for your project's build badge.
     */

    public Boolean getBadgeEnabled() {
        return this.badgeEnabled;
    }

    /**
     * <p>
     * Set this to true to generate a publicly accessible URL for your project's build badge.
     * </p>
     * 
     * @param badgeEnabled
     *        Set this to true to generate a publicly accessible URL for your project's build badge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withBadgeEnabled(Boolean badgeEnabled) {
        setBadgeEnabled(badgeEnabled);
        return this;
    }

    /**
     * <p>
     * Set this to true to generate a publicly accessible URL for your project's build badge.
     * </p>
     * 
     * @return Set this to true to generate a publicly accessible URL for your project's build badge.
     */

    public Boolean isBadgeEnabled() {
        return this.badgeEnabled;
    }

    /**
     * <p>
     * Information about logs for the build project. These can be logs in Amazon CloudWatch Logs, logs uploaded to a
     * specified S3 bucket, or both.
     * </p>
     * 
     * @param logsConfig
     *        Information about logs for the build project. These can be logs in Amazon CloudWatch Logs, logs uploaded
     *        to a specified S3 bucket, or both.
     */

    public void setLogsConfig(LogsConfig logsConfig) {
        this.logsConfig = logsConfig;
    }

    /**
     * <p>
     * Information about logs for the build project. These can be logs in Amazon CloudWatch Logs, logs uploaded to a
     * specified S3 bucket, or both.
     * </p>
     * 
     * @return Information about logs for the build project. These can be logs in Amazon CloudWatch Logs, logs uploaded
     *         to a specified S3 bucket, or both.
     */

    public LogsConfig getLogsConfig() {
        return this.logsConfig;
    }

    /**
     * <p>
     * Information about logs for the build project. These can be logs in Amazon CloudWatch Logs, logs uploaded to a
     * specified S3 bucket, or both.
     * </p>
     * 
     * @param logsConfig
     *        Information about logs for the build project. These can be logs in Amazon CloudWatch Logs, logs uploaded
     *        to a specified S3 bucket, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withLogsConfig(LogsConfig logsConfig) {
        setLogsConfig(logsConfig);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getSecondarySources() != null)
            sb.append("SecondarySources: ").append(getSecondarySources()).append(",");
        if (getArtifacts() != null)
            sb.append("Artifacts: ").append(getArtifacts()).append(",");
        if (getSecondaryArtifacts() != null)
            sb.append("SecondaryArtifacts: ").append(getSecondaryArtifacts()).append(",");
        if (getCache() != null)
            sb.append("Cache: ").append(getCache()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: ").append(getServiceRole()).append(",");
        if (getTimeoutInMinutes() != null)
            sb.append("TimeoutInMinutes: ").append(getTimeoutInMinutes()).append(",");
        if (getQueuedTimeoutInMinutes() != null)
            sb.append("QueuedTimeoutInMinutes: ").append(getQueuedTimeoutInMinutes()).append(",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: ").append(getEncryptionKey()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getBadgeEnabled() != null)
            sb.append("BadgeEnabled: ").append(getBadgeEnabled()).append(",");
        if (getLogsConfig() != null)
            sb.append("LogsConfig: ").append(getLogsConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProjectRequest == false)
            return false;
        CreateProjectRequest other = (CreateProjectRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSecondarySources() == null ^ this.getSecondarySources() == null)
            return false;
        if (other.getSecondarySources() != null && other.getSecondarySources().equals(this.getSecondarySources()) == false)
            return false;
        if (other.getArtifacts() == null ^ this.getArtifacts() == null)
            return false;
        if (other.getArtifacts() != null && other.getArtifacts().equals(this.getArtifacts()) == false)
            return false;
        if (other.getSecondaryArtifacts() == null ^ this.getSecondaryArtifacts() == null)
            return false;
        if (other.getSecondaryArtifacts() != null && other.getSecondaryArtifacts().equals(this.getSecondaryArtifacts()) == false)
            return false;
        if (other.getCache() == null ^ this.getCache() == null)
            return false;
        if (other.getCache() != null && other.getCache().equals(this.getCache()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getTimeoutInMinutes() == null ^ this.getTimeoutInMinutes() == null)
            return false;
        if (other.getTimeoutInMinutes() != null && other.getTimeoutInMinutes().equals(this.getTimeoutInMinutes()) == false)
            return false;
        if (other.getQueuedTimeoutInMinutes() == null ^ this.getQueuedTimeoutInMinutes() == null)
            return false;
        if (other.getQueuedTimeoutInMinutes() != null && other.getQueuedTimeoutInMinutes().equals(this.getQueuedTimeoutInMinutes()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getBadgeEnabled() == null ^ this.getBadgeEnabled() == null)
            return false;
        if (other.getBadgeEnabled() != null && other.getBadgeEnabled().equals(this.getBadgeEnabled()) == false)
            return false;
        if (other.getLogsConfig() == null ^ this.getLogsConfig() == null)
            return false;
        if (other.getLogsConfig() != null && other.getLogsConfig().equals(this.getLogsConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getSecondarySources() == null) ? 0 : getSecondarySources().hashCode());
        hashCode = prime * hashCode + ((getArtifacts() == null) ? 0 : getArtifacts().hashCode());
        hashCode = prime * hashCode + ((getSecondaryArtifacts() == null) ? 0 : getSecondaryArtifacts().hashCode());
        hashCode = prime * hashCode + ((getCache() == null) ? 0 : getCache().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInMinutes() == null) ? 0 : getTimeoutInMinutes().hashCode());
        hashCode = prime * hashCode + ((getQueuedTimeoutInMinutes() == null) ? 0 : getQueuedTimeoutInMinutes().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getBadgeEnabled() == null) ? 0 : getBadgeEnabled().hashCode());
        hashCode = prime * hashCode + ((getLogsConfig() == null) ? 0 : getLogsConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateProjectRequest clone() {
        return (CreateProjectRequest) super.clone();
    }

}
