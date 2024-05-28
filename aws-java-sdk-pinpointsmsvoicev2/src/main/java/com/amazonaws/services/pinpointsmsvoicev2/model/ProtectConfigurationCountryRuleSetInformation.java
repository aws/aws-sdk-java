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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The types of statuses that can be used.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ProtectConfigurationCountryRuleSetInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtectConfigurationCountryRuleSetInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The types of protection that can be used.
     * </p>
     */
    private String protectStatus;

    /**
     * <p>
     * The types of protection that can be used.
     * </p>
     * 
     * @param protectStatus
     *        The types of protection that can be used.
     * @see ProtectStatus
     */

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    /**
     * <p>
     * The types of protection that can be used.
     * </p>
     * 
     * @return The types of protection that can be used.
     * @see ProtectStatus
     */

    public String getProtectStatus() {
        return this.protectStatus;
    }

    /**
     * <p>
     * The types of protection that can be used.
     * </p>
     * 
     * @param protectStatus
     *        The types of protection that can be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectStatus
     */

    public ProtectConfigurationCountryRuleSetInformation withProtectStatus(String protectStatus) {
        setProtectStatus(protectStatus);
        return this;
    }

    /**
     * <p>
     * The types of protection that can be used.
     * </p>
     * 
     * @param protectStatus
     *        The types of protection that can be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectStatus
     */

    public ProtectConfigurationCountryRuleSetInformation withProtectStatus(ProtectStatus protectStatus) {
        this.protectStatus = protectStatus.toString();
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
        if (getProtectStatus() != null)
            sb.append("ProtectStatus: ").append(getProtectStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectConfigurationCountryRuleSetInformation == false)
            return false;
        ProtectConfigurationCountryRuleSetInformation other = (ProtectConfigurationCountryRuleSetInformation) obj;
        if (other.getProtectStatus() == null ^ this.getProtectStatus() == null)
            return false;
        if (other.getProtectStatus() != null && other.getProtectStatus().equals(this.getProtectStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtectStatus() == null) ? 0 : getProtectStatus().hashCode());
        return hashCode;
    }

    @Override
    public ProtectConfigurationCountryRuleSetInformation clone() {
        try {
            return (ProtectConfigurationCountryRuleSetInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoicev2.model.transform.ProtectConfigurationCountryRuleSetInformationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
