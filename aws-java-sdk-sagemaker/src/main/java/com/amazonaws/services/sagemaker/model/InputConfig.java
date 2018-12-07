/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about the location of input model artifacts, the name and shape of the expected data inputs, and
 * the framework in which the model was trained.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/InputConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The S3 path where the model artifacts, which result from model training, are stored. This path must point to a
     * single gzip compressed tar archive (.tar.gz suffix).
     * </p>
     */
    private String s3Uri;
    /**
     * <p>
     * Specifies the name and shape of the expected data inputs for your trained model with a JSON dictionary form. The
     * data inputs are <a>InputConfig$Framework</a> specific.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TENSORFLOW</code>, <code>MXNET</code> and <code>ONNX</code>: You must specify the name and shape of the
     * expected data inputs in order using a dictionary format for your trained model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example of one input: <code>{‘data’:[1,3,1024,1024]}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example for two inputs: <code>{‘var1’: [1,1,28,28], ‘var2’:[1,1,28,28]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>PYTORCH</code>: You can either specify the name and shape of expected data inputs in order using a
     * dictionary format for your trained model or you can specify the shape only using a list format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example of one input in dictionary format: <code>{‘input0’:[1,3,224,234]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example of one input in list format: <code>[1,3,224,224]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example of two inputs in dictionary format: <code>{‘input0’:[1,3,224,234], 'input1':[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example of two inputs in list format: <code>[[1,3,224,224], [1,3,224,224]]</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>XGBOOST</code>: input data name and shape are not needed.
     * </p>
     * </li>
     * </ul>
     */
    private String dataInputConfig;
    /**
     * <p>
     * Identifies the framework in which the model was trained. For example: TENSORFLOW.
     * </p>
     */
    private String framework;

    /**
     * <p>
     * The S3 path where the model artifacts, which result from model training, are stored. This path must point to a
     * single gzip compressed tar archive (.tar.gz suffix).
     * </p>
     * 
     * @param s3Uri
     *        The S3 path where the model artifacts, which result from model training, are stored. This path must point
     *        to a single gzip compressed tar archive (.tar.gz suffix).
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The S3 path where the model artifacts, which result from model training, are stored. This path must point to a
     * single gzip compressed tar archive (.tar.gz suffix).
     * </p>
     * 
     * @return The S3 path where the model artifacts, which result from model training, are stored. This path must point
     *         to a single gzip compressed tar archive (.tar.gz suffix).
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * The S3 path where the model artifacts, which result from model training, are stored. This path must point to a
     * single gzip compressed tar archive (.tar.gz suffix).
     * </p>
     * 
     * @param s3Uri
     *        The S3 path where the model artifacts, which result from model training, are stored. This path must point
     *        to a single gzip compressed tar archive (.tar.gz suffix).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputConfig withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
        return this;
    }

    /**
     * <p>
     * Specifies the name and shape of the expected data inputs for your trained model with a JSON dictionary form. The
     * data inputs are <a>InputConfig$Framework</a> specific.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TENSORFLOW</code>, <code>MXNET</code> and <code>ONNX</code>: You must specify the name and shape of the
     * expected data inputs in order using a dictionary format for your trained model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example of one input: <code>{‘data’:[1,3,1024,1024]}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example for two inputs: <code>{‘var1’: [1,1,28,28], ‘var2’:[1,1,28,28]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>PYTORCH</code>: You can either specify the name and shape of expected data inputs in order using a
     * dictionary format for your trained model or you can specify the shape only using a list format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example of one input in dictionary format: <code>{‘input0’:[1,3,224,234]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example of one input in list format: <code>[1,3,224,224]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example of two inputs in dictionary format: <code>{‘input0’:[1,3,224,234], 'input1':[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example of two inputs in list format: <code>[[1,3,224,224], [1,3,224,224]]</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>XGBOOST</code>: input data name and shape are not needed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataInputConfig
     *        Specifies the name and shape of the expected data inputs for your trained model with a JSON dictionary
     *        form. The data inputs are <a>InputConfig$Framework</a> specific. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TENSORFLOW</code>, <code>MXNET</code> and <code>ONNX</code>: You must specify the name and shape of
     *        the expected data inputs in order using a dictionary format for your trained model.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Example of one input: <code>{‘data’:[1,3,1024,1024]}}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example for two inputs: <code>{‘var1’: [1,1,28,28], ‘var2’:[1,1,28,28]}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PYTORCH</code>: You can either specify the name and shape of expected data inputs in order using a
     *        dictionary format for your trained model or you can specify the shape only using a list format.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Example of one input in dictionary format: <code>{‘input0’:[1,3,224,234]}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example of one input in list format: <code>[1,3,224,224]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example of two inputs in dictionary format: <code>{‘input0’:[1,3,224,234], 'input1':[1,3,224,224]}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example of two inputs in list format: <code>[[1,3,224,224], [1,3,224,224]]</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XGBOOST</code>: input data name and shape are not needed.
     *        </p>
     *        </li>
     */

    public void setDataInputConfig(String dataInputConfig) {
        this.dataInputConfig = dataInputConfig;
    }

    /**
     * <p>
     * Specifies the name and shape of the expected data inputs for your trained model with a JSON dictionary form. The
     * data inputs are <a>InputConfig$Framework</a> specific.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TENSORFLOW</code>, <code>MXNET</code> and <code>ONNX</code>: You must specify the name and shape of the
     * expected data inputs in order using a dictionary format for your trained model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example of one input: <code>{‘data’:[1,3,1024,1024]}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example for two inputs: <code>{‘var1’: [1,1,28,28], ‘var2’:[1,1,28,28]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>PYTORCH</code>: You can either specify the name and shape of expected data inputs in order using a
     * dictionary format for your trained model or you can specify the shape only using a list format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example of one input in dictionary format: <code>{‘input0’:[1,3,224,234]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example of one input in list format: <code>[1,3,224,224]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example of two inputs in dictionary format: <code>{‘input0’:[1,3,224,234], 'input1':[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example of two inputs in list format: <code>[[1,3,224,224], [1,3,224,224]]</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>XGBOOST</code>: input data name and shape are not needed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the name and shape of the expected data inputs for your trained model with a JSON dictionary
     *         form. The data inputs are <a>InputConfig$Framework</a> specific. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TENSORFLOW</code>, <code>MXNET</code> and <code>ONNX</code>: You must specify the name and shape of
     *         the expected data inputs in order using a dictionary format for your trained model.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Example of one input: <code>{‘data’:[1,3,1024,1024]}}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example for two inputs: <code>{‘var1’: [1,1,28,28], ‘var2’:[1,1,28,28]}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PYTORCH</code>: You can either specify the name and shape of expected data inputs in order using a
     *         dictionary format for your trained model or you can specify the shape only using a list format.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Example of one input in dictionary format: <code>{‘input0’:[1,3,224,234]}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example of one input in list format: <code>[1,3,224,224]</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example of two inputs in dictionary format: <code>{‘input0’:[1,3,224,234], 'input1':[1,3,224,224]}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example of two inputs in list format: <code>[[1,3,224,224], [1,3,224,224]]</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>XGBOOST</code>: input data name and shape are not needed.
     *         </p>
     *         </li>
     */

    public String getDataInputConfig() {
        return this.dataInputConfig;
    }

    /**
     * <p>
     * Specifies the name and shape of the expected data inputs for your trained model with a JSON dictionary form. The
     * data inputs are <a>InputConfig$Framework</a> specific.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TENSORFLOW</code>, <code>MXNET</code> and <code>ONNX</code>: You must specify the name and shape of the
     * expected data inputs in order using a dictionary format for your trained model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example of one input: <code>{‘data’:[1,3,1024,1024]}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example for two inputs: <code>{‘var1’: [1,1,28,28], ‘var2’:[1,1,28,28]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>PYTORCH</code>: You can either specify the name and shape of expected data inputs in order using a
     * dictionary format for your trained model or you can specify the shape only using a list format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example of one input in dictionary format: <code>{‘input0’:[1,3,224,234]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example of one input in list format: <code>[1,3,224,224]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example of two inputs in dictionary format: <code>{‘input0’:[1,3,224,234], 'input1':[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example of two inputs in list format: <code>[[1,3,224,224], [1,3,224,224]]</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>XGBOOST</code>: input data name and shape are not needed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataInputConfig
     *        Specifies the name and shape of the expected data inputs for your trained model with a JSON dictionary
     *        form. The data inputs are <a>InputConfig$Framework</a> specific. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TENSORFLOW</code>, <code>MXNET</code> and <code>ONNX</code>: You must specify the name and shape of
     *        the expected data inputs in order using a dictionary format for your trained model.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Example of one input: <code>{‘data’:[1,3,1024,1024]}}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example for two inputs: <code>{‘var1’: [1,1,28,28], ‘var2’:[1,1,28,28]}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PYTORCH</code>: You can either specify the name and shape of expected data inputs in order using a
     *        dictionary format for your trained model or you can specify the shape only using a list format.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Example of one input in dictionary format: <code>{‘input0’:[1,3,224,234]}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example of one input in list format: <code>[1,3,224,224]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example of two inputs in dictionary format: <code>{‘input0’:[1,3,224,234], 'input1':[1,3,224,224]}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example of two inputs in list format: <code>[[1,3,224,224], [1,3,224,224]]</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XGBOOST</code>: input data name and shape are not needed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputConfig withDataInputConfig(String dataInputConfig) {
        setDataInputConfig(dataInputConfig);
        return this;
    }

    /**
     * <p>
     * Identifies the framework in which the model was trained. For example: TENSORFLOW.
     * </p>
     * 
     * @param framework
     *        Identifies the framework in which the model was trained. For example: TENSORFLOW.
     * @see Framework
     */

    public void setFramework(String framework) {
        this.framework = framework;
    }

    /**
     * <p>
     * Identifies the framework in which the model was trained. For example: TENSORFLOW.
     * </p>
     * 
     * @return Identifies the framework in which the model was trained. For example: TENSORFLOW.
     * @see Framework
     */

    public String getFramework() {
        return this.framework;
    }

    /**
     * <p>
     * Identifies the framework in which the model was trained. For example: TENSORFLOW.
     * </p>
     * 
     * @param framework
     *        Identifies the framework in which the model was trained. For example: TENSORFLOW.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Framework
     */

    public InputConfig withFramework(String framework) {
        setFramework(framework);
        return this;
    }

    /**
     * <p>
     * Identifies the framework in which the model was trained. For example: TENSORFLOW.
     * </p>
     * 
     * @param framework
     *        Identifies the framework in which the model was trained. For example: TENSORFLOW.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Framework
     */

    public InputConfig withFramework(Framework framework) {
        this.framework = framework.toString();
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
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append(getS3Uri()).append(",");
        if (getDataInputConfig() != null)
            sb.append("DataInputConfig: ").append(getDataInputConfig()).append(",");
        if (getFramework() != null)
            sb.append("Framework: ").append(getFramework());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputConfig == false)
            return false;
        InputConfig other = (InputConfig) obj;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getDataInputConfig() == null ^ this.getDataInputConfig() == null)
            return false;
        if (other.getDataInputConfig() != null && other.getDataInputConfig().equals(this.getDataInputConfig()) == false)
            return false;
        if (other.getFramework() == null ^ this.getFramework() == null)
            return false;
        if (other.getFramework() != null && other.getFramework().equals(this.getFramework()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getDataInputConfig() == null) ? 0 : getDataInputConfig().hashCode());
        hashCode = prime * hashCode + ((getFramework() == null) ? 0 : getFramework().hashCode());
        return hashCode;
    }

    @Override
    public InputConfig clone() {
        try {
            return (InputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.InputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
