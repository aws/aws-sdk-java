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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the configuration of which variation to use as the "control" version. The "control" version
 * is used for comparison with other variations. This structure also specifies how much experiment traffic is allocated
 * to each variation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/OnlineAbDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OnlineAbDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the variation that is the default variation that the other variations are compared to.
     * </p>
     */
    private String controlTreatmentName;
    /**
     * <p>
     * A set of key-value pairs. The keys are variation names, and the values are the portion of experiment traffic to
     * be assigned to that variation. The traffic portion is specified in thousandths of a percent, so 20,000 for a
     * variation would allocate 20% of the experiment traffic to that variation.
     * </p>
     */
    private java.util.Map<String, Long> treatmentWeights;

    /**
     * <p>
     * The name of the variation that is the default variation that the other variations are compared to.
     * </p>
     * 
     * @param controlTreatmentName
     *        The name of the variation that is the default variation that the other variations are compared to.
     */

    public void setControlTreatmentName(String controlTreatmentName) {
        this.controlTreatmentName = controlTreatmentName;
    }

    /**
     * <p>
     * The name of the variation that is the default variation that the other variations are compared to.
     * </p>
     * 
     * @return The name of the variation that is the default variation that the other variations are compared to.
     */

    public String getControlTreatmentName() {
        return this.controlTreatmentName;
    }

    /**
     * <p>
     * The name of the variation that is the default variation that the other variations are compared to.
     * </p>
     * 
     * @param controlTreatmentName
     *        The name of the variation that is the default variation that the other variations are compared to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnlineAbDefinition withControlTreatmentName(String controlTreatmentName) {
        setControlTreatmentName(controlTreatmentName);
        return this;
    }

    /**
     * <p>
     * A set of key-value pairs. The keys are variation names, and the values are the portion of experiment traffic to
     * be assigned to that variation. The traffic portion is specified in thousandths of a percent, so 20,000 for a
     * variation would allocate 20% of the experiment traffic to that variation.
     * </p>
     * 
     * @return A set of key-value pairs. The keys are variation names, and the values are the portion of experiment
     *         traffic to be assigned to that variation. The traffic portion is specified in thousandths of a percent,
     *         so 20,000 for a variation would allocate 20% of the experiment traffic to that variation.
     */

    public java.util.Map<String, Long> getTreatmentWeights() {
        return treatmentWeights;
    }

    /**
     * <p>
     * A set of key-value pairs. The keys are variation names, and the values are the portion of experiment traffic to
     * be assigned to that variation. The traffic portion is specified in thousandths of a percent, so 20,000 for a
     * variation would allocate 20% of the experiment traffic to that variation.
     * </p>
     * 
     * @param treatmentWeights
     *        A set of key-value pairs. The keys are variation names, and the values are the portion of experiment
     *        traffic to be assigned to that variation. The traffic portion is specified in thousandths of a percent, so
     *        20,000 for a variation would allocate 20% of the experiment traffic to that variation.
     */

    public void setTreatmentWeights(java.util.Map<String, Long> treatmentWeights) {
        this.treatmentWeights = treatmentWeights;
    }

    /**
     * <p>
     * A set of key-value pairs. The keys are variation names, and the values are the portion of experiment traffic to
     * be assigned to that variation. The traffic portion is specified in thousandths of a percent, so 20,000 for a
     * variation would allocate 20% of the experiment traffic to that variation.
     * </p>
     * 
     * @param treatmentWeights
     *        A set of key-value pairs. The keys are variation names, and the values are the portion of experiment
     *        traffic to be assigned to that variation. The traffic portion is specified in thousandths of a percent, so
     *        20,000 for a variation would allocate 20% of the experiment traffic to that variation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnlineAbDefinition withTreatmentWeights(java.util.Map<String, Long> treatmentWeights) {
        setTreatmentWeights(treatmentWeights);
        return this;
    }

    /**
     * Add a single TreatmentWeights entry
     *
     * @see OnlineAbDefinition#withTreatmentWeights
     * @returns a reference to this object so that method calls can be chained together.
     */

    public OnlineAbDefinition addTreatmentWeightsEntry(String key, Long value) {
        if (null == this.treatmentWeights) {
            this.treatmentWeights = new java.util.HashMap<String, Long>();
        }
        if (this.treatmentWeights.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.treatmentWeights.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TreatmentWeights.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnlineAbDefinition clearTreatmentWeightsEntries() {
        this.treatmentWeights = null;
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
        if (getControlTreatmentName() != null)
            sb.append("ControlTreatmentName: ").append(getControlTreatmentName()).append(",");
        if (getTreatmentWeights() != null)
            sb.append("TreatmentWeights: ").append(getTreatmentWeights());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OnlineAbDefinition == false)
            return false;
        OnlineAbDefinition other = (OnlineAbDefinition) obj;
        if (other.getControlTreatmentName() == null ^ this.getControlTreatmentName() == null)
            return false;
        if (other.getControlTreatmentName() != null && other.getControlTreatmentName().equals(this.getControlTreatmentName()) == false)
            return false;
        if (other.getTreatmentWeights() == null ^ this.getTreatmentWeights() == null)
            return false;
        if (other.getTreatmentWeights() != null && other.getTreatmentWeights().equals(this.getTreatmentWeights()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getControlTreatmentName() == null) ? 0 : getControlTreatmentName().hashCode());
        hashCode = prime * hashCode + ((getTreatmentWeights() == null) ? 0 : getTreatmentWeights().hashCode());
        return hashCode;
    }

    @Override
    public OnlineAbDefinition clone() {
        try {
            return (OnlineAbDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.OnlineAbDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
