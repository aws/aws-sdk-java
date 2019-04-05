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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Limits for given InstanceType and for each of it's role. <br/>
 * Limits contains following <code> <a>StorageTypes,</a> </code> <code> <a>InstanceLimits</a> </code> and
 * <code> <a>AdditionalLimits</a> </code>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Limits implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * StorageType represents the list of storage related types and attributes that are available for given
     * InstanceType.
     * </p>
     */
    private java.util.List<StorageType> storageTypes;

    private InstanceLimits instanceLimits;
    /**
     * <p>
     * List of additional limits that are specific to a given InstanceType and for each of it's
     * <code> <a>InstanceRole</a> </code> .
     * </p>
     */
    private java.util.List<AdditionalLimit> additionalLimits;

    /**
     * <p>
     * StorageType represents the list of storage related types and attributes that are available for given
     * InstanceType.
     * </p>
     * 
     * @return StorageType represents the list of storage related types and attributes that are available for given
     *         InstanceType.
     */

    public java.util.List<StorageType> getStorageTypes() {
        return storageTypes;
    }

    /**
     * <p>
     * StorageType represents the list of storage related types and attributes that are available for given
     * InstanceType.
     * </p>
     * 
     * @param storageTypes
     *        StorageType represents the list of storage related types and attributes that are available for given
     *        InstanceType.
     */

    public void setStorageTypes(java.util.Collection<StorageType> storageTypes) {
        if (storageTypes == null) {
            this.storageTypes = null;
            return;
        }

        this.storageTypes = new java.util.ArrayList<StorageType>(storageTypes);
    }

    /**
     * <p>
     * StorageType represents the list of storage related types and attributes that are available for given
     * InstanceType.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStorageTypes(java.util.Collection)} or {@link #withStorageTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param storageTypes
     *        StorageType represents the list of storage related types and attributes that are available for given
     *        InstanceType.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Limits withStorageTypes(StorageType... storageTypes) {
        if (this.storageTypes == null) {
            setStorageTypes(new java.util.ArrayList<StorageType>(storageTypes.length));
        }
        for (StorageType ele : storageTypes) {
            this.storageTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * StorageType represents the list of storage related types and attributes that are available for given
     * InstanceType.
     * </p>
     * 
     * @param storageTypes
     *        StorageType represents the list of storage related types and attributes that are available for given
     *        InstanceType.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Limits withStorageTypes(java.util.Collection<StorageType> storageTypes) {
        setStorageTypes(storageTypes);
        return this;
    }

    /**
     * @param instanceLimits
     */

    public void setInstanceLimits(InstanceLimits instanceLimits) {
        this.instanceLimits = instanceLimits;
    }

    /**
     * @return
     */

    public InstanceLimits getInstanceLimits() {
        return this.instanceLimits;
    }

    /**
     * @param instanceLimits
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Limits withInstanceLimits(InstanceLimits instanceLimits) {
        setInstanceLimits(instanceLimits);
        return this;
    }

    /**
     * <p>
     * List of additional limits that are specific to a given InstanceType and for each of it's
     * <code> <a>InstanceRole</a> </code> .
     * </p>
     * 
     * @return List of additional limits that are specific to a given InstanceType and for each of it's
     *         <code> <a>InstanceRole</a> </code> .
     */

    public java.util.List<AdditionalLimit> getAdditionalLimits() {
        return additionalLimits;
    }

    /**
     * <p>
     * List of additional limits that are specific to a given InstanceType and for each of it's
     * <code> <a>InstanceRole</a> </code> .
     * </p>
     * 
     * @param additionalLimits
     *        List of additional limits that are specific to a given InstanceType and for each of it's
     *        <code> <a>InstanceRole</a> </code> .
     */

    public void setAdditionalLimits(java.util.Collection<AdditionalLimit> additionalLimits) {
        if (additionalLimits == null) {
            this.additionalLimits = null;
            return;
        }

        this.additionalLimits = new java.util.ArrayList<AdditionalLimit>(additionalLimits);
    }

    /**
     * <p>
     * List of additional limits that are specific to a given InstanceType and for each of it's
     * <code> <a>InstanceRole</a> </code> .
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalLimits(java.util.Collection)} or {@link #withAdditionalLimits(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param additionalLimits
     *        List of additional limits that are specific to a given InstanceType and for each of it's
     *        <code> <a>InstanceRole</a> </code> .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Limits withAdditionalLimits(AdditionalLimit... additionalLimits) {
        if (this.additionalLimits == null) {
            setAdditionalLimits(new java.util.ArrayList<AdditionalLimit>(additionalLimits.length));
        }
        for (AdditionalLimit ele : additionalLimits) {
            this.additionalLimits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of additional limits that are specific to a given InstanceType and for each of it's
     * <code> <a>InstanceRole</a> </code> .
     * </p>
     * 
     * @param additionalLimits
     *        List of additional limits that are specific to a given InstanceType and for each of it's
     *        <code> <a>InstanceRole</a> </code> .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Limits withAdditionalLimits(java.util.Collection<AdditionalLimit> additionalLimits) {
        setAdditionalLimits(additionalLimits);
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
        if (getStorageTypes() != null)
            sb.append("StorageTypes: ").append(getStorageTypes()).append(",");
        if (getInstanceLimits() != null)
            sb.append("InstanceLimits: ").append(getInstanceLimits()).append(",");
        if (getAdditionalLimits() != null)
            sb.append("AdditionalLimits: ").append(getAdditionalLimits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Limits == false)
            return false;
        Limits other = (Limits) obj;
        if (other.getStorageTypes() == null ^ this.getStorageTypes() == null)
            return false;
        if (other.getStorageTypes() != null && other.getStorageTypes().equals(this.getStorageTypes()) == false)
            return false;
        if (other.getInstanceLimits() == null ^ this.getInstanceLimits() == null)
            return false;
        if (other.getInstanceLimits() != null && other.getInstanceLimits().equals(this.getInstanceLimits()) == false)
            return false;
        if (other.getAdditionalLimits() == null ^ this.getAdditionalLimits() == null)
            return false;
        if (other.getAdditionalLimits() != null && other.getAdditionalLimits().equals(this.getAdditionalLimits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageTypes() == null) ? 0 : getStorageTypes().hashCode());
        hashCode = prime * hashCode + ((getInstanceLimits() == null) ? 0 : getInstanceLimits().hashCode());
        hashCode = prime * hashCode + ((getAdditionalLimits() == null) ? 0 : getAdditionalLimits().hashCode());
        return hashCode;
    }

    @Override
    public Limits clone() {
        try {
            return (Limits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.LimitsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
