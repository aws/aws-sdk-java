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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/S3Grantee" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Grantee implements Serializable, Cloneable {

    /** <p/> */
    private String typeIdentifier;
    /** <p/> */
    private String identifier;
    /** <p/> */
    private String displayName;

    /**
     * <p/>
     * 
     * @param typeIdentifier
     * @see S3GranteeTypeIdentifier
     */

    public void setTypeIdentifier(String typeIdentifier) {
        this.typeIdentifier = typeIdentifier;
    }

    /**
     * <p/>
     * 
     * @return
     * @see S3GranteeTypeIdentifier
     */

    public String getTypeIdentifier() {
        return this.typeIdentifier;
    }

    /**
     * <p/>
     * 
     * @param typeIdentifier
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3GranteeTypeIdentifier
     */

    public S3Grantee withTypeIdentifier(String typeIdentifier) {
        setTypeIdentifier(typeIdentifier);
        return this;
    }

    /**
     * <p/>
     * 
     * @param typeIdentifier
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3GranteeTypeIdentifier
     */

    public S3Grantee withTypeIdentifier(S3GranteeTypeIdentifier typeIdentifier) {
        this.typeIdentifier = typeIdentifier.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @param identifier
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p/>
     * 
     * @param identifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Grantee withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p/>
     * 
     * @param displayName
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p/>
     * 
     * @param displayName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Grantee withDisplayName(String displayName) {
        setDisplayName(displayName);
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
        if (getTypeIdentifier() != null)
            sb.append("TypeIdentifier: ").append(getTypeIdentifier()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Grantee == false)
            return false;
        S3Grantee other = (S3Grantee) obj;
        if (other.getTypeIdentifier() == null ^ this.getTypeIdentifier() == null)
            return false;
        if (other.getTypeIdentifier() != null && other.getTypeIdentifier().equals(this.getTypeIdentifier()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeIdentifier() == null) ? 0 : getTypeIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public S3Grantee clone() {
        try {
            return (S3Grantee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
