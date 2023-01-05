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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * The request for a CreateDataset operation
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateDataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatasetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Display title for a FinSpace Dataset.
     * </p>
     */
    private String datasetTitle;
    /**
     * <p>
     * The format in which Dataset data is structured.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TABULAR</code> – Data is structured in a tabular format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_TABULAR</code> – Data is structured in a non-tabular format.
     * </p>
     * </li>
     * </ul>
     */
    private String kind;
    /**
     * <p>
     * Description of a Dataset.
     * </p>
     */
    private String datasetDescription;
    /**
     * <p>
     * Contact information for a Dataset owner.
     * </p>
     */
    private DatasetOwnerInfo ownerInfo;
    /**
     * <p>
     * Permission group parameters for Dataset permissions.
     * </p>
     */
    private PermissionGroupParams permissionGroupParams;
    /**
     * <p>
     * The unique resource identifier for a Dataset.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * Definition for a schema on a tabular Dataset.
     * </p>
     */
    private SchemaUnion schemaDefinition;

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @return A token that ensures idempotency. This token expires in 10 minutes.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Display title for a FinSpace Dataset.
     * </p>
     * 
     * @param datasetTitle
     *        Display title for a FinSpace Dataset.
     */

    public void setDatasetTitle(String datasetTitle) {
        this.datasetTitle = datasetTitle;
    }

    /**
     * <p>
     * Display title for a FinSpace Dataset.
     * </p>
     * 
     * @return Display title for a FinSpace Dataset.
     */

    public String getDatasetTitle() {
        return this.datasetTitle;
    }

    /**
     * <p>
     * Display title for a FinSpace Dataset.
     * </p>
     * 
     * @param datasetTitle
     *        Display title for a FinSpace Dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withDatasetTitle(String datasetTitle) {
        setDatasetTitle(datasetTitle);
        return this;
    }

    /**
     * <p>
     * The format in which Dataset data is structured.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TABULAR</code> – Data is structured in a tabular format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_TABULAR</code> – Data is structured in a non-tabular format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param kind
     *        The format in which Dataset data is structured.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TABULAR</code> – Data is structured in a tabular format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_TABULAR</code> – Data is structured in a non-tabular format.
     *        </p>
     *        </li>
     * @see DatasetKind
     */

    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * <p>
     * The format in which Dataset data is structured.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TABULAR</code> – Data is structured in a tabular format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_TABULAR</code> – Data is structured in a non-tabular format.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The format in which Dataset data is structured.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TABULAR</code> – Data is structured in a tabular format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NON_TABULAR</code> – Data is structured in a non-tabular format.
     *         </p>
     *         </li>
     * @see DatasetKind
     */

    public String getKind() {
        return this.kind;
    }

    /**
     * <p>
     * The format in which Dataset data is structured.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TABULAR</code> – Data is structured in a tabular format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_TABULAR</code> – Data is structured in a non-tabular format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param kind
     *        The format in which Dataset data is structured.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TABULAR</code> – Data is structured in a tabular format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_TABULAR</code> – Data is structured in a non-tabular format.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetKind
     */

    public CreateDatasetRequest withKind(String kind) {
        setKind(kind);
        return this;
    }

    /**
     * <p>
     * The format in which Dataset data is structured.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TABULAR</code> – Data is structured in a tabular format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_TABULAR</code> – Data is structured in a non-tabular format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param kind
     *        The format in which Dataset data is structured.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TABULAR</code> – Data is structured in a tabular format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_TABULAR</code> – Data is structured in a non-tabular format.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetKind
     */

    public CreateDatasetRequest withKind(DatasetKind kind) {
        this.kind = kind.toString();
        return this;
    }

    /**
     * <p>
     * Description of a Dataset.
     * </p>
     * 
     * @param datasetDescription
     *        Description of a Dataset.
     */

    public void setDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
    }

    /**
     * <p>
     * Description of a Dataset.
     * </p>
     * 
     * @return Description of a Dataset.
     */

    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    /**
     * <p>
     * Description of a Dataset.
     * </p>
     * 
     * @param datasetDescription
     *        Description of a Dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withDatasetDescription(String datasetDescription) {
        setDatasetDescription(datasetDescription);
        return this;
    }

    /**
     * <p>
     * Contact information for a Dataset owner.
     * </p>
     * 
     * @param ownerInfo
     *        Contact information for a Dataset owner.
     */

    public void setOwnerInfo(DatasetOwnerInfo ownerInfo) {
        this.ownerInfo = ownerInfo;
    }

    /**
     * <p>
     * Contact information for a Dataset owner.
     * </p>
     * 
     * @return Contact information for a Dataset owner.
     */

    public DatasetOwnerInfo getOwnerInfo() {
        return this.ownerInfo;
    }

    /**
     * <p>
     * Contact information for a Dataset owner.
     * </p>
     * 
     * @param ownerInfo
     *        Contact information for a Dataset owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withOwnerInfo(DatasetOwnerInfo ownerInfo) {
        setOwnerInfo(ownerInfo);
        return this;
    }

    /**
     * <p>
     * Permission group parameters for Dataset permissions.
     * </p>
     * 
     * @param permissionGroupParams
     *        Permission group parameters for Dataset permissions.
     */

    public void setPermissionGroupParams(PermissionGroupParams permissionGroupParams) {
        this.permissionGroupParams = permissionGroupParams;
    }

    /**
     * <p>
     * Permission group parameters for Dataset permissions.
     * </p>
     * 
     * @return Permission group parameters for Dataset permissions.
     */

    public PermissionGroupParams getPermissionGroupParams() {
        return this.permissionGroupParams;
    }

    /**
     * <p>
     * Permission group parameters for Dataset permissions.
     * </p>
     * 
     * @param permissionGroupParams
     *        Permission group parameters for Dataset permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withPermissionGroupParams(PermissionGroupParams permissionGroupParams) {
        setPermissionGroupParams(permissionGroupParams);
        return this;
    }

    /**
     * <p>
     * The unique resource identifier for a Dataset.
     * </p>
     * 
     * @param alias
     *        The unique resource identifier for a Dataset.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The unique resource identifier for a Dataset.
     * </p>
     * 
     * @return The unique resource identifier for a Dataset.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The unique resource identifier for a Dataset.
     * </p>
     * 
     * @param alias
     *        The unique resource identifier for a Dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * Definition for a schema on a tabular Dataset.
     * </p>
     * 
     * @param schemaDefinition
     *        Definition for a schema on a tabular Dataset.
     */

    public void setSchemaDefinition(SchemaUnion schemaDefinition) {
        this.schemaDefinition = schemaDefinition;
    }

    /**
     * <p>
     * Definition for a schema on a tabular Dataset.
     * </p>
     * 
     * @return Definition for a schema on a tabular Dataset.
     */

    public SchemaUnion getSchemaDefinition() {
        return this.schemaDefinition;
    }

    /**
     * <p>
     * Definition for a schema on a tabular Dataset.
     * </p>
     * 
     * @param schemaDefinition
     *        Definition for a schema on a tabular Dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withSchemaDefinition(SchemaUnion schemaDefinition) {
        setSchemaDefinition(schemaDefinition);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDatasetTitle() != null)
            sb.append("DatasetTitle: ").append(getDatasetTitle()).append(",");
        if (getKind() != null)
            sb.append("Kind: ").append(getKind()).append(",");
        if (getDatasetDescription() != null)
            sb.append("DatasetDescription: ").append(getDatasetDescription()).append(",");
        if (getOwnerInfo() != null)
            sb.append("OwnerInfo: ").append(getOwnerInfo()).append(",");
        if (getPermissionGroupParams() != null)
            sb.append("PermissionGroupParams: ").append(getPermissionGroupParams()).append(",");
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getSchemaDefinition() != null)
            sb.append("SchemaDefinition: ").append(getSchemaDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDatasetRequest == false)
            return false;
        CreateDatasetRequest other = (CreateDatasetRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDatasetTitle() == null ^ this.getDatasetTitle() == null)
            return false;
        if (other.getDatasetTitle() != null && other.getDatasetTitle().equals(this.getDatasetTitle()) == false)
            return false;
        if (other.getKind() == null ^ this.getKind() == null)
            return false;
        if (other.getKind() != null && other.getKind().equals(this.getKind()) == false)
            return false;
        if (other.getDatasetDescription() == null ^ this.getDatasetDescription() == null)
            return false;
        if (other.getDatasetDescription() != null && other.getDatasetDescription().equals(this.getDatasetDescription()) == false)
            return false;
        if (other.getOwnerInfo() == null ^ this.getOwnerInfo() == null)
            return false;
        if (other.getOwnerInfo() != null && other.getOwnerInfo().equals(this.getOwnerInfo()) == false)
            return false;
        if (other.getPermissionGroupParams() == null ^ this.getPermissionGroupParams() == null)
            return false;
        if (other.getPermissionGroupParams() != null && other.getPermissionGroupParams().equals(this.getPermissionGroupParams()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getSchemaDefinition() == null ^ this.getSchemaDefinition() == null)
            return false;
        if (other.getSchemaDefinition() != null && other.getSchemaDefinition().equals(this.getSchemaDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDatasetTitle() == null) ? 0 : getDatasetTitle().hashCode());
        hashCode = prime * hashCode + ((getKind() == null) ? 0 : getKind().hashCode());
        hashCode = prime * hashCode + ((getDatasetDescription() == null) ? 0 : getDatasetDescription().hashCode());
        hashCode = prime * hashCode + ((getOwnerInfo() == null) ? 0 : getOwnerInfo().hashCode());
        hashCode = prime * hashCode + ((getPermissionGroupParams() == null) ? 0 : getPermissionGroupParams().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getSchemaDefinition() == null) ? 0 : getSchemaDefinition().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatasetRequest clone() {
        return (CreateDatasetRequest) super.clone();
    }

}
