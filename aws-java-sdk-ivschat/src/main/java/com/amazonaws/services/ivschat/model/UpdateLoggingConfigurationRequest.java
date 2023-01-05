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
package com.amazonaws.services.ivschat.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/UpdateLoggingConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLoggingConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains a destination configuration for where chat content will be logged. There can be only
     * one type of destination (<code>cloudWatchLogs</code>, <code>firehose</code>, or <code>s3</code>) in a
     * <code>destinationConfiguration</code>.
     * </p>
     */
    private DestinationConfiguration destinationConfiguration;
    /**
     * <p>
     * Identifier of the logging configuration to be updated.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * Logging-configuration name. The value does not need to be unique.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A complex type that contains a destination configuration for where chat content will be logged. There can be only
     * one type of destination (<code>cloudWatchLogs</code>, <code>firehose</code>, or <code>s3</code>) in a
     * <code>destinationConfiguration</code>.
     * </p>
     * 
     * @param destinationConfiguration
     *        A complex type that contains a destination configuration for where chat content will be logged. There can
     *        be only one type of destination (<code>cloudWatchLogs</code>, <code>firehose</code>, or <code>s3</code>)
     *        in a <code>destinationConfiguration</code>.
     */

    public void setDestinationConfiguration(DestinationConfiguration destinationConfiguration) {
        this.destinationConfiguration = destinationConfiguration;
    }

    /**
     * <p>
     * A complex type that contains a destination configuration for where chat content will be logged. There can be only
     * one type of destination (<code>cloudWatchLogs</code>, <code>firehose</code>, or <code>s3</code>) in a
     * <code>destinationConfiguration</code>.
     * </p>
     * 
     * @return A complex type that contains a destination configuration for where chat content will be logged. There can
     *         be only one type of destination (<code>cloudWatchLogs</code>, <code>firehose</code>, or <code>s3</code>)
     *         in a <code>destinationConfiguration</code>.
     */

    public DestinationConfiguration getDestinationConfiguration() {
        return this.destinationConfiguration;
    }

    /**
     * <p>
     * A complex type that contains a destination configuration for where chat content will be logged. There can be only
     * one type of destination (<code>cloudWatchLogs</code>, <code>firehose</code>, or <code>s3</code>) in a
     * <code>destinationConfiguration</code>.
     * </p>
     * 
     * @param destinationConfiguration
     *        A complex type that contains a destination configuration for where chat content will be logged. There can
     *        be only one type of destination (<code>cloudWatchLogs</code>, <code>firehose</code>, or <code>s3</code>)
     *        in a <code>destinationConfiguration</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLoggingConfigurationRequest withDestinationConfiguration(DestinationConfiguration destinationConfiguration) {
        setDestinationConfiguration(destinationConfiguration);
        return this;
    }

    /**
     * <p>
     * Identifier of the logging configuration to be updated.
     * </p>
     * 
     * @param identifier
     *        Identifier of the logging configuration to be updated.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * Identifier of the logging configuration to be updated.
     * </p>
     * 
     * @return Identifier of the logging configuration to be updated.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * Identifier of the logging configuration to be updated.
     * </p>
     * 
     * @param identifier
     *        Identifier of the logging configuration to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLoggingConfigurationRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * Logging-configuration name. The value does not need to be unique.
     * </p>
     * 
     * @param name
     *        Logging-configuration name. The value does not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Logging-configuration name. The value does not need to be unique.
     * </p>
     * 
     * @return Logging-configuration name. The value does not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Logging-configuration name. The value does not need to be unique.
     * </p>
     * 
     * @param name
     *        Logging-configuration name. The value does not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLoggingConfigurationRequest withName(String name) {
        setName(name);
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
        if (getDestinationConfiguration() != null)
            sb.append("DestinationConfiguration: ").append(getDestinationConfiguration()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLoggingConfigurationRequest == false)
            return false;
        UpdateLoggingConfigurationRequest other = (UpdateLoggingConfigurationRequest) obj;
        if (other.getDestinationConfiguration() == null ^ this.getDestinationConfiguration() == null)
            return false;
        if (other.getDestinationConfiguration() != null && other.getDestinationConfiguration().equals(this.getDestinationConfiguration()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationConfiguration() == null) ? 0 : getDestinationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLoggingConfigurationRequest clone() {
        return (UpdateLoggingConfigurationRequest) super.clone();
    }

}
