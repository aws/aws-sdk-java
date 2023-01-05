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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the event variable's impact on the prediction score.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/VariableImpactExplanation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VariableImpactExplanation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The event variable name.
     * </p>
     */
    private String eventVariableName;
    /**
     * <p>
     * The event variable's relative impact in terms of magnitude on the prediction scores. The relative impact values
     * consist of a numerical rating (0-5, 5 being the highest) and direction (increased/decreased) impact of the fraud
     * risk.
     * </p>
     */
    private String relativeImpact;
    /**
     * <p>
     * The raw, uninterpreted value represented as log-odds of the fraud. These values are usually between -10 to +10,
     * but range from - infinity to + infinity.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A positive value indicates that the variable drove the risk score up.
     * </p>
     * </li>
     * <li>
     * <p>
     * A negative value indicates that the variable drove the risk score down.
     * </p>
     * </li>
     * </ul>
     */
    private Float logOddsImpact;

    /**
     * <p>
     * The event variable name.
     * </p>
     * 
     * @param eventVariableName
     *        The event variable name.
     */

    public void setEventVariableName(String eventVariableName) {
        this.eventVariableName = eventVariableName;
    }

    /**
     * <p>
     * The event variable name.
     * </p>
     * 
     * @return The event variable name.
     */

    public String getEventVariableName() {
        return this.eventVariableName;
    }

    /**
     * <p>
     * The event variable name.
     * </p>
     * 
     * @param eventVariableName
     *        The event variable name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VariableImpactExplanation withEventVariableName(String eventVariableName) {
        setEventVariableName(eventVariableName);
        return this;
    }

    /**
     * <p>
     * The event variable's relative impact in terms of magnitude on the prediction scores. The relative impact values
     * consist of a numerical rating (0-5, 5 being the highest) and direction (increased/decreased) impact of the fraud
     * risk.
     * </p>
     * 
     * @param relativeImpact
     *        The event variable's relative impact in terms of magnitude on the prediction scores. The relative impact
     *        values consist of a numerical rating (0-5, 5 being the highest) and direction (increased/decreased) impact
     *        of the fraud risk.
     */

    public void setRelativeImpact(String relativeImpact) {
        this.relativeImpact = relativeImpact;
    }

    /**
     * <p>
     * The event variable's relative impact in terms of magnitude on the prediction scores. The relative impact values
     * consist of a numerical rating (0-5, 5 being the highest) and direction (increased/decreased) impact of the fraud
     * risk.
     * </p>
     * 
     * @return The event variable's relative impact in terms of magnitude on the prediction scores. The relative impact
     *         values consist of a numerical rating (0-5, 5 being the highest) and direction (increased/decreased)
     *         impact of the fraud risk.
     */

    public String getRelativeImpact() {
        return this.relativeImpact;
    }

    /**
     * <p>
     * The event variable's relative impact in terms of magnitude on the prediction scores. The relative impact values
     * consist of a numerical rating (0-5, 5 being the highest) and direction (increased/decreased) impact of the fraud
     * risk.
     * </p>
     * 
     * @param relativeImpact
     *        The event variable's relative impact in terms of magnitude on the prediction scores. The relative impact
     *        values consist of a numerical rating (0-5, 5 being the highest) and direction (increased/decreased) impact
     *        of the fraud risk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VariableImpactExplanation withRelativeImpact(String relativeImpact) {
        setRelativeImpact(relativeImpact);
        return this;
    }

    /**
     * <p>
     * The raw, uninterpreted value represented as log-odds of the fraud. These values are usually between -10 to +10,
     * but range from - infinity to + infinity.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A positive value indicates that the variable drove the risk score up.
     * </p>
     * </li>
     * <li>
     * <p>
     * A negative value indicates that the variable drove the risk score down.
     * </p>
     * </li>
     * </ul>
     * 
     * @param logOddsImpact
     *        The raw, uninterpreted value represented as log-odds of the fraud. These values are usually between -10 to
     *        +10, but range from - infinity to + infinity.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A positive value indicates that the variable drove the risk score up.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A negative value indicates that the variable drove the risk score down.
     *        </p>
     *        </li>
     */

    public void setLogOddsImpact(Float logOddsImpact) {
        this.logOddsImpact = logOddsImpact;
    }

    /**
     * <p>
     * The raw, uninterpreted value represented as log-odds of the fraud. These values are usually between -10 to +10,
     * but range from - infinity to + infinity.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A positive value indicates that the variable drove the risk score up.
     * </p>
     * </li>
     * <li>
     * <p>
     * A negative value indicates that the variable drove the risk score down.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The raw, uninterpreted value represented as log-odds of the fraud. These values are usually between -10
     *         to +10, but range from - infinity to + infinity.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         A positive value indicates that the variable drove the risk score up.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A negative value indicates that the variable drove the risk score down.
     *         </p>
     *         </li>
     */

    public Float getLogOddsImpact() {
        return this.logOddsImpact;
    }

    /**
     * <p>
     * The raw, uninterpreted value represented as log-odds of the fraud. These values are usually between -10 to +10,
     * but range from - infinity to + infinity.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A positive value indicates that the variable drove the risk score up.
     * </p>
     * </li>
     * <li>
     * <p>
     * A negative value indicates that the variable drove the risk score down.
     * </p>
     * </li>
     * </ul>
     * 
     * @param logOddsImpact
     *        The raw, uninterpreted value represented as log-odds of the fraud. These values are usually between -10 to
     *        +10, but range from - infinity to + infinity.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A positive value indicates that the variable drove the risk score up.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A negative value indicates that the variable drove the risk score down.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VariableImpactExplanation withLogOddsImpact(Float logOddsImpact) {
        setLogOddsImpact(logOddsImpact);
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
        if (getEventVariableName() != null)
            sb.append("EventVariableName: ").append(getEventVariableName()).append(",");
        if (getRelativeImpact() != null)
            sb.append("RelativeImpact: ").append(getRelativeImpact()).append(",");
        if (getLogOddsImpact() != null)
            sb.append("LogOddsImpact: ").append(getLogOddsImpact());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VariableImpactExplanation == false)
            return false;
        VariableImpactExplanation other = (VariableImpactExplanation) obj;
        if (other.getEventVariableName() == null ^ this.getEventVariableName() == null)
            return false;
        if (other.getEventVariableName() != null && other.getEventVariableName().equals(this.getEventVariableName()) == false)
            return false;
        if (other.getRelativeImpact() == null ^ this.getRelativeImpact() == null)
            return false;
        if (other.getRelativeImpact() != null && other.getRelativeImpact().equals(this.getRelativeImpact()) == false)
            return false;
        if (other.getLogOddsImpact() == null ^ this.getLogOddsImpact() == null)
            return false;
        if (other.getLogOddsImpact() != null && other.getLogOddsImpact().equals(this.getLogOddsImpact()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventVariableName() == null) ? 0 : getEventVariableName().hashCode());
        hashCode = prime * hashCode + ((getRelativeImpact() == null) ? 0 : getRelativeImpact().hashCode());
        hashCode = prime * hashCode + ((getLogOddsImpact() == null) ? 0 : getLogOddsImpact().hashCode());
        return hashCode;
    }

    @Override
    public VariableImpactExplanation clone() {
        try {
            return (VariableImpactExplanation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.VariableImpactExplanationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
