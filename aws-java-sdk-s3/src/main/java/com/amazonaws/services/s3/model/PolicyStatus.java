/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class PolicyStatus implements Serializable, Cloneable {

    private Boolean isPublic;

    /**
     * The public-policy status for this bucket. <code>TRUE</code> indicates that this bucket is public. <code>FALSE</code>
     * indicates that the bucket is not public.
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    /**
     * The public-policy status for this bucket. <code>TRUE</code> indicates that this bucket is public. <code>FALSE</code>
     * indicates that the bucket is not public.
     *
     * @param isPublic True if the bucket is public, false if not.
     */
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    /**
     * The public-policy status for this bucket. <code>TRUE</code> indicates that this bucket is public. <code>FALSE</code>
     * indicates that the bucket is not public.
     *
     * @param isPublic True if the bucket is public, false if not.
     * @return This object for method chaining.
     */
    public PolicyStatus withIsPublic(Boolean isPublic) {
        setIsPublic(isPublic);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final PolicyStatus that = (PolicyStatus) o;

        return isPublic != null ? isPublic.equals(that.isPublic) : that.isPublic == null;
    }

    @Override
    public int hashCode() {
        return isPublic != null ? isPublic.hashCode() : 0;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIsPublic() != null) {
            sb.append("IsPublic: ").append(getIsPublic()).append(",");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public PolicyStatus clone() {
        try {
            return (PolicyStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
