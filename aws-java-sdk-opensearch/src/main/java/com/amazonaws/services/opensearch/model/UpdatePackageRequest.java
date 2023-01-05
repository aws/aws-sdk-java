/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for request parameters to the <code>UpdatePackage</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePackageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the package.
     * </p>
     */
    private String packageID;
    /**
     * <p>
     * Amazon S3 bucket and key for the package.
     * </p>
     */
    private PackageSource packageSource;
    /**
     * <p>
     * A new description of the package.
     * </p>
     */
    private String packageDescription;
    /**
     * <p>
     * Commit message for the updated file, which is shown as part of <code>GetPackageVersionHistoryResponse</code>.
     * </p>
     */
    private String commitMessage;

    /**
     * <p>
     * The unique identifier for the package.
     * </p>
     * 
     * @param packageID
     *        The unique identifier for the package.
     */

    public void setPackageID(String packageID) {
        this.packageID = packageID;
    }

    /**
     * <p>
     * The unique identifier for the package.
     * </p>
     * 
     * @return The unique identifier for the package.
     */

    public String getPackageID() {
        return this.packageID;
    }

    /**
     * <p>
     * The unique identifier for the package.
     * </p>
     * 
     * @param packageID
     *        The unique identifier for the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageRequest withPackageID(String packageID) {
        setPackageID(packageID);
        return this;
    }

    /**
     * <p>
     * Amazon S3 bucket and key for the package.
     * </p>
     * 
     * @param packageSource
     *        Amazon S3 bucket and key for the package.
     */

    public void setPackageSource(PackageSource packageSource) {
        this.packageSource = packageSource;
    }

    /**
     * <p>
     * Amazon S3 bucket and key for the package.
     * </p>
     * 
     * @return Amazon S3 bucket and key for the package.
     */

    public PackageSource getPackageSource() {
        return this.packageSource;
    }

    /**
     * <p>
     * Amazon S3 bucket and key for the package.
     * </p>
     * 
     * @param packageSource
     *        Amazon S3 bucket and key for the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageRequest withPackageSource(PackageSource packageSource) {
        setPackageSource(packageSource);
        return this;
    }

    /**
     * <p>
     * A new description of the package.
     * </p>
     * 
     * @param packageDescription
     *        A new description of the package.
     */

    public void setPackageDescription(String packageDescription) {
        this.packageDescription = packageDescription;
    }

    /**
     * <p>
     * A new description of the package.
     * </p>
     * 
     * @return A new description of the package.
     */

    public String getPackageDescription() {
        return this.packageDescription;
    }

    /**
     * <p>
     * A new description of the package.
     * </p>
     * 
     * @param packageDescription
     *        A new description of the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageRequest withPackageDescription(String packageDescription) {
        setPackageDescription(packageDescription);
        return this;
    }

    /**
     * <p>
     * Commit message for the updated file, which is shown as part of <code>GetPackageVersionHistoryResponse</code>.
     * </p>
     * 
     * @param commitMessage
     *        Commit message for the updated file, which is shown as part of
     *        <code>GetPackageVersionHistoryResponse</code>.
     */

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    /**
     * <p>
     * Commit message for the updated file, which is shown as part of <code>GetPackageVersionHistoryResponse</code>.
     * </p>
     * 
     * @return Commit message for the updated file, which is shown as part of
     *         <code>GetPackageVersionHistoryResponse</code>.
     */

    public String getCommitMessage() {
        return this.commitMessage;
    }

    /**
     * <p>
     * Commit message for the updated file, which is shown as part of <code>GetPackageVersionHistoryResponse</code>.
     * </p>
     * 
     * @param commitMessage
     *        Commit message for the updated file, which is shown as part of
     *        <code>GetPackageVersionHistoryResponse</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageRequest withCommitMessage(String commitMessage) {
        setCommitMessage(commitMessage);
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
        if (getPackageID() != null)
            sb.append("PackageID: ").append(getPackageID()).append(",");
        if (getPackageSource() != null)
            sb.append("PackageSource: ").append(getPackageSource()).append(",");
        if (getPackageDescription() != null)
            sb.append("PackageDescription: ").append(getPackageDescription()).append(",");
        if (getCommitMessage() != null)
            sb.append("CommitMessage: ").append(getCommitMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePackageRequest == false)
            return false;
        UpdatePackageRequest other = (UpdatePackageRequest) obj;
        if (other.getPackageID() == null ^ this.getPackageID() == null)
            return false;
        if (other.getPackageID() != null && other.getPackageID().equals(this.getPackageID()) == false)
            return false;
        if (other.getPackageSource() == null ^ this.getPackageSource() == null)
            return false;
        if (other.getPackageSource() != null && other.getPackageSource().equals(this.getPackageSource()) == false)
            return false;
        if (other.getPackageDescription() == null ^ this.getPackageDescription() == null)
            return false;
        if (other.getPackageDescription() != null && other.getPackageDescription().equals(this.getPackageDescription()) == false)
            return false;
        if (other.getCommitMessage() == null ^ this.getCommitMessage() == null)
            return false;
        if (other.getCommitMessage() != null && other.getCommitMessage().equals(this.getCommitMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPackageID() == null) ? 0 : getPackageID().hashCode());
        hashCode = prime * hashCode + ((getPackageSource() == null) ? 0 : getPackageSource().hashCode());
        hashCode = prime * hashCode + ((getPackageDescription() == null) ? 0 : getPackageDescription().hashCode());
        hashCode = prime * hashCode + ((getCommitMessage() == null) ? 0 : getCommitMessage().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePackageRequest clone() {
        return (UpdatePackageRequest) super.clone();
    }

}
