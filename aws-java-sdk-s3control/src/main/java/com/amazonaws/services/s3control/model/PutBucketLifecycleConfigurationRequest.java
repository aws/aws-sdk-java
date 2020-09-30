/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutBucketLifecycleConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutBucketLifecycleConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID of the Outposts bucket.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The name of the bucket for which to set the configuration.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * Container for lifecycle rules. You can add as many as 1,000 rules.
     * </p>
     */
    private LifecycleConfiguration lifecycleConfiguration;

    /**
     * <p>
     * The AWS account ID of the Outposts bucket.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID of the Outposts bucket.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID of the Outposts bucket.
     * </p>
     * 
     * @return The AWS account ID of the Outposts bucket.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS account ID of the Outposts bucket.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID of the Outposts bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBucketLifecycleConfigurationRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The name of the bucket for which to set the configuration.
     * </p>
     * 
     * @param bucket
     *        The name of the bucket for which to set the configuration.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket for which to set the configuration.
     * </p>
     * 
     * @return The name of the bucket for which to set the configuration.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the bucket for which to set the configuration.
     * </p>
     * 
     * @param bucket
     *        The name of the bucket for which to set the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBucketLifecycleConfigurationRequest withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * Container for lifecycle rules. You can add as many as 1,000 rules.
     * </p>
     * 
     * @param lifecycleConfiguration
     *        Container for lifecycle rules. You can add as many as 1,000 rules.
     */

    public void setLifecycleConfiguration(LifecycleConfiguration lifecycleConfiguration) {
        this.lifecycleConfiguration = lifecycleConfiguration;
    }

    /**
     * <p>
     * Container for lifecycle rules. You can add as many as 1,000 rules.
     * </p>
     * 
     * @return Container for lifecycle rules. You can add as many as 1,000 rules.
     */

    public LifecycleConfiguration getLifecycleConfiguration() {
        return this.lifecycleConfiguration;
    }

    /**
     * <p>
     * Container for lifecycle rules. You can add as many as 1,000 rules.
     * </p>
     * 
     * @param lifecycleConfiguration
     *        Container for lifecycle rules. You can add as many as 1,000 rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBucketLifecycleConfigurationRequest withLifecycleConfiguration(LifecycleConfiguration lifecycleConfiguration) {
        setLifecycleConfiguration(lifecycleConfiguration);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getLifecycleConfiguration() != null)
            sb.append("LifecycleConfiguration: ").append(getLifecycleConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBucketLifecycleConfigurationRequest == false)
            return false;
        PutBucketLifecycleConfigurationRequest other = (PutBucketLifecycleConfigurationRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getLifecycleConfiguration() == null ^ this.getLifecycleConfiguration() == null)
            return false;
        if (other.getLifecycleConfiguration() != null && other.getLifecycleConfiguration().equals(this.getLifecycleConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getLifecycleConfiguration() == null) ? 0 : getLifecycleConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PutBucketLifecycleConfigurationRequest clone() {
        return (PutBucketLifecycleConfigurationRequest) super.clone();
    }

}
