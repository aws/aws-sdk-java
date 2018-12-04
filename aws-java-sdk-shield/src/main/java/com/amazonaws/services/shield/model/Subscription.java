/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the AWS Shield Advanced subscription for an account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/Subscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Subscription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The start time of the subscription, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The length, in seconds, of the AWS Shield Advanced subscription for the account.
     * </p>
     */
    private Long timeCommitmentInSeconds;

    /**
     * <p>
     * The start time of the subscription, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     * 
     * @param startTime
     *        The start time of the subscription, in Unix time in seconds. For more information see <a
     *        href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the subscription, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     * 
     * @return The start time of the subscription, in Unix time in seconds. For more information see <a
     *         href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *         >timestamp</a>.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the subscription, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     * 
     * @param startTime
     *        The start time of the subscription, in Unix time in seconds. For more information see <a
     *        href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The length, in seconds, of the AWS Shield Advanced subscription for the account.
     * </p>
     * 
     * @param timeCommitmentInSeconds
     *        The length, in seconds, of the AWS Shield Advanced subscription for the account.
     */

    public void setTimeCommitmentInSeconds(Long timeCommitmentInSeconds) {
        this.timeCommitmentInSeconds = timeCommitmentInSeconds;
    }

    /**
     * <p>
     * The length, in seconds, of the AWS Shield Advanced subscription for the account.
     * </p>
     * 
     * @return The length, in seconds, of the AWS Shield Advanced subscription for the account.
     */

    public Long getTimeCommitmentInSeconds() {
        return this.timeCommitmentInSeconds;
    }

    /**
     * <p>
     * The length, in seconds, of the AWS Shield Advanced subscription for the account.
     * </p>
     * 
     * @param timeCommitmentInSeconds
     *        The length, in seconds, of the AWS Shield Advanced subscription for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withTimeCommitmentInSeconds(Long timeCommitmentInSeconds) {
        setTimeCommitmentInSeconds(timeCommitmentInSeconds);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getTimeCommitmentInSeconds() != null)
            sb.append("TimeCommitmentInSeconds: ").append(getTimeCommitmentInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Subscription == false)
            return false;
        Subscription other = (Subscription) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getTimeCommitmentInSeconds() == null ^ this.getTimeCommitmentInSeconds() == null)
            return false;
        if (other.getTimeCommitmentInSeconds() != null && other.getTimeCommitmentInSeconds().equals(this.getTimeCommitmentInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getTimeCommitmentInSeconds() == null) ? 0 : getTimeCommitmentInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public Subscription clone() {
        try {
            return (Subscription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.SubscriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
