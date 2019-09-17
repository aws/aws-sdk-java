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
 * Represents a grantee identified by their canonical Amazon ID.
 * The canonical Amazon ID can be thought of as
 * an Amazon-internal ID specific to a user. For
 * example, Amazon can map a grantee identified by an email address to a
 * canonical ID.
 * <p>
 * Canonical grantees may have an associated display name, which is a
 * human-friendly name that Amazon has linked to the canonical ID (eg. the user's
 * login name).
 * </p>
 * 
 * @see CanonicalGrantee#CanonicalGrantee(String)
 */
public class CanonicalGrantee implements Grantee,Serializable {
    private String id = null;
    private String displayName = null;
        
    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.model.Grantee#getTypeIdentifier()
     */
    public String getTypeIdentifier() {
        return "id";
    }
    
    /**
     * Constructs a new {@link CanonicalGrantee} object 
     * with the given canonical ID.
     * 
     * @param identifier
     */
    public CanonicalGrantee(String identifier) {
        this.setIdentifier(identifier);
    }

    /**
     * <p>
     * Sets the unique identifier for this grantee.
     * </p>
     * 
     * @see CanonicalGrantee#getIdentifier()
     */
    public void setIdentifier(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Returns the unique identifier for this grantee.
     * </p>
     * 
     * @see CanonicalGrantee#setIdentifier(String)
     */
    public String getIdentifier() {
        return id;
    }
    
    
    /**
     * <p>
     * Sets the display name for this grantee.
     * </p>
     * 
     * @param displayName
     * 
     * @see CanonicalGrantee#getDisplayName()
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * Returns the display name for this grantee.
     * </p>
     * 
     * @return The display name for this grantee.
     * 
     * @see CanonicalGrantee#setDisplayName(String)
     */
    public String getDisplayName() {
        return this.displayName;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CanonicalGrantee) {
            CanonicalGrantee canonicalGrantee = (CanonicalGrantee) obj;
            return id.equals(canonicalGrantee.id);
        }
        return false;
    }

    public int hashCode() {
        return id.hashCode();
    }

}
