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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The event risk type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/EventRiskType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventRiskType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The risk decision.
     * </p>
     */
    private String riskDecision;
    /**
     * <p>
     * The risk level.
     * </p>
     */
    private String riskLevel;

    /**
     * <p>
     * The risk decision.
     * </p>
     * 
     * @param riskDecision
     *        The risk decision.
     * @see RiskDecisionType
     */

    public void setRiskDecision(String riskDecision) {
        this.riskDecision = riskDecision;
    }

    /**
     * <p>
     * The risk decision.
     * </p>
     * 
     * @return The risk decision.
     * @see RiskDecisionType
     */

    public String getRiskDecision() {
        return this.riskDecision;
    }

    /**
     * <p>
     * The risk decision.
     * </p>
     * 
     * @param riskDecision
     *        The risk decision.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RiskDecisionType
     */

    public EventRiskType withRiskDecision(String riskDecision) {
        setRiskDecision(riskDecision);
        return this;
    }

    /**
     * <p>
     * The risk decision.
     * </p>
     * 
     * @param riskDecision
     *        The risk decision.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RiskDecisionType
     */

    public EventRiskType withRiskDecision(RiskDecisionType riskDecision) {
        this.riskDecision = riskDecision.toString();
        return this;
    }

    /**
     * <p>
     * The risk level.
     * </p>
     * 
     * @param riskLevel
     *        The risk level.
     * @see RiskLevelType
     */

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    /**
     * <p>
     * The risk level.
     * </p>
     * 
     * @return The risk level.
     * @see RiskLevelType
     */

    public String getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * <p>
     * The risk level.
     * </p>
     * 
     * @param riskLevel
     *        The risk level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RiskLevelType
     */

    public EventRiskType withRiskLevel(String riskLevel) {
        setRiskLevel(riskLevel);
        return this;
    }

    /**
     * <p>
     * The risk level.
     * </p>
     * 
     * @param riskLevel
     *        The risk level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RiskLevelType
     */

    public EventRiskType withRiskLevel(RiskLevelType riskLevel) {
        this.riskLevel = riskLevel.toString();
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
        if (getRiskDecision() != null)
            sb.append("RiskDecision: ").append(getRiskDecision()).append(",");
        if (getRiskLevel() != null)
            sb.append("RiskLevel: ").append(getRiskLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventRiskType == false)
            return false;
        EventRiskType other = (EventRiskType) obj;
        if (other.getRiskDecision() == null ^ this.getRiskDecision() == null)
            return false;
        if (other.getRiskDecision() != null && other.getRiskDecision().equals(this.getRiskDecision()) == false)
            return false;
        if (other.getRiskLevel() == null ^ this.getRiskLevel() == null)
            return false;
        if (other.getRiskLevel() != null && other.getRiskLevel().equals(this.getRiskLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRiskDecision() == null) ? 0 : getRiskDecision().hashCode());
        hashCode = prime * hashCode + ((getRiskLevel() == null) ? 0 : getRiskLevel().hashCode());
        return hashCode;
    }

    @Override
    public EventRiskType clone() {
        try {
            return (EventRiskType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.EventRiskTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
