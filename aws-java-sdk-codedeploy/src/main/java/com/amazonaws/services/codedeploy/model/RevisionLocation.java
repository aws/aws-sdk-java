/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Information about the location of an application revision.
 * </p>
 */
public class RevisionLocation implements Serializable, Cloneable {

    /**
     * <p>
     * The type of application revision:
     * </p>
     * <ul>
     * <li>
     * <p>
     * S3: An application revision stored in Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * GitHub: An application revision stored in GitHub.
     * </p>
     * </li>
     * </ul>
     */
    private String revisionType;

    private S3Location s3Location;

    private GitHubLocation gitHubLocation;

    /**
     * <p>
     * The type of application revision:
     * </p>
     * <ul>
     * <li>
     * <p>
     * S3: An application revision stored in Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * GitHub: An application revision stored in GitHub.
     * </p>
     * </li>
     * </ul>
     * 
     * @param revisionType
     *        The type of application revision:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        S3: An application revision stored in Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GitHub: An application revision stored in GitHub.
     *        </p>
     *        </li>
     * @see RevisionLocationType
     */

    public void setRevisionType(String revisionType) {
        this.revisionType = revisionType;
    }

    /**
     * <p>
     * The type of application revision:
     * </p>
     * <ul>
     * <li>
     * <p>
     * S3: An application revision stored in Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * GitHub: An application revision stored in GitHub.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of application revision:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         S3: An application revision stored in Amazon S3.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         GitHub: An application revision stored in GitHub.
     *         </p>
     *         </li>
     * @see RevisionLocationType
     */

    public String getRevisionType() {
        return this.revisionType;
    }

    /**
     * <p>
     * The type of application revision:
     * </p>
     * <ul>
     * <li>
     * <p>
     * S3: An application revision stored in Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * GitHub: An application revision stored in GitHub.
     * </p>
     * </li>
     * </ul>
     * 
     * @param revisionType
     *        The type of application revision:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        S3: An application revision stored in Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GitHub: An application revision stored in GitHub.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RevisionLocationType
     */

    public RevisionLocation withRevisionType(String revisionType) {
        setRevisionType(revisionType);
        return this;
    }

    /**
     * <p>
     * The type of application revision:
     * </p>
     * <ul>
     * <li>
     * <p>
     * S3: An application revision stored in Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * GitHub: An application revision stored in GitHub.
     * </p>
     * </li>
     * </ul>
     * 
     * @param revisionType
     *        The type of application revision:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        S3: An application revision stored in Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GitHub: An application revision stored in GitHub.
     *        </p>
     *        </li>
     * @see RevisionLocationType
     */

    public void setRevisionType(RevisionLocationType revisionType) {
        this.revisionType = revisionType.toString();
    }

    /**
     * <p>
     * The type of application revision:
     * </p>
     * <ul>
     * <li>
     * <p>
     * S3: An application revision stored in Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * GitHub: An application revision stored in GitHub.
     * </p>
     * </li>
     * </ul>
     * 
     * @param revisionType
     *        The type of application revision:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        S3: An application revision stored in Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GitHub: An application revision stored in GitHub.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RevisionLocationType
     */

    public RevisionLocation withRevisionType(RevisionLocationType revisionType) {
        setRevisionType(revisionType);
        return this;
    }

    /**
     * @param s3Location
     */

    public void setS3Location(S3Location s3Location) {
        this.s3Location = s3Location;
    }

    /**
     * @return
     */

    public S3Location getS3Location() {
        return this.s3Location;
    }

    /**
     * @param s3Location
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevisionLocation withS3Location(S3Location s3Location) {
        setS3Location(s3Location);
        return this;
    }

    /**
     * @param gitHubLocation
     */

    public void setGitHubLocation(GitHubLocation gitHubLocation) {
        this.gitHubLocation = gitHubLocation;
    }

    /**
     * @return
     */

    public GitHubLocation getGitHubLocation() {
        return this.gitHubLocation;
    }

    /**
     * @param gitHubLocation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevisionLocation withGitHubLocation(GitHubLocation gitHubLocation) {
        setGitHubLocation(gitHubLocation);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRevisionType() != null)
            sb.append("RevisionType: " + getRevisionType() + ",");
        if (getS3Location() != null)
            sb.append("S3Location: " + getS3Location() + ",");
        if (getGitHubLocation() != null)
            sb.append("GitHubLocation: " + getGitHubLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevisionLocation == false)
            return false;
        RevisionLocation other = (RevisionLocation) obj;
        if (other.getRevisionType() == null ^ this.getRevisionType() == null)
            return false;
        if (other.getRevisionType() != null && other.getRevisionType().equals(this.getRevisionType()) == false)
            return false;
        if (other.getS3Location() == null ^ this.getS3Location() == null)
            return false;
        if (other.getS3Location() != null && other.getS3Location().equals(this.getS3Location()) == false)
            return false;
        if (other.getGitHubLocation() == null ^ this.getGitHubLocation() == null)
            return false;
        if (other.getGitHubLocation() != null && other.getGitHubLocation().equals(this.getGitHubLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRevisionType() == null) ? 0 : getRevisionType().hashCode());
        hashCode = prime * hashCode + ((getS3Location() == null) ? 0 : getS3Location().hashCode());
        hashCode = prime * hashCode + ((getGitHubLocation() == null) ? 0 : getGitHubLocation().hashCode());
        return hashCode;
    }

    @Override
    public RevisionLocation clone() {
        try {
            return (RevisionLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
