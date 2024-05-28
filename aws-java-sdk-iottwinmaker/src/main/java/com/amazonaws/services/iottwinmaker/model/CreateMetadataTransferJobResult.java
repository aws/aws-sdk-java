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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateMetadataTransferJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMetadataTransferJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The metadata transfer job Id.
     * </p>
     */
    private String metadataTransferJobId;
    /**
     * <p>
     * The metadata transfer job ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The The metadata transfer job creation DateTime property.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The metadata transfer job response status.
     * </p>
     */
    private MetadataTransferJobStatus status;

    /**
     * <p>
     * The metadata transfer job Id.
     * </p>
     * 
     * @param metadataTransferJobId
     *        The metadata transfer job Id.
     */

    public void setMetadataTransferJobId(String metadataTransferJobId) {
        this.metadataTransferJobId = metadataTransferJobId;
    }

    /**
     * <p>
     * The metadata transfer job Id.
     * </p>
     * 
     * @return The metadata transfer job Id.
     */

    public String getMetadataTransferJobId() {
        return this.metadataTransferJobId;
    }

    /**
     * <p>
     * The metadata transfer job Id.
     * </p>
     * 
     * @param metadataTransferJobId
     *        The metadata transfer job Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetadataTransferJobResult withMetadataTransferJobId(String metadataTransferJobId) {
        setMetadataTransferJobId(metadataTransferJobId);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job ARN.
     * </p>
     * 
     * @param arn
     *        The metadata transfer job ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The metadata transfer job ARN.
     * </p>
     * 
     * @return The metadata transfer job ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The metadata transfer job ARN.
     * </p>
     * 
     * @param arn
     *        The metadata transfer job ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetadataTransferJobResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The The metadata transfer job creation DateTime property.
     * </p>
     * 
     * @param creationDateTime
     *        The The metadata transfer job creation DateTime property.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The The metadata transfer job creation DateTime property.
     * </p>
     * 
     * @return The The metadata transfer job creation DateTime property.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The The metadata transfer job creation DateTime property.
     * </p>
     * 
     * @param creationDateTime
     *        The The metadata transfer job creation DateTime property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetadataTransferJobResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job response status.
     * </p>
     * 
     * @param status
     *        The metadata transfer job response status.
     */

    public void setStatus(MetadataTransferJobStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The metadata transfer job response status.
     * </p>
     * 
     * @return The metadata transfer job response status.
     */

    public MetadataTransferJobStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The metadata transfer job response status.
     * </p>
     * 
     * @param status
     *        The metadata transfer job response status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetadataTransferJobResult withStatus(MetadataTransferJobStatus status) {
        setStatus(status);
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
        if (getMetadataTransferJobId() != null)
            sb.append("MetadataTransferJobId: ").append(getMetadataTransferJobId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMetadataTransferJobResult == false)
            return false;
        CreateMetadataTransferJobResult other = (CreateMetadataTransferJobResult) obj;
        if (other.getMetadataTransferJobId() == null ^ this.getMetadataTransferJobId() == null)
            return false;
        if (other.getMetadataTransferJobId() != null && other.getMetadataTransferJobId().equals(this.getMetadataTransferJobId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetadataTransferJobId() == null) ? 0 : getMetadataTransferJobId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateMetadataTransferJobResult clone() {
        try {
            return (CreateMetadataTransferJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
