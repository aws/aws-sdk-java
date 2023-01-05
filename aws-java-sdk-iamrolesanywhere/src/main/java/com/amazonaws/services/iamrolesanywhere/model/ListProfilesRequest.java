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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListProfiles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProfilesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous operation did not show all results.
     * To get the next results, call the operation again with this value.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The number of resources in the paginated list.
     * </p>
     */
    private Integer pageSize;

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous operation did not show all results.
     * To get the next results, call the operation again with this value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where the output should continue from, if a previous operation did not show all
     *        results. To get the next results, call the operation again with this value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous operation did not show all results.
     * To get the next results, call the operation again with this value.
     * </p>
     * 
     * @return A token that indicates where the output should continue from, if a previous operation did not show all
     *         results. To get the next results, call the operation again with this value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous operation did not show all results.
     * To get the next results, call the operation again with this value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where the output should continue from, if a previous operation did not show all
     *        results. To get the next results, call the operation again with this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The number of resources in the paginated list.
     * </p>
     * 
     * @param pageSize
     *        The number of resources in the paginated list.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The number of resources in the paginated list.
     * </p>
     * 
     * @return The number of resources in the paginated list.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The number of resources in the paginated list.
     * </p>
     * 
     * @param pageSize
     *        The number of resources in the paginated list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilesRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProfilesRequest == false)
            return false;
        ListProfilesRequest other = (ListProfilesRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public ListProfilesRequest clone() {
        return (ListProfilesRequest) super.clone();
    }

}
