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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The start CIS session message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/StartCisSessionMessage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartCisSessionMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique token that identifies the CIS session.
     * </p>
     */
    private String sessionToken;

    /**
     * <p>
     * The unique token that identifies the CIS session.
     * </p>
     * 
     * @param sessionToken
     *        The unique token that identifies the CIS session.
     */

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    /**
     * <p>
     * The unique token that identifies the CIS session.
     * </p>
     * 
     * @return The unique token that identifies the CIS session.
     */

    public String getSessionToken() {
        return this.sessionToken;
    }

    /**
     * <p>
     * The unique token that identifies the CIS session.
     * </p>
     * 
     * @param sessionToken
     *        The unique token that identifies the CIS session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCisSessionMessage withSessionToken(String sessionToken) {
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

        if (obj instanceof StartCisSessionMessage == false)
            return false;
        StartCisSessionMessage other = (StartCisSessionMessage) obj;
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
    public StartCisSessionMessage clone() {
        try {
            return (StartCisSessionMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.StartCisSessionMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
