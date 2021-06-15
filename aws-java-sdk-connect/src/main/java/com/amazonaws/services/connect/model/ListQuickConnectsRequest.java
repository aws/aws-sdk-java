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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListQuickConnects" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListQuickConnectsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are prompted to
     * assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * </p>
     */
    private java.util.List<String> quickConnectTypes;

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

    public ListQuickConnectsRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
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

    public ListQuickConnectsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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

    public ListQuickConnectsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are prompted to
     * assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * </p>
     * 
     * @return The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are
     *         prompted to assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * @see QuickConnectType
     */

    public java.util.List<String> getQuickConnectTypes() {
        return quickConnectTypes;
    }

    /**
     * <p>
     * The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are prompted to
     * assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * </p>
     * 
     * @param quickConnectTypes
     *        The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are
     *        prompted to assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * @see QuickConnectType
     */

    public void setQuickConnectTypes(java.util.Collection<String> quickConnectTypes) {
        if (quickConnectTypes == null) {
            this.quickConnectTypes = null;
            return;
        }

        this.quickConnectTypes = new java.util.ArrayList<String>(quickConnectTypes);
    }

    /**
     * <p>
     * The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are prompted to
     * assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQuickConnectTypes(java.util.Collection)} or {@link #withQuickConnectTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param quickConnectTypes
     *        The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are
     *        prompted to assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuickConnectType
     */

    public ListQuickConnectsRequest withQuickConnectTypes(String... quickConnectTypes) {
        if (this.quickConnectTypes == null) {
            setQuickConnectTypes(new java.util.ArrayList<String>(quickConnectTypes.length));
        }
        for (String ele : quickConnectTypes) {
            this.quickConnectTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are prompted to
     * assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * </p>
     * 
     * @param quickConnectTypes
     *        The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are
     *        prompted to assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuickConnectType
     */

    public ListQuickConnectsRequest withQuickConnectTypes(java.util.Collection<String> quickConnectTypes) {
        setQuickConnectTypes(quickConnectTypes);
        return this;
    }

    /**
     * <p>
     * The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are prompted to
     * assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * </p>
     * 
     * @param quickConnectTypes
     *        The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are
     *        prompted to assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuickConnectType
     */

    public ListQuickConnectsRequest withQuickConnectTypes(QuickConnectType... quickConnectTypes) {
        java.util.ArrayList<String> quickConnectTypesCopy = new java.util.ArrayList<String>(quickConnectTypes.length);
        for (QuickConnectType value : quickConnectTypes) {
            quickConnectTypesCopy.add(value.toString());
        }
        if (getQuickConnectTypes() == null) {
            setQuickConnectTypes(quickConnectTypesCopy);
        } else {
            getQuickConnectTypes().addAll(quickConnectTypesCopy);
        }
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getQuickConnectTypes() != null)
            sb.append("QuickConnectTypes: ").append(getQuickConnectTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListQuickConnectsRequest == false)
            return false;
        ListQuickConnectsRequest other = (ListQuickConnectsRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getQuickConnectTypes() == null ^ this.getQuickConnectTypes() == null)
            return false;
        if (other.getQuickConnectTypes() != null && other.getQuickConnectTypes().equals(this.getQuickConnectTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getQuickConnectTypes() == null) ? 0 : getQuickConnectTypes().hashCode());
        return hashCode;
    }

    @Override
    public ListQuickConnectsRequest clone() {
        return (ListQuickConnectsRequest) super.clone();
    }

}
