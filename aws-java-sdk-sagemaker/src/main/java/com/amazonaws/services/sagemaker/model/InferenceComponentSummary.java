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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the properties of an inference component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/InferenceComponentSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceComponentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time when the inference component was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference component.
     * </p>
     */
    private String inferenceComponentArn;
    /**
     * <p>
     * The name of the inference component.
     * </p>
     */
    private String inferenceComponentName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint that hosts the inference component.
     * </p>
     */
    private String endpointArn;
    /**
     * <p>
     * The name of the endpoint that hosts the inference component.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The name of the production variant that hosts the inference component.
     * </p>
     */
    private String variantName;
    /**
     * <p>
     * The status of the inference component.
     * </p>
     */
    private String inferenceComponentStatus;
    /**
     * <p>
     * The time when the inference component was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The time when the inference component was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the inference component was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the inference component was created.
     * </p>
     * 
     * @return The time when the inference component was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the inference component was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the inference component was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference component.
     * </p>
     * 
     * @param inferenceComponentArn
     *        The Amazon Resource Name (ARN) of the inference component.
     */

    public void setInferenceComponentArn(String inferenceComponentArn) {
        this.inferenceComponentArn = inferenceComponentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference component.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the inference component.
     */

    public String getInferenceComponentArn() {
        return this.inferenceComponentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference component.
     * </p>
     * 
     * @param inferenceComponentArn
     *        The Amazon Resource Name (ARN) of the inference component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentSummary withInferenceComponentArn(String inferenceComponentArn) {
        setInferenceComponentArn(inferenceComponentArn);
        return this;
    }

    /**
     * <p>
     * The name of the inference component.
     * </p>
     * 
     * @param inferenceComponentName
     *        The name of the inference component.
     */

    public void setInferenceComponentName(String inferenceComponentName) {
        this.inferenceComponentName = inferenceComponentName;
    }

    /**
     * <p>
     * The name of the inference component.
     * </p>
     * 
     * @return The name of the inference component.
     */

    public String getInferenceComponentName() {
        return this.inferenceComponentName;
    }

    /**
     * <p>
     * The name of the inference component.
     * </p>
     * 
     * @param inferenceComponentName
     *        The name of the inference component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentSummary withInferenceComponentName(String inferenceComponentName) {
        setInferenceComponentName(inferenceComponentName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint that hosts the inference component.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) of the endpoint that hosts the inference component.
     */

    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint that hosts the inference component.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the endpoint that hosts the inference component.
     */

    public String getEndpointArn() {
        return this.endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint that hosts the inference component.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) of the endpoint that hosts the inference component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentSummary withEndpointArn(String endpointArn) {
        setEndpointArn(endpointArn);
        return this;
    }

    /**
     * <p>
     * The name of the endpoint that hosts the inference component.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint that hosts the inference component.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the endpoint that hosts the inference component.
     * </p>
     * 
     * @return The name of the endpoint that hosts the inference component.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of the endpoint that hosts the inference component.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint that hosts the inference component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentSummary withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The name of the production variant that hosts the inference component.
     * </p>
     * 
     * @param variantName
     *        The name of the production variant that hosts the inference component.
     */

    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    /**
     * <p>
     * The name of the production variant that hosts the inference component.
     * </p>
     * 
     * @return The name of the production variant that hosts the inference component.
     */

    public String getVariantName() {
        return this.variantName;
    }

    /**
     * <p>
     * The name of the production variant that hosts the inference component.
     * </p>
     * 
     * @param variantName
     *        The name of the production variant that hosts the inference component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentSummary withVariantName(String variantName) {
        setVariantName(variantName);
        return this;
    }

    /**
     * <p>
     * The status of the inference component.
     * </p>
     * 
     * @param inferenceComponentStatus
     *        The status of the inference component.
     * @see InferenceComponentStatus
     */

    public void setInferenceComponentStatus(String inferenceComponentStatus) {
        this.inferenceComponentStatus = inferenceComponentStatus;
    }

    /**
     * <p>
     * The status of the inference component.
     * </p>
     * 
     * @return The status of the inference component.
     * @see InferenceComponentStatus
     */

    public String getInferenceComponentStatus() {
        return this.inferenceComponentStatus;
    }

    /**
     * <p>
     * The status of the inference component.
     * </p>
     * 
     * @param inferenceComponentStatus
     *        The status of the inference component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceComponentStatus
     */

    public InferenceComponentSummary withInferenceComponentStatus(String inferenceComponentStatus) {
        setInferenceComponentStatus(inferenceComponentStatus);
        return this;
    }

    /**
     * <p>
     * The status of the inference component.
     * </p>
     * 
     * @param inferenceComponentStatus
     *        The status of the inference component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceComponentStatus
     */

    public InferenceComponentSummary withInferenceComponentStatus(InferenceComponentStatus inferenceComponentStatus) {
        this.inferenceComponentStatus = inferenceComponentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time when the inference component was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time when the inference component was last updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time when the inference component was last updated.
     * </p>
     * 
     * @return The time when the inference component was last updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The time when the inference component was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time when the inference component was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getInferenceComponentArn() != null)
            sb.append("InferenceComponentArn: ").append(getInferenceComponentArn()).append(",");
        if (getInferenceComponentName() != null)
            sb.append("InferenceComponentName: ").append(getInferenceComponentName()).append(",");
        if (getEndpointArn() != null)
            sb.append("EndpointArn: ").append(getEndpointArn()).append(",");
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getVariantName() != null)
            sb.append("VariantName: ").append(getVariantName()).append(",");
        if (getInferenceComponentStatus() != null)
            sb.append("InferenceComponentStatus: ").append(getInferenceComponentStatus()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceComponentSummary == false)
            return false;
        InferenceComponentSummary other = (InferenceComponentSummary) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getInferenceComponentArn() == null ^ this.getInferenceComponentArn() == null)
            return false;
        if (other.getInferenceComponentArn() != null && other.getInferenceComponentArn().equals(this.getInferenceComponentArn()) == false)
            return false;
        if (other.getInferenceComponentName() == null ^ this.getInferenceComponentName() == null)
            return false;
        if (other.getInferenceComponentName() != null && other.getInferenceComponentName().equals(this.getInferenceComponentName()) == false)
            return false;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getVariantName() == null ^ this.getVariantName() == null)
            return false;
        if (other.getVariantName() != null && other.getVariantName().equals(this.getVariantName()) == false)
            return false;
        if (other.getInferenceComponentStatus() == null ^ this.getInferenceComponentStatus() == null)
            return false;
        if (other.getInferenceComponentStatus() != null && other.getInferenceComponentStatus().equals(this.getInferenceComponentStatus()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getInferenceComponentArn() == null) ? 0 : getInferenceComponentArn().hashCode());
        hashCode = prime * hashCode + ((getInferenceComponentName() == null) ? 0 : getInferenceComponentName().hashCode());
        hashCode = prime * hashCode + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getVariantName() == null) ? 0 : getVariantName().hashCode());
        hashCode = prime * hashCode + ((getInferenceComponentStatus() == null) ? 0 : getInferenceComponentStatus().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public InferenceComponentSummary clone() {
        try {
            return (InferenceComponentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.InferenceComponentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
