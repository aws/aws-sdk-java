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
 * Placeholder documentation for ListCloudWatchAlarmTemplateGroupsRequest
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListCloudWatchAlarmTemplateGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCloudWatchAlarmTemplateGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private Integer maxResults;
    /** A token used to retrieve the next set of results in paginated list responses. */
    private String nextToken;
    /** Represents the scope of a resource, with options for all scopes, AWS provided resources, or local resources. */
    private String scope;
    /** A signal map's identifier. Can be either be its id or current name. */
    private String signalMapIdentifier;

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

    public ListCloudWatchAlarmTemplateGroupsRequest withMaxResults(Integer maxResults) {
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

    public ListCloudWatchAlarmTemplateGroupsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Represents the scope of a resource, with options for all scopes, AWS provided resources, or local resources.
     * 
     * @param scope
     *        Represents the scope of a resource, with options for all scopes, AWS provided resources, or local
     *        resources.
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * Represents the scope of a resource, with options for all scopes, AWS provided resources, or local resources.
     * 
     * @return Represents the scope of a resource, with options for all scopes, AWS provided resources, or local
     *         resources.
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * Represents the scope of a resource, with options for all scopes, AWS provided resources, or local resources.
     * 
     * @param scope
     *        Represents the scope of a resource, with options for all scopes, AWS provided resources, or local
     *        resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCloudWatchAlarmTemplateGroupsRequest withScope(String scope) {
        setScope(scope);
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

    public ListCloudWatchAlarmTemplateGroupsRequest withSignalMapIdentifier(String signalMapIdentifier) {
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
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

        if (obj instanceof ListCloudWatchAlarmTemplateGroupsRequest == false)
            return false;
        ListCloudWatchAlarmTemplateGroupsRequest other = (ListCloudWatchAlarmTemplateGroupsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getSignalMapIdentifier() == null) ? 0 : getSignalMapIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ListCloudWatchAlarmTemplateGroupsRequest clone() {
        return (ListCloudWatchAlarmTemplateGroupsRequest) super.clone();
    }

}
