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
 * Describes the current Amazon Pinpoint monthly spend limits for sending voice and text messages. For more information
 * on increasing your monthly spend limit, see <a
 * href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-awssupport-spend-threshold.html"> Requesting
 * increases to your monthly SMS spending quota for Amazon Pinpoint </a> in the <i>Amazon Pinpoint User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SpendLimit" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpendLimit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name for the SpendLimit.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The maximum amount of money, in US dollars, that you want to be able to spend sending messages each month. This
     * value has to be less than or equal to the amount in <code>MaxLimit</code>. To use this custom limit,
     * <code>Overridden</code> must be set to true.
     * </p>
     */
    private Long enforcedLimit;
    /**
     * <p>
     * The maximum amount of money that you are able to spend to send messages each month, in US dollars.
     * </p>
     */
    private Long maxLimit;
    /**
     * <p>
     * When set to <code>True</code>, the value that has been specified in the <code>EnforcedLimit</code> is used to
     * determine the maximum amount in US dollars that can be spent to send messages each month, in US dollars.
     * </p>
     */
    private Boolean overridden;

    /**
     * <p>
     * The name for the SpendLimit.
     * </p>
     * 
     * @param name
     *        The name for the SpendLimit.
     * @see SpendLimitName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the SpendLimit.
     * </p>
     * 
     * @return The name for the SpendLimit.
     * @see SpendLimitName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the SpendLimit.
     * </p>
     * 
     * @param name
     *        The name for the SpendLimit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpendLimitName
     */

    public SpendLimit withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name for the SpendLimit.
     * </p>
     * 
     * @param name
     *        The name for the SpendLimit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpendLimitName
     */

    public SpendLimit withName(SpendLimitName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The maximum amount of money, in US dollars, that you want to be able to spend sending messages each month. This
     * value has to be less than or equal to the amount in <code>MaxLimit</code>. To use this custom limit,
     * <code>Overridden</code> must be set to true.
     * </p>
     * 
     * @param enforcedLimit
     *        The maximum amount of money, in US dollars, that you want to be able to spend sending messages each month.
     *        This value has to be less than or equal to the amount in <code>MaxLimit</code>. To use this custom limit,
     *        <code>Overridden</code> must be set to true.
     */

    public void setEnforcedLimit(Long enforcedLimit) {
        this.enforcedLimit = enforcedLimit;
    }

    /**
     * <p>
     * The maximum amount of money, in US dollars, that you want to be able to spend sending messages each month. This
     * value has to be less than or equal to the amount in <code>MaxLimit</code>. To use this custom limit,
     * <code>Overridden</code> must be set to true.
     * </p>
     * 
     * @return The maximum amount of money, in US dollars, that you want to be able to spend sending messages each
     *         month. This value has to be less than or equal to the amount in <code>MaxLimit</code>. To use this custom
     *         limit, <code>Overridden</code> must be set to true.
     */

    public Long getEnforcedLimit() {
        return this.enforcedLimit;
    }

    /**
     * <p>
     * The maximum amount of money, in US dollars, that you want to be able to spend sending messages each month. This
     * value has to be less than or equal to the amount in <code>MaxLimit</code>. To use this custom limit,
     * <code>Overridden</code> must be set to true.
     * </p>
     * 
     * @param enforcedLimit
     *        The maximum amount of money, in US dollars, that you want to be able to spend sending messages each month.
     *        This value has to be less than or equal to the amount in <code>MaxLimit</code>. To use this custom limit,
     *        <code>Overridden</code> must be set to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpendLimit withEnforcedLimit(Long enforcedLimit) {
        setEnforcedLimit(enforcedLimit);
        return this;
    }

    /**
     * <p>
     * The maximum amount of money that you are able to spend to send messages each month, in US dollars.
     * </p>
     * 
     * @param maxLimit
     *        The maximum amount of money that you are able to spend to send messages each month, in US dollars.
     */

    public void setMaxLimit(Long maxLimit) {
        this.maxLimit = maxLimit;
    }

    /**
     * <p>
     * The maximum amount of money that you are able to spend to send messages each month, in US dollars.
     * </p>
     * 
     * @return The maximum amount of money that you are able to spend to send messages each month, in US dollars.
     */

    public Long getMaxLimit() {
        return this.maxLimit;
    }

    /**
     * <p>
     * The maximum amount of money that you are able to spend to send messages each month, in US dollars.
     * </p>
     * 
     * @param maxLimit
     *        The maximum amount of money that you are able to spend to send messages each month, in US dollars.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpendLimit withMaxLimit(Long maxLimit) {
        setMaxLimit(maxLimit);
        return this;
    }

    /**
     * <p>
     * When set to <code>True</code>, the value that has been specified in the <code>EnforcedLimit</code> is used to
     * determine the maximum amount in US dollars that can be spent to send messages each month, in US dollars.
     * </p>
     * 
     * @param overridden
     *        When set to <code>True</code>, the value that has been specified in the <code>EnforcedLimit</code> is used
     *        to determine the maximum amount in US dollars that can be spent to send messages each month, in US
     *        dollars.
     */

    public void setOverridden(Boolean overridden) {
        this.overridden = overridden;
    }

    /**
     * <p>
     * When set to <code>True</code>, the value that has been specified in the <code>EnforcedLimit</code> is used to
     * determine the maximum amount in US dollars that can be spent to send messages each month, in US dollars.
     * </p>
     * 
     * @return When set to <code>True</code>, the value that has been specified in the <code>EnforcedLimit</code> is
     *         used to determine the maximum amount in US dollars that can be spent to send messages each month, in US
     *         dollars.
     */

    public Boolean getOverridden() {
        return this.overridden;
    }

    /**
     * <p>
     * When set to <code>True</code>, the value that has been specified in the <code>EnforcedLimit</code> is used to
     * determine the maximum amount in US dollars that can be spent to send messages each month, in US dollars.
     * </p>
     * 
     * @param overridden
     *        When set to <code>True</code>, the value that has been specified in the <code>EnforcedLimit</code> is used
     *        to determine the maximum amount in US dollars that can be spent to send messages each month, in US
     *        dollars.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpendLimit withOverridden(Boolean overridden) {
        setOverridden(overridden);
        return this;
    }

    /**
     * <p>
     * When set to <code>True</code>, the value that has been specified in the <code>EnforcedLimit</code> is used to
     * determine the maximum amount in US dollars that can be spent to send messages each month, in US dollars.
     * </p>
     * 
     * @return When set to <code>True</code>, the value that has been specified in the <code>EnforcedLimit</code> is
     *         used to determine the maximum amount in US dollars that can be spent to send messages each month, in US
     *         dollars.
     */

    public Boolean isOverridden() {
        return this.overridden;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEnforcedLimit() != null)
            sb.append("EnforcedLimit: ").append(getEnforcedLimit()).append(",");
        if (getMaxLimit() != null)
            sb.append("MaxLimit: ").append(getMaxLimit()).append(",");
        if (getOverridden() != null)
            sb.append("Overridden: ").append(getOverridden());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpendLimit == false)
            return false;
        SpendLimit other = (SpendLimit) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEnforcedLimit() == null ^ this.getEnforcedLimit() == null)
            return false;
        if (other.getEnforcedLimit() != null && other.getEnforcedLimit().equals(this.getEnforcedLimit()) == false)
            return false;
        if (other.getMaxLimit() == null ^ this.getMaxLimit() == null)
            return false;
        if (other.getMaxLimit() != null && other.getMaxLimit().equals(this.getMaxLimit()) == false)
            return false;
        if (other.getOverridden() == null ^ this.getOverridden() == null)
            return false;
        if (other.getOverridden() != null && other.getOverridden().equals(this.getOverridden()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEnforcedLimit() == null) ? 0 : getEnforcedLimit().hashCode());
        hashCode = prime * hashCode + ((getMaxLimit() == null) ? 0 : getMaxLimit().hashCode());
        hashCode = prime * hashCode + ((getOverridden() == null) ? 0 : getOverridden().hashCode());
        return hashCode;
    }

    @Override
    public SpendLimit clone() {
        try {
            return (SpendLimit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoicev2.model.transform.SpendLimitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
