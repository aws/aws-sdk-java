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
package com.amazonaws.services.qldbsession.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the details of the started session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-session-2019-07-11/StartSessionResult" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSessionResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Session token of the started session. This <code>SessionToken</code> is required for every subsequent command
     * that is issued during the current session.
     * </p>
     */
    private String sessionToken;

    /**
     * <p>
     * Session token of the started session. This <code>SessionToken</code> is required for every subsequent command
     * that is issued during the current session.
     * </p>
     * 
     * @param sessionToken
     *        Session token of the started session. This <code>SessionToken</code> is required for every subsequent
     *        command that is issued during the current session.
     */

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    /**
     * <p>
     * Session token of the started session. This <code>SessionToken</code> is required for every subsequent command
     * that is issued during the current session.
     * </p>
     * 
     * @return Session token of the started session. This <code>SessionToken</code> is required for every subsequent
     *         command that is issued during the current session.
     */

    public String getSessionToken() {
        return this.sessionToken;
    }

    /**
     * <p>
     * Session token of the started session. This <code>SessionToken</code> is required for every subsequent command
     * that is issued during the current session.
     * </p>
     * 
     * @param sessionToken
     *        Session token of the started session. This <code>SessionToken</code> is required for every subsequent
     *        command that is issued during the current session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSessionResult withSessionToken(String sessionToken) {
        setSessionToken(sessionToken);
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
        if (getSessionToken() != null)
            sb.append("SessionToken: ").append(getSessionToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSessionResult == false)
            return false;
        StartSessionResult other = (StartSessionResult) obj;
        if (other.getSessionToken() == null ^ this.getSessionToken() == null)
            return false;
        if (other.getSessionToken() != null && other.getSessionToken().equals(this.getSessionToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionToken() == null) ? 0 : getSessionToken().hashCode());
        return hashCode;
    }

    @Override
    public StartSessionResult clone() {
        try {
            return (StartSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qldbsession.model.transform.StartSessionResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
