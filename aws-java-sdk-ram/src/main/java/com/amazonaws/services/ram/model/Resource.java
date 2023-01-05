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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a resource associated with a resource share in RAM.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/Resource" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Resource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The resource type. This takes the form of: <code>service-code</code>:<code>resource-code</code>
     * </p>
     */
    private String type;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the resource share this resource is associated with.
     * </p>
     */
    private String resourceShareArn;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the resource group. This value is available only if the resource is part of a resource group.
     * </p>
     */
    private String resourceGroupArn;
    /**
     * <p>
     * The current status of the resource.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A message about the status of the resource.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The date and time when the resource was associated with the resource share.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The date an time when the association was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * Specifies the scope of visibility of this resource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>REGIONAL</b> – The resource can be accessed only by using requests that target the Amazon Web Services Region
     * in which the resource exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>GLOBAL</b> – The resource can be accessed from any Amazon Web Services Region.
     * </p>
     * </li>
     * </ul>
     */
    private String resourceRegionScope;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the resource.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *        Name (ARN)</a> of the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the resource.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *         Name (ARN)</a> of the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the resource.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *        Name (ARN)</a> of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The resource type. This takes the form of: <code>service-code</code>:<code>resource-code</code>
     * </p>
     * 
     * @param type
     *        The resource type. This takes the form of: <code>service-code</code>:<code>resource-code</code>
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The resource type. This takes the form of: <code>service-code</code>:<code>resource-code</code>
     * </p>
     * 
     * @return The resource type. This takes the form of: <code>service-code</code>:<code>resource-code</code>
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The resource type. This takes the form of: <code>service-code</code>:<code>resource-code</code>
     * </p>
     * 
     * @param type
     *        The resource type. This takes the form of: <code>service-code</code>:<code>resource-code</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the resource share this resource is associated with.
     * </p>
     * 
     * @param resourceShareArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *        Name (ARN)</a> of the resource share this resource is associated with.
     */

    public void setResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the resource share this resource is associated with.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *         Name (ARN)</a> of the resource share this resource is associated with.
     */

    public String getResourceShareArn() {
        return this.resourceShareArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the resource share this resource is associated with.
     * </p>
     * 
     * @param resourceShareArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *        Name (ARN)</a> of the resource share this resource is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withResourceShareArn(String resourceShareArn) {
        setResourceShareArn(resourceShareArn);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the resource group. This value is available only if the resource is part of a resource group.
     * </p>
     * 
     * @param resourceGroupArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *        Name (ARN)</a> of the resource group. This value is available only if the resource is part of a resource
     *        group.
     */

    public void setResourceGroupArn(String resourceGroupArn) {
        this.resourceGroupArn = resourceGroupArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the resource group. This value is available only if the resource is part of a resource group.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *         Name (ARN)</a> of the resource group. This value is available only if the resource is part of a resource
     *         group.
     */

    public String getResourceGroupArn() {
        return this.resourceGroupArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the resource group. This value is available only if the resource is part of a resource group.
     * </p>
     * 
     * @param resourceGroupArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *        Name (ARN)</a> of the resource group. This value is available only if the resource is part of a resource
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withResourceGroupArn(String resourceGroupArn) {
        setResourceGroupArn(resourceGroupArn);
        return this;
    }

    /**
     * <p>
     * The current status of the resource.
     * </p>
     * 
     * @param status
     *        The current status of the resource.
     * @see ResourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the resource.
     * </p>
     * 
     * @return The current status of the resource.
     * @see ResourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the resource.
     * </p>
     * 
     * @param status
     *        The current status of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public Resource withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the resource.
     * </p>
     * 
     * @param status
     *        The current status of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public Resource withStatus(ResourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A message about the status of the resource.
     * </p>
     * 
     * @param statusMessage
     *        A message about the status of the resource.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A message about the status of the resource.
     * </p>
     * 
     * @return A message about the status of the resource.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A message about the status of the resource.
     * </p>
     * 
     * @param statusMessage
     *        A message about the status of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The date and time when the resource was associated with the resource share.
     * </p>
     * 
     * @param creationTime
     *        The date and time when the resource was associated with the resource share.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time when the resource was associated with the resource share.
     * </p>
     * 
     * @return The date and time when the resource was associated with the resource share.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time when the resource was associated with the resource share.
     * </p>
     * 
     * @param creationTime
     *        The date and time when the resource was associated with the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date an time when the association was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date an time when the association was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The date an time when the association was last updated.
     * </p>
     * 
     * @return The date an time when the association was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The date an time when the association was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date an time when the association was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * Specifies the scope of visibility of this resource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>REGIONAL</b> – The resource can be accessed only by using requests that target the Amazon Web Services Region
     * in which the resource exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>GLOBAL</b> – The resource can be accessed from any Amazon Web Services Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceRegionScope
     *        Specifies the scope of visibility of this resource:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>REGIONAL</b> – The resource can be accessed only by using requests that target the Amazon Web Services
     *        Region in which the resource exists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>GLOBAL</b> – The resource can be accessed from any Amazon Web Services Region.
     *        </p>
     *        </li>
     * @see ResourceRegionScope
     */

    public void setResourceRegionScope(String resourceRegionScope) {
        this.resourceRegionScope = resourceRegionScope;
    }

    /**
     * <p>
     * Specifies the scope of visibility of this resource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>REGIONAL</b> – The resource can be accessed only by using requests that target the Amazon Web Services Region
     * in which the resource exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>GLOBAL</b> – The resource can be accessed from any Amazon Web Services Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the scope of visibility of this resource:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>REGIONAL</b> – The resource can be accessed only by using requests that target the Amazon Web Services
     *         Region in which the resource exists.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>GLOBAL</b> – The resource can be accessed from any Amazon Web Services Region.
     *         </p>
     *         </li>
     * @see ResourceRegionScope
     */

    public String getResourceRegionScope() {
        return this.resourceRegionScope;
    }

    /**
     * <p>
     * Specifies the scope of visibility of this resource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>REGIONAL</b> – The resource can be accessed only by using requests that target the Amazon Web Services Region
     * in which the resource exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>GLOBAL</b> – The resource can be accessed from any Amazon Web Services Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceRegionScope
     *        Specifies the scope of visibility of this resource:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>REGIONAL</b> – The resource can be accessed only by using requests that target the Amazon Web Services
     *        Region in which the resource exists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>GLOBAL</b> – The resource can be accessed from any Amazon Web Services Region.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceRegionScope
     */

    public Resource withResourceRegionScope(String resourceRegionScope) {
        setResourceRegionScope(resourceRegionScope);
        return this;
    }

    /**
     * <p>
     * Specifies the scope of visibility of this resource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>REGIONAL</b> – The resource can be accessed only by using requests that target the Amazon Web Services Region
     * in which the resource exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>GLOBAL</b> – The resource can be accessed from any Amazon Web Services Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceRegionScope
     *        Specifies the scope of visibility of this resource:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>REGIONAL</b> – The resource can be accessed only by using requests that target the Amazon Web Services
     *        Region in which the resource exists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>GLOBAL</b> – The resource can be accessed from any Amazon Web Services Region.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceRegionScope
     */

    public Resource withResourceRegionScope(ResourceRegionScope resourceRegionScope) {
        this.resourceRegionScope = resourceRegionScope.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getResourceShareArn() != null)
            sb.append("ResourceShareArn: ").append(getResourceShareArn()).append(",");
        if (getResourceGroupArn() != null)
            sb.append("ResourceGroupArn: ").append(getResourceGroupArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getResourceRegionScope() != null)
            sb.append("ResourceRegionScope: ").append(getResourceRegionScope());
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
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
            return false;
        if (other.getResourceGroupArn() == null ^ this.getResourceGroupArn() == null)
            return false;
        if (other.getResourceGroupArn() != null && other.getResourceGroupArn().equals(this.getResourceGroupArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getResourceRegionScope() == null ^ this.getResourceRegionScope() == null)
            return false;
        if (other.getResourceRegionScope() != null && other.getResourceRegionScope().equals(this.getResourceRegionScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getResourceShareArn() == null) ? 0 : getResourceShareArn().hashCode());
        hashCode = prime * hashCode + ((getResourceGroupArn() == null) ? 0 : getResourceGroupArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getResourceRegionScope() == null) ? 0 : getResourceRegionScope().hashCode());
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
        com.amazonaws.services.ram.model.transform.ResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
