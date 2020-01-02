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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartExportLabelsTaskRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartExportLabelsTaskRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     */
    private String transformId;
    /**
     * <p>
     * The Amazon S3 path where you export the labels.
     * </p>
     */
    private String outputS3Path;

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

    public StartExportLabelsTaskRunRequest withTransformId(String transformId) {
        setTransformId(transformId);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 path where you export the labels.
     * </p>
     * 
     * @param outputS3Path
     *        The Amazon S3 path where you export the labels.
     */

    public void setOutputS3Path(String outputS3Path) {
        this.outputS3Path = outputS3Path;
    }

    /**
     * <p>
     * The Amazon S3 path where you export the labels.
     * </p>
     * 
     * @return The Amazon S3 path where you export the labels.
     */

    public String getOutputS3Path() {
        return this.outputS3Path;
    }

    /**
     * <p>
     * The Amazon S3 path where you export the labels.
     * </p>
     * 
     * @param outputS3Path
     *        The Amazon S3 path where you export the labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExportLabelsTaskRunRequest withOutputS3Path(String outputS3Path) {
        setOutputS3Path(outputS3Path);
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
        if (getTransformId() != null)
            sb.append("TransformId: ").append(getTransformId()).append(",");
        if (getOutputS3Path() != null)
            sb.append("OutputS3Path: ").append(getOutputS3Path());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartExportLabelsTaskRunRequest == false)
            return false;
        StartExportLabelsTaskRunRequest other = (StartExportLabelsTaskRunRequest) obj;
        if (other.getTransformId() == null ^ this.getTransformId() == null)
            return false;
        if (other.getTransformId() != null && other.getTransformId().equals(this.getTransformId()) == false)
            return false;
        if (other.getOutputS3Path() == null ^ this.getOutputS3Path() == null)
            return false;
        if (other.getOutputS3Path() != null && other.getOutputS3Path().equals(this.getOutputS3Path()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransformId() == null) ? 0 : getTransformId().hashCode());
        hashCode = prime * hashCode + ((getOutputS3Path() == null) ? 0 : getOutputS3Path().hashCode());
        return hashCode;
    }

    @Override
    public StartExportLabelsTaskRunRequest clone() {
        return (StartExportLabelsTaskRunRequest) super.clone();
    }

}
