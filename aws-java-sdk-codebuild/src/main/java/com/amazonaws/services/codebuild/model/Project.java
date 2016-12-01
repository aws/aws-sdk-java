/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Information about a build project.
 * </p>
 */
public class Project implements Serializable, Cloneable {

    /**
     * <p>
     * The build project's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The build project's Amazon Resource Name (ARN).
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A meaningful description of the build project.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the build project's build input source code.
     * </p>
     */
    private ProjectSource source;
    /**
     * <p>
     * Information about the build project's build output artifacts.
     * </p>
     */
    private ProjectArtifacts artifacts;
    /**
     * <p>
     * Information about the build environment for this build project.
     * </p>
     */
    private ProjectEnvironment environment;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to
     * interact with dependent AWS services on behalf of the AWS account.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait to timeout any related build that did not
     * get marked as completed. The default is 60 minutes.
     * </p>
     */
    private Integer timeoutInMinutes;
    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build project's
     * build output artifacts.
     * </p>
     * <p>
     * This is expressed either as the CMK's Amazon Resource Name (ARN) or, if specified, the CMK's alias (using the
     * format <code>alias/<i>alias-name</i> </code>).
     * </p>
     */
    private String encryptionKey;
    /**
     * <p>
     * The tags for this build project.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * When the build project was created, expressed in Unix time format.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * When the build project's settings were last modified, expressed in Unix time format.
     * </p>
     */
    private java.util.Date lastModified;

    /**
     * <p>
     * The build project's name.
     * </p>
     * 
     * @param name
     *        The build project's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The build project's name.
     * </p>
     * 
     * @return The build project's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The build project's name.
     * </p>
     * 
     * @param name
     *        The build project's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The build project's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param arn
     *        The build project's Amazon Resource Name (ARN).
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The build project's Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The build project's Amazon Resource Name (ARN).
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The build project's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param arn
     *        The build project's Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A meaningful description of the build project.
     * </p>
     * 
     * @param description
     *        A meaningful description of the build project.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A meaningful description of the build project.
     * </p>
     * 
     * @return A meaningful description of the build project.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A meaningful description of the build project.
     * </p>
     * 
     * @param description
     *        A meaningful description of the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the build project's build input source code.
     * </p>
     * 
     * @param source
     *        Information about the build project's build input source code.
     */

    public void setSource(ProjectSource source) {
        this.source = source;
    }

    /**
     * <p>
     * Information about the build project's build input source code.
     * </p>
     * 
     * @return Information about the build project's build input source code.
     */

    public ProjectSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * Information about the build project's build input source code.
     * </p>
     * 
     * @param source
     *        Information about the build project's build input source code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withSource(ProjectSource source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * Information about the build project's build output artifacts.
     * </p>
     * 
     * @param artifacts
     *        Information about the build project's build output artifacts.
     */

    public void setArtifacts(ProjectArtifacts artifacts) {
        this.artifacts = artifacts;
    }

    /**
     * <p>
     * Information about the build project's build output artifacts.
     * </p>
     * 
     * @return Information about the build project's build output artifacts.
     */

    public ProjectArtifacts getArtifacts() {
        return this.artifacts;
    }

    /**
     * <p>
     * Information about the build project's build output artifacts.
     * </p>
     * 
     * @param artifacts
     *        Information about the build project's build output artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withArtifacts(ProjectArtifacts artifacts) {
        setArtifacts(artifacts);
        return this;
    }

    /**
     * <p>
     * Information about the build environment for this build project.
     * </p>
     * 
     * @param environment
     *        Information about the build environment for this build project.
     */

    public void setEnvironment(ProjectEnvironment environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * Information about the build environment for this build project.
     * </p>
     * 
     * @return Information about the build environment for this build project.
     */

    public ProjectEnvironment getEnvironment() {
        return this.environment;
    }

    /**
     * <p>
     * Information about the build environment for this build project.
     * </p>
     * 
     * @param environment
     *        Information about the build environment for this build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withEnvironment(ProjectEnvironment environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to
     * interact with dependent AWS services on behalf of the AWS account.
     * </p>
     * 
     * @param serviceRole
     *        The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS
     *        CodeBuild to interact with dependent AWS services on behalf of the AWS account.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to
     * interact with dependent AWS services on behalf of the AWS account.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS
     *         CodeBuild to interact with dependent AWS services on behalf of the AWS account.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to
     * interact with dependent AWS services on behalf of the AWS account.
     * </p>
     * 
     * @param serviceRole
     *        The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS
     *        CodeBuild to interact with dependent AWS services on behalf of the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait to timeout any related build that did not
     * get marked as completed. The default is 60 minutes.
     * </p>
     * 
     * @param timeoutInMinutes
     *        How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait to timeout any related build that
     *        did not get marked as completed. The default is 60 minutes.
     */

    public void setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }

