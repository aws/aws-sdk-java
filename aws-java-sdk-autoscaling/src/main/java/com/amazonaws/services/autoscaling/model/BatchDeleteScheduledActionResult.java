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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/BatchDeleteScheduledAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteScheduledActionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the scheduled actions that could not be deleted, including an error message.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FailedScheduledUpdateGroupActionRequest> failedScheduledActions;

    /**
     * <p>
     * The names of the scheduled actions that could not be deleted, including an error message.
     * </p>
     * 
     * @return The names of the scheduled actions that could not be deleted, including an error message.
     */

    public java.util.List<FailedScheduledUpdateGroupActionRequest> getFailedScheduledActions() {
        if (failedScheduledActions == null) {
            failedScheduledActions = new com.amazonaws.internal.SdkInternalList<FailedScheduledUpdateGroupActionRequest>();
        }
        return failedScheduledActions;
    }

    /**
     * <p>
     * The names of the scheduled actions that could not be deleted, including an error message.
     * </p>
     * 
     * @param failedScheduledActions
     *        The names of the scheduled actions that could not be deleted, including an error message.
     */

    public void setFailedScheduledActions(java.util.Collection<FailedScheduledUpdateGroupActionRequest> failedScheduledActions) {
        if (failedScheduledActions == null) {
            this.failedScheduledActions = null;
            return;
        }

        this.failedScheduledActions = new com.amazonaws.internal.SdkInternalList<FailedScheduledUpdateGroupActionRequest>(failedScheduledActions);
    }

    /**
     * <p>
     * The names of the scheduled actions that could not be deleted, including an error message.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedScheduledActions(java.util.Collection)} or
     * {@link #withFailedScheduledActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param failedScheduledActions
     *        The names of the scheduled actions that could not be deleted, including an error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteScheduledActionResult withFailedScheduledActions(FailedScheduledUpdateGroupActionRequest... failedScheduledActions) {
        if (this.failedScheduledActions == null) {
            setFailedScheduledActions(new com.amazonaws.internal.SdkInternalList<FailedScheduledUpdateGroupActionRequest>(failedScheduledActions.length));
        }
        for (FailedScheduledUpdateGroupActionRequest ele : failedScheduledActions) {
            this.failedScheduledActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the scheduled actions that could not be deleted, including an error message.
     * </p>
     * 
     * @param failedScheduledActions
     *        The names of the scheduled actions that could not be deleted, including an error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteScheduledActionResult withFailedScheduledActions(java.util.Collection<FailedScheduledUpdateGroupActionRequest> failedScheduledActions) {
        setFailedScheduledActions(failedScheduledActions);
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
        if (getFailedScheduledActions() != null)
            sb.append("FailedScheduledActions: ").append(getFailedScheduledActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteScheduledActionResult == false)
            return false;
        BatchDeleteScheduledActionResult other = (BatchDeleteScheduledActionResult) obj;
        if (other.getFailedScheduledActions() == null ^ this.getFailedScheduledActions() == null)
            return false;
        if (other.getFailedScheduledActions() != null && other.getFailedScheduledActions().equals(this.getFailedScheduledActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedScheduledActions() == null) ? 0 : getFailedScheduledActions().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteScheduledActionResult clone() {
        try {
            return (BatchDeleteScheduledActionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
