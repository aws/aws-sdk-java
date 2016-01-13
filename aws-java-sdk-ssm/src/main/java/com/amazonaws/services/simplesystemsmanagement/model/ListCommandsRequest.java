/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ListCommandsRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /** (Optional) If provided, lists only the specified command. */
    private String commandId;
    /** (Optional) Lists commands issued against this instance ID. */
    private String instanceId;
    /**
     * (Optional) The maximum number of items to return for this call. The call
     * also returns a token that you can specify in a subsequent call to get the
     * next set of results.
     */
    private Integer maxResults;
    /**
     * (Optional) The token for the next set of items to return. (You received
     * this token from a previous call.)
     */
    private String nextToken;
    /**
     * (Optional) One or more filters. Use a filter to return a more specific
     * list of results.
     */
    private com.amazonaws.internal.SdkInternalList<CommandFilter> filters;

    /**
     * (Optional) If provided, lists only the specified command.
     * 
     * @param commandId
     *        (Optional) If provided, lists only the specified command.
     */
    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    /**
     * (Optional) If provided, lists only the specified command.
     * 
     * @return (Optional) If provided, lists only the specified command.
     */
    public String getCommandId() {
        return this.commandId;
    }

    /**
     * (Optional) If provided, lists only the specified command.
     * 
     * @param commandId
     *        (Optional) If provided, lists only the specified command.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListCommandsRequest withCommandId(String commandId) {
        setCommandId(commandId);
        return this;
    }

    /**
     * (Optional) Lists commands issued against this instance ID.
     * 
     * @param instanceId
     *        (Optional) Lists commands issued against this instance ID.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * (Optional) Lists commands issued against this instance ID.
     * 
     * @return (Optional) Lists commands issued against this instance ID.
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * (Optional) Lists commands issued against this instance ID.
     * 
     * @param instanceId
     *        (Optional) Lists commands issued against this instance ID.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListCommandsRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * (Optional) The maximum number of items to return for this call. The call
     * also returns a token that you can specify in a subsequent call to get the
     * next set of results.
     * 
     * @param maxResults
     *        (Optional) The maximum number of items to return for this call.
     *        The call also returns a token that you can specify in a subsequent
     *        call to get the next set of results.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * (Optional) The maximum number of items to return for this call. The call
     * also returns a token that you can specify in a subsequent call to get the
     * next set of results.
     * 
     * @return (Optional) The maximum number of items to return for this call.
     *         The call also returns a token that you can specify in a
     *         subsequent call to get the next set of results.
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * (Optional) The maximum number of items to return for this call. The call
     * also returns a token that you can specify in a subsequent call to get the
     * next set of results.
     * 
     * @param maxResults
     *        (Optional) The maximum number of items to return for this call.
     *        The call also returns a token that you can specify in a subsequent
     *        call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListCommandsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * (Optional) The token for the next set of items to return. (You received
     * this token from a previous call.)
     * 
     * @param nextToken
     *        (Optional) The token for the next set of items to return. (You
     *        received this token from a previous call.)
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * (Optional) The token for the next set of items to return. (You received
     * this token from a previous call.)
     * 
     * @return (Optional) The token for the next set of items to return. (You
     *         received this token from a previous call.)
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * (Optional) The token for the next set of items to return. (You received
     * this token from a previous call.)
     * 
     * @param nextToken
     *        (Optional) The token for the next set of items to return. (You
     *        received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListCommandsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * (Optional) One or more filters. Use a filter to return a more specific
     * list of results.
     * 
     * @return (Optional) One or more filters. Use a filter to return a more
     *         specific list of results.
     */
    public java.util.List<CommandFilter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<CommandFilter>();
        }
        return filters;
    }

    /**
     * (Optional) One or more filters. Use a filter to return a more specific
     * list of results.
     * 
     * @param filters
     *        (Optional) One or more filters. Use a filter to return a more
     *        specific list of results.
     */
    public void setFilters(java.util.Collection<CommandFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<CommandFilter>(
                filters);
    }

    /**
     * (Optional) One or more filters. Use a filter to return a more specific
     * list of results.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilters(java.util.Collection)} or
     * {@link #withFilters(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param filters
     *        (Optional) One or more filters. Use a filter to return a more
     *        specific list of results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListCommandsRequest withFilters(CommandFilter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<CommandFilter>(
                    filters.length));
        }
        for (CommandFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * (Optional) One or more filters. Use a filter to return a more specific
     * list of results.
     * 
     * @param filters
     *        (Optional) One or more filters. Use a filter to return a more
     *        specific list of results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListCommandsRequest withFilters(
            java.util.Collection<CommandFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCommandId() != null)
            sb.append("CommandId: " + getCommandId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCommandsRequest == false)
            return false;
        ListCommandsRequest other = (ListCommandsRequest) obj;
        if (other.getCommandId() == null ^ this.getCommandId() == null)
            return false;
        if (other.getCommandId() != null
                && other.getCommandId().equals(this.getCommandId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null
                && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCommandId() == null) ? 0 : getCommandId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListCommandsRequest clone() {
        return (ListCommandsRequest) super.clone();
    }
}