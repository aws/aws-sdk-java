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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProjectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time that the project was created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * The identifier (user name) of the user who created the project.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The dataset associated with the project.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The date and time that the project was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The identifier (user name) of the user who last modified the project.
     * </p>
     */
    private String lastModifiedBy;
    /**
     * <p>
     * The name of the project.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The recipe associated with this job.
     * </p>
     */
    private String recipeName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     */
    private String resourceArn;

    private Sample sample;
    /**
     * <p>
     * The ARN of the Identity and Access Management (IAM) role to be assumed when DataBrew runs the job.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Metadata tags associated with this project.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Describes the current state of the session:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONING</code> - allocating resources for the session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INITIALIZING</code> - getting the session ready for first use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASSIGNED</code> - the session is ready for use.
     * </p>
     * </li>
     * </ul>
     */
    private String sessionStatus;
    /**
     * <p>
     * The identifier (user name) of the user that opened the project for use.
     * </p>
     */
    private String openedBy;
    /**
     * <p>
     * The date and time when the project was opened.
     * </p>
     */
    private java.util.Date openDate;

    /**
     * <p>
     * The date and time that the project was created.
     * </p>
     * 
     * @param createDate
     *        The date and time that the project was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time that the project was created.
     * </p>
     * 
     * @return The date and time that the project was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time that the project was created.
     * </p>
     * 
     * @param createDate
     *        The date and time that the project was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The identifier (user name) of the user who created the project.
     * </p>
     * 
     * @param createdBy
     *        The identifier (user name) of the user who created the project.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user who created the project.
     * </p>
     * 
     * @return The identifier (user name) of the user who created the project.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user who created the project.
     * </p>
     * 
     * @param createdBy
     *        The identifier (user name) of the user who created the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The dataset associated with the project.
     * </p>
     * 
     * @param datasetName
     *        The dataset associated with the project.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The dataset associated with the project.
     * </p>
     * 
     * @return The dataset associated with the project.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The dataset associated with the project.
     * </p>
     * 
     * @param datasetName
     *        The dataset associated with the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The date and time that the project was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time that the project was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time that the project was last modified.
     * </p>
     * 
     * @return The date and time that the project was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date and time that the project was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time that the project was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The identifier (user name) of the user who last modified the project.
     * </p>
     * 
     * @param lastModifiedBy
     *        The identifier (user name) of the user who last modified the project.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user who last modified the project.
     * </p>
     * 
     * @return The identifier (user name) of the user who last modified the project.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user who last modified the project.
     * </p>
     * 
     * @param lastModifiedBy
     *        The identifier (user name) of the user who last modified the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The name of the project.
     * </p>
     * 
     * @param name
     *        The name of the project.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the project.
     * </p>
     * 
     * @return The name of the project.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the project.
     * </p>
     * 
     * @param name
     *        The name of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The recipe associated with this job.
     * </p>
     * 
     * @param recipeName
     *        The recipe associated with this job.
     */

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    /**
     * <p>
     * The recipe associated with this job.
     * </p>
     * 
     * @return The recipe associated with this job.
     */

    public String getRecipeName() {
        return this.recipeName;
    }

    /**
     * <p>
     * The recipe associated with this job.
     * </p>
     * 
     * @param recipeName
     *        The recipe associated with this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withRecipeName(String recipeName) {
        setRecipeName(recipeName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the project.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the project.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * @param sample
     */

    public void setSample(Sample sample) {
        this.sample = sample;
    }

    /**
     * @return
     */

    public Sample getSample() {
        return this.sample;
    }

    /**
     * @param sample
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withSample(Sample sample) {
        setSample(sample);
        return this;
    }

    /**
     * <p>
     * The ARN of the Identity and Access Management (IAM) role to be assumed when DataBrew runs the job.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the Identity and Access Management (IAM) role to be assumed when DataBrew runs the job.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the Identity and Access Management (IAM) role to be assumed when DataBrew runs the job.
     * </p>
     * 
     * @return The ARN of the Identity and Access Management (IAM) role to be assumed when DataBrew runs the job.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the Identity and Access Management (IAM) role to be assumed when DataBrew runs the job.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the Identity and Access Management (IAM) role to be assumed when DataBrew runs the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Metadata tags associated with this project.
     * </p>
     * 
     * @return Metadata tags associated with this project.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata tags associated with this project.
     * </p>
     * 
     * @param tags
     *        Metadata tags associated with this project.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata tags associated with this project.
     * </p>
     * 
     * @param tags
     *        Metadata tags associated with this project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribeProjectResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Describes the current state of the session:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONING</code> - allocating resources for the session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INITIALIZING</code> - getting the session ready for first use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASSIGNED</code> - the session is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sessionStatus
     *        Describes the current state of the session:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROVISIONING</code> - allocating resources for the session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INITIALIZING</code> - getting the session ready for first use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASSIGNED</code> - the session is ready for use.
     *        </p>
     *        </li>
     * @see SessionStatus
     */

    public void setSessionStatus(String sessionStatus) {
        this.sessionStatus = sessionStatus;
    }

    /**
     * <p>
     * Describes the current state of the session:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONING</code> - allocating resources for the session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INITIALIZING</code> - getting the session ready for first use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASSIGNED</code> - the session is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes the current state of the session:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PROVISIONING</code> - allocating resources for the session.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INITIALIZING</code> - getting the session ready for first use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ASSIGNED</code> - the session is ready for use.
     *         </p>
     *         </li>
     * @see SessionStatus
     */

    public String getSessionStatus() {
        return this.sessionStatus;
    }

    /**
     * <p>
     * Describes the current state of the session:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONING</code> - allocating resources for the session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INITIALIZING</code> - getting the session ready for first use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASSIGNED</code> - the session is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sessionStatus
     *        Describes the current state of the session:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROVISIONING</code> - allocating resources for the session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INITIALIZING</code> - getting the session ready for first use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASSIGNED</code> - the session is ready for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionStatus
     */

    public DescribeProjectResult withSessionStatus(String sessionStatus) {
        setSessionStatus(sessionStatus);
        return this;
    }

    /**
     * <p>
     * Describes the current state of the session:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONING</code> - allocating resources for the session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INITIALIZING</code> - getting the session ready for first use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASSIGNED</code> - the session is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sessionStatus
     *        Describes the current state of the session:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROVISIONING</code> - allocating resources for the session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INITIALIZING</code> - getting the session ready for first use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASSIGNED</code> - the session is ready for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionStatus
     */

    public DescribeProjectResult withSessionStatus(SessionStatus sessionStatus) {
        this.sessionStatus = sessionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The identifier (user name) of the user that opened the project for use.
     * </p>
     * 
     * @param openedBy
     *        The identifier (user name) of the user that opened the project for use.
     */

    public void setOpenedBy(String openedBy) {
        this.openedBy = openedBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user that opened the project for use.
     * </p>
     * 
     * @return The identifier (user name) of the user that opened the project for use.
     */

    public String getOpenedBy() {
        return this.openedBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user that opened the project for use.
     * </p>
     * 
     * @param openedBy
     *        The identifier (user name) of the user that opened the project for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withOpenedBy(String openedBy) {
        setOpenedBy(openedBy);
        return this;
    }

    /**
     * <p>
     * The date and time when the project was opened.
     * </p>
     * 
     * @param openDate
     *        The date and time when the project was opened.
     */

    public void setOpenDate(java.util.Date openDate) {
        this.openDate = openDate;
    }

    /**
     * <p>
     * The date and time when the project was opened.
     * </p>
     * 
     * @return The date and time when the project was opened.
     */

    public java.util.Date getOpenDate() {
        return this.openDate;
    }

    /**
     * <p>
     * The date and time when the project was opened.
     * </p>
     * 
     * @param openDate
     *        The date and time when the project was opened.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withOpenDate(java.util.Date openDate) {
        setOpenDate(openDate);
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
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRecipeName() != null)
            sb.append("RecipeName: ").append(getRecipeName()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getSample() != null)
            sb.append("Sample: ").append(getSample()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getSessionStatus() != null)
            sb.append("SessionStatus: ").append(getSessionStatus()).append(",");
        if (getOpenedBy() != null)
            sb.append("OpenedBy: ").append(getOpenedBy()).append(",");
        if (getOpenDate() != null)
            sb.append("OpenDate: ").append(getOpenDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProjectResult == false)
            return false;
        DescribeProjectResult other = (DescribeProjectResult) obj;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRecipeName() == null ^ this.getRecipeName() == null)
            return false;
        if (other.getRecipeName() != null && other.getRecipeName().equals(this.getRecipeName()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getSample() == null ^ this.getSample() == null)
            return false;
        if (other.getSample() != null && other.getSample().equals(this.getSample()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSessionStatus() == null ^ this.getSessionStatus() == null)
            return false;
        if (other.getSessionStatus() != null && other.getSessionStatus().equals(this.getSessionStatus()) == false)
            return false;
        if (other.getOpenedBy() == null ^ this.getOpenedBy() == null)
            return false;
        if (other.getOpenedBy() != null && other.getOpenedBy().equals(this.getOpenedBy()) == false)
            return false;
        if (other.getOpenDate() == null ^ this.getOpenDate() == null)
            return false;
        if (other.getOpenDate() != null && other.getOpenDate().equals(this.getOpenDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRecipeName() == null) ? 0 : getRecipeName().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getSample() == null) ? 0 : getSample().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getSessionStatus() == null) ? 0 : getSessionStatus().hashCode());
        hashCode = prime * hashCode + ((getOpenedBy() == null) ? 0 : getOpenedBy().hashCode());
        hashCode = prime * hashCode + ((getOpenDate() == null) ? 0 : getOpenDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProjectResult clone() {
        try {
            return (DescribeProjectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
