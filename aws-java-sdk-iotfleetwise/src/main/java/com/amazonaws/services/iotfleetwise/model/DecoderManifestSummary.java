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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a created decoder manifest. You can use the API operation to return this information about multiple
 * decoder manifests.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DecoderManifestSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DecoderManifestSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the decoder manifest.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of a vehicle model (model manifest) associated with the decoder manifest.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ARN of a vehicle model (model manifest) associated with the decoder manifest.
     * </p>
     */
    private String modelManifestArn;
    /**
     * <p>
     * A brief description of the decoder manifest.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The state of the decoder manifest. If the status is <code>ACTIVE</code>, the decoder manifest can't be edited. If
     * the status is marked <code>DRAFT</code>, you can edit the decoder manifest.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time the decoder manifest was created in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time the decoder manifest was last updated in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     */
    private java.util.Date lastModificationTime;

    /**
     * <p>
     * The name of the decoder manifest.
     * </p>
     * 
     * @param name
     *        The name of the decoder manifest.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the decoder manifest.
     * </p>
     * 
     * @return The name of the decoder manifest.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the decoder manifest.
     * </p>
     * 
     * @param name
     *        The name of the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecoderManifestSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of a vehicle model (model manifest) associated with the decoder manifest.
     * </p>
     * 
     * @param arn
     *        The ARN of a vehicle model (model manifest) associated with the decoder manifest.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of a vehicle model (model manifest) associated with the decoder manifest.
     * </p>
     * 
     * @return The ARN of a vehicle model (model manifest) associated with the decoder manifest.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of a vehicle model (model manifest) associated with the decoder manifest.
     * </p>
     * 
     * @param arn
     *        The ARN of a vehicle model (model manifest) associated with the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecoderManifestSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ARN of a vehicle model (model manifest) associated with the decoder manifest.
     * </p>
     * 
     * @param modelManifestArn
     *        The ARN of a vehicle model (model manifest) associated with the decoder manifest.
     */

    public void setModelManifestArn(String modelManifestArn) {
        this.modelManifestArn = modelManifestArn;
    }

    /**
     * <p>
     * The ARN of a vehicle model (model manifest) associated with the decoder manifest.
     * </p>
     * 
     * @return The ARN of a vehicle model (model manifest) associated with the decoder manifest.
     */

    public String getModelManifestArn() {
        return this.modelManifestArn;
    }

    /**
     * <p>
     * The ARN of a vehicle model (model manifest) associated with the decoder manifest.
     * </p>
     * 
     * @param modelManifestArn
     *        The ARN of a vehicle model (model manifest) associated with the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecoderManifestSummary withModelManifestArn(String modelManifestArn) {
        setModelManifestArn(modelManifestArn);
        return this;
    }

    /**
     * <p>
     * A brief description of the decoder manifest.
     * </p>
     * 
     * @param description
     *        A brief description of the decoder manifest.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the decoder manifest.
     * </p>
     * 
     * @return A brief description of the decoder manifest.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the decoder manifest.
     * </p>
     * 
     * @param description
     *        A brief description of the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecoderManifestSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The state of the decoder manifest. If the status is <code>ACTIVE</code>, the decoder manifest can't be edited. If
     * the status is marked <code>DRAFT</code>, you can edit the decoder manifest.
     * </p>
     * 
     * @param status
     *        The state of the decoder manifest. If the status is <code>ACTIVE</code>, the decoder manifest can't be
     *        edited. If the status is marked <code>DRAFT</code>, you can edit the decoder manifest.
     * @see ManifestStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The state of the decoder manifest. If the status is <code>ACTIVE</code>, the decoder manifest can't be edited. If
     * the status is marked <code>DRAFT</code>, you can edit the decoder manifest.
     * </p>
     * 
     * @return The state of the decoder manifest. If the status is <code>ACTIVE</code>, the decoder manifest can't be
     *         edited. If the status is marked <code>DRAFT</code>, you can edit the decoder manifest.
     * @see ManifestStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The state of the decoder manifest. If the status is <code>ACTIVE</code>, the decoder manifest can't be edited. If
     * the status is marked <code>DRAFT</code>, you can edit the decoder manifest.
     * </p>
     * 
     * @param status
     *        The state of the decoder manifest. If the status is <code>ACTIVE</code>, the decoder manifest can't be
     *        edited. If the status is marked <code>DRAFT</code>, you can edit the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManifestStatus
     */

    public DecoderManifestSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The state of the decoder manifest. If the status is <code>ACTIVE</code>, the decoder manifest can't be edited. If
     * the status is marked <code>DRAFT</code>, you can edit the decoder manifest.
     * </p>
     * 
     * @param status
     *        The state of the decoder manifest. If the status is <code>ACTIVE</code>, the decoder manifest can't be
     *        edited. If the status is marked <code>DRAFT</code>, you can edit the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManifestStatus
     */

    public DecoderManifestSummary withStatus(ManifestStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time the decoder manifest was created in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param creationTime
     *        The time the decoder manifest was created in seconds since epoch (January 1, 1970 at midnight UTC time).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the decoder manifest was created in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @return The time the decoder manifest was created in seconds since epoch (January 1, 1970 at midnight UTC time).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the decoder manifest was created in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param creationTime
     *        The time the decoder manifest was created in seconds since epoch (January 1, 1970 at midnight UTC time).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecoderManifestSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time the decoder manifest was last updated in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param lastModificationTime
     *        The time the decoder manifest was last updated in seconds since epoch (January 1, 1970 at midnight UTC
     *        time).
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * The time the decoder manifest was last updated in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @return The time the decoder manifest was last updated in seconds since epoch (January 1, 1970 at midnight UTC
     *         time).
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * The time the decoder manifest was last updated in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param lastModificationTime
     *        The time the decoder manifest was last updated in seconds since epoch (January 1, 1970 at midnight UTC
     *        time).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecoderManifestSummary withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getModelManifestArn() != null)
            sb.append("ModelManifestArn: ").append(getModelManifestArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecoderManifestSummary == false)
            return false;
        DecoderManifestSummary other = (DecoderManifestSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getModelManifestArn() == null ^ this.getModelManifestArn() == null)
            return false;
        if (other.getModelManifestArn() != null && other.getModelManifestArn().equals(this.getModelManifestArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModificationTime() == null ^ this.getLastModificationTime() == null)
            return false;
        if (other.getLastModificationTime() != null && other.getLastModificationTime().equals(this.getLastModificationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getModelManifestArn() == null) ? 0 : getModelManifestArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public DecoderManifestSummary clone() {
        try {
            return (DecoderManifestSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.DecoderManifestSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
