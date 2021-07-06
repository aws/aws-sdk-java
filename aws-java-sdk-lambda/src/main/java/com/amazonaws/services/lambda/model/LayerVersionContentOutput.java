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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a version of an <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">Lambda
 * layer</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/LayerVersionContentOutput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LayerVersionContentOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A link to the layer archive in Amazon S3 that is valid for 10 minutes.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The SHA-256 hash of the layer archive.
     * </p>
     */
    private String codeSha256;
    /**
     * <p>
     * The size of the layer archive in bytes.
     * </p>
     */
    private Long codeSize;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for a signing profile version.
     * </p>
     */
    private String signingProfileVersionArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a signing job.
     * </p>
     */
    private String signingJobArn;

    /**
     * <p>
     * A link to the layer archive in Amazon S3 that is valid for 10 minutes.
     * </p>
     * 
     * @param location
     *        A link to the layer archive in Amazon S3 that is valid for 10 minutes.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * A link to the layer archive in Amazon S3 that is valid for 10 minutes.
     * </p>
     * 
     * @return A link to the layer archive in Amazon S3 that is valid for 10 minutes.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * A link to the layer archive in Amazon S3 that is valid for 10 minutes.
     * </p>
     * 
     * @param location
     *        A link to the layer archive in Amazon S3 that is valid for 10 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayerVersionContentOutput withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The SHA-256 hash of the layer archive.
     * </p>
     * 
     * @param codeSha256
     *        The SHA-256 hash of the layer archive.
     */

    public void setCodeSha256(String codeSha256) {
        this.codeSha256 = codeSha256;
    }

    /**
     * <p>
     * The SHA-256 hash of the layer archive.
     * </p>
     * 
     * @return The SHA-256 hash of the layer archive.
     */

    public String getCodeSha256() {
        return this.codeSha256;
    }

    /**
     * <p>
     * The SHA-256 hash of the layer archive.
     * </p>
     * 
     * @param codeSha256
     *        The SHA-256 hash of the layer archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayerVersionContentOutput withCodeSha256(String codeSha256) {
        setCodeSha256(codeSha256);
        return this;
    }

    /**
     * <p>
     * The size of the layer archive in bytes.
     * </p>
     * 
     * @param codeSize
     *        The size of the layer archive in bytes.
     */

    public void setCodeSize(Long codeSize) {
        this.codeSize = codeSize;
    }

    /**
     * <p>
     * The size of the layer archive in bytes.
     * </p>
     * 
     * @return The size of the layer archive in bytes.
     */

    public Long getCodeSize() {
        return this.codeSize;
    }

    /**
     * <p>
     * The size of the layer archive in bytes.
     * </p>
     * 
     * @param codeSize
     *        The size of the layer archive in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayerVersionContentOutput withCodeSize(Long codeSize) {
        setCodeSize(codeSize);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a signing profile version.
     * </p>
     * 
     * @param signingProfileVersionArn
     *        The Amazon Resource Name (ARN) for a signing profile version.
     */

    public void setSigningProfileVersionArn(String signingProfileVersionArn) {
        this.signingProfileVersionArn = signingProfileVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a signing profile version.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for a signing profile version.
     */

    public String getSigningProfileVersionArn() {
        return this.signingProfileVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a signing profile version.
     * </p>
     * 
     * @param signingProfileVersionArn
     *        The Amazon Resource Name (ARN) for a signing profile version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayerVersionContentOutput withSigningProfileVersionArn(String signingProfileVersionArn) {
        setSigningProfileVersionArn(signingProfileVersionArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a signing job.
     * </p>
     * 
     * @param signingJobArn
     *        The Amazon Resource Name (ARN) of a signing job.
     */

    public void setSigningJobArn(String signingJobArn) {
        this.signingJobArn = signingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a signing job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a signing job.
     */

    public String getSigningJobArn() {
        return this.signingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a signing job.
     * </p>
     * 
     * @param signingJobArn
     *        The Amazon Resource Name (ARN) of a signing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayerVersionContentOutput withSigningJobArn(String signingJobArn) {
        setSigningJobArn(signingJobArn);
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
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getCodeSha256() != null)
            sb.append("CodeSha256: ").append(getCodeSha256()).append(",");
        if (getCodeSize() != null)
            sb.append("CodeSize: ").append(getCodeSize()).append(",");
        if (getSigningProfileVersionArn() != null)
            sb.append("SigningProfileVersionArn: ").append(getSigningProfileVersionArn()).append(",");
        if (getSigningJobArn() != null)
            sb.append("SigningJobArn: ").append(getSigningJobArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LayerVersionContentOutput == false)
            return false;
        LayerVersionContentOutput other = (LayerVersionContentOutput) obj;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getCodeSha256() == null ^ this.getCodeSha256() == null)
            return false;
        if (other.getCodeSha256() != null && other.getCodeSha256().equals(this.getCodeSha256()) == false)
            return false;
        if (other.getCodeSize() == null ^ this.getCodeSize() == null)
            return false;
        if (other.getCodeSize() != null && other.getCodeSize().equals(this.getCodeSize()) == false)
            return false;
        if (other.getSigningProfileVersionArn() == null ^ this.getSigningProfileVersionArn() == null)
            return false;
        if (other.getSigningProfileVersionArn() != null && other.getSigningProfileVersionArn().equals(this.getSigningProfileVersionArn()) == false)
            return false;
        if (other.getSigningJobArn() == null ^ this.getSigningJobArn() == null)
            return false;
        if (other.getSigningJobArn() != null && other.getSigningJobArn().equals(this.getSigningJobArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getCodeSha256() == null) ? 0 : getCodeSha256().hashCode());
        hashCode = prime * hashCode + ((getCodeSize() == null) ? 0 : getCodeSize().hashCode());
        hashCode = prime * hashCode + ((getSigningProfileVersionArn() == null) ? 0 : getSigningProfileVersionArn().hashCode());
        hashCode = prime * hashCode + ((getSigningJobArn() == null) ? 0 : getSigningJobArn().hashCode());
        return hashCode;
    }

    @Override
    public LayerVersionContentOutput clone() {
        try {
            return (LayerVersionContentOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.LayerVersionContentOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
