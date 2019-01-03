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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The settings for a flow, including its source, outputs, and entitlements.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/Flow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Flow implements Serializable, Cloneable, StructuredPojo {

    /**
     * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones
     * within the current AWS.
     */
    private String availabilityZone;
    /**
     * A description of the flow. This value is not used or seen outside of the current AWS Elemental MediaConnect
     * account.
     */
    private String description;
    /** The IP address from which video will be sent to output destinations. */
    private String egressIp;
    /** The entitlements in this flow. */
    private java.util.List<Entitlement> entitlements;
    /** The Amazon Resource Name (ARN), a unique identifier for any AWS resource, of the flow. */
    private String flowArn;
    /** The name of the flow. */
    private String name;
    /** The outputs in this flow. */
    private java.util.List<Output> outputs;

    private Source source;
    /** The current status of the flow. */
    private String status;

    /**
     * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones
     * within the current AWS.
     * 
     * @param availabilityZone
     *        The Availability Zone that you want to create the flow in. These options are limited to the Availability
     *        Zones within the current AWS.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones
     * within the current AWS.
     * 
     * @return The Availability Zone that you want to create the flow in. These options are limited to the Availability
     *         Zones within the current AWS.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones
     * within the current AWS.
     * 
     * @param availabilityZone
     *        The Availability Zone that you want to create the flow in. These options are limited to the Availability
     *        Zones within the current AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Flow withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * A description of the flow. This value is not used or seen outside of the current AWS Elemental MediaConnect
     * account.
     * 
     * @param description
     *        A description of the flow. This value is not used or seen outside of the current AWS Elemental
     *        MediaConnect account.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A description of the flow. This value is not used or seen outside of the current AWS Elemental MediaConnect
     * account.
     * 
     * @return A description of the flow. This value is not used or seen outside of the current AWS Elemental
     *         MediaConnect account.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * A description of the flow. This value is not used or seen outside of the current AWS Elemental MediaConnect
     * account.
     * 
     * @param description
     *        A description of the flow. This value is not used or seen outside of the current AWS Elemental
     *        MediaConnect account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Flow withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * The IP address from which video will be sent to output destinations.
     * 
     * @param egressIp
     *        The IP address from which video will be sent to output destinations.
     */

    public void setEgressIp(String egressIp) {
        this.egressIp = egressIp;
    }

    /**
     * The IP address from which video will be sent to output destinations.
     * 
     * @return The IP address from which video will be sent to output destinations.
     */

    public String getEgressIp() {
        return this.egressIp;
    }

    /**
     * The IP address from which video will be sent to output destinations.
     * 
     * @param egressIp
     *        The IP address from which video will be sent to output destinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Flow withEgressIp(String egressIp) {
        setEgressIp(egressIp);
        return this;
    }

    /**
     * The entitlements in this flow.
     * 
     * @return The entitlements in this flow.
     */

    public java.util.List<Entitlement> getEntitlements() {
        return entitlements;
    }

    /**
     * The entitlements in this flow.
     * 
     * @param entitlements
     *        The entitlements in this flow.
     */

    public void setEntitlements(java.util.Collection<Entitlement> entitlements) {
        if (entitlements == null) {
            this.entitlements = null;
            return;
        }

        this.entitlements = new java.util.ArrayList<Entitlement>(entitlements);
    }

    /**
     * The entitlements in this flow.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntitlements(java.util.Collection)} or {@link #withEntitlements(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entitlements
     *        The entitlements in this flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Flow withEntitlements(Entitlement... entitlements) {
        if (this.entitlements == null) {
            setEntitlements(new java.util.ArrayList<Entitlement>(entitlements.length));
        }
        for (Entitlement ele : entitlements) {
            this.entitlements.add(ele);
        }
        return this;
    }

    /**
     * The entitlements in this flow.
     * 
     * @param entitlements
     *        The entitlements in this flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Flow withEntitlements(java.util.Collection<Entitlement> entitlements) {
        setEntitlements(entitlements);
        return this;
    }

    /**
     * The Amazon Resource Name (ARN), a unique identifier for any AWS resource, of the flow.
     * 
     * @param flowArn
     *        The Amazon Resource Name (ARN), a unique identifier for any AWS resource, of the flow.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The Amazon Resource Name (ARN), a unique identifier for any AWS resource, of the flow.
     * 
     * @return The Amazon Resource Name (ARN), a unique identifier for any AWS resource, of the flow.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The Amazon Resource Name (ARN), a unique identifier for any AWS resource, of the flow.
     * 
     * @param flowArn
     *        The Amazon Resource Name (ARN), a unique identifier for any AWS resource, of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Flow withFlowArn(String flowArn) {
        setFlowArn(flowArn);
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

    public Flow withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The outputs in this flow.
     * 
     * @return The outputs in this flow.
     */

    public java.util.List<Output> getOutputs() {
        return outputs;
    }

    /**
     * The outputs in this flow.
     * 
     * @param outputs
     *        The outputs in this flow.
     */

    public void setOutputs(java.util.Collection<Output> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<Output>(outputs);
    }

    /**
     * The outputs in this flow.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        The outputs in this flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Flow withOutputs(Output... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<Output>(outputs.length));
        }
        for (Output ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * The outputs in this flow.
     * 
     * @param outputs
     *        The outputs in this flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Flow withOutputs(java.util.Collection<Output> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * @param source
     */

    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * @return
     */

    public Source getSource() {
        return this.source;
    }

    /**
     * @param source
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Flow withSource(Source source) {
        setSource(source);
        return this;
    }

    /**
     * The current status of the flow.
     * 
     * @param status
     *        The current status of the flow.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * The current status of the flow.
     * 
     * @return The current status of the flow.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * The current status of the flow.
     * 
     * @param status
     *        The current status of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public Flow withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * The current status of the flow.
     * 
     * @param status
     *        The current status of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public Flow withStatus(Status status) {
        this.status = status.toString();
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEgressIp() != null)
            sb.append("EgressIp: ").append(getEgressIp()).append(",");
        if (getEntitlements() != null)
            sb.append("Entitlements: ").append(getEntitlements()).append(",");
        if (getFlowArn() != null)
            sb.append("FlowArn: ").append(getFlowArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Flow == false)
            return false;
        Flow other = (Flow) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEgressIp() == null ^ this.getEgressIp() == null)
            return false;
        if (other.getEgressIp() != null && other.getEgressIp().equals(this.getEgressIp()) == false)
            return false;
        if (other.getEntitlements() == null ^ this.getEntitlements() == null)
            return false;
        if (other.getEntitlements() != null && other.getEntitlements().equals(this.getEntitlements()) == false)
            return false;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEgressIp() == null) ? 0 : getEgressIp().hashCode());
        hashCode = prime * hashCode + ((getEntitlements() == null) ? 0 : getEntitlements().hashCode());
        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public Flow clone() {
        try {
            return (Flow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.FlowMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
