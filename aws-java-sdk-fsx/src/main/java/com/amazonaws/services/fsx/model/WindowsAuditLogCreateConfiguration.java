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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Windows file access auditing configuration used when creating or updating an Amazon FSx for Windows File Server
 * file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/WindowsAuditLogCreateConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WindowsAuditLogCreateConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Sets which attempt type is logged by Amazon FSx for file and folder accesses.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCESS_ONLY</code> - only successful attempts to access files or folders are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILURE_ONLY</code> - only failed attempts to access files or folders are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS_AND_FAILURE</code> - both successful attempts and failed attempts to access files or folders are
     * logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - access auditing of files and folders is turned off.
     * </p>
     * </li>
     * </ul>
     */
    private String fileAccessAuditLogLevel;
    /**
     * <p>
     * Sets which attempt type is logged by Amazon FSx for file share accesses.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCESS_ONLY</code> - only successful attempts to access file shares are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILURE_ONLY</code> - only failed attempts to access file shares are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS_AND_FAILURE</code> - both successful attempts and failed attempts to access file shares are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - access auditing of file shares is turned off.
     * </p>
     * </li>
     * </ul>
     */
    private String fileShareAccessAuditLogLevel;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that specifies the destination of the audit logs.
     * </p>
     * <p>
     * The destination can be any Amazon CloudWatch Logs log group ARN or Amazon Kinesis Data Firehose delivery stream
     * ARN, with the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The destination ARN that you provide (either CloudWatch Logs log group or Kinesis Data Firehose delivery stream)
     * must be in the same AWS partition, AWS region, and AWS account as your Amazon FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the Amazon CloudWatch Logs log group must begin with the <code>/aws/fsx</code> prefix. The name of
     * the Amazon Kinesis Data Firehouse delivery stream must begin with the <code>aws-fsx</code> prefix.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you do not provide a destination in <code>AuditLogDestination</code>, Amazon FSx will create and use a log
     * stream in the CloudWatch Logs <code>/aws/fsx/windows</code> log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>AuditLogDestination</code> is provided and the resource does not exist, the request will fail with a
     * <code>BadRequest</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>FileAccessAuditLogLevel</code> and <code>FileShareAccessAuditLogLevel</code> are both set to
     * <code>DISABLED</code>, you cannot specify a destination in <code>AuditLogDestination</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String auditLogDestination;

    /**
     * <p>
     * Sets which attempt type is logged by Amazon FSx for file and folder accesses.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCESS_ONLY</code> - only successful attempts to access files or folders are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILURE_ONLY</code> - only failed attempts to access files or folders are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS_AND_FAILURE</code> - both successful attempts and failed attempts to access files or folders are
     * logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - access auditing of files and folders is turned off.
     * </p>
     * </li>
     * </ul>
     * 
     * @param fileAccessAuditLogLevel
     *        Sets which attempt type is logged by Amazon FSx for file and folder accesses.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCESS_ONLY</code> - only successful attempts to access files or folders are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILURE_ONLY</code> - only failed attempts to access files or folders are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS_AND_FAILURE</code> - both successful attempts and failed attempts to access files or folders
     *        are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - access auditing of files and folders is turned off.
     *        </p>
     *        </li>
     * @see WindowsAccessAuditLogLevel
     */

    public void setFileAccessAuditLogLevel(String fileAccessAuditLogLevel) {
        this.fileAccessAuditLogLevel = fileAccessAuditLogLevel;
    }

    /**
     * <p>
     * Sets which attempt type is logged by Amazon FSx for file and folder accesses.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCESS_ONLY</code> - only successful attempts to access files or folders are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILURE_ONLY</code> - only failed attempts to access files or folders are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS_AND_FAILURE</code> - both successful attempts and failed attempts to access files or folders are
     * logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - access auditing of files and folders is turned off.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Sets which attempt type is logged by Amazon FSx for file and folder accesses.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SUCCESS_ONLY</code> - only successful attempts to access files or folders are logged.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILURE_ONLY</code> - only failed attempts to access files or folders are logged.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCESS_AND_FAILURE</code> - both successful attempts and failed attempts to access files or
     *         folders are logged.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> - access auditing of files and folders is turned off.
     *         </p>
     *         </li>
     * @see WindowsAccessAuditLogLevel
     */

    public String getFileAccessAuditLogLevel() {
        return this.fileAccessAuditLogLevel;
    }

    /**
     * <p>
     * Sets which attempt type is logged by Amazon FSx for file and folder accesses.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCESS_ONLY</code> - only successful attempts to access files or folders are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILURE_ONLY</code> - only failed attempts to access files or folders are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS_AND_FAILURE</code> - both successful attempts and failed attempts to access files or folders are
     * logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - access auditing of files and folders is turned off.
     * </p>
     * </li>
     * </ul>
     * 
     * @param fileAccessAuditLogLevel
     *        Sets which attempt type is logged by Amazon FSx for file and folder accesses.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCESS_ONLY</code> - only successful attempts to access files or folders are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILURE_ONLY</code> - only failed attempts to access files or folders are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS_AND_FAILURE</code> - both successful attempts and failed attempts to access files or folders
     *        are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - access auditing of files and folders is turned off.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WindowsAccessAuditLogLevel
     */

    public WindowsAuditLogCreateConfiguration withFileAccessAuditLogLevel(String fileAccessAuditLogLevel) {
        setFileAccessAuditLogLevel(fileAccessAuditLogLevel);
        return this;
    }

    /**
     * <p>
     * Sets which attempt type is logged by Amazon FSx for file and folder accesses.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCESS_ONLY</code> - only successful attempts to access files or folders are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILURE_ONLY</code> - only failed attempts to access files or folders are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS_AND_FAILURE</code> - both successful attempts and failed attempts to access files or folders are
     * logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - access auditing of files and folders is turned off.
     * </p>
     * </li>
     * </ul>
     * 
     * @param fileAccessAuditLogLevel
     *        Sets which attempt type is logged by Amazon FSx for file and folder accesses.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCESS_ONLY</code> - only successful attempts to access files or folders are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILURE_ONLY</code> - only failed attempts to access files or folders are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS_AND_FAILURE</code> - both successful attempts and failed attempts to access files or folders
     *        are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - access auditing of files and folders is turned off.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WindowsAccessAuditLogLevel
     */

    public WindowsAuditLogCreateConfiguration withFileAccessAuditLogLevel(WindowsAccessAuditLogLevel fileAccessAuditLogLevel) {
        this.fileAccessAuditLogLevel = fileAccessAuditLogLevel.toString();
        return this;
    }

    /**
     * <p>
     * Sets which attempt type is logged by Amazon FSx for file share accesses.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCESS_ONLY</code> - only successful attempts to access file shares are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILURE_ONLY</code> - only failed attempts to access file shares are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS_AND_FAILURE</code> - both successful attempts and failed attempts to access file shares are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - access auditing of file shares is turned off.
     * </p>
     * </li>
     * </ul>
     * 
     * @param fileShareAccessAuditLogLevel
     *        Sets which attempt type is logged by Amazon FSx for file share accesses.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCESS_ONLY</code> - only successful attempts to access file shares are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILURE_ONLY</code> - only failed attempts to access file shares are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS_AND_FAILURE</code> - both successful attempts and failed attempts to access file shares are
     *        logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - access auditing of file shares is turned off.
     *        </p>
     *        </li>
     * @see WindowsAccessAuditLogLevel
     */

    public void setFileShareAccessAuditLogLevel(String fileShareAccessAuditLogLevel) {
        this.fileShareAccessAuditLogLevel = fileShareAccessAuditLogLevel;
    }

    /**
     * <p>
     * Sets which attempt type is logged by Amazon FSx for file share accesses.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCESS_ONLY</code> - only successful attempts to access file shares are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILURE_ONLY</code> - only failed attempts to access file shares are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS_AND_FAILURE</code> - both successful attempts and failed attempts to access file shares are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - access auditing of file shares is turned off.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Sets which attempt type is logged by Amazon FSx for file share accesses.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SUCCESS_ONLY</code> - only successful attempts to access file shares are logged.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILURE_ONLY</code> - only failed attempts to access file shares are logged.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCESS_AND_FAILURE</code> - both successful attempts and failed attempts to access file shares are
     *         logged.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> - access auditing of file shares is turned off.
     *         </p>
     *         </li>
     * @see WindowsAccessAuditLogLevel
     */

    public String getFileShareAccessAuditLogLevel() {
        return this.fileShareAccessAuditLogLevel;
    }

    /**
     * <p>
     * Sets which attempt type is logged by Amazon FSx for file share accesses.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCESS_ONLY</code> - only successful attempts to access file shares are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILURE_ONLY</code> - only failed attempts to access file shares are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS_AND_FAILURE</code> - both successful attempts and failed attempts to access file shares are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - access auditing of file shares is turned off.
     * </p>
     * </li>
     * </ul>
     * 
     * @param fileShareAccessAuditLogLevel
     *        Sets which attempt type is logged by Amazon FSx for file share accesses.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCESS_ONLY</code> - only successful attempts to access file shares are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILURE_ONLY</code> - only failed attempts to access file shares are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS_AND_FAILURE</code> - both successful attempts and failed attempts to access file shares are
     *        logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - access auditing of file shares is turned off.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WindowsAccessAuditLogLevel
     */

    public WindowsAuditLogCreateConfiguration withFileShareAccessAuditLogLevel(String fileShareAccessAuditLogLevel) {
        setFileShareAccessAuditLogLevel(fileShareAccessAuditLogLevel);
        return this;
    }

    /**
     * <p>
     * Sets which attempt type is logged by Amazon FSx for file share accesses.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCESS_ONLY</code> - only successful attempts to access file shares are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILURE_ONLY</code> - only failed attempts to access file shares are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS_AND_FAILURE</code> - both successful attempts and failed attempts to access file shares are logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - access auditing of file shares is turned off.
     * </p>
     * </li>
     * </ul>
     * 
     * @param fileShareAccessAuditLogLevel
     *        Sets which attempt type is logged by Amazon FSx for file share accesses.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCESS_ONLY</code> - only successful attempts to access file shares are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILURE_ONLY</code> - only failed attempts to access file shares are logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS_AND_FAILURE</code> - both successful attempts and failed attempts to access file shares are
     *        logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - access auditing of file shares is turned off.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WindowsAccessAuditLogLevel
     */

    public WindowsAuditLogCreateConfiguration withFileShareAccessAuditLogLevel(WindowsAccessAuditLogLevel fileShareAccessAuditLogLevel) {
        this.fileShareAccessAuditLogLevel = fileShareAccessAuditLogLevel.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that specifies the destination of the audit logs.
     * </p>
     * <p>
     * The destination can be any Amazon CloudWatch Logs log group ARN or Amazon Kinesis Data Firehose delivery stream
     * ARN, with the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The destination ARN that you provide (either CloudWatch Logs log group or Kinesis Data Firehose delivery stream)
     * must be in the same AWS partition, AWS region, and AWS account as your Amazon FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the Amazon CloudWatch Logs log group must begin with the <code>/aws/fsx</code> prefix. The name of
     * the Amazon Kinesis Data Firehouse delivery stream must begin with the <code>aws-fsx</code> prefix.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you do not provide a destination in <code>AuditLogDestination</code>, Amazon FSx will create and use a log
     * stream in the CloudWatch Logs <code>/aws/fsx/windows</code> log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>AuditLogDestination</code> is provided and the resource does not exist, the request will fail with a
     * <code>BadRequest</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>FileAccessAuditLogLevel</code> and <code>FileShareAccessAuditLogLevel</code> are both set to
     * <code>DISABLED</code>, you cannot specify a destination in <code>AuditLogDestination</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param auditLogDestination
     *        The Amazon Resource Name (ARN) that specifies the destination of the audit logs.</p>
     *        <p>
     *        The destination can be any Amazon CloudWatch Logs log group ARN or Amazon Kinesis Data Firehose delivery
     *        stream ARN, with the following requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The destination ARN that you provide (either CloudWatch Logs log group or Kinesis Data Firehose delivery
     *        stream) must be in the same AWS partition, AWS region, and AWS account as your Amazon FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name of the Amazon CloudWatch Logs log group must begin with the <code>/aws/fsx</code> prefix. The
     *        name of the Amazon Kinesis Data Firehouse delivery stream must begin with the <code>aws-fsx</code> prefix.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you do not provide a destination in <code>AuditLogDestination</code>, Amazon FSx will create and use a
     *        log stream in the CloudWatch Logs <code>/aws/fsx/windows</code> log group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>AuditLogDestination</code> is provided and the resource does not exist, the request will fail
     *        with a <code>BadRequest</code> error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>FileAccessAuditLogLevel</code> and <code>FileShareAccessAuditLogLevel</code> are both set to
     *        <code>DISABLED</code>, you cannot specify a destination in <code>AuditLogDestination</code>.
     *        </p>
     *        </li>
     */

    public void setAuditLogDestination(String auditLogDestination) {
        this.auditLogDestination = auditLogDestination;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that specifies the destination of the audit logs.
     * </p>
     * <p>
     * The destination can be any Amazon CloudWatch Logs log group ARN or Amazon Kinesis Data Firehose delivery stream
     * ARN, with the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The destination ARN that you provide (either CloudWatch Logs log group or Kinesis Data Firehose delivery stream)
     * must be in the same AWS partition, AWS region, and AWS account as your Amazon FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the Amazon CloudWatch Logs log group must begin with the <code>/aws/fsx</code> prefix. The name of
     * the Amazon Kinesis Data Firehouse delivery stream must begin with the <code>aws-fsx</code> prefix.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you do not provide a destination in <code>AuditLogDestination</code>, Amazon FSx will create and use a log
     * stream in the CloudWatch Logs <code>/aws/fsx/windows</code> log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>AuditLogDestination</code> is provided and the resource does not exist, the request will fail with a
     * <code>BadRequest</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>FileAccessAuditLogLevel</code> and <code>FileShareAccessAuditLogLevel</code> are both set to
     * <code>DISABLED</code>, you cannot specify a destination in <code>AuditLogDestination</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) that specifies the destination of the audit logs.</p>
     *         <p>
     *         The destination can be any Amazon CloudWatch Logs log group ARN or Amazon Kinesis Data Firehose delivery
     *         stream ARN, with the following requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The destination ARN that you provide (either CloudWatch Logs log group or Kinesis Data Firehose delivery
     *         stream) must be in the same AWS partition, AWS region, and AWS account as your Amazon FSx file system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The name of the Amazon CloudWatch Logs log group must begin with the <code>/aws/fsx</code> prefix. The
     *         name of the Amazon Kinesis Data Firehouse delivery stream must begin with the <code>aws-fsx</code>
     *         prefix.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you do not provide a destination in <code>AuditLogDestination</code>, Amazon FSx will create and use a
     *         log stream in the CloudWatch Logs <code>/aws/fsx/windows</code> log group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>AuditLogDestination</code> is provided and the resource does not exist, the request will fail
     *         with a <code>BadRequest</code> error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>FileAccessAuditLogLevel</code> and <code>FileShareAccessAuditLogLevel</code> are both set to
     *         <code>DISABLED</code>, you cannot specify a destination in <code>AuditLogDestination</code>.
     *         </p>
     *         </li>
     */

    public String getAuditLogDestination() {
        return this.auditLogDestination;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that specifies the destination of the audit logs.
     * </p>
     * <p>
     * The destination can be any Amazon CloudWatch Logs log group ARN or Amazon Kinesis Data Firehose delivery stream
     * ARN, with the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The destination ARN that you provide (either CloudWatch Logs log group or Kinesis Data Firehose delivery stream)
     * must be in the same AWS partition, AWS region, and AWS account as your Amazon FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the Amazon CloudWatch Logs log group must begin with the <code>/aws/fsx</code> prefix. The name of
     * the Amazon Kinesis Data Firehouse delivery stream must begin with the <code>aws-fsx</code> prefix.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you do not provide a destination in <code>AuditLogDestination</code>, Amazon FSx will create and use a log
     * stream in the CloudWatch Logs <code>/aws/fsx/windows</code> log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>AuditLogDestination</code> is provided and the resource does not exist, the request will fail with a
     * <code>BadRequest</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>FileAccessAuditLogLevel</code> and <code>FileShareAccessAuditLogLevel</code> are both set to
     * <code>DISABLED</code>, you cannot specify a destination in <code>AuditLogDestination</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param auditLogDestination
     *        The Amazon Resource Name (ARN) that specifies the destination of the audit logs.</p>
     *        <p>
     *        The destination can be any Amazon CloudWatch Logs log group ARN or Amazon Kinesis Data Firehose delivery
     *        stream ARN, with the following requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The destination ARN that you provide (either CloudWatch Logs log group or Kinesis Data Firehose delivery
     *        stream) must be in the same AWS partition, AWS region, and AWS account as your Amazon FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name of the Amazon CloudWatch Logs log group must begin with the <code>/aws/fsx</code> prefix. The
     *        name of the Amazon Kinesis Data Firehouse delivery stream must begin with the <code>aws-fsx</code> prefix.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you do not provide a destination in <code>AuditLogDestination</code>, Amazon FSx will create and use a
     *        log stream in the CloudWatch Logs <code>/aws/fsx/windows</code> log group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>AuditLogDestination</code> is provided and the resource does not exist, the request will fail
     *        with a <code>BadRequest</code> error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>FileAccessAuditLogLevel</code> and <code>FileShareAccessAuditLogLevel</code> are both set to
     *        <code>DISABLED</code>, you cannot specify a destination in <code>AuditLogDestination</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WindowsAuditLogCreateConfiguration withAuditLogDestination(String auditLogDestination) {
        setAuditLogDestination(auditLogDestination);
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
        if (getFileAccessAuditLogLevel() != null)
            sb.append("FileAccessAuditLogLevel: ").append(getFileAccessAuditLogLevel()).append(",");
        if (getFileShareAccessAuditLogLevel() != null)
            sb.append("FileShareAccessAuditLogLevel: ").append(getFileShareAccessAuditLogLevel()).append(",");
        if (getAuditLogDestination() != null)
            sb.append("AuditLogDestination: ").append(getAuditLogDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WindowsAuditLogCreateConfiguration == false)
            return false;
        WindowsAuditLogCreateConfiguration other = (WindowsAuditLogCreateConfiguration) obj;
        if (other.getFileAccessAuditLogLevel() == null ^ this.getFileAccessAuditLogLevel() == null)
            return false;
        if (other.getFileAccessAuditLogLevel() != null && other.getFileAccessAuditLogLevel().equals(this.getFileAccessAuditLogLevel()) == false)
            return false;
        if (other.getFileShareAccessAuditLogLevel() == null ^ this.getFileShareAccessAuditLogLevel() == null)
            return false;
        if (other.getFileShareAccessAuditLogLevel() != null && other.getFileShareAccessAuditLogLevel().equals(this.getFileShareAccessAuditLogLevel()) == false)
            return false;
        if (other.getAuditLogDestination() == null ^ this.getAuditLogDestination() == null)
            return false;
        if (other.getAuditLogDestination() != null && other.getAuditLogDestination().equals(this.getAuditLogDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileAccessAuditLogLevel() == null) ? 0 : getFileAccessAuditLogLevel().hashCode());
        hashCode = prime * hashCode + ((getFileShareAccessAuditLogLevel() == null) ? 0 : getFileShareAccessAuditLogLevel().hashCode());
        hashCode = prime * hashCode + ((getAuditLogDestination() == null) ? 0 : getAuditLogDestination().hashCode());
        return hashCode;
    }

    @Override
    public WindowsAuditLogCreateConfiguration clone() {
        try {
            return (WindowsAuditLogCreateConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.WindowsAuditLogCreateConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
