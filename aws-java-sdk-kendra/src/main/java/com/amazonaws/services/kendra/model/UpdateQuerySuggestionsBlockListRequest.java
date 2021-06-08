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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateQuerySuggestionsBlockList"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateQuerySuggestionsBlockListRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index for a block list.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The unique identifier of a block list.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of a block list.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description for a block list.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The S3 path where your block list text file sits in S3.
     * </p>
     * <p>
     * If you update your block list and provide the same path to the block list text file in S3, then Amazon Kendra
     * reloads the file to refresh the block list. Amazon Kendra does not automatically refresh your block list. You
     * need to call the <code>UpdateQuerySuggestionsBlockList</code> API to refresh you block list.
     * </p>
     * <p>
     * If you update your block list, then Amazon Kendra asynchronously refreshes all query suggestions with the latest
     * content in the S3 file. This means changes might not take effect immediately.
     * </p>
     */
    private S3Path sourceS3Path;
    /**
     * <p>
     * The IAM (Identity and Access Management) role used to access the block list text file in S3.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The identifier of the index for a block list.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index for a block list.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index for a block list.
     * </p>
     * 
     * @return The identifier of the index for a block list.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index for a block list.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index for a block list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuerySuggestionsBlockListRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of a block list.
     * </p>
     * 
     * @param id
     *        The unique identifier of a block list.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of a block list.
     * </p>
     * 
     * @return The unique identifier of a block list.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of a block list.
     * </p>
     * 
     * @param id
     *        The unique identifier of a block list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuerySuggestionsBlockListRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of a block list.
     * </p>
     * 
     * @param name
     *        The name of a block list.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a block list.
     * </p>
     * 
     * @return The name of a block list.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a block list.
     * </p>
     * 
     * @param name
     *        The name of a block list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuerySuggestionsBlockListRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description for a block list.
     * </p>
     * 
     * @param description
     *        The description for a block list.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for a block list.
     * </p>
     * 
     * @return The description for a block list.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for a block list.
     * </p>
     * 
     * @param description
     *        The description for a block list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuerySuggestionsBlockListRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The S3 path where your block list text file sits in S3.
     * </p>
     * <p>
     * If you update your block list and provide the same path to the block list text file in S3, then Amazon Kendra
     * reloads the file to refresh the block list. Amazon Kendra does not automatically refresh your block list. You
     * need to call the <code>UpdateQuerySuggestionsBlockList</code> API to refresh you block list.
     * </p>
     * <p>
     * If you update your block list, then Amazon Kendra asynchronously refreshes all query suggestions with the latest
     * content in the S3 file. This means changes might not take effect immediately.
     * </p>
     * 
     * @param sourceS3Path
     *        The S3 path where your block list text file sits in S3.</p>
     *        <p>
     *        If you update your block list and provide the same path to the block list text file in S3, then Amazon
     *        Kendra reloads the file to refresh the block list. Amazon Kendra does not automatically refresh your block
     *        list. You need to call the <code>UpdateQuerySuggestionsBlockList</code> API to refresh you block list.
     *        </p>
     *        <p>
     *        If you update your block list, then Amazon Kendra asynchronously refreshes all query suggestions with the
     *        latest content in the S3 file. This means changes might not take effect immediately.
     */

    public void setSourceS3Path(S3Path sourceS3Path) {
        this.sourceS3Path = sourceS3Path;
    }

    /**
     * <p>
     * The S3 path where your block list text file sits in S3.
     * </p>
     * <p>
     * If you update your block list and provide the same path to the block list text file in S3, then Amazon Kendra
     * reloads the file to refresh the block list. Amazon Kendra does not automatically refresh your block list. You
     * need to call the <code>UpdateQuerySuggestionsBlockList</code> API to refresh you block list.
     * </p>
     * <p>
     * If you update your block list, then Amazon Kendra asynchronously refreshes all query suggestions with the latest
     * content in the S3 file. This means changes might not take effect immediately.
     * </p>
     * 
     * @return The S3 path where your block list text file sits in S3.</p>
     *         <p>
     *         If you update your block list and provide the same path to the block list text file in S3, then Amazon
     *         Kendra reloads the file to refresh the block list. Amazon Kendra does not automatically refresh your
     *         block list. You need to call the <code>UpdateQuerySuggestionsBlockList</code> API to refresh you block
     *         list.
     *         </p>
     *         <p>
     *         If you update your block list, then Amazon Kendra asynchronously refreshes all query suggestions with the
     *         latest content in the S3 file. This means changes might not take effect immediately.
     */

    public S3Path getSourceS3Path() {
        return this.sourceS3Path;
    }

    /**
     * <p>
     * The S3 path where your block list text file sits in S3.
     * </p>
     * <p>
     * If you update your block list and provide the same path to the block list text file in S3, then Amazon Kendra
     * reloads the file to refresh the block list. Amazon Kendra does not automatically refresh your block list. You
     * need to call the <code>UpdateQuerySuggestionsBlockList</code> API to refresh you block list.
     * </p>
     * <p>
     * If you update your block list, then Amazon Kendra asynchronously refreshes all query suggestions with the latest
     * content in the S3 file. This means changes might not take effect immediately.
     * </p>
     * 
     * @param sourceS3Path
     *        The S3 path where your block list text file sits in S3.</p>
     *        <p>
     *        If you update your block list and provide the same path to the block list text file in S3, then Amazon
     *        Kendra reloads the file to refresh the block list. Amazon Kendra does not automatically refresh your block
     *        list. You need to call the <code>UpdateQuerySuggestionsBlockList</code> API to refresh you block list.
     *        </p>
     *        <p>
     *        If you update your block list, then Amazon Kendra asynchronously refreshes all query suggestions with the
     *        latest content in the S3 file. This means changes might not take effect immediately.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuerySuggestionsBlockListRequest withSourceS3Path(S3Path sourceS3Path) {
        setSourceS3Path(sourceS3Path);
        return this;
    }

    /**
     * <p>
     * The IAM (Identity and Access Management) role used to access the block list text file in S3.
     * </p>
     * 
     * @param roleArn
     *        The IAM (Identity and Access Management) role used to access the block list text file in S3.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM (Identity and Access Management) role used to access the block list text file in S3.
     * </p>
     * 
     * @return The IAM (Identity and Access Management) role used to access the block list text file in S3.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM (Identity and Access Management) role used to access the block list text file in S3.
     * </p>
     * 
     * @param roleArn
     *        The IAM (Identity and Access Management) role used to access the block list text file in S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuerySuggestionsBlockListRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSourceS3Path() != null)
            sb.append("SourceS3Path: ").append(getSourceS3Path()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateQuerySuggestionsBlockListRequest == false)
            return false;
        UpdateQuerySuggestionsBlockListRequest other = (UpdateQuerySuggestionsBlockListRequest) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSourceS3Path() == null) ? 0 : getSourceS3Path().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateQuerySuggestionsBlockListRequest clone() {
        return (UpdateQuerySuggestionsBlockListRequest) super.clone();
    }

}
