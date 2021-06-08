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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateQuerySuggestionsBlockList"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateQuerySuggestionsBlockListRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index you want to create a query suggestions block list for.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * A user friendly name for the block list.
     * </p>
     * <p>
     * For example, the block list named 'offensive-words' includes all offensive words that could appear in user
     * queries and need to be blocked from suggestions.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A user-friendly description for the block list.
     * </p>
     * <p>
     * For example, the description
     * "List of all offensive words that can appear in user queries and need to be blocked from suggestions."
     * </p>
     */
    private String description;
    /**
     * <p>
     * The S3 path to your block list text file in your S3 bucket.
     * </p>
     * <p>
     * Each block word or phrase should be on a separate line in a text file.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     */
    private S3Path sourceS3Path;
    /**
     * <p>
     * A token that you provide to identify the request to create a query suggestions block list.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The IAM (Identity and Access Management) role used by Amazon Kendra to access the block list text file in your S3
     * bucket.
     * </p>
     * <p>
     * You need permissions to the role ARN (Amazon Resource Name). The role needs S3 read permissions to your file in
     * S3 and needs to give STS (Security Token Service) assume role permissions to Amazon Kendra.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A tag that you can assign to a block list that categorizes the block list.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The identifier of the index you want to create a query suggestions block list for.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index you want to create a query suggestions block list for.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index you want to create a query suggestions block list for.
     * </p>
     * 
     * @return The identifier of the index you want to create a query suggestions block list for.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index you want to create a query suggestions block list for.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index you want to create a query suggestions block list for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuerySuggestionsBlockListRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * A user friendly name for the block list.
     * </p>
     * <p>
     * For example, the block list named 'offensive-words' includes all offensive words that could appear in user
     * queries and need to be blocked from suggestions.
     * </p>
     * 
     * @param name
     *        A user friendly name for the block list.</p>
     *        <p>
     *        For example, the block list named 'offensive-words' includes all offensive words that could appear in user
     *        queries and need to be blocked from suggestions.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A user friendly name for the block list.
     * </p>
     * <p>
     * For example, the block list named 'offensive-words' includes all offensive words that could appear in user
     * queries and need to be blocked from suggestions.
     * </p>
     * 
     * @return A user friendly name for the block list.</p>
     *         <p>
     *         For example, the block list named 'offensive-words' includes all offensive words that could appear in
     *         user queries and need to be blocked from suggestions.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A user friendly name for the block list.
     * </p>
     * <p>
     * For example, the block list named 'offensive-words' includes all offensive words that could appear in user
     * queries and need to be blocked from suggestions.
     * </p>
     * 
     * @param name
     *        A user friendly name for the block list.</p>
     *        <p>
     *        For example, the block list named 'offensive-words' includes all offensive words that could appear in user
     *        queries and need to be blocked from suggestions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuerySuggestionsBlockListRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A user-friendly description for the block list.
     * </p>
     * <p>
     * For example, the description
     * "List of all offensive words that can appear in user queries and need to be blocked from suggestions."
     * </p>
     * 
     * @param description
     *        A user-friendly description for the block list.</p>
     *        <p>
     *        For example, the description
     *        "List of all offensive words that can appear in user queries and need to be blocked from suggestions."
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A user-friendly description for the block list.
     * </p>
     * <p>
     * For example, the description
     * "List of all offensive words that can appear in user queries and need to be blocked from suggestions."
     * </p>
     * 
     * @return A user-friendly description for the block list.</p>
     *         <p>
     *         For example, the description
     *         "List of all offensive words that can appear in user queries and need to be blocked from suggestions."
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A user-friendly description for the block list.
     * </p>
     * <p>
     * For example, the description
     * "List of all offensive words that can appear in user queries and need to be blocked from suggestions."
     * </p>
     * 
     * @param description
     *        A user-friendly description for the block list.</p>
     *        <p>
     *        For example, the description
     *        "List of all offensive words that can appear in user queries and need to be blocked from suggestions."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuerySuggestionsBlockListRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The S3 path to your block list text file in your S3 bucket.
     * </p>
     * <p>
     * Each block word or phrase should be on a separate line in a text file.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     * 
     * @param sourceS3Path
     *        The S3 path to your block list text file in your S3 bucket.</p>
     *        <p>
     *        Each block word or phrase should be on a separate line in a text file.
     *        </p>
     *        <p>
     *        For information on the current quota limits for block lists, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     */

    public void setSourceS3Path(S3Path sourceS3Path) {
        this.sourceS3Path = sourceS3Path;
    }

    /**
     * <p>
     * The S3 path to your block list text file in your S3 bucket.
     * </p>
     * <p>
     * Each block word or phrase should be on a separate line in a text file.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     * 
     * @return The S3 path to your block list text file in your S3 bucket.</p>
     *         <p>
     *         Each block word or phrase should be on a separate line in a text file.
     *         </p>
     *         <p>
     *         For information on the current quota limits for block lists, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     */

    public S3Path getSourceS3Path() {
        return this.sourceS3Path;
    }

    /**
     * <p>
     * The S3 path to your block list text file in your S3 bucket.
     * </p>
     * <p>
     * Each block word or phrase should be on a separate line in a text file.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     * 
     * @param sourceS3Path
     *        The S3 path to your block list text file in your S3 bucket.</p>
     *        <p>
     *        Each block word or phrase should be on a separate line in a text file.
     *        </p>
     *        <p>
     *        For information on the current quota limits for block lists, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuerySuggestionsBlockListRequest withSourceS3Path(S3Path sourceS3Path) {
        setSourceS3Path(sourceS3Path);
        return this;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create a query suggestions block list.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create a query suggestions block list.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create a query suggestions block list.
     * </p>
     * 
     * @return A token that you provide to identify the request to create a query suggestions block list.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create a query suggestions block list.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create a query suggestions block list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuerySuggestionsBlockListRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The IAM (Identity and Access Management) role used by Amazon Kendra to access the block list text file in your S3
     * bucket.
     * </p>
     * <p>
     * You need permissions to the role ARN (Amazon Resource Name). The role needs S3 read permissions to your file in
     * S3 and needs to give STS (Security Token Service) assume role permissions to Amazon Kendra.
     * </p>
     * 
     * @param roleArn
     *        The IAM (Identity and Access Management) role used by Amazon Kendra to access the block list text file in
     *        your S3 bucket.</p>
     *        <p>
     *        You need permissions to the role ARN (Amazon Resource Name). The role needs S3 read permissions to your
     *        file in S3 and needs to give STS (Security Token Service) assume role permissions to Amazon Kendra.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM (Identity and Access Management) role used by Amazon Kendra to access the block list text file in your S3
     * bucket.
     * </p>
     * <p>
     * You need permissions to the role ARN (Amazon Resource Name). The role needs S3 read permissions to your file in
     * S3 and needs to give STS (Security Token Service) assume role permissions to Amazon Kendra.
     * </p>
     * 
     * @return The IAM (Identity and Access Management) role used by Amazon Kendra to access the block list text file in
     *         your S3 bucket.</p>
     *         <p>
     *         You need permissions to the role ARN (Amazon Resource Name). The role needs S3 read permissions to your
     *         file in S3 and needs to give STS (Security Token Service) assume role permissions to Amazon Kendra.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM (Identity and Access Management) role used by Amazon Kendra to access the block list text file in your S3
     * bucket.
     * </p>
     * <p>
     * You need permissions to the role ARN (Amazon Resource Name). The role needs S3 read permissions to your file in
     * S3 and needs to give STS (Security Token Service) assume role permissions to Amazon Kendra.
     * </p>
     * 
     * @param roleArn
     *        The IAM (Identity and Access Management) role used by Amazon Kendra to access the block list text file in
     *        your S3 bucket.</p>
     *        <p>
     *        You need permissions to the role ARN (Amazon Resource Name). The role needs S3 read permissions to your
     *        file in S3 and needs to give STS (Security Token Service) assume role permissions to Amazon Kendra.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuerySuggestionsBlockListRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A tag that you can assign to a block list that categorizes the block list.
     * </p>
     * 
     * @return A tag that you can assign to a block list that categorizes the block list.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A tag that you can assign to a block list that categorizes the block list.
     * </p>
     * 
     * @param tags
     *        A tag that you can assign to a block list that categorizes the block list.
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
     * A tag that you can assign to a block list that categorizes the block list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A tag that you can assign to a block list that categorizes the block list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuerySuggestionsBlockListRequest withTags(Tag... tags) {
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
     * A tag that you can assign to a block list that categorizes the block list.
     * </p>
     * 
     * @param tags
     *        A tag that you can assign to a block list that categorizes the block list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuerySuggestionsBlockListRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSourceS3Path() != null)
            sb.append("SourceS3Path: ").append(getSourceS3Path()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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

        if (obj instanceof CreateQuerySuggestionsBlockListRequest == false)
            return false;
        CreateQuerySuggestionsBlockListRequest other = (CreateQuerySuggestionsBlockListRequest) obj;
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
        if (other.getSourceS3Path() == null ^ this.getSourceS3Path() == null)
            return false;
        if (other.getSourceS3Path() != null && other.getSourceS3Path().equals(this.getSourceS3Path()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSourceS3Path() == null) ? 0 : getSourceS3Path().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateQuerySuggestionsBlockListRequest clone() {
        return (CreateQuerySuggestionsBlockListRequest) super.clone();
    }

}
