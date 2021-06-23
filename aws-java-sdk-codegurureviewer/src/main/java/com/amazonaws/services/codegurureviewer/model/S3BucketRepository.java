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
 * Information about an associated repository in an S3 bucket. The associated repository contains a source code .zip
 * file and a build artifacts .zip file that contains .jar or .class files.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/S3BucketRepository"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3BucketRepository implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the repository when the <code>ProviderType</code> is <code>S3Bucket</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An <code>S3RepositoryDetails</code> object that specifies the name of an S3 bucket and a
     * <code>CodeArtifacts</code> object. The <code>CodeArtifacts</code> object includes the S3 object keys for a source
     * code .zip file and for a build artifacts .zip file.
     * </p>
     */
    private S3RepositoryDetails details;

    /**
     * <p>
     * The name of the repository when the <code>ProviderType</code> is <code>S3Bucket</code>.
     * </p>
     * 
     * @param name
     *        The name of the repository when the <code>ProviderType</code> is <code>S3Bucket</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the repository when the <code>ProviderType</code> is <code>S3Bucket</code>.
     * </p>
     * 
     * @return The name of the repository when the <code>ProviderType</code> is <code>S3Bucket</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the repository when the <code>ProviderType</code> is <code>S3Bucket</code>.
     * </p>
     * 
     * @param name
     *        The name of the repository when the <code>ProviderType</code> is <code>S3Bucket</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketRepository withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An <code>S3RepositoryDetails</code> object that specifies the name of an S3 bucket and a
     * <code>CodeArtifacts</code> object. The <code>CodeArtifacts</code> object includes the S3 object keys for a source
     * code .zip file and for a build artifacts .zip file.
     * </p>
     * 
     * @param details
     *        An <code>S3RepositoryDetails</code> object that specifies the name of an S3 bucket and a
     *        <code>CodeArtifacts</code> object. The <code>CodeArtifacts</code> object includes the S3 object keys for a
     *        source code .zip file and for a build artifacts .zip file.
     */

    public void setDetails(S3RepositoryDetails details) {
        this.details = details;
    }

    /**
     * <p>
     * An <code>S3RepositoryDetails</code> object that specifies the name of an S3 bucket and a
     * <code>CodeArtifacts</code> object. The <code>CodeArtifacts</code> object includes the S3 object keys for a source
     * code .zip file and for a build artifacts .zip file.
     * </p>
     * 
     * @return An <code>S3RepositoryDetails</code> object that specifies the name of an S3 bucket and a
     *         <code>CodeArtifacts</code> object. The <code>CodeArtifacts</code> object includes the S3 object keys for
     *         a source code .zip file and for a build artifacts .zip file.
     */

    public S3RepositoryDetails getDetails() {
        return this.details;
    }

    /**
     * <p>
     * An <code>S3RepositoryDetails</code> object that specifies the name of an S3 bucket and a
     * <code>CodeArtifacts</code> object. The <code>CodeArtifacts</code> object includes the S3 object keys for a source
     * code .zip file and for a build artifacts .zip file.
     * </p>
     * 
     * @param details
     *        An <code>S3RepositoryDetails</code> object that specifies the name of an S3 bucket and a
     *        <code>CodeArtifacts</code> object. The <code>CodeArtifacts</code> object includes the S3 object keys for a
     *        source code .zip file and for a build artifacts .zip file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketRepository withDetails(S3RepositoryDetails details) {
        setDetails(details);
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
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3BucketRepository == false)
            return false;
        S3BucketRepository other = (S3BucketRepository) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public S3BucketRepository clone() {
        try {
            return (S3BucketRepository) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.S3BucketRepositoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
