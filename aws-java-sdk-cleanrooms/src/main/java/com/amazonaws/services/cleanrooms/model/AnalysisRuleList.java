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
 * A type of analysis rule that enables row-level analysis.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/AnalysisRuleList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisRuleList implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Columns that can be used to join a configured table with the table of the member who can query and other members'
     * configured tables.
     * </p>
     */
    private java.util.List<String> joinColumns;
    /**
     * <p>
     * The logical operators (if any) that are to be used in an INNER JOIN match condition. Default is <code>AND</code>.
     * </p>
     */
    private java.util.List<String> allowedJoinOperators;
    /**
     * <p>
     * Columns that can be listed in the output.
     * </p>
     */
    private java.util.List<String> listColumns;

    /**
     * <p>
     * Columns that can be used to join a configured table with the table of the member who can query and other members'
     * configured tables.
     * </p>
     * 
     * @return Columns that can be used to join a configured table with the table of the member who can query and other
     *         members' configured tables.
     */

    public java.util.List<String> getJoinColumns() {
        return joinColumns;
    }

    /**
     * <p>
     * Columns that can be used to join a configured table with the table of the member who can query and other members'
     * configured tables.
     * </p>
     * 
     * @param joinColumns
     *        Columns that can be used to join a configured table with the table of the member who can query and other
     *        members' configured tables.
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
     * Columns that can be used to join a configured table with the table of the member who can query and other members'
     * configured tables.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJoinColumns(java.util.Collection)} or {@link #withJoinColumns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param joinColumns
     *        Columns that can be used to join a configured table with the table of the member who can query and other
     *        members' configured tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleList withJoinColumns(String... joinColumns) {
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
     * Columns that can be used to join a configured table with the table of the member who can query and other members'
     * configured tables.
     * </p>
     * 
     * @param joinColumns
     *        Columns that can be used to join a configured table with the table of the member who can query and other
     *        members' configured tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleList withJoinColumns(java.util.Collection<String> joinColumns) {
        setJoinColumns(joinColumns);
        return this;
    }

    /**
     * <p>
     * The logical operators (if any) that are to be used in an INNER JOIN match condition. Default is <code>AND</code>.
     * </p>
     * 
     * @return The logical operators (if any) that are to be used in an INNER JOIN match condition. Default is
     *         <code>AND</code>.
     * @see JoinOperator
     */

    public java.util.List<String> getAllowedJoinOperators() {
        return allowedJoinOperators;
    }

    /**
     * <p>
     * The logical operators (if any) that are to be used in an INNER JOIN match condition. Default is <code>AND</code>.
     * </p>
     * 
     * @param allowedJoinOperators
     *        The logical operators (if any) that are to be used in an INNER JOIN match condition. Default is
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
     * The logical operators (if any) that are to be used in an INNER JOIN match condition. Default is <code>AND</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedJoinOperators(java.util.Collection)} or {@link #withAllowedJoinOperators(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param allowedJoinOperators
     *        The logical operators (if any) that are to be used in an INNER JOIN match condition. Default is
     *        <code>AND</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JoinOperator
     */

    public AnalysisRuleList withAllowedJoinOperators(String... allowedJoinOperators) {
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
     * The logical operators (if any) that are to be used in an INNER JOIN match condition. Default is <code>AND</code>.
     * </p>
     * 
     * @param allowedJoinOperators
     *        The logical operators (if any) that are to be used in an INNER JOIN match condition. Default is
     *        <code>AND</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JoinOperator
     */

    public AnalysisRuleList withAllowedJoinOperators(java.util.Collection<String> allowedJoinOperators) {
        setAllowedJoinOperators(allowedJoinOperators);
        return this;
    }

    /**
     * <p>
     * The logical operators (if any) that are to be used in an INNER JOIN match condition. Default is <code>AND</code>.
     * </p>
     * 
     * @param allowedJoinOperators
     *        The logical operators (if any) that are to be used in an INNER JOIN match condition. Default is
     *        <code>AND</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JoinOperator
     */

    public AnalysisRuleList withAllowedJoinOperators(JoinOperator... allowedJoinOperators) {
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
     * Columns that can be listed in the output.
     * </p>
     * 
     * @return Columns that can be listed in the output.
     */

    public java.util.List<String> getListColumns() {
        return listColumns;
    }

    /**
     * <p>
     * Columns that can be listed in the output.
     * </p>
     * 
     * @param listColumns
     *        Columns that can be listed in the output.
     */

    public void setListColumns(java.util.Collection<String> listColumns) {
        if (listColumns == null) {
            this.listColumns = null;
            return;
        }

        this.listColumns = new java.util.ArrayList<String>(listColumns);
    }

    /**
     * <p>
     * Columns that can be listed in the output.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListColumns(java.util.Collection)} or {@link #withListColumns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param listColumns
     *        Columns that can be listed in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleList withListColumns(String... listColumns) {
        if (this.listColumns == null) {
            setListColumns(new java.util.ArrayList<String>(listColumns.length));
        }
        for (String ele : listColumns) {
            this.listColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Columns that can be listed in the output.
     * </p>
     * 
     * @param listColumns
     *        Columns that can be listed in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleList withListColumns(java.util.Collection<String> listColumns) {
        setListColumns(listColumns);
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
        if (getJoinColumns() != null)
            sb.append("JoinColumns: ").append(getJoinColumns()).append(",");
        if (getAllowedJoinOperators() != null)
            sb.append("AllowedJoinOperators: ").append(getAllowedJoinOperators()).append(",");
        if (getListColumns() != null)
            sb.append("ListColumns: ").append(getListColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisRuleList == false)
            return false;
        AnalysisRuleList other = (AnalysisRuleList) obj;
        if (other.getJoinColumns() == null ^ this.getJoinColumns() == null)
            return false;
        if (other.getJoinColumns() != null && other.getJoinColumns().equals(this.getJoinColumns()) == false)
            return false;
        if (other.getAllowedJoinOperators() == null ^ this.getAllowedJoinOperators() == null)
            return false;
        if (other.getAllowedJoinOperators() != null && other.getAllowedJoinOperators().equals(this.getAllowedJoinOperators()) == false)
            return false;
        if (other.getListColumns() == null ^ this.getListColumns() == null)
            return false;
        if (other.getListColumns() != null && other.getListColumns().equals(this.getListColumns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJoinColumns() == null) ? 0 : getJoinColumns().hashCode());
        hashCode = prime * hashCode + ((getAllowedJoinOperators() == null) ? 0 : getAllowedJoinOperators().hashCode());
        hashCode = prime * hashCode + ((getListColumns() == null) ? 0 : getListColumns().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisRuleList clone() {
        try {
            return (AnalysisRuleList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.AnalysisRuleListMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
