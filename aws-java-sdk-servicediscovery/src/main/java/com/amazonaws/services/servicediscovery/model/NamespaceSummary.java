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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that contains information about a namespace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/NamespaceSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NamespaceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the namespace.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the namespace when you create it.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the namespace. When you create a namespace, AWS Cloud Map automatically creates a Route 53 hosted
     * zone that has the same name as the namespace.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the namespace, either public or private.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A description for the namespace.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The number of services that were created using the namespace.
     * </p>
     */
    private Integer serviceCount;

    private NamespaceProperties properties;
    /**
     * <p>
     * The date and time that the namespace was created.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * The ID of the namespace.
     * </p>
     * 
     * @param id
     *        The ID of the namespace.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the namespace.
     * </p>
     * 
     * @return The ID of the namespace.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the namespace.
     * </p>
     * 
     * @param id
     *        The ID of the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamespaceSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the namespace when you create it.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the namespace when you create it.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the namespace when you create it.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the namespace when you create it.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the namespace when you create it.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the namespace when you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamespaceSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the namespace. When you create a namespace, AWS Cloud Map automatically creates a Route 53 hosted
     * zone that has the same name as the namespace.
     * </p>
     * 
     * @param name
     *        The name of the namespace. When you create a namespace, AWS Cloud Map automatically creates a Route 53
     *        hosted zone that has the same name as the namespace.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the namespace. When you create a namespace, AWS Cloud Map automatically creates a Route 53 hosted
     * zone that has the same name as the namespace.
     * </p>
     * 
     * @return The name of the namespace. When you create a namespace, AWS Cloud Map automatically creates a Route 53
     *         hosted zone that has the same name as the namespace.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the namespace. When you create a namespace, AWS Cloud Map automatically creates a Route 53 hosted
     * zone that has the same name as the namespace.
     * </p>
     * 
     * @param name
     *        The name of the namespace. When you create a namespace, AWS Cloud Map automatically creates a Route 53
     *        hosted zone that has the same name as the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamespaceSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the namespace, either public or private.
     * </p>
     * 
     * @param type
     *        The type of the namespace, either public or private.
     * @see NamespaceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the namespace, either public or private.
     * </p>
     * 
     * @return The type of the namespace, either public or private.
     * @see NamespaceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the namespace, either public or private.
     * </p>
     * 
     * @param type
     *        The type of the namespace, either public or private.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamespaceType
     */

    public NamespaceSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the namespace, either public or private.
     * </p>
     * 
     * @param type
     *        The type of the namespace, either public or private.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamespaceType
     */

    public NamespaceSummary withType(NamespaceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A description for the namespace.
     * </p>
     * 
     * @param description
     *        A description for the namespace.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the namespace.
     * </p>
     * 
     * @return A description for the namespace.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the namespace.
     * </p>
     * 
     * @param description
     *        A description for the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamespaceSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The number of services that were created using the namespace.
     * </p>
     * 
     * @param serviceCount
     *        The number of services that were created using the namespace.
     */

    public void setServiceCount(Integer serviceCount) {
        this.serviceCount = serviceCount;
    }

    /**
     * <p>
     * The number of services that were created using the namespace.
     * </p>
     * 
     * @return The number of services that were created using the namespace.
     */

    public Integer getServiceCount() {
        return this.serviceCount;
    }

    /**
     * <p>
     * The number of services that were created using the namespace.
     * </p>
     * 
     * @param serviceCount
     *        The number of services that were created using the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamespaceSummary withServiceCount(Integer serviceCount) {
        setServiceCount(serviceCount);
        return this;
    }

    /**
     * @param properties
     */

    public void setProperties(NamespaceProperties properties) {
        this.properties = properties;
    }

    /**
     * @return
     */

    public NamespaceProperties getProperties() {
        return this.properties;
    }

    /**
     * @param properties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamespaceSummary withProperties(NamespaceProperties properties) {
        setProperties(properties);
        return this;
    }

    /**
     * <p>
     * The date and time that the namespace was created.
     * </p>
     * 
     * @param createDate
     *        The date and time that the namespace was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time that the namespace was created.
     * </p>
     * 
     * @return The date and time that the namespace was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time that the namespace was created.
     * </p>
     * 
     * @param createDate
     *        The date and time that the namespace was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamespaceSummary withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getServiceCount() != null)
            sb.append("ServiceCount: ").append(getServiceCount()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NamespaceSummary == false)
            return false;
        NamespaceSummary other = (NamespaceSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getServiceCount() == null ^ this.getServiceCount() == null)
            return false;
        if (other.getServiceCount() != null && other.getServiceCount().equals(this.getServiceCount()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getServiceCount() == null) ? 0 : getServiceCount().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return hashCode;
    }

    @Override
    public NamespaceSummary clone() {
        try {
            return (NamespaceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.NamespaceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
