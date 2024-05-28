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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The authorized token issuer for the Amazon Redshift IAM Identity Center application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AuthorizedTokenIssuer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizedTokenIssuer implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN for the authorized token issuer for integrating Amazon Redshift with IDC Identity Center.
     * </p>
     */
    private String trustedTokenIssuerArn;
    /**
     * <p>
     * The list of audiences for the authorized token issuer for integrating Amazon Redshift with IDC Identity Center.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> authorizedAudiencesList;

    /**
     * <p>
     * The ARN for the authorized token issuer for integrating Amazon Redshift with IDC Identity Center.
     * </p>
     * 
     * @param trustedTokenIssuerArn
     *        The ARN for the authorized token issuer for integrating Amazon Redshift with IDC Identity Center.
     */

    public void setTrustedTokenIssuerArn(String trustedTokenIssuerArn) {
        this.trustedTokenIssuerArn = trustedTokenIssuerArn;
    }

    /**
     * <p>
     * The ARN for the authorized token issuer for integrating Amazon Redshift with IDC Identity Center.
     * </p>
     * 
     * @return The ARN for the authorized token issuer for integrating Amazon Redshift with IDC Identity Center.
     */

    public String getTrustedTokenIssuerArn() {
        return this.trustedTokenIssuerArn;
    }

    /**
     * <p>
     * The ARN for the authorized token issuer for integrating Amazon Redshift with IDC Identity Center.
     * </p>
     * 
     * @param trustedTokenIssuerArn
     *        The ARN for the authorized token issuer for integrating Amazon Redshift with IDC Identity Center.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizedTokenIssuer withTrustedTokenIssuerArn(String trustedTokenIssuerArn) {
        setTrustedTokenIssuerArn(trustedTokenIssuerArn);
        return this;
    }

    /**
     * <p>
     * The list of audiences for the authorized token issuer for integrating Amazon Redshift with IDC Identity Center.
     * </p>
     * 
     * @return The list of audiences for the authorized token issuer for integrating Amazon Redshift with IDC Identity
     *         Center.
     */

    public java.util.List<String> getAuthorizedAudiencesList() {
        if (authorizedAudiencesList == null) {
            authorizedAudiencesList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return authorizedAudiencesList;
    }

    /**
     * <p>
     * The list of audiences for the authorized token issuer for integrating Amazon Redshift with IDC Identity Center.
     * </p>
     * 
     * @param authorizedAudiencesList
     *        The list of audiences for the authorized token issuer for integrating Amazon Redshift with IDC Identity
     *        Center.
     */

    public void setAuthorizedAudiencesList(java.util.Collection<String> authorizedAudiencesList) {
        if (authorizedAudiencesList == null) {
            this.authorizedAudiencesList = null;
            return;
        }

        this.authorizedAudiencesList = new com.amazonaws.internal.SdkInternalList<String>(authorizedAudiencesList);
    }

    /**
     * <p>
     * The list of audiences for the authorized token issuer for integrating Amazon Redshift with IDC Identity Center.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthorizedAudiencesList(java.util.Collection)} or
     * {@link #withAuthorizedAudiencesList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param authorizedAudiencesList
     *        The list of audiences for the authorized token issuer for integrating Amazon Redshift with IDC Identity
     *        Center.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizedTokenIssuer withAuthorizedAudiencesList(String... authorizedAudiencesList) {
        if (this.authorizedAudiencesList == null) {
            setAuthorizedAudiencesList(new com.amazonaws.internal.SdkInternalList<String>(authorizedAudiencesList.length));
        }
        for (String ele : authorizedAudiencesList) {
            this.authorizedAudiencesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of audiences for the authorized token issuer for integrating Amazon Redshift with IDC Identity Center.
     * </p>
     * 
     * @param authorizedAudiencesList
     *        The list of audiences for the authorized token issuer for integrating Amazon Redshift with IDC Identity
     *        Center.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizedTokenIssuer withAuthorizedAudiencesList(java.util.Collection<String> authorizedAudiencesList) {
        setAuthorizedAudiencesList(authorizedAudiencesList);
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
        if (getTrustedTokenIssuerArn() != null)
            sb.append("TrustedTokenIssuerArn: ").append(getTrustedTokenIssuerArn()).append(",");
        if (getAuthorizedAudiencesList() != null)
            sb.append("AuthorizedAudiencesList: ").append(getAuthorizedAudiencesList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizedTokenIssuer == false)
            return false;
        AuthorizedTokenIssuer other = (AuthorizedTokenIssuer) obj;
        if (other.getTrustedTokenIssuerArn() == null ^ this.getTrustedTokenIssuerArn() == null)
            return false;
        if (other.getTrustedTokenIssuerArn() != null && other.getTrustedTokenIssuerArn().equals(this.getTrustedTokenIssuerArn()) == false)
            return false;
        if (other.getAuthorizedAudiencesList() == null ^ this.getAuthorizedAudiencesList() == null)
            return false;
        if (other.getAuthorizedAudiencesList() != null && other.getAuthorizedAudiencesList().equals(this.getAuthorizedAudiencesList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrustedTokenIssuerArn() == null) ? 0 : getTrustedTokenIssuerArn().hashCode());
        hashCode = prime * hashCode + ((getAuthorizedAudiencesList() == null) ? 0 : getAuthorizedAudiencesList().hashCode());
        return hashCode;
    }

    @Override
    public AuthorizedTokenIssuer clone() {
        try {
            return (AuthorizedTokenIssuer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
