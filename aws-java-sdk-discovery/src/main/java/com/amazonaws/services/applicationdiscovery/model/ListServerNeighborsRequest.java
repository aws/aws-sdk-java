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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServerNeighborsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Configuration ID of the server for which neighbors are being listed.
     * </p>
     */
    private String configurationId;
    /**
     * <p>
     * Flag to indicate if port and protocol information is needed as part of the response.
     * </p>
     */
    private Boolean portInformationNeeded;
    /**
     * <p>
     * List of configuration IDs to test for one-hop-away.
     * </p>
     */
    private java.util.List<String> neighborConfigurationIds;
    /**
     * <p>
     * Maximum number of results to return in a single page of output.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Token to retrieve the next set of results. For example, if you previously specified 100 IDs for
     * <code>ListServerNeighborsRequest$neighborConfigurationIds</code> but set
     * <code>ListServerNeighborsRequest$maxResults</code> to 10, you received a set of 10 results along with a token.
     * Use that token in this query to get the next set of 10.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Configuration ID of the server for which neighbors are being listed.
     * </p>
     * 
     * @param configurationId
     *        Configuration ID of the server for which neighbors are being listed.
     */

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    /**
     * <p>
     * Configuration ID of the server for which neighbors are being listed.
     * </p>
     * 
     * @return Configuration ID of the server for which neighbors are being listed.
     */

    public String getConfigurationId() {
        return this.configurationId;
    }

    /**
     * <p>
     * Configuration ID of the server for which neighbors are being listed.
     * </p>
     * 
     * @param configurationId
     *        Configuration ID of the server for which neighbors are being listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServerNeighborsRequest withConfigurationId(String configurationId) {
        setConfigurationId(configurationId);
        return this;
    }

    /**
     * <p>
     * Flag to indicate if port and protocol information is needed as part of the response.
     * </p>
     * 
     * @param portInformationNeeded
     *        Flag to indicate if port and protocol information is needed as part of the response.
     */

    public void setPortInformationNeeded(Boolean portInformationNeeded) {
        this.portInformationNeeded = portInformationNeeded;
    }

    /**
     * <p>
     * Flag to indicate if port and protocol information is needed as part of the response.
     * </p>
     * 
     * @return Flag to indicate if port and protocol information is needed as part of the response.
     */

    public Boolean getPortInformationNeeded() {
        return this.portInformationNeeded;
    }

    /**
     * <p>
     * Flag to indicate if port and protocol information is needed as part of the response.
     * </p>
     * 
     * @param portInformationNeeded
     *        Flag to indicate if port and protocol information is needed as part of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServerNeighborsRequest withPortInformationNeeded(Boolean portInformationNeeded) {
        setPortInformationNeeded(portInformationNeeded);
        return this;
    }

    /**
     * <p>
     * Flag to indicate if port and protocol information is needed as part of the response.
     * </p>
     * 
     * @return Flag to indicate if port and protocol information is needed as part of the response.
     */

    public Boolean isPortInformationNeeded() {
        return this.portInformationNeeded;
    }

    /**
     * <p>
     * List of configuration IDs to test for one-hop-away.
     * </p>
     * 
     * @return List of configuration IDs to test for one-hop-away.
     */

    public java.util.List<String> getNeighborConfigurationIds() {
        return neighborConfigurationIds;
    }

    /**
     * <p>
     * List of configuration IDs to test for one-hop-away.
     * </p>
     * 
     * @param neighborConfigurationIds
     *        List of configuration IDs to test for one-hop-away.
     */

    public void setNeighborConfigurationIds(java.util.Collection<String> neighborConfigurationIds) {
        if (neighborConfigurationIds == null) {
            this.neighborConfigurationIds = null;
            return;
        }

        this.neighborConfigurationIds = new java.util.ArrayList<String>(neighborConfigurationIds);
    }

    /**
     * <p>
     * List of configuration IDs to test for one-hop-away.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNeighborConfigurationIds(java.util.Collection)} or
     * {@link #withNeighborConfigurationIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param neighborConfigurationIds
     *        List of configuration IDs to test for one-hop-away.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServerNeighborsRequest withNeighborConfigurationIds(String... neighborConfigurationIds) {
        if (this.neighborConfigurationIds == null) {
            setNeighborConfigurationIds(new java.util.ArrayList<String>(neighborConfigurationIds.length));
        }
        for (String ele : neighborConfigurationIds) {
            this.neighborConfigurationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of configuration IDs to test for one-hop-away.
     * </p>
     * 
     * @param neighborConfigurationIds
     *        List of configuration IDs to test for one-hop-away.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServerNeighborsRequest withNeighborConfigurationIds(java.util.Collection<String> neighborConfigurationIds) {
        setNeighborConfigurationIds(neighborConfigurationIds);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return in a single page of output.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return in a single page of output.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return in a single page of output.
     * </p>
     * 
     * @return Maximum number of results to return in a single page of output.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return in a single page of output.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return in a single page of output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServerNeighborsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Token to retrieve the next set of results. For example, if you previously specified 100 IDs for
     * <code>ListServerNeighborsRequest$neighborConfigurationIds</code> but set
     * <code>ListServerNeighborsRequest$maxResults</code> to 10, you received a set of 10 results along with a token.
     * Use that token in this query to get the next set of 10.
     * </p>
     * 
     * @param nextToken
     *        Token to retrieve the next set of results. For example, if you previously specified 100 IDs for
     *        <code>ListServerNeighborsRequest$neighborConfigurationIds</code> but set
     *        <code>ListServerNeighborsRequest$maxResults</code> to 10, you received a set of 10 results along with a
     *        token. Use that token in this query to get the next set of 10.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token to retrieve the next set of results. For example, if you previously specified 100 IDs for
     * <code>ListServerNeighborsRequest$neighborConfigurationIds</code> but set
     * <code>ListServerNeighborsRequest$maxResults</code> to 10, you received a set of 10 results along with a token.
     * Use that token in this query to get the next set of 10.
     * </p>
     * 
     * @return Token to retrieve the next set of results. For example, if you previously specified 100 IDs for
     *         <code>ListServerNeighborsRequest$neighborConfigurationIds</code> but set
     *         <code>ListServerNeighborsRequest$maxResults</code> to 10, you received a set of 10 results along with a
     *         token. Use that token in this query to get the next set of 10.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token to retrieve the next set of results. For example, if you previously specified 100 IDs for
     * <code>ListServerNeighborsRequest$neighborConfigurationIds</code> but set
     * <code>ListServerNeighborsRequest$maxResults</code> to 10, you received a set of 10 results along with a token.
     * Use that token in this query to get the next set of 10.
     * </p>
     * 
     * @param nextToken
     *        Token to retrieve the next set of results. For example, if you previously specified 100 IDs for
     *        <code>ListServerNeighborsRequest$neighborConfigurationIds</code> but set
     *        <code>ListServerNeighborsRequest$maxResults</code> to 10, you received a set of 10 results along with a
     *        token. Use that token in this query to get the next set of 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServerNeighborsRequest withNextToken(String nextToken) {
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
        if (getConfigurationId() != null)
            sb.append("ConfigurationId: ").append(getConfigurationId()).append(",");
        if (getPortInformationNeeded() != null)
            sb.append("PortInformationNeeded: ").append(getPortInformationNeeded()).append(",");
        if (getNeighborConfigurationIds() != null)
            sb.append("NeighborConfigurationIds: ").append(getNeighborConfigurationIds()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListServerNeighborsRequest == false)
            return false;
        ListServerNeighborsRequest other = (ListServerNeighborsRequest) obj;
        if (other.getConfigurationId() == null ^ this.getConfigurationId() == null)
            return false;
        if (other.getConfigurationId() != null && other.getConfigurationId().equals(this.getConfigurationId()) == false)
            return false;
        if (other.getPortInformationNeeded() == null ^ this.getPortInformationNeeded() == null)
            return false;
        if (other.getPortInformationNeeded() != null && other.getPortInformationNeeded().equals(this.getPortInformationNeeded()) == false)
            return false;
        if (other.getNeighborConfigurationIds() == null ^ this.getNeighborConfigurationIds() == null)
            return false;
        if (other.getNeighborConfigurationIds() != null && other.getNeighborConfigurationIds().equals(this.getNeighborConfigurationIds()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getConfigurationId() == null) ? 0 : getConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getPortInformationNeeded() == null) ? 0 : getPortInformationNeeded().hashCode());
        hashCode = prime * hashCode + ((getNeighborConfigurationIds() == null) ? 0 : getNeighborConfigurationIds().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListServerNeighborsRequest clone() {
        return (ListServerNeighborsRequest) super.clone();
    }

}
