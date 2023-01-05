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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a Session Manager connection to a managed node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/Session" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Session implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the session.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * The managed node that the Session Manager session connected to.
     * </p>
     */
    private String target;
    /**
     * <p>
     * The status of the session. For example, "Connected" or "Terminated".
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, when the session began.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, when the session was terminated.
     * </p>
     */
    private java.util.Date endDate;
    /**
     * <p>
     * The name of the Session Manager SSM document used to define the parameters and plugin settings for the session.
     * For example, <code>SSM-SessionManagerRunShell</code>.
     * </p>
     */
    private String documentName;
    /**
     * <p>
     * The ID of the Amazon Web Services user account that started the session.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The reason for connecting to the instance.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String details;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private SessionManagerOutputUrl outputUrl;
    /**
     * <p>
     * The maximum duration of a session before it terminates.
     * </p>
     */
    private String maxSessionDuration;

    /**
     * <p>
     * The ID of the session.
     * </p>
     * 
     * @param sessionId
     *        The ID of the session.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The ID of the session.
     * </p>
     * 
     * @return The ID of the session.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The ID of the session.
     * </p>
     * 
     * @param sessionId
     *        The ID of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * The managed node that the Session Manager session connected to.
     * </p>
     * 
     * @param target
     *        The managed node that the Session Manager session connected to.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The managed node that the Session Manager session connected to.
     * </p>
     * 
     * @return The managed node that the Session Manager session connected to.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The managed node that the Session Manager session connected to.
     * </p>
     * 
     * @param target
     *        The managed node that the Session Manager session connected to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The status of the session. For example, "Connected" or "Terminated".
     * </p>
     * 
     * @param status
     *        The status of the session. For example, "Connected" or "Terminated".
     * @see SessionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the session. For example, "Connected" or "Terminated".
     * </p>
     * 
     * @return The status of the session. For example, "Connected" or "Terminated".
     * @see SessionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the session. For example, "Connected" or "Terminated".
     * </p>
     * 
     * @param status
     *        The status of the session. For example, "Connected" or "Terminated".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionStatus
     */

    public Session withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the session. For example, "Connected" or "Terminated".
     * </p>
     * 
     * @param status
     *        The status of the session. For example, "Connected" or "Terminated".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionStatus
     */

    public Session withStatus(SessionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, when the session began.
     * </p>
     * 
     * @param startDate
     *        The date and time, in ISO-8601 Extended format, when the session began.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, when the session began.
     * </p>
     * 
     * @return The date and time, in ISO-8601 Extended format, when the session began.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, when the session began.
     * </p>
     * 
     * @param startDate
     *        The date and time, in ISO-8601 Extended format, when the session began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, when the session was terminated.
     * </p>
     * 
     * @param endDate
     *        The date and time, in ISO-8601 Extended format, when the session was terminated.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, when the session was terminated.
     * </p>
     * 
     * @return The date and time, in ISO-8601 Extended format, when the session was terminated.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, when the session was terminated.
     * </p>
     * 
     * @param endDate
     *        The date and time, in ISO-8601 Extended format, when the session was terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * The name of the Session Manager SSM document used to define the parameters and plugin settings for the session.
     * For example, <code>SSM-SessionManagerRunShell</code>.
     * </p>
     * 
     * @param documentName
     *        The name of the Session Manager SSM document used to define the parameters and plugin settings for the
     *        session. For example, <code>SSM-SessionManagerRunShell</code>.
     */

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * The name of the Session Manager SSM document used to define the parameters and plugin settings for the session.
     * For example, <code>SSM-SessionManagerRunShell</code>.
     * </p>
     * 
     * @return The name of the Session Manager SSM document used to define the parameters and plugin settings for the
     *         session. For example, <code>SSM-SessionManagerRunShell</code>.
     */

    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * <p>
     * The name of the Session Manager SSM document used to define the parameters and plugin settings for the session.
     * For example, <code>SSM-SessionManagerRunShell</code>.
     * </p>
     * 
     * @param documentName
     *        The name of the Session Manager SSM document used to define the parameters and plugin settings for the
     *        session. For example, <code>SSM-SessionManagerRunShell</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withDocumentName(String documentName) {
        setDocumentName(documentName);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services user account that started the session.
     * </p>
     * 
     * @param owner
     *        The ID of the Amazon Web Services user account that started the session.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services user account that started the session.
     * </p>
     * 
     * @return The ID of the Amazon Web Services user account that started the session.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services user account that started the session.
     * </p>
     * 
     * @param owner
     *        The ID of the Amazon Web Services user account that started the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The reason for connecting to the instance.
     * </p>
     * 
     * @param reason
     *        The reason for connecting to the instance.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for connecting to the instance.
     * </p>
     * 
     * @return The reason for connecting to the instance.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for connecting to the instance.
     * </p>
     * 
     * @param reason
     *        The reason for connecting to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param details
     *        Reserved for future use.
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param details
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withDetails(String details) {
        setDetails(details);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param outputUrl
     *        Reserved for future use.
     */

    public void setOutputUrl(SessionManagerOutputUrl outputUrl) {
        this.outputUrl = outputUrl;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public SessionManagerOutputUrl getOutputUrl() {
        return this.outputUrl;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param outputUrl
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withOutputUrl(SessionManagerOutputUrl outputUrl) {
        setOutputUrl(outputUrl);
        return this;
    }

    /**
     * <p>
     * The maximum duration of a session before it terminates.
     * </p>
     * 
     * @param maxSessionDuration
     *        The maximum duration of a session before it terminates.
     */

    public void setMaxSessionDuration(String maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
    }

    /**
     * <p>
     * The maximum duration of a session before it terminates.
     * </p>
     * 
     * @return The maximum duration of a session before it terminates.
     */

    public String getMaxSessionDuration() {
        return this.maxSessionDuration;
    }

    /**
     * <p>
     * The maximum duration of a session before it terminates.
     * </p>
     * 
     * @param maxSessionDuration
     *        The maximum duration of a session before it terminates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withMaxSessionDuration(String maxSessionDuration) {
        setMaxSessionDuration(maxSessionDuration);
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
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getDocumentName() != null)
            sb.append("DocumentName: ").append(getDocumentName()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails()).append(",");
        if (getOutputUrl() != null)
            sb.append("OutputUrl: ").append(getOutputUrl()).append(",");
        if (getMaxSessionDuration() != null)
            sb.append("MaxSessionDuration: ").append(getMaxSessionDuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Session == false)
            return false;
        Session other = (Session) obj;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getDocumentName() == null ^ this.getDocumentName() == null)
            return false;
        if (other.getDocumentName() != null && other.getDocumentName().equals(this.getDocumentName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getOutputUrl() == null ^ this.getOutputUrl() == null)
            return false;
        if (other.getOutputUrl() != null && other.getOutputUrl().equals(this.getOutputUrl()) == false)
            return false;
        if (other.getMaxSessionDuration() == null ^ this.getMaxSessionDuration() == null)
            return false;
        if (other.getMaxSessionDuration() != null && other.getMaxSessionDuration().equals(this.getMaxSessionDuration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getOutputUrl() == null) ? 0 : getOutputUrl().hashCode());
        hashCode = prime * hashCode + ((getMaxSessionDuration() == null) ? 0 : getMaxSessionDuration().hashCode());
        return hashCode;
    }

    @Override
    public Session clone() {
        try {
            return (Session) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.SessionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
