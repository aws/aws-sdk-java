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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The minimum and maximum number of network interfaces.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/NetworkInterfaceCount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInterfaceCount implements Serializable, Cloneable {

    /**
     * <p>
     * The minimum number of network interfaces. If this parameter is not specified, there is no minimum limit.
     * </p>
     */
    private Integer min;
    /**
     * <p>
     * The maximum number of network interfaces. If this parameter is not specified, there is no maximum limit.
     * </p>
     */
    private Integer max;

    /**
     * <p>
     * The minimum number of network interfaces. If this parameter is not specified, there is no minimum limit.
     * </p>
     * 
     * @param min
     *        The minimum number of network interfaces. If this parameter is not specified, there is no minimum limit.
     */

    public void setMin(Integer min) {
        this.min = min;
    }

    /**
     * <p>
     * The minimum number of network interfaces. If this parameter is not specified, there is no minimum limit.
     * </p>
     * 
     * @return The minimum number of network interfaces. If this parameter is not specified, there is no minimum limit.
     */

    public Integer getMin() {
        return this.min;
    }

    /**
     * <p>
     * The minimum number of network interfaces. If this parameter is not specified, there is no minimum limit.
     * </p>
     * 
     * @param min
     *        The minimum number of network interfaces. If this parameter is not specified, there is no minimum limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterfaceCount withMin(Integer min) {
        setMin(min);
        return this;
    }

    /**
     * <p>
     * The maximum number of network interfaces. If this parameter is not specified, there is no maximum limit.
     * </p>
     * 
     * @param max
     *        The maximum number of network interfaces. If this parameter is not specified, there is no maximum limit.
     */

    public void setMax(Integer max) {
        this.max = max;
    }

    /**
     * <p>
     * The maximum number of network interfaces. If this parameter is not specified, there is no maximum limit.
     * </p>
     * 
     * @return The maximum number of network interfaces. If this parameter is not specified, there is no maximum limit.
     */

    public Integer getMax() {
        return this.max;
    }

    /**
     * <p>
     * The maximum number of network interfaces. If this parameter is not specified, there is no maximum limit.
     * </p>
     * 
     * @param max
     *        The maximum number of network interfaces. If this parameter is not specified, there is no maximum limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterfaceCount withMax(Integer max) {
        setMax(max);
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
        if (getMin() != null)
            sb.append("Min: ").append(getMin()).append(",");
        if (getMax() != null)
            sb.append("Max: ").append(getMax());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkInterfaceCount == false)
            return false;
        NetworkInterfaceCount other = (NetworkInterfaceCount) obj;
        if (other.getMin() == null ^ this.getMin() == null)
            return false;
        if (other.getMin() != null && other.getMin().equals(this.getMin()) == false)
            return false;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMin() == null) ? 0 : getMin().hashCode());
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        return hashCode;
    }

    @Override
    public NetworkInterfaceCount clone() {
        try {
            return (NetworkInterfaceCount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
