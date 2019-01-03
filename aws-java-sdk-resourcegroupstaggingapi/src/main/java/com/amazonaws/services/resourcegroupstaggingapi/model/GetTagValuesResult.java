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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetTagValues"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTagValuesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A string that indicates that the response contains more data than can be returned in a single response. To
     * receive additional data, specify this string for the <code>PaginationToken</code> value in a subsequent request.
     * </p>
     */
    private String paginationToken;
    /**
     * <p>
     * A list of all tag values for the specified key in the AWS account.
     * </p>
     */
    private java.util.List<String> tagValues;

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

    public GetTagValuesResult withPaginationToken(String paginationToken) {
        setPaginationToken(paginationToken);
        return this;
    }

    /**
     * <p>
     * A list of all tag values for the specified key in the AWS account.
     * </p>
     * 
     * @return A list of all tag values for the specified key in the AWS account.
     */

    public java.util.List<String> getTagValues() {
        return tagValues;
    }

    /**
     * <p>
     * A list of all tag values for the specified key in the AWS account.
     * </p>
     * 
     * @param tagValues
     *        A list of all tag values for the specified key in the AWS account.
     */

    public void setTagValues(java.util.Collection<String> tagValues) {
        if (tagValues == null) {
            this.tagValues = null;
            return;
        }

        this.tagValues = new java.util.ArrayList<String>(tagValues);
    }

    /**
     * <p>
     * A list of all tag values for the specified key in the AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagValues(java.util.Collection)} or {@link #withTagValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagValues
     *        A list of all tag values for the specified key in the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTagValuesResult withTagValues(String... tagValues) {
        if (this.tagValues == null) {
            setTagValues(new java.util.ArrayList<String>(tagValues.length));
        }
        for (String ele : tagValues) {
            this.tagValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all tag values for the specified key in the AWS account.
     * </p>
     * 
     * @param tagValues
     *        A list of all tag values for the specified key in the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTagValuesResult withTagValues(java.util.Collection<String> tagValues) {
        setTagValues(tagValues);
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
        if (getTagValues() != null)
            sb.append("TagValues: ").append(getTagValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTagValuesResult == false)
            return false;
        GetTagValuesResult other = (GetTagValuesResult) obj;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        if (other.getTagValues() == null ^ this.getTagValues() == null)
            return false;
        if (other.getTagValues() != null && other.getTagValues().equals(this.getTagValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        hashCode = prime * hashCode + ((getTagValues() == null) ? 0 : getTagValues().hashCode());
        return hashCode;
    }

    @Override
    public GetTagValuesResult clone() {
        try {
            return (GetTagValuesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
