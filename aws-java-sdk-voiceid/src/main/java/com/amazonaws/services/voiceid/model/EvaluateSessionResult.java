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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/EvaluateSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluateSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details resulting from the authentication process, such as authentication decision and authentication score.
     * </p>
     */
    private AuthenticationResult authenticationResult;
    /**
     * <p>
     * The identifier of the domain containing the session.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * Details resulting from the fraud detection process, such as fraud detection decision and risk score.
     * </p>
     */
    private FraudDetectionResult fraudDetectionResult;
    /**
     * <p>
     * The service-generated identifier of the session.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * The client-provided name of the session.
     * </p>
     */
    private String sessionName;
    /**
     * <p>
     * The current status of audio streaming for this session. This field is useful to infer next steps when the
     * Authentication or Fraud Detection results are empty or the decision is <code>NOT_ENOUGH_SPEECH</code>. In this
     * situation, if the <code>StreamingStatus</code> is <code>ONGOING/PENDING_CONFIGURATION</code>, it can mean that
     * the client should call the API again later, after Voice ID has enough audio to produce a result. If the decision
     * remains <code>NOT_ENOUGH_SPEECH</code> even after <code>StreamingStatus</code> is <code>ENDED</code>, it means
     * that the previously streamed session did not have enough speech to perform evaluation, and a new streaming
     * session is needed to try again.
     * </p>
     */
    private String streamingStatus;

    /**
     * <p>
     * Details resulting from the authentication process, such as authentication decision and authentication score.
     * </p>
     * 
     * @param authenticationResult
     *        Details resulting from the authentication process, such as authentication decision and authentication
     *        score.
     */

    public void setAuthenticationResult(AuthenticationResult authenticationResult) {
        this.authenticationResult = authenticationResult;
    }

    /**
     * <p>
     * Details resulting from the authentication process, such as authentication decision and authentication score.
     * </p>
     * 
     * @return Details resulting from the authentication process, such as authentication decision and authentication
     *         score.
     */

    public AuthenticationResult getAuthenticationResult() {
        return this.authenticationResult;
    }

    /**
     * <p>
     * Details resulting from the authentication process, such as authentication decision and authentication score.
     * </p>
     * 
     * @param authenticationResult
     *        Details resulting from the authentication process, such as authentication decision and authentication
     *        score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateSessionResult withAuthenticationResult(AuthenticationResult authenticationResult) {
        setAuthenticationResult(authenticationResult);
        return this;
    }

    /**
     * <p>
     * The identifier of the domain containing the session.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain containing the session.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the domain containing the session.
     * </p>
     * 
     * @return The identifier of the domain containing the session.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the domain containing the session.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain containing the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateSessionResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * Details resulting from the fraud detection process, such as fraud detection decision and risk score.
     * </p>
     * 
     * @param fraudDetectionResult
     *        Details resulting from the fraud detection process, such as fraud detection decision and risk score.
     */

    public void setFraudDetectionResult(FraudDetectionResult fraudDetectionResult) {
        this.fraudDetectionResult = fraudDetectionResult;
    }

    /**
     * <p>
     * Details resulting from the fraud detection process, such as fraud detection decision and risk score.
     * </p>
     * 
     * @return Details resulting from the fraud detection process, such as fraud detection decision and risk score.
     */

    public FraudDetectionResult getFraudDetectionResult() {
        return this.fraudDetectionResult;
    }

    /**
     * <p>
     * Details resulting from the fraud detection process, such as fraud detection decision and risk score.
     * </p>
     * 
     * @param fraudDetectionResult
     *        Details resulting from the fraud detection process, such as fraud detection decision and risk score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateSessionResult withFraudDetectionResult(FraudDetectionResult fraudDetectionResult) {
        setFraudDetectionResult(fraudDetectionResult);
        return this;
    }

    /**
     * <p>
     * The service-generated identifier of the session.
     * </p>
     * 
     * @param sessionId
     *        The service-generated identifier of the session.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The service-generated identifier of the session.
     * </p>
     * 
     * @return The service-generated identifier of the session.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The service-generated identifier of the session.
     * </p>
     * 
     * @param sessionId
     *        The service-generated identifier of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateSessionResult withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * The client-provided name of the session.
     * </p>
     * 
     * @param sessionName
     *        The client-provided name of the session.
     */

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    /**
     * <p>
     * The client-provided name of the session.
     * </p>
     * 
     * @return The client-provided name of the session.
     */

    public String getSessionName() {
        return this.sessionName;
    }

    /**
     * <p>
     * The client-provided name of the session.
     * </p>
     * 
     * @param sessionName
     *        The client-provided name of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateSessionResult withSessionName(String sessionName) {
        setSessionName(sessionName);
        return this;
    }

    /**
     * <p>
     * The current status of audio streaming for this session. This field is useful to infer next steps when the
     * Authentication or Fraud Detection results are empty or the decision is <code>NOT_ENOUGH_SPEECH</code>. In this
     * situation, if the <code>StreamingStatus</code> is <code>ONGOING/PENDING_CONFIGURATION</code>, it can mean that
     * the client should call the API again later, after Voice ID has enough audio to produce a result. If the decision
     * remains <code>NOT_ENOUGH_SPEECH</code> even after <code>StreamingStatus</code> is <code>ENDED</code>, it means
     * that the previously streamed session did not have enough speech to perform evaluation, and a new streaming
     * session is needed to try again.
     * </p>
     * 
     * @param streamingStatus
     *        The current status of audio streaming for this session. This field is useful to infer next steps when the
     *        Authentication or Fraud Detection results are empty or the decision is <code>NOT_ENOUGH_SPEECH</code>. In
     *        this situation, if the <code>StreamingStatus</code> is <code>ONGOING/PENDING_CONFIGURATION</code>, it can
     *        mean that the client should call the API again later, after Voice ID has enough audio to produce a result.
     *        If the decision remains <code>NOT_ENOUGH_SPEECH</code> even after <code>StreamingStatus</code> is
     *        <code>ENDED</code>, it means that the previously streamed session did not have enough speech to perform
     *        evaluation, and a new streaming session is needed to try again.
     * @see StreamingStatus
     */

    public void setStreamingStatus(String streamingStatus) {
        this.streamingStatus = streamingStatus;
    }

    /**
     * <p>
     * The current status of audio streaming for this session. This field is useful to infer next steps when the
     * Authentication or Fraud Detection results are empty or the decision is <code>NOT_ENOUGH_SPEECH</code>. In this
     * situation, if the <code>StreamingStatus</code> is <code>ONGOING/PENDING_CONFIGURATION</code>, it can mean that
     * the client should call the API again later, after Voice ID has enough audio to produce a result. If the decision
     * remains <code>NOT_ENOUGH_SPEECH</code> even after <code>StreamingStatus</code> is <code>ENDED</code>, it means
     * that the previously streamed session did not have enough speech to perform evaluation, and a new streaming
     * session is needed to try again.
     * </p>
     * 
     * @return The current status of audio streaming for this session. This field is useful to infer next steps when the
     *         Authentication or Fraud Detection results are empty or the decision is <code>NOT_ENOUGH_SPEECH</code>. In
     *         this situation, if the <code>StreamingStatus</code> is <code>ONGOING/PENDING_CONFIGURATION</code>, it can
     *         mean that the client should call the API again later, after Voice ID has enough audio to produce a
     *         result. If the decision remains <code>NOT_ENOUGH_SPEECH</code> even after <code>StreamingStatus</code> is
     *         <code>ENDED</code>, it means that the previously streamed session did not have enough speech to perform
     *         evaluation, and a new streaming session is needed to try again.
     * @see StreamingStatus
     */

    public String getStreamingStatus() {
        return this.streamingStatus;
    }

    /**
     * <p>
     * The current status of audio streaming for this session. This field is useful to infer next steps when the
     * Authentication or Fraud Detection results are empty or the decision is <code>NOT_ENOUGH_SPEECH</code>. In this
     * situation, if the <code>StreamingStatus</code> is <code>ONGOING/PENDING_CONFIGURATION</code>, it can mean that
     * the client should call the API again later, after Voice ID has enough audio to produce a result. If the decision
     * remains <code>NOT_ENOUGH_SPEECH</code> even after <code>StreamingStatus</code> is <code>ENDED</code>, it means
     * that the previously streamed session did not have enough speech to perform evaluation, and a new streaming
     * session is needed to try again.
     * </p>
     * 
     * @param streamingStatus
     *        The current status of audio streaming for this session. This field is useful to infer next steps when the
     *        Authentication or Fraud Detection results are empty or the decision is <code>NOT_ENOUGH_SPEECH</code>. In
     *        this situation, if the <code>StreamingStatus</code> is <code>ONGOING/PENDING_CONFIGURATION</code>, it can
     *        mean that the client should call the API again later, after Voice ID has enough audio to produce a result.
     *        If the decision remains <code>NOT_ENOUGH_SPEECH</code> even after <code>StreamingStatus</code> is
     *        <code>ENDED</code>, it means that the previously streamed session did not have enough speech to perform
     *        evaluation, and a new streaming session is needed to try again.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingStatus
     */

    public EvaluateSessionResult withStreamingStatus(String streamingStatus) {
        setStreamingStatus(streamingStatus);
        return this;
    }

    /**
     * <p>
     * The current status of audio streaming for this session. This field is useful to infer next steps when the
     * Authentication or Fraud Detection results are empty or the decision is <code>NOT_ENOUGH_SPEECH</code>. In this
     * situation, if the <code>StreamingStatus</code> is <code>ONGOING/PENDING_CONFIGURATION</code>, it can mean that
     * the client should call the API again later, after Voice ID has enough audio to produce a result. If the decision
     * remains <code>NOT_ENOUGH_SPEECH</code> even after <code>StreamingStatus</code> is <code>ENDED</code>, it means
     * that the previously streamed session did not have enough speech to perform evaluation, and a new streaming
     * session is needed to try again.
     * </p>
     * 
     * @param streamingStatus
     *        The current status of audio streaming for this session. This field is useful to infer next steps when the
     *        Authentication or Fraud Detection results are empty or the decision is <code>NOT_ENOUGH_SPEECH</code>. In
     *        this situation, if the <code>StreamingStatus</code> is <code>ONGOING/PENDING_CONFIGURATION</code>, it can
     *        mean that the client should call the API again later, after Voice ID has enough audio to produce a result.
     *        If the decision remains <code>NOT_ENOUGH_SPEECH</code> even after <code>StreamingStatus</code> is
     *        <code>ENDED</code>, it means that the previously streamed session did not have enough speech to perform
     *        evaluation, and a new streaming session is needed to try again.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingStatus
     */

    public EvaluateSessionResult withStreamingStatus(StreamingStatus streamingStatus) {
        this.streamingStatus = streamingStatus.toString();
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
        if (getAuthenticationResult() != null)
            sb.append("AuthenticationResult: ").append(getAuthenticationResult()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getFraudDetectionResult() != null)
            sb.append("FraudDetectionResult: ").append(getFraudDetectionResult()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getSessionName() != null)
            sb.append("SessionName: ").append(getSessionName()).append(",");
        if (getStreamingStatus() != null)
            sb.append("StreamingStatus: ").append(getStreamingStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluateSessionResult == false)
            return false;
        EvaluateSessionResult other = (EvaluateSessionResult) obj;
        if (other.getAuthenticationResult() == null ^ this.getAuthenticationResult() == null)
            return false;
        if (other.getAuthenticationResult() != null && other.getAuthenticationResult().equals(this.getAuthenticationResult()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getFraudDetectionResult() == null ^ this.getFraudDetectionResult() == null)
            return false;
        if (other.getFraudDetectionResult() != null && other.getFraudDetectionResult().equals(this.getFraudDetectionResult()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getSessionName() == null ^ this.getSessionName() == null)
            return false;
        if (other.getSessionName() != null && other.getSessionName().equals(this.getSessionName()) == false)
            return false;
        if (other.getStreamingStatus() == null ^ this.getStreamingStatus() == null)
            return false;
        if (other.getStreamingStatus() != null && other.getStreamingStatus().equals(this.getStreamingStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationResult() == null) ? 0 : getAuthenticationResult().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getFraudDetectionResult() == null) ? 0 : getFraudDetectionResult().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getSessionName() == null) ? 0 : getSessionName().hashCode());
        hashCode = prime * hashCode + ((getStreamingStatus() == null) ? 0 : getStreamingStatus().hashCode());
        return hashCode;
    }

    @Override
    public EvaluateSessionResult clone() {
        try {
            return (EvaluateSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
