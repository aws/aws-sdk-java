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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListControlOperations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListControlOperationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a list of output from control operations. PLACEHOLDER
     * </p>
     */
    private java.util.List<ControlOperationSummary> controlOperations;
    /**
     * <p>
     * A pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns a list of output from control operations. PLACEHOLDER
     * </p>
     * 
     * @return Returns a list of output from control operations. PLACEHOLDER
     */

    public java.util.List<ControlOperationSummary> getControlOperations() {
        return controlOperations;
    }

    /**
     * <p>
     * Returns a list of output from control operations. PLACEHOLDER
     * </p>
     * 
     * @param controlOperations
     *        Returns a list of output from control operations. PLACEHOLDER
     */

    public void setControlOperations(java.util.Collection<ControlOperationSummary> controlOperations) {
        if (controlOperations == null) {
            this.controlOperations = null;
            return;
        }

        this.controlOperations = new java.util.ArrayList<ControlOperationSummary>(controlOperations);
    }

    /**
     * <p>
     * Returns a list of output from control operations. PLACEHOLDER
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setControlOperations(java.util.Collection)} or {@link #withControlOperations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param controlOperations
     *        Returns a list of output from control operations. PLACEHOLDER
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListControlOperationsResult withControlOperations(ControlOperationSummary... controlOperations) {
        if (this.controlOperations == null) {
            setControlOperations(new java.util.ArrayList<ControlOperationSummary>(controlOperations.length));
        }
        for (ControlOperationSummary ele : controlOperations) {
            this.controlOperations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of output from control operations. PLACEHOLDER
     * </p>
     * 
     * @param controlOperations
     *        Returns a list of output from control operations. PLACEHOLDER
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListControlOperationsResult withControlOperations(java.util.Collection<ControlOperationSummary> controlOperations) {
        setControlOperations(controlOperations);
        return this;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @param nextToken
     *        A pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @return A pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @param nextToken
     *        A pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListControlOperationsResult withNextToken(String nextToken) {
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
        if (getControlOperations() != null)
            sb.append("ControlOperations: ").append(getControlOperations()).append(",");
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

        if (obj instanceof ListControlOperationsResult == false)
            return false;
        ListControlOperationsResult other = (ListControlOperationsResult) obj;
        if (other.getControlOperations() == null ^ this.getControlOperations() == null)
            return false;
        if (other.getControlOperations() != null && other.getControlOperations().equals(this.getControlOperations()) == false)
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

        hashCode = prime * hashCode + ((getControlOperations() == null) ? 0 : getControlOperations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListControlOperationsResult clone() {
        try {
            return (ListControlOperationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
