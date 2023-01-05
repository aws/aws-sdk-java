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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListTargetResourceTypes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTargetResourceTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The target resource types.
     * </p>
     */
    private java.util.List<TargetResourceTypeSummary> targetResourceTypes;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The target resource types.
     * </p>
     * 
     * @return The target resource types.
     */

    public java.util.List<TargetResourceTypeSummary> getTargetResourceTypes() {
        return targetResourceTypes;
    }

    /**
     * <p>
     * The target resource types.
     * </p>
     * 
     * @param targetResourceTypes
     *        The target resource types.
     */

    public void setTargetResourceTypes(java.util.Collection<TargetResourceTypeSummary> targetResourceTypes) {
        if (targetResourceTypes == null) {
            this.targetResourceTypes = null;
            return;
        }

        this.targetResourceTypes = new java.util.ArrayList<TargetResourceTypeSummary>(targetResourceTypes);
    }

    /**
     * <p>
     * The target resource types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetResourceTypes(java.util.Collection)} or {@link #withTargetResourceTypes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param targetResourceTypes
     *        The target resource types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTargetResourceTypesResult withTargetResourceTypes(TargetResourceTypeSummary... targetResourceTypes) {
        if (this.targetResourceTypes == null) {
            setTargetResourceTypes(new java.util.ArrayList<TargetResourceTypeSummary>(targetResourceTypes.length));
        }
        for (TargetResourceTypeSummary ele : targetResourceTypes) {
            this.targetResourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The target resource types.
     * </p>
     * 
     * @param targetResourceTypes
     *        The target resource types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTargetResourceTypesResult withTargetResourceTypes(java.util.Collection<TargetResourceTypeSummary> targetResourceTypes) {
        setTargetResourceTypes(targetResourceTypes);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTargetResourceTypesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getTargetResourceTypes() != null)
            sb.append("TargetResourceTypes: ").append(getTargetResourceTypes()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTargetResourceTypesResult == false)
            return false;
        ListTargetResourceTypesResult other = (ListTargetResourceTypesResult) obj;
        if (other.getTargetResourceTypes() == null ^ this.getTargetResourceTypes() == null)
            return false;
        if (other.getTargetResourceTypes() != null && other.getTargetResourceTypes().equals(this.getTargetResourceTypes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetResourceTypes() == null) ? 0 : getTargetResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTargetResourceTypesResult clone() {
        try {
            return (ListTargetResourceTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
