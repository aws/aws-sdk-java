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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration of this multi-Region CMK. This field appears only when the CMK is a primary or replica of
 * a multi-Region CMK.
 * </p>
 * <p>
 * For more information about any listed CMK, use the <a>DescribeKey</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/MultiRegionConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiRegionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the CMK is a <code>PRIMARY</code> or <code>REPLICA</code> key.
     * </p>
     */
    private String multiRegionKeyType;
    /**
     * <p>
     * Displays the key ARN and Region of the primary key. This field includes the current CMK if it is the primary key.
     * </p>
     */
    private MultiRegionKey primaryKey;
    /**
     * <p>
     * displays the key ARNs and Regions of all replica keys. This field includes the current CMK if it is a replica
     * key.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MultiRegionKey> replicaKeys;

    /**
     * <p>
     * Indicates whether the CMK is a <code>PRIMARY</code> or <code>REPLICA</code> key.
     * </p>
     * 
     * @param multiRegionKeyType
     *        Indicates whether the CMK is a <code>PRIMARY</code> or <code>REPLICA</code> key.
     * @see MultiRegionKeyType
     */

    public void setMultiRegionKeyType(String multiRegionKeyType) {
        this.multiRegionKeyType = multiRegionKeyType;
    }

    /**
     * <p>
     * Indicates whether the CMK is a <code>PRIMARY</code> or <code>REPLICA</code> key.
     * </p>
     * 
     * @return Indicates whether the CMK is a <code>PRIMARY</code> or <code>REPLICA</code> key.
     * @see MultiRegionKeyType
     */

    public String getMultiRegionKeyType() {
        return this.multiRegionKeyType;
    }

    /**
     * <p>
     * Indicates whether the CMK is a <code>PRIMARY</code> or <code>REPLICA</code> key.
     * </p>
     * 
     * @param multiRegionKeyType
     *        Indicates whether the CMK is a <code>PRIMARY</code> or <code>REPLICA</code> key.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MultiRegionKeyType
     */

    public MultiRegionConfiguration withMultiRegionKeyType(String multiRegionKeyType) {
        setMultiRegionKeyType(multiRegionKeyType);
        return this;
    }

    /**
     * <p>
     * Indicates whether the CMK is a <code>PRIMARY</code> or <code>REPLICA</code> key.
     * </p>
     * 
     * @param multiRegionKeyType
     *        Indicates whether the CMK is a <code>PRIMARY</code> or <code>REPLICA</code> key.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MultiRegionKeyType
     */

    public MultiRegionConfiguration withMultiRegionKeyType(MultiRegionKeyType multiRegionKeyType) {
        this.multiRegionKeyType = multiRegionKeyType.toString();
        return this;
    }

    /**
     * <p>
     * Displays the key ARN and Region of the primary key. This field includes the current CMK if it is the primary key.
     * </p>
     * 
     * @param primaryKey
     *        Displays the key ARN and Region of the primary key. This field includes the current CMK if it is the
     *        primary key.
     */

    public void setPrimaryKey(MultiRegionKey primaryKey) {
        this.primaryKey = primaryKey;
    }

    /**
     * <p>
     * Displays the key ARN and Region of the primary key. This field includes the current CMK if it is the primary key.
     * </p>
     * 
     * @return Displays the key ARN and Region of the primary key. This field includes the current CMK if it is the
     *         primary key.
     */

    public MultiRegionKey getPrimaryKey() {
        return this.primaryKey;
    }

    /**
     * <p>
     * Displays the key ARN and Region of the primary key. This field includes the current CMK if it is the primary key.
     * </p>
     * 
     * @param primaryKey
     *        Displays the key ARN and Region of the primary key. This field includes the current CMK if it is the
     *        primary key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiRegionConfiguration withPrimaryKey(MultiRegionKey primaryKey) {
        setPrimaryKey(primaryKey);
        return this;
    }

    /**
     * <p>
     * displays the key ARNs and Regions of all replica keys. This field includes the current CMK if it is a replica
     * key.
     * </p>
     * 
     * @return displays the key ARNs and Regions of all replica keys. This field includes the current CMK if it is a
     *         replica key.
     */

    public java.util.List<MultiRegionKey> getReplicaKeys() {
        if (replicaKeys == null) {
            replicaKeys = new com.amazonaws.internal.SdkInternalList<MultiRegionKey>();
        }
        return replicaKeys;
    }

    /**
     * <p>
     * displays the key ARNs and Regions of all replica keys. This field includes the current CMK if it is a replica
     * key.
     * </p>
     * 
     * @param replicaKeys
     *        displays the key ARNs and Regions of all replica keys. This field includes the current CMK if it is a
     *        replica key.
     */

    public void setReplicaKeys(java.util.Collection<MultiRegionKey> replicaKeys) {
        if (replicaKeys == null) {
            this.replicaKeys = null;
            return;
        }

        this.replicaKeys = new com.amazonaws.internal.SdkInternalList<MultiRegionKey>(replicaKeys);
    }

    /**
     * <p>
     * displays the key ARNs and Regions of all replica keys. This field includes the current CMK if it is a replica
     * key.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicaKeys(java.util.Collection)} or {@link #withReplicaKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param replicaKeys
     *        displays the key ARNs and Regions of all replica keys. This field includes the current CMK if it is a
     *        replica key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiRegionConfiguration withReplicaKeys(MultiRegionKey... replicaKeys) {
        if (this.replicaKeys == null) {
            setReplicaKeys(new com.amazonaws.internal.SdkInternalList<MultiRegionKey>(replicaKeys.length));
        }
        for (MultiRegionKey ele : replicaKeys) {
            this.replicaKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * displays the key ARNs and Regions of all replica keys. This field includes the current CMK if it is a replica
     * key.
     * </p>
     * 
     * @param replicaKeys
     *        displays the key ARNs and Regions of all replica keys. This field includes the current CMK if it is a
     *        replica key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiRegionConfiguration withReplicaKeys(java.util.Collection<MultiRegionKey> replicaKeys) {
        setReplicaKeys(replicaKeys);
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
        if (getMultiRegionKeyType() != null)
            sb.append("MultiRegionKeyType: ").append(getMultiRegionKeyType()).append(",");
        if (getPrimaryKey() != null)
            sb.append("PrimaryKey: ").append(getPrimaryKey()).append(",");
        if (getReplicaKeys() != null)
            sb.append("ReplicaKeys: ").append(getReplicaKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiRegionConfiguration == false)
            return false;
        MultiRegionConfiguration other = (MultiRegionConfiguration) obj;
        if (other.getMultiRegionKeyType() == null ^ this.getMultiRegionKeyType() == null)
            return false;
        if (other.getMultiRegionKeyType() != null && other.getMultiRegionKeyType().equals(this.getMultiRegionKeyType()) == false)
            return false;
        if (other.getPrimaryKey() == null ^ this.getPrimaryKey() == null)
            return false;
        if (other.getPrimaryKey() != null && other.getPrimaryKey().equals(this.getPrimaryKey()) == false)
            return false;
        if (other.getReplicaKeys() == null ^ this.getReplicaKeys() == null)
            return false;
        if (other.getReplicaKeys() != null && other.getReplicaKeys().equals(this.getReplicaKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMultiRegionKeyType() == null) ? 0 : getMultiRegionKeyType().hashCode());
        hashCode = prime * hashCode + ((getPrimaryKey() == null) ? 0 : getPrimaryKey().hashCode());
        hashCode = prime * hashCode + ((getReplicaKeys() == null) ? 0 : getReplicaKeys().hashCode());
        return hashCode;
    }

    @Override
    public MultiRegionConfiguration clone() {
        try {
            return (MultiRegionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kms.model.transform.MultiRegionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
