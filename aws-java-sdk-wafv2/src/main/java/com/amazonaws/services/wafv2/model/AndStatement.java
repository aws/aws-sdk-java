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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <note>
 * <p>
 * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information, including
 * how to migrate your AWS WAF resources from the prior release, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
 * </p>
 * </note>
 * <p>
 * A logical rule statement used to combine other rule statements with AND logic. You provide more than one
 * <a>Statement</a> within the <code>AndStatement</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/AndStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AndStatement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The statements to combine with AND logic. You can use any statements that can be nested.
     * </p>
     */
    private java.util.List<Statement> statements;

    /**
     * <p>
     * The statements to combine with AND logic. You can use any statements that can be nested.
     * </p>
     * 
     * @return The statements to combine with AND logic. You can use any statements that can be nested.
     */

    public java.util.List<Statement> getStatements() {
        return statements;
    }

    /**
     * <p>
     * The statements to combine with AND logic. You can use any statements that can be nested.
     * </p>
     * 
     * @param statements
     *        The statements to combine with AND logic. You can use any statements that can be nested.
     */

    public void setStatements(java.util.Collection<Statement> statements) {
        if (statements == null) {
            this.statements = null;
            return;
        }

        this.statements = new java.util.ArrayList<Statement>(statements);
    }

    /**
     * <p>
     * The statements to combine with AND logic. You can use any statements that can be nested.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatements(java.util.Collection)} or {@link #withStatements(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statements
     *        The statements to combine with AND logic. You can use any statements that can be nested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AndStatement withStatements(Statement... statements) {
        if (this.statements == null) {
            setStatements(new java.util.ArrayList<Statement>(statements.length));
        }
        for (Statement ele : statements) {
            this.statements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The statements to combine with AND logic. You can use any statements that can be nested.
     * </p>
     * 
     * @param statements
     *        The statements to combine with AND logic. You can use any statements that can be nested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AndStatement withStatements(java.util.Collection<Statement> statements) {
        setStatements(statements);
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
        if (getStatements() != null)
            sb.append("Statements: ").append(getStatements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AndStatement == false)
            return false;
        AndStatement other = (AndStatement) obj;
        if (other.getStatements() == null ^ this.getStatements() == null)
            return false;
        if (other.getStatements() != null && other.getStatements().equals(this.getStatements()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatements() == null) ? 0 : getStatements().hashCode());
        return hashCode;
    }

    @Override
    public AndStatement clone() {
        try {
            return (AndStatement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.AndStatementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
