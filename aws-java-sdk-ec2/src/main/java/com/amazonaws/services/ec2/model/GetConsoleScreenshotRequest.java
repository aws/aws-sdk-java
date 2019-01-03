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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.GetConsoleScreenshotRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConsoleScreenshotRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<GetConsoleScreenshotRequest> {

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * When set to <code>true</code>, acts as keystroke input and wakes up an instance that's in standby or "sleep"
     * mode.
     * </p>
     */
    private Boolean wakeUp;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConsoleScreenshotRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, acts as keystroke input and wakes up an instance that's in standby or "sleep"
     * mode.
     * </p>
     * 
     * @param wakeUp
     *        When set to <code>true</code>, acts as keystroke input and wakes up an instance that's in standby or
     *        "sleep" mode.
     */

    public void setWakeUp(Boolean wakeUp) {
        this.wakeUp = wakeUp;
    }

    /**
     * <p>
     * When set to <code>true</code>, acts as keystroke input and wakes up an instance that's in standby or "sleep"
     * mode.
     * </p>
     * 
     * @return When set to <code>true</code>, acts as keystroke input and wakes up an instance that's in standby or
     *         "sleep" mode.
     */

    public Boolean getWakeUp() {
        return this.wakeUp;
    }

    /**
     * <p>
     * When set to <code>true</code>, acts as keystroke input and wakes up an instance that's in standby or "sleep"
     * mode.
     * </p>
     * 
     * @param wakeUp
     *        When set to <code>true</code>, acts as keystroke input and wakes up an instance that's in standby or
     *        "sleep" mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConsoleScreenshotRequest withWakeUp(Boolean wakeUp) {
        setWakeUp(wakeUp);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, acts as keystroke input and wakes up an instance that's in standby or "sleep"
     * mode.
     * </p>
     * 
     * @return When set to <code>true</code>, acts as keystroke input and wakes up an instance that's in standby or
     *         "sleep" mode.
     */

    public Boolean isWakeUp() {
        return this.wakeUp;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<GetConsoleScreenshotRequest> getDryRunRequest() {
        Request<GetConsoleScreenshotRequest> request = new GetConsoleScreenshotRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getWakeUp() != null)
            sb.append("WakeUp: ").append(getWakeUp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConsoleScreenshotRequest == false)
            return false;
        GetConsoleScreenshotRequest other = (GetConsoleScreenshotRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getWakeUp() == null ^ this.getWakeUp() == null)
            return false;
        if (other.getWakeUp() != null && other.getWakeUp().equals(this.getWakeUp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getWakeUp() == null) ? 0 : getWakeUp().hashCode());
        return hashCode;
    }

    @Override
    public GetConsoleScreenshotRequest clone() {
        return (GetConsoleScreenshotRequest) super.clone();
    }
}
