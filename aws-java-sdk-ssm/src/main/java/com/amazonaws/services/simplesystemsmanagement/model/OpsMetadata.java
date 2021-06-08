/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Operational metadata for an application in Application Manager.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/OpsMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpsMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Application Manager application.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the OpsMetadata Object or blob.
     * </p>
     */
    private String opsMetadataArn;
    /**
     * <p>
     * The date the OpsMetadata object was last updated.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The user name who last updated the OpsMetadata object.
     * </p>
     */
    private String lastModifiedUser;
    /**
     * <p>
     * The date the OpsMetadata objects was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The ID of the Application Manager application.
     * </p>
     * 
     * @param resourceId
     *        The ID of the Application Manager application.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the Application Manager application.
     * </p>
     * 
     * @return The ID of the Application Manager application.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the Application Manager application.
     * </p>
     * 
     * @param resourceId
     *        The ID of the Application Manager application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsMetadata withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the OpsMetadata Object or blob.
     * </p>
     * 
     * @param opsMetadataArn
     *        The Amazon Resource Name (ARN) of the OpsMetadata Object or blob.
     */

    public void setOpsMetadataArn(String opsMetadataArn) {
        this.opsMetadataArn = opsMetadataArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the OpsMetadata Object or blob.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the OpsMetadata Object or blob.
     */

    public String getOpsMetadataArn() {
        return this.opsMetadataArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the OpsMetadata Object or blob.
     * </p>
     * 
     * @param opsMetadataArn
     *        The Amazon Resource Name (ARN) of the OpsMetadata Object or blob.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsMetadata withOpsMetadataArn(String opsMetadataArn) {
        setOpsMetadataArn(opsMetadataArn);
        return this;
    }

    /**
     * <p>
     * The date the OpsMetadata object was last updated.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the OpsMetadata object was last updated.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date the OpsMetadata object was last updated.
     * </p>
     * 
     * @return The date the OpsMetadata object was last updated.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date the OpsMetadata object was last updated.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the OpsMetadata object was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsMetadata withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The user name who last updated the OpsMetadata object.
     * </p>
     * 
     * @param lastModifiedUser
     *        The user name who last updated the OpsMetadata object.
     */

    public void setLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }

    /**
     * <p>
     * The user name who last updated the OpsMetadata object.
     * </p>
     * 
     * @return The user name who last updated the OpsMetadata object.
     */

    public String getLastModifiedUser() {
        return this.lastModifiedUser;
    }

    /**
     * <p>
     * The user name who last updated the OpsMetadata object.
     * </p>
     * 
     * @param lastModifiedUser
     *        The user name who last updated the OpsMetadata object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsMetadata withLastModifiedUser(String lastModifiedUser) {
        setLastModifiedUser(lastModifiedUser);
        return this;
    }

    /**
     * <p>
     * The date the OpsMetadata objects was created.
     * </p>
     * 
     * @param creationDate
     *        The date the OpsMetadata objects was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the OpsMetadata objects was created.
     * </p>
     * 
     * @return The date the OpsMetadata objects was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the OpsMetadata objects was created.
     * </p>
     * 
     * @param creationDate
     *        The date the OpsMetadata objects was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsMetadata withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getOpsMetadataArn() != null)
            sb.append("OpsMetadataArn: ").append(getOpsMetadataArn()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getLastModifiedUser() != null)
            sb.append("LastModifiedUser: ").append(getLastModifiedUser()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpsMetadata == false)
            return false;
        OpsMetadata other = (OpsMetadata) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getOpsMetadataArn() == null ^ this.getOpsMetadataArn() == null)
            return false;
        if (other.getOpsMetadataArn() != null && other.getOpsMetadataArn().equals(this.getOpsMetadataArn()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getLastModifiedUser() == null ^ this.getLastModifiedUser() == null)
            return false;
        if (other.getLastModifiedUser() != null && other.getLastModifiedUser().equals(this.getLastModifiedUser()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getOpsMetadataArn() == null) ? 0 : getOpsMetadataArn().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedUser() == null) ? 0 : getLastModifiedUser().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public OpsMetadata clone() {
        try {
            return (OpsMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.OpsMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
