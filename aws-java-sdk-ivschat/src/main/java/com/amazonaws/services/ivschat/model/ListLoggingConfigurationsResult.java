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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/ListLoggingConfigurations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLoggingConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of the matching logging configurations (summary information only). There is only one type of destination (
     * <code>cloudWatchLogs</code>, <code>firehose</code>, or <code>s3</code>) in a
     * <code>destinationConfiguration</code>.
     * </p>
     */
    private java.util.List<LoggingConfigurationSummary> loggingConfigurations;
    /**
     * <p>
     * If there are more logging configurations than <code>maxResults</code>, use <code>nextToken</code> in the request
     * to get the next set.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of the matching logging configurations (summary information only). There is only one type of destination (
     * <code>cloudWatchLogs</code>, <code>firehose</code>, or <code>s3</code>) in a
     * <code>destinationConfiguration</code>.
     * </p>
     * 
     * @return List of the matching logging configurations (summary information only). There is only one type of
     *         destination (<code>cloudWatchLogs</code>, <code>firehose</code>, or <code>s3</code>) in a
     *         <code>destinationConfiguration</code>.
     */

    public java.util.List<LoggingConfigurationSummary> getLoggingConfigurations() {
        return loggingConfigurations;
    }

    /**
     * <p>
     * List of the matching logging configurations (summary information only). There is only one type of destination (
     * <code>cloudWatchLogs</code>, <code>firehose</code>, or <code>s3</code>) in a
     * <code>destinationConfiguration</code>.
     * </p>
     * 
     * @param loggingConfigurations
     *        List of the matching logging configurations (summary information only). There is only one type of
     *        destination (<code>cloudWatchLogs</code>, <code>firehose</code>, or <code>s3</code>) in a
     *        <code>destinationConfiguration</code>.
     */

    public void setLoggingConfigurations(java.util.Collection<LoggingConfigurationSummary> loggingConfigurations) {
        if (loggingConfigurations == null) {
            this.loggingConfigurations = null;
            return;
        }

        this.loggingConfigurations = new java.util.ArrayList<LoggingConfigurationSummary>(loggingConfigurations);
    }

    /**
     * <p>
     * List of the matching logging configurations (summary information only). There is only one type of destination (
     * <code>cloudWatchLogs</code>, <code>firehose</code>, or <code>s3</code>) in a
     * <code>destinationConfiguration</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoggingConfigurations(java.util.Collection)} or
     * {@link #withLoggingConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param loggingConfigurations
     *        List of the matching logging configurations (summary information only). There is only one type of
     *        destination (<code>cloudWatchLogs</code>, <code>firehose</code>, or <code>s3</code>) in a
     *        <code>destinationConfiguration</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLoggingConfigurationsResult withLoggingConfigurations(LoggingConfigurationSummary... loggingConfigurations) {
        if (this.loggingConfigurations == null) {
            setLoggingConfigurations(new java.util.ArrayList<LoggingConfigurationSummary>(loggingConfigurations.length));
        }
        for (LoggingConfigurationSummary ele : loggingConfigurations) {
            this.loggingConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the matching logging configurations (summary information only). There is only one type of destination (
     * <code>cloudWatchLogs</code>, <code>firehose</code>, or <code>s3</code>) in a
     * <code>destinationConfiguration</code>.
     * </p>
     * 
     * @param loggingConfigurations
     *        List of the matching logging configurations (summary information only). There is only one type of
     *        destination (<code>cloudWatchLogs</code>, <code>firehose</code>, or <code>s3</code>) in a
     *        <code>destinationConfiguration</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLoggingConfigurationsResult withLoggingConfigurations(java.util.Collection<LoggingConfigurationSummary> loggingConfigurations) {
        setLoggingConfigurations(loggingConfigurations);
        return this;
    }

    /**
     * <p>
     * If there are more logging configurations than <code>maxResults</code>, use <code>nextToken</code> in the request
     * to get the next set.
     * </p>
     * 
     * @param nextToken
     *        If there are more logging configurations than <code>maxResults</code>, use <code>nextToken</code> in the
     *        request to get the next set.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more logging configurations than <code>maxResults</code>, use <code>nextToken</code> in the request
     * to get the next set.
     * </p>
     * 
     * @return If there are more logging configurations than <code>maxResults</code>, use <code>nextToken</code> in the
     *         request to get the next set.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more logging configurations than <code>maxResults</code>, use <code>nextToken</code> in the request
     * to get the next set.
     * </p>
     * 
     * @param nextToken
     *        If there are more logging configurations than <code>maxResults</code>, use <code>nextToken</code> in the
     *        request to get the next set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLoggingConfigurationsResult withNextToken(String nextToken) {
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
        if (getLoggingConfigurations() != null)
            sb.append("LoggingConfigurations: ").append(getLoggingConfigurations()).append(",");
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

        if (obj instanceof ListLoggingConfigurationsResult == false)
            return false;
        ListLoggingConfigurationsResult other = (ListLoggingConfigurationsResult) obj;
        if (other.getLoggingConfigurations() == null ^ this.getLoggingConfigurations() == null)
            return false;
        if (other.getLoggingConfigurations() != null && other.getLoggingConfigurations().equals(this.getLoggingConfigurations()) == false)
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

        hashCode = prime * hashCode + ((getLoggingConfigurations() == null) ? 0 : getLoggingConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLoggingConfigurationsResult clone() {
        try {
            return (ListLoggingConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
