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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to delete an existing email identity. When you delete an identity, you lose the ability to use Amazon
 * Pinpoint to send email from that identity. You can restore your ability to send email by completing the verification
 * process for the identity again.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DeleteEmailIdentity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEmailIdentityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identity (that is, the email address or domain) that you want to delete from your Amazon Pinpoint account.
     * </p>
     */
    private String emailIdentity;

    /**
     * <p>
     * The identity (that is, the email address or domain) that you want to delete from your Amazon Pinpoint account.
     * </p>
     * 
     * @param emailIdentity
     *        The identity (that is, the email address or domain) that you want to delete from your Amazon Pinpoint
     *        account.
     */

    public void setEmailIdentity(String emailIdentity) {
        this.emailIdentity = emailIdentity;
    }

    /**
     * <p>
     * The identity (that is, the email address or domain) that you want to delete from your Amazon Pinpoint account.
     * </p>
     * 
     * @return The identity (that is, the email address or domain) that you want to delete from your Amazon Pinpoint
     *         account.
     */

    public String getEmailIdentity() {
        return this.emailIdentity;
    }

    /**
     * <p>
     * The identity (that is, the email address or domain) that you want to delete from your Amazon Pinpoint account.
     * </p>
     * 
     * @param emailIdentity
     *        The identity (that is, the email address or domain) that you want to delete from your Amazon Pinpoint
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEmailIdentityRequest withEmailIdentity(String emailIdentity) {
        setEmailIdentity(emailIdentity);
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
            sb.append("EmailIdentity: ").append(getEmailIdentity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEmailIdentityRequest == false)
            return false;
        DeleteEmailIdentityRequest other = (DeleteEmailIdentityRequest) obj;
        if (other.getEmailIdentity() == null ^ this.getEmailIdentity() == null)
            return false;
        if (other.getEmailIdentity() != null && other.getEmailIdentity().equals(this.getEmailIdentity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmailIdentity() == null) ? 0 : getEmailIdentity().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEmailIdentityRequest clone() {
        return (DeleteEmailIdentityRequest) super.clone();
    }

}
