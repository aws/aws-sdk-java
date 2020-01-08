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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <important>
 * <p>
 * <i> <b>Cost Category is in public beta for AWS Billing and Cost Management and is subject to change. Your use of Cost
 * Categories is subject to the Beta Service Participation terms of the <a
 * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> (Section 1.10).</b> </i>
 * </p>
 * </important>
 * <p>
 * A reference to a Cost Category containing only enough information to identify the Cost Category.
 * </p>
 * <p>
 * You can use this information to retrieve the full Cost Category information using <code>DescribeCostCategory</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CostCategoryReference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CostCategoryReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for your Cost Category Reference.
     * </p>
     */
    private String costCategoryArn;

    private String name;
    /**
     * <p>
     * The Cost Category's effective start date.
     * </p>
     */
    private String effectiveStart;
    /**
     * <p>
     * The Cost Category's effective end date.
     * </p>
     */
    private String effectiveEnd;

    /**
     * <p>
     * The unique identifier for your Cost Category Reference.
     * </p>
     * 
     * @param costCategoryArn
     *        The unique identifier for your Cost Category Reference.
     */

    public void setCostCategoryArn(String costCategoryArn) {
        this.costCategoryArn = costCategoryArn;
    }

    /**
     * <p>
     * The unique identifier for your Cost Category Reference.
     * </p>
     * 
     * @return The unique identifier for your Cost Category Reference.
     */

    public String getCostCategoryArn() {
        return this.costCategoryArn;
    }

    /**
     * <p>
     * The unique identifier for your Cost Category Reference.
     * </p>
     * 
     * @param costCategoryArn
     *        The unique identifier for your Cost Category Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategoryReference withCostCategoryArn(String costCategoryArn) {
        setCostCategoryArn(costCategoryArn);
        return this;
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategoryReference withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Cost Category's effective start date.
     * </p>
     * 
     * @param effectiveStart
     *        The Cost Category's effective start date.
     */

    public void setEffectiveStart(String effectiveStart) {
        this.effectiveStart = effectiveStart;
    }

    /**
     * <p>
     * The Cost Category's effective start date.
     * </p>
     * 
     * @return The Cost Category's effective start date.
     */

    public String getEffectiveStart() {
        return this.effectiveStart;
    }

    /**
     * <p>
     * The Cost Category's effective start date.
     * </p>
     * 
     * @param effectiveStart
     *        The Cost Category's effective start date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategoryReference withEffectiveStart(String effectiveStart) {
        setEffectiveStart(effectiveStart);
        return this;
    }

    /**
     * <p>
     * The Cost Category's effective end date.
     * </p>
     * 
     * @param effectiveEnd
     *        The Cost Category's effective end date.
     */

    public void setEffectiveEnd(String effectiveEnd) {
        this.effectiveEnd = effectiveEnd;
    }

    /**
     * <p>
     * The Cost Category's effective end date.
     * </p>
     * 
     * @return The Cost Category's effective end date.
     */

    public String getEffectiveEnd() {
        return this.effectiveEnd;
    }

    /**
     * <p>
     * The Cost Category's effective end date.
     * </p>
     * 
     * @param effectiveEnd
     *        The Cost Category's effective end date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategoryReference withEffectiveEnd(String effectiveEnd) {
        setEffectiveEnd(effectiveEnd);
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
        if (getCostCategoryArn() != null)
            sb.append("CostCategoryArn: ").append(getCostCategoryArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEffectiveStart() != null)
            sb.append("EffectiveStart: ").append(getEffectiveStart()).append(",");
        if (getEffectiveEnd() != null)
            sb.append("EffectiveEnd: ").append(getEffectiveEnd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CostCategoryReference == false)
            return false;
        CostCategoryReference other = (CostCategoryReference) obj;
        if (other.getCostCategoryArn() == null ^ this.getCostCategoryArn() == null)
            return false;
        if (other.getCostCategoryArn() != null && other.getCostCategoryArn().equals(this.getCostCategoryArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEffectiveStart() == null ^ this.getEffectiveStart() == null)
            return false;
        if (other.getEffectiveStart() != null && other.getEffectiveStart().equals(this.getEffectiveStart()) == false)
            return false;
        if (other.getEffectiveEnd() == null ^ this.getEffectiveEnd() == null)
            return false;
        if (other.getEffectiveEnd() != null && other.getEffectiveEnd().equals(this.getEffectiveEnd()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCostCategoryArn() == null) ? 0 : getCostCategoryArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEffectiveStart() == null) ? 0 : getEffectiveStart().hashCode());
        hashCode = prime * hashCode + ((getEffectiveEnd() == null) ? 0 : getEffectiveEnd().hashCode());
        return hashCode;
    }

    @Override
    public CostCategoryReference clone() {
        try {
            return (CostCategoryReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.CostCategoryReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
