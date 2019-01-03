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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed information about the self-service action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ServiceActionSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceActionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The self-service action identifier.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The self-service action name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The self-service action description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The self-service action definition type. For example, <code>SSM_AUTOMATION</code>.
     * </p>
     */
    private String definitionType;

    /**
     * <p>
     * The self-service action identifier.
     * </p>
     * 
     * @param id
     *        The self-service action identifier.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The self-service action identifier.
     * </p>
     * 
     * @return The self-service action identifier.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The self-service action identifier.
     * </p>
     * 
     * @param id
     *        The self-service action identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceActionSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The self-service action name.
     * </p>
     * 
     * @param name
     *        The self-service action name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The self-service action name.
     * </p>
     * 
     * @return The self-service action name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The self-service action name.
     * </p>
     * 
     * @param name
     *        The self-service action name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceActionSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The self-service action description.
     * </p>
     * 
     * @param description
     *        The self-service action description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The self-service action description.
     * </p>
     * 
     * @return The self-service action description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The self-service action description.
     * </p>
     * 
     * @param description
     *        The self-service action description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceActionSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The self-service action definition type. For example, <code>SSM_AUTOMATION</code>.
     * </p>
     * 
     * @param definitionType
     *        The self-service action definition type. For example, <code>SSM_AUTOMATION</code>.
     * @see ServiceActionDefinitionType
     */

    public void setDefinitionType(String definitionType) {
        this.definitionType = definitionType;
    }

    /**
     * <p>
     * The self-service action definition type. For example, <code>SSM_AUTOMATION</code>.
     * </p>
     * 
     * @return The self-service action definition type. For example, <code>SSM_AUTOMATION</code>.
     * @see ServiceActionDefinitionType
     */

    public String getDefinitionType() {
        return this.definitionType;
    }

    /**
     * <p>
     * The self-service action definition type. For example, <code>SSM_AUTOMATION</code>.
     * </p>
     * 
     * @param definitionType
     *        The self-service action definition type. For example, <code>SSM_AUTOMATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceActionDefinitionType
     */

    public ServiceActionSummary withDefinitionType(String definitionType) {
        setDefinitionType(definitionType);
        return this;
    }

    /**
     * <p>
     * The self-service action definition type. For example, <code>SSM_AUTOMATION</code>.
     * </p>
     * 
     * @param definitionType
     *        The self-service action definition type. For example, <code>SSM_AUTOMATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceActionDefinitionType
     */

    public ServiceActionSummary withDefinitionType(ServiceActionDefinitionType definitionType) {
        this.definitionType = definitionType.toString();
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
        if (getDefinitionType() != null)
            sb.append("DefinitionType: ").append(getDefinitionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceActionSummary == false)
            return false;
        ServiceActionSummary other = (ServiceActionSummary) obj;
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
        if (other.getDefinitionType() == null ^ this.getDefinitionType() == null)
            return false;
        if (other.getDefinitionType() != null && other.getDefinitionType().equals(this.getDefinitionType()) == false)
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
        hashCode = prime * hashCode + ((getDefinitionType() == null) ? 0 : getDefinitionType().hashCode());
        return hashCode;
    }

    @Override
    public ServiceActionSummary clone() {
        try {
            return (ServiceActionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ServiceActionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
