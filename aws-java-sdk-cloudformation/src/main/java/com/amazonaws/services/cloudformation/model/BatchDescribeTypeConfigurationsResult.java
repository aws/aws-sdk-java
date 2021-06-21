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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/BatchDescribeTypeConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDescribeTypeConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of information concerning any errors generated during the setting of the specified configurations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BatchDescribeTypeConfigurationsError> errors;
    /**
     * <p>
     * A list of any of the specified extension configurations that CloudFormation could not process for any reason.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TypeConfigurationIdentifier> unprocessedTypeConfigurations;
    /**
     * <p>
     * A list of any of the specified extension configurations from the CloudFormation registry.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TypeConfigurationDetails> typeConfigurations;

    /**
     * <p>
     * A list of information concerning any errors generated during the setting of the specified configurations.
     * </p>
     * 
     * @return A list of information concerning any errors generated during the setting of the specified configurations.
     */

    public java.util.List<BatchDescribeTypeConfigurationsError> getErrors() {
        if (errors == null) {
            errors = new com.amazonaws.internal.SdkInternalList<BatchDescribeTypeConfigurationsError>();
        }
        return errors;
    }

    /**
     * <p>
     * A list of information concerning any errors generated during the setting of the specified configurations.
     * </p>
     * 
     * @param errors
     *        A list of information concerning any errors generated during the setting of the specified configurations.
     */

    public void setErrors(java.util.Collection<BatchDescribeTypeConfigurationsError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new com.amazonaws.internal.SdkInternalList<BatchDescribeTypeConfigurationsError>(errors);
    }

    /**
     * <p>
     * A list of information concerning any errors generated during the setting of the specified configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        A list of information concerning any errors generated during the setting of the specified configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeTypeConfigurationsResult withErrors(BatchDescribeTypeConfigurationsError... errors) {
        if (this.errors == null) {
            setErrors(new com.amazonaws.internal.SdkInternalList<BatchDescribeTypeConfigurationsError>(errors.length));
        }
        for (BatchDescribeTypeConfigurationsError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of information concerning any errors generated during the setting of the specified configurations.
     * </p>
     * 
     * @param errors
     *        A list of information concerning any errors generated during the setting of the specified configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeTypeConfigurationsResult withErrors(java.util.Collection<BatchDescribeTypeConfigurationsError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * A list of any of the specified extension configurations that CloudFormation could not process for any reason.
     * </p>
     * 
     * @return A list of any of the specified extension configurations that CloudFormation could not process for any
     *         reason.
     */

    public java.util.List<TypeConfigurationIdentifier> getUnprocessedTypeConfigurations() {
        if (unprocessedTypeConfigurations == null) {
            unprocessedTypeConfigurations = new com.amazonaws.internal.SdkInternalList<TypeConfigurationIdentifier>();
        }
        return unprocessedTypeConfigurations;
    }

    /**
     * <p>
     * A list of any of the specified extension configurations that CloudFormation could not process for any reason.
     * </p>
     * 
     * @param unprocessedTypeConfigurations
     *        A list of any of the specified extension configurations that CloudFormation could not process for any
     *        reason.
     */

    public void setUnprocessedTypeConfigurations(java.util.Collection<TypeConfigurationIdentifier> unprocessedTypeConfigurations) {
        if (unprocessedTypeConfigurations == null) {
            this.unprocessedTypeConfigurations = null;
            return;
        }

        this.unprocessedTypeConfigurations = new com.amazonaws.internal.SdkInternalList<TypeConfigurationIdentifier>(unprocessedTypeConfigurations);
    }

    /**
     * <p>
     * A list of any of the specified extension configurations that CloudFormation could not process for any reason.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedTypeConfigurations(java.util.Collection)} or
     * {@link #withUnprocessedTypeConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedTypeConfigurations
     *        A list of any of the specified extension configurations that CloudFormation could not process for any
     *        reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeTypeConfigurationsResult withUnprocessedTypeConfigurations(TypeConfigurationIdentifier... unprocessedTypeConfigurations) {
        if (this.unprocessedTypeConfigurations == null) {
            setUnprocessedTypeConfigurations(new com.amazonaws.internal.SdkInternalList<TypeConfigurationIdentifier>(unprocessedTypeConfigurations.length));
        }
        for (TypeConfigurationIdentifier ele : unprocessedTypeConfigurations) {
            this.unprocessedTypeConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of any of the specified extension configurations that CloudFormation could not process for any reason.
     * </p>
     * 
     * @param unprocessedTypeConfigurations
     *        A list of any of the specified extension configurations that CloudFormation could not process for any
     *        reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeTypeConfigurationsResult withUnprocessedTypeConfigurations(
            java.util.Collection<TypeConfigurationIdentifier> unprocessedTypeConfigurations) {
        setUnprocessedTypeConfigurations(unprocessedTypeConfigurations);
        return this;
    }

    /**
     * <p>
     * A list of any of the specified extension configurations from the CloudFormation registry.
     * </p>
     * 
     * @return A list of any of the specified extension configurations from the CloudFormation registry.
     */

    public java.util.List<TypeConfigurationDetails> getTypeConfigurations() {
        if (typeConfigurations == null) {
            typeConfigurations = new com.amazonaws.internal.SdkInternalList<TypeConfigurationDetails>();
        }
        return typeConfigurations;
    }

    /**
     * <p>
     * A list of any of the specified extension configurations from the CloudFormation registry.
     * </p>
     * 
     * @param typeConfigurations
     *        A list of any of the specified extension configurations from the CloudFormation registry.
     */

    public void setTypeConfigurations(java.util.Collection<TypeConfigurationDetails> typeConfigurations) {
        if (typeConfigurations == null) {
            this.typeConfigurations = null;
            return;
        }

        this.typeConfigurations = new com.amazonaws.internal.SdkInternalList<TypeConfigurationDetails>(typeConfigurations);
    }

    /**
     * <p>
     * A list of any of the specified extension configurations from the CloudFormation registry.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTypeConfigurations(java.util.Collection)} or {@link #withTypeConfigurations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param typeConfigurations
     *        A list of any of the specified extension configurations from the CloudFormation registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeTypeConfigurationsResult withTypeConfigurations(TypeConfigurationDetails... typeConfigurations) {
        if (this.typeConfigurations == null) {
            setTypeConfigurations(new com.amazonaws.internal.SdkInternalList<TypeConfigurationDetails>(typeConfigurations.length));
        }
        for (TypeConfigurationDetails ele : typeConfigurations) {
            this.typeConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of any of the specified extension configurations from the CloudFormation registry.
     * </p>
     * 
     * @param typeConfigurations
     *        A list of any of the specified extension configurations from the CloudFormation registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeTypeConfigurationsResult withTypeConfigurations(java.util.Collection<TypeConfigurationDetails> typeConfigurations) {
        setTypeConfigurations(typeConfigurations);
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
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getUnprocessedTypeConfigurations() != null)
            sb.append("UnprocessedTypeConfigurations: ").append(getUnprocessedTypeConfigurations()).append(",");
        if (getTypeConfigurations() != null)
            sb.append("TypeConfigurations: ").append(getTypeConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDescribeTypeConfigurationsResult == false)
            return false;
        BatchDescribeTypeConfigurationsResult other = (BatchDescribeTypeConfigurationsResult) obj;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getUnprocessedTypeConfigurations() == null ^ this.getUnprocessedTypeConfigurations() == null)
            return false;
        if (other.getUnprocessedTypeConfigurations() != null
                && other.getUnprocessedTypeConfigurations().equals(this.getUnprocessedTypeConfigurations()) == false)
            return false;
        if (other.getTypeConfigurations() == null ^ this.getTypeConfigurations() == null)
            return false;
        if (other.getTypeConfigurations() != null && other.getTypeConfigurations().equals(this.getTypeConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedTypeConfigurations() == null) ? 0 : getUnprocessedTypeConfigurations().hashCode());
        hashCode = prime * hashCode + ((getTypeConfigurations() == null) ? 0 : getTypeConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public BatchDescribeTypeConfigurationsResult clone() {
        try {
            return (BatchDescribeTypeConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
