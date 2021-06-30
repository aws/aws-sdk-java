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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents all of the attributes of a DataBrew project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/Project" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Project implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the project.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The date and time that the project was created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who crated the project.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The dataset that the project is to act upon.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The last modification date and time for the project.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last modified the project.
     * </p>
     */
    private String lastModifiedBy;
    /**
     * <p>
     * The unique name of a project.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of a recipe that will be developed during a project session.
     * </p>
     */
    private String recipeName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the project.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The sample size and sampling type to apply to the data. If this parameter isn't specified, then the sample
     * consists of the first 500 rows from the dataset.
     * </p>
     */
    private Sample sample;
    /**
     * <p>
     * Metadata tags that have been applied to the project.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that will be assumed for this project.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user that opened the project for use.
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
     * The ID of the Amazon Web Services account that owns the project.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account that owns the project.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the project.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that owns the project.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the project.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account that owns the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

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

    public Project withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who crated the project.
     * </p>
     * 
     * @param createdBy
     *        The Amazon Resource Name (ARN) of the user who crated the project.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who crated the project.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user who crated the project.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who crated the project.
     * </p>
     * 
     * @param createdBy
     *        The Amazon Resource Name (ARN) of the user who crated the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The dataset that the project is to act upon.
     * </p>
     * 
     * @param datasetName
     *        The dataset that the project is to act upon.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The dataset that the project is to act upon.
     * </p>
     * 
     * @return The dataset that the project is to act upon.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The dataset that the project is to act upon.
     * </p>
     * 
     * @param datasetName
     *        The dataset that the project is to act upon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The last modification date and time for the project.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last modification date and time for the project.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The last modification date and time for the project.
     * </p>
     * 
     * @return The last modification date and time for the project.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The last modification date and time for the project.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last modification date and time for the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last modified the project.
     * </p>
     * 
     * @param lastModifiedBy
     *        The Amazon Resource Name (ARN) of the user who last modified the project.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last modified the project.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user who last modified the project.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last modified the project.
     * </p>
     * 
     * @param lastModifiedBy
     *        The Amazon Resource Name (ARN) of the user who last modified the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The unique name of a project.
     * </p>
     * 
     * @param name
     *        The unique name of a project.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique name of a project.
     * </p>
     * 
     * @return The unique name of a project.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique name of a project.
     * </p>
     * 
     * @param name
     *        The unique name of a project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of a recipe that will be developed during a project session.
     * </p>
     * 
     * @param recipeName
     *        The name of a recipe that will be developed during a project session.
     */

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    /**
     * <p>
     * The name of a recipe that will be developed during a project session.
     * </p>
     * 
     * @return The name of a recipe that will be developed during a project session.
     */

    public String getRecipeName() {
        return this.recipeName;
    }

    /**
     * <p>
     * The name of a recipe that will be developed during a project session.
     * </p>
     * 
     * @param recipeName
     *        The name of a recipe that will be developed during a project session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withRecipeName(String recipeName) {
        setRecipeName(recipeName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the project.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) for the project.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the project.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the project.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the project.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) for the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The sample size and sampling type to apply to the data. If this parameter isn't specified, then the sample
     * consists of the first 500 rows from the dataset.
     * </p>
     * 
     * @param sample
     *        The sample size and sampling type to apply to the data. If this parameter isn't specified, then the sample
     *        consists of the first 500 rows from the dataset.
     */

    public void setSample(Sample sample) {
        this.sample = sample;
    }

    /**
     * <p>
     * The sample size and sampling type to apply to the data. If this parameter isn't specified, then the sample
     * consists of the first 500 rows from the dataset.
     * </p>
     * 
     * @return The sample size and sampling type to apply to the data. If this parameter isn't specified, then the
     *         sample consists of the first 500 rows from the dataset.
     */

    public Sample getSample() {
        return this.sample;
    }

    /**
     * <p>
     * The sample size and sampling type to apply to the data. If this parameter isn't specified, then the sample
     * consists of the first 500 rows from the dataset.
     * </p>
     * 
     * @param sample
     *        The sample size and sampling type to apply to the data. If this parameter isn't specified, then the sample
     *        consists of the first 500 rows from the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withSample(Sample sample) {
        setSample(sample);
        return this;
    }

    /**
     * <p>
     * Metadata tags that have been applied to the project.
     * </p>
     * 
     * @return Metadata tags that have been applied to the project.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata tags that have been applied to the project.
     * </p>
     * 
     * @param tags
     *        Metadata tags that have been applied to the project.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata tags that have been applied to the project.
     * </p>
     * 
     * @param tags
     *        Metadata tags that have been applied to the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Project#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Project addTagsEntry(String key, String value) {
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

    public Project clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that will be assumed for this project.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that will be assumed for this project.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that will be assumed for this project.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role that will be assumed for this project.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that will be assumed for this project.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that will be assumed for this project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user that opened the project for use.
     * </p>
     * 
     * @param openedBy
     *        The Amazon Resource Name (ARN) of the user that opened the project for use.
     */

    public void setOpenedBy(String openedBy) {
        this.openedBy = openedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user that opened the project for use.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user that opened the project for use.
     */

    public String getOpenedBy() {
        return this.openedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user that opened the project for use.
     * </p>
     * 
     * @param openedBy
     *        The Amazon Resource Name (ARN) of the user that opened the project for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withOpenedBy(String openedBy) {
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

    public Project withOpenDate(java.util.Date openDate) {
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
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

        if (obj instanceof Project == false)
            return false;
        Project other = (Project) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRecipeName() == null) ? 0 : getRecipeName().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getSample() == null) ? 0 : getSample().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getOpenedBy() == null) ? 0 : getOpenedBy().hashCode());
        hashCode = prime * hashCode + ((getOpenDate() == null) ? 0 : getOpenDate().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.ProjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
