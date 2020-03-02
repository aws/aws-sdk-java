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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The amount of Savings Plans eligible usage that is covered by Savings Plans. All calculations consider the On-Demand
 * equivalent of your Savings Plans usage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/SavingsPlansCoverage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlansCoverage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attribute that applies to a specific <code>Dimension</code>.
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * The amount of Savings Plans eligible usage that the Savings Plans covered.
     * </p>
     */
    private SavingsPlansCoverageData coverage;

    private DateInterval timePeriod;

    /**
     * <p>
     * The attribute that applies to a specific <code>Dimension</code>.
     * </p>
     * 
     * @return The attribute that applies to a specific <code>Dimension</code>.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The attribute that applies to a specific <code>Dimension</code>.
     * </p>
     * 
     * @param attributes
     *        The attribute that applies to a specific <code>Dimension</code>.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The attribute that applies to a specific <code>Dimension</code>.
     * </p>
     * 
     * @param attributes
     *        The attribute that applies to a specific <code>Dimension</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansCoverage withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see SavingsPlansCoverage#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansCoverage addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansCoverage clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The amount of Savings Plans eligible usage that the Savings Plans covered.
     * </p>
     * 
     * @param coverage
     *        The amount of Savings Plans eligible usage that the Savings Plans covered.
     */

    public void setCoverage(SavingsPlansCoverageData coverage) {
        this.coverage = coverage;
    }

    /**
     * <p>
     * The amount of Savings Plans eligible usage that the Savings Plans covered.
     * </p>
     * 
     * @return The amount of Savings Plans eligible usage that the Savings Plans covered.
     */

    public SavingsPlansCoverageData getCoverage() {
        return this.coverage;
    }

    /**
     * <p>
     * The amount of Savings Plans eligible usage that the Savings Plans covered.
     * </p>
     * 
     * @param coverage
     *        The amount of Savings Plans eligible usage that the Savings Plans covered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansCoverage withCoverage(SavingsPlansCoverageData coverage) {
        setCoverage(coverage);
        return this;
    }

    /**
     * @param timePeriod
     */

    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * @return
     */

    public DateInterval getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * @param timePeriod
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansCoverage withTimePeriod(DateInterval timePeriod) {
        setTimePeriod(timePeriod);
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getCoverage() != null)
            sb.append("Coverage: ").append(getCoverage()).append(",");
        if (getTimePeriod() != null)
            sb.append("TimePeriod: ").append(getTimePeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SavingsPlansCoverage == false)
            return false;
        SavingsPlansCoverage other = (SavingsPlansCoverage) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getCoverage() == null ^ this.getCoverage() == null)
            return false;
        if (other.getCoverage() != null && other.getCoverage().equals(this.getCoverage()) == false)
            return false;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getCoverage() == null) ? 0 : getCoverage().hashCode());
        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        return hashCode;
    }

    @Override
    public SavingsPlansCoverage clone() {
        try {
            return (SavingsPlansCoverage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.SavingsPlansCoverageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
