/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Defines which resources trigger an evaluation for an AWS Config rule. The scope can include one or more resource
 * types, a combination of a tag key and value, or a combination of one resource type and one resource ID. Specify a
 * scope to constrain which resources trigger an evaluation for a rule. Otherwise, evaluations for the rule are
 * triggered when any resource in your recording group changes in configuration.
 * </p>
 */
public class Scope implements Serializable, Cloneable {

    /**
     * <p>
     * The resource types of only those AWS resources that you want to trigger an evaluation for the rule. You can only
     * specify one type if you also specify a resource ID for <code>ComplianceResourceId</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> complianceResourceTypes;
    /**
     * <p>
     * The tag key that is applied to only those AWS resources that you want you want to trigger an evaluation for the
     * rule.
     * </p>
     */
    private String tagKey;
    /**
     * <p>
     * The tag value applied to only those AWS resources that you want to trigger an evaluation for the rule. If you
     * specify a value for <code>TagValue</code>, you must also specify a value for <code>TagKey</code>.
     * </p>
     */
    private String tagValue;
    /**
     * <p>
     * The IDs of the only AWS resource that you want to trigger an evaluation for the rule. If you specify a resource
     * ID, you must specify one resource type for <code>ComplianceResourceTypes</code>.
     * </p>
     */
    private String complianceResourceId;

    /**
     * <p>
     * The resource types of only those AWS resources that you want to trigger an evaluation for the rule. You can only
     * specify one type if you also specify a resource ID for <code>ComplianceResourceId</code>.
     * </p>
     * 
     * @return The resource types of only those AWS resources that you want to trigger an evaluation for the rule. You
     *         can only specify one type if you also specify a resource ID for <code>ComplianceResourceId</code>.
     */

