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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * For an SQL-based Amazon Kinesis Data Analytics application, describes a processor that is used to preprocess the
 * records in the stream before being processed by your application code. Currently, the only input processor available
 * is <a href="https://aws.amazon.com/documentation/lambda/">AWS Lambda</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/InputProcessingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputProcessingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <a>InputLambdaProcessor</a> that is used to preprocess the records in the stream before being processed by
     * your application code.
     * </p>
     */
    private InputLambdaProcessor inputLambdaProcessor;

    /**
     * <p>
     * The <a>InputLambdaProcessor</a> that is used to preprocess the records in the stream before being processed by
     * your application code.
     * </p>
     * 
     * @param inputLambdaProcessor
     *        The <a>InputLambdaProcessor</a> that is used to preprocess the records in the stream before being
     *        processed by your application code.
     */

    public void setInputLambdaProcessor(InputLambdaProcessor inputLambdaProcessor) {
        this.inputLambdaProcessor = inputLambdaProcessor;
    }

    /**
     * <p>
     * The <a>InputLambdaProcessor</a> that is used to preprocess the records in the stream before being processed by
     * your application code.
     * </p>
     * 
     * @return The <a>InputLambdaProcessor</a> that is used to preprocess the records in the stream before being
     *         processed by your application code.
     */

    public InputLambdaProcessor getInputLambdaProcessor() {
        return this.inputLambdaProcessor;
    }

    /**
     * <p>
     * The <a>InputLambdaProcessor</a> that is used to preprocess the records in the stream before being processed by
     * your application code.
     * </p>
     * 
     * @param inputLambdaProcessor
     *        The <a>InputLambdaProcessor</a> that is used to preprocess the records in the stream before being
     *        processed by your application code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputProcessingConfiguration withInputLambdaProcessor(InputLambdaProcessor inputLambdaProcessor) {
        setInputLambdaProcessor(inputLambdaProcessor);
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
        if (getInputLambdaProcessor() != null)
            sb.append("InputLambdaProcessor: ").append(getInputLambdaProcessor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputProcessingConfiguration == false)
            return false;
        InputProcessingConfiguration other = (InputProcessingConfiguration) obj;
        if (other.getInputLambdaProcessor() == null ^ this.getInputLambdaProcessor() == null)
            return false;
        if (other.getInputLambdaProcessor() != null && other.getInputLambdaProcessor().equals(this.getInputLambdaProcessor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputLambdaProcessor() == null) ? 0 : getInputLambdaProcessor().hashCode());
        return hashCode;
    }

    @Override
    public InputProcessingConfiguration clone() {
        try {
            return (InputProcessingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.InputProcessingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
