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
 * Configures the type of the job's ManifestGenerator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/JobManifestGenerator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobManifestGenerator implements Serializable, Cloneable {

    /**
     * <p>
     * The S3 job ManifestGenerator's configuration details.
     * </p>
     */
    private S3JobManifestGenerator s3JobManifestGenerator;

    /**
     * <p>
     * The S3 job ManifestGenerator's configuration details.
     * </p>
     * 
     * @param s3JobManifestGenerator
     *        The S3 job ManifestGenerator's configuration details.
     */

    public void setS3JobManifestGenerator(S3JobManifestGenerator s3JobManifestGenerator) {
        this.s3JobManifestGenerator = s3JobManifestGenerator;
    }

    /**
     * <p>
     * The S3 job ManifestGenerator's configuration details.
     * </p>
     * 
     * @return The S3 job ManifestGenerator's configuration details.
     */

    public S3JobManifestGenerator getS3JobManifestGenerator() {
        return this.s3JobManifestGenerator;
    }

    /**
     * <p>
     * The S3 job ManifestGenerator's configuration details.
     * </p>
     * 
     * @param s3JobManifestGenerator
     *        The S3 job ManifestGenerator's configuration details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobManifestGenerator withS3JobManifestGenerator(S3JobManifestGenerator s3JobManifestGenerator) {
        setS3JobManifestGenerator(s3JobManifestGenerator);
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
        if (getS3JobManifestGenerator() != null)
            sb.append("S3JobManifestGenerator: ").append(getS3JobManifestGenerator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobManifestGenerator == false)
            return false;
        JobManifestGenerator other = (JobManifestGenerator) obj;
        if (other.getS3JobManifestGenerator() == null ^ this.getS3JobManifestGenerator() == null)
            return false;
        if (other.getS3JobManifestGenerator() != null && other.getS3JobManifestGenerator().equals(this.getS3JobManifestGenerator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3JobManifestGenerator() == null) ? 0 : getS3JobManifestGenerator().hashCode());
        return hashCode;
    }

    @Override
    public JobManifestGenerator clone() {
        try {
            return (JobManifestGenerator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
