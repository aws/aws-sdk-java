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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a schema in a Fleet Advisor collector inventory.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/SchemaResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of lines of code in a schema in a Fleet Advisor collector inventory.
     * </p>
     */
    private Long codeLineCount;
    /**
     * <p>
     * The size level of the code in a schema in a Fleet Advisor collector inventory.
     * </p>
     */
    private Long codeSize;
    /**
     * <p>
     * The complexity level of the code in a schema in a Fleet Advisor collector inventory.
     * </p>
     */
    private String complexity;
    /**
     * <p>
     * The database server for a schema in a Fleet Advisor collector inventory.
     * </p>
     */
    private ServerShortInfoResponse server;
    /**
     * <p>
     * The database for a schema in a Fleet Advisor collector inventory.
     * </p>
     */
    private DatabaseShortInfoResponse databaseInstance;
    /**
     * <p>
     * The ID of a schema in a Fleet Advisor collector inventory.
     * </p>
     */
    private String schemaId;
    /**
     * <p>
     * The name of a schema in a Fleet Advisor collector inventory.
     * </p>
     */
    private String schemaName;

    private SchemaShortInfoResponse originalSchema;
    /**
     * <p>
     * The similarity value for a schema in a Fleet Advisor collector inventory. A higher similarity value indicates
     * that a schema is likely to be a duplicate.
     * </p>
     */
    private Double similarity;

    /**
     * <p>
     * The number of lines of code in a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param codeLineCount
     *        The number of lines of code in a schema in a Fleet Advisor collector inventory.
     */

    public void setCodeLineCount(Long codeLineCount) {
        this.codeLineCount = codeLineCount;
    }

    /**
     * <p>
     * The number of lines of code in a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The number of lines of code in a schema in a Fleet Advisor collector inventory.
     */

    public Long getCodeLineCount() {
        return this.codeLineCount;
    }

    /**
     * <p>
     * The number of lines of code in a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param codeLineCount
     *        The number of lines of code in a schema in a Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaResponse withCodeLineCount(Long codeLineCount) {
        setCodeLineCount(codeLineCount);
        return this;
    }

    /**
     * <p>
     * The size level of the code in a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param codeSize
     *        The size level of the code in a schema in a Fleet Advisor collector inventory.
     */

    public void setCodeSize(Long codeSize) {
        this.codeSize = codeSize;
    }

    /**
     * <p>
     * The size level of the code in a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The size level of the code in a schema in a Fleet Advisor collector inventory.
     */

    public Long getCodeSize() {
        return this.codeSize;
    }

    /**
     * <p>
     * The size level of the code in a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param codeSize
     *        The size level of the code in a schema in a Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaResponse withCodeSize(Long codeSize) {
        setCodeSize(codeSize);
        return this;
    }

    /**
     * <p>
     * The complexity level of the code in a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param complexity
     *        The complexity level of the code in a schema in a Fleet Advisor collector inventory.
     */

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    /**
     * <p>
     * The complexity level of the code in a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The complexity level of the code in a schema in a Fleet Advisor collector inventory.
     */

    public String getComplexity() {
        return this.complexity;
    }

    /**
     * <p>
     * The complexity level of the code in a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param complexity
     *        The complexity level of the code in a schema in a Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaResponse withComplexity(String complexity) {
        setComplexity(complexity);
        return this;
    }

    /**
     * <p>
     * The database server for a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param server
     *        The database server for a schema in a Fleet Advisor collector inventory.
     */

    public void setServer(ServerShortInfoResponse server) {
        this.server = server;
    }

    /**
     * <p>
     * The database server for a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The database server for a schema in a Fleet Advisor collector inventory.
     */

    public ServerShortInfoResponse getServer() {
        return this.server;
    }

    /**
     * <p>
     * The database server for a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param server
     *        The database server for a schema in a Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaResponse withServer(ServerShortInfoResponse server) {
        setServer(server);
        return this;
    }

    /**
     * <p>
     * The database for a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param databaseInstance
     *        The database for a schema in a Fleet Advisor collector inventory.
     */

    public void setDatabaseInstance(DatabaseShortInfoResponse databaseInstance) {
        this.databaseInstance = databaseInstance;
    }

    /**
     * <p>
     * The database for a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The database for a schema in a Fleet Advisor collector inventory.
     */

    public DatabaseShortInfoResponse getDatabaseInstance() {
        return this.databaseInstance;
    }

    /**
     * <p>
     * The database for a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param databaseInstance
     *        The database for a schema in a Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaResponse withDatabaseInstance(DatabaseShortInfoResponse databaseInstance) {
        setDatabaseInstance(databaseInstance);
        return this;
    }

    /**
     * <p>
     * The ID of a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param schemaId
     *        The ID of a schema in a Fleet Advisor collector inventory.
     */

    public void setSchemaId(String schemaId) {
        this.schemaId = schemaId;
    }

    /**
     * <p>
     * The ID of a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The ID of a schema in a Fleet Advisor collector inventory.
     */

    public String getSchemaId() {
        return this.schemaId;
    }

    /**
     * <p>
     * The ID of a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param schemaId
     *        The ID of a schema in a Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaResponse withSchemaId(String schemaId) {
        setSchemaId(schemaId);
        return this;
    }

    /**
     * <p>
     * The name of a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param schemaName
     *        The name of a schema in a Fleet Advisor collector inventory.
     */

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * <p>
     * The name of a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The name of a schema in a Fleet Advisor collector inventory.
     */

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * <p>
     * The name of a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param schemaName
     *        The name of a schema in a Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaResponse withSchemaName(String schemaName) {
        setSchemaName(schemaName);
        return this;
    }

    /**
     * @param originalSchema
     */

    public void setOriginalSchema(SchemaShortInfoResponse originalSchema) {
        this.originalSchema = originalSchema;
    }

    /**
     * @return
     */

    public SchemaShortInfoResponse getOriginalSchema() {
        return this.originalSchema;
    }

    /**
     * @param originalSchema
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaResponse withOriginalSchema(SchemaShortInfoResponse originalSchema) {
        setOriginalSchema(originalSchema);
        return this;
    }

    /**
     * <p>
     * The similarity value for a schema in a Fleet Advisor collector inventory. A higher similarity value indicates
     * that a schema is likely to be a duplicate.
     * </p>
     * 
     * @param similarity
     *        The similarity value for a schema in a Fleet Advisor collector inventory. A higher similarity value
     *        indicates that a schema is likely to be a duplicate.
     */

    public void setSimilarity(Double similarity) {
        this.similarity = similarity;
    }

    /**
     * <p>
     * The similarity value for a schema in a Fleet Advisor collector inventory. A higher similarity value indicates
     * that a schema is likely to be a duplicate.
     * </p>
     * 
     * @return The similarity value for a schema in a Fleet Advisor collector inventory. A higher similarity value
     *         indicates that a schema is likely to be a duplicate.
     */

    public Double getSimilarity() {
        return this.similarity;
    }

    /**
     * <p>
     * The similarity value for a schema in a Fleet Advisor collector inventory. A higher similarity value indicates
     * that a schema is likely to be a duplicate.
     * </p>
     * 
     * @param similarity
     *        The similarity value for a schema in a Fleet Advisor collector inventory. A higher similarity value
     *        indicates that a schema is likely to be a duplicate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaResponse withSimilarity(Double similarity) {
        setSimilarity(similarity);
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
        if (getCodeLineCount() != null)
            sb.append("CodeLineCount: ").append(getCodeLineCount()).append(",");
        if (getCodeSize() != null)
            sb.append("CodeSize: ").append(getCodeSize()).append(",");
        if (getComplexity() != null)
            sb.append("Complexity: ").append(getComplexity()).append(",");
        if (getServer() != null)
            sb.append("Server: ").append(getServer()).append(",");
        if (getDatabaseInstance() != null)
            sb.append("DatabaseInstance: ").append(getDatabaseInstance()).append(",");
        if (getSchemaId() != null)
            sb.append("SchemaId: ").append(getSchemaId()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName()).append(",");
        if (getOriginalSchema() != null)
            sb.append("OriginalSchema: ").append(getOriginalSchema()).append(",");
        if (getSimilarity() != null)
            sb.append("Similarity: ").append(getSimilarity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaResponse == false)
            return false;
        SchemaResponse other = (SchemaResponse) obj;
        if (other.getCodeLineCount() == null ^ this.getCodeLineCount() == null)
            return false;
        if (other.getCodeLineCount() != null && other.getCodeLineCount().equals(this.getCodeLineCount()) == false)
            return false;
        if (other.getCodeSize() == null ^ this.getCodeSize() == null)
            return false;
        if (other.getCodeSize() != null && other.getCodeSize().equals(this.getCodeSize()) == false)
            return false;
        if (other.getComplexity() == null ^ this.getComplexity() == null)
            return false;
        if (other.getComplexity() != null && other.getComplexity().equals(this.getComplexity()) == false)
            return false;
        if (other.getServer() == null ^ this.getServer() == null)
            return false;
        if (other.getServer() != null && other.getServer().equals(this.getServer()) == false)
            return false;
        if (other.getDatabaseInstance() == null ^ this.getDatabaseInstance() == null)
            return false;
        if (other.getDatabaseInstance() != null && other.getDatabaseInstance().equals(this.getDatabaseInstance()) == false)
            return false;
        if (other.getSchemaId() == null ^ this.getSchemaId() == null)
            return false;
        if (other.getSchemaId() != null && other.getSchemaId().equals(this.getSchemaId()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getOriginalSchema() == null ^ this.getOriginalSchema() == null)
            return false;
        if (other.getOriginalSchema() != null && other.getOriginalSchema().equals(this.getOriginalSchema()) == false)
            return false;
        if (other.getSimilarity() == null ^ this.getSimilarity() == null)
            return false;
        if (other.getSimilarity() != null && other.getSimilarity().equals(this.getSimilarity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeLineCount() == null) ? 0 : getCodeLineCount().hashCode());
        hashCode = prime * hashCode + ((getCodeSize() == null) ? 0 : getCodeSize().hashCode());
        hashCode = prime * hashCode + ((getComplexity() == null) ? 0 : getComplexity().hashCode());
        hashCode = prime * hashCode + ((getServer() == null) ? 0 : getServer().hashCode());
        hashCode = prime * hashCode + ((getDatabaseInstance() == null) ? 0 : getDatabaseInstance().hashCode());
        hashCode = prime * hashCode + ((getSchemaId() == null) ? 0 : getSchemaId().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getOriginalSchema() == null) ? 0 : getOriginalSchema().hashCode());
        hashCode = prime * hashCode + ((getSimilarity() == null) ? 0 : getSimilarity().hashCode());
        return hashCode;
    }

    @Override
    public SchemaResponse clone() {
        try {
            return (SchemaResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.SchemaResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
