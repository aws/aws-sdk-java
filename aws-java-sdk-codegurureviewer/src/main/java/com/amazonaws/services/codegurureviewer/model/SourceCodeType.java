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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the source code that is analyzed in a code review.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/SourceCodeType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceCodeType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     * <code>SourceCodeType</code> </a> that specifies a commit diff created by a pull request on an associated
     * repository.
     * </p>
     */
    private CommitDiffSourceCodeType commitDiff;

    private RepositoryHeadSourceCodeType repositoryHead;
    /**
     * <p>
     * A type of <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     * <code>SourceCodeType</code> </a> that specifies a source branch name and a destination branch name in an
     * associated repository.
     * </p>
     */
    private BranchDiffSourceCodeType branchDiff;
    /**
     * <p>
     * Information about an associated repository in an S3 bucket that includes its name and an
     * <code>S3RepositoryDetails</code> object. The <code>S3RepositoryDetails</code> object includes the name of an S3
     * bucket, an S3 key for a source code .zip file, and an S3 key for a build artifacts .zip file.
     * <code>S3BucketRepository</code> is required in <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType"> <code>SourceCodeType</code>
     * </a> for <code>S3BucketRepository</code> based code reviews.
     * </p>
     */
    private S3BucketRepository s3BucketRepository;
    /**
     * <p>
     * Metadata that is associated with a code review. This applies to any type of code review supported by CodeGuru
     * Reviewer. The <code>RequestMetadaa</code> field captures any event metadata. For example, it might capture
     * metadata associated with an event trigger, such as a push or a pull request.
     * </p>
     */
    private RequestMetadata requestMetadata;

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     * <code>SourceCodeType</code> </a> that specifies a commit diff created by a pull request on an associated
     * repository.
     * </p>
     * 
     * @param commitDiff
     *        A <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     *        <code>SourceCodeType</code> </a> that specifies a commit diff created by a pull request on an associated
     *        repository.
     */

    public void setCommitDiff(CommitDiffSourceCodeType commitDiff) {
        this.commitDiff = commitDiff;
    }

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     * <code>SourceCodeType</code> </a> that specifies a commit diff created by a pull request on an associated
     * repository.
     * </p>
     * 
     * @return A <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     *         <code>SourceCodeType</code> </a> that specifies a commit diff created by a pull request on an associated
     *         repository.
     */

    public CommitDiffSourceCodeType getCommitDiff() {
        return this.commitDiff;
    }

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     * <code>SourceCodeType</code> </a> that specifies a commit diff created by a pull request on an associated
     * repository.
     * </p>
     * 
     * @param commitDiff
     *        A <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     *        <code>SourceCodeType</code> </a> that specifies a commit diff created by a pull request on an associated
     *        repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceCodeType withCommitDiff(CommitDiffSourceCodeType commitDiff) {
        setCommitDiff(commitDiff);
        return this;
    }

    /**
     * @param repositoryHead
     */

    public void setRepositoryHead(RepositoryHeadSourceCodeType repositoryHead) {
        this.repositoryHead = repositoryHead;
    }

    /**
     * @return
     */

    public RepositoryHeadSourceCodeType getRepositoryHead() {
        return this.repositoryHead;
    }

    /**
     * @param repositoryHead
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceCodeType withRepositoryHead(RepositoryHeadSourceCodeType repositoryHead) {
        setRepositoryHead(repositoryHead);
        return this;
    }

    /**
     * <p>
     * A type of <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     * <code>SourceCodeType</code> </a> that specifies a source branch name and a destination branch name in an
     * associated repository.
     * </p>
     * 
     * @param branchDiff
     *        A type of <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     *        <code>SourceCodeType</code> </a> that specifies a source branch name and a destination branch name in an
     *        associated repository.
     */

    public void setBranchDiff(BranchDiffSourceCodeType branchDiff) {
        this.branchDiff = branchDiff;
    }

    /**
     * <p>
     * A type of <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     * <code>SourceCodeType</code> </a> that specifies a source branch name and a destination branch name in an
     * associated repository.
     * </p>
     * 
     * @return A type of <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     *         <code>SourceCodeType</code> </a> that specifies a source branch name and a destination branch name in an
     *         associated repository.
     */

    public BranchDiffSourceCodeType getBranchDiff() {
        return this.branchDiff;
    }

    /**
     * <p>
     * A type of <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     * <code>SourceCodeType</code> </a> that specifies a source branch name and a destination branch name in an
     * associated repository.
     * </p>
     * 
     * @param branchDiff
     *        A type of <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     *        <code>SourceCodeType</code> </a> that specifies a source branch name and a destination branch name in an
     *        associated repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceCodeType withBranchDiff(BranchDiffSourceCodeType branchDiff) {
        setBranchDiff(branchDiff);
        return this;
    }

    /**
     * <p>
     * Information about an associated repository in an S3 bucket that includes its name and an
     * <code>S3RepositoryDetails</code> object. The <code>S3RepositoryDetails</code> object includes the name of an S3
     * bucket, an S3 key for a source code .zip file, and an S3 key for a build artifacts .zip file.
     * <code>S3BucketRepository</code> is required in <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType"> <code>SourceCodeType</code>
     * </a> for <code>S3BucketRepository</code> based code reviews.
     * </p>
     * 
     * @param s3BucketRepository
     *        Information about an associated repository in an S3 bucket that includes its name and an
     *        <code>S3RepositoryDetails</code> object. The <code>S3RepositoryDetails</code> object includes the name of
     *        an S3 bucket, an S3 key for a source code .zip file, and an S3 key for a build artifacts .zip file.
     *        <code>S3BucketRepository</code> is required in <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     *        <code>SourceCodeType</code> </a> for <code>S3BucketRepository</code> based code reviews.
     */

    public void setS3BucketRepository(S3BucketRepository s3BucketRepository) {
        this.s3BucketRepository = s3BucketRepository;
    }

    /**
     * <p>
     * Information about an associated repository in an S3 bucket that includes its name and an
     * <code>S3RepositoryDetails</code> object. The <code>S3RepositoryDetails</code> object includes the name of an S3
     * bucket, an S3 key for a source code .zip file, and an S3 key for a build artifacts .zip file.
     * <code>S3BucketRepository</code> is required in <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType"> <code>SourceCodeType</code>
     * </a> for <code>S3BucketRepository</code> based code reviews.
     * </p>
     * 
     * @return Information about an associated repository in an S3 bucket that includes its name and an
     *         <code>S3RepositoryDetails</code> object. The <code>S3RepositoryDetails</code> object includes the name of
     *         an S3 bucket, an S3 key for a source code .zip file, and an S3 key for a build artifacts .zip file.
     *         <code>S3BucketRepository</code> is required in <a
     *         href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     *         <code>SourceCodeType</code> </a> for <code>S3BucketRepository</code> based code reviews.
     */

    public S3BucketRepository getS3BucketRepository() {
        return this.s3BucketRepository;
    }

    /**
     * <p>
     * Information about an associated repository in an S3 bucket that includes its name and an
     * <code>S3RepositoryDetails</code> object. The <code>S3RepositoryDetails</code> object includes the name of an S3
     * bucket, an S3 key for a source code .zip file, and an S3 key for a build artifacts .zip file.
     * <code>S3BucketRepository</code> is required in <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType"> <code>SourceCodeType</code>
     * </a> for <code>S3BucketRepository</code> based code reviews.
     * </p>
     * 
     * @param s3BucketRepository
     *        Information about an associated repository in an S3 bucket that includes its name and an
     *        <code>S3RepositoryDetails</code> object. The <code>S3RepositoryDetails</code> object includes the name of
     *        an S3 bucket, an S3 key for a source code .zip file, and an S3 key for a build artifacts .zip file.
     *        <code>S3BucketRepository</code> is required in <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     *        <code>SourceCodeType</code> </a> for <code>S3BucketRepository</code> based code reviews.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceCodeType withS3BucketRepository(S3BucketRepository s3BucketRepository) {
        setS3BucketRepository(s3BucketRepository);
        return this;
    }

    /**
     * <p>
     * Metadata that is associated with a code review. This applies to any type of code review supported by CodeGuru
     * Reviewer. The <code>RequestMetadaa</code> field captures any event metadata. For example, it might capture
     * metadata associated with an event trigger, such as a push or a pull request.
     * </p>
     * 
     * @param requestMetadata
     *        Metadata that is associated with a code review. This applies to any type of code review supported by
     *        CodeGuru Reviewer. The <code>RequestMetadaa</code> field captures any event metadata. For example, it
     *        might capture metadata associated with an event trigger, such as a push or a pull request.
     */

    public void setRequestMetadata(RequestMetadata requestMetadata) {
        this.requestMetadata = requestMetadata;
    }

    /**
     * <p>
     * Metadata that is associated with a code review. This applies to any type of code review supported by CodeGuru
     * Reviewer. The <code>RequestMetadaa</code> field captures any event metadata. For example, it might capture
     * metadata associated with an event trigger, such as a push or a pull request.
     * </p>
     * 
     * @return Metadata that is associated with a code review. This applies to any type of code review supported by
     *         CodeGuru Reviewer. The <code>RequestMetadaa</code> field captures any event metadata. For example, it
     *         might capture metadata associated with an event trigger, such as a push or a pull request.
     */

    public RequestMetadata getRequestMetadata() {
        return this.requestMetadata;
    }

    /**
     * <p>
     * Metadata that is associated with a code review. This applies to any type of code review supported by CodeGuru
     * Reviewer. The <code>RequestMetadaa</code> field captures any event metadata. For example, it might capture
     * metadata associated with an event trigger, such as a push or a pull request.
     * </p>
     * 
     * @param requestMetadata
     *        Metadata that is associated with a code review. This applies to any type of code review supported by
     *        CodeGuru Reviewer. The <code>RequestMetadaa</code> field captures any event metadata. For example, it
     *        might capture metadata associated with an event trigger, such as a push or a pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceCodeType withRequestMetadata(RequestMetadata requestMetadata) {
        setRequestMetadata(requestMetadata);
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
        if (getCommitDiff() != null)
            sb.append("CommitDiff: ").append(getCommitDiff()).append(",");
        if (getRepositoryHead() != null)
            sb.append("RepositoryHead: ").append(getRepositoryHead()).append(",");
        if (getBranchDiff() != null)
            sb.append("BranchDiff: ").append(getBranchDiff()).append(",");
        if (getS3BucketRepository() != null)
            sb.append("S3BucketRepository: ").append(getS3BucketRepository()).append(",");
        if (getRequestMetadata() != null)
            sb.append("RequestMetadata: ").append(getRequestMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceCodeType == false)
            return false;
        SourceCodeType other = (SourceCodeType) obj;
        if (other.getCommitDiff() == null ^ this.getCommitDiff() == null)
            return false;
        if (other.getCommitDiff() != null && other.getCommitDiff().equals(this.getCommitDiff()) == false)
            return false;
        if (other.getRepositoryHead() == null ^ this.getRepositoryHead() == null)
            return false;
        if (other.getRepositoryHead() != null && other.getRepositoryHead().equals(this.getRepositoryHead()) == false)
            return false;
        if (other.getBranchDiff() == null ^ this.getBranchDiff() == null)
            return false;
        if (other.getBranchDiff() != null && other.getBranchDiff().equals(this.getBranchDiff()) == false)
            return false;
        if (other.getS3BucketRepository() == null ^ this.getS3BucketRepository() == null)
            return false;
        if (other.getS3BucketRepository() != null && other.getS3BucketRepository().equals(this.getS3BucketRepository()) == false)
            return false;
        if (other.getRequestMetadata() == null ^ this.getRequestMetadata() == null)
            return false;
        if (other.getRequestMetadata() != null && other.getRequestMetadata().equals(this.getRequestMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitDiff() == null) ? 0 : getCommitDiff().hashCode());
        hashCode = prime * hashCode + ((getRepositoryHead() == null) ? 0 : getRepositoryHead().hashCode());
        hashCode = prime * hashCode + ((getBranchDiff() == null) ? 0 : getBranchDiff().hashCode());
        hashCode = prime * hashCode + ((getS3BucketRepository() == null) ? 0 : getS3BucketRepository().hashCode());
        hashCode = prime * hashCode + ((getRequestMetadata() == null) ? 0 : getRequestMetadata().hashCode());
        return hashCode;
    }

    @Override
    public SourceCodeType clone() {
        try {
            return (SourceCodeType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.SourceCodeTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
