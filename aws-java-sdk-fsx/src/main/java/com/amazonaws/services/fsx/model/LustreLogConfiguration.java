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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for Lustre logging used to write the enabled logging events for your Amazon FSx for Lustre file
 * system or Amazon File Cache resource to Amazon CloudWatch Logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/LustreLogConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LustreLogConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data repository events that are logged by Amazon FSx.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WARN_ONLY</code> - only warning events are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR_ONLY</code> - only error events are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARN_ERROR</code> - both warning events and error events are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - logging of data repository events is turned off.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that Amazon File Cache uses a default setting of <code>WARN_ERROR</code>, which can't be changed.
     * </p>
     */
    private String level;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that specifies the destination of the logs. The destination can be any Amazon
     * CloudWatch Logs log group ARN. The destination ARN must be in the same Amazon Web Services partition, Amazon Web
     * Services Region, and Amazon Web Services account as your Amazon FSx file system.
     * </p>
     */
    private String destination;

    /**
     * <p>
     * The data repository events that are logged by Amazon FSx.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WARN_ONLY</code> - only warning events are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR_ONLY</code> - only error events are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARN_ERROR</code> - both warning events and error events are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - logging of data repository events is turned off.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that Amazon File Cache uses a default setting of <code>WARN_ERROR</code>, which can't be changed.
     * </p>
     * 
     * @param level
     *        The data repository events that are logged by Amazon FSx.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>WARN_ONLY</code> - only warning events are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERROR_ONLY</code> - only error events are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WARN_ERROR</code> - both warning events and error events are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - logging of data repository events is turned off.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Note that Amazon File Cache uses a default setting of <code>WARN_ERROR</code>, which can't be changed.
     * @see LustreAccessAuditLogLevel
     */

    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * <p>
     * The data repository events that are logged by Amazon FSx.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WARN_ONLY</code> - only warning events are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR_ONLY</code> - only error events are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARN_ERROR</code> - both warning events and error events are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - logging of data repository events is turned off.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that Amazon File Cache uses a default setting of <code>WARN_ERROR</code>, which can't be changed.
     * </p>
     * 
     * @return The data repository events that are logged by Amazon FSx.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>WARN_ONLY</code> - only warning events are logged.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ERROR_ONLY</code> - only error events are logged.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WARN_ERROR</code> - both warning events and error events are logged.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> - logging of data repository events is turned off.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Note that Amazon File Cache uses a default setting of <code>WARN_ERROR</code>, which can't be changed.
     * @see LustreAccessAuditLogLevel
     */

    public String getLevel() {
        return this.level;
    }

    /**
     * <p>
     * The data repository events that are logged by Amazon FSx.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WARN_ONLY</code> - only warning events are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR_ONLY</code> - only error events are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARN_ERROR</code> - both warning events and error events are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - logging of data repository events is turned off.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that Amazon File Cache uses a default setting of <code>WARN_ERROR</code>, which can't be changed.
     * </p>
     * 
     * @param level
     *        The data repository events that are logged by Amazon FSx.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>WARN_ONLY</code> - only warning events are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERROR_ONLY</code> - only error events are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WARN_ERROR</code> - both warning events and error events are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - logging of data repository events is turned off.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Note that Amazon File Cache uses a default setting of <code>WARN_ERROR</code>, which can't be changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LustreAccessAuditLogLevel
     */

    public LustreLogConfiguration withLevel(String level) {
        setLevel(level);
        return this;
    }

    /**
     * <p>
     * The data repository events that are logged by Amazon FSx.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WARN_ONLY</code> - only warning events are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR_ONLY</code> - only error events are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARN_ERROR</code> - both warning events and error events are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - logging of data repository events is turned off.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that Amazon File Cache uses a default setting of <code>WARN_ERROR</code>, which can't be changed.
     * </p>
     * 
     * @param level
     *        The data repository events that are logged by Amazon FSx.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>WARN_ONLY</code> - only warning events are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERROR_ONLY</code> - only error events are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WARN_ERROR</code> - both warning events and error events are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - logging of data repository events is turned off.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Note that Amazon File Cache uses a default setting of <code>WARN_ERROR</code>, which can't be changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LustreAccessAuditLogLevel
     */

    public LustreLogConfiguration withLevel(LustreAccessAuditLogLevel level) {
        this.level = level.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that specifies the destination of the logs. The destination can be any Amazon
     * CloudWatch Logs log group ARN. The destination ARN must be in the same Amazon Web Services partition, Amazon Web
     * Services Region, and Amazon Web Services account as your Amazon FSx file system.
     * </p>
     * 
     * @param destination
     *        The Amazon Resource Name (ARN) that specifies the destination of the logs. The destination can be any
     *        Amazon CloudWatch Logs log group ARN. The destination ARN must be in the same Amazon Web Services
     *        partition, Amazon Web Services Region, and Amazon Web Services account as your Amazon FSx file system.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that specifies the destination of the logs. The destination can be any Amazon
     * CloudWatch Logs log group ARN. The destination ARN must be in the same Amazon Web Services partition, Amazon Web
     * Services Region, and Amazon Web Services account as your Amazon FSx file system.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that specifies the destination of the logs. The destination can be any
     *         Amazon CloudWatch Logs log group ARN. The destination ARN must be in the same Amazon Web Services
     *         partition, Amazon Web Services Region, and Amazon Web Services account as your Amazon FSx file system.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that specifies the destination of the logs. The destination can be any Amazon
     * CloudWatch Logs log group ARN. The destination ARN must be in the same Amazon Web Services partition, Amazon Web
     * Services Region, and Amazon Web Services account as your Amazon FSx file system.
     * </p>
     * 
     * @param destination
     *        The Amazon Resource Name (ARN) that specifies the destination of the logs. The destination can be any
     *        Amazon CloudWatch Logs log group ARN. The destination ARN must be in the same Amazon Web Services
     *        partition, Amazon Web Services Region, and Amazon Web Services account as your Amazon FSx file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LustreLogConfiguration withDestination(String destination) {
        setDestination(destination);
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
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LustreLogConfiguration == false)
            return false;
        LustreLogConfiguration other = (LustreLogConfiguration) obj;
        if (other.getLevel() == null ^ this.getLevel() == null)
            return false;
        if (other.getLevel() != null && other.getLevel().equals(this.getLevel()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLevel() == null) ? 0 : getLevel().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        return hashCode;
    }

    @Override
    public LustreLogConfiguration clone() {
        try {
            return (LustreLogConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.LustreLogConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
