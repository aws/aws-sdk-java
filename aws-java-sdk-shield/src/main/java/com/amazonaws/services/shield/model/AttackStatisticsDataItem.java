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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A single attack statistics data record. This is returned by <a>DescribeAttackStatistics</a> along with a time range
 * indicating the time period that the attack statistics apply to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/AttackStatisticsDataItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttackStatisticsDataItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the volume of attacks during the time period. If the accompanying <code>AttackCount</code> is
     * zero, this setting might be empty.
     * </p>
     */
    private AttackVolume attackVolume;
    /**
     * <p>
     * The number of attacks detected during the time period. This is always present, but might be zero.
     * </p>
     */
    private Long attackCount;

    /**
     * <p>
     * Information about the volume of attacks during the time period. If the accompanying <code>AttackCount</code> is
     * zero, this setting might be empty.
     * </p>
     * 
     * @param attackVolume
     *        Information about the volume of attacks during the time period. If the accompanying
     *        <code>AttackCount</code> is zero, this setting might be empty.
     */

    public void setAttackVolume(AttackVolume attackVolume) {
        this.attackVolume = attackVolume;
    }

    /**
     * <p>
     * Information about the volume of attacks during the time period. If the accompanying <code>AttackCount</code> is
     * zero, this setting might be empty.
     * </p>
     * 
     * @return Information about the volume of attacks during the time period. If the accompanying
     *         <code>AttackCount</code> is zero, this setting might be empty.
     */

    public AttackVolume getAttackVolume() {
        return this.attackVolume;
    }

    /**
     * <p>
     * Information about the volume of attacks during the time period. If the accompanying <code>AttackCount</code> is
     * zero, this setting might be empty.
     * </p>
     * 
     * @param attackVolume
     *        Information about the volume of attacks during the time period. If the accompanying
     *        <code>AttackCount</code> is zero, this setting might be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackStatisticsDataItem withAttackVolume(AttackVolume attackVolume) {
        setAttackVolume(attackVolume);
        return this;
    }

    /**
     * <p>
     * The number of attacks detected during the time period. This is always present, but might be zero.
     * </p>
     * 
     * @param attackCount
     *        The number of attacks detected during the time period. This is always present, but might be zero.
     */

    public void setAttackCount(Long attackCount) {
        this.attackCount = attackCount;
    }

    /**
     * <p>
     * The number of attacks detected during the time period. This is always present, but might be zero.
     * </p>
     * 
     * @return The number of attacks detected during the time period. This is always present, but might be zero.
     */

    public Long getAttackCount() {
        return this.attackCount;
    }

    /**
     * <p>
     * The number of attacks detected during the time period. This is always present, but might be zero.
     * </p>
     * 
     * @param attackCount
     *        The number of attacks detected during the time period. This is always present, but might be zero.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackStatisticsDataItem withAttackCount(Long attackCount) {
        setAttackCount(attackCount);
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
        if (getAttackVolume() != null)
            sb.append("AttackVolume: ").append(getAttackVolume()).append(",");
        if (getAttackCount() != null)
            sb.append("AttackCount: ").append(getAttackCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttackStatisticsDataItem == false)
            return false;
        AttackStatisticsDataItem other = (AttackStatisticsDataItem) obj;
        if (other.getAttackVolume() == null ^ this.getAttackVolume() == null)
            return false;
        if (other.getAttackVolume() != null && other.getAttackVolume().equals(this.getAttackVolume()) == false)
            return false;
        if (other.getAttackCount() == null ^ this.getAttackCount() == null)
            return false;
        if (other.getAttackCount() != null && other.getAttackCount().equals(this.getAttackCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttackVolume() == null) ? 0 : getAttackVolume().hashCode());
        hashCode = prime * hashCode + ((getAttackCount() == null) ? 0 : getAttackCount().hashCode());
        return hashCode;
    }

    @Override
    public AttackStatisticsDataItem clone() {
        try {
            return (AttackStatisticsDataItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.AttackStatisticsDataItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
