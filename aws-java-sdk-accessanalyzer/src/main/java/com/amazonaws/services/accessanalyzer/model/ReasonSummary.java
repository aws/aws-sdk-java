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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the reasoning why a check for access passed or failed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ReasonSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReasonSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the reasoning of a result of checking for access.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The index number of the reason statement.
     * </p>
     */
    private Integer statementIndex;
    /**
     * <p>
     * The identifier for the reason statement.
     * </p>
     */
    private String statementId;

    /**
     * <p>
     * A description of the reasoning of a result of checking for access.
     * </p>
     * 
     * @param description
     *        A description of the reasoning of a result of checking for access.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the reasoning of a result of checking for access.
     * </p>
     * 
     * @return A description of the reasoning of a result of checking for access.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the reasoning of a result of checking for access.
     * </p>
     * 
     * @param description
     *        A description of the reasoning of a result of checking for access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReasonSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The index number of the reason statement.
     * </p>
     * 
     * @param statementIndex
     *        The index number of the reason statement.
     */

    public void setStatementIndex(Integer statementIndex) {
        this.statementIndex = statementIndex;
    }

    /**
     * <p>
     * The index number of the reason statement.
     * </p>
     * 
     * @return The index number of the reason statement.
     */

    public Integer getStatementIndex() {
        return this.statementIndex;
    }

    /**
     * <p>
     * The index number of the reason statement.
     * </p>
     * 
     * @param statementIndex
     *        The index number of the reason statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReasonSummary withStatementIndex(Integer statementIndex) {
        setStatementIndex(statementIndex);
        return this;
    }

    /**
     * <p>
     * The identifier for the reason statement.
     * </p>
     * 
     * @param statementId
     *        The identifier for the reason statement.
     */

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    /**
     * <p>
     * The identifier for the reason statement.
     * </p>
     * 
     * @return The identifier for the reason statement.
     */

    public String getStatementId() {
        return this.statementId;
    }

    /**
     * <p>
     * The identifier for the reason statement.
     * </p>
     * 
     * @param statementId
     *        The identifier for the reason statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReasonSummary withStatementId(String statementId) {
        setStatementId(statementId);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatementIndex() != null)
            sb.append("StatementIndex: ").append(getStatementIndex()).append(",");
        if (getStatementId() != null)
            sb.append("StatementId: ").append(getStatementId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReasonSummary == false)
            return false;
        ReasonSummary other = (ReasonSummary) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatementIndex() == null ^ this.getStatementIndex() == null)
            return false;
        if (other.getStatementIndex() != null && other.getStatementIndex().equals(this.getStatementIndex()) == false)
            return false;
        if (other.getStatementId() == null ^ this.getStatementId() == null)
            return false;
        if (other.getStatementId() != null && other.getStatementId().equals(this.getStatementId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatementIndex() == null) ? 0 : getStatementIndex().hashCode());
        hashCode = prime * hashCode + ((getStatementId() == null) ? 0 : getStatementId().hashCode());
        return hashCode;
    }

    @Override
    public ReasonSummary clone() {
        try {
            return (ReasonSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.ReasonSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
