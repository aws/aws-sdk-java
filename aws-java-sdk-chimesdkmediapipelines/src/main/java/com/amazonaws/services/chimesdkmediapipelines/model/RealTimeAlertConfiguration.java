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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the configuration settings for real-time alerts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/RealTimeAlertConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealTimeAlertConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Turns off real-time alerts.
     * </p>
     */
    private Boolean disabled;
    /**
     * <p>
     * The rules in the alert. Rules specify the words or phrases that you want to be notified about.
     * </p>
     */
    private java.util.List<RealTimeAlertRule> rules;

    /**
     * <p>
     * Turns off real-time alerts.
     * </p>
     * 
     * @param disabled
     *        Turns off real-time alerts.
     */

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * <p>
     * Turns off real-time alerts.
     * </p>
     * 
     * @return Turns off real-time alerts.
     */

    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * Turns off real-time alerts.
     * </p>
     * 
     * @param disabled
     *        Turns off real-time alerts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeAlertConfiguration withDisabled(Boolean disabled) {
        setDisabled(disabled);
        return this;
    }

    /**
     * <p>
     * Turns off real-time alerts.
     * </p>
     * 
     * @return Turns off real-time alerts.
     */

    public Boolean isDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * The rules in the alert. Rules specify the words or phrases that you want to be notified about.
     * </p>
     * 
     * @return The rules in the alert. Rules specify the words or phrases that you want to be notified about.
     */

    public java.util.List<RealTimeAlertRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The rules in the alert. Rules specify the words or phrases that you want to be notified about.
     * </p>
     * 
     * @param rules
     *        The rules in the alert. Rules specify the words or phrases that you want to be notified about.
     */

    public void setRules(java.util.Collection<RealTimeAlertRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<RealTimeAlertRule>(rules);
    }

    /**
     * <p>
     * The rules in the alert. Rules specify the words or phrases that you want to be notified about.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The rules in the alert. Rules specify the words or phrases that you want to be notified about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeAlertConfiguration withRules(RealTimeAlertRule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<RealTimeAlertRule>(rules.length));
        }
        for (RealTimeAlertRule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rules in the alert. Rules specify the words or phrases that you want to be notified about.
     * </p>
     * 
     * @param rules
     *        The rules in the alert. Rules specify the words or phrases that you want to be notified about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeAlertConfiguration withRules(java.util.Collection<RealTimeAlertRule> rules) {
        setRules(rules);
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
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealTimeAlertConfiguration == false)
            return false;
        RealTimeAlertConfiguration other = (RealTimeAlertConfiguration) obj;
        if (other.getDisabled() == null ^ this.getDisabled() == null)
            return false;
        if (other.getDisabled() != null && other.getDisabled().equals(this.getDisabled()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public RealTimeAlertConfiguration clone() {
        try {
            return (RealTimeAlertConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.RealTimeAlertConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
