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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateBucket" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBucketRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the bucket.
     * </p>
     * <p>
     * For more information about bucket names, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/bucket-naming-rules-in-amazon-lightsail">Bucket
     * naming rules in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The ID of the bundle to use for the bucket.
     * </p>
     * <p>
     * A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket.
     * </p>
     * <p>
     * Use the <a>GetBucketBundles</a> action to get a list of bundle IDs that you can specify.
     * </p>
     * <p>
     * Use the <a>UpdateBucketBundle</a> action to change the bundle after the bucket is created.
     * </p>
     */
    private String bundleId;
    /**
     * <p>
     * The tag keys and optional values to add to the bucket during creation.
     * </p>
     * <p>
     * Use the <a>TagResource</a> action to tag the bucket after it's created.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A Boolean value that indicates whether to enable versioning of objects in the bucket.
     * </p>
     * <p>
     * For more information about versioning, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-managing-bucket-object-versioning"
     * >Enabling and suspending bucket object versioning in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer
     * Guide</i>.
     * </p>
     */
    private Boolean enableObjectVersioning;

    /**
     * <p>
     * The name for the bucket.
     * </p>
     * <p>
     * For more information about bucket names, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/bucket-naming-rules-in-amazon-lightsail">Bucket
     * naming rules in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * 
     * @param bucketName
     *        The name for the bucket.</p>
     *        <p>
     *        For more information about bucket names, see <a
     *        href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/bucket-naming-rules-in-amazon-lightsail"
     *        >Bucket naming rules in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name for the bucket.
     * </p>
     * <p>
     * For more information about bucket names, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/bucket-naming-rules-in-amazon-lightsail">Bucket
     * naming rules in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * 
     * @return The name for the bucket.</p>
     *         <p>
     *         For more information about bucket names, see <a
     *         href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/bucket-naming-rules-in-amazon-lightsail"
     *         >Bucket naming rules in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name for the bucket.
     * </p>
     * <p>
     * For more information about bucket names, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/bucket-naming-rules-in-amazon-lightsail">Bucket
     * naming rules in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * 
     * @param bucketName
     *        The name for the bucket.</p>
     *        <p>
     *        For more information about bucket names, see <a
     *        href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/bucket-naming-rules-in-amazon-lightsail"
     *        >Bucket naming rules in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBucketRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The ID of the bundle to use for the bucket.
     * </p>
     * <p>
     * A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket.
     * </p>
     * <p>
     * Use the <a>GetBucketBundles</a> action to get a list of bundle IDs that you can specify.
     * </p>
     * <p>
     * Use the <a>UpdateBucketBundle</a> action to change the bundle after the bucket is created.
     * </p>
     * 
     * @param bundleId
     *        The ID of the bundle to use for the bucket.</p>
     *        <p>
     *        A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket.
     *        </p>
     *        <p>
     *        Use the <a>GetBucketBundles</a> action to get a list of bundle IDs that you can specify.
     *        </p>
     *        <p>
     *        Use the <a>UpdateBucketBundle</a> action to change the bundle after the bucket is created.
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The ID of the bundle to use for the bucket.
     * </p>
     * <p>
     * A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket.
     * </p>
     * <p>
     * Use the <a>GetBucketBundles</a> action to get a list of bundle IDs that you can specify.
     * </p>
     * <p>
     * Use the <a>UpdateBucketBundle</a> action to change the bundle after the bucket is created.
     * </p>
     * 
     * @return The ID of the bundle to use for the bucket.</p>
     *         <p>
     *         A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket.
     *         </p>
     *         <p>
     *         Use the <a>GetBucketBundles</a> action to get a list of bundle IDs that you can specify.
     *         </p>
     *         <p>
     *         Use the <a>UpdateBucketBundle</a> action to change the bundle after the bucket is created.
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The ID of the bundle to use for the bucket.
     * </p>
     * <p>
     * A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket.
     * </p>
     * <p>
     * Use the <a>GetBucketBundles</a> action to get a list of bundle IDs that you can specify.
     * </p>
     * <p>
     * Use the <a>UpdateBucketBundle</a> action to change the bundle after the bucket is created.
     * </p>
     * 
     * @param bundleId
     *        The ID of the bundle to use for the bucket.</p>
     *        <p>
     *        A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket.
     *        </p>
     *        <p>
     *        Use the <a>GetBucketBundles</a> action to get a list of bundle IDs that you can specify.
     *        </p>
     *        <p>
     *        Use the <a>UpdateBucketBundle</a> action to change the bundle after the bucket is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBucketRequest withBundleId(String bundleId) {
        setBundleId(bundleId);
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the bucket during creation.
     * </p>
     * <p>
     * Use the <a>TagResource</a> action to tag the bucket after it's created.
     * </p>
     * 
     * @return The tag keys and optional values to add to the bucket during creation.</p>
     *         <p>
     *         Use the <a>TagResource</a> action to tag the bucket after it's created.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the bucket during creation.
     * </p>
     * <p>
     * Use the <a>TagResource</a> action to tag the bucket after it's created.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the bucket during creation.</p>
     *        <p>
     *        Use the <a>TagResource</a> action to tag the bucket after it's created.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag keys and optional values to add to the bucket during creation.
     * </p>
     * <p>
     * Use the <a>TagResource</a> action to tag the bucket after it's created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the bucket during creation.</p>
     *        <p>
     *        Use the <a>TagResource</a> action to tag the bucket after it's created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBucketRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the bucket during creation.
     * </p>
     * <p>
     * Use the <a>TagResource</a> action to tag the bucket after it's created.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the bucket during creation.</p>
     *        <p>
     *        Use the <a>TagResource</a> action to tag the bucket after it's created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBucketRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to enable versioning of objects in the bucket.
     * </p>
     * <p>
     * For more information about versioning, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-managing-bucket-object-versioning"
     * >Enabling and suspending bucket object versioning in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer
     * Guide</i>.
     * </p>
     * 
     * @param enableObjectVersioning
     *        A Boolean value that indicates whether to enable versioning of objects in the bucket.</p>
     *        <p>
     *        For more information about versioning, see <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-managing-bucket-object-versioning"
     *        >Enabling and suspending bucket object versioning in Amazon Lightsail</a> in the <i>Amazon Lightsail
     *        Developer Guide</i>.
     */

    public void setEnableObjectVersioning(Boolean enableObjectVersioning) {
        this.enableObjectVersioning = enableObjectVersioning;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to enable versioning of objects in the bucket.
     * </p>
     * <p>
     * For more information about versioning, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-managing-bucket-object-versioning"
     * >Enabling and suspending bucket object versioning in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer
     * Guide</i>.
     * </p>
     * 
     * @return A Boolean value that indicates whether to enable versioning of objects in the bucket.</p>
     *         <p>
     *         For more information about versioning, see <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-managing-bucket-object-versioning"
     *         >Enabling and suspending bucket object versioning in Amazon Lightsail</a> in the <i>Amazon Lightsail
     *         Developer Guide</i>.
     */

    public Boolean getEnableObjectVersioning() {
        return this.enableObjectVersioning;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to enable versioning of objects in the bucket.
     * </p>
     * <p>
     * For more information about versioning, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-managing-bucket-object-versioning"
     * >Enabling and suspending bucket object versioning in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer
     * Guide</i>.
     * </p>
     * 
     * @param enableObjectVersioning
     *        A Boolean value that indicates whether to enable versioning of objects in the bucket.</p>
     *        <p>
     *        For more information about versioning, see <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-managing-bucket-object-versioning"
     *        >Enabling and suspending bucket object versioning in Amazon Lightsail</a> in the <i>Amazon Lightsail
     *        Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBucketRequest withEnableObjectVersioning(Boolean enableObjectVersioning) {
        setEnableObjectVersioning(enableObjectVersioning);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to enable versioning of objects in the bucket.
     * </p>
     * <p>
     * For more information about versioning, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-managing-bucket-object-versioning"
     * >Enabling and suspending bucket object versioning in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer
     * Guide</i>.
     * </p>
     * 
     * @return A Boolean value that indicates whether to enable versioning of objects in the bucket.</p>
     *         <p>
     *         For more information about versioning, see <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-managing-bucket-object-versioning"
     *         >Enabling and suspending bucket object versioning in Amazon Lightsail</a> in the <i>Amazon Lightsail
     *         Developer Guide</i>.
     */

    public Boolean isEnableObjectVersioning() {
        return this.enableObjectVersioning;
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
            sb.append("BundleId: ").append(getBundleId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getEnableObjectVersioning() != null)
            sb.append("EnableObjectVersioning: ").append(getEnableObjectVersioning());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBucketRequest == false)
            return false;
        CreateBucketRequest other = (CreateBucketRequest) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getEnableObjectVersioning() == null ^ this.getEnableObjectVersioning() == null)
            return false;
        if (other.getEnableObjectVersioning() != null && other.getEnableObjectVersioning().equals(this.getEnableObjectVersioning()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getEnableObjectVersioning() == null) ? 0 : getEnableObjectVersioning().hashCode());
        return hashCode;
    }

    @Override
    public CreateBucketRequest clone() {
        return (CreateBucketRequest) super.clone();
    }

}
