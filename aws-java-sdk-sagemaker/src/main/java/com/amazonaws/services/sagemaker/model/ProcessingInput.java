/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The inputs for a processing job. The processing input must specify exactly one of either <code>S3Input</code> or
 * <code>DatasetDefinition</code> types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ProcessingInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProcessingInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name for the processing job input.
     * </p>
     */
    private String inputName;
    /**
     * <p>
     * When <code>True</code>, input operations such as data download are managed natively by the processing job
     * application. When <code>False</code> (default), input operations are managed by Amazon SageMaker.
     * </p>
     */
    private Boolean appManaged;
    /**
     * <p>
     * Configuration for downloading input data from Amazon S3 into the processing container.
     * </p>
     */
    private ProcessingS3Input s3Input;
    /**
     * <p>
     * Configuration for a Dataset Definition input.
     * </p>
     */
    private DatasetDefinition datasetDefinition;

    /**
     * <p>
     * The name for the processing job input.
     * </p>
     * 
     * @param inputName
     *        The name for the processing job input.
     */

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    /**
     * <p>
     * The name for the processing job input.
     * </p>
     * 
     * @return The name for the processing job input.
     */

    public String getInputName() {
        return this.inputName;
    }

    /**
     * <p>
     * The name for the processing job input.
     * </p>
     * 
     * @param inputName
     *        The name for the processing job input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingInput withInputName(String inputName) {
        setInputName(inputName);
        return this;
    }

    /**
     * <p>
     * When <code>True</code>, input operations such as data download are managed natively by the processing job
     * application. When <code>False</code> (default), input operations are managed by Amazon SageMaker.
     * </p>
     * 
     * @param appManaged
     *        When <code>True</code>, input operations such as data download are managed natively by the processing job
     *        application. When <code>False</code> (default), input operations are managed by Amazon SageMaker.
     */

    public void setAppManaged(Boolean appManaged) {
        this.appManaged = appManaged;
    }

    /**
     * <p>
     * When <code>True</code>, input operations such as data download are managed natively by the processing job
     * application. When <code>False</code> (default), input operations are managed by Amazon SageMaker.
     * </p>
     * 
     * @return When <code>True</code>, input operations such as data download are managed natively by the processing job
     *         application. When <code>False</code> (default), input operations are managed by Amazon SageMaker.
     */

    public Boolean getAppManaged() {
        return this.appManaged;
    }

    /**
     * <p>
     * When <code>True</code>, input operations such as data download are managed natively by the processing job
     * application. When <code>False</code> (default), input operations are managed by Amazon SageMaker.
     * </p>
     * 
     * @param appManaged
     *        When <code>True</code>, input operations such as data download are managed natively by the processing job
     *        application. When <code>False</code> (default), input operations are managed by Amazon SageMaker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingInput withAppManaged(Boolean appManaged) {
        setAppManaged(appManaged);
        return this;
    }

    /**
     * <p>
     * When <code>True</code>, input operations such as data download are managed natively by the processing job
     * application. When <code>False</code> (default), input operations are managed by Amazon SageMaker.
     * </p>
     * 
     * @return When <code>True</code>, input operations such as data download are managed natively by the processing job
     *         application. When <code>False</code> (default), input operations are managed by Amazon SageMaker.
     */

    public Boolean isAppManaged() {
        return this.appManaged;
    }

    /**
     * <p>
     * Configuration for downloading input data from Amazon S3 into the processing container.
     * </p>
     * 
     * @param s3Input
     *        Configuration for downloading input data from Amazon S3 into the processing container.
     */

    public void setS3Input(ProcessingS3Input s3Input) {
        this.s3Input = s3Input;
    }

    /**
     * <p>
     * Configuration for downloading input data from Amazon S3 into the processing container.
     * </p>
     * 
     * @return Configuration for downloading input data from Amazon S3 into the processing container.
     */

    public ProcessingS3Input getS3Input() {
        return this.s3Input;
    }

    /**
     * <p>
     * Configuration for downloading input data from Amazon S3 into the processing container.
     * </p>
     * 
     * @param s3Input
     *        Configuration for downloading input data from Amazon S3 into the processing container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingInput withS3Input(ProcessingS3Input s3Input) {
        setS3Input(s3Input);
        return this;
    }

    /**
     * <p>
     * Configuration for a Dataset Definition input.
     * </p>
     * 
     * @param datasetDefinition
     *        Configuration for a Dataset Definition input.
     */

    public void setDatasetDefinition(DatasetDefinition datasetDefinition) {
        this.datasetDefinition = datasetDefinition;
    }

    /**
     * <p>
     * Configuration for a Dataset Definition input.
     * </p>
     * 
     * @return Configuration for a Dataset Definition input.
     */

    public DatasetDefinition getDatasetDefinition() {
        return this.datasetDefinition;
    }

    /**
     * <p>
     * Configuration for a Dataset Definition input.
     * </p>
     * 
     * @param datasetDefinition
     *        Configuration for a Dataset Definition input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingInput withDatasetDefinition(DatasetDefinition datasetDefinition) {
        setDatasetDefinition(datasetDefinition);
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
        if (getInputName() != null)
            sb.append("InputName: ").append(getInputName()).append(",");
        if (getAppManaged() != null)
            sb.append("AppManaged: ").append(getAppManaged()).append(",");
        if (getS3Input() != null)
            sb.append("S3Input: ").append(getS3Input()).append(",");
        if (getDatasetDefinition() != null)
            sb.append("DatasetDefinition: ").append(getDatasetDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessingInput == false)
            return false;
        ProcessingInput other = (ProcessingInput) obj;
        if (other.getInputName() == null ^ this.getInputName() == null)
            return false;
        if (other.getInputName() != null && other.getInputName().equals(this.getInputName()) == false)
            return false;
        if (other.getAppManaged() == null ^ this.getAppManaged() == null)
            return false;
        if (other.getAppManaged() != null && other.getAppManaged().equals(this.getAppManaged()) == false)
            return false;
        if (other.getS3Input() == null ^ this.getS3Input() == null)
            return false;
        if (other.getS3Input() != null && other.getS3Input().equals(this.getS3Input()) == false)
            return false;
        if (other.getDatasetDefinition() == null ^ this.getDatasetDefinition() == null)
            return false;
        if (other.getDatasetDefinition() != null && other.getDatasetDefinition().equals(this.getDatasetDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputName() == null) ? 0 : getInputName().hashCode());
        hashCode = prime * hashCode + ((getAppManaged() == null) ? 0 : getAppManaged().hashCode());
        hashCode = prime * hashCode + ((getS3Input() == null) ? 0 : getS3Input().hashCode());
        hashCode = prime * hashCode + ((getDatasetDefinition() == null) ? 0 : getDatasetDefinition().hashCode());
        return hashCode;
    }

    @Override
    public ProcessingInput clone() {
        try {
            return (ProcessingInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ProcessingInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
