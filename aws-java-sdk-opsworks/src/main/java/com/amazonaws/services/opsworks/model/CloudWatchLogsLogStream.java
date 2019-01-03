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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the Amazon CloudWatch logs configuration for a layer. For detailed information about members of this data
 * type, see the <a href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AgentReference.html">CloudWatch Logs
 * Agent Reference</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CloudWatchLogsLogStream" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchLogsLogStream implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the destination log group. A log group is created automatically if it doesn't already exist. Log group
     * names can be between 1 and 512 characters long. Allowed characters include a-z, A-Z, 0-9, '_' (underscore), '-'
     * (hyphen), '/' (forward slash), and '.' (period).
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * Specifies how the time stamp is extracted from logs. For more information, see the <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AgentReference.html">CloudWatch Logs Agent
     * Reference</a>.
     * </p>
     */
    private String datetimeFormat;
    /**
     * <p>
     * Specifies the time zone of log event time stamps.
     * </p>
     */
    private String timeZone;
    /**
     * <p>
     * Specifies log files that you want to push to CloudWatch Logs.
     * </p>
     * <p>
     * <code>File</code> can point to a specific file or multiple files (by using wild card characters such as
     * <code>/var/log/system.log*</code>). Only the latest file is pushed to CloudWatch Logs, based on file modification
     * time. We recommend that you use wild card characters to specify a series of files of the same type, such as
     * <code>access_log.2014-06-01-01</code>, <code>access_log.2014-06-01-02</code>, and so on by using a pattern like
     * <code>access_log.*</code>. Don't use a wildcard to match multiple file types, such as <code>access_log_80</code>
     * and <code>access_log_443</code>. To specify multiple, different file types, add another log stream entry to the
     * configuration file, so that each log file type is stored in a different log group.
     * </p>
     * <p>
     * Zipped files are not supported.
     * </p>
     */
    private String file;
    /**
     * <p>
     * Specifies the range of lines for identifying a file. The valid values are one number, or two dash-delimited
     * numbers, such as '1', '2-5'. The default value is '1', meaning the first line is used to calculate the
     * fingerprint. Fingerprint lines are not sent to CloudWatch Logs unless all specified lines are available.
     * </p>
     */
    private String fileFingerprintLines;
    /**
     * <p>
     * Specifies the pattern for identifying the start of a log message.
     * </p>
     */
    private String multiLineStartPattern;
    /**
     * <p>
     * Specifies where to start to read data (start_of_file or end_of_file). The default is start_of_file. This setting
     * is only used if there is no state persisted for that log stream.
     * </p>
     */
    private String initialPosition;
    /**
     * <p>
     * Specifies the encoding of the log file so that the file can be read correctly. The default is <code>utf_8</code>.
     * Encodings supported by Python <code>codecs.decode()</code> can be used here.
     * </p>
     */
    private String encoding;
    /**
     * <p>
     * Specifies the time duration for the batching of log events. The minimum value is 5000ms and default value is
     * 5000ms.
     * </p>
     */
    private Integer bufferDuration;
    /**
     * <p>
     * Specifies the max number of log events in a batch, up to 10000. The default value is 1000.
     * </p>
     */
    private Integer batchCount;
    /**
     * <p>
     * Specifies the maximum size of log events in a batch, in bytes, up to 1048576 bytes. The default value is 32768
     * bytes. This size is calculated as the sum of all event messages in UTF-8, plus 26 bytes for each log event.
     * </p>
     */
    private Integer batchSize;

    /**
     * <p>
     * Specifies the destination log group. A log group is created automatically if it doesn't already exist. Log group
     * names can be between 1 and 512 characters long. Allowed characters include a-z, A-Z, 0-9, '_' (underscore), '-'
     * (hyphen), '/' (forward slash), and '.' (period).
     * </p>
     * 
     * @param logGroupName
     *        Specifies the destination log group. A log group is created automatically if it doesn't already exist. Log
     *        group names can be between 1 and 512 characters long. Allowed characters include a-z, A-Z, 0-9, '_'
     *        (underscore), '-' (hyphen), '/' (forward slash), and '.' (period).
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * Specifies the destination log group. A log group is created automatically if it doesn't already exist. Log group
     * names can be between 1 and 512 characters long. Allowed characters include a-z, A-Z, 0-9, '_' (underscore), '-'
     * (hyphen), '/' (forward slash), and '.' (period).
     * </p>
     * 
     * @return Specifies the destination log group. A log group is created automatically if it doesn't already exist.
     *         Log group names can be between 1 and 512 characters long. Allowed characters include a-z, A-Z, 0-9, '_'
     *         (underscore), '-' (hyphen), '/' (forward slash), and '.' (period).
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * Specifies the destination log group. A log group is created automatically if it doesn't already exist. Log group
     * names can be between 1 and 512 characters long. Allowed characters include a-z, A-Z, 0-9, '_' (underscore), '-'
     * (hyphen), '/' (forward slash), and '.' (period).
     * </p>
     * 
     * @param logGroupName
     *        Specifies the destination log group. A log group is created automatically if it doesn't already exist. Log
     *        group names can be between 1 and 512 characters long. Allowed characters include a-z, A-Z, 0-9, '_'
     *        (underscore), '-' (hyphen), '/' (forward slash), and '.' (period).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsLogStream withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * Specifies how the time stamp is extracted from logs. For more information, see the <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AgentReference.html">CloudWatch Logs Agent
     * Reference</a>.
     * </p>
     * 
     * @param datetimeFormat
     *        Specifies how the time stamp is extracted from logs. For more information, see the <a
     *        href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AgentReference.html">CloudWatch Logs Agent
     *        Reference</a>.
     */

    public void setDatetimeFormat(String datetimeFormat) {
        this.datetimeFormat = datetimeFormat;
    }

    /**
     * <p>
     * Specifies how the time stamp is extracted from logs. For more information, see the <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AgentReference.html">CloudWatch Logs Agent
     * Reference</a>.
     * </p>
     * 
     * @return Specifies how the time stamp is extracted from logs. For more information, see the <a
     *         href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AgentReference.html">CloudWatch Logs Agent
     *         Reference</a>.
     */

    public String getDatetimeFormat() {
        return this.datetimeFormat;
    }

    /**
     * <p>
     * Specifies how the time stamp is extracted from logs. For more information, see the <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AgentReference.html">CloudWatch Logs Agent
     * Reference</a>.
     * </p>
     * 
     * @param datetimeFormat
     *        Specifies how the time stamp is extracted from logs. For more information, see the <a
     *        href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AgentReference.html">CloudWatch Logs Agent
     *        Reference</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsLogStream withDatetimeFormat(String datetimeFormat) {
        setDatetimeFormat(datetimeFormat);
        return this;
    }

    /**
     * <p>
     * Specifies the time zone of log event time stamps.
     * </p>
     * 
     * @param timeZone
     *        Specifies the time zone of log event time stamps.
     * @see CloudWatchLogsTimeZone
     */

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * <p>
     * Specifies the time zone of log event time stamps.
     * </p>
     * 
     * @return Specifies the time zone of log event time stamps.
     * @see CloudWatchLogsTimeZone
     */

    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * <p>
     * Specifies the time zone of log event time stamps.
     * </p>
     * 
     * @param timeZone
     *        Specifies the time zone of log event time stamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchLogsTimeZone
     */

    public CloudWatchLogsLogStream withTimeZone(String timeZone) {
        setTimeZone(timeZone);
        return this;
    }

    /**
     * <p>
     * Specifies the time zone of log event time stamps.
     * </p>
     * 
     * @param timeZone
     *        Specifies the time zone of log event time stamps.
     * @see CloudWatchLogsTimeZone
     */

    public void setTimeZone(CloudWatchLogsTimeZone timeZone) {
        withTimeZone(timeZone);
    }

    /**
     * <p>
     * Specifies the time zone of log event time stamps.
     * </p>
     * 
     * @param timeZone
     *        Specifies the time zone of log event time stamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchLogsTimeZone
     */

    public CloudWatchLogsLogStream withTimeZone(CloudWatchLogsTimeZone timeZone) {
        this.timeZone = timeZone.toString();
        return this;
    }

    /**
     * <p>
     * Specifies log files that you want to push to CloudWatch Logs.
     * </p>
     * <p>
     * <code>File</code> can point to a specific file or multiple files (by using wild card characters such as
     * <code>/var/log/system.log*</code>). Only the latest file is pushed to CloudWatch Logs, based on file modification
     * time. We recommend that you use wild card characters to specify a series of files of the same type, such as
     * <code>access_log.2014-06-01-01</code>, <code>access_log.2014-06-01-02</code>, and so on by using a pattern like
     * <code>access_log.*</code>. Don't use a wildcard to match multiple file types, such as <code>access_log_80</code>
     * and <code>access_log_443</code>. To specify multiple, different file types, add another log stream entry to the
     * configuration file, so that each log file type is stored in a different log group.
     * </p>
     * <p>
     * Zipped files are not supported.
     * </p>
     * 
     * @param file
     *        Specifies log files that you want to push to CloudWatch Logs.</p>
     *        <p>
     *        <code>File</code> can point to a specific file or multiple files (by using wild card characters such as
     *        <code>/var/log/system.log*</code>). Only the latest file is pushed to CloudWatch Logs, based on file
     *        modification time. We recommend that you use wild card characters to specify a series of files of the same
     *        type, such as <code>access_log.2014-06-01-01</code>, <code>access_log.2014-06-01-02</code>, and so on by
     *        using a pattern like <code>access_log.*</code>. Don't use a wildcard to match multiple file types, such as
     *        <code>access_log_80</code> and <code>access_log_443</code>. To specify multiple, different file types, add
     *        another log stream entry to the configuration file, so that each log file type is stored in a different
     *        log group.
     *        </p>
     *        <p>
     *        Zipped files are not supported.
     */

    public void setFile(String file) {
        this.file = file;
    }

    /**
     * <p>
     * Specifies log files that you want to push to CloudWatch Logs.
     * </p>
     * <p>
     * <code>File</code> can point to a specific file or multiple files (by using wild card characters such as
     * <code>/var/log/system.log*</code>). Only the latest file is pushed to CloudWatch Logs, based on file modification
     * time. We recommend that you use wild card characters to specify a series of files of the same type, such as
     * <code>access_log.2014-06-01-01</code>, <code>access_log.2014-06-01-02</code>, and so on by using a pattern like
     * <code>access_log.*</code>. Don't use a wildcard to match multiple file types, such as <code>access_log_80</code>
     * and <code>access_log_443</code>. To specify multiple, different file types, add another log stream entry to the
     * configuration file, so that each log file type is stored in a different log group.
     * </p>
     * <p>
     * Zipped files are not supported.
     * </p>
     * 
     * @return Specifies log files that you want to push to CloudWatch Logs.</p>
     *         <p>
     *         <code>File</code> can point to a specific file or multiple files (by using wild card characters such as
     *         <code>/var/log/system.log*</code>). Only the latest file is pushed to CloudWatch Logs, based on file
     *         modification time. We recommend that you use wild card characters to specify a series of files of the
     *         same type, such as <code>access_log.2014-06-01-01</code>, <code>access_log.2014-06-01-02</code>, and so
     *         on by using a pattern like <code>access_log.*</code>. Don't use a wildcard to match multiple file types,
     *         such as <code>access_log_80</code> and <code>access_log_443</code>. To specify multiple, different file
     *         types, add another log stream entry to the configuration file, so that each log file type is stored in a
     *         different log group.
     *         </p>
     *         <p>
     *         Zipped files are not supported.
     */

    public String getFile() {
        return this.file;
    }

    /**
     * <p>
     * Specifies log files that you want to push to CloudWatch Logs.
     * </p>
     * <p>
     * <code>File</code> can point to a specific file or multiple files (by using wild card characters such as
     * <code>/var/log/system.log*</code>). Only the latest file is pushed to CloudWatch Logs, based on file modification
     * time. We recommend that you use wild card characters to specify a series of files of the same type, such as
     * <code>access_log.2014-06-01-01</code>, <code>access_log.2014-06-01-02</code>, and so on by using a pattern like
     * <code>access_log.*</code>. Don't use a wildcard to match multiple file types, such as <code>access_log_80</code>
     * and <code>access_log_443</code>. To specify multiple, different file types, add another log stream entry to the
     * configuration file, so that each log file type is stored in a different log group.
     * </p>
     * <p>
     * Zipped files are not supported.
     * </p>
     * 
     * @param file
     *        Specifies log files that you want to push to CloudWatch Logs.</p>
     *        <p>
     *        <code>File</code> can point to a specific file or multiple files (by using wild card characters such as
     *        <code>/var/log/system.log*</code>). Only the latest file is pushed to CloudWatch Logs, based on file
     *        modification time. We recommend that you use wild card characters to specify a series of files of the same
     *        type, such as <code>access_log.2014-06-01-01</code>, <code>access_log.2014-06-01-02</code>, and so on by
     *        using a pattern like <code>access_log.*</code>. Don't use a wildcard to match multiple file types, such as
     *        <code>access_log_80</code> and <code>access_log_443</code>. To specify multiple, different file types, add
     *        another log stream entry to the configuration file, so that each log file type is stored in a different
     *        log group.
     *        </p>
     *        <p>
     *        Zipped files are not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsLogStream withFile(String file) {
        setFile(file);
        return this;
    }

    /**
     * <p>
     * Specifies the range of lines for identifying a file. The valid values are one number, or two dash-delimited
     * numbers, such as '1', '2-5'. The default value is '1', meaning the first line is used to calculate the
     * fingerprint. Fingerprint lines are not sent to CloudWatch Logs unless all specified lines are available.
     * </p>
     * 
     * @param fileFingerprintLines
     *        Specifies the range of lines for identifying a file. The valid values are one number, or two
     *        dash-delimited numbers, such as '1', '2-5'. The default value is '1', meaning the first line is used to
     *        calculate the fingerprint. Fingerprint lines are not sent to CloudWatch Logs unless all specified lines
     *        are available.
     */

    public void setFileFingerprintLines(String fileFingerprintLines) {
        this.fileFingerprintLines = fileFingerprintLines;
    }

    /**
     * <p>
     * Specifies the range of lines for identifying a file. The valid values are one number, or two dash-delimited
     * numbers, such as '1', '2-5'. The default value is '1', meaning the first line is used to calculate the
     * fingerprint. Fingerprint lines are not sent to CloudWatch Logs unless all specified lines are available.
     * </p>
     * 
     * @return Specifies the range of lines for identifying a file. The valid values are one number, or two
     *         dash-delimited numbers, such as '1', '2-5'. The default value is '1', meaning the first line is used to
     *         calculate the fingerprint. Fingerprint lines are not sent to CloudWatch Logs unless all specified lines
     *         are available.
     */

    public String getFileFingerprintLines() {
        return this.fileFingerprintLines;
    }

    /**
     * <p>
     * Specifies the range of lines for identifying a file. The valid values are one number, or two dash-delimited
     * numbers, such as '1', '2-5'. The default value is '1', meaning the first line is used to calculate the
     * fingerprint. Fingerprint lines are not sent to CloudWatch Logs unless all specified lines are available.
     * </p>
     * 
     * @param fileFingerprintLines
     *        Specifies the range of lines for identifying a file. The valid values are one number, or two
     *        dash-delimited numbers, such as '1', '2-5'. The default value is '1', meaning the first line is used to
     *        calculate the fingerprint. Fingerprint lines are not sent to CloudWatch Logs unless all specified lines
     *        are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsLogStream withFileFingerprintLines(String fileFingerprintLines) {
        setFileFingerprintLines(fileFingerprintLines);
        return this;
    }

    /**
     * <p>
     * Specifies the pattern for identifying the start of a log message.
     * </p>
     * 
     * @param multiLineStartPattern
     *        Specifies the pattern for identifying the start of a log message.
     */

    public void setMultiLineStartPattern(String multiLineStartPattern) {
        this.multiLineStartPattern = multiLineStartPattern;
    }

    /**
     * <p>
     * Specifies the pattern for identifying the start of a log message.
     * </p>
     * 
     * @return Specifies the pattern for identifying the start of a log message.
     */

    public String getMultiLineStartPattern() {
        return this.multiLineStartPattern;
    }

    /**
     * <p>
     * Specifies the pattern for identifying the start of a log message.
     * </p>
     * 
     * @param multiLineStartPattern
     *        Specifies the pattern for identifying the start of a log message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsLogStream withMultiLineStartPattern(String multiLineStartPattern) {
        setMultiLineStartPattern(multiLineStartPattern);
        return this;
    }

    /**
     * <p>
     * Specifies where to start to read data (start_of_file or end_of_file). The default is start_of_file. This setting
     * is only used if there is no state persisted for that log stream.
     * </p>
     * 
     * @param initialPosition
     *        Specifies where to start to read data (start_of_file or end_of_file). The default is start_of_file. This
     *        setting is only used if there is no state persisted for that log stream.
     * @see CloudWatchLogsInitialPosition
     */

    public void setInitialPosition(String initialPosition) {
        this.initialPosition = initialPosition;
    }

    /**
     * <p>
     * Specifies where to start to read data (start_of_file or end_of_file). The default is start_of_file. This setting
     * is only used if there is no state persisted for that log stream.
     * </p>
     * 
     * @return Specifies where to start to read data (start_of_file or end_of_file). The default is start_of_file. This
     *         setting is only used if there is no state persisted for that log stream.
     * @see CloudWatchLogsInitialPosition
     */

    public String getInitialPosition() {
        return this.initialPosition;
    }

    /**
     * <p>
     * Specifies where to start to read data (start_of_file or end_of_file). The default is start_of_file. This setting
     * is only used if there is no state persisted for that log stream.
     * </p>
     * 
     * @param initialPosition
     *        Specifies where to start to read data (start_of_file or end_of_file). The default is start_of_file. This
     *        setting is only used if there is no state persisted for that log stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchLogsInitialPosition
     */

    public CloudWatchLogsLogStream withInitialPosition(String initialPosition) {
        setInitialPosition(initialPosition);
        return this;
    }

    /**
     * <p>
     * Specifies where to start to read data (start_of_file or end_of_file). The default is start_of_file. This setting
     * is only used if there is no state persisted for that log stream.
     * </p>
     * 
     * @param initialPosition
     *        Specifies where to start to read data (start_of_file or end_of_file). The default is start_of_file. This
     *        setting is only used if there is no state persisted for that log stream.
     * @see CloudWatchLogsInitialPosition
     */

    public void setInitialPosition(CloudWatchLogsInitialPosition initialPosition) {
        withInitialPosition(initialPosition);
    }

    /**
     * <p>
     * Specifies where to start to read data (start_of_file or end_of_file). The default is start_of_file. This setting
     * is only used if there is no state persisted for that log stream.
     * </p>
     * 
     * @param initialPosition
     *        Specifies where to start to read data (start_of_file or end_of_file). The default is start_of_file. This
     *        setting is only used if there is no state persisted for that log stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchLogsInitialPosition
     */

    public CloudWatchLogsLogStream withInitialPosition(CloudWatchLogsInitialPosition initialPosition) {
        this.initialPosition = initialPosition.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the encoding of the log file so that the file can be read correctly. The default is <code>utf_8</code>.
     * Encodings supported by Python <code>codecs.decode()</code> can be used here.
     * </p>
     * 
     * @param encoding
     *        Specifies the encoding of the log file so that the file can be read correctly. The default is
     *        <code>utf_8</code>. Encodings supported by Python <code>codecs.decode()</code> can be used here.
     * @see CloudWatchLogsEncoding
     */

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    /**
     * <p>
     * Specifies the encoding of the log file so that the file can be read correctly. The default is <code>utf_8</code>.
     * Encodings supported by Python <code>codecs.decode()</code> can be used here.
     * </p>
     * 
     * @return Specifies the encoding of the log file so that the file can be read correctly. The default is
     *         <code>utf_8</code>. Encodings supported by Python <code>codecs.decode()</code> can be used here.
     * @see CloudWatchLogsEncoding
     */

    public String getEncoding() {
        return this.encoding;
    }

    /**
     * <p>
     * Specifies the encoding of the log file so that the file can be read correctly. The default is <code>utf_8</code>.
     * Encodings supported by Python <code>codecs.decode()</code> can be used here.
     * </p>
     * 
     * @param encoding
     *        Specifies the encoding of the log file so that the file can be read correctly. The default is
     *        <code>utf_8</code>. Encodings supported by Python <code>codecs.decode()</code> can be used here.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchLogsEncoding
     */

    public CloudWatchLogsLogStream withEncoding(String encoding) {
        setEncoding(encoding);
        return this;
    }

    /**
     * <p>
     * Specifies the encoding of the log file so that the file can be read correctly. The default is <code>utf_8</code>.
     * Encodings supported by Python <code>codecs.decode()</code> can be used here.
     * </p>
     * 
     * @param encoding
     *        Specifies the encoding of the log file so that the file can be read correctly. The default is
     *        <code>utf_8</code>. Encodings supported by Python <code>codecs.decode()</code> can be used here.
     * @see CloudWatchLogsEncoding
     */

    public void setEncoding(CloudWatchLogsEncoding encoding) {
        withEncoding(encoding);
    }

    /**
     * <p>
     * Specifies the encoding of the log file so that the file can be read correctly. The default is <code>utf_8</code>.
     * Encodings supported by Python <code>codecs.decode()</code> can be used here.
     * </p>
     * 
     * @param encoding
     *        Specifies the encoding of the log file so that the file can be read correctly. The default is
     *        <code>utf_8</code>. Encodings supported by Python <code>codecs.decode()</code> can be used here.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchLogsEncoding
     */

    public CloudWatchLogsLogStream withEncoding(CloudWatchLogsEncoding encoding) {
        this.encoding = encoding.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the time duration for the batching of log events. The minimum value is 5000ms and default value is
     * 5000ms.
     * </p>
     * 
     * @param bufferDuration
     *        Specifies the time duration for the batching of log events. The minimum value is 5000ms and default value
     *        is 5000ms.
     */

    public void setBufferDuration(Integer bufferDuration) {
        this.bufferDuration = bufferDuration;
    }

    /**
     * <p>
     * Specifies the time duration for the batching of log events. The minimum value is 5000ms and default value is
     * 5000ms.
     * </p>
     * 
     * @return Specifies the time duration for the batching of log events. The minimum value is 5000ms and default value
     *         is 5000ms.
     */

    public Integer getBufferDuration() {
        return this.bufferDuration;
    }

    /**
     * <p>
     * Specifies the time duration for the batching of log events. The minimum value is 5000ms and default value is
     * 5000ms.
     * </p>
     * 
     * @param bufferDuration
     *        Specifies the time duration for the batching of log events. The minimum value is 5000ms and default value
     *        is 5000ms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsLogStream withBufferDuration(Integer bufferDuration) {
        setBufferDuration(bufferDuration);
        return this;
    }

    /**
     * <p>
     * Specifies the max number of log events in a batch, up to 10000. The default value is 1000.
     * </p>
     * 
     * @param batchCount
     *        Specifies the max number of log events in a batch, up to 10000. The default value is 1000.
     */

    public void setBatchCount(Integer batchCount) {
        this.batchCount = batchCount;
    }

    /**
     * <p>
     * Specifies the max number of log events in a batch, up to 10000. The default value is 1000.
     * </p>
     * 
     * @return Specifies the max number of log events in a batch, up to 10000. The default value is 1000.
     */

    public Integer getBatchCount() {
        return this.batchCount;
    }

    /**
     * <p>
     * Specifies the max number of log events in a batch, up to 10000. The default value is 1000.
     * </p>
     * 
     * @param batchCount
     *        Specifies the max number of log events in a batch, up to 10000. The default value is 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsLogStream withBatchCount(Integer batchCount) {
        setBatchCount(batchCount);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum size of log events in a batch, in bytes, up to 1048576 bytes. The default value is 32768
     * bytes. This size is calculated as the sum of all event messages in UTF-8, plus 26 bytes for each log event.
     * </p>
     * 
     * @param batchSize
     *        Specifies the maximum size of log events in a batch, in bytes, up to 1048576 bytes. The default value is
     *        32768 bytes. This size is calculated as the sum of all event messages in UTF-8, plus 26 bytes for each log
     *        event.
     */

    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * <p>
     * Specifies the maximum size of log events in a batch, in bytes, up to 1048576 bytes. The default value is 32768
     * bytes. This size is calculated as the sum of all event messages in UTF-8, plus 26 bytes for each log event.
     * </p>
     * 
     * @return Specifies the maximum size of log events in a batch, in bytes, up to 1048576 bytes. The default value is
     *         32768 bytes. This size is calculated as the sum of all event messages in UTF-8, plus 26 bytes for each
     *         log event.
     */

    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * <p>
     * Specifies the maximum size of log events in a batch, in bytes, up to 1048576 bytes. The default value is 32768
     * bytes. This size is calculated as the sum of all event messages in UTF-8, plus 26 bytes for each log event.
     * </p>
     * 
     * @param batchSize
     *        Specifies the maximum size of log events in a batch, in bytes, up to 1048576 bytes. The default value is
     *        32768 bytes. This size is calculated as the sum of all event messages in UTF-8, plus 26 bytes for each log
     *        event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsLogStream withBatchSize(Integer batchSize) {
        setBatchSize(batchSize);
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
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getDatetimeFormat() != null)
            sb.append("DatetimeFormat: ").append(getDatetimeFormat()).append(",");
        if (getTimeZone() != null)
            sb.append("TimeZone: ").append(getTimeZone()).append(",");
        if (getFile() != null)
            sb.append("File: ").append(getFile()).append(",");
        if (getFileFingerprintLines() != null)
            sb.append("FileFingerprintLines: ").append(getFileFingerprintLines()).append(",");
        if (getMultiLineStartPattern() != null)
            sb.append("MultiLineStartPattern: ").append(getMultiLineStartPattern()).append(",");
        if (getInitialPosition() != null)
            sb.append("InitialPosition: ").append(getInitialPosition()).append(",");
        if (getEncoding() != null)
            sb.append("Encoding: ").append(getEncoding()).append(",");
        if (getBufferDuration() != null)
            sb.append("BufferDuration: ").append(getBufferDuration()).append(",");
        if (getBatchCount() != null)
            sb.append("BatchCount: ").append(getBatchCount()).append(",");
        if (getBatchSize() != null)
            sb.append("BatchSize: ").append(getBatchSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchLogsLogStream == false)
            return false;
        CloudWatchLogsLogStream other = (CloudWatchLogsLogStream) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getDatetimeFormat() == null ^ this.getDatetimeFormat() == null)
            return false;
        if (other.getDatetimeFormat() != null && other.getDatetimeFormat().equals(this.getDatetimeFormat()) == false)
            return false;
        if (other.getTimeZone() == null ^ this.getTimeZone() == null)
            return false;
        if (other.getTimeZone() != null && other.getTimeZone().equals(this.getTimeZone()) == false)
            return false;
        if (other.getFile() == null ^ this.getFile() == null)
            return false;
        if (other.getFile() != null && other.getFile().equals(this.getFile()) == false)
            return false;
        if (other.getFileFingerprintLines() == null ^ this.getFileFingerprintLines() == null)
            return false;
        if (other.getFileFingerprintLines() != null && other.getFileFingerprintLines().equals(this.getFileFingerprintLines()) == false)
            return false;
        if (other.getMultiLineStartPattern() == null ^ this.getMultiLineStartPattern() == null)
            return false;
        if (other.getMultiLineStartPattern() != null && other.getMultiLineStartPattern().equals(this.getMultiLineStartPattern()) == false)
            return false;
        if (other.getInitialPosition() == null ^ this.getInitialPosition() == null)
            return false;
        if (other.getInitialPosition() != null && other.getInitialPosition().equals(this.getInitialPosition()) == false)
            return false;
        if (other.getEncoding() == null ^ this.getEncoding() == null)
            return false;
        if (other.getEncoding() != null && other.getEncoding().equals(this.getEncoding()) == false)
            return false;
        if (other.getBufferDuration() == null ^ this.getBufferDuration() == null)
            return false;
        if (other.getBufferDuration() != null && other.getBufferDuration().equals(this.getBufferDuration()) == false)
            return false;
        if (other.getBatchCount() == null ^ this.getBatchCount() == null)
            return false;
        if (other.getBatchCount() != null && other.getBatchCount().equals(this.getBatchCount()) == false)
            return false;
        if (other.getBatchSize() == null ^ this.getBatchSize() == null)
            return false;
        if (other.getBatchSize() != null && other.getBatchSize().equals(this.getBatchSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getDatetimeFormat() == null) ? 0 : getDatetimeFormat().hashCode());
        hashCode = prime * hashCode + ((getTimeZone() == null) ? 0 : getTimeZone().hashCode());
        hashCode = prime * hashCode + ((getFile() == null) ? 0 : getFile().hashCode());
        hashCode = prime * hashCode + ((getFileFingerprintLines() == null) ? 0 : getFileFingerprintLines().hashCode());
        hashCode = prime * hashCode + ((getMultiLineStartPattern() == null) ? 0 : getMultiLineStartPattern().hashCode());
        hashCode = prime * hashCode + ((getInitialPosition() == null) ? 0 : getInitialPosition().hashCode());
        hashCode = prime * hashCode + ((getEncoding() == null) ? 0 : getEncoding().hashCode());
        hashCode = prime * hashCode + ((getBufferDuration() == null) ? 0 : getBufferDuration().hashCode());
        hashCode = prime * hashCode + ((getBatchCount() == null) ? 0 : getBatchCount().hashCode());
        hashCode = prime * hashCode + ((getBatchSize() == null) ? 0 : getBatchSize().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchLogsLogStream clone() {
        try {
            return (CloudWatchLogsLogStream) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.CloudWatchLogsLogStreamMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
