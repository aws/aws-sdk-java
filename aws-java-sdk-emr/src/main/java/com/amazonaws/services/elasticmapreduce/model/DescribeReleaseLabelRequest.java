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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DescribeReleaseLabel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReleaseLabelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The target release label to be described.
     * </p>
     */
    private String releaseLabel;
    /**
     * <p>
     * The pagination token. Reserved for future use. Currently set to null.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Reserved for future use. Currently set to null.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The target release label to be described.
     * </p>
     * 
     * @param releaseLabel
     *        The target release label to be described.
     */

    public void setReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
    }

    /**
     * <p>
     * The target release label to be described.
     * </p>
     * 
     * @return The target release label to be described.
     */

    public String getReleaseLabel() {
        return this.releaseLabel;
    }

    /**
     * <p>
     * The target release label to be described.
     * </p>
     * 
     * @param releaseLabel
     *        The target release label to be described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReleaseLabelRequest withReleaseLabel(String releaseLabel) {
        setReleaseLabel(releaseLabel);
        return this;
    }

    /**
     * <p>
     * The pagination token. Reserved for future use. Currently set to null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token. Reserved for future use. Currently set to null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token. Reserved for future use. Currently set to null.
     * </p>
     * 
     * @return The pagination token. Reserved for future use. Currently set to null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token. Reserved for future use. Currently set to null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token. Reserved for future use. Currently set to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReleaseLabelRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Reserved for future use. Currently set to null.
     * </p>
     * 
     * @param maxResults
     *        Reserved for future use. Currently set to null.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Reserved for future use. Currently set to null.
     * </p>
     * 
     * @return Reserved for future use. Currently set to null.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Reserved for future use. Currently set to null.
     * </p>
     * 
     * @param maxResults
     *        Reserved for future use. Currently set to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReleaseLabelRequest withMaxResults(Integer maxResults) {
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
        if (getReleaseLabel() != null)
            sb.append("ReleaseLabel: ").append(getReleaseLabel()).append(",");
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

        if (obj instanceof DescribeReleaseLabelRequest == false)
            return false;
        DescribeReleaseLabelRequest other = (DescribeReleaseLabelRequest) obj;
        if (other.getReleaseLabel() == null ^ this.getReleaseLabel() == null)
            return false;
        if (other.getReleaseLabel() != null && other.getReleaseLabel().equals(this.getReleaseLabel()) == false)
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

        hashCode = prime * hashCode + ((getReleaseLabel() == null) ? 0 : getReleaseLabel().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReleaseLabelRequest clone() {
        return (DescribeReleaseLabelRequest) super.clone();
    }

}
