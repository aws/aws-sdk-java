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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about assets that are related to one another.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/AssetRelationshipSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetRelationshipSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The assets that are related through an asset hierarchy.
     * </p>
     * <p>
     * This object is present if the <code>relationshipType</code> is <code>HIERARCHY</code>.
     * </p>
     */
    private AssetHierarchyInfo hierarchyInfo;
    /**
     * <p>
     * The relationship type of the assets in this relationship. This value is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HIERARCHY</code> – The assets are related through an asset hierarchy. If you specify this relationship
     * type, this asset relationship includes the <code>hierarchyInfo</code> object.
     * </p>
     * </li>
     * </ul>
     */
    private String relationshipType;

    /**
     * <p>
     * The assets that are related through an asset hierarchy.
     * </p>
     * <p>
     * This object is present if the <code>relationshipType</code> is <code>HIERARCHY</code>.
     * </p>
     * 
     * @param hierarchyInfo
     *        The assets that are related through an asset hierarchy.</p>
     *        <p>
     *        This object is present if the <code>relationshipType</code> is <code>HIERARCHY</code>.
     */

    public void setHierarchyInfo(AssetHierarchyInfo hierarchyInfo) {
        this.hierarchyInfo = hierarchyInfo;
    }

    /**
     * <p>
     * The assets that are related through an asset hierarchy.
     * </p>
     * <p>
     * This object is present if the <code>relationshipType</code> is <code>HIERARCHY</code>.
     * </p>
     * 
     * @return The assets that are related through an asset hierarchy.</p>
     *         <p>
     *         This object is present if the <code>relationshipType</code> is <code>HIERARCHY</code>.
     */

    public AssetHierarchyInfo getHierarchyInfo() {
        return this.hierarchyInfo;
    }

    /**
     * <p>
     * The assets that are related through an asset hierarchy.
     * </p>
     * <p>
     * This object is present if the <code>relationshipType</code> is <code>HIERARCHY</code>.
     * </p>
     * 
     * @param hierarchyInfo
     *        The assets that are related through an asset hierarchy.</p>
     *        <p>
     *        This object is present if the <code>relationshipType</code> is <code>HIERARCHY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetRelationshipSummary withHierarchyInfo(AssetHierarchyInfo hierarchyInfo) {
        setHierarchyInfo(hierarchyInfo);
        return this;
    }

    /**
     * <p>
     * The relationship type of the assets in this relationship. This value is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HIERARCHY</code> – The assets are related through an asset hierarchy. If you specify this relationship
     * type, this asset relationship includes the <code>hierarchyInfo</code> object.
     * </p>
     * </li>
     * </ul>
     * 
     * @param relationshipType
     *        The relationship type of the assets in this relationship. This value is one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HIERARCHY</code> – The assets are related through an asset hierarchy. If you specify this
     *        relationship type, this asset relationship includes the <code>hierarchyInfo</code> object.
     *        </p>
     *        </li>
     * @see AssetRelationshipType
     */

    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }

    /**
     * <p>
     * The relationship type of the assets in this relationship. This value is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HIERARCHY</code> – The assets are related through an asset hierarchy. If you specify this relationship
     * type, this asset relationship includes the <code>hierarchyInfo</code> object.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The relationship type of the assets in this relationship. This value is one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HIERARCHY</code> – The assets are related through an asset hierarchy. If you specify this
     *         relationship type, this asset relationship includes the <code>hierarchyInfo</code> object.
     *         </p>
     *         </li>
     * @see AssetRelationshipType
     */

    public String getRelationshipType() {
        return this.relationshipType;
    }

    /**
     * <p>
     * The relationship type of the assets in this relationship. This value is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HIERARCHY</code> – The assets are related through an asset hierarchy. If you specify this relationship
     * type, this asset relationship includes the <code>hierarchyInfo</code> object.
     * </p>
     * </li>
     * </ul>
     * 
     * @param relationshipType
     *        The relationship type of the assets in this relationship. This value is one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HIERARCHY</code> – The assets are related through an asset hierarchy. If you specify this
     *        relationship type, this asset relationship includes the <code>hierarchyInfo</code> object.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetRelationshipType
     */

    public AssetRelationshipSummary withRelationshipType(String relationshipType) {
        setRelationshipType(relationshipType);
        return this;
    }

    /**
     * <p>
     * The relationship type of the assets in this relationship. This value is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HIERARCHY</code> – The assets are related through an asset hierarchy. If you specify this relationship
     * type, this asset relationship includes the <code>hierarchyInfo</code> object.
     * </p>
     * </li>
     * </ul>
     * 
     * @param relationshipType
     *        The relationship type of the assets in this relationship. This value is one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HIERARCHY</code> – The assets are related through an asset hierarchy. If you specify this
     *        relationship type, this asset relationship includes the <code>hierarchyInfo</code> object.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetRelationshipType
     */

    public AssetRelationshipSummary withRelationshipType(AssetRelationshipType relationshipType) {
        this.relationshipType = relationshipType.toString();
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
        if (getHierarchyInfo() != null)
            sb.append("HierarchyInfo: ").append(getHierarchyInfo()).append(",");
        if (getRelationshipType() != null)
            sb.append("RelationshipType: ").append(getRelationshipType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetRelationshipSummary == false)
            return false;
        AssetRelationshipSummary other = (AssetRelationshipSummary) obj;
        if (other.getHierarchyInfo() == null ^ this.getHierarchyInfo() == null)
            return false;
        if (other.getHierarchyInfo() != null && other.getHierarchyInfo().equals(this.getHierarchyInfo()) == false)
            return false;
        if (other.getRelationshipType() == null ^ this.getRelationshipType() == null)
            return false;
        if (other.getRelationshipType() != null && other.getRelationshipType().equals(this.getRelationshipType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHierarchyInfo() == null) ? 0 : getHierarchyInfo().hashCode());
        hashCode = prime * hashCode + ((getRelationshipType() == null) ? 0 : getRelationshipType().hashCode());
        return hashCode;
    }

    @Override
    public AssetRelationshipSummary clone() {
        try {
            return (AssetRelationshipSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.AssetRelationshipSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
