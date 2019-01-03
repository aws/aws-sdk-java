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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ListIpRoutes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIpRoutesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier (ID) of the directory for which you want to retrieve the IP addresses.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The <i>ListIpRoutes.NextToken</i> value from a previous call to <a>ListIpRoutes</a>. Pass null if this is the
     * first call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Maximum number of items to return. If this value is zero, the maximum number of items is specified by the
     * limitations of the operation.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * Identifier (ID) of the directory for which you want to retrieve the IP addresses.
     * </p>
     * 
     * @param directoryId
     *        Identifier (ID) of the directory for which you want to retrieve the IP addresses.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * Identifier (ID) of the directory for which you want to retrieve the IP addresses.
     * </p>
     * 
     * @return Identifier (ID) of the directory for which you want to retrieve the IP addresses.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * Identifier (ID) of the directory for which you want to retrieve the IP addresses.
     * </p>
     * 
     * @param directoryId
     *        Identifier (ID) of the directory for which you want to retrieve the IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIpRoutesRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The <i>ListIpRoutes.NextToken</i> value from a previous call to <a>ListIpRoutes</a>. Pass null if this is the
     * first call.
     * </p>
     * 
     * @param nextToken
     *        The <i>ListIpRoutes.NextToken</i> value from a previous call to <a>ListIpRoutes</a>. Pass null if this is
     *        the first call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <i>ListIpRoutes.NextToken</i> value from a previous call to <a>ListIpRoutes</a>. Pass null if this is the
     * first call.
     * </p>
     * 
     * @return The <i>ListIpRoutes.NextToken</i> value from a previous call to <a>ListIpRoutes</a>. Pass null if this is
     *         the first call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <i>ListIpRoutes.NextToken</i> value from a previous call to <a>ListIpRoutes</a>. Pass null if this is the
     * first call.
     * </p>
     * 
     * @param nextToken
     *        The <i>ListIpRoutes.NextToken</i> value from a previous call to <a>ListIpRoutes</a>. Pass null if this is
     *        the first call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIpRoutesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Maximum number of items to return. If this value is zero, the maximum number of items is specified by the
     * limitations of the operation.
     * </p>
     * 
     * @param limit
     *        Maximum number of items to return. If this value is zero, the maximum number of items is specified by the
     *        limitations of the operation.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Maximum number of items to return. If this value is zero, the maximum number of items is specified by the
     * limitations of the operation.
     * </p>
     * 
     * @return Maximum number of items to return. If this value is zero, the maximum number of items is specified by the
     *         limitations of the operation.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Maximum number of items to return. If this value is zero, the maximum number of items is specified by the
     * limitations of the operation.
     * </p>
     * 
     * @param limit
     *        Maximum number of items to return. If this value is zero, the maximum number of items is specified by the
     *        limitations of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIpRoutesRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIpRoutesRequest == false)
            return false;
        ListIpRoutesRequest other = (ListIpRoutesRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public ListIpRoutesRequest clone() {
        return (ListIpRoutesRequest) super.clone();
    }

}
