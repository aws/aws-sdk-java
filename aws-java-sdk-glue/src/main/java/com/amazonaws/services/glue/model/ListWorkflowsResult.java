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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListWorkflows" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkflowsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of names of workflows in the account.
     * </p>
     */
    private java.util.List<String> workflows;
    /**
     * <p>
     * A continuation token, if not all workflow names have been returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of names of workflows in the account.
     * </p>
     * 
     * @return List of names of workflows in the account.
     */

    public java.util.List<String> getWorkflows() {
        return workflows;
    }

    /**
     * <p>
     * List of names of workflows in the account.
     * </p>
     * 
     * @param workflows
     *        List of names of workflows in the account.
     */

    public void setWorkflows(java.util.Collection<String> workflows) {
        if (workflows == null) {
            this.workflows = null;
            return;
        }

        this.workflows = new java.util.ArrayList<String>(workflows);
    }

    /**
     * <p>
     * List of names of workflows in the account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkflows(java.util.Collection)} or {@link #withWorkflows(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param workflows
     *        List of names of workflows in the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsResult withWorkflows(String... workflows) {
        if (this.workflows == null) {
            setWorkflows(new java.util.ArrayList<String>(workflows.length));
        }
        for (String ele : workflows) {
            this.workflows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of names of workflows in the account.
     * </p>
     * 
     * @param workflows
     *        List of names of workflows in the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsResult withWorkflows(java.util.Collection<String> workflows) {
        setWorkflows(workflows);
        return this;
    }

    /**
     * <p>
     * A continuation token, if not all workflow names have been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all workflow names have been returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all workflow names have been returned.
     * </p>
     * 
     * @return A continuation token, if not all workflow names have been returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all workflow names have been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all workflow names have been returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsResult withNextToken(String nextToken) {
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
        if (getWorkflows() != null)
            sb.append("Workflows: ").append(getWorkflows()).append(",");
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

        if (obj instanceof ListWorkflowsResult == false)
            return false;
        ListWorkflowsResult other = (ListWorkflowsResult) obj;
        if (other.getWorkflows() == null ^ this.getWorkflows() == null)
            return false;
        if (other.getWorkflows() != null && other.getWorkflows().equals(this.getWorkflows()) == false)
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

        hashCode = prime * hashCode + ((getWorkflows() == null) ? 0 : getWorkflows().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkflowsResult clone() {
        try {
            return (ListWorkflowsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
