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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a pending database maintenance action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PendingMaintenanceAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PendingMaintenanceAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of pending database maintenance action.
     * </p>
     */
    private String action;
    /**
     * <p>
     * Additional detail about the pending database maintenance action.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The effective date of the pending database maintenance action.
     * </p>
     */
    private java.util.Date currentApplyDate;

    /**
     * <p>
     * The type of pending database maintenance action.
     * </p>
     * 
     * @param action
     *        The type of pending database maintenance action.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The type of pending database maintenance action.
     * </p>
     * 
     * @return The type of pending database maintenance action.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The type of pending database maintenance action.
     * </p>
     * 
     * @param action
     *        The type of pending database maintenance action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingMaintenanceAction withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Additional detail about the pending database maintenance action.
     * </p>
     * 
     * @param description
     *        Additional detail about the pending database maintenance action.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Additional detail about the pending database maintenance action.
     * </p>
     * 
     * @return Additional detail about the pending database maintenance action.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Additional detail about the pending database maintenance action.
     * </p>
     * 
     * @param description
     *        Additional detail about the pending database maintenance action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingMaintenanceAction withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The effective date of the pending database maintenance action.
     * </p>
     * 
     * @param currentApplyDate
     *        The effective date of the pending database maintenance action.
     */

    public void setCurrentApplyDate(java.util.Date currentApplyDate) {
        this.currentApplyDate = currentApplyDate;
    }

    /**
     * <p>
     * The effective date of the pending database maintenance action.
     * </p>
     * 
     * @return The effective date of the pending database maintenance action.
     */

    public java.util.Date getCurrentApplyDate() {
        return this.currentApplyDate;
    }

    /**
     * <p>
     * The effective date of the pending database maintenance action.
     * </p>
     * 
     * @param currentApplyDate
     *        The effective date of the pending database maintenance action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingMaintenanceAction withCurrentApplyDate(java.util.Date currentApplyDate) {
        setCurrentApplyDate(currentApplyDate);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCurrentApplyDate() != null)
            sb.append("CurrentApplyDate: ").append(getCurrentApplyDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PendingMaintenanceAction == false)
            return false;
        PendingMaintenanceAction other = (PendingMaintenanceAction) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCurrentApplyDate() == null ^ this.getCurrentApplyDate() == null)
            return false;
        if (other.getCurrentApplyDate() != null && other.getCurrentApplyDate().equals(this.getCurrentApplyDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCurrentApplyDate() == null) ? 0 : getCurrentApplyDate().hashCode());
        return hashCode;
    }

    @Override
    public PendingMaintenanceAction clone() {
        try {
            return (PendingMaintenanceAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.PendingMaintenanceActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
