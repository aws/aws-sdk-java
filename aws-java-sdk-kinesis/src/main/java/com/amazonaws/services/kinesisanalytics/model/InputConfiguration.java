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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * When you start your application, you provide this configuration, which identifies the input source and the point in
 * the input source at which you want the application to start processing records.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/InputConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Input source ID. You can get this ID by calling the <a>DescribeApplication</a> operation.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Point at which you want the application to start processing records from the streaming source.
     * </p>
     */
    private InputStartingPositionConfiguration inputStartingPositionConfiguration;

    /**
     * <p>
     * Input source ID. You can get this ID by calling the <a>DescribeApplication</a> operation.
     * </p>
     * 
     * @param id
     *        Input source ID. You can get this ID by calling the <a>DescribeApplication</a> operation.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Input source ID. You can get this ID by calling the <a>DescribeApplication</a> operation.
     * </p>
     * 
     * @return Input source ID. You can get this ID by calling the <a>DescribeApplication</a> operation.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Input source ID. You can get this ID by calling the <a>DescribeApplication</a> operation.
     * </p>
     * 
     * @param id
     *        Input source ID. You can get this ID by calling the <a>DescribeApplication</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputConfiguration withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Point at which you want the application to start processing records from the streaming source.
     * </p>
     * 
     * @param inputStartingPositionConfiguration
     *        Point at which you want the application to start processing records from the streaming source.
     */

    public void setInputStartingPositionConfiguration(InputStartingPositionConfiguration inputStartingPositionConfiguration) {
        this.inputStartingPositionConfiguration = inputStartingPositionConfiguration;
    }

    /**
     * <p>
     * Point at which you want the application to start processing records from the streaming source.
     * </p>
     * 
     * @return Point at which you want the application to start processing records from the streaming source.
     */

    public InputStartingPositionConfiguration getInputStartingPositionConfiguration() {
        return this.inputStartingPositionConfiguration;
    }

    /**
     * <p>
     * Point at which you want the application to start processing records from the streaming source.
     * </p>
     * 
     * @param inputStartingPositionConfiguration
     *        Point at which you want the application to start processing records from the streaming source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputConfiguration withInputStartingPositionConfiguration(InputStartingPositionConfiguration inputStartingPositionConfiguration) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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

        if (obj instanceof InputConfiguration == false)
            return false;
        InputConfiguration other = (InputConfiguration) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getInputStartingPositionConfiguration() == null) ? 0 : getInputStartingPositionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public InputConfiguration clone() {
        try {
            return (InputConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalytics.model.transform.InputConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
