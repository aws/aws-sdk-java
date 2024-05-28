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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteFormType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFormTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the metadata form type is deleted.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The ID of the metadata form type that is deleted.
     * </p>
     */
    private String formTypeIdentifier;

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the metadata form type is deleted.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain in which the metadata form type is deleted.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the metadata form type is deleted.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which the metadata form type is deleted.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the metadata form type is deleted.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain in which the metadata form type is deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFormTypeRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The ID of the metadata form type that is deleted.
     * </p>
     * 
     * @param formTypeIdentifier
     *        The ID of the metadata form type that is deleted.
     */

    public void setFormTypeIdentifier(String formTypeIdentifier) {
        this.formTypeIdentifier = formTypeIdentifier;
    }

    /**
     * <p>
     * The ID of the metadata form type that is deleted.
     * </p>
     * 
     * @return The ID of the metadata form type that is deleted.
     */

    public String getFormTypeIdentifier() {
        return this.formTypeIdentifier;
    }

    /**
     * <p>
     * The ID of the metadata form type that is deleted.
     * </p>
     * 
     * @param formTypeIdentifier
     *        The ID of the metadata form type that is deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFormTypeRequest withFormTypeIdentifier(String formTypeIdentifier) {
        setFormTypeIdentifier(formTypeIdentifier);
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
        if (getFormTypeIdentifier() != null)
            sb.append("FormTypeIdentifier: ").append(getFormTypeIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFormTypeRequest == false)
            return false;
        DeleteFormTypeRequest other = (DeleteFormTypeRequest) obj;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getFormTypeIdentifier() == null ^ this.getFormTypeIdentifier() == null)
            return false;
        if (other.getFormTypeIdentifier() != null && other.getFormTypeIdentifier().equals(this.getFormTypeIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFormTypeIdentifier() == null) ? 0 : getFormTypeIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFormTypeRequest clone() {
        return (DeleteFormTypeRequest) super.clone();
    }

}
