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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The authorized targets that are associated with a service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AuthorizedTargetsByService"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizedTargetsByService implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon Web Services service.
     * </p>
     */
    private String service;
    /**
     * <p>
     * Aist of authorized targets that are represented by IAM Identity Center application ARNs.
     * </p>
     */
    private java.util.List<String> authorizedTargets;

    /**
     * <p>
     * The name of the Amazon Web Services service.
     * </p>
     * 
     * @param service
     *        The name of the Amazon Web Services service.
     * @see ServiceType
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The name of the Amazon Web Services service.
     * </p>
     * 
     * @return The name of the Amazon Web Services service.
     * @see ServiceType
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The name of the Amazon Web Services service.
     * </p>
     * 
     * @param service
     *        The name of the Amazon Web Services service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public AuthorizedTargetsByService withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Web Services service.
     * </p>
     * 
     * @param service
     *        The name of the Amazon Web Services service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public AuthorizedTargetsByService withService(ServiceType service) {
        this.service = service.toString();
        return this;
    }

    /**
     * <p>
     * Aist of authorized targets that are represented by IAM Identity Center application ARNs.
     * </p>
     * 
     * @return Aist of authorized targets that are represented by IAM Identity Center application ARNs.
     */

    public java.util.List<String> getAuthorizedTargets() {
        return authorizedTargets;
    }

    /**
     * <p>
     * Aist of authorized targets that are represented by IAM Identity Center application ARNs.
     * </p>
     * 
     * @param authorizedTargets
     *        Aist of authorized targets that are represented by IAM Identity Center application ARNs.
     */

    public void setAuthorizedTargets(java.util.Collection<String> authorizedTargets) {
        if (authorizedTargets == null) {
            this.authorizedTargets = null;
            return;
        }

        this.authorizedTargets = new java.util.ArrayList<String>(authorizedTargets);
    }

    /**
     * <p>
     * Aist of authorized targets that are represented by IAM Identity Center application ARNs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthorizedTargets(java.util.Collection)} or {@link #withAuthorizedTargets(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param authorizedTargets
     *        Aist of authorized targets that are represented by IAM Identity Center application ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizedTargetsByService withAuthorizedTargets(String... authorizedTargets) {
        if (this.authorizedTargets == null) {
            setAuthorizedTargets(new java.util.ArrayList<String>(authorizedTargets.length));
        }
        for (String ele : authorizedTargets) {
            this.authorizedTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Aist of authorized targets that are represented by IAM Identity Center application ARNs.
     * </p>
     * 
     * @param authorizedTargets
     *        Aist of authorized targets that are represented by IAM Identity Center application ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizedTargetsByService withAuthorizedTargets(java.util.Collection<String> authorizedTargets) {
        setAuthorizedTargets(authorizedTargets);
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
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getAuthorizedTargets() != null)
            sb.append("AuthorizedTargets: ").append(getAuthorizedTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizedTargetsByService == false)
            return false;
        AuthorizedTargetsByService other = (AuthorizedTargetsByService) obj;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getAuthorizedTargets() == null ^ this.getAuthorizedTargets() == null)
            return false;
        if (other.getAuthorizedTargets() != null && other.getAuthorizedTargets().equals(this.getAuthorizedTargets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getAuthorizedTargets() == null) ? 0 : getAuthorizedTargets().hashCode());
        return hashCode;
    }

    @Override
    public AuthorizedTargetsByService clone() {
        try {
            return (AuthorizedTargetsByService) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AuthorizedTargetsByServiceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
