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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CreatePermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CA that grants the permissions. You can find the ARN by calling the
     * <a>ListCertificateAuthorities</a> operation. This must have the following form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * .
     * </p>
     */
    private String certificateAuthorityArn;
    /**
     * <p>
     * The AWS service or identity that receives the permission. At this time, the only valid principal is
     * <code>acm.amazonaws.com</code>.
     * </p>
     */
    private String principal;
    /**
     * <p>
     * The ID of the calling account.
     * </p>
     */
    private String sourceAccount;
    /**
     * <p>
     * The actions that the specified AWS service principal can use. These include <code>IssueCertificate</code>,
     * <code>GetCertificate</code>, and <code>ListPermissions</code>.
     * </p>
     */
    private java.util.List<String> actions;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CA that grants the permissions. You can find the ARN by calling the
     * <a>ListCertificateAuthorities</a> operation. This must have the following form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * .
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) of the CA that grants the permissions. You can find the ARN by calling the
     *        <a>ListCertificateAuthorities</a> operation. This must have the following form: </p>
     *        <p>
     *        <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>.
     */

    public void setCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CA that grants the permissions. You can find the ARN by calling the
     * <a>ListCertificateAuthorities</a> operation. This must have the following form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * .
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the CA that grants the permissions. You can find the ARN by calling the
     *         <a>ListCertificateAuthorities</a> operation. This must have the following form: </p>
     *         <p>
     *         <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>.
     */

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CA that grants the permissions. You can find the ARN by calling the
     * <a>ListCertificateAuthorities</a> operation. This must have the following form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * .
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) of the CA that grants the permissions. You can find the ARN by calling the
     *        <a>ListCertificateAuthorities</a> operation. This must have the following form: </p>
     *        <p>
     *        <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePermissionRequest withCertificateAuthorityArn(String certificateAuthorityArn) {
        setCertificateAuthorityArn(certificateAuthorityArn);
        return this;
    }

    /**
     * <p>
     * The AWS service or identity that receives the permission. At this time, the only valid principal is
     * <code>acm.amazonaws.com</code>.
     * </p>
     * 
     * @param principal
     *        The AWS service or identity that receives the permission. At this time, the only valid principal is
     *        <code>acm.amazonaws.com</code>.
     */

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The AWS service or identity that receives the permission. At this time, the only valid principal is
     * <code>acm.amazonaws.com</code>.
     * </p>
     * 
     * @return The AWS service or identity that receives the permission. At this time, the only valid principal is
     *         <code>acm.amazonaws.com</code>.
     */

    public String getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The AWS service or identity that receives the permission. At this time, the only valid principal is
     * <code>acm.amazonaws.com</code>.
     * </p>
     * 
     * @param principal
     *        The AWS service or identity that receives the permission. At this time, the only valid principal is
     *        <code>acm.amazonaws.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePermissionRequest withPrincipal(String principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * The ID of the calling account.
     * </p>
     * 
     * @param sourceAccount
     *        The ID of the calling account.
     */

    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    /**
     * <p>
     * The ID of the calling account.
     * </p>
     * 
     * @return The ID of the calling account.
     */

    public String getSourceAccount() {
        return this.sourceAccount;
    }

    /**
     * <p>
     * The ID of the calling account.
     * </p>
     * 
     * @param sourceAccount
     *        The ID of the calling account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePermissionRequest withSourceAccount(String sourceAccount) {
        setSourceAccount(sourceAccount);
        return this;
    }

    /**
     * <p>
     * The actions that the specified AWS service principal can use. These include <code>IssueCertificate</code>,
     * <code>GetCertificate</code>, and <code>ListPermissions</code>.
     * </p>
     * 
     * @return The actions that the specified AWS service principal can use. These include <code>IssueCertificate</code>
     *         , <code>GetCertificate</code>, and <code>ListPermissions</code>.
     * @see ActionType
     */

    public java.util.List<String> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions that the specified AWS service principal can use. These include <code>IssueCertificate</code>,
     * <code>GetCertificate</code>, and <code>ListPermissions</code>.
     * </p>
     * 
     * @param actions
     *        The actions that the specified AWS service principal can use. These include <code>IssueCertificate</code>,
     *        <code>GetCertificate</code>, and <code>ListPermissions</code>.
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
     * The actions that the specified AWS service principal can use. These include <code>IssueCertificate</code>,
     * <code>GetCertificate</code>, and <code>ListPermissions</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The actions that the specified AWS service principal can use. These include <code>IssueCertificate</code>,
     *        <code>GetCertificate</code>, and <code>ListPermissions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public CreatePermissionRequest withActions(String... actions) {
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
     * The actions that the specified AWS service principal can use. These include <code>IssueCertificate</code>,
     * <code>GetCertificate</code>, and <code>ListPermissions</code>.
     * </p>
     * 
     * @param actions
     *        The actions that the specified AWS service principal can use. These include <code>IssueCertificate</code>,
     *        <code>GetCertificate</code>, and <code>ListPermissions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public CreatePermissionRequest withActions(java.util.Collection<String> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The actions that the specified AWS service principal can use. These include <code>IssueCertificate</code>,
     * <code>GetCertificate</code>, and <code>ListPermissions</code>.
     * </p>
     * 
     * @param actions
     *        The actions that the specified AWS service principal can use. These include <code>IssueCertificate</code>,
     *        <code>GetCertificate</code>, and <code>ListPermissions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public CreatePermissionRequest withActions(ActionType... actions) {
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
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getSourceAccount() != null)
            sb.append("SourceAccount: ").append(getSourceAccount()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePermissionRequest == false)
            return false;
        CreatePermissionRequest other = (CreatePermissionRequest) obj;
        if (other.getCertificateAuthorityArn() == null ^ this.getCertificateAuthorityArn() == null)
            return false;
        if (other.getCertificateAuthorityArn() != null && other.getCertificateAuthorityArn().equals(this.getCertificateAuthorityArn()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getSourceAccount() == null) ? 0 : getSourceAccount().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        return hashCode;
    }

    @Override
    public CreatePermissionRequest clone() {
        return (CreatePermissionRequest) super.clone();
    }

}
