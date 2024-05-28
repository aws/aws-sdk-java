/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a log group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/LogGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the log group.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The creation time of the log group, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     */
    private Long creationTime;

    private Integer retentionInDays;
    /**
     * <p>
     * The number of metric filters.
     * </p>
     */
    private Integer metricFilterCount;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log group. This version of the ARN includes a trailing <code>:*</code>
     * after the log group name.
     * </p>
     * <p>
     * Use this version to refer to the ARN in IAM policies when specifying permissions for most API actions. The
     * exception is when specifying permissions for <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_TagResource.html">TagResource</a>,
     * <a href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UntagResource.html">
     * UntagResource</a>, and <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListTagsForResource.html"
     * >ListTagsForResource</a>. The permissions for those three actions require the ARN version that doesn't include a
     * trailing <code>:*</code>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The number of bytes stored.
     * </p>
     */
    private Long storedBytes;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to use when encrypting log data.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Displays whether this log group has a protection policy, or whether it had one in the past. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDataProtectionPolicy.html"
     * >PutDataProtectionPolicy</a>.
     * </p>
     */
    private String dataProtectionStatus;
    /**
     * <p>
     * Displays all the properties that this log group has inherited from account-level settings.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> inheritedProperties;
    /**
     * <p>
     * This specifies the log group class for this log group. There are two classes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>Standard</code> log class supports all CloudWatch Logs features.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Infrequent Access</code> log class supports a subset of CloudWatch Logs features and incurs lower
     * costs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For details about the features supported by each class, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch_Logs_Log_Classes.html">Log classes</a>
     * </p>
     */
    private String logGroupClass;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log group. This version of the ARN doesn't include a trailing
     * <code>:*</code> after the log group name.
     * </p>
     * <p>
     * Use this version to refer to the ARN in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In the <code>logGroupIdentifier</code> input field in many CloudWatch Logs APIs.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the <code>resourceArn</code> field in tagging APIs
     * </p>
     * </li>
     * <li>
     * <p>
     * In IAM policies, when specifying permissions for <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_TagResource.html">TagResource</a>,
     * <a href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UntagResource.html">
     * UntagResource</a>, and <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListTagsForResource.html"
     * >ListTagsForResource</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String logGroupArn;

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @return The name of the log group.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogGroup withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The creation time of the log group, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the log group, expressed as the number of milliseconds after Jan 1, 1970 00:00:00
     *        UTC.
     */

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the log group, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @return The creation time of the log group, expressed as the number of milliseconds after Jan 1, 1970 00:00:00
     *         UTC.
     */

    public Long getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of the log group, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the log group, expressed as the number of milliseconds after Jan 1, 1970 00:00:00
     *        UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogGroup withCreationTime(Long creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * @param retentionInDays
     */

    public void setRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
    }

    /**
     * @return
     */

    public Integer getRetentionInDays() {
        return this.retentionInDays;
    }

    /**
     * @param retentionInDays
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogGroup withRetentionInDays(Integer retentionInDays) {
        setRetentionInDays(retentionInDays);
        return this;
    }

    /**
     * <p>
     * The number of metric filters.
     * </p>
     * 
     * @param metricFilterCount
     *        The number of metric filters.
     */

    public void setMetricFilterCount(Integer metricFilterCount) {
        this.metricFilterCount = metricFilterCount;
    }

    /**
     * <p>
     * The number of metric filters.
     * </p>
     * 
     * @return The number of metric filters.
     */

    public Integer getMetricFilterCount() {
        return this.metricFilterCount;
    }

    /**
     * <p>
     * The number of metric filters.
     * </p>
     * 
     * @param metricFilterCount
     *        The number of metric filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogGroup withMetricFilterCount(Integer metricFilterCount) {
        setMetricFilterCount(metricFilterCount);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log group. This version of the ARN includes a trailing <code>:*</code>
     * after the log group name.
     * </p>
     * <p>
     * Use this version to refer to the ARN in IAM policies when specifying permissions for most API actions. The
     * exception is when specifying permissions for <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_TagResource.html">TagResource</a>,
     * <a href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UntagResource.html">
     * UntagResource</a>, and <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListTagsForResource.html"
     * >ListTagsForResource</a>. The permissions for those three actions require the ARN version that doesn't include a
     * trailing <code>:*</code>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the log group. This version of the ARN includes a trailing
     *        <code>:*</code> after the log group name. </p>
     *        <p>
     *        Use this version to refer to the ARN in IAM policies when specifying permissions for most API actions. The
     *        exception is when specifying permissions for <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_TagResource.html"
     *        >TagResource</a>, <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UntagResource.html"
     *        >UntagResource</a>, and <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListTagsForResource.html"
     *        >ListTagsForResource</a>. The permissions for those three actions require the ARN version that doesn't
     *        include a trailing <code>:*</code>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log group. This version of the ARN includes a trailing <code>:*</code>
     * after the log group name.
     * </p>
     * <p>
     * Use this version to refer to the ARN in IAM policies when specifying permissions for most API actions. The
     * exception is when specifying permissions for <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_TagResource.html">TagResource</a>,
     * <a href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UntagResource.html">
     * UntagResource</a>, and <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListTagsForResource.html"
     * >ListTagsForResource</a>. The permissions for those three actions require the ARN version that doesn't include a
     * trailing <code>:*</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the log group. This version of the ARN includes a trailing
     *         <code>:*</code> after the log group name. </p>
     *         <p>
     *         Use this version to refer to the ARN in IAM policies when specifying permissions for most API actions.
     *         The exception is when specifying permissions for <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_TagResource.html"
     *         >TagResource</a>, <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UntagResource.html"
     *         >UntagResource</a>, and <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListTagsForResource.html"
     *         >ListTagsForResource</a>. The permissions for those three actions require the ARN version that doesn't
     *         include a trailing <code>:*</code>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log group. This version of the ARN includes a trailing <code>:*</code>
     * after the log group name.
     * </p>
     * <p>
     * Use this version to refer to the ARN in IAM policies when specifying permissions for most API actions. The
     * exception is when specifying permissions for <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_TagResource.html">TagResource</a>,
     * <a href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UntagResource.html">
     * UntagResource</a>, and <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListTagsForResource.html"
     * >ListTagsForResource</a>. The permissions for those three actions require the ARN version that doesn't include a
     * trailing <code>:*</code>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the log group. This version of the ARN includes a trailing
     *        <code>:*</code> after the log group name. </p>
     *        <p>
     *        Use this version to refer to the ARN in IAM policies when specifying permissions for most API actions. The
     *        exception is when specifying permissions for <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_TagResource.html"
     *        >TagResource</a>, <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UntagResource.html"
     *        >UntagResource</a>, and <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListTagsForResource.html"
     *        >ListTagsForResource</a>. The permissions for those three actions require the ARN version that doesn't
     *        include a trailing <code>:*</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogGroup withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The number of bytes stored.
     * </p>
     * 
     * @param storedBytes
     *        The number of bytes stored.
     */

    public void setStoredBytes(Long storedBytes) {
        this.storedBytes = storedBytes;
    }

    /**
     * <p>
     * The number of bytes stored.
     * </p>
     * 
     * @return The number of bytes stored.
     */

    public Long getStoredBytes() {
        return this.storedBytes;
    }

    /**
     * <p>
     * The number of bytes stored.
     * </p>
     * 
     * @param storedBytes
     *        The number of bytes stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogGroup withStoredBytes(Long storedBytes) {
        setStoredBytes(storedBytes);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to use when encrypting log data.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Resource Name (ARN) of the KMS key to use when encrypting log data.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to use when encrypting log data.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the KMS key to use when encrypting log data.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to use when encrypting log data.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Resource Name (ARN) of the KMS key to use when encrypting log data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogGroup withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Displays whether this log group has a protection policy, or whether it had one in the past. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDataProtectionPolicy.html"
     * >PutDataProtectionPolicy</a>.
     * </p>
     * 
     * @param dataProtectionStatus
     *        Displays whether this log group has a protection policy, or whether it had one in the past. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDataProtectionPolicy.html"
     *        >PutDataProtectionPolicy</a>.
     * @see DataProtectionStatus
     */

    public void setDataProtectionStatus(String dataProtectionStatus) {
        this.dataProtectionStatus = dataProtectionStatus;
    }

    /**
     * <p>
     * Displays whether this log group has a protection policy, or whether it had one in the past. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDataProtectionPolicy.html"
     * >PutDataProtectionPolicy</a>.
     * </p>
     * 
     * @return Displays whether this log group has a protection policy, or whether it had one in the past. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDataProtectionPolicy.html"
     *         >PutDataProtectionPolicy</a>.
     * @see DataProtectionStatus
     */

    public String getDataProtectionStatus() {
        return this.dataProtectionStatus;
    }

    /**
     * <p>
     * Displays whether this log group has a protection policy, or whether it had one in the past. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDataProtectionPolicy.html"
     * >PutDataProtectionPolicy</a>.
     * </p>
     * 
     * @param dataProtectionStatus
     *        Displays whether this log group has a protection policy, or whether it had one in the past. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDataProtectionPolicy.html"
     *        >PutDataProtectionPolicy</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataProtectionStatus
     */

    public LogGroup withDataProtectionStatus(String dataProtectionStatus) {
        setDataProtectionStatus(dataProtectionStatus);
        return this;
    }

    /**
     * <p>
     * Displays whether this log group has a protection policy, or whether it had one in the past. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDataProtectionPolicy.html"
     * >PutDataProtectionPolicy</a>.
     * </p>
     * 
     * @param dataProtectionStatus
     *        Displays whether this log group has a protection policy, or whether it had one in the past. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDataProtectionPolicy.html"
     *        >PutDataProtectionPolicy</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataProtectionStatus
     */

    public LogGroup withDataProtectionStatus(DataProtectionStatus dataProtectionStatus) {
        this.dataProtectionStatus = dataProtectionStatus.toString();
        return this;
    }

    /**
     * <p>
     * Displays all the properties that this log group has inherited from account-level settings.
     * </p>
     * 
     * @return Displays all the properties that this log group has inherited from account-level settings.
     * @see InheritedProperty
     */

    public java.util.List<String> getInheritedProperties() {
        if (inheritedProperties == null) {
            inheritedProperties = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return inheritedProperties;
    }

    /**
     * <p>
     * Displays all the properties that this log group has inherited from account-level settings.
     * </p>
     * 
     * @param inheritedProperties
     *        Displays all the properties that this log group has inherited from account-level settings.
     * @see InheritedProperty
     */

    public void setInheritedProperties(java.util.Collection<String> inheritedProperties) {
        if (inheritedProperties == null) {
            this.inheritedProperties = null;
            return;
        }

        this.inheritedProperties = new com.amazonaws.internal.SdkInternalList<String>(inheritedProperties);
    }

    /**
     * <p>
     * Displays all the properties that this log group has inherited from account-level settings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInheritedProperties(java.util.Collection)} or {@link #withInheritedProperties(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param inheritedProperties
     *        Displays all the properties that this log group has inherited from account-level settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InheritedProperty
     */

    public LogGroup withInheritedProperties(String... inheritedProperties) {
        if (this.inheritedProperties == null) {
            setInheritedProperties(new com.amazonaws.internal.SdkInternalList<String>(inheritedProperties.length));
        }
        for (String ele : inheritedProperties) {
            this.inheritedProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Displays all the properties that this log group has inherited from account-level settings.
     * </p>
     * 
     * @param inheritedProperties
     *        Displays all the properties that this log group has inherited from account-level settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InheritedProperty
     */

    public LogGroup withInheritedProperties(java.util.Collection<String> inheritedProperties) {
        setInheritedProperties(inheritedProperties);
        return this;
    }

    /**
     * <p>
     * Displays all the properties that this log group has inherited from account-level settings.
     * </p>
     * 
     * @param inheritedProperties
     *        Displays all the properties that this log group has inherited from account-level settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InheritedProperty
     */

    public LogGroup withInheritedProperties(InheritedProperty... inheritedProperties) {
        com.amazonaws.internal.SdkInternalList<String> inheritedPropertiesCopy = new com.amazonaws.internal.SdkInternalList<String>(inheritedProperties.length);
        for (InheritedProperty value : inheritedProperties) {
            inheritedPropertiesCopy.add(value.toString());
        }
        if (getInheritedProperties() == null) {
            setInheritedProperties(inheritedPropertiesCopy);
        } else {
            getInheritedProperties().addAll(inheritedPropertiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * This specifies the log group class for this log group. There are two classes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>Standard</code> log class supports all CloudWatch Logs features.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Infrequent Access</code> log class supports a subset of CloudWatch Logs features and incurs lower
     * costs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For details about the features supported by each class, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch_Logs_Log_Classes.html">Log classes</a>
     * </p>
     * 
     * @param logGroupClass
     *        This specifies the log group class for this log group. There are two classes:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The <code>Standard</code> log class supports all CloudWatch Logs features.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>Infrequent Access</code> log class supports a subset of CloudWatch Logs features and incurs
     *        lower costs.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For details about the features supported by each class, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch_Logs_Log_Classes.html">Log
     *        classes</a>
     * @see LogGroupClass
     */

    public void setLogGroupClass(String logGroupClass) {
        this.logGroupClass = logGroupClass;
    }

    /**
     * <p>
     * This specifies the log group class for this log group. There are two classes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>Standard</code> log class supports all CloudWatch Logs features.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Infrequent Access</code> log class supports a subset of CloudWatch Logs features and incurs lower
     * costs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For details about the features supported by each class, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch_Logs_Log_Classes.html">Log classes</a>
     * </p>
     * 
     * @return This specifies the log group class for this log group. There are two classes:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>Standard</code> log class supports all CloudWatch Logs features.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>Infrequent Access</code> log class supports a subset of CloudWatch Logs features and incurs
     *         lower costs.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For details about the features supported by each class, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch_Logs_Log_Classes.html">Log
     *         classes</a>
     * @see LogGroupClass
     */

    public String getLogGroupClass() {
        return this.logGroupClass;
    }

    /**
     * <p>
     * This specifies the log group class for this log group. There are two classes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>Standard</code> log class supports all CloudWatch Logs features.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Infrequent Access</code> log class supports a subset of CloudWatch Logs features and incurs lower
     * costs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For details about the features supported by each class, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch_Logs_Log_Classes.html">Log classes</a>
     * </p>
     * 
     * @param logGroupClass
     *        This specifies the log group class for this log group. There are two classes:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The <code>Standard</code> log class supports all CloudWatch Logs features.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>Infrequent Access</code> log class supports a subset of CloudWatch Logs features and incurs
     *        lower costs.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For details about the features supported by each class, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch_Logs_Log_Classes.html">Log
     *        classes</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogGroupClass
     */

    public LogGroup withLogGroupClass(String logGroupClass) {
        setLogGroupClass(logGroupClass);
        return this;
    }

    /**
     * <p>
     * This specifies the log group class for this log group. There are two classes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>Standard</code> log class supports all CloudWatch Logs features.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Infrequent Access</code> log class supports a subset of CloudWatch Logs features and incurs lower
     * costs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For details about the features supported by each class, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch_Logs_Log_Classes.html">Log classes</a>
     * </p>
     * 
     * @param logGroupClass
     *        This specifies the log group class for this log group. There are two classes:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The <code>Standard</code> log class supports all CloudWatch Logs features.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>Infrequent Access</code> log class supports a subset of CloudWatch Logs features and incurs
     *        lower costs.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For details about the features supported by each class, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch_Logs_Log_Classes.html">Log
     *        classes</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogGroupClass
     */

    public LogGroup withLogGroupClass(LogGroupClass logGroupClass) {
        this.logGroupClass = logGroupClass.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log group. This version of the ARN doesn't include a trailing
     * <code>:*</code> after the log group name.
     * </p>
     * <p>
     * Use this version to refer to the ARN in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In the <code>logGroupIdentifier</code> input field in many CloudWatch Logs APIs.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the <code>resourceArn</code> field in tagging APIs
     * </p>
     * </li>
     * <li>
     * <p>
     * In IAM policies, when specifying permissions for <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_TagResource.html">TagResource</a>,
     * <a href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UntagResource.html">
     * UntagResource</a>, and <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListTagsForResource.html"
     * >ListTagsForResource</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param logGroupArn
     *        The Amazon Resource Name (ARN) of the log group. This version of the ARN doesn't include a trailing
     *        <code>:*</code> after the log group name. </p>
     *        <p>
     *        Use this version to refer to the ARN in the following situations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        In the <code>logGroupIdentifier</code> input field in many CloudWatch Logs APIs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the <code>resourceArn</code> field in tagging APIs
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In IAM policies, when specifying permissions for <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_TagResource.html"
     *        >TagResource</a>, <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UntagResource.html"
     *        >UntagResource</a>, and <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListTagsForResource.html"
     *        >ListTagsForResource</a>.
     *        </p>
     *        </li>
     */

    public void setLogGroupArn(String logGroupArn) {
        this.logGroupArn = logGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log group. This version of the ARN doesn't include a trailing
     * <code>:*</code> after the log group name.
     * </p>
     * <p>
     * Use this version to refer to the ARN in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In the <code>logGroupIdentifier</code> input field in many CloudWatch Logs APIs.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the <code>resourceArn</code> field in tagging APIs
     * </p>
     * </li>
     * <li>
     * <p>
     * In IAM policies, when specifying permissions for <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_TagResource.html">TagResource</a>,
     * <a href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UntagResource.html">
     * UntagResource</a>, and <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListTagsForResource.html"
     * >ListTagsForResource</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of the log group. This version of the ARN doesn't include a trailing
     *         <code>:*</code> after the log group name. </p>
     *         <p>
     *         Use this version to refer to the ARN in the following situations:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         In the <code>logGroupIdentifier</code> input field in many CloudWatch Logs APIs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In the <code>resourceArn</code> field in tagging APIs
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In IAM policies, when specifying permissions for <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_TagResource.html"
     *         >TagResource</a>, <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UntagResource.html"
     *         >UntagResource</a>, and <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListTagsForResource.html"
     *         >ListTagsForResource</a>.
     *         </p>
     *         </li>
     */

    public String getLogGroupArn() {
        return this.logGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log group. This version of the ARN doesn't include a trailing
     * <code>:*</code> after the log group name.
     * </p>
     * <p>
     * Use this version to refer to the ARN in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In the <code>logGroupIdentifier</code> input field in many CloudWatch Logs APIs.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the <code>resourceArn</code> field in tagging APIs
     * </p>
     * </li>
     * <li>
     * <p>
     * In IAM policies, when specifying permissions for <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_TagResource.html">TagResource</a>,
     * <a href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UntagResource.html">
     * UntagResource</a>, and <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListTagsForResource.html"
     * >ListTagsForResource</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param logGroupArn
     *        The Amazon Resource Name (ARN) of the log group. This version of the ARN doesn't include a trailing
     *        <code>:*</code> after the log group name. </p>
     *        <p>
     *        Use this version to refer to the ARN in the following situations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        In the <code>logGroupIdentifier</code> input field in many CloudWatch Logs APIs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the <code>resourceArn</code> field in tagging APIs
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In IAM policies, when specifying permissions for <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_TagResource.html"
     *        >TagResource</a>, <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UntagResource.html"
     *        >UntagResource</a>, and <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListTagsForResource.html"
     *        >ListTagsForResource</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogGroup withLogGroupArn(String logGroupArn) {
        setLogGroupArn(logGroupArn);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getRetentionInDays() != null)
            sb.append("RetentionInDays: ").append(getRetentionInDays()).append(",");
        if (getMetricFilterCount() != null)
            sb.append("MetricFilterCount: ").append(getMetricFilterCount()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getStoredBytes() != null)
            sb.append("StoredBytes: ").append(getStoredBytes()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getDataProtectionStatus() != null)
            sb.append("DataProtectionStatus: ").append(getDataProtectionStatus()).append(",");
        if (getInheritedProperties() != null)
            sb.append("InheritedProperties: ").append(getInheritedProperties()).append(",");
        if (getLogGroupClass() != null)
            sb.append("LogGroupClass: ").append(getLogGroupClass()).append(",");
        if (getLogGroupArn() != null)
            sb.append("LogGroupArn: ").append(getLogGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogGroup == false)
            return false;
        LogGroup other = (LogGroup) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getRetentionInDays() == null ^ this.getRetentionInDays() == null)
            return false;
        if (other.getRetentionInDays() != null && other.getRetentionInDays().equals(this.getRetentionInDays()) == false)
            return false;
        if (other.getMetricFilterCount() == null ^ this.getMetricFilterCount() == null)
            return false;
        if (other.getMetricFilterCount() != null && other.getMetricFilterCount().equals(this.getMetricFilterCount()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStoredBytes() == null ^ this.getStoredBytes() == null)
            return false;
        if (other.getStoredBytes() != null && other.getStoredBytes().equals(this.getStoredBytes()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getDataProtectionStatus() == null ^ this.getDataProtectionStatus() == null)
            return false;
        if (other.getDataProtectionStatus() != null && other.getDataProtectionStatus().equals(this.getDataProtectionStatus()) == false)
            return false;
        if (other.getInheritedProperties() == null ^ this.getInheritedProperties() == null)
            return false;
        if (other.getInheritedProperties() != null && other.getInheritedProperties().equals(this.getInheritedProperties()) == false)
            return false;
        if (other.getLogGroupClass() == null ^ this.getLogGroupClass() == null)
            return false;
        if (other.getLogGroupClass() != null && other.getLogGroupClass().equals(this.getLogGroupClass()) == false)
            return false;
        if (other.getLogGroupArn() == null ^ this.getLogGroupArn() == null)
            return false;
        if (other.getLogGroupArn() != null && other.getLogGroupArn().equals(this.getLogGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getRetentionInDays() == null) ? 0 : getRetentionInDays().hashCode());
        hashCode = prime * hashCode + ((getMetricFilterCount() == null) ? 0 : getMetricFilterCount().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStoredBytes() == null) ? 0 : getStoredBytes().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getDataProtectionStatus() == null) ? 0 : getDataProtectionStatus().hashCode());
        hashCode = prime * hashCode + ((getInheritedProperties() == null) ? 0 : getInheritedProperties().hashCode());
        hashCode = prime * hashCode + ((getLogGroupClass() == null) ? 0 : getLogGroupClass().hashCode());
        hashCode = prime * hashCode + ((getLogGroupArn() == null) ? 0 : getLogGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public LogGroup clone() {
        try {
            return (LogGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.LogGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
