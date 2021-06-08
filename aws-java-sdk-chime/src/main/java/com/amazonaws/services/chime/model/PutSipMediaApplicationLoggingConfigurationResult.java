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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutSipMediaApplicationLoggingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSipMediaApplicationLoggingConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    private SipMediaApplicationLoggingConfiguration sipMediaApplicationLoggingConfiguration;

    /**
     * @param sipMediaApplicationLoggingConfiguration
     */

    public void setSipMediaApplicationLoggingConfiguration(SipMediaApplicationLoggingConfiguration sipMediaApplicationLoggingConfiguration) {
        this.sipMediaApplicationLoggingConfiguration = sipMediaApplicationLoggingConfiguration;
    }

    /**
     * @return
     */

    public SipMediaApplicationLoggingConfiguration getSipMediaApplicationLoggingConfiguration() {
        return this.sipMediaApplicationLoggingConfiguration;
    }

    /**
     * @param sipMediaApplicationLoggingConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSipMediaApplicationLoggingConfigurationResult withSipMediaApplicationLoggingConfiguration(
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

        if (obj instanceof PutSipMediaApplicationLoggingConfigurationResult == false)
            return false;
        PutSipMediaApplicationLoggingConfigurationResult other = (PutSipMediaApplicationLoggingConfigurationResult) obj;
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

        hashCode = prime * hashCode + ((getSipMediaApplicationLoggingConfiguration() == null) ? 0 : getSipMediaApplicationLoggingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PutSipMediaApplicationLoggingConfigurationResult clone() {
        try {
            return (PutSipMediaApplicationLoggingConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
