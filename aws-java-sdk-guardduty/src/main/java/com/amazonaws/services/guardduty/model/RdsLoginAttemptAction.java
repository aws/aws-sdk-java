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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Indicates that a login attempt was made to the potentially compromised database from a remote IP address.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/RdsLoginAttemptAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RdsLoginAttemptAction implements Serializable, Cloneable, StructuredPojo {

    private RemoteIpDetails remoteIpDetails;
    /**
     * <p>
     * Indicates the login attributes used in the login attempt.
     * </p>
     */
    private java.util.List<LoginAttribute> loginAttributes;

    /**
     * @param remoteIpDetails
     */

    public void setRemoteIpDetails(RemoteIpDetails remoteIpDetails) {
        this.remoteIpDetails = remoteIpDetails;
    }

    /**
     * @return
     */

    public RemoteIpDetails getRemoteIpDetails() {
        return this.remoteIpDetails;
    }

    /**
     * @param remoteIpDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsLoginAttemptAction withRemoteIpDetails(RemoteIpDetails remoteIpDetails) {
        setRemoteIpDetails(remoteIpDetails);
        return this;
    }

    /**
     * <p>
     * Indicates the login attributes used in the login attempt.
     * </p>
     * 
     * @return Indicates the login attributes used in the login attempt.
     */

    public java.util.List<LoginAttribute> getLoginAttributes() {
        return loginAttributes;
    }

    /**
     * <p>
     * Indicates the login attributes used in the login attempt.
     * </p>
     * 
     * @param loginAttributes
     *        Indicates the login attributes used in the login attempt.
     */

    public void setLoginAttributes(java.util.Collection<LoginAttribute> loginAttributes) {
        if (loginAttributes == null) {
            this.loginAttributes = null;
            return;
        }

        this.loginAttributes = new java.util.ArrayList<LoginAttribute>(loginAttributes);
    }

    /**
     * <p>
     * Indicates the login attributes used in the login attempt.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoginAttributes(java.util.Collection)} or {@link #withLoginAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param loginAttributes
     *        Indicates the login attributes used in the login attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsLoginAttemptAction withLoginAttributes(LoginAttribute... loginAttributes) {
        if (this.loginAttributes == null) {
            setLoginAttributes(new java.util.ArrayList<LoginAttribute>(loginAttributes.length));
        }
        for (LoginAttribute ele : loginAttributes) {
            this.loginAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates the login attributes used in the login attempt.
     * </p>
     * 
     * @param loginAttributes
     *        Indicates the login attributes used in the login attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsLoginAttemptAction withLoginAttributes(java.util.Collection<LoginAttribute> loginAttributes) {
        setLoginAttributes(loginAttributes);
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
        if (getRemoteIpDetails() != null)
            sb.append("RemoteIpDetails: ").append(getRemoteIpDetails()).append(",");
        if (getLoginAttributes() != null)
            sb.append("LoginAttributes: ").append(getLoginAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RdsLoginAttemptAction == false)
            return false;
        RdsLoginAttemptAction other = (RdsLoginAttemptAction) obj;
        if (other.getRemoteIpDetails() == null ^ this.getRemoteIpDetails() == null)
            return false;
        if (other.getRemoteIpDetails() != null && other.getRemoteIpDetails().equals(this.getRemoteIpDetails()) == false)
            return false;
        if (other.getLoginAttributes() == null ^ this.getLoginAttributes() == null)
            return false;
        if (other.getLoginAttributes() != null && other.getLoginAttributes().equals(this.getLoginAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRemoteIpDetails() == null) ? 0 : getRemoteIpDetails().hashCode());
        hashCode = prime * hashCode + ((getLoginAttributes() == null) ? 0 : getLoginAttributes().hashCode());
        return hashCode;
    }

    @Override
    public RdsLoginAttemptAction clone() {
        try {
            return (RdsLoginAttemptAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.RdsLoginAttemptActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
