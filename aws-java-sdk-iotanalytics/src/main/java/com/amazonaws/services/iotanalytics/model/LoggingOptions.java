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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about logging options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/LoggingOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggingOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Analytics to perform logging.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The logging level. Currently, only "ERROR" is supported.
     * </p>
     */
    private String level;
    /**
     * <p>
     * If true, logging is enabled for AWS IoT Analytics.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Analytics to perform logging.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants permission to AWS IoT Analytics to perform logging.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Analytics to perform logging.
     * </p>
     * 
     * @return The ARN of the role that grants permission to AWS IoT Analytics to perform logging.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Analytics to perform logging.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants permission to AWS IoT Analytics to perform logging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingOptions withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The logging level. Currently, only "ERROR" is supported.
     * </p>
     * 
     * @param level
     *        The logging level. Currently, only "ERROR" is supported.
     * @see LoggingLevel
     */

    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * <p>
     * The logging level. Currently, only "ERROR" is supported.
     * </p>
     * 
     * @return The logging level. Currently, only "ERROR" is supported.
     * @see LoggingLevel
     */

    public String getLevel() {
        return this.level;
    }

    /**
     * <p>
     * The logging level. Currently, only "ERROR" is supported.
     * </p>
     * 
     * @param level
     *        The logging level. Currently, only "ERROR" is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoggingLevel
     */

    public LoggingOptions withLevel(String level) {
        setLevel(level);
        return this;
    }

    /**
     * <p>
     * The logging level. Currently, only "ERROR" is supported.
     * </p>
     * 
     * @param level
     *        The logging level. Currently, only "ERROR" is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoggingLevel
     */

    public LoggingOptions withLevel(LoggingLevel level) {
        this.level = level.toString();
        return this;
    }

    /**
     * <p>
     * If true, logging is enabled for AWS IoT Analytics.
     * </p>
     * 
     * @param enabled
     *        If true, logging is enabled for AWS IoT Analytics.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * If true, logging is enabled for AWS IoT Analytics.
     * </p>
     * 
     * @return If true, logging is enabled for AWS IoT Analytics.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * If true, logging is enabled for AWS IoT Analytics.
     * </p>
     * 
     * @param enabled
     *        If true, logging is enabled for AWS IoT Analytics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingOptions withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * If true, logging is enabled for AWS IoT Analytics.
     * </p>
     * 
     * @return If true, logging is enabled for AWS IoT Analytics.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
            sb.append("Enabled: ").append(getEnabled());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getLevel() == null) ? 0 : getLevel().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
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
        com.amazonaws.services.iotanalytics.model.transform.LoggingOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
