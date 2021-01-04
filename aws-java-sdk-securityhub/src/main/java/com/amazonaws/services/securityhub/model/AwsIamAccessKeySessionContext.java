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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the session that the key was used for.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsIamAccessKeySessionContext"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsIamAccessKeySessionContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Attributes of the session that the key was used for.
     * </p>
     */
    private AwsIamAccessKeySessionContextAttributes attributes;
    /**
     * <p>
     * Information about the entity that created the session.
     * </p>
     */
    private AwsIamAccessKeySessionContextSessionIssuer sessionIssuer;

    /**
     * <p>
     * Attributes of the session that the key was used for.
     * </p>
     * 
     * @param attributes
     *        Attributes of the session that the key was used for.
     */

    public void setAttributes(AwsIamAccessKeySessionContextAttributes attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * Attributes of the session that the key was used for.
     * </p>
     * 
     * @return Attributes of the session that the key was used for.
     */

    public AwsIamAccessKeySessionContextAttributes getAttributes() {
        return this.attributes;
    }

    /**
     * <p>
     * Attributes of the session that the key was used for.
     * </p>
     * 
     * @param attributes
     *        Attributes of the session that the key was used for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamAccessKeySessionContext withAttributes(AwsIamAccessKeySessionContextAttributes attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * Information about the entity that created the session.
     * </p>
     * 
     * @param sessionIssuer
     *        Information about the entity that created the session.
     */

    public void setSessionIssuer(AwsIamAccessKeySessionContextSessionIssuer sessionIssuer) {
        this.sessionIssuer = sessionIssuer;
    }

    /**
     * <p>
     * Information about the entity that created the session.
     * </p>
     * 
     * @return Information about the entity that created the session.
     */

    public AwsIamAccessKeySessionContextSessionIssuer getSessionIssuer() {
        return this.sessionIssuer;
    }

    /**
     * <p>
     * Information about the entity that created the session.
     * </p>
     * 
     * @param sessionIssuer
     *        Information about the entity that created the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamAccessKeySessionContext withSessionIssuer(AwsIamAccessKeySessionContextSessionIssuer sessionIssuer) {
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

        if (obj instanceof AwsIamAccessKeySessionContext == false)
            return false;
        AwsIamAccessKeySessionContext other = (AwsIamAccessKeySessionContext) obj;
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
    public AwsIamAccessKeySessionContext clone() {
        try {
            return (AwsIamAccessKeySessionContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsIamAccessKeySessionContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
