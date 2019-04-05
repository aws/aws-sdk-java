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
 * The attack information for the specified SubResource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/SubResourceSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubResourceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>SubResource</code> type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The unique identifier (ID) of the <code>SubResource</code>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The list of attack types and associated counters.
     * </p>
     */
    private java.util.List<SummarizedAttackVector> attackVectors;
    /**
     * <p>
     * The counters that describe the details of the attack.
     * </p>
     */
    private java.util.List<SummarizedCounter> counters;

    /**
     * <p>
     * The <code>SubResource</code> type.
     * </p>
     * 
     * @param type
     *        The <code>SubResource</code> type.
     * @see SubResourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The <code>SubResource</code> type.
     * </p>
     * 
     * @return The <code>SubResource</code> type.
     * @see SubResourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The <code>SubResource</code> type.
     * </p>
     * 
     * @param type
     *        The <code>SubResource</code> type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubResourceType
     */

    public SubResourceSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The <code>SubResource</code> type.
     * </p>
     * 
     * @param type
     *        The <code>SubResource</code> type.
     * @see SubResourceType
     */

    public void setType(SubResourceType type) {
        withType(type);
    }

    /**
     * <p>
     * The <code>SubResource</code> type.
     * </p>
     * 
     * @param type
     *        The <code>SubResource</code> type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubResourceType
     */

    public SubResourceSummary withType(SubResourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier (ID) of the <code>SubResource</code>.
     * </p>
     * 
     * @param id
     *        The unique identifier (ID) of the <code>SubResource</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier (ID) of the <code>SubResource</code>.
     * </p>
     * 
     * @return The unique identifier (ID) of the <code>SubResource</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier (ID) of the <code>SubResource</code>.
     * </p>
     * 
     * @param id
     *        The unique identifier (ID) of the <code>SubResource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubResourceSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The list of attack types and associated counters.
     * </p>
     * 
     * @return The list of attack types and associated counters.
     */

    public java.util.List<SummarizedAttackVector> getAttackVectors() {
        return attackVectors;
    }

    /**
     * <p>
     * The list of attack types and associated counters.
     * </p>
     * 
     * @param attackVectors
     *        The list of attack types and associated counters.
     */

    public void setAttackVectors(java.util.Collection<SummarizedAttackVector> attackVectors) {
        if (attackVectors == null) {
            this.attackVectors = null;
            return;
        }

        this.attackVectors = new java.util.ArrayList<SummarizedAttackVector>(attackVectors);
    }

    /**
     * <p>
     * The list of attack types and associated counters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttackVectors(java.util.Collection)} or {@link #withAttackVectors(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param attackVectors
     *        The list of attack types and associated counters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubResourceSummary withAttackVectors(SummarizedAttackVector... attackVectors) {
        if (this.attackVectors == null) {
            setAttackVectors(new java.util.ArrayList<SummarizedAttackVector>(attackVectors.length));
        }
        for (SummarizedAttackVector ele : attackVectors) {
            this.attackVectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of attack types and associated counters.
     * </p>
     * 
     * @param attackVectors
     *        The list of attack types and associated counters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubResourceSummary withAttackVectors(java.util.Collection<SummarizedAttackVector> attackVectors) {
        setAttackVectors(attackVectors);
        return this;
    }

    /**
     * <p>
     * The counters that describe the details of the attack.
     * </p>
     * 
     * @return The counters that describe the details of the attack.
     */

    public java.util.List<SummarizedCounter> getCounters() {
        return counters;
    }

    /**
     * <p>
     * The counters that describe the details of the attack.
     * </p>
     * 
     * @param counters
     *        The counters that describe the details of the attack.
     */

    public void setCounters(java.util.Collection<SummarizedCounter> counters) {
        if (counters == null) {
            this.counters = null;
            return;
        }

        this.counters = new java.util.ArrayList<SummarizedCounter>(counters);
    }

    /**
     * <p>
     * The counters that describe the details of the attack.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCounters(java.util.Collection)} or {@link #withCounters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param counters
     *        The counters that describe the details of the attack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubResourceSummary withCounters(SummarizedCounter... counters) {
        if (this.counters == null) {
            setCounters(new java.util.ArrayList<SummarizedCounter>(counters.length));
        }
        for (SummarizedCounter ele : counters) {
            this.counters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The counters that describe the details of the attack.
     * </p>
     * 
     * @param counters
     *        The counters that describe the details of the attack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubResourceSummary withCounters(java.util.Collection<SummarizedCounter> counters) {
        setCounters(counters);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getAttackVectors() != null)
            sb.append("AttackVectors: ").append(getAttackVectors()).append(",");
        if (getCounters() != null)
            sb.append("Counters: ").append(getCounters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubResourceSummary == false)
            return false;
        SubResourceSummary other = (SubResourceSummary) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getAttackVectors() == null ^ this.getAttackVectors() == null)
            return false;
        if (other.getAttackVectors() != null && other.getAttackVectors().equals(this.getAttackVectors()) == false)
            return false;
        if (other.getCounters() == null ^ this.getCounters() == null)
            return false;
        if (other.getCounters() != null && other.getCounters().equals(this.getCounters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getAttackVectors() == null) ? 0 : getAttackVectors().hashCode());
        hashCode = prime * hashCode + ((getCounters() == null) ? 0 : getCounters().hashCode());
        return hashCode;
    }

    @Override
    public SubResourceSummary clone() {
        try {
            return (SubResourceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.SubResourceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
