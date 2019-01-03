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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDocumentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The document version for which you want information. Can be a specific version or the default version.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * An optional field specifying the version of the artifact associated with the document. For example,
     * "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
     * </p>
     */
    private String versionName;

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * 
     * @param name
     *        The name of the Systems Manager document.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * 
     * @return The name of the Systems Manager document.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * 
     * @param name
     *        The name of the Systems Manager document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDocumentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The document version for which you want information. Can be a specific version or the default version.
     * </p>
     * 
     * @param documentVersion
     *        The document version for which you want information. Can be a specific version or the default version.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The document version for which you want information. Can be a specific version or the default version.
     * </p>
     * 
     * @return The document version for which you want information. Can be a specific version or the default version.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The document version for which you want information. Can be a specific version or the default version.
     * </p>
     * 
     * @param documentVersion
     *        The document version for which you want information. Can be a specific version or the default version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDocumentRequest withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * An optional field specifying the version of the artifact associated with the document. For example,
     * "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
     * </p>
     * 
     * @param versionName
     *        An optional field specifying the version of the artifact associated with the document. For example,
     *        "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
     */

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * An optional field specifying the version of the artifact associated with the document. For example,
     * "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
     * </p>
     * 
     * @return An optional field specifying the version of the artifact associated with the document. For example,
     *         "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
     */

    public String getVersionName() {
        return this.versionName;
    }

    /**
     * <p>
     * An optional field specifying the version of the artifact associated with the document. For example,
     * "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
     * </p>
     * 
     * @param versionName
     *        An optional field specifying the version of the artifact associated with the document. For example,
     *        "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDocumentRequest withVersionName(String versionName) {
        setVersionName(versionName);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getVersionName() != null)
            sb.append("VersionName: ").append(getVersionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDocumentRequest == false)
            return false;
        DescribeDocumentRequest other = (DescribeDocumentRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDocumentRequest clone() {
        return (DescribeDocumentRequest) super.clone();
    }

}
