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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolFunctionInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSolFunctionInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Network function instances.
     * </p>
     */
    private java.util.List<ListSolFunctionInstanceInfo> functionInstances;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Network function instances.
     * </p>
     * 
     * @return Network function instances.
     */

    public java.util.List<ListSolFunctionInstanceInfo> getFunctionInstances() {
        return functionInstances;
    }

    /**
     * <p>
     * Network function instances.
     * </p>
     * 
     * @param functionInstances
     *        Network function instances.
     */

    public void setFunctionInstances(java.util.Collection<ListSolFunctionInstanceInfo> functionInstances) {
        if (functionInstances == null) {
            this.functionInstances = null;
            return;
        }

        this.functionInstances = new java.util.ArrayList<ListSolFunctionInstanceInfo>(functionInstances);
    }

    /**
     * <p>
     * Network function instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFunctionInstances(java.util.Collection)} or {@link #withFunctionInstances(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param functionInstances
     *        Network function instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolFunctionInstancesResult withFunctionInstances(ListSolFunctionInstanceInfo... functionInstances) {
        if (this.functionInstances == null) {
            setFunctionInstances(new java.util.ArrayList<ListSolFunctionInstanceInfo>(functionInstances.length));
        }
        for (ListSolFunctionInstanceInfo ele : functionInstances) {
            this.functionInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Network function instances.
     * </p>
     * 
     * @param functionInstances
     *        Network function instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolFunctionInstancesResult withFunctionInstances(java.util.Collection<ListSolFunctionInstanceInfo> functionInstances) {
        setFunctionInstances(functionInstances);
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

    public ListSolFunctionInstancesResult withNextToken(String nextToken) {
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
        if (getFunctionInstances() != null)
            sb.append("FunctionInstances: ").append(getFunctionInstances()).append(",");
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

        if (obj instanceof ListSolFunctionInstancesResult == false)
            return false;
        ListSolFunctionInstancesResult other = (ListSolFunctionInstancesResult) obj;
        if (other.getFunctionInstances() == null ^ this.getFunctionInstances() == null)
            return false;
        if (other.getFunctionInstances() != null && other.getFunctionInstances().equals(this.getFunctionInstances()) == false)
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

        hashCode = prime * hashCode + ((getFunctionInstances() == null) ? 0 : getFunctionInstances().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSolFunctionInstancesResult clone() {
        try {
            return (ListSolFunctionInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
