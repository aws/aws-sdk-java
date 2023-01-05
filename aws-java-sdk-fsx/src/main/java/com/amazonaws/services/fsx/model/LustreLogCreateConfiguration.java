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
 * The Lustre logging configuration used when creating or updating an Amazon FSx for Lustre file system. An Amazon File
 * Cache is created with Lustre logging enabled by default, with a setting of <code>WARN_ERROR</code> for the logging
 * events. which can't be changed.
 * </p>
 * <p>
 * Lustre logging writes the enabled logging events for your file system or cache to Amazon CloudWatch Logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/LustreLogCreateConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LustreLogCreateConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Sets which data repository events are logged by Amazon FSx.
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
     */
    private String level;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that specifies the destination of the logs.
     * </p>
     * <p>
     * The destination can be any Amazon CloudWatch Logs log group ARN, with the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The destination ARN that you provide must be in the same Amazon Web Services partition, Amazon Web Services
     * Region, and Amazon Web Services account as your Amazon FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the Amazon CloudWatch Logs log group must begin with the <code>/aws/fsx</code> prefix.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you do not provide a destination, Amazon FSx will create and use a log stream in the CloudWatch Logs
     * <code>/aws/fsx/lustre</code> log group (for Amazon FSx for Lustre) or <code>/aws/fsx/filecache</code> (for Amazon
     * File Cache).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Destination</code> is provided and the resource does not exist, the request will fail with a
     * <code>BadRequest</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Level</code> is set to <code>DISABLED</code>, you cannot specify a destination in
     * <code>Destination</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String destination;

    /**
     * <p>
     * Sets which data repository events are logged by Amazon FSx.
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
     * 
     * @param level
     *        Sets which data repository events are logged by Amazon FSx.</p>
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
     * @see LustreAccessAuditLogLevel
     */

    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * <p>
     * Sets which data repository events are logged by Amazon FSx.
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
     * 
     * @return Sets which data repository events are logged by Amazon FSx.</p>
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
     * @see LustreAccessAuditLogLevel
     */

    public String getLevel() {
        return this.level;
    }

    /**
     * <p>
     * Sets which data repository events are logged by Amazon FSx.
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
     * 
     * @param level
     *        Sets which data repository events are logged by Amazon FSx.</p>
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
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LustreAccessAuditLogLevel
     */

    public LustreLogCreateConfiguration withLevel(String level) {
        setLevel(level);
        return this;
    }

    /**
     * <p>
     * Sets which data repository events are logged by Amazon FSx.
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
     * 
     * @param level
     *        Sets which data repository events are logged by Amazon FSx.</p>
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
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LustreAccessAuditLogLevel
     */

    public LustreLogCreateConfiguration withLevel(LustreAccessAuditLogLevel level) {
        this.level = level.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that specifies the destination of the logs.
     * </p>
     * <p>
     * The destination can be any Amazon CloudWatch Logs log group ARN, with the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The destination ARN that you provide must be in the same Amazon Web Services partition, Amazon Web Services
     * Region, and Amazon Web Services account as your Amazon FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the Amazon CloudWatch Logs log group must begin with the <code>/aws/fsx</code> prefix.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you do not provide a destination, Amazon FSx will create and use a log stream in the CloudWatch Logs
     * <code>/aws/fsx/lustre</code> log group (for Amazon FSx for Lustre) or <code>/aws/fsx/filecache</code> (for Amazon
     * File Cache).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Destination</code> is provided and the resource does not exist, the request will fail with a
     * <code>BadRequest</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Level</code> is set to <code>DISABLED</code>, you cannot specify a destination in
     * <code>Destination</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param destination
     *        The Amazon Resource Name (ARN) that specifies the destination of the logs.</p>
     *        <p>
     *        The destination can be any Amazon CloudWatch Logs log group ARN, with the following requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The destination ARN that you provide must be in the same Amazon Web Services partition, Amazon Web
     *        Services Region, and Amazon Web Services account as your Amazon FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name of the Amazon CloudWatch Logs log group must begin with the <code>/aws/fsx</code> prefix.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you do not provide a destination, Amazon FSx will create and use a log stream in the CloudWatch Logs
     *        <code>/aws/fsx/lustre</code> log group (for Amazon FSx for Lustre) or <code>/aws/fsx/filecache</code> (for
     *        Amazon File Cache).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>Destination</code> is provided and the resource does not exist, the request will fail with a
     *        <code>BadRequest</code> error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>Level</code> is set to <code>DISABLED</code>, you cannot specify a destination in
     *        <code>Destination</code>.
     *        </p>
     *        </li>
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that specifies the destination of the logs.
     * </p>
     * <p>
     * The destination can be any Amazon CloudWatch Logs log group ARN, with the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The destination ARN that you provide must be in the same Amazon Web Services partition, Amazon Web Services
     * Region, and Amazon Web Services account as your Amazon FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the Amazon CloudWatch Logs log group must begin with the <code>/aws/fsx</code> prefix.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you do not provide a destination, Amazon FSx will create and use a log stream in the CloudWatch Logs
     * <code>/aws/fsx/lustre</code> log group (for Amazon FSx for Lustre) or <code>/aws/fsx/filecache</code> (for Amazon
     * File Cache).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Destination</code> is provided and the resource does not exist, the request will fail with a
     * <code>BadRequest</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Level</code> is set to <code>DISABLED</code>, you cannot specify a destination in
     * <code>Destination</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) that specifies the destination of the logs.</p>
     *         <p>
     *         The destination can be any Amazon CloudWatch Logs log group ARN, with the following requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The destination ARN that you provide must be in the same Amazon Web Services partition, Amazon Web
     *         Services Region, and Amazon Web Services account as your Amazon FSx file system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The name of the Amazon CloudWatch Logs log group must begin with the <code>/aws/fsx</code> prefix.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you do not provide a destination, Amazon FSx will create and use a log stream in the CloudWatch Logs
     *         <code>/aws/fsx/lustre</code> log group (for Amazon FSx for Lustre) or <code>/aws/fsx/filecache</code>
     *         (for Amazon File Cache).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>Destination</code> is provided and the resource does not exist, the request will fail with a
     *         <code>BadRequest</code> error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>Level</code> is set to <code>DISABLED</code>, you cannot specify a destination in
     *         <code>Destination</code>.
     *         </p>
     *         </li>
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that specifies the destination of the logs.
     * </p>
     * <p>
     * The destination can be any Amazon CloudWatch Logs log group ARN, with the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The destination ARN that you provide must be in the same Amazon Web Services partition, Amazon Web Services
     * Region, and Amazon Web Services account as your Amazon FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the Amazon CloudWatch Logs log group must begin with the <code>/aws/fsx</code> prefix.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you do not provide a destination, Amazon FSx will create and use a log stream in the CloudWatch Logs
     * <code>/aws/fsx/lustre</code> log group (for Amazon FSx for Lustre) or <code>/aws/fsx/filecache</code> (for Amazon
     * File Cache).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Destination</code> is provided and the resource does not exist, the request will fail with a
     * <code>BadRequest</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Level</code> is set to <code>DISABLED</code>, you cannot specify a destination in
     * <code>Destination</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param destination
     *        The Amazon Resource Name (ARN) that specifies the destination of the logs.</p>
     *        <p>
     *        The destination can be any Amazon CloudWatch Logs log group ARN, with the following requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The destination ARN that you provide must be in the same Amazon Web Services partition, Amazon Web
     *        Services Region, and Amazon Web Services account as your Amazon FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name of the Amazon CloudWatch Logs log group must begin with the <code>/aws/fsx</code> prefix.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you do not provide a destination, Amazon FSx will create and use a log stream in the CloudWatch Logs
     *        <code>/aws/fsx/lustre</code> log group (for Amazon FSx for Lustre) or <code>/aws/fsx/filecache</code> (for
     *        Amazon File Cache).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>Destination</code> is provided and the resource does not exist, the request will fail with a
     *        <code>BadRequest</code> error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>Level</code> is set to <code>DISABLED</code>, you cannot specify a destination in
     *        <code>Destination</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LustreLogCreateConfiguration withDestination(String destination) {
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

        if (obj instanceof LustreLogCreateConfiguration == false)
            return false;
        LustreLogCreateConfiguration other = (LustreLogCreateConfiguration) obj;
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
    public LustreLogCreateConfiguration clone() {
        try {
            return (LustreLogCreateConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.LustreLogCreateConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
