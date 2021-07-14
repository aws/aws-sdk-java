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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateBucketBundle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBucketBundleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the bucket for which to update the bundle.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The ID of the new bundle to apply to the bucket.
     * </p>
     * <p>
     * Use the <a>GetBucketBundles</a> action to get a list of bundle IDs that you can specify.
     * </p>
     */
    private String bundleId;

    /**
     * <p>
     * The name of the bucket for which to update the bundle.
     * </p>
     * 
     * @param bucketName
     *        The name of the bucket for which to update the bundle.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the bucket for which to update the bundle.
     * </p>
     * 
     * @return The name of the bucket for which to update the bundle.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the bucket for which to update the bundle.
     * </p>
     * 
     * @param bucketName
     *        The name of the bucket for which to update the bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBucketBundleRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The ID of the new bundle to apply to the bucket.
     * </p>
     * <p>
     * Use the <a>GetBucketBundles</a> action to get a list of bundle IDs that you can specify.
     * </p>
     * 
     * @param bundleId
     *        The ID of the new bundle to apply to the bucket.</p>
     *        <p>
     *        Use the <a>GetBucketBundles</a> action to get a list of bundle IDs that you can specify.
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The ID of the new bundle to apply to the bucket.
     * </p>
     * <p>
     * Use the <a>GetBucketBundles</a> action to get a list of bundle IDs that you can specify.
     * </p>
     * 
     * @return The ID of the new bundle to apply to the bucket.</p>
     *         <p>
     *         Use the <a>GetBucketBundles</a> action to get a list of bundle IDs that you can specify.
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The ID of the new bundle to apply to the bucket.
     * </p>
     * <p>
     * Use the <a>GetBucketBundles</a> action to get a list of bundle IDs that you can specify.
     * </p>
     * 
     * @param bundleId
     *        The ID of the new bundle to apply to the bucket.</p>
     *        <p>
     *        Use the <a>GetBucketBundles</a> action to get a list of bundle IDs that you can specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBucketBundleRequest withBundleId(String bundleId) {
        setBundleId(bundleId);
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
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getBundleId() != null)
            sb.append("BundleId: ").append(getBundleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBucketBundleRequest == false)
            return false;
        UpdateBucketBundleRequest other = (UpdateBucketBundleRequest) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBucketBundleRequest clone() {
        return (UpdateBucketBundleRequest) super.clone();
    }

}
