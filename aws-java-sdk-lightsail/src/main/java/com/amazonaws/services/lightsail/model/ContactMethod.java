/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a contact method.
 * </p>
 * <p>
 * A contact method is a way to send you notifications. For more information, see <a
 * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications">Notifications in Amazon
 * Lightsail</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ContactMethod" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactMethod implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The destination of the contact method, such as an email address or a mobile phone number.
     * </p>
     */
    private String contactEndpoint;
    /**
     * <p>
     * The current status of the contact method.
     * </p>
     * <p>
     * A contact method has the following possible status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PendingVerification</code> — The contact method has not yet been verified, and the verification has not yet
     * expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Valid</code> — The contact method has been verified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InValid</code> — An attempt was made to verify the contact method, but the verification has expired.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The protocol of the contact method, such as email or SMS (text messaging).
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The name of the contact method.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact method.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The timestamp when the contact method was created.
     * </p>
     */
    private java.util.Date createdAt;

    private ResourceLocation location;
    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ContactMethod</code>).
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail contact
     * method. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     */
    private String supportCode;

    /**
     * <p>
     * The destination of the contact method, such as an email address or a mobile phone number.
     * </p>
     * 
     * @param contactEndpoint
     *        The destination of the contact method, such as an email address or a mobile phone number.
     */

    public void setContactEndpoint(String contactEndpoint) {
        this.contactEndpoint = contactEndpoint;
    }

    /**
     * <p>
     * The destination of the contact method, such as an email address or a mobile phone number.
     * </p>
     * 
     * @return The destination of the contact method, such as an email address or a mobile phone number.
     */

    public String getContactEndpoint() {
        return this.contactEndpoint;
    }

    /**
     * <p>
     * The destination of the contact method, such as an email address or a mobile phone number.
     * </p>
     * 
     * @param contactEndpoint
     *        The destination of the contact method, such as an email address or a mobile phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactMethod withContactEndpoint(String contactEndpoint) {
        setContactEndpoint(contactEndpoint);
        return this;
    }

    /**
     * <p>
     * The current status of the contact method.
     * </p>
     * <p>
     * A contact method has the following possible status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PendingVerification</code> — The contact method has not yet been verified, and the verification has not yet
     * expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Valid</code> — The contact method has been verified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InValid</code> — An attempt was made to verify the contact method, but the verification has expired.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the contact method.</p>
     *        <p>
     *        A contact method has the following possible status:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PendingVerification</code> — The contact method has not yet been verified, and the verification has
     *        not yet expired.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Valid</code> — The contact method has been verified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InValid</code> — An attempt was made to verify the contact method, but the verification has expired.
     *        </p>
     *        </li>
     * @see ContactMethodStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the contact method.
     * </p>
     * <p>
     * A contact method has the following possible status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PendingVerification</code> — The contact method has not yet been verified, and the verification has not yet
     * expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Valid</code> — The contact method has been verified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InValid</code> — An attempt was made to verify the contact method, but the verification has expired.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the contact method.</p>
     *         <p>
     *         A contact method has the following possible status:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PendingVerification</code> — The contact method has not yet been verified, and the verification has
     *         not yet expired.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Valid</code> — The contact method has been verified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InValid</code> — An attempt was made to verify the contact method, but the verification has
     *         expired.
     *         </p>
     *         </li>
     * @see ContactMethodStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the contact method.
     * </p>
     * <p>
     * A contact method has the following possible status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PendingVerification</code> — The contact method has not yet been verified, and the verification has not yet
     * expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Valid</code> — The contact method has been verified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InValid</code> — An attempt was made to verify the contact method, but the verification has expired.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the contact method.</p>
     *        <p>
     *        A contact method has the following possible status:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PendingVerification</code> — The contact method has not yet been verified, and the verification has
     *        not yet expired.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Valid</code> — The contact method has been verified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InValid</code> — An attempt was made to verify the contact method, but the verification has expired.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactMethodStatus
     */

    public ContactMethod withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the contact method.
     * </p>
     * <p>
     * A contact method has the following possible status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PendingVerification</code> — The contact method has not yet been verified, and the verification has not yet
     * expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Valid</code> — The contact method has been verified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InValid</code> — An attempt was made to verify the contact method, but the verification has expired.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the contact method.</p>
     *        <p>
     *        A contact method has the following possible status:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PendingVerification</code> — The contact method has not yet been verified, and the verification has
     *        not yet expired.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Valid</code> — The contact method has been verified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InValid</code> — An attempt was made to verify the contact method, but the verification has expired.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactMethodStatus
     */

    public ContactMethod withStatus(ContactMethodStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The protocol of the contact method, such as email or SMS (text messaging).
     * </p>
     * 
     * @param protocol
     *        The protocol of the contact method, such as email or SMS (text messaging).
     * @see ContactProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol of the contact method, such as email or SMS (text messaging).
     * </p>
     * 
     * @return The protocol of the contact method, such as email or SMS (text messaging).
     * @see ContactProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol of the contact method, such as email or SMS (text messaging).
     * </p>
     * 
     * @param protocol
     *        The protocol of the contact method, such as email or SMS (text messaging).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactProtocol
     */

    public ContactMethod withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol of the contact method, such as email or SMS (text messaging).
     * </p>
     * 
     * @param protocol
     *        The protocol of the contact method, such as email or SMS (text messaging).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactProtocol
     */

    public ContactMethod withProtocol(ContactProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The name of the contact method.
     * </p>
     * 
     * @param name
     *        The name of the contact method.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the contact method.
     * </p>
     * 
     * @return The name of the contact method.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the contact method.
     * </p>
     * 
     * @param name
     *        The name of the contact method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactMethod withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact method.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the contact method.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact method.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the contact method.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact method.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the contact method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactMethod withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The timestamp when the contact method was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the contact method was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the contact method was created.
     * </p>
     * 
     * @return The timestamp when the contact method was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the contact method was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the contact method was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactMethod withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * @param location
     */

    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * @return
     */

    public ResourceLocation getLocation() {
        return this.location;
    }

    /**
     * @param location
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactMethod withLocation(ResourceLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ContactMethod</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>ContactMethod</code>).
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ContactMethod</code>).
     * </p>
     * 
     * @return The Lightsail resource type (e.g., <code>ContactMethod</code>).
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ContactMethod</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>ContactMethod</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ContactMethod withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ContactMethod</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>ContactMethod</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ContactMethod withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail contact
     * method. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code. Include this code in your email to support when you have questions about your Lightsail
     *        contact method. This code enables our support team to look up your Lightsail information more easily.
     */

    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail contact
     * method. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @return The support code. Include this code in your email to support when you have questions about your Lightsail
     *         contact method. This code enables our support team to look up your Lightsail information more easily.
     */

    public String getSupportCode() {
        return this.supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail contact
     * method. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code. Include this code in your email to support when you have questions about your Lightsail
     *        contact method. This code enables our support team to look up your Lightsail information more easily.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactMethod withSupportCode(String supportCode) {
        setSupportCode(supportCode);
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
        if (getContactEndpoint() != null)
            sb.append("ContactEndpoint: ").append(getContactEndpoint()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getSupportCode() != null)
            sb.append("SupportCode: ").append(getSupportCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactMethod == false)
            return false;
        ContactMethod other = (ContactMethod) obj;
        if (other.getContactEndpoint() == null ^ this.getContactEndpoint() == null)
            return false;
        if (other.getContactEndpoint() != null && other.getContactEndpoint().equals(this.getContactEndpoint()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getSupportCode() == null ^ this.getSupportCode() == null)
            return false;
        if (other.getSupportCode() != null && other.getSupportCode().equals(this.getSupportCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactEndpoint() == null) ? 0 : getContactEndpoint().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getSupportCode() == null) ? 0 : getSupportCode().hashCode());
        return hashCode;
    }

    @Override
    public ContactMethod clone() {
        try {
            return (ContactMethod) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.ContactMethodMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
