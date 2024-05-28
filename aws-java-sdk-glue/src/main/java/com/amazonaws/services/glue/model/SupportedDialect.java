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
 * A structure specifying the dialect and dialect version used by the query engine.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SupportedDialect" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SupportedDialect implements Serializable, Cloneable, StructuredPojo {

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

    public SupportedDialect withDialect(String dialect) {
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

    public SupportedDialect withDialect(ViewDialect dialect) {
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

    public SupportedDialect withDialectVersion(String dialectVersion) {
        setDialectVersion(dialectVersion);
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
        if (getDialect() != null)
            sb.append("Dialect: ").append(getDialect()).append(",");
        if (getDialectVersion() != null)
            sb.append("DialectVersion: ").append(getDialectVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SupportedDialect == false)
            return false;
        SupportedDialect other = (SupportedDialect) obj;
        if (other.getDialect() == null ^ this.getDialect() == null)
            return false;
        if (other.getDialect() != null && other.getDialect().equals(this.getDialect()) == false)
            return false;
        if (other.getDialectVersion() == null ^ this.getDialectVersion() == null)
            return false;
        if (other.getDialectVersion() != null && other.getDialectVersion().equals(this.getDialectVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDialect() == null) ? 0 : getDialect().hashCode());
        hashCode = prime * hashCode + ((getDialectVersion() == null) ? 0 : getDialectVersion().hashCode());
        return hashCode;
    }

    @Override
    public SupportedDialect clone() {
        try {
            return (SupportedDialect) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.SupportedDialectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
