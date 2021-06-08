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
 * Describes the results of a processing job. The processing output must specify exactly one of either
 * <code>S3Output</code> or <code>FeatureStoreOutput</code> types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ProcessingOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProcessingOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name for the processing job output.
     * </p>
     */
    private String outputName;
    /**
     * <p>
     * Configuration for processing job outputs in Amazon S3.
     * </p>
     */
    private ProcessingS3Output s3Output;
    /**
     * <p>
     * Configuration for processing job outputs in Amazon SageMaker Feature Store. This processing output type is only
     * supported when <code>AppManaged</code> is specified.
     * </p>
     */
    private ProcessingFeatureStoreOutput featureStoreOutput;
    /**
     * <p>
     * When <code>True</code>, output operations such as data upload are managed natively by the processing job
     * application. When <code>False</code> (default), output operations are managed by Amazon SageMaker.
     * </p>
     */
    private Boolean appManaged;

    /**
     * <p>
     * The name for the processing job output.
     * </p>
     * 
     * @param outputName
     *        The name for the processing job output.
     */

    public void setOutputName(String outputName) {
        this.outputName = outputName;
    }

    /**
     * <p>
     * The name for the processing job output.
     * </p>
     * 
     * @return The name for the processing job output.
     */

    public String getOutputName() {
        return this.outputName;
    }

    /**
     * <p>
     * The name for the processing job output.
     * </p>
     * 
     * @param outputName
     *        The name for the processing job output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingOutput withOutputName(String outputName) {
        setOutputName(outputName);
        return this;
    }

    /**
     * <p>
     * Configuration for processing job outputs in Amazon S3.
     * </p>
     * 
     * @param s3Output
     *        Configuration for processing job outputs in Amazon S3.
     */

    public void setS3Output(ProcessingS3Output s3Output) {
        this.s3Output = s3Output;
    }

    /**
     * <p>
     * Configuration for processing job outputs in Amazon S3.
     * </p>
     * 
     * @return Configuration for processing job outputs in Amazon S3.
     */

    public ProcessingS3Output getS3Output() {
        return this.s3Output;
    }

    /**
     * <p>
     * Configuration for processing job outputs in Amazon S3.
     * </p>
     * 
     * @param s3Output
     *        Configuration for processing job outputs in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingOutput withS3Output(ProcessingS3Output s3Output) {
        setS3Output(s3Output);
        return this;
    }

    /**
     * <p>
     * Configuration for processing job outputs in Amazon SageMaker Feature Store. This processing output type is only
     * supported when <code>AppManaged</code> is specified.
     * </p>
     * 
     * @param featureStoreOutput
     *        Configuration for processing job outputs in Amazon SageMaker Feature Store. This processing output type is
     *        only supported when <code>AppManaged</code> is specified.
     */

    public void setFeatureStoreOutput(ProcessingFeatureStoreOutput featureStoreOutput) {
        this.featureStoreOutput = featureStoreOutput;
    }

    /**
     * <p>
     * Configuration for processing job outputs in Amazon SageMaker Feature Store. This processing output type is only
     * supported when <code>AppManaged</code> is specified.
     * </p>
     * 
     * @return Configuration for processing job outputs in Amazon SageMaker Feature Store. This processing output type
     *         is only supported when <code>AppManaged</code> is specified.
     */

    public ProcessingFeatureStoreOutput getFeatureStoreOutput() {
        return this.featureStoreOutput;
    }

    /**
     * <p>
     * Configuration for processing job outputs in Amazon SageMaker Feature Store. This processing output type is only
     * supported when <code>AppManaged</code> is specified.
     * </p>
     * 
     * @param featureStoreOutput
     *        Configuration for processing job outputs in Amazon SageMaker Feature Store. This processing output type is
     *        only supported when <code>AppManaged</code> is specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingOutput withFeatureStoreOutput(ProcessingFeatureStoreOutput featureStoreOutput) {
        setFeatureStoreOutput(featureStoreOutput);
        return this;
    }

    /**
     * <p>
     * When <code>True</code>, output operations such as data upload are managed natively by the processing job
     * application. When <code>False</code> (default), output operations are managed by Amazon SageMaker.
     * </p>
     * 
     * @param appManaged
     *        When <code>True</code>, output operations such as data upload are managed natively by the processing job
     *        application. When <code>False</code> (default), output operations are managed by Amazon SageMaker.
     */

    public void setAppManaged(Boolean appManaged) {
        this.appManaged = appManaged;
    }

    /**
     * <p>
     * When <code>True</code>, output operations such as data upload are managed natively by the processing job
     * application. When <code>False</code> (default), output operations are managed by Amazon SageMaker.
     * </p>
     * 
     * @return When <code>True</code>, output operations such as data upload are managed natively by the processing job
     *         application. When <code>False</code> (default), output operations are managed by Amazon SageMaker.
     */

    public Boolean getAppManaged() {
        return this.appManaged;
    }

    /**
     * <p>
     * When <code>True</code>, output operations such as data upload are managed natively by the processing job
     * application. When <code>False</code> (default), output operations are managed by Amazon SageMaker.
     * </p>
     * 
     * @param appManaged
     *        When <code>True</code>, output operations such as data upload are managed natively by the processing job
     *        application. When <code>False</code> (default), output operations are managed by Amazon SageMaker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingOutput withAppManaged(Boolean appManaged) {
        setAppManaged(appManaged);
        return this;
    }

    /**
     * <p>
     * When <code>True</code>, output operations such as data upload are managed natively by the processing job
     * application. When <code>False</code> (default), output operations are managed by Amazon SageMaker.
     * </p>
     * 
     * @return When <code>True</code>, output operations such as data upload are managed natively by the processing job
     *         application. When <code>False</code> (default), output operations are managed by Amazon SageMaker.
     */

    public Boolean isAppManaged() {
        return this.appManaged;
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
        if (getOutputName() != null)
            sb.append("OutputName: ").append(getOutputName()).append(",");
        if (getS3Output() != null)
            sb.append("S3Output: ").append(getS3Output()).append(",");
        if (getFeatureStoreOutput() != null)
            sb.append("FeatureStoreOutput: ").append(getFeatureStoreOutput()).append(",");
        if (getAppManaged() != null)
            sb.append("AppManaged: ").append(getAppManaged());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessingOutput == false)
            return false;
        ProcessingOutput other = (ProcessingOutput) obj;
        if (other.getOutputName() == null ^ this.getOutputName() == null)
            return false;
        if (other.getOutputName() != null && other.getOutputName().equals(this.getOutputName()) == false)
            return false;
        if (other.getS3Output() == null ^ this.getS3Output() == null)
            return false;
        if (other.getS3Output() != null && other.getS3Output().equals(this.getS3Output()) == false)
            return false;
        if (other.getFeatureStoreOutput() == null ^ this.getFeatureStoreOutput() == null)
            return false;
        if (other.getFeatureStoreOutput() != null && other.getFeatureStoreOutput().equals(this.getFeatureStoreOutput()) == false)
            return false;
        if (other.getAppManaged() == null ^ this.getAppManaged() == null)
            return false;
        if (other.getAppManaged() != null && other.getAppManaged().equals(this.getAppManaged()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputName() == null) ? 0 : getOutputName().hashCode());
        hashCode = prime * hashCode + ((getS3Output() == null) ? 0 : getS3Output().hashCode());
        hashCode = prime * hashCode + ((getFeatureStoreOutput() == null) ? 0 : getFeatureStoreOutput().hashCode());
        hashCode = prime * hashCode + ((getAppManaged() == null) ? 0 : getAppManaged().hashCode());
        return hashCode;
    }

    @Override
    public ProcessingOutput clone() {
        try {
            return (ProcessingOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ProcessingOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
