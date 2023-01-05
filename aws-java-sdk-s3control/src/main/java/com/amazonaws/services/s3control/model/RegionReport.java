/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A combination of a bucket and Region that's part of a Multi-Region Access Point.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/RegionReport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegionReport implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the bucket.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The name of the Region.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * 
     * @param bucket
     *        The name of the bucket.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * 
     * @return The name of the bucket.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * 
     * @param bucket
     *        The name of the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionReport withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The name of the Region.
     * </p>
     * 
     * @param region
     *        The name of the Region.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The name of the Region.
     * </p>
     * 
     * @return The name of the Region.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The name of the Region.
     * </p>
     * 
     * @param region
     *        The name of the Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionReport withRegion(String region) {
        setRegion(region);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegionReport == false)
            return false;
        RegionReport other = (RegionReport) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public RegionReport clone() {
        try {
            return (RegionReport) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
