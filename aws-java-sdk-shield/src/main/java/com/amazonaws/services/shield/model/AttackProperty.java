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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of the described attack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/AttackProperty" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttackProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of DDoS event that was observed. <code>NETWORK</code> indicates layer 3 and layer 4 events and
     * <code>APPLICATION</code> indicates layer 7 events.
     * </p>
     */
    private String attackLayer;
    /**
     * <p>
     * Defines the DDoS attack property information that is provided.
     * </p>
     */
    private String attackPropertyIdentifier;
    /**
     * <p>
     * The array of <a>Contributor</a> objects that includes the top five contributors to an attack.
     * </p>
     */
    private java.util.List<Contributor> topContributors;
    /**
     * <p>
     * The unit of the <code>Value</code> of the contributions.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * The total contributions made to this attack by all contributors, not just the five listed in the
     * <code>TopContributors</code> list.
     * </p>
     */
    private Long total;

    /**
     * <p>
     * The type of DDoS event that was observed. <code>NETWORK</code> indicates layer 3 and layer 4 events and
     * <code>APPLICATION</code> indicates layer 7 events.
     * </p>
     * 
     * @param attackLayer
     *        The type of DDoS event that was observed. <code>NETWORK</code> indicates layer 3 and layer 4 events and
     *        <code>APPLICATION</code> indicates layer 7 events.
     * @see AttackLayer
     */

    public void setAttackLayer(String attackLayer) {
        this.attackLayer = attackLayer;
    }

    /**
     * <p>
     * The type of DDoS event that was observed. <code>NETWORK</code> indicates layer 3 and layer 4 events and
     * <code>APPLICATION</code> indicates layer 7 events.
     * </p>
     * 
     * @return The type of DDoS event that was observed. <code>NETWORK</code> indicates layer 3 and layer 4 events and
     *         <code>APPLICATION</code> indicates layer 7 events.
     * @see AttackLayer
     */

    public String getAttackLayer() {
        return this.attackLayer;
    }

    /**
     * <p>
     * The type of DDoS event that was observed. <code>NETWORK</code> indicates layer 3 and layer 4 events and
     * <code>APPLICATION</code> indicates layer 7 events.
     * </p>
     * 
     * @param attackLayer
     *        The type of DDoS event that was observed. <code>NETWORK</code> indicates layer 3 and layer 4 events and
     *        <code>APPLICATION</code> indicates layer 7 events.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttackLayer
     */

    public AttackProperty withAttackLayer(String attackLayer) {
        setAttackLayer(attackLayer);
        return this;
    }

    /**
     * <p>
     * The type of DDoS event that was observed. <code>NETWORK</code> indicates layer 3 and layer 4 events and
     * <code>APPLICATION</code> indicates layer 7 events.
     * </p>
     * 
     * @param attackLayer
     *        The type of DDoS event that was observed. <code>NETWORK</code> indicates layer 3 and layer 4 events and
     *        <code>APPLICATION</code> indicates layer 7 events.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttackLayer
     */

    public AttackProperty withAttackLayer(AttackLayer attackLayer) {
        this.attackLayer = attackLayer.toString();
        return this;
    }

    /**
     * <p>
     * Defines the DDoS attack property information that is provided.
     * </p>
     * 
     * @param attackPropertyIdentifier
     *        Defines the DDoS attack property information that is provided.
     * @see AttackPropertyIdentifier
     */

    public void setAttackPropertyIdentifier(String attackPropertyIdentifier) {
        this.attackPropertyIdentifier = attackPropertyIdentifier;
    }

    /**
     * <p>
     * Defines the DDoS attack property information that is provided.
     * </p>
     * 
     * @return Defines the DDoS attack property information that is provided.
     * @see AttackPropertyIdentifier
     */

    public String getAttackPropertyIdentifier() {
        return this.attackPropertyIdentifier;
    }

    /**
     * <p>
     * Defines the DDoS attack property information that is provided.
     * </p>
     * 
     * @param attackPropertyIdentifier
     *        Defines the DDoS attack property information that is provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttackPropertyIdentifier
     */

    public AttackProperty withAttackPropertyIdentifier(String attackPropertyIdentifier) {
        setAttackPropertyIdentifier(attackPropertyIdentifier);
        return this;
    }

    /**
     * <p>
     * Defines the DDoS attack property information that is provided.
     * </p>
     * 
     * @param attackPropertyIdentifier
     *        Defines the DDoS attack property information that is provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttackPropertyIdentifier
     */

    public AttackProperty withAttackPropertyIdentifier(AttackPropertyIdentifier attackPropertyIdentifier) {
        this.attackPropertyIdentifier = attackPropertyIdentifier.toString();
        return this;
    }

    /**
     * <p>
     * The array of <a>Contributor</a> objects that includes the top five contributors to an attack.
     * </p>
     * 
     * @return The array of <a>Contributor</a> objects that includes the top five contributors to an attack.
     */

    public java.util.List<Contributor> getTopContributors() {
        return topContributors;
    }

    /**
     * <p>
     * The array of <a>Contributor</a> objects that includes the top five contributors to an attack.
     * </p>
     * 
     * @param topContributors
     *        The array of <a>Contributor</a> objects that includes the top five contributors to an attack.
     */

    public void setTopContributors(java.util.Collection<Contributor> topContributors) {
        if (topContributors == null) {
            this.topContributors = null;
            return;
        }

        this.topContributors = new java.util.ArrayList<Contributor>(topContributors);
    }

    /**
     * <p>
     * The array of <a>Contributor</a> objects that includes the top five contributors to an attack.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopContributors(java.util.Collection)} or {@link #withTopContributors(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param topContributors
     *        The array of <a>Contributor</a> objects that includes the top five contributors to an attack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackProperty withTopContributors(Contributor... topContributors) {
        if (this.topContributors == null) {
            setTopContributors(new java.util.ArrayList<Contributor>(topContributors.length));
        }
        for (Contributor ele : topContributors) {
            this.topContributors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of <a>Contributor</a> objects that includes the top five contributors to an attack.
     * </p>
     * 
     * @param topContributors
     *        The array of <a>Contributor</a> objects that includes the top five contributors to an attack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackProperty withTopContributors(java.util.Collection<Contributor> topContributors) {
        setTopContributors(topContributors);
        return this;
    }

    /**
     * <p>
     * The unit of the <code>Value</code> of the contributions.
     * </p>
     * 
     * @param unit
     *        The unit of the <code>Value</code> of the contributions.
     * @see Unit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of the <code>Value</code> of the contributions.
     * </p>
     * 
     * @return The unit of the <code>Value</code> of the contributions.
     * @see Unit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of the <code>Value</code> of the contributions.
     * </p>
     * 
     * @param unit
     *        The unit of the <code>Value</code> of the contributions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Unit
     */

    public AttackProperty withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit of the <code>Value</code> of the contributions.
     * </p>
     * 
     * @param unit
     *        The unit of the <code>Value</code> of the contributions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Unit
     */

    public AttackProperty withUnit(Unit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * The total contributions made to this attack by all contributors, not just the five listed in the
     * <code>TopContributors</code> list.
     * </p>
     * 
     * @param total
     *        The total contributions made to this attack by all contributors, not just the five listed in the
     *        <code>TopContributors</code> list.
     */

    public void setTotal(Long total) {
        this.total = total;
    }

    /**
     * <p>
     * The total contributions made to this attack by all contributors, not just the five listed in the
     * <code>TopContributors</code> list.
     * </p>
     * 
     * @return The total contributions made to this attack by all contributors, not just the five listed in the
     *         <code>TopContributors</code> list.
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     * <p>
     * The total contributions made to this attack by all contributors, not just the five listed in the
     * <code>TopContributors</code> list.
     * </p>
     * 
     * @param total
     *        The total contributions made to this attack by all contributors, not just the five listed in the
     *        <code>TopContributors</code> list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackProperty withTotal(Long total) {
        setTotal(total);
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
        if (getAttackLayer() != null)
            sb.append("AttackLayer: ").append(getAttackLayer()).append(",");
        if (getAttackPropertyIdentifier() != null)
            sb.append("AttackPropertyIdentifier: ").append(getAttackPropertyIdentifier()).append(",");
        if (getTopContributors() != null)
            sb.append("TopContributors: ").append(getTopContributors()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttackProperty == false)
            return false;
        AttackProperty other = (AttackProperty) obj;
        if (other.getAttackLayer() == null ^ this.getAttackLayer() == null)
            return false;
        if (other.getAttackLayer() != null && other.getAttackLayer().equals(this.getAttackLayer()) == false)
            return false;
        if (other.getAttackPropertyIdentifier() == null ^ this.getAttackPropertyIdentifier() == null)
            return false;
        if (other.getAttackPropertyIdentifier() != null && other.getAttackPropertyIdentifier().equals(this.getAttackPropertyIdentifier()) == false)
            return false;
        if (other.getTopContributors() == null ^ this.getTopContributors() == null)
            return false;
        if (other.getTopContributors() != null && other.getTopContributors().equals(this.getTopContributors()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttackLayer() == null) ? 0 : getAttackLayer().hashCode());
        hashCode = prime * hashCode + ((getAttackPropertyIdentifier() == null) ? 0 : getAttackPropertyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTopContributors() == null) ? 0 : getTopContributors().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        return hashCode;
    }

    @Override
    public AttackProperty clone() {
        try {
            return (AttackProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.AttackPropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
