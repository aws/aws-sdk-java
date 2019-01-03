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
 * A list of email addresses that you have verified with Amazon SES under your AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListVerifiedEmailAddresses" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVerifiedEmailAddressesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of email addresses that have been verified.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> verifiedEmailAddresses;

    /**
     * <p>
     * A list of email addresses that have been verified.
     * </p>
     * 
     * @return A list of email addresses that have been verified.
     */

    public java.util.List<String> getVerifiedEmailAddresses() {
        if (verifiedEmailAddresses == null) {
            verifiedEmailAddresses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return verifiedEmailAddresses;
    }

    /**
     * <p>
     * A list of email addresses that have been verified.
     * </p>
     * 
     * @param verifiedEmailAddresses
     *        A list of email addresses that have been verified.
     */

    public void setVerifiedEmailAddresses(java.util.Collection<String> verifiedEmailAddresses) {
        if (verifiedEmailAddresses == null) {
            this.verifiedEmailAddresses = null;
            return;
        }

        this.verifiedEmailAddresses = new com.amazonaws.internal.SdkInternalList<String>(verifiedEmailAddresses);
    }

    /**
     * <p>
     * A list of email addresses that have been verified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVerifiedEmailAddresses(java.util.Collection)} or
     * {@link #withVerifiedEmailAddresses(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param verifiedEmailAddresses
     *        A list of email addresses that have been verified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVerifiedEmailAddressesResult withVerifiedEmailAddresses(String... verifiedEmailAddresses) {
        if (this.verifiedEmailAddresses == null) {
            setVerifiedEmailAddresses(new com.amazonaws.internal.SdkInternalList<String>(verifiedEmailAddresses.length));
        }
        for (String ele : verifiedEmailAddresses) {
            this.verifiedEmailAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of email addresses that have been verified.
     * </p>
     * 
     * @param verifiedEmailAddresses
     *        A list of email addresses that have been verified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVerifiedEmailAddressesResult withVerifiedEmailAddresses(java.util.Collection<String> verifiedEmailAddresses) {
        setVerifiedEmailAddresses(verifiedEmailAddresses);
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
        if (getVerifiedEmailAddresses() != null)
            sb.append("VerifiedEmailAddresses: ").append(getVerifiedEmailAddresses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVerifiedEmailAddressesResult == false)
            return false;
        ListVerifiedEmailAddressesResult other = (ListVerifiedEmailAddressesResult) obj;
        if (other.getVerifiedEmailAddresses() == null ^ this.getVerifiedEmailAddresses() == null)
            return false;
        if (other.getVerifiedEmailAddresses() != null && other.getVerifiedEmailAddresses().equals(this.getVerifiedEmailAddresses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerifiedEmailAddresses() == null) ? 0 : getVerifiedEmailAddresses().hashCode());
        return hashCode;
    }

    @Override
    public ListVerifiedEmailAddressesResult clone() {
        try {
            return (ListVerifiedEmailAddressesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
