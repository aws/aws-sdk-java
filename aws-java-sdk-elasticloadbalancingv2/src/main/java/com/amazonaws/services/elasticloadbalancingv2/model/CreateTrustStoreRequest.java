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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/CreateTrustStore"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrustStoreRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the trust store.
     * </p>
     * <p>
     * This name must be unique per region and cannot be changed after creation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon S3 bucket for the ca certificates bundle.
     * </p>
     */
    private String caCertificatesBundleS3Bucket;
    /**
     * <p>
     * The Amazon S3 path for the ca certificates bundle.
     * </p>
     */
    private String caCertificatesBundleS3Key;
    /**
     * <p>
     * The Amazon S3 object version for the ca certificates bundle. If undefined the current version is used.
     * </p>
     */
    private String caCertificatesBundleS3ObjectVersion;
    /**
     * <p>
     * The tags to assign to the trust store.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the trust store.
     * </p>
     * <p>
     * This name must be unique per region and cannot be changed after creation.
     * </p>
     * 
     * @param name
     *        The name of the trust store.</p>
     *        <p>
     *        This name must be unique per region and cannot be changed after creation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the trust store.
     * </p>
     * <p>
     * This name must be unique per region and cannot be changed after creation.
     * </p>
     * 
     * @return The name of the trust store.</p>
     *         <p>
     *         This name must be unique per region and cannot be changed after creation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the trust store.
     * </p>
     * <p>
     * This name must be unique per region and cannot be changed after creation.
     * </p>
     * 
     * @param name
     *        The name of the trust store.</p>
     *        <p>
     *        This name must be unique per region and cannot be changed after creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustStoreRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket for the ca certificates bundle.
     * </p>
     * 
     * @param caCertificatesBundleS3Bucket
     *        The Amazon S3 bucket for the ca certificates bundle.
     */

    public void setCaCertificatesBundleS3Bucket(String caCertificatesBundleS3Bucket) {
        this.caCertificatesBundleS3Bucket = caCertificatesBundleS3Bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket for the ca certificates bundle.
     * </p>
     * 
     * @return The Amazon S3 bucket for the ca certificates bundle.
     */

    public String getCaCertificatesBundleS3Bucket() {
        return this.caCertificatesBundleS3Bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket for the ca certificates bundle.
     * </p>
     * 
     * @param caCertificatesBundleS3Bucket
     *        The Amazon S3 bucket for the ca certificates bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustStoreRequest withCaCertificatesBundleS3Bucket(String caCertificatesBundleS3Bucket) {
        setCaCertificatesBundleS3Bucket(caCertificatesBundleS3Bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 path for the ca certificates bundle.
     * </p>
     * 
     * @param caCertificatesBundleS3Key
     *        The Amazon S3 path for the ca certificates bundle.
     */

    public void setCaCertificatesBundleS3Key(String caCertificatesBundleS3Key) {
        this.caCertificatesBundleS3Key = caCertificatesBundleS3Key;
    }

    /**
     * <p>
     * The Amazon S3 path for the ca certificates bundle.
     * </p>
     * 
     * @return The Amazon S3 path for the ca certificates bundle.
     */

    public String getCaCertificatesBundleS3Key() {
        return this.caCertificatesBundleS3Key;
    }

    /**
     * <p>
     * The Amazon S3 path for the ca certificates bundle.
     * </p>
     * 
     * @param caCertificatesBundleS3Key
     *        The Amazon S3 path for the ca certificates bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustStoreRequest withCaCertificatesBundleS3Key(String caCertificatesBundleS3Key) {
        setCaCertificatesBundleS3Key(caCertificatesBundleS3Key);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 object version for the ca certificates bundle. If undefined the current version is used.
     * </p>
     * 
     * @param caCertificatesBundleS3ObjectVersion
     *        The Amazon S3 object version for the ca certificates bundle. If undefined the current version is used.
     */

    public void setCaCertificatesBundleS3ObjectVersion(String caCertificatesBundleS3ObjectVersion) {
        this.caCertificatesBundleS3ObjectVersion = caCertificatesBundleS3ObjectVersion;
    }

    /**
     * <p>
     * The Amazon S3 object version for the ca certificates bundle. If undefined the current version is used.
     * </p>
     * 
     * @return The Amazon S3 object version for the ca certificates bundle. If undefined the current version is used.
     */

    public String getCaCertificatesBundleS3ObjectVersion() {
        return this.caCertificatesBundleS3ObjectVersion;
    }

    /**
     * <p>
     * The Amazon S3 object version for the ca certificates bundle. If undefined the current version is used.
     * </p>
     * 
     * @param caCertificatesBundleS3ObjectVersion
     *        The Amazon S3 object version for the ca certificates bundle. If undefined the current version is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustStoreRequest withCaCertificatesBundleS3ObjectVersion(String caCertificatesBundleS3ObjectVersion) {
        setCaCertificatesBundleS3ObjectVersion(caCertificatesBundleS3ObjectVersion);
        return this;
    }

    /**
     * <p>
     * The tags to assign to the trust store.
     * </p>
     * 
     * @return The tags to assign to the trust store.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to assign to the trust store.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the trust store.
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
     * The tags to assign to the trust store.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the trust store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustStoreRequest withTags(Tag... tags) {
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
     * The tags to assign to the trust store.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the trust store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustStoreRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCaCertificatesBundleS3Bucket() != null)
            sb.append("CaCertificatesBundleS3Bucket: ").append(getCaCertificatesBundleS3Bucket()).append(",");
        if (getCaCertificatesBundleS3Key() != null)
            sb.append("CaCertificatesBundleS3Key: ").append(getCaCertificatesBundleS3Key()).append(",");
        if (getCaCertificatesBundleS3ObjectVersion() != null)
            sb.append("CaCertificatesBundleS3ObjectVersion: ").append(getCaCertificatesBundleS3ObjectVersion()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrustStoreRequest == false)
            return false;
        CreateTrustStoreRequest other = (CreateTrustStoreRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCaCertificatesBundleS3Bucket() == null ^ this.getCaCertificatesBundleS3Bucket() == null)
            return false;
        if (other.getCaCertificatesBundleS3Bucket() != null && other.getCaCertificatesBundleS3Bucket().equals(this.getCaCertificatesBundleS3Bucket()) == false)
            return false;
        if (other.getCaCertificatesBundleS3Key() == null ^ this.getCaCertificatesBundleS3Key() == null)
            return false;
        if (other.getCaCertificatesBundleS3Key() != null && other.getCaCertificatesBundleS3Key().equals(this.getCaCertificatesBundleS3Key()) == false)
            return false;
        if (other.getCaCertificatesBundleS3ObjectVersion() == null ^ this.getCaCertificatesBundleS3ObjectVersion() == null)
            return false;
        if (other.getCaCertificatesBundleS3ObjectVersion() != null
                && other.getCaCertificatesBundleS3ObjectVersion().equals(this.getCaCertificatesBundleS3ObjectVersion()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCaCertificatesBundleS3Bucket() == null) ? 0 : getCaCertificatesBundleS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getCaCertificatesBundleS3Key() == null) ? 0 : getCaCertificatesBundleS3Key().hashCode());
        hashCode = prime * hashCode + ((getCaCertificatesBundleS3ObjectVersion() == null) ? 0 : getCaCertificatesBundleS3ObjectVersion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrustStoreRequest clone() {
        return (CreateTrustStoreRequest) super.clone();
    }

}
