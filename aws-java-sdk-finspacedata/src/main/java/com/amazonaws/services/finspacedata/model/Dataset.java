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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure for a Dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/Dataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Dataset implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An identifier for a Dataset.
     * </p>
     */
    private String datasetId;
    /**
     * <p>
     * The ARN identifier of the Dataset.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * Display title for a Dataset.
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
     * Description for a Dataset.
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
     * The timestamp at which the Dataset was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private Long createTime;
    /**
     * <p>
     * The last time that the Dataset was modified. The value is determined as epoch time in milliseconds. For example,
     * the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private Long lastModifiedTime;
    /**
     * <p>
     * Definition for a schema on a tabular Dataset.
     * </p>
     */
    private SchemaUnion schemaDefinition;
    /**
     * <p>
     * The unique resource identifier for a Dataset.
     * </p>
     */
    private String alias;

    /**
     * <p>
     * An identifier for a Dataset.
     * </p>
     * 
     * @param datasetId
     *        An identifier for a Dataset.
     */

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    /**
     * <p>
     * An identifier for a Dataset.
     * </p>
     * 
     * @return An identifier for a Dataset.
     */

    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * <p>
     * An identifier for a Dataset.
     * </p>
     * 
     * @param datasetId
     *        An identifier for a Dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset withDatasetId(String datasetId) {
        setDatasetId(datasetId);
        return this;
    }

    /**
     * <p>
     * The ARN identifier of the Dataset.
     * </p>
     * 
     * @param datasetArn
     *        The ARN identifier of the Dataset.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The ARN identifier of the Dataset.
     * </p>
     * 
     * @return The ARN identifier of the Dataset.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The ARN identifier of the Dataset.
     * </p>
     * 
     * @param datasetArn
     *        The ARN identifier of the Dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * Display title for a Dataset.
     * </p>
     * 
     * @param datasetTitle
     *        Display title for a Dataset.
     */

    public void setDatasetTitle(String datasetTitle) {
        this.datasetTitle = datasetTitle;
    }

    /**
     * <p>
     * Display title for a Dataset.
     * </p>
     * 
     * @return Display title for a Dataset.
     */

    public String getDatasetTitle() {
        return this.datasetTitle;
    }

    /**
     * <p>
     * Display title for a Dataset.
     * </p>
     * 
     * @param datasetTitle
     *        Display title for a Dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset withDatasetTitle(String datasetTitle) {
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

    public Dataset withKind(String kind) {
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

    public Dataset withKind(DatasetKind kind) {
        this.kind = kind.toString();
        return this;
    }

    /**
     * <p>
     * Description for a Dataset.
     * </p>
     * 
     * @param datasetDescription
     *        Description for a Dataset.
     */

    public void setDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
    }

    /**
     * <p>
     * Description for a Dataset.
     * </p>
     * 
     * @return Description for a Dataset.
     */

    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    /**
     * <p>
     * Description for a Dataset.
     * </p>
     * 
     * @param datasetDescription
     *        Description for a Dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset withDatasetDescription(String datasetDescription) {
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

    public Dataset withOwnerInfo(DatasetOwnerInfo ownerInfo) {
        setOwnerInfo(ownerInfo);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the Dataset was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createTime
     *        The timestamp at which the Dataset was created in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     */

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The timestamp at which the Dataset was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The timestamp at which the Dataset was created in FinSpace. The value is determined as epoch time in
     *         milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *         1635768000000.
     */

    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The timestamp at which the Dataset was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createTime
     *        The timestamp at which the Dataset was created in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset withCreateTime(Long createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The last time that the Dataset was modified. The value is determined as epoch time in milliseconds. For example,
     * the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time that the Dataset was modified. The value is determined as epoch time in milliseconds. For
     *        example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public void setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last time that the Dataset was modified. The value is determined as epoch time in milliseconds. For example,
     * the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The last time that the Dataset was modified. The value is determined as epoch time in milliseconds. For
     *         example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The last time that the Dataset was modified. The value is determined as epoch time in milliseconds. For example,
     * the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time that the Dataset was modified. The value is determined as epoch time in milliseconds. For
     *        example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset withLastModifiedTime(Long lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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

    public Dataset withSchemaDefinition(SchemaUnion schemaDefinition) {
        setSchemaDefinition(schemaDefinition);
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

    public Dataset withAlias(String alias) {
        setAlias(alias);
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
        if (getDatasetId() != null)
            sb.append("DatasetId: ").append(getDatasetId()).append(",");
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getDatasetTitle() != null)
            sb.append("DatasetTitle: ").append(getDatasetTitle()).append(",");
        if (getKind() != null)
            sb.append("Kind: ").append(getKind()).append(",");
        if (getDatasetDescription() != null)
            sb.append("DatasetDescription: ").append(getDatasetDescription()).append(",");
        if (getOwnerInfo() != null)
            sb.append("OwnerInfo: ").append(getOwnerInfo()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getSchemaDefinition() != null)
            sb.append("SchemaDefinition: ").append(getSchemaDefinition()).append(",");
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Dataset == false)
            return false;
        Dataset other = (Dataset) obj;
        if (other.getDatasetId() == null ^ this.getDatasetId() == null)
            return false;
        if (other.getDatasetId() != null && other.getDatasetId().equals(this.getDatasetId()) == false)
            return false;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
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
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getSchemaDefinition() == null ^ this.getSchemaDefinition() == null)
            return false;
        if (other.getSchemaDefinition() != null && other.getSchemaDefinition().equals(this.getSchemaDefinition()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetId() == null) ? 0 : getDatasetId().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetTitle() == null) ? 0 : getDatasetTitle().hashCode());
        hashCode = prime * hashCode + ((getKind() == null) ? 0 : getKind().hashCode());
        hashCode = prime * hashCode + ((getDatasetDescription() == null) ? 0 : getDatasetDescription().hashCode());
        hashCode = prime * hashCode + ((getOwnerInfo() == null) ? 0 : getOwnerInfo().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getSchemaDefinition() == null) ? 0 : getSchemaDefinition().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        return hashCode;
    }

    @Override
    public Dataset clone() {
        try {
            return (Dataset) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspacedata.model.transform.DatasetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
