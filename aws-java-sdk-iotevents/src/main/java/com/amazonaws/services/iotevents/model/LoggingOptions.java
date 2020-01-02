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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The values of the AWS IoT Events logging options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/LoggingOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggingOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Events to perform logging.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The logging level.
     * </p>
     */
    private String level;
    /**
     * <p>
     * If TRUE, logging is enabled for AWS IoT Events.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Information that identifies those detector models and their detectors (instances) for which the logging level is
     * given.
     * </p>
     */
    private java.util.List<DetectorDebugOption> detectorDebugOptions;

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Events to perform logging.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants permission to AWS IoT Events to perform logging.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Events to perform logging.
     * </p>
     * 
     * @return The ARN of the role that grants permission to AWS IoT Events to perform logging.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Events to perform logging.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants permission to AWS IoT Events to perform logging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingOptions withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The logging level.
     * </p>
     * 
     * @param level
     *        The logging level.
     * @see LoggingLevel
     */

    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * <p>
     * The logging level.
     * </p>
     * 
     * @return The logging level.
     * @see LoggingLevel
     */

    public String getLevel() {
        return this.level;
    }

    /**
     * <p>
     * The logging level.
     * </p>
     * 
     * @param level
     *        The logging level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoggingLevel
     */

    public LoggingOptions withLevel(String level) {
        setLevel(level);
        return this;
    }

    /**
     * <p>
     * The logging level.
     * </p>
     * 
     * @param level
     *        The logging level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoggingLevel
     */

    public LoggingOptions withLevel(LoggingLevel level) {
        this.level = level.toString();
        return this;
    }

    /**
     * <p>
     * If TRUE, logging is enabled for AWS IoT Events.
     * </p>
     * 
     * @param enabled
     *        If TRUE, logging is enabled for AWS IoT Events.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * If TRUE, logging is enabled for AWS IoT Events.
     * </p>
     * 
     * @return If TRUE, logging is enabled for AWS IoT Events.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * If TRUE, logging is enabled for AWS IoT Events.
     * </p>
     * 
     * @param enabled
     *        If TRUE, logging is enabled for AWS IoT Events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingOptions withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * If TRUE, logging is enabled for AWS IoT Events.
     * </p>
     * 
     * @return If TRUE, logging is enabled for AWS IoT Events.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Information that identifies those detector models and their detectors (instances) for which the logging level is
     * given.
     * </p>
     * 
     * @return Information that identifies those detector models and their detectors (instances) for which the logging
     *         level is given.
     */

    public java.util.List<DetectorDebugOption> getDetectorDebugOptions() {
        return detectorDebugOptions;
    }

    /**
     * <p>
     * Information that identifies those detector models and their detectors (instances) for which the logging level is
     * given.
     * </p>
     * 
     * @param detectorDebugOptions
     *        Information that identifies those detector models and their detectors (instances) for which the logging
     *        level is given.
     */

    public void setDetectorDebugOptions(java.util.Collection<DetectorDebugOption> detectorDebugOptions) {
        if (detectorDebugOptions == null) {
            this.detectorDebugOptions = null;
            return;
        }

        this.detectorDebugOptions = new java.util.ArrayList<DetectorDebugOption>(detectorDebugOptions);
    }

    /**
     * <p>
     * Information that identifies those detector models and their detectors (instances) for which the logging level is
     * given.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetectorDebugOptions(java.util.Collection)} or {@link #withDetectorDebugOptions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param detectorDebugOptions
     *        Information that identifies those detector models and their detectors (instances) for which the logging
     *        level is given.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingOptions withDetectorDebugOptions(DetectorDebugOption... detectorDebugOptions) {
        if (this.detectorDebugOptions == null) {
            setDetectorDebugOptions(new java.util.ArrayList<DetectorDebugOption>(detectorDebugOptions.length));
        }
        for (DetectorDebugOption ele : detectorDebugOptions) {
            this.detectorDebugOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information that identifies those detector models and their detectors (instances) for which the logging level is
     * given.
     * </p>
     * 
     * @param detectorDebugOptions
     *        Information that identifies those detector models and their detectors (instances) for which the logging
     *        level is given.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingOptions withDetectorDebugOptions(java.util.Collection<DetectorDebugOption> detectorDebugOptions) {
        setDetectorDebugOptions(detectorDebugOptions);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getLevel() != null)
            sb.append("Level: ").append(getLevel()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getDetectorDebugOptions() != null)
            sb.append("DetectorDebugOptions: ").append(getDetectorDebugOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingOptions == false)
            return false;
        LoggingOptions other = (LoggingOptions) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getLevel() == null ^ this.getLevel() == null)
            return false;
        if (other.getLevel() != null && other.getLevel().equals(this.getLevel()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getDetectorDebugOptions() == null ^ this.getDetectorDebugOptions() == null)
            return false;
        if (other.getDetectorDebugOptions() != null && other.getDetectorDebugOptions().equals(this.getDetectorDebugOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getLevel() == null) ? 0 : getLevel().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getDetectorDebugOptions() == null) ? 0 : getDetectorDebugOptions().hashCode());
        return hashCode;
    }

    @Override
    public LoggingOptions clone() {
        try {
            return (LoggingOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.LoggingOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
