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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAnalysisPermissions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAnalysisPermissionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS account that contains the analysis whose permissions you're describing. You must be using the
     * AWS account that the analysis is in.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID of the analysis whose permissions you're describing. The ID is part of the analysis URL.
     * </p>
     */
    private String analysisId;

    /**
     * <p>
     * The ID of the AWS account that contains the analysis whose permissions you're describing. You must be using the
     * AWS account that the analysis is in.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the analysis whose permissions you're describing. You must be
     *        using the AWS account that the analysis is in.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the analysis whose permissions you're describing. You must be using the
     * AWS account that the analysis is in.
     * </p>
     * 
     * @return The ID of the AWS account that contains the analysis whose permissions you're describing. You must be
     *         using the AWS account that the analysis is in.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the analysis whose permissions you're describing. You must be using the
     * AWS account that the analysis is in.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the analysis whose permissions you're describing. You must be
     *        using the AWS account that the analysis is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnalysisPermissionsRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID of the analysis whose permissions you're describing. The ID is part of the analysis URL.
     * </p>
     * 
     * @param analysisId
     *        The ID of the analysis whose permissions you're describing. The ID is part of the analysis URL.
     */

    public void setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
    }

    /**
     * <p>
     * The ID of the analysis whose permissions you're describing. The ID is part of the analysis URL.
     * </p>
     * 
     * @return The ID of the analysis whose permissions you're describing. The ID is part of the analysis URL.
     */

    public String getAnalysisId() {
        return this.analysisId;
    }

    /**
     * <p>
     * The ID of the analysis whose permissions you're describing. The ID is part of the analysis URL.
     * </p>
     * 
     * @param analysisId
     *        The ID of the analysis whose permissions you're describing. The ID is part of the analysis URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnalysisPermissionsRequest withAnalysisId(String analysisId) {
        setAnalysisId(analysisId);
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
        if (getAnalysisId() != null)
            sb.append("AnalysisId: ").append(getAnalysisId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAnalysisPermissionsRequest == false)
            return false;
        DescribeAnalysisPermissionsRequest other = (DescribeAnalysisPermissionsRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAnalysisId() == null ^ this.getAnalysisId() == null)
            return false;
        if (other.getAnalysisId() != null && other.getAnalysisId().equals(this.getAnalysisId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAnalysisId() == null) ? 0 : getAnalysisId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAnalysisPermissionsRequest clone() {
        return (DescribeAnalysisPermissionsRequest) super.clone();
    }

}
