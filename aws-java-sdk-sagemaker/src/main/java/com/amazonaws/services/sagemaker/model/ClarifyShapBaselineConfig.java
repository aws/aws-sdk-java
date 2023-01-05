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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for the <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-feature-attribute-shap-baselines.html">SHAP
 * baseline</a> (also called the background or reference dataset) of the Kernal SHAP algorithm.
 * </p>
 * <note>
 * <ul>
 * <li>
 * <p>
 * The number of records in the baseline data determines the size of the synthetic dataset, which has an impact on
 * latency of explainability requests. For more information, see the <b>Synthetic data</b> of <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html">Configure
 * and create an endpoint</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ShapBaseline</code> and <code>ShapBaselineUri</code> are mutually exclusive parameters. One or the either is
 * required to configure a SHAP baseline.
 * </p>
 * </li>
 * </ul>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ClarifyShapBaselineConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClarifyShapBaselineConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The MIME type of the baseline data. Choose from <code>'text/csv'</code> or <code>'application/jsonlines'</code>.
     * Defaults to <code>'text/csv'</code>.
     * </p>
     */
    private String mimeType;
    /**
     * <p>
     * The inline SHAP baseline data in string format. <code>ShapBaseline</code> can have one or multiple records to be
     * used as the baseline dataset. The format of the SHAP baseline file should be the same format as the training
     * dataset. For example, if the training dataset is in CSV format and each record contains four features, and all
     * features are numerical, then the format of the baseline data should also share these characteristics. For natural
     * language processing (NLP) of text columns, the baseline value should be the value used to replace the unit of
     * text specified by the <code>Granularity</code> of the <code>TextConfig</code> parameter. The size limit for
     * <code>ShapBasline</code> is 4 KB. Use the <code>ShapBaselineUri</code> parameter if you want to provide more than
     * 4 KB of baseline data.
     * </p>
     */
    private String shapBaseline;
    /**
     * <p>
     * The uniform resource identifier (URI) of the S3 bucket where the SHAP baseline file is stored. The format of the
     * SHAP baseline file should be the same format as the format of the training dataset. For example, if the training
     * dataset is in CSV format, and each record in the training dataset has four features, and all features are
     * numerical, then the baseline file should also have this same format. Each record should contain only the
     * features. If you are using a virtual private cloud (VPC), the <code>ShapBaselineUri</code> should be accessible
     * to the VPC. For more information about setting up endpoints with Amazon Virtual Private Cloud, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html">Give SageMaker access to
     * Resources in your Amazon Virtual Private Cloud</a>.
     * </p>
     */
    private String shapBaselineUri;

    /**
     * <p>
     * The MIME type of the baseline data. Choose from <code>'text/csv'</code> or <code>'application/jsonlines'</code>.
     * Defaults to <code>'text/csv'</code>.
     * </p>
     * 
     * @param mimeType
     *        The MIME type of the baseline data. Choose from <code>'text/csv'</code> or
     *        <code>'application/jsonlines'</code>. Defaults to <code>'text/csv'</code>.
     */

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * <p>
     * The MIME type of the baseline data. Choose from <code>'text/csv'</code> or <code>'application/jsonlines'</code>.
     * Defaults to <code>'text/csv'</code>.
     * </p>
     * 
     * @return The MIME type of the baseline data. Choose from <code>'text/csv'</code> or
     *         <code>'application/jsonlines'</code>. Defaults to <code>'text/csv'</code>.
     */

    public String getMimeType() {
        return this.mimeType;
    }

    /**
     * <p>
     * The MIME type of the baseline data. Choose from <code>'text/csv'</code> or <code>'application/jsonlines'</code>.
     * Defaults to <code>'text/csv'</code>.
     * </p>
     * 
     * @param mimeType
     *        The MIME type of the baseline data. Choose from <code>'text/csv'</code> or
     *        <code>'application/jsonlines'</code>. Defaults to <code>'text/csv'</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyShapBaselineConfig withMimeType(String mimeType) {
        setMimeType(mimeType);
        return this;
    }

    /**
     * <p>
     * The inline SHAP baseline data in string format. <code>ShapBaseline</code> can have one or multiple records to be
     * used as the baseline dataset. The format of the SHAP baseline file should be the same format as the training
     * dataset. For example, if the training dataset is in CSV format and each record contains four features, and all
     * features are numerical, then the format of the baseline data should also share these characteristics. For natural
     * language processing (NLP) of text columns, the baseline value should be the value used to replace the unit of
     * text specified by the <code>Granularity</code> of the <code>TextConfig</code> parameter. The size limit for
     * <code>ShapBasline</code> is 4 KB. Use the <code>ShapBaselineUri</code> parameter if you want to provide more than
     * 4 KB of baseline data.
     * </p>
     * 
     * @param shapBaseline
     *        The inline SHAP baseline data in string format. <code>ShapBaseline</code> can have one or multiple records
     *        to be used as the baseline dataset. The format of the SHAP baseline file should be the same format as the
     *        training dataset. For example, if the training dataset is in CSV format and each record contains four
     *        features, and all features are numerical, then the format of the baseline data should also share these
     *        characteristics. For natural language processing (NLP) of text columns, the baseline value should be the
     *        value used to replace the unit of text specified by the <code>Granularity</code> of the
     *        <code>TextConfig</code> parameter. The size limit for <code>ShapBasline</code> is 4 KB. Use the
     *        <code>ShapBaselineUri</code> parameter if you want to provide more than 4 KB of baseline data.
     */

    public void setShapBaseline(String shapBaseline) {
        this.shapBaseline = shapBaseline;
    }

    /**
     * <p>
     * The inline SHAP baseline data in string format. <code>ShapBaseline</code> can have one or multiple records to be
     * used as the baseline dataset. The format of the SHAP baseline file should be the same format as the training
     * dataset. For example, if the training dataset is in CSV format and each record contains four features, and all
     * features are numerical, then the format of the baseline data should also share these characteristics. For natural
     * language processing (NLP) of text columns, the baseline value should be the value used to replace the unit of
     * text specified by the <code>Granularity</code> of the <code>TextConfig</code> parameter. The size limit for
     * <code>ShapBasline</code> is 4 KB. Use the <code>ShapBaselineUri</code> parameter if you want to provide more than
     * 4 KB of baseline data.
     * </p>
     * 
     * @return The inline SHAP baseline data in string format. <code>ShapBaseline</code> can have one or multiple
     *         records to be used as the baseline dataset. The format of the SHAP baseline file should be the same
     *         format as the training dataset. For example, if the training dataset is in CSV format and each record
     *         contains four features, and all features are numerical, then the format of the baseline data should also
     *         share these characteristics. For natural language processing (NLP) of text columns, the baseline value
     *         should be the value used to replace the unit of text specified by the <code>Granularity</code> of the
     *         <code>TextConfig</code> parameter. The size limit for <code>ShapBasline</code> is 4 KB. Use the
     *         <code>ShapBaselineUri</code> parameter if you want to provide more than 4 KB of baseline data.
     */

    public String getShapBaseline() {
        return this.shapBaseline;
    }

    /**
     * <p>
     * The inline SHAP baseline data in string format. <code>ShapBaseline</code> can have one or multiple records to be
     * used as the baseline dataset. The format of the SHAP baseline file should be the same format as the training
     * dataset. For example, if the training dataset is in CSV format and each record contains four features, and all
     * features are numerical, then the format of the baseline data should also share these characteristics. For natural
     * language processing (NLP) of text columns, the baseline value should be the value used to replace the unit of
     * text specified by the <code>Granularity</code> of the <code>TextConfig</code> parameter. The size limit for
     * <code>ShapBasline</code> is 4 KB. Use the <code>ShapBaselineUri</code> parameter if you want to provide more than
     * 4 KB of baseline data.
     * </p>
     * 
     * @param shapBaseline
     *        The inline SHAP baseline data in string format. <code>ShapBaseline</code> can have one or multiple records
     *        to be used as the baseline dataset. The format of the SHAP baseline file should be the same format as the
     *        training dataset. For example, if the training dataset is in CSV format and each record contains four
     *        features, and all features are numerical, then the format of the baseline data should also share these
     *        characteristics. For natural language processing (NLP) of text columns, the baseline value should be the
     *        value used to replace the unit of text specified by the <code>Granularity</code> of the
     *        <code>TextConfig</code> parameter. The size limit for <code>ShapBasline</code> is 4 KB. Use the
     *        <code>ShapBaselineUri</code> parameter if you want to provide more than 4 KB of baseline data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyShapBaselineConfig withShapBaseline(String shapBaseline) {
        setShapBaseline(shapBaseline);
        return this;
    }

    /**
     * <p>
     * The uniform resource identifier (URI) of the S3 bucket where the SHAP baseline file is stored. The format of the
     * SHAP baseline file should be the same format as the format of the training dataset. For example, if the training
     * dataset is in CSV format, and each record in the training dataset has four features, and all features are
     * numerical, then the baseline file should also have this same format. Each record should contain only the
     * features. If you are using a virtual private cloud (VPC), the <code>ShapBaselineUri</code> should be accessible
     * to the VPC. For more information about setting up endpoints with Amazon Virtual Private Cloud, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html">Give SageMaker access to
     * Resources in your Amazon Virtual Private Cloud</a>.
     * </p>
     * 
     * @param shapBaselineUri
     *        The uniform resource identifier (URI) of the S3 bucket where the SHAP baseline file is stored. The format
     *        of the SHAP baseline file should be the same format as the format of the training dataset. For example, if
     *        the training dataset is in CSV format, and each record in the training dataset has four features, and all
     *        features are numerical, then the baseline file should also have this same format. Each record should
     *        contain only the features. If you are using a virtual private cloud (VPC), the
     *        <code>ShapBaselineUri</code> should be accessible to the VPC. For more information about setting up
     *        endpoints with Amazon Virtual Private Cloud, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html">Give SageMaker
     *        access to Resources in your Amazon Virtual Private Cloud</a>.
     */

    public void setShapBaselineUri(String shapBaselineUri) {
        this.shapBaselineUri = shapBaselineUri;
    }

    /**
     * <p>
     * The uniform resource identifier (URI) of the S3 bucket where the SHAP baseline file is stored. The format of the
     * SHAP baseline file should be the same format as the format of the training dataset. For example, if the training
     * dataset is in CSV format, and each record in the training dataset has four features, and all features are
     * numerical, then the baseline file should also have this same format. Each record should contain only the
     * features. If you are using a virtual private cloud (VPC), the <code>ShapBaselineUri</code> should be accessible
     * to the VPC. For more information about setting up endpoints with Amazon Virtual Private Cloud, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html">Give SageMaker access to
     * Resources in your Amazon Virtual Private Cloud</a>.
     * </p>
     * 
     * @return The uniform resource identifier (URI) of the S3 bucket where the SHAP baseline file is stored. The format
     *         of the SHAP baseline file should be the same format as the format of the training dataset. For example,
     *         if the training dataset is in CSV format, and each record in the training dataset has four features, and
     *         all features are numerical, then the baseline file should also have this same format. Each record should
     *         contain only the features. If you are using a virtual private cloud (VPC), the
     *         <code>ShapBaselineUri</code> should be accessible to the VPC. For more information about setting up
     *         endpoints with Amazon Virtual Private Cloud, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html">Give SageMaker
     *         access to Resources in your Amazon Virtual Private Cloud</a>.
     */

    public String getShapBaselineUri() {
        return this.shapBaselineUri;
    }

    /**
     * <p>
     * The uniform resource identifier (URI) of the S3 bucket where the SHAP baseline file is stored. The format of the
     * SHAP baseline file should be the same format as the format of the training dataset. For example, if the training
     * dataset is in CSV format, and each record in the training dataset has four features, and all features are
     * numerical, then the baseline file should also have this same format. Each record should contain only the
     * features. If you are using a virtual private cloud (VPC), the <code>ShapBaselineUri</code> should be accessible
     * to the VPC. For more information about setting up endpoints with Amazon Virtual Private Cloud, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html">Give SageMaker access to
     * Resources in your Amazon Virtual Private Cloud</a>.
     * </p>
     * 
     * @param shapBaselineUri
     *        The uniform resource identifier (URI) of the S3 bucket where the SHAP baseline file is stored. The format
     *        of the SHAP baseline file should be the same format as the format of the training dataset. For example, if
     *        the training dataset is in CSV format, and each record in the training dataset has four features, and all
     *        features are numerical, then the baseline file should also have this same format. Each record should
     *        contain only the features. If you are using a virtual private cloud (VPC), the
     *        <code>ShapBaselineUri</code> should be accessible to the VPC. For more information about setting up
     *        endpoints with Amazon Virtual Private Cloud, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html">Give SageMaker
     *        access to Resources in your Amazon Virtual Private Cloud</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyShapBaselineConfig withShapBaselineUri(String shapBaselineUri) {
        setShapBaselineUri(shapBaselineUri);
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
        if (getMimeType() != null)
            sb.append("MimeType: ").append(getMimeType()).append(",");
        if (getShapBaseline() != null)
            sb.append("ShapBaseline: ").append(getShapBaseline()).append(",");
        if (getShapBaselineUri() != null)
            sb.append("ShapBaselineUri: ").append(getShapBaselineUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClarifyShapBaselineConfig == false)
            return false;
        ClarifyShapBaselineConfig other = (ClarifyShapBaselineConfig) obj;
        if (other.getMimeType() == null ^ this.getMimeType() == null)
            return false;
        if (other.getMimeType() != null && other.getMimeType().equals(this.getMimeType()) == false)
            return false;
        if (other.getShapBaseline() == null ^ this.getShapBaseline() == null)
            return false;
        if (other.getShapBaseline() != null && other.getShapBaseline().equals(this.getShapBaseline()) == false)
            return false;
        if (other.getShapBaselineUri() == null ^ this.getShapBaselineUri() == null)
            return false;
        if (other.getShapBaselineUri() != null && other.getShapBaselineUri().equals(this.getShapBaselineUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMimeType() == null) ? 0 : getMimeType().hashCode());
        hashCode = prime * hashCode + ((getShapBaseline() == null) ? 0 : getShapBaseline().hashCode());
        hashCode = prime * hashCode + ((getShapBaselineUri() == null) ? 0 : getShapBaselineUri().hashCode());
        return hashCode;
    }

    @Override
    public ClarifyShapBaselineConfig clone() {
        try {
            return (ClarifyShapBaselineConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ClarifyShapBaselineConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
