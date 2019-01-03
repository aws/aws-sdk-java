/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the starting parameters for an SQL-based Kinesis Data Analytics application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/SqlRunConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SqlRunConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The input source ID. You can get this ID by calling the <a>DescribeApplication</a> operation.
     * </p>
     */
    private String inputId;
    /**
     * <p>
     * The point at which you want the application to start processing records from the streaming source.
     * </p>
     */
    private InputStartingPositionConfiguration inputStartingPositionConfiguration;

    /**
     * <p>
     * The input source ID. You can get this ID by calling the <a>DescribeApplication</a> operation.
     * </p>
     * 
     * @param inputId
     *        The input source ID. You can get this ID by calling the <a>DescribeApplication</a> operation.
     */

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    /**
     * <p>
     * The input source ID. You can get this ID by calling the <a>DescribeApplication</a> operation.
     * </p>
     * 
     * @return The input source ID. You can get this ID by calling the <a>DescribeApplication</a> operation.
     */

    public String getInputId() {
        return this.inputId;
    }

    /**
     * <p>
     * The input source ID. You can get this ID by calling the <a>DescribeApplication</a> operation.
     * </p>
     * 
     * @param inputId
     *        The input source ID. You can get this ID by calling the <a>DescribeApplication</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlRunConfiguration withInputId(String inputId) {
        setInputId(inputId);
        return this;
    }

    /**
     * <p>
     * The point at which you want the application to start processing records from the streaming source.
     * </p>
     * 
     * @param inputStartingPositionConfiguration
     *        The point at which you want the application to start processing records from the streaming source.
     */

    public void setInputStartingPositionConfiguration(InputStartingPositionConfiguration inputStartingPositionConfiguration) {
        this.inputStartingPositionConfiguration = inputStartingPositionConfiguration;
    }

    /**
     * <p>
     * The point at which you want the application to start processing records from the streaming source.
     * </p>
     * 
     * @return The point at which you want the application to start processing records from the streaming source.
     */

    public InputStartingPositionConfiguration getInputStartingPositionConfiguration() {
        return this.inputStartingPositionConfiguration;
    }

    /**
     * <p>
     * The point at which you want the application to start processing records from the streaming source.
     * </p>
     * 
     * @param inputStartingPositionConfiguration
     *        The point at which you want the application to start processing records from the streaming source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlRunConfiguration withInputStartingPositionConfiguration(InputStartingPositionConfiguration inputStartingPositionConfiguration) {
        setInputStartingPositionConfiguration(inputStartingPositionConfiguration);
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
        if (getInputId() != null)
            sb.append("InputId: ").append(getInputId()).append(",");
        if (getInputStartingPositionConfiguration() != null)
            sb.append("InputStartingPositionConfiguration: ").append(getInputStartingPositionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SqlRunConfiguration == false)
            return false;
        SqlRunConfiguration other = (SqlRunConfiguration) obj;
        if (other.getInputId() == null ^ this.getInputId() == null)
            return false;
        if (other.getInputId() != null && other.getInputId().equals(this.getInputId()) == false)
            return false;
        if (other.getInputStartingPositionConfiguration() == null ^ this.getInputStartingPositionConfiguration() == null)
            return false;
        if (other.getInputStartingPositionConfiguration() != null
                && other.getInputStartingPositionConfiguration().equals(this.getInputStartingPositionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputId() == null) ? 0 : getInputId().hashCode());
        hashCode = prime * hashCode + ((getInputStartingPositionConfiguration() == null) ? 0 : getInputStartingPositionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public SqlRunConfiguration clone() {
        try {
            return (SqlRunConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.SqlRunConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
