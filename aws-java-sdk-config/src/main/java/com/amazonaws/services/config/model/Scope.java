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
 * Defines which resources AWS Config evaluates against a rule. The scope
 * can include one or more resource types, a combination of a tag key and
 * value, or a combination of one resource type and one or more resource
 * IDs. Specify a scope to constrain the resources to be evaluated. If
 * you do not specify a scope, all resources in your recording group are
 * evaluated against the rule.
 * </p>
 */
public class Scope implements Serializable, Cloneable {

    /**
     * The resource types of only those AWS resources that you want AWS
     * Config to evaluate against the rule. You can specify only one type if
     * you also specify resource IDs for <code>ComplianceResourceId</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> complianceResourceTypes;

    /**
     * The tag key that is applied to only those AWS resources that you want
     * AWS Config to evaluate against the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String tagKey;

    /**
     * The tag value applied to only those AWS resources that you want AWS
     * Config to evaluate against the rule. If you specify a value for
     * <code>TagValue</code>, you must also specify a value for
     * <code>TagKey</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String tagValue;

    /**
     * The IDs of only those AWS resources that you want AWS Config to
     * evaluate against the rule. If you specify a resource ID, you must
     * specify one resource type for <code>ComplianceResourceTypes</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String complianceResourceId;

    /**
     * The resource types of only those AWS resources that you want AWS
     * Config to evaluate against the rule. You can specify only one type if
     * you also specify resource IDs for <code>ComplianceResourceId</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return The resource types of only those AWS resources that you want AWS
     *         Config to evaluate against the rule. You can specify only one type if
     *         you also specify resource IDs for <code>ComplianceResourceId</code>.
     */
    public java.util.List<String> getComplianceResourceTypes() {
        if (complianceResourceTypes == null) {
              complianceResourceTypes = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              complianceResourceTypes.setAutoConstruct(true);
        }
        return complianceResourceTypes;
    }
    
    /**
     * The resource types of only those AWS resources that you want AWS
     * Config to evaluate against the rule. You can specify only one type if
     * you also specify resource IDs for <code>ComplianceResourceId</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param complianceResourceTypes The resource types of only those AWS resources that you want AWS
     *         Config to evaluate against the rule. You can specify only one type if
     *         you also specify resource IDs for <code>ComplianceResourceId</code>.
     */
    public void setComplianceResourceTypes(java.util.Collection<String> complianceResourceTypes) {
        if (complianceResourceTypes == null) {
            this.complianceResourceTypes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> complianceResourceTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(complianceResourceTypes.size());
        complianceResourceTypesCopy.addAll(complianceResourceTypes);
        this.complianceResourceTypes = complianceResourceTypesCopy;
    }
    
    /**
     * The resource types of only those AWS resources that you want AWS
     * Config to evaluate against the rule. You can specify only one type if
     * you also specify resource IDs for <code>ComplianceResourceId</code>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setComplianceResourceTypes(java.util.Collection)} or
     * {@link #withComplianceResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param complianceResourceTypes The resource types of only those AWS resources that you want AWS
     *         Config to evaluate against the rule. You can specify only one type if
     *         you also specify resource IDs for <code>ComplianceResourceId</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Scope withComplianceResourceTypes(String... complianceResourceTypes) {
        if (getComplianceResourceTypes() == null) setComplianceResourceTypes(new java.util.ArrayList<String>(complianceResourceTypes.length));
        for (String value : complianceResourceTypes) {
            getComplianceResourceTypes().add(value);
        }
        return this;
    }
    
    /**
     * The resource types of only those AWS resources that you want AWS
     * Config to evaluate against the rule. You can specify only one type if
     * you also specify resource IDs for <code>ComplianceResourceId</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param complianceResourceTypes The resource types of only those AWS resources that you want AWS
     *         Config to evaluate against the rule. You can specify only one type if
     *         you also specify resource IDs for <code>ComplianceResourceId</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Scope withComplianceResourceTypes(java.util.Collection<String> complianceResourceTypes) {
        if (complianceResourceTypes == null) {
            this.complianceResourceTypes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> complianceResourceTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(complianceResourceTypes.size());
            complianceResourceTypesCopy.addAll(complianceResourceTypes);
            this.complianceResourceTypes = complianceResourceTypesCopy;
        }

        return this;
    }

    /**
     * The tag key that is applied to only those AWS resources that you want
     * AWS Config to evaluate against the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return The tag key that is applied to only those AWS resources that you want
     *         AWS Config to evaluate against the rule.
     */
    public String getTagKey() {
        return tagKey;
    }
    
    /**
     * The tag key that is applied to only those AWS resources that you want
     * AWS Config to evaluate against the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param tagKey The tag key that is applied to only those AWS resources that you want
     *         AWS Config to evaluate against the rule.
     */
    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }
    
