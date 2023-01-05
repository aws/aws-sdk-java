/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon SageMaker model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/ExternalModelSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExternalModelSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The endpoint of the Amazon SageMaker model.
     * </p>
     */
    private String modelEndpoint;
    /**
     * <p>
     * The source of the model.
     * </p>
     */
    private String modelSource;

    /**
     * <p>
     * The endpoint of the Amazon SageMaker model.
     * </p>
     * 
     * @param modelEndpoint
     *        The endpoint of the Amazon SageMaker model.
     */

    public void setModelEndpoint(String modelEndpoint) {
        this.modelEndpoint = modelEndpoint;
    }

    /**
     * <p>
     * The endpoint of the Amazon SageMaker model.
     * </p>
     * 
     * @return The endpoint of the Amazon SageMaker model.
     */

    public String getModelEndpoint() {
        return this.modelEndpoint;
    }

    /**
     * <p>
     * The endpoint of the Amazon SageMaker model.
     * </p>
     * 
     * @param modelEndpoint
     *        The endpoint of the Amazon SageMaker model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalModelSummary withModelEndpoint(String modelEndpoint) {
        setModelEndpoint(modelEndpoint);
        return this;
    }

    /**
     * <p>
     * The source of the model.
     * </p>
     * 
     * @param modelSource
     *        The source of the model.
     * @see ModelSource
     */

    public void setModelSource(String modelSource) {
        this.modelSource = modelSource;
    }

    /**
     * <p>
     * The source of the model.
     * </p>
     * 
     * @return The source of the model.
     * @see ModelSource
     */

    public String getModelSource() {
        return this.modelSource;
    }

    /**
     * <p>
     * The source of the model.
     * </p>
     * 
     * @param modelSource
     *        The source of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelSource
     */

    public ExternalModelSummary withModelSource(String modelSource) {
        setModelSource(modelSource);
        return this;
    }

    /**
     * <p>
     * The source of the model.
     * </p>
     * 
     * @param modelSource
     *        The source of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelSource
     */

    public ExternalModelSummary withModelSource(ModelSource modelSource) {
        this.modelSource = modelSource.toString();
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
        if (getModelEndpoint() != null)
            sb.append("ModelEndpoint: ").append(getModelEndpoint()).append(",");
        if (getModelSource() != null)
            sb.append("ModelSource: ").append(getModelSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExternalModelSummary == false)
            return false;
        ExternalModelSummary other = (ExternalModelSummary) obj;
        if (other.getModelEndpoint() == null ^ this.getModelEndpoint() == null)
            return false;
        if (other.getModelEndpoint() != null && other.getModelEndpoint().equals(this.getModelEndpoint()) == false)
            return false;
        if (other.getModelSource() == null ^ this.getModelSource() == null)
            return false;
        if (other.getModelSource() != null && other.getModelSource().equals(this.getModelSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelEndpoint() == null) ? 0 : getModelEndpoint().hashCode());
        hashCode = prime * hashCode + ((getModelSource() == null) ? 0 : getModelSource().hashCode());
        return hashCode;
    }

    @Override
    public ExternalModelSummary clone() {
        try {
            return (ExternalModelSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.ExternalModelSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
