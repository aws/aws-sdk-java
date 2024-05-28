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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A single principal-resource pair that has Lake Formation permissins enforced.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/LakeFormationOptInsInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LakeFormationOptInsInfo implements Serializable, Cloneable, StructuredPojo {

    private Resource resource;

    private DataLakePrincipal principal;
    /**
     * <p>
     * The last modified date and time of the record.
     * </p>
     */
    private java.util.Date lastModified;
    /**
     * <p>
     * The user who updated the record.
     * </p>
     */
    private String lastUpdatedBy;

    /**
     * @param resource
     */

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    /**
     * @return
     */

    public Resource getResource() {
        return this.resource;
    }

    /**
     * @param resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeFormationOptInsInfo withResource(Resource resource) {
        setResource(resource);
        return this;
    }

    /**
     * @param principal
     */

    public void setPrincipal(DataLakePrincipal principal) {
        this.principal = principal;
    }

    /**
     * @return
     */

    public DataLakePrincipal getPrincipal() {
        return this.principal;
    }

    /**
     * @param principal
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeFormationOptInsInfo withPrincipal(DataLakePrincipal principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * The last modified date and time of the record.
     * </p>
     * 
     * @param lastModified
     *        The last modified date and time of the record.
     */

    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The last modified date and time of the record.
     * </p>
     * 
     * @return The last modified date and time of the record.
     */

    public java.util.Date getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The last modified date and time of the record.
     * </p>
     * 
     * @param lastModified
     *        The last modified date and time of the record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeFormationOptInsInfo withLastModified(java.util.Date lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * The user who updated the record.
     * </p>
     * 
     * @param lastUpdatedBy
     *        The user who updated the record.
     */

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * <p>
     * The user who updated the record.
     * </p>
     * 
     * @return The user who updated the record.
     */

    public String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    /**
     * <p>
     * The user who updated the record.
     * </p>
     * 
     * @param lastUpdatedBy
     *        The user who updated the record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeFormationOptInsInfo withLastUpdatedBy(String lastUpdatedBy) {
        setLastUpdatedBy(lastUpdatedBy);
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
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getLastUpdatedBy() != null)
            sb.append("LastUpdatedBy: ").append(getLastUpdatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LakeFormationOptInsInfo == false)
            return false;
        LakeFormationOptInsInfo other = (LakeFormationOptInsInfo) obj;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getLastUpdatedBy() == null ^ this.getLastUpdatedBy() == null)
            return false;
        if (other.getLastUpdatedBy() != null && other.getLastUpdatedBy().equals(this.getLastUpdatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedBy() == null) ? 0 : getLastUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public LakeFormationOptInsInfo clone() {
        try {
            return (LakeFormationOptInsInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.LakeFormationOptInsInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