    /**
     * The tag key that is applied to only those AWS resources that you want
     * AWS Config to evaluate against the rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param tagKey The tag key that is applied to only those AWS resources that you want
     *         AWS Config to evaluate against the rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Scope withTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    /**
     * The tag value applied to only those AWS resources that you want AWS
     * Config to evaluate against the rule. If you specify a value for
     * <code>TagValue</code>, you must also specify a value for
     * <code>TagKey</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The tag value applied to only those AWS resources that you want AWS
     *         Config to evaluate against the rule. If you specify a value for
     *         <code>TagValue</code>, you must also specify a value for
     *         <code>TagKey</code>.
     */
    public String getTagValue() {
        return tagValue;
    }
    
    /**
     * The tag value applied to only those AWS resources that you want AWS
     * Config to evaluate against the rule. If you specify a value for
     * <code>TagValue</code>, you must also specify a value for
     * <code>TagKey</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param tagValue The tag value applied to only those AWS resources that you want AWS
     *         Config to evaluate against the rule. If you specify a value for
     *         <code>TagValue</code>, you must also specify a value for
     *         <code>TagKey</code>.
     */
    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }
    
    /**
     * The tag value applied to only those AWS resources that you want AWS
     * Config to evaluate against the rule. If you specify a value for
     * <code>TagValue</code>, you must also specify a value for
     * <code>TagKey</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param tagValue The tag value applied to only those AWS resources that you want AWS
     *         Config to evaluate against the rule. If you specify a value for
     *         <code>TagValue</code>, you must also specify a value for
     *         <code>TagKey</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Scope withTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }

    /**
     * The IDs of only those AWS resources that you want AWS Config to
     * evaluate against the rule. If you specify a resource ID, you must
     * specify one resource type for <code>ComplianceResourceTypes</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The IDs of only those AWS resources that you want AWS Config to
     *         evaluate against the rule. If you specify a resource ID, you must
     *         specify one resource type for <code>ComplianceResourceTypes</code>.
     */
    public String getComplianceResourceId() {
        return complianceResourceId;
    }
    
    /**
     * The IDs of only those AWS resources that you want AWS Config to
     * evaluate against the rule. If you specify a resource ID, you must
     * specify one resource type for <code>ComplianceResourceTypes</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param complianceResourceId The IDs of only those AWS resources that you want AWS Config to
     *         evaluate against the rule. If you specify a resource ID, you must
     *         specify one resource type for <code>ComplianceResourceTypes</code>.
     */
    public void setComplianceResourceId(String complianceResourceId) {
        this.complianceResourceId = complianceResourceId;
    }
    
    /**
     * The IDs of only those AWS resources that you want AWS Config to
     * evaluate against the rule. If you specify a resource ID, you must
     * specify one resource type for <code>ComplianceResourceTypes</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param complianceResourceId The IDs of only those AWS resources that you want AWS Config to
     *         evaluate against the rule. If you specify a resource ID, you must
     *         specify one resource type for <code>ComplianceResourceTypes</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Scope withComplianceResourceId(String complianceResourceId) {
        this.complianceResourceId = complianceResourceId;
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
        if (getComplianceResourceTypes() != null) sb.append("ComplianceResourceTypes: " + getComplianceResourceTypes() + ",");
        if (getTagKey() != null) sb.append("TagKey: " + getTagKey() + ",");
        if (getTagValue() != null) sb.append("TagValue: " + getTagValue() + ",");
        if (getComplianceResourceId() != null) sb.append("ComplianceResourceId: " + getComplianceResourceId() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Scope == false) return false;
        Scope other = (Scope)obj;
        
        if (other.getComplianceResourceTypes() == null ^ this.getComplianceResourceTypes() == null) return false;
        if (other.getComplianceResourceTypes() != null && other.getComplianceResourceTypes().equals(this.getComplianceResourceTypes()) == false) return false; 
        if (other.getTagKey() == null ^ this.getTagKey() == null) return false;
        if (other.getTagKey() != null && other.getTagKey().equals(this.getTagKey()) == false) return false; 
        if (other.getTagValue() == null ^ this.getTagValue() == null) return false;
        if (other.getTagValue() != null && other.getTagValue().equals(this.getTagValue()) == false) return false; 
        if (other.getComplianceResourceId() == null ^ this.getComplianceResourceId() == null) return false;
        if (other.getComplianceResourceId() != null && other.getComplianceResourceId().equals(this.getComplianceResourceId()) == false) return false; 
        return true;
    }
    
    @Override
    public Scope clone() {
        try {
            return (Scope) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    