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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the specified job's generated manifest. Batch Operations jobs created with a ManifestGenerator populate
 * details of this descriptor after execution of the ManifestGenerator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/S3GeneratedManifestDescriptor"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3GeneratedManifestDescriptor implements Serializable, Cloneable {

    /**
     * <p>
     * The format of the generated manifest.
     * </p>
     */
    private String format;

    private JobManifestLocation location;

    /**
     * <p>
     * The format of the generated manifest.
     * </p>
     * 
     * @param format
     *        The format of the generated manifest.
     * @see GeneratedManifestFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the generated manifest.
     * </p>
     * 
     * @return The format of the generated manifest.
     * @see GeneratedManifestFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the generated manifest.
     * </p>
     * 
     * @param format
     *        The format of the generated manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeneratedManifestFormat
     */

    public S3GeneratedManifestDescriptor withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the generated manifest.
     * </p>
     * 
     * @param format
     *        The format of the generated manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeneratedManifestFormat
     */

    public S3GeneratedManifestDescriptor withFormat(GeneratedManifestFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * @param location
     */

    public void setLocation(JobManifestLocation location) {
        this.location = location;
    }

    /**
     * @return
     */

    public JobManifestLocation getLocation() {
        return this.location;
    }

    /**
     * @param location
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3GeneratedManifestDescriptor withLocation(JobManifestLocation location) {
        setLocation(location);
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3GeneratedManifestDescriptor == false)
            return false;
        S3GeneratedManifestDescriptor other = (S3GeneratedManifestDescriptor) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public S3GeneratedManifestDescriptor clone() {
        try {
            return (S3GeneratedManifestDescriptor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
