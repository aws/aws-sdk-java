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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListNotebookExecutions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNotebookExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of notebook executions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NotebookExecutionSummary> notebookExecutions;
    /**
     * <p>
     * A pagination token that a subsequent <code>ListNotebookExecutions</code> can use to determine the next set of
     * results to retrieve.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of notebook executions.
     * </p>
     * 
     * @return A list of notebook executions.
     */

    public java.util.List<NotebookExecutionSummary> getNotebookExecutions() {
        if (notebookExecutions == null) {
            notebookExecutions = new com.amazonaws.internal.SdkInternalList<NotebookExecutionSummary>();
        }
        return notebookExecutions;
    }

    /**
     * <p>
     * A list of notebook executions.
     * </p>
     * 
     * @param notebookExecutions
     *        A list of notebook executions.
     */

    public void setNotebookExecutions(java.util.Collection<NotebookExecutionSummary> notebookExecutions) {
        if (notebookExecutions == null) {
            this.notebookExecutions = null;
            return;
        }

        this.notebookExecutions = new com.amazonaws.internal.SdkInternalList<NotebookExecutionSummary>(notebookExecutions);
    }

    /**
     * <p>
     * A list of notebook executions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotebookExecutions(java.util.Collection)} or {@link #withNotebookExecutions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param notebookExecutions
     *        A list of notebook executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotebookExecutionsResult withNotebookExecutions(NotebookExecutionSummary... notebookExecutions) {
        if (this.notebookExecutions == null) {
            setNotebookExecutions(new com.amazonaws.internal.SdkInternalList<NotebookExecutionSummary>(notebookExecutions.length));
        }
        for (NotebookExecutionSummary ele : notebookExecutions) {
            this.notebookExecutions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of notebook executions.
     * </p>
     * 
     * @param notebookExecutions
     *        A list of notebook executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotebookExecutionsResult withNotebookExecutions(java.util.Collection<NotebookExecutionSummary> notebookExecutions) {
        setNotebookExecutions(notebookExecutions);
        return this;
    }

    /**
     * <p>
     * A pagination token that a subsequent <code>ListNotebookExecutions</code> can use to determine the next set of
     * results to retrieve.
     * </p>
     * 
     * @param marker
     *        A pagination token that a subsequent <code>ListNotebookExecutions</code> can use to determine the next set
     *        of results to retrieve.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token that a subsequent <code>ListNotebookExecutions</code> can use to determine the next set of
     * results to retrieve.
     * </p>
     * 
     * @return A pagination token that a subsequent <code>ListNotebookExecutions</code> can use to determine the next
     *         set of results to retrieve.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A pagination token that a subsequent <code>ListNotebookExecutions</code> can use to determine the next set of
     * results to retrieve.
     * </p>
     * 
     * @param marker
     *        A pagination token that a subsequent <code>ListNotebookExecutions</code> can use to determine the next set
     *        of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotebookExecutionsResult withMarker(String marker) {
        setMarker(marker);
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
        if (getNotebookExecutions() != null)
            sb.append("NotebookExecutions: ").append(getNotebookExecutions()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListNotebookExecutionsResult == false)
            return false;
        ListNotebookExecutionsResult other = (ListNotebookExecutionsResult) obj;
        if (other.getNotebookExecutions() == null ^ this.getNotebookExecutions() == null)
            return false;
        if (other.getNotebookExecutions() != null && other.getNotebookExecutions().equals(this.getNotebookExecutions()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotebookExecutions() == null) ? 0 : getNotebookExecutions().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListNotebookExecutionsResult clone() {
        try {
            return (ListNotebookExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
