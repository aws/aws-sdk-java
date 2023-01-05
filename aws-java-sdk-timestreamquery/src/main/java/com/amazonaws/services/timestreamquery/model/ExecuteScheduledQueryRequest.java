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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/ExecuteScheduledQuery"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteScheduledQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ARN of the scheduled query.
     * </p>
     */
    private String scheduledQueryArn;
    /**
     * <p>
     * The timestamp in UTC. Query will be run as if it was invoked at this timestamp.
     * </p>
     */
    private java.util.Date invocationTime;
    /**
     * <p>
     * Not used.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * ARN of the scheduled query.
     * </p>
     * 
     * @param scheduledQueryArn
     *        ARN of the scheduled query.
     */

    public void setScheduledQueryArn(String scheduledQueryArn) {
        this.scheduledQueryArn = scheduledQueryArn;
    }

    /**
     * <p>
     * ARN of the scheduled query.
     * </p>
     * 
     * @return ARN of the scheduled query.
     */

    public String getScheduledQueryArn() {
        return this.scheduledQueryArn;
    }

    /**
     * <p>
     * ARN of the scheduled query.
     * </p>
     * 
     * @param scheduledQueryArn
     *        ARN of the scheduled query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteScheduledQueryRequest withScheduledQueryArn(String scheduledQueryArn) {
        setScheduledQueryArn(scheduledQueryArn);
        return this;
    }

    /**
     * <p>
     * The timestamp in UTC. Query will be run as if it was invoked at this timestamp.
     * </p>
     * 
     * @param invocationTime
     *        The timestamp in UTC. Query will be run as if it was invoked at this timestamp.
     */

    public void setInvocationTime(java.util.Date invocationTime) {
        this.invocationTime = invocationTime;
    }

    /**
     * <p>
     * The timestamp in UTC. Query will be run as if it was invoked at this timestamp.
     * </p>
     * 
     * @return The timestamp in UTC. Query will be run as if it was invoked at this timestamp.
     */

    public java.util.Date getInvocationTime() {
        return this.invocationTime;
    }

    /**
     * <p>
     * The timestamp in UTC. Query will be run as if it was invoked at this timestamp.
     * </p>
     * 
     * @param invocationTime
     *        The timestamp in UTC. Query will be run as if it was invoked at this timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteScheduledQueryRequest withInvocationTime(java.util.Date invocationTime) {
        setInvocationTime(invocationTime);
        return this;
    }

    /**
     * <p>
     * Not used.
     * </p>
     * 
     * @param clientToken
     *        Not used.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Not used.
     * </p>
     * 
     * @return Not used.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Not used.
     * </p>
     * 
     * @param clientToken
     *        Not used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteScheduledQueryRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getScheduledQueryArn() != null)
            sb.append("ScheduledQueryArn: ").append(getScheduledQueryArn()).append(",");
        if (getInvocationTime() != null)
            sb.append("InvocationTime: ").append(getInvocationTime()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteScheduledQueryRequest == false)
            return false;
        ExecuteScheduledQueryRequest other = (ExecuteScheduledQueryRequest) obj;
        if (other.getScheduledQueryArn() == null ^ this.getScheduledQueryArn() == null)
            return false;
        if (other.getScheduledQueryArn() != null && other.getScheduledQueryArn().equals(this.getScheduledQueryArn()) == false)
            return false;
        if (other.getInvocationTime() == null ^ this.getInvocationTime() == null)
            return false;
        if (other.getInvocationTime() != null && other.getInvocationTime().equals(this.getInvocationTime()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduledQueryArn() == null) ? 0 : getScheduledQueryArn().hashCode());
        hashCode = prime * hashCode + ((getInvocationTime() == null) ? 0 : getInvocationTime().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteScheduledQueryRequest clone() {
        return (ExecuteScheduledQueryRequest) super.clone();
    }

}
