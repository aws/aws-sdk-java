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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateFeaturedResultsSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFeaturedResultsSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information on the set of featured results. This includes the identifier of the featured results set, whether the
     * featured results set is active or inactive, when the featured results set was created, and more.
     * </p>
     */
    private FeaturedResultsSet featuredResultsSet;

    /**
     * <p>
     * Information on the set of featured results. This includes the identifier of the featured results set, whether the
     * featured results set is active or inactive, when the featured results set was created, and more.
     * </p>
     * 
     * @param featuredResultsSet
     *        Information on the set of featured results. This includes the identifier of the featured results set,
     *        whether the featured results set is active or inactive, when the featured results set was created, and
     *        more.
     */

    public void setFeaturedResultsSet(FeaturedResultsSet featuredResultsSet) {
        this.featuredResultsSet = featuredResultsSet;
    }

    /**
     * <p>
     * Information on the set of featured results. This includes the identifier of the featured results set, whether the
     * featured results set is active or inactive, when the featured results set was created, and more.
     * </p>
     * 
     * @return Information on the set of featured results. This includes the identifier of the featured results set,
     *         whether the featured results set is active or inactive, when the featured results set was created, and
     *         more.
     */

    public FeaturedResultsSet getFeaturedResultsSet() {
        return this.featuredResultsSet;
    }

    /**
     * <p>
     * Information on the set of featured results. This includes the identifier of the featured results set, whether the
     * featured results set is active or inactive, when the featured results set was created, and more.
     * </p>
     * 
     * @param featuredResultsSet
     *        Information on the set of featured results. This includes the identifier of the featured results set,
     *        whether the featured results set is active or inactive, when the featured results set was created, and
     *        more.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeaturedResultsSetResult withFeaturedResultsSet(FeaturedResultsSet featuredResultsSet) {
        setFeaturedResultsSet(featuredResultsSet);
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
        if (getFeaturedResultsSet() != null)
            sb.append("FeaturedResultsSet: ").append(getFeaturedResultsSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFeaturedResultsSetResult == false)
            return false;
        CreateFeaturedResultsSetResult other = (CreateFeaturedResultsSetResult) obj;
        if (other.getFeaturedResultsSet() == null ^ this.getFeaturedResultsSet() == null)
            return false;
        if (other.getFeaturedResultsSet() != null && other.getFeaturedResultsSet().equals(this.getFeaturedResultsSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeaturedResultsSet() == null) ? 0 : getFeaturedResultsSet().hashCode());
        return hashCode;
    }

    @Override
    public CreateFeaturedResultsSetResult clone() {
        try {
            return (CreateFeaturedResultsSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
