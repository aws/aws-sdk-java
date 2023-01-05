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
package com.amazonaws.services.resourceexplorer2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/ListIndexes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIndexesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results that you want included on each page of the response. If you do not include this
     * parameter, it defaults to a value appropriate to the operation. If additional items exist beyond those included
     * in the current response, the <code>NextToken</code> response element is present and has a value (is not null).
     * Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the
     * next part of the results.
     * </p>
     * <note>
     * <p>
     * An API operation can return fewer results than the maximum even when there are more results available. You should
     * check <code>NextToken</code> after every operation to ensure that you receive all of the results.
     * </p>
     * </note>
     */
    private Integer maxResults;
    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value of the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * If specified, limits the response to only information about the index in the specified list of Amazon Web
     * Services Regions.
     * </p>
     */
    private java.util.List<String> regions;
    /**
     * <p>
     * If specified, limits the output to only indexes of the specified Type, either <code>LOCAL</code> or
     * <code>AGGREGATOR</code>.
     * </p>
     * <p>
     * Use this option to discover the aggregator index for your account.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The maximum number of results that you want included on each page of the response. If you do not include this
     * parameter, it defaults to a value appropriate to the operation. If additional items exist beyond those included
     * in the current response, the <code>NextToken</code> response element is present and has a value (is not null).
     * Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the
     * next part of the results.
     * </p>
     * <note>
     * <p>
     * An API operation can return fewer results than the maximum even when there are more results available. You should
     * check <code>NextToken</code> after every operation to ensure that you receive all of the results.
     * </p>
     * </note>
     * 
     * @param maxResults
     *        The maximum number of results that you want included on each page of the response. If you do not include
     *        this parameter, it defaults to a value appropriate to the operation. If additional items exist beyond
     *        those included in the current response, the <code>NextToken</code> response element is present and has a
     *        value (is not null). Include that value as the <code>NextToken</code> request parameter in the next call
     *        to the operation to get the next part of the results.</p> <note>
     *        <p>
     *        An API operation can return fewer results than the maximum even when there are more results available. You
     *        should check <code>NextToken</code> after every operation to ensure that you receive all of the results.
     *        </p>
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results that you want included on each page of the response. If you do not include this
     * parameter, it defaults to a value appropriate to the operation. If additional items exist beyond those included
     * in the current response, the <code>NextToken</code> response element is present and has a value (is not null).
     * Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the
     * next part of the results.
     * </p>
     * <note>
     * <p>
     * An API operation can return fewer results than the maximum even when there are more results available. You should
     * check <code>NextToken</code> after every operation to ensure that you receive all of the results.
     * </p>
     * </note>
     * 
     * @return The maximum number of results that you want included on each page of the response. If you do not include
     *         this parameter, it defaults to a value appropriate to the operation. If additional items exist beyond
     *         those included in the current response, the <code>NextToken</code> response element is present and has a
     *         value (is not null). Include that value as the <code>NextToken</code> request parameter in the next call
     *         to the operation to get the next part of the results.</p> <note>
     *         <p>
     *         An API operation can return fewer results than the maximum even when there are more results available.
     *         You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     *         results.
     *         </p>
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results that you want included on each page of the response. If you do not include this
     * parameter, it defaults to a value appropriate to the operation. If additional items exist beyond those included
     * in the current response, the <code>NextToken</code> response element is present and has a value (is not null).
     * Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the
     * next part of the results.
     * </p>
     * <note>
     * <p>
     * An API operation can return fewer results than the maximum even when there are more results available. You should
     * check <code>NextToken</code> after every operation to ensure that you receive all of the results.
     * </p>
     * </note>
     * 
     * @param maxResults
     *        The maximum number of results that you want included on each page of the response. If you do not include
     *        this parameter, it defaults to a value appropriate to the operation. If additional items exist beyond
     *        those included in the current response, the <code>NextToken</code> response element is present and has a
     *        value (is not null). Include that value as the <code>NextToken</code> request parameter in the next call
     *        to the operation to get the next part of the results.</p> <note>
     *        <p>
     *        An API operation can return fewer results than the maximum even when there are more results available. You
     *        should check <code>NextToken</code> after every operation to ensure that you receive all of the results.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndexesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value of the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @param nextToken
     *        The parameter for receiving additional results if you receive a <code>NextToken</code> response in a
     *        previous request. A <code>NextToken</code> response indicates that more output is available. Set this
     *        parameter to the value of the previous call's <code>NextToken</code> response to indicate where the output
     *        should continue from.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value of the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @return The parameter for receiving additional results if you receive a <code>NextToken</code> response in a
     *         previous request. A <code>NextToken</code> response indicates that more output is available. Set this
     *         parameter to the value of the previous call's <code>NextToken</code> response to indicate where the
     *         output should continue from.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value of the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @param nextToken
     *        The parameter for receiving additional results if you receive a <code>NextToken</code> response in a
     *        previous request. A <code>NextToken</code> response indicates that more output is available. Set this
     *        parameter to the value of the previous call's <code>NextToken</code> response to indicate where the output
     *        should continue from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndexesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * If specified, limits the response to only information about the index in the specified list of Amazon Web
     * Services Regions.
     * </p>
     * 
     * @return If specified, limits the response to only information about the index in the specified list of Amazon Web
     *         Services Regions.
     */

    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * <p>
     * If specified, limits the response to only information about the index in the specified list of Amazon Web
     * Services Regions.
     * </p>
     * 
     * @param regions
     *        If specified, limits the response to only information about the index in the specified list of Amazon Web
     *        Services Regions.
     */

    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new java.util.ArrayList<String>(regions);
    }

    /**
     * <p>
     * If specified, limits the response to only information about the index in the specified list of Amazon Web
     * Services Regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        If specified, limits the response to only information about the index in the specified list of Amazon Web
     *        Services Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndexesRequest withRegions(String... regions) {
        if (this.regions == null) {
            setRegions(new java.util.ArrayList<String>(regions.length));
        }
        for (String ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If specified, limits the response to only information about the index in the specified list of Amazon Web
     * Services Regions.
     * </p>
     * 
     * @param regions
     *        If specified, limits the response to only information about the index in the specified list of Amazon Web
     *        Services Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndexesRequest withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * <p>
     * If specified, limits the output to only indexes of the specified Type, either <code>LOCAL</code> or
     * <code>AGGREGATOR</code>.
     * </p>
     * <p>
     * Use this option to discover the aggregator index for your account.
     * </p>
     * 
     * @param type
     *        If specified, limits the output to only indexes of the specified Type, either <code>LOCAL</code> or
     *        <code>AGGREGATOR</code>.</p>
     *        <p>
     *        Use this option to discover the aggregator index for your account.
     * @see IndexType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * If specified, limits the output to only indexes of the specified Type, either <code>LOCAL</code> or
     * <code>AGGREGATOR</code>.
     * </p>
     * <p>
     * Use this option to discover the aggregator index for your account.
     * </p>
     * 
     * @return If specified, limits the output to only indexes of the specified Type, either <code>LOCAL</code> or
     *         <code>AGGREGATOR</code>.</p>
     *         <p>
     *         Use this option to discover the aggregator index for your account.
     * @see IndexType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * If specified, limits the output to only indexes of the specified Type, either <code>LOCAL</code> or
     * <code>AGGREGATOR</code>.
     * </p>
     * <p>
     * Use this option to discover the aggregator index for your account.
     * </p>
     * 
     * @param type
     *        If specified, limits the output to only indexes of the specified Type, either <code>LOCAL</code> or
     *        <code>AGGREGATOR</code>.</p>
     *        <p>
     *        Use this option to discover the aggregator index for your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexType
     */

    public ListIndexesRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * If specified, limits the output to only indexes of the specified Type, either <code>LOCAL</code> or
     * <code>AGGREGATOR</code>.
     * </p>
     * <p>
     * Use this option to discover the aggregator index for your account.
     * </p>
     * 
     * @param type
     *        If specified, limits the output to only indexes of the specified Type, either <code>LOCAL</code> or
     *        <code>AGGREGATOR</code>.</p>
     *        <p>
     *        Use this option to discover the aggregator index for your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexType
     */

    public ListIndexesRequest withType(IndexType type) {
        this.type = type.toString();
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIndexesRequest == false)
            return false;
        ListIndexesRequest other = (ListIndexesRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ListIndexesRequest clone() {
        return (ListIndexesRequest) super.clone();
    }

}
