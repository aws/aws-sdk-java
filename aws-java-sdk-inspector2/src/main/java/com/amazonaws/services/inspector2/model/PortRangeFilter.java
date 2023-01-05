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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that describes the details of a port range filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/PortRangeFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortRangeFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The port number the port range begins at.
     * </p>
     */
    private Integer beginInclusive;
    /**
     * <p>
     * The port number the port range ends at.
     * </p>
     */
    private Integer endInclusive;

    /**
     * <p>
     * The port number the port range begins at.
     * </p>
     * 
     * @param beginInclusive
     *        The port number the port range begins at.
     */

    public void setBeginInclusive(Integer beginInclusive) {
        this.beginInclusive = beginInclusive;
    }

    /**
     * <p>
     * The port number the port range begins at.
     * </p>
     * 
     * @return The port number the port range begins at.
     */

    public Integer getBeginInclusive() {
        return this.beginInclusive;
    }

    /**
     * <p>
     * The port number the port range begins at.
     * </p>
     * 
     * @param beginInclusive
     *        The port number the port range begins at.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortRangeFilter withBeginInclusive(Integer beginInclusive) {
        setBeginInclusive(beginInclusive);
        return this;
    }

    /**
     * <p>
     * The port number the port range ends at.
     * </p>
     * 
     * @param endInclusive
     *        The port number the port range ends at.
     */

    public void setEndInclusive(Integer endInclusive) {
        this.endInclusive = endInclusive;
    }

    /**
     * <p>
     * The port number the port range ends at.
     * </p>
     * 
     * @return The port number the port range ends at.
     */

    public Integer getEndInclusive() {
        return this.endInclusive;
    }

    /**
     * <p>
     * The port number the port range ends at.
     * </p>
     * 
     * @param endInclusive
     *        The port number the port range ends at.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortRangeFilter withEndInclusive(Integer endInclusive) {
        setEndInclusive(endInclusive);
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
        if (getBeginInclusive() != null)
            sb.append("BeginInclusive: ").append(getBeginInclusive()).append(",");
        if (getEndInclusive() != null)
            sb.append("EndInclusive: ").append(getEndInclusive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortRangeFilter == false)
            return false;
        PortRangeFilter other = (PortRangeFilter) obj;
        if (other.getBeginInclusive() == null ^ this.getBeginInclusive() == null)
            return false;
        if (other.getBeginInclusive() != null && other.getBeginInclusive().equals(this.getBeginInclusive()) == false)
            return false;
        if (other.getEndInclusive() == null ^ this.getEndInclusive() == null)
            return false;
        if (other.getEndInclusive() != null && other.getEndInclusive().equals(this.getEndInclusive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBeginInclusive() == null) ? 0 : getBeginInclusive().hashCode());
        hashCode = prime * hashCode + ((getEndInclusive() == null) ? 0 : getEndInclusive().hashCode());
        return hashCode;
    }

    @Override
    public PortRangeFilter clone() {
        try {
            return (PortRangeFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.PortRangeFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
