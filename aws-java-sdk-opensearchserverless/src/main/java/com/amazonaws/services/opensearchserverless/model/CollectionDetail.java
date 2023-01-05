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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about each OpenSearch Serverless collection, including the collection endpoint and the OpenSearch Dashboards
 * endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CollectionDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CollectionDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the collection.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Collection-specific endpoint used to submit index, search, and data upload requests to an OpenSearch Serverless
     * collection.
     * </p>
     */
    private String collectionEndpoint;
    /**
     * <p>
     * The Epoch time when the collection was created.
     * </p>
     */
    private Long createdDate;
    /**
     * <p>
     * Collection-specific endpoint used to access OpenSearch Dashboards.
     * </p>
     */
    private String dashboardEndpoint;
    /**
     * <p>
     * A description of the collection.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A unique identifier for the collection.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ARN of the Amazon Web Services KMS key used to encrypt the collection.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * The date and time when the collection was last modified.
     * </p>
     */
    private Long lastModifiedDate;
    /**
     * <p>
     * The name of the collection.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current status of the collection.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of collection.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the collection.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the collection.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the collection.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the collection.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the collection.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionDetail withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Collection-specific endpoint used to submit index, search, and data upload requests to an OpenSearch Serverless
     * collection.
     * </p>
     * 
     * @param collectionEndpoint
     *        Collection-specific endpoint used to submit index, search, and data upload requests to an OpenSearch
     *        Serverless collection.
     */

    public void setCollectionEndpoint(String collectionEndpoint) {
        this.collectionEndpoint = collectionEndpoint;
    }

    /**
     * <p>
     * Collection-specific endpoint used to submit index, search, and data upload requests to an OpenSearch Serverless
     * collection.
     * </p>
     * 
     * @return Collection-specific endpoint used to submit index, search, and data upload requests to an OpenSearch
     *         Serverless collection.
     */

    public String getCollectionEndpoint() {
        return this.collectionEndpoint;
    }

    /**
     * <p>
     * Collection-specific endpoint used to submit index, search, and data upload requests to an OpenSearch Serverless
     * collection.
     * </p>
     * 
     * @param collectionEndpoint
     *        Collection-specific endpoint used to submit index, search, and data upload requests to an OpenSearch
     *        Serverless collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionDetail withCollectionEndpoint(String collectionEndpoint) {
        setCollectionEndpoint(collectionEndpoint);
        return this;
    }

    /**
     * <p>
     * The Epoch time when the collection was created.
     * </p>
     * 
     * @param createdDate
     *        The Epoch time when the collection was created.
     */

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The Epoch time when the collection was created.
     * </p>
     * 
     * @return The Epoch time when the collection was created.
     */

    public Long getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The Epoch time when the collection was created.
     * </p>
     * 
     * @param createdDate
     *        The Epoch time when the collection was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionDetail withCreatedDate(Long createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * Collection-specific endpoint used to access OpenSearch Dashboards.
     * </p>
     * 
     * @param dashboardEndpoint
     *        Collection-specific endpoint used to access OpenSearch Dashboards.
     */

    public void setDashboardEndpoint(String dashboardEndpoint) {
        this.dashboardEndpoint = dashboardEndpoint;
    }

    /**
     * <p>
     * Collection-specific endpoint used to access OpenSearch Dashboards.
     * </p>
     * 
     * @return Collection-specific endpoint used to access OpenSearch Dashboards.
     */

    public String getDashboardEndpoint() {
        return this.dashboardEndpoint;
    }

    /**
     * <p>
     * Collection-specific endpoint used to access OpenSearch Dashboards.
     * </p>
     * 
     * @param dashboardEndpoint
     *        Collection-specific endpoint used to access OpenSearch Dashboards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionDetail withDashboardEndpoint(String dashboardEndpoint) {
        setDashboardEndpoint(dashboardEndpoint);
        return this;
    }

    /**
     * <p>
     * A description of the collection.
     * </p>
     * 
     * @param description
     *        A description of the collection.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the collection.
     * </p>
     * 
     * @return A description of the collection.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the collection.
     * </p>
     * 
     * @param description
     *        A description of the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionDetail withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the collection.
     * </p>
     * 
     * @param id
     *        A unique identifier for the collection.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the collection.
     * </p>
     * 
     * @return A unique identifier for the collection.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier for the collection.
     * </p>
     * 
     * @param id
     *        A unique identifier for the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionDetail withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon Web Services KMS key used to encrypt the collection.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of the Amazon Web Services KMS key used to encrypt the collection.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Web Services KMS key used to encrypt the collection.
     * </p>
     * 
     * @return The ARN of the Amazon Web Services KMS key used to encrypt the collection.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Web Services KMS key used to encrypt the collection.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of the Amazon Web Services KMS key used to encrypt the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionDetail withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * The date and time when the collection was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time when the collection was last modified.
     */

    public void setLastModifiedDate(Long lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time when the collection was last modified.
     * </p>
     * 
     * @return The date and time when the collection was last modified.
     */

    public Long getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date and time when the collection was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time when the collection was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionDetail withLastModifiedDate(Long lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The name of the collection.
     * </p>
     * 
     * @param name
     *        The name of the collection.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the collection.
     * </p>
     * 
     * @return The name of the collection.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the collection.
     * </p>
     * 
     * @param name
     *        The name of the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current status of the collection.
     * </p>
     * 
     * @param status
     *        The current status of the collection.
     * @see CollectionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the collection.
     * </p>
     * 
     * @return The current status of the collection.
     * @see CollectionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the collection.
     * </p>
     * 
     * @param status
     *        The current status of the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CollectionStatus
     */

    public CollectionDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the collection.
     * </p>
     * 
     * @param status
     *        The current status of the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CollectionStatus
     */

    public CollectionDetail withStatus(CollectionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The type of collection.
     * </p>
     * 
     * @param type
     *        The type of collection.
     * @see CollectionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of collection.
     * </p>
     * 
     * @return The type of collection.
     * @see CollectionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of collection.
     * </p>
     * 
     * @param type
     *        The type of collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CollectionType
     */

    public CollectionDetail withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of collection.
     * </p>
     * 
     * @param type
     *        The type of collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CollectionType
     */

    public CollectionDetail withType(CollectionType type) {
        this.type = type.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCollectionEndpoint() != null)
            sb.append("CollectionEndpoint: ").append(getCollectionEndpoint()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getDashboardEndpoint() != null)
            sb.append("DashboardEndpoint: ").append(getDashboardEndpoint()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CollectionDetail == false)
            return false;
        CollectionDetail other = (CollectionDetail) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCollectionEndpoint() == null ^ this.getCollectionEndpoint() == null)
            return false;
        if (other.getCollectionEndpoint() != null && other.getCollectionEndpoint().equals(this.getCollectionEndpoint()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getDashboardEndpoint() == null ^ this.getDashboardEndpoint() == null)
            return false;
        if (other.getDashboardEndpoint() != null && other.getDashboardEndpoint().equals(this.getDashboardEndpoint()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCollectionEndpoint() == null) ? 0 : getCollectionEndpoint().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getDashboardEndpoint() == null) ? 0 : getDashboardEndpoint().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CollectionDetail clone() {
        try {
            return (CollectionDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearchserverless.model.transform.CollectionDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
