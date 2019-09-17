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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Location of the source code for an application version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/SourceBuildInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceBuildInformation implements Serializable, Cloneable {

    /**
     * <p>
     * The type of repository.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Git</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Zip</code>
     * </p>
     * </li>
     * </ul>
     */
    private String sourceType;
    /**
     * <p>
     * Location where the repository is stored.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CodeCommit</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>
     * </p>
     * </li>
     * </ul>
     */
    private String sourceRepository;
    /**
     * <p>
     * The location of the source code, as a formatted string, depending on the value of <code>SourceRepository</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>CodeCommit</code>, the format is the repository name and commit ID, separated by a forward slash. For
     * example, <code>my-git-repo/265cfa0cf6af46153527f55d6503ec030551f57a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>S3</code>, the format is the S3 bucket name and object key, separated by a forward slash. For example,
     * <code>my-s3-bucket/Folders/my-source-file</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceLocation;

    /**
     * <p>
     * The type of repository.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Git</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Zip</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceType
     *        The type of repository.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Git</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Zip</code>
     *        </p>
     *        </li>
     * @see SourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The type of repository.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Git</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Zip</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of repository.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Git</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Zip</code>
     *         </p>
     *         </li>
     * @see SourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The type of repository.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Git</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Zip</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceType
     *        The type of repository.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Git</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Zip</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public SourceBuildInformation withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The type of repository.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Git</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Zip</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceType
     *        The type of repository.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Git</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Zip</code>
     *        </p>
     *        </li>
     * @see SourceType
     */

    public void setSourceType(SourceType sourceType) {
        withSourceType(sourceType);
    }

    /**
     * <p>
     * The type of repository.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Git</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Zip</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceType
     *        The type of repository.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Git</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Zip</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public SourceBuildInformation withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * Location where the repository is stored.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CodeCommit</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceRepository
     *        Location where the repository is stored.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CodeCommit</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>
     *        </p>
     *        </li>
     * @see SourceRepository
     */

    public void setSourceRepository(String sourceRepository) {
        this.sourceRepository = sourceRepository;
    }

    /**
     * <p>
     * Location where the repository is stored.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CodeCommit</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Location where the repository is stored.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CodeCommit</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>S3</code>
     *         </p>
     *         </li>
     * @see SourceRepository
     */

    public String getSourceRepository() {
        return this.sourceRepository;
    }

    /**
     * <p>
     * Location where the repository is stored.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CodeCommit</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceRepository
     *        Location where the repository is stored.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CodeCommit</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceRepository
     */

    public SourceBuildInformation withSourceRepository(String sourceRepository) {
        setSourceRepository(sourceRepository);
        return this;
    }

    /**
     * <p>
     * Location where the repository is stored.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CodeCommit</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceRepository
     *        Location where the repository is stored.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CodeCommit</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>
     *        </p>
     *        </li>
     * @see SourceRepository
     */

    public void setSourceRepository(SourceRepository sourceRepository) {
        withSourceRepository(sourceRepository);
    }

    /**
     * <p>
     * Location where the repository is stored.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CodeCommit</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceRepository
     *        Location where the repository is stored.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CodeCommit</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceRepository
     */

    public SourceBuildInformation withSourceRepository(SourceRepository sourceRepository) {
        this.sourceRepository = sourceRepository.toString();
        return this;
    }

    /**
     * <p>
     * The location of the source code, as a formatted string, depending on the value of <code>SourceRepository</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>CodeCommit</code>, the format is the repository name and commit ID, separated by a forward slash. For
     * example, <code>my-git-repo/265cfa0cf6af46153527f55d6503ec030551f57a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>S3</code>, the format is the S3 bucket name and object key, separated by a forward slash. For example,
     * <code>my-s3-bucket/Folders/my-source-file</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceLocation
     *        The location of the source code, as a formatted string, depending on the value of
     *        <code>SourceRepository</code> </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>CodeCommit</code>, the format is the repository name and commit ID, separated by a forward
     *        slash. For example, <code>my-git-repo/265cfa0cf6af46153527f55d6503ec030551f57a</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>S3</code>, the format is the S3 bucket name and object key, separated by a forward slash. For
     *        example, <code>my-s3-bucket/Folders/my-source-file</code>.
     *        </p>
     *        </li>
     */

    public void setSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    /**
     * <p>
     * The location of the source code, as a formatted string, depending on the value of <code>SourceRepository</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>CodeCommit</code>, the format is the repository name and commit ID, separated by a forward slash. For
     * example, <code>my-git-repo/265cfa0cf6af46153527f55d6503ec030551f57a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>S3</code>, the format is the S3 bucket name and object key, separated by a forward slash. For example,
     * <code>my-s3-bucket/Folders/my-source-file</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The location of the source code, as a formatted string, depending on the value of
     *         <code>SourceRepository</code> </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For <code>CodeCommit</code>, the format is the repository name and commit ID, separated by a forward
     *         slash. For example, <code>my-git-repo/265cfa0cf6af46153527f55d6503ec030551f57a</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <code>S3</code>, the format is the S3 bucket name and object key, separated by a forward slash. For
     *         example, <code>my-s3-bucket/Folders/my-source-file</code>.
     *         </p>
     *         </li>
     */

    public String getSourceLocation() {
        return this.sourceLocation;
    }

    /**
     * <p>
     * The location of the source code, as a formatted string, depending on the value of <code>SourceRepository</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>CodeCommit</code>, the format is the repository name and commit ID, separated by a forward slash. For
     * example, <code>my-git-repo/265cfa0cf6af46153527f55d6503ec030551f57a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>S3</code>, the format is the S3 bucket name and object key, separated by a forward slash. For example,
     * <code>my-s3-bucket/Folders/my-source-file</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceLocation
     *        The location of the source code, as a formatted string, depending on the value of
     *        <code>SourceRepository</code> </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>CodeCommit</code>, the format is the repository name and commit ID, separated by a forward
     *        slash. For example, <code>my-git-repo/265cfa0cf6af46153527f55d6503ec030551f57a</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>S3</code>, the format is the S3 bucket name and object key, separated by a forward slash. For
     *        example, <code>my-s3-bucket/Folders/my-source-file</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceBuildInformation withSourceLocation(String sourceLocation) {
        setSourceLocation(sourceLocation);
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
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getSourceRepository() != null)
            sb.append("SourceRepository: ").append(getSourceRepository()).append(",");
        if (getSourceLocation() != null)
            sb.append("SourceLocation: ").append(getSourceLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceBuildInformation == false)
            return false;
        SourceBuildInformation other = (SourceBuildInformation) obj;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getSourceRepository() == null ^ this.getSourceRepository() == null)
            return false;
        if (other.getSourceRepository() != null && other.getSourceRepository().equals(this.getSourceRepository()) == false)
            return false;
        if (other.getSourceLocation() == null ^ this.getSourceLocation() == null)
            return false;
        if (other.getSourceLocation() != null && other.getSourceLocation().equals(this.getSourceLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getSourceRepository() == null) ? 0 : getSourceRepository().hashCode());
        hashCode = prime * hashCode + ((getSourceLocation() == null) ? 0 : getSourceLocation().hashCode());
        return hashCode;
    }

    @Override
    public SourceBuildInformation clone() {
        try {
            return (SourceBuildInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
