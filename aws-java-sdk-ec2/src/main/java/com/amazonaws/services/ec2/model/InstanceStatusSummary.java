/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the status of an instance.
 * </p>
 */
public class InstanceStatusSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The system instance health or application instance health.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceStatusDetails> details;

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @see SummaryStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @return The status.
     * @see SummaryStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SummaryStatus
     */

    public InstanceStatusSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @see SummaryStatus
     */

    public void setStatus(SummaryStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SummaryStatus
     */

    public InstanceStatusSummary withStatus(SummaryStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The system instance health or application instance health.
     * </p>
     * 
     * @return The system instance health or application instance health.
     */

    public java.util.List<InstanceStatusDetails> getDetails() {
        if (details == null) {
            details = new com.amazonaws.internal.SdkInternalList<InstanceStatusDetails>();
        }
        return details;
    }

    /**
     * <p>
     * The system instance health or application instance health.
     * </p>
     * 
     * @param details
     *        The system instance health or application instance health.
     */

    public void setDetails(java.util.Collection<InstanceStatusDetails> details) {
        if (details == null) {
            this.details = null;
            return;
        }

        this.details = new com.amazonaws.internal.SdkInternalList<InstanceStatusDetails>(details);
    }

    /**
     * <p>
     * The system instance health or application instance health.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetails(java.util.Collection)} or {@link #withDetails(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param details
     *        The system instance health or application instance health.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStatusSummary withDetails(InstanceStatusDetails... details) {
        if (this.details == null) {
            setDetails(new com.amazonaws.internal.SdkInternalList<InstanceStatusDetails>(details.length));
        }
        for (InstanceStatusDetails ele : details) {
            this.details.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The system instance health or application instance health.
     * </p>
     * 
     * @param details
     *        The system instance health or application instance health.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStatusSummary withDetails(java.util.Collection<InstanceStatusDetails> details) {
        setDetails(details);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getDetails() != null)
            sb.append("Details: " + getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceStatusSummary == false)
            return false;
        InstanceStatusSummary other = (InstanceStatusSummary) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public InstanceStatusSummary clone() {
        try {
            return (InstanceStatusSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
