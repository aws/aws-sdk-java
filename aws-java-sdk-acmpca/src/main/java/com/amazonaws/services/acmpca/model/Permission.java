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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Permissions designate which private CA operations can be performed by an AWS service or entity. In order for ACM to
 * automatically renew private certificates, you must give the ACM service principal all available permissions (
 * <code>IssueCertificate</code>, <code>GetCertificate</code>, and <code>ListPermissions</code>). Permissions can be
 * assigned with the <a>CreatePermission</a> operation, removed with the <a>DeletePermission</a> operation, and listed
 * with the <a>ListPermissions</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/Permission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Permission implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the private CA from which the permission was issued.
     * </p>
     */
    private String certificateAuthorityArn;
    /**
     * <p>
     * The time at which the permission was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The AWS service or entity that holds the permission. At this time, the only valid principal is
     * <code>acm.amazonaws.com</code>.
     * </p>
     */
    private String principal;
    /**
     * <p>
     * The ID of the account that assigned the permission.
     * </p>
     */
    private String sourceAccount;
    /**
     * <p>
     * The private CA operations that can be performed by the designated AWS service.
     * </p>
     */
    private java.util.List<String> actions;
    /**
     * <p>
     * The name of the policy that is associated with the permission.
     * </p>
     */
    private String policy;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the private CA from which the permission was issued.
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Number (ARN) of the private CA from which the permission was issued.
     */

    public void setCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the private CA from which the permission was issued.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the private CA from which the permission was issued.
     */

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the private CA from which the permission was issued.
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Number (ARN) of the private CA from which the permission was issued.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Permission withCertificateAuthorityArn(String certificateAuthorityArn) {
        setCertificateAuthorityArn(certificateAuthorityArn);
        return this;
    }

    /**
     * <p>
     * The time at which the permission was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the permission was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the permission was created.
     * </p>
     * 
     * @return The time at which the permission was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the permission was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the permission was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Permission withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The AWS service or entity that holds the permission. At this time, the only valid principal is
     * <code>acm.amazonaws.com</code>.
     * </p>
     * 
     * @param principal
     *        The AWS service or entity that holds the permission. At this time, the only valid principal is
     *        <code>acm.amazonaws.com</code>.
     */

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The AWS service or entity that holds the permission. At this time, the only valid principal is
     * <code>acm.amazonaws.com</code>.
     * </p>
     * 
     * @return The AWS service or entity that holds the permission. At this time, the only valid principal is
     *         <code>acm.amazonaws.com</code>.
     */

    public String getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The AWS service or entity that holds the permission. At this time, the only valid principal is
     * <code>acm.amazonaws.com</code>.
     * </p>
     * 
     * @param principal
     *        The AWS service or entity that holds the permission. At this time, the only valid principal is
     *        <code>acm.amazonaws.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Permission withPrincipal(String principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * The ID of the account that assigned the permission.
     * </p>
     * 
     * @param sourceAccount
     *        The ID of the account that assigned the permission.
     */

    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    /**
     * <p>
     * The ID of the account that assigned the permission.
     * </p>
     * 
     * @return The ID of the account that assigned the permission.
     */

    public String getSourceAccount() {
        return this.sourceAccount;
    }

    /**
     * <p>
     * The ID of the account that assigned the permission.
     * </p>
     * 
     * @param sourceAccount
     *        The ID of the account that assigned the permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Permission withSourceAccount(String sourceAccount) {
        setSourceAccount(sourceAccount);
        return this;
    }

    /**
     * <p>
     * The private CA operations that can be performed by the designated AWS service.
     * </p>
     * 
     * @return The private CA operations that can be performed by the designated AWS service.
     * @see ActionType
     */

    public java.util.List<String> getActions() {
        return actions;
    }

    /**
     * <p>
     * The private CA operations that can be performed by the designated AWS service.
     * </p>
     * 
     * @param actions
     *        The private CA operations that can be performed by the designated AWS service.
     * @see ActionType
     */

    public void setActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<String>(actions);
    }

    /**
     * <p>
     * The private CA operations that can be performed by the designated AWS service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The private CA operations that can be performed by the designated AWS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public Permission withActions(String... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<String>(actions.length));
        }
        for (String ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The private CA operations that can be performed by the designated AWS service.
     * </p>
     * 
     * @param actions
     *        The private CA operations that can be performed by the designated AWS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public Permission withActions(java.util.Collection<String> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The private CA operations that can be performed by the designated AWS service.
     * </p>
     * 
     * @param actions
     *        The private CA operations that can be performed by the designated AWS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public Permission withActions(ActionType... actions) {
        java.util.ArrayList<String> actionsCopy = new java.util.ArrayList<String>(actions.length);
        for (ActionType value : actions) {
            actionsCopy.add(value.toString());
        }
        if (getActions() == null) {
            setActions(actionsCopy);
        } else {
            getActions().addAll(actionsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The name of the policy that is associated with the permission.
     * </p>
     * 
     * @param policy
     *        The name of the policy that is associated with the permission.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The name of the policy that is associated with the permission.
     * </p>
     * 
     * @return The name of the policy that is associated with the permission.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The name of the policy that is associated with the permission.
     * </p>
     * 
     * @param policy
     *        The name of the policy that is associated with the permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Permission withPolicy(String policy) {
        setPolicy(policy);
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
        if (getCertificateAuthorityArn() != null)
            sb.append("CertificateAuthorityArn: ").append(getCertificateAuthorityArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getSourceAccount() != null)
            sb.append("SourceAccount: ").append(getSourceAccount()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Permission == false)
            return false;
        Permission other = (Permission) obj;
        if (other.getCertificateAuthorityArn() == null ^ this.getCertificateAuthorityArn() == null)
            return false;
        if (other.getCertificateAuthorityArn() != null && other.getCertificateAuthorityArn().equals(this.getCertificateAuthorityArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getSourceAccount() == null ^ this.getSourceAccount() == null)
            return false;
        if (other.getSourceAccount() != null && other.getSourceAccount().equals(this.getSourceAccount()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getSourceAccount() == null) ? 0 : getSourceAccount().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public Permission clone() {
        try {
            return (Permission) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.PermissionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
