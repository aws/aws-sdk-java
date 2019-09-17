/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.io.Serializable;

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
public class EmailAddressGrantee implements Grantee,Serializable {
    private String emailAddress = null;
    
    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.model.Grantee#getTypeIdentifier()
     */
    public String getTypeIdentifier() {
        return "emailAddress";
    }

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
     * @see #setIdentifier(String)
     */
    public String getIdentifier() {
        return emailAddress;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if ( this == obj )
            return true;
        if ( obj == null )
            return false;
        if ( getClass() != obj.getClass() )
            return false;
        EmailAddressGrantee other = (EmailAddressGrantee) obj;
        if ( emailAddress == null ) {
            if ( other.emailAddress != null )
                return false;
        } else if ( !emailAddress.equals(other.emailAddress) )
            return false;
        return true;
    }

    @Override
    public String toString() {
        return emailAddress;
    }
}
