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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetLogDeliveryConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetLogDeliveryConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The detailed activity logging configuration that you applied to the requested user pool.
     * </p>
     */
    private LogDeliveryConfigurationType logDeliveryConfiguration;

    /**
     * <p>
     * The detailed activity logging configuration that you applied to the requested user pool.
     * </p>
     * 
     * @param logDeliveryConfiguration
     *        The detailed activity logging configuration that you applied to the requested user pool.
     */

    public void setLogDeliveryConfiguration(LogDeliveryConfigurationType logDeliveryConfiguration) {
        this.logDeliveryConfiguration = logDeliveryConfiguration;
    }

    /**
     * <p>
     * The detailed activity logging configuration that you applied to the requested user pool.
     * </p>
     * 
     * @return The detailed activity logging configuration that you applied to the requested user pool.
     */

    public LogDeliveryConfigurationType getLogDeliveryConfiguration() {
        return this.logDeliveryConfiguration;
    }

    /**
     * <p>
     * The detailed activity logging configuration that you applied to the requested user pool.
     * </p>
     * 
     * @param logDeliveryConfiguration
     *        The detailed activity logging configuration that you applied to the requested user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetLogDeliveryConfigurationResult withLogDeliveryConfiguration(LogDeliveryConfigurationType logDeliveryConfiguration) {
        setLogDeliveryConfiguration(logDeliveryConfiguration);
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
        if (getLogDeliveryConfiguration() != null)
            sb.append("LogDeliveryConfiguration: ").append(getLogDeliveryConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetLogDeliveryConfigurationResult == false)
            return false;
        SetLogDeliveryConfigurationResult other = (SetLogDeliveryConfigurationResult) obj;
        if (other.getLogDeliveryConfiguration() == null ^ this.getLogDeliveryConfiguration() == null)
            return false;
        if (other.getLogDeliveryConfiguration() != null && other.getLogDeliveryConfiguration().equals(this.getLogDeliveryConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogDeliveryConfiguration() == null) ? 0 : getLogDeliveryConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public SetLogDeliveryConfigurationResult clone() {
        try {
            return (SetLogDeliveryConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
