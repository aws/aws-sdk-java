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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration for validating an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/AppValidationConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppValidationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the validation.
     * </p>
     */
    private String validationId;
    /**
     * <p>
     * The name of the configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The validation strategy.
     * </p>
     */
    private String appValidationStrategy;
    /**
     * <p>
     * The validation parameters.
     * </p>
     */
    private SSMValidationParameters ssmValidationParameters;

    /**
     * <p>
     * The ID of the validation.
     * </p>
     * 
     * @param validationId
     *        The ID of the validation.
     */

    public void setValidationId(String validationId) {
        this.validationId = validationId;
    }

    /**
     * <p>
     * The ID of the validation.
     * </p>
     * 
     * @return The ID of the validation.
     */

    public String getValidationId() {
        return this.validationId;
    }

    /**
     * <p>
     * The ID of the validation.
     * </p>
     * 
     * @param validationId
     *        The ID of the validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppValidationConfiguration withValidationId(String validationId) {
        setValidationId(validationId);
        return this;
    }

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * 
     * @param name
     *        The name of the configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * 
     * @return The name of the configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * 
     * @param name
     *        The name of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppValidationConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The validation strategy.
     * </p>
     * 
     * @param appValidationStrategy
     *        The validation strategy.
     * @see AppValidationStrategy
     */

    public void setAppValidationStrategy(String appValidationStrategy) {
        this.appValidationStrategy = appValidationStrategy;
    }

    /**
     * <p>
     * The validation strategy.
     * </p>
     * 
     * @return The validation strategy.
     * @see AppValidationStrategy
     */

    public String getAppValidationStrategy() {
        return this.appValidationStrategy;
    }

    /**
     * <p>
     * The validation strategy.
     * </p>
     * 
     * @param appValidationStrategy
     *        The validation strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppValidationStrategy
     */

    public AppValidationConfiguration withAppValidationStrategy(String appValidationStrategy) {
        setAppValidationStrategy(appValidationStrategy);
        return this;
    }

    /**
     * <p>
     * The validation strategy.
     * </p>
     * 
     * @param appValidationStrategy
     *        The validation strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppValidationStrategy
     */

    public AppValidationConfiguration withAppValidationStrategy(AppValidationStrategy appValidationStrategy) {
        this.appValidationStrategy = appValidationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The validation parameters.
     * </p>
     * 
     * @param ssmValidationParameters
     *        The validation parameters.
     */

    public void setSsmValidationParameters(SSMValidationParameters ssmValidationParameters) {
        this.ssmValidationParameters = ssmValidationParameters;
    }

    /**
     * <p>
     * The validation parameters.
     * </p>
     * 
     * @return The validation parameters.
     */

    public SSMValidationParameters getSsmValidationParameters() {
        return this.ssmValidationParameters;
    }

    /**
     * <p>
     * The validation parameters.
     * </p>
     * 
     * @param ssmValidationParameters
     *        The validation parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppValidationConfiguration withSsmValidationParameters(SSMValidationParameters ssmValidationParameters) {
        setSsmValidationParameters(ssmValidationParameters);
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
        if (getValidationId() != null)
            sb.append("ValidationId: ").append(getValidationId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAppValidationStrategy() != null)
            sb.append("AppValidationStrategy: ").append(getAppValidationStrategy()).append(",");
        if (getSsmValidationParameters() != null)
            sb.append("SsmValidationParameters: ").append(getSsmValidationParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppValidationConfiguration == false)
            return false;
        AppValidationConfiguration other = (AppValidationConfiguration) obj;
        if (other.getValidationId() == null ^ this.getValidationId() == null)
            return false;
        if (other.getValidationId() != null && other.getValidationId().equals(this.getValidationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAppValidationStrategy() == null ^ this.getAppValidationStrategy() == null)
            return false;
        if (other.getAppValidationStrategy() != null && other.getAppValidationStrategy().equals(this.getAppValidationStrategy()) == false)
            return false;
        if (other.getSsmValidationParameters() == null ^ this.getSsmValidationParameters() == null)
            return false;
        if (other.getSsmValidationParameters() != null && other.getSsmValidationParameters().equals(this.getSsmValidationParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValidationId() == null) ? 0 : getValidationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAppValidationStrategy() == null) ? 0 : getAppValidationStrategy().hashCode());
        hashCode = prime * hashCode + ((getSsmValidationParameters() == null) ? 0 : getSsmValidationParameters().hashCode());
        return hashCode;
    }

    @Override
    public AppValidationConfiguration clone() {
        try {
            return (AppValidationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.AppValidationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
