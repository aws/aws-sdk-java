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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Returns a TXT record that you must publish to the DNS server of your domain to complete domain verification with
 * Amazon SES.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/VerifyDomainIdentity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifyDomainIdentityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A TXT record that you must place in the DNS settings of the domain to complete domain verification with Amazon
     * SES.
     * </p>
     * <p>
     * As Amazon SES searches for the TXT record, the domain's verification status is "Pending". When Amazon SES detects
     * the record, the domain's verification status changes to "Success". If Amazon SES is unable to detect the record
     * within 72 hours, the domain's verification status changes to "Failed." In that case, if you still want to verify
     * the domain, you must restart the verification process from the beginning.
     * </p>
     */
    private String verificationToken;

    /**
     * <p>
     * A TXT record that you must place in the DNS settings of the domain to complete domain verification with Amazon
     * SES.
     * </p>
     * <p>
     * As Amazon SES searches for the TXT record, the domain's verification status is "Pending". When Amazon SES detects
     * the record, the domain's verification status changes to "Success". If Amazon SES is unable to detect the record
     * within 72 hours, the domain's verification status changes to "Failed." In that case, if you still want to verify
     * the domain, you must restart the verification process from the beginning.
     * </p>
     * 
     * @param verificationToken
     *        A TXT record that you must place in the DNS settings of the domain to complete domain verification with
     *        Amazon SES.</p>
     *        <p>
     *        As Amazon SES searches for the TXT record, the domain's verification status is "Pending". When Amazon SES
     *        detects the record, the domain's verification status changes to "Success". If Amazon SES is unable to
     *        detect the record within 72 hours, the domain's verification status changes to "Failed." In that case, if
     *        you still want to verify the domain, you must restart the verification process from the beginning.
     */

    public void setVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
    }

    /**
     * <p>
     * A TXT record that you must place in the DNS settings of the domain to complete domain verification with Amazon
     * SES.
     * </p>
     * <p>
     * As Amazon SES searches for the TXT record, the domain's verification status is "Pending". When Amazon SES detects
     * the record, the domain's verification status changes to "Success". If Amazon SES is unable to detect the record
     * within 72 hours, the domain's verification status changes to "Failed." In that case, if you still want to verify
     * the domain, you must restart the verification process from the beginning.
     * </p>
     * 
     * @return A TXT record that you must place in the DNS settings of the domain to complete domain verification with
     *         Amazon SES.</p>
     *         <p>
     *         As Amazon SES searches for the TXT record, the domain's verification status is "Pending". When Amazon SES
     *         detects the record, the domain's verification status changes to "Success". If Amazon SES is unable to
     *         detect the record within 72 hours, the domain's verification status changes to "Failed." In that case, if
     *         you still want to verify the domain, you must restart the verification process from the beginning.
     */

    public String getVerificationToken() {
        return this.verificationToken;
    }

    /**
     * <p>
     * A TXT record that you must place in the DNS settings of the domain to complete domain verification with Amazon
     * SES.
     * </p>
     * <p>
     * As Amazon SES searches for the TXT record, the domain's verification status is "Pending". When Amazon SES detects
     * the record, the domain's verification status changes to "Success". If Amazon SES is unable to detect the record
     * within 72 hours, the domain's verification status changes to "Failed." In that case, if you still want to verify
     * the domain, you must restart the verification process from the beginning.
     * </p>
     * 
     * @param verificationToken
     *        A TXT record that you must place in the DNS settings of the domain to complete domain verification with
     *        Amazon SES.</p>
     *        <p>
     *        As Amazon SES searches for the TXT record, the domain's verification status is "Pending". When Amazon SES
     *        detects the record, the domain's verification status changes to "Success". If Amazon SES is unable to
     *        detect the record within 72 hours, the domain's verification status changes to "Failed." In that case, if
     *        you still want to verify the domain, you must restart the verification process from the beginning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyDomainIdentityResult withVerificationToken(String verificationToken) {
        setVerificationToken(verificationToken);
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
        if (getVerificationToken() != null)
            sb.append("VerificationToken: ").append(getVerificationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyDomainIdentityResult == false)
            return false;
        VerifyDomainIdentityResult other = (VerifyDomainIdentityResult) obj;
        if (other.getVerificationToken() == null ^ this.getVerificationToken() == null)
            return false;
        if (other.getVerificationToken() != null && other.getVerificationToken().equals(this.getVerificationToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerificationToken() == null) ? 0 : getVerificationToken().hashCode());
        return hashCode;
    }

    @Override
    public VerifyDomainIdentityResult clone() {
        try {
            return (VerifyDomainIdentityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
