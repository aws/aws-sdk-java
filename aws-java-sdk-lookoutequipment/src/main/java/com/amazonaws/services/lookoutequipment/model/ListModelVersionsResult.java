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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListModelVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListModelVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If the total number of results exceeds the limit that the response can display, the response returns an opaque
     * pagination token indicating where to continue the listing of machine learning model versions. Use this token in
     * the <code>NextToken</code> field in the request to list the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Provides information on the specified model version, including the created time, model and dataset ARNs, and
     * status.
     * </p>
     * <note>
     * <p>
     * If you don't supply the <code>ModelName</code> request parameter, or if you supply the name of a model that
     * doesn't exist, <code>ListModelVersions</code> returns an empty array in <code>ModelVersionSummaries</code>.
     * </p>
     * </note>
     */
    private java.util.List<ModelVersionSummary> modelVersionSummaries;

    /**
     * <p>
     * If the total number of results exceeds the limit that the response can display, the response returns an opaque
     * pagination token indicating where to continue the listing of machine learning model versions. Use this token in
     * the <code>NextToken</code> field in the request to list the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results exceeds the limit that the response can display, the response returns an
     *        opaque pagination token indicating where to continue the listing of machine learning model versions. Use
     *        this token in the <code>NextToken</code> field in the request to list the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the total number of results exceeds the limit that the response can display, the response returns an opaque
     * pagination token indicating where to continue the listing of machine learning model versions. Use this token in
     * the <code>NextToken</code> field in the request to list the next page of results.
     * </p>
     * 
     * @return If the total number of results exceeds the limit that the response can display, the response returns an
     *         opaque pagination token indicating where to continue the listing of machine learning model versions. Use
     *         this token in the <code>NextToken</code> field in the request to list the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the total number of results exceeds the limit that the response can display, the response returns an opaque
     * pagination token indicating where to continue the listing of machine learning model versions. Use this token in
     * the <code>NextToken</code> field in the request to list the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results exceeds the limit that the response can display, the response returns an
     *        opaque pagination token indicating where to continue the listing of machine learning model versions. Use
     *        this token in the <code>NextToken</code> field in the request to list the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelVersionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Provides information on the specified model version, including the created time, model and dataset ARNs, and
     * status.
     * </p>
     * <note>
     * <p>
     * If you don't supply the <code>ModelName</code> request parameter, or if you supply the name of a model that
     * doesn't exist, <code>ListModelVersions</code> returns an empty array in <code>ModelVersionSummaries</code>.
     * </p>
     * </note>
     * 
     * @return Provides information on the specified model version, including the created time, model and dataset ARNs,
     *         and status.</p> <note>
     *         <p>
     *         If you don't supply the <code>ModelName</code> request parameter, or if you supply the name of a model
     *         that doesn't exist, <code>ListModelVersions</code> returns an empty array in
     *         <code>ModelVersionSummaries</code>.
     *         </p>
     */

    public java.util.List<ModelVersionSummary> getModelVersionSummaries() {
        return modelVersionSummaries;
    }

    /**
     * <p>
     * Provides information on the specified model version, including the created time, model and dataset ARNs, and
     * status.
     * </p>
     * <note>
     * <p>
     * If you don't supply the <code>ModelName</code> request parameter, or if you supply the name of a model that
     * doesn't exist, <code>ListModelVersions</code> returns an empty array in <code>ModelVersionSummaries</code>.
     * </p>
     * </note>
     * 
     * @param modelVersionSummaries
     *        Provides information on the specified model version, including the created time, model and dataset ARNs,
     *        and status.</p> <note>
     *        <p>
     *        If you don't supply the <code>ModelName</code> request parameter, or if you supply the name of a model
     *        that doesn't exist, <code>ListModelVersions</code> returns an empty array in
     *        <code>ModelVersionSummaries</code>.
     *        </p>
     */

    public void setModelVersionSummaries(java.util.Collection<ModelVersionSummary> modelVersionSummaries) {
        if (modelVersionSummaries == null) {
            this.modelVersionSummaries = null;
            return;
        }

        this.modelVersionSummaries = new java.util.ArrayList<ModelVersionSummary>(modelVersionSummaries);
    }

    /**
     * <p>
     * Provides information on the specified model version, including the created time, model and dataset ARNs, and
     * status.
     * </p>
     * <note>
     * <p>
     * If you don't supply the <code>ModelName</code> request parameter, or if you supply the name of a model that
     * doesn't exist, <code>ListModelVersions</code> returns an empty array in <code>ModelVersionSummaries</code>.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelVersionSummaries(java.util.Collection)} or
     * {@link #withModelVersionSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param modelVersionSummaries
     *        Provides information on the specified model version, including the created time, model and dataset ARNs,
     *        and status.</p> <note>
     *        <p>
     *        If you don't supply the <code>ModelName</code> request parameter, or if you supply the name of a model
     *        that doesn't exist, <code>ListModelVersions</code> returns an empty array in
     *        <code>ModelVersionSummaries</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelVersionsResult withModelVersionSummaries(ModelVersionSummary... modelVersionSummaries) {
        if (this.modelVersionSummaries == null) {
            setModelVersionSummaries(new java.util.ArrayList<ModelVersionSummary>(modelVersionSummaries.length));
        }
        for (ModelVersionSummary ele : modelVersionSummaries) {
            this.modelVersionSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides information on the specified model version, including the created time, model and dataset ARNs, and
     * status.
     * </p>
     * <note>
     * <p>
     * If you don't supply the <code>ModelName</code> request parameter, or if you supply the name of a model that
     * doesn't exist, <code>ListModelVersions</code> returns an empty array in <code>ModelVersionSummaries</code>.
     * </p>
     * </note>
     * 
     * @param modelVersionSummaries
     *        Provides information on the specified model version, including the created time, model and dataset ARNs,
     *        and status.</p> <note>
     *        <p>
     *        If you don't supply the <code>ModelName</code> request parameter, or if you supply the name of a model
     *        that doesn't exist, <code>ListModelVersions</code> returns an empty array in
     *        <code>ModelVersionSummaries</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelVersionsResult withModelVersionSummaries(java.util.Collection<ModelVersionSummary> modelVersionSummaries) {
        setModelVersionSummaries(modelVersionSummaries);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getModelVersionSummaries() != null)
            sb.append("ModelVersionSummaries: ").append(getModelVersionSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListModelVersionsResult == false)
            return false;
        ListModelVersionsResult other = (ListModelVersionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getModelVersionSummaries() == null ^ this.getModelVersionSummaries() == null)
            return false;
        if (other.getModelVersionSummaries() != null && other.getModelVersionSummaries().equals(this.getModelVersionSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getModelVersionSummaries() == null) ? 0 : getModelVersionSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListModelVersionsResult clone() {
        try {
            return (ListModelVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
