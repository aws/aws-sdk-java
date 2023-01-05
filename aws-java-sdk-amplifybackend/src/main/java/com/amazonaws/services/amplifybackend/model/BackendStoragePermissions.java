/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the read, write, and delete permissions users have against your storage S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/BackendStoragePermissions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackendStoragePermissions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Lists all authenticated user read, write, and delete permissions for your S3 bucket.
     * </p>
     */
    private java.util.List<String> authenticated;
    /**
     * <p>
     * Lists all unauthenticated user read, write, and delete permissions for your S3 bucket.
     * </p>
     */
    private java.util.List<String> unAuthenticated;

    /**
     * <p>
     * Lists all authenticated user read, write, and delete permissions for your S3 bucket.
     * </p>
     * 
     * @return Lists all authenticated user read, write, and delete permissions for your S3 bucket.
     * @see AuthenticatedElement
     */

    public java.util.List<String> getAuthenticated() {
        return authenticated;
    }

    /**
     * <p>
     * Lists all authenticated user read, write, and delete permissions for your S3 bucket.
     * </p>
     * 
     * @param authenticated
     *        Lists all authenticated user read, write, and delete permissions for your S3 bucket.
     * @see AuthenticatedElement
     */

    public void setAuthenticated(java.util.Collection<String> authenticated) {
        if (authenticated == null) {
            this.authenticated = null;
            return;
        }

        this.authenticated = new java.util.ArrayList<String>(authenticated);
    }

    /**
     * <p>
     * Lists all authenticated user read, write, and delete permissions for your S3 bucket.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthenticated(java.util.Collection)} or {@link #withAuthenticated(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param authenticated
     *        Lists all authenticated user read, write, and delete permissions for your S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticatedElement
     */

    public BackendStoragePermissions withAuthenticated(String... authenticated) {
        if (this.authenticated == null) {
            setAuthenticated(new java.util.ArrayList<String>(authenticated.length));
        }
        for (String ele : authenticated) {
            this.authenticated.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists all authenticated user read, write, and delete permissions for your S3 bucket.
     * </p>
     * 
     * @param authenticated
     *        Lists all authenticated user read, write, and delete permissions for your S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticatedElement
     */

    public BackendStoragePermissions withAuthenticated(java.util.Collection<String> authenticated) {
        setAuthenticated(authenticated);
        return this;
    }

    /**
     * <p>
     * Lists all authenticated user read, write, and delete permissions for your S3 bucket.
     * </p>
     * 
     * @param authenticated
     *        Lists all authenticated user read, write, and delete permissions for your S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticatedElement
     */

    public BackendStoragePermissions withAuthenticated(AuthenticatedElement... authenticated) {
        java.util.ArrayList<String> authenticatedCopy = new java.util.ArrayList<String>(authenticated.length);
        for (AuthenticatedElement value : authenticated) {
            authenticatedCopy.add(value.toString());
        }
        if (getAuthenticated() == null) {
            setAuthenticated(authenticatedCopy);
        } else {
            getAuthenticated().addAll(authenticatedCopy);
        }
        return this;
    }

    /**
     * <p>
     * Lists all unauthenticated user read, write, and delete permissions for your S3 bucket.
     * </p>
     * 
     * @return Lists all unauthenticated user read, write, and delete permissions for your S3 bucket.
     * @see UnAuthenticatedElement
     */

    public java.util.List<String> getUnAuthenticated() {
        return unAuthenticated;
    }

    /**
     * <p>
     * Lists all unauthenticated user read, write, and delete permissions for your S3 bucket.
     * </p>
     * 
     * @param unAuthenticated
     *        Lists all unauthenticated user read, write, and delete permissions for your S3 bucket.
     * @see UnAuthenticatedElement
     */

    public void setUnAuthenticated(java.util.Collection<String> unAuthenticated) {
        if (unAuthenticated == null) {
            this.unAuthenticated = null;
            return;
        }

        this.unAuthenticated = new java.util.ArrayList<String>(unAuthenticated);
    }

    /**
     * <p>
     * Lists all unauthenticated user read, write, and delete permissions for your S3 bucket.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnAuthenticated(java.util.Collection)} or {@link #withUnAuthenticated(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param unAuthenticated
     *        Lists all unauthenticated user read, write, and delete permissions for your S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnAuthenticatedElement
     */

    public BackendStoragePermissions withUnAuthenticated(String... unAuthenticated) {
        if (this.unAuthenticated == null) {
            setUnAuthenticated(new java.util.ArrayList<String>(unAuthenticated.length));
        }
        for (String ele : unAuthenticated) {
            this.unAuthenticated.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists all unauthenticated user read, write, and delete permissions for your S3 bucket.
     * </p>
     * 
     * @param unAuthenticated
     *        Lists all unauthenticated user read, write, and delete permissions for your S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnAuthenticatedElement
     */

    public BackendStoragePermissions withUnAuthenticated(java.util.Collection<String> unAuthenticated) {
        setUnAuthenticated(unAuthenticated);
        return this;
    }

    /**
     * <p>
     * Lists all unauthenticated user read, write, and delete permissions for your S3 bucket.
     * </p>
     * 
     * @param unAuthenticated
     *        Lists all unauthenticated user read, write, and delete permissions for your S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnAuthenticatedElement
     */

    public BackendStoragePermissions withUnAuthenticated(UnAuthenticatedElement... unAuthenticated) {
        java.util.ArrayList<String> unAuthenticatedCopy = new java.util.ArrayList<String>(unAuthenticated.length);
        for (UnAuthenticatedElement value : unAuthenticated) {
            unAuthenticatedCopy.add(value.toString());
        }
        if (getUnAuthenticated() == null) {
            setUnAuthenticated(unAuthenticatedCopy);
        } else {
            getUnAuthenticated().addAll(unAuthenticatedCopy);
        }
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
        if (getAuthenticated() != null)
            sb.append("Authenticated: ").append(getAuthenticated()).append(",");
        if (getUnAuthenticated() != null)
            sb.append("UnAuthenticated: ").append(getUnAuthenticated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackendStoragePermissions == false)
            return false;
        BackendStoragePermissions other = (BackendStoragePermissions) obj;
        if (other.getAuthenticated() == null ^ this.getAuthenticated() == null)
            return false;
        if (other.getAuthenticated() != null && other.getAuthenticated().equals(this.getAuthenticated()) == false)
            return false;
        if (other.getUnAuthenticated() == null ^ this.getUnAuthenticated() == null)
            return false;
        if (other.getUnAuthenticated() != null && other.getUnAuthenticated().equals(this.getUnAuthenticated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticated() == null) ? 0 : getAuthenticated().hashCode());
        hashCode = prime * hashCode + ((getUnAuthenticated() == null) ? 0 : getUnAuthenticated().hashCode());
        return hashCode;
    }

    @Override
    public BackendStoragePermissions clone() {
        try {
            return (BackendStoragePermissions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifybackend.model.transform.BackendStoragePermissionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
