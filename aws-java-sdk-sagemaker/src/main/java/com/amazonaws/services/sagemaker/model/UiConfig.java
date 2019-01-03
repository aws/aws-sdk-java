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
 * Provided configuration information for the worker UI for a labeling job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UiConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UiConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket location of the UI template. For more information about the contents of a UI template, see
     * <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates-step2.html"> Creating Your Custom
     * Labeling Task Template</a>.
     * </p>
     */
    private String uiTemplateS3Uri;

    /**
     * <p>
     * The Amazon S3 bucket location of the UI template. For more information about the contents of a UI template, see
     * <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates-step2.html"> Creating Your Custom
     * Labeling Task Template</a>.
     * </p>
     * 
     * @param uiTemplateS3Uri
     *        The Amazon S3 bucket location of the UI template. For more information about the contents of a UI
     *        template, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates-step2.html">
     *        Creating Your Custom Labeling Task Template</a>.
     */

    public void setUiTemplateS3Uri(String uiTemplateS3Uri) {
        this.uiTemplateS3Uri = uiTemplateS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 bucket location of the UI template. For more information about the contents of a UI template, see
     * <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates-step2.html"> Creating Your Custom
     * Labeling Task Template</a>.
     * </p>
     * 
     * @return The Amazon S3 bucket location of the UI template. For more information about the contents of a UI
     *         template, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates-step2.html">
     *         Creating Your Custom Labeling Task Template</a>.
     */

    public String getUiTemplateS3Uri() {
        return this.uiTemplateS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 bucket location of the UI template. For more information about the contents of a UI template, see
     * <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates-step2.html"> Creating Your Custom
     * Labeling Task Template</a>.
     * </p>
     * 
     * @param uiTemplateS3Uri
     *        The Amazon S3 bucket location of the UI template. For more information about the contents of a UI
     *        template, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates-step2.html">
     *        Creating Your Custom Labeling Task Template</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UiConfig withUiTemplateS3Uri(String uiTemplateS3Uri) {
        setUiTemplateS3Uri(uiTemplateS3Uri);
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
        if (getUiTemplateS3Uri() != null)
            sb.append("UiTemplateS3Uri: ").append(getUiTemplateS3Uri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UiConfig == false)
            return false;
        UiConfig other = (UiConfig) obj;
        if (other.getUiTemplateS3Uri() == null ^ this.getUiTemplateS3Uri() == null)
            return false;
        if (other.getUiTemplateS3Uri() != null && other.getUiTemplateS3Uri().equals(this.getUiTemplateS3Uri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUiTemplateS3Uri() == null) ? 0 : getUiTemplateS3Uri().hashCode());
        return hashCode;
    }

    @Override
    public UiConfig clone() {
        try {
            return (UiConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.UiConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
