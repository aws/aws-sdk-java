/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ListImages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImagesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository in which to list images. If you do
     * not specify a registry, the default registry is assumed.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The repository with image IDs to be listed.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListImages</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of image results returned by <code>ListImages</code> in paginated output. When this parameter
     * is used, <code>ListImages</code> only returns <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the initial request can be seen by sending
     * another <code>ListImages</code> request with the returned <code>nextToken</code> value. This value can be between
     * 1 and 1000. If this parameter is not used, then <code>ListImages</code> returns up to 100 results and a
     * <code>nextToken</code> value, if applicable.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The filter key and value with which to filter your <code>ListImages</code> results.
     * </p>
     */
    private ListImagesFilter filter;

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

    public ListImagesRequest withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The repository with image IDs to be listed.
     * </p>
     * 
     * @param repositoryName
     *        The repository with image IDs to be listed.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The repository with image IDs to be listed.
     * </p>
     * 
     * @return The repository with image IDs to be listed.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The repository with image IDs to be listed.
     * </p>
     * 
     * @param repositoryName
     *        The repository with image IDs to be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagesRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListImages</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListImages</code> request where
     *        <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value. This value
     *        is <code>null</code> when there are no more results to return.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListImages</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>ListImages</code> request where
     *         <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the <code>nextToken</code> value. This value
     *         is <code>null</code> when there are no more results to return.</p> <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *         list and not for other programmatic purposes.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListImages</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListImages</code> request where
     *        <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value. This value
     *        is <code>null</code> when there are no more results to return.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of image results returned by <code>ListImages</code> in paginated output. When this parameter
     * is used, <code>ListImages</code> only returns <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the initial request can be seen by sending
     * another <code>ListImages</code> request with the returned <code>nextToken</code> value. This value can be between
     * 1 and 1000. If this parameter is not used, then <code>ListImages</code> returns up to 100 results and a
     * <code>nextToken</code> value, if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of image results returned by <code>ListImages</code> in paginated output. When this
     *        parameter is used, <code>ListImages</code> only returns <code>maxResults</code> results in a single page
     *        along with a <code>nextToken</code> response element. The remaining results of the initial request can be
     *        seen by sending another <code>ListImages</code> request with the returned <code>nextToken</code> value.
     *        This value can be between 1 and 1000. If this parameter is not used, then <code>ListImages</code> returns
     *        up to 100 results and a <code>nextToken</code> value, if applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of image results returned by <code>ListImages</code> in paginated output. When this parameter
     * is used, <code>ListImages</code> only returns <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the initial request can be seen by sending
     * another <code>ListImages</code> request with the returned <code>nextToken</code> value. This value can be between
     * 1 and 1000. If this parameter is not used, then <code>ListImages</code> returns up to 100 results and a
     * <code>nextToken</code> value, if applicable.
     * </p>
     * 
     * @return The maximum number of image results returned by <code>ListImages</code> in paginated output. When this
     *         parameter is used, <code>ListImages</code> only returns <code>maxResults</code> results in a single page
     *         along with a <code>nextToken</code> response element. The remaining results of the initial request can be
     *         seen by sending another <code>ListImages</code> request with the returned <code>nextToken</code> value.
     *         This value can be between 1 and 1000. If this parameter is not used, then <code>ListImages</code> returns
     *         up to 100 results and a <code>nextToken</code> value, if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of image results returned by <code>ListImages</code> in paginated output. When this parameter
     * is used, <code>ListImages</code> only returns <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the initial request can be seen by sending
     * another <code>ListImages</code> request with the returned <code>nextToken</code> value. This value can be between
     * 1 and 1000. If this parameter is not used, then <code>ListImages</code> returns up to 100 results and a
     * <code>nextToken</code> value, if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of image results returned by <code>ListImages</code> in paginated output. When this
     *        parameter is used, <code>ListImages</code> only returns <code>maxResults</code> results in a single page
     *        along with a <code>nextToken</code> response element. The remaining results of the initial request can be
     *        seen by sending another <code>ListImages</code> request with the returned <code>nextToken</code> value.
     *        This value can be between 1 and 1000. If this parameter is not used, then <code>ListImages</code> returns
     *        up to 100 results and a <code>nextToken</code> value, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The filter key and value with which to filter your <code>ListImages</code> results.
     * </p>
     * 
     * @param filter
     *        The filter key and value with which to filter your <code>ListImages</code> results.
     */

    public void setFilter(ListImagesFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The filter key and value with which to filter your <code>ListImages</code> results.
     * </p>
     * 
     * @return The filter key and value with which to filter your <code>ListImages</code> results.
     */

    public ListImagesFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * The filter key and value with which to filter your <code>ListImages</code> results.
     * </p>
     * 
     * @param filter
     *        The filter key and value with which to filter your <code>ListImages</code> results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagesRequest withFilter(ListImagesFilter filter) {
        setFilter(filter);
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
        if (getRegistryId() != null)
            sb.append("RegistryId: ").append(getRegistryId()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListImagesRequest == false)
            return false;
        ListImagesRequest other = (ListImagesRequest) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
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
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public ListImagesRequest clone() {
        return (ListImagesRequest) super.clone();
    }

}
