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
 * A filter object that lets you call <code>ListCOntrolOperations</code> with a specific filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ControlOperationFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ControlOperationFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The set of <code>controlIdentifier</code> returned by the filter.
     * </p>
     */
    private java.util.List<String> controlIdentifiers;
    /**
     * <p>
     * The set of <code>ControlOperation</code> objects returned by the filter.
     * </p>
     */
    private java.util.List<String> controlOperationTypes;
    /**
     * <p>
     * The set <code>controlIdentifier</code> of enabled controls selected by the filter.
     * </p>
     */
    private java.util.List<String> enabledControlIdentifiers;
    /**
     * <p>
     * Lists the status of control operations.
     * </p>
     */
    private java.util.List<String> statuses;
    /**
     * <p>
     * The set of <code>targetIdentifier</code> objects returned by the filter.
     * </p>
     */
    private java.util.List<String> targetIdentifiers;

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

    public ControlOperationFilter withControlIdentifiers(String... controlIdentifiers) {
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

    public ControlOperationFilter withControlIdentifiers(java.util.Collection<String> controlIdentifiers) {
        setControlIdentifiers(controlIdentifiers);
        return this;
    }

    /**
     * <p>
     * The set of <code>ControlOperation</code> objects returned by the filter.
     * </p>
     * 
     * @return The set of <code>ControlOperation</code> objects returned by the filter.
     * @see ControlOperationType
     */

    public java.util.List<String> getControlOperationTypes() {
        return controlOperationTypes;
    }

    /**
     * <p>
     * The set of <code>ControlOperation</code> objects returned by the filter.
     * </p>
     * 
     * @param controlOperationTypes
     *        The set of <code>ControlOperation</code> objects returned by the filter.
     * @see ControlOperationType
     */

    public void setControlOperationTypes(java.util.Collection<String> controlOperationTypes) {
        if (controlOperationTypes == null) {
            this.controlOperationTypes = null;
            return;
        }

        this.controlOperationTypes = new java.util.ArrayList<String>(controlOperationTypes);
    }

    /**
     * <p>
     * The set of <code>ControlOperation</code> objects returned by the filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setControlOperationTypes(java.util.Collection)} or
     * {@link #withControlOperationTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param controlOperationTypes
     *        The set of <code>ControlOperation</code> objects returned by the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlOperationType
     */

    public ControlOperationFilter withControlOperationTypes(String... controlOperationTypes) {
        if (this.controlOperationTypes == null) {
            setControlOperationTypes(new java.util.ArrayList<String>(controlOperationTypes.length));
        }
        for (String ele : controlOperationTypes) {
            this.controlOperationTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The set of <code>ControlOperation</code> objects returned by the filter.
     * </p>
     * 
     * @param controlOperationTypes
     *        The set of <code>ControlOperation</code> objects returned by the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlOperationType
     */

    public ControlOperationFilter withControlOperationTypes(java.util.Collection<String> controlOperationTypes) {
        setControlOperationTypes(controlOperationTypes);
        return this;
    }

    /**
     * <p>
     * The set of <code>ControlOperation</code> objects returned by the filter.
     * </p>
     * 
     * @param controlOperationTypes
     *        The set of <code>ControlOperation</code> objects returned by the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlOperationType
     */

    public ControlOperationFilter withControlOperationTypes(ControlOperationType... controlOperationTypes) {
        java.util.ArrayList<String> controlOperationTypesCopy = new java.util.ArrayList<String>(controlOperationTypes.length);
        for (ControlOperationType value : controlOperationTypes) {
            controlOperationTypesCopy.add(value.toString());
        }
        if (getControlOperationTypes() == null) {
            setControlOperationTypes(controlOperationTypesCopy);
        } else {
            getControlOperationTypes().addAll(controlOperationTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The set <code>controlIdentifier</code> of enabled controls selected by the filter.
     * </p>
     * 
     * @return The set <code>controlIdentifier</code> of enabled controls selected by the filter.
     */

    public java.util.List<String> getEnabledControlIdentifiers() {
        return enabledControlIdentifiers;
    }

    /**
     * <p>
     * The set <code>controlIdentifier</code> of enabled controls selected by the filter.
     * </p>
     * 
     * @param enabledControlIdentifiers
     *        The set <code>controlIdentifier</code> of enabled controls selected by the filter.
     */

    public void setEnabledControlIdentifiers(java.util.Collection<String> enabledControlIdentifiers) {
        if (enabledControlIdentifiers == null) {
            this.enabledControlIdentifiers = null;
            return;
        }

        this.enabledControlIdentifiers = new java.util.ArrayList<String>(enabledControlIdentifiers);
    }

    /**
     * <p>
     * The set <code>controlIdentifier</code> of enabled controls selected by the filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnabledControlIdentifiers(java.util.Collection)} or
     * {@link #withEnabledControlIdentifiers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param enabledControlIdentifiers
     *        The set <code>controlIdentifier</code> of enabled controls selected by the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlOperationFilter withEnabledControlIdentifiers(String... enabledControlIdentifiers) {
        if (this.enabledControlIdentifiers == null) {
            setEnabledControlIdentifiers(new java.util.ArrayList<String>(enabledControlIdentifiers.length));
        }
        for (String ele : enabledControlIdentifiers) {
            this.enabledControlIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The set <code>controlIdentifier</code> of enabled controls selected by the filter.
     * </p>
     * 
     * @param enabledControlIdentifiers
     *        The set <code>controlIdentifier</code> of enabled controls selected by the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlOperationFilter withEnabledControlIdentifiers(java.util.Collection<String> enabledControlIdentifiers) {
        setEnabledControlIdentifiers(enabledControlIdentifiers);
        return this;
    }

    /**
     * <p>
     * Lists the status of control operations.
     * </p>
     * 
     * @return Lists the status of control operations.
     * @see ControlOperationStatus
     */

    public java.util.List<String> getStatuses() {
        return statuses;
    }

    /**
     * <p>
     * Lists the status of control operations.
     * </p>
     * 
     * @param statuses
     *        Lists the status of control operations.
     * @see ControlOperationStatus
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
     * Lists the status of control operations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatuses(java.util.Collection)} or {@link #withStatuses(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param statuses
     *        Lists the status of control operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlOperationStatus
     */

    public ControlOperationFilter withStatuses(String... statuses) {
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
     * Lists the status of control operations.
     * </p>
     * 
     * @param statuses
     *        Lists the status of control operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlOperationStatus
     */

    public ControlOperationFilter withStatuses(java.util.Collection<String> statuses) {
        setStatuses(statuses);
        return this;
    }

    /**
     * <p>
     * Lists the status of control operations.
     * </p>
     * 
     * @param statuses
     *        Lists the status of control operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlOperationStatus
     */

    public ControlOperationFilter withStatuses(ControlOperationStatus... statuses) {
        java.util.ArrayList<String> statusesCopy = new java.util.ArrayList<String>(statuses.length);
        for (ControlOperationStatus value : statuses) {
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
     * <p>
     * The set of <code>targetIdentifier</code> objects returned by the filter.
     * </p>
     * 
     * @return The set of <code>targetIdentifier</code> objects returned by the filter.
     */

    public java.util.List<String> getTargetIdentifiers() {
        return targetIdentifiers;
    }

    /**
     * <p>
     * The set of <code>targetIdentifier</code> objects returned by the filter.
     * </p>
     * 
     * @param targetIdentifiers
     *        The set of <code>targetIdentifier</code> objects returned by the filter.
     */

    public void setTargetIdentifiers(java.util.Collection<String> targetIdentifiers) {
        if (targetIdentifiers == null) {
            this.targetIdentifiers = null;
            return;
        }

        this.targetIdentifiers = new java.util.ArrayList<String>(targetIdentifiers);
    }

    /**
     * <p>
     * The set of <code>targetIdentifier</code> objects returned by the filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetIdentifiers(java.util.Collection)} or {@link #withTargetIdentifiers(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param targetIdentifiers
     *        The set of <code>targetIdentifier</code> objects returned by the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlOperationFilter withTargetIdentifiers(String... targetIdentifiers) {
        if (this.targetIdentifiers == null) {
            setTargetIdentifiers(new java.util.ArrayList<String>(targetIdentifiers.length));
        }
        for (String ele : targetIdentifiers) {
            this.targetIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The set of <code>targetIdentifier</code> objects returned by the filter.
     * </p>
     * 
     * @param targetIdentifiers
     *        The set of <code>targetIdentifier</code> objects returned by the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlOperationFilter withTargetIdentifiers(java.util.Collection<String> targetIdentifiers) {
        setTargetIdentifiers(targetIdentifiers);
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
        if (getControlOperationTypes() != null)
            sb.append("ControlOperationTypes: ").append(getControlOperationTypes()).append(",");
        if (getEnabledControlIdentifiers() != null)
            sb.append("EnabledControlIdentifiers: ").append(getEnabledControlIdentifiers()).append(",");
        if (getStatuses() != null)
            sb.append("Statuses: ").append(getStatuses()).append(",");
        if (getTargetIdentifiers() != null)
            sb.append("TargetIdentifiers: ").append(getTargetIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ControlOperationFilter == false)
            return false;
        ControlOperationFilter other = (ControlOperationFilter) obj;
        if (other.getControlIdentifiers() == null ^ this.getControlIdentifiers() == null)
            return false;
        if (other.getControlIdentifiers() != null && other.getControlIdentifiers().equals(this.getControlIdentifiers()) == false)
            return false;
        if (other.getControlOperationTypes() == null ^ this.getControlOperationTypes() == null)
            return false;
        if (other.getControlOperationTypes() != null && other.getControlOperationTypes().equals(this.getControlOperationTypes()) == false)
            return false;
        if (other.getEnabledControlIdentifiers() == null ^ this.getEnabledControlIdentifiers() == null)
            return false;
        if (other.getEnabledControlIdentifiers() != null && other.getEnabledControlIdentifiers().equals(this.getEnabledControlIdentifiers()) == false)
            return false;
        if (other.getStatuses() == null ^ this.getStatuses() == null)
            return false;
        if (other.getStatuses() != null && other.getStatuses().equals(this.getStatuses()) == false)
            return false;
        if (other.getTargetIdentifiers() == null ^ this.getTargetIdentifiers() == null)
            return false;
        if (other.getTargetIdentifiers() != null && other.getTargetIdentifiers().equals(this.getTargetIdentifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getControlIdentifiers() == null) ? 0 : getControlIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getControlOperationTypes() == null) ? 0 : getControlOperationTypes().hashCode());
        hashCode = prime * hashCode + ((getEnabledControlIdentifiers() == null) ? 0 : getEnabledControlIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getStatuses() == null) ? 0 : getStatuses().hashCode());
        hashCode = prime * hashCode + ((getTargetIdentifiers() == null) ? 0 : getTargetIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public ControlOperationFilter clone() {
        try {
            return (ControlOperationFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.controltower.model.transform.ControlOperationFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
