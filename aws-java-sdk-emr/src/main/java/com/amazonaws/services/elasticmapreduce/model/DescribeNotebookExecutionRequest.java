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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DescribeNotebookExecution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNotebookExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the notebook execution.
     * </p>
     */
    private String notebookExecutionId;

    /**
     * <p>
     * The unique identifier of the notebook execution.
     * </p>
     * 
     * @param notebookExecutionId
     *        The unique identifier of the notebook execution.
     */

    public void setNotebookExecutionId(String notebookExecutionId) {
        this.notebookExecutionId = notebookExecutionId;
    }

    /**
     * <p>
     * The unique identifier of the notebook execution.
     * </p>
     * 
     * @return The unique identifier of the notebook execution.
     */

    public String getNotebookExecutionId() {
        return this.notebookExecutionId;
    }

    /**
     * <p>
     * The unique identifier of the notebook execution.
     * </p>
     * 
     * @param notebookExecutionId
     *        The unique identifier of the notebook execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotebookExecutionRequest withNotebookExecutionId(String notebookExecutionId) {
        setNotebookExecutionId(notebookExecutionId);
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
        if (getNotebookExecutionId() != null)
            sb.append("NotebookExecutionId: ").append(getNotebookExecutionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNotebookExecutionRequest == false)
            return false;
        DescribeNotebookExecutionRequest other = (DescribeNotebookExecutionRequest) obj;
        if (other.getNotebookExecutionId() == null ^ this.getNotebookExecutionId() == null)
            return false;
        if (other.getNotebookExecutionId() != null && other.getNotebookExecutionId().equals(this.getNotebookExecutionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotebookExecutionId() == null) ? 0 : getNotebookExecutionId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNotebookExecutionRequest clone() {
        return (DescribeNotebookExecutionRequest) super.clone();
    }

}
