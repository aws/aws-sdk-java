/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreatePresignedPortalUrl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePresignedPortalUrlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String portalId;

    private Integer sessionDurationSeconds;

    private String state;

    /**
     * @param portalId
     */

    public void setPortalId(String portalId) {
        this.portalId = portalId;
    }

    /**
     * @return
     */

    public String getPortalId() {
        return this.portalId;
    }

    /**
     * @param portalId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresignedPortalUrlRequest withPortalId(String portalId) {
        setPortalId(portalId);
        return this;
    }

    /**
     * @param sessionDurationSeconds
     */

    public void setSessionDurationSeconds(Integer sessionDurationSeconds) {
        this.sessionDurationSeconds = sessionDurationSeconds;
    }

    /**
     * @return
     */

    public Integer getSessionDurationSeconds() {
        return this.sessionDurationSeconds;
    }

    /**
     * @param sessionDurationSeconds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresignedPortalUrlRequest withSessionDurationSeconds(Integer sessionDurationSeconds) {
        setSessionDurationSeconds(sessionDurationSeconds);
        return this;
    }

    /**
     * @param state
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     */

    public String getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresignedPortalUrlRequest withState(String state) {
        setState(state);
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
        if (getPortalId() != null)
            sb.append("PortalId: ").append(getPortalId()).append(",");
        if (getSessionDurationSeconds() != null)
            sb.append("SessionDurationSeconds: ").append(getSessionDurationSeconds()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePresignedPortalUrlRequest == false)
            return false;
        CreatePresignedPortalUrlRequest other = (CreatePresignedPortalUrlRequest) obj;
        if (other.getPortalId() == null ^ this.getPortalId() == null)
            return false;
        if (other.getPortalId() != null && other.getPortalId().equals(this.getPortalId()) == false)
            return false;
        if (other.getSessionDurationSeconds() == null ^ this.getSessionDurationSeconds() == null)
            return false;
        if (other.getSessionDurationSeconds() != null && other.getSessionDurationSeconds().equals(this.getSessionDurationSeconds()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortalId() == null) ? 0 : getPortalId().hashCode());
        hashCode = prime * hashCode + ((getSessionDurationSeconds() == null) ? 0 : getSessionDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public CreatePresignedPortalUrlRequest clone() {
        return (CreatePresignedPortalUrlRequest) super.clone();
    }

}
