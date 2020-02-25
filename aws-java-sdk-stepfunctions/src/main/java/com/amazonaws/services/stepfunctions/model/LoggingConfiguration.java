/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The <code>LoggingConfiguration</code> data type is used to set CloudWatch Logs options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/LoggingConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines which category of execution history events are logged.
     * </p>
     */
    private String level;
    /**
     * <p>
     * Determines whether execution data is included in your log. When set to <code>FALSE</code>, data is excluded.
     * </p>
     */
    private Boolean includeExecutionData;
    /**
     * <p>
     * An array of objects that describes where your execution history events will be logged. Limited to size 1.
     * Required, if your log level is not set to <code>OFF</code>.
     * </p>
     */
    private java.util.List<LogDestination> destinations;

    /**
     * <p>
     * Defines which category of execution history events are logged.
     * </p>
     * 
     * @param level
     *        Defines which category of execution history events are logged.
     * @see LogLevel
     */

    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * <p>
     * Defines which category of execution history events are logged.
     * </p>
     * 
     * @return Defines which category of execution history events are logged.
     * @see LogLevel
     */

    public String getLevel() {
        return this.level;
    }

    /**
     * <p>
     * Defines which category of execution history events are logged.
     * </p>
     * 
     * @param level
     *        Defines which category of execution history events are logged.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public LoggingConfiguration withLevel(String level) {
        setLevel(level);
        return this;
    }

    /**
     * <p>
     * Defines which category of execution history events are logged.
     * </p>
     * 
     * @param level
     *        Defines which category of execution history events are logged.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public LoggingConfiguration withLevel(LogLevel level) {
        this.level = level.toString();
        return this;
    }

    /**
     * <p>
     * Determines whether execution data is included in your log. When set to <code>FALSE</code>, data is excluded.
     * </p>
     * 
     * @param includeExecutionData
     *        Determines whether execution data is included in your log. When set to <code>FALSE</code>, data is
     *        excluded.
     */

    public void setIncludeExecutionData(Boolean includeExecutionData) {
        this.includeExecutionData = includeExecutionData;
    }

    /**
     * <p>
     * Determines whether execution data is included in your log. When set to <code>FALSE</code>, data is excluded.
     * </p>
     * 
     * @return Determines whether execution data is included in your log. When set to <code>FALSE</code>, data is
     *         excluded.
     */

    public Boolean getIncludeExecutionData() {
        return this.includeExecutionData;
    }

    /**
     * <p>
     * Determines whether execution data is included in your log. When set to <code>FALSE</code>, data is excluded.
     * </p>
     * 
     * @param includeExecutionData
     *        Determines whether execution data is included in your log. When set to <code>FALSE</code>, data is
     *        excluded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfiguration withIncludeExecutionData(Boolean includeExecutionData) {
        setIncludeExecutionData(includeExecutionData);
        return this;
    }

    /**
     * <p>
     * Determines whether execution data is included in your log. When set to <code>FALSE</code>, data is excluded.
     * </p>
     * 
     * @return Determines whether execution data is included in your log. When set to <code>FALSE</code>, data is
     *         excluded.
     */

    public Boolean isIncludeExecutionData() {
        return this.includeExecutionData;
    }

    /**
     * <p>
     * An array of objects that describes where your execution history events will be logged. Limited to size 1.
     * Required, if your log level is not set to <code>OFF</code>.
     * </p>
     * 
     * @return An array of objects that describes where your execution history events will be logged. Limited to size 1.
     *         Required, if your log level is not set to <code>OFF</code>.
     */

    public java.util.List<LogDestination> getDestinations() {
        return destinations;
    }

    /**
     * <p>
     * An array of objects that describes where your execution history events will be logged. Limited to size 1.
     * Required, if your log level is not set to <code>OFF</code>.
     * </p>
     * 
     * @param destinations
     *        An array of objects that describes where your execution history events will be logged. Limited to size 1.
     *        Required, if your log level is not set to <code>OFF</code>.
     */

    public void setDestinations(java.util.Collection<LogDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<LogDestination>(destinations);
    }

    /**
     * <p>
     * An array of objects that describes where your execution history events will be logged. Limited to size 1.
     * Required, if your log level is not set to <code>OFF</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        An array of objects that describes where your execution history events will be logged. Limited to size 1.
     *        Required, if your log level is not set to <code>OFF</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfiguration withDestinations(LogDestination... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<LogDestination>(destinations.length));
        }
        for (LogDestination ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describes where your execution history events will be logged. Limited to size 1.
     * Required, if your log level is not set to <code>OFF</code>.
     * </p>
     * 
     * @param destinations
     *        An array of objects that describes where your execution history events will be logged. Limited to size 1.
     *        Required, if your log level is not set to <code>OFF</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfiguration withDestinations(java.util.Collection<LogDestination> destinations) {
        setDestinations(destinations);
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
        if (getLevel() != null)
            sb.append("Level: ").append(getLevel()).append(",");
        if (getIncludeExecutionData() != null)
            sb.append("IncludeExecutionData: ").append(getIncludeExecutionData()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingConfiguration == false)
            return false;
        LoggingConfiguration other = (LoggingConfiguration) obj;
        if (other.getLevel() == null ^ this.getLevel() == null)
            return false;
        if (other.getLevel() != null && other.getLevel().equals(this.getLevel()) == false)
            return false;
        if (other.getIncludeExecutionData() == null ^ this.getIncludeExecutionData() == null)
            return false;
        if (other.getIncludeExecutionData() != null && other.getIncludeExecutionData().equals(this.getIncludeExecutionData()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLevel() == null) ? 0 : getLevel().hashCode());
        hashCode = prime * hashCode + ((getIncludeExecutionData() == null) ? 0 : getIncludeExecutionData().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        return hashCode;
    }

    @Override
    public LoggingConfiguration clone() {
        try {
            return (LoggingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.LoggingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
