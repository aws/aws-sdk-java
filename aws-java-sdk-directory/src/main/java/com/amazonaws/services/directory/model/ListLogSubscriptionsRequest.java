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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ListLogSubscriptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLogSubscriptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If a <i>DirectoryID</i> is provided, lists only the log subscription associated with that directory. If no
     * <i>DirectoryId</i> is provided, lists all log subscriptions associated with your AWS account. If there are no log
     * subscriptions for the AWS account or the directory, an empty list will be returned.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The token for the next set of items to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items returned.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * If a <i>DirectoryID</i> is provided, lists only the log subscription associated with that directory. If no
     * <i>DirectoryId</i> is provided, lists all log subscriptions associated with your AWS account. If there are no log
     * subscriptions for the AWS account or the directory, an empty list will be returned.
     * </p>
     * 
     * @param directoryId
     *        If a <i>DirectoryID</i> is provided, lists only the log subscription associated with that directory. If no
     *        <i>DirectoryId</i> is provided, lists all log subscriptions associated with your AWS account. If there are
     *        no log subscriptions for the AWS account or the directory, an empty list will be returned.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * If a <i>DirectoryID</i> is provided, lists only the log subscription associated with that directory. If no
     * <i>DirectoryId</i> is provided, lists all log subscriptions associated with your AWS account. If there are no log
     * subscriptions for the AWS account or the directory, an empty list will be returned.
     * </p>
     * 
     * @return If a <i>DirectoryID</i> is provided, lists only the log subscription associated with that directory. If
     *         no <i>DirectoryId</i> is provided, lists all log subscriptions associated with your AWS account. If there
     *         are no log subscriptions for the AWS account or the directory, an empty list will be returned.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * If a <i>DirectoryID</i> is provided, lists only the log subscription associated with that directory. If no
     * <i>DirectoryId</i> is provided, lists all log subscriptions associated with your AWS account. If there are no log
     * subscriptions for the AWS account or the directory, an empty list will be returned.
     * </p>
     * 
     * @param directoryId
     *        If a <i>DirectoryID</i> is provided, lists only the log subscription associated with that directory. If no
     *        <i>DirectoryId</i> is provided, lists all log subscriptions associated with your AWS account. If there are
     *        no log subscriptions for the AWS account or the directory, an empty list will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSubscriptionsRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return.
     * </p>
     * 
     * @return The token for the next set of items to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSubscriptionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items returned.
     * </p>
     * 
     * @param limit
     *        The maximum number of items returned.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items returned.
     * </p>
     * 
     * @return The maximum number of items returned.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of items returned.
     * </p>
     * 
     * @param limit
     *        The maximum number of items returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSubscriptionsRequest withLimit(Integer limit) {
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

        if (obj instanceof ListLogSubscriptionsRequest == false)
            return false;
        ListLogSubscriptionsRequest other = (ListLogSubscriptionsRequest) obj;
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
    public ListLogSubscriptionsRequest clone() {
        return (ListLogSubscriptionsRequest) super.clone();
    }

}
