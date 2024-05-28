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
 * Placeholder documentation for ListSignalMapsRequest
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListSignalMaps" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSignalMapsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** A cloudwatch alarm template group's identifier. Can be either be its id or current name. */
    private String cloudWatchAlarmTemplateGroupIdentifier;
    /** An eventbridge rule template group's identifier. Can be either be its id or current name. */
    private String eventBridgeRuleTemplateGroupIdentifier;

    private Integer maxResults;
    /** A token used to retrieve the next set of results in paginated list responses. */
    private String nextToken;

    /**
     * A cloudwatch alarm template group's identifier. Can be either be its id or current name.
     * 
     * @param cloudWatchAlarmTemplateGroupIdentifier
     *        A cloudwatch alarm template group's identifier. Can be either be its id or current name.
     */

    public void setCloudWatchAlarmTemplateGroupIdentifier(String cloudWatchAlarmTemplateGroupIdentifier) {
        this.cloudWatchAlarmTemplateGroupIdentifier = cloudWatchAlarmTemplateGroupIdentifier;
    }

    /**
     * A cloudwatch alarm template group's identifier. Can be either be its id or current name.
     * 
     * @return A cloudwatch alarm template group's identifier. Can be either be its id or current name.
     */

    public String getCloudWatchAlarmTemplateGroupIdentifier() {
        return this.cloudWatchAlarmTemplateGroupIdentifier;
    }

    /**
     * A cloudwatch alarm template group's identifier. Can be either be its id or current name.
     * 
     * @param cloudWatchAlarmTemplateGroupIdentifier
     *        A cloudwatch alarm template group's identifier. Can be either be its id or current name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSignalMapsRequest withCloudWatchAlarmTemplateGroupIdentifier(String cloudWatchAlarmTemplateGroupIdentifier) {
        setCloudWatchAlarmTemplateGroupIdentifier(cloudWatchAlarmTemplateGroupIdentifier);
        return this;
    }

    /**
     * An eventbridge rule template group's identifier. Can be either be its id or current name.
     * 
     * @param eventBridgeRuleTemplateGroupIdentifier
     *        An eventbridge rule template group's identifier. Can be either be its id or current name.
     */

    public void setEventBridgeRuleTemplateGroupIdentifier(String eventBridgeRuleTemplateGroupIdentifier) {
        this.eventBridgeRuleTemplateGroupIdentifier = eventBridgeRuleTemplateGroupIdentifier;
    }

    /**
     * An eventbridge rule template group's identifier. Can be either be its id or current name.
     * 
     * @return An eventbridge rule template group's identifier. Can be either be its id or current name.
     */

    public String getEventBridgeRuleTemplateGroupIdentifier() {
        return this.eventBridgeRuleTemplateGroupIdentifier;
    }

    /**
     * An eventbridge rule template group's identifier. Can be either be its id or current name.
     * 
     * @param eventBridgeRuleTemplateGroupIdentifier
     *        An eventbridge rule template group's identifier. Can be either be its id or current name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSignalMapsRequest withEventBridgeRuleTemplateGroupIdentifier(String eventBridgeRuleTemplateGroupIdentifier) {
        setEventBridgeRuleTemplateGroupIdentifier(eventBridgeRuleTemplateGroupIdentifier);
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

    public ListSignalMapsRequest withMaxResults(Integer maxResults) {
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

    public ListSignalMapsRequest withNextToken(String nextToken) {
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
        if (getCloudWatchAlarmTemplateGroupIdentifier() != null)
            sb.append("CloudWatchAlarmTemplateGroupIdentifier: ").append(getCloudWatchAlarmTemplateGroupIdentifier()).append(",");
        if (getEventBridgeRuleTemplateGroupIdentifier() != null)
            sb.append("EventBridgeRuleTemplateGroupIdentifier: ").append(getEventBridgeRuleTemplateGroupIdentifier()).append(",");
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

        if (obj instanceof ListSignalMapsRequest == false)
            return false;
        ListSignalMapsRequest other = (ListSignalMapsRequest) obj;
        if (other.getCloudWatchAlarmTemplateGroupIdentifier() == null ^ this.getCloudWatchAlarmTemplateGroupIdentifier() == null)
            return false;
        if (other.getCloudWatchAlarmTemplateGroupIdentifier() != null
                && other.getCloudWatchAlarmTemplateGroupIdentifier().equals(this.getCloudWatchAlarmTemplateGroupIdentifier()) == false)
            return false;
        if (other.getEventBridgeRuleTemplateGroupIdentifier() == null ^ this.getEventBridgeRuleTemplateGroupIdentifier() == null)
            return false;
        if (other.getEventBridgeRuleTemplateGroupIdentifier() != null
                && other.getEventBridgeRuleTemplateGroupIdentifier().equals(this.getEventBridgeRuleTemplateGroupIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getCloudWatchAlarmTemplateGroupIdentifier() == null) ? 0 : getCloudWatchAlarmTemplateGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEventBridgeRuleTemplateGroupIdentifier() == null) ? 0 : getEventBridgeRuleTemplateGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSignalMapsRequest clone() {
        return (ListSignalMapsRequest) super.clone();
    }

}
