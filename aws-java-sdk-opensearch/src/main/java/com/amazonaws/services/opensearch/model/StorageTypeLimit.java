/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Limits that are applicable for the given Amazon OpenSearch Service storage type.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageTypeLimit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of storage limits that are applicable for the given storage type. If <code>StorageType</code> is
     * <code>ebs</code>, the following options are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MinimumVolumeSize</b> - Minimum volume size that is available for the given storage type. Can be empty if not
     * applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaximumVolumeSize</b> - Maximum volume size that is available for the given storage type. Can be empty if not
     * applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaximumIops</b> - Maximum amount of IOPS that is available for the given the storage type. Can be empty if not
     * applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MinimumIops</b> - Minimum amount of IOPS that is available for the given the storage type. Can be empty if not
     * applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaximumThroughput</b> - Maximum amount of throughput that is available for the given the storage type. Can be
     * empty if not applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MinimumThroughput</b> - Minimum amount of throughput that is available for the given the storage type. Can be
     * empty if not applicable.
     * </p>
     * </li>
     * </ul>
     */
    private String limitName;
    /**
     * <p>
     * The limit values.
     * </p>
     */
    private java.util.List<String> limitValues;

    /**
     * <p>
     * Name of storage limits that are applicable for the given storage type. If <code>StorageType</code> is
     * <code>ebs</code>, the following options are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MinimumVolumeSize</b> - Minimum volume size that is available for the given storage type. Can be empty if not
     * applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaximumVolumeSize</b> - Maximum volume size that is available for the given storage type. Can be empty if not
     * applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaximumIops</b> - Maximum amount of IOPS that is available for the given the storage type. Can be empty if not
     * applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MinimumIops</b> - Minimum amount of IOPS that is available for the given the storage type. Can be empty if not
     * applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaximumThroughput</b> - Maximum amount of throughput that is available for the given the storage type. Can be
     * empty if not applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MinimumThroughput</b> - Minimum amount of throughput that is available for the given the storage type. Can be
     * empty if not applicable.
     * </p>
     * </li>
     * </ul>
     * 
     * @param limitName
     *        Name of storage limits that are applicable for the given storage type. If <code>StorageType</code> is
     *        <code>ebs</code>, the following options are available:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>MinimumVolumeSize</b> - Minimum volume size that is available for the given storage type. Can be empty
     *        if not applicable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MaximumVolumeSize</b> - Maximum volume size that is available for the given storage type. Can be empty
     *        if not applicable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MaximumIops</b> - Maximum amount of IOPS that is available for the given the storage type. Can be empty
     *        if not applicable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MinimumIops</b> - Minimum amount of IOPS that is available for the given the storage type. Can be empty
     *        if not applicable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MaximumThroughput</b> - Maximum amount of throughput that is available for the given the storage type.
     *        Can be empty if not applicable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MinimumThroughput</b> - Minimum amount of throughput that is available for the given the storage type.
     *        Can be empty if not applicable.
     *        </p>
     *        </li>
     */

    public void setLimitName(String limitName) {
        this.limitName = limitName;
    }

    /**
     * <p>
     * Name of storage limits that are applicable for the given storage type. If <code>StorageType</code> is
     * <code>ebs</code>, the following options are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MinimumVolumeSize</b> - Minimum volume size that is available for the given storage type. Can be empty if not
     * applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaximumVolumeSize</b> - Maximum volume size that is available for the given storage type. Can be empty if not
     * applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaximumIops</b> - Maximum amount of IOPS that is available for the given the storage type. Can be empty if not
     * applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MinimumIops</b> - Minimum amount of IOPS that is available for the given the storage type. Can be empty if not
     * applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaximumThroughput</b> - Maximum amount of throughput that is available for the given the storage type. Can be
     * empty if not applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MinimumThroughput</b> - Minimum amount of throughput that is available for the given the storage type. Can be
     * empty if not applicable.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Name of storage limits that are applicable for the given storage type. If <code>StorageType</code> is
     *         <code>ebs</code>, the following options are available:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>MinimumVolumeSize</b> - Minimum volume size that is available for the given storage type. Can be empty
     *         if not applicable.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MaximumVolumeSize</b> - Maximum volume size that is available for the given storage type. Can be empty
     *         if not applicable.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MaximumIops</b> - Maximum amount of IOPS that is available for the given the storage type. Can be
     *         empty if not applicable.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MinimumIops</b> - Minimum amount of IOPS that is available for the given the storage type. Can be
     *         empty if not applicable.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MaximumThroughput</b> - Maximum amount of throughput that is available for the given the storage type.
     *         Can be empty if not applicable.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MinimumThroughput</b> - Minimum amount of throughput that is available for the given the storage type.
     *         Can be empty if not applicable.
     *         </p>
     *         </li>
     */

    public String getLimitName() {
        return this.limitName;
    }

    /**
     * <p>
     * Name of storage limits that are applicable for the given storage type. If <code>StorageType</code> is
     * <code>ebs</code>, the following options are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MinimumVolumeSize</b> - Minimum volume size that is available for the given storage type. Can be empty if not
     * applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaximumVolumeSize</b> - Maximum volume size that is available for the given storage type. Can be empty if not
     * applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaximumIops</b> - Maximum amount of IOPS that is available for the given the storage type. Can be empty if not
     * applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MinimumIops</b> - Minimum amount of IOPS that is available for the given the storage type. Can be empty if not
     * applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaximumThroughput</b> - Maximum amount of throughput that is available for the given the storage type. Can be
     * empty if not applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MinimumThroughput</b> - Minimum amount of throughput that is available for the given the storage type. Can be
     * empty if not applicable.
     * </p>
     * </li>
     * </ul>
     * 
     * @param limitName
     *        Name of storage limits that are applicable for the given storage type. If <code>StorageType</code> is
     *        <code>ebs</code>, the following options are available:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>MinimumVolumeSize</b> - Minimum volume size that is available for the given storage type. Can be empty
     *        if not applicable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MaximumVolumeSize</b> - Maximum volume size that is available for the given storage type. Can be empty
     *        if not applicable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MaximumIops</b> - Maximum amount of IOPS that is available for the given the storage type. Can be empty
     *        if not applicable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MinimumIops</b> - Minimum amount of IOPS that is available for the given the storage type. Can be empty
     *        if not applicable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MaximumThroughput</b> - Maximum amount of throughput that is available for the given the storage type.
     *        Can be empty if not applicable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MinimumThroughput</b> - Minimum amount of throughput that is available for the given the storage type.
     *        Can be empty if not applicable.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageTypeLimit withLimitName(String limitName) {
        setLimitName(limitName);
        return this;
    }

    /**
     * <p>
     * The limit values.
     * </p>
     * 
     * @return The limit values.
     */

    public java.util.List<String> getLimitValues() {
        return limitValues;
    }

    /**
     * <p>
     * The limit values.
     * </p>
     * 
     * @param limitValues
     *        The limit values.
     */

    public void setLimitValues(java.util.Collection<String> limitValues) {
        if (limitValues == null) {
            this.limitValues = null;
            return;
        }

        this.limitValues = new java.util.ArrayList<String>(limitValues);
    }

    /**
     * <p>
     * The limit values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLimitValues(java.util.Collection)} or {@link #withLimitValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param limitValues
     *        The limit values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageTypeLimit withLimitValues(String... limitValues) {
        if (this.limitValues == null) {
            setLimitValues(new java.util.ArrayList<String>(limitValues.length));
        }
        for (String ele : limitValues) {
            this.limitValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The limit values.
     * </p>
     * 
     * @param limitValues
     *        The limit values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageTypeLimit withLimitValues(java.util.Collection<String> limitValues) {
        setLimitValues(limitValues);
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
        if (getLimitName() != null)
            sb.append("LimitName: ").append(getLimitName()).append(",");
        if (getLimitValues() != null)
            sb.append("LimitValues: ").append(getLimitValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageTypeLimit == false)
            return false;
        StorageTypeLimit other = (StorageTypeLimit) obj;
        if (other.getLimitName() == null ^ this.getLimitName() == null)
            return false;
        if (other.getLimitName() != null && other.getLimitName().equals(this.getLimitName()) == false)
            return false;
        if (other.getLimitValues() == null ^ this.getLimitValues() == null)
            return false;
        if (other.getLimitValues() != null && other.getLimitValues().equals(this.getLimitValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimitName() == null) ? 0 : getLimitName().hashCode());
        hashCode = prime * hashCode + ((getLimitValues() == null) ? 0 : getLimitValues().hashCode());
        return hashCode;
    }

    @Override
    public StorageTypeLimit clone() {
        try {
            return (StorageTypeLimit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.StorageTypeLimitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
