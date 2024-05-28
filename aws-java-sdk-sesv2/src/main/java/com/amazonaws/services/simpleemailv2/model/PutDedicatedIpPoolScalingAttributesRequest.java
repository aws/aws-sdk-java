/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to convert a dedicated IP pool to a different scaling mode.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutDedicatedIpPoolScalingAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDedicatedIpPoolScalingAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the dedicated IP pool.
     * </p>
     */
    private String poolName;
    /**
     * <p>
     * The scaling mode to apply to the dedicated IP pool.
     * </p>
     * <note>
     * <p>
     * Changing the scaling mode from <code>MANAGED</code> to <code>STANDARD</code> is not supported.
     * </p>
     * </note>
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

    public PutDedicatedIpPoolScalingAttributesRequest withPoolName(String poolName) {
        setPoolName(poolName);
        return this;
    }

    /**
     * <p>
     * The scaling mode to apply to the dedicated IP pool.
     * </p>
     * <note>
     * <p>
     * Changing the scaling mode from <code>MANAGED</code> to <code>STANDARD</code> is not supported.
     * </p>
     * </note>
     * 
     * @param scalingMode
     *        The scaling mode to apply to the dedicated IP pool.</p> <note>
     *        <p>
     *        Changing the scaling mode from <code>MANAGED</code> to <code>STANDARD</code> is not supported.
     *        </p>
     * @see ScalingMode
     */

    public void setScalingMode(String scalingMode) {
        this.scalingMode = scalingMode;
    }

    /**
     * <p>
     * The scaling mode to apply to the dedicated IP pool.
     * </p>
     * <note>
     * <p>
     * Changing the scaling mode from <code>MANAGED</code> to <code>STANDARD</code> is not supported.
     * </p>
     * </note>
     * 
     * @return The scaling mode to apply to the dedicated IP pool.</p> <note>
     *         <p>
     *         Changing the scaling mode from <code>MANAGED</code> to <code>STANDARD</code> is not supported.
     *         </p>
     * @see ScalingMode
     */

    public String getScalingMode() {
        return this.scalingMode;
    }

    /**
     * <p>
     * The scaling mode to apply to the dedicated IP pool.
     * </p>
     * <note>
     * <p>
     * Changing the scaling mode from <code>MANAGED</code> to <code>STANDARD</code> is not supported.
     * </p>
     * </note>
     * 
     * @param scalingMode
     *        The scaling mode to apply to the dedicated IP pool.</p> <note>
     *        <p>
     *        Changing the scaling mode from <code>MANAGED</code> to <code>STANDARD</code> is not supported.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingMode
     */

    public PutDedicatedIpPoolScalingAttributesRequest withScalingMode(String scalingMode) {
        setScalingMode(scalingMode);
        return this;
    }

    /**
     * <p>
     * The scaling mode to apply to the dedicated IP pool.
     * </p>
     * <note>
     * <p>
     * Changing the scaling mode from <code>MANAGED</code> to <code>STANDARD</code> is not supported.
     * </p>
     * </note>
     * 
     * @param scalingMode
     *        The scaling mode to apply to the dedicated IP pool.</p> <note>
     *        <p>
     *        Changing the scaling mode from <code>MANAGED</code> to <code>STANDARD</code> is not supported.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingMode
     */

    public PutDedicatedIpPoolScalingAttributesRequest withScalingMode(ScalingMode scalingMode) {
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

        if (obj instanceof PutDedicatedIpPoolScalingAttributesRequest == false)
            return false;
        PutDedicatedIpPoolScalingAttributesRequest other = (PutDedicatedIpPoolScalingAttributesRequest) obj;
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
    public PutDedicatedIpPoolScalingAttributesRequest clone() {
        return (PutDedicatedIpPoolScalingAttributesRequest) super.clone();
    }

}
