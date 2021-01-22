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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the Amazon CloudWatch Logs destination log group for conversation text logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/TextLogDestination" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TextLogDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the Amazon CloudWatch Logs log group where text and metadata logs are delivered.
     * </p>
     */
    private CloudWatchLogGroupLogDestination cloudWatch;

    /**
     * <p>
     * Defines the Amazon CloudWatch Logs log group where text and metadata logs are delivered.
     * </p>
     * 
     * @param cloudWatch
     *        Defines the Amazon CloudWatch Logs log group where text and metadata logs are delivered.
     */

    public void setCloudWatch(CloudWatchLogGroupLogDestination cloudWatch) {
        this.cloudWatch = cloudWatch;
    }

    /**
     * <p>
     * Defines the Amazon CloudWatch Logs log group where text and metadata logs are delivered.
     * </p>
     * 
     * @return Defines the Amazon CloudWatch Logs log group where text and metadata logs are delivered.
     */

    public CloudWatchLogGroupLogDestination getCloudWatch() {
        return this.cloudWatch;
    }

    /**
     * <p>
     * Defines the Amazon CloudWatch Logs log group where text and metadata logs are delivered.
     * </p>
     * 
     * @param cloudWatch
     *        Defines the Amazon CloudWatch Logs log group where text and metadata logs are delivered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextLogDestination withCloudWatch(CloudWatchLogGroupLogDestination cloudWatch) {
        setCloudWatch(cloudWatch);
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
        if (getCloudWatch() != null)
            sb.append("CloudWatch: ").append(getCloudWatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextLogDestination == false)
            return false;
        TextLogDestination other = (TextLogDestination) obj;
        if (other.getCloudWatch() == null ^ this.getCloudWatch() == null)
            return false;
        if (other.getCloudWatch() != null && other.getCloudWatch().equals(this.getCloudWatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatch() == null) ? 0 : getCloudWatch().hashCode());
        return hashCode;
    }

    @Override
    public TextLogDestination clone() {
        try {
            return (TextLogDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.TextLogDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
