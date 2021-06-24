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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration for a lifecycle rule.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketBucketLifecycleConfigurationRulesDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketBucketLifecycleConfigurationRulesDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * How Amazon S3 responds when a multipart upload is incomplete. Specifically, provides a number of days before
     * Amazon S3 cancels the entire upload.
     * </p>
     */
    private AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails abortIncompleteMultipartUpload;
    /**
     * <p>
     * The date when objects are moved or deleted.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String expirationDate;
    /**
     * <p>
     * The length in days of the lifetime for objects that are subject to the rule.
     * </p>
     */
    private Integer expirationInDays;
    /**
     * <p>
     * Whether Amazon S3 removes a delete marker that has no noncurrent versions. If set to <code>true</code>, the
     * delete marker is expired. If set to <code>false</code>, the policy takes no action.
     * </p>
     * <p>
     * If you provide <code>ExpiredObjectDeleteMarker</code>, you cannot provide <code>ExpirationInDays</code> or
     * <code>ExpirationDate</code>.
     * </p>
     */
    private Boolean expiredObjectDeleteMarker;
    /**
     * <p>
     * Identifies the objects that a rule applies to.
     * </p>
     */
    private AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails filter;
    /**
     * <p>
     * The unique identifier of the rule.
     * </p>
     */
    private String iD;
    /**
     * <p>
     * The number of days that an object is noncurrent before Amazon S3 can perform the associated action.
     * </p>
     */
    private Integer noncurrentVersionExpirationInDays;
    /**
     * <p>
     * Transition rules that describe when noncurrent objects transition to a specified storage class.
     * </p>
     */
    private java.util.List<AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails> noncurrentVersionTransitions;
    /**
     * <p>
     * A prefix that identifies one or more objects that the rule applies to.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * The current status of the rule. Indicates whether the rule is currently being applied.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Transition rules that indicate when objects transition to a specified storage class.
     * </p>
     */
    private java.util.List<AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails> transitions;

    /**
     * <p>
     * How Amazon S3 responds when a multipart upload is incomplete. Specifically, provides a number of days before
     * Amazon S3 cancels the entire upload.
     * </p>
     * 
     * @param abortIncompleteMultipartUpload
     *        How Amazon S3 responds when a multipart upload is incomplete. Specifically, provides a number of days
     *        before Amazon S3 cancels the entire upload.
     */

    public void setAbortIncompleteMultipartUpload(
            AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails abortIncompleteMultipartUpload) {
        this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
    }

    /**
     * <p>
     * How Amazon S3 responds when a multipart upload is incomplete. Specifically, provides a number of days before
     * Amazon S3 cancels the entire upload.
     * </p>
     * 
     * @return How Amazon S3 responds when a multipart upload is incomplete. Specifically, provides a number of days
     *         before Amazon S3 cancels the entire upload.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails getAbortIncompleteMultipartUpload() {
        return this.abortIncompleteMultipartUpload;
    }

    /**
     * <p>
     * How Amazon S3 responds when a multipart upload is incomplete. Specifically, provides a number of days before
     * Amazon S3 cancels the entire upload.
     * </p>
     * 
     * @param abortIncompleteMultipartUpload
     *        How Amazon S3 responds when a multipart upload is incomplete. Specifically, provides a number of days
     *        before Amazon S3 cancels the entire upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesDetails withAbortIncompleteMultipartUpload(
            AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails abortIncompleteMultipartUpload) {
        setAbortIncompleteMultipartUpload(abortIncompleteMultipartUpload);
        return this;
    }

    /**
     * <p>
     * The date when objects are moved or deleted.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param expirationDate
     *        The date when objects are moved or deleted.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The date when objects are moved or deleted.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return The date when objects are moved or deleted.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * <p>
     * The date when objects are moved or deleted.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param expirationDate
     *        The date when objects are moved or deleted.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesDetails withExpirationDate(String expirationDate) {
        setExpirationDate(expirationDate);
        return this;
    }

    /**
     * <p>
     * The length in days of the lifetime for objects that are subject to the rule.
     * </p>
     * 
     * @param expirationInDays
     *        The length in days of the lifetime for objects that are subject to the rule.
     */

    public void setExpirationInDays(Integer expirationInDays) {
        this.expirationInDays = expirationInDays;
    }

    /**
     * <p>
     * The length in days of the lifetime for objects that are subject to the rule.
     * </p>
     * 
     * @return The length in days of the lifetime for objects that are subject to the rule.
     */

    public Integer getExpirationInDays() {
        return this.expirationInDays;
    }

    /**
     * <p>
     * The length in days of the lifetime for objects that are subject to the rule.
     * </p>
     * 
     * @param expirationInDays
     *        The length in days of the lifetime for objects that are subject to the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesDetails withExpirationInDays(Integer expirationInDays) {
        setExpirationInDays(expirationInDays);
        return this;
    }

    /**
     * <p>
     * Whether Amazon S3 removes a delete marker that has no noncurrent versions. If set to <code>true</code>, the
     * delete marker is expired. If set to <code>false</code>, the policy takes no action.
     * </p>
     * <p>
     * If you provide <code>ExpiredObjectDeleteMarker</code>, you cannot provide <code>ExpirationInDays</code> or
     * <code>ExpirationDate</code>.
     * </p>
     * 
     * @param expiredObjectDeleteMarker
     *        Whether Amazon S3 removes a delete marker that has no noncurrent versions. If set to <code>true</code>,
     *        the delete marker is expired. If set to <code>false</code>, the policy takes no action.</p>
     *        <p>
     *        If you provide <code>ExpiredObjectDeleteMarker</code>, you cannot provide <code>ExpirationInDays</code> or
     *        <code>ExpirationDate</code>.
     */

    public void setExpiredObjectDeleteMarker(Boolean expiredObjectDeleteMarker) {
        this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
    }

    /**
     * <p>
     * Whether Amazon S3 removes a delete marker that has no noncurrent versions. If set to <code>true</code>, the
     * delete marker is expired. If set to <code>false</code>, the policy takes no action.
     * </p>
     * <p>
     * If you provide <code>ExpiredObjectDeleteMarker</code>, you cannot provide <code>ExpirationInDays</code> or
     * <code>ExpirationDate</code>.
     * </p>
     * 
     * @return Whether Amazon S3 removes a delete marker that has no noncurrent versions. If set to <code>true</code>,
     *         the delete marker is expired. If set to <code>false</code>, the policy takes no action.</p>
     *         <p>
     *         If you provide <code>ExpiredObjectDeleteMarker</code>, you cannot provide <code>ExpirationInDays</code>
     *         or <code>ExpirationDate</code>.
     */

    public Boolean getExpiredObjectDeleteMarker() {
        return this.expiredObjectDeleteMarker;
    }

    /**
     * <p>
     * Whether Amazon S3 removes a delete marker that has no noncurrent versions. If set to <code>true</code>, the
     * delete marker is expired. If set to <code>false</code>, the policy takes no action.
     * </p>
     * <p>
     * If you provide <code>ExpiredObjectDeleteMarker</code>, you cannot provide <code>ExpirationInDays</code> or
     * <code>ExpirationDate</code>.
     * </p>
     * 
     * @param expiredObjectDeleteMarker
     *        Whether Amazon S3 removes a delete marker that has no noncurrent versions. If set to <code>true</code>,
     *        the delete marker is expired. If set to <code>false</code>, the policy takes no action.</p>
     *        <p>
     *        If you provide <code>ExpiredObjectDeleteMarker</code>, you cannot provide <code>ExpirationInDays</code> or
     *        <code>ExpirationDate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesDetails withExpiredObjectDeleteMarker(Boolean expiredObjectDeleteMarker) {
        setExpiredObjectDeleteMarker(expiredObjectDeleteMarker);
        return this;
    }

    /**
     * <p>
     * Whether Amazon S3 removes a delete marker that has no noncurrent versions. If set to <code>true</code>, the
     * delete marker is expired. If set to <code>false</code>, the policy takes no action.
     * </p>
     * <p>
     * If you provide <code>ExpiredObjectDeleteMarker</code>, you cannot provide <code>ExpirationInDays</code> or
     * <code>ExpirationDate</code>.
     * </p>
     * 
     * @return Whether Amazon S3 removes a delete marker that has no noncurrent versions. If set to <code>true</code>,
     *         the delete marker is expired. If set to <code>false</code>, the policy takes no action.</p>
     *         <p>
     *         If you provide <code>ExpiredObjectDeleteMarker</code>, you cannot provide <code>ExpirationInDays</code>
     *         or <code>ExpirationDate</code>.
     */

    public Boolean isExpiredObjectDeleteMarker() {
        return this.expiredObjectDeleteMarker;
    }

    /**
     * <p>
     * Identifies the objects that a rule applies to.
     * </p>
     * 
     * @param filter
     *        Identifies the objects that a rule applies to.
     */

    public void setFilter(AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Identifies the objects that a rule applies to.
     * </p>
     * 
     * @return Identifies the objects that a rule applies to.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Identifies the objects that a rule applies to.
     * </p>
     * 
     * @param filter
     *        Identifies the objects that a rule applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesDetails withFilter(AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the rule.
     * </p>
     * 
     * @param iD
     *        The unique identifier of the rule.
     */

    public void setID(String iD) {
        this.iD = iD;
    }

    /**
     * <p>
     * The unique identifier of the rule.
     * </p>
     * 
     * @return The unique identifier of the rule.
     */

    public String getID() {
        return this.iD;
    }

    /**
     * <p>
     * The unique identifier of the rule.
     * </p>
     * 
     * @param iD
     *        The unique identifier of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesDetails withID(String iD) {
        setID(iD);
        return this;
    }

    /**
     * <p>
     * The number of days that an object is noncurrent before Amazon S3 can perform the associated action.
     * </p>
     * 
     * @param noncurrentVersionExpirationInDays
     *        The number of days that an object is noncurrent before Amazon S3 can perform the associated action.
     */

    public void setNoncurrentVersionExpirationInDays(Integer noncurrentVersionExpirationInDays) {
        this.noncurrentVersionExpirationInDays = noncurrentVersionExpirationInDays;
    }

    /**
     * <p>
     * The number of days that an object is noncurrent before Amazon S3 can perform the associated action.
     * </p>
     * 
     * @return The number of days that an object is noncurrent before Amazon S3 can perform the associated action.
     */

    public Integer getNoncurrentVersionExpirationInDays() {
        return this.noncurrentVersionExpirationInDays;
    }

    /**
     * <p>
     * The number of days that an object is noncurrent before Amazon S3 can perform the associated action.
     * </p>
     * 
     * @param noncurrentVersionExpirationInDays
     *        The number of days that an object is noncurrent before Amazon S3 can perform the associated action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesDetails withNoncurrentVersionExpirationInDays(Integer noncurrentVersionExpirationInDays) {
        setNoncurrentVersionExpirationInDays(noncurrentVersionExpirationInDays);
        return this;
    }

    /**
     * <p>
     * Transition rules that describe when noncurrent objects transition to a specified storage class.
     * </p>
     * 
     * @return Transition rules that describe when noncurrent objects transition to a specified storage class.
     */

    public java.util.List<AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails> getNoncurrentVersionTransitions() {
        return noncurrentVersionTransitions;
    }

    /**
     * <p>
     * Transition rules that describe when noncurrent objects transition to a specified storage class.
     * </p>
     * 
     * @param noncurrentVersionTransitions
     *        Transition rules that describe when noncurrent objects transition to a specified storage class.
     */

    public void setNoncurrentVersionTransitions(
            java.util.Collection<AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails> noncurrentVersionTransitions) {
        if (noncurrentVersionTransitions == null) {
            this.noncurrentVersionTransitions = null;
            return;
        }

        this.noncurrentVersionTransitions = new java.util.ArrayList<AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails>(
                noncurrentVersionTransitions);
    }

    /**
     * <p>
     * Transition rules that describe when noncurrent objects transition to a specified storage class.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNoncurrentVersionTransitions(java.util.Collection)} or
     * {@link #withNoncurrentVersionTransitions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param noncurrentVersionTransitions
     *        Transition rules that describe when noncurrent objects transition to a specified storage class.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesDetails withNoncurrentVersionTransitions(
            AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails... noncurrentVersionTransitions) {
        if (this.noncurrentVersionTransitions == null) {
            setNoncurrentVersionTransitions(new java.util.ArrayList<AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails>(
                    noncurrentVersionTransitions.length));
        }
        for (AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails ele : noncurrentVersionTransitions) {
            this.noncurrentVersionTransitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Transition rules that describe when noncurrent objects transition to a specified storage class.
     * </p>
     * 
     * @param noncurrentVersionTransitions
     *        Transition rules that describe when noncurrent objects transition to a specified storage class.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesDetails withNoncurrentVersionTransitions(
            java.util.Collection<AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails> noncurrentVersionTransitions) {
        setNoncurrentVersionTransitions(noncurrentVersionTransitions);
        return this;
    }

    /**
     * <p>
     * A prefix that identifies one or more objects that the rule applies to.
     * </p>
     * 
     * @param prefix
     *        A prefix that identifies one or more objects that the rule applies to.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * A prefix that identifies one or more objects that the rule applies to.
     * </p>
     * 
     * @return A prefix that identifies one or more objects that the rule applies to.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * A prefix that identifies one or more objects that the rule applies to.
     * </p>
     * 
     * @param prefix
     *        A prefix that identifies one or more objects that the rule applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesDetails withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * The current status of the rule. Indicates whether the rule is currently being applied.
     * </p>
     * 
     * @param status
     *        The current status of the rule. Indicates whether the rule is currently being applied.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the rule. Indicates whether the rule is currently being applied.
     * </p>
     * 
     * @return The current status of the rule. Indicates whether the rule is currently being applied.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the rule. Indicates whether the rule is currently being applied.
     * </p>
     * 
     * @param status
     *        The current status of the rule. Indicates whether the rule is currently being applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Transition rules that indicate when objects transition to a specified storage class.
     * </p>
     * 
     * @return Transition rules that indicate when objects transition to a specified storage class.
     */

    public java.util.List<AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails> getTransitions() {
        return transitions;
    }

    /**
     * <p>
     * Transition rules that indicate when objects transition to a specified storage class.
     * </p>
     * 
     * @param transitions
     *        Transition rules that indicate when objects transition to a specified storage class.
     */

    public void setTransitions(java.util.Collection<AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails> transitions) {
        if (transitions == null) {
            this.transitions = null;
            return;
        }

        this.transitions = new java.util.ArrayList<AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails>(transitions);
    }

    /**
     * <p>
     * Transition rules that indicate when objects transition to a specified storage class.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransitions(java.util.Collection)} or {@link #withTransitions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param transitions
     *        Transition rules that indicate when objects transition to a specified storage class.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesDetails withTransitions(AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails... transitions) {
        if (this.transitions == null) {
            setTransitions(new java.util.ArrayList<AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails>(transitions.length));
        }
        for (AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails ele : transitions) {
            this.transitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Transition rules that indicate when objects transition to a specified storage class.
     * </p>
     * 
     * @param transitions
     *        Transition rules that indicate when objects transition to a specified storage class.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesDetails withTransitions(
            java.util.Collection<AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails> transitions) {
        setTransitions(transitions);
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
        if (getAbortIncompleteMultipartUpload() != null)
            sb.append("AbortIncompleteMultipartUpload: ").append(getAbortIncompleteMultipartUpload()).append(",");
        if (getExpirationDate() != null)
            sb.append("ExpirationDate: ").append(getExpirationDate()).append(",");
        if (getExpirationInDays() != null)
            sb.append("ExpirationInDays: ").append(getExpirationInDays()).append(",");
        if (getExpiredObjectDeleteMarker() != null)
            sb.append("ExpiredObjectDeleteMarker: ").append(getExpiredObjectDeleteMarker()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getID() != null)
            sb.append("ID: ").append(getID()).append(",");
        if (getNoncurrentVersionExpirationInDays() != null)
            sb.append("NoncurrentVersionExpirationInDays: ").append(getNoncurrentVersionExpirationInDays()).append(",");
        if (getNoncurrentVersionTransitions() != null)
            sb.append("NoncurrentVersionTransitions: ").append(getNoncurrentVersionTransitions()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTransitions() != null)
            sb.append("Transitions: ").append(getTransitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketBucketLifecycleConfigurationRulesDetails == false)
            return false;
        AwsS3BucketBucketLifecycleConfigurationRulesDetails other = (AwsS3BucketBucketLifecycleConfigurationRulesDetails) obj;
        if (other.getAbortIncompleteMultipartUpload() == null ^ this.getAbortIncompleteMultipartUpload() == null)
            return false;
        if (other.getAbortIncompleteMultipartUpload() != null
                && other.getAbortIncompleteMultipartUpload().equals(this.getAbortIncompleteMultipartUpload()) == false)
            return false;
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null && other.getExpirationDate().equals(this.getExpirationDate()) == false)
            return false;
        if (other.getExpirationInDays() == null ^ this.getExpirationInDays() == null)
            return false;
        if (other.getExpirationInDays() != null && other.getExpirationInDays().equals(this.getExpirationInDays()) == false)
            return false;
        if (other.getExpiredObjectDeleteMarker() == null ^ this.getExpiredObjectDeleteMarker() == null)
            return false;
        if (other.getExpiredObjectDeleteMarker() != null && other.getExpiredObjectDeleteMarker().equals(this.getExpiredObjectDeleteMarker()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getID() == null ^ this.getID() == null)
            return false;
        if (other.getID() != null && other.getID().equals(this.getID()) == false)
            return false;
        if (other.getNoncurrentVersionExpirationInDays() == null ^ this.getNoncurrentVersionExpirationInDays() == null)
            return false;
        if (other.getNoncurrentVersionExpirationInDays() != null
                && other.getNoncurrentVersionExpirationInDays().equals(this.getNoncurrentVersionExpirationInDays()) == false)
            return false;
        if (other.getNoncurrentVersionTransitions() == null ^ this.getNoncurrentVersionTransitions() == null)
            return false;
        if (other.getNoncurrentVersionTransitions() != null && other.getNoncurrentVersionTransitions().equals(this.getNoncurrentVersionTransitions()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTransitions() == null ^ this.getTransitions() == null)
            return false;
        if (other.getTransitions() != null && other.getTransitions().equals(this.getTransitions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAbortIncompleteMultipartUpload() == null) ? 0 : getAbortIncompleteMultipartUpload().hashCode());
        hashCode = prime * hashCode + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        hashCode = prime * hashCode + ((getExpirationInDays() == null) ? 0 : getExpirationInDays().hashCode());
        hashCode = prime * hashCode + ((getExpiredObjectDeleteMarker() == null) ? 0 : getExpiredObjectDeleteMarker().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getID() == null) ? 0 : getID().hashCode());
        hashCode = prime * hashCode + ((getNoncurrentVersionExpirationInDays() == null) ? 0 : getNoncurrentVersionExpirationInDays().hashCode());
        hashCode = prime * hashCode + ((getNoncurrentVersionTransitions() == null) ? 0 : getNoncurrentVersionTransitions().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTransitions() == null) ? 0 : getTransitions().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketBucketLifecycleConfigurationRulesDetails clone() {
        try {
            return (AwsS3BucketBucketLifecycleConfigurationRulesDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketBucketLifecycleConfigurationRulesDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
