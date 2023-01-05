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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetAllowList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAllowListResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the allow list.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the allow list was created in Amazon Macie.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The criteria that specify the text or text pattern to ignore. The criteria can be the location and name of an S3
     * object that lists specific text to ignore (s3WordsList), or a regular expression (regex) that defines a text
     * pattern to ignore.
     * </p>
     */
    private AllowListCriteria criteria;
    /**
     * <p>
     * The custom description of the allow list.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier for the allow list.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The custom name of the allow list.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current status of the allow list, which indicates whether Amazon Macie can access and use the list's
     * criteria.
     * </p>
     */
    private AllowListStatus status;
    /**
     * <p>
     * A map of key-value pairs that specifies which tags (keys and values) are associated with the allow list.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the allow list's settings were most recently changed
     * in Amazon Macie.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the allow list.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the allow list.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the allow list.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the allow list.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the allow list.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the allow list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAllowListResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the allow list was created in Amazon Macie.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in UTC and extended ISO 8601 format, when the allow list was created in Amazon Macie.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the allow list was created in Amazon Macie.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when the allow list was created in Amazon Macie.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the allow list was created in Amazon Macie.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in UTC and extended ISO 8601 format, when the allow list was created in Amazon Macie.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAllowListResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The criteria that specify the text or text pattern to ignore. The criteria can be the location and name of an S3
     * object that lists specific text to ignore (s3WordsList), or a regular expression (regex) that defines a text
     * pattern to ignore.
     * </p>
     * 
     * @param criteria
     *        The criteria that specify the text or text pattern to ignore. The criteria can be the location and name of
     *        an S3 object that lists specific text to ignore (s3WordsList), or a regular expression (regex) that
     *        defines a text pattern to ignore.
     */

    public void setCriteria(AllowListCriteria criteria) {
        this.criteria = criteria;
    }

    /**
     * <p>
     * The criteria that specify the text or text pattern to ignore. The criteria can be the location and name of an S3
     * object that lists specific text to ignore (s3WordsList), or a regular expression (regex) that defines a text
     * pattern to ignore.
     * </p>
     * 
     * @return The criteria that specify the text or text pattern to ignore. The criteria can be the location and name
     *         of an S3 object that lists specific text to ignore (s3WordsList), or a regular expression (regex) that
     *         defines a text pattern to ignore.
     */

    public AllowListCriteria getCriteria() {
        return this.criteria;
    }

    /**
     * <p>
     * The criteria that specify the text or text pattern to ignore. The criteria can be the location and name of an S3
     * object that lists specific text to ignore (s3WordsList), or a regular expression (regex) that defines a text
     * pattern to ignore.
     * </p>
     * 
     * @param criteria
     *        The criteria that specify the text or text pattern to ignore. The criteria can be the location and name of
     *        an S3 object that lists specific text to ignore (s3WordsList), or a regular expression (regex) that
     *        defines a text pattern to ignore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAllowListResult withCriteria(AllowListCriteria criteria) {
        setCriteria(criteria);
        return this;
    }

    /**
     * <p>
     * The custom description of the allow list.
     * </p>
     * 
     * @param description
     *        The custom description of the allow list.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The custom description of the allow list.
     * </p>
     * 
     * @return The custom description of the allow list.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The custom description of the allow list.
     * </p>
     * 
     * @param description
     *        The custom description of the allow list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAllowListResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the allow list.
     * </p>
     * 
     * @param id
     *        The unique identifier for the allow list.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the allow list.
     * </p>
     * 
     * @return The unique identifier for the allow list.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the allow list.
     * </p>
     * 
     * @param id
     *        The unique identifier for the allow list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAllowListResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The custom name of the allow list.
     * </p>
     * 
     * @param name
     *        The custom name of the allow list.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The custom name of the allow list.
     * </p>
     * 
     * @return The custom name of the allow list.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The custom name of the allow list.
     * </p>
     * 
     * @param name
     *        The custom name of the allow list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAllowListResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current status of the allow list, which indicates whether Amazon Macie can access and use the list's
     * criteria.
     * </p>
     * 
     * @param status
     *        The current status of the allow list, which indicates whether Amazon Macie can access and use the list's
     *        criteria.
     */

    public void setStatus(AllowListStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the allow list, which indicates whether Amazon Macie can access and use the list's
     * criteria.
     * </p>
     * 
     * @return The current status of the allow list, which indicates whether Amazon Macie can access and use the list's
     *         criteria.
     */

    public AllowListStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the allow list, which indicates whether Amazon Macie can access and use the list's
     * criteria.
     * </p>
     * 
     * @param status
     *        The current status of the allow list, which indicates whether Amazon Macie can access and use the list's
     *        criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAllowListResult withStatus(AllowListStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies which tags (keys and values) are associated with the allow list.
     * </p>
     * 
     * @return A map of key-value pairs that specifies which tags (keys and values) are associated with the allow list.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies which tags (keys and values) are associated with the allow list.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs that specifies which tags (keys and values) are associated with the allow list.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies which tags (keys and values) are associated with the allow list.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs that specifies which tags (keys and values) are associated with the allow list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAllowListResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetAllowListResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetAllowListResult addTagsEntry(String key, String value) {
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

    public GetAllowListResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the allow list's settings were most recently changed
     * in Amazon Macie.
     * </p>
     * 
     * @param updatedAt
     *        The date and time, in UTC and extended ISO 8601 format, when the allow list's settings were most recently
     *        changed in Amazon Macie.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the allow list's settings were most recently changed
     * in Amazon Macie.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when the allow list's settings were most recently
     *         changed in Amazon Macie.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the allow list's settings were most recently changed
     * in Amazon Macie.
     * </p>
     * 
     * @param updatedAt
     *        The date and time, in UTC and extended ISO 8601 format, when the allow list's settings were most recently
     *        changed in Amazon Macie.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAllowListResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCriteria() != null)
            sb.append("Criteria: ").append(getCriteria()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAllowListResult == false)
            return false;
        GetAllowListResult other = (GetAllowListResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCriteria() == null ^ this.getCriteria() == null)
            return false;
        if (other.getCriteria() != null && other.getCriteria().equals(this.getCriteria()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCriteria() == null) ? 0 : getCriteria().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public GetAllowListResult clone() {
        try {
            return (GetAllowListResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
