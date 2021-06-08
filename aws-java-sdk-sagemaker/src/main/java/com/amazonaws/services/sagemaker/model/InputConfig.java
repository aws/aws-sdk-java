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
     * <code>TensorFlow</code>: You must specify the name and shape (NHWC format) of the expected data inputs using a
     * dictionary format for your trained model. The dictionary formats required for the console and CLI are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input":[1,1024,1024,3]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input\":[1,1024,1024,3]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"data1": [1,28,28,1], "data2":[1,28,28,1]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"data1\": [1,28,28,1], \"data2\":[1,28,28,1]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>KERAS</code>: You must specify the name and shape (NCHW format) of expected data inputs using a dictionary
     * format for your trained model. Note that while Keras model artifacts should be uploaded in NHWC (channel-last)
     * format, <code>DataInputConfig</code> should be specified in NCHW (channel-first) format. The dictionary formats
     * required for the console and CLI are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input_1":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input_1\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input_1": [1,3,224,224], "input_2":[1,3,224,224]} </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input_1\": [1,3,224,224], \"input_2\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>MXNET/ONNX/DARKNET</code>: You must specify the name and shape (NCHW format) of the expected data inputs in
     * order using a dictionary format for your trained model. The dictionary formats required for the console and CLI
     * are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"data":[1,3,1024,1024]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"data\":[1,3,1024,1024]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"var1": [1,1,28,28], "var2":[1,1,28,28]} </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"var1\": [1,1,28,28], \"var2\":[1,1,28,28]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>PyTorch</code>: You can either specify the name and shape (NCHW format) of expected data inputs in order
     * using a dictionary format for your trained model or you can specify the shape only using a list format. The
     * dictionary formats required for the console and CLI are different. The list formats for the console and CLI are
     * the same.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input in dictionary format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input0":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input0\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Example for one input in list format: <code>[[1,3,224,224]]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs in dictionary format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input0":[1,3,224,224], "input1":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input0\":[1,3,224,224], \"input1\":[1,3,224,224]} </code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Example for two inputs in list format: <code>[[1,3,224,224], [1,3,224,224]]</code>
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
     * <p>
     * <code>DataInputConfig</code> supports the following parameters for <code>CoreML</code>
     * <a>OutputConfig$TargetDevice</a> (ML Model format):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>shape</code>: Input shape, for example <code>{"input_1": {"shape": [1,224,224,3]}}</code>. In addition to
     * static input shapes, CoreML converter supports Flexible input shapes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Range Dimension. You can use the Range Dimension feature if you know the input shape will be within some specific
     * interval in that dimension, for example: <code>{"input_1": {"shape": ["1..10", 224, 224, 3]}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Enumerated shapes. Sometimes, the models are trained to work only on a select set of inputs. You can enumerate
     * all supported input shapes, for example:
     * <code>{"input_1": {"shape": [[1, 224, 224, 3], [1, 160, 160, 3]]}}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>default_shape</code>: Default input shape. You can set a default shape during conversion for both Range
     * Dimension and Enumerated Shapes. For example
     * <code>{"input_1": {"shape": ["1..10", 224, 224, 3], "default_shape": [1, 224, 224, 3]}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code>: Input type. Allowed values: <code>Image</code> and <code>Tensor</code>. By default, the
     * converter generates an ML Model with inputs of type Tensor (MultiArray). User can set input type to be Image.
     * Image input type requires additional input parameters such as <code>bias</code> and <code>scale</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bias</code>: If the input type is an Image, you need to provide the bias vector.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scale</code>: If the input type is an Image, you need to provide a scale factor.
     * </p>
     * </li>
     * </ul>
     * <p>
     * CoreML <code>ClassifierConfig</code> parameters can be specified using <a>OutputConfig$CompilerOptions</a>.
     * CoreML converter supports Tensorflow and PyTorch models. CoreML conversion examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Tensor type input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": {"input_1": {"shape": [[1,224,224,3], [1,160,160,3]], "default_shape": [1,224,224,3]}}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Tensor type input without input name (PyTorch):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": [{"shape": [[1,3,224,224], [1,3,160,160]], "default_shape": [1,3,224,224]}]</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Image type input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": {"input_1": {"shape": [[1,224,224,3], [1,160,160,3]], "default_shape": [1,224,224,3], "type": "Image", "bias": [-1,-1,-1], "scale": 0.007843137255}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"CompilerOptions": {"class_labels": "imagenet_labels_1000.txt"}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Image type input without input name (PyTorch):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": [{"shape": [[1,3,224,224], [1,3,160,160]], "default_shape": [1,3,224,224], "type": "Image", "bias": [-1,-1,-1], "scale": 0.007843137255}]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"CompilerOptions": {"class_labels": "imagenet_labels_1000.txt"}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Depending on the model format, <code>DataInputConfig</code> requires the following parameters for
     * <code>ml_eia2</code> <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OutputConfig.html#sagemaker-Type-OutputConfig-TargetDevice"
     * >OutputConfig:TargetDevice</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For TensorFlow models saved in the SavedModel format, specify the input names from <code>signature_def_key</code>
     * and the input model shapes for <code>DataInputConfig</code>. Specify the <code>signature_def_key</code> in <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OutputConfig.html#sagemaker-Type-OutputConfig-CompilerOptions"
     * > <code>OutputConfig:CompilerOptions</code> </a> if the model does not use TensorFlow's default signature def
     * key. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": {"inputs": [1, 224, 224, 3]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"CompilerOptions": {"signature_def_key": "serving_custom"}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For TensorFlow models saved as a frozen graph, specify the input tensor names and shapes in
     * <code>DataInputConfig</code> and the output tensor names for <code>output_names</code> in <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OutputConfig.html#sagemaker-Type-OutputConfig-CompilerOptions"
     * > <code>OutputConfig:CompilerOptions</code> </a>. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": {"input_tensor:0": [1, 224, 224, 3]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"CompilerOptions": {"output_names": ["output_tensor:0"]}</code>
     * </p>
     * </li>
     * </ul>
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
     * Specifies the framework version to use.
     * </p>
     * <p>
     * This API field is only supported for PyTorch framework versions <code>1.4</code>, <code>1.5</code>, and
     * <code>1.6</code> for cloud instance target devices: <code>ml_c4</code>, <code>ml_c5</code>, <code>ml_m4</code>,
     * <code>ml_m5</code>, <code>ml_p2</code>, <code>ml_p3</code>, and <code>ml_g4dn</code>.
     * </p>
     */
    private String frameworkVersion;

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
     * <code>TensorFlow</code>: You must specify the name and shape (NHWC format) of the expected data inputs using a
     * dictionary format for your trained model. The dictionary formats required for the console and CLI are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input":[1,1024,1024,3]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input\":[1,1024,1024,3]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"data1": [1,28,28,1], "data2":[1,28,28,1]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"data1\": [1,28,28,1], \"data2\":[1,28,28,1]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>KERAS</code>: You must specify the name and shape (NCHW format) of expected data inputs using a dictionary
     * format for your trained model. Note that while Keras model artifacts should be uploaded in NHWC (channel-last)
     * format, <code>DataInputConfig</code> should be specified in NCHW (channel-first) format. The dictionary formats
     * required for the console and CLI are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input_1":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input_1\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input_1": [1,3,224,224], "input_2":[1,3,224,224]} </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input_1\": [1,3,224,224], \"input_2\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>MXNET/ONNX/DARKNET</code>: You must specify the name and shape (NCHW format) of the expected data inputs in
     * order using a dictionary format for your trained model. The dictionary formats required for the console and CLI
     * are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"data":[1,3,1024,1024]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"data\":[1,3,1024,1024]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"var1": [1,1,28,28], "var2":[1,1,28,28]} </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"var1\": [1,1,28,28], \"var2\":[1,1,28,28]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>PyTorch</code>: You can either specify the name and shape (NCHW format) of expected data inputs in order
     * using a dictionary format for your trained model or you can specify the shape only using a list format. The
     * dictionary formats required for the console and CLI are different. The list formats for the console and CLI are
     * the same.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input in dictionary format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input0":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input0\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Example for one input in list format: <code>[[1,3,224,224]]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs in dictionary format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input0":[1,3,224,224], "input1":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input0\":[1,3,224,224], \"input1\":[1,3,224,224]} </code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Example for two inputs in list format: <code>[[1,3,224,224], [1,3,224,224]]</code>
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
     * <p>
     * <code>DataInputConfig</code> supports the following parameters for <code>CoreML</code>
     * <a>OutputConfig$TargetDevice</a> (ML Model format):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>shape</code>: Input shape, for example <code>{"input_1": {"shape": [1,224,224,3]}}</code>. In addition to
     * static input shapes, CoreML converter supports Flexible input shapes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Range Dimension. You can use the Range Dimension feature if you know the input shape will be within some specific
     * interval in that dimension, for example: <code>{"input_1": {"shape": ["1..10", 224, 224, 3]}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Enumerated shapes. Sometimes, the models are trained to work only on a select set of inputs. You can enumerate
     * all supported input shapes, for example:
     * <code>{"input_1": {"shape": [[1, 224, 224, 3], [1, 160, 160, 3]]}}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>default_shape</code>: Default input shape. You can set a default shape during conversion for both Range
     * Dimension and Enumerated Shapes. For example
     * <code>{"input_1": {"shape": ["1..10", 224, 224, 3], "default_shape": [1, 224, 224, 3]}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code>: Input type. Allowed values: <code>Image</code> and <code>Tensor</code>. By default, the
     * converter generates an ML Model with inputs of type Tensor (MultiArray). User can set input type to be Image.
     * Image input type requires additional input parameters such as <code>bias</code> and <code>scale</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bias</code>: If the input type is an Image, you need to provide the bias vector.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scale</code>: If the input type is an Image, you need to provide a scale factor.
     * </p>
     * </li>
     * </ul>
     * <p>
     * CoreML <code>ClassifierConfig</code> parameters can be specified using <a>OutputConfig$CompilerOptions</a>.
     * CoreML converter supports Tensorflow and PyTorch models. CoreML conversion examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Tensor type input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": {"input_1": {"shape": [[1,224,224,3], [1,160,160,3]], "default_shape": [1,224,224,3]}}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Tensor type input without input name (PyTorch):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": [{"shape": [[1,3,224,224], [1,3,160,160]], "default_shape": [1,3,224,224]}]</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Image type input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": {"input_1": {"shape": [[1,224,224,3], [1,160,160,3]], "default_shape": [1,224,224,3], "type": "Image", "bias": [-1,-1,-1], "scale": 0.007843137255}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"CompilerOptions": {"class_labels": "imagenet_labels_1000.txt"}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Image type input without input name (PyTorch):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": [{"shape": [[1,3,224,224], [1,3,160,160]], "default_shape": [1,3,224,224], "type": "Image", "bias": [-1,-1,-1], "scale": 0.007843137255}]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"CompilerOptions": {"class_labels": "imagenet_labels_1000.txt"}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Depending on the model format, <code>DataInputConfig</code> requires the following parameters for
     * <code>ml_eia2</code> <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OutputConfig.html#sagemaker-Type-OutputConfig-TargetDevice"
     * >OutputConfig:TargetDevice</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For TensorFlow models saved in the SavedModel format, specify the input names from <code>signature_def_key</code>
     * and the input model shapes for <code>DataInputConfig</code>. Specify the <code>signature_def_key</code> in <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OutputConfig.html#sagemaker-Type-OutputConfig-CompilerOptions"
     * > <code>OutputConfig:CompilerOptions</code> </a> if the model does not use TensorFlow's default signature def
     * key. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": {"inputs": [1, 224, 224, 3]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"CompilerOptions": {"signature_def_key": "serving_custom"}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For TensorFlow models saved as a frozen graph, specify the input tensor names and shapes in
     * <code>DataInputConfig</code> and the output tensor names for <code>output_names</code> in <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OutputConfig.html#sagemaker-Type-OutputConfig-CompilerOptions"
     * > <code>OutputConfig:CompilerOptions</code> </a>. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": {"input_tensor:0": [1, 224, 224, 3]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"CompilerOptions": {"output_names": ["output_tensor:0"]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param dataInputConfig
     *        Specifies the name and shape of the expected data inputs for your trained model with a JSON dictionary
     *        form. The data inputs are <a>InputConfig$Framework</a> specific. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TensorFlow</code>: You must specify the name and shape (NHWC format) of the expected data inputs
     *        using a dictionary format for your trained model. The dictionary formats required for the console and CLI
     *        are different.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Examples for one input:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If using the console, <code>{"input":[1,1024,1024,3]}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If using the CLI, <code>{\"input\":[1,1024,1024,3]}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Examples for two inputs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If using the console, <code>{"data1": [1,28,28,1], "data2":[1,28,28,1]}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If using the CLI, <code>{\"data1\": [1,28,28,1], \"data2\":[1,28,28,1]}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KERAS</code>: You must specify the name and shape (NCHW format) of expected data inputs using a
     *        dictionary format for your trained model. Note that while Keras model artifacts should be uploaded in NHWC
     *        (channel-last) format, <code>DataInputConfig</code> should be specified in NCHW (channel-first) format.
     *        The dictionary formats required for the console and CLI are different.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Examples for one input:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If using the console, <code>{"input_1":[1,3,224,224]}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If using the CLI, <code>{\"input_1\":[1,3,224,224]}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Examples for two inputs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If using the console, <code>{"input_1": [1,3,224,224], "input_2":[1,3,224,224]} </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If using the CLI, <code>{\"input_1\": [1,3,224,224], \"input_2\":[1,3,224,224]}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MXNET/ONNX/DARKNET</code>: You must specify the name and shape (NCHW format) of the expected data
     *        inputs in order using a dictionary format for your trained model. The dictionary formats required for the
     *        console and CLI are different.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Examples for one input:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If using the console, <code>{"data":[1,3,1024,1024]}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If using the CLI, <code>{\"data\":[1,3,1024,1024]}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Examples for two inputs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If using the console, <code>{"var1": [1,1,28,28], "var2":[1,1,28,28]} </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If using the CLI, <code>{\"var1\": [1,1,28,28], \"var2\":[1,1,28,28]}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PyTorch</code>: You can either specify the name and shape (NCHW format) of expected data inputs in
     *        order using a dictionary format for your trained model or you can specify the shape only using a list
     *        format. The dictionary formats required for the console and CLI are different. The list formats for the
     *        console and CLI are the same.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Examples for one input in dictionary format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If using the console, <code>{"input0":[1,3,224,224]}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If using the CLI, <code>{\"input0\":[1,3,224,224]}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Example for one input in list format: <code>[[1,3,224,224]]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Examples for two inputs in dictionary format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If using the console, <code>{"input0":[1,3,224,224], "input1":[1,3,224,224]}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If using the CLI, <code>{\"input0\":[1,3,224,224], \"input1\":[1,3,224,224]} </code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Example for two inputs in list format: <code>[[1,3,224,224], [1,3,224,224]]</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XGBOOST</code>: input data name and shape are not needed.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>DataInputConfig</code> supports the following parameters for <code>CoreML</code>
     *        <a>OutputConfig$TargetDevice</a> (ML Model format):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>shape</code>: Input shape, for example <code>{"input_1": {"shape": [1,224,224,3]}}</code>. In
     *        addition to static input shapes, CoreML converter supports Flexible input shapes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Range Dimension. You can use the Range Dimension feature if you know the input shape will be within some
     *        specific interval in that dimension, for example:
     *        <code>{"input_1": {"shape": ["1..10", 224, 224, 3]}}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Enumerated shapes. Sometimes, the models are trained to work only on a select set of inputs. You can
     *        enumerate all supported input shapes, for example:
     *        <code>{"input_1": {"shape": [[1, 224, 224, 3], [1, 160, 160, 3]]}}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>default_shape</code>: Default input shape. You can set a default shape during conversion for both
     *        Range Dimension and Enumerated Shapes. For example
     *        <code>{"input_1": {"shape": ["1..10", 224, 224, 3], "default_shape": [1, 224, 224, 3]}}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type</code>: Input type. Allowed values: <code>Image</code> and <code>Tensor</code>. By default, the
     *        converter generates an ML Model with inputs of type Tensor (MultiArray). User can set input type to be
     *        Image. Image input type requires additional input parameters such as <code>bias</code> and
     *        <code>scale</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>bias</code>: If the input type is an Image, you need to provide the bias vector.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>scale</code>: If the input type is an Image, you need to provide a scale factor.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        CoreML <code>ClassifierConfig</code> parameters can be specified using
     *        <a>OutputConfig$CompilerOptions</a>. CoreML converter supports Tensorflow and PyTorch models. CoreML
     *        conversion examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Tensor type input:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"DataInputConfig": {"input_1": {"shape": [[1,224,224,3], [1,160,160,3]], "default_shape": [1,224,224,3]}}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Tensor type input without input name (PyTorch):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"DataInputConfig": [{"shape": [[1,3,224,224], [1,3,160,160]], "default_shape": [1,3,224,224]}]</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Image type input:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"DataInputConfig": {"input_1": {"shape": [[1,224,224,3], [1,160,160,3]], "default_shape": [1,224,224,3], "type": "Image", "bias": [-1,-1,-1], "scale": 0.007843137255}}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"CompilerOptions": {"class_labels": "imagenet_labels_1000.txt"}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Image type input without input name (PyTorch):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"DataInputConfig": [{"shape": [[1,3,224,224], [1,3,160,160]], "default_shape": [1,3,224,224], "type": "Image", "bias": [-1,-1,-1], "scale": 0.007843137255}]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"CompilerOptions": {"class_labels": "imagenet_labels_1000.txt"}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        Depending on the model format, <code>DataInputConfig</code> requires the following parameters for
     *        <code>ml_eia2</code> <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OutputConfig.html#sagemaker-Type-OutputConfig-TargetDevice"
     *        >OutputConfig:TargetDevice</a>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For TensorFlow models saved in the SavedModel format, specify the input names from
     *        <code>signature_def_key</code> and the input model shapes for <code>DataInputConfig</code>. Specify the
     *        <code>signature_def_key</code> in <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OutputConfig.html#sagemaker-Type-OutputConfig-CompilerOptions"
     *        > <code>OutputConfig:CompilerOptions</code> </a> if the model does not use TensorFlow's default signature
     *        def key. For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"DataInputConfig": {"inputs": [1, 224, 224, 3]}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"CompilerOptions": {"signature_def_key": "serving_custom"}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For TensorFlow models saved as a frozen graph, specify the input tensor names and shapes in
     *        <code>DataInputConfig</code> and the output tensor names for <code>output_names</code> in <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OutputConfig.html#sagemaker-Type-OutputConfig-CompilerOptions"
     *        > <code>OutputConfig:CompilerOptions</code> </a>. For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"DataInputConfig": {"input_tensor:0": [1, 224, 224, 3]}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"CompilerOptions": {"output_names": ["output_tensor:0"]}</code>
     *        </p>
     *        </li>
     *        </ul>
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
     * <code>TensorFlow</code>: You must specify the name and shape (NHWC format) of the expected data inputs using a
     * dictionary format for your trained model. The dictionary formats required for the console and CLI are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input":[1,1024,1024,3]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input\":[1,1024,1024,3]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"data1": [1,28,28,1], "data2":[1,28,28,1]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"data1\": [1,28,28,1], \"data2\":[1,28,28,1]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>KERAS</code>: You must specify the name and shape (NCHW format) of expected data inputs using a dictionary
     * format for your trained model. Note that while Keras model artifacts should be uploaded in NHWC (channel-last)
     * format, <code>DataInputConfig</code> should be specified in NCHW (channel-first) format. The dictionary formats
     * required for the console and CLI are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input_1":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input_1\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input_1": [1,3,224,224], "input_2":[1,3,224,224]} </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input_1\": [1,3,224,224], \"input_2\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>MXNET/ONNX/DARKNET</code>: You must specify the name and shape (NCHW format) of the expected data inputs in
     * order using a dictionary format for your trained model. The dictionary formats required for the console and CLI
     * are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"data":[1,3,1024,1024]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"data\":[1,3,1024,1024]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"var1": [1,1,28,28], "var2":[1,1,28,28]} </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"var1\": [1,1,28,28], \"var2\":[1,1,28,28]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>PyTorch</code>: You can either specify the name and shape (NCHW format) of expected data inputs in order
     * using a dictionary format for your trained model or you can specify the shape only using a list format. The
     * dictionary formats required for the console and CLI are different. The list formats for the console and CLI are
     * the same.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input in dictionary format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input0":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input0\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Example for one input in list format: <code>[[1,3,224,224]]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs in dictionary format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input0":[1,3,224,224], "input1":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input0\":[1,3,224,224], \"input1\":[1,3,224,224]} </code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Example for two inputs in list format: <code>[[1,3,224,224], [1,3,224,224]]</code>
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
     * <p>
     * <code>DataInputConfig</code> supports the following parameters for <code>CoreML</code>
     * <a>OutputConfig$TargetDevice</a> (ML Model format):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>shape</code>: Input shape, for example <code>{"input_1": {"shape": [1,224,224,3]}}</code>. In addition to
     * static input shapes, CoreML converter supports Flexible input shapes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Range Dimension. You can use the Range Dimension feature if you know the input shape will be within some specific
     * interval in that dimension, for example: <code>{"input_1": {"shape": ["1..10", 224, 224, 3]}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Enumerated shapes. Sometimes, the models are trained to work only on a select set of inputs. You can enumerate
     * all supported input shapes, for example:
     * <code>{"input_1": {"shape": [[1, 224, 224, 3], [1, 160, 160, 3]]}}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>default_shape</code>: Default input shape. You can set a default shape during conversion for both Range
     * Dimension and Enumerated Shapes. For example
     * <code>{"input_1": {"shape": ["1..10", 224, 224, 3], "default_shape": [1, 224, 224, 3]}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code>: Input type. Allowed values: <code>Image</code> and <code>Tensor</code>. By default, the
     * converter generates an ML Model with inputs of type Tensor (MultiArray). User can set input type to be Image.
     * Image input type requires additional input parameters such as <code>bias</code> and <code>scale</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bias</code>: If the input type is an Image, you need to provide the bias vector.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scale</code>: If the input type is an Image, you need to provide a scale factor.
     * </p>
     * </li>
     * </ul>
     * <p>
     * CoreML <code>ClassifierConfig</code> parameters can be specified using <a>OutputConfig$CompilerOptions</a>.
     * CoreML converter supports Tensorflow and PyTorch models. CoreML conversion examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Tensor type input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": {"input_1": {"shape": [[1,224,224,3], [1,160,160,3]], "default_shape": [1,224,224,3]}}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Tensor type input without input name (PyTorch):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": [{"shape": [[1,3,224,224], [1,3,160,160]], "default_shape": [1,3,224,224]}]</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Image type input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": {"input_1": {"shape": [[1,224,224,3], [1,160,160,3]], "default_shape": [1,224,224,3], "type": "Image", "bias": [-1,-1,-1], "scale": 0.007843137255}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"CompilerOptions": {"class_labels": "imagenet_labels_1000.txt"}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Image type input without input name (PyTorch):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": [{"shape": [[1,3,224,224], [1,3,160,160]], "default_shape": [1,3,224,224], "type": "Image", "bias": [-1,-1,-1], "scale": 0.007843137255}]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"CompilerOptions": {"class_labels": "imagenet_labels_1000.txt"}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Depending on the model format, <code>DataInputConfig</code> requires the following parameters for
     * <code>ml_eia2</code> <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OutputConfig.html#sagemaker-Type-OutputConfig-TargetDevice"
     * >OutputConfig:TargetDevice</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For TensorFlow models saved in the SavedModel format, specify the input names from <code>signature_def_key</code>
     * and the input model shapes for <code>DataInputConfig</code>. Specify the <code>signature_def_key</code> in <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OutputConfig.html#sagemaker-Type-OutputConfig-CompilerOptions"
     * > <code>OutputConfig:CompilerOptions</code> </a> if the model does not use TensorFlow's default signature def
     * key. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": {"inputs": [1, 224, 224, 3]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"CompilerOptions": {"signature_def_key": "serving_custom"}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For TensorFlow models saved as a frozen graph, specify the input tensor names and shapes in
     * <code>DataInputConfig</code> and the output tensor names for <code>output_names</code> in <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OutputConfig.html#sagemaker-Type-OutputConfig-CompilerOptions"
     * > <code>OutputConfig:CompilerOptions</code> </a>. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": {"input_tensor:0": [1, 224, 224, 3]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"CompilerOptions": {"output_names": ["output_tensor:0"]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return Specifies the name and shape of the expected data inputs for your trained model with a JSON dictionary
     *         form. The data inputs are <a>InputConfig$Framework</a> specific. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TensorFlow</code>: You must specify the name and shape (NHWC format) of the expected data inputs
     *         using a dictionary format for your trained model. The dictionary formats required for the console and CLI
     *         are different.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Examples for one input:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If using the console, <code>{"input":[1,1024,1024,3]}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If using the CLI, <code>{\"input\":[1,1024,1024,3]}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Examples for two inputs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If using the console, <code>{"data1": [1,28,28,1], "data2":[1,28,28,1]}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If using the CLI, <code>{\"data1\": [1,28,28,1], \"data2\":[1,28,28,1]}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KERAS</code>: You must specify the name and shape (NCHW format) of expected data inputs using a
     *         dictionary format for your trained model. Note that while Keras model artifacts should be uploaded in
     *         NHWC (channel-last) format, <code>DataInputConfig</code> should be specified in NCHW (channel-first)
     *         format. The dictionary formats required for the console and CLI are different.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Examples for one input:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If using the console, <code>{"input_1":[1,3,224,224]}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If using the CLI, <code>{\"input_1\":[1,3,224,224]}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Examples for two inputs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If using the console, <code>{"input_1": [1,3,224,224], "input_2":[1,3,224,224]} </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If using the CLI, <code>{\"input_1\": [1,3,224,224], \"input_2\":[1,3,224,224]}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MXNET/ONNX/DARKNET</code>: You must specify the name and shape (NCHW format) of the expected data
     *         inputs in order using a dictionary format for your trained model. The dictionary formats required for the
     *         console and CLI are different.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Examples for one input:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If using the console, <code>{"data":[1,3,1024,1024]}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If using the CLI, <code>{\"data\":[1,3,1024,1024]}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Examples for two inputs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If using the console, <code>{"var1": [1,1,28,28], "var2":[1,1,28,28]} </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If using the CLI, <code>{\"var1\": [1,1,28,28], \"var2\":[1,1,28,28]}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PyTorch</code>: You can either specify the name and shape (NCHW format) of expected data inputs in
     *         order using a dictionary format for your trained model or you can specify the shape only using a list
     *         format. The dictionary formats required for the console and CLI are different. The list formats for the
     *         console and CLI are the same.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Examples for one input in dictionary format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If using the console, <code>{"input0":[1,3,224,224]}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If using the CLI, <code>{\"input0\":[1,3,224,224]}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Example for one input in list format: <code>[[1,3,224,224]]</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Examples for two inputs in dictionary format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If using the console, <code>{"input0":[1,3,224,224], "input1":[1,3,224,224]}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If using the CLI, <code>{\"input0\":[1,3,224,224], \"input1\":[1,3,224,224]} </code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Example for two inputs in list format: <code>[[1,3,224,224], [1,3,224,224]]</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>XGBOOST</code>: input data name and shape are not needed.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>DataInputConfig</code> supports the following parameters for <code>CoreML</code>
     *         <a>OutputConfig$TargetDevice</a> (ML Model format):
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>shape</code>: Input shape, for example <code>{"input_1": {"shape": [1,224,224,3]}}</code>. In
     *         addition to static input shapes, CoreML converter supports Flexible input shapes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Range Dimension. You can use the Range Dimension feature if you know the input shape will be within some
     *         specific interval in that dimension, for example:
     *         <code>{"input_1": {"shape": ["1..10", 224, 224, 3]}}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Enumerated shapes. Sometimes, the models are trained to work only on a select set of inputs. You can
     *         enumerate all supported input shapes, for example:
     *         <code>{"input_1": {"shape": [[1, 224, 224, 3], [1, 160, 160, 3]]}}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>default_shape</code>: Default input shape. You can set a default shape during conversion for both
     *         Range Dimension and Enumerated Shapes. For example
     *         <code>{"input_1": {"shape": ["1..10", 224, 224, 3], "default_shape": [1, 224, 224, 3]}}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>type</code>: Input type. Allowed values: <code>Image</code> and <code>Tensor</code>. By default,
     *         the converter generates an ML Model with inputs of type Tensor (MultiArray). User can set input type to
     *         be Image. Image input type requires additional input parameters such as <code>bias</code> and
     *         <code>scale</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>bias</code>: If the input type is an Image, you need to provide the bias vector.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>scale</code>: If the input type is an Image, you need to provide a scale factor.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         CoreML <code>ClassifierConfig</code> parameters can be specified using
     *         <a>OutputConfig$CompilerOptions</a>. CoreML converter supports Tensorflow and PyTorch models. CoreML
     *         conversion examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Tensor type input:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"DataInputConfig": {"input_1": {"shape": [[1,224,224,3], [1,160,160,3]], "default_shape": [1,224,224,3]}}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Tensor type input without input name (PyTorch):
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"DataInputConfig": [{"shape": [[1,3,224,224], [1,3,160,160]], "default_shape": [1,3,224,224]}]</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Image type input:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"DataInputConfig": {"input_1": {"shape": [[1,224,224,3], [1,160,160,3]], "default_shape": [1,224,224,3], "type": "Image", "bias": [-1,-1,-1], "scale": 0.007843137255}}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"CompilerOptions": {"class_labels": "imagenet_labels_1000.txt"}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Image type input without input name (PyTorch):
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"DataInputConfig": [{"shape": [[1,3,224,224], [1,3,160,160]], "default_shape": [1,3,224,224], "type": "Image", "bias": [-1,-1,-1], "scale": 0.007843137255}]</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"CompilerOptions": {"class_labels": "imagenet_labels_1000.txt"}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         Depending on the model format, <code>DataInputConfig</code> requires the following parameters for
     *         <code>ml_eia2</code> <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OutputConfig.html#sagemaker-Type-OutputConfig-TargetDevice"
     *         >OutputConfig:TargetDevice</a>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For TensorFlow models saved in the SavedModel format, specify the input names from
     *         <code>signature_def_key</code> and the input model shapes for <code>DataInputConfig</code>. Specify the
     *         <code>signature_def_key</code> in <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OutputConfig.html#sagemaker-Type-OutputConfig-CompilerOptions"
     *         > <code>OutputConfig:CompilerOptions</code> </a> if the model does not use TensorFlow's default signature
     *         def key. For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"DataInputConfig": {"inputs": [1, 224, 224, 3]}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"CompilerOptions": {"signature_def_key": "serving_custom"}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For TensorFlow models saved as a frozen graph, specify the input tensor names and shapes in
     *         <code>DataInputConfig</code> and the output tensor names for <code>output_names</code> in <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OutputConfig.html#sagemaker-Type-OutputConfig-CompilerOptions"
     *         > <code>OutputConfig:CompilerOptions</code> </a>. For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"DataInputConfig": {"input_tensor:0": [1, 224, 224, 3]}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"CompilerOptions": {"output_names": ["output_tensor:0"]}</code>
     *         </p>
     *         </li>
     *         </ul>
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
     * <code>TensorFlow</code>: You must specify the name and shape (NHWC format) of the expected data inputs using a
     * dictionary format for your trained model. The dictionary formats required for the console and CLI are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input":[1,1024,1024,3]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input\":[1,1024,1024,3]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"data1": [1,28,28,1], "data2":[1,28,28,1]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"data1\": [1,28,28,1], \"data2\":[1,28,28,1]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>KERAS</code>: You must specify the name and shape (NCHW format) of expected data inputs using a dictionary
     * format for your trained model. Note that while Keras model artifacts should be uploaded in NHWC (channel-last)
     * format, <code>DataInputConfig</code> should be specified in NCHW (channel-first) format. The dictionary formats
     * required for the console and CLI are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input_1":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input_1\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input_1": [1,3,224,224], "input_2":[1,3,224,224]} </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input_1\": [1,3,224,224], \"input_2\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>MXNET/ONNX/DARKNET</code>: You must specify the name and shape (NCHW format) of the expected data inputs in
     * order using a dictionary format for your trained model. The dictionary formats required for the console and CLI
     * are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"data":[1,3,1024,1024]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"data\":[1,3,1024,1024]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"var1": [1,1,28,28], "var2":[1,1,28,28]} </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"var1\": [1,1,28,28], \"var2\":[1,1,28,28]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>PyTorch</code>: You can either specify the name and shape (NCHW format) of expected data inputs in order
     * using a dictionary format for your trained model or you can specify the shape only using a list format. The
     * dictionary formats required for the console and CLI are different. The list formats for the console and CLI are
     * the same.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input in dictionary format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input0":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input0\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Example for one input in list format: <code>[[1,3,224,224]]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs in dictionary format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input0":[1,3,224,224], "input1":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input0\":[1,3,224,224], \"input1\":[1,3,224,224]} </code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Example for two inputs in list format: <code>[[1,3,224,224], [1,3,224,224]]</code>
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
     * <p>
     * <code>DataInputConfig</code> supports the following parameters for <code>CoreML</code>
     * <a>OutputConfig$TargetDevice</a> (ML Model format):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>shape</code>: Input shape, for example <code>{"input_1": {"shape": [1,224,224,3]}}</code>. In addition to
     * static input shapes, CoreML converter supports Flexible input shapes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Range Dimension. You can use the Range Dimension feature if you know the input shape will be within some specific
     * interval in that dimension, for example: <code>{"input_1": {"shape": ["1..10", 224, 224, 3]}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Enumerated shapes. Sometimes, the models are trained to work only on a select set of inputs. You can enumerate
     * all supported input shapes, for example:
     * <code>{"input_1": {"shape": [[1, 224, 224, 3], [1, 160, 160, 3]]}}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>default_shape</code>: Default input shape. You can set a default shape during conversion for both Range
     * Dimension and Enumerated Shapes. For example
     * <code>{"input_1": {"shape": ["1..10", 224, 224, 3], "default_shape": [1, 224, 224, 3]}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code>: Input type. Allowed values: <code>Image</code> and <code>Tensor</code>. By default, the
     * converter generates an ML Model with inputs of type Tensor (MultiArray). User can set input type to be Image.
     * Image input type requires additional input parameters such as <code>bias</code> and <code>scale</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bias</code>: If the input type is an Image, you need to provide the bias vector.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scale</code>: If the input type is an Image, you need to provide a scale factor.
     * </p>
     * </li>
     * </ul>
     * <p>
     * CoreML <code>ClassifierConfig</code> parameters can be specified using <a>OutputConfig$CompilerOptions</a>.
     * CoreML converter supports Tensorflow and PyTorch models. CoreML conversion examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Tensor type input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": {"input_1": {"shape": [[1,224,224,3], [1,160,160,3]], "default_shape": [1,224,224,3]}}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Tensor type input without input name (PyTorch):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": [{"shape": [[1,3,224,224], [1,3,160,160]], "default_shape": [1,3,224,224]}]</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Image type input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": {"input_1": {"shape": [[1,224,224,3], [1,160,160,3]], "default_shape": [1,224,224,3], "type": "Image", "bias": [-1,-1,-1], "scale": 0.007843137255}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"CompilerOptions": {"class_labels": "imagenet_labels_1000.txt"}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Image type input without input name (PyTorch):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": [{"shape": [[1,3,224,224], [1,3,160,160]], "default_shape": [1,3,224,224], "type": "Image", "bias": [-1,-1,-1], "scale": 0.007843137255}]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"CompilerOptions": {"class_labels": "imagenet_labels_1000.txt"}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Depending on the model format, <code>DataInputConfig</code> requires the following parameters for
     * <code>ml_eia2</code> <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OutputConfig.html#sagemaker-Type-OutputConfig-TargetDevice"
     * >OutputConfig:TargetDevice</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For TensorFlow models saved in the SavedModel format, specify the input names from <code>signature_def_key</code>
     * and the input model shapes for <code>DataInputConfig</code>. Specify the <code>signature_def_key</code> in <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OutputConfig.html#sagemaker-Type-OutputConfig-CompilerOptions"
     * > <code>OutputConfig:CompilerOptions</code> </a> if the model does not use TensorFlow's default signature def
     * key. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": {"inputs": [1, 224, 224, 3]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"CompilerOptions": {"signature_def_key": "serving_custom"}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For TensorFlow models saved as a frozen graph, specify the input tensor names and shapes in
     * <code>DataInputConfig</code> and the output tensor names for <code>output_names</code> in <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OutputConfig.html#sagemaker-Type-OutputConfig-CompilerOptions"
     * > <code>OutputConfig:CompilerOptions</code> </a>. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"DataInputConfig": {"input_tensor:0": [1, 224, 224, 3]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"CompilerOptions": {"output_names": ["output_tensor:0"]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param dataInputConfig
     *        Specifies the name and shape of the expected data inputs for your trained model with a JSON dictionary
     *        form. The data inputs are <a>InputConfig$Framework</a> specific. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TensorFlow</code>: You must specify the name and shape (NHWC format) of the expected data inputs
     *        using a dictionary format for your trained model. The dictionary formats required for the console and CLI
     *        are different.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Examples for one input:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If using the console, <code>{"input":[1,1024,1024,3]}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If using the CLI, <code>{\"input\":[1,1024,1024,3]}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Examples for two inputs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If using the console, <code>{"data1": [1,28,28,1], "data2":[1,28,28,1]}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If using the CLI, <code>{\"data1\": [1,28,28,1], \"data2\":[1,28,28,1]}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KERAS</code>: You must specify the name and shape (NCHW format) of expected data inputs using a
     *        dictionary format for your trained model. Note that while Keras model artifacts should be uploaded in NHWC
     *        (channel-last) format, <code>DataInputConfig</code> should be specified in NCHW (channel-first) format.
     *        The dictionary formats required for the console and CLI are different.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Examples for one input:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If using the console, <code>{"input_1":[1,3,224,224]}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If using the CLI, <code>{\"input_1\":[1,3,224,224]}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Examples for two inputs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If using the console, <code>{"input_1": [1,3,224,224], "input_2":[1,3,224,224]} </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If using the CLI, <code>{\"input_1\": [1,3,224,224], \"input_2\":[1,3,224,224]}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MXNET/ONNX/DARKNET</code>: You must specify the name and shape (NCHW format) of the expected data
     *        inputs in order using a dictionary format for your trained model. The dictionary formats required for the
     *        console and CLI are different.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Examples for one input:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If using the console, <code>{"data":[1,3,1024,1024]}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If using the CLI, <code>{\"data\":[1,3,1024,1024]}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Examples for two inputs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If using the console, <code>{"var1": [1,1,28,28], "var2":[1,1,28,28]} </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If using the CLI, <code>{\"var1\": [1,1,28,28], \"var2\":[1,1,28,28]}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PyTorch</code>: You can either specify the name and shape (NCHW format) of expected data inputs in
     *        order using a dictionary format for your trained model or you can specify the shape only using a list
     *        format. The dictionary formats required for the console and CLI are different. The list formats for the
     *        console and CLI are the same.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Examples for one input in dictionary format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If using the console, <code>{"input0":[1,3,224,224]}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If using the CLI, <code>{\"input0\":[1,3,224,224]}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Example for one input in list format: <code>[[1,3,224,224]]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Examples for two inputs in dictionary format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If using the console, <code>{"input0":[1,3,224,224], "input1":[1,3,224,224]}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If using the CLI, <code>{\"input0\":[1,3,224,224], \"input1\":[1,3,224,224]} </code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Example for two inputs in list format: <code>[[1,3,224,224], [1,3,224,224]]</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XGBOOST</code>: input data name and shape are not needed.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>DataInputConfig</code> supports the following parameters for <code>CoreML</code>
     *        <a>OutputConfig$TargetDevice</a> (ML Model format):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>shape</code>: Input shape, for example <code>{"input_1": {"shape": [1,224,224,3]}}</code>. In
     *        addition to static input shapes, CoreML converter supports Flexible input shapes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Range Dimension. You can use the Range Dimension feature if you know the input shape will be within some
     *        specific interval in that dimension, for example:
     *        <code>{"input_1": {"shape": ["1..10", 224, 224, 3]}}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Enumerated shapes. Sometimes, the models are trained to work only on a select set of inputs. You can
     *        enumerate all supported input shapes, for example:
     *        <code>{"input_1": {"shape": [[1, 224, 224, 3], [1, 160, 160, 3]]}}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>default_shape</code>: Default input shape. You can set a default shape during conversion for both
     *        Range Dimension and Enumerated Shapes. For example
     *        <code>{"input_1": {"shape": ["1..10", 224, 224, 3], "default_shape": [1, 224, 224, 3]}}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type</code>: Input type. Allowed values: <code>Image</code> and <code>Tensor</code>. By default, the
     *        converter generates an ML Model with inputs of type Tensor (MultiArray). User can set input type to be
     *        Image. Image input type requires additional input parameters such as <code>bias</code> and
     *        <code>scale</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>bias</code>: If the input type is an Image, you need to provide the bias vector.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>scale</code>: If the input type is an Image, you need to provide a scale factor.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        CoreML <code>ClassifierConfig</code> parameters can be specified using
     *        <a>OutputConfig$CompilerOptions</a>. CoreML converter supports Tensorflow and PyTorch models. CoreML
     *        conversion examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Tensor type input:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"DataInputConfig": {"input_1": {"shape": [[1,224,224,3], [1,160,160,3]], "default_shape": [1,224,224,3]}}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Tensor type input without input name (PyTorch):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"DataInputConfig": [{"shape": [[1,3,224,224], [1,3,160,160]], "default_shape": [1,3,224,224]}]</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Image type input:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"DataInputConfig": {"input_1": {"shape": [[1,224,224,3], [1,160,160,3]], "default_shape": [1,224,224,3], "type": "Image", "bias": [-1,-1,-1], "scale": 0.007843137255}}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"CompilerOptions": {"class_labels": "imagenet_labels_1000.txt"}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Image type input without input name (PyTorch):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"DataInputConfig": [{"shape": [[1,3,224,224], [1,3,160,160]], "default_shape": [1,3,224,224], "type": "Image", "bias": [-1,-1,-1], "scale": 0.007843137255}]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"CompilerOptions": {"class_labels": "imagenet_labels_1000.txt"}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        Depending on the model format, <code>DataInputConfig</code> requires the following parameters for
     *        <code>ml_eia2</code> <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OutputConfig.html#sagemaker-Type-OutputConfig-TargetDevice"
     *        >OutputConfig:TargetDevice</a>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For TensorFlow models saved in the SavedModel format, specify the input names from
     *        <code>signature_def_key</code> and the input model shapes for <code>DataInputConfig</code>. Specify the
     *        <code>signature_def_key</code> in <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OutputConfig.html#sagemaker-Type-OutputConfig-CompilerOptions"
     *        > <code>OutputConfig:CompilerOptions</code> </a> if the model does not use TensorFlow's default signature
     *        def key. For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"DataInputConfig": {"inputs": [1, 224, 224, 3]}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"CompilerOptions": {"signature_def_key": "serving_custom"}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For TensorFlow models saved as a frozen graph, specify the input tensor names and shapes in
     *        <code>DataInputConfig</code> and the output tensor names for <code>output_names</code> in <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OutputConfig.html#sagemaker-Type-OutputConfig-CompilerOptions"
     *        > <code>OutputConfig:CompilerOptions</code> </a>. For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"DataInputConfig": {"input_tensor:0": [1, 224, 224, 3]}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"CompilerOptions": {"output_names": ["output_tensor:0"]}</code>
     *        </p>
     *        </li>
     *        </ul>
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
     * <p>
     * Specifies the framework version to use.
     * </p>
     * <p>
     * This API field is only supported for PyTorch framework versions <code>1.4</code>, <code>1.5</code>, and
     * <code>1.6</code> for cloud instance target devices: <code>ml_c4</code>, <code>ml_c5</code>, <code>ml_m4</code>,
     * <code>ml_m5</code>, <code>ml_p2</code>, <code>ml_p3</code>, and <code>ml_g4dn</code>.
     * </p>
     * 
     * @param frameworkVersion
     *        Specifies the framework version to use.</p>
     *        <p>
     *        This API field is only supported for PyTorch framework versions <code>1.4</code>, <code>1.5</code>, and
     *        <code>1.6</code> for cloud instance target devices: <code>ml_c4</code>, <code>ml_c5</code>,
     *        <code>ml_m4</code>, <code>ml_m5</code>, <code>ml_p2</code>, <code>ml_p3</code>, and <code>ml_g4dn</code>.
     */

    public void setFrameworkVersion(String frameworkVersion) {
        this.frameworkVersion = frameworkVersion;
    }

    /**
     * <p>
     * Specifies the framework version to use.
     * </p>
     * <p>
     * This API field is only supported for PyTorch framework versions <code>1.4</code>, <code>1.5</code>, and
     * <code>1.6</code> for cloud instance target devices: <code>ml_c4</code>, <code>ml_c5</code>, <code>ml_m4</code>,
     * <code>ml_m5</code>, <code>ml_p2</code>, <code>ml_p3</code>, and <code>ml_g4dn</code>.
     * </p>
     * 
     * @return Specifies the framework version to use.</p>
     *         <p>
     *         This API field is only supported for PyTorch framework versions <code>1.4</code>, <code>1.5</code>, and
     *         <code>1.6</code> for cloud instance target devices: <code>ml_c4</code>, <code>ml_c5</code>,
     *         <code>ml_m4</code>, <code>ml_m5</code>, <code>ml_p2</code>, <code>ml_p3</code>, and <code>ml_g4dn</code>.
     */

    public String getFrameworkVersion() {
        return this.frameworkVersion;
    }

    /**
     * <p>
     * Specifies the framework version to use.
     * </p>
     * <p>
     * This API field is only supported for PyTorch framework versions <code>1.4</code>, <code>1.5</code>, and
     * <code>1.6</code> for cloud instance target devices: <code>ml_c4</code>, <code>ml_c5</code>, <code>ml_m4</code>,
     * <code>ml_m5</code>, <code>ml_p2</code>, <code>ml_p3</code>, and <code>ml_g4dn</code>.
     * </p>
     * 
     * @param frameworkVersion
     *        Specifies the framework version to use.</p>
     *        <p>
     *        This API field is only supported for PyTorch framework versions <code>1.4</code>, <code>1.5</code>, and
     *        <code>1.6</code> for cloud instance target devices: <code>ml_c4</code>, <code>ml_c5</code>,
     *        <code>ml_m4</code>, <code>ml_m5</code>, <code>ml_p2</code>, <code>ml_p3</code>, and <code>ml_g4dn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputConfig withFrameworkVersion(String frameworkVersion) {
        setFrameworkVersion(frameworkVersion);
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
            sb.append("Framework: ").append(getFramework()).append(",");
        if (getFrameworkVersion() != null)
            sb.append("FrameworkVersion: ").append(getFrameworkVersion());
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
        if (other.getFrameworkVersion() == null ^ this.getFrameworkVersion() == null)
            return false;
        if (other.getFrameworkVersion() != null && other.getFrameworkVersion().equals(this.getFrameworkVersion()) == false)
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
        hashCode = prime * hashCode + ((getFrameworkVersion() == null) ? 0 : getFrameworkVersion().hashCode());
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
