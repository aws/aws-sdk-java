/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies the S3 location of ML model data to deploy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/S3ModelDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ModelDataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the S3 path of ML model data to deploy.
     * </p>
     */
    private String s3Uri;
    /**
     * <p>
     * Specifies the type of ML model data to deploy.
     * </p>
     * <p>
     * If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. SageMaker uses all objects
     * that match the specified key name prefix as part of the ML model data to deploy. A valid key name prefix
     * identified by <code>S3Uri</code> always ends with a forward slash (/).
     * </p>
     * <p>
     * If you choose <code>S3Object</code>, <code>S3Uri</code> identifies an object that is the ML model data to deploy.
     * </p>
     */
    private String s3DataType;
    /**
     * <p>
     * Specifies how the ML model data is prepared.
     * </p>
     * <p>
     * If you choose <code>Gzip</code> and choose <code>S3Object</code> as the value of <code>S3DataType</code>,
     * <code>S3Uri</code> identifies an object that is a gzip-compressed TAR archive. SageMaker will attempt to
     * decompress and untar the object during model deployment.
     * </p>
     * <p>
     * If you choose <code>None</code> and chooose <code>S3Object</code> as the value of <code>S3DataType</code>,
     * <code>S3Uri</code> identifies an object that represents an uncompressed ML model to deploy.
     * </p>
     * <p>
     * If you choose None and choose <code>S3Prefix</code> as the value of <code>S3DataType</code>, <code>S3Uri</code>
     * identifies a key name prefix, under which all objects represents the uncompressed ML model to deploy.
     * </p>
     * <p>
     * If you choose None, then SageMaker will follow rules below when creating model data files under /opt/ml/model
     * directory for use by your inference code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you choose <code>S3Object</code> as the value of <code>S3DataType</code>, then SageMaker will split the key of
     * the S3 object referenced by <code>S3Uri</code> by slash (/), and use the last part as the filename of the file
     * holding the content of the S3 object.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you choose <code>S3Prefix</code> as the value of <code>S3DataType</code>, then for each S3 object under the
     * key name pefix referenced by <code>S3Uri</code>, SageMaker will trim its key by the prefix, and use the remainder
     * as the path (relative to <code>/opt/ml/model</code>) of the file holding the content of the S3 object. SageMaker
     * will split the remainder by slash (/), using intermediate parts as directory names and the last part as filename
     * of the file holding the content of the S3 object.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use any of the following as file names or directory names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An empty or blank string
     * </p>
     * </li>
     * <li>
     * <p>
     * A string which contains null bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * A string longer than 255 bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * A single dot (<code>.</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * A double dot (<code>..</code>)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Ambiguous file names will result in model deployment failure. For example, if your uncompressed ML model consists
     * of two S3 objects <code>s3://mybucket/model/weights</code> and <code>s3://mybucket/model/weights/part1</code> and
     * you specify <code>s3://mybucket/model/</code> as the value of <code>S3Uri</code> and <code>S3Prefix</code> as the
     * value of <code>S3DataType</code>, then it will result in name clash between <code>/opt/ml/model/weights</code> (a
     * regular file) and <code>/opt/ml/model/weights/</code> (a directory).
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not organize the model artifacts in <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-folders.html">S3 console using folders</a>.
     * When you create a folder in S3 console, S3 creates a 0-byte object with a key set to the folder name you provide.
     * They key of the 0-byte object ends with a slash (/) which violates SageMaker restrictions on model artifact file
     * names, leading to model deployment failure.
     * </p>
     * </li>
     * </ul>
     */
    private String compressionType;
    /**
     * <p>
     * Specifies the access configuration file for the ML model. You can explicitly accept the model end-user license
     * agreement (EULA) within the <code>ModelAccessConfig</code>. You are responsible for reviewing and complying with
     * any applicable license terms and making sure they are acceptable for your use case before downloading or using a
     * model.
     * </p>
     */
    private ModelAccessConfig modelAccessConfig;

    /**
     * <p>
     * Specifies the S3 path of ML model data to deploy.
     * </p>
     * 
     * @param s3Uri
     *        Specifies the S3 path of ML model data to deploy.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * Specifies the S3 path of ML model data to deploy.
     * </p>
     * 
     * @return Specifies the S3 path of ML model data to deploy.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * Specifies the S3 path of ML model data to deploy.
     * </p>
     * 
     * @param s3Uri
     *        Specifies the S3 path of ML model data to deploy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ModelDataSource withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
        return this;
    }

    /**
     * <p>
     * Specifies the type of ML model data to deploy.
     * </p>
     * <p>
     * If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. SageMaker uses all objects
     * that match the specified key name prefix as part of the ML model data to deploy. A valid key name prefix
     * identified by <code>S3Uri</code> always ends with a forward slash (/).
     * </p>
     * <p>
     * If you choose <code>S3Object</code>, <code>S3Uri</code> identifies an object that is the ML model data to deploy.
     * </p>
     * 
     * @param s3DataType
     *        Specifies the type of ML model data to deploy.</p>
     *        <p>
     *        If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. SageMaker uses all
     *        objects that match the specified key name prefix as part of the ML model data to deploy. A valid key name
     *        prefix identified by <code>S3Uri</code> always ends with a forward slash (/).
     *        </p>
     *        <p>
     *        If you choose <code>S3Object</code>, <code>S3Uri</code> identifies an object that is the ML model data to
     *        deploy.
     * @see S3ModelDataType
     */

    public void setS3DataType(String s3DataType) {
        this.s3DataType = s3DataType;
    }

    /**
     * <p>
     * Specifies the type of ML model data to deploy.
     * </p>
     * <p>
     * If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. SageMaker uses all objects
     * that match the specified key name prefix as part of the ML model data to deploy. A valid key name prefix
     * identified by <code>S3Uri</code> always ends with a forward slash (/).
     * </p>
     * <p>
     * If you choose <code>S3Object</code>, <code>S3Uri</code> identifies an object that is the ML model data to deploy.
     * </p>
     * 
     * @return Specifies the type of ML model data to deploy.</p>
     *         <p>
     *         If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. SageMaker uses all
     *         objects that match the specified key name prefix as part of the ML model data to deploy. A valid key name
     *         prefix identified by <code>S3Uri</code> always ends with a forward slash (/).
     *         </p>
     *         <p>
     *         If you choose <code>S3Object</code>, <code>S3Uri</code> identifies an object that is the ML model data to
     *         deploy.
     * @see S3ModelDataType
     */

    public String getS3DataType() {
        return this.s3DataType;
    }

    /**
     * <p>
     * Specifies the type of ML model data to deploy.
     * </p>
     * <p>
     * If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. SageMaker uses all objects
     * that match the specified key name prefix as part of the ML model data to deploy. A valid key name prefix
     * identified by <code>S3Uri</code> always ends with a forward slash (/).
     * </p>
     * <p>
     * If you choose <code>S3Object</code>, <code>S3Uri</code> identifies an object that is the ML model data to deploy.
     * </p>
     * 
     * @param s3DataType
     *        Specifies the type of ML model data to deploy.</p>
     *        <p>
     *        If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. SageMaker uses all
     *        objects that match the specified key name prefix as part of the ML model data to deploy. A valid key name
     *        prefix identified by <code>S3Uri</code> always ends with a forward slash (/).
     *        </p>
     *        <p>
     *        If you choose <code>S3Object</code>, <code>S3Uri</code> identifies an object that is the ML model data to
     *        deploy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3ModelDataType
     */

    public S3ModelDataSource withS3DataType(String s3DataType) {
        setS3DataType(s3DataType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of ML model data to deploy.
     * </p>
     * <p>
     * If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. SageMaker uses all objects
     * that match the specified key name prefix as part of the ML model data to deploy. A valid key name prefix
     * identified by <code>S3Uri</code> always ends with a forward slash (/).
     * </p>
     * <p>
     * If you choose <code>S3Object</code>, <code>S3Uri</code> identifies an object that is the ML model data to deploy.
     * </p>
     * 
     * @param s3DataType
     *        Specifies the type of ML model data to deploy.</p>
     *        <p>
     *        If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. SageMaker uses all
     *        objects that match the specified key name prefix as part of the ML model data to deploy. A valid key name
     *        prefix identified by <code>S3Uri</code> always ends with a forward slash (/).
     *        </p>
     *        <p>
     *        If you choose <code>S3Object</code>, <code>S3Uri</code> identifies an object that is the ML model data to
     *        deploy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3ModelDataType
     */

    public S3ModelDataSource withS3DataType(S3ModelDataType s3DataType) {
        this.s3DataType = s3DataType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies how the ML model data is prepared.
     * </p>
     * <p>
     * If you choose <code>Gzip</code> and choose <code>S3Object</code> as the value of <code>S3DataType</code>,
     * <code>S3Uri</code> identifies an object that is a gzip-compressed TAR archive. SageMaker will attempt to
     * decompress and untar the object during model deployment.
     * </p>
     * <p>
     * If you choose <code>None</code> and chooose <code>S3Object</code> as the value of <code>S3DataType</code>,
     * <code>S3Uri</code> identifies an object that represents an uncompressed ML model to deploy.
     * </p>
     * <p>
     * If you choose None and choose <code>S3Prefix</code> as the value of <code>S3DataType</code>, <code>S3Uri</code>
     * identifies a key name prefix, under which all objects represents the uncompressed ML model to deploy.
     * </p>
     * <p>
     * If you choose None, then SageMaker will follow rules below when creating model data files under /opt/ml/model
     * directory for use by your inference code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you choose <code>S3Object</code> as the value of <code>S3DataType</code>, then SageMaker will split the key of
     * the S3 object referenced by <code>S3Uri</code> by slash (/), and use the last part as the filename of the file
     * holding the content of the S3 object.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you choose <code>S3Prefix</code> as the value of <code>S3DataType</code>, then for each S3 object under the
     * key name pefix referenced by <code>S3Uri</code>, SageMaker will trim its key by the prefix, and use the remainder
     * as the path (relative to <code>/opt/ml/model</code>) of the file holding the content of the S3 object. SageMaker
     * will split the remainder by slash (/), using intermediate parts as directory names and the last part as filename
     * of the file holding the content of the S3 object.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use any of the following as file names or directory names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An empty or blank string
     * </p>
     * </li>
     * <li>
     * <p>
     * A string which contains null bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * A string longer than 255 bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * A single dot (<code>.</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * A double dot (<code>..</code>)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Ambiguous file names will result in model deployment failure. For example, if your uncompressed ML model consists
     * of two S3 objects <code>s3://mybucket/model/weights</code> and <code>s3://mybucket/model/weights/part1</code> and
     * you specify <code>s3://mybucket/model/</code> as the value of <code>S3Uri</code> and <code>S3Prefix</code> as the
     * value of <code>S3DataType</code>, then it will result in name clash between <code>/opt/ml/model/weights</code> (a
     * regular file) and <code>/opt/ml/model/weights/</code> (a directory).
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not organize the model artifacts in <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-folders.html">S3 console using folders</a>.
     * When you create a folder in S3 console, S3 creates a 0-byte object with a key set to the folder name you provide.
     * They key of the 0-byte object ends with a slash (/) which violates SageMaker restrictions on model artifact file
     * names, leading to model deployment failure.
     * </p>
     * </li>
     * </ul>
     * 
     * @param compressionType
     *        Specifies how the ML model data is prepared.</p>
     *        <p>
     *        If you choose <code>Gzip</code> and choose <code>S3Object</code> as the value of <code>S3DataType</code>,
     *        <code>S3Uri</code> identifies an object that is a gzip-compressed TAR archive. SageMaker will attempt to
     *        decompress and untar the object during model deployment.
     *        </p>
     *        <p>
     *        If you choose <code>None</code> and chooose <code>S3Object</code> as the value of <code>S3DataType</code>,
     *        <code>S3Uri</code> identifies an object that represents an uncompressed ML model to deploy.
     *        </p>
     *        <p>
     *        If you choose None and choose <code>S3Prefix</code> as the value of <code>S3DataType</code>,
     *        <code>S3Uri</code> identifies a key name prefix, under which all objects represents the uncompressed ML
     *        model to deploy.
     *        </p>
     *        <p>
     *        If you choose None, then SageMaker will follow rules below when creating model data files under
     *        /opt/ml/model directory for use by your inference code:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you choose <code>S3Object</code> as the value of <code>S3DataType</code>, then SageMaker will split the
     *        key of the S3 object referenced by <code>S3Uri</code> by slash (/), and use the last part as the filename
     *        of the file holding the content of the S3 object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you choose <code>S3Prefix</code> as the value of <code>S3DataType</code>, then for each S3 object under
     *        the key name pefix referenced by <code>S3Uri</code>, SageMaker will trim its key by the prefix, and use
     *        the remainder as the path (relative to <code>/opt/ml/model</code>) of the file holding the content of the
     *        S3 object. SageMaker will split the remainder by slash (/), using intermediate parts as directory names
     *        and the last part as filename of the file holding the content of the S3 object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use any of the following as file names or directory names:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An empty or blank string
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A string which contains null bytes
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A string longer than 255 bytes
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A single dot (<code>.</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A double dot (<code>..</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Ambiguous file names will result in model deployment failure. For example, if your uncompressed ML model
     *        consists of two S3 objects <code>s3://mybucket/model/weights</code> and
     *        <code>s3://mybucket/model/weights/part1</code> and you specify <code>s3://mybucket/model/</code> as the
     *        value of <code>S3Uri</code> and <code>S3Prefix</code> as the value of <code>S3DataType</code>, then it
     *        will result in name clash between <code>/opt/ml/model/weights</code> (a regular file) and
     *        <code>/opt/ml/model/weights/</code> (a directory).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not organize the model artifacts in <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-folders.html">S3 console using
     *        folders</a>. When you create a folder in S3 console, S3 creates a 0-byte object with a key set to the
     *        folder name you provide. They key of the 0-byte object ends with a slash (/) which violates SageMaker
     *        restrictions on model artifact file names, leading to model deployment failure.
     *        </p>
     *        </li>
     * @see ModelCompressionType
     */

    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }

    /**
     * <p>
     * Specifies how the ML model data is prepared.
     * </p>
     * <p>
     * If you choose <code>Gzip</code> and choose <code>S3Object</code> as the value of <code>S3DataType</code>,
     * <code>S3Uri</code> identifies an object that is a gzip-compressed TAR archive. SageMaker will attempt to
     * decompress and untar the object during model deployment.
     * </p>
     * <p>
     * If you choose <code>None</code> and chooose <code>S3Object</code> as the value of <code>S3DataType</code>,
     * <code>S3Uri</code> identifies an object that represents an uncompressed ML model to deploy.
     * </p>
     * <p>
     * If you choose None and choose <code>S3Prefix</code> as the value of <code>S3DataType</code>, <code>S3Uri</code>
     * identifies a key name prefix, under which all objects represents the uncompressed ML model to deploy.
     * </p>
     * <p>
     * If you choose None, then SageMaker will follow rules below when creating model data files under /opt/ml/model
     * directory for use by your inference code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you choose <code>S3Object</code> as the value of <code>S3DataType</code>, then SageMaker will split the key of
     * the S3 object referenced by <code>S3Uri</code> by slash (/), and use the last part as the filename of the file
     * holding the content of the S3 object.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you choose <code>S3Prefix</code> as the value of <code>S3DataType</code>, then for each S3 object under the
     * key name pefix referenced by <code>S3Uri</code>, SageMaker will trim its key by the prefix, and use the remainder
     * as the path (relative to <code>/opt/ml/model</code>) of the file holding the content of the S3 object. SageMaker
     * will split the remainder by slash (/), using intermediate parts as directory names and the last part as filename
     * of the file holding the content of the S3 object.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use any of the following as file names or directory names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An empty or blank string
     * </p>
     * </li>
     * <li>
     * <p>
     * A string which contains null bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * A string longer than 255 bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * A single dot (<code>.</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * A double dot (<code>..</code>)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Ambiguous file names will result in model deployment failure. For example, if your uncompressed ML model consists
     * of two S3 objects <code>s3://mybucket/model/weights</code> and <code>s3://mybucket/model/weights/part1</code> and
     * you specify <code>s3://mybucket/model/</code> as the value of <code>S3Uri</code> and <code>S3Prefix</code> as the
     * value of <code>S3DataType</code>, then it will result in name clash between <code>/opt/ml/model/weights</code> (a
     * regular file) and <code>/opt/ml/model/weights/</code> (a directory).
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not organize the model artifacts in <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-folders.html">S3 console using folders</a>.
     * When you create a folder in S3 console, S3 creates a 0-byte object with a key set to the folder name you provide.
     * They key of the 0-byte object ends with a slash (/) which violates SageMaker restrictions on model artifact file
     * names, leading to model deployment failure.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies how the ML model data is prepared.</p>
     *         <p>
     *         If you choose <code>Gzip</code> and choose <code>S3Object</code> as the value of <code>S3DataType</code>,
     *         <code>S3Uri</code> identifies an object that is a gzip-compressed TAR archive. SageMaker will attempt to
     *         decompress and untar the object during model deployment.
     *         </p>
     *         <p>
     *         If you choose <code>None</code> and chooose <code>S3Object</code> as the value of <code>S3DataType</code>, <code>S3Uri</code> identifies an object that represents an uncompressed ML model to deploy.
     *         </p>
     *         <p>
     *         If you choose None and choose <code>S3Prefix</code> as the value of <code>S3DataType</code>,
     *         <code>S3Uri</code> identifies a key name prefix, under which all objects represents the uncompressed ML
     *         model to deploy.
     *         </p>
     *         <p>
     *         If you choose None, then SageMaker will follow rules below when creating model data files under
     *         /opt/ml/model directory for use by your inference code:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you choose <code>S3Object</code> as the value of <code>S3DataType</code>, then SageMaker will split
     *         the key of the S3 object referenced by <code>S3Uri</code> by slash (/), and use the last part as the
     *         filename of the file holding the content of the S3 object.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you choose <code>S3Prefix</code> as the value of <code>S3DataType</code>, then for each S3 object
     *         under the key name pefix referenced by <code>S3Uri</code>, SageMaker will trim its key by the prefix, and
     *         use the remainder as the path (relative to <code>/opt/ml/model</code>) of the file holding the content of
     *         the S3 object. SageMaker will split the remainder by slash (/), using intermediate parts as directory
     *         names and the last part as filename of the file holding the content of the S3 object.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do not use any of the following as file names or directory names:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         An empty or blank string
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A string which contains null bytes
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A string longer than 255 bytes
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A single dot (<code>.</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A double dot (<code>..</code>)
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Ambiguous file names will result in model deployment failure. For example, if your uncompressed ML model
     *         consists of two S3 objects <code>s3://mybucket/model/weights</code> and
     *         <code>s3://mybucket/model/weights/part1</code> and you specify <code>s3://mybucket/model/</code> as the
     *         value of <code>S3Uri</code> and <code>S3Prefix</code> as the value of <code>S3DataType</code>, then it
     *         will result in name clash between <code>/opt/ml/model/weights</code> (a regular file) and
     *         <code>/opt/ml/model/weights/</code> (a directory).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do not organize the model artifacts in <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-folders.html">S3 console using
     *         folders</a>. When you create a folder in S3 console, S3 creates a 0-byte object with a key set to the
     *         folder name you provide. They key of the 0-byte object ends with a slash (/) which violates SageMaker
     *         restrictions on model artifact file names, leading to model deployment failure.
     *         </p>
     *         </li>
     * @see ModelCompressionType
     */

    public String getCompressionType() {
        return this.compressionType;
    }

    /**
     * <p>
     * Specifies how the ML model data is prepared.
     * </p>
     * <p>
     * If you choose <code>Gzip</code> and choose <code>S3Object</code> as the value of <code>S3DataType</code>,
     * <code>S3Uri</code> identifies an object that is a gzip-compressed TAR archive. SageMaker will attempt to
     * decompress and untar the object during model deployment.
     * </p>
     * <p>
     * If you choose <code>None</code> and chooose <code>S3Object</code> as the value of <code>S3DataType</code>,
     * <code>S3Uri</code> identifies an object that represents an uncompressed ML model to deploy.
     * </p>
     * <p>
     * If you choose None and choose <code>S3Prefix</code> as the value of <code>S3DataType</code>, <code>S3Uri</code>
     * identifies a key name prefix, under which all objects represents the uncompressed ML model to deploy.
     * </p>
     * <p>
     * If you choose None, then SageMaker will follow rules below when creating model data files under /opt/ml/model
     * directory for use by your inference code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you choose <code>S3Object</code> as the value of <code>S3DataType</code>, then SageMaker will split the key of
     * the S3 object referenced by <code>S3Uri</code> by slash (/), and use the last part as the filename of the file
     * holding the content of the S3 object.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you choose <code>S3Prefix</code> as the value of <code>S3DataType</code>, then for each S3 object under the
     * key name pefix referenced by <code>S3Uri</code>, SageMaker will trim its key by the prefix, and use the remainder
     * as the path (relative to <code>/opt/ml/model</code>) of the file holding the content of the S3 object. SageMaker
     * will split the remainder by slash (/), using intermediate parts as directory names and the last part as filename
     * of the file holding the content of the S3 object.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use any of the following as file names or directory names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An empty or blank string
     * </p>
     * </li>
     * <li>
     * <p>
     * A string which contains null bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * A string longer than 255 bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * A single dot (<code>.</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * A double dot (<code>..</code>)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Ambiguous file names will result in model deployment failure. For example, if your uncompressed ML model consists
     * of two S3 objects <code>s3://mybucket/model/weights</code> and <code>s3://mybucket/model/weights/part1</code> and
     * you specify <code>s3://mybucket/model/</code> as the value of <code>S3Uri</code> and <code>S3Prefix</code> as the
     * value of <code>S3DataType</code>, then it will result in name clash between <code>/opt/ml/model/weights</code> (a
     * regular file) and <code>/opt/ml/model/weights/</code> (a directory).
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not organize the model artifacts in <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-folders.html">S3 console using folders</a>.
     * When you create a folder in S3 console, S3 creates a 0-byte object with a key set to the folder name you provide.
     * They key of the 0-byte object ends with a slash (/) which violates SageMaker restrictions on model artifact file
     * names, leading to model deployment failure.
     * </p>
     * </li>
     * </ul>
     * 
     * @param compressionType
     *        Specifies how the ML model data is prepared.</p>
     *        <p>
     *        If you choose <code>Gzip</code> and choose <code>S3Object</code> as the value of <code>S3DataType</code>,
     *        <code>S3Uri</code> identifies an object that is a gzip-compressed TAR archive. SageMaker will attempt to
     *        decompress and untar the object during model deployment.
     *        </p>
     *        <p>
     *        If you choose <code>None</code> and chooose <code>S3Object</code> as the value of <code>S3DataType</code>,
     *        <code>S3Uri</code> identifies an object that represents an uncompressed ML model to deploy.
     *        </p>
     *        <p>
     *        If you choose None and choose <code>S3Prefix</code> as the value of <code>S3DataType</code>,
     *        <code>S3Uri</code> identifies a key name prefix, under which all objects represents the uncompressed ML
     *        model to deploy.
     *        </p>
     *        <p>
     *        If you choose None, then SageMaker will follow rules below when creating model data files under
     *        /opt/ml/model directory for use by your inference code:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you choose <code>S3Object</code> as the value of <code>S3DataType</code>, then SageMaker will split the
     *        key of the S3 object referenced by <code>S3Uri</code> by slash (/), and use the last part as the filename
     *        of the file holding the content of the S3 object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you choose <code>S3Prefix</code> as the value of <code>S3DataType</code>, then for each S3 object under
     *        the key name pefix referenced by <code>S3Uri</code>, SageMaker will trim its key by the prefix, and use
     *        the remainder as the path (relative to <code>/opt/ml/model</code>) of the file holding the content of the
     *        S3 object. SageMaker will split the remainder by slash (/), using intermediate parts as directory names
     *        and the last part as filename of the file holding the content of the S3 object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use any of the following as file names or directory names:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An empty or blank string
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A string which contains null bytes
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A string longer than 255 bytes
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A single dot (<code>.</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A double dot (<code>..</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Ambiguous file names will result in model deployment failure. For example, if your uncompressed ML model
     *        consists of two S3 objects <code>s3://mybucket/model/weights</code> and
     *        <code>s3://mybucket/model/weights/part1</code> and you specify <code>s3://mybucket/model/</code> as the
     *        value of <code>S3Uri</code> and <code>S3Prefix</code> as the value of <code>S3DataType</code>, then it
     *        will result in name clash between <code>/opt/ml/model/weights</code> (a regular file) and
     *        <code>/opt/ml/model/weights/</code> (a directory).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not organize the model artifacts in <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-folders.html">S3 console using
     *        folders</a>. When you create a folder in S3 console, S3 creates a 0-byte object with a key set to the
     *        folder name you provide. They key of the 0-byte object ends with a slash (/) which violates SageMaker
     *        restrictions on model artifact file names, leading to model deployment failure.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCompressionType
     */

    public S3ModelDataSource withCompressionType(String compressionType) {
        setCompressionType(compressionType);
        return this;
    }

    /**
     * <p>
     * Specifies how the ML model data is prepared.
     * </p>
     * <p>
     * If you choose <code>Gzip</code> and choose <code>S3Object</code> as the value of <code>S3DataType</code>,
     * <code>S3Uri</code> identifies an object that is a gzip-compressed TAR archive. SageMaker will attempt to
     * decompress and untar the object during model deployment.
     * </p>
     * <p>
     * If you choose <code>None</code> and chooose <code>S3Object</code> as the value of <code>S3DataType</code>,
     * <code>S3Uri</code> identifies an object that represents an uncompressed ML model to deploy.
     * </p>
     * <p>
     * If you choose None and choose <code>S3Prefix</code> as the value of <code>S3DataType</code>, <code>S3Uri</code>
     * identifies a key name prefix, under which all objects represents the uncompressed ML model to deploy.
     * </p>
     * <p>
     * If you choose None, then SageMaker will follow rules below when creating model data files under /opt/ml/model
     * directory for use by your inference code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you choose <code>S3Object</code> as the value of <code>S3DataType</code>, then SageMaker will split the key of
     * the S3 object referenced by <code>S3Uri</code> by slash (/), and use the last part as the filename of the file
     * holding the content of the S3 object.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you choose <code>S3Prefix</code> as the value of <code>S3DataType</code>, then for each S3 object under the
     * key name pefix referenced by <code>S3Uri</code>, SageMaker will trim its key by the prefix, and use the remainder
     * as the path (relative to <code>/opt/ml/model</code>) of the file holding the content of the S3 object. SageMaker
     * will split the remainder by slash (/), using intermediate parts as directory names and the last part as filename
     * of the file holding the content of the S3 object.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use any of the following as file names or directory names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An empty or blank string
     * </p>
     * </li>
     * <li>
     * <p>
     * A string which contains null bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * A string longer than 255 bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * A single dot (<code>.</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * A double dot (<code>..</code>)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Ambiguous file names will result in model deployment failure. For example, if your uncompressed ML model consists
     * of two S3 objects <code>s3://mybucket/model/weights</code> and <code>s3://mybucket/model/weights/part1</code> and
     * you specify <code>s3://mybucket/model/</code> as the value of <code>S3Uri</code> and <code>S3Prefix</code> as the
     * value of <code>S3DataType</code>, then it will result in name clash between <code>/opt/ml/model/weights</code> (a
     * regular file) and <code>/opt/ml/model/weights/</code> (a directory).
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not organize the model artifacts in <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-folders.html">S3 console using folders</a>.
     * When you create a folder in S3 console, S3 creates a 0-byte object with a key set to the folder name you provide.
     * They key of the 0-byte object ends with a slash (/) which violates SageMaker restrictions on model artifact file
     * names, leading to model deployment failure.
     * </p>
     * </li>
     * </ul>
     * 
     * @param compressionType
     *        Specifies how the ML model data is prepared.</p>
     *        <p>
     *        If you choose <code>Gzip</code> and choose <code>S3Object</code> as the value of <code>S3DataType</code>,
     *        <code>S3Uri</code> identifies an object that is a gzip-compressed TAR archive. SageMaker will attempt to
     *        decompress and untar the object during model deployment.
     *        </p>
     *        <p>
     *        If you choose <code>None</code> and chooose <code>S3Object</code> as the value of <code>S3DataType</code>,
     *        <code>S3Uri</code> identifies an object that represents an uncompressed ML model to deploy.
     *        </p>
     *        <p>
     *        If you choose None and choose <code>S3Prefix</code> as the value of <code>S3DataType</code>,
     *        <code>S3Uri</code> identifies a key name prefix, under which all objects represents the uncompressed ML
     *        model to deploy.
     *        </p>
     *        <p>
     *        If you choose None, then SageMaker will follow rules below when creating model data files under
     *        /opt/ml/model directory for use by your inference code:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you choose <code>S3Object</code> as the value of <code>S3DataType</code>, then SageMaker will split the
     *        key of the S3 object referenced by <code>S3Uri</code> by slash (/), and use the last part as the filename
     *        of the file holding the content of the S3 object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you choose <code>S3Prefix</code> as the value of <code>S3DataType</code>, then for each S3 object under
     *        the key name pefix referenced by <code>S3Uri</code>, SageMaker will trim its key by the prefix, and use
     *        the remainder as the path (relative to <code>/opt/ml/model</code>) of the file holding the content of the
     *        S3 object. SageMaker will split the remainder by slash (/), using intermediate parts as directory names
     *        and the last part as filename of the file holding the content of the S3 object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use any of the following as file names or directory names:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An empty or blank string
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A string which contains null bytes
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A string longer than 255 bytes
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A single dot (<code>.</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A double dot (<code>..</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Ambiguous file names will result in model deployment failure. For example, if your uncompressed ML model
     *        consists of two S3 objects <code>s3://mybucket/model/weights</code> and
     *        <code>s3://mybucket/model/weights/part1</code> and you specify <code>s3://mybucket/model/</code> as the
     *        value of <code>S3Uri</code> and <code>S3Prefix</code> as the value of <code>S3DataType</code>, then it
     *        will result in name clash between <code>/opt/ml/model/weights</code> (a regular file) and
     *        <code>/opt/ml/model/weights/</code> (a directory).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not organize the model artifacts in <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-folders.html">S3 console using
     *        folders</a>. When you create a folder in S3 console, S3 creates a 0-byte object with a key set to the
     *        folder name you provide. They key of the 0-byte object ends with a slash (/) which violates SageMaker
     *        restrictions on model artifact file names, leading to model deployment failure.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCompressionType
     */

    public S3ModelDataSource withCompressionType(ModelCompressionType compressionType) {
        this.compressionType = compressionType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the access configuration file for the ML model. You can explicitly accept the model end-user license
     * agreement (EULA) within the <code>ModelAccessConfig</code>. You are responsible for reviewing and complying with
     * any applicable license terms and making sure they are acceptable for your use case before downloading or using a
     * model.
     * </p>
     * 
     * @param modelAccessConfig
     *        Specifies the access configuration file for the ML model. You can explicitly accept the model end-user
     *        license agreement (EULA) within the <code>ModelAccessConfig</code>. You are responsible for reviewing and
     *        complying with any applicable license terms and making sure they are acceptable for your use case before
     *        downloading or using a model.
     */

    public void setModelAccessConfig(ModelAccessConfig modelAccessConfig) {
        this.modelAccessConfig = modelAccessConfig;
    }

    /**
     * <p>
     * Specifies the access configuration file for the ML model. You can explicitly accept the model end-user license
     * agreement (EULA) within the <code>ModelAccessConfig</code>. You are responsible for reviewing and complying with
     * any applicable license terms and making sure they are acceptable for your use case before downloading or using a
     * model.
     * </p>
     * 
     * @return Specifies the access configuration file for the ML model. You can explicitly accept the model end-user
     *         license agreement (EULA) within the <code>ModelAccessConfig</code>. You are responsible for reviewing and
     *         complying with any applicable license terms and making sure they are acceptable for your use case before
     *         downloading or using a model.
     */

    public ModelAccessConfig getModelAccessConfig() {
        return this.modelAccessConfig;
    }

    /**
     * <p>
     * Specifies the access configuration file for the ML model. You can explicitly accept the model end-user license
     * agreement (EULA) within the <code>ModelAccessConfig</code>. You are responsible for reviewing and complying with
     * any applicable license terms and making sure they are acceptable for your use case before downloading or using a
     * model.
     * </p>
     * 
     * @param modelAccessConfig
     *        Specifies the access configuration file for the ML model. You can explicitly accept the model end-user
     *        license agreement (EULA) within the <code>ModelAccessConfig</code>. You are responsible for reviewing and
     *        complying with any applicable license terms and making sure they are acceptable for your use case before
     *        downloading or using a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ModelDataSource withModelAccessConfig(ModelAccessConfig modelAccessConfig) {
        setModelAccessConfig(modelAccessConfig);
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
        if (getS3DataType() != null)
            sb.append("S3DataType: ").append(getS3DataType()).append(",");
        if (getCompressionType() != null)
            sb.append("CompressionType: ").append(getCompressionType()).append(",");
        if (getModelAccessConfig() != null)
            sb.append("ModelAccessConfig: ").append(getModelAccessConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ModelDataSource == false)
            return false;
        S3ModelDataSource other = (S3ModelDataSource) obj;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getS3DataType() == null ^ this.getS3DataType() == null)
            return false;
        if (other.getS3DataType() != null && other.getS3DataType().equals(this.getS3DataType()) == false)
            return false;
        if (other.getCompressionType() == null ^ this.getCompressionType() == null)
            return false;
        if (other.getCompressionType() != null && other.getCompressionType().equals(this.getCompressionType()) == false)
            return false;
        if (other.getModelAccessConfig() == null ^ this.getModelAccessConfig() == null)
            return false;
        if (other.getModelAccessConfig() != null && other.getModelAccessConfig().equals(this.getModelAccessConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getS3DataType() == null) ? 0 : getS3DataType().hashCode());
        hashCode = prime * hashCode + ((getCompressionType() == null) ? 0 : getCompressionType().hashCode());
        hashCode = prime * hashCode + ((getModelAccessConfig() == null) ? 0 : getModelAccessConfig().hashCode());
        return hashCode;
    }

    @Override
    public S3ModelDataSource clone() {
        try {
            return (S3ModelDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.S3ModelDataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
