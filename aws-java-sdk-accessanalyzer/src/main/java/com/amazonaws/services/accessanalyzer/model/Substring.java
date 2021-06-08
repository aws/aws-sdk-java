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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A reference to a substring of a literal string in a JSON document.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/Substring" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Substring implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The length of the substring.
     * </p>
     */
    private Integer length;
    /**
     * <p>
     * The start index of the substring, starting from 0.
     * </p>
     */
    private Integer start;

    /**
     * <p>
     * The length of the substring.
     * </p>
     * 
     * @param length
     *        The length of the substring.
     */

    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * <p>
     * The length of the substring.
     * </p>
     * 
     * @return The length of the substring.
     */

    public Integer getLength() {
        return this.length;
    }

    /**
     * <p>
     * The length of the substring.
     * </p>
     * 
     * @param length
     *        The length of the substring.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Substring withLength(Integer length) {
        setLength(length);
        return this;
    }

    /**
     * <p>
     * The start index of the substring, starting from 0.
     * </p>
     * 
     * @param start
     *        The start index of the substring, starting from 0.
     */

    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * <p>
     * The start index of the substring, starting from 0.
     * </p>
     * 
     * @return The start index of the substring, starting from 0.
     */

    public Integer getStart() {
        return this.start;
    }

    /**
     * <p>
     * The start index of the substring, starting from 0.
     * </p>
     * 
     * @param start
     *        The start index of the substring, starting from 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Substring withStart(Integer start) {
        setStart(start);
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
        if (getLength() != null)
            sb.append("Length: ").append(getLength()).append(",");
        if (getStart() != null)
            sb.append("Start: ").append(getStart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Substring == false)
            return false;
        Substring other = (Substring) obj;
        if (other.getLength() == null ^ this.getLength() == null)
            return false;
        if (other.getLength() != null && other.getLength().equals(this.getLength()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLength() == null) ? 0 : getLength().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        return hashCode;
    }

    @Override
    public Substring clone() {
        try {
            return (Substring) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.SubstringMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
