/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A schema defines the structure of events that are sent to Amazon EventBridge. Schema registries are containers for
 * schemas. They collect and organize schemas so that your schemas are in logical groups.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEventSchemasRegistryDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEventSchemasRegistryDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the registry to be created.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the registry.
     * </p>
     */
    private String registryArn;
    /**
     * <p>
     * The name of the schema registry.
     * </p>
     */
    private String registryName;

    /**
     * <p>
     * A description of the registry to be created.
     * </p>
     * 
     * @param description
     *        A description of the registry to be created.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the registry to be created.
     * </p>
     * 
     * @return A description of the registry to be created.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the registry to be created.
     * </p>
     * 
     * @param description
     *        A description of the registry to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEventSchemasRegistryDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the registry.
     * </p>
     * 
     * @param registryArn
     *        The Amazon Resource Name (ARN) of the registry.
     */

    public void setRegistryArn(String registryArn) {
        this.registryArn = registryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the registry.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the registry.
     */

    public String getRegistryArn() {
        return this.registryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the registry.
     * </p>
     * 
     * @param registryArn
     *        The Amazon Resource Name (ARN) of the registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEventSchemasRegistryDetails withRegistryArn(String registryArn) {
        setRegistryArn(registryArn);
        return this;
    }

    /**
     * <p>
     * The name of the schema registry.
     * </p>
     * 
     * @param registryName
     *        The name of the schema registry.
     */

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    /**
     * <p>
     * The name of the schema registry.
     * </p>
     * 
     * @return The name of the schema registry.
     */

    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * <p>
     * The name of the schema registry.
     * </p>
     * 
     * @param registryName
     *        The name of the schema registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEventSchemasRegistryDetails withRegistryName(String registryName) {
        setRegistryName(registryName);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRegistryArn() != null)
            sb.append("RegistryArn: ").append(getRegistryArn()).append(",");
        if (getRegistryName() != null)
            sb.append("RegistryName: ").append(getRegistryName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEventSchemasRegistryDetails == false)
            return false;
        AwsEventSchemasRegistryDetails other = (AwsEventSchemasRegistryDetails) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRegistryArn() == null ^ this.getRegistryArn() == null)
            return false;
        if (other.getRegistryArn() != null && other.getRegistryArn().equals(this.getRegistryArn()) == false)
            return false;
        if (other.getRegistryName() == null ^ this.getRegistryName() == null)
            return false;
        if (other.getRegistryName() != null && other.getRegistryName().equals(this.getRegistryName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRegistryArn() == null) ? 0 : getRegistryArn().hashCode());
        hashCode = prime * hashCode + ((getRegistryName() == null) ? 0 : getRegistryName().hashCode());
        return hashCode;
    }

    @Override
    public AwsEventSchemasRegistryDetails clone() {
        try {
            return (AwsEventSchemasRegistryDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEventSchemasRegistryDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
