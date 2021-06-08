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
 * Information about the volume of attacks during the time period, included in an <a>AttackStatisticsDataItem</a>. If
 * the accompanying <code>AttackCount</code> in the statistics object is zero, this setting might be empty.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/AttackVolume" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttackVolume implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A statistics object that uses bits per second as the unit. This is included for network level attacks.
     * </p>
     */
    private AttackVolumeStatistics bitsPerSecond;
    /**
     * <p>
     * A statistics object that uses packets per second as the unit. This is included for network level attacks.
     * </p>
     */
    private AttackVolumeStatistics packetsPerSecond;
    /**
     * <p>
     * A statistics object that uses requests per second as the unit. This is included for application level attacks,
     * and is only available for accounts that are subscribed to Shield Advanced.
     * </p>
     */
    private AttackVolumeStatistics requestsPerSecond;

    /**
     * <p>
     * A statistics object that uses bits per second as the unit. This is included for network level attacks.
     * </p>
     * 
     * @param bitsPerSecond
     *        A statistics object that uses bits per second as the unit. This is included for network level attacks.
     */

    public void setBitsPerSecond(AttackVolumeStatistics bitsPerSecond) {
        this.bitsPerSecond = bitsPerSecond;
    }

    /**
     * <p>
     * A statistics object that uses bits per second as the unit. This is included for network level attacks.
     * </p>
     * 
     * @return A statistics object that uses bits per second as the unit. This is included for network level attacks.
     */

    public AttackVolumeStatistics getBitsPerSecond() {
        return this.bitsPerSecond;
    }

    /**
     * <p>
     * A statistics object that uses bits per second as the unit. This is included for network level attacks.
     * </p>
     * 
     * @param bitsPerSecond
     *        A statistics object that uses bits per second as the unit. This is included for network level attacks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackVolume withBitsPerSecond(AttackVolumeStatistics bitsPerSecond) {
        setBitsPerSecond(bitsPerSecond);
        return this;
    }

    /**
     * <p>
     * A statistics object that uses packets per second as the unit. This is included for network level attacks.
     * </p>
     * 
     * @param packetsPerSecond
     *        A statistics object that uses packets per second as the unit. This is included for network level attacks.
     */

    public void setPacketsPerSecond(AttackVolumeStatistics packetsPerSecond) {
        this.packetsPerSecond = packetsPerSecond;
    }

    /**
     * <p>
     * A statistics object that uses packets per second as the unit. This is included for network level attacks.
     * </p>
     * 
     * @return A statistics object that uses packets per second as the unit. This is included for network level attacks.
     */

    public AttackVolumeStatistics getPacketsPerSecond() {
        return this.packetsPerSecond;
    }

    /**
     * <p>
     * A statistics object that uses packets per second as the unit. This is included for network level attacks.
     * </p>
     * 
     * @param packetsPerSecond
     *        A statistics object that uses packets per second as the unit. This is included for network level attacks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackVolume withPacketsPerSecond(AttackVolumeStatistics packetsPerSecond) {
        setPacketsPerSecond(packetsPerSecond);
        return this;
    }

    /**
     * <p>
     * A statistics object that uses requests per second as the unit. This is included for application level attacks,
     * and is only available for accounts that are subscribed to Shield Advanced.
     * </p>
     * 
     * @param requestsPerSecond
     *        A statistics object that uses requests per second as the unit. This is included for application level
     *        attacks, and is only available for accounts that are subscribed to Shield Advanced.
     */

    public void setRequestsPerSecond(AttackVolumeStatistics requestsPerSecond) {
        this.requestsPerSecond = requestsPerSecond;
    }

    /**
     * <p>
     * A statistics object that uses requests per second as the unit. This is included for application level attacks,
     * and is only available for accounts that are subscribed to Shield Advanced.
     * </p>
     * 
     * @return A statistics object that uses requests per second as the unit. This is included for application level
     *         attacks, and is only available for accounts that are subscribed to Shield Advanced.
     */

    public AttackVolumeStatistics getRequestsPerSecond() {
        return this.requestsPerSecond;
    }

    /**
     * <p>
     * A statistics object that uses requests per second as the unit. This is included for application level attacks,
     * and is only available for accounts that are subscribed to Shield Advanced.
     * </p>
     * 
     * @param requestsPerSecond
     *        A statistics object that uses requests per second as the unit. This is included for application level
     *        attacks, and is only available for accounts that are subscribed to Shield Advanced.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackVolume withRequestsPerSecond(AttackVolumeStatistics requestsPerSecond) {
        setRequestsPerSecond(requestsPerSecond);
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
        if (getBitsPerSecond() != null)
            sb.append("BitsPerSecond: ").append(getBitsPerSecond()).append(",");
        if (getPacketsPerSecond() != null)
            sb.append("PacketsPerSecond: ").append(getPacketsPerSecond()).append(",");
        if (getRequestsPerSecond() != null)
            sb.append("RequestsPerSecond: ").append(getRequestsPerSecond());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttackVolume == false)
            return false;
        AttackVolume other = (AttackVolume) obj;
        if (other.getBitsPerSecond() == null ^ this.getBitsPerSecond() == null)
            return false;
        if (other.getBitsPerSecond() != null && other.getBitsPerSecond().equals(this.getBitsPerSecond()) == false)
            return false;
        if (other.getPacketsPerSecond() == null ^ this.getPacketsPerSecond() == null)
            return false;
        if (other.getPacketsPerSecond() != null && other.getPacketsPerSecond().equals(this.getPacketsPerSecond()) == false)
            return false;
        if (other.getRequestsPerSecond() == null ^ this.getRequestsPerSecond() == null)
            return false;
        if (other.getRequestsPerSecond() != null && other.getRequestsPerSecond().equals(this.getRequestsPerSecond()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBitsPerSecond() == null) ? 0 : getBitsPerSecond().hashCode());
        hashCode = prime * hashCode + ((getPacketsPerSecond() == null) ? 0 : getPacketsPerSecond().hashCode());
        hashCode = prime * hashCode + ((getRequestsPerSecond() == null) ? 0 : getRequestsPerSecond().hashCode());
        return hashCode;
    }

    @Override
    public AttackVolume clone() {
        try {
            return (AttackVolume) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.AttackVolumeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
