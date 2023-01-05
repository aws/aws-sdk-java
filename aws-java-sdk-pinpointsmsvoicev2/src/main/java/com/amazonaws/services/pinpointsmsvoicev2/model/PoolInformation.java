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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information for a pool in an Amazon Web Services account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/PoolInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PoolInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the pool.
     * </p>
     */
    private String poolArn;
    /**
     * <p>
     * The unique identifier for the pool.
     * </p>
     */
    private String poolId;
    /**
     * <p>
     * The current status of the pool.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     * PROMOTIONAL for messages that aren't critical or time-sensitive.
     * </p>
     */
    private String messageType;
    /**
     * <p>
     * When set to true you can receive incoming text messages from your end recipients using the TwoWayChannelArn.
     * </p>
     */
    private Boolean twoWayEnabled;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the two way channel.
     * </p>
     */
    private String twoWayChannelArn;
    /**
     * <p>
     * When set to false, an end recipient sends a message that begins with HELP or STOP to one of your dedicated
     * numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end recipient to the
     * OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're also responsible
     * for tracking and honoring opt-out requests. For more information see <a href=
     * "https://docs.aws.amazon.com/pinpoint/latest/userguide/settings-sms-managing.html#settings-account-sms-self-managed-opt-out"
     * >Self-managed opt-outs</a>
     * </p>
     */
    private Boolean selfManagedOptOutsEnabled;
    /**
     * <p>
     * The name of the OptOutList associated with the pool.
     * </p>
     */
    private String optOutListName;
    /**
     * <p>
     * Allows you to enable shared routes on your pool.
     * </p>
     * <p>
     * By default, this is set to <code>False</code>. If you set this value to <code>True</code>, your messages are sent
     * using phone numbers or sender IDs (depending on the country) that are shared with other Amazon Pinpoint users. In
     * some countries, such as the United States, senders aren't allowed to use shared routes and must use a dedicated
     * phone number or short code.
     * </p>
     */
    private Boolean sharedRoutesEnabled;
    /**
     * <p>
     * When set to true the pool can't be deleted.
     * </p>
     */
    private Boolean deletionProtectionEnabled;
    /**
     * <p>
     * The time when the pool was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the pool.
     * </p>
     * 
     * @param poolArn
     *        The Amazon Resource Name (ARN) for the pool.
     */

    public void setPoolArn(String poolArn) {
        this.poolArn = poolArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the pool.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the pool.
     */

    public String getPoolArn() {
        return this.poolArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the pool.
     * </p>
     * 
     * @param poolArn
     *        The Amazon Resource Name (ARN) for the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PoolInformation withPoolArn(String poolArn) {
        setPoolArn(poolArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the pool.
     * </p>
     * 
     * @param poolId
     *        The unique identifier for the pool.
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The unique identifier for the pool.
     * </p>
     * 
     * @return The unique identifier for the pool.
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The unique identifier for the pool.
     * </p>
     * 
     * @param poolId
     *        The unique identifier for the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PoolInformation withPoolId(String poolId) {
        setPoolId(poolId);
        return this;
    }

    /**
     * <p>
     * The current status of the pool.
     * </p>
     * 
     * @param status
     *        The current status of the pool.
     * @see PoolStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the pool.
     * </p>
     * 
     * @return The current status of the pool.
     * @see PoolStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the pool.
     * </p>
     * 
     * @param status
     *        The current status of the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PoolStatus
     */

    public PoolInformation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the pool.
     * </p>
     * 
     * @param status
     *        The current status of the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PoolStatus
     */

    public PoolInformation withStatus(PoolStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     * PROMOTIONAL for messages that aren't critical or time-sensitive.
     * </p>
     * 
     * @param messageType
     *        The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     *        PROMOTIONAL for messages that aren't critical or time-sensitive.
     * @see MessageType
     */

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * <p>
     * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     * PROMOTIONAL for messages that aren't critical or time-sensitive.
     * </p>
     * 
     * @return The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     *         PROMOTIONAL for messages that aren't critical or time-sensitive.
     * @see MessageType
     */

    public String getMessageType() {
        return this.messageType;
    }

    /**
     * <p>
     * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     * PROMOTIONAL for messages that aren't critical or time-sensitive.
     * </p>
     * 
     * @param messageType
     *        The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     *        PROMOTIONAL for messages that aren't critical or time-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public PoolInformation withMessageType(String messageType) {
        setMessageType(messageType);
        return this;
    }

    /**
     * <p>
     * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     * PROMOTIONAL for messages that aren't critical or time-sensitive.
     * </p>
     * 
     * @param messageType
     *        The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     *        PROMOTIONAL for messages that aren't critical or time-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public PoolInformation withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
        return this;
    }

    /**
     * <p>
     * When set to true you can receive incoming text messages from your end recipients using the TwoWayChannelArn.
     * </p>
     * 
     * @param twoWayEnabled
     *        When set to true you can receive incoming text messages from your end recipients using the
     *        TwoWayChannelArn.
     */

    public void setTwoWayEnabled(Boolean twoWayEnabled) {
        this.twoWayEnabled = twoWayEnabled;
    }

    /**
     * <p>
     * When set to true you can receive incoming text messages from your end recipients using the TwoWayChannelArn.
     * </p>
     * 
     * @return When set to true you can receive incoming text messages from your end recipients using the
     *         TwoWayChannelArn.
     */

    public Boolean getTwoWayEnabled() {
        return this.twoWayEnabled;
    }

    /**
     * <p>
     * When set to true you can receive incoming text messages from your end recipients using the TwoWayChannelArn.
     * </p>
     * 
     * @param twoWayEnabled
     *        When set to true you can receive incoming text messages from your end recipients using the
     *        TwoWayChannelArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PoolInformation withTwoWayEnabled(Boolean twoWayEnabled) {
        setTwoWayEnabled(twoWayEnabled);
        return this;
    }

    /**
     * <p>
     * When set to true you can receive incoming text messages from your end recipients using the TwoWayChannelArn.
     * </p>
     * 
     * @return When set to true you can receive incoming text messages from your end recipients using the
     *         TwoWayChannelArn.
     */

    public Boolean isTwoWayEnabled() {
        return this.twoWayEnabled;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the two way channel.
     * </p>
     * 
     * @param twoWayChannelArn
     *        The Amazon Resource Name (ARN) of the two way channel.
     */

    public void setTwoWayChannelArn(String twoWayChannelArn) {
        this.twoWayChannelArn = twoWayChannelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the two way channel.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the two way channel.
     */

    public String getTwoWayChannelArn() {
        return this.twoWayChannelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the two way channel.
     * </p>
     * 
     * @param twoWayChannelArn
     *        The Amazon Resource Name (ARN) of the two way channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PoolInformation withTwoWayChannelArn(String twoWayChannelArn) {
        setTwoWayChannelArn(twoWayChannelArn);
        return this;
    }

    /**
     * <p>
     * When set to false, an end recipient sends a message that begins with HELP or STOP to one of your dedicated
     * numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end recipient to the
     * OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're also responsible
     * for tracking and honoring opt-out requests. For more information see <a href=
     * "https://docs.aws.amazon.com/pinpoint/latest/userguide/settings-sms-managing.html#settings-account-sms-self-managed-opt-out"
     * >Self-managed opt-outs</a>
     * </p>
     * 
     * @param selfManagedOptOutsEnabled
     *        When set to false, an end recipient sends a message that begins with HELP or STOP to one of your dedicated
     *        numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end recipient to
     *        the OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're also
     *        responsible for tracking and honoring opt-out requests. For more information see <a href=
     *        "https://docs.aws.amazon.com/pinpoint/latest/userguide/settings-sms-managing.html#settings-account-sms-self-managed-opt-out"
     *        >Self-managed opt-outs</a>
     */

    public void setSelfManagedOptOutsEnabled(Boolean selfManagedOptOutsEnabled) {
        this.selfManagedOptOutsEnabled = selfManagedOptOutsEnabled;
    }

    /**
     * <p>
     * When set to false, an end recipient sends a message that begins with HELP or STOP to one of your dedicated
     * numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end recipient to the
     * OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're also responsible
     * for tracking and honoring opt-out requests. For more information see <a href=
     * "https://docs.aws.amazon.com/pinpoint/latest/userguide/settings-sms-managing.html#settings-account-sms-self-managed-opt-out"
     * >Self-managed opt-outs</a>
     * </p>
     * 
     * @return When set to false, an end recipient sends a message that begins with HELP or STOP to one of your
     *         dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end
     *         recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP
     *         requests. You're also responsible for tracking and honoring opt-out requests. For more information see <a
     *         href=
     *         "https://docs.aws.amazon.com/pinpoint/latest/userguide/settings-sms-managing.html#settings-account-sms-self-managed-opt-out"
     *         >Self-managed opt-outs</a>
     */

    public Boolean getSelfManagedOptOutsEnabled() {
        return this.selfManagedOptOutsEnabled;
    }

    /**
     * <p>
     * When set to false, an end recipient sends a message that begins with HELP or STOP to one of your dedicated
     * numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end recipient to the
     * OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're also responsible
     * for tracking and honoring opt-out requests. For more information see <a href=
     * "https://docs.aws.amazon.com/pinpoint/latest/userguide/settings-sms-managing.html#settings-account-sms-self-managed-opt-out"
     * >Self-managed opt-outs</a>
     * </p>
     * 
     * @param selfManagedOptOutsEnabled
     *        When set to false, an end recipient sends a message that begins with HELP or STOP to one of your dedicated
     *        numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end recipient to
     *        the OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're also
     *        responsible for tracking and honoring opt-out requests. For more information see <a href=
     *        "https://docs.aws.amazon.com/pinpoint/latest/userguide/settings-sms-managing.html#settings-account-sms-self-managed-opt-out"
     *        >Self-managed opt-outs</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PoolInformation withSelfManagedOptOutsEnabled(Boolean selfManagedOptOutsEnabled) {
        setSelfManagedOptOutsEnabled(selfManagedOptOutsEnabled);
        return this;
    }

    /**
     * <p>
     * When set to false, an end recipient sends a message that begins with HELP or STOP to one of your dedicated
     * numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end recipient to the
     * OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're also responsible
     * for tracking and honoring opt-out requests. For more information see <a href=
     * "https://docs.aws.amazon.com/pinpoint/latest/userguide/settings-sms-managing.html#settings-account-sms-self-managed-opt-out"
     * >Self-managed opt-outs</a>
     * </p>
     * 
     * @return When set to false, an end recipient sends a message that begins with HELP or STOP to one of your
     *         dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end
     *         recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP
     *         requests. You're also responsible for tracking and honoring opt-out requests. For more information see <a
     *         href=
     *         "https://docs.aws.amazon.com/pinpoint/latest/userguide/settings-sms-managing.html#settings-account-sms-self-managed-opt-out"
     *         >Self-managed opt-outs</a>
     */

    public Boolean isSelfManagedOptOutsEnabled() {
        return this.selfManagedOptOutsEnabled;
    }

    /**
     * <p>
     * The name of the OptOutList associated with the pool.
     * </p>
     * 
     * @param optOutListName
     *        The name of the OptOutList associated with the pool.
     */

    public void setOptOutListName(String optOutListName) {
        this.optOutListName = optOutListName;
    }

    /**
     * <p>
     * The name of the OptOutList associated with the pool.
     * </p>
     * 
     * @return The name of the OptOutList associated with the pool.
     */

    public String getOptOutListName() {
        return this.optOutListName;
    }

    /**
     * <p>
     * The name of the OptOutList associated with the pool.
     * </p>
     * 
     * @param optOutListName
     *        The name of the OptOutList associated with the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PoolInformation withOptOutListName(String optOutListName) {
        setOptOutListName(optOutListName);
        return this;
    }

    /**
     * <p>
     * Allows you to enable shared routes on your pool.
     * </p>
     * <p>
     * By default, this is set to <code>False</code>. If you set this value to <code>True</code>, your messages are sent
     * using phone numbers or sender IDs (depending on the country) that are shared with other Amazon Pinpoint users. In
     * some countries, such as the United States, senders aren't allowed to use shared routes and must use a dedicated
     * phone number or short code.
     * </p>
     * 
     * @param sharedRoutesEnabled
     *        Allows you to enable shared routes on your pool.</p>
     *        <p>
     *        By default, this is set to <code>False</code>. If you set this value to <code>True</code>, your messages
     *        are sent using phone numbers or sender IDs (depending on the country) that are shared with other Amazon
     *        Pinpoint users. In some countries, such as the United States, senders aren't allowed to use shared routes
     *        and must use a dedicated phone number or short code.
     */

    public void setSharedRoutesEnabled(Boolean sharedRoutesEnabled) {
        this.sharedRoutesEnabled = sharedRoutesEnabled;
    }

    /**
     * <p>
     * Allows you to enable shared routes on your pool.
     * </p>
     * <p>
     * By default, this is set to <code>False</code>. If you set this value to <code>True</code>, your messages are sent
     * using phone numbers or sender IDs (depending on the country) that are shared with other Amazon Pinpoint users. In
     * some countries, such as the United States, senders aren't allowed to use shared routes and must use a dedicated
     * phone number or short code.
     * </p>
     * 
     * @return Allows you to enable shared routes on your pool.</p>
     *         <p>
     *         By default, this is set to <code>False</code>. If you set this value to <code>True</code>, your messages
     *         are sent using phone numbers or sender IDs (depending on the country) that are shared with other Amazon
     *         Pinpoint users. In some countries, such as the United States, senders aren't allowed to use shared routes
     *         and must use a dedicated phone number or short code.
     */

    public Boolean getSharedRoutesEnabled() {
        return this.sharedRoutesEnabled;
    }

    /**
     * <p>
     * Allows you to enable shared routes on your pool.
     * </p>
     * <p>
     * By default, this is set to <code>False</code>. If you set this value to <code>True</code>, your messages are sent
     * using phone numbers or sender IDs (depending on the country) that are shared with other Amazon Pinpoint users. In
     * some countries, such as the United States, senders aren't allowed to use shared routes and must use a dedicated
     * phone number or short code.
     * </p>
     * 
     * @param sharedRoutesEnabled
     *        Allows you to enable shared routes on your pool.</p>
     *        <p>
     *        By default, this is set to <code>False</code>. If you set this value to <code>True</code>, your messages
     *        are sent using phone numbers or sender IDs (depending on the country) that are shared with other Amazon
     *        Pinpoint users. In some countries, such as the United States, senders aren't allowed to use shared routes
     *        and must use a dedicated phone number or short code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PoolInformation withSharedRoutesEnabled(Boolean sharedRoutesEnabled) {
        setSharedRoutesEnabled(sharedRoutesEnabled);
        return this;
    }

    /**
     * <p>
     * Allows you to enable shared routes on your pool.
     * </p>
     * <p>
     * By default, this is set to <code>False</code>. If you set this value to <code>True</code>, your messages are sent
     * using phone numbers or sender IDs (depending on the country) that are shared with other Amazon Pinpoint users. In
     * some countries, such as the United States, senders aren't allowed to use shared routes and must use a dedicated
     * phone number or short code.
     * </p>
     * 
     * @return Allows you to enable shared routes on your pool.</p>
     *         <p>
     *         By default, this is set to <code>False</code>. If you set this value to <code>True</code>, your messages
     *         are sent using phone numbers or sender IDs (depending on the country) that are shared with other Amazon
     *         Pinpoint users. In some countries, such as the United States, senders aren't allowed to use shared routes
     *         and must use a dedicated phone number or short code.
     */

    public Boolean isSharedRoutesEnabled() {
        return this.sharedRoutesEnabled;
    }

    /**
     * <p>
     * When set to true the pool can't be deleted.
     * </p>
     * 
     * @param deletionProtectionEnabled
     *        When set to true the pool can't be deleted.
     */

    public void setDeletionProtectionEnabled(Boolean deletionProtectionEnabled) {
        this.deletionProtectionEnabled = deletionProtectionEnabled;
    }

    /**
     * <p>
     * When set to true the pool can't be deleted.
     * </p>
     * 
     * @return When set to true the pool can't be deleted.
     */

    public Boolean getDeletionProtectionEnabled() {
        return this.deletionProtectionEnabled;
    }

    /**
     * <p>
     * When set to true the pool can't be deleted.
     * </p>
     * 
     * @param deletionProtectionEnabled
     *        When set to true the pool can't be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PoolInformation withDeletionProtectionEnabled(Boolean deletionProtectionEnabled) {
        setDeletionProtectionEnabled(deletionProtectionEnabled);
        return this;
    }

    /**
     * <p>
     * When set to true the pool can't be deleted.
     * </p>
     * 
     * @return When set to true the pool can't be deleted.
     */

    public Boolean isDeletionProtectionEnabled() {
        return this.deletionProtectionEnabled;
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

    public PoolInformation withCreatedTimestamp(java.util.Date createdTimestamp) {
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
        if (getDeletionProtectionEnabled() != null)
            sb.append("DeletionProtectionEnabled: ").append(getDeletionProtectionEnabled()).append(",");
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

        if (obj instanceof PoolInformation == false)
            return false;
        PoolInformation other = (PoolInformation) obj;
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
        if (other.getDeletionProtectionEnabled() == null ^ this.getDeletionProtectionEnabled() == null)
            return false;
        if (other.getDeletionProtectionEnabled() != null && other.getDeletionProtectionEnabled().equals(this.getDeletionProtectionEnabled()) == false)
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
        hashCode = prime * hashCode + ((getDeletionProtectionEnabled() == null) ? 0 : getDeletionProtectionEnabled().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public PoolInformation clone() {
        try {
            return (PoolInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoicev2.model.transform.PoolInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
