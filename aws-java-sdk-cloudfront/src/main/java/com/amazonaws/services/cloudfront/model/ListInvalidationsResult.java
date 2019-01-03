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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/ListInvalidations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInvalidationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about invalidation batches.
     * </p>
     */
    private InvalidationList invalidationList;

    /**
     * <p>
     * Information about invalidation batches.
     * </p>
     * 
     * @param invalidationList
     *        Information about invalidation batches.
     */

    public void setInvalidationList(InvalidationList invalidationList) {
        this.invalidationList = invalidationList;
    }

    /**
     * <p>
     * Information about invalidation batches.
     * </p>
     * 
     * @return Information about invalidation batches.
     */

    public InvalidationList getInvalidationList() {
        return this.invalidationList;
    }

    /**
     * <p>
     * Information about invalidation batches.
     * </p>
     * 
     * @param invalidationList
     *        Information about invalidation batches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInvalidationsResult withInvalidationList(InvalidationList invalidationList) {
        setInvalidationList(invalidationList);
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
        if (getInvalidationList() != null)
            sb.append("InvalidationList: ").append(getInvalidationList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInvalidationsResult == false)
            return false;
        ListInvalidationsResult other = (ListInvalidationsResult) obj;
        if (other.getInvalidationList() == null ^ this.getInvalidationList() == null)
            return false;
        if (other.getInvalidationList() != null && other.getInvalidationList().equals(this.getInvalidationList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvalidationList() == null) ? 0 : getInvalidationList().hashCode());
        return hashCode;
    }

    @Override
    public ListInvalidationsResult clone() {
        try {
            return (ListInvalidationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
