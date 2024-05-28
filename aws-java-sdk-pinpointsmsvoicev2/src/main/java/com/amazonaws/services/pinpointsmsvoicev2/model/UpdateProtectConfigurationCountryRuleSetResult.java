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

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdateProtectConfigurationCountryRuleSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProtectConfigurationCountryRuleSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the protect configuration.
     * </p>
     */
    private String protectConfigurationArn;
    /**
     * <p>
     * The unique identifier for the protect configuration.
     * </p>
     */
    private String protectConfigurationId;
    /**
     * <p>
     * The number capability that was updated
     * </p>
     */
    private String numberCapability;
    /**
     * <p>
     * An array of ProtectConfigurationCountryRuleSetInformation containing the rules for the NumberCapability.
     * </p>
     */
    private java.util.Map<String, ProtectConfigurationCountryRuleSetInformation> countryRuleSet;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the protect configuration.
     * </p>
     * 
     * @param protectConfigurationArn
     *        The Amazon Resource Name (ARN) of the protect configuration.
     */

    public void setProtectConfigurationArn(String protectConfigurationArn) {
        this.protectConfigurationArn = protectConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the protect configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the protect configuration.
     */

    public String getProtectConfigurationArn() {
        return this.protectConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the protect configuration.
     * </p>
     * 
     * @param protectConfigurationArn
     *        The Amazon Resource Name (ARN) of the protect configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProtectConfigurationCountryRuleSetResult withProtectConfigurationArn(String protectConfigurationArn) {
        setProtectConfigurationArn(protectConfigurationArn);
        return this;
    }

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

    public UpdateProtectConfigurationCountryRuleSetResult withProtectConfigurationId(String protectConfigurationId) {
        setProtectConfigurationId(protectConfigurationId);
        return this;
    }

    /**
     * <p>
     * The number capability that was updated
     * </p>
     * 
     * @param numberCapability
     *        The number capability that was updated
     * @see NumberCapability
     */

    public void setNumberCapability(String numberCapability) {
        this.numberCapability = numberCapability;
    }

    /**
     * <p>
     * The number capability that was updated
     * </p>
     * 
     * @return The number capability that was updated
     * @see NumberCapability
     */

    public String getNumberCapability() {
        return this.numberCapability;
    }

    /**
     * <p>
     * The number capability that was updated
     * </p>
     * 
     * @param numberCapability
     *        The number capability that was updated
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberCapability
     */

    public UpdateProtectConfigurationCountryRuleSetResult withNumberCapability(String numberCapability) {
        setNumberCapability(numberCapability);
        return this;
    }

    /**
     * <p>
     * The number capability that was updated
     * </p>
     * 
     * @param numberCapability
     *        The number capability that was updated
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberCapability
     */

    public UpdateProtectConfigurationCountryRuleSetResult withNumberCapability(NumberCapability numberCapability) {
        this.numberCapability = numberCapability.toString();
        return this;
    }

    /**
     * <p>
     * An array of ProtectConfigurationCountryRuleSetInformation containing the rules for the NumberCapability.
     * </p>
     * 
     * @return An array of ProtectConfigurationCountryRuleSetInformation containing the rules for the NumberCapability.
     */

    public java.util.Map<String, ProtectConfigurationCountryRuleSetInformation> getCountryRuleSet() {
        return countryRuleSet;
    }

    /**
     * <p>
     * An array of ProtectConfigurationCountryRuleSetInformation containing the rules for the NumberCapability.
     * </p>
     * 
     * @param countryRuleSet
     *        An array of ProtectConfigurationCountryRuleSetInformation containing the rules for the NumberCapability.
     */

    public void setCountryRuleSet(java.util.Map<String, ProtectConfigurationCountryRuleSetInformation> countryRuleSet) {
        this.countryRuleSet = countryRuleSet;
    }

    /**
     * <p>
     * An array of ProtectConfigurationCountryRuleSetInformation containing the rules for the NumberCapability.
     * </p>
     * 
     * @param countryRuleSet
     *        An array of ProtectConfigurationCountryRuleSetInformation containing the rules for the NumberCapability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProtectConfigurationCountryRuleSetResult withCountryRuleSet(java.util.Map<String, ProtectConfigurationCountryRuleSetInformation> countryRuleSet) {
        setCountryRuleSet(countryRuleSet);
        return this;
    }

    /**
     * Add a single CountryRuleSet entry
     *
     * @see UpdateProtectConfigurationCountryRuleSetResult#withCountryRuleSet
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProtectConfigurationCountryRuleSetResult addCountryRuleSetEntry(String key, ProtectConfigurationCountryRuleSetInformation value) {
        if (null == this.countryRuleSet) {
            this.countryRuleSet = new java.util.HashMap<String, ProtectConfigurationCountryRuleSetInformation>();
        }
        if (this.countryRuleSet.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.countryRuleSet.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CountryRuleSet.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProtectConfigurationCountryRuleSetResult clearCountryRuleSetEntries() {
        this.countryRuleSet = null;
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
        if (getProtectConfigurationArn() != null)
            sb.append("ProtectConfigurationArn: ").append(getProtectConfigurationArn()).append(",");
        if (getProtectConfigurationId() != null)
            sb.append("ProtectConfigurationId: ").append(getProtectConfigurationId()).append(",");
        if (getNumberCapability() != null)
            sb.append("NumberCapability: ").append(getNumberCapability()).append(",");
        if (getCountryRuleSet() != null)
            sb.append("CountryRuleSet: ").append(getCountryRuleSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProtectConfigurationCountryRuleSetResult == false)
            return false;
        UpdateProtectConfigurationCountryRuleSetResult other = (UpdateProtectConfigurationCountryRuleSetResult) obj;
        if (other.getProtectConfigurationArn() == null ^ this.getProtectConfigurationArn() == null)
            return false;
        if (other.getProtectConfigurationArn() != null && other.getProtectConfigurationArn().equals(this.getProtectConfigurationArn()) == false)
            return false;
        if (other.getProtectConfigurationId() == null ^ this.getProtectConfigurationId() == null)
            return false;
        if (other.getProtectConfigurationId() != null && other.getProtectConfigurationId().equals(this.getProtectConfigurationId()) == false)
            return false;
        if (other.getNumberCapability() == null ^ this.getNumberCapability() == null)
            return false;
        if (other.getNumberCapability() != null && other.getNumberCapability().equals(this.getNumberCapability()) == false)
            return false;
        if (other.getCountryRuleSet() == null ^ this.getCountryRuleSet() == null)
            return false;
        if (other.getCountryRuleSet() != null && other.getCountryRuleSet().equals(this.getCountryRuleSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtectConfigurationArn() == null) ? 0 : getProtectConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getProtectConfigurationId() == null) ? 0 : getProtectConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getNumberCapability() == null) ? 0 : getNumberCapability().hashCode());
        hashCode = prime * hashCode + ((getCountryRuleSet() == null) ? 0 : getCountryRuleSet().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProtectConfigurationCountryRuleSetResult clone() {
        try {
            return (UpdateProtectConfigurationCountryRuleSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
