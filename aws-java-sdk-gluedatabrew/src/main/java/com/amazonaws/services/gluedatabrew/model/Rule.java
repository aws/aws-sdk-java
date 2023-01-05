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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a single data quality requirement that should be validated in the scope of this dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/Rule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Rule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A value that specifies whether the rule is disabled. Once a rule is disabled, a profile job will not validate it
     * during a job run. Default value is false.
     * </p>
     */
    private Boolean disabled;
    /**
     * <p>
     * The expression which includes column references, condition names followed by variable references, possibly
     * grouped and combined with other conditions. For example,
     * <code>(:col1 starts_with :prefix1 or :col1 starts_with :prefix2) and (:col1 ends_with :suffix1 or :col1 ends_with :suffix2)</code>
     * . Column and value references are substitution variables that should start with the ':' symbol. Depending on the
     * context, substitution variables' values can be either an actual value or a column name. These values are defined
     * in the SubstitutionMap. If a CheckExpression starts with a column reference, then ColumnSelectors in the rule
     * should be null. If ColumnSelectors has been defined, then there should be no column reference in the left side of
     * a condition, for example, <code>is_between :val1 and :val2</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/databrew/latest/dg/profile.data-quality-available-checks.html">Available
     * checks</a>
     * </p>
     */
    private String checkExpression;
    /**
     * <p>
     * The map of substitution variable names to their values used in a check expression. Variable names should start
     * with a ':' (colon). Variable values can either be actual values or column names. To differentiate between the
     * two, column names should be enclosed in backticks, for example, <code>":col1": "`Column A`".</code>
     * </p>
     */
    private java.util.Map<String, String> substitutionMap;
    /**
     * <p>
     * The threshold used with a non-aggregate check expression. Non-aggregate check expressions will be applied to each
     * row in a specific column, and the threshold will be used to determine whether the validation succeeds.
     * </p>
     */
    private Threshold threshold;
    /**
     * <p>
     * List of column selectors. Selectors can be used to select columns using a name or regular expression from the
     * dataset. Rule will be applied to selected columns.
     * </p>
     */
    private java.util.List<ColumnSelector> columnSelectors;

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param name
     *        The name of the rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @return The name of the rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param name
     *        The name of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether the rule is disabled. Once a rule is disabled, a profile job will not validate it
     * during a job run. Default value is false.
     * </p>
     * 
     * @param disabled
     *        A value that specifies whether the rule is disabled. Once a rule is disabled, a profile job will not
     *        validate it during a job run. Default value is false.
     */

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * <p>
     * A value that specifies whether the rule is disabled. Once a rule is disabled, a profile job will not validate it
     * during a job run. Default value is false.
     * </p>
     * 
     * @return A value that specifies whether the rule is disabled. Once a rule is disabled, a profile job will not
     *         validate it during a job run. Default value is false.
     */

    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * A value that specifies whether the rule is disabled. Once a rule is disabled, a profile job will not validate it
     * during a job run. Default value is false.
     * </p>
     * 
     * @param disabled
     *        A value that specifies whether the rule is disabled. Once a rule is disabled, a profile job will not
     *        validate it during a job run. Default value is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withDisabled(Boolean disabled) {
        setDisabled(disabled);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether the rule is disabled. Once a rule is disabled, a profile job will not validate it
     * during a job run. Default value is false.
     * </p>
     * 
     * @return A value that specifies whether the rule is disabled. Once a rule is disabled, a profile job will not
     *         validate it during a job run. Default value is false.
     */

    public Boolean isDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * The expression which includes column references, condition names followed by variable references, possibly
     * grouped and combined with other conditions. For example,
     * <code>(:col1 starts_with :prefix1 or :col1 starts_with :prefix2) and (:col1 ends_with :suffix1 or :col1 ends_with :suffix2)</code>
     * . Column and value references are substitution variables that should start with the ':' symbol. Depending on the
     * context, substitution variables' values can be either an actual value or a column name. These values are defined
     * in the SubstitutionMap. If a CheckExpression starts with a column reference, then ColumnSelectors in the rule
     * should be null. If ColumnSelectors has been defined, then there should be no column reference in the left side of
     * a condition, for example, <code>is_between :val1 and :val2</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/databrew/latest/dg/profile.data-quality-available-checks.html">Available
     * checks</a>
     * </p>
     * 
     * @param checkExpression
     *        The expression which includes column references, condition names followed by variable references, possibly
     *        grouped and combined with other conditions. For example,
     *        <code>(:col1 starts_with :prefix1 or :col1 starts_with :prefix2) and (:col1 ends_with :suffix1 or :col1 ends_with :suffix2)</code>
     *        . Column and value references are substitution variables that should start with the ':' symbol. Depending
     *        on the context, substitution variables' values can be either an actual value or a column name. These
     *        values are defined in the SubstitutionMap. If a CheckExpression starts with a column reference, then
     *        ColumnSelectors in the rule should be null. If ColumnSelectors has been defined, then there should be no
     *        column reference in the left side of a condition, for example, <code>is_between :val1 and :val2</code>
     *        .</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/databrew/latest/dg/profile.data-quality-available-checks.html">Available
     *        checks</a>
     */

    public void setCheckExpression(String checkExpression) {
        this.checkExpression = checkExpression;
    }

    /**
     * <p>
     * The expression which includes column references, condition names followed by variable references, possibly
     * grouped and combined with other conditions. For example,
     * <code>(:col1 starts_with :prefix1 or :col1 starts_with :prefix2) and (:col1 ends_with :suffix1 or :col1 ends_with :suffix2)</code>
     * . Column and value references are substitution variables that should start with the ':' symbol. Depending on the
     * context, substitution variables' values can be either an actual value or a column name. These values are defined
     * in the SubstitutionMap. If a CheckExpression starts with a column reference, then ColumnSelectors in the rule
     * should be null. If ColumnSelectors has been defined, then there should be no column reference in the left side of
     * a condition, for example, <code>is_between :val1 and :val2</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/databrew/latest/dg/profile.data-quality-available-checks.html">Available
     * checks</a>
     * </p>
     * 
     * @return The expression which includes column references, condition names followed by variable references,
     *         possibly grouped and combined with other conditions. For example,
     *         <code>(:col1 starts_with :prefix1 or :col1 starts_with :prefix2) and (:col1 ends_with :suffix1 or :col1 ends_with :suffix2)</code>
     *         . Column and value references are substitution variables that should start with the ':' symbol. Depending
     *         on the context, substitution variables' values can be either an actual value or a column name. These
     *         values are defined in the SubstitutionMap. If a CheckExpression starts with a column reference, then
     *         ColumnSelectors in the rule should be null. If ColumnSelectors has been defined, then there should be no
     *         column reference in the left side of a condition, for example, <code>is_between :val1 and :val2</code>
     *         .</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/databrew/latest/dg/profile.data-quality-available-checks.html"
     *         >Available checks</a>
     */

    public String getCheckExpression() {
        return this.checkExpression;
    }

    /**
     * <p>
     * The expression which includes column references, condition names followed by variable references, possibly
     * grouped and combined with other conditions. For example,
     * <code>(:col1 starts_with :prefix1 or :col1 starts_with :prefix2) and (:col1 ends_with :suffix1 or :col1 ends_with :suffix2)</code>
     * . Column and value references are substitution variables that should start with the ':' symbol. Depending on the
     * context, substitution variables' values can be either an actual value or a column name. These values are defined
     * in the SubstitutionMap. If a CheckExpression starts with a column reference, then ColumnSelectors in the rule
     * should be null. If ColumnSelectors has been defined, then there should be no column reference in the left side of
     * a condition, for example, <code>is_between :val1 and :val2</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/databrew/latest/dg/profile.data-quality-available-checks.html">Available
     * checks</a>
     * </p>
     * 
     * @param checkExpression
     *        The expression which includes column references, condition names followed by variable references, possibly
     *        grouped and combined with other conditions. For example,
     *        <code>(:col1 starts_with :prefix1 or :col1 starts_with :prefix2) and (:col1 ends_with :suffix1 or :col1 ends_with :suffix2)</code>
     *        . Column and value references are substitution variables that should start with the ':' symbol. Depending
     *        on the context, substitution variables' values can be either an actual value or a column name. These
     *        values are defined in the SubstitutionMap. If a CheckExpression starts with a column reference, then
     *        ColumnSelectors in the rule should be null. If ColumnSelectors has been defined, then there should be no
     *        column reference in the left side of a condition, for example, <code>is_between :val1 and :val2</code>
     *        .</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/databrew/latest/dg/profile.data-quality-available-checks.html">Available
     *        checks</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withCheckExpression(String checkExpression) {
        setCheckExpression(checkExpression);
        return this;
    }

    /**
     * <p>
     * The map of substitution variable names to their values used in a check expression. Variable names should start
     * with a ':' (colon). Variable values can either be actual values or column names. To differentiate between the
     * two, column names should be enclosed in backticks, for example, <code>":col1": "`Column A`".</code>
     * </p>
     * 
     * @return The map of substitution variable names to their values used in a check expression. Variable names should
     *         start with a ':' (colon). Variable values can either be actual values or column names. To differentiate
     *         between the two, column names should be enclosed in backticks, for example,
     *         <code>":col1": "`Column A`".</code>
     */

    public java.util.Map<String, String> getSubstitutionMap() {
        return substitutionMap;
    }

    /**
     * <p>
     * The map of substitution variable names to their values used in a check expression. Variable names should start
     * with a ':' (colon). Variable values can either be actual values or column names. To differentiate between the
     * two, column names should be enclosed in backticks, for example, <code>":col1": "`Column A`".</code>
     * </p>
     * 
     * @param substitutionMap
     *        The map of substitution variable names to their values used in a check expression. Variable names should
     *        start with a ':' (colon). Variable values can either be actual values or column names. To differentiate
     *        between the two, column names should be enclosed in backticks, for example,
     *        <code>":col1": "`Column A`".</code>
     */

    public void setSubstitutionMap(java.util.Map<String, String> substitutionMap) {
        this.substitutionMap = substitutionMap;
    }

    /**
     * <p>
     * The map of substitution variable names to their values used in a check expression. Variable names should start
     * with a ':' (colon). Variable values can either be actual values or column names. To differentiate between the
     * two, column names should be enclosed in backticks, for example, <code>":col1": "`Column A`".</code>
     * </p>
     * 
     * @param substitutionMap
     *        The map of substitution variable names to their values used in a check expression. Variable names should
     *        start with a ':' (colon). Variable values can either be actual values or column names. To differentiate
     *        between the two, column names should be enclosed in backticks, for example,
     *        <code>":col1": "`Column A`".</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withSubstitutionMap(java.util.Map<String, String> substitutionMap) {
        setSubstitutionMap(substitutionMap);
        return this;
    }

    /**
     * Add a single SubstitutionMap entry
     *
     * @see Rule#withSubstitutionMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Rule addSubstitutionMapEntry(String key, String value) {
        if (null == this.substitutionMap) {
            this.substitutionMap = new java.util.HashMap<String, String>();
        }
        if (this.substitutionMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.substitutionMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SubstitutionMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule clearSubstitutionMapEntries() {
        this.substitutionMap = null;
        return this;
    }

    /**
     * <p>
     * The threshold used with a non-aggregate check expression. Non-aggregate check expressions will be applied to each
     * row in a specific column, and the threshold will be used to determine whether the validation succeeds.
     * </p>
     * 
     * @param threshold
     *        The threshold used with a non-aggregate check expression. Non-aggregate check expressions will be applied
     *        to each row in a specific column, and the threshold will be used to determine whether the validation
     *        succeeds.
     */

    public void setThreshold(Threshold threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The threshold used with a non-aggregate check expression. Non-aggregate check expressions will be applied to each
     * row in a specific column, and the threshold will be used to determine whether the validation succeeds.
     * </p>
     * 
     * @return The threshold used with a non-aggregate check expression. Non-aggregate check expressions will be applied
     *         to each row in a specific column, and the threshold will be used to determine whether the validation
     *         succeeds.
     */

    public Threshold getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * The threshold used with a non-aggregate check expression. Non-aggregate check expressions will be applied to each
     * row in a specific column, and the threshold will be used to determine whether the validation succeeds.
     * </p>
     * 
     * @param threshold
     *        The threshold used with a non-aggregate check expression. Non-aggregate check expressions will be applied
     *        to each row in a specific column, and the threshold will be used to determine whether the validation
     *        succeeds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withThreshold(Threshold threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * List of column selectors. Selectors can be used to select columns using a name or regular expression from the
     * dataset. Rule will be applied to selected columns.
     * </p>
     * 
     * @return List of column selectors. Selectors can be used to select columns using a name or regular expression from
     *         the dataset. Rule will be applied to selected columns.
     */

    public java.util.List<ColumnSelector> getColumnSelectors() {
        return columnSelectors;
    }

    /**
     * <p>
     * List of column selectors. Selectors can be used to select columns using a name or regular expression from the
     * dataset. Rule will be applied to selected columns.
     * </p>
     * 
     * @param columnSelectors
     *        List of column selectors. Selectors can be used to select columns using a name or regular expression from
     *        the dataset. Rule will be applied to selected columns.
     */

    public void setColumnSelectors(java.util.Collection<ColumnSelector> columnSelectors) {
        if (columnSelectors == null) {
            this.columnSelectors = null;
            return;
        }

        this.columnSelectors = new java.util.ArrayList<ColumnSelector>(columnSelectors);
    }

    /**
     * <p>
     * List of column selectors. Selectors can be used to select columns using a name or regular expression from the
     * dataset. Rule will be applied to selected columns.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnSelectors(java.util.Collection)} or {@link #withColumnSelectors(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param columnSelectors
     *        List of column selectors. Selectors can be used to select columns using a name or regular expression from
     *        the dataset. Rule will be applied to selected columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withColumnSelectors(ColumnSelector... columnSelectors) {
        if (this.columnSelectors == null) {
            setColumnSelectors(new java.util.ArrayList<ColumnSelector>(columnSelectors.length));
        }
        for (ColumnSelector ele : columnSelectors) {
            this.columnSelectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of column selectors. Selectors can be used to select columns using a name or regular expression from the
     * dataset. Rule will be applied to selected columns.
     * </p>
     * 
     * @param columnSelectors
     *        List of column selectors. Selectors can be used to select columns using a name or regular expression from
     *        the dataset. Rule will be applied to selected columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withColumnSelectors(java.util.Collection<ColumnSelector> columnSelectors) {
        setColumnSelectors(columnSelectors);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDisabled() != null)
            sb.append("Disabled: ").append(getDisabled()).append(",");
        if (getCheckExpression() != null)
            sb.append("CheckExpression: ").append(getCheckExpression()).append(",");
        if (getSubstitutionMap() != null)
            sb.append("SubstitutionMap: ").append(getSubstitutionMap()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold()).append(",");
        if (getColumnSelectors() != null)
            sb.append("ColumnSelectors: ").append(getColumnSelectors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Rule == false)
            return false;
        Rule other = (Rule) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDisabled() == null ^ this.getDisabled() == null)
            return false;
        if (other.getDisabled() != null && other.getDisabled().equals(this.getDisabled()) == false)
            return false;
        if (other.getCheckExpression() == null ^ this.getCheckExpression() == null)
            return false;
        if (other.getCheckExpression() != null && other.getCheckExpression().equals(this.getCheckExpression()) == false)
            return false;
        if (other.getSubstitutionMap() == null ^ this.getSubstitutionMap() == null)
            return false;
        if (other.getSubstitutionMap() != null && other.getSubstitutionMap().equals(this.getSubstitutionMap()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getColumnSelectors() == null ^ this.getColumnSelectors() == null)
            return false;
        if (other.getColumnSelectors() != null && other.getColumnSelectors().equals(this.getColumnSelectors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        hashCode = prime * hashCode + ((getCheckExpression() == null) ? 0 : getCheckExpression().hashCode());
        hashCode = prime * hashCode + ((getSubstitutionMap() == null) ? 0 : getSubstitutionMap().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getColumnSelectors() == null) ? 0 : getColumnSelectors().hashCode());
        return hashCode;
    }

    @Override
    public Rule clone() {
        try {
            return (Rule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.RuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
