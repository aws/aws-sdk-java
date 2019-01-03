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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the version (or revision) of a source artifact that initiated a pipeline execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/SourceRevision" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceRevision implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the action that processed the revision to the source artifact.
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * The system-generated unique ID that identifies the revision number of the artifact.
     * </p>
     */
    private String revisionId;
    /**
     * <p>
     * Summary information about the most recent revision of the artifact. For GitHub and AWS CodeCommit repositories,
     * the commit message. For Amazon S3 buckets or actions, the user-provided content of a
     * <code>codepipeline-artifact-revision-summary</code> key specified in the object metadata.
     * </p>
     */
    private String revisionSummary;
    /**
     * <p>
     * The commit ID for the artifact revision. For artifacts stored in GitHub or AWS CodeCommit repositories, the
     * commit ID is linked to a commit details page.
     * </p>
     */
    private String revisionUrl;

    /**
     * <p>
     * The name of the action that processed the revision to the source artifact.
     * </p>
     * 
     * @param actionName
     *        The name of the action that processed the revision to the source artifact.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The name of the action that processed the revision to the source artifact.
     * </p>
     * 
     * @return The name of the action that processed the revision to the source artifact.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The name of the action that processed the revision to the source artifact.
     * </p>
     * 
     * @param actionName
     *        The name of the action that processed the revision to the source artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceRevision withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * The system-generated unique ID that identifies the revision number of the artifact.
     * </p>
     * 
     * @param revisionId
     *        The system-generated unique ID that identifies the revision number of the artifact.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The system-generated unique ID that identifies the revision number of the artifact.
     * </p>
     * 
     * @return The system-generated unique ID that identifies the revision number of the artifact.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The system-generated unique ID that identifies the revision number of the artifact.
     * </p>
     * 
     * @param revisionId
     *        The system-generated unique ID that identifies the revision number of the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceRevision withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * <p>
     * Summary information about the most recent revision of the artifact. For GitHub and AWS CodeCommit repositories,
     * the commit message. For Amazon S3 buckets or actions, the user-provided content of a
     * <code>codepipeline-artifact-revision-summary</code> key specified in the object metadata.
     * </p>
     * 
     * @param revisionSummary
     *        Summary information about the most recent revision of the artifact. For GitHub and AWS CodeCommit
     *        repositories, the commit message. For Amazon S3 buckets or actions, the user-provided content of a
     *        <code>codepipeline-artifact-revision-summary</code> key specified in the object metadata.
     */

    public void setRevisionSummary(String revisionSummary) {
        this.revisionSummary = revisionSummary;
    }

    /**
     * <p>
     * Summary information about the most recent revision of the artifact. For GitHub and AWS CodeCommit repositories,
     * the commit message. For Amazon S3 buckets or actions, the user-provided content of a
     * <code>codepipeline-artifact-revision-summary</code> key specified in the object metadata.
     * </p>
     * 
     * @return Summary information about the most recent revision of the artifact. For GitHub and AWS CodeCommit
     *         repositories, the commit message. For Amazon S3 buckets or actions, the user-provided content of a
     *         <code>codepipeline-artifact-revision-summary</code> key specified in the object metadata.
     */

    public String getRevisionSummary() {
        return this.revisionSummary;
    }

    /**
     * <p>
     * Summary information about the most recent revision of the artifact. For GitHub and AWS CodeCommit repositories,
     * the commit message. For Amazon S3 buckets or actions, the user-provided content of a
     * <code>codepipeline-artifact-revision-summary</code> key specified in the object metadata.
     * </p>
     * 
     * @param revisionSummary
     *        Summary information about the most recent revision of the artifact. For GitHub and AWS CodeCommit
     *        repositories, the commit message. For Amazon S3 buckets or actions, the user-provided content of a
     *        <code>codepipeline-artifact-revision-summary</code> key specified in the object metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceRevision withRevisionSummary(String revisionSummary) {
        setRevisionSummary(revisionSummary);
        return this;
    }

    /**
     * <p>
     * The commit ID for the artifact revision. For artifacts stored in GitHub or AWS CodeCommit repositories, the
     * commit ID is linked to a commit details page.
     * </p>
     * 
     * @param revisionUrl
     *        The commit ID for the artifact revision. For artifacts stored in GitHub or AWS CodeCommit repositories,
     *        the commit ID is linked to a commit details page.
     */

    public void setRevisionUrl(String revisionUrl) {
        this.revisionUrl = revisionUrl;
    }

    /**
     * <p>
     * The commit ID for the artifact revision. For artifacts stored in GitHub or AWS CodeCommit repositories, the
     * commit ID is linked to a commit details page.
     * </p>
     * 
     * @return The commit ID for the artifact revision. For artifacts stored in GitHub or AWS CodeCommit repositories,
     *         the commit ID is linked to a commit details page.
     */

    public String getRevisionUrl() {
        return this.revisionUrl;
    }

    /**
     * <p>
     * The commit ID for the artifact revision. For artifacts stored in GitHub or AWS CodeCommit repositories, the
     * commit ID is linked to a commit details page.
     * </p>
     * 
     * @param revisionUrl
     *        The commit ID for the artifact revision. For artifacts stored in GitHub or AWS CodeCommit repositories,
     *        the commit ID is linked to a commit details page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceRevision withRevisionUrl(String revisionUrl) {
        setRevisionUrl(revisionUrl);
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
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId()).append(",");
        if (getRevisionSummary() != null)
            sb.append("RevisionSummary: ").append(getRevisionSummary()).append(",");
        if (getRevisionUrl() != null)
            sb.append("RevisionUrl: ").append(getRevisionUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceRevision == false)
            return false;
        SourceRevision other = (SourceRevision) obj;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getRevisionSummary() == null ^ this.getRevisionSummary() == null)
            return false;
        if (other.getRevisionSummary() != null && other.getRevisionSummary().equals(this.getRevisionSummary()) == false)
            return false;
        if (other.getRevisionUrl() == null ^ this.getRevisionUrl() == null)
            return false;
        if (other.getRevisionUrl() != null && other.getRevisionUrl().equals(this.getRevisionUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getRevisionSummary() == null) ? 0 : getRevisionSummary().hashCode());
        hashCode = prime * hashCode + ((getRevisionUrl() == null) ? 0 : getRevisionUrl().hashCode());
        return hashCode;
    }

    @Override
    public SourceRevision clone() {
        try {
            return (SourceRevision) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.SourceRevisionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
