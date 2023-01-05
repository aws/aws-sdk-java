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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the traffic pattern of the load test.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TrafficPattern" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrafficPattern implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the traffic patterns.
     * </p>
     */
    private String trafficType;
    /**
     * <p>
     * Defines the phases traffic specification.
     * </p>
     */
    private java.util.List<Phase> phases;

    /**
     * <p>
     * Defines the traffic patterns.
     * </p>
     * 
     * @param trafficType
     *        Defines the traffic patterns.
     * @see TrafficType
     */

    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }

    /**
     * <p>
     * Defines the traffic patterns.
     * </p>
     * 
     * @return Defines the traffic patterns.
     * @see TrafficType
     */

    public String getTrafficType() {
        return this.trafficType;
    }

    /**
     * <p>
     * Defines the traffic patterns.
     * </p>
     * 
     * @param trafficType
     *        Defines the traffic patterns.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficType
     */

    public TrafficPattern withTrafficType(String trafficType) {
        setTrafficType(trafficType);
        return this;
    }

    /**
     * <p>
     * Defines the traffic patterns.
     * </p>
     * 
     * @param trafficType
     *        Defines the traffic patterns.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficType
     */

    public TrafficPattern withTrafficType(TrafficType trafficType) {
        this.trafficType = trafficType.toString();
        return this;
    }

    /**
     * <p>
     * Defines the phases traffic specification.
     * </p>
     * 
     * @return Defines the phases traffic specification.
     */

    public java.util.List<Phase> getPhases() {
        return phases;
    }

    /**
     * <p>
     * Defines the phases traffic specification.
     * </p>
     * 
     * @param phases
     *        Defines the phases traffic specification.
     */

    public void setPhases(java.util.Collection<Phase> phases) {
        if (phases == null) {
            this.phases = null;
            return;
        }

        this.phases = new java.util.ArrayList<Phase>(phases);
    }

    /**
     * <p>
     * Defines the phases traffic specification.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhases(java.util.Collection)} or {@link #withPhases(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param phases
     *        Defines the phases traffic specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficPattern withPhases(Phase... phases) {
        if (this.phases == null) {
            setPhases(new java.util.ArrayList<Phase>(phases.length));
        }
        for (Phase ele : phases) {
            this.phases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Defines the phases traffic specification.
     * </p>
     * 
     * @param phases
     *        Defines the phases traffic specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficPattern withPhases(java.util.Collection<Phase> phases) {
        setPhases(phases);
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
        if (getTrafficType() != null)
            sb.append("TrafficType: ").append(getTrafficType()).append(",");
        if (getPhases() != null)
            sb.append("Phases: ").append(getPhases());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficPattern == false)
            return false;
        TrafficPattern other = (TrafficPattern) obj;
        if (other.getTrafficType() == null ^ this.getTrafficType() == null)
            return false;
        if (other.getTrafficType() != null && other.getTrafficType().equals(this.getTrafficType()) == false)
            return false;
        if (other.getPhases() == null ^ this.getPhases() == null)
            return false;
        if (other.getPhases() != null && other.getPhases().equals(this.getPhases()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrafficType() == null) ? 0 : getTrafficType().hashCode());
        hashCode = prime * hashCode + ((getPhases() == null) ? 0 : getPhases().hashCode());
        return hashCode;
    }

    @Override
    public TrafficPattern clone() {
        try {
            return (TrafficPattern) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TrafficPatternMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
