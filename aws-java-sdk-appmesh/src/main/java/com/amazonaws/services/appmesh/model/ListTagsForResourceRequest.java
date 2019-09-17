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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListTagsForResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of tag results returned by <code>ListTagsForResource</code> in paginated output. When this
     * parameter is used, <code>ListTagsForResource</code> returns only <code>limit</code> results in a single page
     * along with a <code>nextToken</code> response element. You can see the remaining results of the initial request by
     * sending another <code>ListTagsForResource</code> request with the returned <code>nextToken</code> value. This
     * value can be between 1 and 100. If you don't use this parameter, <code>ListTagsForResource</code> returns up to
     * 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListTagsForResource</code> request
     * where <code>limit</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the resource to list the tags for.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The maximum number of tag results returned by <code>ListTagsForResource</code> in paginated output. When this
     * parameter is used, <code>ListTagsForResource</code> returns only <code>limit</code> results in a single page
     * along with a <code>nextToken</code> response element. You can see the remaining results of the initial request by
     * sending another <code>ListTagsForResource</code> request with the returned <code>nextToken</code> value. This
     * value can be between 1 and 100. If you don't use this parameter, <code>ListTagsForResource</code> returns up to
     * 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param limit
     *        The maximum number of tag results returned by <code>ListTagsForResource</code> in paginated output. When
     *        this parameter is used, <code>ListTagsForResource</code> returns only <code>limit</code> results in a
     *        single page along with a <code>nextToken</code> response element. You can see the remaining results of the
     *        initial request by sending another <code>ListTagsForResource</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 100. If you don't use this parameter,
     *        <code>ListTagsForResource</code> returns up to 100 results and a <code>nextToken</code> value if
     *        applicable.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of tag results returned by <code>ListTagsForResource</code> in paginated output. When this
     * parameter is used, <code>ListTagsForResource</code> returns only <code>limit</code> results in a single page
     * along with a <code>nextToken</code> response element. You can see the remaining results of the initial request by
     * sending another <code>ListTagsForResource</code> request with the returned <code>nextToken</code> value. This
     * value can be between 1 and 100. If you don't use this parameter, <code>ListTagsForResource</code> returns up to
     * 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @return The maximum number of tag results returned by <code>ListTagsForResource</code> in paginated output. When
     *         this parameter is used, <code>ListTagsForResource</code> returns only <code>limit</code> results in a
     *         single page along with a <code>nextToken</code> response element. You can see the remaining results of
     *         the initial request by sending another <code>ListTagsForResource</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and 100. If you don't use this parameter,
     *         <code>ListTagsForResource</code> returns up to 100 results and a <code>nextToken</code> value if
     *         applicable.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of tag results returned by <code>ListTagsForResource</code> in paginated output. When this
     * parameter is used, <code>ListTagsForResource</code> returns only <code>limit</code> results in a single page
     * along with a <code>nextToken</code> response element. You can see the remaining results of the initial request by
     * sending another <code>ListTagsForResource</code> request with the returned <code>nextToken</code> value. This
     * value can be between 1 and 100. If you don't use this parameter, <code>ListTagsForResource</code> returns up to
     * 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param limit
     *        The maximum number of tag results returned by <code>ListTagsForResource</code> in paginated output. When
     *        this parameter is used, <code>ListTagsForResource</code> returns only <code>limit</code> results in a
     *        single page along with a <code>nextToken</code> response element. You can see the remaining results of the
     *        initial request by sending another <code>ListTagsForResource</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 100. If you don't use this parameter,
     *        <code>ListTagsForResource</code> returns up to 100 results and a <code>nextToken</code> value if
     *        applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListTagsForResource</code> request
     * where <code>limit</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListTagsForResource</code>
     *        request where <code>limit</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListTagsForResource</code> request
     * where <code>limit</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>ListTagsForResource</code>
     *         request where <code>limit</code> was used and the results exceeded the value of that parameter.
     *         Pagination continues from the end of the previous results that returned the <code>nextToken</code> value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListTagsForResource</code> request
     * where <code>limit</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListTagsForResource</code>
     *        request where <code>limit</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the resource to list the tags for.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) that identifies the resource to list the tags for.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the resource to list the tags for.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the resource to list the tags for.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the resource to list the tags for.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) that identifies the resource to list the tags for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourceRequest == false)
            return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest) obj;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceRequest clone() {
        return (ListTagsForResourceRequest) super.clone();
    }

}
