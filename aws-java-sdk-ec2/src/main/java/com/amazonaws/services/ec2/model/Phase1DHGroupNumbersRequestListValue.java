/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies a Diffie-Hellman group number for the VPN tunnel for phase 1 IKE negotiations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Phase1DHGroupNumbersRequestListValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Phase1DHGroupNumbersRequestListValue implements Serializable, Cloneable {

    /**
     * <p>
     * The Diffie-Hellmann group number.
     * </p>
     */
    private Integer value;

    /**
     * <p>
     * The Diffie-Hellmann group number.
     * </p>
     * 
     * @param value
     *        The Diffie-Hellmann group number.
     */

    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * <p>
     * The Diffie-Hellmann group number.
     * </p>
     * 
     * @return The Diffie-Hellmann group number.
     */

    public Integer getValue() {
        return this.value;
    }

    /**
     * <p>
     * The Diffie-Hellmann group number.
     * </p>
     * 
     * @param value
     *        The Diffie-Hellmann group number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Phase1DHGroupNumbersRequestListValue withValue(Integer value) {
        setValue(value);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Phase1DHGroupNumbersRequestListValue == false)
            return false;
        Phase1DHGroupNumbersRequestListValue other = (Phase1DHGroupNumbersRequestListValue) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Phase1DHGroupNumbersRequestListValue clone() {
        try {
            return (Phase1DHGroupNumbersRequestListValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
