/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * A container for information about access control for replicas.
 * </p>
 * <note>
 * <p>
 * This is not supported by Amazon S3 on Outposts buckets.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/AccessControlTranslation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessControlTranslation implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the replica ownership.
     * </p>
     */
    private String owner;

    /**
     * <p>
     * Specifies the replica ownership.
     * </p>
     * 
     * @param owner
     *        Specifies the replica ownership.
     * @see OwnerOverride
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * Specifies the replica ownership.
     * </p>
     * 
     * @return Specifies the replica ownership.
     * @see OwnerOverride
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * Specifies the replica ownership.
     * </p>
     * 
     * @param owner
     *        Specifies the replica ownership.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OwnerOverride
     */

    public AccessControlTranslation withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * Specifies the replica ownership.
     * </p>
     * 
     * @param owner
     *        Specifies the replica ownership.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OwnerOverride
     */

    public AccessControlTranslation withOwner(OwnerOverride owner) {
        this.owner = owner.toString();
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
            sb.append("Owner: ").append(getOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessControlTranslation == false)
            return false;
        AccessControlTranslation other = (AccessControlTranslation) obj;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        return hashCode;
    }

    @Override
    public AccessControlTranslation clone() {
        try {
            return (AccessControlTranslation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
