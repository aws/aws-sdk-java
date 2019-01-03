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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a dedicated IP address that is associated with your Amazon Pinpoint account.
 * </p>
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DedicatedIp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DedicatedIp implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An IP address that is reserved for use by your Amazon Pinpoint account.
     * </p>
     */
    private String ip;
    /**
     * <p>
     * The warm-up status of a dedicated IP address. The status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> – The IP address isn't ready to use because the dedicated IP warm-up process is ongoing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DONE</code> – The dedicated IP warm-up process is complete, and the IP address is ready to use.
     * </p>
     * </li>
     * </ul>
     */
    private String warmupStatus;
    /**
     * <p>
     * Indicates how complete the dedicated IP warm-up process is. When this value equals 1, the address has completed
     * the warm-up process and is ready for use.
     * </p>
     */
    private Integer warmupPercentage;
    /**
     * <p>
     * The name of the dedicated IP pool that the IP address is associated with.
     * </p>
     */
    private String poolName;

    /**
     * <p>
     * An IP address that is reserved for use by your Amazon Pinpoint account.
     * </p>
     * 
     * @param ip
     *        An IP address that is reserved for use by your Amazon Pinpoint account.
     */

    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * <p>
     * An IP address that is reserved for use by your Amazon Pinpoint account.
     * </p>
     * 
     * @return An IP address that is reserved for use by your Amazon Pinpoint account.
     */

    public String getIp() {
        return this.ip;
    }

    /**
     * <p>
     * An IP address that is reserved for use by your Amazon Pinpoint account.
     * </p>
     * 
     * @param ip
     *        An IP address that is reserved for use by your Amazon Pinpoint account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DedicatedIp withIp(String ip) {
        setIp(ip);
        return this;
    }

    /**
     * <p>
     * The warm-up status of a dedicated IP address. The status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> – The IP address isn't ready to use because the dedicated IP warm-up process is ongoing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DONE</code> – The dedicated IP warm-up process is complete, and the IP address is ready to use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param warmupStatus
     *        The warm-up status of a dedicated IP address. The status can have one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> – The IP address isn't ready to use because the dedicated IP warm-up process is
     *        ongoing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DONE</code> – The dedicated IP warm-up process is complete, and the IP address is ready to use.
     *        </p>
     *        </li>
     * @see WarmupStatus
     */

    public void setWarmupStatus(String warmupStatus) {
        this.warmupStatus = warmupStatus;
    }

    /**
     * <p>
     * The warm-up status of a dedicated IP address. The status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> – The IP address isn't ready to use because the dedicated IP warm-up process is ongoing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DONE</code> – The dedicated IP warm-up process is complete, and the IP address is ready to use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The warm-up status of a dedicated IP address. The status can have one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code> – The IP address isn't ready to use because the dedicated IP warm-up process is
     *         ongoing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DONE</code> – The dedicated IP warm-up process is complete, and the IP address is ready to use.
     *         </p>
     *         </li>
     * @see WarmupStatus
     */

    public String getWarmupStatus() {
        return this.warmupStatus;
    }

    /**
     * <p>
     * The warm-up status of a dedicated IP address. The status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> – The IP address isn't ready to use because the dedicated IP warm-up process is ongoing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DONE</code> – The dedicated IP warm-up process is complete, and the IP address is ready to use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param warmupStatus
     *        The warm-up status of a dedicated IP address. The status can have one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> – The IP address isn't ready to use because the dedicated IP warm-up process is
     *        ongoing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DONE</code> – The dedicated IP warm-up process is complete, and the IP address is ready to use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WarmupStatus
     */

    public DedicatedIp withWarmupStatus(String warmupStatus) {
        setWarmupStatus(warmupStatus);
        return this;
    }

    /**
     * <p>
     * The warm-up status of a dedicated IP address. The status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> – The IP address isn't ready to use because the dedicated IP warm-up process is ongoing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DONE</code> – The dedicated IP warm-up process is complete, and the IP address is ready to use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param warmupStatus
     *        The warm-up status of a dedicated IP address. The status can have one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> – The IP address isn't ready to use because the dedicated IP warm-up process is
     *        ongoing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DONE</code> – The dedicated IP warm-up process is complete, and the IP address is ready to use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WarmupStatus
     */

    public DedicatedIp withWarmupStatus(WarmupStatus warmupStatus) {
        this.warmupStatus = warmupStatus.toString();
        return this;
    }

    /**
     * <p>
     * Indicates how complete the dedicated IP warm-up process is. When this value equals 1, the address has completed
     * the warm-up process and is ready for use.
     * </p>
     * 
     * @param warmupPercentage
     *        Indicates how complete the dedicated IP warm-up process is. When this value equals 1, the address has
     *        completed the warm-up process and is ready for use.
     */

    public void setWarmupPercentage(Integer warmupPercentage) {
        this.warmupPercentage = warmupPercentage;
    }

    /**
     * <p>
     * Indicates how complete the dedicated IP warm-up process is. When this value equals 1, the address has completed
     * the warm-up process and is ready for use.
     * </p>
     * 
     * @return Indicates how complete the dedicated IP warm-up process is. When this value equals 1, the address has
     *         completed the warm-up process and is ready for use.
     */

    public Integer getWarmupPercentage() {
        return this.warmupPercentage;
    }

    /**
     * <p>
     * Indicates how complete the dedicated IP warm-up process is. When this value equals 1, the address has completed
     * the warm-up process and is ready for use.
     * </p>
     * 
     * @param warmupPercentage
     *        Indicates how complete the dedicated IP warm-up process is. When this value equals 1, the address has
     *        completed the warm-up process and is ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DedicatedIp withWarmupPercentage(Integer warmupPercentage) {
        setWarmupPercentage(warmupPercentage);
        return this;
    }

    /**
     * <p>
     * The name of the dedicated IP pool that the IP address is associated with.
     * </p>
     * 
     * @param poolName
     *        The name of the dedicated IP pool that the IP address is associated with.
     */

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    /**
     * <p>
     * The name of the dedicated IP pool that the IP address is associated with.
     * </p>
     * 
     * @return The name of the dedicated IP pool that the IP address is associated with.
     */

    public String getPoolName() {
        return this.poolName;
    }

    /**
     * <p>
     * The name of the dedicated IP pool that the IP address is associated with.
     * </p>
     * 
     * @param poolName
     *        The name of the dedicated IP pool that the IP address is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DedicatedIp withPoolName(String poolName) {
        setPoolName(poolName);
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
        if (getIp() != null)
            sb.append("Ip: ").append(getIp()).append(",");
        if (getWarmupStatus() != null)
            sb.append("WarmupStatus: ").append(getWarmupStatus()).append(",");
        if (getWarmupPercentage() != null)
            sb.append("WarmupPercentage: ").append(getWarmupPercentage()).append(",");
        if (getPoolName() != null)
            sb.append("PoolName: ").append(getPoolName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DedicatedIp == false)
            return false;
        DedicatedIp other = (DedicatedIp) obj;
        if (other.getIp() == null ^ this.getIp() == null)
            return false;
        if (other.getIp() != null && other.getIp().equals(this.getIp()) == false)
            return false;
        if (other.getWarmupStatus() == null ^ this.getWarmupStatus() == null)
            return false;
        if (other.getWarmupStatus() != null && other.getWarmupStatus().equals(this.getWarmupStatus()) == false)
            return false;
        if (other.getWarmupPercentage() == null ^ this.getWarmupPercentage() == null)
            return false;
        if (other.getWarmupPercentage() != null && other.getWarmupPercentage().equals(this.getWarmupPercentage()) == false)
            return false;
        if (other.getPoolName() == null ^ this.getPoolName() == null)
            return false;
        if (other.getPoolName() != null && other.getPoolName().equals(this.getPoolName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIp() == null) ? 0 : getIp().hashCode());
        hashCode = prime * hashCode + ((getWarmupStatus() == null) ? 0 : getWarmupStatus().hashCode());
        hashCode = prime * hashCode + ((getWarmupPercentage() == null) ? 0 : getWarmupPercentage().hashCode());
        hashCode = prime * hashCode + ((getPoolName() == null) ? 0 : getPoolName().hashCode());
        return hashCode;
    }

    @Override
    public DedicatedIp clone() {
        try {
            return (DedicatedIp) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.DedicatedIpMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
