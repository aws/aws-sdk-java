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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the revision and status of a package version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/SuccessfulPackageVersionInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuccessfulPackageVersionInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The revision of a package version.
     * </p>
     */
    private String revision;
    /**
     * <p>
     * The status of a package version. Valid statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Published</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unfinished</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unlisted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disposed</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The revision of a package version.
     * </p>
     * 
     * @param revision
     *        The revision of a package version.
     */

    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision of a package version.
     * </p>
     * 
     * @return The revision of a package version.
     */

    public String getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision of a package version.
     * </p>
     * 
     * @param revision
     *        The revision of a package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuccessfulPackageVersionInfo withRevision(String revision) {
        setRevision(revision);
        return this;
    }

    /**
     * <p>
     * The status of a package version. Valid statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Published</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unfinished</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unlisted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disposed</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of a package version. Valid statuses are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Published</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unfinished</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unlisted</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Archived</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Disposed</code>
     *        </p>
     *        </li>
     * @see PackageVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a package version. Valid statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Published</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unfinished</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unlisted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disposed</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of a package version. Valid statuses are: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Published</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Unfinished</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Unlisted</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Archived</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Disposed</code>
     *         </p>
     *         </li>
     * @see PackageVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a package version. Valid statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Published</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unfinished</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unlisted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disposed</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of a package version. Valid statuses are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Published</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unfinished</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unlisted</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Archived</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Disposed</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionStatus
     */

    public SuccessfulPackageVersionInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a package version. Valid statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Published</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unfinished</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unlisted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disposed</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of a package version. Valid statuses are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Published</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unfinished</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unlisted</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Archived</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Disposed</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionStatus
     */

    public SuccessfulPackageVersionInfo withStatus(PackageVersionStatus status) {
        this.status = status.toString();
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
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuccessfulPackageVersionInfo == false)
            return false;
        SuccessfulPackageVersionInfo other = (SuccessfulPackageVersionInfo) obj;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public SuccessfulPackageVersionInfo clone() {
        try {
            return (SuccessfulPackageVersionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.SuccessfulPackageVersionInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
