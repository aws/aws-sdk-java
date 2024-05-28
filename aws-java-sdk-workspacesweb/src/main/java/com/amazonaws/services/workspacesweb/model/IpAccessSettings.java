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
 * The IP access settings resource that can be associated with a web portal.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/IpAccessSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpAccessSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The additional encryption context of the IP access settings.
     * </p>
     */
    private java.util.Map<String, String> additionalEncryptionContext;
    /**
     * <p>
     * A list of web portal ARNs that this IP access settings resource is associated with.
     * </p>
     */
    private java.util.List<String> associatedPortalArns;
    /**
     * <p>
     * The creation date timestamp of the IP access settings.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The customer managed key used to encrypt sensitive information in the IP access settings.
     * </p>
     */
    private String customerManagedKey;
    /**
     * <p>
     * The description of the IP access settings.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The display name of the IP access settings.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The ARN of the IP access settings resource.
     * </p>
     */
    private String ipAccessSettingsArn;
    /**
     * <p>
     * The IP rules of the IP access settings.
     * </p>
     */
    private java.util.List<IpRule> ipRules;

    /**
     * <p>
     * The additional encryption context of the IP access settings.
     * </p>
     * 
     * @return The additional encryption context of the IP access settings.
     */

    public java.util.Map<String, String> getAdditionalEncryptionContext() {
        return additionalEncryptionContext;
    }

    /**
     * <p>
     * The additional encryption context of the IP access settings.
     * </p>
     * 
     * @param additionalEncryptionContext
     *        The additional encryption context of the IP access settings.
     */

    public void setAdditionalEncryptionContext(java.util.Map<String, String> additionalEncryptionContext) {
        this.additionalEncryptionContext = additionalEncryptionContext;
    }

    /**
     * <p>
     * The additional encryption context of the IP access settings.
     * </p>
     * 
     * @param additionalEncryptionContext
     *        The additional encryption context of the IP access settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAccessSettings withAdditionalEncryptionContext(java.util.Map<String, String> additionalEncryptionContext) {
        setAdditionalEncryptionContext(additionalEncryptionContext);
        return this;
    }

    /**
     * Add a single AdditionalEncryptionContext entry
     *
     * @see IpAccessSettings#withAdditionalEncryptionContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public IpAccessSettings addAdditionalEncryptionContextEntry(String key, String value) {
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

    public IpAccessSettings clearAdditionalEncryptionContextEntries() {
        this.additionalEncryptionContext = null;
        return this;
    }

    /**
     * <p>
     * A list of web portal ARNs that this IP access settings resource is associated with.
     * </p>
     * 
     * @return A list of web portal ARNs that this IP access settings resource is associated with.
     */

    public java.util.List<String> getAssociatedPortalArns() {
        return associatedPortalArns;
    }

    /**
     * <p>
     * A list of web portal ARNs that this IP access settings resource is associated with.
     * </p>
     * 
     * @param associatedPortalArns
     *        A list of web portal ARNs that this IP access settings resource is associated with.
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
     * A list of web portal ARNs that this IP access settings resource is associated with.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedPortalArns(java.util.Collection)} or {@link #withAssociatedPortalArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param associatedPortalArns
     *        A list of web portal ARNs that this IP access settings resource is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAccessSettings withAssociatedPortalArns(String... associatedPortalArns) {
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
     * A list of web portal ARNs that this IP access settings resource is associated with.
     * </p>
     * 
     * @param associatedPortalArns
     *        A list of web portal ARNs that this IP access settings resource is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAccessSettings withAssociatedPortalArns(java.util.Collection<String> associatedPortalArns) {
        setAssociatedPortalArns(associatedPortalArns);
        return this;
    }

    /**
     * <p>
     * The creation date timestamp of the IP access settings.
     * </p>
     * 
     * @param creationDate
     *        The creation date timestamp of the IP access settings.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date timestamp of the IP access settings.
     * </p>
     * 
     * @return The creation date timestamp of the IP access settings.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The creation date timestamp of the IP access settings.
     * </p>
     * 
     * @param creationDate
     *        The creation date timestamp of the IP access settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAccessSettings withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The customer managed key used to encrypt sensitive information in the IP access settings.
     * </p>
     * 
     * @param customerManagedKey
     *        The customer managed key used to encrypt sensitive information in the IP access settings.
     */

    public void setCustomerManagedKey(String customerManagedKey) {
        this.customerManagedKey = customerManagedKey;
    }

    /**
     * <p>
     * The customer managed key used to encrypt sensitive information in the IP access settings.
     * </p>
     * 
     * @return The customer managed key used to encrypt sensitive information in the IP access settings.
     */

    public String getCustomerManagedKey() {
        return this.customerManagedKey;
    }

    /**
     * <p>
     * The customer managed key used to encrypt sensitive information in the IP access settings.
     * </p>
     * 
     * @param customerManagedKey
     *        The customer managed key used to encrypt sensitive information in the IP access settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAccessSettings withCustomerManagedKey(String customerManagedKey) {
        setCustomerManagedKey(customerManagedKey);
        return this;
    }

    /**
     * <p>
     * The description of the IP access settings.
     * </p>
     * 
     * @param description
     *        The description of the IP access settings.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the IP access settings.
     * </p>
     * 
     * @return The description of the IP access settings.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the IP access settings.
     * </p>
     * 
     * @param description
     *        The description of the IP access settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAccessSettings withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The display name of the IP access settings.
     * </p>
     * 
     * @param displayName
     *        The display name of the IP access settings.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the IP access settings.
     * </p>
     * 
     * @return The display name of the IP access settings.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the IP access settings.
     * </p>
     * 
     * @param displayName
     *        The display name of the IP access settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAccessSettings withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The ARN of the IP access settings resource.
     * </p>
     * 
     * @param ipAccessSettingsArn
     *        The ARN of the IP access settings resource.
     */

    public void setIpAccessSettingsArn(String ipAccessSettingsArn) {
        this.ipAccessSettingsArn = ipAccessSettingsArn;
    }

    /**
     * <p>
     * The ARN of the IP access settings resource.
     * </p>
     * 
     * @return The ARN of the IP access settings resource.
     */

    public String getIpAccessSettingsArn() {
        return this.ipAccessSettingsArn;
    }

    /**
     * <p>
     * The ARN of the IP access settings resource.
     * </p>
     * 
     * @param ipAccessSettingsArn
     *        The ARN of the IP access settings resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAccessSettings withIpAccessSettingsArn(String ipAccessSettingsArn) {
        setIpAccessSettingsArn(ipAccessSettingsArn);
        return this;
    }

    /**
     * <p>
     * The IP rules of the IP access settings.
     * </p>
     * 
     * @return The IP rules of the IP access settings.
     */

    public java.util.List<IpRule> getIpRules() {
        return ipRules;
    }

    /**
     * <p>
     * The IP rules of the IP access settings.
     * </p>
     * 
     * @param ipRules
     *        The IP rules of the IP access settings.
     */

    public void setIpRules(java.util.Collection<IpRule> ipRules) {
        if (ipRules == null) {
            this.ipRules = null;
            return;
        }

        this.ipRules = new java.util.ArrayList<IpRule>(ipRules);
    }

    /**
     * <p>
     * The IP rules of the IP access settings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpRules(java.util.Collection)} or {@link #withIpRules(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param ipRules
     *        The IP rules of the IP access settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAccessSettings withIpRules(IpRule... ipRules) {
        if (this.ipRules == null) {
            setIpRules(new java.util.ArrayList<IpRule>(ipRules.length));
        }
        for (IpRule ele : ipRules) {
            this.ipRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP rules of the IP access settings.
     * </p>
     * 
     * @param ipRules
     *        The IP rules of the IP access settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAccessSettings withIpRules(java.util.Collection<IpRule> ipRules) {
        setIpRules(ipRules);
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
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getCustomerManagedKey() != null)
            sb.append("CustomerManagedKey: ").append(getCustomerManagedKey()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append("***Sensitive Data Redacted***").append(",");
        if (getIpAccessSettingsArn() != null)
            sb.append("IpAccessSettingsArn: ").append(getIpAccessSettingsArn()).append(",");
        if (getIpRules() != null)
            sb.append("IpRules: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpAccessSettings == false)
            return false;
        IpAccessSettings other = (IpAccessSettings) obj;
        if (other.getAdditionalEncryptionContext() == null ^ this.getAdditionalEncryptionContext() == null)
            return false;
        if (other.getAdditionalEncryptionContext() != null && other.getAdditionalEncryptionContext().equals(this.getAdditionalEncryptionContext()) == false)
            return false;
        if (other.getAssociatedPortalArns() == null ^ this.getAssociatedPortalArns() == null)
            return false;
        if (other.getAssociatedPortalArns() != null && other.getAssociatedPortalArns().equals(this.getAssociatedPortalArns()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getCustomerManagedKey() == null ^ this.getCustomerManagedKey() == null)
            return false;
        if (other.getCustomerManagedKey() != null && other.getCustomerManagedKey().equals(this.getCustomerManagedKey()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getIpAccessSettingsArn() == null ^ this.getIpAccessSettingsArn() == null)
            return false;
        if (other.getIpAccessSettingsArn() != null && other.getIpAccessSettingsArn().equals(this.getIpAccessSettingsArn()) == false)
            return false;
        if (other.getIpRules() == null ^ this.getIpRules() == null)
            return false;
        if (other.getIpRules() != null && other.getIpRules().equals(this.getIpRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdditionalEncryptionContext() == null) ? 0 : getAdditionalEncryptionContext().hashCode());
        hashCode = prime * hashCode + ((getAssociatedPortalArns() == null) ? 0 : getAssociatedPortalArns().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getCustomerManagedKey() == null) ? 0 : getCustomerManagedKey().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getIpAccessSettingsArn() == null) ? 0 : getIpAccessSettingsArn().hashCode());
        hashCode = prime * hashCode + ((getIpRules() == null) ? 0 : getIpRules().hashCode());
        return hashCode;
    }

    @Override
    public IpAccessSettings clone() {
        try {
            return (IpAccessSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspacesweb.model.transform.IpAccessSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
