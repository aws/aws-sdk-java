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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListSyncResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSyncResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workspace that contains the sync job.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * The sync soucre.
     * </p>
     * <note>
     * <p>
     * Currently the only supported syncSoucre is <code>SITEWISE </code>.
     * </p>
     * </note>
     */
    private String syncSource;
    /**
     * <p>
     * A list of objects that filter the request.
     * </p>
     */
    private java.util.List<SyncResourceFilter> filters;
    /**
     * <p>
     * The maximum number of results to return at one time. The default is 50.
     * </p>
     * <p>
     * Valid Range: Minimum value of 0. Maximum value of 200.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the workspace that contains the sync job.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace that contains the sync job.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace that contains the sync job.
     * </p>
     * 
     * @return The ID of the workspace that contains the sync job.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace that contains the sync job.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace that contains the sync job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSyncResourcesRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * The sync soucre.
     * </p>
     * <note>
     * <p>
     * Currently the only supported syncSoucre is <code>SITEWISE </code>.
     * </p>
     * </note>
     * 
     * @param syncSource
     *        The sync soucre.</p> <note>
     *        <p>
     *        Currently the only supported syncSoucre is <code>SITEWISE </code>.
     *        </p>
     */

    public void setSyncSource(String syncSource) {
        this.syncSource = syncSource;
    }

    /**
     * <p>
     * The sync soucre.
     * </p>
     * <note>
     * <p>
     * Currently the only supported syncSoucre is <code>SITEWISE </code>.
     * </p>
     * </note>
     * 
     * @return The sync soucre.</p> <note>
     *         <p>
     *         Currently the only supported syncSoucre is <code>SITEWISE </code>.
     *         </p>
     */

    public String getSyncSource() {
        return this.syncSource;
    }

    /**
     * <p>
     * The sync soucre.
     * </p>
     * <note>
     * <p>
     * Currently the only supported syncSoucre is <code>SITEWISE </code>.
     * </p>
     * </note>
     * 
     * @param syncSource
     *        The sync soucre.</p> <note>
     *        <p>
     *        Currently the only supported syncSoucre is <code>SITEWISE </code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSyncResourcesRequest withSyncSource(String syncSource) {
        setSyncSource(syncSource);
        return this;
    }

    /**
     * <p>
     * A list of objects that filter the request.
     * </p>
     * 
     * @return A list of objects that filter the request.
     */

    public java.util.List<SyncResourceFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A list of objects that filter the request.
     * </p>
     * 
     * @param filters
     *        A list of objects that filter the request.
     */

    public void setFilters(java.util.Collection<SyncResourceFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<SyncResourceFilter>(filters);
    }

    /**
     * <p>
     * A list of objects that filter the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A list of objects that filter the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSyncResourcesRequest withFilters(SyncResourceFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<SyncResourceFilter>(filters.length));
        }
        for (SyncResourceFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects that filter the request.
     * </p>
     * 
     * @param filters
     *        A list of objects that filter the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSyncResourcesRequest withFilters(java.util.Collection<SyncResourceFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 50.
     * </p>
     * <p>
     * Valid Range: Minimum value of 0. Maximum value of 200.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time. The default is 50.</p>
     *        <p>
     *        Valid Range: Minimum value of 0. Maximum value of 200.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 50.
     * </p>
     * <p>
     * Valid Range: Minimum value of 0. Maximum value of 200.
     * </p>
     * 
     * @return The maximum number of results to return at one time. The default is 50.</p>
     *         <p>
     *         Valid Range: Minimum value of 0. Maximum value of 200.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 50.
     * </p>
     * <p>
     * Valid Range: Minimum value of 0. Maximum value of 200.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time. The default is 50.</p>
     *        <p>
     *        Valid Range: Minimum value of 0. Maximum value of 200.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSyncResourcesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @return The string that specifies the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSyncResourcesRequest withNextToken(String nextToken) {
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
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId()).append(",");
        if (getSyncSource() != null)
            sb.append("SyncSource: ").append(getSyncSource()).append(",");
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

        if (obj instanceof ListSyncResourcesRequest == false)
            return false;
        ListSyncResourcesRequest other = (ListSyncResourcesRequest) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getSyncSource() == null ^ this.getSyncSource() == null)
            return false;
        if (other.getSyncSource() != null && other.getSyncSource().equals(this.getSyncSource()) == false)
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

        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getSyncSource() == null) ? 0 : getSyncSource().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSyncResourcesRequest clone() {
        return (ListSyncResourcesRequest) super.clone();
    }

}
