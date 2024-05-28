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
 * The browser settings resource that can be associated with a web portal. Once associated with a web portal, browser
 * settings control how the browser will behave once a user starts a streaming session for the web portal.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/BrowserSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BrowserSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The additional encryption context of the browser settings.
     * </p>
     */
    private java.util.Map<String, String> additionalEncryptionContext;
    /**
     * <p>
     * A list of web portal ARNs that this browser settings is associated with.
     * </p>
     */
    private java.util.List<String> associatedPortalArns;
    /**
     * <p>
     * A JSON string containing Chrome Enterprise policies that will be applied to all streaming sessions.
     * </p>
     */
    private String browserPolicy;
    /**
     * <p>
     * The ARN of the browser settings.
     * </p>
     */
    private String browserSettingsArn;
    /**
     * <p>
     * The customer managed key used to encrypt sensitive information in the browser settings.
     * </p>
     */
    private String customerManagedKey;

    /**
     * <p>
     * The additional encryption context of the browser settings.
     * </p>
     * 
     * @return The additional encryption context of the browser settings.
     */

    public java.util.Map<String, String> getAdditionalEncryptionContext() {
        return additionalEncryptionContext;
    }

    /**
     * <p>
     * The additional encryption context of the browser settings.
     * </p>
     * 
     * @param additionalEncryptionContext
     *        The additional encryption context of the browser settings.
     */

    public void setAdditionalEncryptionContext(java.util.Map<String, String> additionalEncryptionContext) {
        this.additionalEncryptionContext = additionalEncryptionContext;
    }

    /**
     * <p>
     * The additional encryption context of the browser settings.
     * </p>
     * 
     * @param additionalEncryptionContext
     *        The additional encryption context of the browser settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrowserSettings withAdditionalEncryptionContext(java.util.Map<String, String> additionalEncryptionContext) {
        setAdditionalEncryptionContext(additionalEncryptionContext);
        return this;
    }

    /**
     * Add a single AdditionalEncryptionContext entry
     *
     * @see BrowserSettings#withAdditionalEncryptionContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public BrowserSettings addAdditionalEncryptionContextEntry(String key, String value) {
        if (null == this.additionalEncryptionContext) {
            this.additionalEncryptionContext = new java.util.HashMap<String, String>();
        }
        if (this.additionalEncryptionContext.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.additionalEncryptionContext.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalEncryptionContext.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrowserSettings clearAdditionalEncryptionContextEntries() {
        this.additionalEncryptionContext = null;
        return this;
    }

    /**
     * <p>
     * A list of web portal ARNs that this browser settings is associated with.
     * </p>
     * 
     * @return A list of web portal ARNs that this browser settings is associated with.
     */

    public java.util.List<String> getAssociatedPortalArns() {
        return associatedPortalArns;
    }

    /**
     * <p>
     * A list of web portal ARNs that this browser settings is associated with.
     * </p>
     * 
     * @param associatedPortalArns
     *        A list of web portal ARNs that this browser settings is associated with.
     */

    public void setAssociatedPortalArns(java.util.Collection<String> associatedPortalArns) {
        if (associatedPortalArns == null) {
            this.associatedPortalArns = null;
            return;
        }

        this.associatedPortalArns = new java.util.ArrayList<String>(associatedPortalArns);
    }

    /**
     * <p>
     * A list of web portal ARNs that this browser settings is associated with.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedPortalArns(java.util.Collection)} or {@link #withAssociatedPortalArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param associatedPortalArns
     *        A list of web portal ARNs that this browser settings is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrowserSettings withAssociatedPortalArns(String... associatedPortalArns) {
        if (this.associatedPortalArns == null) {
            setAssociatedPortalArns(new java.util.ArrayList<String>(associatedPortalArns.length));
        }
        for (String ele : associatedPortalArns) {
            this.associatedPortalArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of web portal ARNs that this browser settings is associated with.
     * </p>
     * 
     * @param associatedPortalArns
     *        A list of web portal ARNs that this browser settings is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrowserSettings withAssociatedPortalArns(java.util.Collection<String> associatedPortalArns) {
        setAssociatedPortalArns(associatedPortalArns);
        return this;
    }

    /**
     * <p>
     * A JSON string containing Chrome Enterprise policies that will be applied to all streaming sessions.
     * </p>
     * 
     * @param browserPolicy
     *        A JSON string containing Chrome Enterprise policies that will be applied to all streaming sessions.
     */

    public void setBrowserPolicy(String browserPolicy) {
        this.browserPolicy = browserPolicy;
    }

    /**
     * <p>
     * A JSON string containing Chrome Enterprise policies that will be applied to all streaming sessions.
     * </p>
     * 
     * @return A JSON string containing Chrome Enterprise policies that will be applied to all streaming sessions.
     */

    public String getBrowserPolicy() {
        return this.browserPolicy;
    }

    /**
     * <p>
     * A JSON string containing Chrome Enterprise policies that will be applied to all streaming sessions.
     * </p>
     * 
     * @param browserPolicy
     *        A JSON string containing Chrome Enterprise policies that will be applied to all streaming sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrowserSettings withBrowserPolicy(String browserPolicy) {
        setBrowserPolicy(browserPolicy);
        return this;
    }

    /**
     * <p>
     * The ARN of the browser settings.
     * </p>
     * 
     * @param browserSettingsArn
     *        The ARN of the browser settings.
     */

    public void setBrowserSettingsArn(String browserSettingsArn) {
        this.browserSettingsArn = browserSettingsArn;
    }

    /**
     * <p>
     * The ARN of the browser settings.
     * </p>
     * 
     * @return The ARN of the browser settings.
     */

    public String getBrowserSettingsArn() {
        return this.browserSettingsArn;
    }

    /**
     * <p>
     * The ARN of the browser settings.
     * </p>
     * 
     * @param browserSettingsArn
     *        The ARN of the browser settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrowserSettings withBrowserSettingsArn(String browserSettingsArn) {
        setBrowserSettingsArn(browserSettingsArn);
        return this;
    }

    /**
     * <p>
     * The customer managed key used to encrypt sensitive information in the browser settings.
     * </p>
     * 
     * @param customerManagedKey
     *        The customer managed key used to encrypt sensitive information in the browser settings.
     */

    public void setCustomerManagedKey(String customerManagedKey) {
        this.customerManagedKey = customerManagedKey;
    }

    /**
     * <p>
     * The customer managed key used to encrypt sensitive information in the browser settings.
     * </p>
     * 
     * @return The customer managed key used to encrypt sensitive information in the browser settings.
     */

    public String getCustomerManagedKey() {
        return this.customerManagedKey;
    }

    /**
     * <p>
     * The customer managed key used to encrypt sensitive information in the browser settings.
     * </p>
     * 
     * @param customerManagedKey
     *        The customer managed key used to encrypt sensitive information in the browser settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrowserSettings withCustomerManagedKey(String customerManagedKey) {
        setCustomerManagedKey(customerManagedKey);
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
        if (getAdditionalEncryptionContext() != null)
            sb.append("AdditionalEncryptionContext: ").append(getAdditionalEncryptionContext()).append(",");
        if (getAssociatedPortalArns() != null)
            sb.append("AssociatedPortalArns: ").append(getAssociatedPortalArns()).append(",");
        if (getBrowserPolicy() != null)
            sb.append("BrowserPolicy: ").append("***Sensitive Data Redacted***").append(",");
        if (getBrowserSettingsArn() != null)
            sb.append("BrowserSettingsArn: ").append(getBrowserSettingsArn()).append(",");
        if (getCustomerManagedKey() != null)
            sb.append("CustomerManagedKey: ").append(getCustomerManagedKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BrowserSettings == false)
            return false;
        BrowserSettings other = (BrowserSettings) obj;
        if (other.getAdditionalEncryptionContext() == null ^ this.getAdditionalEncryptionContext() == null)
            return false;
        if (other.getAdditionalEncryptionContext() != null && other.getAdditionalEncryptionContext().equals(this.getAdditionalEncryptionContext()) == false)
            return false;
        if (other.getAssociatedPortalArns() == null ^ this.getAssociatedPortalArns() == null)
            return false;
        if (other.getAssociatedPortalArns() != null && other.getAssociatedPortalArns().equals(this.getAssociatedPortalArns()) == false)
            return false;
        if (other.getBrowserPolicy() == null ^ this.getBrowserPolicy() == null)
            return false;
        if (other.getBrowserPolicy() != null && other.getBrowserPolicy().equals(this.getBrowserPolicy()) == false)
            return false;
        if (other.getBrowserSettingsArn() == null ^ this.getBrowserSettingsArn() == null)
            return false;
        if (other.getBrowserSettingsArn() != null && other.getBrowserSettingsArn().equals(this.getBrowserSettingsArn()) == false)
            return false;
        if (other.getCustomerManagedKey() == null ^ this.getCustomerManagedKey() == null)
            return false;
        if (other.getCustomerManagedKey() != null && other.getCustomerManagedKey().equals(this.getCustomerManagedKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdditionalEncryptionContext() == null) ? 0 : getAdditionalEncryptionContext().hashCode());
        hashCode = prime * hashCode + ((getAssociatedPortalArns() == null) ? 0 : getAssociatedPortalArns().hashCode());
        hashCode = prime * hashCode + ((getBrowserPolicy() == null) ? 0 : getBrowserPolicy().hashCode());
        hashCode = prime * hashCode + ((getBrowserSettingsArn() == null) ? 0 : getBrowserSettingsArn().hashCode());
        hashCode = prime * hashCode + ((getCustomerManagedKey() == null) ? 0 : getCustomerManagedKey().hashCode());
        return hashCode;
    }

    @Override
    public BrowserSettings clone() {
        try {
            return (BrowserSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspacesweb.model.transform.BrowserSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
