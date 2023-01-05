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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Use the split charge rule to split the cost of one Cost Category value across several other target values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CostCategorySplitChargeRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CostCategorySplitChargeRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Cost Category value that you want to split. That value can't be used as a source or a target in other split
     * charge rules. To indicate uncategorized costs, you can use an empty string as the source.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The Cost Category values that you want to split costs across. These values can't be used as a source in other
     * split charge rules.
     * </p>
     */
    private java.util.List<String> targets;
    /**
     * <p>
     * The method that's used to define how to split your source costs across your targets.
     * </p>
     * <p>
     * <code>Proportional</code> - Allocates charges across your targets based on the proportional weighted cost of each
     * target.
     * </p>
     * <p>
     * <code>Fixed</code> - Allocates charges across your targets based on your defined allocation percentage.
     * </p>
     * <p>
     * &gt;<code>Even</code> - Allocates costs evenly across all targets.
     * </p>
     */
    private String method;
    /**
     * <p>
     * The parameters for a split charge method. This is only required for the <code>FIXED</code> method.
     * </p>
     */
    private java.util.List<CostCategorySplitChargeRuleParameter> parameters;

    /**
     * <p>
     * The Cost Category value that you want to split. That value can't be used as a source or a target in other split
     * charge rules. To indicate uncategorized costs, you can use an empty string as the source.
     * </p>
     * 
     * @param source
     *        The Cost Category value that you want to split. That value can't be used as a source or a target in other
     *        split charge rules. To indicate uncategorized costs, you can use an empty string as the source.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The Cost Category value that you want to split. That value can't be used as a source or a target in other split
     * charge rules. To indicate uncategorized costs, you can use an empty string as the source.
     * </p>
     * 
     * @return The Cost Category value that you want to split. That value can't be used as a source or a target in other
     *         split charge rules. To indicate uncategorized costs, you can use an empty string as the source.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The Cost Category value that you want to split. That value can't be used as a source or a target in other split
     * charge rules. To indicate uncategorized costs, you can use an empty string as the source.
     * </p>
     * 
     * @param source
     *        The Cost Category value that you want to split. That value can't be used as a source or a target in other
     *        split charge rules. To indicate uncategorized costs, you can use an empty string as the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategorySplitChargeRule withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The Cost Category values that you want to split costs across. These values can't be used as a source in other
     * split charge rules.
     * </p>
     * 
     * @return The Cost Category values that you want to split costs across. These values can't be used as a source in
     *         other split charge rules.
     */

    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The Cost Category values that you want to split costs across. These values can't be used as a source in other
     * split charge rules.
     * </p>
     * 
     * @param targets
     *        The Cost Category values that you want to split costs across. These values can't be used as a source in
     *        other split charge rules.
     */

    public void setTargets(java.util.Collection<String> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<String>(targets);
    }

    /**
     * <p>
     * The Cost Category values that you want to split costs across. These values can't be used as a source in other
     * split charge rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The Cost Category values that you want to split costs across. These values can't be used as a source in
     *        other split charge rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategorySplitChargeRule withTargets(String... targets) {
        if (this.targets == null) {
            setTargets(new java.util.ArrayList<String>(targets.length));
        }
        for (String ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Cost Category values that you want to split costs across. These values can't be used as a source in other
     * split charge rules.
     * </p>
     * 
     * @param targets
     *        The Cost Category values that you want to split costs across. These values can't be used as a source in
     *        other split charge rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategorySplitChargeRule withTargets(java.util.Collection<String> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The method that's used to define how to split your source costs across your targets.
     * </p>
     * <p>
     * <code>Proportional</code> - Allocates charges across your targets based on the proportional weighted cost of each
     * target.
     * </p>
     * <p>
     * <code>Fixed</code> - Allocates charges across your targets based on your defined allocation percentage.
     * </p>
     * <p>
     * &gt;<code>Even</code> - Allocates costs evenly across all targets.
     * </p>
     * 
     * @param method
     *        The method that's used to define how to split your source costs across your targets. </p>
     *        <p>
     *        <code>Proportional</code> - Allocates charges across your targets based on the proportional weighted cost
     *        of each target.
     *        </p>
     *        <p>
     *        <code>Fixed</code> - Allocates charges across your targets based on your defined allocation percentage.
     *        </p>
     *        <p>
     *        &gt;<code>Even</code> - Allocates costs evenly across all targets.
     * @see CostCategorySplitChargeMethod
     */

    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * <p>
     * The method that's used to define how to split your source costs across your targets.
     * </p>
     * <p>
     * <code>Proportional</code> - Allocates charges across your targets based on the proportional weighted cost of each
     * target.
     * </p>
     * <p>
     * <code>Fixed</code> - Allocates charges across your targets based on your defined allocation percentage.
     * </p>
     * <p>
     * &gt;<code>Even</code> - Allocates costs evenly across all targets.
     * </p>
     * 
     * @return The method that's used to define how to split your source costs across your targets. </p>
     *         <p>
     *         <code>Proportional</code> - Allocates charges across your targets based on the proportional weighted cost
     *         of each target.
     *         </p>
     *         <p>
     *         <code>Fixed</code> - Allocates charges across your targets based on your defined allocation percentage.
     *         </p>
     *         <p>
     *         &gt;<code>Even</code> - Allocates costs evenly across all targets.
     * @see CostCategorySplitChargeMethod
     */

    public String getMethod() {
        return this.method;
    }

    /**
     * <p>
     * The method that's used to define how to split your source costs across your targets.
     * </p>
     * <p>
     * <code>Proportional</code> - Allocates charges across your targets based on the proportional weighted cost of each
     * target.
     * </p>
     * <p>
     * <code>Fixed</code> - Allocates charges across your targets based on your defined allocation percentage.
     * </p>
     * <p>
     * &gt;<code>Even</code> - Allocates costs evenly across all targets.
     * </p>
     * 
     * @param method
     *        The method that's used to define how to split your source costs across your targets. </p>
     *        <p>
     *        <code>Proportional</code> - Allocates charges across your targets based on the proportional weighted cost
     *        of each target.
     *        </p>
     *        <p>
     *        <code>Fixed</code> - Allocates charges across your targets based on your defined allocation percentage.
     *        </p>
     *        <p>
     *        &gt;<code>Even</code> - Allocates costs evenly across all targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostCategorySplitChargeMethod
     */

    public CostCategorySplitChargeRule withMethod(String method) {
        setMethod(method);
        return this;
    }

    /**
     * <p>
     * The method that's used to define how to split your source costs across your targets.
     * </p>
     * <p>
     * <code>Proportional</code> - Allocates charges across your targets based on the proportional weighted cost of each
     * target.
     * </p>
     * <p>
     * <code>Fixed</code> - Allocates charges across your targets based on your defined allocation percentage.
     * </p>
     * <p>
     * &gt;<code>Even</code> - Allocates costs evenly across all targets.
     * </p>
     * 
     * @param method
     *        The method that's used to define how to split your source costs across your targets. </p>
     *        <p>
     *        <code>Proportional</code> - Allocates charges across your targets based on the proportional weighted cost
     *        of each target.
     *        </p>
     *        <p>
     *        <code>Fixed</code> - Allocates charges across your targets based on your defined allocation percentage.
     *        </p>
     *        <p>
     *        &gt;<code>Even</code> - Allocates costs evenly across all targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostCategorySplitChargeMethod
     */

    public CostCategorySplitChargeRule withMethod(CostCategorySplitChargeMethod method) {
        this.method = method.toString();
        return this;
    }

    /**
     * <p>
     * The parameters for a split charge method. This is only required for the <code>FIXED</code> method.
     * </p>
     * 
     * @return The parameters for a split charge method. This is only required for the <code>FIXED</code> method.
     */

    public java.util.List<CostCategorySplitChargeRuleParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters for a split charge method. This is only required for the <code>FIXED</code> method.
     * </p>
     * 
     * @param parameters
     *        The parameters for a split charge method. This is only required for the <code>FIXED</code> method.
     */

    public void setParameters(java.util.Collection<CostCategorySplitChargeRuleParameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<CostCategorySplitChargeRuleParameter>(parameters);
    }

    /**
     * <p>
     * The parameters for a split charge method. This is only required for the <code>FIXED</code> method.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        The parameters for a split charge method. This is only required for the <code>FIXED</code> method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategorySplitChargeRule withParameters(CostCategorySplitChargeRuleParameter... parameters) {
        if (this.parameters == null) {
            setParameters(new java.util.ArrayList<CostCategorySplitChargeRuleParameter>(parameters.length));
        }
        for (CostCategorySplitChargeRuleParameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The parameters for a split charge method. This is only required for the <code>FIXED</code> method.
     * </p>
     * 
     * @param parameters
     *        The parameters for a split charge method. This is only required for the <code>FIXED</code> method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategorySplitChargeRule withParameters(java.util.Collection<CostCategorySplitChargeRuleParameter> parameters) {
        setParameters(parameters);
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getMethod() != null)
            sb.append("Method: ").append(getMethod()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CostCategorySplitChargeRule == false)
            return false;
        CostCategorySplitChargeRule other = (CostCategorySplitChargeRule) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getMethod() == null ^ this.getMethod() == null)
            return false;
        if (other.getMethod() != null && other.getMethod().equals(this.getMethod()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getMethod() == null) ? 0 : getMethod().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public CostCategorySplitChargeRule clone() {
        try {
            return (CostCategorySplitChargeRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.CostCategorySplitChargeRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
