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
 * Stores the config information for how a candidate is generated (optional).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLCandidateGenerationConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLCandidateGenerationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A URL to the Amazon S3 data source containing selected features from the input data source to run an Autopilot
     * job. You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
     * </p>
     * <p>
     * <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     * </p>
     * <p>
     * You can also specify the data type of the feature (optional) in the format shown below:
     * </p>
     * <p>
     * <code>{ "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }</code>
     * </p>
     * <note>
     * <p>
     * These column keys may not include the target column.
     * </p>
     * </note>
     * <p>
     * In ensembling mode, Autopilot will only support the following data types: <code>numeric</code>,
     * <code>categorical</code>, <code>text</code> and <code>datetime</code>. In HPO mode, Autopilot can support
     * <code>numeric</code>, <code>categorical</code>, <code>text</code>, <code>datetime</code> and
     * <code>sequence</code>.
     * </p>
     * <p>
     * If only <code>FeatureDataTypes</code> is provided, the column keys (<code>col1</code>, <code>col2</code>,..)
     * should be a subset of the column names in the input data.
     * </p>
     * <p>
     * If both <code>FeatureDataTypes</code> and <code>FeatureAttributeNames</code> are provided, then the column keys
     * should be a subset of the column names provided in <code>FeatureAttributeNames</code>.
     * </p>
     * <p>
     * The key name <code>FeatureAttributeNames</code> is fixed. The values listed in <code>["col1", "col2", ...]</code>
     * is case sensitive and should be a list of strings containing unique values that are a subset of the column names
     * in the input data. The list of columns provided must not include the target column.
     * </p>
     */
    private String featureSpecificationS3Uri;

    /**
     * <p>
     * A URL to the Amazon S3 data source containing selected features from the input data source to run an Autopilot
     * job. You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
     * </p>
     * <p>
     * <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     * </p>
     * <p>
     * You can also specify the data type of the feature (optional) in the format shown below:
     * </p>
     * <p>
     * <code>{ "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }</code>
     * </p>
     * <note>
     * <p>
     * These column keys may not include the target column.
     * </p>
     * </note>
     * <p>
     * In ensembling mode, Autopilot will only support the following data types: <code>numeric</code>,
     * <code>categorical</code>, <code>text</code> and <code>datetime</code>. In HPO mode, Autopilot can support
     * <code>numeric</code>, <code>categorical</code>, <code>text</code>, <code>datetime</code> and
     * <code>sequence</code>.
     * </p>
     * <p>
     * If only <code>FeatureDataTypes</code> is provided, the column keys (<code>col1</code>, <code>col2</code>,..)
     * should be a subset of the column names in the input data.
     * </p>
     * <p>
     * If both <code>FeatureDataTypes</code> and <code>FeatureAttributeNames</code> are provided, then the column keys
     * should be a subset of the column names provided in <code>FeatureAttributeNames</code>.
     * </p>
     * <p>
     * The key name <code>FeatureAttributeNames</code> is fixed. The values listed in <code>["col1", "col2", ...]</code>
     * is case sensitive and should be a list of strings containing unique values that are a subset of the column names
     * in the input data. The list of columns provided must not include the target column.
     * </p>
     * 
     * @param featureSpecificationS3Uri
     *        A URL to the Amazon S3 data source containing selected features from the input data source to run an
     *        Autopilot job. You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
     *        </p>
     *        <p>
     *        <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     *        </p>
     *        <p>
     *        You can also specify the data type of the feature (optional) in the format shown below:
     *        </p>
     *        <p>
     *        <code>{ "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }</code>
     *        </p>
     *        <note>
     *        <p>
     *        These column keys may not include the target column.
     *        </p>
     *        </note>
     *        <p>
     *        In ensembling mode, Autopilot will only support the following data types: <code>numeric</code>,
     *        <code>categorical</code>, <code>text</code> and <code>datetime</code>. In HPO mode, Autopilot can support
     *        <code>numeric</code>, <code>categorical</code>, <code>text</code>, <code>datetime</code> and
     *        <code>sequence</code>.
     *        </p>
     *        <p>
     *        If only <code>FeatureDataTypes</code> is provided, the column keys (<code>col1</code>, <code>col2</code>
     *        ,..) should be a subset of the column names in the input data.
     *        </p>
     *        <p>
     *        If both <code>FeatureDataTypes</code> and <code>FeatureAttributeNames</code> are provided, then the column
     *        keys should be a subset of the column names provided in <code>FeatureAttributeNames</code>.
     *        </p>
     *        <p>
     *        The key name <code>FeatureAttributeNames</code> is fixed. The values listed in
     *        <code>["col1", "col2", ...]</code> is case sensitive and should be a list of strings containing unique
     *        values that are a subset of the column names in the input data. The list of columns provided must not
     *        include the target column.
     */

    public void setFeatureSpecificationS3Uri(String featureSpecificationS3Uri) {
        this.featureSpecificationS3Uri = featureSpecificationS3Uri;
    }

    /**
     * <p>
     * A URL to the Amazon S3 data source containing selected features from the input data source to run an Autopilot
     * job. You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
     * </p>
     * <p>
     * <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     * </p>
     * <p>
     * You can also specify the data type of the feature (optional) in the format shown below:
     * </p>
     * <p>
     * <code>{ "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }</code>
     * </p>
     * <note>
     * <p>
     * These column keys may not include the target column.
     * </p>
     * </note>
     * <p>
     * In ensembling mode, Autopilot will only support the following data types: <code>numeric</code>,
     * <code>categorical</code>, <code>text</code> and <code>datetime</code>. In HPO mode, Autopilot can support
     * <code>numeric</code>, <code>categorical</code>, <code>text</code>, <code>datetime</code> and
     * <code>sequence</code>.
     * </p>
     * <p>
     * If only <code>FeatureDataTypes</code> is provided, the column keys (<code>col1</code>, <code>col2</code>,..)
     * should be a subset of the column names in the input data.
     * </p>
     * <p>
     * If both <code>FeatureDataTypes</code> and <code>FeatureAttributeNames</code> are provided, then the column keys
     * should be a subset of the column names provided in <code>FeatureAttributeNames</code>.
     * </p>
     * <p>
     * The key name <code>FeatureAttributeNames</code> is fixed. The values listed in <code>["col1", "col2", ...]</code>
     * is case sensitive and should be a list of strings containing unique values that are a subset of the column names
     * in the input data. The list of columns provided must not include the target column.
     * </p>
     * 
     * @return A URL to the Amazon S3 data source containing selected features from the input data source to run an
     *         Autopilot job. You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
     *         </p>
     *         <p>
     *         <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     *         </p>
     *         <p>
     *         You can also specify the data type of the feature (optional) in the format shown below:
     *         </p>
     *         <p>
     *         <code>{ "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }</code>
     *         </p>
     *         <note>
     *         <p>
     *         These column keys may not include the target column.
     *         </p>
     *         </note>
     *         <p>
     *         In ensembling mode, Autopilot will only support the following data types: <code>numeric</code>,
     *         <code>categorical</code>, <code>text</code> and <code>datetime</code>. In HPO mode, Autopilot can support
     *         <code>numeric</code>, <code>categorical</code>, <code>text</code>, <code>datetime</code> and
     *         <code>sequence</code>.
     *         </p>
     *         <p>
     *         If only <code>FeatureDataTypes</code> is provided, the column keys (<code>col1</code>, <code>col2</code>
     *         ,..) should be a subset of the column names in the input data.
     *         </p>
     *         <p>
     *         If both <code>FeatureDataTypes</code> and <code>FeatureAttributeNames</code> are provided, then the
     *         column keys should be a subset of the column names provided in <code>FeatureAttributeNames</code>.
     *         </p>
     *         <p>
     *         The key name <code>FeatureAttributeNames</code> is fixed. The values listed in
     *         <code>["col1", "col2", ...]</code> is case sensitive and should be a list of strings containing unique
     *         values that are a subset of the column names in the input data. The list of columns provided must not
     *         include the target column.
     */

    public String getFeatureSpecificationS3Uri() {
        return this.featureSpecificationS3Uri;
    }

    /**
     * <p>
     * A URL to the Amazon S3 data source containing selected features from the input data source to run an Autopilot
     * job. You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
     * </p>
     * <p>
     * <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     * </p>
     * <p>
     * You can also specify the data type of the feature (optional) in the format shown below:
     * </p>
     * <p>
     * <code>{ "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }</code>
     * </p>
     * <note>
     * <p>
     * These column keys may not include the target column.
     * </p>
     * </note>
     * <p>
     * In ensembling mode, Autopilot will only support the following data types: <code>numeric</code>,
     * <code>categorical</code>, <code>text</code> and <code>datetime</code>. In HPO mode, Autopilot can support
     * <code>numeric</code>, <code>categorical</code>, <code>text</code>, <code>datetime</code> and
     * <code>sequence</code>.
     * </p>
     * <p>
     * If only <code>FeatureDataTypes</code> is provided, the column keys (<code>col1</code>, <code>col2</code>,..)
     * should be a subset of the column names in the input data.
     * </p>
     * <p>
     * If both <code>FeatureDataTypes</code> and <code>FeatureAttributeNames</code> are provided, then the column keys
     * should be a subset of the column names provided in <code>FeatureAttributeNames</code>.
     * </p>
     * <p>
     * The key name <code>FeatureAttributeNames</code> is fixed. The values listed in <code>["col1", "col2", ...]</code>
     * is case sensitive and should be a list of strings containing unique values that are a subset of the column names
     * in the input data. The list of columns provided must not include the target column.
     * </p>
     * 
     * @param featureSpecificationS3Uri
     *        A URL to the Amazon S3 data source containing selected features from the input data source to run an
     *        Autopilot job. You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
     *        </p>
     *        <p>
     *        <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     *        </p>
     *        <p>
     *        You can also specify the data type of the feature (optional) in the format shown below:
     *        </p>
     *        <p>
     *        <code>{ "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }</code>
     *        </p>
     *        <note>
     *        <p>
     *        These column keys may not include the target column.
     *        </p>
     *        </note>
     *        <p>
     *        In ensembling mode, Autopilot will only support the following data types: <code>numeric</code>,
     *        <code>categorical</code>, <code>text</code> and <code>datetime</code>. In HPO mode, Autopilot can support
     *        <code>numeric</code>, <code>categorical</code>, <code>text</code>, <code>datetime</code> and
     *        <code>sequence</code>.
     *        </p>
     *        <p>
     *        If only <code>FeatureDataTypes</code> is provided, the column keys (<code>col1</code>, <code>col2</code>
     *        ,..) should be a subset of the column names in the input data.
     *        </p>
     *        <p>
     *        If both <code>FeatureDataTypes</code> and <code>FeatureAttributeNames</code> are provided, then the column
     *        keys should be a subset of the column names provided in <code>FeatureAttributeNames</code>.
     *        </p>
     *        <p>
     *        The key name <code>FeatureAttributeNames</code> is fixed. The values listed in
     *        <code>["col1", "col2", ...]</code> is case sensitive and should be a list of strings containing unique
     *        values that are a subset of the column names in the input data. The list of columns provided must not
     *        include the target column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLCandidateGenerationConfig withFeatureSpecificationS3Uri(String featureSpecificationS3Uri) {
        setFeatureSpecificationS3Uri(featureSpecificationS3Uri);
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
        if (getFeatureSpecificationS3Uri() != null)
            sb.append("FeatureSpecificationS3Uri: ").append(getFeatureSpecificationS3Uri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLCandidateGenerationConfig == false)
            return false;
        AutoMLCandidateGenerationConfig other = (AutoMLCandidateGenerationConfig) obj;
        if (other.getFeatureSpecificationS3Uri() == null ^ this.getFeatureSpecificationS3Uri() == null)
            return false;
        if (other.getFeatureSpecificationS3Uri() != null && other.getFeatureSpecificationS3Uri().equals(this.getFeatureSpecificationS3Uri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureSpecificationS3Uri() == null) ? 0 : getFeatureSpecificationS3Uri().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLCandidateGenerationConfig clone() {
        try {
            return (AutoMLCandidateGenerationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLCandidateGenerationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
