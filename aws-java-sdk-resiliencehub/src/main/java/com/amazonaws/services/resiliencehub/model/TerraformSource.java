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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Terraform s3 state file you need to import.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/TerraformSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerraformSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Terraform s3 state file you need to import.
     * </p>
     */
    private String s3StateFileUrl;

    /**
     * <p>
     * The Terraform s3 state file you need to import.
     * </p>
     * 
     * @param s3StateFileUrl
     *        The Terraform s3 state file you need to import.
     */

    public void setS3StateFileUrl(String s3StateFileUrl) {
        this.s3StateFileUrl = s3StateFileUrl;
    }

    /**
     * <p>
     * The Terraform s3 state file you need to import.
     * </p>
     * 
     * @return The Terraform s3 state file you need to import.
     */

    public String getS3StateFileUrl() {
        return this.s3StateFileUrl;
    }

    /**
     * <p>
     * The Terraform s3 state file you need to import.
     * </p>
     * 
     * @param s3StateFileUrl
     *        The Terraform s3 state file you need to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerraformSource withS3StateFileUrl(String s3StateFileUrl) {
        setS3StateFileUrl(s3StateFileUrl);
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
        if (getS3StateFileUrl() != null)
            sb.append("S3StateFileUrl: ").append(getS3StateFileUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerraformSource == false)
            return false;
        TerraformSource other = (TerraformSource) obj;
        if (other.getS3StateFileUrl() == null ^ this.getS3StateFileUrl() == null)
            return false;
        if (other.getS3StateFileUrl() != null && other.getS3StateFileUrl().equals(this.getS3StateFileUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3StateFileUrl() == null) ? 0 : getS3StateFileUrl().hashCode());
        return hashCode;
    }

    @Override
    public TerraformSource clone() {
        try {
            return (TerraformSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.TerraformSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
