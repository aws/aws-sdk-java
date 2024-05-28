/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Validates function package content metadata.
 * </p>
 * <p>
 * A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an ETSI
 * standard telecommunication application) and function package descriptor that uses the TOSCA standard to describe how
 * the network functions should run on your network.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ValidateSolFunctionPackageContentMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateSolFunctionPackageContentMetadata implements Serializable, Cloneable, StructuredPojo {

    private FunctionArtifactMeta vnfd;

    /**
     * @param vnfd
     */

    public void setVnfd(FunctionArtifactMeta vnfd) {
        this.vnfd = vnfd;
    }

    /**
     * @return
     */

    public FunctionArtifactMeta getVnfd() {
        return this.vnfd;
    }

    /**
     * @param vnfd
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateSolFunctionPackageContentMetadata withVnfd(FunctionArtifactMeta vnfd) {
        setVnfd(vnfd);
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
        if (getVnfd() != null)
            sb.append("Vnfd: ").append(getVnfd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidateSolFunctionPackageContentMetadata == false)
            return false;
        ValidateSolFunctionPackageContentMetadata other = (ValidateSolFunctionPackageContentMetadata) obj;
        if (other.getVnfd() == null ^ this.getVnfd() == null)
            return false;
        if (other.getVnfd() != null && other.getVnfd().equals(this.getVnfd()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVnfd() == null) ? 0 : getVnfd().hashCode());
        return hashCode;
    }

    @Override
    public ValidateSolFunctionPackageContentMetadata clone() {
        try {
            return (ValidateSolFunctionPackageContentMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.tnb.model.transform.ValidateSolFunctionPackageContentMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
