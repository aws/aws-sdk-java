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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about an activity scheduled during an execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ActivityScheduledEventDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivityScheduledEventDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduled activity.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * The JSON data input to the activity task.
     * </p>
     */
    private String input;
    /**
     * <p>
     * The maximum allowed duration of the activity task.
     * </p>
     */
    private Long timeoutInSeconds;
    /**
     * <p>
     * The maximum allowed duration between two heartbeats for the activity task.
     * </p>
     */
    private Long heartbeatInSeconds;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduled activity.
     * </p>
     * 
     * @param resource
     *        The Amazon Resource Name (ARN) of the scheduled activity.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduled activity.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the scheduled activity.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduled activity.
     * </p>
     * 
     * @param resource
     *        The Amazon Resource Name (ARN) of the scheduled activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityScheduledEventDetails withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The JSON data input to the activity task.
     * </p>
     * 
     * @param input
     *        The JSON data input to the activity task.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The JSON data input to the activity task.
     * </p>
     * 
     * @return The JSON data input to the activity task.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The JSON data input to the activity task.
     * </p>
     * 
     * @param input
     *        The JSON data input to the activity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityScheduledEventDetails withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The maximum allowed duration of the activity task.
     * </p>
     * 
     * @param timeoutInSeconds
     *        The maximum allowed duration of the activity task.
     */

    public void setTimeoutInSeconds(Long timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    /**
     * <p>
     * The maximum allowed duration of the activity task.
     * </p>
     * 
     * @return The maximum allowed duration of the activity task.
     */

    public Long getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * <p>
     * The maximum allowed duration of the activity task.
     * </p>
     * 
     * @param timeoutInSeconds
     *        The maximum allowed duration of the activity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityScheduledEventDetails withTimeoutInSeconds(Long timeoutInSeconds) {
        setTimeoutInSeconds(timeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * The maximum allowed duration between two heartbeats for the activity task.
     * </p>
     * 
     * @param heartbeatInSeconds
     *        The maximum allowed duration between two heartbeats for the activity task.
     */

    public void setHeartbeatInSeconds(Long heartbeatInSeconds) {
        this.heartbeatInSeconds = heartbeatInSeconds;
    }

    /**
     * <p>
     * The maximum allowed duration between two heartbeats for the activity task.
     * </p>
     * 
     * @return The maximum allowed duration between two heartbeats for the activity task.
     */

    public Long getHeartbeatInSeconds() {
        return this.heartbeatInSeconds;
    }

    /**
     * <p>
     * The maximum allowed duration between two heartbeats for the activity task.
     * </p>
     * 
     * @param heartbeatInSeconds
     *        The maximum allowed duration between two heartbeats for the activity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityScheduledEventDetails withHeartbeatInSeconds(Long heartbeatInSeconds) {
        setHeartbeatInSeconds(heartbeatInSeconds);
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
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append("***Sensitive Data Redacted***").append(",");
        if (getTimeoutInSeconds() != null)
            sb.append("TimeoutInSeconds: ").append(getTimeoutInSeconds()).append(",");
        if (getHeartbeatInSeconds() != null)
            sb.append("HeartbeatInSeconds: ").append(getHeartbeatInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivityScheduledEventDetails == false)
            return false;
        ActivityScheduledEventDetails other = (ActivityScheduledEventDetails) obj;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getTimeoutInSeconds() == null ^ this.getTimeoutInSeconds() == null)
            return false;
        if (other.getTimeoutInSeconds() != null && other.getTimeoutInSeconds().equals(this.getTimeoutInSeconds()) == false)
            return false;
        if (other.getHeartbeatInSeconds() == null ^ this.getHeartbeatInSeconds() == null)
            return false;
        if (other.getHeartbeatInSeconds() != null && other.getHeartbeatInSeconds().equals(this.getHeartbeatInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInSeconds() == null) ? 0 : getTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode + ((getHeartbeatInSeconds() == null) ? 0 : getHeartbeatInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public ActivityScheduledEventDetails clone() {
        try {
            return (ActivityScheduledEventDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.ActivityScheduledEventDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
