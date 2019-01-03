/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.resourcegroupstaggingapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetTagKeys"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTagKeysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A string that indicates that the response contains more data than can be returned in a single response. To
     * receive additional data, specify this string for the <code>PaginationToken</code> value in a subsequent request.
     * </p>
     */
    private String paginationToken;
    /**
     * <p>
     * A list of all tag keys in the AWS account.
     * </p>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>
     * A string that indicates that the response contains more data than can be returned in a single response. To
     * receive additional data, specify this string for the <code>PaginationToken</code> value in a subsequent request.
     * </p>
     * 
     * @param paginationToken
     *        A string that indicates that the response contains more data than can be returned in a single response. To
     *        receive additional data, specify this string for the <code>PaginationToken</code> value in a subsequent
     *        request.
     */

    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more data than can be returned in a single response. To
     * receive additional data, specify this string for the <code>PaginationToken</code> value in a subsequent request.
     * </p>
     * 
     * @return A string that indicates that the response contains more data than can be returned in a single response.
     *         To receive additional data, specify this string for the <code>PaginationToken</code> value in a
     *         subsequent request.
     */

    public String getPaginationToken() {
        return this.paginationToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more data than can be returned in a single response. To
     * receive additional data, specify this string for the <code>PaginationToken</code> value in a subsequent request.
     * </p>
     * 
     * @param paginationToken
     *        A string that indicates that the response contains more data than can be returned in a single response. To
     *        receive additional data, specify this string for the <code>PaginationToken</code> value in a subsequent
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTagKeysResult withPaginationToken(String paginationToken) {
        setPaginationToken(paginationToken);
        return this;
    }

    /**
     * <p>
     * A list of all tag keys in the AWS account.
     * </p>
     * 
     * @return A list of all tag keys in the AWS account.
     */

    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * A list of all tag keys in the AWS account.
     * </p>
     * 
     * @param tagKeys
     *        A list of all tag keys in the AWS account.
     */

    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new java.util.ArrayList<String>(tagKeys);
    }

    /**
     * <p>
     * A list of all tag keys in the AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeys(java.util.Collection)} or {@link #withTagKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagKeys
     *        A list of all tag keys in the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTagKeysResult withTagKeys(String... tagKeys) {
        if (this.tagKeys == null) {
            setTagKeys(new java.util.ArrayList<String>(tagKeys.length));
        }
        for (String ele : tagKeys) {
            this.tagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all tag keys in the AWS account.
     * </p>
     * 
     * @param tagKeys
     *        A list of all tag keys in the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTagKeysResult withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
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
        if (getPaginationToken() != null)
            sb.append("PaginationToken: ").append(getPaginationToken()).append(",");
        if (getTagKeys() != null)
            sb.append("TagKeys: ").append(getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTagKeysResult == false)
            return false;
        GetTagKeysResult other = (GetTagKeysResult) obj;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public GetTagKeysResult clone() {
        try {
            return (GetTagKeysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
