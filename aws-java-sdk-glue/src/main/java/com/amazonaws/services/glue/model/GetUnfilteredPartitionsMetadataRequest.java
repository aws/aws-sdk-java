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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetUnfilteredPartitionsMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUnfilteredPartitionsMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String catalogId;

    private String databaseName;

    private String tableName;

    private String expression;

    private AuditContext auditContext;

    private java.util.List<String> supportedPermissionTypes;

    private String nextToken;

    private Segment segment;

    private Integer maxResults;

    /**
     * @param catalogId
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * @return
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @param catalogId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionsMetadataRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * @param databaseName
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * @return
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @param databaseName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionsMetadataRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * @param tableName
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * @param tableName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionsMetadataRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * @param expression
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * @return
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * @param expression
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionsMetadataRequest withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * @param auditContext
     */

    public void setAuditContext(AuditContext auditContext) {
        this.auditContext = auditContext;
    }

    /**
     * @return
     */

    public AuditContext getAuditContext() {
        return this.auditContext;
    }

    /**
     * @param auditContext
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionsMetadataRequest withAuditContext(AuditContext auditContext) {
        setAuditContext(auditContext);
        return this;
    }

    /**
     * @return
     * @see PermissionType
     */

    public java.util.List<String> getSupportedPermissionTypes() {
        return supportedPermissionTypes;
    }

    /**
     * @param supportedPermissionTypes
     * @see PermissionType
     */

    public void setSupportedPermissionTypes(java.util.Collection<String> supportedPermissionTypes) {
        if (supportedPermissionTypes == null) {
            this.supportedPermissionTypes = null;
            return;
        }

        this.supportedPermissionTypes = new java.util.ArrayList<String>(supportedPermissionTypes);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedPermissionTypes(java.util.Collection)} or
     * {@link #withSupportedPermissionTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedPermissionTypes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public GetUnfilteredPartitionsMetadataRequest withSupportedPermissionTypes(String... supportedPermissionTypes) {
        if (this.supportedPermissionTypes == null) {
            setSupportedPermissionTypes(new java.util.ArrayList<String>(supportedPermissionTypes.length));
        }
        for (String ele : supportedPermissionTypes) {
            this.supportedPermissionTypes.add(ele);
        }
        return this;
    }

    /**
     * @param supportedPermissionTypes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public GetUnfilteredPartitionsMetadataRequest withSupportedPermissionTypes(java.util.Collection<String> supportedPermissionTypes) {
        setSupportedPermissionTypes(supportedPermissionTypes);
        return this;
    }

    /**
     * @param supportedPermissionTypes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public GetUnfilteredPartitionsMetadataRequest withSupportedPermissionTypes(PermissionType... supportedPermissionTypes) {
        java.util.ArrayList<String> supportedPermissionTypesCopy = new java.util.ArrayList<String>(supportedPermissionTypes.length);
        for (PermissionType value : supportedPermissionTypes) {
            supportedPermissionTypesCopy.add(value.toString());
        }
        if (getSupportedPermissionTypes() == null) {
            setSupportedPermissionTypes(supportedPermissionTypesCopy);
        } else {
            getSupportedPermissionTypes().addAll(supportedPermissionTypesCopy);
        }
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionsMetadataRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * @param segment
     */

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    /**
     * @return
     */

    public Segment getSegment() {
        return this.segment;
    }

    /**
     * @param segment
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionsMetadataRequest withSegment(Segment segment) {
        setSegment(segment);
        return this;
    }

    /**
     * @param maxResults
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * @return
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @param maxResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionsMetadataRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getAuditContext() != null)
            sb.append("AuditContext: ").append(getAuditContext()).append(",");
        if (getSupportedPermissionTypes() != null)
            sb.append("SupportedPermissionTypes: ").append(getSupportedPermissionTypes()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSegment() != null)
            sb.append("Segment: ").append(getSegment()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUnfilteredPartitionsMetadataRequest == false)
            return false;
        GetUnfilteredPartitionsMetadataRequest other = (GetUnfilteredPartitionsMetadataRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getAuditContext() == null ^ this.getAuditContext() == null)
            return false;
        if (other.getAuditContext() != null && other.getAuditContext().equals(this.getAuditContext()) == false)
            return false;
        if (other.getSupportedPermissionTypes() == null ^ this.getSupportedPermissionTypes() == null)
            return false;
        if (other.getSupportedPermissionTypes() != null && other.getSupportedPermissionTypes().equals(this.getSupportedPermissionTypes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSegment() == null ^ this.getSegment() == null)
            return false;
        if (other.getSegment() != null && other.getSegment().equals(this.getSegment()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getAuditContext() == null) ? 0 : getAuditContext().hashCode());
        hashCode = prime * hashCode + ((getSupportedPermissionTypes() == null) ? 0 : getSupportedPermissionTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSegment() == null) ? 0 : getSegment().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetUnfilteredPartitionsMetadataRequest clone() {
        return (GetUnfilteredPartitionsMetadataRequest) super.clone();
    }

}
