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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a dedicated IP pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DedicatedIpPool" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DedicatedIpPool implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the dedicated IP pool.
     * </p>
     */
    private String poolName;
    /**
     * <p>
     * The type of the dedicated IP pool.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STANDARD</code> – A dedicated IP pool where the customer can control which IPs are part of the pool.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MANAGED</code> – A dedicated IP pool where the reputation and number of IPs is automatically managed by
     * Amazon SES.
     * </p>
     * </li>
     * </ul>
     */
    private String scalingMode;

    /**
     * <p>
     * The name of the dedicated IP pool.
     * </p>
     * 
     * @param poolName
     *        The name of the dedicated IP pool.
     */

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    /**
     * <p>
     * The name of the dedicated IP pool.
     * </p>
     * 
     * @return The name of the dedicated IP pool.
     */

    public String getPoolName() {
        return this.poolName;
    }

    /**
     * <p>
     * The name of the dedicated IP pool.
     * </p>
     * 
     * @param poolName
     *        The name of the dedicated IP pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DedicatedIpPool withPoolName(String poolName) {
        setPoolName(poolName);
        return this;
    }

    /**
     * <p>
     * The type of the dedicated IP pool.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STANDARD</code> – A dedicated IP pool where the customer can control which IPs are part of the pool.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MANAGED</code> – A dedicated IP pool where the reputation and number of IPs is automatically managed by
     * Amazon SES.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalingMode
     *        The type of the dedicated IP pool.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>STANDARD</code> – A dedicated IP pool where the customer can control which IPs are part of the pool.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MANAGED</code> – A dedicated IP pool where the reputation and number of IPs is automatically managed
     *        by Amazon SES.
     *        </p>
     *        </li>
     * @see ScalingMode
     */

    public void setScalingMode(String scalingMode) {
        this.scalingMode = scalingMode;
    }

    /**
     * <p>
     * The type of the dedicated IP pool.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STANDARD</code> – A dedicated IP pool where the customer can control which IPs are part of the pool.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MANAGED</code> – A dedicated IP pool where the reputation and number of IPs is automatically managed by
     * Amazon SES.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of the dedicated IP pool.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>STANDARD</code> – A dedicated IP pool where the customer can control which IPs are part of the
     *         pool.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MANAGED</code> – A dedicated IP pool where the reputation and number of IPs is automatically
     *         managed by Amazon SES.
     *         </p>
     *         </li>
     * @see ScalingMode
     */

    public String getScalingMode() {
        return this.scalingMode;
    }

    /**
     * <p>
     * The type of the dedicated IP pool.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STANDARD</code> – A dedicated IP pool where the customer can control which IPs are part of the pool.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MANAGED</code> – A dedicated IP pool where the reputation and number of IPs is automatically managed by
     * Amazon SES.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalingMode
     *        The type of the dedicated IP pool.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>STANDARD</code> – A dedicated IP pool where the customer can control which IPs are part of the pool.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MANAGED</code> – A dedicated IP pool where the reputation and number of IPs is automatically managed
     *        by Amazon SES.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingMode
     */

    public DedicatedIpPool withScalingMode(String scalingMode) {
        setScalingMode(scalingMode);
        return this;
    }

    /**
     * <p>
     * The type of the dedicated IP pool.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STANDARD</code> – A dedicated IP pool where the customer can control which IPs are part of the pool.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MANAGED</code> – A dedicated IP pool where the reputation and number of IPs is automatically managed by
     * Amazon SES.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalingMode
     *        The type of the dedicated IP pool.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>STANDARD</code> – A dedicated IP pool where the customer can control which IPs are part of the pool.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MANAGED</code> – A dedicated IP pool where the reputation and number of IPs is automatically managed
     *        by Amazon SES.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingMode
     */

    public DedicatedIpPool withScalingMode(ScalingMode scalingMode) {
        this.scalingMode = scalingMode.toString();
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
        if (getPoolName() != null)
            sb.append("PoolName: ").append(getPoolName()).append(",");
        if (getScalingMode() != null)
            sb.append("ScalingMode: ").append(getScalingMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DedicatedIpPool == false)
            return false;
        DedicatedIpPool other = (DedicatedIpPool) obj;
        if (other.getPoolName() == null ^ this.getPoolName() == null)
            return false;
        if (other.getPoolName() != null && other.getPoolName().equals(this.getPoolName()) == false)
            return false;
        if (other.getScalingMode() == null ^ this.getScalingMode() == null)
            return false;
        if (other.getScalingMode() != null && other.getScalingMode().equals(this.getScalingMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPoolName() == null) ? 0 : getPoolName().hashCode());
        hashCode = prime * hashCode + ((getScalingMode() == null) ? 0 : getScalingMode().hashCode());
        return hashCode;
    }

    @Override
    public DedicatedIpPool clone() {
        try {
            return (DedicatedIpPool) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.DedicatedIpPoolMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
