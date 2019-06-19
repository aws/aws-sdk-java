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
package com.amazonaws.services.resourcegroupstaggingapi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details on whether a resource is compliant with the effective tag policy, including information any noncompliant tag
 * keys.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/ComplianceDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComplianceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A tag key that is required by the effective tag policy is missing.
     * </p>
     */
    private java.util.List<String> missingKeys;
    /**
     * <p>
     * The tag key is noncompliant with the effective tag policy.
     * </p>
     */
    private java.util.List<String> invalidKeys;
    /**
     * <p>
     * The tag value is noncompliant with the effective tag policy.
     * </p>
     */
    private java.util.List<String> invalidValues;
    /**
     * <p>
     * Whether a resource is compliant with the effective tag policy.
     * </p>
     */
    private Boolean complianceStatus;

    /**
     * <p>
     * A tag key that is required by the effective tag policy is missing.
     * </p>
     * 
     * @return A tag key that is required by the effective tag policy is missing.
     */

    public java.util.List<String> getMissingKeys() {
        return missingKeys;
    }

    /**
     * <p>
     * A tag key that is required by the effective tag policy is missing.
     * </p>
     * 
     * @param missingKeys
     *        A tag key that is required by the effective tag policy is missing.
     */

    public void setMissingKeys(java.util.Collection<String> missingKeys) {
        if (missingKeys == null) {
            this.missingKeys = null;
            return;
        }

        this.missingKeys = new java.util.ArrayList<String>(missingKeys);
    }

    /**
     * <p>
     * A tag key that is required by the effective tag policy is missing.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMissingKeys(java.util.Collection)} or {@link #withMissingKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param missingKeys
     *        A tag key that is required by the effective tag policy is missing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDetails withMissingKeys(String... missingKeys) {
        if (this.missingKeys == null) {
            setMissingKeys(new java.util.ArrayList<String>(missingKeys.length));
        }
        for (String ele : missingKeys) {
            this.missingKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A tag key that is required by the effective tag policy is missing.
     * </p>
     * 
     * @param missingKeys
     *        A tag key that is required by the effective tag policy is missing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDetails withMissingKeys(java.util.Collection<String> missingKeys) {
        setMissingKeys(missingKeys);
        return this;
    }

    /**
     * <p>
     * The tag key is noncompliant with the effective tag policy.
     * </p>
     * 
     * @return The tag key is noncompliant with the effective tag policy.
     */

    public java.util.List<String> getInvalidKeys() {
        return invalidKeys;
    }

    /**
     * <p>
     * The tag key is noncompliant with the effective tag policy.
     * </p>
     * 
     * @param invalidKeys
     *        The tag key is noncompliant with the effective tag policy.
     */

    public void setInvalidKeys(java.util.Collection<String> invalidKeys) {
        if (invalidKeys == null) {
            this.invalidKeys = null;
            return;
        }

        this.invalidKeys = new java.util.ArrayList<String>(invalidKeys);
    }

    /**
     * <p>
     * The tag key is noncompliant with the effective tag policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInvalidKeys(java.util.Collection)} or {@link #withInvalidKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param invalidKeys
     *        The tag key is noncompliant with the effective tag policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDetails withInvalidKeys(String... invalidKeys) {
        if (this.invalidKeys == null) {
            setInvalidKeys(new java.util.ArrayList<String>(invalidKeys.length));
        }
        for (String ele : invalidKeys) {
            this.invalidKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag key is noncompliant with the effective tag policy.
     * </p>
     * 
     * @param invalidKeys
     *        The tag key is noncompliant with the effective tag policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDetails withInvalidKeys(java.util.Collection<String> invalidKeys) {
        setInvalidKeys(invalidKeys);
        return this;
    }

    /**
     * <p>
     * The tag value is noncompliant with the effective tag policy.
     * </p>
     * 
     * @return The tag value is noncompliant with the effective tag policy.
     */

    public java.util.List<String> getInvalidValues() {
        return invalidValues;
    }

    /**
     * <p>
     * The tag value is noncompliant with the effective tag policy.
     * </p>
     * 
     * @param invalidValues
     *        The tag value is noncompliant with the effective tag policy.
     */

    public void setInvalidValues(java.util.Collection<String> invalidValues) {
        if (invalidValues == null) {
            this.invalidValues = null;
            return;
        }

        this.invalidValues = new java.util.ArrayList<String>(invalidValues);
    }

    /**
     * <p>
     * The tag value is noncompliant with the effective tag policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInvalidValues(java.util.Collection)} or {@link #withInvalidValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param invalidValues
     *        The tag value is noncompliant with the effective tag policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDetails withInvalidValues(String... invalidValues) {
        if (this.invalidValues == null) {
            setInvalidValues(new java.util.ArrayList<String>(invalidValues.length));
        }
        for (String ele : invalidValues) {
            this.invalidValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag value is noncompliant with the effective tag policy.
     * </p>
     * 
     * @param invalidValues
     *        The tag value is noncompliant with the effective tag policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDetails withInvalidValues(java.util.Collection<String> invalidValues) {
        setInvalidValues(invalidValues);
        return this;
    }

    /**
     * <p>
     * Whether a resource is compliant with the effective tag policy.
     * </p>
     * 
     * @param complianceStatus
     *        Whether a resource is compliant with the effective tag policy.
     */

    public void setComplianceStatus(Boolean complianceStatus) {
        this.complianceStatus = complianceStatus;
    }

    /**
     * <p>
     * Whether a resource is compliant with the effective tag policy.
     * </p>
     * 
     * @return Whether a resource is compliant with the effective tag policy.
     */

    public Boolean getComplianceStatus() {
        return this.complianceStatus;
    }

    /**
     * <p>
     * Whether a resource is compliant with the effective tag policy.
     * </p>
     * 
     * @param complianceStatus
     *        Whether a resource is compliant with the effective tag policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDetails withComplianceStatus(Boolean complianceStatus) {
        setComplianceStatus(complianceStatus);
        return this;
    }

    /**
     * <p>
     * Whether a resource is compliant with the effective tag policy.
     * </p>
     * 
     * @return Whether a resource is compliant with the effective tag policy.
     */

    public Boolean isComplianceStatus() {
        return this.complianceStatus;
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
        if (getMissingKeys() != null)
            sb.append("MissingKeys: ").append(getMissingKeys()).append(",");
        if (getInvalidKeys() != null)
            sb.append("InvalidKeys: ").append(getInvalidKeys()).append(",");
        if (getInvalidValues() != null)
            sb.append("InvalidValues: ").append(getInvalidValues()).append(",");
        if (getComplianceStatus() != null)
            sb.append("ComplianceStatus: ").append(getComplianceStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComplianceDetails == false)
            return false;
        ComplianceDetails other = (ComplianceDetails) obj;
        if (other.getMissingKeys() == null ^ this.getMissingKeys() == null)
            return false;
        if (other.getMissingKeys() != null && other.getMissingKeys().equals(this.getMissingKeys()) == false)
            return false;
        if (other.getInvalidKeys() == null ^ this.getInvalidKeys() == null)
            return false;
        if (other.getInvalidKeys() != null && other.getInvalidKeys().equals(this.getInvalidKeys()) == false)
            return false;
        if (other.getInvalidValues() == null ^ this.getInvalidValues() == null)
            return false;
        if (other.getInvalidValues() != null && other.getInvalidValues().equals(this.getInvalidValues()) == false)
            return false;
        if (other.getComplianceStatus() == null ^ this.getComplianceStatus() == null)
            return false;
        if (other.getComplianceStatus() != null && other.getComplianceStatus().equals(this.getComplianceStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMissingKeys() == null) ? 0 : getMissingKeys().hashCode());
        hashCode = prime * hashCode + ((getInvalidKeys() == null) ? 0 : getInvalidKeys().hashCode());
        hashCode = prime * hashCode + ((getInvalidValues() == null) ? 0 : getInvalidValues().hashCode());
        hashCode = prime * hashCode + ((getComplianceStatus() == null) ? 0 : getComplianceStatus().hashCode());
        return hashCode;
    }

    @Override
    public ComplianceDetails clone() {
        try {
            return (ComplianceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourcegroupstaggingapi.model.transform.ComplianceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
