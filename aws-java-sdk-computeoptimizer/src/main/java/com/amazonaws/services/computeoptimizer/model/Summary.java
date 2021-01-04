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
 * The summary of a recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/Summary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Summary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The finding classification of the recommendation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the recommendation summary.
     * </p>
     */
    private Double value;
    /**
     * <p>
     * An array of objects that summarize a finding reason code.
     * </p>
     */
    private java.util.List<ReasonCodeSummary> reasonCodeSummaries;

    /**
     * <p>
     * The finding classification of the recommendation.
     * </p>
     * 
     * @param name
     *        The finding classification of the recommendation.
     * @see Finding
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The finding classification of the recommendation.
     * </p>
     * 
     * @return The finding classification of the recommendation.
     * @see Finding
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The finding classification of the recommendation.
     * </p>
     * 
     * @param name
     *        The finding classification of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Finding
     */

    public Summary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The finding classification of the recommendation.
     * </p>
     * 
     * @param name
     *        The finding classification of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Finding
     */

    public Summary withName(Finding name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The value of the recommendation summary.
     * </p>
     * 
     * @param value
     *        The value of the recommendation summary.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the recommendation summary.
     * </p>
     * 
     * @return The value of the recommendation summary.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the recommendation summary.
     * </p>
     * 
     * @param value
     *        The value of the recommendation summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Summary withValue(Double value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * An array of objects that summarize a finding reason code.
     * </p>
     * 
     * @return An array of objects that summarize a finding reason code.
     */

    public java.util.List<ReasonCodeSummary> getReasonCodeSummaries() {
        return reasonCodeSummaries;
    }

    /**
     * <p>
     * An array of objects that summarize a finding reason code.
     * </p>
     * 
     * @param reasonCodeSummaries
     *        An array of objects that summarize a finding reason code.
     */

    public void setReasonCodeSummaries(java.util.Collection<ReasonCodeSummary> reasonCodeSummaries) {
        if (reasonCodeSummaries == null) {
            this.reasonCodeSummaries = null;
            return;
        }

        this.reasonCodeSummaries = new java.util.ArrayList<ReasonCodeSummary>(reasonCodeSummaries);
    }

    /**
     * <p>
     * An array of objects that summarize a finding reason code.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReasonCodeSummaries(java.util.Collection)} or {@link #withReasonCodeSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param reasonCodeSummaries
     *        An array of objects that summarize a finding reason code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Summary withReasonCodeSummaries(ReasonCodeSummary... reasonCodeSummaries) {
        if (this.reasonCodeSummaries == null) {
            setReasonCodeSummaries(new java.util.ArrayList<ReasonCodeSummary>(reasonCodeSummaries.length));
        }
        for (ReasonCodeSummary ele : reasonCodeSummaries) {
            this.reasonCodeSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that summarize a finding reason code.
     * </p>
     * 
     * @param reasonCodeSummaries
     *        An array of objects that summarize a finding reason code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Summary withReasonCodeSummaries(java.util.Collection<ReasonCodeSummary> reasonCodeSummaries) {
        setReasonCodeSummaries(reasonCodeSummaries);
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
            sb.append("Value: ").append(getValue()).append(",");
        if (getReasonCodeSummaries() != null)
            sb.append("ReasonCodeSummaries: ").append(getReasonCodeSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Summary == false)
            return false;
        Summary other = (Summary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getReasonCodeSummaries() == null ^ this.getReasonCodeSummaries() == null)
            return false;
        if (other.getReasonCodeSummaries() != null && other.getReasonCodeSummaries().equals(this.getReasonCodeSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getReasonCodeSummaries() == null) ? 0 : getReasonCodeSummaries().hashCode());
        return hashCode;
    }

    @Override
    public Summary clone() {
        try {
            return (Summary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.SummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
