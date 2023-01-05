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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The space's details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/SpaceDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpaceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the associated Domain.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The name of the space.
     * </p>
     */
    private String spaceName;
    /**
     * <p>
     * The status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The creation time.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last modified time.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The ID of the associated Domain.
     * </p>
     * 
     * @param domainId
     *        The ID of the associated Domain.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the associated Domain.
     * </p>
     * 
     * @return The ID of the associated Domain.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the associated Domain.
     * </p>
     * 
     * @param domainId
     *        The ID of the associated Domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceDetails withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The name of the space.
     * </p>
     * 
     * @param spaceName
     *        The name of the space.
     */

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    /**
     * <p>
     * The name of the space.
     * </p>
     * 
     * @return The name of the space.
     */

    public String getSpaceName() {
        return this.spaceName;
    }

    /**
     * <p>
     * The name of the space.
     * </p>
     * 
     * @param spaceName
     *        The name of the space.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceDetails withSpaceName(String spaceName) {
        setSpaceName(spaceName);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @see SpaceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @return The status.
     * @see SpaceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpaceStatus
     */

    public SpaceDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpaceStatus
     */

    public SpaceDetails withStatus(SpaceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @return The creation time.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceDetails withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last modified time.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last modified time.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last modified time.
     * </p>
     * 
     * @return The last modified time.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The last modified time.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last modified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceDetails withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getSpaceName() != null)
            sb.append("SpaceName: ").append(getSpaceName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpaceDetails == false)
            return false;
        SpaceDetails other = (SpaceDetails) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getSpaceName() == null ^ this.getSpaceName() == null)
            return false;
        if (other.getSpaceName() != null && other.getSpaceName().equals(this.getSpaceName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getSpaceName() == null) ? 0 : getSpaceName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public SpaceDetails clone() {
        try {
            return (SpaceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.SpaceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
