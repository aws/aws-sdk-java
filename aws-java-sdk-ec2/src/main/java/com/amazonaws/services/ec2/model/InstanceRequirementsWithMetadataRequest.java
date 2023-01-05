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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The architecture type, virtualization type, and other attributes for the instance types. When you specify instance
 * attributes, Amazon EC2 will identify instance types with those attributes.
 * </p>
 * <p>
 * If you specify <code>InstanceRequirementsWithMetadataRequest</code>, you can't specify <code>InstanceTypes</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceRequirementsWithMetadataRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceRequirementsWithMetadataRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The architecture type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> architectureTypes;
    /**
     * <p>
     * The virtualization type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> virtualizationTypes;
    /**
     * <p>
     * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance
     * types with those attributes.
     * </p>
     */
    private InstanceRequirementsRequest instanceRequirements;

    /**
     * <p>
     * The architecture type.
     * </p>
     * 
     * @return The architecture type.
     * @see ArchitectureType
     */

    public java.util.List<String> getArchitectureTypes() {
        if (architectureTypes == null) {
            architectureTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return architectureTypes;
    }

    /**
     * <p>
     * The architecture type.
     * </p>
     * 
     * @param architectureTypes
     *        The architecture type.
     * @see ArchitectureType
     */

    public void setArchitectureTypes(java.util.Collection<String> architectureTypes) {
        if (architectureTypes == null) {
            this.architectureTypes = null;
            return;
        }

        this.architectureTypes = new com.amazonaws.internal.SdkInternalList<String>(architectureTypes);
    }

    /**
     * <p>
     * The architecture type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArchitectureTypes(java.util.Collection)} or {@link #withArchitectureTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param architectureTypes
     *        The architecture type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchitectureType
     */

    public InstanceRequirementsWithMetadataRequest withArchitectureTypes(String... architectureTypes) {
        if (this.architectureTypes == null) {
            setArchitectureTypes(new com.amazonaws.internal.SdkInternalList<String>(architectureTypes.length));
        }
        for (String ele : architectureTypes) {
            this.architectureTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The architecture type.
     * </p>
     * 
     * @param architectureTypes
     *        The architecture type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchitectureType
     */

    public InstanceRequirementsWithMetadataRequest withArchitectureTypes(java.util.Collection<String> architectureTypes) {
        setArchitectureTypes(architectureTypes);
        return this;
    }

    /**
     * <p>
     * The architecture type.
     * </p>
     * 
     * @param architectureTypes
     *        The architecture type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchitectureType
     */

    public InstanceRequirementsWithMetadataRequest withArchitectureTypes(ArchitectureType... architectureTypes) {
        com.amazonaws.internal.SdkInternalList<String> architectureTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(architectureTypes.length);
        for (ArchitectureType value : architectureTypes) {
            architectureTypesCopy.add(value.toString());
        }
        if (getArchitectureTypes() == null) {
            setArchitectureTypes(architectureTypesCopy);
        } else {
            getArchitectureTypes().addAll(architectureTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The virtualization type.
     * </p>
     * 
     * @return The virtualization type.
     * @see VirtualizationType
     */

    public java.util.List<String> getVirtualizationTypes() {
        if (virtualizationTypes == null) {
            virtualizationTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return virtualizationTypes;
    }

    /**
     * <p>
     * The virtualization type.
     * </p>
     * 
     * @param virtualizationTypes
     *        The virtualization type.
     * @see VirtualizationType
     */

    public void setVirtualizationTypes(java.util.Collection<String> virtualizationTypes) {
        if (virtualizationTypes == null) {
            this.virtualizationTypes = null;
            return;
        }

        this.virtualizationTypes = new com.amazonaws.internal.SdkInternalList<String>(virtualizationTypes);
    }

    /**
     * <p>
     * The virtualization type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVirtualizationTypes(java.util.Collection)} or {@link #withVirtualizationTypes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param virtualizationTypes
     *        The virtualization type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualizationType
     */

    public InstanceRequirementsWithMetadataRequest withVirtualizationTypes(String... virtualizationTypes) {
        if (this.virtualizationTypes == null) {
            setVirtualizationTypes(new com.amazonaws.internal.SdkInternalList<String>(virtualizationTypes.length));
        }
        for (String ele : virtualizationTypes) {
            this.virtualizationTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The virtualization type.
     * </p>
     * 
     * @param virtualizationTypes
     *        The virtualization type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualizationType
     */

    public InstanceRequirementsWithMetadataRequest withVirtualizationTypes(java.util.Collection<String> virtualizationTypes) {
        setVirtualizationTypes(virtualizationTypes);
        return this;
    }

    /**
     * <p>
     * The virtualization type.
     * </p>
     * 
     * @param virtualizationTypes
     *        The virtualization type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualizationType
     */

    public InstanceRequirementsWithMetadataRequest withVirtualizationTypes(VirtualizationType... virtualizationTypes) {
        com.amazonaws.internal.SdkInternalList<String> virtualizationTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(virtualizationTypes.length);
        for (VirtualizationType value : virtualizationTypes) {
            virtualizationTypesCopy.add(value.toString());
        }
        if (getVirtualizationTypes() == null) {
            setVirtualizationTypes(virtualizationTypesCopy);
        } else {
            getVirtualizationTypes().addAll(virtualizationTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance
     * types with those attributes.
     * </p>
     * 
     * @param instanceRequirements
     *        The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify
     *        instance types with those attributes.
     */

    public void setInstanceRequirements(InstanceRequirementsRequest instanceRequirements) {
        this.instanceRequirements = instanceRequirements;
    }

    /**
     * <p>
     * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance
     * types with those attributes.
     * </p>
     * 
     * @return The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify
     *         instance types with those attributes.
     */

    public InstanceRequirementsRequest getInstanceRequirements() {
        return this.instanceRequirements;
    }

    /**
     * <p>
     * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance
     * types with those attributes.
     * </p>
     * 
     * @param instanceRequirements
     *        The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify
     *        instance types with those attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirementsWithMetadataRequest withInstanceRequirements(InstanceRequirementsRequest instanceRequirements) {
        setInstanceRequirements(instanceRequirements);
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
        if (getArchitectureTypes() != null)
            sb.append("ArchitectureTypes: ").append(getArchitectureTypes()).append(",");
        if (getVirtualizationTypes() != null)
            sb.append("VirtualizationTypes: ").append(getVirtualizationTypes()).append(",");
        if (getInstanceRequirements() != null)
            sb.append("InstanceRequirements: ").append(getInstanceRequirements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceRequirementsWithMetadataRequest == false)
            return false;
        InstanceRequirementsWithMetadataRequest other = (InstanceRequirementsWithMetadataRequest) obj;
        if (other.getArchitectureTypes() == null ^ this.getArchitectureTypes() == null)
            return false;
        if (other.getArchitectureTypes() != null && other.getArchitectureTypes().equals(this.getArchitectureTypes()) == false)
            return false;
        if (other.getVirtualizationTypes() == null ^ this.getVirtualizationTypes() == null)
            return false;
        if (other.getVirtualizationTypes() != null && other.getVirtualizationTypes().equals(this.getVirtualizationTypes()) == false)
            return false;
        if (other.getInstanceRequirements() == null ^ this.getInstanceRequirements() == null)
            return false;
        if (other.getInstanceRequirements() != null && other.getInstanceRequirements().equals(this.getInstanceRequirements()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchitectureTypes() == null) ? 0 : getArchitectureTypes().hashCode());
        hashCode = prime * hashCode + ((getVirtualizationTypes() == null) ? 0 : getVirtualizationTypes().hashCode());
        hashCode = prime * hashCode + ((getInstanceRequirements() == null) ? 0 : getInstanceRequirements().hashCode());
        return hashCode;
    }

    @Override
    public InstanceRequirementsWithMetadataRequest clone() {
        try {
            return (InstanceRequirementsWithMetadataRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
