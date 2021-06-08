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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the details of an update to a taints payload.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateTaintsPayload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTaintsPayload implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Kubernetes taints to be added or updated.
     * </p>
     */
    private java.util.List<Taint> addOrUpdateTaints;
    /**
     * <p>
     * Kubernetes taints to be removed.
     * </p>
     */
    private java.util.List<Taint> removeTaints;

    /**
     * <p>
     * Kubernetes taints to be added or updated.
     * </p>
     * 
     * @return Kubernetes taints to be added or updated.
     */

    public java.util.List<Taint> getAddOrUpdateTaints() {
        return addOrUpdateTaints;
    }

    /**
     * <p>
     * Kubernetes taints to be added or updated.
     * </p>
     * 
     * @param addOrUpdateTaints
     *        Kubernetes taints to be added or updated.
     */

    public void setAddOrUpdateTaints(java.util.Collection<Taint> addOrUpdateTaints) {
        if (addOrUpdateTaints == null) {
            this.addOrUpdateTaints = null;
            return;
        }

        this.addOrUpdateTaints = new java.util.ArrayList<Taint>(addOrUpdateTaints);
    }

    /**
     * <p>
     * Kubernetes taints to be added or updated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddOrUpdateTaints(java.util.Collection)} or {@link #withAddOrUpdateTaints(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param addOrUpdateTaints
     *        Kubernetes taints to be added or updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaintsPayload withAddOrUpdateTaints(Taint... addOrUpdateTaints) {
        if (this.addOrUpdateTaints == null) {
            setAddOrUpdateTaints(new java.util.ArrayList<Taint>(addOrUpdateTaints.length));
        }
        for (Taint ele : addOrUpdateTaints) {
            this.addOrUpdateTaints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Kubernetes taints to be added or updated.
     * </p>
     * 
     * @param addOrUpdateTaints
     *        Kubernetes taints to be added or updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaintsPayload withAddOrUpdateTaints(java.util.Collection<Taint> addOrUpdateTaints) {
        setAddOrUpdateTaints(addOrUpdateTaints);
        return this;
    }

    /**
     * <p>
     * Kubernetes taints to be removed.
     * </p>
     * 
     * @return Kubernetes taints to be removed.
     */

    public java.util.List<Taint> getRemoveTaints() {
        return removeTaints;
    }

    /**
     * <p>
     * Kubernetes taints to be removed.
     * </p>
     * 
     * @param removeTaints
     *        Kubernetes taints to be removed.
     */

    public void setRemoveTaints(java.util.Collection<Taint> removeTaints) {
        if (removeTaints == null) {
            this.removeTaints = null;
            return;
        }

        this.removeTaints = new java.util.ArrayList<Taint>(removeTaints);
    }

    /**
     * <p>
     * Kubernetes taints to be removed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveTaints(java.util.Collection)} or {@link #withRemoveTaints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param removeTaints
     *        Kubernetes taints to be removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaintsPayload withRemoveTaints(Taint... removeTaints) {
        if (this.removeTaints == null) {
            setRemoveTaints(new java.util.ArrayList<Taint>(removeTaints.length));
        }
        for (Taint ele : removeTaints) {
            this.removeTaints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Kubernetes taints to be removed.
     * </p>
     * 
     * @param removeTaints
     *        Kubernetes taints to be removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaintsPayload withRemoveTaints(java.util.Collection<Taint> removeTaints) {
        setRemoveTaints(removeTaints);
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
        if (getAddOrUpdateTaints() != null)
            sb.append("AddOrUpdateTaints: ").append(getAddOrUpdateTaints()).append(",");
        if (getRemoveTaints() != null)
            sb.append("RemoveTaints: ").append(getRemoveTaints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTaintsPayload == false)
            return false;
        UpdateTaintsPayload other = (UpdateTaintsPayload) obj;
        if (other.getAddOrUpdateTaints() == null ^ this.getAddOrUpdateTaints() == null)
            return false;
        if (other.getAddOrUpdateTaints() != null && other.getAddOrUpdateTaints().equals(this.getAddOrUpdateTaints()) == false)
            return false;
        if (other.getRemoveTaints() == null ^ this.getRemoveTaints() == null)
            return false;
        if (other.getRemoveTaints() != null && other.getRemoveTaints().equals(this.getRemoveTaints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddOrUpdateTaints() == null) ? 0 : getAddOrUpdateTaints().hashCode());
        hashCode = prime * hashCode + ((getRemoveTaints() == null) ? 0 : getRemoveTaints().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTaintsPayload clone() {
        try {
            return (UpdateTaintsPayload) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.UpdateTaintsPayloadMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
