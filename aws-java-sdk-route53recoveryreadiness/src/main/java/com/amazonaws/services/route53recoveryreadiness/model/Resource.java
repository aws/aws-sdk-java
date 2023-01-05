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
 * The resource element of a resource set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/Resource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Resource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The component identifier of the resource, generated when DNS target resource is used.
     * </p>
     */
    private String componentId;
    /**
     * <p>
     * The DNS target resource.
     * </p>
     */
    private DNSTargetResource dnsTargetResource;
    /**
     * <p>
     * A list of recovery group Amazon Resource Names (ARNs) and cell ARNs that this resource is contained within.
     * </p>
     */
    private java.util.List<String> readinessScopes;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services resource.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The component identifier of the resource, generated when DNS target resource is used.
     * </p>
     * 
     * @param componentId
     *        The component identifier of the resource, generated when DNS target resource is used.
     */

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    /**
     * <p>
     * The component identifier of the resource, generated when DNS target resource is used.
     * </p>
     * 
     * @return The component identifier of the resource, generated when DNS target resource is used.
     */

    public String getComponentId() {
        return this.componentId;
    }

    /**
     * <p>
     * The component identifier of the resource, generated when DNS target resource is used.
     * </p>
     * 
     * @param componentId
     *        The component identifier of the resource, generated when DNS target resource is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withComponentId(String componentId) {
        setComponentId(componentId);
        return this;
    }

    /**
     * <p>
     * The DNS target resource.
     * </p>
     * 
     * @param dnsTargetResource
     *        The DNS target resource.
     */

    public void setDnsTargetResource(DNSTargetResource dnsTargetResource) {
        this.dnsTargetResource = dnsTargetResource;
    }

    /**
     * <p>
     * The DNS target resource.
     * </p>
     * 
     * @return The DNS target resource.
     */

    public DNSTargetResource getDnsTargetResource() {
        return this.dnsTargetResource;
    }

    /**
     * <p>
     * The DNS target resource.
     * </p>
     * 
     * @param dnsTargetResource
     *        The DNS target resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withDnsTargetResource(DNSTargetResource dnsTargetResource) {
        setDnsTargetResource(dnsTargetResource);
        return this;
    }

    /**
     * <p>
     * A list of recovery group Amazon Resource Names (ARNs) and cell ARNs that this resource is contained within.
     * </p>
     * 
     * @return A list of recovery group Amazon Resource Names (ARNs) and cell ARNs that this resource is contained
     *         within.
     */

    public java.util.List<String> getReadinessScopes() {
        return readinessScopes;
    }

    /**
     * <p>
     * A list of recovery group Amazon Resource Names (ARNs) and cell ARNs that this resource is contained within.
     * </p>
     * 
     * @param readinessScopes
     *        A list of recovery group Amazon Resource Names (ARNs) and cell ARNs that this resource is contained
     *        within.
     */

    public void setReadinessScopes(java.util.Collection<String> readinessScopes) {
        if (readinessScopes == null) {
            this.readinessScopes = null;
            return;
        }

        this.readinessScopes = new java.util.ArrayList<String>(readinessScopes);
    }

    /**
     * <p>
     * A list of recovery group Amazon Resource Names (ARNs) and cell ARNs that this resource is contained within.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReadinessScopes(java.util.Collection)} or {@link #withReadinessScopes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param readinessScopes
     *        A list of recovery group Amazon Resource Names (ARNs) and cell ARNs that this resource is contained
     *        within.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withReadinessScopes(String... readinessScopes) {
        if (this.readinessScopes == null) {
            setReadinessScopes(new java.util.ArrayList<String>(readinessScopes.length));
        }
        for (String ele : readinessScopes) {
            this.readinessScopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of recovery group Amazon Resource Names (ARNs) and cell ARNs that this resource is contained within.
     * </p>
     * 
     * @param readinessScopes
     *        A list of recovery group Amazon Resource Names (ARNs) and cell ARNs that this resource is contained
     *        within.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withReadinessScopes(java.util.Collection<String> readinessScopes) {
        setReadinessScopes(readinessScopes);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services resource.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services resource.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Web Services resource.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services resource.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getComponentId() != null)
            sb.append("ComponentId: ").append(getComponentId()).append(",");
        if (getDnsTargetResource() != null)
            sb.append("DnsTargetResource: ").append(getDnsTargetResource()).append(",");
        if (getReadinessScopes() != null)
            sb.append("ReadinessScopes: ").append(getReadinessScopes()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resource == false)
            return false;
        Resource other = (Resource) obj;
        if (other.getComponentId() == null ^ this.getComponentId() == null)
            return false;
        if (other.getComponentId() != null && other.getComponentId().equals(this.getComponentId()) == false)
            return false;
        if (other.getDnsTargetResource() == null ^ this.getDnsTargetResource() == null)
            return false;
        if (other.getDnsTargetResource() != null && other.getDnsTargetResource().equals(this.getDnsTargetResource()) == false)
            return false;
        if (other.getReadinessScopes() == null ^ this.getReadinessScopes() == null)
            return false;
        if (other.getReadinessScopes() != null && other.getReadinessScopes().equals(this.getReadinessScopes()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentId() == null) ? 0 : getComponentId().hashCode());
        hashCode = prime * hashCode + ((getDnsTargetResource() == null) ? 0 : getDnsTargetResource().hashCode());
        hashCode = prime * hashCode + ((getReadinessScopes() == null) ? 0 : getReadinessScopes().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public Resource clone() {
        try {
            return (Resource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoveryreadiness.model.transform.ResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
