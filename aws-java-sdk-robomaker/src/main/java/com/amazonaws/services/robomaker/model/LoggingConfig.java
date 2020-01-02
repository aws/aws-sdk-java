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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The logging configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/LoggingConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggingConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A boolean indicating whether to record all ROS topics.
     * </p>
     */
    private Boolean recordAllRosTopics;

    /**
     * <p>
     * A boolean indicating whether to record all ROS topics.
     * </p>
     * 
     * @param recordAllRosTopics
     *        A boolean indicating whether to record all ROS topics.
     */

    public void setRecordAllRosTopics(Boolean recordAllRosTopics) {
        this.recordAllRosTopics = recordAllRosTopics;
    }

    /**
     * <p>
     * A boolean indicating whether to record all ROS topics.
     * </p>
     * 
     * @return A boolean indicating whether to record all ROS topics.
     */

    public Boolean getRecordAllRosTopics() {
        return this.recordAllRosTopics;
    }

    /**
     * <p>
     * A boolean indicating whether to record all ROS topics.
     * </p>
     * 
     * @param recordAllRosTopics
     *        A boolean indicating whether to record all ROS topics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfig withRecordAllRosTopics(Boolean recordAllRosTopics) {
        setRecordAllRosTopics(recordAllRosTopics);
        return this;
    }

    /**
     * <p>
     * A boolean indicating whether to record all ROS topics.
     * </p>
     * 
     * @return A boolean indicating whether to record all ROS topics.
     */

    public Boolean isRecordAllRosTopics() {
        return this.recordAllRosTopics;
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
        if (getRecordAllRosTopics() != null)
            sb.append("RecordAllRosTopics: ").append(getRecordAllRosTopics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingConfig == false)
            return false;
        LoggingConfig other = (LoggingConfig) obj;
        if (other.getRecordAllRosTopics() == null ^ this.getRecordAllRosTopics() == null)
            return false;
        if (other.getRecordAllRosTopics() != null && other.getRecordAllRosTopics().equals(this.getRecordAllRosTopics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordAllRosTopics() == null) ? 0 : getRecordAllRosTopics().hashCode());
        return hashCode;
    }

    @Override
    public LoggingConfig clone() {
        try {
            return (LoggingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.LoggingConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
