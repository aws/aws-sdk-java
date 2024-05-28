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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchResourceTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchResourceTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the Amazon Resource Name (ARN) of
     * the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The list of resource types to be used to search tags from. If not provided or if any empty list is provided, this
     * API will search from all supported resource types.
     * </p>
     */
    private java.util.List<String> resourceTypes;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The search criteria to be used to return tags.
     * </p>
     */
    private ResourceTagsSearchCriteria searchCriteria;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the Amazon Resource Name (ARN) of
     * the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the Amazon Resource Name
     *        (ARN) of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the Amazon Resource Name (ARN) of
     * the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the Amazon Resource Name
     *         (ARN) of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the Amazon Resource Name (ARN) of
     * the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the Amazon Resource Name
     *        (ARN) of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourceTagsRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The list of resource types to be used to search tags from. If not provided or if any empty list is provided, this
     * API will search from all supported resource types.
     * </p>
     * 
     * @return The list of resource types to be used to search tags from. If not provided or if any empty list is
     *         provided, this API will search from all supported resource types.
     */

    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * The list of resource types to be used to search tags from. If not provided or if any empty list is provided, this
     * API will search from all supported resource types.
     * </p>
     * 
     * @param resourceTypes
     *        The list of resource types to be used to search tags from. If not provided or if any empty list is
     *        provided, this API will search from all supported resource types.
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new java.util.ArrayList<String>(resourceTypes);
    }

    /**
     * <p>
     * The list of resource types to be used to search tags from. If not provided or if any empty list is provided, this
     * API will search from all supported resource types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        The list of resource types to be used to search tags from. If not provided or if any empty list is
     *        provided, this API will search from all supported resource types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourceTagsRequest withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new java.util.ArrayList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of resource types to be used to search tags from. If not provided or if any empty list is provided, this
     * API will search from all supported resource types.
     * </p>
     * 
     * @param resourceTypes
     *        The list of resource types to be used to search tags from. If not provided or if any empty list is
     *        provided, this API will search from all supported resource types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourceTagsRequest withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourceTagsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @return The maximum number of results to return per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourceTagsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The search criteria to be used to return tags.
     * </p>
     * 
     * @param searchCriteria
     *        The search criteria to be used to return tags.
     */

    public void setSearchCriteria(ResourceTagsSearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    /**
     * <p>
     * The search criteria to be used to return tags.
     * </p>
     * 
     * @return The search criteria to be used to return tags.
     */

    public ResourceTagsSearchCriteria getSearchCriteria() {
        return this.searchCriteria;
    }

    /**
     * <p>
     * The search criteria to be used to return tags.
     * </p>
     * 
     * @param searchCriteria
     *        The search criteria to be used to return tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourceTagsRequest withSearchCriteria(ResourceTagsSearchCriteria searchCriteria) {
        setSearchCriteria(searchCriteria);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getSearchCriteria() != null)
            sb.append("SearchCriteria: ").append(getSearchCriteria());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchResourceTagsRequest == false)
            return false;
        SearchResourceTagsRequest other = (SearchResourceTagsRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getSearchCriteria() == null ^ this.getSearchCriteria() == null)
            return false;
        if (other.getSearchCriteria() != null && other.getSearchCriteria().equals(this.getSearchCriteria()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getSearchCriteria() == null) ? 0 : getSearchCriteria().hashCode());
        return hashCode;
    }

    @Override
    public SearchResourceTagsRequest clone() {
        return (SearchResourceTagsRequest) super.clone();
    }

}
