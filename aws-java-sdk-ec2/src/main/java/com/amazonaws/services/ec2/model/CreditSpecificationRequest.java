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
 * The credit option for CPU usage of a T2 or T3 instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreditSpecificationRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreditSpecificationRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The credit option for CPU usage of a T2 or T3 instance. Valid values are <code>standard</code> and
     * <code>unlimited</code>.
     * </p>
     */
    private String cpuCredits;

    /**
     * <p>
     * The credit option for CPU usage of a T2 or T3 instance. Valid values are <code>standard</code> and
     * <code>unlimited</code>.
     * </p>
     * 
     * @param cpuCredits
     *        The credit option for CPU usage of a T2 or T3 instance. Valid values are <code>standard</code> and
     *        <code>unlimited</code>.
     */

    public void setCpuCredits(String cpuCredits) {
        this.cpuCredits = cpuCredits;
    }

    /**
     * <p>
     * The credit option for CPU usage of a T2 or T3 instance. Valid values are <code>standard</code> and
     * <code>unlimited</code>.
     * </p>
     * 
     * @return The credit option for CPU usage of a T2 or T3 instance. Valid values are <code>standard</code> and
     *         <code>unlimited</code>.
     */

    public String getCpuCredits() {
        return this.cpuCredits;
    }

    /**
     * <p>
     * The credit option for CPU usage of a T2 or T3 instance. Valid values are <code>standard</code> and
     * <code>unlimited</code>.
     * </p>
     * 
     * @param cpuCredits
     *        The credit option for CPU usage of a T2 or T3 instance. Valid values are <code>standard</code> and
     *        <code>unlimited</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreditSpecificationRequest withCpuCredits(String cpuCredits) {
        setCpuCredits(cpuCredits);
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
        if (getCpuCredits() != null)
            sb.append("CpuCredits: ").append(getCpuCredits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreditSpecificationRequest == false)
            return false;
        CreditSpecificationRequest other = (CreditSpecificationRequest) obj;
        if (other.getCpuCredits() == null ^ this.getCpuCredits() == null)
            return false;
        if (other.getCpuCredits() != null && other.getCpuCredits().equals(this.getCpuCredits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCpuCredits() == null) ? 0 : getCpuCredits().hashCode());
        return hashCode;
    }

    @Override
    public CreditSpecificationRequest clone() {
        try {
            return (CreditSpecificationRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
