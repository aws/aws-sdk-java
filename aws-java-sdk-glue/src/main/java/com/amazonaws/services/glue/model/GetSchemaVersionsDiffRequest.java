/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetSchemaVersionsDiff" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSchemaVersionsDiffRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This is a wrapper structure to contain schema identity fields. The structure contains:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. One of <code>SchemaArn</code> or
     * <code>SchemaName</code> has to be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * SchemaId$SchemaName: The name of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has to be
     * provided.
     * </p>
     * </li>
     * </ul>
     */
    private SchemaId schemaId;
    /**
     * <p>
     * The first of the two schema versions to be compared.
     * </p>
     */
    private SchemaVersionNumber firstSchemaVersionNumber;
    /**
     * <p>
     * The second of the two schema versions to be compared.
     * </p>
     */
    private SchemaVersionNumber secondSchemaVersionNumber;
    /**
     * <p>
     * Refers to <code>SYNTAX_DIFF</code>, which is the currently supported diff type.
     * </p>
     */
    private String schemaDiffType;

    /**
     * <p>
     * This is a wrapper structure to contain schema identity fields. The structure contains:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. One of <code>SchemaArn</code> or
     * <code>SchemaName</code> has to be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * SchemaId$SchemaName: The name of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has to be
     * provided.
     * </p>
     * </li>
     * </ul>
     * 
     * @param schemaId
     *        This is a wrapper structure to contain schema identity fields. The structure contains:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. One of <code>SchemaArn</code> or
     *        <code>SchemaName</code> has to be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SchemaId$SchemaName: The name of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has
     *        to be provided.
     *        </p>
     *        </li>
     */

    public void setSchemaId(SchemaId schemaId) {
        this.schemaId = schemaId;
    }

    /**
     * <p>
     * This is a wrapper structure to contain schema identity fields. The structure contains:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. One of <code>SchemaArn</code> or
     * <code>SchemaName</code> has to be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * SchemaId$SchemaName: The name of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has to be
     * provided.
     * </p>
     * </li>
     * </ul>
     * 
     * @return This is a wrapper structure to contain schema identity fields. The structure contains:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. One of <code>SchemaArn</code> or
     *         <code>SchemaName</code> has to be provided.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SchemaId$SchemaName: The name of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has
     *         to be provided.
     *         </p>
     *         </li>
     */

    public SchemaId getSchemaId() {
        return this.schemaId;
    }

    /**
     * <p>
     * This is a wrapper structure to contain schema identity fields. The structure contains:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. One of <code>SchemaArn</code> or
     * <code>SchemaName</code> has to be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * SchemaId$SchemaName: The name of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has to be
     * provided.
     * </p>
     * </li>
     * </ul>
     * 
     * @param schemaId
     *        This is a wrapper structure to contain schema identity fields. The structure contains:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. One of <code>SchemaArn</code> or
     *        <code>SchemaName</code> has to be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SchemaId$SchemaName: The name of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has
     *        to be provided.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaVersionsDiffRequest withSchemaId(SchemaId schemaId) {
        setSchemaId(schemaId);
        return this;
    }

    /**
     * <p>
     * The first of the two schema versions to be compared.
     * </p>
     * 
     * @param firstSchemaVersionNumber
     *        The first of the two schema versions to be compared.
     */

    public void setFirstSchemaVersionNumber(SchemaVersionNumber firstSchemaVersionNumber) {
        this.firstSchemaVersionNumber = firstSchemaVersionNumber;
    }

    /**
     * <p>
     * The first of the two schema versions to be compared.
     * </p>
     * 
     * @return The first of the two schema versions to be compared.
     */

    public SchemaVersionNumber getFirstSchemaVersionNumber() {
        return this.firstSchemaVersionNumber;
    }

    /**
     * <p>
     * The first of the two schema versions to be compared.
     * </p>
     * 
     * @param firstSchemaVersionNumber
     *        The first of the two schema versions to be compared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaVersionsDiffRequest withFirstSchemaVersionNumber(SchemaVersionNumber firstSchemaVersionNumber) {
        setFirstSchemaVersionNumber(firstSchemaVersionNumber);
        return this;
    }

    /**
     * <p>
     * The second of the two schema versions to be compared.
     * </p>
     * 
     * @param secondSchemaVersionNumber
     *        The second of the two schema versions to be compared.
     */

    public void setSecondSchemaVersionNumber(SchemaVersionNumber secondSchemaVersionNumber) {
        this.secondSchemaVersionNumber = secondSchemaVersionNumber;
    }

    /**
     * <p>
     * The second of the two schema versions to be compared.
     * </p>
     * 
     * @return The second of the two schema versions to be compared.
     */

    public SchemaVersionNumber getSecondSchemaVersionNumber() {
        return this.secondSchemaVersionNumber;
    }

    /**
     * <p>
     * The second of the two schema versions to be compared.
     * </p>
     * 
     * @param secondSchemaVersionNumber
     *        The second of the two schema versions to be compared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaVersionsDiffRequest withSecondSchemaVersionNumber(SchemaVersionNumber secondSchemaVersionNumber) {
        setSecondSchemaVersionNumber(secondSchemaVersionNumber);
        return this;
    }

    /**
     * <p>
     * Refers to <code>SYNTAX_DIFF</code>, which is the currently supported diff type.
     * </p>
     * 
     * @param schemaDiffType
     *        Refers to <code>SYNTAX_DIFF</code>, which is the currently supported diff type.
     * @see SchemaDiffType
     */

    public void setSchemaDiffType(String schemaDiffType) {
        this.schemaDiffType = schemaDiffType;
    }

    /**
     * <p>
     * Refers to <code>SYNTAX_DIFF</code>, which is the currently supported diff type.
     * </p>
     * 
     * @return Refers to <code>SYNTAX_DIFF</code>, which is the currently supported diff type.
     * @see SchemaDiffType
     */

    public String getSchemaDiffType() {
        return this.schemaDiffType;
    }

    /**
     * <p>
     * Refers to <code>SYNTAX_DIFF</code>, which is the currently supported diff type.
     * </p>
     * 
     * @param schemaDiffType
     *        Refers to <code>SYNTAX_DIFF</code>, which is the currently supported diff type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaDiffType
     */

    public GetSchemaVersionsDiffRequest withSchemaDiffType(String schemaDiffType) {
        setSchemaDiffType(schemaDiffType);
        return this;
    }

    /**
     * <p>
     * Refers to <code>SYNTAX_DIFF</code>, which is the currently supported diff type.
     * </p>
     * 
     * @param schemaDiffType
     *        Refers to <code>SYNTAX_DIFF</code>, which is the currently supported diff type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaDiffType
     */

    public GetSchemaVersionsDiffRequest withSchemaDiffType(SchemaDiffType schemaDiffType) {
        this.schemaDiffType = schemaDiffType.toString();
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
        if (getSchemaId() != null)
            sb.append("SchemaId: ").append(getSchemaId()).append(",");
        if (getFirstSchemaVersionNumber() != null)
            sb.append("FirstSchemaVersionNumber: ").append(getFirstSchemaVersionNumber()).append(",");
        if (getSecondSchemaVersionNumber() != null)
            sb.append("SecondSchemaVersionNumber: ").append(getSecondSchemaVersionNumber()).append(",");
        if (getSchemaDiffType() != null)
            sb.append("SchemaDiffType: ").append(getSchemaDiffType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSchemaVersionsDiffRequest == false)
            return false;
        GetSchemaVersionsDiffRequest other = (GetSchemaVersionsDiffRequest) obj;
        if (other.getSchemaId() == null ^ this.getSchemaId() == null)
            return false;
        if (other.getSchemaId() != null && other.getSchemaId().equals(this.getSchemaId()) == false)
            return false;
        if (other.getFirstSchemaVersionNumber() == null ^ this.getFirstSchemaVersionNumber() == null)
            return false;
        if (other.getFirstSchemaVersionNumber() != null && other.getFirstSchemaVersionNumber().equals(this.getFirstSchemaVersionNumber()) == false)
            return false;
        if (other.getSecondSchemaVersionNumber() == null ^ this.getSecondSchemaVersionNumber() == null)
            return false;
        if (other.getSecondSchemaVersionNumber() != null && other.getSecondSchemaVersionNumber().equals(this.getSecondSchemaVersionNumber()) == false)
            return false;
        if (other.getSchemaDiffType() == null ^ this.getSchemaDiffType() == null)
            return false;
        if (other.getSchemaDiffType() != null && other.getSchemaDiffType().equals(this.getSchemaDiffType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaId() == null) ? 0 : getSchemaId().hashCode());
        hashCode = prime * hashCode + ((getFirstSchemaVersionNumber() == null) ? 0 : getFirstSchemaVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getSecondSchemaVersionNumber() == null) ? 0 : getSecondSchemaVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getSchemaDiffType() == null) ? 0 : getSchemaDiffType().hashCode());
        return hashCode;
    }

    @Override
    public GetSchemaVersionsDiffRequest clone() {
        return (GetSchemaVersionsDiffRequest) super.clone();
    }

}
