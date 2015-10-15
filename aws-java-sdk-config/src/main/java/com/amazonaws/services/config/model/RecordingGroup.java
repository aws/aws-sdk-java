/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * The group of AWS resource types that AWS Config records when starting the
 * configuration recorder.
 * </p>
 * <p>
 * <b>recordingGroup</b> can have one and only one parameter. Choose either
 * <b>allSupported</b> or <b>resourceTypes</b>.
 * </p>
 */
public class RecordingGroup implements Serializable, Cloneable {

    /**
     * <p>
     * Records all supported resource types in the recording group. For a list
     * of supported resource types, see <a href=
     * "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported resource types</a>. If you specify <b>allSupported</b>, you
     * cannot enumerate a list of <b>resourceTypes</b>.
     * </p>
     */
    private Boolean allSupported;
    /**
     * <p>
     * A comma-separated list of strings representing valid AWS resource types
     * (for example, <code>AWS::EC2::Instance</code> or
     * <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is only valid
     * if you have chosen not to select <b>allSupported</b>. For a list of valid
     * <b>resourceTypes</b> values, see the <b>resourceType Value</b> column in
     * the following topic: <a href=
     * "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported AWS Resource Types</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceTypes;

    /**
     * <p>
     * Records all supported resource types in the recording group. For a list
     * of supported resource types, see <a href=
     * "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported resource types</a>. If you specify <b>allSupported</b>, you
     * cannot enumerate a list of <b>resourceTypes</b>.
     * </p>
     * 
     * @param allSupported
     *        Records all supported resource types in the recording group. For a
     *        list of supported resource types, see <a href=
     *        "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *        >Supported resource types</a>. If you specify <b>allSupported</b>,
     *        you cannot enumerate a list of <b>resourceTypes</b>.
     */
    public void setAllSupported(Boolean allSupported) {
        this.allSupported = allSupported;
    }

    /**
     * <p>
     * Records all supported resource types in the recording group. For a list
     * of supported resource types, see <a href=
     * "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported resource types</a>. If you specify <b>allSupported</b>, you
     * cannot enumerate a list of <b>resourceTypes</b>.
     * </p>
     * 
     * @return Records all supported resource types in the recording group. For
     *         a list of supported resource types, see <a href=
     *         "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *         >Supported resource types</a>. If you specify
     *         <b>allSupported</b>, you cannot enumerate a list of
     *         <b>resourceTypes</b>.
     */
    public Boolean getAllSupported() {
        return this.allSupported;
    }

    /**
     * <p>
     * Records all supported resource types in the recording group. For a list
     * of supported resource types, see <a href=
     * "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported resource types</a>. If you specify <b>allSupported</b>, you
     * cannot enumerate a list of <b>resourceTypes</b>.
     * </p>
     * 
     * @param allSupported
     *        Records all supported resource types in the recording group. For a
     *        list of supported resource types, see <a href=
     *        "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *        >Supported resource types</a>. If you specify <b>allSupported</b>,
     *        you cannot enumerate a list of <b>resourceTypes</b>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RecordingGroup withAllSupported(Boolean allSupported) {
        setAllSupported(allSupported);
        return this;
    }

    /**
     * <p>
     * Records all supported resource types in the recording group. For a list
     * of supported resource types, see <a href=
     * "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported resource types</a>. If you specify <b>allSupported</b>, you
     * cannot enumerate a list of <b>resourceTypes</b>.
     * </p>
     * 
     * @return Records all supported resource types in the recording group. For
     *         a list of supported resource types, see <a href=
     *         "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *         >Supported resource types</a>. If you specify
     *         <b>allSupported</b>, you cannot enumerate a list of
     *         <b>resourceTypes</b>.
     */
    public Boolean isAllSupported() {
        return this.allSupported;
    }

