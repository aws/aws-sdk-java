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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of an existing dataset to associate this project with.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * A unique name for the new project. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.), and
     * space.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of an existing recipe to associate with the project.
     * </p>
     */
    private String recipeName;

    private Sample sample;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be assumed for this request.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Metadata tags to apply to this project.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of an existing dataset to associate this project with.
     * </p>
     * 
     * @param datasetName
     *        The name of an existing dataset to associate this project with.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of an existing dataset to associate this project with.
     * </p>
     * 
     * @return The name of an existing dataset to associate this project with.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of an existing dataset to associate this project with.
     * </p>
     * 
     * @param datasetName
     *        The name of an existing dataset to associate this project with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * A unique name for the new project. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.), and
     * space.
     * </p>
     * 
     * @param name
     *        A unique name for the new project. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period
     *        (.), and space.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique name for the new project. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.), and
     * space.
     * </p>
     * 
     * @return A unique name for the new project. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period
     *         (.), and space.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A unique name for the new project. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.), and
     * space.
     * </p>
     * 
     * @param name
     *        A unique name for the new project. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period
     *        (.), and space.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of an existing recipe to associate with the project.
     * </p>
     * 
     * @param recipeName
     *        The name of an existing recipe to associate with the project.
     */

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    /**
     * <p>
     * The name of an existing recipe to associate with the project.
     * </p>
     * 
     * @return The name of an existing recipe to associate with the project.
     */

    public String getRecipeName() {
        return this.recipeName;
    }

    /**
     * <p>
     * The name of an existing recipe to associate with the project.
     * </p>
     * 
     * @param recipeName
     *        The name of an existing recipe to associate with the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withRecipeName(String recipeName) {
        setRecipeName(recipeName);
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

    public CreateProjectRequest withSample(Sample sample) {
        setSample(sample);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be assumed for this request.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be assumed for this
     *        request.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be assumed for this request.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be assumed for this
     *         request.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be assumed for this request.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be assumed for this
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Metadata tags to apply to this project.
     * </p>
     * 
     * @return Metadata tags to apply to this project.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata tags to apply to this project.
     * </p>
     * 
     * @param tags
     *        Metadata tags to apply to this project.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata tags to apply to this project.
     * </p>
     * 
     * @param tags
     *        Metadata tags to apply to this project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateProjectRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest addTagsEntry(String key, String value) {
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

    public CreateProjectRequest clearTagsEntries() {
        this.tags = null;
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
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRecipeName() != null)
            sb.append("RecipeName: ").append(getRecipeName()).append(",");
        if (getSample() != null)
            sb.append("Sample: ").append(getSample()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
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
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRecipeName() == null ^ this.getRecipeName() == null)
            return false;
        if (other.getRecipeName() != null && other.getRecipeName().equals(this.getRecipeName()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRecipeName() == null) ? 0 : getRecipeName().hashCode());
        hashCode = prime * hashCode + ((getSample() == null) ? 0 : getSample().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateProjectRequest clone() {
        return (CreateProjectRequest) super.clone();
    }

}
