/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutSipMediaApplicationLoggingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSipMediaApplicationLoggingConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The SIP media application ID.
     * </p>
     */
    private String sipMediaApplicationId;
    /**
     * <p>
     * The actual logging configuration.
     * </p>
     */
    private SipMediaApplicationLoggingConfiguration sipMediaApplicationLoggingConfiguration;

    /**
     * <p>
     * The SIP media application ID.
     * </p>
     * 
     * @param sipMediaApplicationId
     *        The SIP media application ID.
     */

    public void setSipMediaApplicationId(String sipMediaApplicationId) {
        this.sipMediaApplicationId = sipMediaApplicationId;
    }

    /**
     * <p>
     * The SIP media application ID.
     * </p>
     * 
     * @return The SIP media application ID.
     */

    public String getSipMediaApplicationId() {
        return this.sipMediaApplicationId;
    }

    /**
     * <p>
     * The SIP media application ID.
     * </p>
     * 
     * @param sipMediaApplicationId
     *        The SIP media application ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSipMediaApplicationLoggingConfigurationRequest withSipMediaApplicationId(String sipMediaApplicationId) {
        setSipMediaApplicationId(sipMediaApplicationId);
        return this;
    }

    /**
     * <p>
     * The actual logging configuration.
     * </p>
     * 
     * @param sipMediaApplicationLoggingConfiguration
     *        The actual logging configuration.
     */

    public void setSipMediaApplicationLoggingConfiguration(SipMediaApplicationLoggingConfiguration sipMediaApplicationLoggingConfiguration) {
        this.sipMediaApplicationLoggingConfiguration = sipMediaApplicationLoggingConfiguration;
    }

    /**
     * <p>
     * The actual logging configuration.
     * </p>
     * 
     * @return The actual logging configuration.
     */

    public SipMediaApplicationLoggingConfiguration getSipMediaApplicationLoggingConfiguration() {
        return this.sipMediaApplicationLoggingConfiguration;
    }

    /**
     * <p>
     * The actual logging configuration.
     * </p>
     * 
     * @param sipMediaApplicationLoggingConfiguration
     *        The actual logging configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSipMediaApplicationLoggingConfigurationRequest withSipMediaApplicationLoggingConfiguration(
            SipMediaApplicationLoggingConfiguration sipMediaApplicationLoggingConfiguration) {
        setSipMediaApplicationLoggingConfiguration(sipMediaApplicationLoggingConfiguration);
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
        if (getSipMediaApplicationId() != null)
            sb.append("SipMediaApplicationId: ").append(getSipMediaApplicationId()).append(",");
        if (getSipMediaApplicationLoggingConfiguration() != null)
            sb.append("SipMediaApplicationLoggingConfiguration: ").append(getSipMediaApplicationLoggingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSipMediaApplicationLoggingConfigurationRequest == false)
            return false;
        PutSipMediaApplicationLoggingConfigurationRequest other = (PutSipMediaApplicationLoggingConfigurationRequest) obj;
        if (other.getSipMediaApplicationId() == null ^ this.getSipMediaApplicationId() == null)
            return false;
        if (other.getSipMediaApplicationId() != null && other.getSipMediaApplicationId().equals(this.getSipMediaApplicationId()) == false)
            return false;
        if (other.getSipMediaApplicationLoggingConfiguration() == null ^ this.getSipMediaApplicationLoggingConfiguration() == null)
            return false;
        if (other.getSipMediaApplicationLoggingConfiguration() != null
                && other.getSipMediaApplicationLoggingConfiguration().equals(this.getSipMediaApplicationLoggingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSipMediaApplicationId() == null) ? 0 : getSipMediaApplicationId().hashCode());
        hashCode = prime * hashCode + ((getSipMediaApplicationLoggingConfiguration() == null) ? 0 : getSipMediaApplicationLoggingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PutSipMediaApplicationLoggingConfigurationRequest clone() {
        return (PutSipMediaApplicationLoggingConfigurationRequest) super.clone();
    }

}
