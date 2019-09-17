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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/BatchDisassociateServiceActionFromProvisioningArtifact"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDisassociateServiceActionFromProvisioningArtifactResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * An object that contains a list of errors, along with information to help you identify the self-service action.
     * </p>
     */
    private java.util.List<FailedServiceActionAssociation> failedServiceActionAssociations;

    /**
     * <p>
     * An object that contains a list of errors, along with information to help you identify the self-service action.
     * </p>
     * 
     * @return An object that contains a list of errors, along with information to help you identify the self-service
     *         action.
     */

    public java.util.List<FailedServiceActionAssociation> getFailedServiceActionAssociations() {
        return failedServiceActionAssociations;
    }

    /**
     * <p>
     * An object that contains a list of errors, along with information to help you identify the self-service action.
     * </p>
     * 
     * @param failedServiceActionAssociations
     *        An object that contains a list of errors, along with information to help you identify the self-service
     *        action.
     */

    public void setFailedServiceActionAssociations(java.util.Collection<FailedServiceActionAssociation> failedServiceActionAssociations) {
        if (failedServiceActionAssociations == null) {
            this.failedServiceActionAssociations = null;
            return;
        }

        this.failedServiceActionAssociations = new java.util.ArrayList<FailedServiceActionAssociation>(failedServiceActionAssociations);
    }

    /**
     * <p>
     * An object that contains a list of errors, along with information to help you identify the self-service action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedServiceActionAssociations(java.util.Collection)} or
     * {@link #withFailedServiceActionAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param failedServiceActionAssociations
     *        An object that contains a list of errors, along with information to help you identify the self-service
     *        action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateServiceActionFromProvisioningArtifactResult withFailedServiceActionAssociations(
            FailedServiceActionAssociation... failedServiceActionAssociations) {
        if (this.failedServiceActionAssociations == null) {
            setFailedServiceActionAssociations(new java.util.ArrayList<FailedServiceActionAssociation>(failedServiceActionAssociations.length));
        }
        for (FailedServiceActionAssociation ele : failedServiceActionAssociations) {
            this.failedServiceActionAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that contains a list of errors, along with information to help you identify the self-service action.
     * </p>
     * 
     * @param failedServiceActionAssociations
     *        An object that contains a list of errors, along with information to help you identify the self-service
     *        action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateServiceActionFromProvisioningArtifactResult withFailedServiceActionAssociations(
            java.util.Collection<FailedServiceActionAssociation> failedServiceActionAssociations) {
        setFailedServiceActionAssociations(failedServiceActionAssociations);
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
        if (getFailedServiceActionAssociations() != null)
            sb.append("FailedServiceActionAssociations: ").append(getFailedServiceActionAssociations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDisassociateServiceActionFromProvisioningArtifactResult == false)
            return false;
        BatchDisassociateServiceActionFromProvisioningArtifactResult other = (BatchDisassociateServiceActionFromProvisioningArtifactResult) obj;
        if (other.getFailedServiceActionAssociations() == null ^ this.getFailedServiceActionAssociations() == null)
            return false;
        if (other.getFailedServiceActionAssociations() != null
                && other.getFailedServiceActionAssociations().equals(this.getFailedServiceActionAssociations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedServiceActionAssociations() == null) ? 0 : getFailedServiceActionAssociations().hashCode());
        return hashCode;
    }

    @Override
    public BatchDisassociateServiceActionFromProvisioningArtifactResult clone() {
        try {
            return (BatchDisassociateServiceActionFromProvisioningArtifactResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