    /**
     * <p>
     * A comma-separated list of strings representing valid AWS resource types
     * (for example, <code>AWS::EC2::Instance</code> or
     * <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is only valid
     * if you have chosen not to select <b>allSupported</b>. For a list of valid
     * <b>resourceTypes</b> values, see the <b>resourceType Value</b> column in
     * the following topic: <a href=
     * "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported AWS Resource Types</a>.
     * </p>
     * 
     * @return A comma-separated list of strings representing valid AWS resource
     *         types (for example, <code>AWS::EC2::Instance</code> or
     *         <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is
     *         only valid if you have chosen not to select <b>allSupported</b>.
     *         For a list of valid <b>resourceTypes</b> values, see the
     *         <b>resourceType Value</b> column in the following topic: <a href=
     *         "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *         >Supported AWS Resource Types</a>.
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
     * A comma-separated list of strings representing valid AWS resource types
     * (for example, <code>AWS::EC2::Instance</code> or
     * <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is only valid
     * if you have chosen not to select <b>allSupported</b>. For a list of valid
     * <b>resourceTypes</b> values, see the <b>resourceType Value</b> column in
     * the following topic: <a href=
     * "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported AWS Resource Types</a>.
     * </p>
     * 
     * @param resourceTypes
     *        A comma-separated list of strings representing valid AWS resource
     *        types (for example, <code>AWS::EC2::Instance</code> or
     *        <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is only
     *        valid if you have chosen not to select <b>allSupported</b>. For a
     *        list of valid <b>resourceTypes</b> values, see the <b>resourceType
     *        Value</b> column in the following topic: <a href=
     *        "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *        >Supported AWS Resource Types</a>.
     * @see ResourceType
     */
    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new com.amazonaws.internal.SdkInternalList<String>(
                resourceTypes);
    }

    /**
     * <p>
     * A comma-separated list of strings representing valid AWS resource types
     * (for example, <code>AWS::EC2::Instance</code> or
     * <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is only valid
     * if you have chosen not to select <b>allSupported</b>. For a list of valid
     * <b>resourceTypes</b> values, see the <b>resourceType Value</b> column in
     * the following topic: <a href=
     * "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported AWS Resource Types</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setResourceTypes(java.util.Collection)} or
     * {@link #withResourceTypes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        A comma-separated list of strings representing valid AWS resource
     *        types (for example, <code>AWS::EC2::Instance</code> or
     *        <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is only
     *        valid if you have chosen not to select <b>allSupported</b>. For a
     *        list of valid <b>resourceTypes</b> values, see the <b>resourceType
     *        Value</b> column in the following topic: <a href=
     *        "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *        >Supported AWS Resource Types</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public RecordingGroup withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new com.amazonaws.internal.SdkInternalList<String>(
                    resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A comma-separated list of strings representing valid AWS resource types
     * (for example, <code>AWS::EC2::Instance</code> or
     * <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is only valid
     * if you have chosen not to select <b>allSupported</b>. For a list of valid
     * <b>resourceTypes</b> values, see the <b>resourceType Value</b> column in
     * the following topic: <a href=
     * "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported AWS Resource Types</a>.
     * </p>
     * 
     * @param resourceTypes
     *        A comma-separated list of strings representing valid AWS resource
     *        types (for example, <code>AWS::EC2::Instance</code> or
     *        <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is only
     *        valid if you have chosen not to select <b>allSupported</b>. For a
     *        list of valid <b>resourceTypes</b> values, see the <b>resourceType
     *        Value</b> column in the following topic: <a href=
     *        "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *        >Supported AWS Resource Types</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public RecordingGroup withResourceTypes(
            java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * A comma-separated list of strings representing valid AWS resource types
     * (for example, <code>AWS::EC2::Instance</code> or
     * <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is only valid
     * if you have chosen not to select <b>allSupported</b>. For a list of valid
     * <b>resourceTypes</b> values, see the <b>resourceType Value</b> column in
     * the following topic: <a href=
     * "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported AWS Resource Types</a>.
     * </p>
     * 
     * @param resourceTypes
     *        A comma-separated list of strings representing valid AWS resource
     *        types (for example, <code>AWS::EC2::Instance</code> or
     *        <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is only
     *        valid if you have chosen not to select <b>allSupported</b>. For a
     *        list of valid <b>resourceTypes</b> values, see the <b>resourceType
     *        Value</b> column in the following topic: <a href=
     *        "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *        >Supported AWS Resource Types</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public RecordingGroup withResourceTypes(ResourceType... resourceTypes) {
        com.amazonaws.internal.SdkInternalList<String> resourceTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                resourceTypes.length);
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
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAllSupported() != null)
            sb.append("AllSupported: " + getAllSupported() + ",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: " + getResourceTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecordingGroup == false)
            return false;
        RecordingGroup other = (RecordingGroup) obj;
        if (other.getAllSupported() == null ^ this.getAllSupported() == null)
            return false;
        if (other.getAllSupported() != null
                && other.getAllSupported().equals(this.getAllSupported()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null
                && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAllSupported() == null) ? 0 : getAllSupported()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceTypes() == null) ? 0 : getResourceTypes()
                        .hashCode());
        return hashCode;
    }

    @Override
    public RecordingGroup clone() {
        try {
            return (RecordingGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}