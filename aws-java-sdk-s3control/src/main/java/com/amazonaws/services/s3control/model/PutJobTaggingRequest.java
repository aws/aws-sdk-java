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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutJobTagging" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutJobTaggingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The account ID for the Amazon Web Services account associated with the Amazon S3 batch operations job you want to
     * replace tags on.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The ID for the job whose tags you want to replace.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The set of tags to associate with the job.
     * </p>
     */
    private java.util.List<S3Tag> tags;

    /**
     * <p>
     * The account ID for the Amazon Web Services account associated with the Amazon S3 batch operations job you want to
     * replace tags on.
     * </p>
     * 
     * @param accountId
     *        The account ID for the Amazon Web Services account associated with the Amazon S3 batch operations job you
     *        want to replace tags on.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID for the Amazon Web Services account associated with the Amazon S3 batch operations job you want to
     * replace tags on.
     * </p>
     * 
     * @return The account ID for the Amazon Web Services account associated with the Amazon S3 batch operations job you
     *         want to replace tags on.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID for the Amazon Web Services account associated with the Amazon S3 batch operations job you want to
     * replace tags on.
     * </p>
     * 
     * @param accountId
     *        The account ID for the Amazon Web Services account associated with the Amazon S3 batch operations job you
     *        want to replace tags on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutJobTaggingRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The ID for the job whose tags you want to replace.
     * </p>
     * 
     * @param jobId
     *        The ID for the job whose tags you want to replace.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID for the job whose tags you want to replace.
     * </p>
     * 
     * @return The ID for the job whose tags you want to replace.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID for the job whose tags you want to replace.
     * </p>
     * 
     * @param jobId
     *        The ID for the job whose tags you want to replace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutJobTaggingRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The set of tags to associate with the job.
     * </p>
     * 
     * @return The set of tags to associate with the job.
     */

    public java.util.List<S3Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The set of tags to associate with the job.
     * </p>
     * 
     * @param tags
     *        The set of tags to associate with the job.
     */

    public void setTags(java.util.Collection<S3Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<S3Tag>(tags);
    }

    /**
     * <p>
     * The set of tags to associate with the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The set of tags to associate with the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutJobTaggingRequest withTags(S3Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<S3Tag>(tags.length));
        }
        for (S3Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The set of tags to associate with the job.
     * </p>
     * 
     * @param tags
     *        The set of tags to associate with the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutJobTaggingRequest withTags(java.util.Collection<S3Tag> tags) {
        setTags(tags);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutJobTaggingRequest == false)
            return false;
        PutJobTaggingRequest other = (PutJobTaggingRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutJobTaggingRequest clone() {
        return (PutJobTaggingRequest) super.clone();
    }

}
