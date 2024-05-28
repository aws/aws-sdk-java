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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/PutSolNetworkPackageContent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSolNetworkPackageContentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Network package ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Network package ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Network package metadata.
     * </p>
     */
    private PutSolNetworkPackageContentMetadata metadata;
    /**
     * <p>
     * Network service descriptor ID.
     * </p>
     */
    private String nsdId;
    /**
     * <p>
     * Network service descriptor name.
     * </p>
     */
    private String nsdName;
    /**
     * <p>
     * Network service descriptor version.
     * </p>
     */
    private String nsdVersion;
    /**
     * <p>
     * Function package IDs.
     * </p>
     */
    private java.util.List<String> vnfPkgIds;

    /**
     * <p>
     * Network package ARN.
     * </p>
     * 
     * @param arn
     *        Network package ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Network package ARN.
     * </p>
     * 
     * @return Network package ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Network package ARN.
     * </p>
     * 
     * @param arn
     *        Network package ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSolNetworkPackageContentResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Network package ID.
     * </p>
     * 
     * @param id
     *        Network package ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Network package ID.
     * </p>
     * 
     * @return Network package ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Network package ID.
     * </p>
     * 
     * @param id
     *        Network package ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSolNetworkPackageContentResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Network package metadata.
     * </p>
     * 
     * @param metadata
     *        Network package metadata.
     */

    public void setMetadata(PutSolNetworkPackageContentMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Network package metadata.
     * </p>
     * 
     * @return Network package metadata.
     */

    public PutSolNetworkPackageContentMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * Network package metadata.
     * </p>
     * 
     * @param metadata
     *        Network package metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSolNetworkPackageContentResult withMetadata(PutSolNetworkPackageContentMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * Network service descriptor ID.
     * </p>
     * 
     * @param nsdId
     *        Network service descriptor ID.
     */

    public void setNsdId(String nsdId) {
        this.nsdId = nsdId;
    }

    /**
     * <p>
     * Network service descriptor ID.
     * </p>
     * 
     * @return Network service descriptor ID.
     */

    public String getNsdId() {
        return this.nsdId;
    }

    /**
     * <p>
     * Network service descriptor ID.
     * </p>
     * 
     * @param nsdId
     *        Network service descriptor ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSolNetworkPackageContentResult withNsdId(String nsdId) {
        setNsdId(nsdId);
        return this;
    }

    /**
     * <p>
     * Network service descriptor name.
     * </p>
     * 
     * @param nsdName
     *        Network service descriptor name.
     */

    public void setNsdName(String nsdName) {
        this.nsdName = nsdName;
    }

    /**
     * <p>
     * Network service descriptor name.
     * </p>
     * 
     * @return Network service descriptor name.
     */

    public String getNsdName() {
        return this.nsdName;
    }

    /**
     * <p>
     * Network service descriptor name.
     * </p>
     * 
     * @param nsdName
     *        Network service descriptor name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSolNetworkPackageContentResult withNsdName(String nsdName) {
        setNsdName(nsdName);
        return this;
    }

    /**
     * <p>
     * Network service descriptor version.
     * </p>
     * 
     * @param nsdVersion
     *        Network service descriptor version.
     */

    public void setNsdVersion(String nsdVersion) {
        this.nsdVersion = nsdVersion;
    }

    /**
     * <p>
     * Network service descriptor version.
     * </p>
     * 
     * @return Network service descriptor version.
     */

    public String getNsdVersion() {
        return this.nsdVersion;
    }

    /**
     * <p>
     * Network service descriptor version.
     * </p>
     * 
     * @param nsdVersion
     *        Network service descriptor version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSolNetworkPackageContentResult withNsdVersion(String nsdVersion) {
        setNsdVersion(nsdVersion);
        return this;
    }

    /**
     * <p>
     * Function package IDs.
     * </p>
     * 
     * @return Function package IDs.
     */

    public java.util.List<String> getVnfPkgIds() {
        return vnfPkgIds;
    }

    /**
     * <p>
     * Function package IDs.
     * </p>
     * 
     * @param vnfPkgIds
     *        Function package IDs.
     */

    public void setVnfPkgIds(java.util.Collection<String> vnfPkgIds) {
        if (vnfPkgIds == null) {
            this.vnfPkgIds = null;
            return;
        }

        this.vnfPkgIds = new java.util.ArrayList<String>(vnfPkgIds);
    }

    /**
     * <p>
     * Function package IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVnfPkgIds(java.util.Collection)} or {@link #withVnfPkgIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vnfPkgIds
     *        Function package IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSolNetworkPackageContentResult withVnfPkgIds(String... vnfPkgIds) {
        if (this.vnfPkgIds == null) {
            setVnfPkgIds(new java.util.ArrayList<String>(vnfPkgIds.length));
        }
        for (String ele : vnfPkgIds) {
            this.vnfPkgIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Function package IDs.
     * </p>
     * 
     * @param vnfPkgIds
     *        Function package IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSolNetworkPackageContentResult withVnfPkgIds(java.util.Collection<String> vnfPkgIds) {
        setVnfPkgIds(vnfPkgIds);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getNsdId() != null)
            sb.append("NsdId: ").append(getNsdId()).append(",");
        if (getNsdName() != null)
            sb.append("NsdName: ").append(getNsdName()).append(",");
        if (getNsdVersion() != null)
            sb.append("NsdVersion: ").append(getNsdVersion()).append(",");
        if (getVnfPkgIds() != null)
            sb.append("VnfPkgIds: ").append(getVnfPkgIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSolNetworkPackageContentResult == false)
            return false;
        PutSolNetworkPackageContentResult other = (PutSolNetworkPackageContentResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getNsdId() == null ^ this.getNsdId() == null)
            return false;
        if (other.getNsdId() != null && other.getNsdId().equals(this.getNsdId()) == false)
            return false;
        if (other.getNsdName() == null ^ this.getNsdName() == null)
            return false;
        if (other.getNsdName() != null && other.getNsdName().equals(this.getNsdName()) == false)
            return false;
        if (other.getNsdVersion() == null ^ this.getNsdVersion() == null)
            return false;
        if (other.getNsdVersion() != null && other.getNsdVersion().equals(this.getNsdVersion()) == false)
            return false;
        if (other.getVnfPkgIds() == null ^ this.getVnfPkgIds() == null)
            return false;
        if (other.getVnfPkgIds() != null && other.getVnfPkgIds().equals(this.getVnfPkgIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getNsdId() == null) ? 0 : getNsdId().hashCode());
        hashCode = prime * hashCode + ((getNsdName() == null) ? 0 : getNsdName().hashCode());
        hashCode = prime * hashCode + ((getNsdVersion() == null) ? 0 : getNsdVersion().hashCode());
        hashCode = prime * hashCode + ((getVnfPkgIds() == null) ? 0 : getVnfPkgIds().hashCode());
        return hashCode;
    }

    @Override
    public PutSolNetworkPackageContentResult clone() {
        try {
            return (PutSolNetworkPackageContentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
