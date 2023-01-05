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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration used for writing the output of a query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/TargetConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration needed to write data into the Timestream database and table.
     * </p>
     */
    private TimestreamConfiguration timestreamConfiguration;

    /**
     * <p>
     * Configuration needed to write data into the Timestream database and table.
     * </p>
     * 
     * @param timestreamConfiguration
     *        Configuration needed to write data into the Timestream database and table.
     */

    public void setTimestreamConfiguration(TimestreamConfiguration timestreamConfiguration) {
        this.timestreamConfiguration = timestreamConfiguration;
    }

    /**
     * <p>
     * Configuration needed to write data into the Timestream database and table.
     * </p>
     * 
     * @return Configuration needed to write data into the Timestream database and table.
     */

    public TimestreamConfiguration getTimestreamConfiguration() {
        return this.timestreamConfiguration;
    }

    /**
     * <p>
     * Configuration needed to write data into the Timestream database and table.
     * </p>
     * 
     * @param timestreamConfiguration
     *        Configuration needed to write data into the Timestream database and table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetConfiguration withTimestreamConfiguration(TimestreamConfiguration timestreamConfiguration) {
        setTimestreamConfiguration(timestreamConfiguration);
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
        if (getTimestreamConfiguration() != null)
            sb.append("TimestreamConfiguration: ").append(getTimestreamConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetConfiguration == false)
            return false;
        TargetConfiguration other = (TargetConfiguration) obj;
        if (other.getTimestreamConfiguration() == null ^ this.getTimestreamConfiguration() == null)
            return false;
        if (other.getTimestreamConfiguration() != null && other.getTimestreamConfiguration().equals(this.getTimestreamConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestreamConfiguration() == null) ? 0 : getTimestreamConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public TargetConfiguration clone() {
        try {
            return (TargetConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamquery.model.transform.TargetConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
