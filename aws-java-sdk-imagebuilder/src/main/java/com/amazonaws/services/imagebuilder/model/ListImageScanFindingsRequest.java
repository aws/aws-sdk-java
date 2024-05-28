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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImageScanFindings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImageScanFindingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of name value pairs that you can use to filter your results. You can use the following filters to
     * streamline results:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>imageBuildVersionArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>imagePipelineArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vulnerabilityId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>severity</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't request a filter, then all findings in your account are listed.
     * </p>
     */
    private java.util.List<ImageScanFindingsFilter> filters;
    /**
     * <p>
     * The maximum items to return in a request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of name value pairs that you can use to filter your results. You can use the following filters to
     * streamline results:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>imageBuildVersionArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>imagePipelineArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vulnerabilityId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>severity</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't request a filter, then all findings in your account are listed.
     * </p>
     * 
     * @return An array of name value pairs that you can use to filter your results. You can use the following filters
     *         to streamline results:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>imageBuildVersionArn</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>imagePipelineArn</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vulnerabilityId</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>severity</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't request a filter, then all findings in your account are listed.
     */

    public java.util.List<ImageScanFindingsFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An array of name value pairs that you can use to filter your results. You can use the following filters to
     * streamline results:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>imageBuildVersionArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>imagePipelineArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vulnerabilityId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>severity</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't request a filter, then all findings in your account are listed.
     * </p>
     * 
     * @param filters
     *        An array of name value pairs that you can use to filter your results. You can use the following filters to
     *        streamline results:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>imageBuildVersionArn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>imagePipelineArn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vulnerabilityId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>severity</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't request a filter, then all findings in your account are listed.
     */

    public void setFilters(java.util.Collection<ImageScanFindingsFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<ImageScanFindingsFilter>(filters);
    }

    /**
     * <p>
     * An array of name value pairs that you can use to filter your results. You can use the following filters to
     * streamline results:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>imageBuildVersionArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>imagePipelineArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vulnerabilityId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>severity</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't request a filter, then all findings in your account are listed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An array of name value pairs that you can use to filter your results. You can use the following filters to
     *        streamline results:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>imageBuildVersionArn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>imagePipelineArn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vulnerabilityId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>severity</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't request a filter, then all findings in your account are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImageScanFindingsRequest withFilters(ImageScanFindingsFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<ImageScanFindingsFilter>(filters.length));
        }
        for (ImageScanFindingsFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of name value pairs that you can use to filter your results. You can use the following filters to
     * streamline results:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>imageBuildVersionArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>imagePipelineArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vulnerabilityId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>severity</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't request a filter, then all findings in your account are listed.
     * </p>
     * 
     * @param filters
     *        An array of name value pairs that you can use to filter your results. You can use the following filters to
     *        streamline results:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>imageBuildVersionArn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>imagePipelineArn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vulnerabilityId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>severity</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't request a filter, then all findings in your account are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImageScanFindingsRequest withFilters(java.util.Collection<ImageScanFindingsFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum items to return in a request.
     * </p>
     * 
     * @param maxResults
     *        The maximum items to return in a request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum items to return in a request.
     * </p>
     * 
     * @return The maximum items to return in a request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum items to return in a request.
     * </p>
     * 
     * @param maxResults
     *        The maximum items to return in a request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImageScanFindingsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start paginating. This is the nextToken from a previously truncated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
     * </p>
     * 
     * @return A token to specify where to start paginating. This is the nextToken from a previously truncated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start paginating. This is the nextToken from a previously truncated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImageScanFindingsRequest withNextToken(String nextToken) {
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof ListImageScanFindingsRequest == false)
            return false;
        ListImageScanFindingsRequest other = (ListImageScanFindingsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListImageScanFindingsRequest clone() {
        return (ListImageScanFindingsRequest) super.clone();
    }

}
