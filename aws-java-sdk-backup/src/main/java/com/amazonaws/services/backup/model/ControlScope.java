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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A framework consists of one or more controls. Each control has its own control scope. The control scope can include
 * one or more resource types, a combination of a tag key and value, or a combination of one resource type and one
 * resource ID. If no scope is specified, evaluations for the rule are triggered when any resource in your recording
 * group changes in configuration.
 * </p>
 * <note>
 * <p>
 * To set a control scope that includes all of a particular resource, leave the <code>ControlScope</code> empty or do
 * not pass it when calling <code>CreateFramework</code>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ControlScope" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ControlScope implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the only Amazon Web Services resource that you want your control scope to contain.
     * </p>
     */
    private java.util.List<String> complianceResourceIds;
    /**
     * <p>
     * Describes whether the control scope includes one or more types of resources, such as <code>EFS</code> or
     * <code>RDS</code>.
     * </p>
     */
    private java.util.List<String> complianceResourceTypes;
    /**
     * <p>
     * The tag key-value pair applied to those Amazon Web Services resources that you want to trigger an evaluation for
     * a rule. A maximum of one key-value pair can be provided. The tag value is optional, but it cannot be an empty
     * string. The structure to assign a tag is: <code>[{"Key":"string","Value":"string"}]</code>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the only Amazon Web Services resource that you want your control scope to contain.
     * </p>
     * 
     * @return The ID of the only Amazon Web Services resource that you want your control scope to contain.
     */

    public java.util.List<String> getComplianceResourceIds() {
        return complianceResourceIds;
    }

    /**
     * <p>
     * The ID of the only Amazon Web Services resource that you want your control scope to contain.
     * </p>
     * 
     * @param complianceResourceIds
     *        The ID of the only Amazon Web Services resource that you want your control scope to contain.
     */

    public void setComplianceResourceIds(java.util.Collection<String> complianceResourceIds) {
        if (complianceResourceIds == null) {
            this.complianceResourceIds = null;
            return;
        }

        this.complianceResourceIds = new java.util.ArrayList<String>(complianceResourceIds);
    }

    /**
     * <p>
     * The ID of the only Amazon Web Services resource that you want your control scope to contain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComplianceResourceIds(java.util.Collection)} or
     * {@link #withComplianceResourceIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param complianceResourceIds
     *        The ID of the only Amazon Web Services resource that you want your control scope to contain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlScope withComplianceResourceIds(String... complianceResourceIds) {
        if (this.complianceResourceIds == null) {
            setComplianceResourceIds(new java.util.ArrayList<String>(complianceResourceIds.length));
        }
        for (String ele : complianceResourceIds) {
            this.complianceResourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the only Amazon Web Services resource that you want your control scope to contain.
     * </p>
     * 
     * @param complianceResourceIds
     *        The ID of the only Amazon Web Services resource that you want your control scope to contain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlScope withComplianceResourceIds(java.util.Collection<String> complianceResourceIds) {
        setComplianceResourceIds(complianceResourceIds);
        return this;
    }

    /**
     * <p>
     * Describes whether the control scope includes one or more types of resources, such as <code>EFS</code> or
     * <code>RDS</code>.
     * </p>
     * 
     * @return Describes whether the control scope includes one or more types of resources, such as <code>EFS</code> or
     *         <code>RDS</code>.
     */

    public java.util.List<String> getComplianceResourceTypes() {
        return complianceResourceTypes;
    }

    /**
     * <p>
     * Describes whether the control scope includes one or more types of resources, such as <code>EFS</code> or
     * <code>RDS</code>.
     * </p>
     * 
     * @param complianceResourceTypes
     *        Describes whether the control scope includes one or more types of resources, such as <code>EFS</code> or
     *        <code>RDS</code>.
     */

    public void setComplianceResourceTypes(java.util.Collection<String> complianceResourceTypes) {
        if (complianceResourceTypes == null) {
            this.complianceResourceTypes = null;
            return;
        }

        this.complianceResourceTypes = new java.util.ArrayList<String>(complianceResourceTypes);
    }

    /**
     * <p>
     * Describes whether the control scope includes one or more types of resources, such as <code>EFS</code> or
     * <code>RDS</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComplianceResourceTypes(java.util.Collection)} or
     * {@link #withComplianceResourceTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param complianceResourceTypes
     *        Describes whether the control scope includes one or more types of resources, such as <code>EFS</code> or
     *        <code>RDS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlScope withComplianceResourceTypes(String... complianceResourceTypes) {
        if (this.complianceResourceTypes == null) {
            setComplianceResourceTypes(new java.util.ArrayList<String>(complianceResourceTypes.length));
        }
        for (String ele : complianceResourceTypes) {
            this.complianceResourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes whether the control scope includes one or more types of resources, such as <code>EFS</code> or
     * <code>RDS</code>.
     * </p>
     * 
     * @param complianceResourceTypes
     *        Describes whether the control scope includes one or more types of resources, such as <code>EFS</code> or
     *        <code>RDS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlScope withComplianceResourceTypes(java.util.Collection<String> complianceResourceTypes) {
        setComplianceResourceTypes(complianceResourceTypes);
        return this;
    }

    /**
     * <p>
     * The tag key-value pair applied to those Amazon Web Services resources that you want to trigger an evaluation for
     * a rule. A maximum of one key-value pair can be provided. The tag value is optional, but it cannot be an empty
     * string. The structure to assign a tag is: <code>[{"Key":"string","Value":"string"}]</code>.
     * </p>
     * 
     * @return The tag key-value pair applied to those Amazon Web Services resources that you want to trigger an
     *         evaluation for a rule. A maximum of one key-value pair can be provided. The tag value is optional, but it
     *         cannot be an empty string. The structure to assign a tag is:
     *         <code>[{"Key":"string","Value":"string"}]</code>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag key-value pair applied to those Amazon Web Services resources that you want to trigger an evaluation for
     * a rule. A maximum of one key-value pair can be provided. The tag value is optional, but it cannot be an empty
     * string. The structure to assign a tag is: <code>[{"Key":"string","Value":"string"}]</code>.
     * </p>
     * 
     * @param tags
     *        The tag key-value pair applied to those Amazon Web Services resources that you want to trigger an
     *        evaluation for a rule. A maximum of one key-value pair can be provided. The tag value is optional, but it
     *        cannot be an empty string. The structure to assign a tag is:
     *        <code>[{"Key":"string","Value":"string"}]</code>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tag key-value pair applied to those Amazon Web Services resources that you want to trigger an evaluation for
     * a rule. A maximum of one key-value pair can be provided. The tag value is optional, but it cannot be an empty
     * string. The structure to assign a tag is: <code>[{"Key":"string","Value":"string"}]</code>.
     * </p>
     * 
     * @param tags
     *        The tag key-value pair applied to those Amazon Web Services resources that you want to trigger an
     *        evaluation for a rule. A maximum of one key-value pair can be provided. The tag value is optional, but it
     *        cannot be an empty string. The structure to assign a tag is:
     *        <code>[{"Key":"string","Value":"string"}]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlScope withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ControlScope#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ControlScope addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlScope clearTagsEntries() {
        this.tags = null;
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
        if (getComplianceResourceIds() != null)
            sb.append("ComplianceResourceIds: ").append(getComplianceResourceIds()).append(",");
        if (getComplianceResourceTypes() != null)
            sb.append("ComplianceResourceTypes: ").append(getComplianceResourceTypes()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ControlScope == false)
            return false;
        ControlScope other = (ControlScope) obj;
        if (other.getComplianceResourceIds() == null ^ this.getComplianceResourceIds() == null)
            return false;
        if (other.getComplianceResourceIds() != null && other.getComplianceResourceIds().equals(this.getComplianceResourceIds()) == false)
            return false;
        if (other.getComplianceResourceTypes() == null ^ this.getComplianceResourceTypes() == null)
            return false;
        if (other.getComplianceResourceTypes() != null && other.getComplianceResourceTypes().equals(this.getComplianceResourceTypes()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComplianceResourceIds() == null) ? 0 : getComplianceResourceIds().hashCode());
        hashCode = prime * hashCode + ((getComplianceResourceTypes() == null) ? 0 : getComplianceResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ControlScope clone() {
        try {
            return (ControlScope) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.ControlScopeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
