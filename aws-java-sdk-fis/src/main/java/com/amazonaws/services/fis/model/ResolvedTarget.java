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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a resolved target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ResolvedTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolvedTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource type of the target.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The name of the target.
     * </p>
     */
    private String targetName;
    /**
     * <p>
     * Information about the target.
     * </p>
     */
    private java.util.Map<String, String> targetInformation;

    /**
     * <p>
     * The resource type of the target.
     * </p>
     * 
     * @param resourceType
     *        The resource type of the target.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type of the target.
     * </p>
     * 
     * @return The resource type of the target.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type of the target.
     * </p>
     * 
     * @param resourceType
     *        The resource type of the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolvedTarget withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The name of the target.
     * </p>
     * 
     * @param targetName
     *        The name of the target.
     */

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    /**
     * <p>
     * The name of the target.
     * </p>
     * 
     * @return The name of the target.
     */

    public String getTargetName() {
        return this.targetName;
    }

    /**
     * <p>
     * The name of the target.
     * </p>
     * 
     * @param targetName
     *        The name of the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolvedTarget withTargetName(String targetName) {
        setTargetName(targetName);
        return this;
    }

    /**
     * <p>
     * Information about the target.
     * </p>
     * 
     * @return Information about the target.
     */

    public java.util.Map<String, String> getTargetInformation() {
        return targetInformation;
    }

    /**
     * <p>
     * Information about the target.
     * </p>
     * 
     * @param targetInformation
     *        Information about the target.
     */

    public void setTargetInformation(java.util.Map<String, String> targetInformation) {
        this.targetInformation = targetInformation;
    }

    /**
     * <p>
     * Information about the target.
     * </p>
     * 
     * @param targetInformation
     *        Information about the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolvedTarget withTargetInformation(java.util.Map<String, String> targetInformation) {
        setTargetInformation(targetInformation);
        return this;
    }

    /**
     * Add a single TargetInformation entry
     *
     * @see ResolvedTarget#withTargetInformation
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ResolvedTarget addTargetInformationEntry(String key, String value) {
        if (null == this.targetInformation) {
            this.targetInformation = new java.util.HashMap<String, String>();
        }
        if (this.targetInformation.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.targetInformation.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TargetInformation.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolvedTarget clearTargetInformationEntries() {
        this.targetInformation = null;
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getTargetName() != null)
            sb.append("TargetName: ").append(getTargetName()).append(",");
        if (getTargetInformation() != null)
            sb.append("TargetInformation: ").append(getTargetInformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolvedTarget == false)
            return false;
        ResolvedTarget other = (ResolvedTarget) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getTargetName() == null ^ this.getTargetName() == null)
            return false;
        if (other.getTargetName() != null && other.getTargetName().equals(this.getTargetName()) == false)
            return false;
        if (other.getTargetInformation() == null ^ this.getTargetInformation() == null)
            return false;
        if (other.getTargetInformation() != null && other.getTargetInformation().equals(this.getTargetInformation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTargetName() == null) ? 0 : getTargetName().hashCode());
        hashCode = prime * hashCode + ((getTargetInformation() == null) ? 0 : getTargetInformation().hashCode());
        return hashCode;
    }

    @Override
    public ResolvedTarget clone() {
        try {
            return (ResolvedTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fis.model.transform.ResolvedTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