    public java.util.List<String> getComplianceResourceTypes() {
        if (complianceResourceTypes == null) {
            complianceResourceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return complianceResourceTypes;
    }

    /**
     * <p>
     * The resource types of only those AWS resources that you want to trigger an evaluation for the rule. You can only
     * specify one type if you also specify a resource ID for <code>ComplianceResourceId</code>.
     * </p>
     * 
     * @param complianceResourceTypes
     *        The resource types of only those AWS resources that you want to trigger an evaluation for the rule. You
     *        can only specify one type if you also specify a resource ID for <code>ComplianceResourceId</code>.
     */

    public void setComplianceResourceTypes(java.util.Collection<String> complianceResourceTypes) {
        if (complianceResourceTypes == null) {
            this.complianceResourceTypes = null;
            return;
        }

        this.complianceResourceTypes = new com.amazonaws.internal.SdkInternalList<String>(complianceResourceTypes);
    }

    /**
     * <p>
     * The resource types of only those AWS resources that you want to trigger an evaluation for the rule. You can only
     * specify one type if you also specify a resource ID for <code>ComplianceResourceId</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComplianceResourceTypes(java.util.Collection)} or
     * {@link #withComplianceResourceTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param complianceResourceTypes
     *        The resource types of only those AWS resources that you want to trigger an evaluation for the rule. You
     *        can only specify one type if you also specify a resource ID for <code>ComplianceResourceId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scope withComplianceResourceTypes(String... complianceResourceTypes) {
        if (this.complianceResourceTypes == null) {
            setComplianceResourceTypes(new com.amazonaws.internal.SdkInternalList<String>(complianceResourceTypes.length));
        }
        for (String ele : complianceResourceTypes) {
            this.complianceResourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource types of only those AWS resources that you want to trigger an evaluation for the rule. You can only
     * specify one type if you also specify a resource ID for <code>ComplianceResourceId</code>.
     * </p>
     * 
     * @param complianceResourceTypes
     *        The resource types of only those AWS resources that you want to trigger an evaluation for the rule. You
     *        can only specify one type if you also specify a resource ID for <code>ComplianceResourceId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scope withComplianceResourceTypes(java.util.Collection<String> complianceResourceTypes) {
        setComplianceResourceTypes(complianceResourceTypes);
        return this;
    }

    /**
     * <p>
     * The tag key that is applied to only those AWS resources that you want you want to trigger an evaluation for the
     * rule.
     * </p>
     * 
     * @param tagKey
     *        The tag key that is applied to only those AWS resources that you want you want to trigger an evaluation
     *        for the rule.
     */

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    /**
     * <p>
     * The tag key that is applied to only those AWS resources that you want you want to trigger an evaluation for the
     * rule.
     * </p>
     * 
     * @return The tag key that is applied to only those AWS resources that you want you want to trigger an evaluation
     *         for the rule.
     */

    public String getTagKey() {
        return this.tagKey;
    }

    /**
     * <p>
     * The tag key that is applied to only those AWS resources that you want you want to trigger an evaluation for the
     * rule.
     * </p>
     * 
     * @param tagKey
     *        The tag key that is applied to only those AWS resources that you want you want to trigger an evaluation
     *        for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scope withTagKey(String tagKey) {
        setTagKey(tagKey);
        return this;
    }

    /**
     * <p>
     * The tag value applied to only those AWS resources that you want to trigger an evaluation for the rule. If you
     * specify a value for <code>TagValue</code>, you must also specify a value for <code>TagKey</code>.
     * </p>
     * 
     * @param tagValue
     *        The tag value applied to only those AWS resources that you want to trigger an evaluation for the rule. If
     *        you specify a value for <code>TagValue</code>, you must also specify a value for <code>TagKey</code>.
     */

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    /**
     * <p>
     * The tag value applied to only those AWS resources that you want to trigger an evaluation for the rule. If you
     * specify a value for <code>TagValue</code>, you must also specify a value for <code>TagKey</code>.
     * </p>
     * 
     * @return The tag value applied to only those AWS resources that you want to trigger an evaluation for the rule. If
     *         you specify a value for <code>TagValue</code>, you must also specify a value for <code>TagKey</code>.
     */

    public String getTagValue() {
        return this.tagValue;
    }

    /**
     * <p>
     * The tag value applied to only those AWS resources that you want to trigger an evaluation for the rule. If you
     * specify a value for <code>TagValue</code>, you must also specify a value for <code>TagKey</code>.
     * </p>
     * 
     * @param tagValue
     *        The tag value applied to only those AWS resources that you want to trigger an evaluation for the rule. If
     *        you specify a value for <code>TagValue</code>, you must also specify a value for <code>TagKey</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scope withTagValue(String tagValue) {
        setTagValue(tagValue);
        return this;
    }

    /**
     * <p>
     * The IDs of the only AWS resource that you want to trigger an evaluation for the rule. If you specify a resource
     * ID, you must specify one resource type for <code>ComplianceResourceTypes</code>.
     * </p>
     * 
     * @param complianceResourceId
     *        The IDs of the only AWS resource that you want to trigger an evaluation for the rule. If you specify a
     *        resource ID, you must specify one resource type for <code>ComplianceResourceTypes</code>.
     */

    public void setComplianceResourceId(String complianceResourceId) {
        this.complianceResourceId = complianceResourceId;
    }

    /**
     * <p>
     * The IDs of the only AWS resource that you want to trigger an evaluation for the rule. If you specify a resource
     * ID, you must specify one resource type for <code>ComplianceResourceTypes</code>.
     * </p>
     * 
     * @return The IDs of the only AWS resource that you want to trigger an evaluation for the rule. If you specify a
     *         resource ID, you must specify one resource type for <code>ComplianceResourceTypes</code>.
     */

    public String getComplianceResourceId() {
        return this.complianceResourceId;
    }

    /**
     * <p>
     * The IDs of the only AWS resource that you want to trigger an evaluation for the rule. If you specify a resource
     * ID, you must specify one resource type for <code>ComplianceResourceTypes</code>.
     * </p>
     * 
     * @param complianceResourceId
     *        The IDs of the only AWS resource that you want to trigger an evaluation for the rule. If you specify a
     *        resource ID, you must specify one resource type for <code>ComplianceResourceTypes</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scope withComplianceResourceId(String complianceResourceId) {
        setComplianceResourceId(complianceResourceId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getComplianceResourceTypes() != null)
            sb.append("ComplianceResourceTypes: " + getComplianceResourceTypes() + ",");
        if (getTagKey() != null)
            sb.append("TagKey: " + getTagKey() + ",");
        if (getTagValue() != null)
            sb.append("TagValue: " + getTagValue() + ",");
        if (getComplianceResourceId() != null)
            sb.append("ComplianceResourceId: " + getComplianceResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Scope == false)
            return false;
        Scope other = (Scope) obj;
        if (other.getComplianceResourceTypes() == null ^ this.getComplianceResourceTypes() == null)
            return false;
        if (other.getComplianceResourceTypes() != null && other.getComplianceResourceTypes().equals(this.getComplianceResourceTypes()) == false)
            return false;
        if (other.getTagKey() == null ^ this.getTagKey() == null)
            return false;
        if (other.getTagKey() != null && other.getTagKey().equals(this.getTagKey()) == false)
            return false;
        if (other.getTagValue() == null ^ this.getTagValue() == null)
            return false;
        if (other.getTagValue() != null && other.getTagValue().equals(this.getTagValue()) == false)
            return false;
        if (other.getComplianceResourceId() == null ^ this.getComplianceResourceId() == null)
            return false;
        if (other.getComplianceResourceId() != null && other.getComplianceResourceId().equals(this.getComplianceResourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComplianceResourceTypes() == null) ? 0 : getComplianceResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getTagKey() == null) ? 0 : getTagKey().hashCode());
        hashCode = prime * hashCode + ((getTagValue() == null) ? 0 : getTagValue().hashCode());
        hashCode = prime * hashCode + ((getComplianceResourceId() == null) ? 0 : getComplianceResourceId().hashCode());
        return hashCode;
    }

    @Override
    public Scope clone() {
        try {
            return (Scope) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
