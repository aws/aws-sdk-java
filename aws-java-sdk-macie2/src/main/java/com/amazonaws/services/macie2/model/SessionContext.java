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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a session that was created for an entity that performed an action by using temporary
 * security credentials.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/SessionContext" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time when the credentials were issued, and whether the credentials were authenticated with a
     * multi-factor authentication (MFA) device.
     * </p>
     */
    private SessionContextAttributes attributes;
    /**
     * <p>
     * The source and type of credentials that were issued to the entity.
     * </p>
     */
    private SessionIssuer sessionIssuer;

    /**
     * <p>
     * The date and time when the credentials were issued, and whether the credentials were authenticated with a
     * multi-factor authentication (MFA) device.
     * </p>
     * 
     * @param attributes
     *        The date and time when the credentials were issued, and whether the credentials were authenticated with a
     *        multi-factor authentication (MFA) device.
     */

    public void setAttributes(SessionContextAttributes attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The date and time when the credentials were issued, and whether the credentials were authenticated with a
     * multi-factor authentication (MFA) device.
     * </p>
     * 
     * @return The date and time when the credentials were issued, and whether the credentials were authenticated with a
     *         multi-factor authentication (MFA) device.
     */

    public SessionContextAttributes getAttributes() {
        return this.attributes;
    }

    /**
     * <p>
     * The date and time when the credentials were issued, and whether the credentials were authenticated with a
     * multi-factor authentication (MFA) device.
     * </p>
     * 
     * @param attributes
     *        The date and time when the credentials were issued, and whether the credentials were authenticated with a
     *        multi-factor authentication (MFA) device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionContext withAttributes(SessionContextAttributes attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * The source and type of credentials that were issued to the entity.
     * </p>
     * 
     * @param sessionIssuer
     *        The source and type of credentials that were issued to the entity.
     */

    public void setSessionIssuer(SessionIssuer sessionIssuer) {
        this.sessionIssuer = sessionIssuer;
    }

    /**
     * <p>
     * The source and type of credentials that were issued to the entity.
     * </p>
     * 
     * @return The source and type of credentials that were issued to the entity.
     */

    public SessionIssuer getSessionIssuer() {
        return this.sessionIssuer;
    }

    /**
     * <p>
     * The source and type of credentials that were issued to the entity.
     * </p>
     * 
     * @param sessionIssuer
     *        The source and type of credentials that were issued to the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionContext withSessionIssuer(SessionIssuer sessionIssuer) {
        setSessionIssuer(sessionIssuer);
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getSessionIssuer() != null)
            sb.append("SessionIssuer: ").append(getSessionIssuer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SessionContext == false)
            return false;
        SessionContext other = (SessionContext) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getSessionIssuer() == null ^ this.getSessionIssuer() == null)
            return false;
        if (other.getSessionIssuer() != null && other.getSessionIssuer().equals(this.getSessionIssuer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getSessionIssuer() == null) ? 0 : getSessionIssuer().hashCode());
        return hashCode;
    }

    @Override
    public SessionContext clone() {
        try {
            return (SessionContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.SessionContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
