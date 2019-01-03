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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The returned result of the corresponding request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CreateInvalidation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInvalidationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The fully qualified URI of the distribution and invalidation batch request, including the
     * <code>Invalidation ID</code>.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The invalidation's information.
     * </p>
     */
    private Invalidation invalidation;

    /**
     * <p>
     * The fully qualified URI of the distribution and invalidation batch request, including the
     * <code>Invalidation ID</code>.
     * </p>
     * 
     * @param location
     *        The fully qualified URI of the distribution and invalidation batch request, including the
     *        <code>Invalidation ID</code>.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The fully qualified URI of the distribution and invalidation batch request, including the
     * <code>Invalidation ID</code>.
     * </p>
     * 
     * @return The fully qualified URI of the distribution and invalidation batch request, including the
     *         <code>Invalidation ID</code>.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The fully qualified URI of the distribution and invalidation batch request, including the
     * <code>Invalidation ID</code>.
     * </p>
     * 
     * @param location
     *        The fully qualified URI of the distribution and invalidation batch request, including the
     *        <code>Invalidation ID</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInvalidationResult withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The invalidation's information.
     * </p>
     * 
     * @param invalidation
     *        The invalidation's information.
     */

    public void setInvalidation(Invalidation invalidation) {
        this.invalidation = invalidation;
    }

    /**
     * <p>
     * The invalidation's information.
     * </p>
     * 
     * @return The invalidation's information.
     */

    public Invalidation getInvalidation() {
        return this.invalidation;
    }

    /**
     * <p>
     * The invalidation's information.
     * </p>
     * 
     * @param invalidation
     *        The invalidation's information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInvalidationResult withInvalidation(Invalidation invalidation) {
        setInvalidation(invalidation);
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
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getInvalidation() != null)
            sb.append("Invalidation: ").append(getInvalidation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInvalidationResult == false)
            return false;
        CreateInvalidationResult other = (CreateInvalidationResult) obj;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getInvalidation() == null ^ this.getInvalidation() == null)
            return false;
        if (other.getInvalidation() != null && other.getInvalidation().equals(this.getInvalidation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getInvalidation() == null) ? 0 : getInvalidation().hashCode());
        return hashCode;
    }

    @Override
    public CreateInvalidationResult clone() {
        try {
            return (CreateInvalidationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
