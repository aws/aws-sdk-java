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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Placeholder documentation for ListEventBridgeRuleTemplatesRequest
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListEventBridgeRuleTemplates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEventBridgeRuleTemplatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** An eventbridge rule template group's identifier. Can be either be its id or current name. */
    private String groupIdentifier;

    private Integer maxResults;
    /** A token used to retrieve the next set of results in paginated list responses. */
    private String nextToken;
    /** A signal map's identifier. Can be either be its id or current name. */
    private String signalMapIdentifier;

    /**
     * An eventbridge rule template group's identifier. Can be either be its id or current name.
     * 
     * @param groupIdentifier
     *        An eventbridge rule template group's identifier. Can be either be its id or current name.
     */

    public void setGroupIdentifier(String groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
    }

    /**
     * An eventbridge rule template group's identifier. Can be either be its id or current name.
     * 
     * @return An eventbridge rule template group's identifier. Can be either be its id or current name.
     */

    public String getGroupIdentifier() {
        return this.groupIdentifier;
    }

    /**
     * An eventbridge rule template group's identifier. Can be either be its id or current name.
     * 
     * @param groupIdentifier
     *        An eventbridge rule template group's identifier. Can be either be its id or current name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventBridgeRuleTemplatesRequest withGroupIdentifier(String groupIdentifier) {
        setGroupIdentifier(groupIdentifier);
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

    public ListEventBridgeRuleTemplatesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * A token used to retrieve the next set of results in paginated list responses.
     * 
     * @param nextToken
     *        A token used to retrieve the next set of results in paginated list responses.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A token used to retrieve the next set of results in paginated list responses.
     * 
     * @return A token used to retrieve the next set of results in paginated list responses.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A token used to retrieve the next set of results in paginated list responses.
     * 
     * @param nextToken
     *        A token used to retrieve the next set of results in paginated list responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventBridgeRuleTemplatesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * A signal map's identifier. Can be either be its id or current name.
     * 
     * @param signalMapIdentifier
     *        A signal map's identifier. Can be either be its id or current name.
     */

    public void setSignalMapIdentifier(String signalMapIdentifier) {
        this.signalMapIdentifier = signalMapIdentifier;
    }

    /**
     * A signal map's identifier. Can be either be its id or current name.
     * 
     * @return A signal map's identifier. Can be either be its id or current name.
     */

    public String getSignalMapIdentifier() {
        return this.signalMapIdentifier;
    }

    /**
     * A signal map's identifier. Can be either be its id or current name.
     * 
     * @param signalMapIdentifier
     *        A signal map's identifier. Can be either be its id or current name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventBridgeRuleTemplatesRequest withSignalMapIdentifier(String signalMapIdentifier) {
        setSignalMapIdentifier(signalMapIdentifier);
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
        if (getGroupIdentifier() != null)
            sb.append("GroupIdentifier: ").append(getGroupIdentifier()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSignalMapIdentifier() != null)
            sb.append("SignalMapIdentifier: ").append(getSignalMapIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEventBridgeRuleTemplatesRequest == false)
            return false;
        ListEventBridgeRuleTemplatesRequest other = (ListEventBridgeRuleTemplatesRequest) obj;
        if (other.getGroupIdentifier() == null ^ this.getGroupIdentifier() == null)
            return false;
        if (other.getGroupIdentifier() != null && other.getGroupIdentifier().equals(this.getGroupIdentifier()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSignalMapIdentifier() == null ^ this.getSignalMapIdentifier() == null)
            return false;
        if (other.getSignalMapIdentifier() != null && other.getSignalMapIdentifier().equals(this.getSignalMapIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupIdentifier() == null) ? 0 : getGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSignalMapIdentifier() == null) ? 0 : getSignalMapIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ListEventBridgeRuleTemplatesRequest clone() {
        return (ListEventBridgeRuleTemplatesRequest) super.clone();
    }

}
