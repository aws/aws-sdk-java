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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details produced as a result of performing known fraudster risk analysis on a speaker.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/KnownFraudsterRisk" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KnownFraudsterRisk implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the fraudster that is the closest match to the speaker. If there are no fraudsters registered
     * in a given domain, or if there are no fraudsters with a non-zero RiskScore, this value is <code>null</code>.
     * </p>
     */
    private String generatedFraudsterId;
    /**
     * <p>
     * The score indicating the likelihood the speaker is a known fraudster.
     * </p>
     */
    private Integer riskScore;

    /**
     * <p>
     * The identifier of the fraudster that is the closest match to the speaker. If there are no fraudsters registered
     * in a given domain, or if there are no fraudsters with a non-zero RiskScore, this value is <code>null</code>.
     * </p>
     * 
     * @param generatedFraudsterId
     *        The identifier of the fraudster that is the closest match to the speaker. If there are no fraudsters
     *        registered in a given domain, or if there are no fraudsters with a non-zero RiskScore, this value is
     *        <code>null</code>.
     */

    public void setGeneratedFraudsterId(String generatedFraudsterId) {
        this.generatedFraudsterId = generatedFraudsterId;
    }

    /**
     * <p>
     * The identifier of the fraudster that is the closest match to the speaker. If there are no fraudsters registered
     * in a given domain, or if there are no fraudsters with a non-zero RiskScore, this value is <code>null</code>.
     * </p>
     * 
     * @return The identifier of the fraudster that is the closest match to the speaker. If there are no fraudsters
     *         registered in a given domain, or if there are no fraudsters with a non-zero RiskScore, this value is
     *         <code>null</code>.
     */

    public String getGeneratedFraudsterId() {
        return this.generatedFraudsterId;
    }

    /**
     * <p>
     * The identifier of the fraudster that is the closest match to the speaker. If there are no fraudsters registered
     * in a given domain, or if there are no fraudsters with a non-zero RiskScore, this value is <code>null</code>.
     * </p>
     * 
     * @param generatedFraudsterId
     *        The identifier of the fraudster that is the closest match to the speaker. If there are no fraudsters
     *        registered in a given domain, or if there are no fraudsters with a non-zero RiskScore, this value is
     *        <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnownFraudsterRisk withGeneratedFraudsterId(String generatedFraudsterId) {
        setGeneratedFraudsterId(generatedFraudsterId);
        return this;
    }

    /**
     * <p>
     * The score indicating the likelihood the speaker is a known fraudster.
     * </p>
     * 
     * @param riskScore
     *        The score indicating the likelihood the speaker is a known fraudster.
     */

    public void setRiskScore(Integer riskScore) {
        this.riskScore = riskScore;
    }

    /**
     * <p>
     * The score indicating the likelihood the speaker is a known fraudster.
     * </p>
     * 
     * @return The score indicating the likelihood the speaker is a known fraudster.
     */

    public Integer getRiskScore() {
        return this.riskScore;
    }

    /**
     * <p>
     * The score indicating the likelihood the speaker is a known fraudster.
     * </p>
     * 
     * @param riskScore
     *        The score indicating the likelihood the speaker is a known fraudster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnownFraudsterRisk withRiskScore(Integer riskScore) {
        setRiskScore(riskScore);
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
        if (getGeneratedFraudsterId() != null)
            sb.append("GeneratedFraudsterId: ").append(getGeneratedFraudsterId()).append(",");
        if (getRiskScore() != null)
            sb.append("RiskScore: ").append(getRiskScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KnownFraudsterRisk == false)
            return false;
        KnownFraudsterRisk other = (KnownFraudsterRisk) obj;
        if (other.getGeneratedFraudsterId() == null ^ this.getGeneratedFraudsterId() == null)
            return false;
        if (other.getGeneratedFraudsterId() != null && other.getGeneratedFraudsterId().equals(this.getGeneratedFraudsterId()) == false)
            return false;
        if (other.getRiskScore() == null ^ this.getRiskScore() == null)
            return false;
        if (other.getRiskScore() != null && other.getRiskScore().equals(this.getRiskScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeneratedFraudsterId() == null) ? 0 : getGeneratedFraudsterId().hashCode());
        hashCode = prime * hashCode + ((getRiskScore() == null) ? 0 : getRiskScore().hashCode());
        return hashCode;
    }

    @Override
    public KnownFraudsterRisk clone() {
        try {
            return (KnownFraudsterRisk) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.voiceid.model.transform.KnownFraudsterRiskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
