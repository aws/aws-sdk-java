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
package com.amazonaws.services.connectcontactlens.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The section of the contact audio where that category rule was detected.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-contact-lens-2020-08-21/PointOfInterest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PointOfInterest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The beginning offset in milliseconds where the category rule was detected.
     * </p>
     */
    private Integer beginOffsetMillis;
    /**
     * <p>
     * The ending offset in milliseconds where the category rule was detected.
     * </p>
     */
    private Integer endOffsetMillis;

    /**
     * <p>
     * The beginning offset in milliseconds where the category rule was detected.
     * </p>
     * 
     * @param beginOffsetMillis
     *        The beginning offset in milliseconds where the category rule was detected.
     */

    public void setBeginOffsetMillis(Integer beginOffsetMillis) {
        this.beginOffsetMillis = beginOffsetMillis;
    }

    /**
     * <p>
     * The beginning offset in milliseconds where the category rule was detected.
     * </p>
     * 
     * @return The beginning offset in milliseconds where the category rule was detected.
     */

    public Integer getBeginOffsetMillis() {
        return this.beginOffsetMillis;
    }

    /**
     * <p>
     * The beginning offset in milliseconds where the category rule was detected.
     * </p>
     * 
     * @param beginOffsetMillis
     *        The beginning offset in milliseconds where the category rule was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PointOfInterest withBeginOffsetMillis(Integer beginOffsetMillis) {
        setBeginOffsetMillis(beginOffsetMillis);
        return this;
    }

    /**
     * <p>
     * The ending offset in milliseconds where the category rule was detected.
     * </p>
     * 
     * @param endOffsetMillis
     *        The ending offset in milliseconds where the category rule was detected.
     */

    public void setEndOffsetMillis(Integer endOffsetMillis) {
        this.endOffsetMillis = endOffsetMillis;
    }

    /**
     * <p>
     * The ending offset in milliseconds where the category rule was detected.
     * </p>
     * 
     * @return The ending offset in milliseconds where the category rule was detected.
     */

    public Integer getEndOffsetMillis() {
        return this.endOffsetMillis;
    }

    /**
     * <p>
     * The ending offset in milliseconds where the category rule was detected.
     * </p>
     * 
     * @param endOffsetMillis
     *        The ending offset in milliseconds where the category rule was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PointOfInterest withEndOffsetMillis(Integer endOffsetMillis) {
        setEndOffsetMillis(endOffsetMillis);
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
        if (getBeginOffsetMillis() != null)
            sb.append("BeginOffsetMillis: ").append(getBeginOffsetMillis()).append(",");
        if (getEndOffsetMillis() != null)
            sb.append("EndOffsetMillis: ").append(getEndOffsetMillis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PointOfInterest == false)
            return false;
        PointOfInterest other = (PointOfInterest) obj;
        if (other.getBeginOffsetMillis() == null ^ this.getBeginOffsetMillis() == null)
            return false;
        if (other.getBeginOffsetMillis() != null && other.getBeginOffsetMillis().equals(this.getBeginOffsetMillis()) == false)
            return false;
        if (other.getEndOffsetMillis() == null ^ this.getEndOffsetMillis() == null)
            return false;
        if (other.getEndOffsetMillis() != null && other.getEndOffsetMillis().equals(this.getEndOffsetMillis()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBeginOffsetMillis() == null) ? 0 : getBeginOffsetMillis().hashCode());
        hashCode = prime * hashCode + ((getEndOffsetMillis() == null) ? 0 : getEndOffsetMillis().hashCode());
        return hashCode;
    }

    @Override
    public PointOfInterest clone() {
        try {
            return (PointOfInterest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcontactlens.model.transform.PointOfInterestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
