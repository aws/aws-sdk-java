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
 * The container for the service that will create the S3 manifest.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/S3JobManifestGenerator" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3JobManifestGenerator implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID that owns the bucket the generated manifest is written to. If provided the
     * generated manifest bucket's owner Amazon Web Services account ID must match this value, else the job fails.
     * </p>
     */
    private String expectedBucketOwner;
    /**
     * <p>
     * The source bucket used by the ManifestGenerator.
     * </p>
     */
    private String sourceBucket;
    /**
     * <p>
     * Specifies the location the generated manifest will be written to.
     * </p>
     */
    private S3ManifestOutputLocation manifestOutputLocation;
    /**
     * <p>
     * Specifies rules the S3JobManifestGenerator should use to use to decide whether an object in the source bucket
     * should or should not be included in the generated job manifest.
     * </p>
     */
    private JobManifestGeneratorFilter filter;
    /**
     * <p>
     * Determines whether or not to write the job's generated manifest to a bucket.
     * </p>
     */
    private Boolean enableManifestOutput;

    /**
     * <p>
     * The Amazon Web Services account ID that owns the bucket the generated manifest is written to. If provided the
     * generated manifest bucket's owner Amazon Web Services account ID must match this value, else the job fails.
     * </p>
     * 
     * @param expectedBucketOwner
     *        The Amazon Web Services account ID that owns the bucket the generated manifest is written to. If provided
     *        the generated manifest bucket's owner Amazon Web Services account ID must match this value, else the job
     *        fails.
     */

    public void setExpectedBucketOwner(String expectedBucketOwner) {
        this.expectedBucketOwner = expectedBucketOwner;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that owns the bucket the generated manifest is written to. If provided the
     * generated manifest bucket's owner Amazon Web Services account ID must match this value, else the job fails.
     * </p>
     * 
     * @return The Amazon Web Services account ID that owns the bucket the generated manifest is written to. If provided
     *         the generated manifest bucket's owner Amazon Web Services account ID must match this value, else the job
     *         fails.
     */

    public String getExpectedBucketOwner() {
        return this.expectedBucketOwner;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that owns the bucket the generated manifest is written to. If provided the
     * generated manifest bucket's owner Amazon Web Services account ID must match this value, else the job fails.
     * </p>
     * 
     * @param expectedBucketOwner
     *        The Amazon Web Services account ID that owns the bucket the generated manifest is written to. If provided
     *        the generated manifest bucket's owner Amazon Web Services account ID must match this value, else the job
     *        fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3JobManifestGenerator withExpectedBucketOwner(String expectedBucketOwner) {
        setExpectedBucketOwner(expectedBucketOwner);
        return this;
    }

    /**
     * <p>
     * The source bucket used by the ManifestGenerator.
     * </p>
     * 
     * @param sourceBucket
     *        The source bucket used by the ManifestGenerator.
     */

    public void setSourceBucket(String sourceBucket) {
        this.sourceBucket = sourceBucket;
    }

    /**
     * <p>
     * The source bucket used by the ManifestGenerator.
     * </p>
     * 
     * @return The source bucket used by the ManifestGenerator.
     */

    public String getSourceBucket() {
        return this.sourceBucket;
    }

    /**
     * <p>
     * The source bucket used by the ManifestGenerator.
     * </p>
     * 
     * @param sourceBucket
     *        The source bucket used by the ManifestGenerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3JobManifestGenerator withSourceBucket(String sourceBucket) {
        setSourceBucket(sourceBucket);
        return this;
    }

    /**
     * <p>
     * Specifies the location the generated manifest will be written to.
     * </p>
     * 
     * @param manifestOutputLocation
     *        Specifies the location the generated manifest will be written to.
     */

    public void setManifestOutputLocation(S3ManifestOutputLocation manifestOutputLocation) {
        this.manifestOutputLocation = manifestOutputLocation;
    }

    /**
     * <p>
     * Specifies the location the generated manifest will be written to.
     * </p>
     * 
     * @return Specifies the location the generated manifest will be written to.
     */

    public S3ManifestOutputLocation getManifestOutputLocation() {
        return this.manifestOutputLocation;
    }

    /**
     * <p>
     * Specifies the location the generated manifest will be written to.
     * </p>
     * 
     * @param manifestOutputLocation
     *        Specifies the location the generated manifest will be written to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3JobManifestGenerator withManifestOutputLocation(S3ManifestOutputLocation manifestOutputLocation) {
        setManifestOutputLocation(manifestOutputLocation);
        return this;
    }

    /**
     * <p>
     * Specifies rules the S3JobManifestGenerator should use to use to decide whether an object in the source bucket
     * should or should not be included in the generated job manifest.
     * </p>
     * 
     * @param filter
     *        Specifies rules the S3JobManifestGenerator should use to use to decide whether an object in the source
     *        bucket should or should not be included in the generated job manifest.
     */

    public void setFilter(JobManifestGeneratorFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Specifies rules the S3JobManifestGenerator should use to use to decide whether an object in the source bucket
     * should or should not be included in the generated job manifest.
     * </p>
     * 
     * @return Specifies rules the S3JobManifestGenerator should use to use to decide whether an object in the source
     *         bucket should or should not be included in the generated job manifest.
     */

    public JobManifestGeneratorFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Specifies rules the S3JobManifestGenerator should use to use to decide whether an object in the source bucket
     * should or should not be included in the generated job manifest.
     * </p>
     * 
     * @param filter
     *        Specifies rules the S3JobManifestGenerator should use to use to decide whether an object in the source
     *        bucket should or should not be included in the generated job manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3JobManifestGenerator withFilter(JobManifestGeneratorFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * Determines whether or not to write the job's generated manifest to a bucket.
     * </p>
     * 
     * @param enableManifestOutput
     *        Determines whether or not to write the job's generated manifest to a bucket.
     */

    public void setEnableManifestOutput(Boolean enableManifestOutput) {
        this.enableManifestOutput = enableManifestOutput;
    }

    /**
     * <p>
     * Determines whether or not to write the job's generated manifest to a bucket.
     * </p>
     * 
     * @return Determines whether or not to write the job's generated manifest to a bucket.
     */

    public Boolean getEnableManifestOutput() {
        return this.enableManifestOutput;
    }

    /**
     * <p>
     * Determines whether or not to write the job's generated manifest to a bucket.
     * </p>
     * 
     * @param enableManifestOutput
     *        Determines whether or not to write the job's generated manifest to a bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3JobManifestGenerator withEnableManifestOutput(Boolean enableManifestOutput) {
        setEnableManifestOutput(enableManifestOutput);
        return this;
    }

    /**
     * <p>
     * Determines whether or not to write the job's generated manifest to a bucket.
     * </p>
     * 
     * @return Determines whether or not to write the job's generated manifest to a bucket.
     */

    public Boolean isEnableManifestOutput() {
        return this.enableManifestOutput;
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
        if (getExpectedBucketOwner() != null)
            sb.append("ExpectedBucketOwner: ").append(getExpectedBucketOwner()).append(",");
        if (getSourceBucket() != null)
            sb.append("SourceBucket: ").append(getSourceBucket()).append(",");
        if (getManifestOutputLocation() != null)
            sb.append("ManifestOutputLocation: ").append(getManifestOutputLocation()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getEnableManifestOutput() != null)
            sb.append("EnableManifestOutput: ").append(getEnableManifestOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3JobManifestGenerator == false)
            return false;
        S3JobManifestGenerator other = (S3JobManifestGenerator) obj;
        if (other.getExpectedBucketOwner() == null ^ this.getExpectedBucketOwner() == null)
            return false;
        if (other.getExpectedBucketOwner() != null && other.getExpectedBucketOwner().equals(this.getExpectedBucketOwner()) == false)
            return false;
        if (other.getSourceBucket() == null ^ this.getSourceBucket() == null)
            return false;
        if (other.getSourceBucket() != null && other.getSourceBucket().equals(this.getSourceBucket()) == false)
            return false;
        if (other.getManifestOutputLocation() == null ^ this.getManifestOutputLocation() == null)
            return false;
        if (other.getManifestOutputLocation() != null && other.getManifestOutputLocation().equals(this.getManifestOutputLocation()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getEnableManifestOutput() == null ^ this.getEnableManifestOutput() == null)
            return false;
        if (other.getEnableManifestOutput() != null && other.getEnableManifestOutput().equals(this.getEnableManifestOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpectedBucketOwner() == null) ? 0 : getExpectedBucketOwner().hashCode());
        hashCode = prime * hashCode + ((getSourceBucket() == null) ? 0 : getSourceBucket().hashCode());
        hashCode = prime * hashCode + ((getManifestOutputLocation() == null) ? 0 : getManifestOutputLocation().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getEnableManifestOutput() == null) ? 0 : getEnableManifestOutput().hashCode());
        return hashCode;
    }

    @Override
    public S3JobManifestGenerator clone() {
        try {
            return (S3JobManifestGenerator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
