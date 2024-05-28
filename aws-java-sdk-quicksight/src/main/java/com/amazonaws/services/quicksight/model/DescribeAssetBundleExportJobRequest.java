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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAssetBundleExportJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssetBundleExportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account the export job is executed in.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID of the job that you want described. The job ID is set when you start a new job with a
     * <code>StartAssetBundleExportJob</code> API call.
     * </p>
     */
    private String assetBundleExportJobId;

    /**
     * <p>
     * The ID of the Amazon Web Services account the export job is executed in.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account the export job is executed in.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account the export job is executed in.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account the export job is executed in.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account the export job is executed in.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account the export job is executed in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleExportJobRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID of the job that you want described. The job ID is set when you start a new job with a
     * <code>StartAssetBundleExportJob</code> API call.
     * </p>
     * 
     * @param assetBundleExportJobId
     *        The ID of the job that you want described. The job ID is set when you start a new job with a
     *        <code>StartAssetBundleExportJob</code> API call.
     */

    public void setAssetBundleExportJobId(String assetBundleExportJobId) {
        this.assetBundleExportJobId = assetBundleExportJobId;
    }

    /**
     * <p>
     * The ID of the job that you want described. The job ID is set when you start a new job with a
     * <code>StartAssetBundleExportJob</code> API call.
     * </p>
     * 
     * @return The ID of the job that you want described. The job ID is set when you start a new job with a
     *         <code>StartAssetBundleExportJob</code> API call.
     */

    public String getAssetBundleExportJobId() {
        return this.assetBundleExportJobId;
    }

    /**
     * <p>
     * The ID of the job that you want described. The job ID is set when you start a new job with a
     * <code>StartAssetBundleExportJob</code> API call.
     * </p>
     * 
     * @param assetBundleExportJobId
     *        The ID of the job that you want described. The job ID is set when you start a new job with a
     *        <code>StartAssetBundleExportJob</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleExportJobRequest withAssetBundleExportJobId(String assetBundleExportJobId) {
        setAssetBundleExportJobId(assetBundleExportJobId);
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
        if (getAssetBundleExportJobId() != null)
            sb.append("AssetBundleExportJobId: ").append(getAssetBundleExportJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAssetBundleExportJobRequest == false)
            return false;
        DescribeAssetBundleExportJobRequest other = (DescribeAssetBundleExportJobRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAssetBundleExportJobId() == null ^ this.getAssetBundleExportJobId() == null)
            return false;
        if (other.getAssetBundleExportJobId() != null && other.getAssetBundleExportJobId().equals(this.getAssetBundleExportJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAssetBundleExportJobId() == null) ? 0 : getAssetBundleExportJobId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAssetBundleExportJobRequest clone() {
        return (DescribeAssetBundleExportJobRequest) super.clone();
    }

}
