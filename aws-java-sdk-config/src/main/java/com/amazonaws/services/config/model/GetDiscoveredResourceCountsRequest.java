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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetDiscoveredResourceCounts" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDiscoveredResourceCountsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The comma-separated list that specifies the resource types that you want AWS Config to return (for example,
     * <code>"AWS::EC2::Instance"</code>, <code>"AWS::IAM::User"</code>).
     * </p>
     * <p>
     * If a value for <code>resourceTypes</code> is not specified, AWS Config returns all resource types that AWS Config
     * is recording in the region for your account.
     * </p>
     * <note>
     * <p>
     * If the configuration recorder is turned off, AWS Config returns an empty list of <a>ResourceCount</a> objects. If
     * the configuration recorder is not recording a specific resource type (for example, S3 buckets), that resource
     * type is not returned in the list of <a>ResourceCount</a> objects.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceTypes;
    /**
     * <p>
     * The maximum number of <a>ResourceCount</a> objects returned on each page. The default is 100. You cannot specify
     * a number greater than 100. If you specify 0, AWS Config uses the default.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The comma-separated list that specifies the resource types that you want AWS Config to return (for example,
     * <code>"AWS::EC2::Instance"</code>, <code>"AWS::IAM::User"</code>).
     * </p>
     * <p>
     * If a value for <code>resourceTypes</code> is not specified, AWS Config returns all resource types that AWS Config
     * is recording in the region for your account.
     * </p>
     * <note>
     * <p>
     * If the configuration recorder is turned off, AWS Config returns an empty list of <a>ResourceCount</a> objects. If
     * the configuration recorder is not recording a specific resource type (for example, S3 buckets), that resource
     * type is not returned in the list of <a>ResourceCount</a> objects.
     * </p>
     * </note>
     * 
     * @return The comma-separated list that specifies the resource types that you want AWS Config to return (for
     *         example, <code>"AWS::EC2::Instance"</code>, <code>"AWS::IAM::User"</code>).</p>
     *         <p>
     *         If a value for <code>resourceTypes</code> is not specified, AWS Config returns all resource types that
     *         AWS Config is recording in the region for your account.
     *         </p>
     *         <note>
     *         <p>
     *         If the configuration recorder is turned off, AWS Config returns an empty list of <a>ResourceCount</a>
     *         objects. If the configuration recorder is not recording a specific resource type (for example, S3
     *         buckets), that resource type is not returned in the list of <a>ResourceCount</a> objects.
     *         </p>
     */

    public java.util.List<String> getResourceTypes() {
        if (resourceTypes == null) {
            resourceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceTypes;
    }

    /**
     * <p>
     * The comma-separated list that specifies the resource types that you want AWS Config to return (for example,
     * <code>"AWS::EC2::Instance"</code>, <code>"AWS::IAM::User"</code>).
     * </p>
     * <p>
     * If a value for <code>resourceTypes</code> is not specified, AWS Config returns all resource types that AWS Config
     * is recording in the region for your account.
     * </p>
     * <note>
     * <p>
     * If the configuration recorder is turned off, AWS Config returns an empty list of <a>ResourceCount</a> objects. If
     * the configuration recorder is not recording a specific resource type (for example, S3 buckets), that resource
     * type is not returned in the list of <a>ResourceCount</a> objects.
     * </p>
     * </note>
     * 
     * @param resourceTypes
     *        The comma-separated list that specifies the resource types that you want AWS Config to return (for
     *        example, <code>"AWS::EC2::Instance"</code>, <code>"AWS::IAM::User"</code>).</p>
     *        <p>
     *        If a value for <code>resourceTypes</code> is not specified, AWS Config returns all resource types that AWS
     *        Config is recording in the region for your account.
     *        </p>
     *        <note>
     *        <p>
     *        If the configuration recorder is turned off, AWS Config returns an empty list of <a>ResourceCount</a>
     *        objects. If the configuration recorder is not recording a specific resource type (for example, S3
     *        buckets), that resource type is not returned in the list of <a>ResourceCount</a> objects.
     *        </p>
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new com.amazonaws.internal.SdkInternalList<String>(resourceTypes);
    }

    /**
     * <p>
     * The comma-separated list that specifies the resource types that you want AWS Config to return (for example,
     * <code>"AWS::EC2::Instance"</code>, <code>"AWS::IAM::User"</code>).
     * </p>
     * <p>
     * If a value for <code>resourceTypes</code> is not specified, AWS Config returns all resource types that AWS Config
     * is recording in the region for your account.
     * </p>
     * <note>
     * <p>
     * If the configuration recorder is turned off, AWS Config returns an empty list of <a>ResourceCount</a> objects. If
     * the configuration recorder is not recording a specific resource type (for example, S3 buckets), that resource
     * type is not returned in the list of <a>ResourceCount</a> objects.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        The comma-separated list that specifies the resource types that you want AWS Config to return (for
     *        example, <code>"AWS::EC2::Instance"</code>, <code>"AWS::IAM::User"</code>).</p>
     *        <p>
     *        If a value for <code>resourceTypes</code> is not specified, AWS Config returns all resource types that AWS
     *        Config is recording in the region for your account.
     *        </p>
     *        <note>
     *        <p>
     *        If the configuration recorder is turned off, AWS Config returns an empty list of <a>ResourceCount</a>
     *        objects. If the configuration recorder is not recording a specific resource type (for example, S3
     *        buckets), that resource type is not returned in the list of <a>ResourceCount</a> objects.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDiscoveredResourceCountsRequest withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new com.amazonaws.internal.SdkInternalList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The comma-separated list that specifies the resource types that you want AWS Config to return (for example,
     * <code>"AWS::EC2::Instance"</code>, <code>"AWS::IAM::User"</code>).
     * </p>
     * <p>
     * If a value for <code>resourceTypes</code> is not specified, AWS Config returns all resource types that AWS Config
     * is recording in the region for your account.
     * </p>
     * <note>
     * <p>
     * If the configuration recorder is turned off, AWS Config returns an empty list of <a>ResourceCount</a> objects. If
     * the configuration recorder is not recording a specific resource type (for example, S3 buckets), that resource
     * type is not returned in the list of <a>ResourceCount</a> objects.
     * </p>
     * </note>
     * 
     * @param resourceTypes
     *        The comma-separated list that specifies the resource types that you want AWS Config to return (for
     *        example, <code>"AWS::EC2::Instance"</code>, <code>"AWS::IAM::User"</code>).</p>
     *        <p>
     *        If a value for <code>resourceTypes</code> is not specified, AWS Config returns all resource types that AWS
     *        Config is recording in the region for your account.
     *        </p>
     *        <note>
     *        <p>
     *        If the configuration recorder is turned off, AWS Config returns an empty list of <a>ResourceCount</a>
     *        objects. If the configuration recorder is not recording a specific resource type (for example, S3
     *        buckets), that resource type is not returned in the list of <a>ResourceCount</a> objects.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDiscoveredResourceCountsRequest withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * The maximum number of <a>ResourceCount</a> objects returned on each page. The default is 100. You cannot specify
     * a number greater than 100. If you specify 0, AWS Config uses the default.
     * </p>
     * 
     * @param limit
     *        The maximum number of <a>ResourceCount</a> objects returned on each page. The default is 100. You cannot
     *        specify a number greater than 100. If you specify 0, AWS Config uses the default.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of <a>ResourceCount</a> objects returned on each page. The default is 100. You cannot specify
     * a number greater than 100. If you specify 0, AWS Config uses the default.
     * </p>
     * 
     * @return The maximum number of <a>ResourceCount</a> objects returned on each page. The default is 100. You cannot
     *         specify a number greater than 100. If you specify 0, AWS Config uses the default.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of <a>ResourceCount</a> objects returned on each page. The default is 100. You cannot specify
     * a number greater than 100. If you specify 0, AWS Config uses the default.
     * </p>
     * 
     * @param limit
     *        The maximum number of <a>ResourceCount</a> objects returned on each page. The default is 100. You cannot
     *        specify a number greater than 100. If you specify 0, AWS Config uses the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDiscoveredResourceCountsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string returned on a previous page that you use to get the next page of
     *         results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDiscoveredResourceCountsRequest withNextToken(String nextToken) {
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
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
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

        if (obj instanceof GetDiscoveredResourceCountsRequest == false)
            return false;
        GetDiscoveredResourceCountsRequest other = (GetDiscoveredResourceCountsRequest) obj;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
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

        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetDiscoveredResourceCountsRequest clone() {
        return (GetDiscoveredResourceCountsRequest) super.clone();
    }

}
