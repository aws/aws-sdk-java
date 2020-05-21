/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains input information for a canary run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/CanaryRunConfigInput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CanaryRunConfigInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * How long the canary is allowed to run before it must stop. If you omit this field, the frequency of the canary is
     * used as this value, up to a maximum of 14 minutes.
     * </p>
     */
    private Integer timeoutInSeconds;
    /**
     * <p>
     * The maximum amount of memory available to the canary while it is running, in MB. The value you specify must be a
     * multiple of 64.
     * </p>
     */
    private Integer memoryInMB;

    /**
     * <p>
     * How long the canary is allowed to run before it must stop. If you omit this field, the frequency of the canary is
     * used as this value, up to a maximum of 14 minutes.
     * </p>
     * 
     * @param timeoutInSeconds
     *        How long the canary is allowed to run before it must stop. If you omit this field, the frequency of the
     *        canary is used as this value, up to a maximum of 14 minutes.
     */

    public void setTimeoutInSeconds(Integer timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    /**
     * <p>
     * How long the canary is allowed to run before it must stop. If you omit this field, the frequency of the canary is
     * used as this value, up to a maximum of 14 minutes.
     * </p>
     * 
     * @return How long the canary is allowed to run before it must stop. If you omit this field, the frequency of the
     *         canary is used as this value, up to a maximum of 14 minutes.
     */

    public Integer getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * <p>
     * How long the canary is allowed to run before it must stop. If you omit this field, the frequency of the canary is
     * used as this value, up to a maximum of 14 minutes.
     * </p>
     * 
     * @param timeoutInSeconds
     *        How long the canary is allowed to run before it must stop. If you omit this field, the frequency of the
     *        canary is used as this value, up to a maximum of 14 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryRunConfigInput withTimeoutInSeconds(Integer timeoutInSeconds) {
        setTimeoutInSeconds(timeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * The maximum amount of memory available to the canary while it is running, in MB. The value you specify must be a
     * multiple of 64.
     * </p>
     * 
     * @param memoryInMB
     *        The maximum amount of memory available to the canary while it is running, in MB. The value you specify
     *        must be a multiple of 64.
     */

    public void setMemoryInMB(Integer memoryInMB) {
        this.memoryInMB = memoryInMB;
    }

    /**
     * <p>
     * The maximum amount of memory available to the canary while it is running, in MB. The value you specify must be a
     * multiple of 64.
     * </p>
     * 
     * @return The maximum amount of memory available to the canary while it is running, in MB. The value you specify
     *         must be a multiple of 64.
     */

    public Integer getMemoryInMB() {
        return this.memoryInMB;
    }

    /**
     * <p>
     * The maximum amount of memory available to the canary while it is running, in MB. The value you specify must be a
     * multiple of 64.
     * </p>
     * 
     * @param memoryInMB
     *        The maximum amount of memory available to the canary while it is running, in MB. The value you specify
     *        must be a multiple of 64.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryRunConfigInput withMemoryInMB(Integer memoryInMB) {
        setMemoryInMB(memoryInMB);
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
        if (getTimeoutInSeconds() != null)
            sb.append("TimeoutInSeconds: ").append(getTimeoutInSeconds()).append(",");
        if (getMemoryInMB() != null)
            sb.append("MemoryInMB: ").append(getMemoryInMB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanaryRunConfigInput == false)
            return false;
        CanaryRunConfigInput other = (CanaryRunConfigInput) obj;
        if (other.getTimeoutInSeconds() == null ^ this.getTimeoutInSeconds() == null)
            return false;
        if (other.getTimeoutInSeconds() != null && other.getTimeoutInSeconds().equals(this.getTimeoutInSeconds()) == false)
            return false;
        if (other.getMemoryInMB() == null ^ this.getMemoryInMB() == null)
            return false;
        if (other.getMemoryInMB() != null && other.getMemoryInMB().equals(this.getMemoryInMB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeoutInSeconds() == null) ? 0 : getTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode + ((getMemoryInMB() == null) ? 0 : getMemoryInMB().hashCode());
        return hashCode;
    }

    @Override
    public CanaryRunConfigInput clone() {
        try {
            return (CanaryRunConfigInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.synthetics.model.transform.CanaryRunConfigInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
