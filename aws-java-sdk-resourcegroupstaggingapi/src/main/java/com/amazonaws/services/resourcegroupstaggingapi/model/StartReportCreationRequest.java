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
package com.amazonaws.services.resourcegroupstaggingapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/StartReportCreation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartReportCreationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon S3 bucket where the report will be stored; for example:
     * </p>
     * <p>
     * <code>awsexamplebucket</code>
     * </p>
     * <p>
     * For more information on S3 bucket requirements, including an example bucket policy, see the example S3 bucket
     * policy on this page.
     * </p>
     */
    private String s3Bucket;

    /**
     * <p>
     * The name of the Amazon S3 bucket where the report will be stored; for example:
     * </p>
     * <p>
     * <code>awsexamplebucket</code>
     * </p>
     * <p>
     * For more information on S3 bucket requirements, including an example bucket policy, see the example S3 bucket
     * policy on this page.
     * </p>
     * 
     * @param s3Bucket
     *        The name of the Amazon S3 bucket where the report will be stored; for example:</p>
     *        <p>
     *        <code>awsexamplebucket</code>
     *        </p>
     *        <p>
     *        For more information on S3 bucket requirements, including an example bucket policy, see the example S3
     *        bucket policy on this page.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where the report will be stored; for example:
     * </p>
     * <p>
     * <code>awsexamplebucket</code>
     * </p>
     * <p>
     * For more information on S3 bucket requirements, including an example bucket policy, see the example S3 bucket
     * policy on this page.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket where the report will be stored; for example:</p>
     *         <p>
     *         <code>awsexamplebucket</code>
     *         </p>
     *         <p>
     *         For more information on S3 bucket requirements, including an example bucket policy, see the example S3
     *         bucket policy on this page.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where the report will be stored; for example:
     * </p>
     * <p>
     * <code>awsexamplebucket</code>
     * </p>
     * <p>
     * For more information on S3 bucket requirements, including an example bucket policy, see the example S3 bucket
     * policy on this page.
     * </p>
     * 
     * @param s3Bucket
     *        The name of the Amazon S3 bucket where the report will be stored; for example:</p>
     *        <p>
     *        <code>awsexamplebucket</code>
     *        </p>
     *        <p>
     *        For more information on S3 bucket requirements, including an example bucket policy, see the example S3
     *        bucket policy on this page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReportCreationRequest withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
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
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartReportCreationRequest == false)
            return false;
        StartReportCreationRequest other = (StartReportCreationRequest) obj;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        return hashCode;
    }

    @Override
    public StartReportCreationRequest clone() {
        return (StartReportCreationRequest) super.clone();
    }

}
