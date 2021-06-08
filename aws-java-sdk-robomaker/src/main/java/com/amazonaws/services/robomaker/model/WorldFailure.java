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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a failed world.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/WorldFailure" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorldFailure implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The failure code of the world export job if it failed:
     * </p>
     * <dl>
     * <dt>InternalServiceError</dt>
     * <dd>
     * <p>
     * Internal service error.
     * </p>
     * </dd>
     * <dt>LimitExceeded</dt>
     * <dd>
     * <p>
     * The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds
     * the maximum number allowed.
     * </p>
     * </dd>
     * <dt>ResourceNotFound</dt>
     * <dd>
     * <p>
     * The specified resource could not be found.
     * </p>
     * </dd>
     * <dt>RequestThrottled</dt>
     * <dd>
     * <p>
     * The request was throttled.
     * </p>
     * </dd>
     * <dt>InvalidInput</dt>
     * <dd>
     * <p>
     * An input parameter in the request is not valid.
     * </p>
     * </dd>
     * </dl>
     */
    private String failureCode;
    /**
     * <p>
     * The sample reason why the world failed. World errors are aggregated. A sample is used as the
     * <code>sampleFailureReason</code>.
     * </p>
     */
    private String sampleFailureReason;
    /**
     * <p>
     * The number of failed worlds.
     * </p>
     */
    private Integer failureCount;

    /**
     * <p>
     * The failure code of the world export job if it failed:
     * </p>
     * <dl>
     * <dt>InternalServiceError</dt>
     * <dd>
     * <p>
     * Internal service error.
     * </p>
     * </dd>
     * <dt>LimitExceeded</dt>
     * <dd>
     * <p>
     * The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds
     * the maximum number allowed.
     * </p>
     * </dd>
     * <dt>ResourceNotFound</dt>
     * <dd>
     * <p>
     * The specified resource could not be found.
     * </p>
     * </dd>
     * <dt>RequestThrottled</dt>
     * <dd>
     * <p>
     * The request was throttled.
     * </p>
     * </dd>
     * <dt>InvalidInput</dt>
     * <dd>
     * <p>
     * An input parameter in the request is not valid.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param failureCode
     *        The failure code of the world export job if it failed:</p>
     *        <dl>
     *        <dt>InternalServiceError</dt>
     *        <dd>
     *        <p>
     *        Internal service error.
     *        </p>
     *        </dd>
     *        <dt>LimitExceeded</dt>
     *        <dd>
     *        <p>
     *        The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *        exceeds the maximum number allowed.
     *        </p>
     *        </dd>
     *        <dt>ResourceNotFound</dt>
     *        <dd>
     *        <p>
     *        The specified resource could not be found.
     *        </p>
     *        </dd>
     *        <dt>RequestThrottled</dt>
     *        <dd>
     *        <p>
     *        The request was throttled.
     *        </p>
     *        </dd>
     *        <dt>InvalidInput</dt>
     *        <dd>
     *        <p>
     *        An input parameter in the request is not valid.
     *        </p>
     *        </dd>
     * @see WorldGenerationJobErrorCode
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The failure code of the world export job if it failed:
     * </p>
     * <dl>
     * <dt>InternalServiceError</dt>
     * <dd>
     * <p>
     * Internal service error.
     * </p>
     * </dd>
     * <dt>LimitExceeded</dt>
     * <dd>
     * <p>
     * The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds
     * the maximum number allowed.
     * </p>
     * </dd>
     * <dt>ResourceNotFound</dt>
     * <dd>
     * <p>
     * The specified resource could not be found.
     * </p>
     * </dd>
     * <dt>RequestThrottled</dt>
     * <dd>
     * <p>
     * The request was throttled.
     * </p>
     * </dd>
     * <dt>InvalidInput</dt>
     * <dd>
     * <p>
     * An input parameter in the request is not valid.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The failure code of the world export job if it failed:</p>
     *         <dl>
     *         <dt>InternalServiceError</dt>
     *         <dd>
     *         <p>
     *         Internal service error.
     *         </p>
     *         </dd>
     *         <dt>LimitExceeded</dt>
     *         <dd>
     *         <p>
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     *         </p>
     *         </dd>
     *         <dt>ResourceNotFound</dt>
     *         <dd>
     *         <p>
     *         The specified resource could not be found.
     *         </p>
     *         </dd>
     *         <dt>RequestThrottled</dt>
     *         <dd>
     *         <p>
     *         The request was throttled.
     *         </p>
     *         </dd>
     *         <dt>InvalidInput</dt>
     *         <dd>
     *         <p>
     *         An input parameter in the request is not valid.
     *         </p>
     *         </dd>
     * @see WorldGenerationJobErrorCode
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The failure code of the world export job if it failed:
     * </p>
     * <dl>
     * <dt>InternalServiceError</dt>
     * <dd>
     * <p>
     * Internal service error.
     * </p>
     * </dd>
     * <dt>LimitExceeded</dt>
     * <dd>
     * <p>
     * The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds
     * the maximum number allowed.
     * </p>
     * </dd>
     * <dt>ResourceNotFound</dt>
     * <dd>
     * <p>
     * The specified resource could not be found.
     * </p>
     * </dd>
     * <dt>RequestThrottled</dt>
     * <dd>
     * <p>
     * The request was throttled.
     * </p>
     * </dd>
     * <dt>InvalidInput</dt>
     * <dd>
     * <p>
     * An input parameter in the request is not valid.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param failureCode
     *        The failure code of the world export job if it failed:</p>
     *        <dl>
     *        <dt>InternalServiceError</dt>
     *        <dd>
     *        <p>
     *        Internal service error.
     *        </p>
     *        </dd>
     *        <dt>LimitExceeded</dt>
     *        <dd>
     *        <p>
     *        The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *        exceeds the maximum number allowed.
     *        </p>
     *        </dd>
     *        <dt>ResourceNotFound</dt>
     *        <dd>
     *        <p>
     *        The specified resource could not be found.
     *        </p>
     *        </dd>
     *        <dt>RequestThrottled</dt>
     *        <dd>
     *        <p>
     *        The request was throttled.
     *        </p>
     *        </dd>
     *        <dt>InvalidInput</dt>
     *        <dd>
     *        <p>
     *        An input parameter in the request is not valid.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorldGenerationJobErrorCode
     */

    public WorldFailure withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The failure code of the world export job if it failed:
     * </p>
     * <dl>
     * <dt>InternalServiceError</dt>
     * <dd>
     * <p>
     * Internal service error.
     * </p>
     * </dd>
     * <dt>LimitExceeded</dt>
     * <dd>
     * <p>
     * The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds
     * the maximum number allowed.
     * </p>
     * </dd>
     * <dt>ResourceNotFound</dt>
     * <dd>
     * <p>
     * The specified resource could not be found.
     * </p>
     * </dd>
     * <dt>RequestThrottled</dt>
     * <dd>
     * <p>
     * The request was throttled.
     * </p>
     * </dd>
     * <dt>InvalidInput</dt>
     * <dd>
     * <p>
     * An input parameter in the request is not valid.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param failureCode
     *        The failure code of the world export job if it failed:</p>
     *        <dl>
     *        <dt>InternalServiceError</dt>
     *        <dd>
     *        <p>
     *        Internal service error.
     *        </p>
     *        </dd>
     *        <dt>LimitExceeded</dt>
     *        <dd>
     *        <p>
     *        The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *        exceeds the maximum number allowed.
     *        </p>
     *        </dd>
     *        <dt>ResourceNotFound</dt>
     *        <dd>
     *        <p>
     *        The specified resource could not be found.
     *        </p>
     *        </dd>
     *        <dt>RequestThrottled</dt>
     *        <dd>
     *        <p>
     *        The request was throttled.
     *        </p>
     *        </dd>
     *        <dt>InvalidInput</dt>
     *        <dd>
     *        <p>
     *        An input parameter in the request is not valid.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorldGenerationJobErrorCode
     */

    public WorldFailure withFailureCode(WorldGenerationJobErrorCode failureCode) {
        this.failureCode = failureCode.toString();
        return this;
    }

    /**
     * <p>
     * The sample reason why the world failed. World errors are aggregated. A sample is used as the
     * <code>sampleFailureReason</code>.
     * </p>
     * 
     * @param sampleFailureReason
     *        The sample reason why the world failed. World errors are aggregated. A sample is used as the
     *        <code>sampleFailureReason</code>.
     */

    public void setSampleFailureReason(String sampleFailureReason) {
        this.sampleFailureReason = sampleFailureReason;
    }

    /**
     * <p>
     * The sample reason why the world failed. World errors are aggregated. A sample is used as the
     * <code>sampleFailureReason</code>.
     * </p>
     * 
     * @return The sample reason why the world failed. World errors are aggregated. A sample is used as the
     *         <code>sampleFailureReason</code>.
     */

    public String getSampleFailureReason() {
        return this.sampleFailureReason;
    }

    /**
     * <p>
     * The sample reason why the world failed. World errors are aggregated. A sample is used as the
     * <code>sampleFailureReason</code>.
     * </p>
     * 
     * @param sampleFailureReason
     *        The sample reason why the world failed. World errors are aggregated. A sample is used as the
     *        <code>sampleFailureReason</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorldFailure withSampleFailureReason(String sampleFailureReason) {
        setSampleFailureReason(sampleFailureReason);
        return this;
    }

    /**
     * <p>
     * The number of failed worlds.
     * </p>
     * 
     * @param failureCount
     *        The number of failed worlds.
     */

    public void setFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
    }

    /**
     * <p>
     * The number of failed worlds.
     * </p>
     * 
     * @return The number of failed worlds.
     */

    public Integer getFailureCount() {
        return this.failureCount;
    }

    /**
     * <p>
     * The number of failed worlds.
     * </p>
     * 
     * @param failureCount
     *        The number of failed worlds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorldFailure withFailureCount(Integer failureCount) {
        setFailureCount(failureCount);
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
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode()).append(",");
        if (getSampleFailureReason() != null)
            sb.append("SampleFailureReason: ").append(getSampleFailureReason()).append(",");
        if (getFailureCount() != null)
            sb.append("FailureCount: ").append(getFailureCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorldFailure == false)
            return false;
        WorldFailure other = (WorldFailure) obj;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getSampleFailureReason() == null ^ this.getSampleFailureReason() == null)
            return false;
        if (other.getSampleFailureReason() != null && other.getSampleFailureReason().equals(this.getSampleFailureReason()) == false)
            return false;
        if (other.getFailureCount() == null ^ this.getFailureCount() == null)
            return false;
        if (other.getFailureCount() != null && other.getFailureCount().equals(this.getFailureCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getSampleFailureReason() == null) ? 0 : getSampleFailureReason().hashCode());
        hashCode = prime * hashCode + ((getFailureCount() == null) ? 0 : getFailureCount().hashCode());
        return hashCode;
    }

    @Override
    public WorldFailure clone() {
        try {
            return (WorldFailure) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.WorldFailureMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
