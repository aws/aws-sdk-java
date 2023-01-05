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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StopContactStreaming" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopContactStreamingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact that is associated with the first
     * interaction with the contact center.
     * </p>
     */
    private String contactId;
    /**
     * <p>
     * The identifier of the streaming configuration enabled.
     * </p>
     */
    private String streamingId;

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

    public StopContactStreamingRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact that is associated with the first
     * interaction with the contact center.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact. This is the identifier of the contact that is associated with the first
     *        interaction with the contact center.
     */

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact that is associated with the first
     * interaction with the contact center.
     * </p>
     * 
     * @return The identifier of the contact. This is the identifier of the contact that is associated with the first
     *         interaction with the contact center.
     */

    public String getContactId() {
        return this.contactId;
    }

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact that is associated with the first
     * interaction with the contact center.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact. This is the identifier of the contact that is associated with the first
     *        interaction with the contact center.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopContactStreamingRequest withContactId(String contactId) {
        setContactId(contactId);
        return this;
    }

    /**
     * <p>
     * The identifier of the streaming configuration enabled.
     * </p>
     * 
     * @param streamingId
     *        The identifier of the streaming configuration enabled.
     */

    public void setStreamingId(String streamingId) {
        this.streamingId = streamingId;
    }

    /**
     * <p>
     * The identifier of the streaming configuration enabled.
     * </p>
     * 
     * @return The identifier of the streaming configuration enabled.
     */

    public String getStreamingId() {
        return this.streamingId;
    }

    /**
     * <p>
     * The identifier of the streaming configuration enabled.
     * </p>
     * 
     * @param streamingId
     *        The identifier of the streaming configuration enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopContactStreamingRequest withStreamingId(String streamingId) {
        setStreamingId(streamingId);
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
        if (getContactId() != null)
            sb.append("ContactId: ").append(getContactId()).append(",");
        if (getStreamingId() != null)
            sb.append("StreamingId: ").append(getStreamingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopContactStreamingRequest == false)
            return false;
        StopContactStreamingRequest other = (StopContactStreamingRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getStreamingId() == null ^ this.getStreamingId() == null)
            return false;
        if (other.getStreamingId() != null && other.getStreamingId().equals(this.getStreamingId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getStreamingId() == null) ? 0 : getStreamingId().hashCode());
        return hashCode;
    }

    @Override
    public StopContactStreamingRequest clone() {
        return (StopContactStreamingRequest) super.clone();
    }

}
