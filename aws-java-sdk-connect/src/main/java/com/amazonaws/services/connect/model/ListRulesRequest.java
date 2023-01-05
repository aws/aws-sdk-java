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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRules" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRulesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The publish status of the rule.
     * </p>
     */
    private String publishStatus;
    /**
     * <p>
     * The name of the event source.
     * </p>
     */
    private String eventSourceName;
    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * 
     * @param publishStatus
     *        The publish status of the rule.
     * @see RulePublishStatus
     */

    public void setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * 
     * @return The publish status of the rule.
     * @see RulePublishStatus
     */

    public String getPublishStatus() {
        return this.publishStatus;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * 
     * @param publishStatus
     *        The publish status of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RulePublishStatus
     */

    public ListRulesRequest withPublishStatus(String publishStatus) {
        setPublishStatus(publishStatus);
        return this;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * 
     * @param publishStatus
     *        The publish status of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RulePublishStatus
     */

    public ListRulesRequest withPublishStatus(RulePublishStatus publishStatus) {
        this.publishStatus = publishStatus.toString();
        return this;
    }

    /**
     * <p>
     * The name of the event source.
     * </p>
     * 
     * @param eventSourceName
     *        The name of the event source.
     * @see EventSourceName
     */

    public void setEventSourceName(String eventSourceName) {
        this.eventSourceName = eventSourceName;
    }

    /**
     * <p>
     * The name of the event source.
     * </p>
     * 
     * @return The name of the event source.
     * @see EventSourceName
     */

    public String getEventSourceName() {
        return this.eventSourceName;
    }

    /**
     * <p>
     * The name of the event source.
     * </p>
     * 
     * @param eventSourceName
     *        The name of the event source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourceName
     */

    public ListRulesRequest withEventSourceName(String eventSourceName) {
        setEventSourceName(eventSourceName);
        return this;
    }

    /**
     * <p>
     * The name of the event source.
     * </p>
     * 
     * @param eventSourceName
     *        The name of the event source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourceName
     */

    public ListRulesRequest withEventSourceName(EventSourceName eventSourceName) {
        this.eventSourceName = eventSourceName.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @return The maximum number of results to return per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesRequest withNextToken(String nextToken) {
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getPublishStatus() != null)
            sb.append("PublishStatus: ").append(getPublishStatus()).append(",");
        if (getEventSourceName() != null)
            sb.append("EventSourceName: ").append(getEventSourceName()).append(",");
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

        if (obj instanceof ListRulesRequest == false)
            return false;
        ListRulesRequest other = (ListRulesRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getPublishStatus() == null ^ this.getPublishStatus() == null)
            return false;
        if (other.getPublishStatus() != null && other.getPublishStatus().equals(this.getPublishStatus()) == false)
            return false;
        if (other.getEventSourceName() == null ^ this.getEventSourceName() == null)
            return false;
        if (other.getEventSourceName() != null && other.getEventSourceName().equals(this.getEventSourceName()) == false)
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

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getPublishStatus() == null) ? 0 : getPublishStatus().hashCode());
        hashCode = prime * hashCode + ((getEventSourceName() == null) ? 0 : getEventSourceName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRulesRequest clone() {
        return (ListRulesRequest) super.clone();
    }

}
