/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#setIdentityDkimEnabled(SetIdentityDkimEnabledRequest) SetIdentityDkimEnabled operation}.
 * <p>
 * Enables or disables Easy DKIM signing of email sent from an identity:
 * </p>
 * 
 * <ul>
 * <li>If Easy DKIM signing is enabled for a domain name identity (e.g., <code>example.com</code> ), then Amazon SES will DKIM-sign all email sent by
 * addresses under that domain name (e.g., <code>user@example.com</code> ).</li>
 * <li>If Easy DKIM signing is enabled for an email address, then Amazon SES will DKIM-sign all email sent by that email address.</li>
 * 
 * </ul>
 * <p>
 * For email addresses (e.g., <code>user@example.com</code> ), you can only enable Easy DKIM signing if the corresponding domain (e.g.,
 * <code>example.com</code> ) has been set up for Easy DKIM using the AWS Console or the <code>VerifyDomainDkim</code> action.
 * </p>
 * <p>
 * For more information about Easy DKIM signing, go to the <a href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide"> Amazon SES Developer
 * Guide </a> .
 * </p>
 *
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#setIdentityDkimEnabled(SetIdentityDkimEnabledRequest)
 */
public class SetIdentityDkimEnabledRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identity for which DKIM signing should be enabled or disabled.
     */
    private String identity;

    /**
     * Sets whether DKIM signing is enabled for an identity. Set to
     * <code>true</code> to enable DKIM signing for this identity;
     * <code>false</code> to disable it.
     */
    private Boolean dkimEnabled;

    /**
     * The identity for which DKIM signing should be enabled or disabled.
     *
     * @return The identity for which DKIM signing should be enabled or disabled.
     */
    public String getIdentity() {
        return identity;
    }
    
    /**
     * The identity for which DKIM signing should be enabled or disabled.
     *
     * @param identity The identity for which DKIM signing should be enabled or disabled.
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }
    
    /**
     * The identity for which DKIM signing should be enabled or disabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param identity The identity for which DKIM signing should be enabled or disabled.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetIdentityDkimEnabledRequest withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Sets whether DKIM signing is enabled for an identity. Set to
     * <code>true</code> to enable DKIM signing for this identity;
     * <code>false</code> to disable it.
     *
     * @return Sets whether DKIM signing is enabled for an identity. Set to
     *         <code>true</code> to enable DKIM signing for this identity;
     *         <code>false</code> to disable it.
     */
    public Boolean isDkimEnabled() {
        return dkimEnabled;
    }
    
    /**
     * Sets whether DKIM signing is enabled for an identity. Set to
     * <code>true</code> to enable DKIM signing for this identity;
     * <code>false</code> to disable it.
     *
     * @param dkimEnabled Sets whether DKIM signing is enabled for an identity. Set to
     *         <code>true</code> to enable DKIM signing for this identity;
     *         <code>false</code> to disable it.
     */
    public void setDkimEnabled(Boolean dkimEnabled) {
        this.dkimEnabled = dkimEnabled;
    }
    
    /**
     * Sets whether DKIM signing is enabled for an identity. Set to
     * <code>true</code> to enable DKIM signing for this identity;
     * <code>false</code> to disable it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dkimEnabled Sets whether DKIM signing is enabled for an identity. Set to
     *         <code>true</code> to enable DKIM signing for this identity;
     *         <code>false</code> to disable it.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetIdentityDkimEnabledRequest withDkimEnabled(Boolean dkimEnabled) {
        this.dkimEnabled = dkimEnabled;
        return this;
    }

    /**
     * Sets whether DKIM signing is enabled for an identity. Set to
     * <code>true</code> to enable DKIM signing for this identity;
     * <code>false</code> to disable it.
     *
     * @return Sets whether DKIM signing is enabled for an identity. Set to
     *         <code>true</code> to enable DKIM signing for this identity;
     *         <code>false</code> to disable it.
     */
    public Boolean getDkimEnabled() {
        return dkimEnabled;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentity() != null) sb.append("Identity: " + getIdentity() + ",");
        if (isDkimEnabled() != null) sb.append("DkimEnabled: " + isDkimEnabled() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode()); 
        hashCode = prime * hashCode + ((isDkimEnabled() == null) ? 0 : isDkimEnabled().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetIdentityDkimEnabledRequest == false) return false;
        SetIdentityDkimEnabledRequest other = (SetIdentityDkimEnabledRequest)obj;
        
        if (other.getIdentity() == null ^ this.getIdentity() == null) return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false) return false; 
        if (other.isDkimEnabled() == null ^ this.isDkimEnabled() == null) return false;
        if (other.isDkimEnabled() != null && other.isDkimEnabled().equals(this.isDkimEnabled()) == false) return false; 
        return true;
    }
    
}
    