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
 * A logical rule statement used to negate the results of another rule statement. You provide one <a>Statement</a>
 * within the <code>NotStatement</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/NotStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotStatement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The statement to negate. You can use any statement that can be nested.
     * </p>
     */
    private Statement statement;

    /**
     * <p>
     * The statement to negate. You can use any statement that can be nested.
     * </p>
     * 
     * @param statement
     *        The statement to negate. You can use any statement that can be nested.
     */

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    /**
     * <p>
     * The statement to negate. You can use any statement that can be nested.
     * </p>
     * 
     * @return The statement to negate. You can use any statement that can be nested.
     */

    public Statement getStatement() {
        return this.statement;
    }

    /**
     * <p>
     * The statement to negate. You can use any statement that can be nested.
     * </p>
     * 
     * @param statement
     *        The statement to negate. You can use any statement that can be nested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotStatement withStatement(Statement statement) {
        setStatement(statement);
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
        if (getStatement() != null)
            sb.append("Statement: ").append(getStatement());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotStatement == false)
            return false;
        NotStatement other = (NotStatement) obj;
        if (other.getStatement() == null ^ this.getStatement() == null)
            return false;
        if (other.getStatement() != null && other.getStatement().equals(this.getStatement()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatement() == null) ? 0 : getStatement().hashCode());
        return hashCode;
    }

    @Override
    public NotStatement clone() {
        try {
            return (NotStatement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.NotStatementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
