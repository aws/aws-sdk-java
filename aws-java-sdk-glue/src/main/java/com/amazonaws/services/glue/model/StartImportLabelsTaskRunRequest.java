/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartImportLabelsTaskRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartImportLabelsTaskRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     */
    private String transformId;
    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path from where you import the labels.
     * </p>
     */
    private String inputS3Path;
    /**
     * <p>
     * Indicates whether to overwrite your existing labels.
     * </p>
     */
    private Boolean replaceAllLabels;

    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     * 
     * @param transformId
     *        The unique identifier of the machine learning transform.
     */

    public void setTransformId(String transformId) {
        this.transformId = transformId;
    }

    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     * 
     * @return The unique identifier of the machine learning transform.
     */

    public String getTransformId() {
        return this.transformId;
    }

    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     * 
     * @param transformId
     *        The unique identifier of the machine learning transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportLabelsTaskRunRequest withTransformId(String transformId) {
        setTransformId(transformId);
        return this;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path from where you import the labels.
     * </p>
     * 
     * @param inputS3Path
     *        The Amazon Simple Storage Service (Amazon S3) path from where you import the labels.
     */

    public void setInputS3Path(String inputS3Path) {
        this.inputS3Path = inputS3Path;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path from where you import the labels.
     * </p>
     * 
     * @return The Amazon Simple Storage Service (Amazon S3) path from where you import the labels.
     */

    public String getInputS3Path() {
        return this.inputS3Path;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path from where you import the labels.
     * </p>
     * 
     * @param inputS3Path
     *        The Amazon Simple Storage Service (Amazon S3) path from where you import the labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportLabelsTaskRunRequest withInputS3Path(String inputS3Path) {
        setInputS3Path(inputS3Path);
        return this;
    }

    /**
     * <p>
     * Indicates whether to overwrite your existing labels.
     * </p>
     * 
     * @param replaceAllLabels
     *        Indicates whether to overwrite your existing labels.
     */

    public void setReplaceAllLabels(Boolean replaceAllLabels) {
        this.replaceAllLabels = replaceAllLabels;
    }

    /**
     * <p>
     * Indicates whether to overwrite your existing labels.
     * </p>
     * 
     * @return Indicates whether to overwrite your existing labels.
     */

    public Boolean getReplaceAllLabels() {
        return this.replaceAllLabels;
    }

    /**
     * <p>
     * Indicates whether to overwrite your existing labels.
     * </p>
     * 
     * @param replaceAllLabels
     *        Indicates whether to overwrite your existing labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportLabelsTaskRunRequest withReplaceAllLabels(Boolean replaceAllLabels) {
        setReplaceAllLabels(replaceAllLabels);
        return this;
    }

    /**
     * <p>
     * Indicates whether to overwrite your existing labels.
     * </p>
     * 
     * @return Indicates whether to overwrite your existing labels.
     */

    public Boolean isReplaceAllLabels() {
        return this.replaceAllLabels;
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
        if (getTransformId() != null)
            sb.append("TransformId: ").append(getTransformId()).append(",");
        if (getInputS3Path() != null)
            sb.append("InputS3Path: ").append(getInputS3Path()).append(",");
        if (getReplaceAllLabels() != null)
            sb.append("ReplaceAllLabels: ").append(getReplaceAllLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartImportLabelsTaskRunRequest == false)
            return false;
        StartImportLabelsTaskRunRequest other = (StartImportLabelsTaskRunRequest) obj;
        if (other.getTransformId() == null ^ this.getTransformId() == null)
            return false;
        if (other.getTransformId() != null && other.getTransformId().equals(this.getTransformId()) == false)
            return false;
        if (other.getInputS3Path() == null ^ this.getInputS3Path() == null)
            return false;
        if (other.getInputS3Path() != null && other.getInputS3Path().equals(this.getInputS3Path()) == false)
            return false;
        if (other.getReplaceAllLabels() == null ^ this.getReplaceAllLabels() == null)
            return false;
        if (other.getReplaceAllLabels() != null && other.getReplaceAllLabels().equals(this.getReplaceAllLabels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransformId() == null) ? 0 : getTransformId().hashCode());
        hashCode = prime * hashCode + ((getInputS3Path() == null) ? 0 : getInputS3Path().hashCode());
        hashCode = prime * hashCode + ((getReplaceAllLabels() == null) ? 0 : getReplaceAllLabels().hashCode());
        return hashCode;
    }

    @Override
    public StartImportLabelsTaskRunRequest clone() {
        return (StartImportLabelsTaskRunRequest) super.clone();
    }

}
