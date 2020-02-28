/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An object representing a Kubernetes label change for a managed node group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateLabelsPayload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLabelsPayload implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Kubernetes labels to be added or updated.
     * </p>
     */
    private java.util.Map<String, String> addOrUpdateLabels;
    /**
     * <p>
     * Kubernetes labels to be removed.
     * </p>
     */
    private java.util.List<String> removeLabels;

    /**
     * <p>
     * Kubernetes labels to be added or updated.
     * </p>
     * 
     * @return Kubernetes labels to be added or updated.
     */

    public java.util.Map<String, String> getAddOrUpdateLabels() {
        return addOrUpdateLabels;
    }

    /**
     * <p>
     * Kubernetes labels to be added or updated.
     * </p>
     * 
     * @param addOrUpdateLabels
     *        Kubernetes labels to be added or updated.
     */

    public void setAddOrUpdateLabels(java.util.Map<String, String> addOrUpdateLabels) {
        this.addOrUpdateLabels = addOrUpdateLabels;
    }

    /**
     * <p>
     * Kubernetes labels to be added or updated.
     * </p>
     * 
     * @param addOrUpdateLabels
     *        Kubernetes labels to be added or updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLabelsPayload withAddOrUpdateLabels(java.util.Map<String, String> addOrUpdateLabels) {
        setAddOrUpdateLabels(addOrUpdateLabels);
        return this;
    }

    /**
     * Add a single AddOrUpdateLabels entry
     *
     * @see UpdateLabelsPayload#withAddOrUpdateLabels
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLabelsPayload addAddOrUpdateLabelsEntry(String key, String value) {
        if (null == this.addOrUpdateLabels) {
            this.addOrUpdateLabels = new java.util.HashMap<String, String>();
        }
        if (this.addOrUpdateLabels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.addOrUpdateLabels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AddOrUpdateLabels.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLabelsPayload clearAddOrUpdateLabelsEntries() {
        this.addOrUpdateLabels = null;
        return this;
    }

    /**
     * <p>
     * Kubernetes labels to be removed.
     * </p>
     * 
     * @return Kubernetes labels to be removed.
     */

    public java.util.List<String> getRemoveLabels() {
        return removeLabels;
    }

    /**
     * <p>
     * Kubernetes labels to be removed.
     * </p>
     * 
     * @param removeLabels
     *        Kubernetes labels to be removed.
     */

    public void setRemoveLabels(java.util.Collection<String> removeLabels) {
        if (removeLabels == null) {
            this.removeLabels = null;
            return;
        }

        this.removeLabels = new java.util.ArrayList<String>(removeLabels);
    }

    /**
     * <p>
     * Kubernetes labels to be removed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveLabels(java.util.Collection)} or {@link #withRemoveLabels(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param removeLabels
     *        Kubernetes labels to be removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLabelsPayload withRemoveLabels(String... removeLabels) {
        if (this.removeLabels == null) {
            setRemoveLabels(new java.util.ArrayList<String>(removeLabels.length));
        }
        for (String ele : removeLabels) {
            this.removeLabels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Kubernetes labels to be removed.
     * </p>
     * 
     * @param removeLabels
     *        Kubernetes labels to be removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLabelsPayload withRemoveLabels(java.util.Collection<String> removeLabels) {
        setRemoveLabels(removeLabels);
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
        if (getAddOrUpdateLabels() != null)
            sb.append("AddOrUpdateLabels: ").append(getAddOrUpdateLabels()).append(",");
        if (getRemoveLabels() != null)
            sb.append("RemoveLabels: ").append(getRemoveLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLabelsPayload == false)
            return false;
        UpdateLabelsPayload other = (UpdateLabelsPayload) obj;
        if (other.getAddOrUpdateLabels() == null ^ this.getAddOrUpdateLabels() == null)
            return false;
        if (other.getAddOrUpdateLabels() != null && other.getAddOrUpdateLabels().equals(this.getAddOrUpdateLabels()) == false)
            return false;
        if (other.getRemoveLabels() == null ^ this.getRemoveLabels() == null)
            return false;
        if (other.getRemoveLabels() != null && other.getRemoveLabels().equals(this.getRemoveLabels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddOrUpdateLabels() == null) ? 0 : getAddOrUpdateLabels().hashCode());
        hashCode = prime * hashCode + ((getRemoveLabels() == null) ? 0 : getRemoveLabels().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLabelsPayload clone() {
        try {
            return (UpdateLabelsPayload) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.UpdateLabelsPayloadMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
