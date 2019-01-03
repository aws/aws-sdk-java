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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a GetApplicationRevision operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetApplicationRevision" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApplicationRevisionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application that corresponds to the revision.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * Additional information about the revision, including type and location.
     * </p>
     */
    private RevisionLocation revision;
    /**
     * <p>
     * General information about the revision.
     * </p>
     */
    private GenericRevisionInfo revisionInfo;

    /**
     * <p>
     * The name of the application that corresponds to the revision.
     * </p>
     * 
     * @param applicationName
     *        The name of the application that corresponds to the revision.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application that corresponds to the revision.
     * </p>
     * 
     * @return The name of the application that corresponds to the revision.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application that corresponds to the revision.
     * </p>
     * 
     * @param applicationName
     *        The name of the application that corresponds to the revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationRevisionResult withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * Additional information about the revision, including type and location.
     * </p>
     * 
     * @param revision
     *        Additional information about the revision, including type and location.
     */

    public void setRevision(RevisionLocation revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * Additional information about the revision, including type and location.
     * </p>
     * 
     * @return Additional information about the revision, including type and location.
     */

    public RevisionLocation getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * Additional information about the revision, including type and location.
     * </p>
     * 
     * @param revision
     *        Additional information about the revision, including type and location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationRevisionResult withRevision(RevisionLocation revision) {
        setRevision(revision);
        return this;
    }

    /**
     * <p>
     * General information about the revision.
     * </p>
     * 
     * @param revisionInfo
     *        General information about the revision.
     */

    public void setRevisionInfo(GenericRevisionInfo revisionInfo) {
        this.revisionInfo = revisionInfo;
    }

    /**
     * <p>
     * General information about the revision.
     * </p>
     * 
     * @return General information about the revision.
     */

    public GenericRevisionInfo getRevisionInfo() {
        return this.revisionInfo;
    }

    /**
     * <p>
     * General information about the revision.
     * </p>
     * 
     * @param revisionInfo
     *        General information about the revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationRevisionResult withRevisionInfo(GenericRevisionInfo revisionInfo) {
        setRevisionInfo(revisionInfo);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision()).append(",");
        if (getRevisionInfo() != null)
            sb.append("RevisionInfo: ").append(getRevisionInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApplicationRevisionResult == false)
            return false;
        GetApplicationRevisionResult other = (GetApplicationRevisionResult) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getRevisionInfo() == null ^ this.getRevisionInfo() == null)
            return false;
        if (other.getRevisionInfo() != null && other.getRevisionInfo().equals(this.getRevisionInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode + ((getRevisionInfo() == null) ? 0 : getRevisionInfo().hashCode());
        return hashCode;
    }

    @Override
    public GetApplicationRevisionResult clone() {
        try {
            return (GetApplicationRevisionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
