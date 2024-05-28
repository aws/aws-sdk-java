/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The fraud detection configuration to be used during the batch speaker enrollment job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/EnrollmentJobFraudDetectionConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnrollmentJobFraudDetectionConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action to take when the given speaker is flagged by the fraud detection system. The default value is
     * <code>FAIL</code>, which fails the speaker enrollment. Changing this value to <code>IGNORE</code> results in the
     * speaker being enrolled even if they are flagged by the fraud detection system.
     * </p>
     */
    private String fraudDetectionAction;
    /**
     * <p>
     * Threshold value for determining whether the speaker is a high risk to be fraudulent. If the detected risk score
     * calculated by Voice ID is greater than or equal to the threshold, the speaker is considered a fraudster.
     * </p>
     */
    private Integer riskThreshold;
    /**
     * <p>
     * The identifier of watchlists against which fraud detection is performed.
     * </p>
     */
    private java.util.List<String> watchlistIds;

    /**
     * <p>
     * The action to take when the given speaker is flagged by the fraud detection system. The default value is
     * <code>FAIL</code>, which fails the speaker enrollment. Changing this value to <code>IGNORE</code> results in the
     * speaker being enrolled even if they are flagged by the fraud detection system.
     * </p>
     * 
     * @param fraudDetectionAction
     *        The action to take when the given speaker is flagged by the fraud detection system. The default value is
     *        <code>FAIL</code>, which fails the speaker enrollment. Changing this value to <code>IGNORE</code> results
     *        in the speaker being enrolled even if they are flagged by the fraud detection system.
     * @see FraudDetectionAction
     */

    public void setFraudDetectionAction(String fraudDetectionAction) {
        this.fraudDetectionAction = fraudDetectionAction;
    }

    /**
     * <p>
     * The action to take when the given speaker is flagged by the fraud detection system. The default value is
     * <code>FAIL</code>, which fails the speaker enrollment. Changing this value to <code>IGNORE</code> results in the
     * speaker being enrolled even if they are flagged by the fraud detection system.
     * </p>
     * 
     * @return The action to take when the given speaker is flagged by the fraud detection system. The default value is
     *         <code>FAIL</code>, which fails the speaker enrollment. Changing this value to <code>IGNORE</code> results
     *         in the speaker being enrolled even if they are flagged by the fraud detection system.
     * @see FraudDetectionAction
     */

    public String getFraudDetectionAction() {
        return this.fraudDetectionAction;
    }

    /**
     * <p>
     * The action to take when the given speaker is flagged by the fraud detection system. The default value is
     * <code>FAIL</code>, which fails the speaker enrollment. Changing this value to <code>IGNORE</code> results in the
     * speaker being enrolled even if they are flagged by the fraud detection system.
     * </p>
     * 
     * @param fraudDetectionAction
     *        The action to take when the given speaker is flagged by the fraud detection system. The default value is
     *        <code>FAIL</code>, which fails the speaker enrollment. Changing this value to <code>IGNORE</code> results
     *        in the speaker being enrolled even if they are flagged by the fraud detection system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FraudDetectionAction
     */

    public EnrollmentJobFraudDetectionConfig withFraudDetectionAction(String fraudDetectionAction) {
        setFraudDetectionAction(fraudDetectionAction);
        return this;
    }

    /**
     * <p>
     * The action to take when the given speaker is flagged by the fraud detection system. The default value is
     * <code>FAIL</code>, which fails the speaker enrollment. Changing this value to <code>IGNORE</code> results in the
     * speaker being enrolled even if they are flagged by the fraud detection system.
     * </p>
     * 
     * @param fraudDetectionAction
     *        The action to take when the given speaker is flagged by the fraud detection system. The default value is
     *        <code>FAIL</code>, which fails the speaker enrollment. Changing this value to <code>IGNORE</code> results
     *        in the speaker being enrolled even if they are flagged by the fraud detection system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FraudDetectionAction
     */

    public EnrollmentJobFraudDetectionConfig withFraudDetectionAction(FraudDetectionAction fraudDetectionAction) {
        this.fraudDetectionAction = fraudDetectionAction.toString();
        return this;
    }

    /**
     * <p>
     * Threshold value for determining whether the speaker is a high risk to be fraudulent. If the detected risk score
     * calculated by Voice ID is greater than or equal to the threshold, the speaker is considered a fraudster.
     * </p>
     * 
     * @param riskThreshold
     *        Threshold value for determining whether the speaker is a high risk to be fraudulent. If the detected risk
     *        score calculated by Voice ID is greater than or equal to the threshold, the speaker is considered a
     *        fraudster.
     */

    public void setRiskThreshold(Integer riskThreshold) {
        this.riskThreshold = riskThreshold;
    }

    /**
     * <p>
     * Threshold value for determining whether the speaker is a high risk to be fraudulent. If the detected risk score
     * calculated by Voice ID is greater than or equal to the threshold, the speaker is considered a fraudster.
     * </p>
     * 
     * @return Threshold value for determining whether the speaker is a high risk to be fraudulent. If the detected risk
     *         score calculated by Voice ID is greater than or equal to the threshold, the speaker is considered a
     *         fraudster.
     */

    public Integer getRiskThreshold() {
        return this.riskThreshold;
    }

    /**
     * <p>
     * Threshold value for determining whether the speaker is a high risk to be fraudulent. If the detected risk score
     * calculated by Voice ID is greater than or equal to the threshold, the speaker is considered a fraudster.
     * </p>
     * 
     * @param riskThreshold
     *        Threshold value for determining whether the speaker is a high risk to be fraudulent. If the detected risk
     *        score calculated by Voice ID is greater than or equal to the threshold, the speaker is considered a
     *        fraudster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnrollmentJobFraudDetectionConfig withRiskThreshold(Integer riskThreshold) {
        setRiskThreshold(riskThreshold);
        return this;
    }

    /**
     * <p>
     * The identifier of watchlists against which fraud detection is performed.
     * </p>
     * 
     * @return The identifier of watchlists against which fraud detection is performed.
     */

    public java.util.List<String> getWatchlistIds() {
        return watchlistIds;
    }

    /**
     * <p>
     * The identifier of watchlists against which fraud detection is performed.
     * </p>
     * 
     * @param watchlistIds
     *        The identifier of watchlists against which fraud detection is performed.
     */

    public void setWatchlistIds(java.util.Collection<String> watchlistIds) {
        if (watchlistIds == null) {
            this.watchlistIds = null;
            return;
        }

        this.watchlistIds = new java.util.ArrayList<String>(watchlistIds);
    }

    /**
     * <p>
     * The identifier of watchlists against which fraud detection is performed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWatchlistIds(java.util.Collection)} or {@link #withWatchlistIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param watchlistIds
     *        The identifier of watchlists against which fraud detection is performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnrollmentJobFraudDetectionConfig withWatchlistIds(String... watchlistIds) {
        if (this.watchlistIds == null) {
            setWatchlistIds(new java.util.ArrayList<String>(watchlistIds.length));
        }
        for (String ele : watchlistIds) {
            this.watchlistIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifier of watchlists against which fraud detection is performed.
     * </p>
     * 
     * @param watchlistIds
     *        The identifier of watchlists against which fraud detection is performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnrollmentJobFraudDetectionConfig withWatchlistIds(java.util.Collection<String> watchlistIds) {
        setWatchlistIds(watchlistIds);
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
        if (getFraudDetectionAction() != null)
            sb.append("FraudDetectionAction: ").append(getFraudDetectionAction()).append(",");
        if (getRiskThreshold() != null)
            sb.append("RiskThreshold: ").append(getRiskThreshold()).append(",");
        if (getWatchlistIds() != null)
            sb.append("WatchlistIds: ").append(getWatchlistIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnrollmentJobFraudDetectionConfig == false)
            return false;
        EnrollmentJobFraudDetectionConfig other = (EnrollmentJobFraudDetectionConfig) obj;
        if (other.getFraudDetectionAction() == null ^ this.getFraudDetectionAction() == null)
            return false;
        if (other.getFraudDetectionAction() != null && other.getFraudDetectionAction().equals(this.getFraudDetectionAction()) == false)
            return false;
        if (other.getRiskThreshold() == null ^ this.getRiskThreshold() == null)
            return false;
        if (other.getRiskThreshold() != null && other.getRiskThreshold().equals(this.getRiskThreshold()) == false)
            return false;
        if (other.getWatchlistIds() == null ^ this.getWatchlistIds() == null)
            return false;
        if (other.getWatchlistIds() != null && other.getWatchlistIds().equals(this.getWatchlistIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFraudDetectionAction() == null) ? 0 : getFraudDetectionAction().hashCode());
        hashCode = prime * hashCode + ((getRiskThreshold() == null) ? 0 : getRiskThreshold().hashCode());
        hashCode = prime * hashCode + ((getWatchlistIds() == null) ? 0 : getWatchlistIds().hashCode());
        return hashCode;
    }

    @Override
    public EnrollmentJobFraudDetectionConfig clone() {
        try {
            return (EnrollmentJobFraudDetectionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.voiceid.model.transform.EnrollmentJobFraudDetectionConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
