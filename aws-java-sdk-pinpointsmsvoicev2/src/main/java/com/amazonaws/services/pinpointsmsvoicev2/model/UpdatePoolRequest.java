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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdatePool" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePoolRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the pool to update. Valid values are either the PoolId or PoolArn.
     * </p>
     */
    private String poolId;
    /**
     * <p>
     * By default this is set to false. When set to true you can receive incoming text messages from your end
     * recipients.
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
     * By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to one of
     * your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end
     * recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're
     * also responsible for tracking and honoring opt-out requests.
     * </p>
     */
    private Boolean selfManagedOptOutsEnabled;
    /**
     * <p>
     * The OptOutList to associate with the pool. Valid values are either OptOutListName or OptOutListArn.
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
     * When set to true the pool can't be deleted.
     * </p>
     */
    private Boolean deletionProtectionEnabled;

    /**
     * <p>
     * The unique identifier of the pool to update. Valid values are either the PoolId or PoolArn.
     * </p>
     * 
     * @param poolId
     *        The unique identifier of the pool to update. Valid values are either the PoolId or PoolArn.
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The unique identifier of the pool to update. Valid values are either the PoolId or PoolArn.
     * </p>
     * 
     * @return The unique identifier of the pool to update. Valid values are either the PoolId or PoolArn.
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The unique identifier of the pool to update. Valid values are either the PoolId or PoolArn.
     * </p>
     * 
     * @param poolId
     *        The unique identifier of the pool to update. Valid values are either the PoolId or PoolArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePoolRequest withPoolId(String poolId) {
        setPoolId(poolId);
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

    public UpdatePoolRequest withTwoWayEnabled(Boolean twoWayEnabled) {
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

    public UpdatePoolRequest withTwoWayChannelArn(String twoWayChannelArn) {
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

    public UpdatePoolRequest withSelfManagedOptOutsEnabled(Boolean selfManagedOptOutsEnabled) {
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
     * The OptOutList to associate with the pool. Valid values are either OptOutListName or OptOutListArn.
     * </p>
     * 
     * @param optOutListName
     *        The OptOutList to associate with the pool. Valid values are either OptOutListName or OptOutListArn.
     */

    public void setOptOutListName(String optOutListName) {
        this.optOutListName = optOutListName;
    }

    /**
     * <p>
     * The OptOutList to associate with the pool. Valid values are either OptOutListName or OptOutListArn.
     * </p>
     * 
     * @return The OptOutList to associate with the pool. Valid values are either OptOutListName or OptOutListArn.
     */

    public String getOptOutListName() {
        return this.optOutListName;
    }

    /**
     * <p>
     * The OptOutList to associate with the pool. Valid values are either OptOutListName or OptOutListArn.
     * </p>
     * 
     * @param optOutListName
     *        The OptOutList to associate with the pool. Valid values are either OptOutListName or OptOutListArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePoolRequest withOptOutListName(String optOutListName) {
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

    public UpdatePoolRequest withSharedRoutesEnabled(Boolean sharedRoutesEnabled) {
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

    public UpdatePoolRequest withDeletionProtectionEnabled(Boolean deletionProtectionEnabled) {
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
        if (getPoolId() != null)
            sb.append("PoolId: ").append(getPoolId()).append(",");
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
            sb.append("DeletionProtectionEnabled: ").append(getDeletionProtectionEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePoolRequest == false)
            return false;
        UpdatePoolRequest other = (UpdatePoolRequest) obj;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        hashCode = prime * hashCode + ((getTwoWayEnabled() == null) ? 0 : getTwoWayEnabled().hashCode());
        hashCode = prime * hashCode + ((getTwoWayChannelArn() == null) ? 0 : getTwoWayChannelArn().hashCode());
        hashCode = prime * hashCode + ((getSelfManagedOptOutsEnabled() == null) ? 0 : getSelfManagedOptOutsEnabled().hashCode());
        hashCode = prime * hashCode + ((getOptOutListName() == null) ? 0 : getOptOutListName().hashCode());
        hashCode = prime * hashCode + ((getSharedRoutesEnabled() == null) ? 0 : getSharedRoutesEnabled().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtectionEnabled() == null) ? 0 : getDeletionProtectionEnabled().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePoolRequest clone() {
        return (UpdatePoolRequest) super.clone();
    }

}
