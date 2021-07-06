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
 * An <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">Lambda layer</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/Layer" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Layer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function layer.
     * </p>
     */
    private String arn;
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
     * The Amazon Resource Name (ARN) of the function layer.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the function layer.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function layer.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the function layer.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function layer.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the function layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Layer withArn(String arn) {
        setArn(arn);
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

    public Layer withCodeSize(Long codeSize) {
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

    public Layer withSigningProfileVersionArn(String signingProfileVersionArn) {
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

    public Layer withSigningJobArn(String signingJobArn) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
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

        if (obj instanceof Layer == false)
            return false;
        Layer other = (Layer) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCodeSize() == null) ? 0 : getCodeSize().hashCode());
        hashCode = prime * hashCode + ((getSigningProfileVersionArn() == null) ? 0 : getSigningProfileVersionArn().hashCode());
        hashCode = prime * hashCode + ((getSigningJobArn() == null) ? 0 : getSigningJobArn().hashCode());
        return hashCode;
    }

    @Override
    public Layer clone() {
        try {
            return (Layer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.LayerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
