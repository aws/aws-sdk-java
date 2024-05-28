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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateScheduledActionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the rescheduled action.
     * </p>
     */
    private ScheduledAction scheduledAction;

    /**
     * <p>
     * Information about the rescheduled action.
     * </p>
     * 
     * @param scheduledAction
     *        Information about the rescheduled action.
     */

    public void setScheduledAction(ScheduledAction scheduledAction) {
        this.scheduledAction = scheduledAction;
    }

    /**
     * <p>
     * Information about the rescheduled action.
     * </p>
     * 
     * @return Information about the rescheduled action.
     */

    public ScheduledAction getScheduledAction() {
        return this.scheduledAction;
    }

    /**
     * <p>
     * Information about the rescheduled action.
     * </p>
     * 
     * @param scheduledAction
     *        Information about the rescheduled action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduledActionResult withScheduledAction(ScheduledAction scheduledAction) {
        setScheduledAction(scheduledAction);
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
        if (getScheduledAction() != null)
            sb.append("ScheduledAction: ").append(getScheduledAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateScheduledActionResult == false)
            return false;
        UpdateScheduledActionResult other = (UpdateScheduledActionResult) obj;
        if (other.getScheduledAction() == null ^ this.getScheduledAction() == null)
            return false;
        if (other.getScheduledAction() != null && other.getScheduledAction().equals(this.getScheduledAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduledAction() == null) ? 0 : getScheduledAction().hashCode());
        return hashCode;
    }

    @Override
    public UpdateScheduledActionResult clone() {
        try {
            return (UpdateScheduledActionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
