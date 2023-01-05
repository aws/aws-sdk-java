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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of an insight visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/InsightConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The computations configurations of the insight visual
     * </p>
     */
    private java.util.List<Computation> computations;
    /**
     * <p>
     * The custom narrative of the insight visual.
     * </p>
     */
    private CustomNarrativeOptions customNarrative;

    /**
     * <p>
     * The computations configurations of the insight visual
     * </p>
     * 
     * @return The computations configurations of the insight visual
     */

    public java.util.List<Computation> getComputations() {
        return computations;
    }

    /**
     * <p>
     * The computations configurations of the insight visual
     * </p>
     * 
     * @param computations
     *        The computations configurations of the insight visual
     */

    public void setComputations(java.util.Collection<Computation> computations) {
        if (computations == null) {
            this.computations = null;
            return;
        }

        this.computations = new java.util.ArrayList<Computation>(computations);
    }

    /**
     * <p>
     * The computations configurations of the insight visual
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComputations(java.util.Collection)} or {@link #withComputations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param computations
     *        The computations configurations of the insight visual
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightConfiguration withComputations(Computation... computations) {
        if (this.computations == null) {
            setComputations(new java.util.ArrayList<Computation>(computations.length));
        }
        for (Computation ele : computations) {
            this.computations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The computations configurations of the insight visual
     * </p>
     * 
     * @param computations
     *        The computations configurations of the insight visual
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightConfiguration withComputations(java.util.Collection<Computation> computations) {
        setComputations(computations);
        return this;
    }

    /**
     * <p>
     * The custom narrative of the insight visual.
     * </p>
     * 
     * @param customNarrative
     *        The custom narrative of the insight visual.
     */

    public void setCustomNarrative(CustomNarrativeOptions customNarrative) {
        this.customNarrative = customNarrative;
    }

    /**
     * <p>
     * The custom narrative of the insight visual.
     * </p>
     * 
     * @return The custom narrative of the insight visual.
     */

    public CustomNarrativeOptions getCustomNarrative() {
        return this.customNarrative;
    }

    /**
     * <p>
     * The custom narrative of the insight visual.
     * </p>
     * 
     * @param customNarrative
     *        The custom narrative of the insight visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightConfiguration withCustomNarrative(CustomNarrativeOptions customNarrative) {
        setCustomNarrative(customNarrative);
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
        if (getComputations() != null)
            sb.append("Computations: ").append(getComputations()).append(",");
        if (getCustomNarrative() != null)
            sb.append("CustomNarrative: ").append(getCustomNarrative());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsightConfiguration == false)
            return false;
        InsightConfiguration other = (InsightConfiguration) obj;
        if (other.getComputations() == null ^ this.getComputations() == null)
            return false;
        if (other.getComputations() != null && other.getComputations().equals(this.getComputations()) == false)
            return false;
        if (other.getCustomNarrative() == null ^ this.getCustomNarrative() == null)
            return false;
        if (other.getCustomNarrative() != null && other.getCustomNarrative().equals(this.getCustomNarrative()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComputations() == null) ? 0 : getComputations().hashCode());
        hashCode = prime * hashCode + ((getCustomNarrative() == null) ? 0 : getCustomNarrative().hashCode());
        return hashCode;
    }

    @Override
    public InsightConfiguration clone() {
        try {
            return (InsightConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.InsightConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
