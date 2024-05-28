/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A type of analysis rule that enables query structure and specified queries that produce aggregate statistics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/AnalysisRuleAggregation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisRuleAggregation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The columns that query runners are allowed to use in aggregation queries.
     * </p>
     */
    private java.util.List<AggregateColumn> aggregateColumns;
    /**
     * <p>
     * Columns in configured table that can be used in join statements and/or as aggregate columns. They can never be
     * outputted directly.
     * </p>
     */
    private java.util.List<String> joinColumns;
    /**
     * <p>
     * Control that requires member who runs query to do a join with their configured table and/or other configured
     * table in query.
     * </p>
     */
    private String joinRequired;
    /**
     * <p>
     * Which logical operators (if any) are to be used in an INNER JOIN match condition. Default is <code>AND</code>.
     * </p>
     */
    private java.util.List<String> allowedJoinOperators;
    /**
     * <p>
     * The columns that query runners are allowed to select, group by, or filter by.
     * </p>
     */
    private java.util.List<String> dimensionColumns;
    /**
     * <p>
     * Set of scalar functions that are allowed to be used on dimension columns and the output of aggregation of
     * metrics.
     * </p>
     */
    private java.util.List<String> scalarFunctions;
    /**
     * <p>
     * Columns that must meet a specific threshold value (after an aggregation function is applied to it) for each
     * output row to be returned.
     * </p>
     */
    private java.util.List<AggregationConstraint> outputConstraints;

    /**
     * <p>
     * The columns that query runners are allowed to use in aggregation queries.
     * </p>
     * 
     * @return The columns that query runners are allowed to use in aggregation queries.
     */

    public java.util.List<AggregateColumn> getAggregateColumns() {
        return aggregateColumns;
    }

    /**
     * <p>
     * The columns that query runners are allowed to use in aggregation queries.
     * </p>
     * 
     * @param aggregateColumns
     *        The columns that query runners are allowed to use in aggregation queries.
     */

    public void setAggregateColumns(java.util.Collection<AggregateColumn> aggregateColumns) {
        if (aggregateColumns == null) {
            this.aggregateColumns = null;
            return;
        }

        this.aggregateColumns = new java.util.ArrayList<AggregateColumn>(aggregateColumns);
    }

    /**
     * <p>
     * The columns that query runners are allowed to use in aggregation queries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggregateColumns(java.util.Collection)} or {@link #withAggregateColumns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param aggregateColumns
     *        The columns that query runners are allowed to use in aggregation queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleAggregation withAggregateColumns(AggregateColumn... aggregateColumns) {
        if (this.aggregateColumns == null) {
            setAggregateColumns(new java.util.ArrayList<AggregateColumn>(aggregateColumns.length));
        }
        for (AggregateColumn ele : aggregateColumns) {
            this.aggregateColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The columns that query runners are allowed to use in aggregation queries.
     * </p>
     * 
     * @param aggregateColumns
     *        The columns that query runners are allowed to use in aggregation queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleAggregation withAggregateColumns(java.util.Collection<AggregateColumn> aggregateColumns) {
        setAggregateColumns(aggregateColumns);
        return this;
    }

    /**
     * <p>
     * Columns in configured table that can be used in join statements and/or as aggregate columns. They can never be
     * outputted directly.
     * </p>
     * 
     * @return Columns in configured table that can be used in join statements and/or as aggregate columns. They can
     *         never be outputted directly.
     */

    public java.util.List<String> getJoinColumns() {
        return joinColumns;
    }

    /**
     * <p>
     * Columns in configured table that can be used in join statements and/or as aggregate columns. They can never be
     * outputted directly.
     * </p>
     * 
     * @param joinColumns
     *        Columns in configured table that can be used in join statements and/or as aggregate columns. They can
     *        never be outputted directly.
     */

    public void setJoinColumns(java.util.Collection<String> joinColumns) {
        if (joinColumns == null) {
            this.joinColumns = null;
            return;
        }

        this.joinColumns = new java.util.ArrayList<String>(joinColumns);
    }

    /**
     * <p>
     * Columns in configured table that can be used in join statements and/or as aggregate columns. They can never be
     * outputted directly.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJoinColumns(java.util.Collection)} or {@link #withJoinColumns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param joinColumns
     *        Columns in configured table that can be used in join statements and/or as aggregate columns. They can
     *        never be outputted directly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleAggregation withJoinColumns(String... joinColumns) {
        if (this.joinColumns == null) {
            setJoinColumns(new java.util.ArrayList<String>(joinColumns.length));
        }
        for (String ele : joinColumns) {
            this.joinColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Columns in configured table that can be used in join statements and/or as aggregate columns. They can never be
     * outputted directly.
     * </p>
     * 
     * @param joinColumns
     *        Columns in configured table that can be used in join statements and/or as aggregate columns. They can
     *        never be outputted directly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleAggregation withJoinColumns(java.util.Collection<String> joinColumns) {
        setJoinColumns(joinColumns);
        return this;
    }

    /**
     * <p>
     * Control that requires member who runs query to do a join with their configured table and/or other configured
     * table in query.
     * </p>
     * 
     * @param joinRequired
     *        Control that requires member who runs query to do a join with their configured table and/or other
     *        configured table in query.
     * @see JoinRequiredOption
     */

    public void setJoinRequired(String joinRequired) {
        this.joinRequired = joinRequired;
    }

    /**
     * <p>
     * Control that requires member who runs query to do a join with their configured table and/or other configured
     * table in query.
     * </p>
     * 
     * @return Control that requires member who runs query to do a join with their configured table and/or other
     *         configured table in query.
     * @see JoinRequiredOption
     */

    public String getJoinRequired() {
        return this.joinRequired;
    }

    /**
     * <p>
     * Control that requires member who runs query to do a join with their configured table and/or other configured
     * table in query.
     * </p>
     * 
     * @param joinRequired
     *        Control that requires member who runs query to do a join with their configured table and/or other
     *        configured table in query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JoinRequiredOption
     */

    public AnalysisRuleAggregation withJoinRequired(String joinRequired) {
        setJoinRequired(joinRequired);
        return this;
    }

    /**
     * <p>
     * Control that requires member who runs query to do a join with their configured table and/or other configured
     * table in query.
     * </p>
     * 
     * @param joinRequired
     *        Control that requires member who runs query to do a join with their configured table and/or other
     *        configured table in query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JoinRequiredOption
     */

    public AnalysisRuleAggregation withJoinRequired(JoinRequiredOption joinRequired) {
        this.joinRequired = joinRequired.toString();
        return this;
    }

    /**
     * <p>
     * Which logical operators (if any) are to be used in an INNER JOIN match condition. Default is <code>AND</code>.
     * </p>
     * 
     * @return Which logical operators (if any) are to be used in an INNER JOIN match condition. Default is
     *         <code>AND</code>.
     * @see JoinOperator
     */

    public java.util.List<String> getAllowedJoinOperators() {
        return allowedJoinOperators;
    }

    /**
     * <p>
     * Which logical operators (if any) are to be used in an INNER JOIN match condition. Default is <code>AND</code>.
     * </p>
     * 
     * @param allowedJoinOperators
     *        Which logical operators (if any) are to be used in an INNER JOIN match condition. Default is
     *        <code>AND</code>.
     * @see JoinOperator
     */

    public void setAllowedJoinOperators(java.util.Collection<String> allowedJoinOperators) {
        if (allowedJoinOperators == null) {
            this.allowedJoinOperators = null;
            return;
        }

        this.allowedJoinOperators = new java.util.ArrayList<String>(allowedJoinOperators);
    }

    /**
     * <p>
     * Which logical operators (if any) are to be used in an INNER JOIN match condition. Default is <code>AND</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedJoinOperators(java.util.Collection)} or {@link #withAllowedJoinOperators(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param allowedJoinOperators
     *        Which logical operators (if any) are to be used in an INNER JOIN match condition. Default is
     *        <code>AND</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JoinOperator
     */

    public AnalysisRuleAggregation withAllowedJoinOperators(String... allowedJoinOperators) {
        if (this.allowedJoinOperators == null) {
            setAllowedJoinOperators(new java.util.ArrayList<String>(allowedJoinOperators.length));
        }
        for (String ele : allowedJoinOperators) {
            this.allowedJoinOperators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Which logical operators (if any) are to be used in an INNER JOIN match condition. Default is <code>AND</code>.
     * </p>
     * 
     * @param allowedJoinOperators
     *        Which logical operators (if any) are to be used in an INNER JOIN match condition. Default is
     *        <code>AND</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JoinOperator
     */

    public AnalysisRuleAggregation withAllowedJoinOperators(java.util.Collection<String> allowedJoinOperators) {
        setAllowedJoinOperators(allowedJoinOperators);
        return this;
    }

    /**
     * <p>
     * Which logical operators (if any) are to be used in an INNER JOIN match condition. Default is <code>AND</code>.
     * </p>
     * 
     * @param allowedJoinOperators
     *        Which logical operators (if any) are to be used in an INNER JOIN match condition. Default is
     *        <code>AND</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JoinOperator
     */

    public AnalysisRuleAggregation withAllowedJoinOperators(JoinOperator... allowedJoinOperators) {
        java.util.ArrayList<String> allowedJoinOperatorsCopy = new java.util.ArrayList<String>(allowedJoinOperators.length);
        for (JoinOperator value : allowedJoinOperators) {
            allowedJoinOperatorsCopy.add(value.toString());
        }
        if (getAllowedJoinOperators() == null) {
            setAllowedJoinOperators(allowedJoinOperatorsCopy);
        } else {
            getAllowedJoinOperators().addAll(allowedJoinOperatorsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The columns that query runners are allowed to select, group by, or filter by.
     * </p>
     * 
     * @return The columns that query runners are allowed to select, group by, or filter by.
     */

    public java.util.List<String> getDimensionColumns() {
        return dimensionColumns;
    }

    /**
     * <p>
     * The columns that query runners are allowed to select, group by, or filter by.
     * </p>
     * 
     * @param dimensionColumns
     *        The columns that query runners are allowed to select, group by, or filter by.
     */

    public void setDimensionColumns(java.util.Collection<String> dimensionColumns) {
        if (dimensionColumns == null) {
            this.dimensionColumns = null;
            return;
        }

        this.dimensionColumns = new java.util.ArrayList<String>(dimensionColumns);
    }

    /**
     * <p>
     * The columns that query runners are allowed to select, group by, or filter by.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensionColumns(java.util.Collection)} or {@link #withDimensionColumns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dimensionColumns
     *        The columns that query runners are allowed to select, group by, or filter by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleAggregation withDimensionColumns(String... dimensionColumns) {
        if (this.dimensionColumns == null) {
            setDimensionColumns(new java.util.ArrayList<String>(dimensionColumns.length));
        }
        for (String ele : dimensionColumns) {
            this.dimensionColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The columns that query runners are allowed to select, group by, or filter by.
     * </p>
     * 
     * @param dimensionColumns
     *        The columns that query runners are allowed to select, group by, or filter by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleAggregation withDimensionColumns(java.util.Collection<String> dimensionColumns) {
        setDimensionColumns(dimensionColumns);
        return this;
    }

    /**
     * <p>
     * Set of scalar functions that are allowed to be used on dimension columns and the output of aggregation of
     * metrics.
     * </p>
     * 
     * @return Set of scalar functions that are allowed to be used on dimension columns and the output of aggregation of
     *         metrics.
     * @see ScalarFunctions
     */

    public java.util.List<String> getScalarFunctions() {
        return scalarFunctions;
    }

    /**
     * <p>
     * Set of scalar functions that are allowed to be used on dimension columns and the output of aggregation of
     * metrics.
     * </p>
     * 
     * @param scalarFunctions
     *        Set of scalar functions that are allowed to be used on dimension columns and the output of aggregation of
     *        metrics.
     * @see ScalarFunctions
     */

    public void setScalarFunctions(java.util.Collection<String> scalarFunctions) {
        if (scalarFunctions == null) {
            this.scalarFunctions = null;
            return;
        }

        this.scalarFunctions = new java.util.ArrayList<String>(scalarFunctions);
    }

    /**
     * <p>
     * Set of scalar functions that are allowed to be used on dimension columns and the output of aggregation of
     * metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScalarFunctions(java.util.Collection)} or {@link #withScalarFunctions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param scalarFunctions
     *        Set of scalar functions that are allowed to be used on dimension columns and the output of aggregation of
     *        metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalarFunctions
     */

    public AnalysisRuleAggregation withScalarFunctions(String... scalarFunctions) {
        if (this.scalarFunctions == null) {
            setScalarFunctions(new java.util.ArrayList<String>(scalarFunctions.length));
        }
        for (String ele : scalarFunctions) {
            this.scalarFunctions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Set of scalar functions that are allowed to be used on dimension columns and the output of aggregation of
     * metrics.
     * </p>
     * 
     * @param scalarFunctions
     *        Set of scalar functions that are allowed to be used on dimension columns and the output of aggregation of
     *        metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalarFunctions
     */

    public AnalysisRuleAggregation withScalarFunctions(java.util.Collection<String> scalarFunctions) {
        setScalarFunctions(scalarFunctions);
        return this;
    }

    /**
     * <p>
     * Set of scalar functions that are allowed to be used on dimension columns and the output of aggregation of
     * metrics.
     * </p>
     * 
     * @param scalarFunctions
     *        Set of scalar functions that are allowed to be used on dimension columns and the output of aggregation of
     *        metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalarFunctions
     */

    public AnalysisRuleAggregation withScalarFunctions(ScalarFunctions... scalarFunctions) {
        java.util.ArrayList<String> scalarFunctionsCopy = new java.util.ArrayList<String>(scalarFunctions.length);
        for (ScalarFunctions value : scalarFunctions) {
            scalarFunctionsCopy.add(value.toString());
        }
        if (getScalarFunctions() == null) {
            setScalarFunctions(scalarFunctionsCopy);
        } else {
            getScalarFunctions().addAll(scalarFunctionsCopy);
        }
        return this;
    }

    /**
     * <p>
     * Columns that must meet a specific threshold value (after an aggregation function is applied to it) for each
     * output row to be returned.
     * </p>
     * 
     * @return Columns that must meet a specific threshold value (after an aggregation function is applied to it) for
     *         each output row to be returned.
     */

    public java.util.List<AggregationConstraint> getOutputConstraints() {
        return outputConstraints;
    }

    /**
     * <p>
     * Columns that must meet a specific threshold value (after an aggregation function is applied to it) for each
     * output row to be returned.
     * </p>
     * 
     * @param outputConstraints
     *        Columns that must meet a specific threshold value (after an aggregation function is applied to it) for
     *        each output row to be returned.
     */

    public void setOutputConstraints(java.util.Collection<AggregationConstraint> outputConstraints) {
        if (outputConstraints == null) {
            this.outputConstraints = null;
            return;
        }

        this.outputConstraints = new java.util.ArrayList<AggregationConstraint>(outputConstraints);
    }

    /**
     * <p>
     * Columns that must meet a specific threshold value (after an aggregation function is applied to it) for each
     * output row to be returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputConstraints(java.util.Collection)} or {@link #withOutputConstraints(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param outputConstraints
     *        Columns that must meet a specific threshold value (after an aggregation function is applied to it) for
     *        each output row to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleAggregation withOutputConstraints(AggregationConstraint... outputConstraints) {
        if (this.outputConstraints == null) {
            setOutputConstraints(new java.util.ArrayList<AggregationConstraint>(outputConstraints.length));
        }
        for (AggregationConstraint ele : outputConstraints) {
            this.outputConstraints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Columns that must meet a specific threshold value (after an aggregation function is applied to it) for each
     * output row to be returned.
     * </p>
     * 
     * @param outputConstraints
     *        Columns that must meet a specific threshold value (after an aggregation function is applied to it) for
     *        each output row to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleAggregation withOutputConstraints(java.util.Collection<AggregationConstraint> outputConstraints) {
        setOutputConstraints(outputConstraints);
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
        if (getAggregateColumns() != null)
            sb.append("AggregateColumns: ").append(getAggregateColumns()).append(",");
        if (getJoinColumns() != null)
            sb.append("JoinColumns: ").append(getJoinColumns()).append(",");
        if (getJoinRequired() != null)
            sb.append("JoinRequired: ").append(getJoinRequired()).append(",");
        if (getAllowedJoinOperators() != null)
            sb.append("AllowedJoinOperators: ").append(getAllowedJoinOperators()).append(",");
        if (getDimensionColumns() != null)
            sb.append("DimensionColumns: ").append(getDimensionColumns()).append(",");
        if (getScalarFunctions() != null)
            sb.append("ScalarFunctions: ").append(getScalarFunctions()).append(",");
        if (getOutputConstraints() != null)
            sb.append("OutputConstraints: ").append(getOutputConstraints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisRuleAggregation == false)
            return false;
        AnalysisRuleAggregation other = (AnalysisRuleAggregation) obj;
        if (other.getAggregateColumns() == null ^ this.getAggregateColumns() == null)
            return false;
        if (other.getAggregateColumns() != null && other.getAggregateColumns().equals(this.getAggregateColumns()) == false)
            return false;
        if (other.getJoinColumns() == null ^ this.getJoinColumns() == null)
            return false;
        if (other.getJoinColumns() != null && other.getJoinColumns().equals(this.getJoinColumns()) == false)
            return false;
        if (other.getJoinRequired() == null ^ this.getJoinRequired() == null)
            return false;
        if (other.getJoinRequired() != null && other.getJoinRequired().equals(this.getJoinRequired()) == false)
            return false;
        if (other.getAllowedJoinOperators() == null ^ this.getAllowedJoinOperators() == null)
            return false;
        if (other.getAllowedJoinOperators() != null && other.getAllowedJoinOperators().equals(this.getAllowedJoinOperators()) == false)
            return false;
        if (other.getDimensionColumns() == null ^ this.getDimensionColumns() == null)
            return false;
        if (other.getDimensionColumns() != null && other.getDimensionColumns().equals(this.getDimensionColumns()) == false)
            return false;
        if (other.getScalarFunctions() == null ^ this.getScalarFunctions() == null)
            return false;
        if (other.getScalarFunctions() != null && other.getScalarFunctions().equals(this.getScalarFunctions()) == false)
            return false;
        if (other.getOutputConstraints() == null ^ this.getOutputConstraints() == null)
            return false;
        if (other.getOutputConstraints() != null && other.getOutputConstraints().equals(this.getOutputConstraints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAggregateColumns() == null) ? 0 : getAggregateColumns().hashCode());
        hashCode = prime * hashCode + ((getJoinColumns() == null) ? 0 : getJoinColumns().hashCode());
        hashCode = prime * hashCode + ((getJoinRequired() == null) ? 0 : getJoinRequired().hashCode());
        hashCode = prime * hashCode + ((getAllowedJoinOperators() == null) ? 0 : getAllowedJoinOperators().hashCode());
        hashCode = prime * hashCode + ((getDimensionColumns() == null) ? 0 : getDimensionColumns().hashCode());
        hashCode = prime * hashCode + ((getScalarFunctions() == null) ? 0 : getScalarFunctions().hashCode());
        hashCode = prime * hashCode + ((getOutputConstraints() == null) ? 0 : getOutputConstraints().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisRuleAggregation clone() {
        try {
            return (AnalysisRuleAggregation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.AnalysisRuleAggregationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
