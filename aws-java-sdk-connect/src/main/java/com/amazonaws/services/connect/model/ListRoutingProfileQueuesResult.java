/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRoutingProfileQueues" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRoutingProfileQueuesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Information about the routing profiles.
     * </p>
     */
    private java.util.List<RoutingProfileQueueConfigSummary> routingProfileQueueConfigSummaryList;
    /**
     * <p>
     * The timestamp when this resource was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The Amazon Web Services Region where this resource was last modified.
     * </p>
     */
    private String lastModifiedRegion;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoutingProfileQueuesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Information about the routing profiles.
     * </p>
     * 
     * @return Information about the routing profiles.
     */

    public java.util.List<RoutingProfileQueueConfigSummary> getRoutingProfileQueueConfigSummaryList() {
        return routingProfileQueueConfigSummaryList;
    }

    /**
     * <p>
     * Information about the routing profiles.
     * </p>
     * 
     * @param routingProfileQueueConfigSummaryList
     *        Information about the routing profiles.
     */

    public void setRoutingProfileQueueConfigSummaryList(java.util.Collection<RoutingProfileQueueConfigSummary> routingProfileQueueConfigSummaryList) {
        if (routingProfileQueueConfigSummaryList == null) {
            this.routingProfileQueueConfigSummaryList = null;
            return;
        }

        this.routingProfileQueueConfigSummaryList = new java.util.ArrayList<RoutingProfileQueueConfigSummary>(routingProfileQueueConfigSummaryList);
    }

    /**
     * <p>
     * Information about the routing profiles.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutingProfileQueueConfigSummaryList(java.util.Collection)} or
     * {@link #withRoutingProfileQueueConfigSummaryList(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param routingProfileQueueConfigSummaryList
     *        Information about the routing profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoutingProfileQueuesResult withRoutingProfileQueueConfigSummaryList(RoutingProfileQueueConfigSummary... routingProfileQueueConfigSummaryList) {
        if (this.routingProfileQueueConfigSummaryList == null) {
            setRoutingProfileQueueConfigSummaryList(new java.util.ArrayList<RoutingProfileQueueConfigSummary>(routingProfileQueueConfigSummaryList.length));
        }
        for (RoutingProfileQueueConfigSummary ele : routingProfileQueueConfigSummaryList) {
            this.routingProfileQueueConfigSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the routing profiles.
     * </p>
     * 
     * @param routingProfileQueueConfigSummaryList
     *        Information about the routing profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoutingProfileQueuesResult withRoutingProfileQueueConfigSummaryList(
            java.util.Collection<RoutingProfileQueueConfigSummary> routingProfileQueueConfigSummaryList) {
        setRoutingProfileQueueConfigSummaryList(routingProfileQueueConfigSummaryList);
        return this;
    }

    /**
     * <p>
     * The timestamp when this resource was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when this resource was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when this resource was last modified.
     * </p>
     * 
     * @return The timestamp when this resource was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when this resource was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when this resource was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoutingProfileQueuesResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region where this resource was last modified.
     * </p>
     * 
     * @param lastModifiedRegion
     *        The Amazon Web Services Region where this resource was last modified.
     */

    public void setLastModifiedRegion(String lastModifiedRegion) {
        this.lastModifiedRegion = lastModifiedRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region where this resource was last modified.
     * </p>
     * 
     * @return The Amazon Web Services Region where this resource was last modified.
     */

    public String getLastModifiedRegion() {
        return this.lastModifiedRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region where this resource was last modified.
     * </p>
     * 
     * @param lastModifiedRegion
     *        The Amazon Web Services Region where this resource was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoutingProfileQueuesResult withLastModifiedRegion(String lastModifiedRegion) {
        setLastModifiedRegion(lastModifiedRegion);
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
        if (getRoutingProfileQueueConfigSummaryList() != null)
            sb.append("RoutingProfileQueueConfigSummaryList: ").append(getRoutingProfileQueueConfigSummaryList()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastModifiedRegion() != null)
            sb.append("LastModifiedRegion: ").append(getLastModifiedRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRoutingProfileQueuesResult == false)
            return false;
        ListRoutingProfileQueuesResult other = (ListRoutingProfileQueuesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRoutingProfileQueueConfigSummaryList() == null ^ this.getRoutingProfileQueueConfigSummaryList() == null)
            return false;
        if (other.getRoutingProfileQueueConfigSummaryList() != null
                && other.getRoutingProfileQueueConfigSummaryList().equals(this.getRoutingProfileQueueConfigSummaryList()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedRegion() == null ^ this.getLastModifiedRegion() == null)
            return false;
        if (other.getLastModifiedRegion() != null && other.getLastModifiedRegion().equals(this.getLastModifiedRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRoutingProfileQueueConfigSummaryList() == null) ? 0 : getRoutingProfileQueueConfigSummaryList().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedRegion() == null) ? 0 : getLastModifiedRegion().hashCode());
        return hashCode;
    }

    @Override
    public ListRoutingProfileQueuesResult clone() {
        try {
            return (ListRoutingProfileQueuesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
