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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies whether the configuration recorder excludes certain resource types from being recorded. Use the
 * <code>resourceTypes</code> field to enter a comma-separated list of resource types you want to exclude from
 * recording.
 * </p>
 * <p>
 * By default, when Config adds support for a new resource type in the Region where you set up the configuration
 * recorder, including global resource types, Config starts recording resources of that type automatically.
 * </p>
 * <note>
 * <p>
 * <b>How to use the exclusion recording strategy </b>
 * </p>
 * <p>
 * To use this option, you must set the <code>useOnly</code> field of <a
 * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
 * <code>EXCLUSION_BY_RESOURCE_TYPES</code>.
 * </p>
 * <p>
 * Config will then record configuration changes for all supported resource types, except the resource types that you
 * specify to exclude from being recorded.
 * </p>
 * <p>
 * <b>Global resource types and the exclusion recording strategy </b>
 * </p>
 * <p>
 * Unless specifically listed as exclusions, <code>AWS::RDS::GlobalCluster</code> will be recorded automatically in all
 * supported Config Regions were the configuration recorder is enabled.
 * </p>
 * <p>
 * IAM users, groups, roles, and customer managed policies will be recorded in the Region where you set up the
 * configuration recorder if that is a Region where Config was available before February 2022. You cannot be record the
 * global IAM resouce types in Regions supported by Config after February 2022. This list where you cannot record the
 * global IAM resource types includes the following Regions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Asia Pacific (Hyderabad)
 * </p>
 * </li>
 * <li>
 * <p>
 * Asia Pacific (Melbourne)
 * </p>
 * </li>
 * <li>
 * <p>
 * Canada West (Calgary)
 * </p>
 * </li>
 * <li>
 * <p>
 * Europe (Spain)
 * </p>
 * </li>
 * <li>
 * <p>
 * Europe (Zurich)
 * </p>
 * </li>
 * <li>
 * <p>
 * Israel (Tel Aviv)
 * </p>
 * </li>
 * <li>
 * <p>
 * Middle East (UAE)
 * </p>
 * </li>
 * </ul>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ExclusionByResourceTypes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExclusionByResourceTypes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A comma-separated list of resource types to exclude from recording by the configuration recorder.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceTypes;

    /**
     * <p>
     * A comma-separated list of resource types to exclude from recording by the configuration recorder.
     * </p>
     * 
     * @return A comma-separated list of resource types to exclude from recording by the configuration recorder.
     * @see ResourceType
     */

    public java.util.List<String> getResourceTypes() {
        if (resourceTypes == null) {
            resourceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceTypes;
    }

    /**
     * <p>
     * A comma-separated list of resource types to exclude from recording by the configuration recorder.
     * </p>
     * 
     * @param resourceTypes
     *        A comma-separated list of resource types to exclude from recording by the configuration recorder.
     * @see ResourceType
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new com.amazonaws.internal.SdkInternalList<String>(resourceTypes);
    }

    /**
     * <p>
     * A comma-separated list of resource types to exclude from recording by the configuration recorder.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        A comma-separated list of resource types to exclude from recording by the configuration recorder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ExclusionByResourceTypes withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new com.amazonaws.internal.SdkInternalList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A comma-separated list of resource types to exclude from recording by the configuration recorder.
     * </p>
     * 
     * @param resourceTypes
     *        A comma-separated list of resource types to exclude from recording by the configuration recorder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ExclusionByResourceTypes withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * A comma-separated list of resource types to exclude from recording by the configuration recorder.
     * </p>
     * 
     * @param resourceTypes
     *        A comma-separated list of resource types to exclude from recording by the configuration recorder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ExclusionByResourceTypes withResourceTypes(ResourceType... resourceTypes) {
        com.amazonaws.internal.SdkInternalList<String> resourceTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(resourceTypes.length);
        for (ResourceType value : resourceTypes) {
            resourceTypesCopy.add(value.toString());
        }
        if (getResourceTypes() == null) {
            setResourceTypes(resourceTypesCopy);
        } else {
            getResourceTypes().addAll(resourceTypesCopy);
        }
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
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExclusionByResourceTypes == false)
            return false;
        ExclusionByResourceTypes other = (ExclusionByResourceTypes) obj;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        return hashCode;
    }

    @Override
    public ExclusionByResourceTypes clone() {
        try {
            return (ExclusionByResourceTypes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ExclusionByResourceTypesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
