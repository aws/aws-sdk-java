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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListAccessors" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccessorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of AccessorSummary objects that contain configuration properties for each accessor.
     * </p>
     */
    private java.util.List<AccessorSummary> accessors;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of AccessorSummary objects that contain configuration properties for each accessor.
     * </p>
     * 
     * @return An array of AccessorSummary objects that contain configuration properties for each accessor.
     */

    public java.util.List<AccessorSummary> getAccessors() {
        return accessors;
    }

    /**
     * <p>
     * An array of AccessorSummary objects that contain configuration properties for each accessor.
     * </p>
     * 
     * @param accessors
     *        An array of AccessorSummary objects that contain configuration properties for each accessor.
     */

    public void setAccessors(java.util.Collection<AccessorSummary> accessors) {
        if (accessors == null) {
            this.accessors = null;
            return;
        }

        this.accessors = new java.util.ArrayList<AccessorSummary>(accessors);
    }

    /**
     * <p>
     * An array of AccessorSummary objects that contain configuration properties for each accessor.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessors(java.util.Collection)} or {@link #withAccessors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accessors
     *        An array of AccessorSummary objects that contain configuration properties for each accessor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessorsResult withAccessors(AccessorSummary... accessors) {
        if (this.accessors == null) {
            setAccessors(new java.util.ArrayList<AccessorSummary>(accessors.length));
        }
        for (AccessorSummary ele : accessors) {
            this.accessors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of AccessorSummary objects that contain configuration properties for each accessor.
     * </p>
     * 
     * @param accessors
     *        An array of AccessorSummary objects that contain configuration properties for each accessor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessorsResult withAccessors(java.util.Collection<AccessorSummary> accessors) {
        setAccessors(accessors);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessorsResult withNextToken(String nextToken) {
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
        if (getAccessors() != null)
            sb.append("Accessors: ").append(getAccessors()).append(",");
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

        if (obj instanceof ListAccessorsResult == false)
            return false;
        ListAccessorsResult other = (ListAccessorsResult) obj;
        if (other.getAccessors() == null ^ this.getAccessors() == null)
            return false;
        if (other.getAccessors() != null && other.getAccessors().equals(this.getAccessors()) == false)
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

        hashCode = prime * hashCode + ((getAccessors() == null) ? 0 : getAccessors().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAccessorsResult clone() {
        try {
            return (ListAccessorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
