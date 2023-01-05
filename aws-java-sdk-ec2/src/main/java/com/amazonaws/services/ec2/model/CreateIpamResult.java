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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIpamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the IPAM created.
     * </p>
     */
    private Ipam ipam;

    /**
     * <p>
     * Information about the IPAM created.
     * </p>
     * 
     * @param ipam
     *        Information about the IPAM created.
     */

    public void setIpam(Ipam ipam) {
        this.ipam = ipam;
    }

    /**
     * <p>
     * Information about the IPAM created.
     * </p>
     * 
     * @return Information about the IPAM created.
     */

    public Ipam getIpam() {
        return this.ipam;
    }

    /**
     * <p>
     * Information about the IPAM created.
     * </p>
     * 
     * @param ipam
     *        Information about the IPAM created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamResult withIpam(Ipam ipam) {
        setIpam(ipam);
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
        if (getIpam() != null)
            sb.append("Ipam: ").append(getIpam());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIpamResult == false)
            return false;
        CreateIpamResult other = (CreateIpamResult) obj;
        if (other.getIpam() == null ^ this.getIpam() == null)
            return false;
        if (other.getIpam() != null && other.getIpam().equals(this.getIpam()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpam() == null) ? 0 : getIpam().hashCode());
        return hashCode;
    }

    @Override
    public CreateIpamResult clone() {
        try {
            return (CreateIpamResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
