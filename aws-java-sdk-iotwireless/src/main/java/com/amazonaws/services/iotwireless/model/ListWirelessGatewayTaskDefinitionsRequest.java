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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListWirelessGatewayTaskDefinitions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWirelessGatewayTaskDefinitionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results to return in this operation.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     * <b>null</b> to receive the first set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A filter to list only the wireless gateway task definitions that use this task definition type.
     * </p>
     */
    private String taskDefinitionType;

    /**
     * <p>
     * The maximum number of results to return in this operation.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in this operation.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in this operation.
     * </p>
     * 
     * @return The maximum number of results to return in this operation.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in this operation.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWirelessGatewayTaskDefinitionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     * <b>null</b> to receive the first set of results.
     * </p>
     * 
     * @param nextToken
     *        To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     *        <b>null</b> to receive the first set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     * <b>null</b> to receive the first set of results.
     * </p>
     * 
     * @return To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     *         <b>null</b> to receive the first set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     * <b>null</b> to receive the first set of results.
     * </p>
     * 
     * @param nextToken
     *        To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     *        <b>null</b> to receive the first set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWirelessGatewayTaskDefinitionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A filter to list only the wireless gateway task definitions that use this task definition type.
     * </p>
     * 
     * @param taskDefinitionType
     *        A filter to list only the wireless gateway task definitions that use this task definition type.
     * @see WirelessGatewayTaskDefinitionType
     */

    public void setTaskDefinitionType(String taskDefinitionType) {
        this.taskDefinitionType = taskDefinitionType;
    }

    /**
     * <p>
     * A filter to list only the wireless gateway task definitions that use this task definition type.
     * </p>
     * 
     * @return A filter to list only the wireless gateway task definitions that use this task definition type.
     * @see WirelessGatewayTaskDefinitionType
     */

    public String getTaskDefinitionType() {
        return this.taskDefinitionType;
    }

    /**
     * <p>
     * A filter to list only the wireless gateway task definitions that use this task definition type.
     * </p>
     * 
     * @param taskDefinitionType
     *        A filter to list only the wireless gateway task definitions that use this task definition type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessGatewayTaskDefinitionType
     */

    public ListWirelessGatewayTaskDefinitionsRequest withTaskDefinitionType(String taskDefinitionType) {
        setTaskDefinitionType(taskDefinitionType);
        return this;
    }

    /**
     * <p>
     * A filter to list only the wireless gateway task definitions that use this task definition type.
     * </p>
     * 
     * @param taskDefinitionType
     *        A filter to list only the wireless gateway task definitions that use this task definition type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessGatewayTaskDefinitionType
     */

    public ListWirelessGatewayTaskDefinitionsRequest withTaskDefinitionType(WirelessGatewayTaskDefinitionType taskDefinitionType) {
        this.taskDefinitionType = taskDefinitionType.toString();
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
        if (getTaskDefinitionType() != null)
            sb.append("TaskDefinitionType: ").append(getTaskDefinitionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWirelessGatewayTaskDefinitionsRequest == false)
            return false;
        ListWirelessGatewayTaskDefinitionsRequest other = (ListWirelessGatewayTaskDefinitionsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTaskDefinitionType() == null ^ this.getTaskDefinitionType() == null)
            return false;
        if (other.getTaskDefinitionType() != null && other.getTaskDefinitionType().equals(this.getTaskDefinitionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTaskDefinitionType() == null) ? 0 : getTaskDefinitionType().hashCode());
        return hashCode;
    }

    @Override
    public ListWirelessGatewayTaskDefinitionsRequest clone() {
        return (ListWirelessGatewayTaskDefinitionsRequest) super.clone();
    }

}
