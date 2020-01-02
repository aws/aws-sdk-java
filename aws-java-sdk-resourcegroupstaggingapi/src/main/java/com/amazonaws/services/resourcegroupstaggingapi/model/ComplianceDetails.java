/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information that shows whether a resource is compliant with the effective tag policy, including details on any
 * noncompliant tag keys.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/ComplianceDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComplianceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * These tag keys on the resource are noncompliant with the effective tag policy.
     * </p>
     */
    private java.util.List<String> noncompliantKeys;
    /**
     * <p>
     * These are keys defined in the effective policy that are on the resource with either incorrect case treatment or
     * noncompliant values.
     * </p>
     */
    private java.util.List<String> keysWithNoncompliantValues;
    /**
     * <p>
     * Whether a resource is compliant with the effective tag policy.
     * </p>
     */
    private Boolean complianceStatus;

    /**
     * <p>
     * These tag keys on the resource are noncompliant with the effective tag policy.
     * </p>
     * 
     * @return These tag keys on the resource are noncompliant with the effective tag policy.
     */

    public java.util.List<String> getNoncompliantKeys() {
        return noncompliantKeys;
    }

    /**
     * <p>
     * These tag keys on the resource are noncompliant with the effective tag policy.
     * </p>
     * 
     * @param noncompliantKeys
     *        These tag keys on the resource are noncompliant with the effective tag policy.
     */

    public void setNoncompliantKeys(java.util.Collection<String> noncompliantKeys) {
        if (noncompliantKeys == null) {
            this.noncompliantKeys = null;
            return;
        }

        this.noncompliantKeys = new java.util.ArrayList<String>(noncompliantKeys);
    }

    /**
     * <p>
     * These tag keys on the resource are noncompliant with the effective tag policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNoncompliantKeys(java.util.Collection)} or {@link #withNoncompliantKeys(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param noncompliantKeys
     *        These tag keys on the resource are noncompliant with the effective tag policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDetails withNoncompliantKeys(String... noncompliantKeys) {
        if (this.noncompliantKeys == null) {
            setNoncompliantKeys(new java.util.ArrayList<String>(noncompliantKeys.length));
        }
        for (String ele : noncompliantKeys) {
            this.noncompliantKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * These tag keys on the resource are noncompliant with the effective tag policy.
     * </p>
     * 
     * @param noncompliantKeys
     *        These tag keys on the resource are noncompliant with the effective tag policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDetails withNoncompliantKeys(java.util.Collection<String> noncompliantKeys) {
        setNoncompliantKeys(noncompliantKeys);
        return this;
    }

    /**
     * <p>
     * These are keys defined in the effective policy that are on the resource with either incorrect case treatment or
     * noncompliant values.
     * </p>
     * 
     * @return These are keys defined in the effective policy that are on the resource with either incorrect case
     *         treatment or noncompliant values.
     */

    public java.util.List<String> getKeysWithNoncompliantValues() {
        return keysWithNoncompliantValues;
    }

    /**
     * <p>
     * These are keys defined in the effective policy that are on the resource with either incorrect case treatment or
     * noncompliant values.
     * </p>
     * 
     * @param keysWithNoncompliantValues
     *        These are keys defined in the effective policy that are on the resource with either incorrect case
     *        treatment or noncompliant values.
     */

    public void setKeysWithNoncompliantValues(java.util.Collection<String> keysWithNoncompliantValues) {
        if (keysWithNoncompliantValues == null) {
            this.keysWithNoncompliantValues = null;
            return;
        }

        this.keysWithNoncompliantValues = new java.util.ArrayList<String>(keysWithNoncompliantValues);
    }

    /**
     * <p>
     * These are keys defined in the effective policy that are on the resource with either incorrect case treatment or
     * noncompliant values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeysWithNoncompliantValues(java.util.Collection)} or
     * {@link #withKeysWithNoncompliantValues(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param keysWithNoncompliantValues
     *        These are keys defined in the effective policy that are on the resource with either incorrect case
     *        treatment or noncompliant values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDetails withKeysWithNoncompliantValues(String... keysWithNoncompliantValues) {
        if (this.keysWithNoncompliantValues == null) {
            setKeysWithNoncompliantValues(new java.util.ArrayList<String>(keysWithNoncompliantValues.length));
        }
        for (String ele : keysWithNoncompliantValues) {
            this.keysWithNoncompliantValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * These are keys defined in the effective policy that are on the resource with either incorrect case treatment or
     * noncompliant values.
     * </p>
     * 
     * @param keysWithNoncompliantValues
     *        These are keys defined in the effective policy that are on the resource with either incorrect case
     *        treatment or noncompliant values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDetails withKeysWithNoncompliantValues(java.util.Collection<String> keysWithNoncompliantValues) {
        setKeysWithNoncompliantValues(keysWithNoncompliantValues);
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
        if (getNoncompliantKeys() != null)
            sb.append("NoncompliantKeys: ").append(getNoncompliantKeys()).append(",");
        if (getKeysWithNoncompliantValues() != null)
            sb.append("KeysWithNoncompliantValues: ").append(getKeysWithNoncompliantValues()).append(",");
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
        if (other.getNoncompliantKeys() == null ^ this.getNoncompliantKeys() == null)
            return false;
        if (other.getNoncompliantKeys() != null && other.getNoncompliantKeys().equals(this.getNoncompliantKeys()) == false)
            return false;
        if (other.getKeysWithNoncompliantValues() == null ^ this.getKeysWithNoncompliantValues() == null)
            return false;
        if (other.getKeysWithNoncompliantValues() != null && other.getKeysWithNoncompliantValues().equals(this.getKeysWithNoncompliantValues()) == false)
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

        hashCode = prime * hashCode + ((getNoncompliantKeys() == null) ? 0 : getNoncompliantKeys().hashCode());
        hashCode = prime * hashCode + ((getKeysWithNoncompliantValues() == null) ? 0 : getKeysWithNoncompliantValues().hashCode());
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
