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
package com.amazonaws.services.licensemanagerusersubscriptions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about an identity provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/IdentityProvider"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentityProvider implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that details an Active Directory identity provider.
     * </p>
     */
    private ActiveDirectoryIdentityProvider activeDirectoryIdentityProvider;

    /**
     * <p>
     * An object that details an Active Directory identity provider.
     * </p>
     * 
     * @param activeDirectoryIdentityProvider
     *        An object that details an Active Directory identity provider.
     */

    public void setActiveDirectoryIdentityProvider(ActiveDirectoryIdentityProvider activeDirectoryIdentityProvider) {
        this.activeDirectoryIdentityProvider = activeDirectoryIdentityProvider;
    }

    /**
     * <p>
     * An object that details an Active Directory identity provider.
     * </p>
     * 
     * @return An object that details an Active Directory identity provider.
     */

    public ActiveDirectoryIdentityProvider getActiveDirectoryIdentityProvider() {
        return this.activeDirectoryIdentityProvider;
    }

    /**
     * <p>
     * An object that details an Active Directory identity provider.
     * </p>
     * 
     * @param activeDirectoryIdentityProvider
     *        An object that details an Active Directory identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProvider withActiveDirectoryIdentityProvider(ActiveDirectoryIdentityProvider activeDirectoryIdentityProvider) {
        setActiveDirectoryIdentityProvider(activeDirectoryIdentityProvider);
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
        if (getActiveDirectoryIdentityProvider() != null)
            sb.append("ActiveDirectoryIdentityProvider: ").append(getActiveDirectoryIdentityProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityProvider == false)
            return false;
        IdentityProvider other = (IdentityProvider) obj;
        if (other.getActiveDirectoryIdentityProvider() == null ^ this.getActiveDirectoryIdentityProvider() == null)
            return false;
        if (other.getActiveDirectoryIdentityProvider() != null
                && other.getActiveDirectoryIdentityProvider().equals(this.getActiveDirectoryIdentityProvider()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActiveDirectoryIdentityProvider() == null) ? 0 : getActiveDirectoryIdentityProvider().hashCode());
        return hashCode;
    }

    @Override
    public IdentityProvider clone() {
        try {
            return (IdentityProvider) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanagerusersubscriptions.model.transform.IdentityProviderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
