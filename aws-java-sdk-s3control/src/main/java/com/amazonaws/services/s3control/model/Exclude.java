/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A container for what Amazon S3 Storage Lens will exclude.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/Exclude" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Exclude implements Serializable, Cloneable {

    /**
     * <p>
     * A container for the S3 Storage Lens bucket excludes.
     * </p>
     */
    private java.util.List<String> buckets;
    /**
     * <p>
     * A container for the S3 Storage Lens Region excludes.
     * </p>
     */
    private java.util.List<String> regions;

    /**
     * <p>
     * A container for the S3 Storage Lens bucket excludes.
     * </p>
     * 
     * @return A container for the S3 Storage Lens bucket excludes.
     */

    public java.util.List<String> getBuckets() {
        return buckets;
    }

    /**
     * <p>
     * A container for the S3 Storage Lens bucket excludes.
     * </p>
     * 
     * @param buckets
     *        A container for the S3 Storage Lens bucket excludes.
     */

    public void setBuckets(java.util.Collection<String> buckets) {
        if (buckets == null) {
            this.buckets = null;
            return;
        }

        this.buckets = new java.util.ArrayList<String>(buckets);
    }

    /**
     * <p>
     * A container for the S3 Storage Lens bucket excludes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBuckets(java.util.Collection)} or {@link #withBuckets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param buckets
     *        A container for the S3 Storage Lens bucket excludes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Exclude withBuckets(String... buckets) {
        if (this.buckets == null) {
            setBuckets(new java.util.ArrayList<String>(buckets.length));
        }
        for (String ele : buckets) {
            this.buckets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A container for the S3 Storage Lens bucket excludes.
     * </p>
     * 
     * @param buckets
     *        A container for the S3 Storage Lens bucket excludes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Exclude withBuckets(java.util.Collection<String> buckets) {
        setBuckets(buckets);
        return this;
    }

    /**
     * <p>
     * A container for the S3 Storage Lens Region excludes.
     * </p>
     * 
     * @return A container for the S3 Storage Lens Region excludes.
     */

    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * <p>
     * A container for the S3 Storage Lens Region excludes.
     * </p>
     * 
     * @param regions
     *        A container for the S3 Storage Lens Region excludes.
     */

    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new java.util.ArrayList<String>(regions);
    }

    /**
     * <p>
     * A container for the S3 Storage Lens Region excludes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        A container for the S3 Storage Lens Region excludes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Exclude withRegions(String... regions) {
        if (this.regions == null) {
            setRegions(new java.util.ArrayList<String>(regions.length));
        }
        for (String ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A container for the S3 Storage Lens Region excludes.
     * </p>
     * 
     * @param regions
     *        A container for the S3 Storage Lens Region excludes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Exclude withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
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
            sb.append("Buckets: ").append(getBuckets()).append(",");
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Exclude == false)
            return false;
        Exclude other = (Exclude) obj;
        if (other.getBuckets() == null ^ this.getBuckets() == null)
            return false;
        if (other.getBuckets() != null && other.getBuckets().equals(this.getBuckets()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBuckets() == null) ? 0 : getBuckets().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        return hashCode;
    }

    @Override
    public Exclude clone() {
        try {
            return (Exclude) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
