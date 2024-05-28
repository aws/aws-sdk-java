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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The CIS number filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CisNumberFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CisNumberFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The CIS number filter's lower inclusive.
     * </p>
     */
    private Integer lowerInclusive;
    /**
     * <p>
     * The CIS number filter's upper inclusive.
     * </p>
     */
    private Integer upperInclusive;

    /**
     * <p>
     * The CIS number filter's lower inclusive.
     * </p>
     * 
     * @param lowerInclusive
     *        The CIS number filter's lower inclusive.
     */

    public void setLowerInclusive(Integer lowerInclusive) {
        this.lowerInclusive = lowerInclusive;
    }

    /**
     * <p>
     * The CIS number filter's lower inclusive.
     * </p>
     * 
     * @return The CIS number filter's lower inclusive.
     */

    public Integer getLowerInclusive() {
        return this.lowerInclusive;
    }

    /**
     * <p>
     * The CIS number filter's lower inclusive.
     * </p>
     * 
     * @param lowerInclusive
     *        The CIS number filter's lower inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisNumberFilter withLowerInclusive(Integer lowerInclusive) {
        setLowerInclusive(lowerInclusive);
        return this;
    }

    /**
     * <p>
     * The CIS number filter's upper inclusive.
     * </p>
     * 
     * @param upperInclusive
     *        The CIS number filter's upper inclusive.
     */

    public void setUpperInclusive(Integer upperInclusive) {
        this.upperInclusive = upperInclusive;
    }

    /**
     * <p>
     * The CIS number filter's upper inclusive.
     * </p>
     * 
     * @return The CIS number filter's upper inclusive.
     */

    public Integer getUpperInclusive() {
        return this.upperInclusive;
    }

    /**
     * <p>
     * The CIS number filter's upper inclusive.
     * </p>
     * 
     * @param upperInclusive
     *        The CIS number filter's upper inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisNumberFilter withUpperInclusive(Integer upperInclusive) {
        setUpperInclusive(upperInclusive);
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
        if (getLowerInclusive() != null)
            sb.append("LowerInclusive: ").append(getLowerInclusive()).append(",");
        if (getUpperInclusive() != null)
            sb.append("UpperInclusive: ").append(getUpperInclusive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CisNumberFilter == false)
            return false;
        CisNumberFilter other = (CisNumberFilter) obj;
        if (other.getLowerInclusive() == null ^ this.getLowerInclusive() == null)
            return false;
        if (other.getLowerInclusive() != null && other.getLowerInclusive().equals(this.getLowerInclusive()) == false)
            return false;
        if (other.getUpperInclusive() == null ^ this.getUpperInclusive() == null)
            return false;
        if (other.getUpperInclusive() != null && other.getUpperInclusive().equals(this.getUpperInclusive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLowerInclusive() == null) ? 0 : getLowerInclusive().hashCode());
        hashCode = prime * hashCode + ((getUpperInclusive() == null) ? 0 : getUpperInclusive().hashCode());
        return hashCode;
    }

    @Override
    public CisNumberFilter clone() {
        try {
            return (CisNumberFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.CisNumberFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
