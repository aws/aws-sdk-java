/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The fraud detection result produced by Voice ID, processed against the current session state and streamed audio of
 * the speaker.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/FraudDetectionResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FraudDetectionResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A timestamp indicating when audio aggregation ended for this fraud detection result.
     * </p>
     */
    private java.util.Date audioAggregationEndedAt;
    /**
     * <p>
     * A timestamp indicating when audio aggregation started for this fraud detection result.
     * </p>
     */
    private java.util.Date audioAggregationStartedAt;
    /**
     * <p>
     * The <code>FraudDetectionConfiguration</code> used to generate this fraud detection result.
     * </p>
     */
    private FraudDetectionConfiguration configuration;
    /**
     * <p>
     * The fraud detection decision produced by Voice ID, processed against the current session state and streamed audio
     * of the speaker.
     * </p>
     */
    private String decision;
    /**
     * <p>
     * The unique identifier for this fraud detection result. Given there can be multiple fraud detections for a given
     * session, this field helps in identifying if the returned result is from previous streaming activity or a new
     * result. Note that in the absence of any new streaming activity or risk threshold changes, Voice ID always returns
     * cached Fraud Detection result for this API.
     * </p>
     */
    private String fraudDetectionResultId;
    /**
     * <p>
     * The reason speaker was flagged by the fraud detection system. This is only be populated if fraud detection
     * Decision is <code>HIGH_RISK</code>, and the following possible values: <code>KNOWN_FRAUDSTER</code> and
     * <code>VOICE_SPOOFING</code>.
     * </p>
     */
    private java.util.List<String> reasons;
    /**
     * <p>
     * Details about each risk analyzed for this speaker. Currently, this contains KnownFraudsterRisk and
     * VoiceSpoofingRisk details.
     * </p>
     */
    private FraudRiskDetails riskDetails;

    /**
     * <p>
     * A timestamp indicating when audio aggregation ended for this fraud detection result.
     * </p>
     * 
     * @param audioAggregationEndedAt
     *        A timestamp indicating when audio aggregation ended for this fraud detection result.
     */

    public void setAudioAggregationEndedAt(java.util.Date audioAggregationEndedAt) {
        this.audioAggregationEndedAt = audioAggregationEndedAt;
    }

    /**
     * <p>
     * A timestamp indicating when audio aggregation ended for this fraud detection result.
     * </p>
     * 
     * @return A timestamp indicating when audio aggregation ended for this fraud detection result.
     */

    public java.util.Date getAudioAggregationEndedAt() {
        return this.audioAggregationEndedAt;
    }

    /**
     * <p>
     * A timestamp indicating when audio aggregation ended for this fraud detection result.
     * </p>
     * 
     * @param audioAggregationEndedAt
     *        A timestamp indicating when audio aggregation ended for this fraud detection result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FraudDetectionResult withAudioAggregationEndedAt(java.util.Date audioAggregationEndedAt) {
        setAudioAggregationEndedAt(audioAggregationEndedAt);
        return this;
    }

    /**
     * <p>
     * A timestamp indicating when audio aggregation started for this fraud detection result.
     * </p>
     * 
     * @param audioAggregationStartedAt
     *        A timestamp indicating when audio aggregation started for this fraud detection result.
     */

    public void setAudioAggregationStartedAt(java.util.Date audioAggregationStartedAt) {
        this.audioAggregationStartedAt = audioAggregationStartedAt;
    }

    /**
     * <p>
     * A timestamp indicating when audio aggregation started for this fraud detection result.
     * </p>
     * 
     * @return A timestamp indicating when audio aggregation started for this fraud detection result.
     */

    public java.util.Date getAudioAggregationStartedAt() {
        return this.audioAggregationStartedAt;
    }

    /**
     * <p>
     * A timestamp indicating when audio aggregation started for this fraud detection result.
     * </p>
     * 
     * @param audioAggregationStartedAt
     *        A timestamp indicating when audio aggregation started for this fraud detection result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FraudDetectionResult withAudioAggregationStartedAt(java.util.Date audioAggregationStartedAt) {
        setAudioAggregationStartedAt(audioAggregationStartedAt);
        return this;
    }

    /**
     * <p>
     * The <code>FraudDetectionConfiguration</code> used to generate this fraud detection result.
     * </p>
     * 
     * @param configuration
     *        The <code>FraudDetectionConfiguration</code> used to generate this fraud detection result.
     */

    public void setConfiguration(FraudDetectionConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The <code>FraudDetectionConfiguration</code> used to generate this fraud detection result.
     * </p>
     * 
     * @return The <code>FraudDetectionConfiguration</code> used to generate this fraud detection result.
     */

    public FraudDetectionConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The <code>FraudDetectionConfiguration</code> used to generate this fraud detection result.
     * </p>
     * 
     * @param configuration
     *        The <code>FraudDetectionConfiguration</code> used to generate this fraud detection result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FraudDetectionResult withConfiguration(FraudDetectionConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The fraud detection decision produced by Voice ID, processed against the current session state and streamed audio
     * of the speaker.
     * </p>
     * 
     * @param decision
     *        The fraud detection decision produced by Voice ID, processed against the current session state and
     *        streamed audio of the speaker.
     * @see FraudDetectionDecision
     */

    public void setDecision(String decision) {
        this.decision = decision;
    }

    /**
     * <p>
     * The fraud detection decision produced by Voice ID, processed against the current session state and streamed audio
     * of the speaker.
     * </p>
     * 
     * @return The fraud detection decision produced by Voice ID, processed against the current session state and
     *         streamed audio of the speaker.
     * @see FraudDetectionDecision
     */

    public String getDecision() {
        return this.decision;
    }

    /**
     * <p>
     * The fraud detection decision produced by Voice ID, processed against the current session state and streamed audio
     * of the speaker.
     * </p>
     * 
     * @param decision
     *        The fraud detection decision produced by Voice ID, processed against the current session state and
     *        streamed audio of the speaker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FraudDetectionDecision
     */

    public FraudDetectionResult withDecision(String decision) {
        setDecision(decision);
        return this;
    }

    /**
     * <p>
     * The fraud detection decision produced by Voice ID, processed against the current session state and streamed audio
     * of the speaker.
     * </p>
     * 
     * @param decision
     *        The fraud detection decision produced by Voice ID, processed against the current session state and
     *        streamed audio of the speaker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FraudDetectionDecision
     */

    public FraudDetectionResult withDecision(FraudDetectionDecision decision) {
        this.decision = decision.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier for this fraud detection result. Given there can be multiple fraud detections for a given
     * session, this field helps in identifying if the returned result is from previous streaming activity or a new
     * result. Note that in the absence of any new streaming activity or risk threshold changes, Voice ID always returns
     * cached Fraud Detection result for this API.
     * </p>
     * 
     * @param fraudDetectionResultId
     *        The unique identifier for this fraud detection result. Given there can be multiple fraud detections for a
     *        given session, this field helps in identifying if the returned result is from previous streaming activity
     *        or a new result. Note that in the absence of any new streaming activity or risk threshold changes, Voice
     *        ID always returns cached Fraud Detection result for this API.
     */

    public void setFraudDetectionResultId(String fraudDetectionResultId) {
        this.fraudDetectionResultId = fraudDetectionResultId;
    }

    /**
     * <p>
     * The unique identifier for this fraud detection result. Given there can be multiple fraud detections for a given
     * session, this field helps in identifying if the returned result is from previous streaming activity or a new
     * result. Note that in the absence of any new streaming activity or risk threshold changes, Voice ID always returns
     * cached Fraud Detection result for this API.
     * </p>
     * 
     * @return The unique identifier for this fraud detection result. Given there can be multiple fraud detections for a
     *         given session, this field helps in identifying if the returned result is from previous streaming activity
     *         or a new result. Note that in the absence of any new streaming activity or risk threshold changes, Voice
     *         ID always returns cached Fraud Detection result for this API.
     */

    public String getFraudDetectionResultId() {
        return this.fraudDetectionResultId;
    }

    /**
     * <p>
     * The unique identifier for this fraud detection result. Given there can be multiple fraud detections for a given
     * session, this field helps in identifying if the returned result is from previous streaming activity or a new
     * result. Note that in the absence of any new streaming activity or risk threshold changes, Voice ID always returns
     * cached Fraud Detection result for this API.
     * </p>
     * 
     * @param fraudDetectionResultId
     *        The unique identifier for this fraud detection result. Given there can be multiple fraud detections for a
     *        given session, this field helps in identifying if the returned result is from previous streaming activity
     *        or a new result. Note that in the absence of any new streaming activity or risk threshold changes, Voice
     *        ID always returns cached Fraud Detection result for this API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FraudDetectionResult withFraudDetectionResultId(String fraudDetectionResultId) {
        setFraudDetectionResultId(fraudDetectionResultId);
        return this;
    }

    /**
     * <p>
     * The reason speaker was flagged by the fraud detection system. This is only be populated if fraud detection
     * Decision is <code>HIGH_RISK</code>, and the following possible values: <code>KNOWN_FRAUDSTER</code> and
     * <code>VOICE_SPOOFING</code>.
     * </p>
     * 
     * @return The reason speaker was flagged by the fraud detection system. This is only be populated if fraud
     *         detection Decision is <code>HIGH_RISK</code>, and the following possible values:
     *         <code>KNOWN_FRAUDSTER</code> and <code>VOICE_SPOOFING</code>.
     * @see FraudDetectionReason
     */

    public java.util.List<String> getReasons() {
        return reasons;
    }

    /**
     * <p>
     * The reason speaker was flagged by the fraud detection system. This is only be populated if fraud detection
     * Decision is <code>HIGH_RISK</code>, and the following possible values: <code>KNOWN_FRAUDSTER</code> and
     * <code>VOICE_SPOOFING</code>.
     * </p>
     * 
     * @param reasons
     *        The reason speaker was flagged by the fraud detection system. This is only be populated if fraud detection
     *        Decision is <code>HIGH_RISK</code>, and the following possible values: <code>KNOWN_FRAUDSTER</code> and
     *        <code>VOICE_SPOOFING</code>.
     * @see FraudDetectionReason
     */

    public void setReasons(java.util.Collection<String> reasons) {
        if (reasons == null) {
            this.reasons = null;
            return;
        }

        this.reasons = new java.util.ArrayList<String>(reasons);
    }

    /**
     * <p>
     * The reason speaker was flagged by the fraud detection system. This is only be populated if fraud detection
     * Decision is <code>HIGH_RISK</code>, and the following possible values: <code>KNOWN_FRAUDSTER</code> and
     * <code>VOICE_SPOOFING</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReasons(java.util.Collection)} or {@link #withReasons(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param reasons
     *        The reason speaker was flagged by the fraud detection system. This is only be populated if fraud detection
     *        Decision is <code>HIGH_RISK</code>, and the following possible values: <code>KNOWN_FRAUDSTER</code> and
     *        <code>VOICE_SPOOFING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FraudDetectionReason
     */

    public FraudDetectionResult withReasons(String... reasons) {
        if (this.reasons == null) {
            setReasons(new java.util.ArrayList<String>(reasons.length));
        }
        for (String ele : reasons) {
            this.reasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The reason speaker was flagged by the fraud detection system. This is only be populated if fraud detection
     * Decision is <code>HIGH_RISK</code>, and the following possible values: <code>KNOWN_FRAUDSTER</code> and
     * <code>VOICE_SPOOFING</code>.
     * </p>
     * 
     * @param reasons
     *        The reason speaker was flagged by the fraud detection system. This is only be populated if fraud detection
     *        Decision is <code>HIGH_RISK</code>, and the following possible values: <code>KNOWN_FRAUDSTER</code> and
     *        <code>VOICE_SPOOFING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FraudDetectionReason
     */

    public FraudDetectionResult withReasons(java.util.Collection<String> reasons) {
        setReasons(reasons);
        return this;
    }

    /**
     * <p>
     * The reason speaker was flagged by the fraud detection system. This is only be populated if fraud detection
     * Decision is <code>HIGH_RISK</code>, and the following possible values: <code>KNOWN_FRAUDSTER</code> and
     * <code>VOICE_SPOOFING</code>.
     * </p>
     * 
     * @param reasons
     *        The reason speaker was flagged by the fraud detection system. This is only be populated if fraud detection
     *        Decision is <code>HIGH_RISK</code>, and the following possible values: <code>KNOWN_FRAUDSTER</code> and
     *        <code>VOICE_SPOOFING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FraudDetectionReason
     */

    public FraudDetectionResult withReasons(FraudDetectionReason... reasons) {
        java.util.ArrayList<String> reasonsCopy = new java.util.ArrayList<String>(reasons.length);
        for (FraudDetectionReason value : reasons) {
            reasonsCopy.add(value.toString());
        }
        if (getReasons() == null) {
            setReasons(reasonsCopy);
        } else {
            getReasons().addAll(reasonsCopy);
        }
        return this;
    }

    /**
     * <p>
     * Details about each risk analyzed for this speaker. Currently, this contains KnownFraudsterRisk and
     * VoiceSpoofingRisk details.
     * </p>
     * 
     * @param riskDetails
     *        Details about each risk analyzed for this speaker. Currently, this contains KnownFraudsterRisk and
     *        VoiceSpoofingRisk details.
     */

    public void setRiskDetails(FraudRiskDetails riskDetails) {
        this.riskDetails = riskDetails;
    }

    /**
     * <p>
     * Details about each risk analyzed for this speaker. Currently, this contains KnownFraudsterRisk and
     * VoiceSpoofingRisk details.
     * </p>
     * 
     * @return Details about each risk analyzed for this speaker. Currently, this contains KnownFraudsterRisk and
     *         VoiceSpoofingRisk details.
     */

    public FraudRiskDetails getRiskDetails() {
        return this.riskDetails;
    }

    /**
     * <p>
     * Details about each risk analyzed for this speaker. Currently, this contains KnownFraudsterRisk and
     * VoiceSpoofingRisk details.
     * </p>
     * 
     * @param riskDetails
     *        Details about each risk analyzed for this speaker. Currently, this contains KnownFraudsterRisk and
     *        VoiceSpoofingRisk details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FraudDetectionResult withRiskDetails(FraudRiskDetails riskDetails) {
        setRiskDetails(riskDetails);
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
        if (getAudioAggregationEndedAt() != null)
            sb.append("AudioAggregationEndedAt: ").append(getAudioAggregationEndedAt()).append(",");
        if (getAudioAggregationStartedAt() != null)
            sb.append("AudioAggregationStartedAt: ").append(getAudioAggregationStartedAt()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getDecision() != null)
            sb.append("Decision: ").append(getDecision()).append(",");
        if (getFraudDetectionResultId() != null)
            sb.append("FraudDetectionResultId: ").append(getFraudDetectionResultId()).append(",");
        if (getReasons() != null)
            sb.append("Reasons: ").append(getReasons()).append(",");
        if (getRiskDetails() != null)
            sb.append("RiskDetails: ").append(getRiskDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FraudDetectionResult == false)
            return false;
        FraudDetectionResult other = (FraudDetectionResult) obj;
        if (other.getAudioAggregationEndedAt() == null ^ this.getAudioAggregationEndedAt() == null)
            return false;
        if (other.getAudioAggregationEndedAt() != null && other.getAudioAggregationEndedAt().equals(this.getAudioAggregationEndedAt()) == false)
            return false;
        if (other.getAudioAggregationStartedAt() == null ^ this.getAudioAggregationStartedAt() == null)
            return false;
        if (other.getAudioAggregationStartedAt() != null && other.getAudioAggregationStartedAt().equals(this.getAudioAggregationStartedAt()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getDecision() == null ^ this.getDecision() == null)
            return false;
        if (other.getDecision() != null && other.getDecision().equals(this.getDecision()) == false)
            return false;
        if (other.getFraudDetectionResultId() == null ^ this.getFraudDetectionResultId() == null)
            return false;
        if (other.getFraudDetectionResultId() != null && other.getFraudDetectionResultId().equals(this.getFraudDetectionResultId()) == false)
            return false;
        if (other.getReasons() == null ^ this.getReasons() == null)
            return false;
        if (other.getReasons() != null && other.getReasons().equals(this.getReasons()) == false)
            return false;
        if (other.getRiskDetails() == null ^ this.getRiskDetails() == null)
            return false;
        if (other.getRiskDetails() != null && other.getRiskDetails().equals(this.getRiskDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioAggregationEndedAt() == null) ? 0 : getAudioAggregationEndedAt().hashCode());
        hashCode = prime * hashCode + ((getAudioAggregationStartedAt() == null) ? 0 : getAudioAggregationStartedAt().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDecision() == null) ? 0 : getDecision().hashCode());
        hashCode = prime * hashCode + ((getFraudDetectionResultId() == null) ? 0 : getFraudDetectionResultId().hashCode());
        hashCode = prime * hashCode + ((getReasons() == null) ? 0 : getReasons().hashCode());
        hashCode = prime * hashCode + ((getRiskDetails() == null) ? 0 : getRiskDetails().hashCode());
        return hashCode;
    }

    @Override
    public FraudDetectionResult clone() {
        try {
            return (FraudDetectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.voiceid.model.transform.FraudDetectionResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
