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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatasetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the dataset.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the schema to associate with the dataset. The schema defines the dataset fields.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group to add the dataset to.
     * </p>
     */
    private String datasetGroupArn;
    /**
     * <p>
     * The type of dataset.
     * </p>
     * <p>
     * One of the following (case insensitive) values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Interactions
     * </p>
     * </li>
     * <li>
     * <p>
     * Items
     * </p>
     * </li>
     * <li>
     * <p>
     * Users
     * </p>
     * </li>
     * </ul>
     */
    private String datasetType;
    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the dataset.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name for the dataset.
     * </p>
     * 
     * @param name
     *        The name for the dataset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the dataset.
     * </p>
     * 
     * @return The name for the dataset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the dataset.
     * </p>
     * 
     * @param name
     *        The name for the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the schema to associate with the dataset. The schema defines the dataset fields.
     * </p>
     * 
     * @param schemaArn
     *        The ARN of the schema to associate with the dataset. The schema defines the dataset fields.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The ARN of the schema to associate with the dataset. The schema defines the dataset fields.
     * </p>
     * 
     * @return The ARN of the schema to associate with the dataset. The schema defines the dataset fields.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The ARN of the schema to associate with the dataset. The schema defines the dataset fields.
     * </p>
     * 
     * @param schemaArn
     *        The ARN of the schema to associate with the dataset. The schema defines the dataset fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group to add the dataset to.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the dataset group to add the dataset to.
     */

    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group to add the dataset to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset group to add the dataset to.
     */

    public String getDatasetGroupArn() {
        return this.datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group to add the dataset to.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the dataset group to add the dataset to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withDatasetGroupArn(String datasetGroupArn) {
        setDatasetGroupArn(datasetGroupArn);
        return this;
    }

    /**
     * <p>
     * The type of dataset.
     * </p>
     * <p>
     * One of the following (case insensitive) values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Interactions
     * </p>
     * </li>
     * <li>
     * <p>
     * Items
     * </p>
     * </li>
     * <li>
     * <p>
     * Users
     * </p>
     * </li>
     * </ul>
     * 
     * @param datasetType
     *        The type of dataset.</p>
     *        <p>
     *        One of the following (case insensitive) values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Interactions
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Items
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Users
     *        </p>
     *        </li>
     */

    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * <p>
     * The type of dataset.
     * </p>
     * <p>
     * One of the following (case insensitive) values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Interactions
     * </p>
     * </li>
     * <li>
     * <p>
     * Items
     * </p>
     * </li>
     * <li>
     * <p>
     * Users
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of dataset.</p>
     *         <p>
     *         One of the following (case insensitive) values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Interactions
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Items
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Users
     *         </p>
     *         </li>
     */

    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * <p>
     * The type of dataset.
     * </p>
     * <p>
     * One of the following (case insensitive) values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Interactions
     * </p>
     * </li>
     * <li>
     * <p>
     * Items
     * </p>
     * </li>
     * <li>
     * <p>
     * Users
     * </p>
     * </li>
     * </ul>
     * 
     * @param datasetType
     *        The type of dataset.</p>
     *        <p>
     *        One of the following (case insensitive) values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Interactions
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Items
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Users
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withDatasetType(String datasetType) {
        setDatasetType(datasetType);
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the dataset.
     * </p>
     * 
     * @return A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to
     *         apply to the dataset.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the dataset.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to
     *        apply to the dataset.
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
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the dataset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to
     *        apply to the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withTags(Tag... tags) {
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
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the dataset.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to
     *        apply to the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getSchemaArn() != null)
            sb.append("SchemaArn: ").append(getSchemaArn()).append(",");
        if (getDatasetGroupArn() != null)
            sb.append("DatasetGroupArn: ").append(getDatasetGroupArn()).append(",");
        if (getDatasetType() != null)
            sb.append("DatasetType: ").append(getDatasetType()).append(",");
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

        if (obj instanceof CreateDatasetRequest == false)
            return false;
        CreateDatasetRequest other = (CreateDatasetRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getDatasetType() == null ^ this.getDatasetType() == null)
            return false;
        if (other.getDatasetType() != null && other.getDatasetType().equals(this.getDatasetType()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetType() == null) ? 0 : getDatasetType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatasetRequest clone() {
        return (CreateDatasetRequest) super.clone();
    }

}
