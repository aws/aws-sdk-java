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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A list of schedule actions to create (in a request) or that have been created (in a response).
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchScheduleActionCreateRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchScheduleActionCreateRequest implements Serializable, Cloneable, StructuredPojo {

    /** A list of schedule actions to create. */
    private java.util.List<ScheduleAction> scheduleActions;

    /**
     * A list of schedule actions to create.
     * 
     * @return A list of schedule actions to create.
     */

    public java.util.List<ScheduleAction> getScheduleActions() {
        return scheduleActions;
    }

    /**
     * A list of schedule actions to create.
     * 
     * @param scheduleActions
     *        A list of schedule actions to create.
     */

    public void setScheduleActions(java.util.Collection<ScheduleAction> scheduleActions) {
        if (scheduleActions == null) {
            this.scheduleActions = null;
            return;
        }

        this.scheduleActions = new java.util.ArrayList<ScheduleAction>(scheduleActions);
    }

    /**
     * A list of schedule actions to create.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScheduleActions(java.util.Collection)} or {@link #withScheduleActions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param scheduleActions
     *        A list of schedule actions to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchScheduleActionCreateRequest withScheduleActions(ScheduleAction... scheduleActions) {
        if (this.scheduleActions == null) {
            setScheduleActions(new java.util.ArrayList<ScheduleAction>(scheduleActions.length));
        }
        for (ScheduleAction ele : scheduleActions) {
            this.scheduleActions.add(ele);
        }
        return this;
    }

    /**
     * A list of schedule actions to create.
     * 
     * @param scheduleActions
     *        A list of schedule actions to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchScheduleActionCreateRequest withScheduleActions(java.util.Collection<ScheduleAction> scheduleActions) {
        setScheduleActions(scheduleActions);
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
        if (getScheduleActions() != null)
            sb.append("ScheduleActions: ").append(getScheduleActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchScheduleActionCreateRequest == false)
            return false;
        BatchScheduleActionCreateRequest other = (BatchScheduleActionCreateRequest) obj;
        if (other.getScheduleActions() == null ^ this.getScheduleActions() == null)
            return false;
        if (other.getScheduleActions() != null && other.getScheduleActions().equals(this.getScheduleActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduleActions() == null) ? 0 : getScheduleActions().hashCode());
        return hashCode;
    }

    @Override
    public BatchScheduleActionCreateRequest clone() {
        try {
            return (BatchScheduleActionCreateRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.BatchScheduleActionCreateRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
