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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DescribeNotebookExecution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNotebookExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Properties of the notebook execution.
     * </p>
     */
    private NotebookExecution notebookExecution;

    /**
     * <p>
     * Properties of the notebook execution.
     * </p>
     * 
     * @param notebookExecution
     *        Properties of the notebook execution.
     */

    public void setNotebookExecution(NotebookExecution notebookExecution) {
        this.notebookExecution = notebookExecution;
    }

    /**
     * <p>
     * Properties of the notebook execution.
     * </p>
     * 
     * @return Properties of the notebook execution.
     */

    public NotebookExecution getNotebookExecution() {
        return this.notebookExecution;
    }

    /**
     * <p>
     * Properties of the notebook execution.
     * </p>
     * 
     * @param notebookExecution
     *        Properties of the notebook execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotebookExecutionResult withNotebookExecution(NotebookExecution notebookExecution) {
        setNotebookExecution(notebookExecution);
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
        if (getNotebookExecution() != null)
            sb.append("NotebookExecution: ").append(getNotebookExecution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNotebookExecutionResult == false)
            return false;
        DescribeNotebookExecutionResult other = (DescribeNotebookExecutionResult) obj;
        if (other.getNotebookExecution() == null ^ this.getNotebookExecution() == null)
            return false;
        if (other.getNotebookExecution() != null && other.getNotebookExecution().equals(this.getNotebookExecution()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotebookExecution() == null) ? 0 : getNotebookExecution().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNotebookExecutionResult clone() {
        try {
            return (DescribeNotebookExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
