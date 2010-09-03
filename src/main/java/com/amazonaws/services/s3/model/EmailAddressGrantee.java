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
 * Represents an e-mail grantee.  An e-mail grantee is a grantee 
 * identified by their e-mail
 * address and authenticated by an Amazon system.
 * <p>
 * E-mail grants are internally converted to the canonical user representation
 * when creating the ACL. If the grantee changes their e-mail address, it
 * will not affect existing Amazon S3 permissions.
 * </p>
 * <p>
 * Adding a grantee by e-mail address only works if exactly one Amazon account
 * corresponds to the specified e-mail address. If multiple Amazon accounts are
 * associated with the e-mail address, an <code>AmbiguousGrantByEmail</code> 
 * error message is
 * returned. This happens rarely, but usually occurs if a user created 
 * an Amazon account
 * in the past, forgotten the password, and created another Amazon account using
 * the same e-mail address. If this occurs, the user should contact Amazon 
 * customer service to have the accounts merged.
 * Alernatively, grant user access
 * specifying the canonical user representation.
 * </p>
 * 
 * @see EmailAddressGrantee#EmailAddressGrantee(String)
 */
public class EmailAddressGrantee implements Grantee {
    private String emailAddress = null;

    /**
     * Constructs a new {@link EmailAddressGrantee} object
     * with the given email address.
     *
     * @param emailAddress
     *        The e-mail address used to identify the e-mail grantee.
     */
    public EmailAddressGrantee(String emailAddress) {
        this.setIdentifier(emailAddress);
    }

    /**
     * Set the e-mail address as the grantee's ID.
     * 
     * @param emailAddress
     *        The e-mail address used to identify the e-mail grantee.
     *        
     * @see EmailAddressGrantee#getIdentifier()       
     */
    public void setIdentifier(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Gets the grantee's e-mail address.
     * 
     * @see EmailAddressGrantee#setIdentifier(string)     
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
