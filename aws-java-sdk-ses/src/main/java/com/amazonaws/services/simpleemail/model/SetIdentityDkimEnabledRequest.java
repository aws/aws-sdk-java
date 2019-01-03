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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to enable or disable Amazon SES Easy DKIM signing for an identity. For more information about
 * setting up Easy DKIM, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Amazon
 * SES Developer Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityDkimEnabled" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetIdentityDkimEnabledRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identity for which DKIM signing should be enabled or disabled.
     * </p>
     */
    private String identity;
    /**
     * <p>
     * Sets whether DKIM signing is enabled for an identity. Set to <code>true</code> to enable DKIM signing for this
     * identity; <code>false</code> to disable it.
     * </p>
     */
    private Boolean dkimEnabled;

    /**
     * <p>
     * The identity for which DKIM signing should be enabled or disabled.
     * </p>
     * 
     * @param identity
     *        The identity for which DKIM signing should be enabled or disabled.
     */

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * The identity for which DKIM signing should be enabled or disabled.
     * </p>
     * 
     * @return The identity for which DKIM signing should be enabled or disabled.
     */

    public String getIdentity() {
        return this.identity;
    }

    /**
     * <p>
     * The identity for which DKIM signing should be enabled or disabled.
     * </p>
     * 
     * @param identity
     *        The identity for which DKIM signing should be enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetIdentityDkimEnabledRequest withIdentity(String identity) {
        setIdentity(identity);
        return this;
    }

    /**
     * <p>
     * Sets whether DKIM signing is enabled for an identity. Set to <code>true</code> to enable DKIM signing for this
     * identity; <code>false</code> to disable it.
     * </p>
     * 
     * @param dkimEnabled
     *        Sets whether DKIM signing is enabled for an identity. Set to <code>true</code> to enable DKIM signing for
     *        this identity; <code>false</code> to disable it.
     */

    public void setDkimEnabled(Boolean dkimEnabled) {
        this.dkimEnabled = dkimEnabled;
    }

    /**
     * <p>
     * Sets whether DKIM signing is enabled for an identity. Set to <code>true</code> to enable DKIM signing for this
     * identity; <code>false</code> to disable it.
     * </p>
     * 
     * @return Sets whether DKIM signing is enabled for an identity. Set to <code>true</code> to enable DKIM signing for
     *         this identity; <code>false</code> to disable it.
     */

    public Boolean getDkimEnabled() {
        return this.dkimEnabled;
    }

    /**
     * <p>
     * Sets whether DKIM signing is enabled for an identity. Set to <code>true</code> to enable DKIM signing for this
     * identity; <code>false</code> to disable it.
     * </p>
     * 
     * @param dkimEnabled
     *        Sets whether DKIM signing is enabled for an identity. Set to <code>true</code> to enable DKIM signing for
     *        this identity; <code>false</code> to disable it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetIdentityDkimEnabledRequest withDkimEnabled(Boolean dkimEnabled) {
        setDkimEnabled(dkimEnabled);
        return this;
    }

    /**
     * <p>
     * Sets whether DKIM signing is enabled for an identity. Set to <code>true</code> to enable DKIM signing for this
     * identity; <code>false</code> to disable it.
     * </p>
     * 
     * @return Sets whether DKIM signing is enabled for an identity. Set to <code>true</code> to enable DKIM signing for
     *         this identity; <code>false</code> to disable it.
     */

    public Boolean isDkimEnabled() {
        return this.dkimEnabled;
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
        if (getIdentity() != null)
            sb.append("Identity: ").append(getIdentity()).append(",");
        if (getDkimEnabled() != null)
            sb.append("DkimEnabled: ").append(getDkimEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetIdentityDkimEnabledRequest == false)
            return false;
        SetIdentityDkimEnabledRequest other = (SetIdentityDkimEnabledRequest) obj;
        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
            return false;
        if (other.getDkimEnabled() == null ^ this.getDkimEnabled() == null)
            return false;
        if (other.getDkimEnabled() != null && other.getDkimEnabled().equals(this.getDkimEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        hashCode = prime * hashCode + ((getDkimEnabled() == null) ? 0 : getDkimEnabled().hashCode());
        return hashCode;
    }

    @Override
    public SetIdentityDkimEnabledRequest clone() {
        return (SetIdentityDkimEnabledRequest) super.clone();
    }

}
