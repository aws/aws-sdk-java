/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeImagesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository in which to list images. If you do
     * not specify a registry, the default registry is assumed.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * A list of repositories to describe. If this parameter is omitted, then all repositories in a registry are
     * described.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The list of image IDs for the requested repository.
     * </p>
     */
    private java.util.List<ImageIdentifier> imageIds;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeImages</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of repository results returned by <code>DescribeImages</code> in paginated output. When this
     * parameter is used, <code>DescribeImages</code> only returns <code>maxResults</code> results in a single page
     * along with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeImages</code> request with the returned <code>nextToken</code> value. This value
     * can be between 1 and 100. If this parameter is not used, then <code>DescribeImages</code> returns up to 100
     * results and a <code>nextToken</code> value, if applicable.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The filter key and value with which to filter your <code>DescribeImages</code> results.
     * </p>
     */
    private DescribeImagesFilter filter;

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository in which to list images. If you do
     * not specify a registry, the default registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry that contains the repository in which to list images. If
     *        you do not specify a registry, the default registry is assumed.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository in which to list images. If you do
     * not specify a registry, the default registry is assumed.
     * </p>
     * 
     * @return The AWS account ID associated with the registry that contains the repository in which to list images. If
     *         you do not specify a registry, the default registry is assumed.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository in which to list images. If you do
     * not specify a registry, the default registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry that contains the repository in which to list images. If
     *        you do not specify a registry, the default registry is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagesRequest withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * A list of repositories to describe. If this parameter is omitted, then all repositories in a registry are
     * described.
     * </p>
     * 
     * @param repositoryName
     *        A list of repositories to describe. If this parameter is omitted, then all repositories in a registry are
     *        described.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * A list of repositories to describe. If this parameter is omitted, then all repositories in a registry are
     * described.
     * </p>
     * 
     * @return A list of repositories to describe. If this parameter is omitted, then all repositories in a registry are
     *         described.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * A list of repositories to describe. If this parameter is omitted, then all repositories in a registry are
     * described.
     * </p>
     * 
     * @param repositoryName
     *        A list of repositories to describe. If this parameter is omitted, then all repositories in a registry are
     *        described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagesRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The list of image IDs for the requested repository.
     * </p>
     * 
     * @return The list of image IDs for the requested repository.
     */

    public java.util.List<ImageIdentifier> getImageIds() {
        return imageIds;
    }

    /**
     * <p>
     * The list of image IDs for the requested repository.
     * </p>
     * 
     * @param imageIds
     *        The list of image IDs for the requested repository.
     */

    public void setImageIds(java.util.Collection<ImageIdentifier> imageIds) {
        if (imageIds == null) {
            this.imageIds = null;
            return;
        }

        this.imageIds = new java.util.ArrayList<ImageIdentifier>(imageIds);
    }

    /**
     * <p>
     * The list of image IDs for the requested repository.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageIds(java.util.Collection)} or {@link #withImageIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param imageIds
     *        The list of image IDs for the requested repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagesRequest withImageIds(ImageIdentifier... imageIds) {
        if (this.imageIds == null) {
            setImageIds(new java.util.ArrayList<ImageIdentifier>(imageIds.length));
        }
        for (ImageIdentifier ele : imageIds) {
            this.imageIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of image IDs for the requested repository.
     * </p>
     * 
     * @param imageIds
     *        The list of image IDs for the requested repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagesRequest withImageIds(java.util.Collection<ImageIdentifier> imageIds) {
        setImageIds(imageIds);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeImages</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>DescribeImages</code> request
     *        where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value. This value
     *        is <code>null</code> when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeImages</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>DescribeImages</code> request
     *         where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the <code>nextToken</code> value. This value
     *         is <code>null</code> when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeImages</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>DescribeImages</code> request
     *        where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value. This value
     *        is <code>null</code> when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of repository results returned by <code>DescribeImages</code> in paginated output. When this
     * parameter is used, <code>DescribeImages</code> only returns <code>maxResults</code> results in a single page
     * along with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeImages</code> request with the returned <code>nextToken</code> value. This value
     * can be between 1 and 100. If this parameter is not used, then <code>DescribeImages</code> returns up to 100
     * results and a <code>nextToken</code> value, if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of repository results returned by <code>DescribeImages</code> in paginated output. When
     *        this parameter is used, <code>DescribeImages</code> only returns <code>maxResults</code> results in a
     *        single page along with a <code>nextToken</code> response element. The remaining results of the initial
     *        request can be seen by sending another <code>DescribeImages</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     *        <code>DescribeImages</code> returns up to 100 results and a <code>nextToken</code> value, if applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of repository results returned by <code>DescribeImages</code> in paginated output. When this
     * parameter is used, <code>DescribeImages</code> only returns <code>maxResults</code> results in a single page
     * along with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeImages</code> request with the returned <code>nextToken</code> value. This value
     * can be between 1 and 100. If this parameter is not used, then <code>DescribeImages</code> returns up to 100
     * results and a <code>nextToken</code> value, if applicable.
     * </p>
     * 
     * @return The maximum number of repository results returned by <code>DescribeImages</code> in paginated output.
     *         When this parameter is used, <code>DescribeImages</code> only returns <code>maxResults</code> results in
     *         a single page along with a <code>nextToken</code> response element. The remaining results of the initial
     *         request can be seen by sending another <code>DescribeImages</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     *         <code>DescribeImages</code> returns up to 100 results and a <code>nextToken</code> value, if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of repository results returned by <code>DescribeImages</code> in paginated output. When this
     * parameter is used, <code>DescribeImages</code> only returns <code>maxResults</code> results in a single page
     * along with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeImages</code> request with the returned <code>nextToken</code> value. This value
     * can be between 1 and 100. If this parameter is not used, then <code>DescribeImages</code> returns up to 100
     * results and a <code>nextToken</code> value, if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of repository results returned by <code>DescribeImages</code> in paginated output. When
     *        this parameter is used, <code>DescribeImages</code> only returns <code>maxResults</code> results in a
     *        single page along with a <code>nextToken</code> response element. The remaining results of the initial
     *        request can be seen by sending another <code>DescribeImages</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     *        <code>DescribeImages</code> returns up to 100 results and a <code>nextToken</code> value, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The filter key and value with which to filter your <code>DescribeImages</code> results.
     * </p>
     * 
     * @param filter
     *        The filter key and value with which to filter your <code>DescribeImages</code> results.
     */

    public void setFilter(DescribeImagesFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The filter key and value with which to filter your <code>DescribeImages</code> results.
     * </p>
     * 
     * @return The filter key and value with which to filter your <code>DescribeImages</code> results.
     */

    public DescribeImagesFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * The filter key and value with which to filter your <code>DescribeImages</code> results.
     * </p>
     * 
     * @param filter
     *        The filter key and value with which to filter your <code>DescribeImages</code> results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagesRequest withFilter(DescribeImagesFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRegistryId() != null)
            sb.append("RegistryId: " + getRegistryId() + ",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: " + getRepositoryName() + ",");
        if (getImageIds() != null)
            sb.append("ImageIds: " + getImageIds() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getFilter() != null)
            sb.append("Filter: " + getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeImagesRequest == false)
            return false;
        DescribeImagesRequest other = (DescribeImagesRequest) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getImageIds() == null ^ this.getImageIds() == null)
            return false;
        if (other.getImageIds() != null && other.getImageIds().equals(this.getImageIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getImageIds() == null) ? 0 : getImageIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public DescribeImagesRequest clone() {
        return (DescribeImagesRequest) super.clone();
    }
}
