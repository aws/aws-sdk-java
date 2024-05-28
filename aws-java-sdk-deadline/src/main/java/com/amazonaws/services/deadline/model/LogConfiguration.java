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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Log configuration details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/LogConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The log configuration error details.
     * </p>
     */
    private String error;
    /**
     * <p>
     * The log drivers for worker related logs.
     * </p>
     */
    private String logDriver;
    /**
     * <p>
     * The options for a log driver.
     * </p>
     */
    private java.util.Map<String, String> options;
    /**
     * <p>
     * The parameters for the log configuration.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The log configuration error details.
     * </p>
     * 
     * @param error
     *        The log configuration error details.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * The log configuration error details.
     * </p>
     * 
     * @return The log configuration error details.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * The log configuration error details.
     * </p>
     * 
     * @param error
     *        The log configuration error details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogConfiguration withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The log drivers for worker related logs.
     * </p>
     * 
     * @param logDriver
     *        The log drivers for worker related logs.
     */

    public void setLogDriver(String logDriver) {
        this.logDriver = logDriver;
    }

    /**
     * <p>
     * The log drivers for worker related logs.
     * </p>
     * 
     * @return The log drivers for worker related logs.
     */

    public String getLogDriver() {
        return this.logDriver;
    }

    /**
     * <p>
     * The log drivers for worker related logs.
     * </p>
     * 
     * @param logDriver
     *        The log drivers for worker related logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogConfiguration withLogDriver(String logDriver) {
        setLogDriver(logDriver);
        return this;
    }

    /**
     * <p>
     * The options for a log driver.
     * </p>
     * 
     * @return The options for a log driver.
     */

    public java.util.Map<String, String> getOptions() {
        return options;
    }

    /**
     * <p>
     * The options for a log driver.
     * </p>
     * 
     * @param options
     *        The options for a log driver.
     */

    public void setOptions(java.util.Map<String, String> options) {
        this.options = options;
    }

    /**
     * <p>
     * The options for a log driver.
     * </p>
     * 
     * @param options
     *        The options for a log driver.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogConfiguration withOptions(java.util.Map<String, String> options) {
        setOptions(options);
        return this;
    }

    /**
     * Add a single Options entry
     *
     * @see LogConfiguration#withOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LogConfiguration addOptionsEntry(String key, String value) {
        if (null == this.options) {
            this.options = new java.util.HashMap<String, String>();
        }
        if (this.options.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.options.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Options.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogConfiguration clearOptionsEntries() {
        this.options = null;
        return this;
    }

    /**
     * <p>
     * The parameters for the log configuration.
     * </p>
     * 
     * @return The parameters for the log configuration.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters for the log configuration.
     * </p>
     * 
     * @param parameters
     *        The parameters for the log configuration.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters for the log configuration.
     * </p>
     * 
     * @param parameters
     *        The parameters for the log configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogConfiguration withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see LogConfiguration#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LogConfiguration addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogConfiguration clearParametersEntries() {
        this.parameters = null;
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
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getLogDriver() != null)
            sb.append("LogDriver: ").append(getLogDriver()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogConfiguration == false)
            return false;
        LogConfiguration other = (LogConfiguration) obj;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getLogDriver() == null ^ this.getLogDriver() == null)
            return false;
        if (other.getLogDriver() != null && other.getLogDriver().equals(this.getLogDriver()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getLogDriver() == null) ? 0 : getLogDriver().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public LogConfiguration clone() {
        try {
            return (LogConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.LogConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
