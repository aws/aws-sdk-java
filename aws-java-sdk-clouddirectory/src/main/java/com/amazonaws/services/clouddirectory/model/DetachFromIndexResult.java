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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DetachFromIndex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetachFromIndexResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>ObjectIdentifier</code> of the object that was detached from the index.
     * </p>
     */
    private String detachedObjectIdentifier;

    /**
     * <p>
     * The <code>ObjectIdentifier</code> of the object that was detached from the index.
     * </p>
     * 
     * @param detachedObjectIdentifier
     *        The <code>ObjectIdentifier</code> of the object that was detached from the index.
     */

    public void setDetachedObjectIdentifier(String detachedObjectIdentifier) {
        this.detachedObjectIdentifier = detachedObjectIdentifier;
    }

    /**
     * <p>
     * The <code>ObjectIdentifier</code> of the object that was detached from the index.
     * </p>
     * 
     * @return The <code>ObjectIdentifier</code> of the object that was detached from the index.
     */

    public String getDetachedObjectIdentifier() {
        return this.detachedObjectIdentifier;
    }

    /**
     * <p>
     * The <code>ObjectIdentifier</code> of the object that was detached from the index.
     * </p>
     * 
     * @param detachedObjectIdentifier
     *        The <code>ObjectIdentifier</code> of the object that was detached from the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachFromIndexResult withDetachedObjectIdentifier(String detachedObjectIdentifier) {
        setDetachedObjectIdentifier(detachedObjectIdentifier);
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
        if (getDetachedObjectIdentifier() != null)
            sb.append("DetachedObjectIdentifier: ").append(getDetachedObjectIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachFromIndexResult == false)
            return false;
        DetachFromIndexResult other = (DetachFromIndexResult) obj;
        if (other.getDetachedObjectIdentifier() == null ^ this.getDetachedObjectIdentifier() == null)
            return false;
        if (other.getDetachedObjectIdentifier() != null && other.getDetachedObjectIdentifier().equals(this.getDetachedObjectIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetachedObjectIdentifier() == null) ? 0 : getDetachedObjectIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DetachFromIndexResult clone() {
        try {
            return (DetachFromIndexResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
