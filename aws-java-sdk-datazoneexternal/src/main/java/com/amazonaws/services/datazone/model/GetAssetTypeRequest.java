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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetAssetType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssetTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the asset type exists.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The ID of the asset type.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The revision of the asset type.
     * </p>
     */
    private String revision;

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the asset type exists.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain in which the asset type exists.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the asset type exists.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which the asset type exists.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the asset type exists.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain in which the asset type exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetTypeRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The ID of the asset type.
     * </p>
     * 
     * @param identifier
     *        The ID of the asset type.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The ID of the asset type.
     * </p>
     * 
     * @return The ID of the asset type.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The ID of the asset type.
     * </p>
     * 
     * @param identifier
     *        The ID of the asset type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetTypeRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The revision of the asset type.
     * </p>
     * 
     * @param revision
     *        The revision of the asset type.
     */

    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision of the asset type.
     * </p>
     * 
     * @return The revision of the asset type.
     */

    public String getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision of the asset type.
     * </p>
     * 
     * @param revision
     *        The revision of the asset type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetTypeRequest withRevision(String revision) {
        setRevision(revision);
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
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssetTypeRequest == false)
            return false;
        GetAssetTypeRequest other = (GetAssetTypeRequest) obj;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public GetAssetTypeRequest clone() {
        return (GetAssetTypeRequest) super.clone();
    }

}
