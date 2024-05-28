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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Neptune logs are converted to SPARQL quads in the graph using the Resource Description Framework (RDF) <a
 * href="https://www.w3.org/TR/n-quads/">N-QUADS</a> language defined in the W3C RDF 1.1 N-Quads specification
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/SparqlData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SparqlData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Holds an <a href="https://www.w3.org/TR/n-quads/">N-QUADS</a> statement expressing the changed quad.
     * </p>
     */
    private String stmt;

    /**
     * <p>
     * Holds an <a href="https://www.w3.org/TR/n-quads/">N-QUADS</a> statement expressing the changed quad.
     * </p>
     * 
     * @param stmt
     *        Holds an <a href="https://www.w3.org/TR/n-quads/">N-QUADS</a> statement expressing the changed quad.
     */

    public void setStmt(String stmt) {
        this.stmt = stmt;
    }

    /**
     * <p>
     * Holds an <a href="https://www.w3.org/TR/n-quads/">N-QUADS</a> statement expressing the changed quad.
     * </p>
     * 
     * @return Holds an <a href="https://www.w3.org/TR/n-quads/">N-QUADS</a> statement expressing the changed quad.
     */

    public String getStmt() {
        return this.stmt;
    }

    /**
     * <p>
     * Holds an <a href="https://www.w3.org/TR/n-quads/">N-QUADS</a> statement expressing the changed quad.
     * </p>
     * 
     * @param stmt
     *        Holds an <a href="https://www.w3.org/TR/n-quads/">N-QUADS</a> statement expressing the changed quad.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparqlData withStmt(String stmt) {
        setStmt(stmt);
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
        if (getStmt() != null)
            sb.append("Stmt: ").append(getStmt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SparqlData == false)
            return false;
        SparqlData other = (SparqlData) obj;
        if (other.getStmt() == null ^ this.getStmt() == null)
            return false;
        if (other.getStmt() != null && other.getStmt().equals(this.getStmt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStmt() == null) ? 0 : getStmt().hashCode());
        return hashCode;
    }

    @Override
    public SparqlData clone() {
        try {
            return (SparqlData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.neptunedata.model.transform.SparqlDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
