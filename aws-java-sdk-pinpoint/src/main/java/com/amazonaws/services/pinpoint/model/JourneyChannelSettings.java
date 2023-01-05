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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The channel-specific configurations for the journey.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/JourneyChannelSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JourneyChannelSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Connect Campaign.
     * </p>
     */
    private String connectCampaignArn;
    /**
     * <p>
     * IAM role ARN to be assumed when invoking Connect campaign execution APIs for dialing.
     * </p>
     */
    private String connectCampaignExecutionRoleArn;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Connect Campaign.
     * </p>
     * 
     * @param connectCampaignArn
     *        Amazon Resource Name (ARN) of the Connect Campaign.
     */

    public void setConnectCampaignArn(String connectCampaignArn) {
        this.connectCampaignArn = connectCampaignArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Connect Campaign.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the Connect Campaign.
     */

    public String getConnectCampaignArn() {
        return this.connectCampaignArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Connect Campaign.
     * </p>
     * 
     * @param connectCampaignArn
     *        Amazon Resource Name (ARN) of the Connect Campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyChannelSettings withConnectCampaignArn(String connectCampaignArn) {
        setConnectCampaignArn(connectCampaignArn);
        return this;
    }

    /**
     * <p>
     * IAM role ARN to be assumed when invoking Connect campaign execution APIs for dialing.
     * </p>
     * 
     * @param connectCampaignExecutionRoleArn
     *        IAM role ARN to be assumed when invoking Connect campaign execution APIs for dialing.
     */

    public void setConnectCampaignExecutionRoleArn(String connectCampaignExecutionRoleArn) {
        this.connectCampaignExecutionRoleArn = connectCampaignExecutionRoleArn;
    }

    /**
     * <p>
     * IAM role ARN to be assumed when invoking Connect campaign execution APIs for dialing.
     * </p>
     * 
     * @return IAM role ARN to be assumed when invoking Connect campaign execution APIs for dialing.
     */

    public String getConnectCampaignExecutionRoleArn() {
        return this.connectCampaignExecutionRoleArn;
    }

    /**
     * <p>
     * IAM role ARN to be assumed when invoking Connect campaign execution APIs for dialing.
     * </p>
     * 
     * @param connectCampaignExecutionRoleArn
     *        IAM role ARN to be assumed when invoking Connect campaign execution APIs for dialing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyChannelSettings withConnectCampaignExecutionRoleArn(String connectCampaignExecutionRoleArn) {
        setConnectCampaignExecutionRoleArn(connectCampaignExecutionRoleArn);
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
        if (getConnectCampaignArn() != null)
            sb.append("ConnectCampaignArn: ").append(getConnectCampaignArn()).append(",");
        if (getConnectCampaignExecutionRoleArn() != null)
            sb.append("ConnectCampaignExecutionRoleArn: ").append(getConnectCampaignExecutionRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JourneyChannelSettings == false)
            return false;
        JourneyChannelSettings other = (JourneyChannelSettings) obj;
        if (other.getConnectCampaignArn() == null ^ this.getConnectCampaignArn() == null)
            return false;
        if (other.getConnectCampaignArn() != null && other.getConnectCampaignArn().equals(this.getConnectCampaignArn()) == false)
            return false;
        if (other.getConnectCampaignExecutionRoleArn() == null ^ this.getConnectCampaignExecutionRoleArn() == null)
            return false;
        if (other.getConnectCampaignExecutionRoleArn() != null
                && other.getConnectCampaignExecutionRoleArn().equals(this.getConnectCampaignExecutionRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectCampaignArn() == null) ? 0 : getConnectCampaignArn().hashCode());
        hashCode = prime * hashCode + ((getConnectCampaignExecutionRoleArn() == null) ? 0 : getConnectCampaignExecutionRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public JourneyChannelSettings clone() {
        try {
            return (JourneyChannelSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.JourneyChannelSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
