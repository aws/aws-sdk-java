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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/CreateAudienceModel" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAudienceModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the audience model.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key. This key is used to encrypt and decrypt customer-owned data in the
     * trained ML model and the associated data.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * The name of the audience model resource.
     * </p>
     */
    private String name;
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
     * The end date and time of the training window.
     * </p>
     */
    private java.util.Date trainingDataEndTime;
    /**
     * <p>
     * The start date and time of the training window.
     * </p>
     */
    private java.util.Date trainingDataStartTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training dataset for this audience model.
     * </p>
     */
    private String trainingDatasetArn;

    /**
     * <p>
     * The description of the audience model.
     * </p>
     * 
     * @param description
     *        The description of the audience model.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the audience model.
     * </p>
     * 
     * @return The description of the audience model.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the audience model.
     * </p>
     * 
     * @param description
     *        The description of the audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAudienceModelRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key. This key is used to encrypt and decrypt customer-owned data in the
     * trained ML model and the associated data.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key. This key is used to encrypt and decrypt customer-owned data
     *        in the trained ML model and the associated data.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key. This key is used to encrypt and decrypt customer-owned data in the
     * trained ML model and the associated data.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the KMS key. This key is used to encrypt and decrypt customer-owned
     *         data in the trained ML model and the associated data.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key. This key is used to encrypt and decrypt customer-owned data in the
     * trained ML model and the associated data.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key. This key is used to encrypt and decrypt customer-owned data
     *        in the trained ML model and the associated data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAudienceModelRequest withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * The name of the audience model resource.
     * </p>
     * 
     * @param name
     *        The name of the audience model resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the audience model resource.
     * </p>
     * 
     * @return The name of the audience model resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the audience model resource.
     * </p>
     * 
     * @param name
     *        The name of the audience model resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAudienceModelRequest withName(String name) {
        setName(name);
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

    public CreateAudienceModelRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAudienceModelRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAudienceModelRequest addTagsEntry(String key, String value) {
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

    public CreateAudienceModelRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The end date and time of the training window.
     * </p>
     * 
     * @param trainingDataEndTime
     *        The end date and time of the training window.
     */

    public void setTrainingDataEndTime(java.util.Date trainingDataEndTime) {
        this.trainingDataEndTime = trainingDataEndTime;
    }

    /**
     * <p>
     * The end date and time of the training window.
     * </p>
     * 
     * @return The end date and time of the training window.
     */

    public java.util.Date getTrainingDataEndTime() {
        return this.trainingDataEndTime;
    }

    /**
     * <p>
     * The end date and time of the training window.
     * </p>
     * 
     * @param trainingDataEndTime
     *        The end date and time of the training window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAudienceModelRequest withTrainingDataEndTime(java.util.Date trainingDataEndTime) {
        setTrainingDataEndTime(trainingDataEndTime);
        return this;
    }

    /**
     * <p>
     * The start date and time of the training window.
     * </p>
     * 
     * @param trainingDataStartTime
     *        The start date and time of the training window.
     */

    public void setTrainingDataStartTime(java.util.Date trainingDataStartTime) {
        this.trainingDataStartTime = trainingDataStartTime;
    }

    /**
     * <p>
     * The start date and time of the training window.
     * </p>
     * 
     * @return The start date and time of the training window.
     */

    public java.util.Date getTrainingDataStartTime() {
        return this.trainingDataStartTime;
    }

    /**
     * <p>
     * The start date and time of the training window.
     * </p>
     * 
     * @param trainingDataStartTime
     *        The start date and time of the training window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAudienceModelRequest withTrainingDataStartTime(java.util.Date trainingDataStartTime) {
        setTrainingDataStartTime(trainingDataStartTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training dataset for this audience model.
     * </p>
     * 
     * @param trainingDatasetArn
     *        The Amazon Resource Name (ARN) of the training dataset for this audience model.
     */

    public void setTrainingDatasetArn(String trainingDatasetArn) {
        this.trainingDatasetArn = trainingDatasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training dataset for this audience model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the training dataset for this audience model.
     */

    public String getTrainingDatasetArn() {
        return this.trainingDatasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training dataset for this audience model.
     * </p>
     * 
     * @param trainingDatasetArn
     *        The Amazon Resource Name (ARN) of the training dataset for this audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAudienceModelRequest withTrainingDatasetArn(String trainingDatasetArn) {
        setTrainingDatasetArn(trainingDatasetArn);
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
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTrainingDataEndTime() != null)
            sb.append("TrainingDataEndTime: ").append(getTrainingDataEndTime()).append(",");
        if (getTrainingDataStartTime() != null)
            sb.append("TrainingDataStartTime: ").append(getTrainingDataStartTime()).append(",");
        if (getTrainingDatasetArn() != null)
            sb.append("TrainingDatasetArn: ").append(getTrainingDatasetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAudienceModelRequest == false)
            return false;
        CreateAudienceModelRequest other = (CreateAudienceModelRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTrainingDataEndTime() == null ^ this.getTrainingDataEndTime() == null)
            return false;
        if (other.getTrainingDataEndTime() != null && other.getTrainingDataEndTime().equals(this.getTrainingDataEndTime()) == false)
            return false;
        if (other.getTrainingDataStartTime() == null ^ this.getTrainingDataStartTime() == null)
            return false;
        if (other.getTrainingDataStartTime() != null && other.getTrainingDataStartTime().equals(this.getTrainingDataStartTime()) == false)
            return false;
        if (other.getTrainingDatasetArn() == null ^ this.getTrainingDatasetArn() == null)
            return false;
        if (other.getTrainingDatasetArn() != null && other.getTrainingDatasetArn().equals(this.getTrainingDatasetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataEndTime() == null) ? 0 : getTrainingDataEndTime().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataStartTime() == null) ? 0 : getTrainingDataStartTime().hashCode());
        hashCode = prime * hashCode + ((getTrainingDatasetArn() == null) ? 0 : getTrainingDatasetArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateAudienceModelRequest clone() {
        return (CreateAudienceModelRequest) super.clone();
    }

}
