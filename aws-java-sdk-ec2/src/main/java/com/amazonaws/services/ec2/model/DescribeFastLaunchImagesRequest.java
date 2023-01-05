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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeFastLaunchImagesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFastLaunchImagesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeFastLaunchImagesRequest> {

    /**
     * <p>
     * Details for one or more Windows AMI image IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> imageIds;
    /**
     * <p>
     * Use the following filters to streamline results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-type</code> - The resource type for pre-provisioning.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-template</code> - The launch template that is associated with the pre-provisioned Windows AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The owner ID for the pre-provisioning resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The current state of fast launching for the Windows AMI.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another request
     * with the returned NextToken value. If this parameter is not specified, then all results are returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Details for one or more Windows AMI image IDs.
     * </p>
     * 
     * @return Details for one or more Windows AMI image IDs.
     */

    public java.util.List<String> getImageIds() {
        if (imageIds == null) {
            imageIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return imageIds;
    }

    /**
     * <p>
     * Details for one or more Windows AMI image IDs.
     * </p>
     * 
     * @param imageIds
     *        Details for one or more Windows AMI image IDs.
     */

    public void setImageIds(java.util.Collection<String> imageIds) {
        if (imageIds == null) {
            this.imageIds = null;
            return;
        }

        this.imageIds = new com.amazonaws.internal.SdkInternalList<String>(imageIds);
    }

    /**
     * <p>
     * Details for one or more Windows AMI image IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageIds(java.util.Collection)} or {@link #withImageIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param imageIds
     *        Details for one or more Windows AMI image IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFastLaunchImagesRequest withImageIds(String... imageIds) {
        if (this.imageIds == null) {
            setImageIds(new com.amazonaws.internal.SdkInternalList<String>(imageIds.length));
        }
        for (String ele : imageIds) {
            this.imageIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details for one or more Windows AMI image IDs.
     * </p>
     * 
     * @param imageIds
     *        Details for one or more Windows AMI image IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFastLaunchImagesRequest withImageIds(java.util.Collection<String> imageIds) {
        setImageIds(imageIds);
        return this;
    }

    /**
     * <p>
     * Use the following filters to streamline results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-type</code> - The resource type for pre-provisioning.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-template</code> - The launch template that is associated with the pre-provisioned Windows AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The owner ID for the pre-provisioning resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The current state of fast launching for the Windows AMI.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Use the following filters to streamline results.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>resource-type</code> - The resource type for pre-provisioning.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch-template</code> - The launch template that is associated with the pre-provisioned Windows
     *         AMI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The owner ID for the pre-provisioning resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The current state of fast launching for the Windows AMI.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * Use the following filters to streamline results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-type</code> - The resource type for pre-provisioning.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-template</code> - The launch template that is associated with the pre-provisioned Windows AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The owner ID for the pre-provisioning resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The current state of fast launching for the Windows AMI.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Use the following filters to streamline results.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>resource-type</code> - The resource type for pre-provisioning.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch-template</code> - The launch template that is associated with the pre-provisioned Windows
     *        AMI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The owner ID for the pre-provisioning resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The current state of fast launching for the Windows AMI.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * Use the following filters to streamline results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-type</code> - The resource type for pre-provisioning.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-template</code> - The launch template that is associated with the pre-provisioned Windows AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The owner ID for the pre-provisioning resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The current state of fast launching for the Windows AMI.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Use the following filters to streamline results.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>resource-type</code> - The resource type for pre-provisioning.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch-template</code> - The launch template that is associated with the pre-provisioned Windows
     *        AMI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The owner ID for the pre-provisioning resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The current state of fast launching for the Windows AMI.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFastLaunchImagesRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Use the following filters to streamline results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-type</code> - The resource type for pre-provisioning.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-template</code> - The launch template that is associated with the pre-provisioned Windows AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The owner ID for the pre-provisioning resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The current state of fast launching for the Windows AMI.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Use the following filters to streamline results.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>resource-type</code> - The resource type for pre-provisioning.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch-template</code> - The launch template that is associated with the pre-provisioned Windows
     *        AMI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The owner ID for the pre-provisioning resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The current state of fast launching for the Windows AMI.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFastLaunchImagesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another request
     * with the returned NextToken value. If this parameter is not specified, then all results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        request with the returned NextToken value. If this parameter is not specified, then all results are
     *        returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another request
     * with the returned NextToken value. If this parameter is not specified, then all results are returned.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *         request with the returned NextToken value. If this parameter is not specified, then all results are
     *         returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another request
     * with the returned NextToken value. If this parameter is not specified, then all results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        request with the returned NextToken value. If this parameter is not specified, then all results are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFastLaunchImagesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @return The token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFastLaunchImagesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeFastLaunchImagesRequest> getDryRunRequest() {
        Request<DescribeFastLaunchImagesRequest> request = new DescribeFastLaunchImagesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getImageIds() != null)
            sb.append("ImageIds: ").append(getImageIds()).append(",");
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

        if (obj instanceof DescribeFastLaunchImagesRequest == false)
            return false;
        DescribeFastLaunchImagesRequest other = (DescribeFastLaunchImagesRequest) obj;
        if (other.getImageIds() == null ^ this.getImageIds() == null)
            return false;
        if (other.getImageIds() != null && other.getImageIds().equals(this.getImageIds()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getImageIds() == null) ? 0 : getImageIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFastLaunchImagesRequest clone() {
        return (DescribeFastLaunchImagesRequest) super.clone();
    }
}
