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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeletePool" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePoolResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pool that was deleted.
     * </p>
     */
    private String poolArn;
    /**
     * <p>
     * The PoolId of the pool that was deleted.
     * </p>
     */
    private String poolId;
    /**
     * <p>
     * The current status of the pool.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING: The pool is currently being created and isn't yet available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE: The pool is active and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING: The pool is being deleted.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The message type that was associated with the deleted pool.
     * </p>
     */
    private String messageType;
    /**
     * <p>
     * By default this is set to false. When set to true you can receive incoming text messages from your end
     * recipients.
     * </p>
     */
    private Boolean twoWayEnabled;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the TwoWayChannel.
     * </p>
     */
    private String twoWayChannelArn;
    /**
     * <p>
     * By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to one of
     * your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end
     * recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're
     * also responsible for tracking and honoring opt-out requests.
     * </p>
     */
    private Boolean selfManagedOptOutsEnabled;
    /**
     * <p>
     * The name of the OptOutList that was associated with the deleted pool.
     * </p>
     */
    private String optOutListName;
    /**
     * <p>
     * Indicates whether shared routes are enabled for the pool.
     * </p>
     */
    private Boolean sharedRoutesEnabled;
    /**
     * <p>
     * The time when the pool was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pool that was deleted.
     * </p>
     * 
     * @param poolArn
     *        The Amazon Resource Name (ARN) of the pool that was deleted.
     */

    public void setPoolArn(String poolArn) {
        this.poolArn = poolArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pool that was deleted.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the pool that was deleted.
     */

    public String getPoolArn() {
        return this.poolArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pool that was deleted.
     * </p>
     * 
     * @param poolArn
     *        The Amazon Resource Name (ARN) of the pool that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePoolResult withPoolArn(String poolArn) {
        setPoolArn(poolArn);
        return this;
    }

    /**
     * <p>
     * The PoolId of the pool that was deleted.
     * </p>
     * 
     * @param poolId
     *        The PoolId of the pool that was deleted.
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The PoolId of the pool that was deleted.
     * </p>
     * 
     * @return The PoolId of the pool that was deleted.
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The PoolId of the pool that was deleted.
     * </p>
     * 
     * @param poolId
     *        The PoolId of the pool that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePoolResult withPoolId(String poolId) {
        setPoolId(poolId);
        return this;
    }

    /**
     * <p>
     * The current status of the pool.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING: The pool is currently being created and isn't yet available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE: The pool is active and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING: The pool is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the pool.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATING: The pool is currently being created and isn't yet available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE: The pool is active and available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING: The pool is being deleted.
     *        </p>
     *        </li>
     * @see PoolStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the pool.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING: The pool is currently being created and isn't yet available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE: The pool is active and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING: The pool is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the pool.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATING: The pool is currently being created and isn't yet available for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACTIVE: The pool is active and available for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETING: The pool is being deleted.
     *         </p>
     *         </li>
     * @see PoolStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the pool.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING: The pool is currently being created and isn't yet available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE: The pool is active and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING: The pool is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the pool.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATING: The pool is currently being created and isn't yet available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE: The pool is active and available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING: The pool is being deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PoolStatus
     */

    public DeletePoolResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the pool.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING: The pool is currently being created and isn't yet available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE: The pool is active and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING: The pool is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the pool.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATING: The pool is currently being created and isn't yet available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE: The pool is active and available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING: The pool is being deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PoolStatus
     */

    public DeletePoolResult withStatus(PoolStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The message type that was associated with the deleted pool.
     * </p>
     * 
     * @param messageType
     *        The message type that was associated with the deleted pool.
     * @see MessageType
     */

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * <p>
     * The message type that was associated with the deleted pool.
     * </p>
     * 
     * @return The message type that was associated with the deleted pool.
     * @see MessageType
     */

    public String getMessageType() {
        return this.messageType;
    }

    /**
     * <p>
     * The message type that was associated with the deleted pool.
     * </p>
     * 
     * @param messageType
     *        The message type that was associated with the deleted pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public DeletePoolResult withMessageType(String messageType) {
        setMessageType(messageType);
        return this;
    }

    /**
     * <p>
     * The message type that was associated with the deleted pool.
     * </p>
     * 
     * @param messageType
     *        The message type that was associated with the deleted pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public DeletePoolResult withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
        return this;
    }

    /**
     * <p>
     * By default this is set to false. When set to true you can receive incoming text messages from your end
     * recipients.
     * </p>
     * 
     * @param twoWayEnabled
     *        By default this is set to false. When set to true you can receive incoming text messages from your end
     *        recipients.
     */

    public void setTwoWayEnabled(Boolean twoWayEnabled) {
        this.twoWayEnabled = twoWayEnabled;
    }

    /**
     * <p>
     * By default this is set to false. When set to true you can receive incoming text messages from your end
     * recipients.
     * </p>
     * 
     * @return By default this is set to false. When set to true you can receive incoming text messages from your end
     *         recipients.
     */

    public Boolean getTwoWayEnabled() {
        return this.twoWayEnabled;
    }

    /**
     * <p>
     * By default this is set to false. When set to true you can receive incoming text messages from your end
     * recipients.
     * </p>
     * 
     * @param twoWayEnabled
     *        By default this is set to false. When set to true you can receive incoming text messages from your end
     *        recipients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePoolResult withTwoWayEnabled(Boolean twoWayEnabled) {
        setTwoWayEnabled(twoWayEnabled);
        return this;
    }

    /**
     * <p>
     * By default this is set to false. When set to true you can receive incoming text messages from your end
     * recipients.
     * </p>
     * 
     * @return By default this is set to false. When set to true you can receive incoming text messages from your end
     *         recipients.
     */

    public Boolean isTwoWayEnabled() {
        return this.twoWayEnabled;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the TwoWayChannel.
     * </p>
     * 
     * @param twoWayChannelArn
     *        The Amazon Resource Name (ARN) of the TwoWayChannel.
     */

    public void setTwoWayChannelArn(String twoWayChannelArn) {
        this.twoWayChannelArn = twoWayChannelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the TwoWayChannel.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the TwoWayChannel.
     */

    public String getTwoWayChannelArn() {
        return this.twoWayChannelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the TwoWayChannel.
     * </p>
     * 
     * @param twoWayChannelArn
     *        The Amazon Resource Name (ARN) of the TwoWayChannel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePoolResult withTwoWayChannelArn(String twoWayChannelArn) {
        setTwoWayChannelArn(twoWayChannelArn);
        return this;
    }

    /**
     * <p>
     * By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to one of
     * your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end
     * recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're
     * also responsible for tracking and honoring opt-out requests.
     * </p>
     * 
     * @param selfManagedOptOutsEnabled
     *        By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to
     *        one of your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds
     *        the end recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP
     *        requests. You're also responsible for tracking and honoring opt-out requests.
     */

    public void setSelfManagedOptOutsEnabled(Boolean selfManagedOptOutsEnabled) {
        this.selfManagedOptOutsEnabled = selfManagedOptOutsEnabled;
    }

    /**
     * <p>
     * By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to one of
     * your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end
     * recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're
     * also responsible for tracking and honoring opt-out requests.
     * </p>
     * 
     * @return By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to
     *         one of your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds
     *         the end recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP
     *         requests. You're also responsible for tracking and honoring opt-out requests.
     */

    public Boolean getSelfManagedOptOutsEnabled() {
        return this.selfManagedOptOutsEnabled;
    }

    /**
     * <p>
     * By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to one of
     * your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end
     * recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're
     * also responsible for tracking and honoring opt-out requests.
     * </p>
     * 
     * @param selfManagedOptOutsEnabled
     *        By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to
     *        one of your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds
     *        the end recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP
     *        requests. You're also responsible for tracking and honoring opt-out requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePoolResult withSelfManagedOptOutsEnabled(Boolean selfManagedOptOutsEnabled) {
        setSelfManagedOptOutsEnabled(selfManagedOptOutsEnabled);
        return this;
    }

    /**
     * <p>
     * By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to one of
     * your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end
     * recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're
     * also responsible for tracking and honoring opt-out requests.
     * </p>
     * 
     * @return By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to
     *         one of your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds
     *         the end recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP
     *         requests. You're also responsible for tracking and honoring opt-out requests.
     */

    public Boolean isSelfManagedOptOutsEnabled() {
        return this.selfManagedOptOutsEnabled;
    }

    /**
     * <p>
     * The name of the OptOutList that was associated with the deleted pool.
     * </p>
     * 
     * @param optOutListName
     *        The name of the OptOutList that was associated with the deleted pool.
     */

    public void setOptOutListName(String optOutListName) {
        this.optOutListName = optOutListName;
    }

    /**
     * <p>
     * The name of the OptOutList that was associated with the deleted pool.
     * </p>
     * 
     * @return The name of the OptOutList that was associated with the deleted pool.
     */

    public String getOptOutListName() {
        return this.optOutListName;
    }

    /**
     * <p>
     * The name of the OptOutList that was associated with the deleted pool.
     * </p>
     * 
     * @param optOutListName
     *        The name of the OptOutList that was associated with the deleted pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePoolResult withOptOutListName(String optOutListName) {
        setOptOutListName(optOutListName);
        return this;
    }

    /**
     * <p>
     * Indicates whether shared routes are enabled for the pool.
     * </p>
     * 
     * @param sharedRoutesEnabled
     *        Indicates whether shared routes are enabled for the pool.
     */

    public void setSharedRoutesEnabled(Boolean sharedRoutesEnabled) {
        this.sharedRoutesEnabled = sharedRoutesEnabled;
    }

    /**
     * <p>
     * Indicates whether shared routes are enabled for the pool.
     * </p>
     * 
     * @return Indicates whether shared routes are enabled for the pool.
     */

    public Boolean getSharedRoutesEnabled() {
        return this.sharedRoutesEnabled;
    }

    /**
     * <p>
     * Indicates whether shared routes are enabled for the pool.
     * </p>
     * 
     * @param sharedRoutesEnabled
     *        Indicates whether shared routes are enabled for the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePoolResult withSharedRoutesEnabled(Boolean sharedRoutesEnabled) {
        setSharedRoutesEnabled(sharedRoutesEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether shared routes are enabled for the pool.
     * </p>
     * 
     * @return Indicates whether shared routes are enabled for the pool.
     */

    public Boolean isSharedRoutesEnabled() {
        return this.sharedRoutesEnabled;
    }

    /**
     * <p>
     * The time when the pool was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     * </p>
     * 
     * @param createdTimestamp
     *        The time when the pool was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a>
     *        format.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time when the pool was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     * </p>
     * 
     * @return The time when the pool was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a>
     *         format.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time when the pool was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     * </p>
     * 
     * @param createdTimestamp
     *        The time when the pool was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a>
     *        format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePoolResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
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
        if (getPoolArn() != null)
            sb.append("PoolArn: ").append(getPoolArn()).append(",");
        if (getPoolId() != null)
            sb.append("PoolId: ").append(getPoolId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessageType() != null)
            sb.append("MessageType: ").append(getMessageType()).append(",");
        if (getTwoWayEnabled() != null)
            sb.append("TwoWayEnabled: ").append(getTwoWayEnabled()).append(",");
        if (getTwoWayChannelArn() != null)
            sb.append("TwoWayChannelArn: ").append(getTwoWayChannelArn()).append(",");
        if (getSelfManagedOptOutsEnabled() != null)
            sb.append("SelfManagedOptOutsEnabled: ").append(getSelfManagedOptOutsEnabled()).append(",");
        if (getOptOutListName() != null)
            sb.append("OptOutListName: ").append(getOptOutListName()).append(",");
        if (getSharedRoutesEnabled() != null)
            sb.append("SharedRoutesEnabled: ").append(getSharedRoutesEnabled()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePoolResult == false)
            return false;
        DeletePoolResult other = (DeletePoolResult) obj;
        if (other.getPoolArn() == null ^ this.getPoolArn() == null)
            return false;
        if (other.getPoolArn() != null && other.getPoolArn().equals(this.getPoolArn()) == false)
            return false;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessageType() == null ^ this.getMessageType() == null)
            return false;
        if (other.getMessageType() != null && other.getMessageType().equals(this.getMessageType()) == false)
            return false;
        if (other.getTwoWayEnabled() == null ^ this.getTwoWayEnabled() == null)
            return false;
        if (other.getTwoWayEnabled() != null && other.getTwoWayEnabled().equals(this.getTwoWayEnabled()) == false)
            return false;
        if (other.getTwoWayChannelArn() == null ^ this.getTwoWayChannelArn() == null)
            return false;
        if (other.getTwoWayChannelArn() != null && other.getTwoWayChannelArn().equals(this.getTwoWayChannelArn()) == false)
            return false;
        if (other.getSelfManagedOptOutsEnabled() == null ^ this.getSelfManagedOptOutsEnabled() == null)
            return false;
        if (other.getSelfManagedOptOutsEnabled() != null && other.getSelfManagedOptOutsEnabled().equals(this.getSelfManagedOptOutsEnabled()) == false)
            return false;
        if (other.getOptOutListName() == null ^ this.getOptOutListName() == null)
            return false;
        if (other.getOptOutListName() != null && other.getOptOutListName().equals(this.getOptOutListName()) == false)
            return false;
        if (other.getSharedRoutesEnabled() == null ^ this.getSharedRoutesEnabled() == null)
            return false;
        if (other.getSharedRoutesEnabled() != null && other.getSharedRoutesEnabled().equals(this.getSharedRoutesEnabled()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPoolArn() == null) ? 0 : getPoolArn().hashCode());
        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessageType() == null) ? 0 : getMessageType().hashCode());
        hashCode = prime * hashCode + ((getTwoWayEnabled() == null) ? 0 : getTwoWayEnabled().hashCode());
        hashCode = prime * hashCode + ((getTwoWayChannelArn() == null) ? 0 : getTwoWayChannelArn().hashCode());
        hashCode = prime * hashCode + ((getSelfManagedOptOutsEnabled() == null) ? 0 : getSelfManagedOptOutsEnabled().hashCode());
        hashCode = prime * hashCode + ((getOptOutListName() == null) ? 0 : getOptOutListName().hashCode());
        hashCode = prime * hashCode + ((getSharedRoutesEnabled() == null) ? 0 : getSharedRoutesEnabled().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public DeletePoolResult clone() {
        try {
            return (DeletePoolResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
