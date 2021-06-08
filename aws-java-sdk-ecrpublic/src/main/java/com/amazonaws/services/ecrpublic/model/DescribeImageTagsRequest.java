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
package com.amazonaws.services.ecrpublic.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/DescribeImageTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImageTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID associated with the public registry that contains the repository in which to describe images.
     * If you do not specify a registry, the default public registry is assumed.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The name of the repository that contains the image tag details to describe.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeImageTags</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return. This option cannot be used when you specify images with
     * <code>imageIds</code>.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of repository results returned by <code>DescribeImageTags</code> in paginated output. When
     * this parameter is used, <code>DescribeImageTags</code> only returns <code>maxResults</code> results in a single
     * page along with a <code>nextToken</code> response element. The remaining results of the initial request can be
     * seen by sending another <code>DescribeImageTags</code> request with the returned <code>nextToken</code> value.
     * This value can be between 1 and 1000. If this parameter is not used, then <code>DescribeImageTags</code> returns
     * up to 100 results and a <code>nextToken</code> value, if applicable. This option cannot be used when you specify
     * images with <code>imageIds</code>.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The AWS account ID associated with the public registry that contains the repository in which to describe images.
     * If you do not specify a registry, the default public registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the public registry that contains the repository in which to describe
     *        images. If you do not specify a registry, the default public registry is assumed.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the public registry that contains the repository in which to describe images.
     * If you do not specify a registry, the default public registry is assumed.
     * </p>
     * 
     * @return The AWS account ID associated with the public registry that contains the repository in which to describe
     *         images. If you do not specify a registry, the default public registry is assumed.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the public registry that contains the repository in which to describe images.
     * If you do not specify a registry, the default public registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the public registry that contains the repository in which to describe
     *        images. If you do not specify a registry, the default public registry is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageTagsRequest withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The name of the repository that contains the image tag details to describe.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the image tag details to describe.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the image tag details to describe.
     * </p>
     * 
     * @return The name of the repository that contains the image tag details to describe.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the image tag details to describe.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the image tag details to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageTagsRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeImageTags</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return. This option cannot be used when you specify images with
     * <code>imageIds</code>.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>DescribeImageTags</code> request
     *        where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value. This value
     *        is <code>null</code> when there are no more results to return. This option cannot be used when you specify
     *        images with <code>imageIds</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeImageTags</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return. This option cannot be used when you specify images with
     * <code>imageIds</code>.
     * </p>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>DescribeImageTags</code>
     *         request where <code>maxResults</code> was used and the results exceeded the value of that parameter.
     *         Pagination continues from the end of the previous results that returned the <code>nextToken</code> value.
     *         This value is <code>null</code> when there are no more results to return. This option cannot be used when
     *         you specify images with <code>imageIds</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeImageTags</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return. This option cannot be used when you specify images with
     * <code>imageIds</code>.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>DescribeImageTags</code> request
     *        where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value. This value
     *        is <code>null</code> when there are no more results to return. This option cannot be used when you specify
     *        images with <code>imageIds</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageTagsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of repository results returned by <code>DescribeImageTags</code> in paginated output. When
     * this parameter is used, <code>DescribeImageTags</code> only returns <code>maxResults</code> results in a single
     * page along with a <code>nextToken</code> response element. The remaining results of the initial request can be
     * seen by sending another <code>DescribeImageTags</code> request with the returned <code>nextToken</code> value.
     * This value can be between 1 and 1000. If this parameter is not used, then <code>DescribeImageTags</code> returns
     * up to 100 results and a <code>nextToken</code> value, if applicable. This option cannot be used when you specify
     * images with <code>imageIds</code>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of repository results returned by <code>DescribeImageTags</code> in paginated output.
     *        When this parameter is used, <code>DescribeImageTags</code> only returns <code>maxResults</code> results
     *        in a single page along with a <code>nextToken</code> response element. The remaining results of the
     *        initial request can be seen by sending another <code>DescribeImageTags</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 1000. If this parameter is not used, then
     *        <code>DescribeImageTags</code> returns up to 100 results and a <code>nextToken</code> value, if
     *        applicable. This option cannot be used when you specify images with <code>imageIds</code>.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of repository results returned by <code>DescribeImageTags</code> in paginated output. When
     * this parameter is used, <code>DescribeImageTags</code> only returns <code>maxResults</code> results in a single
     * page along with a <code>nextToken</code> response element. The remaining results of the initial request can be
     * seen by sending another <code>DescribeImageTags</code> request with the returned <code>nextToken</code> value.
     * This value can be between 1 and 1000. If this parameter is not used, then <code>DescribeImageTags</code> returns
     * up to 100 results and a <code>nextToken</code> value, if applicable. This option cannot be used when you specify
     * images with <code>imageIds</code>.
     * </p>
     * 
     * @return The maximum number of repository results returned by <code>DescribeImageTags</code> in paginated output.
     *         When this parameter is used, <code>DescribeImageTags</code> only returns <code>maxResults</code> results
     *         in a single page along with a <code>nextToken</code> response element. The remaining results of the
     *         initial request can be seen by sending another <code>DescribeImageTags</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and 1000. If this parameter is not used, then
     *         <code>DescribeImageTags</code> returns up to 100 results and a <code>nextToken</code> value, if
     *         applicable. This option cannot be used when you specify images with <code>imageIds</code>.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of repository results returned by <code>DescribeImageTags</code> in paginated output. When
     * this parameter is used, <code>DescribeImageTags</code> only returns <code>maxResults</code> results in a single
     * page along with a <code>nextToken</code> response element. The remaining results of the initial request can be
     * seen by sending another <code>DescribeImageTags</code> request with the returned <code>nextToken</code> value.
     * This value can be between 1 and 1000. If this parameter is not used, then <code>DescribeImageTags</code> returns
     * up to 100 results and a <code>nextToken</code> value, if applicable. This option cannot be used when you specify
     * images with <code>imageIds</code>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of repository results returned by <code>DescribeImageTags</code> in paginated output.
     *        When this parameter is used, <code>DescribeImageTags</code> only returns <code>maxResults</code> results
     *        in a single page along with a <code>nextToken</code> response element. The remaining results of the
     *        initial request can be seen by sending another <code>DescribeImageTags</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 1000. If this parameter is not used, then
     *        <code>DescribeImageTags</code> returns up to 100 results and a <code>nextToken</code> value, if
     *        applicable. This option cannot be used when you specify images with <code>imageIds</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageTagsRequest withMaxResults(Integer maxResults) {
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
        if (getRegistryId() != null)
            sb.append("RegistryId: ").append(getRegistryId()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
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

        if (obj instanceof DescribeImageTagsRequest == false)
            return false;
        DescribeImageTagsRequest other = (DescribeImageTagsRequest) obj;
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
        return hashCode;
    }

    @Override
    public DescribeImageTagsRequest clone() {
        return (DescribeImageTagsRequest) super.clone();
    }

}
