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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of information about the attack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/SummarizedAttackVector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SummarizedAttackVector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attack type, for example, SNMP reflection or SYN flood.
     * </p>
     */
    private String vectorType;
    /**
     * <p>
     * The list of counters that describe the details of the attack.
     * </p>
     */
    private java.util.List<SummarizedCounter> vectorCounters;

    /**
     * <p>
     * The attack type, for example, SNMP reflection or SYN flood.
     * </p>
     * 
     * @param vectorType
     *        The attack type, for example, SNMP reflection or SYN flood.
     */

    public void setVectorType(String vectorType) {
        this.vectorType = vectorType;
    }

    /**
     * <p>
     * The attack type, for example, SNMP reflection or SYN flood.
     * </p>
     * 
     * @return The attack type, for example, SNMP reflection or SYN flood.
     */

    public String getVectorType() {
        return this.vectorType;
    }

    /**
     * <p>
     * The attack type, for example, SNMP reflection or SYN flood.
     * </p>
     * 
     * @param vectorType
     *        The attack type, for example, SNMP reflection or SYN flood.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummarizedAttackVector withVectorType(String vectorType) {
        setVectorType(vectorType);
        return this;
    }

    /**
     * <p>
     * The list of counters that describe the details of the attack.
     * </p>
     * 
     * @return The list of counters that describe the details of the attack.
     */

    public java.util.List<SummarizedCounter> getVectorCounters() {
        return vectorCounters;
    }

    /**
     * <p>
     * The list of counters that describe the details of the attack.
     * </p>
     * 
     * @param vectorCounters
     *        The list of counters that describe the details of the attack.
     */

    public void setVectorCounters(java.util.Collection<SummarizedCounter> vectorCounters) {
        if (vectorCounters == null) {
            this.vectorCounters = null;
            return;
        }

        this.vectorCounters = new java.util.ArrayList<SummarizedCounter>(vectorCounters);
    }

    /**
     * <p>
     * The list of counters that describe the details of the attack.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVectorCounters(java.util.Collection)} or {@link #withVectorCounters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param vectorCounters
     *        The list of counters that describe the details of the attack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummarizedAttackVector withVectorCounters(SummarizedCounter... vectorCounters) {
        if (this.vectorCounters == null) {
            setVectorCounters(new java.util.ArrayList<SummarizedCounter>(vectorCounters.length));
        }
        for (SummarizedCounter ele : vectorCounters) {
            this.vectorCounters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of counters that describe the details of the attack.
     * </p>
     * 
     * @param vectorCounters
     *        The list of counters that describe the details of the attack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummarizedAttackVector withVectorCounters(java.util.Collection<SummarizedCounter> vectorCounters) {
        setVectorCounters(vectorCounters);
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
        if (getVectorType() != null)
            sb.append("VectorType: ").append(getVectorType()).append(",");
        if (getVectorCounters() != null)
            sb.append("VectorCounters: ").append(getVectorCounters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SummarizedAttackVector == false)
            return false;
        SummarizedAttackVector other = (SummarizedAttackVector) obj;
        if (other.getVectorType() == null ^ this.getVectorType() == null)
            return false;
        if (other.getVectorType() != null && other.getVectorType().equals(this.getVectorType()) == false)
            return false;
        if (other.getVectorCounters() == null ^ this.getVectorCounters() == null)
            return false;
        if (other.getVectorCounters() != null && other.getVectorCounters().equals(this.getVectorCounters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVectorType() == null) ? 0 : getVectorType().hashCode());
        hashCode = prime * hashCode + ((getVectorCounters() == null) ? 0 : getVectorCounters().hashCode());
        return hashCode;
    }

    @Override
    public SummarizedAttackVector clone() {
        try {
            return (SummarizedAttackVector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.SummarizedAttackVectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
