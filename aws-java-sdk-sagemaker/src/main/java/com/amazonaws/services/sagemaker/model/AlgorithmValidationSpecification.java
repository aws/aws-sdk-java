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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies configurations for one or more training jobs that Amazon SageMaker runs to test the algorithm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AlgorithmValidationSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlgorithmValidationSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IAM roles that Amazon SageMaker uses to run the training jobs.
     * </p>
     */
    private String validationRole;
    /**
     * <p>
     * An array of <code>AlgorithmValidationProfile</code> objects, each of which specifies a training job and batch
     * transform job that Amazon SageMaker runs to validate your algorithm.
     * </p>
     */
    private java.util.List<AlgorithmValidationProfile> validationProfiles;

    /**
     * <p>
     * The IAM roles that Amazon SageMaker uses to run the training jobs.
     * </p>
     * 
     * @param validationRole
     *        The IAM roles that Amazon SageMaker uses to run the training jobs.
     */

    public void setValidationRole(String validationRole) {
        this.validationRole = validationRole;
    }

    /**
     * <p>
     * The IAM roles that Amazon SageMaker uses to run the training jobs.
     * </p>
     * 
     * @return The IAM roles that Amazon SageMaker uses to run the training jobs.
     */

    public String getValidationRole() {
        return this.validationRole;
    }

    /**
     * <p>
     * The IAM roles that Amazon SageMaker uses to run the training jobs.
     * </p>
     * 
     * @param validationRole
     *        The IAM roles that Amazon SageMaker uses to run the training jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmValidationSpecification withValidationRole(String validationRole) {
        setValidationRole(validationRole);
        return this;
    }

    /**
     * <p>
     * An array of <code>AlgorithmValidationProfile</code> objects, each of which specifies a training job and batch
     * transform job that Amazon SageMaker runs to validate your algorithm.
     * </p>
     * 
     * @return An array of <code>AlgorithmValidationProfile</code> objects, each of which specifies a training job and
     *         batch transform job that Amazon SageMaker runs to validate your algorithm.
     */

    public java.util.List<AlgorithmValidationProfile> getValidationProfiles() {
        return validationProfiles;
    }

    /**
     * <p>
     * An array of <code>AlgorithmValidationProfile</code> objects, each of which specifies a training job and batch
     * transform job that Amazon SageMaker runs to validate your algorithm.
     * </p>
     * 
     * @param validationProfiles
     *        An array of <code>AlgorithmValidationProfile</code> objects, each of which specifies a training job and
     *        batch transform job that Amazon SageMaker runs to validate your algorithm.
     */

    public void setValidationProfiles(java.util.Collection<AlgorithmValidationProfile> validationProfiles) {
        if (validationProfiles == null) {
            this.validationProfiles = null;
            return;
        }

        this.validationProfiles = new java.util.ArrayList<AlgorithmValidationProfile>(validationProfiles);
    }

    /**
     * <p>
     * An array of <code>AlgorithmValidationProfile</code> objects, each of which specifies a training job and batch
     * transform job that Amazon SageMaker runs to validate your algorithm.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidationProfiles(java.util.Collection)} or {@link #withValidationProfiles(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param validationProfiles
     *        An array of <code>AlgorithmValidationProfile</code> objects, each of which specifies a training job and
     *        batch transform job that Amazon SageMaker runs to validate your algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmValidationSpecification withValidationProfiles(AlgorithmValidationProfile... validationProfiles) {
        if (this.validationProfiles == null) {
            setValidationProfiles(new java.util.ArrayList<AlgorithmValidationProfile>(validationProfiles.length));
        }
        for (AlgorithmValidationProfile ele : validationProfiles) {
            this.validationProfiles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>AlgorithmValidationProfile</code> objects, each of which specifies a training job and batch
     * transform job that Amazon SageMaker runs to validate your algorithm.
     * </p>
     * 
     * @param validationProfiles
     *        An array of <code>AlgorithmValidationProfile</code> objects, each of which specifies a training job and
     *        batch transform job that Amazon SageMaker runs to validate your algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmValidationSpecification withValidationProfiles(java.util.Collection<AlgorithmValidationProfile> validationProfiles) {
        setValidationProfiles(validationProfiles);
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
        if (getValidationRole() != null)
            sb.append("ValidationRole: ").append(getValidationRole()).append(",");
        if (getValidationProfiles() != null)
            sb.append("ValidationProfiles: ").append(getValidationProfiles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlgorithmValidationSpecification == false)
            return false;
        AlgorithmValidationSpecification other = (AlgorithmValidationSpecification) obj;
        if (other.getValidationRole() == null ^ this.getValidationRole() == null)
            return false;
        if (other.getValidationRole() != null && other.getValidationRole().equals(this.getValidationRole()) == false)
            return false;
        if (other.getValidationProfiles() == null ^ this.getValidationProfiles() == null)
            return false;
        if (other.getValidationProfiles() != null && other.getValidationProfiles().equals(this.getValidationProfiles()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValidationRole() == null) ? 0 : getValidationRole().hashCode());
        hashCode = prime * hashCode + ((getValidationProfiles() == null) ? 0 : getValidationProfiles().hashCode());
        return hashCode;
    }

    @Override
    public AlgorithmValidationSpecification clone() {
        try {
            return (AlgorithmValidationSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AlgorithmValidationSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
