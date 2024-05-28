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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the dialect of the view, and the query that defines the view.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ViewRepresentation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ViewRepresentation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The dialect of the query engine.
     * </p>
     */
    private String dialect;
    /**
     * <p>
     * The version of the dialect of the query engine. For example, 3.0.0.
     * </p>
     */
    private String dialectVersion;
    /**
     * <p>
     * The <code>SELECT</code> query provided by the customer during <code>CREATE VIEW DDL</code>. This SQL is not used
     * during a query on a view (<code>ViewExpandedText</code> is used instead). <code>ViewOriginalText</code> is used
     * for cases like <code>SHOW CREATE VIEW</code> where users want to see the original DDL command that created the
     * view.
     * </p>
     */
    private String viewOriginalText;
    /**
     * <p>
     * The expanded SQL for the view. This SQL is used by engines while processing a query on a view. Engines may
     * perform operations during view creation to transform <code>ViewOriginalText</code> to
     * <code>ViewExpandedText</code>. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Fully qualify identifiers: <code>SELECT * from table1 → SELECT * from db1.table1</code>
     * </p>
     * </li>
     * </ul>
     */
    private String viewExpandedText;
    /**
     * <p>
     * Dialects marked as stale are no longer valid and must be updated before they can be queried in their respective
     * query engines.
     * </p>
     */
    private Boolean isStale;

    /**
     * <p>
     * The dialect of the query engine.
     * </p>
     * 
     * @param dialect
     *        The dialect of the query engine.
     * @see ViewDialect
     */

    public void setDialect(String dialect) {
        this.dialect = dialect;
    }

    /**
     * <p>
     * The dialect of the query engine.
     * </p>
     * 
     * @return The dialect of the query engine.
     * @see ViewDialect
     */

    public String getDialect() {
        return this.dialect;
    }

    /**
     * <p>
     * The dialect of the query engine.
     * </p>
     * 
     * @param dialect
     *        The dialect of the query engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViewDialect
     */

    public ViewRepresentation withDialect(String dialect) {
        setDialect(dialect);
        return this;
    }

    /**
     * <p>
     * The dialect of the query engine.
     * </p>
     * 
     * @param dialect
     *        The dialect of the query engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViewDialect
     */

    public ViewRepresentation withDialect(ViewDialect dialect) {
        this.dialect = dialect.toString();
        return this;
    }

    /**
     * <p>
     * The version of the dialect of the query engine. For example, 3.0.0.
     * </p>
     * 
     * @param dialectVersion
     *        The version of the dialect of the query engine. For example, 3.0.0.
     */

    public void setDialectVersion(String dialectVersion) {
        this.dialectVersion = dialectVersion;
    }

    /**
     * <p>
     * The version of the dialect of the query engine. For example, 3.0.0.
     * </p>
     * 
     * @return The version of the dialect of the query engine. For example, 3.0.0.
     */

    public String getDialectVersion() {
        return this.dialectVersion;
    }

    /**
     * <p>
     * The version of the dialect of the query engine. For example, 3.0.0.
     * </p>
     * 
     * @param dialectVersion
     *        The version of the dialect of the query engine. For example, 3.0.0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewRepresentation withDialectVersion(String dialectVersion) {
        setDialectVersion(dialectVersion);
        return this;
    }

    /**
     * <p>
     * The <code>SELECT</code> query provided by the customer during <code>CREATE VIEW DDL</code>. This SQL is not used
     * during a query on a view (<code>ViewExpandedText</code> is used instead). <code>ViewOriginalText</code> is used
     * for cases like <code>SHOW CREATE VIEW</code> where users want to see the original DDL command that created the
     * view.
     * </p>
     * 
     * @param viewOriginalText
     *        The <code>SELECT</code> query provided by the customer during <code>CREATE VIEW DDL</code>. This SQL is
     *        not used during a query on a view (<code>ViewExpandedText</code> is used instead).
     *        <code>ViewOriginalText</code> is used for cases like <code>SHOW CREATE VIEW</code> where users want to see
     *        the original DDL command that created the view.
     */

    public void setViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
    }

    /**
     * <p>
     * The <code>SELECT</code> query provided by the customer during <code>CREATE VIEW DDL</code>. This SQL is not used
     * during a query on a view (<code>ViewExpandedText</code> is used instead). <code>ViewOriginalText</code> is used
     * for cases like <code>SHOW CREATE VIEW</code> where users want to see the original DDL command that created the
     * view.
     * </p>
     * 
     * @return The <code>SELECT</code> query provided by the customer during <code>CREATE VIEW DDL</code>. This SQL is
     *         not used during a query on a view (<code>ViewExpandedText</code> is used instead).
     *         <code>ViewOriginalText</code> is used for cases like <code>SHOW CREATE VIEW</code> where users want to
     *         see the original DDL command that created the view.
     */

    public String getViewOriginalText() {
        return this.viewOriginalText;
    }

    /**
     * <p>
     * The <code>SELECT</code> query provided by the customer during <code>CREATE VIEW DDL</code>. This SQL is not used
     * during a query on a view (<code>ViewExpandedText</code> is used instead). <code>ViewOriginalText</code> is used
     * for cases like <code>SHOW CREATE VIEW</code> where users want to see the original DDL command that created the
     * view.
     * </p>
     * 
     * @param viewOriginalText
     *        The <code>SELECT</code> query provided by the customer during <code>CREATE VIEW DDL</code>. This SQL is
     *        not used during a query on a view (<code>ViewExpandedText</code> is used instead).
     *        <code>ViewOriginalText</code> is used for cases like <code>SHOW CREATE VIEW</code> where users want to see
     *        the original DDL command that created the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewRepresentation withViewOriginalText(String viewOriginalText) {
        setViewOriginalText(viewOriginalText);
        return this;
    }

    /**
     * <p>
     * The expanded SQL for the view. This SQL is used by engines while processing a query on a view. Engines may
     * perform operations during view creation to transform <code>ViewOriginalText</code> to
     * <code>ViewExpandedText</code>. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Fully qualify identifiers: <code>SELECT * from table1 → SELECT * from db1.table1</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param viewExpandedText
     *        The expanded SQL for the view. This SQL is used by engines while processing a query on a view. Engines may
     *        perform operations during view creation to transform <code>ViewOriginalText</code> to
     *        <code>ViewExpandedText</code>. For example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Fully qualify identifiers: <code>SELECT * from table1 → SELECT * from db1.table1</code>
     *        </p>
     *        </li>
     */

    public void setViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
    }

    /**
     * <p>
     * The expanded SQL for the view. This SQL is used by engines while processing a query on a view. Engines may
     * perform operations during view creation to transform <code>ViewOriginalText</code> to
     * <code>ViewExpandedText</code>. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Fully qualify identifiers: <code>SELECT * from table1 → SELECT * from db1.table1</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The expanded SQL for the view. This SQL is used by engines while processing a query on a view. Engines
     *         may perform operations during view creation to transform <code>ViewOriginalText</code> to
     *         <code>ViewExpandedText</code>. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Fully qualify identifiers: <code>SELECT * from table1 → SELECT * from db1.table1</code>
     *         </p>
     *         </li>
     */

    public String getViewExpandedText() {
        return this.viewExpandedText;
    }

    /**
     * <p>
     * The expanded SQL for the view. This SQL is used by engines while processing a query on a view. Engines may
     * perform operations during view creation to transform <code>ViewOriginalText</code> to
     * <code>ViewExpandedText</code>. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Fully qualify identifiers: <code>SELECT * from table1 → SELECT * from db1.table1</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param viewExpandedText
     *        The expanded SQL for the view. This SQL is used by engines while processing a query on a view. Engines may
     *        perform operations during view creation to transform <code>ViewOriginalText</code> to
     *        <code>ViewExpandedText</code>. For example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Fully qualify identifiers: <code>SELECT * from table1 → SELECT * from db1.table1</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewRepresentation withViewExpandedText(String viewExpandedText) {
        setViewExpandedText(viewExpandedText);
        return this;
    }

    /**
     * <p>
     * Dialects marked as stale are no longer valid and must be updated before they can be queried in their respective
     * query engines.
     * </p>
     * 
     * @param isStale
     *        Dialects marked as stale are no longer valid and must be updated before they can be queried in their
     *        respective query engines.
     */

    public void setIsStale(Boolean isStale) {
        this.isStale = isStale;
    }

    /**
     * <p>
     * Dialects marked as stale are no longer valid and must be updated before they can be queried in their respective
     * query engines.
     * </p>
     * 
     * @return Dialects marked as stale are no longer valid and must be updated before they can be queried in their
     *         respective query engines.
     */

    public Boolean getIsStale() {
        return this.isStale;
    }

    /**
     * <p>
     * Dialects marked as stale are no longer valid and must be updated before they can be queried in their respective
     * query engines.
     * </p>
     * 
     * @param isStale
     *        Dialects marked as stale are no longer valid and must be updated before they can be queried in their
     *        respective query engines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewRepresentation withIsStale(Boolean isStale) {
        setIsStale(isStale);
        return this;
    }

    /**
     * <p>
     * Dialects marked as stale are no longer valid and must be updated before they can be queried in their respective
     * query engines.
     * </p>
     * 
     * @return Dialects marked as stale are no longer valid and must be updated before they can be queried in their
     *         respective query engines.
     */

    public Boolean isStale() {
        return this.isStale;
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
        if (getDialect() != null)
            sb.append("Dialect: ").append(getDialect()).append(",");
        if (getDialectVersion() != null)
            sb.append("DialectVersion: ").append(getDialectVersion()).append(",");
        if (getViewOriginalText() != null)
            sb.append("ViewOriginalText: ").append(getViewOriginalText()).append(",");
        if (getViewExpandedText() != null)
            sb.append("ViewExpandedText: ").append(getViewExpandedText()).append(",");
        if (getIsStale() != null)
            sb.append("IsStale: ").append(getIsStale());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ViewRepresentation == false)
            return false;
        ViewRepresentation other = (ViewRepresentation) obj;
        if (other.getDialect() == null ^ this.getDialect() == null)
            return false;
        if (other.getDialect() != null && other.getDialect().equals(this.getDialect()) == false)
            return false;
        if (other.getDialectVersion() == null ^ this.getDialectVersion() == null)
            return false;
        if (other.getDialectVersion() != null && other.getDialectVersion().equals(this.getDialectVersion()) == false)
            return false;
        if (other.getViewOriginalText() == null ^ this.getViewOriginalText() == null)
            return false;
        if (other.getViewOriginalText() != null && other.getViewOriginalText().equals(this.getViewOriginalText()) == false)
            return false;
        if (other.getViewExpandedText() == null ^ this.getViewExpandedText() == null)
            return false;
        if (other.getViewExpandedText() != null && other.getViewExpandedText().equals(this.getViewExpandedText()) == false)
            return false;
        if (other.getIsStale() == null ^ this.getIsStale() == null)
            return false;
        if (other.getIsStale() != null && other.getIsStale().equals(this.getIsStale()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDialect() == null) ? 0 : getDialect().hashCode());
        hashCode = prime * hashCode + ((getDialectVersion() == null) ? 0 : getDialectVersion().hashCode());
        hashCode = prime * hashCode + ((getViewOriginalText() == null) ? 0 : getViewOriginalText().hashCode());
        hashCode = prime * hashCode + ((getViewExpandedText() == null) ? 0 : getViewExpandedText().hashCode());
        hashCode = prime * hashCode + ((getIsStale() == null) ? 0 : getIsStale().hashCode());
        return hashCode;
    }

    @Override
    public ViewRepresentation clone() {
        try {
            return (ViewRepresentation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ViewRepresentationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
