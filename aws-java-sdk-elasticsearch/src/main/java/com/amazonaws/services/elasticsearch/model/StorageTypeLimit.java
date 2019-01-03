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
 * Limits that are applicable for given storage type.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageTypeLimit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of storage limits that are applicable for given storage type. If <code> <a>StorageType</a> </code> is ebs,
     * following storage options are applicable
     * <ol>
     * <li>MinimumVolumeSize</li> Minimum amount of volume size that is applicable for given storage type.It can be
     * empty if it is not applicable.
     * <li>MaximumVolumeSize</li> Maximum amount of volume size that is applicable for given storage type.It can be
     * empty if it is not applicable.
     * <li>MaximumIops</li> Maximum amount of Iops that is applicable for given storage type.It can be empty if it is
     * not applicable.
     * <li>MinimumIops</li> Minimum amount of Iops that is applicable for given storage type.It can be empty if it is
     * not applicable.
     * </ol>
     * </p>
     */
    private String limitName;
    /**
     * <p>
     * Values for the <code> <a>StorageTypeLimit$LimitName</a> </code> .
     * </p>
     */
    private java.util.List<String> limitValues;

    /**
     * <p>
     * Name of storage limits that are applicable for given storage type. If <code> <a>StorageType</a> </code> is ebs,
     * following storage options are applicable
     * <ol>
     * <li>MinimumVolumeSize</li> Minimum amount of volume size that is applicable for given storage type.It can be
     * empty if it is not applicable.
     * <li>MaximumVolumeSize</li> Maximum amount of volume size that is applicable for given storage type.It can be
     * empty if it is not applicable.
     * <li>MaximumIops</li> Maximum amount of Iops that is applicable for given storage type.It can be empty if it is
     * not applicable.
     * <li>MinimumIops</li> Minimum amount of Iops that is applicable for given storage type.It can be empty if it is
     * not applicable.
     * </ol>
     * </p>
     * 
     * @param limitName
     *        Name of storage limits that are applicable for given storage type. If <code> <a>StorageType</a> </code> is
     *        ebs, following storage options are applicable
     *        <ol>
     *        <li>MinimumVolumeSize</li> Minimum amount of volume size that is applicable for given storage type.It can
     *        be empty if it is not applicable.
     *        <li>MaximumVolumeSize</li> Maximum amount of volume size that is applicable for given storage type.It can
     *        be empty if it is not applicable.
     *        <li>MaximumIops</li> Maximum amount of Iops that is applicable for given storage type.It can be empty if
     *        it is not applicable.
     *        <li>MinimumIops</li> Minimum amount of Iops that is applicable for given storage type.It can be empty if
     *        it is not applicable.
     *        </ol>
     */

    public void setLimitName(String limitName) {
        this.limitName = limitName;
    }

    /**
     * <p>
     * Name of storage limits that are applicable for given storage type. If <code> <a>StorageType</a> </code> is ebs,
     * following storage options are applicable
     * <ol>
     * <li>MinimumVolumeSize</li> Minimum amount of volume size that is applicable for given storage type.It can be
     * empty if it is not applicable.
     * <li>MaximumVolumeSize</li> Maximum amount of volume size that is applicable for given storage type.It can be
     * empty if it is not applicable.
     * <li>MaximumIops</li> Maximum amount of Iops that is applicable for given storage type.It can be empty if it is
     * not applicable.
     * <li>MinimumIops</li> Minimum amount of Iops that is applicable for given storage type.It can be empty if it is
     * not applicable.
     * </ol>
     * </p>
     * 
     * @return Name of storage limits that are applicable for given storage type. If <code> <a>StorageType</a> </code>
     *         is ebs, following storage options are applicable
     *         <ol>
     *         <li>MinimumVolumeSize</li> Minimum amount of volume size that is applicable for given storage type.It can
     *         be empty if it is not applicable.
     *         <li>MaximumVolumeSize</li> Maximum amount of volume size that is applicable for given storage type.It can
     *         be empty if it is not applicable.
     *         <li>MaximumIops</li> Maximum amount of Iops that is applicable for given storage type.It can be empty if
     *         it is not applicable.
     *         <li>MinimumIops</li> Minimum amount of Iops that is applicable for given storage type.It can be empty if
     *         it is not applicable.
     *         </ol>
     */

    public String getLimitName() {
        return this.limitName;
    }

    /**
     * <p>
     * Name of storage limits that are applicable for given storage type. If <code> <a>StorageType</a> </code> is ebs,
     * following storage options are applicable
     * <ol>
     * <li>MinimumVolumeSize</li> Minimum amount of volume size that is applicable for given storage type.It can be
     * empty if it is not applicable.
     * <li>MaximumVolumeSize</li> Maximum amount of volume size that is applicable for given storage type.It can be
     * empty if it is not applicable.
     * <li>MaximumIops</li> Maximum amount of Iops that is applicable for given storage type.It can be empty if it is
     * not applicable.
     * <li>MinimumIops</li> Minimum amount of Iops that is applicable for given storage type.It can be empty if it is
     * not applicable.
     * </ol>
     * </p>
     * 
     * @param limitName
     *        Name of storage limits that are applicable for given storage type. If <code> <a>StorageType</a> </code> is
     *        ebs, following storage options are applicable
     *        <ol>
     *        <li>MinimumVolumeSize</li> Minimum amount of volume size that is applicable for given storage type.It can
     *        be empty if it is not applicable.
     *        <li>MaximumVolumeSize</li> Maximum amount of volume size that is applicable for given storage type.It can
     *        be empty if it is not applicable.
     *        <li>MaximumIops</li> Maximum amount of Iops that is applicable for given storage type.It can be empty if
     *        it is not applicable.
     *        <li>MinimumIops</li> Minimum amount of Iops that is applicable for given storage type.It can be empty if
     *        it is not applicable.
     *        </ol>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageTypeLimit withLimitName(String limitName) {
        setLimitName(limitName);
        return this;
    }

    /**
     * <p>
     * Values for the <code> <a>StorageTypeLimit$LimitName</a> </code> .
     * </p>
     * 
     * @return Values for the <code> <a>StorageTypeLimit$LimitName</a> </code> .
     */

    public java.util.List<String> getLimitValues() {
        return limitValues;
    }

    /**
     * <p>
     * Values for the <code> <a>StorageTypeLimit$LimitName</a> </code> .
     * </p>
     * 
     * @param limitValues
     *        Values for the <code> <a>StorageTypeLimit$LimitName</a> </code> .
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
     * Values for the <code> <a>StorageTypeLimit$LimitName</a> </code> .
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLimitValues(java.util.Collection)} or {@link #withLimitValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param limitValues
     *        Values for the <code> <a>StorageTypeLimit$LimitName</a> </code> .
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
     * Values for the <code> <a>StorageTypeLimit$LimitName</a> </code> .
     * </p>
     * 
     * @param limitValues
     *        Values for the <code> <a>StorageTypeLimit$LimitName</a> </code> .
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
        com.amazonaws.services.elasticsearch.model.transform.StorageTypeLimitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
