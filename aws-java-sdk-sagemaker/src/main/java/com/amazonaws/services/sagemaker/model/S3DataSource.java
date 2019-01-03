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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the S3 data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/S3DataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3DataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses all
     * objects that match the specified key name prefix for model training.
     * </p>
     * <p>
     * If you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an object that is a manifest file
     * containing a list of object keys that you want Amazon SageMaker to use for model training.
     * </p>
     * <p>
     * If you choose <code>AugmentedManifestFile</code>, S3Uri identifies an object that is an augmented manifest file
     * in JSON lines format. This file contains the data you want to use for model training.
     * <code>AugmentedManifestFile</code> can only be used if the Channel's input mode is <code>Pipe</code>.
     * </p>
     */
    private String s3DataType;
    /**
     * <p>
     * Depending on the value specified for the <code>S3DataType</code>, identifies either a key name prefix or a
     * manifest. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A key name prefix might look like this: <code>s3://bucketname/exampleprefix</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A manifest might look like this: <code>s3://bucketname/example.manifest</code>
     * </p>
     * <p>
     * The manifest is an S3 object which is a JSON file with the following format:
     * </p>
     * <p>
     * <code>[</code>
     * </p>
     * <p>
     * <code> {"prefix": "s3://customer_bucket/some/prefix/"},</code>
     * </p>
     * <p>
     * <code> "relative/path/to/custdata-1",</code>
     * </p>
     * <p>
     * <code> "relative/path/custdata-2",</code>
     * </p>
     * <p>
     * <code> ...</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * The preceding JSON matches the following <code>s3Uris</code>:
     * </p>
     * <p>
     * <code>s3://customer_bucket/some/prefix/relative/path/to/custdata-1</code>
     * </p>
     * <p>
     * <code>s3://customer_bucket/some/prefix/relative/path/custdata-2</code>
     * </p>
     * <p>
     * <code>...</code>
     * </p>
     * <p>
     * The complete set of <code>s3uris</code> in this manifest is the input data for the channel for this datasource.
     * The object that each <code>s3uris</code> points to must be readable by the IAM role that Amazon SageMaker uses to
     * perform tasks on your behalf.
     * </p>
     * </li>
     * </ul>
     */
    private String s3Uri;
    /**
     * <p>
     * If you want Amazon SageMaker to replicate the entire dataset on each ML compute instance that is launched for
     * model training, specify <code>FullyReplicated</code>.
     * </p>
     * <p>
     * If you want Amazon SageMaker to replicate a subset of data on each ML compute instance that is launched for model
     * training, specify <code>ShardedByS3Key</code>. If there are <i>n</i> ML compute instances launched for a training
     * job, each instance gets approximately 1/<i>n</i> of the number of S3 objects. In this case, model training on
     * each machine uses only the subset of training data.
     * </p>
     * <p>
     * Don't choose more ML compute instances for training than available S3 objects. If you do, some nodes won't get
     * any data and you will pay for nodes that aren't getting any training data. This applies in both File and Pipe
     * modes. Keep this in mind when developing algorithms.
     * </p>
     * <p>
     * In distributed training, where you use multiple ML compute EC2 instances, you might choose
     * <code>ShardedByS3Key</code>. If the algorithm requires copying training data to the ML storage volume (when
     * <code>TrainingInputMode</code> is set to <code>File</code>), this copies 1/<i>n</i> of the number of objects.
     * </p>
     */
    private String s3DataDistributionType;
    /**
     * <p>
     * A list of one or more attribute names to use that are found in a specified augmented manifest file.
     * </p>
     */
    private java.util.List<String> attributeNames;

    /**
     * <p>
     * If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses all
     * objects that match the specified key name prefix for model training.
     * </p>
     * <p>
     * If you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an object that is a manifest file
     * containing a list of object keys that you want Amazon SageMaker to use for model training.
     * </p>
     * <p>
     * If you choose <code>AugmentedManifestFile</code>, S3Uri identifies an object that is an augmented manifest file
     * in JSON lines format. This file contains the data you want to use for model training.
     * <code>AugmentedManifestFile</code> can only be used if the Channel's input mode is <code>Pipe</code>.
     * </p>
     * 
     * @param s3DataType
     *        If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker
     *        uses all objects that match the specified key name prefix for model training. </p>
     *        <p>
     *        If you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an object that is a manifest file
     *        containing a list of object keys that you want Amazon SageMaker to use for model training.
     *        </p>
     *        <p>
     *        If you choose <code>AugmentedManifestFile</code>, S3Uri identifies an object that is an augmented manifest
     *        file in JSON lines format. This file contains the data you want to use for model training.
     *        <code>AugmentedManifestFile</code> can only be used if the Channel's input mode is <code>Pipe</code>.
     * @see S3DataType
     */

    public void setS3DataType(String s3DataType) {
        this.s3DataType = s3DataType;
    }

    /**
     * <p>
     * If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses all
     * objects that match the specified key name prefix for model training.
     * </p>
     * <p>
     * If you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an object that is a manifest file
     * containing a list of object keys that you want Amazon SageMaker to use for model training.
     * </p>
     * <p>
     * If you choose <code>AugmentedManifestFile</code>, S3Uri identifies an object that is an augmented manifest file
     * in JSON lines format. This file contains the data you want to use for model training.
     * <code>AugmentedManifestFile</code> can only be used if the Channel's input mode is <code>Pipe</code>.
     * </p>
     * 
     * @return If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker
     *         uses all objects that match the specified key name prefix for model training. </p>
     *         <p>
     *         If you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an object that is a manifest file
     *         containing a list of object keys that you want Amazon SageMaker to use for model training.
     *         </p>
     *         <p>
     *         If you choose <code>AugmentedManifestFile</code>, S3Uri identifies an object that is an augmented
     *         manifest file in JSON lines format. This file contains the data you want to use for model training.
     *         <code>AugmentedManifestFile</code> can only be used if the Channel's input mode is <code>Pipe</code>.
     * @see S3DataType
     */

    public String getS3DataType() {
        return this.s3DataType;
    }

    /**
     * <p>
     * If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses all
     * objects that match the specified key name prefix for model training.
     * </p>
     * <p>
     * If you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an object that is a manifest file
     * containing a list of object keys that you want Amazon SageMaker to use for model training.
     * </p>
     * <p>
     * If you choose <code>AugmentedManifestFile</code>, S3Uri identifies an object that is an augmented manifest file
     * in JSON lines format. This file contains the data you want to use for model training.
     * <code>AugmentedManifestFile</code> can only be used if the Channel's input mode is <code>Pipe</code>.
     * </p>
     * 
     * @param s3DataType
     *        If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker
     *        uses all objects that match the specified key name prefix for model training. </p>
     *        <p>
     *        If you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an object that is a manifest file
     *        containing a list of object keys that you want Amazon SageMaker to use for model training.
     *        </p>
     *        <p>
     *        If you choose <code>AugmentedManifestFile</code>, S3Uri identifies an object that is an augmented manifest
     *        file in JSON lines format. This file contains the data you want to use for model training.
     *        <code>AugmentedManifestFile</code> can only be used if the Channel's input mode is <code>Pipe</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3DataType
     */

    public S3DataSource withS3DataType(String s3DataType) {
        setS3DataType(s3DataType);
        return this;
    }

    /**
     * <p>
     * If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses all
     * objects that match the specified key name prefix for model training.
     * </p>
     * <p>
     * If you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an object that is a manifest file
     * containing a list of object keys that you want Amazon SageMaker to use for model training.
     * </p>
     * <p>
     * If you choose <code>AugmentedManifestFile</code>, S3Uri identifies an object that is an augmented manifest file
     * in JSON lines format. This file contains the data you want to use for model training.
     * <code>AugmentedManifestFile</code> can only be used if the Channel's input mode is <code>Pipe</code>.
     * </p>
     * 
     * @param s3DataType
     *        If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker
     *        uses all objects that match the specified key name prefix for model training. </p>
     *        <p>
     *        If you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an object that is a manifest file
     *        containing a list of object keys that you want Amazon SageMaker to use for model training.
     *        </p>
     *        <p>
     *        If you choose <code>AugmentedManifestFile</code>, S3Uri identifies an object that is an augmented manifest
     *        file in JSON lines format. This file contains the data you want to use for model training.
     *        <code>AugmentedManifestFile</code> can only be used if the Channel's input mode is <code>Pipe</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3DataType
     */

    public S3DataSource withS3DataType(S3DataType s3DataType) {
        this.s3DataType = s3DataType.toString();
        return this;
    }

    /**
     * <p>
     * Depending on the value specified for the <code>S3DataType</code>, identifies either a key name prefix or a
     * manifest. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A key name prefix might look like this: <code>s3://bucketname/exampleprefix</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A manifest might look like this: <code>s3://bucketname/example.manifest</code>
     * </p>
     * <p>
     * The manifest is an S3 object which is a JSON file with the following format:
     * </p>
     * <p>
     * <code>[</code>
     * </p>
     * <p>
     * <code> {"prefix": "s3://customer_bucket/some/prefix/"},</code>
     * </p>
     * <p>
     * <code> "relative/path/to/custdata-1",</code>
     * </p>
     * <p>
     * <code> "relative/path/custdata-2",</code>
     * </p>
     * <p>
     * <code> ...</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * The preceding JSON matches the following <code>s3Uris</code>:
     * </p>
     * <p>
     * <code>s3://customer_bucket/some/prefix/relative/path/to/custdata-1</code>
     * </p>
     * <p>
     * <code>s3://customer_bucket/some/prefix/relative/path/custdata-2</code>
     * </p>
     * <p>
     * <code>...</code>
     * </p>
     * <p>
     * The complete set of <code>s3uris</code> in this manifest is the input data for the channel for this datasource.
     * The object that each <code>s3uris</code> points to must be readable by the IAM role that Amazon SageMaker uses to
     * perform tasks on your behalf.
     * </p>
     * </li>
     * </ul>
     * 
     * @param s3Uri
     *        Depending on the value specified for the <code>S3DataType</code>, identifies either a key name prefix or a
     *        manifest. For example: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A key name prefix might look like this: <code>s3://bucketname/exampleprefix</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A manifest might look like this: <code>s3://bucketname/example.manifest</code>
     *        </p>
     *        <p>
     *        The manifest is an S3 object which is a JSON file with the following format:
     *        </p>
     *        <p>
     *        <code>[</code>
     *        </p>
     *        <p>
     *        <code> {"prefix": "s3://customer_bucket/some/prefix/"},</code>
     *        </p>
     *        <p>
     *        <code> "relative/path/to/custdata-1",</code>
     *        </p>
     *        <p>
     *        <code> "relative/path/custdata-2",</code>
     *        </p>
     *        <p>
     *        <code> ...</code>
     *        </p>
     *        <p>
     *        <code> ]</code>
     *        </p>
     *        <p>
     *        The preceding JSON matches the following <code>s3Uris</code>:
     *        </p>
     *        <p>
     *        <code>s3://customer_bucket/some/prefix/relative/path/to/custdata-1</code>
     *        </p>
     *        <p>
     *        <code>s3://customer_bucket/some/prefix/relative/path/custdata-2</code>
     *        </p>
     *        <p>
     *        <code>...</code>
     *        </p>
     *        <p>
     *        The complete set of <code>s3uris</code> in this manifest is the input data for the channel for this
     *        datasource. The object that each <code>s3uris</code> points to must be readable by the IAM role that
     *        Amazon SageMaker uses to perform tasks on your behalf.
     *        </p>
     *        </li>
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * Depending on the value specified for the <code>S3DataType</code>, identifies either a key name prefix or a
     * manifest. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A key name prefix might look like this: <code>s3://bucketname/exampleprefix</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A manifest might look like this: <code>s3://bucketname/example.manifest</code>
     * </p>
     * <p>
     * The manifest is an S3 object which is a JSON file with the following format:
     * </p>
     * <p>
     * <code>[</code>
     * </p>
     * <p>
     * <code> {"prefix": "s3://customer_bucket/some/prefix/"},</code>
     * </p>
     * <p>
     * <code> "relative/path/to/custdata-1",</code>
     * </p>
     * <p>
     * <code> "relative/path/custdata-2",</code>
     * </p>
     * <p>
     * <code> ...</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * The preceding JSON matches the following <code>s3Uris</code>:
     * </p>
     * <p>
     * <code>s3://customer_bucket/some/prefix/relative/path/to/custdata-1</code>
     * </p>
     * <p>
     * <code>s3://customer_bucket/some/prefix/relative/path/custdata-2</code>
     * </p>
     * <p>
     * <code>...</code>
     * </p>
     * <p>
     * The complete set of <code>s3uris</code> in this manifest is the input data for the channel for this datasource.
     * The object that each <code>s3uris</code> points to must be readable by the IAM role that Amazon SageMaker uses to
     * perform tasks on your behalf.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Depending on the value specified for the <code>S3DataType</code>, identifies either a key name prefix or
     *         a manifest. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A key name prefix might look like this: <code>s3://bucketname/exampleprefix</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A manifest might look like this: <code>s3://bucketname/example.manifest</code>
     *         </p>
     *         <p>
     *         The manifest is an S3 object which is a JSON file with the following format:
     *         </p>
     *         <p>
     *         <code>[</code>
     *         </p>
     *         <p>
     *         <code> {"prefix": "s3://customer_bucket/some/prefix/"},</code>
     *         </p>
     *         <p>
     *         <code> "relative/path/to/custdata-1",</code>
     *         </p>
     *         <p>
     *         <code> "relative/path/custdata-2",</code>
     *         </p>
     *         <p>
     *         <code> ...</code>
     *         </p>
     *         <p>
     *         <code> ]</code>
     *         </p>
     *         <p>
     *         The preceding JSON matches the following <code>s3Uris</code>:
     *         </p>
     *         <p>
     *         <code>s3://customer_bucket/some/prefix/relative/path/to/custdata-1</code>
     *         </p>
     *         <p>
     *         <code>s3://customer_bucket/some/prefix/relative/path/custdata-2</code>
     *         </p>
     *         <p>
     *         <code>...</code>
     *         </p>
     *         <p>
     *         The complete set of <code>s3uris</code> in this manifest is the input data for the channel for this
     *         datasource. The object that each <code>s3uris</code> points to must be readable by the IAM role that
     *         Amazon SageMaker uses to perform tasks on your behalf.
     *         </p>
     *         </li>
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * Depending on the value specified for the <code>S3DataType</code>, identifies either a key name prefix or a
     * manifest. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A key name prefix might look like this: <code>s3://bucketname/exampleprefix</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A manifest might look like this: <code>s3://bucketname/example.manifest</code>
     * </p>
     * <p>
     * The manifest is an S3 object which is a JSON file with the following format:
     * </p>
     * <p>
     * <code>[</code>
     * </p>
     * <p>
     * <code> {"prefix": "s3://customer_bucket/some/prefix/"},</code>
     * </p>
     * <p>
     * <code> "relative/path/to/custdata-1",</code>
     * </p>
     * <p>
     * <code> "relative/path/custdata-2",</code>
     * </p>
     * <p>
     * <code> ...</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * The preceding JSON matches the following <code>s3Uris</code>:
     * </p>
     * <p>
     * <code>s3://customer_bucket/some/prefix/relative/path/to/custdata-1</code>
     * </p>
     * <p>
     * <code>s3://customer_bucket/some/prefix/relative/path/custdata-2</code>
     * </p>
     * <p>
     * <code>...</code>
     * </p>
     * <p>
     * The complete set of <code>s3uris</code> in this manifest is the input data for the channel for this datasource.
     * The object that each <code>s3uris</code> points to must be readable by the IAM role that Amazon SageMaker uses to
     * perform tasks on your behalf.
     * </p>
     * </li>
     * </ul>
     * 
     * @param s3Uri
     *        Depending on the value specified for the <code>S3DataType</code>, identifies either a key name prefix or a
     *        manifest. For example: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A key name prefix might look like this: <code>s3://bucketname/exampleprefix</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A manifest might look like this: <code>s3://bucketname/example.manifest</code>
     *        </p>
     *        <p>
     *        The manifest is an S3 object which is a JSON file with the following format:
     *        </p>
     *        <p>
     *        <code>[</code>
     *        </p>
     *        <p>
     *        <code> {"prefix": "s3://customer_bucket/some/prefix/"},</code>
     *        </p>
     *        <p>
     *        <code> "relative/path/to/custdata-1",</code>
     *        </p>
     *        <p>
     *        <code> "relative/path/custdata-2",</code>
     *        </p>
     *        <p>
     *        <code> ...</code>
     *        </p>
     *        <p>
     *        <code> ]</code>
     *        </p>
     *        <p>
     *        The preceding JSON matches the following <code>s3Uris</code>:
     *        </p>
     *        <p>
     *        <code>s3://customer_bucket/some/prefix/relative/path/to/custdata-1</code>
     *        </p>
     *        <p>
     *        <code>s3://customer_bucket/some/prefix/relative/path/custdata-2</code>
     *        </p>
     *        <p>
     *        <code>...</code>
     *        </p>
     *        <p>
     *        The complete set of <code>s3uris</code> in this manifest is the input data for the channel for this
     *        datasource. The object that each <code>s3uris</code> points to must be readable by the IAM role that
     *        Amazon SageMaker uses to perform tasks on your behalf.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataSource withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
        return this;
    }

    /**
     * <p>
     * If you want Amazon SageMaker to replicate the entire dataset on each ML compute instance that is launched for
     * model training, specify <code>FullyReplicated</code>.
     * </p>
     * <p>
     * If you want Amazon SageMaker to replicate a subset of data on each ML compute instance that is launched for model
     * training, specify <code>ShardedByS3Key</code>. If there are <i>n</i> ML compute instances launched for a training
     * job, each instance gets approximately 1/<i>n</i> of the number of S3 objects. In this case, model training on
     * each machine uses only the subset of training data.
     * </p>
     * <p>
     * Don't choose more ML compute instances for training than available S3 objects. If you do, some nodes won't get
     * any data and you will pay for nodes that aren't getting any training data. This applies in both File and Pipe
     * modes. Keep this in mind when developing algorithms.
     * </p>
     * <p>
     * In distributed training, where you use multiple ML compute EC2 instances, you might choose
     * <code>ShardedByS3Key</code>. If the algorithm requires copying training data to the ML storage volume (when
     * <code>TrainingInputMode</code> is set to <code>File</code>), this copies 1/<i>n</i> of the number of objects.
     * </p>
     * 
     * @param s3DataDistributionType
     *        If you want Amazon SageMaker to replicate the entire dataset on each ML compute instance that is launched
     *        for model training, specify <code>FullyReplicated</code>. </p>
     *        <p>
     *        If you want Amazon SageMaker to replicate a subset of data on each ML compute instance that is launched
     *        for model training, specify <code>ShardedByS3Key</code>. If there are <i>n</i> ML compute instances
     *        launched for a training job, each instance gets approximately 1/<i>n</i> of the number of S3 objects. In
     *        this case, model training on each machine uses only the subset of training data.
     *        </p>
     *        <p>
     *        Don't choose more ML compute instances for training than available S3 objects. If you do, some nodes won't
     *        get any data and you will pay for nodes that aren't getting any training data. This applies in both File
     *        and Pipe modes. Keep this in mind when developing algorithms.
     *        </p>
     *        <p>
     *        In distributed training, where you use multiple ML compute EC2 instances, you might choose
     *        <code>ShardedByS3Key</code>. If the algorithm requires copying training data to the ML storage volume
     *        (when <code>TrainingInputMode</code> is set to <code>File</code>), this copies 1/<i>n</i> of the number of
     *        objects.
     * @see S3DataDistribution
     */

    public void setS3DataDistributionType(String s3DataDistributionType) {
        this.s3DataDistributionType = s3DataDistributionType;
    }

    /**
     * <p>
     * If you want Amazon SageMaker to replicate the entire dataset on each ML compute instance that is launched for
     * model training, specify <code>FullyReplicated</code>.
     * </p>
     * <p>
     * If you want Amazon SageMaker to replicate a subset of data on each ML compute instance that is launched for model
     * training, specify <code>ShardedByS3Key</code>. If there are <i>n</i> ML compute instances launched for a training
     * job, each instance gets approximately 1/<i>n</i> of the number of S3 objects. In this case, model training on
     * each machine uses only the subset of training data.
     * </p>
     * <p>
     * Don't choose more ML compute instances for training than available S3 objects. If you do, some nodes won't get
     * any data and you will pay for nodes that aren't getting any training data. This applies in both File and Pipe
     * modes. Keep this in mind when developing algorithms.
     * </p>
     * <p>
     * In distributed training, where you use multiple ML compute EC2 instances, you might choose
     * <code>ShardedByS3Key</code>. If the algorithm requires copying training data to the ML storage volume (when
     * <code>TrainingInputMode</code> is set to <code>File</code>), this copies 1/<i>n</i> of the number of objects.
     * </p>
     * 
     * @return If you want Amazon SageMaker to replicate the entire dataset on each ML compute instance that is launched
     *         for model training, specify <code>FullyReplicated</code>. </p>
     *         <p>
     *         If you want Amazon SageMaker to replicate a subset of data on each ML compute instance that is launched
     *         for model training, specify <code>ShardedByS3Key</code>. If there are <i>n</i> ML compute instances
     *         launched for a training job, each instance gets approximately 1/<i>n</i> of the number of S3 objects. In
     *         this case, model training on each machine uses only the subset of training data.
     *         </p>
     *         <p>
     *         Don't choose more ML compute instances for training than available S3 objects. If you do, some nodes
     *         won't get any data and you will pay for nodes that aren't getting any training data. This applies in both
     *         File and Pipe modes. Keep this in mind when developing algorithms.
     *         </p>
     *         <p>
     *         In distributed training, where you use multiple ML compute EC2 instances, you might choose
     *         <code>ShardedByS3Key</code>. If the algorithm requires copying training data to the ML storage volume
     *         (when <code>TrainingInputMode</code> is set to <code>File</code>), this copies 1/<i>n</i> of the number
     *         of objects.
     * @see S3DataDistribution
     */

    public String getS3DataDistributionType() {
        return this.s3DataDistributionType;
    }

    /**
     * <p>
     * If you want Amazon SageMaker to replicate the entire dataset on each ML compute instance that is launched for
     * model training, specify <code>FullyReplicated</code>.
     * </p>
     * <p>
     * If you want Amazon SageMaker to replicate a subset of data on each ML compute instance that is launched for model
     * training, specify <code>ShardedByS3Key</code>. If there are <i>n</i> ML compute instances launched for a training
     * job, each instance gets approximately 1/<i>n</i> of the number of S3 objects. In this case, model training on
     * each machine uses only the subset of training data.
     * </p>
     * <p>
     * Don't choose more ML compute instances for training than available S3 objects. If you do, some nodes won't get
     * any data and you will pay for nodes that aren't getting any training data. This applies in both File and Pipe
     * modes. Keep this in mind when developing algorithms.
     * </p>
     * <p>
     * In distributed training, where you use multiple ML compute EC2 instances, you might choose
     * <code>ShardedByS3Key</code>. If the algorithm requires copying training data to the ML storage volume (when
     * <code>TrainingInputMode</code> is set to <code>File</code>), this copies 1/<i>n</i> of the number of objects.
     * </p>
     * 
     * @param s3DataDistributionType
     *        If you want Amazon SageMaker to replicate the entire dataset on each ML compute instance that is launched
     *        for model training, specify <code>FullyReplicated</code>. </p>
     *        <p>
     *        If you want Amazon SageMaker to replicate a subset of data on each ML compute instance that is launched
     *        for model training, specify <code>ShardedByS3Key</code>. If there are <i>n</i> ML compute instances
     *        launched for a training job, each instance gets approximately 1/<i>n</i> of the number of S3 objects. In
     *        this case, model training on each machine uses only the subset of training data.
     *        </p>
     *        <p>
     *        Don't choose more ML compute instances for training than available S3 objects. If you do, some nodes won't
     *        get any data and you will pay for nodes that aren't getting any training data. This applies in both File
     *        and Pipe modes. Keep this in mind when developing algorithms.
     *        </p>
     *        <p>
     *        In distributed training, where you use multiple ML compute EC2 instances, you might choose
     *        <code>ShardedByS3Key</code>. If the algorithm requires copying training data to the ML storage volume
     *        (when <code>TrainingInputMode</code> is set to <code>File</code>), this copies 1/<i>n</i> of the number of
     *        objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3DataDistribution
     */

    public S3DataSource withS3DataDistributionType(String s3DataDistributionType) {
        setS3DataDistributionType(s3DataDistributionType);
        return this;
    }

    /**
     * <p>
     * If you want Amazon SageMaker to replicate the entire dataset on each ML compute instance that is launched for
     * model training, specify <code>FullyReplicated</code>.
     * </p>
     * <p>
     * If you want Amazon SageMaker to replicate a subset of data on each ML compute instance that is launched for model
     * training, specify <code>ShardedByS3Key</code>. If there are <i>n</i> ML compute instances launched for a training
     * job, each instance gets approximately 1/<i>n</i> of the number of S3 objects. In this case, model training on
     * each machine uses only the subset of training data.
     * </p>
     * <p>
     * Don't choose more ML compute instances for training than available S3 objects. If you do, some nodes won't get
     * any data and you will pay for nodes that aren't getting any training data. This applies in both File and Pipe
     * modes. Keep this in mind when developing algorithms.
     * </p>
     * <p>
     * In distributed training, where you use multiple ML compute EC2 instances, you might choose
     * <code>ShardedByS3Key</code>. If the algorithm requires copying training data to the ML storage volume (when
     * <code>TrainingInputMode</code> is set to <code>File</code>), this copies 1/<i>n</i> of the number of objects.
     * </p>
     * 
     * @param s3DataDistributionType
     *        If you want Amazon SageMaker to replicate the entire dataset on each ML compute instance that is launched
     *        for model training, specify <code>FullyReplicated</code>. </p>
     *        <p>
     *        If you want Amazon SageMaker to replicate a subset of data on each ML compute instance that is launched
     *        for model training, specify <code>ShardedByS3Key</code>. If there are <i>n</i> ML compute instances
     *        launched for a training job, each instance gets approximately 1/<i>n</i> of the number of S3 objects. In
     *        this case, model training on each machine uses only the subset of training data.
     *        </p>
     *        <p>
     *        Don't choose more ML compute instances for training than available S3 objects. If you do, some nodes won't
     *        get any data and you will pay for nodes that aren't getting any training data. This applies in both File
     *        and Pipe modes. Keep this in mind when developing algorithms.
     *        </p>
     *        <p>
     *        In distributed training, where you use multiple ML compute EC2 instances, you might choose
     *        <code>ShardedByS3Key</code>. If the algorithm requires copying training data to the ML storage volume
     *        (when <code>TrainingInputMode</code> is set to <code>File</code>), this copies 1/<i>n</i> of the number of
     *        objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3DataDistribution
     */

    public S3DataSource withS3DataDistributionType(S3DataDistribution s3DataDistributionType) {
        this.s3DataDistributionType = s3DataDistributionType.toString();
        return this;
    }

    /**
     * <p>
     * A list of one or more attribute names to use that are found in a specified augmented manifest file.
     * </p>
     * 
     * @return A list of one or more attribute names to use that are found in a specified augmented manifest file.
     */

    public java.util.List<String> getAttributeNames() {
        return attributeNames;
    }

    /**
     * <p>
     * A list of one or more attribute names to use that are found in a specified augmented manifest file.
     * </p>
     * 
     * @param attributeNames
     *        A list of one or more attribute names to use that are found in a specified augmented manifest file.
     */

    public void setAttributeNames(java.util.Collection<String> attributeNames) {
        if (attributeNames == null) {
            this.attributeNames = null;
            return;
        }

        this.attributeNames = new java.util.ArrayList<String>(attributeNames);
    }

    /**
     * <p>
     * A list of one or more attribute names to use that are found in a specified augmented manifest file.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeNames(java.util.Collection)} or {@link #withAttributeNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param attributeNames
     *        A list of one or more attribute names to use that are found in a specified augmented manifest file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataSource withAttributeNames(String... attributeNames) {
        if (this.attributeNames == null) {
            setAttributeNames(new java.util.ArrayList<String>(attributeNames.length));
        }
        for (String ele : attributeNames) {
            this.attributeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of one or more attribute names to use that are found in a specified augmented manifest file.
     * </p>
     * 
     * @param attributeNames
     *        A list of one or more attribute names to use that are found in a specified augmented manifest file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataSource withAttributeNames(java.util.Collection<String> attributeNames) {
        setAttributeNames(attributeNames);
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
        if (getS3DataType() != null)
            sb.append("S3DataType: ").append(getS3DataType()).append(",");
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append(getS3Uri()).append(",");
        if (getS3DataDistributionType() != null)
            sb.append("S3DataDistributionType: ").append(getS3DataDistributionType()).append(",");
        if (getAttributeNames() != null)
            sb.append("AttributeNames: ").append(getAttributeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3DataSource == false)
            return false;
        S3DataSource other = (S3DataSource) obj;
        if (other.getS3DataType() == null ^ this.getS3DataType() == null)
            return false;
        if (other.getS3DataType() != null && other.getS3DataType().equals(this.getS3DataType()) == false)
            return false;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getS3DataDistributionType() == null ^ this.getS3DataDistributionType() == null)
            return false;
        if (other.getS3DataDistributionType() != null && other.getS3DataDistributionType().equals(this.getS3DataDistributionType()) == false)
            return false;
        if (other.getAttributeNames() == null ^ this.getAttributeNames() == null)
            return false;
        if (other.getAttributeNames() != null && other.getAttributeNames().equals(this.getAttributeNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3DataType() == null) ? 0 : getS3DataType().hashCode());
        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getS3DataDistributionType() == null) ? 0 : getS3DataDistributionType().hashCode());
        hashCode = prime * hashCode + ((getAttributeNames() == null) ? 0 : getAttributeNames().hashCode());
        return hashCode;
    }

    @Override
    public S3DataSource clone() {
        try {
            return (S3DataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.S3DataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
