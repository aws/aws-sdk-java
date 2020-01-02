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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The inputs for a processing job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ProcessingInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProcessingInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the inputs for the processing job.
     * </p>
     */
    private String inputName;
    /**
     * <p>
     * The S3 inputs for the processing job.
     * </p>
     */
    private ProcessingS3Input s3Input;

    /**
     * <p>
     * The name of the inputs for the processing job.
     * </p>
     * 
     * @param inputName
     *        The name of the inputs for the processing job.
     */

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    /**
     * <p>
     * The name of the inputs for the processing job.
     * </p>
     * 
     * @return The name of the inputs for the processing job.
     */

    public String getInputName() {
        return this.inputName;
    }

    /**
     * <p>
     * The name of the inputs for the processing job.
     * </p>
     * 
     * @param inputName
     *        The name of the inputs for the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingInput withInputName(String inputName) {
        setInputName(inputName);
        return this;
    }

    /**
     * <p>
     * The S3 inputs for the processing job.
     * </p>
     * 
     * @param s3Input
     *        The S3 inputs for the processing job.
     */

    public void setS3Input(ProcessingS3Input s3Input) {
        this.s3Input = s3Input;
    }

    /**
     * <p>
     * The S3 inputs for the processing job.
     * </p>
     * 
     * @return The S3 inputs for the processing job.
     */

    public ProcessingS3Input getS3Input() {
        return this.s3Input;
    }

    /**
     * <p>
     * The S3 inputs for the processing job.
     * </p>
     * 
     * @param s3Input
     *        The S3 inputs for the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingInput withS3Input(ProcessingS3Input s3Input) {
        setS3Input(s3Input);
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
        if (getS3Input() != null)
            sb.append("S3Input: ").append(getS3Input());
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
        if (other.getS3Input() == null ^ this.getS3Input() == null)
            return false;
        if (other.getS3Input() != null && other.getS3Input().equals(this.getS3Input()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputName() == null) ? 0 : getInputName().hashCode());
        hashCode = prime * hashCode + ((getS3Input() == null) ? 0 : getS3Input().hashCode());
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
