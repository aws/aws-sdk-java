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
 * Code artifacts are source code artifacts and build artifacts used in a repository analysis or a pull request review.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Source code artifacts are source code files in a Git repository that are compressed into a .zip file.
 * </p>
 * </li>
 * <li>
 * <p>
 * Build artifacts are .jar or .class files that are compressed in a .zip file.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/CodeArtifacts" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeArtifacts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The S3 object key for a source code .zip file. This is required for all code reviews.
     * </p>
     */
    private String sourceCodeArtifactsObjectKey;
    /**
     * <p>
     * The S3 object key for a build artifacts .zip file that contains .jar or .class files. This is required for a code
     * review with security analysis. For more information, see <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/code-review-security.html">Create code reviews with
     * security analysis</a> in the <i>Amazon CodeGuru Reviewer User Guide</i>.
     * </p>
     */
    private String buildArtifactsObjectKey;

    /**
     * <p>
     * The S3 object key for a source code .zip file. This is required for all code reviews.
     * </p>
     * 
     * @param sourceCodeArtifactsObjectKey
     *        The S3 object key for a source code .zip file. This is required for all code reviews.
     */

    public void setSourceCodeArtifactsObjectKey(String sourceCodeArtifactsObjectKey) {
        this.sourceCodeArtifactsObjectKey = sourceCodeArtifactsObjectKey;
    }

    /**
     * <p>
     * The S3 object key for a source code .zip file. This is required for all code reviews.
     * </p>
     * 
     * @return The S3 object key for a source code .zip file. This is required for all code reviews.
     */

    public String getSourceCodeArtifactsObjectKey() {
        return this.sourceCodeArtifactsObjectKey;
    }

    /**
     * <p>
     * The S3 object key for a source code .zip file. This is required for all code reviews.
     * </p>
     * 
     * @param sourceCodeArtifactsObjectKey
     *        The S3 object key for a source code .zip file. This is required for all code reviews.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeArtifacts withSourceCodeArtifactsObjectKey(String sourceCodeArtifactsObjectKey) {
        setSourceCodeArtifactsObjectKey(sourceCodeArtifactsObjectKey);
        return this;
    }

    /**
     * <p>
     * The S3 object key for a build artifacts .zip file that contains .jar or .class files. This is required for a code
     * review with security analysis. For more information, see <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/code-review-security.html">Create code reviews with
     * security analysis</a> in the <i>Amazon CodeGuru Reviewer User Guide</i>.
     * </p>
     * 
     * @param buildArtifactsObjectKey
     *        The S3 object key for a build artifacts .zip file that contains .jar or .class files. This is required for
     *        a code review with security analysis. For more information, see <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/code-review-security.html">Create code
     *        reviews with security analysis</a> in the <i>Amazon CodeGuru Reviewer User Guide</i>.
     */

    public void setBuildArtifactsObjectKey(String buildArtifactsObjectKey) {
        this.buildArtifactsObjectKey = buildArtifactsObjectKey;
    }

    /**
     * <p>
     * The S3 object key for a build artifacts .zip file that contains .jar or .class files. This is required for a code
     * review with security analysis. For more information, see <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/code-review-security.html">Create code reviews with
     * security analysis</a> in the <i>Amazon CodeGuru Reviewer User Guide</i>.
     * </p>
     * 
     * @return The S3 object key for a build artifacts .zip file that contains .jar or .class files. This is required
     *         for a code review with security analysis. For more information, see <a
     *         href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/code-review-security.html">Create code
     *         reviews with security analysis</a> in the <i>Amazon CodeGuru Reviewer User Guide</i>.
     */

    public String getBuildArtifactsObjectKey() {
        return this.buildArtifactsObjectKey;
    }

    /**
     * <p>
     * The S3 object key for a build artifacts .zip file that contains .jar or .class files. This is required for a code
     * review with security analysis. For more information, see <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/code-review-security.html">Create code reviews with
     * security analysis</a> in the <i>Amazon CodeGuru Reviewer User Guide</i>.
     * </p>
     * 
     * @param buildArtifactsObjectKey
     *        The S3 object key for a build artifacts .zip file that contains .jar or .class files. This is required for
     *        a code review with security analysis. For more information, see <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/code-review-security.html">Create code
     *        reviews with security analysis</a> in the <i>Amazon CodeGuru Reviewer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeArtifacts withBuildArtifactsObjectKey(String buildArtifactsObjectKey) {
        setBuildArtifactsObjectKey(buildArtifactsObjectKey);
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
        if (getSourceCodeArtifactsObjectKey() != null)
            sb.append("SourceCodeArtifactsObjectKey: ").append(getSourceCodeArtifactsObjectKey()).append(",");
        if (getBuildArtifactsObjectKey() != null)
            sb.append("BuildArtifactsObjectKey: ").append(getBuildArtifactsObjectKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeArtifacts == false)
            return false;
        CodeArtifacts other = (CodeArtifacts) obj;
        if (other.getSourceCodeArtifactsObjectKey() == null ^ this.getSourceCodeArtifactsObjectKey() == null)
            return false;
        if (other.getSourceCodeArtifactsObjectKey() != null && other.getSourceCodeArtifactsObjectKey().equals(this.getSourceCodeArtifactsObjectKey()) == false)
            return false;
        if (other.getBuildArtifactsObjectKey() == null ^ this.getBuildArtifactsObjectKey() == null)
            return false;
        if (other.getBuildArtifactsObjectKey() != null && other.getBuildArtifactsObjectKey().equals(this.getBuildArtifactsObjectKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceCodeArtifactsObjectKey() == null) ? 0 : getSourceCodeArtifactsObjectKey().hashCode());
        hashCode = prime * hashCode + ((getBuildArtifactsObjectKey() == null) ? 0 : getBuildArtifactsObjectKey().hashCode());
        return hashCode;
    }

    @Override
    public CodeArtifacts clone() {
        try {
            return (CodeArtifacts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.CodeArtifactsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
