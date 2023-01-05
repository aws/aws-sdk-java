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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateAllowList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAllowListRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
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
     * A custom description of the allow list. The description can contain as many as 512 characters.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A custom name for the allow list. The name can contain as many as 128 characters.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the allow list.
     * </p>
     * <p>
     * An allow list can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The
     * maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAllowListRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public CreateAllowListRequest withCriteria(AllowListCriteria criteria) {
        setCriteria(criteria);
        return this;
    }

    /**
     * <p>
     * A custom description of the allow list. The description can contain as many as 512 characters.
     * </p>
     * 
     * @param description
     *        A custom description of the allow list. The description can contain as many as 512 characters.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A custom description of the allow list. The description can contain as many as 512 characters.
     * </p>
     * 
     * @return A custom description of the allow list. The description can contain as many as 512 characters.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A custom description of the allow list. The description can contain as many as 512 characters.
     * </p>
     * 
     * @param description
     *        A custom description of the allow list. The description can contain as many as 512 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAllowListRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A custom name for the allow list. The name can contain as many as 128 characters.
     * </p>
     * 
     * @param name
     *        A custom name for the allow list. The name can contain as many as 128 characters.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A custom name for the allow list. The name can contain as many as 128 characters.
     * </p>
     * 
     * @return A custom name for the allow list. The name can contain as many as 128 characters.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A custom name for the allow list. The name can contain as many as 128 characters.
     * </p>
     * 
     * @param name
     *        A custom name for the allow list. The name can contain as many as 128 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAllowListRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the allow list.
     * </p>
     * <p>
     * An allow list can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The
     * maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     * </p>
     * 
     * @return A map of key-value pairs that specifies the tags to associate with the allow list.</p>
     *         <p>
     *         An allow list can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value.
     *         The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the allow list.
     * </p>
     * <p>
     * An allow list can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The
     * maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs that specifies the tags to associate with the allow list.</p>
     *        <p>
     *        An allow list can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value.
     *        The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the allow list.
     * </p>
     * <p>
     * An allow list can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The
     * maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs that specifies the tags to associate with the allow list.</p>
     *        <p>
     *        An allow list can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value.
     *        The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAllowListRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAllowListRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAllowListRequest addTagsEntry(String key, String value) {
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

    public CreateAllowListRequest clearTagsEntries() {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getCriteria() != null)
            sb.append("Criteria: ").append(getCriteria()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof CreateAllowListRequest == false)
            return false;
        CreateAllowListRequest other = (CreateAllowListRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getCriteria() == null ^ this.getCriteria() == null)
            return false;
        if (other.getCriteria() != null && other.getCriteria().equals(this.getCriteria()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getCriteria() == null) ? 0 : getCriteria().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAllowListRequest clone() {
        return (CreateAllowListRequest) super.clone();
    }

}
