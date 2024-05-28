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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that defines how Security Hub is configured. It includes whether Security Hub is enabled or disabled, a
 * list of enabled security standards, a list of enabled or disabled security controls, and a list of custom parameter
 * values for specified controls. If you provide a list of security controls that are enabled in the configuration
 * policy, Security Hub disables all other controls (including newly released controls). If you provide a list of
 * security controls that are disabled in the configuration policy, Security Hub enables all other controls (including
 * newly released controls).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Policy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Policy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Service that the configuration policy applies to.
     * </p>
     */
    private SecurityHubPolicy securityHub;

    /**
     * <p>
     * The Amazon Web Service that the configuration policy applies to.
     * </p>
     * 
     * @param securityHub
     *        The Amazon Web Service that the configuration policy applies to.
     */

    public void setSecurityHub(SecurityHubPolicy securityHub) {
        this.securityHub = securityHub;
    }

    /**
     * <p>
     * The Amazon Web Service that the configuration policy applies to.
     * </p>
     * 
     * @return The Amazon Web Service that the configuration policy applies to.
     */

    public SecurityHubPolicy getSecurityHub() {
        return this.securityHub;
    }

    /**
     * <p>
     * The Amazon Web Service that the configuration policy applies to.
     * </p>
     * 
     * @param securityHub
     *        The Amazon Web Service that the configuration policy applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withSecurityHub(SecurityHubPolicy securityHub) {
        setSecurityHub(securityHub);
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
        if (getSecurityHub() != null)
            sb.append("SecurityHub: ").append(getSecurityHub());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Policy == false)
            return false;
        Policy other = (Policy) obj;
        if (other.getSecurityHub() == null ^ this.getSecurityHub() == null)
            return false;
        if (other.getSecurityHub() != null && other.getSecurityHub().equals(this.getSecurityHub()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityHub() == null) ? 0 : getSecurityHub().hashCode());
        return hashCode;
    }

    @Override
    public Policy clone() {
        try {
            return (Policy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.PolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
