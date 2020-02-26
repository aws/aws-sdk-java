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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeStandardsControls"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStandardsControlsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of a resource that represents your subscription to a supported standard.
     * </p>
     */
    private String standardsSubscriptionArn;
    /**
     * <p>
     * The token that is required for pagination. On your first call to the <code>DescribeStandardsControls</code>
     * operation, set the value of this parameter to <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value
     * returned from the previous response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of security standard controls to return.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ARN of a resource that represents your subscription to a supported standard.
     * </p>
     * 
     * @param standardsSubscriptionArn
     *        The ARN of a resource that represents your subscription to a supported standard.
     */

    public void setStandardsSubscriptionArn(String standardsSubscriptionArn) {
        this.standardsSubscriptionArn = standardsSubscriptionArn;
    }

    /**
     * <p>
     * The ARN of a resource that represents your subscription to a supported standard.
     * </p>
     * 
     * @return The ARN of a resource that represents your subscription to a supported standard.
     */

    public String getStandardsSubscriptionArn() {
        return this.standardsSubscriptionArn;
    }

    /**
     * <p>
     * The ARN of a resource that represents your subscription to a supported standard.
     * </p>
     * 
     * @param standardsSubscriptionArn
     *        The ARN of a resource that represents your subscription to a supported standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStandardsControlsRequest withStandardsSubscriptionArn(String standardsSubscriptionArn) {
        setStandardsSubscriptionArn(standardsSubscriptionArn);
        return this;
    }

    /**
     * <p>
     * The token that is required for pagination. On your first call to the <code>DescribeStandardsControls</code>
     * operation, set the value of this parameter to <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value
     * returned from the previous response.
     * </p>
     * 
     * @param nextToken
     *        The token that is required for pagination. On your first call to the
     *        <code>DescribeStandardsControls</code> operation, set the value of this parameter to <code>NULL</code>
     *        .</p>
     *        <p>
     *        For subsequent calls to the operation, to continue listing data, set the value of this parameter to the
     *        value returned from the previous response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that is required for pagination. On your first call to the <code>DescribeStandardsControls</code>
     * operation, set the value of this parameter to <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value
     * returned from the previous response.
     * </p>
     * 
     * @return The token that is required for pagination. On your first call to the
     *         <code>DescribeStandardsControls</code> operation, set the value of this parameter to <code>NULL</code>
     *         .</p>
     *         <p>
     *         For subsequent calls to the operation, to continue listing data, set the value of this parameter to the
     *         value returned from the previous response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that is required for pagination. On your first call to the <code>DescribeStandardsControls</code>
     * operation, set the value of this parameter to <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value
     * returned from the previous response.
     * </p>
     * 
     * @param nextToken
     *        The token that is required for pagination. On your first call to the
     *        <code>DescribeStandardsControls</code> operation, set the value of this parameter to <code>NULL</code>
     *        .</p>
     *        <p>
     *        For subsequent calls to the operation, to continue listing data, set the value of this parameter to the
     *        value returned from the previous response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStandardsControlsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of security standard controls to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of security standard controls to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of security standard controls to return.
     * </p>
     * 
     * @return The maximum number of security standard controls to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of security standard controls to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of security standard controls to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStandardsControlsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getStandardsSubscriptionArn() != null)
            sb.append("StandardsSubscriptionArn: ").append(getStandardsSubscriptionArn()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStandardsControlsRequest == false)
            return false;
        DescribeStandardsControlsRequest other = (DescribeStandardsControlsRequest) obj;
        if (other.getStandardsSubscriptionArn() == null ^ this.getStandardsSubscriptionArn() == null)
            return false;
        if (other.getStandardsSubscriptionArn() != null && other.getStandardsSubscriptionArn().equals(this.getStandardsSubscriptionArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStandardsSubscriptionArn() == null) ? 0 : getStandardsSubscriptionArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStandardsControlsRequest clone() {
        return (DescribeStandardsControlsRequest) super.clone();
    }

}
