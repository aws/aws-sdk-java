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
 * The details of the impact of aggregated variables on the prediction score.
 * </p>
 * <p>
 * Account Takeover Insights (ATI) model uses the login data you provide to continuously calculate a set of variables
 * (aggregated variables) based on historical events. For example, the model might calculate the number of times an user
 * has logged in using the same IP address. In this case, event variables used to derive the aggregated variables are
 * <code>IP address</code> and <code>user</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/AggregatedVariablesImpactExplanation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregatedVariablesImpactExplanation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The names of all the event variables that were used to derive the aggregated variables.
     * </p>
     */
    private java.util.List<String> eventVariableNames;
    /**
     * <p>
     * The relative impact of the aggregated variables in terms of magnitude on the prediction scores.
     * </p>
     */
    private String relativeImpact;
    /**
     * <p>
     * The raw, uninterpreted value represented as log-odds of the fraud. These values are usually between -10 to +10,
     * but range from -infinity to +infinity.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A positive value indicates that the variables drove the risk score up.
     * </p>
     * </li>
     * <li>
     * <p>
     * A negative value indicates that the variables drove the risk score down.
     * </p>
     * </li>
     * </ul>
     */
    private Float logOddsImpact;

    /**
     * <p>
     * The names of all the event variables that were used to derive the aggregated variables.
     * </p>
     * 
     * @return The names of all the event variables that were used to derive the aggregated variables.
     */

    public java.util.List<String> getEventVariableNames() {
        return eventVariableNames;
    }

    /**
     * <p>
     * The names of all the event variables that were used to derive the aggregated variables.
     * </p>
     * 
     * @param eventVariableNames
     *        The names of all the event variables that were used to derive the aggregated variables.
     */

    public void setEventVariableNames(java.util.Collection<String> eventVariableNames) {
        if (eventVariableNames == null) {
            this.eventVariableNames = null;
            return;
        }

        this.eventVariableNames = new java.util.ArrayList<String>(eventVariableNames);
    }

    /**
     * <p>
     * The names of all the event variables that were used to derive the aggregated variables.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventVariableNames(java.util.Collection)} or {@link #withEventVariableNames(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param eventVariableNames
     *        The names of all the event variables that were used to derive the aggregated variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregatedVariablesImpactExplanation withEventVariableNames(String... eventVariableNames) {
        if (this.eventVariableNames == null) {
            setEventVariableNames(new java.util.ArrayList<String>(eventVariableNames.length));
        }
        for (String ele : eventVariableNames) {
            this.eventVariableNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of all the event variables that were used to derive the aggregated variables.
     * </p>
     * 
     * @param eventVariableNames
     *        The names of all the event variables that were used to derive the aggregated variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregatedVariablesImpactExplanation withEventVariableNames(java.util.Collection<String> eventVariableNames) {
        setEventVariableNames(eventVariableNames);
        return this;
    }

    /**
     * <p>
     * The relative impact of the aggregated variables in terms of magnitude on the prediction scores.
     * </p>
     * 
     * @param relativeImpact
     *        The relative impact of the aggregated variables in terms of magnitude on the prediction scores.
     */

    public void setRelativeImpact(String relativeImpact) {
        this.relativeImpact = relativeImpact;
    }

    /**
     * <p>
     * The relative impact of the aggregated variables in terms of magnitude on the prediction scores.
     * </p>
     * 
     * @return The relative impact of the aggregated variables in terms of magnitude on the prediction scores.
     */

    public String getRelativeImpact() {
        return this.relativeImpact;
    }

    /**
     * <p>
     * The relative impact of the aggregated variables in terms of magnitude on the prediction scores.
     * </p>
     * 
     * @param relativeImpact
     *        The relative impact of the aggregated variables in terms of magnitude on the prediction scores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregatedVariablesImpactExplanation withRelativeImpact(String relativeImpact) {
        setRelativeImpact(relativeImpact);
        return this;
    }

    /**
     * <p>
     * The raw, uninterpreted value represented as log-odds of the fraud. These values are usually between -10 to +10,
     * but range from -infinity to +infinity.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A positive value indicates that the variables drove the risk score up.
     * </p>
     * </li>
     * <li>
     * <p>
     * A negative value indicates that the variables drove the risk score down.
     * </p>
     * </li>
     * </ul>
     * 
     * @param logOddsImpact
     *        The raw, uninterpreted value represented as log-odds of the fraud. These values are usually between -10 to
     *        +10, but range from -infinity to +infinity.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A positive value indicates that the variables drove the risk score up.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A negative value indicates that the variables drove the risk score down.
     *        </p>
     *        </li>
     */

    public void setLogOddsImpact(Float logOddsImpact) {
        this.logOddsImpact = logOddsImpact;
    }

    /**
     * <p>
     * The raw, uninterpreted value represented as log-odds of the fraud. These values are usually between -10 to +10,
     * but range from -infinity to +infinity.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A positive value indicates that the variables drove the risk score up.
     * </p>
     * </li>
     * <li>
     * <p>
     * A negative value indicates that the variables drove the risk score down.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The raw, uninterpreted value represented as log-odds of the fraud. These values are usually between -10
     *         to +10, but range from -infinity to +infinity.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         A positive value indicates that the variables drove the risk score up.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A negative value indicates that the variables drove the risk score down.
     *         </p>
     *         </li>
     */

    public Float getLogOddsImpact() {
        return this.logOddsImpact;
    }

    /**
     * <p>
     * The raw, uninterpreted value represented as log-odds of the fraud. These values are usually between -10 to +10,
     * but range from -infinity to +infinity.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A positive value indicates that the variables drove the risk score up.
     * </p>
     * </li>
     * <li>
     * <p>
     * A negative value indicates that the variables drove the risk score down.
     * </p>
     * </li>
     * </ul>
     * 
     * @param logOddsImpact
     *        The raw, uninterpreted value represented as log-odds of the fraud. These values are usually between -10 to
     *        +10, but range from -infinity to +infinity.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A positive value indicates that the variables drove the risk score up.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A negative value indicates that the variables drove the risk score down.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregatedVariablesImpactExplanation withLogOddsImpact(Float logOddsImpact) {
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
        if (getEventVariableNames() != null)
            sb.append("EventVariableNames: ").append(getEventVariableNames()).append(",");
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

        if (obj instanceof AggregatedVariablesImpactExplanation == false)
            return false;
        AggregatedVariablesImpactExplanation other = (AggregatedVariablesImpactExplanation) obj;
        if (other.getEventVariableNames() == null ^ this.getEventVariableNames() == null)
            return false;
        if (other.getEventVariableNames() != null && other.getEventVariableNames().equals(this.getEventVariableNames()) == false)
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

        hashCode = prime * hashCode + ((getEventVariableNames() == null) ? 0 : getEventVariableNames().hashCode());
        hashCode = prime * hashCode + ((getRelativeImpact() == null) ? 0 : getRelativeImpact().hashCode());
        hashCode = prime * hashCode + ((getLogOddsImpact() == null) ? 0 : getLogOddsImpact().hashCode());
        return hashCode;
    }

    @Override
    public AggregatedVariablesImpactExplanation clone() {
        try {
            return (AggregatedVariablesImpactExplanation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.AggregatedVariablesImpactExplanationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
