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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DisassociateOpsItemRelatedItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateOpsItemRelatedItemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the OpsItem for which you want to delete an association between the OpsItem and a related resource.
     * </p>
     */
    private String opsItemId;
    /**
     * <p>
     * The ID of the association for which you want to delete an association between the OpsItem and a related resource.
     * </p>
     */
    private String associationId;

    /**
     * <p>
     * The ID of the OpsItem for which you want to delete an association between the OpsItem and a related resource.
     * </p>
     * 
     * @param opsItemId
     *        The ID of the OpsItem for which you want to delete an association between the OpsItem and a related
     *        resource.
     */

    public void setOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
    }

    /**
     * <p>
     * The ID of the OpsItem for which you want to delete an association between the OpsItem and a related resource.
     * </p>
     * 
     * @return The ID of the OpsItem for which you want to delete an association between the OpsItem and a related
     *         resource.
     */

    public String getOpsItemId() {
        return this.opsItemId;
    }

    /**
     * <p>
     * The ID of the OpsItem for which you want to delete an association between the OpsItem and a related resource.
     * </p>
     * 
     * @param opsItemId
     *        The ID of the OpsItem for which you want to delete an association between the OpsItem and a related
     *        resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateOpsItemRelatedItemRequest withOpsItemId(String opsItemId) {
        setOpsItemId(opsItemId);
        return this;
    }

    /**
     * <p>
     * The ID of the association for which you want to delete an association between the OpsItem and a related resource.
     * </p>
     * 
     * @param associationId
     *        The ID of the association for which you want to delete an association between the OpsItem and a related
     *        resource.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID of the association for which you want to delete an association between the OpsItem and a related resource.
     * </p>
     * 
     * @return The ID of the association for which you want to delete an association between the OpsItem and a related
     *         resource.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The ID of the association for which you want to delete an association between the OpsItem and a related resource.
     * </p>
     * 
     * @param associationId
     *        The ID of the association for which you want to delete an association between the OpsItem and a related
     *        resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateOpsItemRelatedItemRequest withAssociationId(String associationId) {
        setAssociationId(associationId);
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
        if (getOpsItemId() != null)
            sb.append("OpsItemId: ").append(getOpsItemId()).append(",");
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateOpsItemRelatedItemRequest == false)
            return false;
        DisassociateOpsItemRelatedItemRequest other = (DisassociateOpsItemRelatedItemRequest) obj;
        if (other.getOpsItemId() == null ^ this.getOpsItemId() == null)
            return false;
        if (other.getOpsItemId() != null && other.getOpsItemId().equals(this.getOpsItemId()) == false)
            return false;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOpsItemId() == null) ? 0 : getOpsItemId().hashCode());
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateOpsItemRelatedItemRequest clone() {
        return (DisassociateOpsItemRelatedItemRequest) super.clone();
    }

}
