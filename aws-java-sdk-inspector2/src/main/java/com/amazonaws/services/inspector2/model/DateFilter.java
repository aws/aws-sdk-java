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
 * Contains details on the time range used to filter findings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/DateFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DateFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A timestamp representing the end of the time period filtered on.
     * </p>
     */
    private java.util.Date endInclusive;
    /**
     * <p>
     * A timestamp representing the start of the time period filtered on.
     * </p>
     */
    private java.util.Date startInclusive;

    /**
     * <p>
     * A timestamp representing the end of the time period filtered on.
     * </p>
     * 
     * @param endInclusive
     *        A timestamp representing the end of the time period filtered on.
     */

    public void setEndInclusive(java.util.Date endInclusive) {
        this.endInclusive = endInclusive;
    }

    /**
     * <p>
     * A timestamp representing the end of the time period filtered on.
     * </p>
     * 
     * @return A timestamp representing the end of the time period filtered on.
     */

    public java.util.Date getEndInclusive() {
        return this.endInclusive;
    }

    /**
     * <p>
     * A timestamp representing the end of the time period filtered on.
     * </p>
     * 
     * @param endInclusive
     *        A timestamp representing the end of the time period filtered on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateFilter withEndInclusive(java.util.Date endInclusive) {
        setEndInclusive(endInclusive);
        return this;
    }

    /**
     * <p>
     * A timestamp representing the start of the time period filtered on.
     * </p>
     * 
     * @param startInclusive
     *        A timestamp representing the start of the time period filtered on.
     */

    public void setStartInclusive(java.util.Date startInclusive) {
        this.startInclusive = startInclusive;
    }

    /**
     * <p>
     * A timestamp representing the start of the time period filtered on.
     * </p>
     * 
     * @return A timestamp representing the start of the time period filtered on.
     */

    public java.util.Date getStartInclusive() {
        return this.startInclusive;
    }

    /**
     * <p>
     * A timestamp representing the start of the time period filtered on.
     * </p>
     * 
     * @param startInclusive
     *        A timestamp representing the start of the time period filtered on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateFilter withStartInclusive(java.util.Date startInclusive) {
        setStartInclusive(startInclusive);
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
        if (getEndInclusive() != null)
            sb.append("EndInclusive: ").append(getEndInclusive()).append(",");
        if (getStartInclusive() != null)
            sb.append("StartInclusive: ").append(getStartInclusive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DateFilter == false)
            return false;
        DateFilter other = (DateFilter) obj;
        if (other.getEndInclusive() == null ^ this.getEndInclusive() == null)
            return false;
        if (other.getEndInclusive() != null && other.getEndInclusive().equals(this.getEndInclusive()) == false)
            return false;
        if (other.getStartInclusive() == null ^ this.getStartInclusive() == null)
            return false;
        if (other.getStartInclusive() != null && other.getStartInclusive().equals(this.getStartInclusive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndInclusive() == null) ? 0 : getEndInclusive().hashCode());
        hashCode = prime * hashCode + ((getStartInclusive() == null) ? 0 : getStartInclusive().hashCode());
        return hashCode;
    }

    @Override
    public DateFilter clone() {
        try {
            return (DateFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.DateFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
