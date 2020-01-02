/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/BatchStopUpdateAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchStopUpdateActionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Update actions that have been processed successfully
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ProcessedUpdateAction> processedUpdateActions;
    /**
     * <p>
     * Update actions that haven't been processed successfully
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<UnprocessedUpdateAction> unprocessedUpdateActions;

    /**
     * <p>
     * Update actions that have been processed successfully
     * </p>
     * 
     * @return Update actions that have been processed successfully
     */

    public java.util.List<ProcessedUpdateAction> getProcessedUpdateActions() {
        if (processedUpdateActions == null) {
            processedUpdateActions = new com.amazonaws.internal.SdkInternalList<ProcessedUpdateAction>();
        }
        return processedUpdateActions;
    }

    /**
     * <p>
     * Update actions that have been processed successfully
     * </p>
     * 
     * @param processedUpdateActions
     *        Update actions that have been processed successfully
     */

    public void setProcessedUpdateActions(java.util.Collection<ProcessedUpdateAction> processedUpdateActions) {
        if (processedUpdateActions == null) {
            this.processedUpdateActions = null;
            return;
        }

        this.processedUpdateActions = new com.amazonaws.internal.SdkInternalList<ProcessedUpdateAction>(processedUpdateActions);
    }

    /**
     * <p>
     * Update actions that have been processed successfully
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessedUpdateActions(java.util.Collection)} or
     * {@link #withProcessedUpdateActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param processedUpdateActions
     *        Update actions that have been processed successfully
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopUpdateActionResult withProcessedUpdateActions(ProcessedUpdateAction... processedUpdateActions) {
        if (this.processedUpdateActions == null) {
            setProcessedUpdateActions(new com.amazonaws.internal.SdkInternalList<ProcessedUpdateAction>(processedUpdateActions.length));
        }
        for (ProcessedUpdateAction ele : processedUpdateActions) {
            this.processedUpdateActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Update actions that have been processed successfully
     * </p>
     * 
     * @param processedUpdateActions
     *        Update actions that have been processed successfully
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopUpdateActionResult withProcessedUpdateActions(java.util.Collection<ProcessedUpdateAction> processedUpdateActions) {
        setProcessedUpdateActions(processedUpdateActions);
        return this;
    }

    /**
     * <p>
     * Update actions that haven't been processed successfully
     * </p>
     * 
     * @return Update actions that haven't been processed successfully
     */

    public java.util.List<UnprocessedUpdateAction> getUnprocessedUpdateActions() {
        if (unprocessedUpdateActions == null) {
            unprocessedUpdateActions = new com.amazonaws.internal.SdkInternalList<UnprocessedUpdateAction>();
        }
        return unprocessedUpdateActions;
    }

    /**
     * <p>
     * Update actions that haven't been processed successfully
     * </p>
     * 
     * @param unprocessedUpdateActions
     *        Update actions that haven't been processed successfully
     */

    public void setUnprocessedUpdateActions(java.util.Collection<UnprocessedUpdateAction> unprocessedUpdateActions) {
        if (unprocessedUpdateActions == null) {
            this.unprocessedUpdateActions = null;
            return;
        }

        this.unprocessedUpdateActions = new com.amazonaws.internal.SdkInternalList<UnprocessedUpdateAction>(unprocessedUpdateActions);
    }

    /**
     * <p>
     * Update actions that haven't been processed successfully
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedUpdateActions(java.util.Collection)} or
     * {@link #withUnprocessedUpdateActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedUpdateActions
     *        Update actions that haven't been processed successfully
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopUpdateActionResult withUnprocessedUpdateActions(UnprocessedUpdateAction... unprocessedUpdateActions) {
        if (this.unprocessedUpdateActions == null) {
            setUnprocessedUpdateActions(new com.amazonaws.internal.SdkInternalList<UnprocessedUpdateAction>(unprocessedUpdateActions.length));
        }
        for (UnprocessedUpdateAction ele : unprocessedUpdateActions) {
            this.unprocessedUpdateActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Update actions that haven't been processed successfully
     * </p>
     * 
     * @param unprocessedUpdateActions
     *        Update actions that haven't been processed successfully
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopUpdateActionResult withUnprocessedUpdateActions(java.util.Collection<UnprocessedUpdateAction> unprocessedUpdateActions) {
        setUnprocessedUpdateActions(unprocessedUpdateActions);
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
        if (getProcessedUpdateActions() != null)
            sb.append("ProcessedUpdateActions: ").append(getProcessedUpdateActions()).append(",");
        if (getUnprocessedUpdateActions() != null)
            sb.append("UnprocessedUpdateActions: ").append(getUnprocessedUpdateActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchStopUpdateActionResult == false)
            return false;
        BatchStopUpdateActionResult other = (BatchStopUpdateActionResult) obj;
        if (other.getProcessedUpdateActions() == null ^ this.getProcessedUpdateActions() == null)
            return false;
        if (other.getProcessedUpdateActions() != null && other.getProcessedUpdateActions().equals(this.getProcessedUpdateActions()) == false)
            return false;
        if (other.getUnprocessedUpdateActions() == null ^ this.getUnprocessedUpdateActions() == null)
            return false;
        if (other.getUnprocessedUpdateActions() != null && other.getUnprocessedUpdateActions().equals(this.getUnprocessedUpdateActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProcessedUpdateActions() == null) ? 0 : getProcessedUpdateActions().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedUpdateActions() == null) ? 0 : getUnprocessedUpdateActions().hashCode());
        return hashCode;
    }

    @Override
    public BatchStopUpdateActionResult clone() {
        try {
            return (BatchStopUpdateActionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
