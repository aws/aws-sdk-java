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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateThesaurus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateThesaurusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the index for the new thesaurus.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The name for the new thesaurus.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description for the new thesaurus.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access thesaurus file
     * specified in <code>SourceS3Path</code>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A list of key-value pairs that identify the thesaurus. You can use the tags to identify and organize your
     * resources and to control access to resources.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The thesaurus file Amazon S3 source path.
     * </p>
     */
    private S3Path sourceS3Path;
    /**
     * <p>
     * A token that you provide to identify the request to create a thesaurus. Multiple calls to the
     * <code>CreateThesaurus</code> operation with the same client token will create only one index.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The unique identifier of the index for the new thesaurus.
     * </p>
     * 
     * @param indexId
     *        The unique identifier of the index for the new thesaurus.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The unique identifier of the index for the new thesaurus.
     * </p>
     * 
     * @return The unique identifier of the index for the new thesaurus.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The unique identifier of the index for the new thesaurus.
     * </p>
     * 
     * @param indexId
     *        The unique identifier of the index for the new thesaurus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThesaurusRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The name for the new thesaurus.
     * </p>
     * 
     * @param name
     *        The name for the new thesaurus.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the new thesaurus.
     * </p>
     * 
     * @return The name for the new thesaurus.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the new thesaurus.
     * </p>
     * 
     * @param name
     *        The name for the new thesaurus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThesaurusRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description for the new thesaurus.
     * </p>
     * 
     * @param description
     *        The description for the new thesaurus.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the new thesaurus.
     * </p>
     * 
     * @return The description for the new thesaurus.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the new thesaurus.
     * </p>
     * 
     * @param description
     *        The description for the new thesaurus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThesaurusRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access thesaurus file
     * specified in <code>SourceS3Path</code>.
     * </p>
     * 
     * @param roleArn
     *        An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access thesaurus
     *        file specified in <code>SourceS3Path</code>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access thesaurus file
     * specified in <code>SourceS3Path</code>.
     * </p>
     * 
     * @return An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access thesaurus
     *         file specified in <code>SourceS3Path</code>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access thesaurus file
     * specified in <code>SourceS3Path</code>.
     * </p>
     * 
     * @param roleArn
     *        An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access thesaurus
     *        file specified in <code>SourceS3Path</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThesaurusRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify the thesaurus. You can use the tags to identify and organize your
     * resources and to control access to resources.
     * </p>
     * 
     * @return A list of key-value pairs that identify the thesaurus. You can use the tags to identify and organize your
     *         resources and to control access to resources.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that identify the thesaurus. You can use the tags to identify and organize your
     * resources and to control access to resources.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify the thesaurus. You can use the tags to identify and organize your
     *        resources and to control access to resources.
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
     * A list of key-value pairs that identify the thesaurus. You can use the tags to identify and organize your
     * resources and to control access to resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify the thesaurus. You can use the tags to identify and organize your
     *        resources and to control access to resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThesaurusRequest withTags(Tag... tags) {
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
     * A list of key-value pairs that identify the thesaurus. You can use the tags to identify and organize your
     * resources and to control access to resources.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify the thesaurus. You can use the tags to identify and organize your
     *        resources and to control access to resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThesaurusRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The thesaurus file Amazon S3 source path.
     * </p>
     * 
     * @param sourceS3Path
     *        The thesaurus file Amazon S3 source path.
     */

    public void setSourceS3Path(S3Path sourceS3Path) {
        this.sourceS3Path = sourceS3Path;
    }

    /**
     * <p>
     * The thesaurus file Amazon S3 source path.
     * </p>
     * 
     * @return The thesaurus file Amazon S3 source path.
     */

    public S3Path getSourceS3Path() {
        return this.sourceS3Path;
    }

    /**
     * <p>
     * The thesaurus file Amazon S3 source path.
     * </p>
     * 
     * @param sourceS3Path
     *        The thesaurus file Amazon S3 source path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThesaurusRequest withSourceS3Path(S3Path sourceS3Path) {
        setSourceS3Path(sourceS3Path);
        return this;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create a thesaurus. Multiple calls to the
     * <code>CreateThesaurus</code> operation with the same client token will create only one index.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create a thesaurus. Multiple calls to the
     *        <code>CreateThesaurus</code> operation with the same client token will create only one index.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create a thesaurus. Multiple calls to the
     * <code>CreateThesaurus</code> operation with the same client token will create only one index.
     * </p>
     * 
     * @return A token that you provide to identify the request to create a thesaurus. Multiple calls to the
     *         <code>CreateThesaurus</code> operation with the same client token will create only one index.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create a thesaurus. Multiple calls to the
     * <code>CreateThesaurus</code> operation with the same client token will create only one index.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create a thesaurus. Multiple calls to the
     *        <code>CreateThesaurus</code> operation with the same client token will create only one index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThesaurusRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getSourceS3Path() != null)
            sb.append("SourceS3Path: ").append(getSourceS3Path()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateThesaurusRequest == false)
            return false;
        CreateThesaurusRequest other = (CreateThesaurusRequest) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSourceS3Path() == null ^ this.getSourceS3Path() == null)
            return false;
        if (other.getSourceS3Path() != null && other.getSourceS3Path().equals(this.getSourceS3Path()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getSourceS3Path() == null) ? 0 : getSourceS3Path().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateThesaurusRequest clone() {
        return (CreateThesaurusRequest) super.clone();
    }

}
