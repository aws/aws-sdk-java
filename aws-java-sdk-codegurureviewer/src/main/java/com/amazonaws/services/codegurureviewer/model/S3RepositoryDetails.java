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
 * Specifies the name of an S3 bucket and a <code>CodeArtifacts</code> object that contains the S3 object keys for a
 * source code .zip file and for a build artifacts .zip file that contains .jar or .class files.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/S3RepositoryDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3RepositoryDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the S3 bucket used for associating a new S3 repository. It must begin with
     * <code>codeguru-reviewer-</code>.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * A <code>CodeArtifacts</code> object. The <code>CodeArtifacts</code> object includes the S3 object key for a
     * source code .zip file and for a build artifacts .zip file that contains .jar or .class files.
     * </p>
     */
    private CodeArtifacts codeArtifacts;

    /**
     * <p>
     * The name of the S3 bucket used for associating a new S3 repository. It must begin with
     * <code>codeguru-reviewer-</code>.
     * </p>
     * 
     * @param bucketName
     *        The name of the S3 bucket used for associating a new S3 repository. It must begin with
     *        <code>codeguru-reviewer-</code>.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket used for associating a new S3 repository. It must begin with
     * <code>codeguru-reviewer-</code>.
     * </p>
     * 
     * @return The name of the S3 bucket used for associating a new S3 repository. It must begin with
     *         <code>codeguru-reviewer-</code>.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket used for associating a new S3 repository. It must begin with
     * <code>codeguru-reviewer-</code>.
     * </p>
     * 
     * @param bucketName
     *        The name of the S3 bucket used for associating a new S3 repository. It must begin with
     *        <code>codeguru-reviewer-</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3RepositoryDetails withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * A <code>CodeArtifacts</code> object. The <code>CodeArtifacts</code> object includes the S3 object key for a
     * source code .zip file and for a build artifacts .zip file that contains .jar or .class files.
     * </p>
     * 
     * @param codeArtifacts
     *        A <code>CodeArtifacts</code> object. The <code>CodeArtifacts</code> object includes the S3 object key for
     *        a source code .zip file and for a build artifacts .zip file that contains .jar or .class files.
     */

    public void setCodeArtifacts(CodeArtifacts codeArtifacts) {
        this.codeArtifacts = codeArtifacts;
    }

    /**
     * <p>
     * A <code>CodeArtifacts</code> object. The <code>CodeArtifacts</code> object includes the S3 object key for a
     * source code .zip file and for a build artifacts .zip file that contains .jar or .class files.
     * </p>
     * 
     * @return A <code>CodeArtifacts</code> object. The <code>CodeArtifacts</code> object includes the S3 object key for
     *         a source code .zip file and for a build artifacts .zip file that contains .jar or .class files.
     */

    public CodeArtifacts getCodeArtifacts() {
        return this.codeArtifacts;
    }

    /**
     * <p>
     * A <code>CodeArtifacts</code> object. The <code>CodeArtifacts</code> object includes the S3 object key for a
     * source code .zip file and for a build artifacts .zip file that contains .jar or .class files.
     * </p>
     * 
     * @param codeArtifacts
     *        A <code>CodeArtifacts</code> object. The <code>CodeArtifacts</code> object includes the S3 object key for
     *        a source code .zip file and for a build artifacts .zip file that contains .jar or .class files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3RepositoryDetails withCodeArtifacts(CodeArtifacts codeArtifacts) {
        setCodeArtifacts(codeArtifacts);
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
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getCodeArtifacts() != null)
            sb.append("CodeArtifacts: ").append(getCodeArtifacts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3RepositoryDetails == false)
            return false;
        S3RepositoryDetails other = (S3RepositoryDetails) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getCodeArtifacts() == null ^ this.getCodeArtifacts() == null)
            return false;
        if (other.getCodeArtifacts() != null && other.getCodeArtifacts().equals(this.getCodeArtifacts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getCodeArtifacts() == null) ? 0 : getCodeArtifacts().hashCode());
        return hashCode;
    }

    @Override
    public S3RepositoryDetails clone() {
        try {
            return (S3RepositoryDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.S3RepositoryDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
