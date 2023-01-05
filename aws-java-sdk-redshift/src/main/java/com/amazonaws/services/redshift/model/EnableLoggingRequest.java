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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/EnableLogging" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableLoggingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the cluster on which logging is to be started.
     * </p>
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The name of an existing S3 bucket where the log files are to be stored.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the same region as the cluster
     * </p>
     * </li>
     * <li>
     * <p>
     * The cluster must have read bucket and put object permissions
     * </p>
     * </li>
     * </ul>
     */
    private String bucketName;
    /**
     * <p>
     * The prefix applied to the log file names.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot exceed 512 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot contain spaces( ), double quotes ("), single quotes ('), a backslash (\), or control characters. The
     * hexadecimal codes for invalid characters are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * x00 to x20
     * </p>
     * </li>
     * <li>
     * <p>
     * x22
     * </p>
     * </li>
     * <li>
     * <p>
     * x27
     * </p>
     * </li>
     * <li>
     * <p>
     * x5c
     * </p>
     * </li>
     * <li>
     * <p>
     * x7f or larger
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String s3KeyPrefix;
    /**
     * <p>
     * The log destination type. An enum with possible values of <code>s3</code> and <code>cloudwatch</code>.
     * </p>
     */
    private String logDestinationType;
    /**
     * <p>
     * The collection of exported log types. Log types include the connection log, user log and user activity log.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> logExports;

    /**
     * <p>
     * The identifier of the cluster on which logging is to be started.
     * </p>
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster on which logging is to be started.</p>
     *        <p>
     *        Example: <code>examplecluster</code>
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster on which logging is to be started.
     * </p>
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     * 
     * @return The identifier of the cluster on which logging is to be started.</p>
     *         <p>
     *         Example: <code>examplecluster</code>
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster on which logging is to be started.
     * </p>
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster on which logging is to be started.</p>
     *        <p>
     *        Example: <code>examplecluster</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableLoggingRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of an existing S3 bucket where the log files are to be stored.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the same region as the cluster
     * </p>
     * </li>
     * <li>
     * <p>
     * The cluster must have read bucket and put object permissions
     * </p>
     * </li>
     * </ul>
     * 
     * @param bucketName
     *        The name of an existing S3 bucket where the log files are to be stored.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the same region as the cluster
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The cluster must have read bucket and put object permissions
     *        </p>
     *        </li>
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of an existing S3 bucket where the log files are to be stored.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the same region as the cluster
     * </p>
     * </li>
     * <li>
     * <p>
     * The cluster must have read bucket and put object permissions
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of an existing S3 bucket where the log files are to be stored.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be in the same region as the cluster
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The cluster must have read bucket and put object permissions
     *         </p>
     *         </li>
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of an existing S3 bucket where the log files are to be stored.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the same region as the cluster
     * </p>
     * </li>
     * <li>
     * <p>
     * The cluster must have read bucket and put object permissions
     * </p>
     * </li>
     * </ul>
     * 
     * @param bucketName
     *        The name of an existing S3 bucket where the log files are to be stored.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the same region as the cluster
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The cluster must have read bucket and put object permissions
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableLoggingRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The prefix applied to the log file names.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot exceed 512 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot contain spaces( ), double quotes ("), single quotes ('), a backslash (\), or control characters. The
     * hexadecimal codes for invalid characters are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * x00 to x20
     * </p>
     * </li>
     * <li>
     * <p>
     * x22
     * </p>
     * </li>
     * <li>
     * <p>
     * x27
     * </p>
     * </li>
     * <li>
     * <p>
     * x5c
     * </p>
     * </li>
     * <li>
     * <p>
     * x7f or larger
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param s3KeyPrefix
     *        The prefix applied to the log file names.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Cannot exceed 512 characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot contain spaces( ), double quotes ("), single quotes ('), a backslash (\), or control characters.
     *        The hexadecimal codes for invalid characters are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        x00 to x20
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        x22
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        x27
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        x5c
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        x7f or larger
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * <p>
     * The prefix applied to the log file names.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot exceed 512 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot contain spaces( ), double quotes ("), single quotes ('), a backslash (\), or control characters. The
     * hexadecimal codes for invalid characters are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * x00 to x20
     * </p>
     * </li>
     * <li>
     * <p>
     * x22
     * </p>
     * </li>
     * <li>
     * <p>
     * x27
     * </p>
     * </li>
     * <li>
     * <p>
     * x5c
     * </p>
     * </li>
     * <li>
     * <p>
     * x7f or larger
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The prefix applied to the log file names.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Cannot exceed 512 characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot contain spaces( ), double quotes ("), single quotes ('), a backslash (\), or control characters.
     *         The hexadecimal codes for invalid characters are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         x00 to x20
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         x22
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         x27
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         x5c
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         x7f or larger
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public String getS3KeyPrefix() {
        return this.s3KeyPrefix;
    }

    /**
     * <p>
     * The prefix applied to the log file names.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot exceed 512 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot contain spaces( ), double quotes ("), single quotes ('), a backslash (\), or control characters. The
     * hexadecimal codes for invalid characters are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * x00 to x20
     * </p>
     * </li>
     * <li>
     * <p>
     * x22
     * </p>
     * </li>
     * <li>
     * <p>
     * x27
     * </p>
     * </li>
     * <li>
     * <p>
     * x5c
     * </p>
     * </li>
     * <li>
     * <p>
     * x7f or larger
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param s3KeyPrefix
     *        The prefix applied to the log file names.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Cannot exceed 512 characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot contain spaces( ), double quotes ("), single quotes ('), a backslash (\), or control characters.
     *        The hexadecimal codes for invalid characters are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        x00 to x20
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        x22
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        x27
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        x5c
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        x7f or larger
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableLoggingRequest withS3KeyPrefix(String s3KeyPrefix) {
        setS3KeyPrefix(s3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * The log destination type. An enum with possible values of <code>s3</code> and <code>cloudwatch</code>.
     * </p>
     * 
     * @param logDestinationType
     *        The log destination type. An enum with possible values of <code>s3</code> and <code>cloudwatch</code>.
     * @see LogDestinationType
     */

    public void setLogDestinationType(String logDestinationType) {
        this.logDestinationType = logDestinationType;
    }

    /**
     * <p>
     * The log destination type. An enum with possible values of <code>s3</code> and <code>cloudwatch</code>.
     * </p>
     * 
     * @return The log destination type. An enum with possible values of <code>s3</code> and <code>cloudwatch</code>.
     * @see LogDestinationType
     */

    public String getLogDestinationType() {
        return this.logDestinationType;
    }

    /**
     * <p>
     * The log destination type. An enum with possible values of <code>s3</code> and <code>cloudwatch</code>.
     * </p>
     * 
     * @param logDestinationType
     *        The log destination type. An enum with possible values of <code>s3</code> and <code>cloudwatch</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogDestinationType
     */

    public EnableLoggingRequest withLogDestinationType(String logDestinationType) {
        setLogDestinationType(logDestinationType);
        return this;
    }

    /**
     * <p>
     * The log destination type. An enum with possible values of <code>s3</code> and <code>cloudwatch</code>.
     * </p>
     * 
     * @param logDestinationType
     *        The log destination type. An enum with possible values of <code>s3</code> and <code>cloudwatch</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogDestinationType
     */

    public EnableLoggingRequest withLogDestinationType(LogDestinationType logDestinationType) {
        this.logDestinationType = logDestinationType.toString();
        return this;
    }

    /**
     * <p>
     * The collection of exported log types. Log types include the connection log, user log and user activity log.
     * </p>
     * 
     * @return The collection of exported log types. Log types include the connection log, user log and user activity
     *         log.
     */

    public java.util.List<String> getLogExports() {
        if (logExports == null) {
            logExports = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return logExports;
    }

    /**
     * <p>
     * The collection of exported log types. Log types include the connection log, user log and user activity log.
     * </p>
     * 
     * @param logExports
     *        The collection of exported log types. Log types include the connection log, user log and user activity
     *        log.
     */

    public void setLogExports(java.util.Collection<String> logExports) {
        if (logExports == null) {
            this.logExports = null;
            return;
        }

        this.logExports = new com.amazonaws.internal.SdkInternalList<String>(logExports);
    }

    /**
     * <p>
     * The collection of exported log types. Log types include the connection log, user log and user activity log.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogExports(java.util.Collection)} or {@link #withLogExports(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param logExports
     *        The collection of exported log types. Log types include the connection log, user log and user activity
     *        log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableLoggingRequest withLogExports(String... logExports) {
        if (this.logExports == null) {
            setLogExports(new com.amazonaws.internal.SdkInternalList<String>(logExports.length));
        }
        for (String ele : logExports) {
            this.logExports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The collection of exported log types. Log types include the connection log, user log and user activity log.
     * </p>
     * 
     * @param logExports
     *        The collection of exported log types. Log types include the connection log, user log and user activity
     *        log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableLoggingRequest withLogExports(java.util.Collection<String> logExports) {
        setLogExports(logExports);
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getS3KeyPrefix() != null)
            sb.append("S3KeyPrefix: ").append(getS3KeyPrefix()).append(",");
        if (getLogDestinationType() != null)
            sb.append("LogDestinationType: ").append(getLogDestinationType()).append(",");
        if (getLogExports() != null)
            sb.append("LogExports: ").append(getLogExports());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableLoggingRequest == false)
            return false;
        EnableLoggingRequest other = (EnableLoggingRequest) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null)
            return false;
        if (other.getS3KeyPrefix() != null && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false)
            return false;
        if (other.getLogDestinationType() == null ^ this.getLogDestinationType() == null)
            return false;
        if (other.getLogDestinationType() != null && other.getLogDestinationType().equals(this.getLogDestinationType()) == false)
            return false;
        if (other.getLogExports() == null ^ this.getLogExports() == null)
            return false;
        if (other.getLogExports() != null && other.getLogExports().equals(this.getLogExports()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getLogDestinationType() == null) ? 0 : getLogDestinationType().hashCode());
        hashCode = prime * hashCode + ((getLogExports() == null) ? 0 : getLogExports().hashCode());
        return hashCode;
    }

    @Override
    public EnableLoggingRequest clone() {
        return (EnableLoggingRequest) super.clone();
    }

}
