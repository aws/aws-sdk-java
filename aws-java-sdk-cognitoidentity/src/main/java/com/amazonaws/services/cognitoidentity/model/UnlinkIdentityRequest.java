/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Input to the UnlinkIdentity action.
 */
public class UnlinkIdentityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** A unique identifier in the format REGION:GUID. */
    private String identityId;
    /** A set of optional name-value pairs that map provider names to provider tokens. */
    private java.util.Map<String, String> logins;
    /** Provider names to unlink from this identity. */
    private java.util.List<String> loginsToRemove;

    /**
     * A unique identifier in the format REGION:GUID.
     * 
     * @param identityId
     *        A unique identifier in the format REGION:GUID.
     */

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * A unique identifier in the format REGION:GUID.
     * 
     * @return A unique identifier in the format REGION:GUID.
     */

    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * A unique identifier in the format REGION:GUID.
     * 
     * @param identityId
     *        A unique identifier in the format REGION:GUID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnlinkIdentityRequest withIdentityId(String identityId) {
        setIdentityId(identityId);
        return this;
    }

    /**
     * A set of optional name-value pairs that map provider names to provider tokens.
     * 
     * @return A set of optional name-value pairs that map provider names to provider tokens.
     */

    public java.util.Map<String, String> getLogins() {
        return logins;
    }

    /**
     * A set of optional name-value pairs that map provider names to provider tokens.
     * 
     * @param logins
     *        A set of optional name-value pairs that map provider names to provider tokens.
     */

    public void setLogins(java.util.Map<String, String> logins) {
        this.logins = logins;
    }

    /**
     * A set of optional name-value pairs that map provider names to provider tokens.
     * 
     * @param logins
     *        A set of optional name-value pairs that map provider names to provider tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnlinkIdentityRequest withLogins(java.util.Map<String, String> logins) {
        setLogins(logins);
        return this;
    }

    public UnlinkIdentityRequest addLoginsEntry(String key, String value) {
        if (null == this.logins) {
            this.logins = new java.util.HashMap<String, String>();
        }
        if (this.logins.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.logins.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Logins.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnlinkIdentityRequest clearLoginsEntries() {
        this.logins = null;
        return this;
    }

    /**
     * Provider names to unlink from this identity.
     * 
     * @return Provider names to unlink from this identity.
     */

    public java.util.List<String> getLoginsToRemove() {
        return loginsToRemove;
    }

    /**
     * Provider names to unlink from this identity.
     * 
     * @param loginsToRemove
     *        Provider names to unlink from this identity.
     */

    public void setLoginsToRemove(java.util.Collection<String> loginsToRemove) {
        if (loginsToRemove == null) {
            this.loginsToRemove = null;
            return;
        }

        this.loginsToRemove = new java.util.ArrayList<String>(loginsToRemove);
    }

    /**
     * Provider names to unlink from this identity.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoginsToRemove(java.util.Collection)} or {@link #withLoginsToRemove(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param loginsToRemove
     *        Provider names to unlink from this identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnlinkIdentityRequest withLoginsToRemove(String... loginsToRemove) {
        if (this.loginsToRemove == null) {
            setLoginsToRemove(new java.util.ArrayList<String>(loginsToRemove.length));
        }
        for (String ele : loginsToRemove) {
            this.loginsToRemove.add(ele);
        }
        return this;
    }

    /**
     * Provider names to unlink from this identity.
     * 
     * @param loginsToRemove
     *        Provider names to unlink from this identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnlinkIdentityRequest withLoginsToRemove(java.util.Collection<String> loginsToRemove) {
        setLoginsToRemove(loginsToRemove);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityId() != null)
            sb.append("IdentityId: " + getIdentityId() + ",");
        if (getLogins() != null)
            sb.append("Logins: " + getLogins() + ",");
        if (getLoginsToRemove() != null)
            sb.append("LoginsToRemove: " + getLoginsToRemove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnlinkIdentityRequest == false)
            return false;
        UnlinkIdentityRequest other = (UnlinkIdentityRequest) obj;
        if (other.getIdentityId() == null ^ this.getIdentityId() == null)
            return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false)
            return false;
        if (other.getLogins() == null ^ this.getLogins() == null)
            return false;
        if (other.getLogins() != null && other.getLogins().equals(this.getLogins()) == false)
            return false;
        if (other.getLoginsToRemove() == null ^ this.getLoginsToRemove() == null)
            return false;
        if (other.getLoginsToRemove() != null && other.getLoginsToRemove().equals(this.getLoginsToRemove()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        hashCode = prime * hashCode + ((getLogins() == null) ? 0 : getLogins().hashCode());
        hashCode = prime * hashCode + ((getLoginsToRemove() == null) ? 0 : getLoginsToRemove().hashCode());
        return hashCode;
    }

    @Override
    public UnlinkIdentityRequest clone() {
        return (UnlinkIdentityRequest) super.clone();
    }
}
