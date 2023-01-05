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
 * The authentication result produced by Voice ID, processed against the current session state and streamed audio of the
 * speaker.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/AuthenticationResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthenticationResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A timestamp indicating when audio aggregation ended for this authentication result.
     * </p>
     */
    private java.util.Date audioAggregationEndedAt;
    /**
     * <p>
     * A timestamp indicating when audio aggregation started for this authentication result.
     * </p>
     */
    private java.util.Date audioAggregationStartedAt;
    /**
     * <p>
     * The unique identifier for this authentication result. Because there can be multiple authentications for a given
     * session, this field helps to identify if the returned result is from a previous streaming activity or a new
     * result. Note that in absence of any new streaming activity, <code>AcceptanceThreshold</code> changes, or
     * <code>SpeakerId</code> changes, Voice ID always returns cached Authentication Result for this API.
     * </p>
     */
    private String authenticationResultId;
    /**
     * <p>
     * The <code>AuthenticationConfiguration</code> used to generate this authentication result.
     * </p>
     */
    private AuthenticationConfiguration configuration;
    /**
     * <p>
     * The client-provided identifier for the speaker whose authentication result is produced. Only present if a
     * <code>SpeakerId</code> is provided for the session.
     * </p>
     */
    private String customerSpeakerId;
    /**
     * <p>
     * The authentication decision produced by Voice ID, processed against the current session state and streamed audio
     * of the speaker.
     * </p>
     */
    private String decision;
    /**
     * <p>
     * The service-generated identifier for the speaker whose authentication result is produced.
     * </p>
     */
    private String generatedSpeakerId;
    /**
     * <p>
     * The authentication score for the speaker whose authentication result is produced. This value is only present if
     * the authentication decision is either <code>ACCEPT</code> or <code>REJECT</code>.
     * </p>
     */
    private Integer score;

    /**
     * <p>
     * A timestamp indicating when audio aggregation ended for this authentication result.
     * </p>
     * 
     * @param audioAggregationEndedAt
     *        A timestamp indicating when audio aggregation ended for this authentication result.
     */

    public void setAudioAggregationEndedAt(java.util.Date audioAggregationEndedAt) {
        this.audioAggregationEndedAt = audioAggregationEndedAt;
    }

    /**
     * <p>
     * A timestamp indicating when audio aggregation ended for this authentication result.
     * </p>
     * 
     * @return A timestamp indicating when audio aggregation ended for this authentication result.
     */

    public java.util.Date getAudioAggregationEndedAt() {
        return this.audioAggregationEndedAt;
    }

    /**
     * <p>
     * A timestamp indicating when audio aggregation ended for this authentication result.
     * </p>
     * 
     * @param audioAggregationEndedAt
     *        A timestamp indicating when audio aggregation ended for this authentication result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationResult withAudioAggregationEndedAt(java.util.Date audioAggregationEndedAt) {
        setAudioAggregationEndedAt(audioAggregationEndedAt);
        return this;
    }

    /**
     * <p>
     * A timestamp indicating when audio aggregation started for this authentication result.
     * </p>
     * 
     * @param audioAggregationStartedAt
     *        A timestamp indicating when audio aggregation started for this authentication result.
     */

    public void setAudioAggregationStartedAt(java.util.Date audioAggregationStartedAt) {
        this.audioAggregationStartedAt = audioAggregationStartedAt;
    }

    /**
     * <p>
     * A timestamp indicating when audio aggregation started for this authentication result.
     * </p>
     * 
     * @return A timestamp indicating when audio aggregation started for this authentication result.
     */

    public java.util.Date getAudioAggregationStartedAt() {
        return this.audioAggregationStartedAt;
    }

    /**
     * <p>
     * A timestamp indicating when audio aggregation started for this authentication result.
     * </p>
     * 
     * @param audioAggregationStartedAt
     *        A timestamp indicating when audio aggregation started for this authentication result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationResult withAudioAggregationStartedAt(java.util.Date audioAggregationStartedAt) {
        setAudioAggregationStartedAt(audioAggregationStartedAt);
        return this;
    }

    /**
     * <p>
     * The unique identifier for this authentication result. Because there can be multiple authentications for a given
     * session, this field helps to identify if the returned result is from a previous streaming activity or a new
     * result. Note that in absence of any new streaming activity, <code>AcceptanceThreshold</code> changes, or
     * <code>SpeakerId</code> changes, Voice ID always returns cached Authentication Result for this API.
     * </p>
     * 
     * @param authenticationResultId
     *        The unique identifier for this authentication result. Because there can be multiple authentications for a
     *        given session, this field helps to identify if the returned result is from a previous streaming activity
     *        or a new result. Note that in absence of any new streaming activity, <code>AcceptanceThreshold</code>
     *        changes, or <code>SpeakerId</code> changes, Voice ID always returns cached Authentication Result for this
     *        API.
     */

    public void setAuthenticationResultId(String authenticationResultId) {
        this.authenticationResultId = authenticationResultId;
    }

    /**
     * <p>
     * The unique identifier for this authentication result. Because there can be multiple authentications for a given
     * session, this field helps to identify if the returned result is from a previous streaming activity or a new
     * result. Note that in absence of any new streaming activity, <code>AcceptanceThreshold</code> changes, or
     * <code>SpeakerId</code> changes, Voice ID always returns cached Authentication Result for this API.
     * </p>
     * 
     * @return The unique identifier for this authentication result. Because there can be multiple authentications for a
     *         given session, this field helps to identify if the returned result is from a previous streaming activity
     *         or a new result. Note that in absence of any new streaming activity, <code>AcceptanceThreshold</code>
     *         changes, or <code>SpeakerId</code> changes, Voice ID always returns cached Authentication Result for this
     *         API.
     */

    public String getAuthenticationResultId() {
        return this.authenticationResultId;
    }

    /**
     * <p>
     * The unique identifier for this authentication result. Because there can be multiple authentications for a given
     * session, this field helps to identify if the returned result is from a previous streaming activity or a new
     * result. Note that in absence of any new streaming activity, <code>AcceptanceThreshold</code> changes, or
     * <code>SpeakerId</code> changes, Voice ID always returns cached Authentication Result for this API.
     * </p>
     * 
     * @param authenticationResultId
     *        The unique identifier for this authentication result. Because there can be multiple authentications for a
     *        given session, this field helps to identify if the returned result is from a previous streaming activity
     *        or a new result. Note that in absence of any new streaming activity, <code>AcceptanceThreshold</code>
     *        changes, or <code>SpeakerId</code> changes, Voice ID always returns cached Authentication Result for this
     *        API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationResult withAuthenticationResultId(String authenticationResultId) {
        setAuthenticationResultId(authenticationResultId);
        return this;
    }

    /**
     * <p>
     * The <code>AuthenticationConfiguration</code> used to generate this authentication result.
     * </p>
     * 
     * @param configuration
     *        The <code>AuthenticationConfiguration</code> used to generate this authentication result.
     */

    public void setConfiguration(AuthenticationConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The <code>AuthenticationConfiguration</code> used to generate this authentication result.
     * </p>
     * 
     * @return The <code>AuthenticationConfiguration</code> used to generate this authentication result.
     */

    public AuthenticationConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The <code>AuthenticationConfiguration</code> used to generate this authentication result.
     * </p>
     * 
     * @param configuration
     *        The <code>AuthenticationConfiguration</code> used to generate this authentication result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationResult withConfiguration(AuthenticationConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The client-provided identifier for the speaker whose authentication result is produced. Only present if a
     * <code>SpeakerId</code> is provided for the session.
     * </p>
     * 
     * @param customerSpeakerId
     *        The client-provided identifier for the speaker whose authentication result is produced. Only present if a
     *        <code>SpeakerId</code> is provided for the session.
     */

    public void setCustomerSpeakerId(String customerSpeakerId) {
        this.customerSpeakerId = customerSpeakerId;
    }

    /**
     * <p>
     * The client-provided identifier for the speaker whose authentication result is produced. Only present if a
     * <code>SpeakerId</code> is provided for the session.
     * </p>
     * 
     * @return The client-provided identifier for the speaker whose authentication result is produced. Only present if a
     *         <code>SpeakerId</code> is provided for the session.
     */

    public String getCustomerSpeakerId() {
        return this.customerSpeakerId;
    }

    /**
     * <p>
     * The client-provided identifier for the speaker whose authentication result is produced. Only present if a
     * <code>SpeakerId</code> is provided for the session.
     * </p>
     * 
     * @param customerSpeakerId
     *        The client-provided identifier for the speaker whose authentication result is produced. Only present if a
     *        <code>SpeakerId</code> is provided for the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationResult withCustomerSpeakerId(String customerSpeakerId) {
        setCustomerSpeakerId(customerSpeakerId);
        return this;
    }

    /**
     * <p>
     * The authentication decision produced by Voice ID, processed against the current session state and streamed audio
     * of the speaker.
     * </p>
     * 
     * @param decision
     *        The authentication decision produced by Voice ID, processed against the current session state and streamed
     *        audio of the speaker.
     * @see AuthenticationDecision
     */

    public void setDecision(String decision) {
        this.decision = decision;
    }

    /**
     * <p>
     * The authentication decision produced by Voice ID, processed against the current session state and streamed audio
     * of the speaker.
     * </p>
     * 
     * @return The authentication decision produced by Voice ID, processed against the current session state and
     *         streamed audio of the speaker.
     * @see AuthenticationDecision
     */

    public String getDecision() {
        return this.decision;
    }

    /**
     * <p>
     * The authentication decision produced by Voice ID, processed against the current session state and streamed audio
     * of the speaker.
     * </p>
     * 
     * @param decision
     *        The authentication decision produced by Voice ID, processed against the current session state and streamed
     *        audio of the speaker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationDecision
     */

    public AuthenticationResult withDecision(String decision) {
        setDecision(decision);
        return this;
    }

    /**
     * <p>
     * The authentication decision produced by Voice ID, processed against the current session state and streamed audio
     * of the speaker.
     * </p>
     * 
     * @param decision
     *        The authentication decision produced by Voice ID, processed against the current session state and streamed
     *        audio of the speaker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationDecision
     */

    public AuthenticationResult withDecision(AuthenticationDecision decision) {
        this.decision = decision.toString();
        return this;
    }

    /**
     * <p>
     * The service-generated identifier for the speaker whose authentication result is produced.
     * </p>
     * 
     * @param generatedSpeakerId
     *        The service-generated identifier for the speaker whose authentication result is produced.
     */

    public void setGeneratedSpeakerId(String generatedSpeakerId) {
        this.generatedSpeakerId = generatedSpeakerId;
    }

    /**
     * <p>
     * The service-generated identifier for the speaker whose authentication result is produced.
     * </p>
     * 
     * @return The service-generated identifier for the speaker whose authentication result is produced.
     */

    public String getGeneratedSpeakerId() {
        return this.generatedSpeakerId;
    }

    /**
     * <p>
     * The service-generated identifier for the speaker whose authentication result is produced.
     * </p>
     * 
     * @param generatedSpeakerId
     *        The service-generated identifier for the speaker whose authentication result is produced.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationResult withGeneratedSpeakerId(String generatedSpeakerId) {
        setGeneratedSpeakerId(generatedSpeakerId);
        return this;
    }

    /**
     * <p>
     * The authentication score for the speaker whose authentication result is produced. This value is only present if
     * the authentication decision is either <code>ACCEPT</code> or <code>REJECT</code>.
     * </p>
     * 
     * @param score
     *        The authentication score for the speaker whose authentication result is produced. This value is only
     *        present if the authentication decision is either <code>ACCEPT</code> or <code>REJECT</code>.
     */

    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * <p>
     * The authentication score for the speaker whose authentication result is produced. This value is only present if
     * the authentication decision is either <code>ACCEPT</code> or <code>REJECT</code>.
     * </p>
     * 
     * @return The authentication score for the speaker whose authentication result is produced. This value is only
     *         present if the authentication decision is either <code>ACCEPT</code> or <code>REJECT</code>.
     */

    public Integer getScore() {
        return this.score;
    }

    /**
     * <p>
     * The authentication score for the speaker whose authentication result is produced. This value is only present if
     * the authentication decision is either <code>ACCEPT</code> or <code>REJECT</code>.
     * </p>
     * 
     * @param score
     *        The authentication score for the speaker whose authentication result is produced. This value is only
     *        present if the authentication decision is either <code>ACCEPT</code> or <code>REJECT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationResult withScore(Integer score) {
        setScore(score);
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
        if (getAuthenticationResultId() != null)
            sb.append("AuthenticationResultId: ").append(getAuthenticationResultId()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getCustomerSpeakerId() != null)
            sb.append("CustomerSpeakerId: ").append("***Sensitive Data Redacted***").append(",");
        if (getDecision() != null)
            sb.append("Decision: ").append(getDecision()).append(",");
        if (getGeneratedSpeakerId() != null)
            sb.append("GeneratedSpeakerId: ").append(getGeneratedSpeakerId()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthenticationResult == false)
            return false;
        AuthenticationResult other = (AuthenticationResult) obj;
        if (other.getAudioAggregationEndedAt() == null ^ this.getAudioAggregationEndedAt() == null)
            return false;
        if (other.getAudioAggregationEndedAt() != null && other.getAudioAggregationEndedAt().equals(this.getAudioAggregationEndedAt()) == false)
            return false;
        if (other.getAudioAggregationStartedAt() == null ^ this.getAudioAggregationStartedAt() == null)
            return false;
        if (other.getAudioAggregationStartedAt() != null && other.getAudioAggregationStartedAt().equals(this.getAudioAggregationStartedAt()) == false)
            return false;
        if (other.getAuthenticationResultId() == null ^ this.getAuthenticationResultId() == null)
            return false;
        if (other.getAuthenticationResultId() != null && other.getAuthenticationResultId().equals(this.getAuthenticationResultId()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getCustomerSpeakerId() == null ^ this.getCustomerSpeakerId() == null)
            return false;
        if (other.getCustomerSpeakerId() != null && other.getCustomerSpeakerId().equals(this.getCustomerSpeakerId()) == false)
            return false;
        if (other.getDecision() == null ^ this.getDecision() == null)
            return false;
        if (other.getDecision() != null && other.getDecision().equals(this.getDecision()) == false)
            return false;
        if (other.getGeneratedSpeakerId() == null ^ this.getGeneratedSpeakerId() == null)
            return false;
        if (other.getGeneratedSpeakerId() != null && other.getGeneratedSpeakerId().equals(this.getGeneratedSpeakerId()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioAggregationEndedAt() == null) ? 0 : getAudioAggregationEndedAt().hashCode());
        hashCode = prime * hashCode + ((getAudioAggregationStartedAt() == null) ? 0 : getAudioAggregationStartedAt().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationResultId() == null) ? 0 : getAuthenticationResultId().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCustomerSpeakerId() == null) ? 0 : getCustomerSpeakerId().hashCode());
        hashCode = prime * hashCode + ((getDecision() == null) ? 0 : getDecision().hashCode());
        hashCode = prime * hashCode + ((getGeneratedSpeakerId() == null) ? 0 : getGeneratedSpeakerId().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public AuthenticationResult clone() {
        try {
            return (AuthenticationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.voiceid.model.transform.AuthenticationResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
