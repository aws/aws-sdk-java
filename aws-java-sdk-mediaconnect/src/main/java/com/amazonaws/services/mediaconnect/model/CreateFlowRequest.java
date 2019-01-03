/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Creates a new flow. The request must include one source. The request optionally can include outputs (up to 20) and
 * entitlements (up to 50).
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/CreateFlow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFlowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones
     * within the current AWS Region.
     */
    private String availabilityZone;
    /** The entitlements that you want to grant on a flow. */
    private java.util.List<GrantEntitlementRequest> entitlements;
    /** The name of the flow. */
    private String name;
    /** The outputs that you want to add to this flow. */
    private java.util.List<AddOutputRequest> outputs;

    private SetSourceRequest source;

    /**
     * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones
     * within the current AWS Region.
     * 
     * @param availabilityZone
     *        The Availability Zone that you want to create the flow in. These options are limited to the Availability
     *        Zones within the current AWS Region.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones
     * within the current AWS Region.
     * 
     * @return The Availability Zone that you want to create the flow in. These options are limited to the Availability
     *         Zones within the current AWS Region.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones
     * within the current AWS Region.
     * 
     * @param availabilityZone
     *        The Availability Zone that you want to create the flow in. These options are limited to the Availability
     *        Zones within the current AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * The entitlements that you want to grant on a flow.
     * 
     * @return The entitlements that you want to grant on a flow.
     */

    public java.util.List<GrantEntitlementRequest> getEntitlements() {
        return entitlements;
    }

    /**
     * The entitlements that you want to grant on a flow.
     * 
     * @param entitlements
     *        The entitlements that you want to grant on a flow.
     */

    public void setEntitlements(java.util.Collection<GrantEntitlementRequest> entitlements) {
        if (entitlements == null) {
            this.entitlements = null;
            return;
        }

        this.entitlements = new java.util.ArrayList<GrantEntitlementRequest>(entitlements);
    }

    /**
     * The entitlements that you want to grant on a flow.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntitlements(java.util.Collection)} or {@link #withEntitlements(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entitlements
     *        The entitlements that you want to grant on a flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withEntitlements(GrantEntitlementRequest... entitlements) {
        if (this.entitlements == null) {
            setEntitlements(new java.util.ArrayList<GrantEntitlementRequest>(entitlements.length));
        }
        for (GrantEntitlementRequest ele : entitlements) {
            this.entitlements.add(ele);
        }
        return this;
    }

    /**
     * The entitlements that you want to grant on a flow.
     * 
     * @param entitlements
     *        The entitlements that you want to grant on a flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withEntitlements(java.util.Collection<GrantEntitlementRequest> entitlements) {
        setEntitlements(entitlements);
        return this;
    }

    /**
     * The name of the flow.
     * 
     * @param name
     *        The name of the flow.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the flow.
     * 
     * @return The name of the flow.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the flow.
     * 
     * @param name
     *        The name of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The outputs that you want to add to this flow.
     * 
     * @return The outputs that you want to add to this flow.
     */

    public java.util.List<AddOutputRequest> getOutputs() {
        return outputs;
    }

    /**
     * The outputs that you want to add to this flow.
     * 
     * @param outputs
     *        The outputs that you want to add to this flow.
     */

    public void setOutputs(java.util.Collection<AddOutputRequest> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<AddOutputRequest>(outputs);
    }

    /**
     * The outputs that you want to add to this flow.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        The outputs that you want to add to this flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withOutputs(AddOutputRequest... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<AddOutputRequest>(outputs.length));
        }
        for (AddOutputRequest ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * The outputs that you want to add to this flow.
     * 
     * @param outputs
     *        The outputs that you want to add to this flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withOutputs(java.util.Collection<AddOutputRequest> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * @param source
     */

    public void setSource(SetSourceRequest source) {
        this.source = source;
    }

    /**
     * @return
     */

    public SetSourceRequest getSource() {
        return this.source;
    }

    /**
     * @param source
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withSource(SetSourceRequest source) {
        setSource(source);
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getEntitlements() != null)
            sb.append("Entitlements: ").append(getEntitlements()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFlowRequest == false)
            return false;
        CreateFlowRequest other = (CreateFlowRequest) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getEntitlements() == null ^ this.getEntitlements() == null)
            return false;
        if (other.getEntitlements() != null && other.getEntitlements().equals(this.getEntitlements()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getEntitlements() == null) ? 0 : getEntitlements().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public CreateFlowRequest clone() {
        return (CreateFlowRequest) super.clone();
    }

}
