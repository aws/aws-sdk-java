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
 *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdateProtectConfigurationCountryRuleSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProtectConfigurationCountryRuleSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the protect configuration.
     * </p>
     */
    private String protectConfigurationId;
    /**
     * <p>
     * The number capability to apply the CountryRuleSetUpdates updates to.
     * </p>
     */
    private String numberCapability;
    /**
     * <p>
     * A map of ProtectConfigurationCountryRuleSetInformation objects that contain the details for the requested
     * NumberCapability. The Key is the two-letter ISO country code. For a list of supported ISO country codes, see <a
     * href="https://docs.aws.amazon.com/sms-voice/latest/userguide/phone-numbers-sms-by-country.html">Supported
     * countries and regions (SMS channel)</a> in the Amazon Pinpoint SMS user guide.
     * </p>
     */
    private java.util.Map<String, ProtectConfigurationCountryRuleSetInformation> countryRuleSetUpdates;

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

    public UpdateProtectConfigurationCountryRuleSetRequest withProtectConfigurationId(String protectConfigurationId) {
        setProtectConfigurationId(protectConfigurationId);
        return this;
    }

    /**
     * <p>
     * The number capability to apply the CountryRuleSetUpdates updates to.
     * </p>
     * 
     * @param numberCapability
     *        The number capability to apply the CountryRuleSetUpdates updates to.
     * @see NumberCapability
     */

    public void setNumberCapability(String numberCapability) {
        this.numberCapability = numberCapability;
    }

    /**
     * <p>
     * The number capability to apply the CountryRuleSetUpdates updates to.
     * </p>
     * 
     * @return The number capability to apply the CountryRuleSetUpdates updates to.
     * @see NumberCapability
     */

    public String getNumberCapability() {
        return this.numberCapability;
    }

    /**
     * <p>
     * The number capability to apply the CountryRuleSetUpdates updates to.
     * </p>
     * 
     * @param numberCapability
     *        The number capability to apply the CountryRuleSetUpdates updates to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberCapability
     */

    public UpdateProtectConfigurationCountryRuleSetRequest withNumberCapability(String numberCapability) {
        setNumberCapability(numberCapability);
        return this;
    }

    /**
     * <p>
     * The number capability to apply the CountryRuleSetUpdates updates to.
     * </p>
     * 
     * @param numberCapability
     *        The number capability to apply the CountryRuleSetUpdates updates to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberCapability
     */

    public UpdateProtectConfigurationCountryRuleSetRequest withNumberCapability(NumberCapability numberCapability) {
        this.numberCapability = numberCapability.toString();
        return this;
    }

    /**
     * <p>
     * A map of ProtectConfigurationCountryRuleSetInformation objects that contain the details for the requested
     * NumberCapability. The Key is the two-letter ISO country code. For a list of supported ISO country codes, see <a
     * href="https://docs.aws.amazon.com/sms-voice/latest/userguide/phone-numbers-sms-by-country.html">Supported
     * countries and regions (SMS channel)</a> in the Amazon Pinpoint SMS user guide.
     * </p>
     * 
     * @return A map of ProtectConfigurationCountryRuleSetInformation objects that contain the details for the requested
     *         NumberCapability. The Key is the two-letter ISO country code. For a list of supported ISO country codes,
     *         see <a href="https://docs.aws.amazon.com/sms-voice/latest/userguide/phone-numbers-sms-by-country.html">
     *         Supported countries and regions (SMS channel)</a> in the Amazon Pinpoint SMS user guide.
     */

    public java.util.Map<String, ProtectConfigurationCountryRuleSetInformation> getCountryRuleSetUpdates() {
        return countryRuleSetUpdates;
    }

    /**
     * <p>
     * A map of ProtectConfigurationCountryRuleSetInformation objects that contain the details for the requested
     * NumberCapability. The Key is the two-letter ISO country code. For a list of supported ISO country codes, see <a
     * href="https://docs.aws.amazon.com/sms-voice/latest/userguide/phone-numbers-sms-by-country.html">Supported
     * countries and regions (SMS channel)</a> in the Amazon Pinpoint SMS user guide.
     * </p>
     * 
     * @param countryRuleSetUpdates
     *        A map of ProtectConfigurationCountryRuleSetInformation objects that contain the details for the requested
     *        NumberCapability. The Key is the two-letter ISO country code. For a list of supported ISO country codes,
     *        see <a href="https://docs.aws.amazon.com/sms-voice/latest/userguide/phone-numbers-sms-by-country.html">
     *        Supported countries and regions (SMS channel)</a> in the Amazon Pinpoint SMS user guide.
     */

    public void setCountryRuleSetUpdates(java.util.Map<String, ProtectConfigurationCountryRuleSetInformation> countryRuleSetUpdates) {
        this.countryRuleSetUpdates = countryRuleSetUpdates;
    }

    /**
     * <p>
     * A map of ProtectConfigurationCountryRuleSetInformation objects that contain the details for the requested
     * NumberCapability. The Key is the two-letter ISO country code. For a list of supported ISO country codes, see <a
     * href="https://docs.aws.amazon.com/sms-voice/latest/userguide/phone-numbers-sms-by-country.html">Supported
     * countries and regions (SMS channel)</a> in the Amazon Pinpoint SMS user guide.
     * </p>
     * 
     * @param countryRuleSetUpdates
     *        A map of ProtectConfigurationCountryRuleSetInformation objects that contain the details for the requested
     *        NumberCapability. The Key is the two-letter ISO country code. For a list of supported ISO country codes,
     *        see <a href="https://docs.aws.amazon.com/sms-voice/latest/userguide/phone-numbers-sms-by-country.html">
     *        Supported countries and regions (SMS channel)</a> in the Amazon Pinpoint SMS user guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProtectConfigurationCountryRuleSetRequest withCountryRuleSetUpdates(
            java.util.Map<String, ProtectConfigurationCountryRuleSetInformation> countryRuleSetUpdates) {
        setCountryRuleSetUpdates(countryRuleSetUpdates);
        return this;
    }

    /**
     * Add a single CountryRuleSetUpdates entry
     *
     * @see UpdateProtectConfigurationCountryRuleSetRequest#withCountryRuleSetUpdates
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProtectConfigurationCountryRuleSetRequest addCountryRuleSetUpdatesEntry(String key, ProtectConfigurationCountryRuleSetInformation value) {
        if (null == this.countryRuleSetUpdates) {
            this.countryRuleSetUpdates = new java.util.HashMap<String, ProtectConfigurationCountryRuleSetInformation>();
        }
        if (this.countryRuleSetUpdates.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.countryRuleSetUpdates.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CountryRuleSetUpdates.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProtectConfigurationCountryRuleSetRequest clearCountryRuleSetUpdatesEntries() {
        this.countryRuleSetUpdates = null;
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
            sb.append("NumberCapability: ").append(getNumberCapability()).append(",");
        if (getCountryRuleSetUpdates() != null)
            sb.append("CountryRuleSetUpdates: ").append(getCountryRuleSetUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProtectConfigurationCountryRuleSetRequest == false)
            return false;
        UpdateProtectConfigurationCountryRuleSetRequest other = (UpdateProtectConfigurationCountryRuleSetRequest) obj;
        if (other.getProtectConfigurationId() == null ^ this.getProtectConfigurationId() == null)
            return false;
        if (other.getProtectConfigurationId() != null && other.getProtectConfigurationId().equals(this.getProtectConfigurationId()) == false)
            return false;
        if (other.getNumberCapability() == null ^ this.getNumberCapability() == null)
            return false;
        if (other.getNumberCapability() != null && other.getNumberCapability().equals(this.getNumberCapability()) == false)
            return false;
        if (other.getCountryRuleSetUpdates() == null ^ this.getCountryRuleSetUpdates() == null)
            return false;
        if (other.getCountryRuleSetUpdates() != null && other.getCountryRuleSetUpdates().equals(this.getCountryRuleSetUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtectConfigurationId() == null) ? 0 : getProtectConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getNumberCapability() == null) ? 0 : getNumberCapability().hashCode());
        hashCode = prime * hashCode + ((getCountryRuleSetUpdates() == null) ? 0 : getCountryRuleSetUpdates().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProtectConfigurationCountryRuleSetRequest clone() {
        return (UpdateProtectConfigurationCountryRuleSetRequest) super.clone();
    }

}
