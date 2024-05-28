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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/BatchDeleteUniqueId"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteUniqueIdRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The input source for the batch delete unique ID operation.
     * </p>
     */
    private String inputSource;
    /**
     * <p>
     * The unique IDs to delete.
     * </p>
     */
    private java.util.List<String> uniqueIds;
    /**
     * <p>
     * The name of the workflow.
     * </p>
     */
    private String workflowName;

    /**
     * <p>
     * The input source for the batch delete unique ID operation.
     * </p>
     * 
     * @param inputSource
     *        The input source for the batch delete unique ID operation.
     */

    public void setInputSource(String inputSource) {
        this.inputSource = inputSource;
    }

    /**
     * <p>
     * The input source for the batch delete unique ID operation.
     * </p>
     * 
     * @return The input source for the batch delete unique ID operation.
     */

    public String getInputSource() {
        return this.inputSource;
    }

    /**
     * <p>
     * The input source for the batch delete unique ID operation.
     * </p>
     * 
     * @param inputSource
     *        The input source for the batch delete unique ID operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteUniqueIdRequest withInputSource(String inputSource) {
        setInputSource(inputSource);
        return this;
    }

    /**
     * <p>
     * The unique IDs to delete.
     * </p>
     * 
     * @return The unique IDs to delete.
     */

    public java.util.List<String> getUniqueIds() {
        return uniqueIds;
    }

    /**
     * <p>
     * The unique IDs to delete.
     * </p>
     * 
     * @param uniqueIds
     *        The unique IDs to delete.
     */

    public void setUniqueIds(java.util.Collection<String> uniqueIds) {
        if (uniqueIds == null) {
            this.uniqueIds = null;
            return;
        }

        this.uniqueIds = new java.util.ArrayList<String>(uniqueIds);
    }

    /**
     * <p>
     * The unique IDs to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUniqueIds(java.util.Collection)} or {@link #withUniqueIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param uniqueIds
     *        The unique IDs to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteUniqueIdRequest withUniqueIds(String... uniqueIds) {
        if (this.uniqueIds == null) {
            setUniqueIds(new java.util.ArrayList<String>(uniqueIds.length));
        }
        for (String ele : uniqueIds) {
            this.uniqueIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique IDs to delete.
     * </p>
     * 
     * @param uniqueIds
     *        The unique IDs to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteUniqueIdRequest withUniqueIds(java.util.Collection<String> uniqueIds) {
        setUniqueIds(uniqueIds);
        return this;
    }

    /**
     * <p>
     * The name of the workflow.
     * </p>
     * 
     * @param workflowName
     *        The name of the workflow.
     */

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    /**
     * <p>
     * The name of the workflow.
     * </p>
     * 
     * @return The name of the workflow.
     */

    public String getWorkflowName() {
        return this.workflowName;
    }

    /**
     * <p>
     * The name of the workflow.
     * </p>
     * 
     * @param workflowName
     *        The name of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteUniqueIdRequest withWorkflowName(String workflowName) {
        setWorkflowName(workflowName);
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
        if (getInputSource() != null)
            sb.append("InputSource: ").append(getInputSource()).append(",");
        if (getUniqueIds() != null)
            sb.append("UniqueIds: ").append(getUniqueIds()).append(",");
        if (getWorkflowName() != null)
            sb.append("WorkflowName: ").append(getWorkflowName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteUniqueIdRequest == false)
            return false;
        BatchDeleteUniqueIdRequest other = (BatchDeleteUniqueIdRequest) obj;
        if (other.getInputSource() == null ^ this.getInputSource() == null)
            return false;
        if (other.getInputSource() != null && other.getInputSource().equals(this.getInputSource()) == false)
            return false;
        if (other.getUniqueIds() == null ^ this.getUniqueIds() == null)
            return false;
        if (other.getUniqueIds() != null && other.getUniqueIds().equals(this.getUniqueIds()) == false)
            return false;
        if (other.getWorkflowName() == null ^ this.getWorkflowName() == null)
            return false;
        if (other.getWorkflowName() != null && other.getWorkflowName().equals(this.getWorkflowName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputSource() == null) ? 0 : getInputSource().hashCode());
        hashCode = prime * hashCode + ((getUniqueIds() == null) ? 0 : getUniqueIds().hashCode());
        hashCode = prime * hashCode + ((getWorkflowName() == null) ? 0 : getWorkflowName().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteUniqueIdRequest clone() {
        return (BatchDeleteUniqueIdRequest) super.clone();
    }

}
