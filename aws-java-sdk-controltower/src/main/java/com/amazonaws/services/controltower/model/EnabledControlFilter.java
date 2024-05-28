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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that returns a set of control identifiers, the control status for each control in the set, and the drift
 * status for each control in the set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/EnabledControlFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnabledControlFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The set of <code>controlIdentifier</code> returned by the filter.
     * </p>
     */
    private java.util.List<String> controlIdentifiers;
    /**
     * <p>
     * A list of <code>DriftStatus</code> items.
     * </p>
     */
    private java.util.List<String> driftStatuses;
    /**
     * <p>
     * A list of <code>EnablementStatus</code> items.
     * </p>
     */
    private java.util.List<String> statuses;

    /**
     * <p>
     * The set of <code>controlIdentifier</code> returned by the filter.
     * </p>
     * 
     * @return The set of <code>controlIdentifier</code> returned by the filter.
     */

    public java.util.List<String> getControlIdentifiers() {
        return controlIdentifiers;
    }

    /**
     * <p>
     * The set of <code>controlIdentifier</code> returned by the filter.
     * </p>
     * 
     * @param controlIdentifiers
     *        The set of <code>controlIdentifier</code> returned by the filter.
     */

    public void setControlIdentifiers(java.util.Collection<String> controlIdentifiers) {
        if (controlIdentifiers == null) {
            this.controlIdentifiers = null;
            return;
        }

        this.controlIdentifiers = new java.util.ArrayList<String>(controlIdentifiers);
    }

    /**
     * <p>
     * The set of <code>controlIdentifier</code> returned by the filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setControlIdentifiers(java.util.Collection)} or {@link #withControlIdentifiers(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param controlIdentifiers
     *        The set of <code>controlIdentifier</code> returned by the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledControlFilter withControlIdentifiers(String... controlIdentifiers) {
        if (this.controlIdentifiers == null) {
            setControlIdentifiers(new java.util.ArrayList<String>(controlIdentifiers.length));
        }
        for (String ele : controlIdentifiers) {
            this.controlIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The set of <code>controlIdentifier</code> returned by the filter.
     * </p>
     * 
     * @param controlIdentifiers
     *        The set of <code>controlIdentifier</code> returned by the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledControlFilter withControlIdentifiers(java.util.Collection<String> controlIdentifiers) {
        setControlIdentifiers(controlIdentifiers);
        return this;
    }

    /**
     * <p>
     * A list of <code>DriftStatus</code> items.
     * </p>
     * 
     * @return A list of <code>DriftStatus</code> items.
     * @see DriftStatus
     */

    public java.util.List<String> getDriftStatuses() {
        return driftStatuses;
    }

    /**
     * <p>
     * A list of <code>DriftStatus</code> items.
     * </p>
     * 
     * @param driftStatuses
     *        A list of <code>DriftStatus</code> items.
     * @see DriftStatus
     */

    public void setDriftStatuses(java.util.Collection<String> driftStatuses) {
        if (driftStatuses == null) {
            this.driftStatuses = null;
            return;
        }

        this.driftStatuses = new java.util.ArrayList<String>(driftStatuses);
    }

    /**
     * <p>
     * A list of <code>DriftStatus</code> items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDriftStatuses(java.util.Collection)} or {@link #withDriftStatuses(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param driftStatuses
     *        A list of <code>DriftStatus</code> items.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DriftStatus
     */

    public EnabledControlFilter withDriftStatuses(String... driftStatuses) {
        if (this.driftStatuses == null) {
            setDriftStatuses(new java.util.ArrayList<String>(driftStatuses.length));
        }
        for (String ele : driftStatuses) {
            this.driftStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DriftStatus</code> items.
     * </p>
     * 
     * @param driftStatuses
     *        A list of <code>DriftStatus</code> items.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DriftStatus
     */

    public EnabledControlFilter withDriftStatuses(java.util.Collection<String> driftStatuses) {
        setDriftStatuses(driftStatuses);
        return this;
    }

    /**
     * <p>
     * A list of <code>DriftStatus</code> items.
     * </p>
     * 
     * @param driftStatuses
     *        A list of <code>DriftStatus</code> items.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DriftStatus
     */

    public EnabledControlFilter withDriftStatuses(DriftStatus... driftStatuses) {
        java.util.ArrayList<String> driftStatusesCopy = new java.util.ArrayList<String>(driftStatuses.length);
        for (DriftStatus value : driftStatuses) {
            driftStatusesCopy.add(value.toString());
        }
        if (getDriftStatuses() == null) {
            setDriftStatuses(driftStatusesCopy);
        } else {
            getDriftStatuses().addAll(driftStatusesCopy);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>EnablementStatus</code> items.
     * </p>
     * 
     * @return A list of <code>EnablementStatus</code> items.
     * @see EnablementStatus
     */

    public java.util.List<String> getStatuses() {
        return statuses;
    }

    /**
     * <p>
     * A list of <code>EnablementStatus</code> items.
     * </p>
     * 
     * @param statuses
     *        A list of <code>EnablementStatus</code> items.
     * @see EnablementStatus
     */

    public void setStatuses(java.util.Collection<String> statuses) {
        if (statuses == null) {
            this.statuses = null;
            return;
        }

        this.statuses = new java.util.ArrayList<String>(statuses);
    }

    /**
     * <p>
     * A list of <code>EnablementStatus</code> items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatuses(java.util.Collection)} or {@link #withStatuses(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param statuses
     *        A list of <code>EnablementStatus</code> items.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnablementStatus
     */

    public EnabledControlFilter withStatuses(String... statuses) {
        if (this.statuses == null) {
            setStatuses(new java.util.ArrayList<String>(statuses.length));
        }
        for (String ele : statuses) {
            this.statuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>EnablementStatus</code> items.
     * </p>
     * 
     * @param statuses
     *        A list of <code>EnablementStatus</code> items.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnablementStatus
     */

    public EnabledControlFilter withStatuses(java.util.Collection<String> statuses) {
        setStatuses(statuses);
        return this;
    }

    /**
     * <p>
     * A list of <code>EnablementStatus</code> items.
     * </p>
     * 
     * @param statuses
     *        A list of <code>EnablementStatus</code> items.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnablementStatus
     */

    public EnabledControlFilter withStatuses(EnablementStatus... statuses) {
        java.util.ArrayList<String> statusesCopy = new java.util.ArrayList<String>(statuses.length);
        for (EnablementStatus value : statuses) {
            statusesCopy.add(value.toString());
        }
        if (getStatuses() == null) {
            setStatuses(statusesCopy);
        } else {
            getStatuses().addAll(statusesCopy);
        }
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
        if (getControlIdentifiers() != null)
            sb.append("ControlIdentifiers: ").append(getControlIdentifiers()).append(",");
        if (getDriftStatuses() != null)
            sb.append("DriftStatuses: ").append(getDriftStatuses()).append(",");
        if (getStatuses() != null)
            sb.append("Statuses: ").append(getStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnabledControlFilter == false)
            return false;
        EnabledControlFilter other = (EnabledControlFilter) obj;
        if (other.getControlIdentifiers() == null ^ this.getControlIdentifiers() == null)
            return false;
        if (other.getControlIdentifiers() != null && other.getControlIdentifiers().equals(this.getControlIdentifiers()) == false)
            return false;
        if (other.getDriftStatuses() == null ^ this.getDriftStatuses() == null)
            return false;
        if (other.getDriftStatuses() != null && other.getDriftStatuses().equals(this.getDriftStatuses()) == false)
            return false;
        if (other.getStatuses() == null ^ this.getStatuses() == null)
            return false;
        if (other.getStatuses() != null && other.getStatuses().equals(this.getStatuses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getControlIdentifiers() == null) ? 0 : getControlIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getDriftStatuses() == null) ? 0 : getDriftStatuses().hashCode());
        hashCode = prime * hashCode + ((getStatuses() == null) ? 0 : getStatuses().hashCode());
        return hashCode;
    }

    @Override
    public EnabledControlFilter clone() {
        try {
            return (EnabledControlFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.controltower.model.transform.EnabledControlFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
