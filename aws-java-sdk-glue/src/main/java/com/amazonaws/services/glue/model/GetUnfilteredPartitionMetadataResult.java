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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetUnfilteredPartitionMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUnfilteredPartitionMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private Partition partition;

    private java.util.List<String> authorizedColumns;

    private Boolean isRegisteredWithLakeFormation;

    /**
     * @param partition
     */

    public void setPartition(Partition partition) {
        this.partition = partition;
    }

    /**
     * @return
     */

    public Partition getPartition() {
        return this.partition;
    }

    /**
     * @param partition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionMetadataResult withPartition(Partition partition) {
        setPartition(partition);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getAuthorizedColumns() {
        return authorizedColumns;
    }

    /**
     * @param authorizedColumns
     */

    public void setAuthorizedColumns(java.util.Collection<String> authorizedColumns) {
        if (authorizedColumns == null) {
            this.authorizedColumns = null;
            return;
        }

        this.authorizedColumns = new java.util.ArrayList<String>(authorizedColumns);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthorizedColumns(java.util.Collection)} or {@link #withAuthorizedColumns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param authorizedColumns
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionMetadataResult withAuthorizedColumns(String... authorizedColumns) {
        if (this.authorizedColumns == null) {
            setAuthorizedColumns(new java.util.ArrayList<String>(authorizedColumns.length));
        }
        for (String ele : authorizedColumns) {
            this.authorizedColumns.add(ele);
        }
        return this;
    }

    /**
     * @param authorizedColumns
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionMetadataResult withAuthorizedColumns(java.util.Collection<String> authorizedColumns) {
        setAuthorizedColumns(authorizedColumns);
        return this;
    }

    /**
     * @param isRegisteredWithLakeFormation
     */

    public void setIsRegisteredWithLakeFormation(Boolean isRegisteredWithLakeFormation) {
        this.isRegisteredWithLakeFormation = isRegisteredWithLakeFormation;
    }

    /**
     * @return
     */

    public Boolean getIsRegisteredWithLakeFormation() {
        return this.isRegisteredWithLakeFormation;
    }

    /**
     * @param isRegisteredWithLakeFormation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionMetadataResult withIsRegisteredWithLakeFormation(Boolean isRegisteredWithLakeFormation) {
        setIsRegisteredWithLakeFormation(isRegisteredWithLakeFormation);
        return this;
    }

    /**
     * @return
     */

    public Boolean isRegisteredWithLakeFormation() {
        return this.isRegisteredWithLakeFormation;
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
        if (getPartition() != null)
            sb.append("Partition: ").append(getPartition()).append(",");
        if (getAuthorizedColumns() != null)
            sb.append("AuthorizedColumns: ").append(getAuthorizedColumns()).append(",");
        if (getIsRegisteredWithLakeFormation() != null)
            sb.append("IsRegisteredWithLakeFormation: ").append(getIsRegisteredWithLakeFormation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUnfilteredPartitionMetadataResult == false)
            return false;
        GetUnfilteredPartitionMetadataResult other = (GetUnfilteredPartitionMetadataResult) obj;
        if (other.getPartition() == null ^ this.getPartition() == null)
            return false;
        if (other.getPartition() != null && other.getPartition().equals(this.getPartition()) == false)
            return false;
        if (other.getAuthorizedColumns() == null ^ this.getAuthorizedColumns() == null)
            return false;
        if (other.getAuthorizedColumns() != null && other.getAuthorizedColumns().equals(this.getAuthorizedColumns()) == false)
            return false;
        if (other.getIsRegisteredWithLakeFormation() == null ^ this.getIsRegisteredWithLakeFormation() == null)
            return false;
        if (other.getIsRegisteredWithLakeFormation() != null
                && other.getIsRegisteredWithLakeFormation().equals(this.getIsRegisteredWithLakeFormation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPartition() == null) ? 0 : getPartition().hashCode());
        hashCode = prime * hashCode + ((getAuthorizedColumns() == null) ? 0 : getAuthorizedColumns().hashCode());
        hashCode = prime * hashCode + ((getIsRegisteredWithLakeFormation() == null) ? 0 : getIsRegisteredWithLakeFormation().hashCode());
        return hashCode;
    }

    @Override
    public GetUnfilteredPartitionMetadataResult clone() {
        try {
            return (GetUnfilteredPartitionMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
