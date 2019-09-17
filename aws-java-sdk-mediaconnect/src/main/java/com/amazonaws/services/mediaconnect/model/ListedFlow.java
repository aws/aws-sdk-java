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
 * Provides a summary of a flow, including its ARN, Availability Zone, and source type.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListedFlow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListedFlow implements Serializable, Cloneable, StructuredPojo {

    /** The Availability Zone that the flow was created in. */
    private String availabilityZone;
    /** A description of the flow. */
    private String description;
    /** The ARN of the flow. */
    private String flowArn;
    /** The name of the flow. */
    private String name;
    /**
     * The type of source. This value is either owned (originated somewhere other than an AWS Elemental MediaConnect
     * flow owned by another AWS account) or entitled (originated at an AWS Elemental MediaConnect flow owned by another
     * AWS account).
     */
    private String sourceType;
    /** The current status of the flow. */
    private String status;

    /**
     * The Availability Zone that the flow was created in.
     * 
     * @param availabilityZone
     *        The Availability Zone that the flow was created in.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * The Availability Zone that the flow was created in.
     * 
     * @return The Availability Zone that the flow was created in.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * The Availability Zone that the flow was created in.
     * 
     * @param availabilityZone
     *        The Availability Zone that the flow was created in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedFlow withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * A description of the flow.
     * 
     * @param description
     *        A description of the flow.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A description of the flow.
     * 
     * @return A description of the flow.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * A description of the flow.
     * 
     * @param description
     *        A description of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedFlow withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * The ARN of the flow.
     * 
     * @param flowArn
     *        The ARN of the flow.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The ARN of the flow.
     * 
     * @return The ARN of the flow.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The ARN of the flow.
     * 
     * @param flowArn
     *        The ARN of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedFlow withFlowArn(String flowArn) {
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

    public ListedFlow withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The type of source. This value is either owned (originated somewhere other than an AWS Elemental MediaConnect
     * flow owned by another AWS account) or entitled (originated at an AWS Elemental MediaConnect flow owned by another
     * AWS account).
     * 
     * @param sourceType
     *        The type of source. This value is either owned (originated somewhere other than an AWS Elemental
     *        MediaConnect flow owned by another AWS account) or entitled (originated at an AWS Elemental MediaConnect
     *        flow owned by another AWS account).
     * @see SourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * The type of source. This value is either owned (originated somewhere other than an AWS Elemental MediaConnect
     * flow owned by another AWS account) or entitled (originated at an AWS Elemental MediaConnect flow owned by another
     * AWS account).
     * 
     * @return The type of source. This value is either owned (originated somewhere other than an AWS Elemental
     *         MediaConnect flow owned by another AWS account) or entitled (originated at an AWS Elemental MediaConnect
     *         flow owned by another AWS account).
     * @see SourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * The type of source. This value is either owned (originated somewhere other than an AWS Elemental MediaConnect
     * flow owned by another AWS account) or entitled (originated at an AWS Elemental MediaConnect flow owned by another
     * AWS account).
     * 
     * @param sourceType
     *        The type of source. This value is either owned (originated somewhere other than an AWS Elemental
     *        MediaConnect flow owned by another AWS account) or entitled (originated at an AWS Elemental MediaConnect
     *        flow owned by another AWS account).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public ListedFlow withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * The type of source. This value is either owned (originated somewhere other than an AWS Elemental MediaConnect
     * flow owned by another AWS account) or entitled (originated at an AWS Elemental MediaConnect flow owned by another
     * AWS account).
     * 
     * @param sourceType
     *        The type of source. This value is either owned (originated somewhere other than an AWS Elemental
     *        MediaConnect flow owned by another AWS account) or entitled (originated at an AWS Elemental MediaConnect
     *        flow owned by another AWS account).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public ListedFlow withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
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

    public ListedFlow withStatus(String status) {
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

    public ListedFlow withStatus(Status status) {
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
        if (getFlowArn() != null)
            sb.append("FlowArn: ").append(getFlowArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
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

        if (obj instanceof ListedFlow == false)
            return false;
        ListedFlow other = (ListedFlow) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
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
        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListedFlow clone() {
        try {
            return (ListedFlow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.ListedFlowMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
