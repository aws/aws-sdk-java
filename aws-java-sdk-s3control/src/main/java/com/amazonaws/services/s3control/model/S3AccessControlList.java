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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/S3AccessControlList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3AccessControlList implements Serializable, Cloneable {

    /** <p/> */
    private S3ObjectOwner owner;
    /** <p/> */
    private java.util.List<S3Grant> grants;

    /**
     * <p/>
     * 
     * @param owner
     */

    public void setOwner(S3ObjectOwner owner) {
        this.owner = owner;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public S3ObjectOwner getOwner() {
        return this.owner;
    }

    /**
     * <p/>
     * 
     * @param owner
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3AccessControlList withOwner(S3ObjectOwner owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<S3Grant> getGrants() {
        return grants;
    }

    /**
     * <p/>
     * 
     * @param grants
     */

    public void setGrants(java.util.Collection<S3Grant> grants) {
        if (grants == null) {
            this.grants = null;
            return;
        }

        this.grants = new java.util.ArrayList<S3Grant>(grants);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGrants(java.util.Collection)} or {@link #withGrants(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param grants
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3AccessControlList withGrants(S3Grant... grants) {
        if (this.grants == null) {
            setGrants(new java.util.ArrayList<S3Grant>(grants.length));
        }
        for (S3Grant ele : grants) {
            this.grants.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param grants
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3AccessControlList withGrants(java.util.Collection<S3Grant> grants) {
        setGrants(grants);
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
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getGrants() != null)
            sb.append("Grants: ").append(getGrants());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3AccessControlList == false)
            return false;
        S3AccessControlList other = (S3AccessControlList) obj;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getGrants() == null ^ this.getGrants() == null)
            return false;
        if (other.getGrants() != null && other.getGrants().equals(this.getGrants()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getGrants() == null) ? 0 : getGrants().hashCode());
        return hashCode;
    }

    @Override
    public S3AccessControlList clone() {
        try {
            return (S3AccessControlList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
