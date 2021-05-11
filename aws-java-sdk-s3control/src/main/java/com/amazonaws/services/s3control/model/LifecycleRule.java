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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The container for the Outposts bucket lifecycle rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/LifecycleRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecycleRule implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the expiration for the lifecycle of the object in the form of date, days and, whether the object has a
     * delete marker.
     * </p>
     */
    private LifecycleExpiration expiration;
    /**
     * <p>
     * Unique identifier for the rule. The value cannot be longer than 255 characters.
     * </p>
     */
    private String iD;
    /**
     * <p>
     * The container for the filter of lifecycle rule.
     * </p>
     */
    private LifecycleRuleFilter filter;
    /**
     * <p>
     * If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies when an Amazon S3 object transitions to a specified storage class.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     */
    private java.util.List<Transition> transitions;
    /**
     * <p>
     * Specifies the transition rule for the lifecycle rule that describes when noncurrent objects transition to a
     * specific storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this
     * action to request that Amazon S3 transition noncurrent object versions to a specific storage class at a set
     * period in the object's lifetime.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     */
    private java.util.List<NoncurrentVersionTransition> noncurrentVersionTransitions;
    /**
     * <p>
     * The noncurrent version expiration of the lifecycle rule.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     */
    private NoncurrentVersionExpiration noncurrentVersionExpiration;
    /**
     * <p>
     * Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 waits before permanently
     * removing all parts of the upload. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config">
     * Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     */
    private AbortIncompleteMultipartUpload abortIncompleteMultipartUpload;

    /**
     * <p>
     * Specifies the expiration for the lifecycle of the object in the form of date, days and, whether the object has a
     * delete marker.
     * </p>
     * 
     * @param expiration
     *        Specifies the expiration for the lifecycle of the object in the form of date, days and, whether the object
     *        has a delete marker.
     */

    public void setExpiration(LifecycleExpiration expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * Specifies the expiration for the lifecycle of the object in the form of date, days and, whether the object has a
     * delete marker.
     * </p>
     * 
     * @return Specifies the expiration for the lifecycle of the object in the form of date, days and, whether the
     *         object has a delete marker.
     */

    public LifecycleExpiration getExpiration() {
        return this.expiration;
    }

    /**
     * <p>
     * Specifies the expiration for the lifecycle of the object in the form of date, days and, whether the object has a
     * delete marker.
     * </p>
     * 
     * @param expiration
     *        Specifies the expiration for the lifecycle of the object in the form of date, days and, whether the object
     *        has a delete marker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleRule withExpiration(LifecycleExpiration expiration) {
        setExpiration(expiration);
        return this;
    }

    /**
     * <p>
     * Unique identifier for the rule. The value cannot be longer than 255 characters.
     * </p>
     * 
     * @param iD
     *        Unique identifier for the rule. The value cannot be longer than 255 characters.
     */

    public void setID(String iD) {
        this.iD = iD;
    }

    /**
     * <p>
     * Unique identifier for the rule. The value cannot be longer than 255 characters.
     * </p>
     * 
     * @return Unique identifier for the rule. The value cannot be longer than 255 characters.
     */

    public String getID() {
        return this.iD;
    }

    /**
     * <p>
     * Unique identifier for the rule. The value cannot be longer than 255 characters.
     * </p>
     * 
     * @param iD
     *        Unique identifier for the rule. The value cannot be longer than 255 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleRule withID(String iD) {
        setID(iD);
        return this;
    }

    /**
     * <p>
     * The container for the filter of lifecycle rule.
     * </p>
     * 
     * @param filter
     *        The container for the filter of lifecycle rule.
     */

    public void setFilter(LifecycleRuleFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The container for the filter of lifecycle rule.
     * </p>
     * 
     * @return The container for the filter of lifecycle rule.
     */

    public LifecycleRuleFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * The container for the filter of lifecycle rule.
     * </p>
     * 
     * @param filter
     *        The container for the filter of lifecycle rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleRule withFilter(LifecycleRuleFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.
     * </p>
     * 
     * @param status
     *        If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.
     * @see ExpirationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.
     * </p>
     * 
     * @return If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being
     *         applied.
     * @see ExpirationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.
     * </p>
     * 
     * @param status
     *        If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExpirationStatus
     */

    public LifecycleRule withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.
     * </p>
     * 
     * @param status
     *        If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExpirationStatus
     */

    public LifecycleRule withStatus(ExpirationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies when an Amazon S3 object transitions to a specified storage class.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return Specifies when an Amazon S3 object transitions to a specified storage class.</p> <note>
     *         <p>
     *         This is not supported by Amazon S3 on Outposts buckets.
     *         </p>
     */

    public java.util.List<Transition> getTransitions() {
        return transitions;
    }

    /**
     * <p>
     * Specifies when an Amazon S3 object transitions to a specified storage class.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param transitions
     *        Specifies when an Amazon S3 object transitions to a specified storage class.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     */

    public void setTransitions(java.util.Collection<Transition> transitions) {
        if (transitions == null) {
            this.transitions = null;
            return;
        }

        this.transitions = new java.util.ArrayList<Transition>(transitions);
    }

    /**
     * <p>
     * Specifies when an Amazon S3 object transitions to a specified storage class.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransitions(java.util.Collection)} or {@link #withTransitions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param transitions
     *        Specifies when an Amazon S3 object transitions to a specified storage class.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleRule withTransitions(Transition... transitions) {
        if (this.transitions == null) {
            setTransitions(new java.util.ArrayList<Transition>(transitions.length));
        }
        for (Transition ele : transitions) {
            this.transitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies when an Amazon S3 object transitions to a specified storage class.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param transitions
     *        Specifies when an Amazon S3 object transitions to a specified storage class.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleRule withTransitions(java.util.Collection<Transition> transitions) {
        setTransitions(transitions);
        return this;
    }

    /**
     * <p>
     * Specifies the transition rule for the lifecycle rule that describes when noncurrent objects transition to a
     * specific storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this
     * action to request that Amazon S3 transition noncurrent object versions to a specific storage class at a set
     * period in the object's lifetime.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return Specifies the transition rule for the lifecycle rule that describes when noncurrent objects transition to
     *         a specific storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set
     *         this action to request that Amazon S3 transition noncurrent object versions to a specific storage class
     *         at a set period in the object's lifetime. </p> <note>
     *         <p>
     *         This is not supported by Amazon S3 on Outposts buckets.
     *         </p>
     */

    public java.util.List<NoncurrentVersionTransition> getNoncurrentVersionTransitions() {
        return noncurrentVersionTransitions;
    }

    /**
     * <p>
     * Specifies the transition rule for the lifecycle rule that describes when noncurrent objects transition to a
     * specific storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this
     * action to request that Amazon S3 transition noncurrent object versions to a specific storage class at a set
     * period in the object's lifetime.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param noncurrentVersionTransitions
     *        Specifies the transition rule for the lifecycle rule that describes when noncurrent objects transition to
     *        a specific storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set
     *        this action to request that Amazon S3 transition noncurrent object versions to a specific storage class at
     *        a set period in the object's lifetime. </p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     */

    public void setNoncurrentVersionTransitions(java.util.Collection<NoncurrentVersionTransition> noncurrentVersionTransitions) {
        if (noncurrentVersionTransitions == null) {
            this.noncurrentVersionTransitions = null;
            return;
        }

        this.noncurrentVersionTransitions = new java.util.ArrayList<NoncurrentVersionTransition>(noncurrentVersionTransitions);
    }

    /**
     * <p>
     * Specifies the transition rule for the lifecycle rule that describes when noncurrent objects transition to a
     * specific storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this
     * action to request that Amazon S3 transition noncurrent object versions to a specific storage class at a set
     * period in the object's lifetime.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNoncurrentVersionTransitions(java.util.Collection)} or
     * {@link #withNoncurrentVersionTransitions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param noncurrentVersionTransitions
     *        Specifies the transition rule for the lifecycle rule that describes when noncurrent objects transition to
     *        a specific storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set
     *        this action to request that Amazon S3 transition noncurrent object versions to a specific storage class at
     *        a set period in the object's lifetime. </p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleRule withNoncurrentVersionTransitions(NoncurrentVersionTransition... noncurrentVersionTransitions) {
        if (this.noncurrentVersionTransitions == null) {
            setNoncurrentVersionTransitions(new java.util.ArrayList<NoncurrentVersionTransition>(noncurrentVersionTransitions.length));
        }
        for (NoncurrentVersionTransition ele : noncurrentVersionTransitions) {
            this.noncurrentVersionTransitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the transition rule for the lifecycle rule that describes when noncurrent objects transition to a
     * specific storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this
     * action to request that Amazon S3 transition noncurrent object versions to a specific storage class at a set
     * period in the object's lifetime.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param noncurrentVersionTransitions
     *        Specifies the transition rule for the lifecycle rule that describes when noncurrent objects transition to
     *        a specific storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set
     *        this action to request that Amazon S3 transition noncurrent object versions to a specific storage class at
     *        a set period in the object's lifetime. </p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleRule withNoncurrentVersionTransitions(java.util.Collection<NoncurrentVersionTransition> noncurrentVersionTransitions) {
        setNoncurrentVersionTransitions(noncurrentVersionTransitions);
        return this;
    }

    /**
     * <p>
     * The noncurrent version expiration of the lifecycle rule.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param noncurrentVersionExpiration
     *        The noncurrent version expiration of the lifecycle rule.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     */

    public void setNoncurrentVersionExpiration(NoncurrentVersionExpiration noncurrentVersionExpiration) {
        this.noncurrentVersionExpiration = noncurrentVersionExpiration;
    }

    /**
     * <p>
     * The noncurrent version expiration of the lifecycle rule.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return The noncurrent version expiration of the lifecycle rule.</p> <note>
     *         <p>
     *         This is not supported by Amazon S3 on Outposts buckets.
     *         </p>
     */

    public NoncurrentVersionExpiration getNoncurrentVersionExpiration() {
        return this.noncurrentVersionExpiration;
    }

    /**
     * <p>
     * The noncurrent version expiration of the lifecycle rule.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param noncurrentVersionExpiration
     *        The noncurrent version expiration of the lifecycle rule.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleRule withNoncurrentVersionExpiration(NoncurrentVersionExpiration noncurrentVersionExpiration) {
        setNoncurrentVersionExpiration(noncurrentVersionExpiration);
        return this;
    }

    /**
     * <p>
     * Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 waits before permanently
     * removing all parts of the upload. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config">
     * Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param abortIncompleteMultipartUpload
     *        Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 waits before
     *        permanently removing all parts of the upload. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     *        > Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy</a> in the <i>Amazon S3 User
     *        Guide</i>.
     */

    public void setAbortIncompleteMultipartUpload(AbortIncompleteMultipartUpload abortIncompleteMultipartUpload) {
        this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
    }

    /**
     * <p>
     * Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 waits before permanently
     * removing all parts of the upload. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config">
     * Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 waits before
     *         permanently removing all parts of the upload. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     *         > Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy</a> in the <i>Amazon S3 User
     *         Guide</i>.
     */

    public AbortIncompleteMultipartUpload getAbortIncompleteMultipartUpload() {
        return this.abortIncompleteMultipartUpload;
    }

    /**
     * <p>
     * Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 waits before permanently
     * removing all parts of the upload. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config">
     * Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param abortIncompleteMultipartUpload
     *        Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 waits before
     *        permanently removing all parts of the upload. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     *        > Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy</a> in the <i>Amazon S3 User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleRule withAbortIncompleteMultipartUpload(AbortIncompleteMultipartUpload abortIncompleteMultipartUpload) {
        setAbortIncompleteMultipartUpload(abortIncompleteMultipartUpload);
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
        if (getExpiration() != null)
            sb.append("Expiration: ").append(getExpiration()).append(",");
        if (getID() != null)
            sb.append("ID: ").append(getID()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTransitions() != null)
            sb.append("Transitions: ").append(getTransitions()).append(",");
        if (getNoncurrentVersionTransitions() != null)
            sb.append("NoncurrentVersionTransitions: ").append(getNoncurrentVersionTransitions()).append(",");
        if (getNoncurrentVersionExpiration() != null)
            sb.append("NoncurrentVersionExpiration: ").append(getNoncurrentVersionExpiration()).append(",");
        if (getAbortIncompleteMultipartUpload() != null)
            sb.append("AbortIncompleteMultipartUpload: ").append(getAbortIncompleteMultipartUpload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecycleRule == false)
            return false;
        LifecycleRule other = (LifecycleRule) obj;
        if (other.getExpiration() == null ^ this.getExpiration() == null)
            return false;
        if (other.getExpiration() != null && other.getExpiration().equals(this.getExpiration()) == false)
            return false;
        if (other.getID() == null ^ this.getID() == null)
            return false;
        if (other.getID() != null && other.getID().equals(this.getID()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTransitions() == null ^ this.getTransitions() == null)
            return false;
        if (other.getTransitions() != null && other.getTransitions().equals(this.getTransitions()) == false)
            return false;
        if (other.getNoncurrentVersionTransitions() == null ^ this.getNoncurrentVersionTransitions() == null)
            return false;
        if (other.getNoncurrentVersionTransitions() != null && other.getNoncurrentVersionTransitions().equals(this.getNoncurrentVersionTransitions()) == false)
            return false;
        if (other.getNoncurrentVersionExpiration() == null ^ this.getNoncurrentVersionExpiration() == null)
            return false;
        if (other.getNoncurrentVersionExpiration() != null && other.getNoncurrentVersionExpiration().equals(this.getNoncurrentVersionExpiration()) == false)
            return false;
        if (other.getAbortIncompleteMultipartUpload() == null ^ this.getAbortIncompleteMultipartUpload() == null)
            return false;
        if (other.getAbortIncompleteMultipartUpload() != null
                && other.getAbortIncompleteMultipartUpload().equals(this.getAbortIncompleteMultipartUpload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode());
        hashCode = prime * hashCode + ((getID() == null) ? 0 : getID().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTransitions() == null) ? 0 : getTransitions().hashCode());
        hashCode = prime * hashCode + ((getNoncurrentVersionTransitions() == null) ? 0 : getNoncurrentVersionTransitions().hashCode());
        hashCode = prime * hashCode + ((getNoncurrentVersionExpiration() == null) ? 0 : getNoncurrentVersionExpiration().hashCode());
        hashCode = prime * hashCode + ((getAbortIncompleteMultipartUpload() == null) ? 0 : getAbortIncompleteMultipartUpload().hashCode());
        return hashCode;
    }

    @Override
    public LifecycleRule clone() {
        try {
            return (LifecycleRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
