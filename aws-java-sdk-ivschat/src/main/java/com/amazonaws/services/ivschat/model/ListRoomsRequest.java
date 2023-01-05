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
package com.amazonaws.services.ivschat.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/ListRooms" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRoomsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Logging-configuration identifier.
     * </p>
     */
    private String loggingConfigurationIdentifier;
    /**
     * <p>
     * Maximum number of rooms to return. Default: 50.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Filters the list to match the specified message review handler URI.
     * </p>
     */
    private String messageReviewHandlerUri;
    /**
     * <p>
     * Filters the list to match the specified room name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The first room to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Logging-configuration identifier.
     * </p>
     * 
     * @param loggingConfigurationIdentifier
     *        Logging-configuration identifier.
     */

    public void setLoggingConfigurationIdentifier(String loggingConfigurationIdentifier) {
        this.loggingConfigurationIdentifier = loggingConfigurationIdentifier;
    }

    /**
     * <p>
     * Logging-configuration identifier.
     * </p>
     * 
     * @return Logging-configuration identifier.
     */

    public String getLoggingConfigurationIdentifier() {
        return this.loggingConfigurationIdentifier;
    }

    /**
     * <p>
     * Logging-configuration identifier.
     * </p>
     * 
     * @param loggingConfigurationIdentifier
     *        Logging-configuration identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoomsRequest withLoggingConfigurationIdentifier(String loggingConfigurationIdentifier) {
        setLoggingConfigurationIdentifier(loggingConfigurationIdentifier);
        return this;
    }

    /**
     * <p>
     * Maximum number of rooms to return. Default: 50.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of rooms to return. Default: 50.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of rooms to return. Default: 50.
     * </p>
     * 
     * @return Maximum number of rooms to return. Default: 50.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of rooms to return. Default: 50.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of rooms to return. Default: 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoomsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Filters the list to match the specified message review handler URI.
     * </p>
     * 
     * @param messageReviewHandlerUri
     *        Filters the list to match the specified message review handler URI.
     */

    public void setMessageReviewHandlerUri(String messageReviewHandlerUri) {
        this.messageReviewHandlerUri = messageReviewHandlerUri;
    }

    /**
     * <p>
     * Filters the list to match the specified message review handler URI.
     * </p>
     * 
     * @return Filters the list to match the specified message review handler URI.
     */

    public String getMessageReviewHandlerUri() {
        return this.messageReviewHandlerUri;
    }

    /**
     * <p>
     * Filters the list to match the specified message review handler URI.
     * </p>
     * 
     * @param messageReviewHandlerUri
     *        Filters the list to match the specified message review handler URI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoomsRequest withMessageReviewHandlerUri(String messageReviewHandlerUri) {
        setMessageReviewHandlerUri(messageReviewHandlerUri);
        return this;
    }

    /**
     * <p>
     * Filters the list to match the specified room name.
     * </p>
     * 
     * @param name
     *        Filters the list to match the specified room name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Filters the list to match the specified room name.
     * </p>
     * 
     * @return Filters the list to match the specified room name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Filters the list to match the specified room name.
     * </p>
     * 
     * @param name
     *        Filters the list to match the specified room name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoomsRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The first room to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * </p>
     * 
     * @param nextToken
     *        The first room to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The first room to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * </p>
     * 
     * @return The first room to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The first room to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * </p>
     * 
     * @param nextToken
     *        The first room to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoomsRequest withNextToken(String nextToken) {
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
        if (getLoggingConfigurationIdentifier() != null)
            sb.append("LoggingConfigurationIdentifier: ").append(getLoggingConfigurationIdentifier()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getMessageReviewHandlerUri() != null)
            sb.append("MessageReviewHandlerUri: ").append(getMessageReviewHandlerUri()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof ListRoomsRequest == false)
            return false;
        ListRoomsRequest other = (ListRoomsRequest) obj;
        if (other.getLoggingConfigurationIdentifier() == null ^ this.getLoggingConfigurationIdentifier() == null)
            return false;
        if (other.getLoggingConfigurationIdentifier() != null
                && other.getLoggingConfigurationIdentifier().equals(this.getLoggingConfigurationIdentifier()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getMessageReviewHandlerUri() == null ^ this.getMessageReviewHandlerUri() == null)
            return false;
        if (other.getMessageReviewHandlerUri() != null && other.getMessageReviewHandlerUri().equals(this.getMessageReviewHandlerUri()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getLoggingConfigurationIdentifier() == null) ? 0 : getLoggingConfigurationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getMessageReviewHandlerUri() == null) ? 0 : getMessageReviewHandlerUri().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRoomsRequest clone() {
        return (ListRoomsRequest) super.clone();
    }

}
