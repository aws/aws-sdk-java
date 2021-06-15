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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQueueMaxContacts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateQueueMaxContactsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The identifier for the queue.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * The maximum number of contacts that can be in the queue before it is considered full.
     * </p>
     */
    private Integer maxContacts;

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

    public UpdateQueueMaxContactsRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     * 
     * @param queueId
     *        The identifier for the queue.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     * 
     * @return The identifier for the queue.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     * 
     * @param queueId
     *        The identifier for the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQueueMaxContactsRequest withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * The maximum number of contacts that can be in the queue before it is considered full.
     * </p>
     * 
     * @param maxContacts
     *        The maximum number of contacts that can be in the queue before it is considered full.
     */

    public void setMaxContacts(Integer maxContacts) {
        this.maxContacts = maxContacts;
    }

    /**
     * <p>
     * The maximum number of contacts that can be in the queue before it is considered full.
     * </p>
     * 
     * @return The maximum number of contacts that can be in the queue before it is considered full.
     */

    public Integer getMaxContacts() {
        return this.maxContacts;
    }

    /**
     * <p>
     * The maximum number of contacts that can be in the queue before it is considered full.
     * </p>
     * 
     * @param maxContacts
     *        The maximum number of contacts that can be in the queue before it is considered full.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQueueMaxContactsRequest withMaxContacts(Integer maxContacts) {
        setMaxContacts(maxContacts);
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
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId()).append(",");
        if (getMaxContacts() != null)
            sb.append("MaxContacts: ").append(getMaxContacts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateQueueMaxContactsRequest == false)
            return false;
        UpdateQueueMaxContactsRequest other = (UpdateQueueMaxContactsRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getMaxContacts() == null ^ this.getMaxContacts() == null)
            return false;
        if (other.getMaxContacts() != null && other.getMaxContacts().equals(this.getMaxContacts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getMaxContacts() == null) ? 0 : getMaxContacts().hashCode());
        return hashCode;
    }

    @Override
    public UpdateQueueMaxContactsRequest clone() {
        return (UpdateQueueMaxContactsRequest) super.clone();
    }

}
