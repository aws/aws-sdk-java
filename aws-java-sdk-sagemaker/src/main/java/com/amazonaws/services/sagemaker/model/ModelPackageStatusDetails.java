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
 * Specifies the validation and image scan statuses of the model package.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelPackageStatusDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelPackageStatusDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The validation status of the model package.
     * </p>
     */
    private java.util.List<ModelPackageStatusItem> validationStatuses;
    /**
     * <p>
     * The status of the scan of the Docker image container for the model package.
     * </p>
     */
    private java.util.List<ModelPackageStatusItem> imageScanStatuses;

    /**
     * <p>
     * The validation status of the model package.
     * </p>
     * 
     * @return The validation status of the model package.
     */

    public java.util.List<ModelPackageStatusItem> getValidationStatuses() {
        return validationStatuses;
    }

    /**
     * <p>
     * The validation status of the model package.
     * </p>
     * 
     * @param validationStatuses
     *        The validation status of the model package.
     */

    public void setValidationStatuses(java.util.Collection<ModelPackageStatusItem> validationStatuses) {
        if (validationStatuses == null) {
            this.validationStatuses = null;
            return;
        }

        this.validationStatuses = new java.util.ArrayList<ModelPackageStatusItem>(validationStatuses);
    }

    /**
     * <p>
     * The validation status of the model package.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidationStatuses(java.util.Collection)} or {@link #withValidationStatuses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param validationStatuses
     *        The validation status of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackageStatusDetails withValidationStatuses(ModelPackageStatusItem... validationStatuses) {
        if (this.validationStatuses == null) {
            setValidationStatuses(new java.util.ArrayList<ModelPackageStatusItem>(validationStatuses.length));
        }
        for (ModelPackageStatusItem ele : validationStatuses) {
            this.validationStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The validation status of the model package.
     * </p>
     * 
     * @param validationStatuses
     *        The validation status of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackageStatusDetails withValidationStatuses(java.util.Collection<ModelPackageStatusItem> validationStatuses) {
        setValidationStatuses(validationStatuses);
        return this;
    }

    /**
     * <p>
     * The status of the scan of the Docker image container for the model package.
     * </p>
     * 
     * @return The status of the scan of the Docker image container for the model package.
     */

    public java.util.List<ModelPackageStatusItem> getImageScanStatuses() {
        return imageScanStatuses;
    }

    /**
     * <p>
     * The status of the scan of the Docker image container for the model package.
     * </p>
     * 
     * @param imageScanStatuses
     *        The status of the scan of the Docker image container for the model package.
     */

    public void setImageScanStatuses(java.util.Collection<ModelPackageStatusItem> imageScanStatuses) {
        if (imageScanStatuses == null) {
            this.imageScanStatuses = null;
            return;
        }

        this.imageScanStatuses = new java.util.ArrayList<ModelPackageStatusItem>(imageScanStatuses);
    }

    /**
     * <p>
     * The status of the scan of the Docker image container for the model package.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageScanStatuses(java.util.Collection)} or {@link #withImageScanStatuses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param imageScanStatuses
     *        The status of the scan of the Docker image container for the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackageStatusDetails withImageScanStatuses(ModelPackageStatusItem... imageScanStatuses) {
        if (this.imageScanStatuses == null) {
            setImageScanStatuses(new java.util.ArrayList<ModelPackageStatusItem>(imageScanStatuses.length));
        }
        for (ModelPackageStatusItem ele : imageScanStatuses) {
            this.imageScanStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status of the scan of the Docker image container for the model package.
     * </p>
     * 
     * @param imageScanStatuses
     *        The status of the scan of the Docker image container for the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackageStatusDetails withImageScanStatuses(java.util.Collection<ModelPackageStatusItem> imageScanStatuses) {
        setImageScanStatuses(imageScanStatuses);
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
        if (getValidationStatuses() != null)
            sb.append("ValidationStatuses: ").append(getValidationStatuses()).append(",");
        if (getImageScanStatuses() != null)
            sb.append("ImageScanStatuses: ").append(getImageScanStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelPackageStatusDetails == false)
            return false;
        ModelPackageStatusDetails other = (ModelPackageStatusDetails) obj;
        if (other.getValidationStatuses() == null ^ this.getValidationStatuses() == null)
            return false;
        if (other.getValidationStatuses() != null && other.getValidationStatuses().equals(this.getValidationStatuses()) == false)
            return false;
        if (other.getImageScanStatuses() == null ^ this.getImageScanStatuses() == null)
            return false;
        if (other.getImageScanStatuses() != null && other.getImageScanStatuses().equals(this.getImageScanStatuses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValidationStatuses() == null) ? 0 : getValidationStatuses().hashCode());
        hashCode = prime * hashCode + ((getImageScanStatuses() == null) ? 0 : getImageScanStatuses().hashCode());
        return hashCode;
    }

    @Override
    public ModelPackageStatusDetails clone() {
        try {
            return (ModelPackageStatusDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelPackageStatusDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
