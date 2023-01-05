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
package com.amazonaws.services.simspaceweaver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The logging configuration for a simulation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/LoggingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of the locations where SimSpace Weaver sends simulation log data.
     * </p>
     */
    private java.util.List<LogDestination> destinations;

    /**
     * <p>
     * A list of the locations where SimSpace Weaver sends simulation log data.
     * </p>
     * 
     * @return A list of the locations where SimSpace Weaver sends simulation log data.
     */

    public java.util.List<LogDestination> getDestinations() {
        return destinations;
    }

    /**
     * <p>
     * A list of the locations where SimSpace Weaver sends simulation log data.
     * </p>
     * 
     * @param destinations
     *        A list of the locations where SimSpace Weaver sends simulation log data.
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
     * A list of the locations where SimSpace Weaver sends simulation log data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        A list of the locations where SimSpace Weaver sends simulation log data.
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
     * A list of the locations where SimSpace Weaver sends simulation log data.
     * </p>
     * 
     * @param destinations
     *        A list of the locations where SimSpace Weaver sends simulation log data.
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
        com.amazonaws.services.simspaceweaver.model.transform.LoggingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
