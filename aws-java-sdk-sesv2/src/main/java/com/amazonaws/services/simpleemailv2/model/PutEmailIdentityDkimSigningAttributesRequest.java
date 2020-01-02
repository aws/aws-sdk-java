/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to change the DKIM attributes for an email identity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutEmailIdentityDkimSigningAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutEmailIdentityDkimSigningAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The email identity that you want to configure DKIM for.
     * </p>
     */
    private String emailIdentity;
    /**
     * <p>
     * The method that you want to use to configure DKIM for the identity. There are two possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_SES</code> – Configure DKIM for the identity by using <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXTERNAL</code> – Configure DKIM for the identity by using Bring Your Own DKIM (BYODKIM).
     * </p>
     * </li>
     * </ul>
     */
    private String signingAttributesOrigin;
    /**
     * <p>
     * An object that contains information about the private key and selector that you want to use to configure DKIM for
     * the identity. This object is only required if you want to configure Bring Your Own DKIM (BYODKIM) for the
     * identity.
     * </p>
     */
    private DkimSigningAttributes signingAttributes;

    /**
     * <p>
     * The email identity that you want to configure DKIM for.
     * </p>
     * 
     * @param emailIdentity
     *        The email identity that you want to configure DKIM for.
     */

    public void setEmailIdentity(String emailIdentity) {
        this.emailIdentity = emailIdentity;
    }

    /**
     * <p>
     * The email identity that you want to configure DKIM for.
     * </p>
     * 
     * @return The email identity that you want to configure DKIM for.
     */

    public String getEmailIdentity() {
        return this.emailIdentity;
    }

    /**
     * <p>
     * The email identity that you want to configure DKIM for.
     * </p>
     * 
     * @param emailIdentity
     *        The email identity that you want to configure DKIM for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEmailIdentityDkimSigningAttributesRequest withEmailIdentity(String emailIdentity) {
        setEmailIdentity(emailIdentity);
        return this;
    }

    /**
     * <p>
     * The method that you want to use to configure DKIM for the identity. There are two possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_SES</code> – Configure DKIM for the identity by using <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXTERNAL</code> – Configure DKIM for the identity by using Bring Your Own DKIM (BYODKIM).
     * </p>
     * </li>
     * </ul>
     * 
     * @param signingAttributesOrigin
     *        The method that you want to use to configure DKIM for the identity. There are two possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS_SES</code> – Configure DKIM for the identity by using <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXTERNAL</code> – Configure DKIM for the identity by using Bring Your Own DKIM (BYODKIM).
     *        </p>
     *        </li>
     * @see DkimSigningAttributesOrigin
     */

    public void setSigningAttributesOrigin(String signingAttributesOrigin) {
        this.signingAttributesOrigin = signingAttributesOrigin;
    }

    /**
     * <p>
     * The method that you want to use to configure DKIM for the identity. There are two possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_SES</code> – Configure DKIM for the identity by using <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXTERNAL</code> – Configure DKIM for the identity by using Bring Your Own DKIM (BYODKIM).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The method that you want to use to configure DKIM for the identity. There are two possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AWS_SES</code> – Configure DKIM for the identity by using <a
     *         href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EXTERNAL</code> – Configure DKIM for the identity by using Bring Your Own DKIM (BYODKIM).
     *         </p>
     *         </li>
     * @see DkimSigningAttributesOrigin
     */

    public String getSigningAttributesOrigin() {
        return this.signingAttributesOrigin;
    }

    /**
     * <p>
     * The method that you want to use to configure DKIM for the identity. There are two possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_SES</code> – Configure DKIM for the identity by using <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXTERNAL</code> – Configure DKIM for the identity by using Bring Your Own DKIM (BYODKIM).
     * </p>
     * </li>
     * </ul>
     * 
     * @param signingAttributesOrigin
     *        The method that you want to use to configure DKIM for the identity. There are two possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS_SES</code> – Configure DKIM for the identity by using <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXTERNAL</code> – Configure DKIM for the identity by using Bring Your Own DKIM (BYODKIM).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DkimSigningAttributesOrigin
     */

    public PutEmailIdentityDkimSigningAttributesRequest withSigningAttributesOrigin(String signingAttributesOrigin) {
        setSigningAttributesOrigin(signingAttributesOrigin);
        return this;
    }

    /**
     * <p>
     * The method that you want to use to configure DKIM for the identity. There are two possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_SES</code> – Configure DKIM for the identity by using <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXTERNAL</code> – Configure DKIM for the identity by using Bring Your Own DKIM (BYODKIM).
     * </p>
     * </li>
     * </ul>
     * 
     * @param signingAttributesOrigin
     *        The method that you want to use to configure DKIM for the identity. There are two possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS_SES</code> – Configure DKIM for the identity by using <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXTERNAL</code> – Configure DKIM for the identity by using Bring Your Own DKIM (BYODKIM).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DkimSigningAttributesOrigin
     */

    public PutEmailIdentityDkimSigningAttributesRequest withSigningAttributesOrigin(DkimSigningAttributesOrigin signingAttributesOrigin) {
        this.signingAttributesOrigin = signingAttributesOrigin.toString();
        return this;
    }

    /**
     * <p>
     * An object that contains information about the private key and selector that you want to use to configure DKIM for
     * the identity. This object is only required if you want to configure Bring Your Own DKIM (BYODKIM) for the
     * identity.
     * </p>
     * 
     * @param signingAttributes
     *        An object that contains information about the private key and selector that you want to use to configure
     *        DKIM for the identity. This object is only required if you want to configure Bring Your Own DKIM (BYODKIM)
     *        for the identity.
     */

    public void setSigningAttributes(DkimSigningAttributes signingAttributes) {
        this.signingAttributes = signingAttributes;
    }

    /**
     * <p>
     * An object that contains information about the private key and selector that you want to use to configure DKIM for
     * the identity. This object is only required if you want to configure Bring Your Own DKIM (BYODKIM) for the
     * identity.
     * </p>
     * 
     * @return An object that contains information about the private key and selector that you want to use to configure
     *         DKIM for the identity. This object is only required if you want to configure Bring Your Own DKIM
     *         (BYODKIM) for the identity.
     */

    public DkimSigningAttributes getSigningAttributes() {
        return this.signingAttributes;
    }

    /**
     * <p>
     * An object that contains information about the private key and selector that you want to use to configure DKIM for
     * the identity. This object is only required if you want to configure Bring Your Own DKIM (BYODKIM) for the
     * identity.
     * </p>
     * 
     * @param signingAttributes
     *        An object that contains information about the private key and selector that you want to use to configure
     *        DKIM for the identity. This object is only required if you want to configure Bring Your Own DKIM (BYODKIM)
     *        for the identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEmailIdentityDkimSigningAttributesRequest withSigningAttributes(DkimSigningAttributes signingAttributes) {
        setSigningAttributes(signingAttributes);
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
        if (getEmailIdentity() != null)
            sb.append("EmailIdentity: ").append(getEmailIdentity()).append(",");
        if (getSigningAttributesOrigin() != null)
            sb.append("SigningAttributesOrigin: ").append(getSigningAttributesOrigin()).append(",");
        if (getSigningAttributes() != null)
            sb.append("SigningAttributes: ").append(getSigningAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEmailIdentityDkimSigningAttributesRequest == false)
            return false;
        PutEmailIdentityDkimSigningAttributesRequest other = (PutEmailIdentityDkimSigningAttributesRequest) obj;
        if (other.getEmailIdentity() == null ^ this.getEmailIdentity() == null)
            return false;
        if (other.getEmailIdentity() != null && other.getEmailIdentity().equals(this.getEmailIdentity()) == false)
            return false;
        if (other.getSigningAttributesOrigin() == null ^ this.getSigningAttributesOrigin() == null)
            return false;
        if (other.getSigningAttributesOrigin() != null && other.getSigningAttributesOrigin().equals(this.getSigningAttributesOrigin()) == false)
            return false;
        if (other.getSigningAttributes() == null ^ this.getSigningAttributes() == null)
            return false;
        if (other.getSigningAttributes() != null && other.getSigningAttributes().equals(this.getSigningAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmailIdentity() == null) ? 0 : getEmailIdentity().hashCode());
        hashCode = prime * hashCode + ((getSigningAttributesOrigin() == null) ? 0 : getSigningAttributesOrigin().hashCode());
        hashCode = prime * hashCode + ((getSigningAttributes() == null) ? 0 : getSigningAttributes().hashCode());
        return hashCode;
    }

    @Override
    public PutEmailIdentityDkimSigningAttributesRequest clone() {
        return (PutEmailIdentityDkimSigningAttributesRequest) super.clone();
    }

}
