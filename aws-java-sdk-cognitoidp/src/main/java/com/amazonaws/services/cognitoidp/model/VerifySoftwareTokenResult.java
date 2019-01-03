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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/VerifySoftwareToken" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifySoftwareTokenResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the verify software token.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service.
     * </p>
     */
    private String session;

    /**
     * <p>
     * The status of the verify software token.
     * </p>
     * 
     * @param status
     *        The status of the verify software token.
     * @see VerifySoftwareTokenResponseType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the verify software token.
     * </p>
     * 
     * @return The status of the verify software token.
     * @see VerifySoftwareTokenResponseType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the verify software token.
     * </p>
     * 
     * @param status
     *        The status of the verify software token.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifySoftwareTokenResponseType
     */

    public VerifySoftwareTokenResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the verify software token.
     * </p>
     * 
     * @param status
     *        The status of the verify software token.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifySoftwareTokenResponseType
     */

    public VerifySoftwareTokenResult withStatus(VerifySoftwareTokenResponseType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service.
     * </p>
     * 
     * @param session
     *        The session which should be passed both ways in challenge-response calls to the service.
     */

    public void setSession(String session) {
        this.session = session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service.
     * </p>
     * 
     * @return The session which should be passed both ways in challenge-response calls to the service.
     */

    public String getSession() {
        return this.session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service.
     * </p>
     * 
     * @param session
     *        The session which should be passed both ways in challenge-response calls to the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifySoftwareTokenResult withSession(String session) {
        setSession(session);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSession() != null)
            sb.append("Session: ").append(getSession());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifySoftwareTokenResult == false)
            return false;
        VerifySoftwareTokenResult other = (VerifySoftwareTokenResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSession() == null ^ this.getSession() == null)
            return false;
        if (other.getSession() != null && other.getSession().equals(this.getSession()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSession() == null) ? 0 : getSession().hashCode());
        return hashCode;
    }

    @Override
    public VerifySoftwareTokenResult clone() {
        try {
            return (VerifySoftwareTokenResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
