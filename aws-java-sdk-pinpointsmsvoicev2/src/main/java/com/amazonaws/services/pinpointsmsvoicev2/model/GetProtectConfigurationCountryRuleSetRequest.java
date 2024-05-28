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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/GetProtectConfigurationCountryRuleSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProtectConfigurationCountryRuleSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the protect configuration.
     * </p>
     */
    private String protectConfigurationId;
    /**
     * <p>
     * The capability type to return the CountryRuleSet for. Valid values are <code>SMS</code>, <code>VOICE</code>, or
     * <code>MMS</code>.
     * </p>
     */
    private String numberCapability;

    /**
     * <p>
     * The unique identifier for the protect configuration.
     * </p>
     * 
     * @param protectConfigurationId
     *        The unique identifier for the protect configuration.
     */

    public void setProtectConfigurationId(String protectConfigurationId) {
        this.protectConfigurationId = protectConfigurationId;
    }

    /**
     * <p>
     * The unique identifier for the protect configuration.
     * </p>
     * 
     * @return The unique identifier for the protect configuration.
     */

    public String getProtectConfigurationId() {
        return this.protectConfigurationId;
    }

    /**
     * <p>
     * The unique identifier for the protect configuration.
     * </p>
     * 
     * @param protectConfigurationId
     *        The unique identifier for the protect configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProtectConfigurationCountryRuleSetRequest withProtectConfigurationId(String protectConfigurationId) {
        setProtectConfigurationId(protectConfigurationId);
        return this;
    }

    /**
     * <p>
     * The capability type to return the CountryRuleSet for. Valid values are <code>SMS</code>, <code>VOICE</code>, or
     * <code>MMS</code>.
     * </p>
     * 
     * @param numberCapability
     *        The capability type to return the CountryRuleSet for. Valid values are <code>SMS</code>,
     *        <code>VOICE</code>, or <code>MMS</code>.
     * @see NumberCapability
     */

    public void setNumberCapability(String numberCapability) {
        this.numberCapability = numberCapability;
    }

    /**
     * <p>
     * The capability type to return the CountryRuleSet for. Valid values are <code>SMS</code>, <code>VOICE</code>, or
     * <code>MMS</code>.
     * </p>
     * 
     * @return The capability type to return the CountryRuleSet for. Valid values are <code>SMS</code>,
     *         <code>VOICE</code>, or <code>MMS</code>.
     * @see NumberCapability
     */

    public String getNumberCapability() {
        return this.numberCapability;
    }

    /**
     * <p>
     * The capability type to return the CountryRuleSet for. Valid values are <code>SMS</code>, <code>VOICE</code>, or
     * <code>MMS</code>.
     * </p>
     * 
     * @param numberCapability
     *        The capability type to return the CountryRuleSet for. Valid values are <code>SMS</code>,
     *        <code>VOICE</code>, or <code>MMS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberCapability
     */

    public GetProtectConfigurationCountryRuleSetRequest withNumberCapability(String numberCapability) {
        setNumberCapability(numberCapability);
        return this;
    }

    /**
     * <p>
     * The capability type to return the CountryRuleSet for. Valid values are <code>SMS</code>, <code>VOICE</code>, or
     * <code>MMS</code>.
     * </p>
     * 
     * @param numberCapability
     *        The capability type to return the CountryRuleSet for. Valid values are <code>SMS</code>,
     *        <code>VOICE</code>, or <code>MMS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberCapability
     */

    public GetProtectConfigurationCountryRuleSetRequest withNumberCapability(NumberCapability numberCapability) {
        this.numberCapability = numberCapability.toString();
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
        if (getProtectConfigurationId() != null)
            sb.append("ProtectConfigurationId: ").append(getProtectConfigurationId()).append(",");
        if (getNumberCapability() != null)
            sb.append("NumberCapability: ").append(getNumberCapability());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProtectConfigurationCountryRuleSetRequest == false)
            return false;
        GetProtectConfigurationCountryRuleSetRequest other = (GetProtectConfigurationCountryRuleSetRequest) obj;
        if (other.getProtectConfigurationId() == null ^ this.getProtectConfigurationId() == null)
            return false;
        if (other.getProtectConfigurationId() != null && other.getProtectConfigurationId().equals(this.getProtectConfigurationId()) == false)
            return false;
        if (other.getNumberCapability() == null ^ this.getNumberCapability() == null)
            return false;
        if (other.getNumberCapability() != null && other.getNumberCapability().equals(this.getNumberCapability()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtectConfigurationId() == null) ? 0 : getProtectConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getNumberCapability() == null) ? 0 : getNumberCapability().hashCode());
        return hashCode;
    }

    @Override
    public GetProtectConfigurationCountryRuleSetRequest clone() {
        return (GetProtectConfigurationCountryRuleSetRequest) super.clone();
    }

}
