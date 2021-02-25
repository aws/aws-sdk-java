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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImagePackages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImagePackagesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filter results for the ListImagePackages request by the Image Build Version ARN
     * </p>
     */
    private String imageBuildVersionArn;
    /**
     * <p>
     * The maxiumum number of results to return from the ListImagePackages request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Filter results for the ListImagePackages request by the Image Build Version ARN
     * </p>
     * 
     * @param imageBuildVersionArn
     *        Filter results for the ListImagePackages request by the Image Build Version ARN
     */

    public void setImageBuildVersionArn(String imageBuildVersionArn) {
        this.imageBuildVersionArn = imageBuildVersionArn;
    }

    /**
     * <p>
     * Filter results for the ListImagePackages request by the Image Build Version ARN
     * </p>
     * 
     * @return Filter results for the ListImagePackages request by the Image Build Version ARN
     */

    public String getImageBuildVersionArn() {
        return this.imageBuildVersionArn;
    }

    /**
     * <p>
     * Filter results for the ListImagePackages request by the Image Build Version ARN
     * </p>
     * 
     * @param imageBuildVersionArn
     *        Filter results for the ListImagePackages request by the Image Build Version ARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagePackagesRequest withImageBuildVersionArn(String imageBuildVersionArn) {
        setImageBuildVersionArn(imageBuildVersionArn);
        return this;
    }

    /**
     * <p>
     * The maxiumum number of results to return from the ListImagePackages request.
     * </p>
     * 
     * @param maxResults
     *        The maxiumum number of results to return from the ListImagePackages request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maxiumum number of results to return from the ListImagePackages request.
     * </p>
     * 
     * @return The maxiumum number of results to return from the ListImagePackages request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maxiumum number of results to return from the ListImagePackages request.
     * </p>
     * 
     * @param maxResults
     *        The maxiumum number of results to return from the ListImagePackages request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagePackagesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     * 
     * @return A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagePackagesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getImageBuildVersionArn() != null)
            sb.append("ImageBuildVersionArn: ").append(getImageBuildVersionArn()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListImagePackagesRequest == false)
            return false;
        ListImagePackagesRequest other = (ListImagePackagesRequest) obj;
        if (other.getImageBuildVersionArn() == null ^ this.getImageBuildVersionArn() == null)
            return false;
        if (other.getImageBuildVersionArn() != null && other.getImageBuildVersionArn().equals(this.getImageBuildVersionArn()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageBuildVersionArn() == null) ? 0 : getImageBuildVersionArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListImagePackagesRequest clone() {
        return (ListImagePackagesRequest) super.clone();
    }

}
