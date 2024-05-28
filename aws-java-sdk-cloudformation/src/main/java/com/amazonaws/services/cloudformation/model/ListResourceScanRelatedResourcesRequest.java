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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListResourceScanRelatedResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceScanRelatedResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource scan.
     * </p>
     */
    private String resourceScanId;
    /**
     * <p>
     * The list of resources for which you want to get the related resources. Up to 100 resources can be provided.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ScannedResourceIdentifier> resources;
    /**
     * <p>
     * A string that identifies the next page of resource scan results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * If the number of available results exceeds this maximum, the response includes a <code>NextToken</code> value
     * that you can use for the <code>NextToken</code> parameter to get the next set of results. By default the
     * <code>ListResourceScanRelatedResources</code> API action will return up to 100 results in each response. The
     * maximum value is 100.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource scan.
     * </p>
     * 
     * @param resourceScanId
     *        The Amazon Resource Name (ARN) of the resource scan.
     */

    public void setResourceScanId(String resourceScanId) {
        this.resourceScanId = resourceScanId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource scan.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource scan.
     */

    public String getResourceScanId() {
        return this.resourceScanId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource scan.
     * </p>
     * 
     * @param resourceScanId
     *        The Amazon Resource Name (ARN) of the resource scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceScanRelatedResourcesRequest withResourceScanId(String resourceScanId) {
        setResourceScanId(resourceScanId);
        return this;
    }

    /**
     * <p>
     * The list of resources for which you want to get the related resources. Up to 100 resources can be provided.
     * </p>
     * 
     * @return The list of resources for which you want to get the related resources. Up to 100 resources can be
     *         provided.
     */

    public java.util.List<ScannedResourceIdentifier> getResources() {
        if (resources == null) {
            resources = new com.amazonaws.internal.SdkInternalList<ScannedResourceIdentifier>();
        }
        return resources;
    }

    /**
     * <p>
     * The list of resources for which you want to get the related resources. Up to 100 resources can be provided.
     * </p>
     * 
     * @param resources
     *        The list of resources for which you want to get the related resources. Up to 100 resources can be
     *        provided.
     */

    public void setResources(java.util.Collection<ScannedResourceIdentifier> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new com.amazonaws.internal.SdkInternalList<ScannedResourceIdentifier>(resources);
    }

    /**
     * <p>
     * The list of resources for which you want to get the related resources. Up to 100 resources can be provided.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        The list of resources for which you want to get the related resources. Up to 100 resources can be
     *        provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceScanRelatedResourcesRequest withResources(ScannedResourceIdentifier... resources) {
        if (this.resources == null) {
            setResources(new com.amazonaws.internal.SdkInternalList<ScannedResourceIdentifier>(resources.length));
        }
        for (ScannedResourceIdentifier ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of resources for which you want to get the related resources. Up to 100 resources can be provided.
     * </p>
     * 
     * @param resources
     *        The list of resources for which you want to get the related resources. Up to 100 resources can be
     *        provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceScanRelatedResourcesRequest withResources(java.util.Collection<ScannedResourceIdentifier> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * A string that identifies the next page of resource scan results.
     * </p>
     * 
     * @param nextToken
     *        A string that identifies the next page of resource scan results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string that identifies the next page of resource scan results.
     * </p>
     * 
     * @return A string that identifies the next page of resource scan results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string that identifies the next page of resource scan results.
     * </p>
     * 
     * @param nextToken
     *        A string that identifies the next page of resource scan results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceScanRelatedResourcesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * If the number of available results exceeds this maximum, the response includes a <code>NextToken</code> value
     * that you can use for the <code>NextToken</code> parameter to get the next set of results. By default the
     * <code>ListResourceScanRelatedResources</code> API action will return up to 100 results in each response. The
     * maximum value is 100.
     * </p>
     * 
     * @param maxResults
     *        If the number of available results exceeds this maximum, the response includes a <code>NextToken</code>
     *        value that you can use for the <code>NextToken</code> parameter to get the next set of results. By default
     *        the <code>ListResourceScanRelatedResources</code> API action will return up to 100 results in each
     *        response. The maximum value is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * If the number of available results exceeds this maximum, the response includes a <code>NextToken</code> value
     * that you can use for the <code>NextToken</code> parameter to get the next set of results. By default the
     * <code>ListResourceScanRelatedResources</code> API action will return up to 100 results in each response. The
     * maximum value is 100.
     * </p>
     * 
     * @return If the number of available results exceeds this maximum, the response includes a <code>NextToken</code>
     *         value that you can use for the <code>NextToken</code> parameter to get the next set of results. By
     *         default the <code>ListResourceScanRelatedResources</code> API action will return up to 100 results in
     *         each response. The maximum value is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * If the number of available results exceeds this maximum, the response includes a <code>NextToken</code> value
     * that you can use for the <code>NextToken</code> parameter to get the next set of results. By default the
     * <code>ListResourceScanRelatedResources</code> API action will return up to 100 results in each response. The
     * maximum value is 100.
     * </p>
     * 
     * @param maxResults
     *        If the number of available results exceeds this maximum, the response includes a <code>NextToken</code>
     *        value that you can use for the <code>NextToken</code> parameter to get the next set of results. By default
     *        the <code>ListResourceScanRelatedResources</code> API action will return up to 100 results in each
     *        response. The maximum value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceScanRelatedResourcesRequest withMaxResults(Integer maxResults) {
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
        if (getResourceScanId() != null)
            sb.append("ResourceScanId: ").append(getResourceScanId()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
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

        if (obj instanceof ListResourceScanRelatedResourcesRequest == false)
            return false;
        ListResourceScanRelatedResourcesRequest other = (ListResourceScanRelatedResourcesRequest) obj;
        if (other.getResourceScanId() == null ^ this.getResourceScanId() == null)
            return false;
        if (other.getResourceScanId() != null && other.getResourceScanId().equals(this.getResourceScanId()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
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

        hashCode = prime * hashCode + ((getResourceScanId() == null) ? 0 : getResourceScanId().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceScanRelatedResourcesRequest clone() {
        return (ListResourceScanRelatedResourcesRequest) super.clone();
    }

}
