/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListRecordingConfigurations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecordingConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of the matching recording configurations.
     * </p>
     */
    private java.util.List<RecordingConfigurationSummary> recordingConfigurations;
    /**
     * <p>
     * If there are more recording configurations than <code>maxResults</code>, use <code>nextToken</code> in the
     * request to get the next set.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of the matching recording configurations.
     * </p>
     * 
     * @return List of the matching recording configurations.
     */

    public java.util.List<RecordingConfigurationSummary> getRecordingConfigurations() {
        return recordingConfigurations;
    }

    /**
     * <p>
     * List of the matching recording configurations.
     * </p>
     * 
     * @param recordingConfigurations
     *        List of the matching recording configurations.
     */

    public void setRecordingConfigurations(java.util.Collection<RecordingConfigurationSummary> recordingConfigurations) {
        if (recordingConfigurations == null) {
            this.recordingConfigurations = null;
            return;
        }

        this.recordingConfigurations = new java.util.ArrayList<RecordingConfigurationSummary>(recordingConfigurations);
    }

    /**
     * <p>
     * List of the matching recording configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecordingConfigurations(java.util.Collection)} or
     * {@link #withRecordingConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param recordingConfigurations
     *        List of the matching recording configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordingConfigurationsResult withRecordingConfigurations(RecordingConfigurationSummary... recordingConfigurations) {
        if (this.recordingConfigurations == null) {
            setRecordingConfigurations(new java.util.ArrayList<RecordingConfigurationSummary>(recordingConfigurations.length));
        }
        for (RecordingConfigurationSummary ele : recordingConfigurations) {
            this.recordingConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the matching recording configurations.
     * </p>
     * 
     * @param recordingConfigurations
     *        List of the matching recording configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordingConfigurationsResult withRecordingConfigurations(java.util.Collection<RecordingConfigurationSummary> recordingConfigurations) {
        setRecordingConfigurations(recordingConfigurations);
        return this;
    }

    /**
     * <p>
     * If there are more recording configurations than <code>maxResults</code>, use <code>nextToken</code> in the
     * request to get the next set.
     * </p>
     * 
     * @param nextToken
     *        If there are more recording configurations than <code>maxResults</code>, use <code>nextToken</code> in the
     *        request to get the next set.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more recording configurations than <code>maxResults</code>, use <code>nextToken</code> in the
     * request to get the next set.
     * </p>
     * 
     * @return If there are more recording configurations than <code>maxResults</code>, use <code>nextToken</code> in
     *         the request to get the next set.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more recording configurations than <code>maxResults</code>, use <code>nextToken</code> in the
     * request to get the next set.
     * </p>
     * 
     * @param nextToken
     *        If there are more recording configurations than <code>maxResults</code>, use <code>nextToken</code> in the
     *        request to get the next set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordingConfigurationsResult withNextToken(String nextToken) {
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
        if (getRecordingConfigurations() != null)
            sb.append("RecordingConfigurations: ").append(getRecordingConfigurations()).append(",");
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

        if (obj instanceof ListRecordingConfigurationsResult == false)
            return false;
        ListRecordingConfigurationsResult other = (ListRecordingConfigurationsResult) obj;
        if (other.getRecordingConfigurations() == null ^ this.getRecordingConfigurations() == null)
            return false;
        if (other.getRecordingConfigurations() != null && other.getRecordingConfigurations().equals(this.getRecordingConfigurations()) == false)
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

        hashCode = prime * hashCode + ((getRecordingConfigurations() == null) ? 0 : getRecordingConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRecordingConfigurationsResult clone() {
        try {
            return (ListRecordingConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
