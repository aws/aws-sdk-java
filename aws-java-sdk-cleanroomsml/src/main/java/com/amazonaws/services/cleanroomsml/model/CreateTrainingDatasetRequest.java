/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/CreateTrainingDataset" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrainingDatasetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the training dataset.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the training dataset. This name must be unique in your account and region.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the IAM role that Clean Rooms ML can assume to read the data referred to in the
     * <code>dataSource</code> field of each dataset.
     * </p>
     * <p>
     * Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your account, you get an
     * <code>AccessDeniedException</code> error.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The optional metadata that you apply to the resource to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is reserved for
     * AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If a tag value has aws
     * as its prefix but the key does not, then Clean Rooms ML considers it to be a user tag and will count against the
     * limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * An array of information that lists the Dataset objects, which specifies the dataset type and details on its
     * location and schema. You must provide a role that has read access to these tables.
     * </p>
     */
    private java.util.List<Dataset> trainingData;

    /**
     * <p>
     * The description of the training dataset.
     * </p>
     * 
     * @param description
     *        The description of the training dataset.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the training dataset.
     * </p>
     * 
     * @return The description of the training dataset.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the training dataset.
     * </p>
     * 
     * @param description
     *        The description of the training dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingDatasetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the training dataset. This name must be unique in your account and region.
     * </p>
     * 
     * @param name
     *        The name of the training dataset. This name must be unique in your account and region.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the training dataset. This name must be unique in your account and region.
     * </p>
     * 
     * @return The name of the training dataset. This name must be unique in your account and region.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the training dataset. This name must be unique in your account and region.
     * </p>
     * 
     * @param name
     *        The name of the training dataset. This name must be unique in your account and region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingDatasetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that Clean Rooms ML can assume to read the data referred to in the
     * <code>dataSource</code> field of each dataset.
     * </p>
     * <p>
     * Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your account, you get an
     * <code>AccessDeniedException</code> error.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that Clean Rooms ML can assume to read the data referred to in the
     *        <code>dataSource</code> field of each dataset.</p>
     *        <p>
     *        Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your account, you get
     *        an <code>AccessDeniedException</code> error.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that Clean Rooms ML can assume to read the data referred to in the
     * <code>dataSource</code> field of each dataset.
     * </p>
     * <p>
     * Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your account, you get an
     * <code>AccessDeniedException</code> error.
     * </p>
     * 
     * @return The ARN of the IAM role that Clean Rooms ML can assume to read the data referred to in the
     *         <code>dataSource</code> field of each dataset.</p>
     *         <p>
     *         Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your account, you get
     *         an <code>AccessDeniedException</code> error.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that Clean Rooms ML can assume to read the data referred to in the
     * <code>dataSource</code> field of each dataset.
     * </p>
     * <p>
     * Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your account, you get an
     * <code>AccessDeniedException</code> error.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that Clean Rooms ML can assume to read the data referred to in the
     *        <code>dataSource</code> field of each dataset.</p>
     *        <p>
     *        Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your account, you get
     *        an <code>AccessDeniedException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingDatasetRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The optional metadata that you apply to the resource to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is reserved for
     * AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If a tag value has aws
     * as its prefix but the key does not, then Clean Rooms ML considers it to be a user tag and will count against the
     * limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The optional metadata that you apply to the resource to help you categorize and organize them. Each tag
     *         consists of a key and an optional value, both of which you define.</p>
     *         <p>
     *         The following basic restrictions apply to tags:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum number of tags per resource - 50.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For each resource, each tag key must be unique, and each tag key can have only one value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length - 128 Unicode characters in UTF-8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length - 256 Unicode characters in UTF-8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If your tagging schema is used across multiple services and resources, remember that other services may
     *         have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *         representable in UTF-8, and the following characters: + - = . _ : / @.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Tag keys and values are case sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is
     *         reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix.
     *         If a tag value has aws as its prefix but the key does not, then Clean Rooms ML considers it to be a user
     *         tag and will count against the limit of 50 tags. Tags with only the key prefix of aws do not count
     *         against your tags per resource limit.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The optional metadata that you apply to the resource to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is reserved for
     * AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If a tag value has aws
     * as its prefix but the key does not, then Clean Rooms ML considers it to be a user tag and will count against the
     * limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        The optional metadata that you apply to the resource to help you categorize and organize them. Each tag
     *        consists of a key and an optional value, both of which you define.</p>
     *        <p>
     *        The following basic restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource - 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique, and each tag key can have only one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length - 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length - 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your tagging schema is used across multiple services and resources, remember that other services may
     *        have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *        representable in UTF-8, and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is
     *        reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If
     *        a tag value has aws as its prefix but the key does not, then Clean Rooms ML considers it to be a user tag
     *        and will count against the limit of 50 tags. Tags with only the key prefix of aws do not count against
     *        your tags per resource limit.
     *        </p>
     *        </li>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The optional metadata that you apply to the resource to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is reserved for
     * AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If a tag value has aws
     * as its prefix but the key does not, then Clean Rooms ML considers it to be a user tag and will count against the
     * limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        The optional metadata that you apply to the resource to help you categorize and organize them. Each tag
     *        consists of a key and an optional value, both of which you define.</p>
     *        <p>
     *        The following basic restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource - 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique, and each tag key can have only one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length - 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length - 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your tagging schema is used across multiple services and resources, remember that other services may
     *        have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *        representable in UTF-8, and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is
     *        reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If
     *        a tag value has aws as its prefix but the key does not, then Clean Rooms ML considers it to be a user tag
     *        and will count against the limit of 50 tags. Tags with only the key prefix of aws do not count against
     *        your tags per resource limit.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingDatasetRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateTrainingDatasetRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingDatasetRequest addTagsEntry(String key, String value) {
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

    public CreateTrainingDatasetRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * An array of information that lists the Dataset objects, which specifies the dataset type and details on its
     * location and schema. You must provide a role that has read access to these tables.
     * </p>
     * 
     * @return An array of information that lists the Dataset objects, which specifies the dataset type and details on
     *         its location and schema. You must provide a role that has read access to these tables.
     */

    public java.util.List<Dataset> getTrainingData() {
        return trainingData;
    }

    /**
     * <p>
     * An array of information that lists the Dataset objects, which specifies the dataset type and details on its
     * location and schema. You must provide a role that has read access to these tables.
     * </p>
     * 
     * @param trainingData
     *        An array of information that lists the Dataset objects, which specifies the dataset type and details on
     *        its location and schema. You must provide a role that has read access to these tables.
     */

    public void setTrainingData(java.util.Collection<Dataset> trainingData) {
        if (trainingData == null) {
            this.trainingData = null;
            return;
        }

        this.trainingData = new java.util.ArrayList<Dataset>(trainingData);
    }

    /**
     * <p>
     * An array of information that lists the Dataset objects, which specifies the dataset type and details on its
     * location and schema. You must provide a role that has read access to these tables.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrainingData(java.util.Collection)} or {@link #withTrainingData(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param trainingData
     *        An array of information that lists the Dataset objects, which specifies the dataset type and details on
     *        its location and schema. You must provide a role that has read access to these tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingDatasetRequest withTrainingData(Dataset... trainingData) {
        if (this.trainingData == null) {
            setTrainingData(new java.util.ArrayList<Dataset>(trainingData.length));
        }
        for (Dataset ele : trainingData) {
            this.trainingData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of information that lists the Dataset objects, which specifies the dataset type and details on its
     * location and schema. You must provide a role that has read access to these tables.
     * </p>
     * 
     * @param trainingData
     *        An array of information that lists the Dataset objects, which specifies the dataset type and details on
     *        its location and schema. You must provide a role that has read access to these tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingDatasetRequest withTrainingData(java.util.Collection<Dataset> trainingData) {
        setTrainingData(trainingData);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTrainingData() != null)
            sb.append("TrainingData: ").append(getTrainingData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrainingDatasetRequest == false)
            return false;
        CreateTrainingDatasetRequest other = (CreateTrainingDatasetRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTrainingData() == null ^ this.getTrainingData() == null)
            return false;
        if (other.getTrainingData() != null && other.getTrainingData().equals(this.getTrainingData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTrainingData() == null) ? 0 : getTrainingData().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrainingDatasetRequest clone() {
        return (CreateTrainingDatasetRequest) super.clone();
    }

}
