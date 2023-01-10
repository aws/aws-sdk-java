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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdatePortal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePortalRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of authentication integration points used when signing into the web portal. Defaults to
     * <code>Standard</code>.
     * </p>
     * <p>
     * <code>Standard</code> web portals are authenticated directly through your identity provider. You need to call
     * <code>CreateIdentityProvider</code> to integrate your identity provider with your web portal. User and group
     * access to your web portal is controlled through your identity provider.
     * </p>
     * <p>
     * <code>IAM_Identity_Center</code> web portals are authenticated through AWS IAM Identity Center (successor to AWS
     * Single Sign-On). They provide additional features, such as IdP-initiated authentication. Identity sources
     * (including external identity provider integration), plus user and group access to your web portal, can be
     * configured in the IAM Identity Center.
     * </p>
     */
    private String authenticationType;
    /**
     * <p>
     * The name of the web portal. This is not visible to users who log into the web portal.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The ARN of the web portal.
     * </p>
     */
    private String portalArn;

    /**
     * <p>
     * The type of authentication integration points used when signing into the web portal. Defaults to
     * <code>Standard</code>.
     * </p>
     * <p>
     * <code>Standard</code> web portals are authenticated directly through your identity provider. You need to call
     * <code>CreateIdentityProvider</code> to integrate your identity provider with your web portal. User and group
     * access to your web portal is controlled through your identity provider.
     * </p>
     * <p>
     * <code>IAM_Identity_Center</code> web portals are authenticated through AWS IAM Identity Center (successor to AWS
     * Single Sign-On). They provide additional features, such as IdP-initiated authentication. Identity sources
     * (including external identity provider integration), plus user and group access to your web portal, can be
     * configured in the IAM Identity Center.
     * </p>
     * 
     * @param authenticationType
     *        The type of authentication integration points used when signing into the web portal. Defaults to
     *        <code>Standard</code>.</p>
     *        <p>
     *        <code>Standard</code> web portals are authenticated directly through your identity provider. You need to
     *        call <code>CreateIdentityProvider</code> to integrate your identity provider with your web portal. User
     *        and group access to your web portal is controlled through your identity provider.
     *        </p>
     *        <p>
     *        <code>IAM_Identity_Center</code> web portals are authenticated through AWS IAM Identity Center (successor
     *        to AWS Single Sign-On). They provide additional features, such as IdP-initiated authentication. Identity
     *        sources (including external identity provider integration), plus user and group access to your web portal,
     *        can be configured in the IAM Identity Center.
     * @see AuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * The type of authentication integration points used when signing into the web portal. Defaults to
     * <code>Standard</code>.
     * </p>
     * <p>
     * <code>Standard</code> web portals are authenticated directly through your identity provider. You need to call
     * <code>CreateIdentityProvider</code> to integrate your identity provider with your web portal. User and group
     * access to your web portal is controlled through your identity provider.
     * </p>
     * <p>
     * <code>IAM_Identity_Center</code> web portals are authenticated through AWS IAM Identity Center (successor to AWS
     * Single Sign-On). They provide additional features, such as IdP-initiated authentication. Identity sources
     * (including external identity provider integration), plus user and group access to your web portal, can be
     * configured in the IAM Identity Center.
     * </p>
     * 
     * @return The type of authentication integration points used when signing into the web portal. Defaults to
     *         <code>Standard</code>.</p>
     *         <p>
     *         <code>Standard</code> web portals are authenticated directly through your identity provider. You need to
     *         call <code>CreateIdentityProvider</code> to integrate your identity provider with your web portal. User
     *         and group access to your web portal is controlled through your identity provider.
     *         </p>
     *         <p>
     *         <code>IAM_Identity_Center</code> web portals are authenticated through AWS IAM Identity Center (successor
     *         to AWS Single Sign-On). They provide additional features, such as IdP-initiated authentication. Identity
     *         sources (including external identity provider integration), plus user and group access to your web
     *         portal, can be configured in the IAM Identity Center.
     * @see AuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * The type of authentication integration points used when signing into the web portal. Defaults to
     * <code>Standard</code>.
     * </p>
     * <p>
     * <code>Standard</code> web portals are authenticated directly through your identity provider. You need to call
     * <code>CreateIdentityProvider</code> to integrate your identity provider with your web portal. User and group
     * access to your web portal is controlled through your identity provider.
     * </p>
     * <p>
     * <code>IAM_Identity_Center</code> web portals are authenticated through AWS IAM Identity Center (successor to AWS
     * Single Sign-On). They provide additional features, such as IdP-initiated authentication. Identity sources
     * (including external identity provider integration), plus user and group access to your web portal, can be
     * configured in the IAM Identity Center.
     * </p>
     * 
     * @param authenticationType
     *        The type of authentication integration points used when signing into the web portal. Defaults to
     *        <code>Standard</code>.</p>
     *        <p>
     *        <code>Standard</code> web portals are authenticated directly through your identity provider. You need to
     *        call <code>CreateIdentityProvider</code> to integrate your identity provider with your web portal. User
     *        and group access to your web portal is controlled through your identity provider.
     *        </p>
     *        <p>
     *        <code>IAM_Identity_Center</code> web portals are authenticated through AWS IAM Identity Center (successor
     *        to AWS Single Sign-On). They provide additional features, such as IdP-initiated authentication. Identity
     *        sources (including external identity provider integration), plus user and group access to your web portal,
     *        can be configured in the IAM Identity Center.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public UpdatePortalRequest withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * The type of authentication integration points used when signing into the web portal. Defaults to
     * <code>Standard</code>.
     * </p>
     * <p>
     * <code>Standard</code> web portals are authenticated directly through your identity provider. You need to call
     * <code>CreateIdentityProvider</code> to integrate your identity provider with your web portal. User and group
     * access to your web portal is controlled through your identity provider.
     * </p>
     * <p>
     * <code>IAM_Identity_Center</code> web portals are authenticated through AWS IAM Identity Center (successor to AWS
     * Single Sign-On). They provide additional features, such as IdP-initiated authentication. Identity sources
     * (including external identity provider integration), plus user and group access to your web portal, can be
     * configured in the IAM Identity Center.
     * </p>
     * 
     * @param authenticationType
     *        The type of authentication integration points used when signing into the web portal. Defaults to
     *        <code>Standard</code>.</p>
     *        <p>
     *        <code>Standard</code> web portals are authenticated directly through your identity provider. You need to
     *        call <code>CreateIdentityProvider</code> to integrate your identity provider with your web portal. User
     *        and group access to your web portal is controlled through your identity provider.
     *        </p>
     *        <p>
     *        <code>IAM_Identity_Center</code> web portals are authenticated through AWS IAM Identity Center (successor
     *        to AWS Single Sign-On). They provide additional features, such as IdP-initiated authentication. Identity
     *        sources (including external identity provider integration), plus user and group access to your web portal,
     *        can be configured in the IAM Identity Center.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public UpdatePortalRequest withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the web portal. This is not visible to users who log into the web portal.
     * </p>
     * 
     * @param displayName
     *        The name of the web portal. This is not visible to users who log into the web portal.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the web portal. This is not visible to users who log into the web portal.
     * </p>
     * 
     * @return The name of the web portal. This is not visible to users who log into the web portal.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the web portal. This is not visible to users who log into the web portal.
     * </p>
     * 
     * @param displayName
     *        The name of the web portal. This is not visible to users who log into the web portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortalRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The ARN of the web portal.
     * </p>
     * 
     * @param portalArn
     *        The ARN of the web portal.
     */

    public void setPortalArn(String portalArn) {
        this.portalArn = portalArn;
    }

    /**
     * <p>
     * The ARN of the web portal.
     * </p>
     * 
     * @return The ARN of the web portal.
     */

    public String getPortalArn() {
        return this.portalArn;
    }

    /**
     * <p>
     * The ARN of the web portal.
     * </p>
     * 
     * @param portalArn
     *        The ARN of the web portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortalRequest withPortalArn(String portalArn) {
        setPortalArn(portalArn);
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
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append("***Sensitive Data Redacted***").append(",");
        if (getPortalArn() != null)
            sb.append("PortalArn: ").append(getPortalArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePortalRequest == false)
            return false;
        UpdatePortalRequest other = (UpdatePortalRequest) obj;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getPortalArn() == null ^ this.getPortalArn() == null)
            return false;
        if (other.getPortalArn() != null && other.getPortalArn().equals(this.getPortalArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getPortalArn() == null) ? 0 : getPortalArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePortalRequest clone() {
        return (UpdatePortalRequest) super.clone();
    }

}
