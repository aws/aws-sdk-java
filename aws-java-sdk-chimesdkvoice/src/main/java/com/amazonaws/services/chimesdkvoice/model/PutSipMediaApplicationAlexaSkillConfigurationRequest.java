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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutSipMediaApplicationAlexaSkillConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSipMediaApplicationAlexaSkillConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String sipMediaApplicationId;

    private SipMediaApplicationAlexaSkillConfiguration sipMediaApplicationAlexaSkillConfiguration;

    /**
     * @param sipMediaApplicationId
     */

    public void setSipMediaApplicationId(String sipMediaApplicationId) {
        this.sipMediaApplicationId = sipMediaApplicationId;
    }

    /**
     * @return
     */

    public String getSipMediaApplicationId() {
        return this.sipMediaApplicationId;
    }

    /**
     * @param sipMediaApplicationId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSipMediaApplicationAlexaSkillConfigurationRequest withSipMediaApplicationId(String sipMediaApplicationId) {
        setSipMediaApplicationId(sipMediaApplicationId);
        return this;
    }

    /**
     * @param sipMediaApplicationAlexaSkillConfiguration
     */

    public void setSipMediaApplicationAlexaSkillConfiguration(SipMediaApplicationAlexaSkillConfiguration sipMediaApplicationAlexaSkillConfiguration) {
        this.sipMediaApplicationAlexaSkillConfiguration = sipMediaApplicationAlexaSkillConfiguration;
    }

    /**
     * @return
     */

    public SipMediaApplicationAlexaSkillConfiguration getSipMediaApplicationAlexaSkillConfiguration() {
        return this.sipMediaApplicationAlexaSkillConfiguration;
    }

    /**
     * @param sipMediaApplicationAlexaSkillConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSipMediaApplicationAlexaSkillConfigurationRequest withSipMediaApplicationAlexaSkillConfiguration(
            SipMediaApplicationAlexaSkillConfiguration sipMediaApplicationAlexaSkillConfiguration) {
        setSipMediaApplicationAlexaSkillConfiguration(sipMediaApplicationAlexaSkillConfiguration);
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
        if (getSipMediaApplicationAlexaSkillConfiguration() != null)
            sb.append("SipMediaApplicationAlexaSkillConfiguration: ").append(getSipMediaApplicationAlexaSkillConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSipMediaApplicationAlexaSkillConfigurationRequest == false)
            return false;
        PutSipMediaApplicationAlexaSkillConfigurationRequest other = (PutSipMediaApplicationAlexaSkillConfigurationRequest) obj;
        if (other.getSipMediaApplicationId() == null ^ this.getSipMediaApplicationId() == null)
            return false;
        if (other.getSipMediaApplicationId() != null && other.getSipMediaApplicationId().equals(this.getSipMediaApplicationId()) == false)
            return false;
        if (other.getSipMediaApplicationAlexaSkillConfiguration() == null ^ this.getSipMediaApplicationAlexaSkillConfiguration() == null)
            return false;
        if (other.getSipMediaApplicationAlexaSkillConfiguration() != null
                && other.getSipMediaApplicationAlexaSkillConfiguration().equals(this.getSipMediaApplicationAlexaSkillConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSipMediaApplicationId() == null) ? 0 : getSipMediaApplicationId().hashCode());
        hashCode = prime * hashCode
                + ((getSipMediaApplicationAlexaSkillConfiguration() == null) ? 0 : getSipMediaApplicationAlexaSkillConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PutSipMediaApplicationAlexaSkillConfigurationRequest clone() {
        return (PutSipMediaApplicationAlexaSkillConfigurationRequest) super.clone();
    }

}
