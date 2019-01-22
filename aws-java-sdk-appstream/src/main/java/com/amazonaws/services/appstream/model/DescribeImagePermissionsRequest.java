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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeImagePermissions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImagePermissionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the private image for which to describe permissions. The image must be one that you own.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The maximum size of each page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The 12-digit identifier of one or more AWS accounts with which the image is shared.
     * </p>
     */
    private java.util.List<String> sharedAwsAccountIds;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the private image for which to describe permissions. The image must be one that you own.
     * </p>
     * 
     * @param name
     *        The name of the private image for which to describe permissions. The image must be one that you own.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the private image for which to describe permissions. The image must be one that you own.
     * </p>
     * 
     * @return The name of the private image for which to describe permissions. The image must be one that you own.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the private image for which to describe permissions. The image must be one that you own.
     * </p>
     * 
     * @param name
     *        The name of the private image for which to describe permissions. The image must be one that you own.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagePermissionsRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The maximum size of each page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum size of each page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum size of each page of results.
     * </p>
     * 
     * @return The maximum size of each page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum size of each page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum size of each page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagePermissionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The 12-digit identifier of one or more AWS accounts with which the image is shared.
     * </p>
     * 
     * @return The 12-digit identifier of one or more AWS accounts with which the image is shared.
     */

    public java.util.List<String> getSharedAwsAccountIds() {
        return sharedAwsAccountIds;
    }

    /**
     * <p>
     * The 12-digit identifier of one or more AWS accounts with which the image is shared.
     * </p>
     * 
     * @param sharedAwsAccountIds
     *        The 12-digit identifier of one or more AWS accounts with which the image is shared.
     */

    public void setSharedAwsAccountIds(java.util.Collection<String> sharedAwsAccountIds) {
        if (sharedAwsAccountIds == null) {
            this.sharedAwsAccountIds = null;
            return;
        }

        this.sharedAwsAccountIds = new java.util.ArrayList<String>(sharedAwsAccountIds);
    }

    /**
     * <p>
     * The 12-digit identifier of one or more AWS accounts with which the image is shared.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSharedAwsAccountIds(java.util.Collection)} or {@link #withSharedAwsAccountIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param sharedAwsAccountIds
     *        The 12-digit identifier of one or more AWS accounts with which the image is shared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagePermissionsRequest withSharedAwsAccountIds(String... sharedAwsAccountIds) {
        if (this.sharedAwsAccountIds == null) {
            setSharedAwsAccountIds(new java.util.ArrayList<String>(sharedAwsAccountIds.length));
        }
        for (String ele : sharedAwsAccountIds) {
            this.sharedAwsAccountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The 12-digit identifier of one or more AWS accounts with which the image is shared.
     * </p>
     * 
     * @param sharedAwsAccountIds
     *        The 12-digit identifier of one or more AWS accounts with which the image is shared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagePermissionsRequest withSharedAwsAccountIds(java.util.Collection<String> sharedAwsAccountIds) {
        setSharedAwsAccountIds(sharedAwsAccountIds);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If this value is
     *        null, it retrieves the first page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     * 
     * @return The pagination token to use to retrieve the next page of results for this operation. If this value is
     *         null, it retrieves the first page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If this value is
     *        null, it retrieves the first page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagePermissionsRequest withNextToken(String nextToken) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getSharedAwsAccountIds() != null)
            sb.append("SharedAwsAccountIds: ").append(getSharedAwsAccountIds()).append(",");
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

        if (obj instanceof DescribeImagePermissionsRequest == false)
            return false;
        DescribeImagePermissionsRequest other = (DescribeImagePermissionsRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getSharedAwsAccountIds() == null ^ this.getSharedAwsAccountIds() == null)
            return false;
        if (other.getSharedAwsAccountIds() != null && other.getSharedAwsAccountIds().equals(this.getSharedAwsAccountIds()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getSharedAwsAccountIds() == null) ? 0 : getSharedAwsAccountIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeImagePermissionsRequest clone() {
        return (DescribeImagePermissionsRequest) super.clone();
    }

}
