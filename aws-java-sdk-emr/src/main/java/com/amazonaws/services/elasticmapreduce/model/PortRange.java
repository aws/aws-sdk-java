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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of port ranges that are permitted to allow inbound traffic from all public IP addresses. To specify a single
 * port, use the same value for <code>MinRange</code> and <code>MaxRange</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/PortRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The smallest port number in a specified range of port numbers.
     * </p>
     */
    private Integer minRange;
    /**
     * <p>
     * The smallest port number in a specified range of port numbers.
     * </p>
     */
    private Integer maxRange;

    /**
     * <p>
     * The smallest port number in a specified range of port numbers.
     * </p>
     * 
     * @param minRange
     *        The smallest port number in a specified range of port numbers.
     */

    public void setMinRange(Integer minRange) {
        this.minRange = minRange;
    }

    /**
     * <p>
     * The smallest port number in a specified range of port numbers.
     * </p>
     * 
     * @return The smallest port number in a specified range of port numbers.
     */

    public Integer getMinRange() {
        return this.minRange;
    }

    /**
     * <p>
     * The smallest port number in a specified range of port numbers.
     * </p>
     * 
     * @param minRange
     *        The smallest port number in a specified range of port numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortRange withMinRange(Integer minRange) {
        setMinRange(minRange);
        return this;
    }

    /**
     * <p>
     * The smallest port number in a specified range of port numbers.
     * </p>
     * 
     * @param maxRange
     *        The smallest port number in a specified range of port numbers.
     */

    public void setMaxRange(Integer maxRange) {
        this.maxRange = maxRange;
    }

    /**
     * <p>
     * The smallest port number in a specified range of port numbers.
     * </p>
     * 
     * @return The smallest port number in a specified range of port numbers.
     */

    public Integer getMaxRange() {
        return this.maxRange;
    }

    /**
     * <p>
     * The smallest port number in a specified range of port numbers.
     * </p>
     * 
     * @param maxRange
     *        The smallest port number in a specified range of port numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortRange withMaxRange(Integer maxRange) {
        setMaxRange(maxRange);
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
        if (getMinRange() != null)
            sb.append("MinRange: ").append(getMinRange()).append(",");
        if (getMaxRange() != null)
            sb.append("MaxRange: ").append(getMaxRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortRange == false)
            return false;
        PortRange other = (PortRange) obj;
        if (other.getMinRange() == null ^ this.getMinRange() == null)
            return false;
        if (other.getMinRange() != null && other.getMinRange().equals(this.getMinRange()) == false)
            return false;
        if (other.getMaxRange() == null ^ this.getMaxRange() == null)
            return false;
        if (other.getMaxRange() != null && other.getMaxRange().equals(this.getMaxRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinRange() == null) ? 0 : getMinRange().hashCode());
        hashCode = prime * hashCode + ((getMaxRange() == null) ? 0 : getMaxRange().hashCode());
        return hashCode;
    }

    @Override
    public PortRange clone() {
        try {
            return (PortRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.PortRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
