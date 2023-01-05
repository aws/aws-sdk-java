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
package com.amazonaws.services.backupgateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GetHypervisor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetHypervisorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about the requested hypervisor.
     * </p>
     */
    private HypervisorDetails hypervisor;

    /**
     * <p>
     * Details about the requested hypervisor.
     * </p>
     * 
     * @param hypervisor
     *        Details about the requested hypervisor.
     */

    public void setHypervisor(HypervisorDetails hypervisor) {
        this.hypervisor = hypervisor;
    }

    /**
     * <p>
     * Details about the requested hypervisor.
     * </p>
     * 
     * @return Details about the requested hypervisor.
     */

    public HypervisorDetails getHypervisor() {
        return this.hypervisor;
    }

    /**
     * <p>
     * Details about the requested hypervisor.
     * </p>
     * 
     * @param hypervisor
     *        Details about the requested hypervisor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHypervisorResult withHypervisor(HypervisorDetails hypervisor) {
        setHypervisor(hypervisor);
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
        if (getHypervisor() != null)
            sb.append("Hypervisor: ").append(getHypervisor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHypervisorResult == false)
            return false;
        GetHypervisorResult other = (GetHypervisorResult) obj;
        if (other.getHypervisor() == null ^ this.getHypervisor() == null)
            return false;
        if (other.getHypervisor() != null && other.getHypervisor().equals(this.getHypervisor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHypervisor() == null) ? 0 : getHypervisor().hashCode());
        return hashCode;
    }

    @Override
    public GetHypervisorResult clone() {
        try {
            return (GetHypervisorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
