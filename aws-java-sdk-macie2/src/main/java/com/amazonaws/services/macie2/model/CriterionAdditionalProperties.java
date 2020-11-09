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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the operator to use in a property-based condition that filters the results of a query for findings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CriterionAdditionalProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CriterionAdditionalProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An equal to condition to apply to a specified property value for findings.
     * </p>
     */
    private java.util.List<String> eq;
    /**
     * <p>
     * A condition that requires an array field of a finding to exactly match the specified property values. You can use
     * this operator with the following properties: customDataIdentifiers.detections.arn,
     * customDataIdentifiers.detections.name, resourcesAffected.s3Bucket.tags.key,
     * resourcesAffected.s3Bucket.tags.value, resourcesAffected.s3Object.tags.key,
     * resourcesAffected.s3Object.tags.value, sensitiveData.category, and sensitiveData.detections.type.
     * </p>
     */
    private java.util.List<String> eqExactMatch;
    /**
     * <p>
     * A greater than condition to apply to a specified property value for findings.
     * </p>
     */
    private Long gt;
    /**
     * <p>
     * A greater than or equal to condition to apply to a specified property value for findings.
     * </p>
     */
    private Long gte;
    /**
     * <p>
     * A less than condition to apply to a specified property value for findings.
     * </p>
     */
    private Long lt;
    /**
     * <p>
     * A less than or equal to condition to apply to a specified property value for findings.
     * </p>
     */
    private Long lte;
    /**
     * <p>
     * A not equal to condition to apply to a specified property value for findings.
     * </p>
     */
    private java.util.List<String> neq;

    /**
     * <p>
     * An equal to condition to apply to a specified property value for findings.
     * </p>
     * 
     * @return An equal to condition to apply to a specified property value for findings.
     */

    public java.util.List<String> getEq() {
        return eq;
    }

    /**
     * <p>
     * An equal to condition to apply to a specified property value for findings.
     * </p>
     * 
     * @param eq
     *        An equal to condition to apply to a specified property value for findings.
     */

    public void setEq(java.util.Collection<String> eq) {
        if (eq == null) {
            this.eq = null;
            return;
        }

        this.eq = new java.util.ArrayList<String>(eq);
    }

    /**
     * <p>
     * An equal to condition to apply to a specified property value for findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEq(java.util.Collection)} or {@link #withEq(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param eq
     *        An equal to condition to apply to a specified property value for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CriterionAdditionalProperties withEq(String... eq) {
        if (this.eq == null) {
            setEq(new java.util.ArrayList<String>(eq.length));
        }
        for (String ele : eq) {
            this.eq.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An equal to condition to apply to a specified property value for findings.
     * </p>
     * 
     * @param eq
     *        An equal to condition to apply to a specified property value for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CriterionAdditionalProperties withEq(java.util.Collection<String> eq) {
        setEq(eq);
        return this;
    }

    /**
     * <p>
     * A condition that requires an array field of a finding to exactly match the specified property values. You can use
     * this operator with the following properties: customDataIdentifiers.detections.arn,
     * customDataIdentifiers.detections.name, resourcesAffected.s3Bucket.tags.key,
     * resourcesAffected.s3Bucket.tags.value, resourcesAffected.s3Object.tags.key,
     * resourcesAffected.s3Object.tags.value, sensitiveData.category, and sensitiveData.detections.type.
     * </p>
     * 
     * @return A condition that requires an array field of a finding to exactly match the specified property values. You
     *         can use this operator with the following properties: customDataIdentifiers.detections.arn,
     *         customDataIdentifiers.detections.name, resourcesAffected.s3Bucket.tags.key,
     *         resourcesAffected.s3Bucket.tags.value, resourcesAffected.s3Object.tags.key,
     *         resourcesAffected.s3Object.tags.value, sensitiveData.category, and sensitiveData.detections.type.
     */

    public java.util.List<String> getEqExactMatch() {
        return eqExactMatch;
    }

    /**
     * <p>
     * A condition that requires an array field of a finding to exactly match the specified property values. You can use
     * this operator with the following properties: customDataIdentifiers.detections.arn,
     * customDataIdentifiers.detections.name, resourcesAffected.s3Bucket.tags.key,
     * resourcesAffected.s3Bucket.tags.value, resourcesAffected.s3Object.tags.key,
     * resourcesAffected.s3Object.tags.value, sensitiveData.category, and sensitiveData.detections.type.
     * </p>
     * 
     * @param eqExactMatch
     *        A condition that requires an array field of a finding to exactly match the specified property values. You
     *        can use this operator with the following properties: customDataIdentifiers.detections.arn,
     *        customDataIdentifiers.detections.name, resourcesAffected.s3Bucket.tags.key,
     *        resourcesAffected.s3Bucket.tags.value, resourcesAffected.s3Object.tags.key,
     *        resourcesAffected.s3Object.tags.value, sensitiveData.category, and sensitiveData.detections.type.
     */

    public void setEqExactMatch(java.util.Collection<String> eqExactMatch) {
        if (eqExactMatch == null) {
            this.eqExactMatch = null;
            return;
        }

        this.eqExactMatch = new java.util.ArrayList<String>(eqExactMatch);
    }

    /**
     * <p>
     * A condition that requires an array field of a finding to exactly match the specified property values. You can use
     * this operator with the following properties: customDataIdentifiers.detections.arn,
     * customDataIdentifiers.detections.name, resourcesAffected.s3Bucket.tags.key,
     * resourcesAffected.s3Bucket.tags.value, resourcesAffected.s3Object.tags.key,
     * resourcesAffected.s3Object.tags.value, sensitiveData.category, and sensitiveData.detections.type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEqExactMatch(java.util.Collection)} or {@link #withEqExactMatch(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eqExactMatch
     *        A condition that requires an array field of a finding to exactly match the specified property values. You
     *        can use this operator with the following properties: customDataIdentifiers.detections.arn,
     *        customDataIdentifiers.detections.name, resourcesAffected.s3Bucket.tags.key,
     *        resourcesAffected.s3Bucket.tags.value, resourcesAffected.s3Object.tags.key,
     *        resourcesAffected.s3Object.tags.value, sensitiveData.category, and sensitiveData.detections.type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CriterionAdditionalProperties withEqExactMatch(String... eqExactMatch) {
        if (this.eqExactMatch == null) {
            setEqExactMatch(new java.util.ArrayList<String>(eqExactMatch.length));
        }
        for (String ele : eqExactMatch) {
            this.eqExactMatch.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A condition that requires an array field of a finding to exactly match the specified property values. You can use
     * this operator with the following properties: customDataIdentifiers.detections.arn,
     * customDataIdentifiers.detections.name, resourcesAffected.s3Bucket.tags.key,
     * resourcesAffected.s3Bucket.tags.value, resourcesAffected.s3Object.tags.key,
     * resourcesAffected.s3Object.tags.value, sensitiveData.category, and sensitiveData.detections.type.
     * </p>
     * 
     * @param eqExactMatch
     *        A condition that requires an array field of a finding to exactly match the specified property values. You
     *        can use this operator with the following properties: customDataIdentifiers.detections.arn,
     *        customDataIdentifiers.detections.name, resourcesAffected.s3Bucket.tags.key,
     *        resourcesAffected.s3Bucket.tags.value, resourcesAffected.s3Object.tags.key,
     *        resourcesAffected.s3Object.tags.value, sensitiveData.category, and sensitiveData.detections.type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CriterionAdditionalProperties withEqExactMatch(java.util.Collection<String> eqExactMatch) {
        setEqExactMatch(eqExactMatch);
        return this;
    }

    /**
     * <p>
     * A greater than condition to apply to a specified property value for findings.
     * </p>
     * 
     * @param gt
     *        A greater than condition to apply to a specified property value for findings.
     */

    public void setGt(Long gt) {
        this.gt = gt;
    }

    /**
     * <p>
     * A greater than condition to apply to a specified property value for findings.
     * </p>
     * 
     * @return A greater than condition to apply to a specified property value for findings.
     */

    public Long getGt() {
        return this.gt;
    }

    /**
     * <p>
     * A greater than condition to apply to a specified property value for findings.
     * </p>
     * 
     * @param gt
     *        A greater than condition to apply to a specified property value for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CriterionAdditionalProperties withGt(Long gt) {
        setGt(gt);
        return this;
    }

    /**
     * <p>
     * A greater than or equal to condition to apply to a specified property value for findings.
     * </p>
     * 
     * @param gte
     *        A greater than or equal to condition to apply to a specified property value for findings.
     */

    public void setGte(Long gte) {
        this.gte = gte;
    }

    /**
     * <p>
     * A greater than or equal to condition to apply to a specified property value for findings.
     * </p>
     * 
     * @return A greater than or equal to condition to apply to a specified property value for findings.
     */

    public Long getGte() {
        return this.gte;
    }

    /**
     * <p>
     * A greater than or equal to condition to apply to a specified property value for findings.
     * </p>
     * 
     * @param gte
     *        A greater than or equal to condition to apply to a specified property value for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CriterionAdditionalProperties withGte(Long gte) {
        setGte(gte);
        return this;
    }

    /**
     * <p>
     * A less than condition to apply to a specified property value for findings.
     * </p>
     * 
     * @param lt
     *        A less than condition to apply to a specified property value for findings.
     */

    public void setLt(Long lt) {
        this.lt = lt;
    }

    /**
     * <p>
     * A less than condition to apply to a specified property value for findings.
     * </p>
     * 
     * @return A less than condition to apply to a specified property value for findings.
     */

    public Long getLt() {
        return this.lt;
    }

    /**
     * <p>
     * A less than condition to apply to a specified property value for findings.
     * </p>
     * 
     * @param lt
     *        A less than condition to apply to a specified property value for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CriterionAdditionalProperties withLt(Long lt) {
        setLt(lt);
        return this;
    }

    /**
     * <p>
     * A less than or equal to condition to apply to a specified property value for findings.
     * </p>
     * 
     * @param lte
     *        A less than or equal to condition to apply to a specified property value for findings.
     */

    public void setLte(Long lte) {
        this.lte = lte;
    }

    /**
     * <p>
     * A less than or equal to condition to apply to a specified property value for findings.
     * </p>
     * 
     * @return A less than or equal to condition to apply to a specified property value for findings.
     */

    public Long getLte() {
        return this.lte;
    }

    /**
     * <p>
     * A less than or equal to condition to apply to a specified property value for findings.
     * </p>
     * 
     * @param lte
     *        A less than or equal to condition to apply to a specified property value for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CriterionAdditionalProperties withLte(Long lte) {
        setLte(lte);
        return this;
    }

    /**
     * <p>
     * A not equal to condition to apply to a specified property value for findings.
     * </p>
     * 
     * @return A not equal to condition to apply to a specified property value for findings.
     */

    public java.util.List<String> getNeq() {
        return neq;
    }

    /**
     * <p>
     * A not equal to condition to apply to a specified property value for findings.
     * </p>
     * 
     * @param neq
     *        A not equal to condition to apply to a specified property value for findings.
     */

    public void setNeq(java.util.Collection<String> neq) {
        if (neq == null) {
            this.neq = null;
            return;
        }

        this.neq = new java.util.ArrayList<String>(neq);
    }

    /**
     * <p>
     * A not equal to condition to apply to a specified property value for findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNeq(java.util.Collection)} or {@link #withNeq(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param neq
     *        A not equal to condition to apply to a specified property value for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CriterionAdditionalProperties withNeq(String... neq) {
        if (this.neq == null) {
            setNeq(new java.util.ArrayList<String>(neq.length));
        }
        for (String ele : neq) {
            this.neq.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A not equal to condition to apply to a specified property value for findings.
     * </p>
     * 
     * @param neq
     *        A not equal to condition to apply to a specified property value for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CriterionAdditionalProperties withNeq(java.util.Collection<String> neq) {
        setNeq(neq);
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
        if (getEq() != null)
            sb.append("Eq: ").append(getEq()).append(",");
        if (getEqExactMatch() != null)
            sb.append("EqExactMatch: ").append(getEqExactMatch()).append(",");
        if (getGt() != null)
            sb.append("Gt: ").append(getGt()).append(",");
        if (getGte() != null)
            sb.append("Gte: ").append(getGte()).append(",");
        if (getLt() != null)
            sb.append("Lt: ").append(getLt()).append(",");
        if (getLte() != null)
            sb.append("Lte: ").append(getLte()).append(",");
        if (getNeq() != null)
            sb.append("Neq: ").append(getNeq());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CriterionAdditionalProperties == false)
            return false;
        CriterionAdditionalProperties other = (CriterionAdditionalProperties) obj;
        if (other.getEq() == null ^ this.getEq() == null)
            return false;
        if (other.getEq() != null && other.getEq().equals(this.getEq()) == false)
            return false;
        if (other.getEqExactMatch() == null ^ this.getEqExactMatch() == null)
            return false;
        if (other.getEqExactMatch() != null && other.getEqExactMatch().equals(this.getEqExactMatch()) == false)
            return false;
        if (other.getGt() == null ^ this.getGt() == null)
            return false;
        if (other.getGt() != null && other.getGt().equals(this.getGt()) == false)
            return false;
        if (other.getGte() == null ^ this.getGte() == null)
            return false;
        if (other.getGte() != null && other.getGte().equals(this.getGte()) == false)
            return false;
        if (other.getLt() == null ^ this.getLt() == null)
            return false;
        if (other.getLt() != null && other.getLt().equals(this.getLt()) == false)
            return false;
        if (other.getLte() == null ^ this.getLte() == null)
            return false;
        if (other.getLte() != null && other.getLte().equals(this.getLte()) == false)
            return false;
        if (other.getNeq() == null ^ this.getNeq() == null)
            return false;
        if (other.getNeq() != null && other.getNeq().equals(this.getNeq()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEq() == null) ? 0 : getEq().hashCode());
        hashCode = prime * hashCode + ((getEqExactMatch() == null) ? 0 : getEqExactMatch().hashCode());
        hashCode = prime * hashCode + ((getGt() == null) ? 0 : getGt().hashCode());
        hashCode = prime * hashCode + ((getGte() == null) ? 0 : getGte().hashCode());
        hashCode = prime * hashCode + ((getLt() == null) ? 0 : getLt().hashCode());
        hashCode = prime * hashCode + ((getLte() == null) ? 0 : getLte().hashCode());
        hashCode = prime * hashCode + ((getNeq() == null) ? 0 : getNeq().hashCode());
        return hashCode;
    }

    @Override
    public CriterionAdditionalProperties clone() {
        try {
            return (CriterionAdditionalProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.CriterionAdditionalPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
