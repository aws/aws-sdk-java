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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The statistics of a mitigation action task.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectMitigationActionsTaskStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The actions that were performed.
     * </p>
     */
    private Long actionsExecuted;
    /**
     * <p>
     * The actions that were skipped.
     * </p>
     */
    private Long actionsSkipped;
    /**
     * <p>
     * The actions that failed.
     * </p>
     */
    private Long actionsFailed;

    /**
     * <p>
     * The actions that were performed.
     * </p>
     * 
     * @param actionsExecuted
     *        The actions that were performed.
     */

    public void setActionsExecuted(Long actionsExecuted) {
        this.actionsExecuted = actionsExecuted;
    }

    /**
     * <p>
     * The actions that were performed.
     * </p>
     * 
     * @return The actions that were performed.
     */

    public Long getActionsExecuted() {
        return this.actionsExecuted;
    }

    /**
     * <p>
     * The actions that were performed.
     * </p>
     * 
     * @param actionsExecuted
     *        The actions that were performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionsTaskStatistics withActionsExecuted(Long actionsExecuted) {
        setActionsExecuted(actionsExecuted);
        return this;
    }

    /**
     * <p>
     * The actions that were skipped.
     * </p>
     * 
     * @param actionsSkipped
     *        The actions that were skipped.
     */

    public void setActionsSkipped(Long actionsSkipped) {
        this.actionsSkipped = actionsSkipped;
    }

    /**
     * <p>
     * The actions that were skipped.
     * </p>
     * 
     * @return The actions that were skipped.
     */

    public Long getActionsSkipped() {
        return this.actionsSkipped;
    }

    /**
     * <p>
     * The actions that were skipped.
     * </p>
     * 
     * @param actionsSkipped
     *        The actions that were skipped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionsTaskStatistics withActionsSkipped(Long actionsSkipped) {
        setActionsSkipped(actionsSkipped);
        return this;
    }

    /**
     * <p>
     * The actions that failed.
     * </p>
     * 
     * @param actionsFailed
     *        The actions that failed.
     */

    public void setActionsFailed(Long actionsFailed) {
        this.actionsFailed = actionsFailed;
    }

    /**
     * <p>
     * The actions that failed.
     * </p>
     * 
     * @return The actions that failed.
     */

    public Long getActionsFailed() {
        return this.actionsFailed;
    }

    /**
     * <p>
     * The actions that failed.
     * </p>
     * 
     * @param actionsFailed
     *        The actions that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionsTaskStatistics withActionsFailed(Long actionsFailed) {
        setActionsFailed(actionsFailed);
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
        if (getActionsExecuted() != null)
            sb.append("ActionsExecuted: ").append(getActionsExecuted()).append(",");
        if (getActionsSkipped() != null)
            sb.append("ActionsSkipped: ").append(getActionsSkipped()).append(",");
        if (getActionsFailed() != null)
            sb.append("ActionsFailed: ").append(getActionsFailed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectMitigationActionsTaskStatistics == false)
            return false;
        DetectMitigationActionsTaskStatistics other = (DetectMitigationActionsTaskStatistics) obj;
        if (other.getActionsExecuted() == null ^ this.getActionsExecuted() == null)
            return false;
        if (other.getActionsExecuted() != null && other.getActionsExecuted().equals(this.getActionsExecuted()) == false)
            return false;
        if (other.getActionsSkipped() == null ^ this.getActionsSkipped() == null)
            return false;
        if (other.getActionsSkipped() != null && other.getActionsSkipped().equals(this.getActionsSkipped()) == false)
            return false;
        if (other.getActionsFailed() == null ^ this.getActionsFailed() == null)
            return false;
        if (other.getActionsFailed() != null && other.getActionsFailed().equals(this.getActionsFailed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionsExecuted() == null) ? 0 : getActionsExecuted().hashCode());
        hashCode = prime * hashCode + ((getActionsSkipped() == null) ? 0 : getActionsSkipped().hashCode());
        hashCode = prime * hashCode + ((getActionsFailed() == null) ? 0 : getActionsFailed().hashCode());
        return hashCode;
    }

    @Override
    public DetectMitigationActionsTaskStatistics clone() {
        try {
            return (DetectMitigationActionsTaskStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.DetectMitigationActionsTaskStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
