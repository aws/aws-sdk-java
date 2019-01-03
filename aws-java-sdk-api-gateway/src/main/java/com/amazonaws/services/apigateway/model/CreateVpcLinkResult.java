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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A API Gateway VPC link for a <a>RestApi</a> to access resources in an Amazon Virtual Private Cloud (VPC).
 * </p>
 * <div class="remarks">
 * <p>
 * <p>
 * To enable access to a resource in an Amazon Virtual Private Cloud through Amazon API Gateway, you, as an API
 * developer, create a <a>VpcLink</a> resource targeted for one or more network load balancers of the VPC and then
 * integrate an API method with a private integration that uses the <a>VpcLink</a>. The private integration has an
 * integration type of <code>HTTP</code> or <code>HTTP_PROXY</code> and has a connection type of <code>VPC_LINK</code>.
 * The integration uses the <code>connectionId</code> property to identify the <a>VpcLink</a> used.
 * </p>
 * </p> </div>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcLinkResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a> to reference this <a>VpcLink</a>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name used to label and identify the VPC link.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the VPC link.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARNs of network load balancers of the VPC targeted by the VPC link. The network load balancers must be owned
     * by the same AWS account of the API owner.
     * </p>
     */
    private java.util.List<String> targetArns;
    /**
     * <p>
     * The status of the VPC link. The valid values are <code>AVAILABLE</code>, <code>PENDING</code>,
     * <code>DELETING</code>, or <code>FAILED</code>. Deploying an API will wait if the status is <code>PENDING</code>
     * and will fail if the status is <code>DELETING</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A description about the VPC link status.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a> to reference this <a>VpcLink</a>.
     * </p>
     * 
     * @param id
     *        The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a> to reference this
     *        <a>VpcLink</a>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a> to reference this <a>VpcLink</a>.
     * </p>
     * 
     * @return The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a> to reference this
     *         <a>VpcLink</a>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a> to reference this <a>VpcLink</a>.
     * </p>
     * 
     * @param id
     *        The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a> to reference this
     *        <a>VpcLink</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcLinkResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name used to label and identify the VPC link.
     * </p>
     * 
     * @param name
     *        The name used to label and identify the VPC link.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name used to label and identify the VPC link.
     * </p>
     * 
     * @return The name used to label and identify the VPC link.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name used to label and identify the VPC link.
     * </p>
     * 
     * @param name
     *        The name used to label and identify the VPC link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcLinkResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the VPC link.
     * </p>
     * 
     * @param description
     *        The description of the VPC link.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the VPC link.
     * </p>
     * 
     * @return The description of the VPC link.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the VPC link.
     * </p>
     * 
     * @param description
     *        The description of the VPC link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcLinkResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARNs of network load balancers of the VPC targeted by the VPC link. The network load balancers must be owned
     * by the same AWS account of the API owner.
     * </p>
     * 
     * @return The ARNs of network load balancers of the VPC targeted by the VPC link. The network load balancers must
     *         be owned by the same AWS account of the API owner.
     */

    public java.util.List<String> getTargetArns() {
        return targetArns;
    }

    /**
     * <p>
     * The ARNs of network load balancers of the VPC targeted by the VPC link. The network load balancers must be owned
     * by the same AWS account of the API owner.
     * </p>
     * 
     * @param targetArns
     *        The ARNs of network load balancers of the VPC targeted by the VPC link. The network load balancers must be
     *        owned by the same AWS account of the API owner.
     */

    public void setTargetArns(java.util.Collection<String> targetArns) {
        if (targetArns == null) {
            this.targetArns = null;
            return;
        }

        this.targetArns = new java.util.ArrayList<String>(targetArns);
    }

    /**
     * <p>
     * The ARNs of network load balancers of the VPC targeted by the VPC link. The network load balancers must be owned
     * by the same AWS account of the API owner.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetArns(java.util.Collection)} or {@link #withTargetArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetArns
     *        The ARNs of network load balancers of the VPC targeted by the VPC link. The network load balancers must be
     *        owned by the same AWS account of the API owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcLinkResult withTargetArns(String... targetArns) {
        if (this.targetArns == null) {
            setTargetArns(new java.util.ArrayList<String>(targetArns.length));
        }
        for (String ele : targetArns) {
            this.targetArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs of network load balancers of the VPC targeted by the VPC link. The network load balancers must be owned
     * by the same AWS account of the API owner.
     * </p>
     * 
     * @param targetArns
     *        The ARNs of network load balancers of the VPC targeted by the VPC link. The network load balancers must be
     *        owned by the same AWS account of the API owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcLinkResult withTargetArns(java.util.Collection<String> targetArns) {
        setTargetArns(targetArns);
        return this;
    }

    /**
     * <p>
     * The status of the VPC link. The valid values are <code>AVAILABLE</code>, <code>PENDING</code>,
     * <code>DELETING</code>, or <code>FAILED</code>. Deploying an API will wait if the status is <code>PENDING</code>
     * and will fail if the status is <code>DELETING</code>.
     * </p>
     * 
     * @param status
     *        The status of the VPC link. The valid values are <code>AVAILABLE</code>, <code>PENDING</code>,
     *        <code>DELETING</code>, or <code>FAILED</code>. Deploying an API will wait if the status is
     *        <code>PENDING</code> and will fail if the status is <code>DELETING</code>.
     * @see VpcLinkStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the VPC link. The valid values are <code>AVAILABLE</code>, <code>PENDING</code>,
     * <code>DELETING</code>, or <code>FAILED</code>. Deploying an API will wait if the status is <code>PENDING</code>
     * and will fail if the status is <code>DELETING</code>.
     * </p>
     * 
     * @return The status of the VPC link. The valid values are <code>AVAILABLE</code>, <code>PENDING</code>,
     *         <code>DELETING</code>, or <code>FAILED</code>. Deploying an API will wait if the status is
     *         <code>PENDING</code> and will fail if the status is <code>DELETING</code>.
     * @see VpcLinkStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the VPC link. The valid values are <code>AVAILABLE</code>, <code>PENDING</code>,
     * <code>DELETING</code>, or <code>FAILED</code>. Deploying an API will wait if the status is <code>PENDING</code>
     * and will fail if the status is <code>DELETING</code>.
     * </p>
     * 
     * @param status
     *        The status of the VPC link. The valid values are <code>AVAILABLE</code>, <code>PENDING</code>,
     *        <code>DELETING</code>, or <code>FAILED</code>. Deploying an API will wait if the status is
     *        <code>PENDING</code> and will fail if the status is <code>DELETING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcLinkStatus
     */

    public CreateVpcLinkResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the VPC link. The valid values are <code>AVAILABLE</code>, <code>PENDING</code>,
     * <code>DELETING</code>, or <code>FAILED</code>. Deploying an API will wait if the status is <code>PENDING</code>
     * and will fail if the status is <code>DELETING</code>.
     * </p>
     * 
     * @param status
     *        The status of the VPC link. The valid values are <code>AVAILABLE</code>, <code>PENDING</code>,
     *        <code>DELETING</code>, or <code>FAILED</code>. Deploying an API will wait if the status is
     *        <code>PENDING</code> and will fail if the status is <code>DELETING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcLinkStatus
     */

    public CreateVpcLinkResult withStatus(VpcLinkStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A description about the VPC link status.
     * </p>
     * 
     * @param statusMessage
     *        A description about the VPC link status.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A description about the VPC link status.
     * </p>
     * 
     * @return A description about the VPC link status.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A description about the VPC link status.
     * </p>
     * 
     * @param statusMessage
     *        A description about the VPC link status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcLinkResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTargetArns() != null)
            sb.append("TargetArns: ").append(getTargetArns()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpcLinkResult == false)
            return false;
        CreateVpcLinkResult other = (CreateVpcLinkResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTargetArns() == null ^ this.getTargetArns() == null)
            return false;
        if (other.getTargetArns() != null && other.getTargetArns().equals(this.getTargetArns()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTargetArns() == null) ? 0 : getTargetArns().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpcLinkResult clone() {
        try {
            return (CreateVpcLinkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
