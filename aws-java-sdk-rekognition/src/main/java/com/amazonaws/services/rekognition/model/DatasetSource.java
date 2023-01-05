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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The source that Amazon Rekognition Custom Labels uses to create a dataset. To use an Amazon Sagemaker format manifest
 * file, specify the S3 bucket location in the <code>GroundTruthManifest</code> field. The S3 bucket must be in your AWS
 * account. To create a copy of an existing dataset, specify the Amazon Resource Name (ARN) of an existing dataset in
 * <code>DatasetArn</code>.
 * </p>
 * <p>
 * You need to specify a value for <code>DatasetArn</code> or <code>GroundTruthManifest</code>, but not both. if you
 * supply both values, or if you don't specify any values, an InvalidParameterException exception occurs.
 * </p>
 * <p>
 * For more information, see <a>CreateDataset</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetSource implements Serializable, Cloneable, StructuredPojo {

    private GroundTruthManifest groundTruthManifest;
    /**
     * <p>
     * The ARN of an Amazon Rekognition Custom Labels dataset that you want to copy.
     * </p>
     */
    private String datasetArn;

    /**
     * @param groundTruthManifest
     */

    public void setGroundTruthManifest(GroundTruthManifest groundTruthManifest) {
        this.groundTruthManifest = groundTruthManifest;
    }

    /**
     * @return
     */

    public GroundTruthManifest getGroundTruthManifest() {
        return this.groundTruthManifest;
    }

    /**
     * @param groundTruthManifest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetSource withGroundTruthManifest(GroundTruthManifest groundTruthManifest) {
        setGroundTruthManifest(groundTruthManifest);
        return this;
    }

    /**
     * <p>
     * The ARN of an Amazon Rekognition Custom Labels dataset that you want to copy.
     * </p>
     * 
     * @param datasetArn
     *        The ARN of an Amazon Rekognition Custom Labels dataset that you want to copy.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The ARN of an Amazon Rekognition Custom Labels dataset that you want to copy.
     * </p>
     * 
     * @return The ARN of an Amazon Rekognition Custom Labels dataset that you want to copy.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The ARN of an Amazon Rekognition Custom Labels dataset that you want to copy.
     * </p>
     * 
     * @param datasetArn
     *        The ARN of an Amazon Rekognition Custom Labels dataset that you want to copy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetSource withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
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
        if (getGroundTruthManifest() != null)
            sb.append("GroundTruthManifest: ").append(getGroundTruthManifest()).append(",");
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetSource == false)
            return false;
        DatasetSource other = (DatasetSource) obj;
        if (other.getGroundTruthManifest() == null ^ this.getGroundTruthManifest() == null)
            return false;
        if (other.getGroundTruthManifest() != null && other.getGroundTruthManifest().equals(this.getGroundTruthManifest()) == false)
            return false;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroundTruthManifest() == null) ? 0 : getGroundTruthManifest().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        return hashCode;
    }

    @Override
    public DatasetSource clone() {
        try {
            return (DatasetSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.DatasetSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
