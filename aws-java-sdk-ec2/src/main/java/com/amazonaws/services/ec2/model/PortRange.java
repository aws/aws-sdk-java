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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a range of ports.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PortRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortRange implements Serializable, Cloneable {

    /**
     * <p>
     * The first port in the range.
     * </p>
     */
    private Integer from;
    /**
     * <p>
     * The last port in the range.
     * </p>
     */
    private Integer to;

    /**
     * <p>
     * The first port in the range.
     * </p>
     * 
     * @param from
     *        The first port in the range.
     */

    public void setFrom(Integer from) {
        this.from = from;
    }

    /**
     * <p>
     * The first port in the range.
     * </p>
     * 
     * @return The first port in the range.
     */

    public Integer getFrom() {
        return this.from;
    }

    /**
     * <p>
     * The first port in the range.
     * </p>
     * 
     * @param from
     *        The first port in the range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortRange withFrom(Integer from) {
        setFrom(from);
        return this;
    }

    /**
     * <p>
     * The last port in the range.
     * </p>
     * 
     * @param to
     *        The last port in the range.
     */

    public void setTo(Integer to) {
        this.to = to;
    }

    /**
     * <p>
     * The last port in the range.
     * </p>
     * 
     * @return The last port in the range.
     */

    public Integer getTo() {
        return this.to;
    }

    /**
     * <p>
     * The last port in the range.
     * </p>
     * 
     * @param to
     *        The last port in the range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortRange withTo(Integer to) {
        setTo(to);
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
        if (getFrom() != null)
            sb.append("From: ").append(getFrom()).append(",");
        if (getTo() != null)
            sb.append("To: ").append(getTo());
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
        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        if (other.getTo() == null ^ this.getTo() == null)
            return false;
        if (other.getTo() != null && other.getTo().equals(this.getTo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode + ((getTo() == null) ? 0 : getTo().hashCode());
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

}
