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
 * Contains information about the output location for the compiled model and the target device that the model runs on.
 * <code>TargetDevice</code> and <code>TargetPlatform</code> are mutually exclusive, so you need to choose one between
 * the two to specify your target device or platform. If you cannot find your device you want to use from the
 * <code>TargetDevice</code> list, use <code>TargetPlatform</code> to describe the platform of your edge device and
 * <code>CompilerOptions</code> if there are specific settings that are required or recommended to use for particular
 * TargetPlatform.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/OutputConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifies the S3 bucket where you want Amazon SageMaker to store the model artifacts. For example,
     * <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     */
    private String s3OutputLocation;
    /**
     * <p>
     * Identifies the target device or the machine learning instance that you want to run your model on after the
     * compilation has completed. Alternatively, you can specify OS, architecture, and accelerator using
     * <a>TargetPlatform</a> fields. It can be used instead of <code>TargetPlatform</code>.
     * </p>
     */
    private String targetDevice;
    /**
     * <p>
     * Contains information about a target platform that you want your model to run on, such as OS, architecture, and
     * accelerators. It is an alternative of <code>TargetDevice</code>.
     * </p>
     * <p>
     * The following examples show how to configure the <code>TargetPlatform</code> and <code>CompilerOptions</code>
     * JSON strings for popular target platforms:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Raspberry Pi 3 Model B+
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "LINUX", "Arch": "ARM_EABIHF"},</code>
     * </p>
     * <p>
     * <code> "CompilerOptions": {'mattr': ['+neon']}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Jetson TX2
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "LINUX", "Arch": "ARM64", "Accelerator": "NVIDIA"},</code>
     * </p>
     * <p>
     * <code> "CompilerOptions": {'gpu-code': 'sm_62', 'trt-ver': '6.0.1', 'cuda-ver': '10.0'}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * EC2 m5.2xlarge instance OS
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "LINUX", "Arch": "X86_64", "Accelerator": "NVIDIA"},</code>
     * </p>
     * <p>
     * <code> "CompilerOptions": {'mcpu': 'skylake-avx512'}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RK3399
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "LINUX", "Arch": "ARM64", "Accelerator": "MALI"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ARMv7 phone (CPU)
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "ANDROID", "Arch": "ARM_EABI"},</code>
     * </p>
     * <p>
     * <code> "CompilerOptions": {'ANDROID_PLATFORM': 25, 'mattr': ['+neon']}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ARMv8 phone (CPU)
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "ANDROID", "Arch": "ARM64"},</code>
     * </p>
     * <p>
     * <code> "CompilerOptions": {'ANDROID_PLATFORM': 29}</code>
     * </p>
     * </li>
     * </ul>
     */
    private TargetPlatform targetPlatform;
    /**
     * <p>
     * Specifies additional parameters for compiler options in JSON format. The compiler options are
     * <code>TargetPlatform</code> specific. It is required for NVIDIA accelerators and highly recommended for CPU
     * compilations. For any other cases, it is optional to specify <code>CompilerOptions.</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DTYPE</code>: Specifies the data type for the input. When compiling for <code>ml_*</code> (except for
     * <code>ml_inf</code>) instances using PyTorch framework, provide the data type (dtype) of the model's input.
     * <code>"float32"</code> is used if <code>"DTYPE"</code> is not specified. Options for data type are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * float32: Use either <code>"float"</code> or <code>"float32"</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * int64: Use either <code>"int64"</code> or <code>"long"</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>{"dtype" : "float32"}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CPU</code>: Compilation for CPU supports the following compiler options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>mcpu</code>: CPU micro-architecture. For example, <code>{'mcpu': 'skylake-avx512'}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mattr</code>: CPU flags. For example, <code>{'mattr': ['+neon', '+vfpv4']}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ARM</code>: Details of ARM CPU compilations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEON</code>: NEON is an implementation of the Advanced SIMD extension used in ARMv7 processors.
     * </p>
     * <p>
     * For example, add <code>{'mattr': ['+neon']}</code> to the compiler options if compiling for ARM 32-bit platform
     * with the NEON support.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NVIDIA</code>: Compilation for NVIDIA GPU supports the following compiler options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gpu_code</code>: Specifies the targeted architecture.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>trt-ver</code>: Specifies the TensorRT versions in x.y.z. format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cuda-ver</code>: Specifies the CUDA version in x.y format.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>{'gpu-code': 'sm_72', 'trt-ver': '6.0.1', 'cuda-ver': '10.1'}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ANDROID</code>: Compilation for the Android OS supports the following compiler options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ANDROID_PLATFORM</code>: Specifies the Android API levels. Available levels range from 21 to 29. For
     * example, <code>{'ANDROID_PLATFORM': 28}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mattr</code>: Add <code>{'mattr': ['+neon']}</code> to compiler options if compiling for ARM 32-bit
     * platform with NEON support.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>INFERENTIA</code>: Compilation for target ml_inf1 uses compiler options passed in as a JSON string. For
     * example, <code>"CompilerOptions": "\"--verbose 1 --num-neuroncores 2 -O2\""</code>.
     * </p>
     * <p>
     * For information about supported compiler options, see <a
     * href="https://github.com/aws/aws-neuron-sdk/blob/master/docs/neuron-cc/command-line-reference.md"> Neuron
     * Compiler CLI</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CoreML</code>: Compilation for the CoreML <a>OutputConfig$TargetDevice</a> supports the following compiler
     * options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>class_labels</code>: Specifies the classification labels file name inside input tar.gz file. For example,
     * <code>{"class_labels": "imagenet_labels_1000.txt"}</code>. Labels inside the txt file should be separated by
     * newlines.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>EIA</code>: Compilation for the Elastic Inference Accelerator supports the following compiler options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>precision_mode</code>: Specifies the precision of compiled artifacts. Supported values are
     * <code>"FP16"</code> and <code>"FP32"</code>. Default is <code>"FP32"</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>signature_def_key</code>: Specifies the signature to use for models in SavedModel format. Defaults is
     * TensorFlow's default signature def key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>output_names</code>: Specifies a list of output tensor names for models in FrozenGraph format. Set at most
     * one API field, either: <code>signature_def_key</code> or <code>output_names</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example: <code>{"precision_mode": "FP32", "output_names": ["output:0"]}</code>
     * </p>
     * </li>
     * </ul>
     */
    private String compilerOptions;
    /**
     * <p>
     * The Amazon Web Services Key Management Service key (Amazon Web Services KMS) that Amazon SageMaker uses to
     * encrypt your output models with Amazon S3 server-side encryption after compilation job. If you don't provide a
     * KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/UsingKMSEncryption.html">KMS-Managed Encryption
     * Keys</a> in the <i>Amazon Simple Storage Service Developer Guide.</i>
     * </p>
     * <p>
     * The KmsKeyId can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name ARN: <code>arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Identifies the S3 bucket where you want Amazon SageMaker to store the model artifacts. For example,
     * <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * 
     * @param s3OutputLocation
     *        Identifies the S3 bucket where you want Amazon SageMaker to store the model artifacts. For example,
     *        <code>s3://bucket-name/key-name-prefix</code>.
     */

    public void setS3OutputLocation(String s3OutputLocation) {
        this.s3OutputLocation = s3OutputLocation;
    }

    /**
     * <p>
     * Identifies the S3 bucket where you want Amazon SageMaker to store the model artifacts. For example,
     * <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * 
     * @return Identifies the S3 bucket where you want Amazon SageMaker to store the model artifacts. For example,
     *         <code>s3://bucket-name/key-name-prefix</code>.
     */

    public String getS3OutputLocation() {
        return this.s3OutputLocation;
    }

    /**
     * <p>
     * Identifies the S3 bucket where you want Amazon SageMaker to store the model artifacts. For example,
     * <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * 
     * @param s3OutputLocation
     *        Identifies the S3 bucket where you want Amazon SageMaker to store the model artifacts. For example,
     *        <code>s3://bucket-name/key-name-prefix</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputConfig withS3OutputLocation(String s3OutputLocation) {
        setS3OutputLocation(s3OutputLocation);
        return this;
    }

    /**
     * <p>
     * Identifies the target device or the machine learning instance that you want to run your model on after the
     * compilation has completed. Alternatively, you can specify OS, architecture, and accelerator using
     * <a>TargetPlatform</a> fields. It can be used instead of <code>TargetPlatform</code>.
     * </p>
     * 
     * @param targetDevice
     *        Identifies the target device or the machine learning instance that you want to run your model on after the
     *        compilation has completed. Alternatively, you can specify OS, architecture, and accelerator using
     *        <a>TargetPlatform</a> fields. It can be used instead of <code>TargetPlatform</code>.
     * @see TargetDevice
     */

    public void setTargetDevice(String targetDevice) {
        this.targetDevice = targetDevice;
    }

    /**
     * <p>
     * Identifies the target device or the machine learning instance that you want to run your model on after the
     * compilation has completed. Alternatively, you can specify OS, architecture, and accelerator using
     * <a>TargetPlatform</a> fields. It can be used instead of <code>TargetPlatform</code>.
     * </p>
     * 
     * @return Identifies the target device or the machine learning instance that you want to run your model on after
     *         the compilation has completed. Alternatively, you can specify OS, architecture, and accelerator using
     *         <a>TargetPlatform</a> fields. It can be used instead of <code>TargetPlatform</code>.
     * @see TargetDevice
     */

    public String getTargetDevice() {
        return this.targetDevice;
    }

    /**
     * <p>
     * Identifies the target device or the machine learning instance that you want to run your model on after the
     * compilation has completed. Alternatively, you can specify OS, architecture, and accelerator using
     * <a>TargetPlatform</a> fields. It can be used instead of <code>TargetPlatform</code>.
     * </p>
     * 
     * @param targetDevice
     *        Identifies the target device or the machine learning instance that you want to run your model on after the
     *        compilation has completed. Alternatively, you can specify OS, architecture, and accelerator using
     *        <a>TargetPlatform</a> fields. It can be used instead of <code>TargetPlatform</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetDevice
     */

    public OutputConfig withTargetDevice(String targetDevice) {
        setTargetDevice(targetDevice);
        return this;
    }

    /**
     * <p>
     * Identifies the target device or the machine learning instance that you want to run your model on after the
     * compilation has completed. Alternatively, you can specify OS, architecture, and accelerator using
     * <a>TargetPlatform</a> fields. It can be used instead of <code>TargetPlatform</code>.
     * </p>
     * 
     * @param targetDevice
     *        Identifies the target device or the machine learning instance that you want to run your model on after the
     *        compilation has completed. Alternatively, you can specify OS, architecture, and accelerator using
     *        <a>TargetPlatform</a> fields. It can be used instead of <code>TargetPlatform</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetDevice
     */

    public OutputConfig withTargetDevice(TargetDevice targetDevice) {
        this.targetDevice = targetDevice.toString();
        return this;
    }

    /**
     * <p>
     * Contains information about a target platform that you want your model to run on, such as OS, architecture, and
     * accelerators. It is an alternative of <code>TargetDevice</code>.
     * </p>
     * <p>
     * The following examples show how to configure the <code>TargetPlatform</code> and <code>CompilerOptions</code>
     * JSON strings for popular target platforms:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Raspberry Pi 3 Model B+
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "LINUX", "Arch": "ARM_EABIHF"},</code>
     * </p>
     * <p>
     * <code> "CompilerOptions": {'mattr': ['+neon']}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Jetson TX2
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "LINUX", "Arch": "ARM64", "Accelerator": "NVIDIA"},</code>
     * </p>
     * <p>
     * <code> "CompilerOptions": {'gpu-code': 'sm_62', 'trt-ver': '6.0.1', 'cuda-ver': '10.0'}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * EC2 m5.2xlarge instance OS
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "LINUX", "Arch": "X86_64", "Accelerator": "NVIDIA"},</code>
     * </p>
     * <p>
     * <code> "CompilerOptions": {'mcpu': 'skylake-avx512'}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RK3399
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "LINUX", "Arch": "ARM64", "Accelerator": "MALI"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ARMv7 phone (CPU)
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "ANDROID", "Arch": "ARM_EABI"},</code>
     * </p>
     * <p>
     * <code> "CompilerOptions": {'ANDROID_PLATFORM': 25, 'mattr': ['+neon']}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ARMv8 phone (CPU)
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "ANDROID", "Arch": "ARM64"},</code>
     * </p>
     * <p>
     * <code> "CompilerOptions": {'ANDROID_PLATFORM': 29}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetPlatform
     *        Contains information about a target platform that you want your model to run on, such as OS, architecture,
     *        and accelerators. It is an alternative of <code>TargetDevice</code>.</p>
     *        <p>
     *        The following examples show how to configure the <code>TargetPlatform</code> and
     *        <code>CompilerOptions</code> JSON strings for popular target platforms:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Raspberry Pi 3 Model B+
     *        </p>
     *        <p>
     *        <code>"TargetPlatform": {"Os": "LINUX", "Arch": "ARM_EABIHF"},</code>
     *        </p>
     *        <p>
     *        <code> "CompilerOptions": {'mattr': ['+neon']}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Jetson TX2
     *        </p>
     *        <p>
     *        <code>"TargetPlatform": {"Os": "LINUX", "Arch": "ARM64", "Accelerator": "NVIDIA"},</code>
     *        </p>
     *        <p>
     *        <code> "CompilerOptions": {'gpu-code': 'sm_62', 'trt-ver': '6.0.1', 'cuda-ver': '10.0'}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EC2 m5.2xlarge instance OS
     *        </p>
     *        <p>
     *        <code>"TargetPlatform": {"Os": "LINUX", "Arch": "X86_64", "Accelerator": "NVIDIA"},</code>
     *        </p>
     *        <p>
     *        <code> "CompilerOptions": {'mcpu': 'skylake-avx512'}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RK3399
     *        </p>
     *        <p>
     *        <code>"TargetPlatform": {"Os": "LINUX", "Arch": "ARM64", "Accelerator": "MALI"}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARMv7 phone (CPU)
     *        </p>
     *        <p>
     *        <code>"TargetPlatform": {"Os": "ANDROID", "Arch": "ARM_EABI"},</code>
     *        </p>
     *        <p>
     *        <code> "CompilerOptions": {'ANDROID_PLATFORM': 25, 'mattr': ['+neon']}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARMv8 phone (CPU)
     *        </p>
     *        <p>
     *        <code>"TargetPlatform": {"Os": "ANDROID", "Arch": "ARM64"},</code>
     *        </p>
     *        <p>
     *        <code> "CompilerOptions": {'ANDROID_PLATFORM': 29}</code>
     *        </p>
     *        </li>
     */

    public void setTargetPlatform(TargetPlatform targetPlatform) {
        this.targetPlatform = targetPlatform;
    }

    /**
     * <p>
     * Contains information about a target platform that you want your model to run on, such as OS, architecture, and
     * accelerators. It is an alternative of <code>TargetDevice</code>.
     * </p>
     * <p>
     * The following examples show how to configure the <code>TargetPlatform</code> and <code>CompilerOptions</code>
     * JSON strings for popular target platforms:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Raspberry Pi 3 Model B+
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "LINUX", "Arch": "ARM_EABIHF"},</code>
     * </p>
     * <p>
     * <code> "CompilerOptions": {'mattr': ['+neon']}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Jetson TX2
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "LINUX", "Arch": "ARM64", "Accelerator": "NVIDIA"},</code>
     * </p>
     * <p>
     * <code> "CompilerOptions": {'gpu-code': 'sm_62', 'trt-ver': '6.0.1', 'cuda-ver': '10.0'}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * EC2 m5.2xlarge instance OS
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "LINUX", "Arch": "X86_64", "Accelerator": "NVIDIA"},</code>
     * </p>
     * <p>
     * <code> "CompilerOptions": {'mcpu': 'skylake-avx512'}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RK3399
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "LINUX", "Arch": "ARM64", "Accelerator": "MALI"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ARMv7 phone (CPU)
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "ANDROID", "Arch": "ARM_EABI"},</code>
     * </p>
     * <p>
     * <code> "CompilerOptions": {'ANDROID_PLATFORM': 25, 'mattr': ['+neon']}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ARMv8 phone (CPU)
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "ANDROID", "Arch": "ARM64"},</code>
     * </p>
     * <p>
     * <code> "CompilerOptions": {'ANDROID_PLATFORM': 29}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Contains information about a target platform that you want your model to run on, such as OS,
     *         architecture, and accelerators. It is an alternative of <code>TargetDevice</code>.</p>
     *         <p>
     *         The following examples show how to configure the <code>TargetPlatform</code> and
     *         <code>CompilerOptions</code> JSON strings for popular target platforms:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Raspberry Pi 3 Model B+
     *         </p>
     *         <p>
     *         <code>"TargetPlatform": {"Os": "LINUX", "Arch": "ARM_EABIHF"},</code>
     *         </p>
     *         <p>
     *         <code> "CompilerOptions": {'mattr': ['+neon']}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Jetson TX2
     *         </p>
     *         <p>
     *         <code>"TargetPlatform": {"Os": "LINUX", "Arch": "ARM64", "Accelerator": "NVIDIA"},</code>
     *         </p>
     *         <p>
     *         <code> "CompilerOptions": {'gpu-code': 'sm_62', 'trt-ver': '6.0.1', 'cuda-ver': '10.0'}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EC2 m5.2xlarge instance OS
     *         </p>
     *         <p>
     *         <code>"TargetPlatform": {"Os": "LINUX", "Arch": "X86_64", "Accelerator": "NVIDIA"},</code>
     *         </p>
     *         <p>
     *         <code> "CompilerOptions": {'mcpu': 'skylake-avx512'}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RK3399
     *         </p>
     *         <p>
     *         <code>"TargetPlatform": {"Os": "LINUX", "Arch": "ARM64", "Accelerator": "MALI"}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARMv7 phone (CPU)
     *         </p>
     *         <p>
     *         <code>"TargetPlatform": {"Os": "ANDROID", "Arch": "ARM_EABI"},</code>
     *         </p>
     *         <p>
     *         <code> "CompilerOptions": {'ANDROID_PLATFORM': 25, 'mattr': ['+neon']}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARMv8 phone (CPU)
     *         </p>
     *         <p>
     *         <code>"TargetPlatform": {"Os": "ANDROID", "Arch": "ARM64"},</code>
     *         </p>
     *         <p>
     *         <code> "CompilerOptions": {'ANDROID_PLATFORM': 29}</code>
     *         </p>
     *         </li>
     */

    public TargetPlatform getTargetPlatform() {
        return this.targetPlatform;
    }

    /**
     * <p>
     * Contains information about a target platform that you want your model to run on, such as OS, architecture, and
     * accelerators. It is an alternative of <code>TargetDevice</code>.
     * </p>
     * <p>
     * The following examples show how to configure the <code>TargetPlatform</code> and <code>CompilerOptions</code>
     * JSON strings for popular target platforms:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Raspberry Pi 3 Model B+
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "LINUX", "Arch": "ARM_EABIHF"},</code>
     * </p>
     * <p>
     * <code> "CompilerOptions": {'mattr': ['+neon']}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Jetson TX2
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "LINUX", "Arch": "ARM64", "Accelerator": "NVIDIA"},</code>
     * </p>
     * <p>
     * <code> "CompilerOptions": {'gpu-code': 'sm_62', 'trt-ver': '6.0.1', 'cuda-ver': '10.0'}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * EC2 m5.2xlarge instance OS
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "LINUX", "Arch": "X86_64", "Accelerator": "NVIDIA"},</code>
     * </p>
     * <p>
     * <code> "CompilerOptions": {'mcpu': 'skylake-avx512'}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RK3399
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "LINUX", "Arch": "ARM64", "Accelerator": "MALI"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ARMv7 phone (CPU)
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "ANDROID", "Arch": "ARM_EABI"},</code>
     * </p>
     * <p>
     * <code> "CompilerOptions": {'ANDROID_PLATFORM': 25, 'mattr': ['+neon']}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ARMv8 phone (CPU)
     * </p>
     * <p>
     * <code>"TargetPlatform": {"Os": "ANDROID", "Arch": "ARM64"},</code>
     * </p>
     * <p>
     * <code> "CompilerOptions": {'ANDROID_PLATFORM': 29}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetPlatform
     *        Contains information about a target platform that you want your model to run on, such as OS, architecture,
     *        and accelerators. It is an alternative of <code>TargetDevice</code>.</p>
     *        <p>
     *        The following examples show how to configure the <code>TargetPlatform</code> and
     *        <code>CompilerOptions</code> JSON strings for popular target platforms:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Raspberry Pi 3 Model B+
     *        </p>
     *        <p>
     *        <code>"TargetPlatform": {"Os": "LINUX", "Arch": "ARM_EABIHF"},</code>
     *        </p>
     *        <p>
     *        <code> "CompilerOptions": {'mattr': ['+neon']}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Jetson TX2
     *        </p>
     *        <p>
     *        <code>"TargetPlatform": {"Os": "LINUX", "Arch": "ARM64", "Accelerator": "NVIDIA"},</code>
     *        </p>
     *        <p>
     *        <code> "CompilerOptions": {'gpu-code': 'sm_62', 'trt-ver': '6.0.1', 'cuda-ver': '10.0'}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EC2 m5.2xlarge instance OS
     *        </p>
     *        <p>
     *        <code>"TargetPlatform": {"Os": "LINUX", "Arch": "X86_64", "Accelerator": "NVIDIA"},</code>
     *        </p>
     *        <p>
     *        <code> "CompilerOptions": {'mcpu': 'skylake-avx512'}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RK3399
     *        </p>
     *        <p>
     *        <code>"TargetPlatform": {"Os": "LINUX", "Arch": "ARM64", "Accelerator": "MALI"}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARMv7 phone (CPU)
     *        </p>
     *        <p>
     *        <code>"TargetPlatform": {"Os": "ANDROID", "Arch": "ARM_EABI"},</code>
     *        </p>
     *        <p>
     *        <code> "CompilerOptions": {'ANDROID_PLATFORM': 25, 'mattr': ['+neon']}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARMv8 phone (CPU)
     *        </p>
     *        <p>
     *        <code>"TargetPlatform": {"Os": "ANDROID", "Arch": "ARM64"},</code>
     *        </p>
     *        <p>
     *        <code> "CompilerOptions": {'ANDROID_PLATFORM': 29}</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputConfig withTargetPlatform(TargetPlatform targetPlatform) {
        setTargetPlatform(targetPlatform);
        return this;
    }

    /**
     * <p>
     * Specifies additional parameters for compiler options in JSON format. The compiler options are
     * <code>TargetPlatform</code> specific. It is required for NVIDIA accelerators and highly recommended for CPU
     * compilations. For any other cases, it is optional to specify <code>CompilerOptions.</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DTYPE</code>: Specifies the data type for the input. When compiling for <code>ml_*</code> (except for
     * <code>ml_inf</code>) instances using PyTorch framework, provide the data type (dtype) of the model's input.
     * <code>"float32"</code> is used if <code>"DTYPE"</code> is not specified. Options for data type are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * float32: Use either <code>"float"</code> or <code>"float32"</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * int64: Use either <code>"int64"</code> or <code>"long"</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>{"dtype" : "float32"}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CPU</code>: Compilation for CPU supports the following compiler options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>mcpu</code>: CPU micro-architecture. For example, <code>{'mcpu': 'skylake-avx512'}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mattr</code>: CPU flags. For example, <code>{'mattr': ['+neon', '+vfpv4']}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ARM</code>: Details of ARM CPU compilations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEON</code>: NEON is an implementation of the Advanced SIMD extension used in ARMv7 processors.
     * </p>
     * <p>
     * For example, add <code>{'mattr': ['+neon']}</code> to the compiler options if compiling for ARM 32-bit platform
     * with the NEON support.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NVIDIA</code>: Compilation for NVIDIA GPU supports the following compiler options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gpu_code</code>: Specifies the targeted architecture.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>trt-ver</code>: Specifies the TensorRT versions in x.y.z. format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cuda-ver</code>: Specifies the CUDA version in x.y format.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>{'gpu-code': 'sm_72', 'trt-ver': '6.0.1', 'cuda-ver': '10.1'}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ANDROID</code>: Compilation for the Android OS supports the following compiler options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ANDROID_PLATFORM</code>: Specifies the Android API levels. Available levels range from 21 to 29. For
     * example, <code>{'ANDROID_PLATFORM': 28}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mattr</code>: Add <code>{'mattr': ['+neon']}</code> to compiler options if compiling for ARM 32-bit
     * platform with NEON support.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>INFERENTIA</code>: Compilation for target ml_inf1 uses compiler options passed in as a JSON string. For
     * example, <code>"CompilerOptions": "\"--verbose 1 --num-neuroncores 2 -O2\""</code>.
     * </p>
     * <p>
     * For information about supported compiler options, see <a
     * href="https://github.com/aws/aws-neuron-sdk/blob/master/docs/neuron-cc/command-line-reference.md"> Neuron
     * Compiler CLI</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CoreML</code>: Compilation for the CoreML <a>OutputConfig$TargetDevice</a> supports the following compiler
     * options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>class_labels</code>: Specifies the classification labels file name inside input tar.gz file. For example,
     * <code>{"class_labels": "imagenet_labels_1000.txt"}</code>. Labels inside the txt file should be separated by
     * newlines.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>EIA</code>: Compilation for the Elastic Inference Accelerator supports the following compiler options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>precision_mode</code>: Specifies the precision of compiled artifacts. Supported values are
     * <code>"FP16"</code> and <code>"FP32"</code>. Default is <code>"FP32"</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>signature_def_key</code>: Specifies the signature to use for models in SavedModel format. Defaults is
     * TensorFlow's default signature def key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>output_names</code>: Specifies a list of output tensor names for models in FrozenGraph format. Set at most
     * one API field, either: <code>signature_def_key</code> or <code>output_names</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example: <code>{"precision_mode": "FP32", "output_names": ["output:0"]}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param compilerOptions
     *        Specifies additional parameters for compiler options in JSON format. The compiler options are
     *        <code>TargetPlatform</code> specific. It is required for NVIDIA accelerators and highly recommended for
     *        CPU compilations. For any other cases, it is optional to specify <code>CompilerOptions.</code> </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DTYPE</code>: Specifies the data type for the input. When compiling for <code>ml_*</code> (except
     *        for <code>ml_inf</code>) instances using PyTorch framework, provide the data type (dtype) of the model's
     *        input. <code>"float32"</code> is used if <code>"DTYPE"</code> is not specified. Options for data type are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        float32: Use either <code>"float"</code> or <code>"float32"</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        int64: Use either <code>"int64"</code> or <code>"long"</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, <code>{"dtype" : "float32"}</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CPU</code>: Compilation for CPU supports the following compiler options.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>mcpu</code>: CPU micro-architecture. For example, <code>{'mcpu': 'skylake-avx512'}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mattr</code>: CPU flags. For example, <code>{'mattr': ['+neon', '+vfpv4']}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARM</code>: Details of ARM CPU compilations.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEON</code>: NEON is an implementation of the Advanced SIMD extension used in ARMv7 processors.
     *        </p>
     *        <p>
     *        For example, add <code>{'mattr': ['+neon']}</code> to the compiler options if compiling for ARM 32-bit
     *        platform with the NEON support.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NVIDIA</code>: Compilation for NVIDIA GPU supports the following compiler options.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gpu_code</code>: Specifies the targeted architecture.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>trt-ver</code>: Specifies the TensorRT versions in x.y.z. format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cuda-ver</code>: Specifies the CUDA version in x.y format.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, <code>{'gpu-code': 'sm_72', 'trt-ver': '6.0.1', 'cuda-ver': '10.1'}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ANDROID</code>: Compilation for the Android OS supports the following compiler options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ANDROID_PLATFORM</code>: Specifies the Android API levels. Available levels range from 21 to 29. For
     *        example, <code>{'ANDROID_PLATFORM': 28}</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mattr</code>: Add <code>{'mattr': ['+neon']}</code> to compiler options if compiling for ARM 32-bit
     *        platform with NEON support.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INFERENTIA</code>: Compilation for target ml_inf1 uses compiler options passed in as a JSON string.
     *        For example, <code>"CompilerOptions": "\"--verbose 1 --num-neuroncores 2 -O2\""</code>.
     *        </p>
     *        <p>
     *        For information about supported compiler options, see <a
     *        href="https://github.com/aws/aws-neuron-sdk/blob/master/docs/neuron-cc/command-line-reference.md"> Neuron
     *        Compiler CLI</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CoreML</code>: Compilation for the CoreML <a>OutputConfig$TargetDevice</a> supports the following
     *        compiler options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>class_labels</code>: Specifies the classification labels file name inside input tar.gz file. For
     *        example, <code>{"class_labels": "imagenet_labels_1000.txt"}</code>. Labels inside the txt file should be
     *        separated by newlines.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EIA</code>: Compilation for the Elastic Inference Accelerator supports the following compiler
     *        options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>precision_mode</code>: Specifies the precision of compiled artifacts. Supported values are
     *        <code>"FP16"</code> and <code>"FP32"</code>. Default is <code>"FP32"</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>signature_def_key</code>: Specifies the signature to use for models in SavedModel format. Defaults
     *        is TensorFlow's default signature def key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>output_names</code>: Specifies a list of output tensor names for models in FrozenGraph format. Set
     *        at most one API field, either: <code>signature_def_key</code> or <code>output_names</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example: <code>{"precision_mode": "FP32", "output_names": ["output:0"]}</code>
     *        </p>
     *        </li>
     */

    public void setCompilerOptions(String compilerOptions) {
        this.compilerOptions = compilerOptions;
    }

    /**
     * <p>
     * Specifies additional parameters for compiler options in JSON format. The compiler options are
     * <code>TargetPlatform</code> specific. It is required for NVIDIA accelerators and highly recommended for CPU
     * compilations. For any other cases, it is optional to specify <code>CompilerOptions.</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DTYPE</code>: Specifies the data type for the input. When compiling for <code>ml_*</code> (except for
     * <code>ml_inf</code>) instances using PyTorch framework, provide the data type (dtype) of the model's input.
     * <code>"float32"</code> is used if <code>"DTYPE"</code> is not specified. Options for data type are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * float32: Use either <code>"float"</code> or <code>"float32"</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * int64: Use either <code>"int64"</code> or <code>"long"</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>{"dtype" : "float32"}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CPU</code>: Compilation for CPU supports the following compiler options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>mcpu</code>: CPU micro-architecture. For example, <code>{'mcpu': 'skylake-avx512'}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mattr</code>: CPU flags. For example, <code>{'mattr': ['+neon', '+vfpv4']}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ARM</code>: Details of ARM CPU compilations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEON</code>: NEON is an implementation of the Advanced SIMD extension used in ARMv7 processors.
     * </p>
     * <p>
     * For example, add <code>{'mattr': ['+neon']}</code> to the compiler options if compiling for ARM 32-bit platform
     * with the NEON support.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NVIDIA</code>: Compilation for NVIDIA GPU supports the following compiler options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gpu_code</code>: Specifies the targeted architecture.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>trt-ver</code>: Specifies the TensorRT versions in x.y.z. format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cuda-ver</code>: Specifies the CUDA version in x.y format.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>{'gpu-code': 'sm_72', 'trt-ver': '6.0.1', 'cuda-ver': '10.1'}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ANDROID</code>: Compilation for the Android OS supports the following compiler options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ANDROID_PLATFORM</code>: Specifies the Android API levels. Available levels range from 21 to 29. For
     * example, <code>{'ANDROID_PLATFORM': 28}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mattr</code>: Add <code>{'mattr': ['+neon']}</code> to compiler options if compiling for ARM 32-bit
     * platform with NEON support.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>INFERENTIA</code>: Compilation for target ml_inf1 uses compiler options passed in as a JSON string. For
     * example, <code>"CompilerOptions": "\"--verbose 1 --num-neuroncores 2 -O2\""</code>.
     * </p>
     * <p>
     * For information about supported compiler options, see <a
     * href="https://github.com/aws/aws-neuron-sdk/blob/master/docs/neuron-cc/command-line-reference.md"> Neuron
     * Compiler CLI</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CoreML</code>: Compilation for the CoreML <a>OutputConfig$TargetDevice</a> supports the following compiler
     * options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>class_labels</code>: Specifies the classification labels file name inside input tar.gz file. For example,
     * <code>{"class_labels": "imagenet_labels_1000.txt"}</code>. Labels inside the txt file should be separated by
     * newlines.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>EIA</code>: Compilation for the Elastic Inference Accelerator supports the following compiler options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>precision_mode</code>: Specifies the precision of compiled artifacts. Supported values are
     * <code>"FP16"</code> and <code>"FP32"</code>. Default is <code>"FP32"</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>signature_def_key</code>: Specifies the signature to use for models in SavedModel format. Defaults is
     * TensorFlow's default signature def key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>output_names</code>: Specifies a list of output tensor names for models in FrozenGraph format. Set at most
     * one API field, either: <code>signature_def_key</code> or <code>output_names</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example: <code>{"precision_mode": "FP32", "output_names": ["output:0"]}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies additional parameters for compiler options in JSON format. The compiler options are
     *         <code>TargetPlatform</code> specific. It is required for NVIDIA accelerators and highly recommended for
     *         CPU compilations. For any other cases, it is optional to specify <code>CompilerOptions.</code> </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DTYPE</code>: Specifies the data type for the input. When compiling for <code>ml_*</code> (except
     *         for <code>ml_inf</code>) instances using PyTorch framework, provide the data type (dtype) of the model's
     *         input. <code>"float32"</code> is used if <code>"DTYPE"</code> is not specified. Options for data type
     *         are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         float32: Use either <code>"float"</code> or <code>"float32"</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         int64: Use either <code>"int64"</code> or <code>"long"</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, <code>{"dtype" : "float32"}</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CPU</code>: Compilation for CPU supports the following compiler options.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>mcpu</code>: CPU micro-architecture. For example, <code>{'mcpu': 'skylake-avx512'}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mattr</code>: CPU flags. For example, <code>{'mattr': ['+neon', '+vfpv4']}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ARM</code>: Details of ARM CPU compilations.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NEON</code>: NEON is an implementation of the Advanced SIMD extension used in ARMv7 processors.
     *         </p>
     *         <p>
     *         For example, add <code>{'mattr': ['+neon']}</code> to the compiler options if compiling for ARM 32-bit
     *         platform with the NEON support.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NVIDIA</code>: Compilation for NVIDIA GPU supports the following compiler options.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>gpu_code</code>: Specifies the targeted architecture.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>trt-ver</code>: Specifies the TensorRT versions in x.y.z. format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cuda-ver</code>: Specifies the CUDA version in x.y format.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, <code>{'gpu-code': 'sm_72', 'trt-ver': '6.0.1', 'cuda-ver': '10.1'}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ANDROID</code>: Compilation for the Android OS supports the following compiler options:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ANDROID_PLATFORM</code>: Specifies the Android API levels. Available levels range from 21 to 29.
     *         For example, <code>{'ANDROID_PLATFORM': 28}</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mattr</code>: Add <code>{'mattr': ['+neon']}</code> to compiler options if compiling for ARM 32-bit
     *         platform with NEON support.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INFERENTIA</code>: Compilation for target ml_inf1 uses compiler options passed in as a JSON string.
     *         For example, <code>"CompilerOptions": "\"--verbose 1 --num-neuroncores 2 -O2\""</code>.
     *         </p>
     *         <p>
     *         For information about supported compiler options, see <a
     *         href="https://github.com/aws/aws-neuron-sdk/blob/master/docs/neuron-cc/command-line-reference.md"> Neuron
     *         Compiler CLI</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CoreML</code>: Compilation for the CoreML <a>OutputConfig$TargetDevice</a> supports the following
     *         compiler options:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>class_labels</code>: Specifies the classification labels file name inside input tar.gz file. For
     *         example, <code>{"class_labels": "imagenet_labels_1000.txt"}</code>. Labels inside the txt file should be
     *         separated by newlines.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EIA</code>: Compilation for the Elastic Inference Accelerator supports the following compiler
     *         options:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>precision_mode</code>: Specifies the precision of compiled artifacts. Supported values are
     *         <code>"FP16"</code> and <code>"FP32"</code>. Default is <code>"FP32"</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>signature_def_key</code>: Specifies the signature to use for models in SavedModel format. Defaults
     *         is TensorFlow's default signature def key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>output_names</code>: Specifies a list of output tensor names for models in FrozenGraph format. Set
     *         at most one API field, either: <code>signature_def_key</code> or <code>output_names</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example: <code>{"precision_mode": "FP32", "output_names": ["output:0"]}</code>
     *         </p>
     *         </li>
     */

    public String getCompilerOptions() {
        return this.compilerOptions;
    }

    /**
     * <p>
     * Specifies additional parameters for compiler options in JSON format. The compiler options are
     * <code>TargetPlatform</code> specific. It is required for NVIDIA accelerators and highly recommended for CPU
     * compilations. For any other cases, it is optional to specify <code>CompilerOptions.</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DTYPE</code>: Specifies the data type for the input. When compiling for <code>ml_*</code> (except for
     * <code>ml_inf</code>) instances using PyTorch framework, provide the data type (dtype) of the model's input.
     * <code>"float32"</code> is used if <code>"DTYPE"</code> is not specified. Options for data type are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * float32: Use either <code>"float"</code> or <code>"float32"</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * int64: Use either <code>"int64"</code> or <code>"long"</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>{"dtype" : "float32"}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CPU</code>: Compilation for CPU supports the following compiler options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>mcpu</code>: CPU micro-architecture. For example, <code>{'mcpu': 'skylake-avx512'}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mattr</code>: CPU flags. For example, <code>{'mattr': ['+neon', '+vfpv4']}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ARM</code>: Details of ARM CPU compilations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEON</code>: NEON is an implementation of the Advanced SIMD extension used in ARMv7 processors.
     * </p>
     * <p>
     * For example, add <code>{'mattr': ['+neon']}</code> to the compiler options if compiling for ARM 32-bit platform
     * with the NEON support.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NVIDIA</code>: Compilation for NVIDIA GPU supports the following compiler options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gpu_code</code>: Specifies the targeted architecture.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>trt-ver</code>: Specifies the TensorRT versions in x.y.z. format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cuda-ver</code>: Specifies the CUDA version in x.y format.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>{'gpu-code': 'sm_72', 'trt-ver': '6.0.1', 'cuda-ver': '10.1'}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ANDROID</code>: Compilation for the Android OS supports the following compiler options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ANDROID_PLATFORM</code>: Specifies the Android API levels. Available levels range from 21 to 29. For
     * example, <code>{'ANDROID_PLATFORM': 28}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mattr</code>: Add <code>{'mattr': ['+neon']}</code> to compiler options if compiling for ARM 32-bit
     * platform with NEON support.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>INFERENTIA</code>: Compilation for target ml_inf1 uses compiler options passed in as a JSON string. For
     * example, <code>"CompilerOptions": "\"--verbose 1 --num-neuroncores 2 -O2\""</code>.
     * </p>
     * <p>
     * For information about supported compiler options, see <a
     * href="https://github.com/aws/aws-neuron-sdk/blob/master/docs/neuron-cc/command-line-reference.md"> Neuron
     * Compiler CLI</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CoreML</code>: Compilation for the CoreML <a>OutputConfig$TargetDevice</a> supports the following compiler
     * options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>class_labels</code>: Specifies the classification labels file name inside input tar.gz file. For example,
     * <code>{"class_labels": "imagenet_labels_1000.txt"}</code>. Labels inside the txt file should be separated by
     * newlines.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>EIA</code>: Compilation for the Elastic Inference Accelerator supports the following compiler options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>precision_mode</code>: Specifies the precision of compiled artifacts. Supported values are
     * <code>"FP16"</code> and <code>"FP32"</code>. Default is <code>"FP32"</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>signature_def_key</code>: Specifies the signature to use for models in SavedModel format. Defaults is
     * TensorFlow's default signature def key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>output_names</code>: Specifies a list of output tensor names for models in FrozenGraph format. Set at most
     * one API field, either: <code>signature_def_key</code> or <code>output_names</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example: <code>{"precision_mode": "FP32", "output_names": ["output:0"]}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param compilerOptions
     *        Specifies additional parameters for compiler options in JSON format. The compiler options are
     *        <code>TargetPlatform</code> specific. It is required for NVIDIA accelerators and highly recommended for
     *        CPU compilations. For any other cases, it is optional to specify <code>CompilerOptions.</code> </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DTYPE</code>: Specifies the data type for the input. When compiling for <code>ml_*</code> (except
     *        for <code>ml_inf</code>) instances using PyTorch framework, provide the data type (dtype) of the model's
     *        input. <code>"float32"</code> is used if <code>"DTYPE"</code> is not specified. Options for data type are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        float32: Use either <code>"float"</code> or <code>"float32"</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        int64: Use either <code>"int64"</code> or <code>"long"</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, <code>{"dtype" : "float32"}</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CPU</code>: Compilation for CPU supports the following compiler options.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>mcpu</code>: CPU micro-architecture. For example, <code>{'mcpu': 'skylake-avx512'}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mattr</code>: CPU flags. For example, <code>{'mattr': ['+neon', '+vfpv4']}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARM</code>: Details of ARM CPU compilations.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEON</code>: NEON is an implementation of the Advanced SIMD extension used in ARMv7 processors.
     *        </p>
     *        <p>
     *        For example, add <code>{'mattr': ['+neon']}</code> to the compiler options if compiling for ARM 32-bit
     *        platform with the NEON support.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NVIDIA</code>: Compilation for NVIDIA GPU supports the following compiler options.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gpu_code</code>: Specifies the targeted architecture.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>trt-ver</code>: Specifies the TensorRT versions in x.y.z. format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cuda-ver</code>: Specifies the CUDA version in x.y format.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, <code>{'gpu-code': 'sm_72', 'trt-ver': '6.0.1', 'cuda-ver': '10.1'}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ANDROID</code>: Compilation for the Android OS supports the following compiler options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ANDROID_PLATFORM</code>: Specifies the Android API levels. Available levels range from 21 to 29. For
     *        example, <code>{'ANDROID_PLATFORM': 28}</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mattr</code>: Add <code>{'mattr': ['+neon']}</code> to compiler options if compiling for ARM 32-bit
     *        platform with NEON support.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INFERENTIA</code>: Compilation for target ml_inf1 uses compiler options passed in as a JSON string.
     *        For example, <code>"CompilerOptions": "\"--verbose 1 --num-neuroncores 2 -O2\""</code>.
     *        </p>
     *        <p>
     *        For information about supported compiler options, see <a
     *        href="https://github.com/aws/aws-neuron-sdk/blob/master/docs/neuron-cc/command-line-reference.md"> Neuron
     *        Compiler CLI</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CoreML</code>: Compilation for the CoreML <a>OutputConfig$TargetDevice</a> supports the following
     *        compiler options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>class_labels</code>: Specifies the classification labels file name inside input tar.gz file. For
     *        example, <code>{"class_labels": "imagenet_labels_1000.txt"}</code>. Labels inside the txt file should be
     *        separated by newlines.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EIA</code>: Compilation for the Elastic Inference Accelerator supports the following compiler
     *        options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>precision_mode</code>: Specifies the precision of compiled artifacts. Supported values are
     *        <code>"FP16"</code> and <code>"FP32"</code>. Default is <code>"FP32"</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>signature_def_key</code>: Specifies the signature to use for models in SavedModel format. Defaults
     *        is TensorFlow's default signature def key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>output_names</code>: Specifies a list of output tensor names for models in FrozenGraph format. Set
     *        at most one API field, either: <code>signature_def_key</code> or <code>output_names</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example: <code>{"precision_mode": "FP32", "output_names": ["output:0"]}</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputConfig withCompilerOptions(String compilerOptions) {
        setCompilerOptions(compilerOptions);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service key (Amazon Web Services KMS) that Amazon SageMaker uses to
     * encrypt your output models with Amazon S3 server-side encryption after compilation job. If you don't provide a
     * KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/UsingKMSEncryption.html">KMS-Managed Encryption
     * Keys</a> in the <i>Amazon Simple Storage Service Developer Guide.</i>
     * </p>
     * <p>
     * The KmsKeyId can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name ARN: <code>arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services Key Management Service key (Amazon Web Services KMS) that Amazon SageMaker uses to
     *        encrypt your output models with Amazon S3 server-side encryption after compilation job. If you don't
     *        provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/UsingKMSEncryption.html">KMS-Managed
     *        Encryption Keys</a> in the <i>Amazon Simple Storage Service Developer Guide.</i> </p>
     *        <p>
     *        The KmsKeyId can be any of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name: <code>alias/ExampleAlias</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name ARN: <code>arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias</code>
     *        </p>
     *        </li>
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service key (Amazon Web Services KMS) that Amazon SageMaker uses to
     * encrypt your output models with Amazon S3 server-side encryption after compilation job. If you don't provide a
     * KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/UsingKMSEncryption.html">KMS-Managed Encryption
     * Keys</a> in the <i>Amazon Simple Storage Service Developer Guide.</i>
     * </p>
     * <p>
     * The KmsKeyId can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name ARN: <code>arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Web Services Key Management Service key (Amazon Web Services KMS) that Amazon SageMaker uses
     *         to encrypt your output models with Amazon S3 server-side encryption after compilation job. If you don't
     *         provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/UsingKMSEncryption.html">KMS-Managed
     *         Encryption Keys</a> in the <i>Amazon Simple Storage Service Developer Guide.</i> </p>
     *         <p>
     *         The KmsKeyId can be any of the following formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN: <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias name: <code>alias/ExampleAlias</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias name ARN: <code>arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias</code>
     *         </p>
     *         </li>
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service key (Amazon Web Services KMS) that Amazon SageMaker uses to
     * encrypt your output models with Amazon S3 server-side encryption after compilation job. If you don't provide a
     * KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/UsingKMSEncryption.html">KMS-Managed Encryption
     * Keys</a> in the <i>Amazon Simple Storage Service Developer Guide.</i>
     * </p>
     * <p>
     * The KmsKeyId can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name ARN: <code>arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services Key Management Service key (Amazon Web Services KMS) that Amazon SageMaker uses to
     *        encrypt your output models with Amazon S3 server-side encryption after compilation job. If you don't
     *        provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/UsingKMSEncryption.html">KMS-Managed
     *        Encryption Keys</a> in the <i>Amazon Simple Storage Service Developer Guide.</i> </p>
     *        <p>
     *        The KmsKeyId can be any of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name: <code>alias/ExampleAlias</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name ARN: <code>arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputConfig withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getS3OutputLocation() != null)
            sb.append("S3OutputLocation: ").append(getS3OutputLocation()).append(",");
        if (getTargetDevice() != null)
            sb.append("TargetDevice: ").append(getTargetDevice()).append(",");
        if (getTargetPlatform() != null)
            sb.append("TargetPlatform: ").append(getTargetPlatform()).append(",");
        if (getCompilerOptions() != null)
            sb.append("CompilerOptions: ").append(getCompilerOptions()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputConfig == false)
            return false;
        OutputConfig other = (OutputConfig) obj;
        if (other.getS3OutputLocation() == null ^ this.getS3OutputLocation() == null)
            return false;
        if (other.getS3OutputLocation() != null && other.getS3OutputLocation().equals(this.getS3OutputLocation()) == false)
            return false;
        if (other.getTargetDevice() == null ^ this.getTargetDevice() == null)
            return false;
        if (other.getTargetDevice() != null && other.getTargetDevice().equals(this.getTargetDevice()) == false)
            return false;
        if (other.getTargetPlatform() == null ^ this.getTargetPlatform() == null)
            return false;
        if (other.getTargetPlatform() != null && other.getTargetPlatform().equals(this.getTargetPlatform()) == false)
            return false;
        if (other.getCompilerOptions() == null ^ this.getCompilerOptions() == null)
            return false;
        if (other.getCompilerOptions() != null && other.getCompilerOptions().equals(this.getCompilerOptions()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3OutputLocation() == null) ? 0 : getS3OutputLocation().hashCode());
        hashCode = prime * hashCode + ((getTargetDevice() == null) ? 0 : getTargetDevice().hashCode());
        hashCode = prime * hashCode + ((getTargetPlatform() == null) ? 0 : getTargetPlatform().hashCode());
        hashCode = prime * hashCode + ((getCompilerOptions() == null) ? 0 : getCompilerOptions().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public OutputConfig clone() {
        try {
            return (OutputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.OutputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
