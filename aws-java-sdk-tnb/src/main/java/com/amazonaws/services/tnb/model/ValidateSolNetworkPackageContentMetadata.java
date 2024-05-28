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
 * Validates network package content metadata.
 * </p>
 * <p>
 * A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to
 * deploy and the Amazon Web Services infrastructure you want to deploy them on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ValidateSolNetworkPackageContentMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateSolNetworkPackageContentMetadata implements Serializable, Cloneable, StructuredPojo {

    private NetworkArtifactMeta nsd;

    /**
     * @param nsd
     */

    public void setNsd(NetworkArtifactMeta nsd) {
        this.nsd = nsd;
    }

    /**
     * @return
     */

    public NetworkArtifactMeta getNsd() {
        return this.nsd;
    }

    /**
     * @param nsd
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateSolNetworkPackageContentMetadata withNsd(NetworkArtifactMeta nsd) {
        setNsd(nsd);
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
        if (getNsd() != null)
            sb.append("Nsd: ").append(getNsd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidateSolNetworkPackageContentMetadata == false)
            return false;
        ValidateSolNetworkPackageContentMetadata other = (ValidateSolNetworkPackageContentMetadata) obj;
        if (other.getNsd() == null ^ this.getNsd() == null)
            return false;
        if (other.getNsd() != null && other.getNsd().equals(this.getNsd()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNsd() == null) ? 0 : getNsd().hashCode());
        return hashCode;
    }

    @Override
    public ValidateSolNetworkPackageContentMetadata clone() {
        try {
            return (ValidateSolNetworkPackageContentMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.tnb.model.transform.ValidateSolNetworkPackageContentMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
