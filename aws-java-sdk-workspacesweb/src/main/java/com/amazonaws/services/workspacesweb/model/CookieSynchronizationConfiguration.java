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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration that specifies which cookies should be synchronized from the end user's local browser to the remote
 * browser.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CookieSynchronizationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CookieSynchronizationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of cookie specifications that are allowed to be synchronized to the remote browser.
     * </p>
     */
    private java.util.List<CookieSpecification> allowlist;
    /**
     * <p>
     * The list of cookie specifications that are blocked from being synchronized to the remote browser.
     * </p>
     */
    private java.util.List<CookieSpecification> blocklist;

    /**
     * <p>
     * The list of cookie specifications that are allowed to be synchronized to the remote browser.
     * </p>
     * 
     * @return The list of cookie specifications that are allowed to be synchronized to the remote browser.
     */

    public java.util.List<CookieSpecification> getAllowlist() {
        return allowlist;
    }

    /**
     * <p>
     * The list of cookie specifications that are allowed to be synchronized to the remote browser.
     * </p>
     * 
     * @param allowlist
     *        The list of cookie specifications that are allowed to be synchronized to the remote browser.
     */

    public void setAllowlist(java.util.Collection<CookieSpecification> allowlist) {
        if (allowlist == null) {
            this.allowlist = null;
            return;
        }

        this.allowlist = new java.util.ArrayList<CookieSpecification>(allowlist);
    }

    /**
     * <p>
     * The list of cookie specifications that are allowed to be synchronized to the remote browser.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowlist(java.util.Collection)} or {@link #withAllowlist(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param allowlist
     *        The list of cookie specifications that are allowed to be synchronized to the remote browser.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CookieSynchronizationConfiguration withAllowlist(CookieSpecification... allowlist) {
        if (this.allowlist == null) {
            setAllowlist(new java.util.ArrayList<CookieSpecification>(allowlist.length));
        }
        for (CookieSpecification ele : allowlist) {
            this.allowlist.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of cookie specifications that are allowed to be synchronized to the remote browser.
     * </p>
     * 
     * @param allowlist
     *        The list of cookie specifications that are allowed to be synchronized to the remote browser.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CookieSynchronizationConfiguration withAllowlist(java.util.Collection<CookieSpecification> allowlist) {
        setAllowlist(allowlist);
        return this;
    }

    /**
     * <p>
     * The list of cookie specifications that are blocked from being synchronized to the remote browser.
     * </p>
     * 
     * @return The list of cookie specifications that are blocked from being synchronized to the remote browser.
     */

    public java.util.List<CookieSpecification> getBlocklist() {
        return blocklist;
    }

    /**
     * <p>
     * The list of cookie specifications that are blocked from being synchronized to the remote browser.
     * </p>
     * 
     * @param blocklist
     *        The list of cookie specifications that are blocked from being synchronized to the remote browser.
     */

    public void setBlocklist(java.util.Collection<CookieSpecification> blocklist) {
        if (blocklist == null) {
            this.blocklist = null;
            return;
        }

        this.blocklist = new java.util.ArrayList<CookieSpecification>(blocklist);
    }

    /**
     * <p>
     * The list of cookie specifications that are blocked from being synchronized to the remote browser.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlocklist(java.util.Collection)} or {@link #withBlocklist(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param blocklist
     *        The list of cookie specifications that are blocked from being synchronized to the remote browser.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CookieSynchronizationConfiguration withBlocklist(CookieSpecification... blocklist) {
        if (this.blocklist == null) {
            setBlocklist(new java.util.ArrayList<CookieSpecification>(blocklist.length));
        }
        for (CookieSpecification ele : blocklist) {
            this.blocklist.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of cookie specifications that are blocked from being synchronized to the remote browser.
     * </p>
     * 
     * @param blocklist
     *        The list of cookie specifications that are blocked from being synchronized to the remote browser.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CookieSynchronizationConfiguration withBlocklist(java.util.Collection<CookieSpecification> blocklist) {
        setBlocklist(blocklist);
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
        if (getAllowlist() != null)
            sb.append("Allowlist: ").append(getAllowlist()).append(",");
        if (getBlocklist() != null)
            sb.append("Blocklist: ").append(getBlocklist());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CookieSynchronizationConfiguration == false)
            return false;
        CookieSynchronizationConfiguration other = (CookieSynchronizationConfiguration) obj;
        if (other.getAllowlist() == null ^ this.getAllowlist() == null)
            return false;
        if (other.getAllowlist() != null && other.getAllowlist().equals(this.getAllowlist()) == false)
            return false;
        if (other.getBlocklist() == null ^ this.getBlocklist() == null)
            return false;
        if (other.getBlocklist() != null && other.getBlocklist().equals(this.getBlocklist()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowlist() == null) ? 0 : getAllowlist().hashCode());
        hashCode = prime * hashCode + ((getBlocklist() == null) ? 0 : getBlocklist().hashCode());
        return hashCode;
    }

    @Override
    public CookieSynchronizationConfiguration clone() {
        try {
            return (CookieSynchronizationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspacesweb.model.transform.CookieSynchronizationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
