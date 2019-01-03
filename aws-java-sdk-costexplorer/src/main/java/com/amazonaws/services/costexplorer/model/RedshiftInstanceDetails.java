/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the Amazon Redshift instances that AWS recommends that you purchase.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/RedshiftInstanceDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftInstanceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The instance family of the recommended reservation.
     * </p>
     */
    private String family;
    /**
     * <p>
     * The type of node that AWS recommends.
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The AWS Region of the recommended reservation.
     * </p>
     */
    private String region;
    /**
     * <p>
     * Whether the recommendation is for a current-generation instance.
     * </p>
     */
    private Boolean currentGeneration;
    /**
     * <p>
     * Whether the recommended reservation is size flexible.
     * </p>
     */
    private Boolean sizeFlexEligible;

    /**
     * <p>
     * The instance family of the recommended reservation.
     * </p>
     * 
     * @param family
     *        The instance family of the recommended reservation.
     */

    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * <p>
     * The instance family of the recommended reservation.
     * </p>
     * 
     * @return The instance family of the recommended reservation.
     */

    public String getFamily() {
        return this.family;
    }

    /**
     * <p>
     * The instance family of the recommended reservation.
     * </p>
     * 
     * @param family
     *        The instance family of the recommended reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftInstanceDetails withFamily(String family) {
        setFamily(family);
        return this;
    }

    /**
     * <p>
     * The type of node that AWS recommends.
     * </p>
     * 
     * @param nodeType
     *        The type of node that AWS recommends.
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The type of node that AWS recommends.
     * </p>
     * 
     * @return The type of node that AWS recommends.
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The type of node that AWS recommends.
     * </p>
     * 
     * @param nodeType
     *        The type of node that AWS recommends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftInstanceDetails withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The AWS Region of the recommended reservation.
     * </p>
     * 
     * @param region
     *        The AWS Region of the recommended reservation.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region of the recommended reservation.
     * </p>
     * 
     * @return The AWS Region of the recommended reservation.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS Region of the recommended reservation.
     * </p>
     * 
     * @param region
     *        The AWS Region of the recommended reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftInstanceDetails withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * Whether the recommendation is for a current-generation instance.
     * </p>
     * 
     * @param currentGeneration
     *        Whether the recommendation is for a current-generation instance.
     */

    public void setCurrentGeneration(Boolean currentGeneration) {
        this.currentGeneration = currentGeneration;
    }

    /**
     * <p>
     * Whether the recommendation is for a current-generation instance.
     * </p>
     * 
     * @return Whether the recommendation is for a current-generation instance.
     */

    public Boolean getCurrentGeneration() {
        return this.currentGeneration;
    }

    /**
     * <p>
     * Whether the recommendation is for a current-generation instance.
     * </p>
     * 
     * @param currentGeneration
     *        Whether the recommendation is for a current-generation instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftInstanceDetails withCurrentGeneration(Boolean currentGeneration) {
        setCurrentGeneration(currentGeneration);
        return this;
    }

    /**
     * <p>
     * Whether the recommendation is for a current-generation instance.
     * </p>
     * 
     * @return Whether the recommendation is for a current-generation instance.
     */

    public Boolean isCurrentGeneration() {
        return this.currentGeneration;
    }

    /**
     * <p>
     * Whether the recommended reservation is size flexible.
     * </p>
     * 
     * @param sizeFlexEligible
     *        Whether the recommended reservation is size flexible.
     */

    public void setSizeFlexEligible(Boolean sizeFlexEligible) {
        this.sizeFlexEligible = sizeFlexEligible;
    }

    /**
     * <p>
     * Whether the recommended reservation is size flexible.
     * </p>
     * 
     * @return Whether the recommended reservation is size flexible.
     */

    public Boolean getSizeFlexEligible() {
        return this.sizeFlexEligible;
    }

    /**
     * <p>
     * Whether the recommended reservation is size flexible.
     * </p>
     * 
     * @param sizeFlexEligible
     *        Whether the recommended reservation is size flexible.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftInstanceDetails withSizeFlexEligible(Boolean sizeFlexEligible) {
        setSizeFlexEligible(sizeFlexEligible);
        return this;
    }

    /**
     * <p>
     * Whether the recommended reservation is size flexible.
     * </p>
     * 
     * @return Whether the recommended reservation is size flexible.
     */

    public Boolean isSizeFlexEligible() {
        return this.sizeFlexEligible;
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
        if (getFamily() != null)
            sb.append("Family: ").append(getFamily()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getCurrentGeneration() != null)
            sb.append("CurrentGeneration: ").append(getCurrentGeneration()).append(",");
        if (getSizeFlexEligible() != null)
            sb.append("SizeFlexEligible: ").append(getSizeFlexEligible());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftInstanceDetails == false)
            return false;
        RedshiftInstanceDetails other = (RedshiftInstanceDetails) obj;
        if (other.getFamily() == null ^ this.getFamily() == null)
            return false;
        if (other.getFamily() != null && other.getFamily().equals(this.getFamily()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getCurrentGeneration() == null ^ this.getCurrentGeneration() == null)
            return false;
        if (other.getCurrentGeneration() != null && other.getCurrentGeneration().equals(this.getCurrentGeneration()) == false)
            return false;
        if (other.getSizeFlexEligible() == null ^ this.getSizeFlexEligible() == null)
            return false;
        if (other.getSizeFlexEligible() != null && other.getSizeFlexEligible().equals(this.getSizeFlexEligible()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getCurrentGeneration() == null) ? 0 : getCurrentGeneration().hashCode());
        hashCode = prime * hashCode + ((getSizeFlexEligible() == null) ? 0 : getSizeFlexEligible().hashCode());
        return hashCode;
    }

    @Override
    public RedshiftInstanceDetails clone() {
        try {
            return (RedshiftInstanceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.RedshiftInstanceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
