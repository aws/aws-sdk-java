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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAssetBundleImportJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssetBundleImportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account the import job was executed in.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID of the job. The job ID is set when you start a new job with a <code>StartAssetBundleImportJob</code> API
     * call.
     * </p>
     */
    private String assetBundleImportJobId;

    /**
     * <p>
     * The ID of the Amazon Web Services account the import job was executed in.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account the import job was executed in.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account the import job was executed in.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account the import job was executed in.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account the import job was executed in.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account the import job was executed in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleImportJobRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID of the job. The job ID is set when you start a new job with a <code>StartAssetBundleImportJob</code> API
     * call.
     * </p>
     * 
     * @param assetBundleImportJobId
     *        The ID of the job. The job ID is set when you start a new job with a
     *        <code>StartAssetBundleImportJob</code> API call.
     */

    public void setAssetBundleImportJobId(String assetBundleImportJobId) {
        this.assetBundleImportJobId = assetBundleImportJobId;
    }

    /**
     * <p>
     * The ID of the job. The job ID is set when you start a new job with a <code>StartAssetBundleImportJob</code> API
     * call.
     * </p>
     * 
     * @return The ID of the job. The job ID is set when you start a new job with a
     *         <code>StartAssetBundleImportJob</code> API call.
     */

    public String getAssetBundleImportJobId() {
        return this.assetBundleImportJobId;
    }

    /**
     * <p>
     * The ID of the job. The job ID is set when you start a new job with a <code>StartAssetBundleImportJob</code> API
     * call.
     * </p>
     * 
     * @param assetBundleImportJobId
     *        The ID of the job. The job ID is set when you start a new job with a
     *        <code>StartAssetBundleImportJob</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleImportJobRequest withAssetBundleImportJobId(String assetBundleImportJobId) {
        setAssetBundleImportJobId(assetBundleImportJobId);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getAssetBundleImportJobId() != null)
            sb.append("AssetBundleImportJobId: ").append(getAssetBundleImportJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAssetBundleImportJobRequest == false)
            return false;
        DescribeAssetBundleImportJobRequest other = (DescribeAssetBundleImportJobRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAssetBundleImportJobId() == null ^ this.getAssetBundleImportJobId() == null)
            return false;
        if (other.getAssetBundleImportJobId() != null && other.getAssetBundleImportJobId().equals(this.getAssetBundleImportJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAssetBundleImportJobId() == null) ? 0 : getAssetBundleImportJobId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAssetBundleImportJobRequest clone() {
        return (DescribeAssetBundleImportJobRequest) super.clone();
    }

}
