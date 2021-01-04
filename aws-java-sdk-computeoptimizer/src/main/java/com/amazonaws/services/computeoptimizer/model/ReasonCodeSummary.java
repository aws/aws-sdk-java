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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of a finding reason code.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ReasonCodeSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReasonCodeSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the finding reason code.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the finding reason code summary.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * The name of the finding reason code.
     * </p>
     * 
     * @param name
     *        The name of the finding reason code.
     * @see FindingReasonCode
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the finding reason code.
     * </p>
     * 
     * @return The name of the finding reason code.
     * @see FindingReasonCode
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the finding reason code.
     * </p>
     * 
     * @param name
     *        The name of the finding reason code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingReasonCode
     */

    public ReasonCodeSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the finding reason code.
     * </p>
     * 
     * @param name
     *        The name of the finding reason code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingReasonCode
     */

    public ReasonCodeSummary withName(FindingReasonCode name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The value of the finding reason code summary.
     * </p>
     * 
     * @param value
     *        The value of the finding reason code summary.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the finding reason code summary.
     * </p>
     * 
     * @return The value of the finding reason code summary.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the finding reason code summary.
     * </p>
     * 
     * @param value
     *        The value of the finding reason code summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReasonCodeSummary withValue(Double value) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof ReasonCodeSummary == false)
            return false;
        ReasonCodeSummary other = (ReasonCodeSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ReasonCodeSummary clone() {
        try {
            return (ReasonCodeSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.ReasonCodeSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
