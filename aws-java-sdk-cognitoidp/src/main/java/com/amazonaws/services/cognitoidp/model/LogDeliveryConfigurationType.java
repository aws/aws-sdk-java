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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The logging parameters of a user pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/LogDeliveryConfigurationType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogDeliveryConfigurationType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the user pool where you configured detailed activity logging.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The detailed activity logging destination of a user pool.
     * </p>
     */
    private java.util.List<LogConfigurationType> logConfigurations;

    /**
     * <p>
     * The ID of the user pool where you configured detailed activity logging.
     * </p>
     * 
     * @param userPoolId
     *        The ID of the user pool where you configured detailed activity logging.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The ID of the user pool where you configured detailed activity logging.
     * </p>
     * 
     * @return The ID of the user pool where you configured detailed activity logging.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The ID of the user pool where you configured detailed activity logging.
     * </p>
     * 
     * @param userPoolId
     *        The ID of the user pool where you configured detailed activity logging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogDeliveryConfigurationType withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The detailed activity logging destination of a user pool.
     * </p>
     * 
     * @return The detailed activity logging destination of a user pool.
     */

    public java.util.List<LogConfigurationType> getLogConfigurations() {
        return logConfigurations;
    }

    /**
     * <p>
     * The detailed activity logging destination of a user pool.
     * </p>
     * 
     * @param logConfigurations
     *        The detailed activity logging destination of a user pool.
     */

    public void setLogConfigurations(java.util.Collection<LogConfigurationType> logConfigurations) {
        if (logConfigurations == null) {
            this.logConfigurations = null;
            return;
        }

        this.logConfigurations = new java.util.ArrayList<LogConfigurationType>(logConfigurations);
    }

    /**
     * <p>
     * The detailed activity logging destination of a user pool.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogConfigurations(java.util.Collection)} or {@link #withLogConfigurations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param logConfigurations
     *        The detailed activity logging destination of a user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogDeliveryConfigurationType withLogConfigurations(LogConfigurationType... logConfigurations) {
        if (this.logConfigurations == null) {
            setLogConfigurations(new java.util.ArrayList<LogConfigurationType>(logConfigurations.length));
        }
        for (LogConfigurationType ele : logConfigurations) {
            this.logConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The detailed activity logging destination of a user pool.
     * </p>
     * 
     * @param logConfigurations
     *        The detailed activity logging destination of a user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogDeliveryConfigurationType withLogConfigurations(java.util.Collection<LogConfigurationType> logConfigurations) {
        setLogConfigurations(logConfigurations);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getLogConfigurations() != null)
            sb.append("LogConfigurations: ").append(getLogConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogDeliveryConfigurationType == false)
            return false;
        LogDeliveryConfigurationType other = (LogDeliveryConfigurationType) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getLogConfigurations() == null ^ this.getLogConfigurations() == null)
            return false;
        if (other.getLogConfigurations() != null && other.getLogConfigurations().equals(this.getLogConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getLogConfigurations() == null) ? 0 : getLogConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public LogDeliveryConfigurationType clone() {
        try {
            return (LogDeliveryConfigurationType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.LogDeliveryConfigurationTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
