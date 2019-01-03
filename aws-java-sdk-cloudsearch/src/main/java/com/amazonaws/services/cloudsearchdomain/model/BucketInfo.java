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
package com.amazonaws.services.cloudsearchdomain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A container for the calculated facet values and counts.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BucketInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of the calculated facet values and counts.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Bucket> buckets;

    /**
     * <p>
     * A list of the calculated facet values and counts.
     * </p>
     * 
     * @return A list of the calculated facet values and counts.
     */

    public java.util.List<Bucket> getBuckets() {
        if (buckets == null) {
            buckets = new com.amazonaws.internal.SdkInternalList<Bucket>();
        }
        return buckets;
    }

    /**
     * <p>
     * A list of the calculated facet values and counts.
     * </p>
     * 
     * @param buckets
     *        A list of the calculated facet values and counts.
     */

    public void setBuckets(java.util.Collection<Bucket> buckets) {
        if (buckets == null) {
            this.buckets = null;
            return;
        }

        this.buckets = new com.amazonaws.internal.SdkInternalList<Bucket>(buckets);
    }

    /**
     * <p>
     * A list of the calculated facet values and counts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBuckets(java.util.Collection)} or {@link #withBuckets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param buckets
     *        A list of the calculated facet values and counts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketInfo withBuckets(Bucket... buckets) {
        if (this.buckets == null) {
            setBuckets(new com.amazonaws.internal.SdkInternalList<Bucket>(buckets.length));
        }
        for (Bucket ele : buckets) {
            this.buckets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the calculated facet values and counts.
     * </p>
     * 
     * @param buckets
     *        A list of the calculated facet values and counts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketInfo withBuckets(java.util.Collection<Bucket> buckets) {
        setBuckets(buckets);
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
        if (getBuckets() != null)
            sb.append("Buckets: ").append(getBuckets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketInfo == false)
            return false;
        BucketInfo other = (BucketInfo) obj;
        if (other.getBuckets() == null ^ this.getBuckets() == null)
            return false;
        if (other.getBuckets() != null && other.getBuckets().equals(this.getBuckets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBuckets() == null) ? 0 : getBuckets().hashCode());
        return hashCode;
    }

    @Override
    public BucketInfo clone() {
        try {
            return (BucketInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudsearchdomain.model.transform.BucketInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
