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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListNotebookInstances" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNotebookInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If the response to the previous <code>ListNotebookInstances</code> request was truncated, Amazon SageMaker
     * returns this token. To retrieve the next set of notebook instances, use the token in the next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of <code>NotebookInstanceSummary</code> objects, one for each notebook instance.
     * </p>
     */
    private java.util.List<NotebookInstanceSummary> notebookInstances;

    /**
     * <p>
     * If the response to the previous <code>ListNotebookInstances</code> request was truncated, Amazon SageMaker
     * returns this token. To retrieve the next set of notebook instances, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response to the previous <code>ListNotebookInstances</code> request was truncated, Amazon SageMaker
     *        returns this token. To retrieve the next set of notebook instances, use the token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response to the previous <code>ListNotebookInstances</code> request was truncated, Amazon SageMaker
     * returns this token. To retrieve the next set of notebook instances, use the token in the next request.
     * </p>
     * 
     * @return If the response to the previous <code>ListNotebookInstances</code> request was truncated, Amazon
     *         SageMaker returns this token. To retrieve the next set of notebook instances, use the token in the next
     *         request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response to the previous <code>ListNotebookInstances</code> request was truncated, Amazon SageMaker
     * returns this token. To retrieve the next set of notebook instances, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response to the previous <code>ListNotebookInstances</code> request was truncated, Amazon SageMaker
     *        returns this token. To retrieve the next set of notebook instances, use the token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotebookInstancesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of <code>NotebookInstanceSummary</code> objects, one for each notebook instance.
     * </p>
     * 
     * @return An array of <code>NotebookInstanceSummary</code> objects, one for each notebook instance.
     */

    public java.util.List<NotebookInstanceSummary> getNotebookInstances() {
        return notebookInstances;
    }

    /**
     * <p>
     * An array of <code>NotebookInstanceSummary</code> objects, one for each notebook instance.
     * </p>
     * 
     * @param notebookInstances
     *        An array of <code>NotebookInstanceSummary</code> objects, one for each notebook instance.
     */

    public void setNotebookInstances(java.util.Collection<NotebookInstanceSummary> notebookInstances) {
        if (notebookInstances == null) {
            this.notebookInstances = null;
            return;
        }

        this.notebookInstances = new java.util.ArrayList<NotebookInstanceSummary>(notebookInstances);
    }

    /**
     * <p>
     * An array of <code>NotebookInstanceSummary</code> objects, one for each notebook instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotebookInstances(java.util.Collection)} or {@link #withNotebookInstances(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param notebookInstances
     *        An array of <code>NotebookInstanceSummary</code> objects, one for each notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotebookInstancesResult withNotebookInstances(NotebookInstanceSummary... notebookInstances) {
        if (this.notebookInstances == null) {
            setNotebookInstances(new java.util.ArrayList<NotebookInstanceSummary>(notebookInstances.length));
        }
        for (NotebookInstanceSummary ele : notebookInstances) {
            this.notebookInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>NotebookInstanceSummary</code> objects, one for each notebook instance.
     * </p>
     * 
     * @param notebookInstances
     *        An array of <code>NotebookInstanceSummary</code> objects, one for each notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotebookInstancesResult withNotebookInstances(java.util.Collection<NotebookInstanceSummary> notebookInstances) {
        setNotebookInstances(notebookInstances);
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
        if (getNotebookInstances() != null)
            sb.append("NotebookInstances: ").append(getNotebookInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListNotebookInstancesResult == false)
            return false;
        ListNotebookInstancesResult other = (ListNotebookInstancesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getNotebookInstances() == null ^ this.getNotebookInstances() == null)
            return false;
        if (other.getNotebookInstances() != null && other.getNotebookInstances().equals(this.getNotebookInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getNotebookInstances() == null) ? 0 : getNotebookInstances().hashCode());
        return hashCode;
    }

    @Override
    public ListNotebookInstancesResult clone() {
        try {
            return (ListNotebookInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
