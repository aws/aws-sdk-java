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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/GetInvalidation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInvalidationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The invalidation's information. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/InvalidationDatatype.html">Invalidation
     * Complex Type</a>.
     * </p>
     */
    private Invalidation invalidation;

    /**
     * <p>
     * The invalidation's information. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/InvalidationDatatype.html">Invalidation
     * Complex Type</a>.
     * </p>
     * 
     * @param invalidation
     *        The invalidation's information. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/InvalidationDatatype.html"
     *        >Invalidation Complex Type</a>.
     */

    public void setInvalidation(Invalidation invalidation) {
        this.invalidation = invalidation;
    }

    /**
     * <p>
     * The invalidation's information. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/InvalidationDatatype.html">Invalidation
     * Complex Type</a>.
     * </p>
     * 
     * @return The invalidation's information. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/InvalidationDatatype.html"
     *         >Invalidation Complex Type</a>.
     */

    public Invalidation getInvalidation() {
        return this.invalidation;
    }

    /**
     * <p>
     * The invalidation's information. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/InvalidationDatatype.html">Invalidation
     * Complex Type</a>.
     * </p>
     * 
     * @param invalidation
     *        The invalidation's information. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/InvalidationDatatype.html"
     *        >Invalidation Complex Type</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInvalidationResult withInvalidation(Invalidation invalidation) {
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

        if (obj instanceof GetInvalidationResult == false)
            return false;
        GetInvalidationResult other = (GetInvalidationResult) obj;
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

        hashCode = prime * hashCode + ((getInvalidation() == null) ? 0 : getInvalidation().hashCode());
        return hashCode;
    }

    @Override
    public GetInvalidationResult clone() {
        try {
            return (GetInvalidationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
