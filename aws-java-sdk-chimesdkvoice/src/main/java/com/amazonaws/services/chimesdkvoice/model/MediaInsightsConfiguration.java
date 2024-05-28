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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for a call analytics task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/MediaInsightsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaInsightsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Denotes the configration as enabled or disabled.
     * </p>
     */
    private Boolean disabled;
    /**
     * <p>
     * The configuration's ARN.
     * </p>
     */
    private String configurationArn;

    /**
     * <p>
     * Denotes the configration as enabled or disabled.
     * </p>
     * 
     * @param disabled
     *        Denotes the configration as enabled or disabled.
     */

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * <p>
     * Denotes the configration as enabled or disabled.
     * </p>
     * 
     * @return Denotes the configration as enabled or disabled.
     */

    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * Denotes the configration as enabled or disabled.
     * </p>
     * 
     * @param disabled
     *        Denotes the configration as enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsConfiguration withDisabled(Boolean disabled) {
        setDisabled(disabled);
        return this;
    }

    /**
     * <p>
     * Denotes the configration as enabled or disabled.
     * </p>
     * 
     * @return Denotes the configration as enabled or disabled.
     */

    public Boolean isDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * The configuration's ARN.
     * </p>
     * 
     * @param configurationArn
     *        The configuration's ARN.
     */

    public void setConfigurationArn(String configurationArn) {
        this.configurationArn = configurationArn;
    }

    /**
     * <p>
     * The configuration's ARN.
     * </p>
     * 
     * @return The configuration's ARN.
     */

    public String getConfigurationArn() {
        return this.configurationArn;
    }

    /**
     * <p>
     * The configuration's ARN.
     * </p>
     * 
     * @param configurationArn
     *        The configuration's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsConfiguration withConfigurationArn(String configurationArn) {
        setConfigurationArn(configurationArn);
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
        if (getDisabled() != null)
            sb.append("Disabled: ").append(getDisabled()).append(",");
        if (getConfigurationArn() != null)
            sb.append("ConfigurationArn: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaInsightsConfiguration == false)
            return false;
        MediaInsightsConfiguration other = (MediaInsightsConfiguration) obj;
        if (other.getDisabled() == null ^ this.getDisabled() == null)
            return false;
        if (other.getDisabled() != null && other.getDisabled().equals(this.getDisabled()) == false)
            return false;
        if (other.getConfigurationArn() == null ^ this.getConfigurationArn() == null)
            return false;
        if (other.getConfigurationArn() != null && other.getConfigurationArn().equals(this.getConfigurationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        hashCode = prime * hashCode + ((getConfigurationArn() == null) ? 0 : getConfigurationArn().hashCode());
        return hashCode;
    }

    @Override
    public MediaInsightsConfiguration clone() {
        try {
            return (MediaInsightsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkvoice.model.transform.MediaInsightsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
