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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/BatchAssociateServiceActionWithProvisioningArtifact"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchAssociateServiceActionWithProvisioningArtifactRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * One or more associations, each consisting of the Action ID, the Product ID, and the Provisioning Artifact ID.
     * </p>
     */
    private java.util.List<ServiceActionAssociation> serviceActionAssociations;
    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     */
    private String acceptLanguage;

    /**
     * <p>
     * One or more associations, each consisting of the Action ID, the Product ID, and the Provisioning Artifact ID.
     * </p>
     * 
     * @return One or more associations, each consisting of the Action ID, the Product ID, and the Provisioning Artifact
     *         ID.
     */

    public java.util.List<ServiceActionAssociation> getServiceActionAssociations() {
        return serviceActionAssociations;
    }

    /**
     * <p>
     * One or more associations, each consisting of the Action ID, the Product ID, and the Provisioning Artifact ID.
     * </p>
     * 
     * @param serviceActionAssociations
     *        One or more associations, each consisting of the Action ID, the Product ID, and the Provisioning Artifact
     *        ID.
     */

    public void setServiceActionAssociations(java.util.Collection<ServiceActionAssociation> serviceActionAssociations) {
        if (serviceActionAssociations == null) {
            this.serviceActionAssociations = null;
            return;
        }

        this.serviceActionAssociations = new java.util.ArrayList<ServiceActionAssociation>(serviceActionAssociations);
    }

    /**
     * <p>
     * One or more associations, each consisting of the Action ID, the Product ID, and the Provisioning Artifact ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceActionAssociations(java.util.Collection)} or
     * {@link #withServiceActionAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param serviceActionAssociations
     *        One or more associations, each consisting of the Action ID, the Product ID, and the Provisioning Artifact
     *        ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAssociateServiceActionWithProvisioningArtifactRequest withServiceActionAssociations(ServiceActionAssociation... serviceActionAssociations) {
        if (this.serviceActionAssociations == null) {
            setServiceActionAssociations(new java.util.ArrayList<ServiceActionAssociation>(serviceActionAssociations.length));
        }
        for (ServiceActionAssociation ele : serviceActionAssociations) {
            this.serviceActionAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more associations, each consisting of the Action ID, the Product ID, and the Provisioning Artifact ID.
     * </p>
     * 
     * @param serviceActionAssociations
     *        One or more associations, each consisting of the Action ID, the Product ID, and the Provisioning Artifact
     *        ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAssociateServiceActionWithProvisioningArtifactRequest withServiceActionAssociations(
            java.util.Collection<ServiceActionAssociation> serviceActionAssociations) {
        setServiceActionAssociations(serviceActionAssociations);
        return this;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @return The language code.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAssociateServiceActionWithProvisioningArtifactRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
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
        if (getServiceActionAssociations() != null)
            sb.append("ServiceActionAssociations: ").append(getServiceActionAssociations()).append(",");
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchAssociateServiceActionWithProvisioningArtifactRequest == false)
            return false;
        BatchAssociateServiceActionWithProvisioningArtifactRequest other = (BatchAssociateServiceActionWithProvisioningArtifactRequest) obj;
        if (other.getServiceActionAssociations() == null ^ this.getServiceActionAssociations() == null)
            return false;
        if (other.getServiceActionAssociations() != null && other.getServiceActionAssociations().equals(this.getServiceActionAssociations()) == false)
            return false;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceActionAssociations() == null) ? 0 : getServiceActionAssociations().hashCode());
        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        return hashCode;
    }

    @Override
    public BatchAssociateServiceActionWithProvisioningArtifactRequest clone() {
        return (BatchAssociateServiceActionWithProvisioningArtifactRequest) super.clone();
    }

}
