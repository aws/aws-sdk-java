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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The <code>LoggingConfiguration</code> data type is used to set CloudWatch Logs options.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsStepFunctionStateMachineLoggingConfigurationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsStepFunctionStateMachineLoggingConfigurationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of objects that describes where your execution history events will be logged.
     * </p>
     */
    private java.util.List<AwsStepFunctionStateMachineLoggingConfigurationDestinationsDetails> destinations;
    /**
     * <p>
     * Determines whether execution data is included in your log. When set to false, data is excluded.
     * </p>
     */
    private Boolean includeExecutionData;
    /**
     * <p>
     * Defines which category of execution history events are logged.
     * </p>
     */
    private String level;

    /**
     * <p>
     * An array of objects that describes where your execution history events will be logged.
     * </p>
     * 
     * @return An array of objects that describes where your execution history events will be logged.
     */

    public java.util.List<AwsStepFunctionStateMachineLoggingConfigurationDestinationsDetails> getDestinations() {
        return destinations;
    }

    /**
     * <p>
     * An array of objects that describes where your execution history events will be logged.
     * </p>
     * 
     * @param destinations
     *        An array of objects that describes where your execution history events will be logged.
     */

    public void setDestinations(java.util.Collection<AwsStepFunctionStateMachineLoggingConfigurationDestinationsDetails> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<AwsStepFunctionStateMachineLoggingConfigurationDestinationsDetails>(destinations);
    }

    /**
     * <p>
     * An array of objects that describes where your execution history events will be logged.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        An array of objects that describes where your execution history events will be logged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsStepFunctionStateMachineLoggingConfigurationDetails withDestinations(
            AwsStepFunctionStateMachineLoggingConfigurationDestinationsDetails... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<AwsStepFunctionStateMachineLoggingConfigurationDestinationsDetails>(destinations.length));
        }
        for (AwsStepFunctionStateMachineLoggingConfigurationDestinationsDetails ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describes where your execution history events will be logged.
     * </p>
     * 
     * @param destinations
     *        An array of objects that describes where your execution history events will be logged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsStepFunctionStateMachineLoggingConfigurationDetails withDestinations(
            java.util.Collection<AwsStepFunctionStateMachineLoggingConfigurationDestinationsDetails> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * Determines whether execution data is included in your log. When set to false, data is excluded.
     * </p>
     * 
     * @param includeExecutionData
     *        Determines whether execution data is included in your log. When set to false, data is excluded.
     */

    public void setIncludeExecutionData(Boolean includeExecutionData) {
        this.includeExecutionData = includeExecutionData;
    }

    /**
     * <p>
     * Determines whether execution data is included in your log. When set to false, data is excluded.
     * </p>
     * 
     * @return Determines whether execution data is included in your log. When set to false, data is excluded.
     */

    public Boolean getIncludeExecutionData() {
        return this.includeExecutionData;
    }

    /**
     * <p>
     * Determines whether execution data is included in your log. When set to false, data is excluded.
     * </p>
     * 
     * @param includeExecutionData
     *        Determines whether execution data is included in your log. When set to false, data is excluded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsStepFunctionStateMachineLoggingConfigurationDetails withIncludeExecutionData(Boolean includeExecutionData) {
        setIncludeExecutionData(includeExecutionData);
        return this;
    }

    /**
     * <p>
     * Determines whether execution data is included in your log. When set to false, data is excluded.
     * </p>
     * 
     * @return Determines whether execution data is included in your log. When set to false, data is excluded.
     */

    public Boolean isIncludeExecutionData() {
        return this.includeExecutionData;
    }

    /**
     * <p>
     * Defines which category of execution history events are logged.
     * </p>
     * 
     * @param level
     *        Defines which category of execution history events are logged.
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
     */

    public AwsStepFunctionStateMachineLoggingConfigurationDetails withLevel(String level) {
        setLevel(level);
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
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getIncludeExecutionData() != null)
            sb.append("IncludeExecutionData: ").append(getIncludeExecutionData()).append(",");
        if (getLevel() != null)
            sb.append("Level: ").append(getLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsStepFunctionStateMachineLoggingConfigurationDetails == false)
            return false;
        AwsStepFunctionStateMachineLoggingConfigurationDetails other = (AwsStepFunctionStateMachineLoggingConfigurationDetails) obj;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getIncludeExecutionData() == null ^ this.getIncludeExecutionData() == null)
            return false;
        if (other.getIncludeExecutionData() != null && other.getIncludeExecutionData().equals(this.getIncludeExecutionData()) == false)
            return false;
        if (other.getLevel() == null ^ this.getLevel() == null)
            return false;
        if (other.getLevel() != null && other.getLevel().equals(this.getLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getIncludeExecutionData() == null) ? 0 : getIncludeExecutionData().hashCode());
        hashCode = prime * hashCode + ((getLevel() == null) ? 0 : getLevel().hashCode());
        return hashCode;
    }

    @Override
    public AwsStepFunctionStateMachineLoggingConfigurationDetails clone() {
        try {
            return (AwsStepFunctionStateMachineLoggingConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsStepFunctionStateMachineLoggingConfigurationDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
