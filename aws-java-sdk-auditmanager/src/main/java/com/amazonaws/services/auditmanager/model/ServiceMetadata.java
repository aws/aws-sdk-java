/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata associated with the specified AWS service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ServiceMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the AWS service.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The display name of the AWS service.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The description of the specified AWS service.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The category in which the AWS service belongs, such as compute, storage, database, and so on.
     * </p>
     */
    private String category;

    /**
     * <p>
     * The name of the AWS service.
     * </p>
     * 
     * @param name
     *        The name of the AWS service.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the AWS service.
     * </p>
     * 
     * @return The name of the AWS service.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the AWS service.
     * </p>
     * 
     * @param name
     *        The name of the AWS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The display name of the AWS service.
     * </p>
     * 
     * @param displayName
     *        The display name of the AWS service.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the AWS service.
     * </p>
     * 
     * @return The display name of the AWS service.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the AWS service.
     * </p>
     * 
     * @param displayName
     *        The display name of the AWS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceMetadata withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The description of the specified AWS service.
     * </p>
     * 
     * @param description
     *        The description of the specified AWS service.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the specified AWS service.
     * </p>
     * 
     * @return The description of the specified AWS service.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the specified AWS service.
     * </p>
     * 
     * @param description
     *        The description of the specified AWS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceMetadata withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The category in which the AWS service belongs, such as compute, storage, database, and so on.
     * </p>
     * 
     * @param category
     *        The category in which the AWS service belongs, such as compute, storage, database, and so on.
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category in which the AWS service belongs, such as compute, storage, database, and so on.
     * </p>
     * 
     * @return The category in which the AWS service belongs, such as compute, storage, database, and so on.
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category in which the AWS service belongs, such as compute, storage, database, and so on.
     * </p>
     * 
     * @param category
     *        The category in which the AWS service belongs, such as compute, storage, database, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceMetadata withCategory(String category) {
        setCategory(category);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceMetadata == false)
            return false;
        ServiceMetadata other = (ServiceMetadata) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        return hashCode;
    }

    @Override
    public ServiceMetadata clone() {
        try {
            return (ServiceMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.ServiceMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
