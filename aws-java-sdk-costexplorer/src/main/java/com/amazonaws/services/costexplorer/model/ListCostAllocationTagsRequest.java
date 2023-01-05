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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ListCostAllocationTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCostAllocationTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The status of cost allocation tag keys that are returned for this request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The list of cost allocation tag keys that are returned for this request.
     * </p>
     */
    private java.util.List<String> tagKeys;
    /**
     * <p>
     * The type of <code>CostAllocationTag</code> object that are returned for this request. The
     * <code>AWSGenerated</code> type tags are tags that Amazon Web Services defines and applies to support Amazon Web
     * Services resources for cost allocation purposes. The <code>UserDefined</code> type tags are tags that you define,
     * create, and apply to resources.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of objects that are returned for this request. By default, the request returns 100 results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The status of cost allocation tag keys that are returned for this request.
     * </p>
     * 
     * @param status
     *        The status of cost allocation tag keys that are returned for this request.
     * @see CostAllocationTagStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of cost allocation tag keys that are returned for this request.
     * </p>
     * 
     * @return The status of cost allocation tag keys that are returned for this request.
     * @see CostAllocationTagStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of cost allocation tag keys that are returned for this request.
     * </p>
     * 
     * @param status
     *        The status of cost allocation tag keys that are returned for this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostAllocationTagStatus
     */

    public ListCostAllocationTagsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of cost allocation tag keys that are returned for this request.
     * </p>
     * 
     * @param status
     *        The status of cost allocation tag keys that are returned for this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostAllocationTagStatus
     */

    public ListCostAllocationTagsRequest withStatus(CostAllocationTagStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The list of cost allocation tag keys that are returned for this request.
     * </p>
     * 
     * @return The list of cost allocation tag keys that are returned for this request.
     */

    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * The list of cost allocation tag keys that are returned for this request.
     * </p>
     * 
     * @param tagKeys
     *        The list of cost allocation tag keys that are returned for this request.
     */

    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new java.util.ArrayList<String>(tagKeys);
    }

    /**
     * <p>
     * The list of cost allocation tag keys that are returned for this request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeys(java.util.Collection)} or {@link #withTagKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagKeys
     *        The list of cost allocation tag keys that are returned for this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCostAllocationTagsRequest withTagKeys(String... tagKeys) {
        if (this.tagKeys == null) {
            setTagKeys(new java.util.ArrayList<String>(tagKeys.length));
        }
        for (String ele : tagKeys) {
            this.tagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of cost allocation tag keys that are returned for this request.
     * </p>
     * 
     * @param tagKeys
     *        The list of cost allocation tag keys that are returned for this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCostAllocationTagsRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
        return this;
    }

    /**
     * <p>
     * The type of <code>CostAllocationTag</code> object that are returned for this request. The
     * <code>AWSGenerated</code> type tags are tags that Amazon Web Services defines and applies to support Amazon Web
     * Services resources for cost allocation purposes. The <code>UserDefined</code> type tags are tags that you define,
     * create, and apply to resources.
     * </p>
     * 
     * @param type
     *        The type of <code>CostAllocationTag</code> object that are returned for this request. The
     *        <code>AWSGenerated</code> type tags are tags that Amazon Web Services defines and applies to support
     *        Amazon Web Services resources for cost allocation purposes. The <code>UserDefined</code> type tags are
     *        tags that you define, create, and apply to resources.
     * @see CostAllocationTagType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of <code>CostAllocationTag</code> object that are returned for this request. The
     * <code>AWSGenerated</code> type tags are tags that Amazon Web Services defines and applies to support Amazon Web
     * Services resources for cost allocation purposes. The <code>UserDefined</code> type tags are tags that you define,
     * create, and apply to resources.
     * </p>
     * 
     * @return The type of <code>CostAllocationTag</code> object that are returned for this request. The
     *         <code>AWSGenerated</code> type tags are tags that Amazon Web Services defines and applies to support
     *         Amazon Web Services resources for cost allocation purposes. The <code>UserDefined</code> type tags are
     *         tags that you define, create, and apply to resources.
     * @see CostAllocationTagType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of <code>CostAllocationTag</code> object that are returned for this request. The
     * <code>AWSGenerated</code> type tags are tags that Amazon Web Services defines and applies to support Amazon Web
     * Services resources for cost allocation purposes. The <code>UserDefined</code> type tags are tags that you define,
     * create, and apply to resources.
     * </p>
     * 
     * @param type
     *        The type of <code>CostAllocationTag</code> object that are returned for this request. The
     *        <code>AWSGenerated</code> type tags are tags that Amazon Web Services defines and applies to support
     *        Amazon Web Services resources for cost allocation purposes. The <code>UserDefined</code> type tags are
     *        tags that you define, create, and apply to resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostAllocationTagType
     */

    public ListCostAllocationTagsRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of <code>CostAllocationTag</code> object that are returned for this request. The
     * <code>AWSGenerated</code> type tags are tags that Amazon Web Services defines and applies to support Amazon Web
     * Services resources for cost allocation purposes. The <code>UserDefined</code> type tags are tags that you define,
     * create, and apply to resources.
     * </p>
     * 
     * @param type
     *        The type of <code>CostAllocationTag</code> object that are returned for this request. The
     *        <code>AWSGenerated</code> type tags are tags that Amazon Web Services defines and applies to support
     *        Amazon Web Services resources for cost allocation purposes. The <code>UserDefined</code> type tags are
     *        tags that you define, create, and apply to resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostAllocationTagType
     */

    public ListCostAllocationTagsRequest withType(CostAllocationTagType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *        from a previous call has more results than the maximum page size.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @return The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *         from a previous call has more results than the maximum page size.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *        from a previous call has more results than the maximum page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCostAllocationTagsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of objects that are returned for this request. By default, the request returns 100 results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects that are returned for this request. By default, the request returns 100
     *        results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of objects that are returned for this request. By default, the request returns 100 results.
     * </p>
     * 
     * @return The maximum number of objects that are returned for this request. By default, the request returns 100
     *         results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of objects that are returned for this request. By default, the request returns 100 results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects that are returned for this request. By default, the request returns 100
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCostAllocationTagsRequest withMaxResults(Integer maxResults) {
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTagKeys() != null)
            sb.append("TagKeys: ").append(getTagKeys()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof ListCostAllocationTagsRequest == false)
            return false;
        ListCostAllocationTagsRequest other = (ListCostAllocationTagsRequest) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListCostAllocationTagsRequest clone() {
        return (ListCostAllocationTagsRequest) super.clone();
    }

}
