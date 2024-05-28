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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListIdMappingWorkflows"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIdMappingWorkflowsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token from the previous API call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of <code>IdMappingWorkflowSummary</code> objects.
     * </p>
     */
    private java.util.List<IdMappingWorkflowSummary> workflowSummaries;

    /**
     * <p>
     * The pagination token from the previous API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous API call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous API call.
     * </p>
     * 
     * @return The pagination token from the previous API call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdMappingWorkflowsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of <code>IdMappingWorkflowSummary</code> objects.
     * </p>
     * 
     * @return A list of <code>IdMappingWorkflowSummary</code> objects.
     */

    public java.util.List<IdMappingWorkflowSummary> getWorkflowSummaries() {
        return workflowSummaries;
    }

    /**
     * <p>
     * A list of <code>IdMappingWorkflowSummary</code> objects.
     * </p>
     * 
     * @param workflowSummaries
     *        A list of <code>IdMappingWorkflowSummary</code> objects.
     */

    public void setWorkflowSummaries(java.util.Collection<IdMappingWorkflowSummary> workflowSummaries) {
        if (workflowSummaries == null) {
            this.workflowSummaries = null;
            return;
        }

        this.workflowSummaries = new java.util.ArrayList<IdMappingWorkflowSummary>(workflowSummaries);
    }

    /**
     * <p>
     * A list of <code>IdMappingWorkflowSummary</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkflowSummaries(java.util.Collection)} or {@link #withWorkflowSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param workflowSummaries
     *        A list of <code>IdMappingWorkflowSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdMappingWorkflowsResult withWorkflowSummaries(IdMappingWorkflowSummary... workflowSummaries) {
        if (this.workflowSummaries == null) {
            setWorkflowSummaries(new java.util.ArrayList<IdMappingWorkflowSummary>(workflowSummaries.length));
        }
        for (IdMappingWorkflowSummary ele : workflowSummaries) {
            this.workflowSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>IdMappingWorkflowSummary</code> objects.
     * </p>
     * 
     * @param workflowSummaries
     *        A list of <code>IdMappingWorkflowSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdMappingWorkflowsResult withWorkflowSummaries(java.util.Collection<IdMappingWorkflowSummary> workflowSummaries) {
        setWorkflowSummaries(workflowSummaries);
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
        if (getWorkflowSummaries() != null)
            sb.append("WorkflowSummaries: ").append(getWorkflowSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIdMappingWorkflowsResult == false)
            return false;
        ListIdMappingWorkflowsResult other = (ListIdMappingWorkflowsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getWorkflowSummaries() == null ^ this.getWorkflowSummaries() == null)
            return false;
        if (other.getWorkflowSummaries() != null && other.getWorkflowSummaries().equals(this.getWorkflowSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getWorkflowSummaries() == null) ? 0 : getWorkflowSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListIdMappingWorkflowsResult clone() {
        try {
            return (ListIdMappingWorkflowsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