    /**
     * <p>
     * How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait to timeout any related build that did not
     * get marked as completed. The default is 60 minutes.
     * </p>
     * 
     * @return How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait to timeout any related build that
     *         did not get marked as completed. The default is 60 minutes.
     */

    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    /**
     * <p>
     * How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait to timeout any related build that did not
     * get marked as completed. The default is 60 minutes.
     * </p>
     * 
     * @param timeoutInMinutes
     *        How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait to timeout any related build that
     *        did not get marked as completed. The default is 60 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withTimeoutInMinutes(Integer timeoutInMinutes) {
        setTimeoutInMinutes(timeoutInMinutes);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build project's
     * build output artifacts.
     * </p>
     * <p>
     * This is expressed either as the CMK's Amazon Resource Name (ARN) or, if specified, the CMK's alias (using the
     * format <code>alias/<i>alias-name</i> </code>).
     * </p>
     * 
     * @param encryptionKey
     *        The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build
     *        project's build output artifacts.</p>
     *        <p>
     *        This is expressed either as the CMK's Amazon Resource Name (ARN) or, if specified, the CMK's alias (using
     *        the format <code>alias/<i>alias-name</i> </code>).
     */

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build project's
     * build output artifacts.
     * </p>
     * <p>
     * This is expressed either as the CMK's Amazon Resource Name (ARN) or, if specified, the CMK's alias (using the
     * format <code>alias/<i>alias-name</i> </code>).
     * </p>
     * 
     * @return The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build
     *         project's build output artifacts.</p>
     *         <p>
     *         This is expressed either as the CMK's Amazon Resource Name (ARN) or, if specified, the CMK's alias (using
     *         the format <code>alias/<i>alias-name</i> </code>).
     */

    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build project's
     * build output artifacts.
     * </p>
     * <p>
     * This is expressed either as the CMK's Amazon Resource Name (ARN) or, if specified, the CMK's alias (using the
     * format <code>alias/<i>alias-name</i> </code>).
     * </p>
     * 
     * @param encryptionKey
     *        The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build
     *        project's build output artifacts.</p>
     *        <p>
     *        This is expressed either as the CMK's Amazon Resource Name (ARN) or, if specified, the CMK's alias (using
     *        the format <code>alias/<i>alias-name</i> </code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withEncryptionKey(String encryptionKey) {
        setEncryptionKey(encryptionKey);
        return this;
    }

    /**
     * <p>
     * The tags for this build project.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     * </p>
     * 
     * @return The tags for this build project.</p>
     *         <p>
     *         These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for this build project.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     * </p>
     * 
     * @param tags
     *        The tags for this build project.</p>
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
     * The tags for this build project.
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
     *        The tags for this build project.</p>
     *        <p>
     *        These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withTags(Tag... tags) {
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
     * The tags for this build project.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     * </p>
     * 
     * @param tags
     *        The tags for this build project.</p>
     *        <p>
     *        These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * When the build project was created, expressed in Unix time format.
     * </p>
     * 
     * @param created
     *        When the build project was created, expressed in Unix time format.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * When the build project was created, expressed in Unix time format.
     * </p>
     * 
     * @return When the build project was created, expressed in Unix time format.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * When the build project was created, expressed in Unix time format.
     * </p>
     * 
     * @param created
     *        When the build project was created, expressed in Unix time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * When the build project's settings were last modified, expressed in Unix time format.
     * </p>
     * 
     * @param lastModified
     *        When the build project's settings were last modified, expressed in Unix time format.
     */

    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * When the build project's settings were last modified, expressed in Unix time format.
     * </p>
     * 
     * @return When the build project's settings were last modified, expressed in Unix time format.
     */

    public java.util.Date getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * When the build project's settings were last modified, expressed in Unix time format.
     * </p>
     * 
     * @param lastModified
     *        When the build project's settings were last modified, expressed in Unix time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withLastModified(java.util.Date lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Name: " + getName() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSource() != null)
            sb.append("Source: " + getSource() + ",");
        if (getArtifacts() != null)
            sb.append("Artifacts: " + getArtifacts() + ",");
        if (getEnvironment() != null)
            sb.append("Environment: " + getEnvironment() + ",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: " + getServiceRole() + ",");
        if (getTimeoutInMinutes() != null)
            sb.append("TimeoutInMinutes: " + getTimeoutInMinutes() + ",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: " + getEncryptionKey() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getCreated() != null)
            sb.append("Created: " + getCreated() + ",");
        if (getLastModified() != null)
            sb.append("LastModified: " + getLastModified());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Project == false)
            return false;
        Project other = (Project) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getArtifacts() == null ^ this.getArtifacts() == null)
            return false;
        if (other.getArtifacts() != null && other.getArtifacts().equals(this.getArtifacts()) == false)
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
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getArtifacts() == null) ? 0 : getArtifacts().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInMinutes() == null) ? 0 : getTimeoutInMinutes().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        return hashCode;
    }

    @Override
    public Project clone() {
        try {
            return (Project) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
