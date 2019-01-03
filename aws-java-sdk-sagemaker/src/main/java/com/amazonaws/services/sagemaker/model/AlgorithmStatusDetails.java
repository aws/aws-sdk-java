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
 * Specifies the validation and image scan statuses of the algorithm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AlgorithmStatusDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlgorithmStatusDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of algorithm validation.
     * </p>
     */
    private java.util.List<AlgorithmStatusItem> validationStatuses;
    /**
     * <p>
     * The status of the scan of the algorithm's Docker image container.
     * </p>
     */
    private java.util.List<AlgorithmStatusItem> imageScanStatuses;

    /**
     * <p>
     * The status of algorithm validation.
     * </p>
     * 
     * @return The status of algorithm validation.
     */

    public java.util.List<AlgorithmStatusItem> getValidationStatuses() {
        return validationStatuses;
    }

    /**
     * <p>
     * The status of algorithm validation.
     * </p>
     * 
     * @param validationStatuses
     *        The status of algorithm validation.
     */

    public void setValidationStatuses(java.util.Collection<AlgorithmStatusItem> validationStatuses) {
        if (validationStatuses == null) {
            this.validationStatuses = null;
            return;
        }

        this.validationStatuses = new java.util.ArrayList<AlgorithmStatusItem>(validationStatuses);
    }

    /**
     * <p>
     * The status of algorithm validation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidationStatuses(java.util.Collection)} or {@link #withValidationStatuses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param validationStatuses
     *        The status of algorithm validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmStatusDetails withValidationStatuses(AlgorithmStatusItem... validationStatuses) {
        if (this.validationStatuses == null) {
            setValidationStatuses(new java.util.ArrayList<AlgorithmStatusItem>(validationStatuses.length));
        }
        for (AlgorithmStatusItem ele : validationStatuses) {
            this.validationStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status of algorithm validation.
     * </p>
     * 
     * @param validationStatuses
     *        The status of algorithm validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmStatusDetails withValidationStatuses(java.util.Collection<AlgorithmStatusItem> validationStatuses) {
        setValidationStatuses(validationStatuses);
        return this;
    }

    /**
     * <p>
     * The status of the scan of the algorithm's Docker image container.
     * </p>
     * 
     * @return The status of the scan of the algorithm's Docker image container.
     */

    public java.util.List<AlgorithmStatusItem> getImageScanStatuses() {
        return imageScanStatuses;
    }

    /**
     * <p>
     * The status of the scan of the algorithm's Docker image container.
     * </p>
     * 
     * @param imageScanStatuses
     *        The status of the scan of the algorithm's Docker image container.
     */

    public void setImageScanStatuses(java.util.Collection<AlgorithmStatusItem> imageScanStatuses) {
        if (imageScanStatuses == null) {
            this.imageScanStatuses = null;
            return;
        }

        this.imageScanStatuses = new java.util.ArrayList<AlgorithmStatusItem>(imageScanStatuses);
    }

    /**
     * <p>
     * The status of the scan of the algorithm's Docker image container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageScanStatuses(java.util.Collection)} or {@link #withImageScanStatuses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param imageScanStatuses
     *        The status of the scan of the algorithm's Docker image container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmStatusDetails withImageScanStatuses(AlgorithmStatusItem... imageScanStatuses) {
        if (this.imageScanStatuses == null) {
            setImageScanStatuses(new java.util.ArrayList<AlgorithmStatusItem>(imageScanStatuses.length));
        }
        for (AlgorithmStatusItem ele : imageScanStatuses) {
            this.imageScanStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status of the scan of the algorithm's Docker image container.
     * </p>
     * 
     * @param imageScanStatuses
     *        The status of the scan of the algorithm's Docker image container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmStatusDetails withImageScanStatuses(java.util.Collection<AlgorithmStatusItem> imageScanStatuses) {
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

        if (obj instanceof AlgorithmStatusDetails == false)
            return false;
        AlgorithmStatusDetails other = (AlgorithmStatusDetails) obj;
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
    public AlgorithmStatusDetails clone() {
        try {
            return (AlgorithmStatusDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AlgorithmStatusDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
