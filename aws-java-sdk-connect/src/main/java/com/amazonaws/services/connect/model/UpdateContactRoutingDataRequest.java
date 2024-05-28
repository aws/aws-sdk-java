/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactRoutingData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateContactRoutingDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     */
    private String contactId;
    /**
     * <p>
     * The number of seconds to add or subtract from the contact's routing age. Contacts are routed to agents on a
     * first-come, first-serve basis. This means that changing their amount of time in queue compared to others also
     * changes their position in queue.
     * </p>
     */
    private Integer queueTimeAdjustmentSeconds;
    /**
     * <p>
     * Priority of the contact in the queue. The default priority for new contacts is 5. You can raise the priority of a
     * contact compared to other contacts in the queue by assigning them a higher priority, such as 1 or 2.
     * </p>
     */
    private Long queuePriority;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *         ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactRoutingDataRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact in this instance of Amazon Connect.
     */

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * 
     * @return The identifier of the contact in this instance of Amazon Connect.
     */

    public String getContactId() {
        return this.contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact in this instance of Amazon Connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactRoutingDataRequest withContactId(String contactId) {
        setContactId(contactId);
        return this;
    }

    /**
     * <p>
     * The number of seconds to add or subtract from the contact's routing age. Contacts are routed to agents on a
     * first-come, first-serve basis. This means that changing their amount of time in queue compared to others also
     * changes their position in queue.
     * </p>
     * 
     * @param queueTimeAdjustmentSeconds
     *        The number of seconds to add or subtract from the contact's routing age. Contacts are routed to agents on
     *        a first-come, first-serve basis. This means that changing their amount of time in queue compared to others
     *        also changes their position in queue.
     */

    public void setQueueTimeAdjustmentSeconds(Integer queueTimeAdjustmentSeconds) {
        this.queueTimeAdjustmentSeconds = queueTimeAdjustmentSeconds;
    }

    /**
     * <p>
     * The number of seconds to add or subtract from the contact's routing age. Contacts are routed to agents on a
     * first-come, first-serve basis. This means that changing their amount of time in queue compared to others also
     * changes their position in queue.
     * </p>
     * 
     * @return The number of seconds to add or subtract from the contact's routing age. Contacts are routed to agents on
     *         a first-come, first-serve basis. This means that changing their amount of time in queue compared to
     *         others also changes their position in queue.
     */

    public Integer getQueueTimeAdjustmentSeconds() {
        return this.queueTimeAdjustmentSeconds;
    }

    /**
     * <p>
     * The number of seconds to add or subtract from the contact's routing age. Contacts are routed to agents on a
     * first-come, first-serve basis. This means that changing their amount of time in queue compared to others also
     * changes their position in queue.
     * </p>
     * 
     * @param queueTimeAdjustmentSeconds
     *        The number of seconds to add or subtract from the contact's routing age. Contacts are routed to agents on
     *        a first-come, first-serve basis. This means that changing their amount of time in queue compared to others
     *        also changes their position in queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactRoutingDataRequest withQueueTimeAdjustmentSeconds(Integer queueTimeAdjustmentSeconds) {
        setQueueTimeAdjustmentSeconds(queueTimeAdjustmentSeconds);
        return this;
    }

    /**
     * <p>
     * Priority of the contact in the queue. The default priority for new contacts is 5. You can raise the priority of a
     * contact compared to other contacts in the queue by assigning them a higher priority, such as 1 or 2.
     * </p>
     * 
     * @param queuePriority
     *        Priority of the contact in the queue. The default priority for new contacts is 5. You can raise the
     *        priority of a contact compared to other contacts in the queue by assigning them a higher priority, such as
     *        1 or 2.
     */

    public void setQueuePriority(Long queuePriority) {
        this.queuePriority = queuePriority;
    }

    /**
     * <p>
     * Priority of the contact in the queue. The default priority for new contacts is 5. You can raise the priority of a
     * contact compared to other contacts in the queue by assigning them a higher priority, such as 1 or 2.
     * </p>
     * 
     * @return Priority of the contact in the queue. The default priority for new contacts is 5. You can raise the
     *         priority of a contact compared to other contacts in the queue by assigning them a higher priority, such
     *         as 1 or 2.
     */

    public Long getQueuePriority() {
        return this.queuePriority;
    }

    /**
     * <p>
     * Priority of the contact in the queue. The default priority for new contacts is 5. You can raise the priority of a
     * contact compared to other contacts in the queue by assigning them a higher priority, such as 1 or 2.
     * </p>
     * 
     * @param queuePriority
     *        Priority of the contact in the queue. The default priority for new contacts is 5. You can raise the
     *        priority of a contact compared to other contacts in the queue by assigning them a higher priority, such as
     *        1 or 2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactRoutingDataRequest withQueuePriority(Long queuePriority) {
        setQueuePriority(queuePriority);
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
        if (getQueueTimeAdjustmentSeconds() != null)
            sb.append("QueueTimeAdjustmentSeconds: ").append(getQueueTimeAdjustmentSeconds()).append(",");
        if (getQueuePriority() != null)
            sb.append("QueuePriority: ").append(getQueuePriority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContactRoutingDataRequest == false)
            return false;
        UpdateContactRoutingDataRequest other = (UpdateContactRoutingDataRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getQueueTimeAdjustmentSeconds() == null ^ this.getQueueTimeAdjustmentSeconds() == null)
            return false;
        if (other.getQueueTimeAdjustmentSeconds() != null && other.getQueueTimeAdjustmentSeconds().equals(this.getQueueTimeAdjustmentSeconds()) == false)
            return false;
        if (other.getQueuePriority() == null ^ this.getQueuePriority() == null)
            return false;
        if (other.getQueuePriority() != null && other.getQueuePriority().equals(this.getQueuePriority()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getQueueTimeAdjustmentSeconds() == null) ? 0 : getQueueTimeAdjustmentSeconds().hashCode());
        hashCode = prime * hashCode + ((getQueuePriority() == null) ? 0 : getQueuePriority().hashCode());
        return hashCode;
    }

    @Override
    public UpdateContactRoutingDataRequest clone() {
        return (UpdateContactRoutingDataRequest) super.clone();
    }

}
