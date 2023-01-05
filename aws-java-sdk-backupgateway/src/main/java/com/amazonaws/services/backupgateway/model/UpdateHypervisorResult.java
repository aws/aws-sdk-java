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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/UpdateHypervisor" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateHypervisorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hypervisor you updated.
     * </p>
     */
    private String hypervisorArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hypervisor you updated.
     * </p>
     * 
     * @param hypervisorArn
     *        The Amazon Resource Name (ARN) of the hypervisor you updated.
     */

    public void setHypervisorArn(String hypervisorArn) {
        this.hypervisorArn = hypervisorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hypervisor you updated.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the hypervisor you updated.
     */

    public String getHypervisorArn() {
        return this.hypervisorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hypervisor you updated.
     * </p>
     * 
     * @param hypervisorArn
     *        The Amazon Resource Name (ARN) of the hypervisor you updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHypervisorResult withHypervisorArn(String hypervisorArn) {
        setHypervisorArn(hypervisorArn);
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
        if (getHypervisorArn() != null)
            sb.append("HypervisorArn: ").append(getHypervisorArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateHypervisorResult == false)
            return false;
        UpdateHypervisorResult other = (UpdateHypervisorResult) obj;
        if (other.getHypervisorArn() == null ^ this.getHypervisorArn() == null)
            return false;
        if (other.getHypervisorArn() != null && other.getHypervisorArn().equals(this.getHypervisorArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHypervisorArn() == null) ? 0 : getHypervisorArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateHypervisorResult clone() {
        try {
            return (UpdateHypervisorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
