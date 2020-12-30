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
 * Specifies the operator to use in a property-based condition that filters the results of a query for information about
 * S3 buckets.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/BucketCriteriaAdditionalProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BucketCriteriaAdditionalProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value for the property matches (equals) the specified value. If you specify multiple values, Macie uses OR
     * logic to join the values.
     * </p>
     */
    private java.util.List<String> eq;
    /**
     * <p>
     * The value for the property is greater than the specified value.
     * </p>
     */
    private Long gt;
    /**
     * <p>
     * The value for the property is greater than or equal to the specified value.
     * </p>
     */
    private Long gte;
    /**
     * <p>
     * The value for the property is less than the specified value.
     * </p>
     */
    private Long lt;
    /**
     * <p>
     * The value for the property is less than or equal to the specified value.
     * </p>
     */
    private Long lte;
    /**
     * <p>
     * The value for the property doesn't match (doesn't equal) the specified value. If you specify multiple values,
     * Amazon Macie uses OR logic to join the values.
     * </p>
     */
    private java.util.List<String> neq;
    /**
     * <p>
     * The name of the bucket begins with the specified value.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * The value for the property matches (equals) the specified value. If you specify multiple values, Macie uses OR
     * logic to join the values.
     * </p>
     * 
     * @return The value for the property matches (equals) the specified value. If you specify multiple values, Macie
     *         uses OR logic to join the values.
     */

    public java.util.List<String> getEq() {
        return eq;
    }

    /**
     * <p>
     * The value for the property matches (equals) the specified value. If you specify multiple values, Macie uses OR
     * logic to join the values.
     * </p>
     * 
     * @param eq
     *        The value for the property matches (equals) the specified value. If you specify multiple values, Macie
     *        uses OR logic to join the values.
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
     * The value for the property matches (equals) the specified value. If you specify multiple values, Macie uses OR
     * logic to join the values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEq(java.util.Collection)} or {@link #withEq(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param eq
     *        The value for the property matches (equals) the specified value. If you specify multiple values, Macie
     *        uses OR logic to join the values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCriteriaAdditionalProperties withEq(String... eq) {
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
     * The value for the property matches (equals) the specified value. If you specify multiple values, Macie uses OR
     * logic to join the values.
     * </p>
     * 
     * @param eq
     *        The value for the property matches (equals) the specified value. If you specify multiple values, Macie
     *        uses OR logic to join the values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCriteriaAdditionalProperties withEq(java.util.Collection<String> eq) {
        setEq(eq);
        return this;
    }

    /**
     * <p>
     * The value for the property is greater than the specified value.
     * </p>
     * 
     * @param gt
     *        The value for the property is greater than the specified value.
     */

    public void setGt(Long gt) {
        this.gt = gt;
    }

    /**
     * <p>
     * The value for the property is greater than the specified value.
     * </p>
     * 
     * @return The value for the property is greater than the specified value.
     */

    public Long getGt() {
        return this.gt;
    }

    /**
     * <p>
     * The value for the property is greater than the specified value.
     * </p>
     * 
     * @param gt
     *        The value for the property is greater than the specified value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCriteriaAdditionalProperties withGt(Long gt) {
        setGt(gt);
        return this;
    }

    /**
     * <p>
     * The value for the property is greater than or equal to the specified value.
     * </p>
     * 
     * @param gte
     *        The value for the property is greater than or equal to the specified value.
     */

    public void setGte(Long gte) {
        this.gte = gte;
    }

    /**
     * <p>
     * The value for the property is greater than or equal to the specified value.
     * </p>
     * 
     * @return The value for the property is greater than or equal to the specified value.
     */

    public Long getGte() {
        return this.gte;
    }

    /**
     * <p>
     * The value for the property is greater than or equal to the specified value.
     * </p>
     * 
     * @param gte
     *        The value for the property is greater than or equal to the specified value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCriteriaAdditionalProperties withGte(Long gte) {
        setGte(gte);
        return this;
    }

    /**
     * <p>
     * The value for the property is less than the specified value.
     * </p>
     * 
     * @param lt
     *        The value for the property is less than the specified value.
     */

    public void setLt(Long lt) {
        this.lt = lt;
    }

    /**
     * <p>
     * The value for the property is less than the specified value.
     * </p>
     * 
     * @return The value for the property is less than the specified value.
     */

    public Long getLt() {
        return this.lt;
    }

    /**
     * <p>
     * The value for the property is less than the specified value.
     * </p>
     * 
     * @param lt
     *        The value for the property is less than the specified value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCriteriaAdditionalProperties withLt(Long lt) {
        setLt(lt);
        return this;
    }

    /**
     * <p>
     * The value for the property is less than or equal to the specified value.
     * </p>
     * 
     * @param lte
     *        The value for the property is less than or equal to the specified value.
     */

    public void setLte(Long lte) {
        this.lte = lte;
    }

    /**
     * <p>
     * The value for the property is less than or equal to the specified value.
     * </p>
     * 
     * @return The value for the property is less than or equal to the specified value.
     */

    public Long getLte() {
        return this.lte;
    }

    /**
     * <p>
     * The value for the property is less than or equal to the specified value.
     * </p>
     * 
     * @param lte
     *        The value for the property is less than or equal to the specified value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCriteriaAdditionalProperties withLte(Long lte) {
        setLte(lte);
        return this;
    }

    /**
     * <p>
     * The value for the property doesn't match (doesn't equal) the specified value. If you specify multiple values,
     * Amazon Macie uses OR logic to join the values.
     * </p>
     * 
     * @return The value for the property doesn't match (doesn't equal) the specified value. If you specify multiple
     *         values, Amazon Macie uses OR logic to join the values.
     */

    public java.util.List<String> getNeq() {
        return neq;
    }

    /**
     * <p>
     * The value for the property doesn't match (doesn't equal) the specified value. If you specify multiple values,
     * Amazon Macie uses OR logic to join the values.
     * </p>
     * 
     * @param neq
     *        The value for the property doesn't match (doesn't equal) the specified value. If you specify multiple
     *        values, Amazon Macie uses OR logic to join the values.
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
     * The value for the property doesn't match (doesn't equal) the specified value. If you specify multiple values,
     * Amazon Macie uses OR logic to join the values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNeq(java.util.Collection)} or {@link #withNeq(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param neq
     *        The value for the property doesn't match (doesn't equal) the specified value. If you specify multiple
     *        values, Amazon Macie uses OR logic to join the values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCriteriaAdditionalProperties withNeq(String... neq) {
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
     * The value for the property doesn't match (doesn't equal) the specified value. If you specify multiple values,
     * Amazon Macie uses OR logic to join the values.
     * </p>
     * 
     * @param neq
     *        The value for the property doesn't match (doesn't equal) the specified value. If you specify multiple
     *        values, Amazon Macie uses OR logic to join the values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCriteriaAdditionalProperties withNeq(java.util.Collection<String> neq) {
        setNeq(neq);
        return this;
    }

    /**
     * <p>
     * The name of the bucket begins with the specified value.
     * </p>
     * 
     * @param prefix
     *        The name of the bucket begins with the specified value.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The name of the bucket begins with the specified value.
     * </p>
     * 
     * @return The name of the bucket begins with the specified value.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The name of the bucket begins with the specified value.
     * </p>
     * 
     * @param prefix
     *        The name of the bucket begins with the specified value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCriteriaAdditionalProperties withPrefix(String prefix) {
        setPrefix(prefix);
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
        if (getGt() != null)
            sb.append("Gt: ").append(getGt()).append(",");
        if (getGte() != null)
            sb.append("Gte: ").append(getGte()).append(",");
        if (getLt() != null)
            sb.append("Lt: ").append(getLt()).append(",");
        if (getLte() != null)
            sb.append("Lte: ").append(getLte()).append(",");
        if (getNeq() != null)
            sb.append("Neq: ").append(getNeq()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketCriteriaAdditionalProperties == false)
            return false;
        BucketCriteriaAdditionalProperties other = (BucketCriteriaAdditionalProperties) obj;
        if (other.getEq() == null ^ this.getEq() == null)
            return false;
        if (other.getEq() != null && other.getEq().equals(this.getEq()) == false)
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
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEq() == null) ? 0 : getEq().hashCode());
        hashCode = prime * hashCode + ((getGt() == null) ? 0 : getGt().hashCode());
        hashCode = prime * hashCode + ((getGte() == null) ? 0 : getGte().hashCode());
        hashCode = prime * hashCode + ((getLt() == null) ? 0 : getLt().hashCode());
        hashCode = prime * hashCode + ((getLte() == null) ? 0 : getLte().hashCode());
        hashCode = prime * hashCode + ((getNeq() == null) ? 0 : getNeq().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public BucketCriteriaAdditionalProperties clone() {
        try {
            return (BucketCriteriaAdditionalProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.BucketCriteriaAdditionalPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
