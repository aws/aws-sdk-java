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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A range of ports.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/PortRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The first port in the port range.
     * </p>
     */
    private Integer begin;
    /**
     * <p>
     * The last port in the port range.
     * </p>
     */
    private Integer end;

    /**
     * <p>
     * The first port in the port range.
     * </p>
     * 
     * @param begin
     *        The first port in the port range.
     */

    public void setBegin(Integer begin) {
        this.begin = begin;
    }

    /**
     * <p>
     * The first port in the port range.
     * </p>
     * 
     * @return The first port in the port range.
     */

    public Integer getBegin() {
        return this.begin;
    }

    /**
     * <p>
     * The first port in the port range.
     * </p>
     * 
     * @param begin
     *        The first port in the port range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortRange withBegin(Integer begin) {
        setBegin(begin);
        return this;
    }

    /**
     * <p>
     * The last port in the port range.
     * </p>
     * 
     * @param end
     *        The last port in the port range.
     */

    public void setEnd(Integer end) {
        this.end = end;
    }

    /**
     * <p>
     * The last port in the port range.
     * </p>
     * 
     * @return The last port in the port range.
     */

    public Integer getEnd() {
        return this.end;
    }

    /**
     * <p>
     * The last port in the port range.
     * </p>
     * 
     * @param end
     *        The last port in the port range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortRange withEnd(Integer end) {
        setEnd(end);
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
        if (getBegin() != null)
            sb.append("Begin: ").append(getBegin()).append(",");
        if (getEnd() != null)
            sb.append("End: ").append(getEnd());
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
        if (other.getBegin() == null ^ this.getBegin() == null)
            return false;
        if (other.getBegin() != null && other.getBegin().equals(this.getBegin()) == false)
            return false;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBegin() == null) ? 0 : getBegin().hashCode());
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
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
        com.amazonaws.services.securityhub.model.transform.PortRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
