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
 * Configuration for validating an instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ServerValidationConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerValidationConfiguration implements Serializable, Cloneable, StructuredPojo {

    private Server server;
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
    private String serverValidationStrategy;
    /**
     * <p>
     * The validation parameters.
     * </p>
     */
    private UserDataValidationParameters userDataValidationParameters;

    /**
     * @param server
     */

    public void setServer(Server server) {
        this.server = server;
    }

    /**
     * @return
     */

    public Server getServer() {
        return this.server;
    }

    /**
     * @param server
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerValidationConfiguration withServer(Server server) {
        setServer(server);
        return this;
    }

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

    public ServerValidationConfiguration withValidationId(String validationId) {
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

    public ServerValidationConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The validation strategy.
     * </p>
     * 
     * @param serverValidationStrategy
     *        The validation strategy.
     * @see ServerValidationStrategy
     */

    public void setServerValidationStrategy(String serverValidationStrategy) {
        this.serverValidationStrategy = serverValidationStrategy;
    }

    /**
     * <p>
     * The validation strategy.
     * </p>
     * 
     * @return The validation strategy.
     * @see ServerValidationStrategy
     */

    public String getServerValidationStrategy() {
        return this.serverValidationStrategy;
    }

    /**
     * <p>
     * The validation strategy.
     * </p>
     * 
     * @param serverValidationStrategy
     *        The validation strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerValidationStrategy
     */

    public ServerValidationConfiguration withServerValidationStrategy(String serverValidationStrategy) {
        setServerValidationStrategy(serverValidationStrategy);
        return this;
    }

    /**
     * <p>
     * The validation strategy.
     * </p>
     * 
     * @param serverValidationStrategy
     *        The validation strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerValidationStrategy
     */

    public ServerValidationConfiguration withServerValidationStrategy(ServerValidationStrategy serverValidationStrategy) {
        this.serverValidationStrategy = serverValidationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The validation parameters.
     * </p>
     * 
     * @param userDataValidationParameters
     *        The validation parameters.
     */

    public void setUserDataValidationParameters(UserDataValidationParameters userDataValidationParameters) {
        this.userDataValidationParameters = userDataValidationParameters;
    }

    /**
     * <p>
     * The validation parameters.
     * </p>
     * 
     * @return The validation parameters.
     */

    public UserDataValidationParameters getUserDataValidationParameters() {
        return this.userDataValidationParameters;
    }

    /**
     * <p>
     * The validation parameters.
     * </p>
     * 
     * @param userDataValidationParameters
     *        The validation parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerValidationConfiguration withUserDataValidationParameters(UserDataValidationParameters userDataValidationParameters) {
        setUserDataValidationParameters(userDataValidationParameters);
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
        if (getServer() != null)
            sb.append("Server: ").append(getServer()).append(",");
        if (getValidationId() != null)
            sb.append("ValidationId: ").append(getValidationId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getServerValidationStrategy() != null)
            sb.append("ServerValidationStrategy: ").append(getServerValidationStrategy()).append(",");
        if (getUserDataValidationParameters() != null)
            sb.append("UserDataValidationParameters: ").append(getUserDataValidationParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerValidationConfiguration == false)
            return false;
        ServerValidationConfiguration other = (ServerValidationConfiguration) obj;
        if (other.getServer() == null ^ this.getServer() == null)
            return false;
        if (other.getServer() != null && other.getServer().equals(this.getServer()) == false)
            return false;
        if (other.getValidationId() == null ^ this.getValidationId() == null)
            return false;
        if (other.getValidationId() != null && other.getValidationId().equals(this.getValidationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getServerValidationStrategy() == null ^ this.getServerValidationStrategy() == null)
            return false;
        if (other.getServerValidationStrategy() != null && other.getServerValidationStrategy().equals(this.getServerValidationStrategy()) == false)
            return false;
        if (other.getUserDataValidationParameters() == null ^ this.getUserDataValidationParameters() == null)
            return false;
        if (other.getUserDataValidationParameters() != null && other.getUserDataValidationParameters().equals(this.getUserDataValidationParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServer() == null) ? 0 : getServer().hashCode());
        hashCode = prime * hashCode + ((getValidationId() == null) ? 0 : getValidationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getServerValidationStrategy() == null) ? 0 : getServerValidationStrategy().hashCode());
        hashCode = prime * hashCode + ((getUserDataValidationParameters() == null) ? 0 : getUserDataValidationParameters().hashCode());
        return hashCode;
    }

    @Override
    public ServerValidationConfiguration clone() {
        try {
            return (ServerValidationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.ServerValidationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
