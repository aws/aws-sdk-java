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
 * Information about a vehicle model (model manifest). You can use the API operation to return this information about
 * multiple vehicle models.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ModelManifestSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelManifestSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the vehicle model.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vehicle model.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ARN of the signal catalog associated with the vehicle model.
     * </p>
     */
    private String signalCatalogArn;
    /**
     * <p>
     * A brief description of the vehicle model.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The state of the vehicle model. If the status is <code>ACTIVE</code>, the vehicle model can't be edited. If the
     * status is <code>DRAFT</code>, you can edit the vehicle model.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time the vehicle model was created, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time the vehicle model was last updated, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     */
    private java.util.Date lastModificationTime;

    /**
     * <p>
     * The name of the vehicle model.
     * </p>
     * 
     * @param name
     *        The name of the vehicle model.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the vehicle model.
     * </p>
     * 
     * @return The name of the vehicle model.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the vehicle model.
     * </p>
     * 
     * @param name
     *        The name of the vehicle model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelManifestSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vehicle model.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the vehicle model.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vehicle model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the vehicle model.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vehicle model.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the vehicle model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelManifestSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ARN of the signal catalog associated with the vehicle model.
     * </p>
     * 
     * @param signalCatalogArn
     *        The ARN of the signal catalog associated with the vehicle model.
     */

    public void setSignalCatalogArn(String signalCatalogArn) {
        this.signalCatalogArn = signalCatalogArn;
    }

    /**
     * <p>
     * The ARN of the signal catalog associated with the vehicle model.
     * </p>
     * 
     * @return The ARN of the signal catalog associated with the vehicle model.
     */

    public String getSignalCatalogArn() {
        return this.signalCatalogArn;
    }

    /**
     * <p>
     * The ARN of the signal catalog associated with the vehicle model.
     * </p>
     * 
     * @param signalCatalogArn
     *        The ARN of the signal catalog associated with the vehicle model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelManifestSummary withSignalCatalogArn(String signalCatalogArn) {
        setSignalCatalogArn(signalCatalogArn);
        return this;
    }

    /**
     * <p>
     * A brief description of the vehicle model.
     * </p>
     * 
     * @param description
     *        A brief description of the vehicle model.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the vehicle model.
     * </p>
     * 
     * @return A brief description of the vehicle model.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the vehicle model.
     * </p>
     * 
     * @param description
     *        A brief description of the vehicle model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelManifestSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The state of the vehicle model. If the status is <code>ACTIVE</code>, the vehicle model can't be edited. If the
     * status is <code>DRAFT</code>, you can edit the vehicle model.
     * </p>
     * 
     * @param status
     *        The state of the vehicle model. If the status is <code>ACTIVE</code>, the vehicle model can't be edited.
     *        If the status is <code>DRAFT</code>, you can edit the vehicle model.
     * @see ManifestStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The state of the vehicle model. If the status is <code>ACTIVE</code>, the vehicle model can't be edited. If the
     * status is <code>DRAFT</code>, you can edit the vehicle model.
     * </p>
     * 
     * @return The state of the vehicle model. If the status is <code>ACTIVE</code>, the vehicle model can't be edited.
     *         If the status is <code>DRAFT</code>, you can edit the vehicle model.
     * @see ManifestStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The state of the vehicle model. If the status is <code>ACTIVE</code>, the vehicle model can't be edited. If the
     * status is <code>DRAFT</code>, you can edit the vehicle model.
     * </p>
     * 
     * @param status
     *        The state of the vehicle model. If the status is <code>ACTIVE</code>, the vehicle model can't be edited.
     *        If the status is <code>DRAFT</code>, you can edit the vehicle model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManifestStatus
     */

    public ModelManifestSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The state of the vehicle model. If the status is <code>ACTIVE</code>, the vehicle model can't be edited. If the
     * status is <code>DRAFT</code>, you can edit the vehicle model.
     * </p>
     * 
     * @param status
     *        The state of the vehicle model. If the status is <code>ACTIVE</code>, the vehicle model can't be edited.
     *        If the status is <code>DRAFT</code>, you can edit the vehicle model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManifestStatus
     */

    public ModelManifestSummary withStatus(ManifestStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time the vehicle model was created, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param creationTime
     *        The time the vehicle model was created, in seconds since epoch (January 1, 1970 at midnight UTC time).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the vehicle model was created, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @return The time the vehicle model was created, in seconds since epoch (January 1, 1970 at midnight UTC time).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the vehicle model was created, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param creationTime
     *        The time the vehicle model was created, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelManifestSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time the vehicle model was last updated, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param lastModificationTime
     *        The time the vehicle model was last updated, in seconds since epoch (January 1, 1970 at midnight UTC
     *        time).
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * The time the vehicle model was last updated, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @return The time the vehicle model was last updated, in seconds since epoch (January 1, 1970 at midnight UTC
     *         time).
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * The time the vehicle model was last updated, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param lastModificationTime
     *        The time the vehicle model was last updated, in seconds since epoch (January 1, 1970 at midnight UTC
     *        time).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelManifestSummary withLastModificationTime(java.util.Date lastModificationTime) {
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
        if (getSignalCatalogArn() != null)
            sb.append("SignalCatalogArn: ").append(getSignalCatalogArn()).append(",");
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

        if (obj instanceof ModelManifestSummary == false)
            return false;
        ModelManifestSummary other = (ModelManifestSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getSignalCatalogArn() == null ^ this.getSignalCatalogArn() == null)
            return false;
        if (other.getSignalCatalogArn() != null && other.getSignalCatalogArn().equals(this.getSignalCatalogArn()) == false)
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
        hashCode = prime * hashCode + ((getSignalCatalogArn() == null) ? 0 : getSignalCatalogArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public ModelManifestSummary clone() {
        try {
            return (ModelManifestSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.ModelManifestSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
