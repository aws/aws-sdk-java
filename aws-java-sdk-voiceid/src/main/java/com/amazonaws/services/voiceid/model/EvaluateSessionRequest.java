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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/EvaluateSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluateSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the domain where the session started.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The session identifier, or name of the session, that you want to evaluate. In Voice ID integration, this is the
     * Contact-Id.
     * </p>
     */
    private String sessionNameOrId;

    /**
     * <p>
     * The identifier of the domain where the session started.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain where the session started.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the domain where the session started.
     * </p>
     * 
     * @return The identifier of the domain where the session started.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the domain where the session started.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain where the session started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateSessionRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The session identifier, or name of the session, that you want to evaluate. In Voice ID integration, this is the
     * Contact-Id.
     * </p>
     * 
     * @param sessionNameOrId
     *        The session identifier, or name of the session, that you want to evaluate. In Voice ID integration, this
     *        is the Contact-Id.
     */

    public void setSessionNameOrId(String sessionNameOrId) {
        this.sessionNameOrId = sessionNameOrId;
    }

    /**
     * <p>
     * The session identifier, or name of the session, that you want to evaluate. In Voice ID integration, this is the
     * Contact-Id.
     * </p>
     * 
     * @return The session identifier, or name of the session, that you want to evaluate. In Voice ID integration, this
     *         is the Contact-Id.
     */

    public String getSessionNameOrId() {
        return this.sessionNameOrId;
    }

    /**
     * <p>
     * The session identifier, or name of the session, that you want to evaluate. In Voice ID integration, this is the
     * Contact-Id.
     * </p>
     * 
     * @param sessionNameOrId
     *        The session identifier, or name of the session, that you want to evaluate. In Voice ID integration, this
     *        is the Contact-Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateSessionRequest withSessionNameOrId(String sessionNameOrId) {
        setSessionNameOrId(sessionNameOrId);
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getSessionNameOrId() != null)
            sb.append("SessionNameOrId: ").append(getSessionNameOrId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluateSessionRequest == false)
            return false;
        EvaluateSessionRequest other = (EvaluateSessionRequest) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getSessionNameOrId() == null ^ this.getSessionNameOrId() == null)
            return false;
        if (other.getSessionNameOrId() != null && other.getSessionNameOrId().equals(this.getSessionNameOrId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getSessionNameOrId() == null) ? 0 : getSessionNameOrId().hashCode());
        return hashCode;
    }

    @Override
    public EvaluateSessionRequest clone() {
        return (EvaluateSessionRequest) super.clone();
    }

}
