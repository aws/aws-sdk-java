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
package com.amazonaws.services.iotroborunner.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/ListDestinations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDestinationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String site;

    private Integer maxResults;

    private String nextToken;

    private String state;

    /**
     * @param site
     */

    public void setSite(String site) {
        this.site = site;
    }

    /**
     * @return
     */

    public String getSite() {
        return this.site;
    }

    /**
     * @param site
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDestinationsRequest withSite(String site) {
        setSite(site);
        return this;
    }

    /**
     * @param maxResults
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * @return
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @param maxResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDestinationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDestinationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * @param state
     * @see DestinationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     * @see DestinationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationState
     */

    public ListDestinationsRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationState
     */

    public ListDestinationsRequest withState(DestinationState state) {
        this.state = state.toString();
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
        if (getSite() != null)
            sb.append("Site: ").append(getSite()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDestinationsRequest == false)
            return false;
        ListDestinationsRequest other = (ListDestinationsRequest) obj;
        if (other.getSite() == null ^ this.getSite() == null)
            return false;
        if (other.getSite() != null && other.getSite().equals(this.getSite()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSite() == null) ? 0 : getSite().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public ListDestinationsRequest clone() {
        return (ListDestinationsRequest) super.clone();
    }

}
