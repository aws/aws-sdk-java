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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/BatchDescribeTypeConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDescribeTypeConfigurationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of identifiers for the desired extension configurations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TypeConfigurationIdentifier> typeConfigurationIdentifiers;

    /**
     * <p>
     * The list of identifiers for the desired extension configurations.
     * </p>
     * 
     * @return The list of identifiers for the desired extension configurations.
     */

    public java.util.List<TypeConfigurationIdentifier> getTypeConfigurationIdentifiers() {
        if (typeConfigurationIdentifiers == null) {
            typeConfigurationIdentifiers = new com.amazonaws.internal.SdkInternalList<TypeConfigurationIdentifier>();
        }
        return typeConfigurationIdentifiers;
    }

    /**
     * <p>
     * The list of identifiers for the desired extension configurations.
     * </p>
     * 
     * @param typeConfigurationIdentifiers
     *        The list of identifiers for the desired extension configurations.
     */

    public void setTypeConfigurationIdentifiers(java.util.Collection<TypeConfigurationIdentifier> typeConfigurationIdentifiers) {
        if (typeConfigurationIdentifiers == null) {
            this.typeConfigurationIdentifiers = null;
            return;
        }

        this.typeConfigurationIdentifiers = new com.amazonaws.internal.SdkInternalList<TypeConfigurationIdentifier>(typeConfigurationIdentifiers);
    }

    /**
     * <p>
     * The list of identifiers for the desired extension configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTypeConfigurationIdentifiers(java.util.Collection)} or
     * {@link #withTypeConfigurationIdentifiers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param typeConfigurationIdentifiers
     *        The list of identifiers for the desired extension configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeTypeConfigurationsRequest withTypeConfigurationIdentifiers(TypeConfigurationIdentifier... typeConfigurationIdentifiers) {
        if (this.typeConfigurationIdentifiers == null) {
            setTypeConfigurationIdentifiers(new com.amazonaws.internal.SdkInternalList<TypeConfigurationIdentifier>(typeConfigurationIdentifiers.length));
        }
        for (TypeConfigurationIdentifier ele : typeConfigurationIdentifiers) {
            this.typeConfigurationIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of identifiers for the desired extension configurations.
     * </p>
     * 
     * @param typeConfigurationIdentifiers
     *        The list of identifiers for the desired extension configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeTypeConfigurationsRequest withTypeConfigurationIdentifiers(
            java.util.Collection<TypeConfigurationIdentifier> typeConfigurationIdentifiers) {
        setTypeConfigurationIdentifiers(typeConfigurationIdentifiers);
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
        if (getTypeConfigurationIdentifiers() != null)
            sb.append("TypeConfigurationIdentifiers: ").append(getTypeConfigurationIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDescribeTypeConfigurationsRequest == false)
            return false;
        BatchDescribeTypeConfigurationsRequest other = (BatchDescribeTypeConfigurationsRequest) obj;
        if (other.getTypeConfigurationIdentifiers() == null ^ this.getTypeConfigurationIdentifiers() == null)
            return false;
        if (other.getTypeConfigurationIdentifiers() != null && other.getTypeConfigurationIdentifiers().equals(this.getTypeConfigurationIdentifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeConfigurationIdentifiers() == null) ? 0 : getTypeConfigurationIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public BatchDescribeTypeConfigurationsRequest clone() {
        return (BatchDescribeTypeConfigurationsRequest) super.clone();
    }

}
