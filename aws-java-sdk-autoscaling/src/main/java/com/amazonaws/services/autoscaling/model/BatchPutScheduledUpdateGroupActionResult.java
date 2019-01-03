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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/BatchPutScheduledUpdateGroupAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPutScheduledUpdateGroupActionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The names of the scheduled actions that could not be created or updated, including an error message.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FailedScheduledUpdateGroupActionRequest> failedScheduledUpdateGroupActions;

    /**
     * <p>
     * The names of the scheduled actions that could not be created or updated, including an error message.
     * </p>
     * 
     * @return The names of the scheduled actions that could not be created or updated, including an error message.
     */

    public java.util.List<FailedScheduledUpdateGroupActionRequest> getFailedScheduledUpdateGroupActions() {
        if (failedScheduledUpdateGroupActions == null) {
            failedScheduledUpdateGroupActions = new com.amazonaws.internal.SdkInternalList<FailedScheduledUpdateGroupActionRequest>();
        }
        return failedScheduledUpdateGroupActions;
    }

    /**
     * <p>
     * The names of the scheduled actions that could not be created or updated, including an error message.
     * </p>
     * 
     * @param failedScheduledUpdateGroupActions
     *        The names of the scheduled actions that could not be created or updated, including an error message.
     */

    public void setFailedScheduledUpdateGroupActions(java.util.Collection<FailedScheduledUpdateGroupActionRequest> failedScheduledUpdateGroupActions) {
        if (failedScheduledUpdateGroupActions == null) {
            this.failedScheduledUpdateGroupActions = null;
            return;
        }

        this.failedScheduledUpdateGroupActions = new com.amazonaws.internal.SdkInternalList<FailedScheduledUpdateGroupActionRequest>(
                failedScheduledUpdateGroupActions);
    }

    /**
     * <p>
     * The names of the scheduled actions that could not be created or updated, including an error message.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedScheduledUpdateGroupActions(java.util.Collection)} or
     * {@link #withFailedScheduledUpdateGroupActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param failedScheduledUpdateGroupActions
     *        The names of the scheduled actions that could not be created or updated, including an error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutScheduledUpdateGroupActionResult withFailedScheduledUpdateGroupActions(
            FailedScheduledUpdateGroupActionRequest... failedScheduledUpdateGroupActions) {
        if (this.failedScheduledUpdateGroupActions == null) {
            setFailedScheduledUpdateGroupActions(new com.amazonaws.internal.SdkInternalList<FailedScheduledUpdateGroupActionRequest>(
                    failedScheduledUpdateGroupActions.length));
        }
        for (FailedScheduledUpdateGroupActionRequest ele : failedScheduledUpdateGroupActions) {
            this.failedScheduledUpdateGroupActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the scheduled actions that could not be created or updated, including an error message.
     * </p>
     * 
     * @param failedScheduledUpdateGroupActions
     *        The names of the scheduled actions that could not be created or updated, including an error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutScheduledUpdateGroupActionResult withFailedScheduledUpdateGroupActions(
            java.util.Collection<FailedScheduledUpdateGroupActionRequest> failedScheduledUpdateGroupActions) {
        setFailedScheduledUpdateGroupActions(failedScheduledUpdateGroupActions);
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
        if (getFailedScheduledUpdateGroupActions() != null)
            sb.append("FailedScheduledUpdateGroupActions: ").append(getFailedScheduledUpdateGroupActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutScheduledUpdateGroupActionResult == false)
            return false;
        BatchPutScheduledUpdateGroupActionResult other = (BatchPutScheduledUpdateGroupActionResult) obj;
        if (other.getFailedScheduledUpdateGroupActions() == null ^ this.getFailedScheduledUpdateGroupActions() == null)
            return false;
        if (other.getFailedScheduledUpdateGroupActions() != null
                && other.getFailedScheduledUpdateGroupActions().equals(this.getFailedScheduledUpdateGroupActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedScheduledUpdateGroupActions() == null) ? 0 : getFailedScheduledUpdateGroupActions().hashCode());
        return hashCode;
    }

    @Override
    public BatchPutScheduledUpdateGroupActionResult clone() {
        try {
            return (BatchPutScheduledUpdateGroupActionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
