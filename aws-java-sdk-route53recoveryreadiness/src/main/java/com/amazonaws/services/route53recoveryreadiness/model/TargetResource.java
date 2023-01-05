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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The target resource that the Route 53 record points to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/TargetResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Network Load Balancer Resource.
     * </p>
     */
    private NLBResource nLBResource;
    /**
     * <p>
     * The Route 53 resource.
     * </p>
     */
    private R53ResourceRecord r53Resource;

    /**
     * <p>
     * The Network Load Balancer Resource.
     * </p>
     * 
     * @param nLBResource
     *        The Network Load Balancer Resource.
     */

    public void setNLBResource(NLBResource nLBResource) {
        this.nLBResource = nLBResource;
    }

    /**
     * <p>
     * The Network Load Balancer Resource.
     * </p>
     * 
     * @return The Network Load Balancer Resource.
     */

    public NLBResource getNLBResource() {
        return this.nLBResource;
    }

    /**
     * <p>
     * The Network Load Balancer Resource.
     * </p>
     * 
     * @param nLBResource
     *        The Network Load Balancer Resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetResource withNLBResource(NLBResource nLBResource) {
        setNLBResource(nLBResource);
        return this;
    }

    /**
     * <p>
     * The Route 53 resource.
     * </p>
     * 
     * @param r53Resource
     *        The Route 53 resource.
     */

    public void setR53Resource(R53ResourceRecord r53Resource) {
        this.r53Resource = r53Resource;
    }

    /**
     * <p>
     * The Route 53 resource.
     * </p>
     * 
     * @return The Route 53 resource.
     */

    public R53ResourceRecord getR53Resource() {
        return this.r53Resource;
    }

    /**
     * <p>
     * The Route 53 resource.
     * </p>
     * 
     * @param r53Resource
     *        The Route 53 resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetResource withR53Resource(R53ResourceRecord r53Resource) {
        setR53Resource(r53Resource);
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
        if (getNLBResource() != null)
            sb.append("NLBResource: ").append(getNLBResource()).append(",");
        if (getR53Resource() != null)
            sb.append("R53Resource: ").append(getR53Resource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetResource == false)
            return false;
        TargetResource other = (TargetResource) obj;
        if (other.getNLBResource() == null ^ this.getNLBResource() == null)
            return false;
        if (other.getNLBResource() != null && other.getNLBResource().equals(this.getNLBResource()) == false)
            return false;
        if (other.getR53Resource() == null ^ this.getR53Resource() == null)
            return false;
        if (other.getR53Resource() != null && other.getR53Resource().equals(this.getR53Resource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNLBResource() == null) ? 0 : getNLBResource().hashCode());
        hashCode = prime * hashCode + ((getR53Resource() == null) ? 0 : getR53Resource().hashCode());
        return hashCode;
    }

    @Override
    public TargetResource clone() {
        try {
            return (TargetResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoveryreadiness.model.transform.TargetResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
