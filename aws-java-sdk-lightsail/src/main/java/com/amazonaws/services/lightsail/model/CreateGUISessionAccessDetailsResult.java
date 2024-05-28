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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateGUISessionAccessDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGUISessionAccessDetailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The resource name.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The status of the operation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The percentage of completion for the operation.
     * </p>
     */
    private Integer percentageComplete;
    /**
     * <p>
     * The reason the operation failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Returns information about the specified NICE DCV GUI session.
     * </p>
     */
    private java.util.List<Session> sessions;

    /**
     * <p>
     * The resource name.
     * </p>
     * 
     * @param resourceName
     *        The resource name.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The resource name.
     * </p>
     * 
     * @return The resource name.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The resource name.
     * </p>
     * 
     * @param resourceName
     *        The resource name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGUISessionAccessDetailsResult withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The status of the operation.
     * </p>
     * 
     * @param status
     *        The status of the operation.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the operation.
     * </p>
     * 
     * @return The status of the operation.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the operation.
     * </p>
     * 
     * @param status
     *        The status of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public CreateGUISessionAccessDetailsResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the operation.
     * </p>
     * 
     * @param status
     *        The status of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public CreateGUISessionAccessDetailsResult withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The percentage of completion for the operation.
     * </p>
     * 
     * @param percentageComplete
     *        The percentage of completion for the operation.
     */

    public void setPercentageComplete(Integer percentageComplete) {
        this.percentageComplete = percentageComplete;
    }

    /**
     * <p>
     * The percentage of completion for the operation.
     * </p>
     * 
     * @return The percentage of completion for the operation.
     */

    public Integer getPercentageComplete() {
        return this.percentageComplete;
    }

    /**
     * <p>
     * The percentage of completion for the operation.
     * </p>
     * 
     * @param percentageComplete
     *        The percentage of completion for the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGUISessionAccessDetailsResult withPercentageComplete(Integer percentageComplete) {
        setPercentageComplete(percentageComplete);
        return this;
    }

    /**
     * <p>
     * The reason the operation failed.
     * </p>
     * 
     * @param failureReason
     *        The reason the operation failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason the operation failed.
     * </p>
     * 
     * @return The reason the operation failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason the operation failed.
     * </p>
     * 
     * @param failureReason
     *        The reason the operation failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGUISessionAccessDetailsResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Returns information about the specified NICE DCV GUI session.
     * </p>
     * 
     * @return Returns information about the specified NICE DCV GUI session.
     */

    public java.util.List<Session> getSessions() {
        return sessions;
    }

    /**
     * <p>
     * Returns information about the specified NICE DCV GUI session.
     * </p>
     * 
     * @param sessions
     *        Returns information about the specified NICE DCV GUI session.
     */

    public void setSessions(java.util.Collection<Session> sessions) {
        if (sessions == null) {
            this.sessions = null;
            return;
        }

        this.sessions = new java.util.ArrayList<Session>(sessions);
    }

    /**
     * <p>
     * Returns information about the specified NICE DCV GUI session.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSessions(java.util.Collection)} or {@link #withSessions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sessions
     *        Returns information about the specified NICE DCV GUI session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGUISessionAccessDetailsResult withSessions(Session... sessions) {
        if (this.sessions == null) {
            setSessions(new java.util.ArrayList<Session>(sessions.length));
        }
        for (Session ele : sessions) {
            this.sessions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns information about the specified NICE DCV GUI session.
     * </p>
     * 
     * @param sessions
     *        Returns information about the specified NICE DCV GUI session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGUISessionAccessDetailsResult withSessions(java.util.Collection<Session> sessions) {
        setSessions(sessions);
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
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPercentageComplete() != null)
            sb.append("PercentageComplete: ").append(getPercentageComplete()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getSessions() != null)
            sb.append("Sessions: ").append(getSessions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGUISessionAccessDetailsResult == false)
            return false;
        CreateGUISessionAccessDetailsResult other = (CreateGUISessionAccessDetailsResult) obj;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPercentageComplete() == null ^ this.getPercentageComplete() == null)
            return false;
        if (other.getPercentageComplete() != null && other.getPercentageComplete().equals(this.getPercentageComplete()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getSessions() == null ^ this.getSessions() == null)
            return false;
        if (other.getSessions() != null && other.getSessions().equals(this.getSessions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPercentageComplete() == null) ? 0 : getPercentageComplete().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getSessions() == null) ? 0 : getSessions().hashCode());
        return hashCode;
    }

    @Override
    public CreateGUISessionAccessDetailsResult clone() {
        try {
            return (CreateGUISessionAccessDetailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
