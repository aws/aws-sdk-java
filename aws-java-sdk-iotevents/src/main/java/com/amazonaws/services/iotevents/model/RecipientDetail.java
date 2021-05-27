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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information that identifies the recipient.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/RecipientDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecipientDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS Single Sign-On (AWS SSO) authentication information.
     * </p>
     */
    private SSOIdentity ssoIdentity;

    /**
     * <p>
     * The AWS Single Sign-On (AWS SSO) authentication information.
     * </p>
     * 
     * @param ssoIdentity
     *        The AWS Single Sign-On (AWS SSO) authentication information.
     */

    public void setSsoIdentity(SSOIdentity ssoIdentity) {
        this.ssoIdentity = ssoIdentity;
    }

    /**
     * <p>
     * The AWS Single Sign-On (AWS SSO) authentication information.
     * </p>
     * 
     * @return The AWS Single Sign-On (AWS SSO) authentication information.
     */

    public SSOIdentity getSsoIdentity() {
        return this.ssoIdentity;
    }

    /**
     * <p>
     * The AWS Single Sign-On (AWS SSO) authentication information.
     * </p>
     * 
     * @param ssoIdentity
     *        The AWS Single Sign-On (AWS SSO) authentication information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecipientDetail withSsoIdentity(SSOIdentity ssoIdentity) {
        setSsoIdentity(ssoIdentity);
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
        if (getSsoIdentity() != null)
            sb.append("SsoIdentity: ").append(getSsoIdentity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecipientDetail == false)
            return false;
        RecipientDetail other = (RecipientDetail) obj;
        if (other.getSsoIdentity() == null ^ this.getSsoIdentity() == null)
            return false;
        if (other.getSsoIdentity() != null && other.getSsoIdentity().equals(this.getSsoIdentity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSsoIdentity() == null) ? 0 : getSsoIdentity().hashCode());
        return hashCode;
    }

    @Override
    public RecipientDetail clone() {
        try {
            return (RecipientDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.RecipientDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
