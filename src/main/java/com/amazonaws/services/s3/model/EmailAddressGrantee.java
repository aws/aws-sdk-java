/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Portions copyright 2006-2009 James Murty. Please see LICENSE.txt
 * for applicable license terms and NOTICE.txt for applicable notices.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.model;

/**
 * Represents an E-mail Grantee, that is a grantee identified by their e-mail
 * address and authenticated by an Amazon system.
 * <p>
 * E-mail grants are internally converted to the CanonicalUser representation
 * when you create the ACL. If the grantee changes his or her e-mail address, it
 * will not affect the existing Amazon S3 permissions.
 * <p>
 * Adding a grantee by e-mail address only works if exactly one Amazon account
 * corresponds to the specified e-mail address. If multiple Amazon accounts are
 * associated with the e-mail address, an AmbiguousGrantByEmail error message is
 * returned. This is rare but usually occurs if a user created an Amazon account
 * in the past, forgot the password, and created another Amazon account using
 * the same e-mail address. If this occurs, the user should contact Amazon.com
 * customer service to have the accounts merged or you should grant user access
 * specifying the CanonicalUser representation.
 */
public class EmailAddressGrantee implements Grantee {
    private String emailAddress = null;

    /**
     * Constructs an email grantee with the given email address.
     *
     * @param emailAddress
     */
    public EmailAddressGrantee(String emailAddress) {
        this.setIdentifier(emailAddress);
    }

    /**
     * Set the email address as the grantee's ID.
     */
    public void setIdentifier(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Returns the grantee's email address (ID).
     */
    public String getIdentifier() {
        return emailAddress;
    }

    public boolean equals(Object obj) {
        if (obj instanceof EmailAddressGrantee) {
            return emailAddress.equals(((EmailAddressGrantee)obj).emailAddress);
        }
        return false;
    }

    public int hashCode() {
        return emailAddress.hashCode();
    }

}
