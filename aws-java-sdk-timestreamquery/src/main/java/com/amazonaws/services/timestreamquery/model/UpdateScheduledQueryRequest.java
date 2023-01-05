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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/UpdateScheduledQuery"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateScheduledQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ARN of the scheuled query.
     * </p>
     */
    private String scheduledQueryArn;
    /**
     * <p>
     * State of the scheduled query.
     * </p>
     */
    private String state;

    /**
     * <p>
     * ARN of the scheuled query.
     * </p>
     * 
     * @param scheduledQueryArn
     *        ARN of the scheuled query.
     */

    public void setScheduledQueryArn(String scheduledQueryArn) {
        this.scheduledQueryArn = scheduledQueryArn;
    }

    /**
     * <p>
     * ARN of the scheuled query.
     * </p>
     * 
     * @return ARN of the scheuled query.
     */

    public String getScheduledQueryArn() {
        return this.scheduledQueryArn;
    }

    /**
     * <p>
     * ARN of the scheuled query.
     * </p>
     * 
     * @param scheduledQueryArn
     *        ARN of the scheuled query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduledQueryRequest withScheduledQueryArn(String scheduledQueryArn) {
        setScheduledQueryArn(scheduledQueryArn);
        return this;
    }

    /**
     * <p>
     * State of the scheduled query.
     * </p>
     * 
     * @param state
     *        State of the scheduled query.
     * @see ScheduledQueryState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * State of the scheduled query.
     * </p>
     * 
     * @return State of the scheduled query.
     * @see ScheduledQueryState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * State of the scheduled query.
     * </p>
     * 
     * @param state
     *        State of the scheduled query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledQueryState
     */

    public UpdateScheduledQueryRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * State of the scheduled query.
     * </p>
     * 
     * @param state
     *        State of the scheduled query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledQueryState
     */

    public UpdateScheduledQueryRequest withState(ScheduledQueryState state) {
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
        if (getScheduledQueryArn() != null)
            sb.append("ScheduledQueryArn: ").append(getScheduledQueryArn()).append(",");
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

        if (obj instanceof UpdateScheduledQueryRequest == false)
            return false;
        UpdateScheduledQueryRequest other = (UpdateScheduledQueryRequest) obj;
        if (other.getScheduledQueryArn() == null ^ this.getScheduledQueryArn() == null)
            return false;
        if (other.getScheduledQueryArn() != null && other.getScheduledQueryArn().equals(this.getScheduledQueryArn()) == false)
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

        hashCode = prime * hashCode + ((getScheduledQueryArn() == null) ? 0 : getScheduledQueryArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public UpdateScheduledQueryRequest clone() {
        return (UpdateScheduledQueryRequest) super.clone();
    }

}
