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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStreamProcessorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Kinesis video stream stream that provides the source streaming video. If you are using the AWS CLI, the parameter
     * name is <code>StreamProcessorInput</code>. This is required for both face search and label detection stream
     * processors.
     * </p>
     */
    private StreamProcessorInput input;
    /**
     * <p>
     * Kinesis data stream stream or Amazon S3 bucket location to which Amazon Rekognition Video puts the analysis
     * results. If you are using the AWS CLI, the parameter name is <code>StreamProcessorOutput</code>. This must be a
     * <a>S3Destination</a> of an Amazon S3 bucket that you own for a label detection stream processor or a Kinesis data
     * stream ARN for a face search stream processor.
     * </p>
     */
    private StreamProcessorOutput output;
    /**
     * <p>
     * An identifier you assign to the stream processor. You can use <code>Name</code> to manage the stream processor.
     * For example, you can get the current status of the stream processor by calling <a>DescribeStreamProcessor</a>.
     * <code>Name</code> is idempotent. This is required for both face search and label detection stream processors.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Input parameters used in a streaming video analyzed by a stream processor. You can use <code>FaceSearch</code> to
     * recognize faces in a streaming video, or you can use <code>ConnectedHome</code> to detect labels.
     * </p>
     */
    private StreamProcessorSettings settings;
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role that allows access to the stream processor. The IAM role
     * provides Rekognition read permissions for a Kinesis stream. It also provides write permissions to an Amazon S3
     * bucket and Amazon Simple Notification Service topic for a label detection stream processor. This is required for
     * both face search and label detection stream processors.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the stream processor.
     * </p>
     */
    private java.util.Map<String, String> tags;

    private StreamProcessorNotificationChannel notificationChannel;
    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). This is an optional parameter for label
     * detection stream processors and should not be used to create a face search stream processor. You can supply the
     * Amazon Resource Name (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN.
     * The key is used to encrypt results and data published to your Amazon S3 bucket, which includes image frames and
     * hero images. Your source images are unaffected.
     * </p>
     * <p>
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Specifies locations in the frames where Amazon Rekognition checks for objects or people. You can specify up to 10
     * regions of interest, and each region has either a polygon or a bounding box. This is an optional parameter for
     * label detection stream processors and should not be used to create a face search stream processor.
     * </p>
     */
    private java.util.List<RegionOfInterest> regionsOfInterest;
    /**
     * <p>
     * Shows whether you are sharing data with Rekognition to improve model performance. You can choose this option at
     * the account level or on a per-stream basis. Note that if you opt out at the account level this setting is ignored
     * on individual streams.
     * </p>
     */
    private StreamProcessorDataSharingPreference dataSharingPreference;

    /**
     * <p>
     * Kinesis video stream stream that provides the source streaming video. If you are using the AWS CLI, the parameter
     * name is <code>StreamProcessorInput</code>. This is required for both face search and label detection stream
     * processors.
     * </p>
     * 
     * @param input
     *        Kinesis video stream stream that provides the source streaming video. If you are using the AWS CLI, the
     *        parameter name is <code>StreamProcessorInput</code>. This is required for both face search and label
     *        detection stream processors.
     */

    public void setInput(StreamProcessorInput input) {
        this.input = input;
    }

    /**
     * <p>
     * Kinesis video stream stream that provides the source streaming video. If you are using the AWS CLI, the parameter
     * name is <code>StreamProcessorInput</code>. This is required for both face search and label detection stream
     * processors.
     * </p>
     * 
     * @return Kinesis video stream stream that provides the source streaming video. If you are using the AWS CLI, the
     *         parameter name is <code>StreamProcessorInput</code>. This is required for both face search and label
     *         detection stream processors.
     */

    public StreamProcessorInput getInput() {
        return this.input;
    }

    /**
     * <p>
     * Kinesis video stream stream that provides the source streaming video. If you are using the AWS CLI, the parameter
     * name is <code>StreamProcessorInput</code>. This is required for both face search and label detection stream
     * processors.
     * </p>
     * 
     * @param input
     *        Kinesis video stream stream that provides the source streaming video. If you are using the AWS CLI, the
     *        parameter name is <code>StreamProcessorInput</code>. This is required for both face search and label
     *        detection stream processors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamProcessorRequest withInput(StreamProcessorInput input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * Kinesis data stream stream or Amazon S3 bucket location to which Amazon Rekognition Video puts the analysis
     * results. If you are using the AWS CLI, the parameter name is <code>StreamProcessorOutput</code>. This must be a
     * <a>S3Destination</a> of an Amazon S3 bucket that you own for a label detection stream processor or a Kinesis data
     * stream ARN for a face search stream processor.
     * </p>
     * 
     * @param output
     *        Kinesis data stream stream or Amazon S3 bucket location to which Amazon Rekognition Video puts the
     *        analysis results. If you are using the AWS CLI, the parameter name is <code>StreamProcessorOutput</code>.
     *        This must be a <a>S3Destination</a> of an Amazon S3 bucket that you own for a label detection stream
     *        processor or a Kinesis data stream ARN for a face search stream processor.
     */

    public void setOutput(StreamProcessorOutput output) {
        this.output = output;
    }

    /**
     * <p>
     * Kinesis data stream stream or Amazon S3 bucket location to which Amazon Rekognition Video puts the analysis
     * results. If you are using the AWS CLI, the parameter name is <code>StreamProcessorOutput</code>. This must be a
     * <a>S3Destination</a> of an Amazon S3 bucket that you own for a label detection stream processor or a Kinesis data
     * stream ARN for a face search stream processor.
     * </p>
     * 
     * @return Kinesis data stream stream or Amazon S3 bucket location to which Amazon Rekognition Video puts the
     *         analysis results. If you are using the AWS CLI, the parameter name is <code>StreamProcessorOutput</code>.
     *         This must be a <a>S3Destination</a> of an Amazon S3 bucket that you own for a label detection stream
     *         processor or a Kinesis data stream ARN for a face search stream processor.
     */

    public StreamProcessorOutput getOutput() {
        return this.output;
    }

    /**
     * <p>
     * Kinesis data stream stream or Amazon S3 bucket location to which Amazon Rekognition Video puts the analysis
     * results. If you are using the AWS CLI, the parameter name is <code>StreamProcessorOutput</code>. This must be a
     * <a>S3Destination</a> of an Amazon S3 bucket that you own for a label detection stream processor or a Kinesis data
     * stream ARN for a face search stream processor.
     * </p>
     * 
     * @param output
     *        Kinesis data stream stream or Amazon S3 bucket location to which Amazon Rekognition Video puts the
     *        analysis results. If you are using the AWS CLI, the parameter name is <code>StreamProcessorOutput</code>.
     *        This must be a <a>S3Destination</a> of an Amazon S3 bucket that you own for a label detection stream
     *        processor or a Kinesis data stream ARN for a face search stream processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamProcessorRequest withOutput(StreamProcessorOutput output) {
        setOutput(output);
        return this;
    }

    /**
     * <p>
     * An identifier you assign to the stream processor. You can use <code>Name</code> to manage the stream processor.
     * For example, you can get the current status of the stream processor by calling <a>DescribeStreamProcessor</a>.
     * <code>Name</code> is idempotent. This is required for both face search and label detection stream processors.
     * </p>
     * 
     * @param name
     *        An identifier you assign to the stream processor. You can use <code>Name</code> to manage the stream
     *        processor. For example, you can get the current status of the stream processor by calling
     *        <a>DescribeStreamProcessor</a>. <code>Name</code> is idempotent. This is required for both face search and
     *        label detection stream processors.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * An identifier you assign to the stream processor. You can use <code>Name</code> to manage the stream processor.
     * For example, you can get the current status of the stream processor by calling <a>DescribeStreamProcessor</a>.
     * <code>Name</code> is idempotent. This is required for both face search and label detection stream processors.
     * </p>
     * 
     * @return An identifier you assign to the stream processor. You can use <code>Name</code> to manage the stream
     *         processor. For example, you can get the current status of the stream processor by calling
     *         <a>DescribeStreamProcessor</a>. <code>Name</code> is idempotent. This is required for both face search
     *         and label detection stream processors.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * An identifier you assign to the stream processor. You can use <code>Name</code> to manage the stream processor.
     * For example, you can get the current status of the stream processor by calling <a>DescribeStreamProcessor</a>.
     * <code>Name</code> is idempotent. This is required for both face search and label detection stream processors.
     * </p>
     * 
     * @param name
     *        An identifier you assign to the stream processor. You can use <code>Name</code> to manage the stream
     *        processor. For example, you can get the current status of the stream processor by calling
     *        <a>DescribeStreamProcessor</a>. <code>Name</code> is idempotent. This is required for both face search and
     *        label detection stream processors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamProcessorRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Input parameters used in a streaming video analyzed by a stream processor. You can use <code>FaceSearch</code> to
     * recognize faces in a streaming video, or you can use <code>ConnectedHome</code> to detect labels.
     * </p>
     * 
     * @param settings
     *        Input parameters used in a streaming video analyzed by a stream processor. You can use
     *        <code>FaceSearch</code> to recognize faces in a streaming video, or you can use <code>ConnectedHome</code>
     *        to detect labels.
     */

    public void setSettings(StreamProcessorSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Input parameters used in a streaming video analyzed by a stream processor. You can use <code>FaceSearch</code> to
     * recognize faces in a streaming video, or you can use <code>ConnectedHome</code> to detect labels.
     * </p>
     * 
     * @return Input parameters used in a streaming video analyzed by a stream processor. You can use
     *         <code>FaceSearch</code> to recognize faces in a streaming video, or you can use
     *         <code>ConnectedHome</code> to detect labels.
     */

    public StreamProcessorSettings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * Input parameters used in a streaming video analyzed by a stream processor. You can use <code>FaceSearch</code> to
     * recognize faces in a streaming video, or you can use <code>ConnectedHome</code> to detect labels.
     * </p>
     * 
     * @param settings
     *        Input parameters used in a streaming video analyzed by a stream processor. You can use
     *        <code>FaceSearch</code> to recognize faces in a streaming video, or you can use <code>ConnectedHome</code>
     *        to detect labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamProcessorRequest withSettings(StreamProcessorSettings settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role that allows access to the stream processor. The IAM role
     * provides Rekognition read permissions for a Kinesis stream. It also provides write permissions to an Amazon S3
     * bucket and Amazon Simple Notification Service topic for a label detection stream processor. This is required for
     * both face search and label detection stream processors.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Number (ARN) of the IAM role that allows access to the stream processor. The IAM role
     *        provides Rekognition read permissions for a Kinesis stream. It also provides write permissions to an
     *        Amazon S3 bucket and Amazon Simple Notification Service topic for a label detection stream processor. This
     *        is required for both face search and label detection stream processors.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role that allows access to the stream processor. The IAM role
     * provides Rekognition read permissions for a Kinesis stream. It also provides write permissions to an Amazon S3
     * bucket and Amazon Simple Notification Service topic for a label detection stream processor. This is required for
     * both face search and label detection stream processors.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the IAM role that allows access to the stream processor. The IAM role
     *         provides Rekognition read permissions for a Kinesis stream. It also provides write permissions to an
     *         Amazon S3 bucket and Amazon Simple Notification Service topic for a label detection stream processor.
     *         This is required for both face search and label detection stream processors.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role that allows access to the stream processor. The IAM role
     * provides Rekognition read permissions for a Kinesis stream. It also provides write permissions to an Amazon S3
     * bucket and Amazon Simple Notification Service topic for a label detection stream processor. This is required for
     * both face search and label detection stream processors.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Number (ARN) of the IAM role that allows access to the stream processor. The IAM role
     *        provides Rekognition read permissions for a Kinesis stream. It also provides write permissions to an
     *        Amazon S3 bucket and Amazon Simple Notification Service topic for a label detection stream processor. This
     *        is required for both face search and label detection stream processors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamProcessorRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the stream processor.
     * </p>
     * 
     * @return A set of tags (key-value pairs) that you want to attach to the stream processor.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the stream processor.
     * </p>
     * 
     * @param tags
     *        A set of tags (key-value pairs) that you want to attach to the stream processor.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the stream processor.
     * </p>
     * 
     * @param tags
     *        A set of tags (key-value pairs) that you want to attach to the stream processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamProcessorRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateStreamProcessorRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamProcessorRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamProcessorRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * @param notificationChannel
     */

    public void setNotificationChannel(StreamProcessorNotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    /**
     * @return
     */

    public StreamProcessorNotificationChannel getNotificationChannel() {
        return this.notificationChannel;
    }

    /**
     * @param notificationChannel
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamProcessorRequest withNotificationChannel(StreamProcessorNotificationChannel notificationChannel) {
        setNotificationChannel(notificationChannel);
        return this;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). This is an optional parameter for label
     * detection stream processors and should not be used to create a face search stream processor. You can supply the
     * Amazon Resource Name (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN.
     * The key is used to encrypt results and data published to your Amazon S3 bucket, which includes image frames and
     * hero images. Your source images are unaffected.
     * </p>
     * <p>
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier for your AWS Key Management Service key (AWS KMS key). This is an optional parameter for
     *        label detection stream processors and should not be used to create a face search stream processor. You can
     *        supply the Amazon Resource Name (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key,
     *        or an alias ARN. The key is used to encrypt results and data published to your Amazon S3 bucket, which
     *        includes image frames and hero images. Your source images are unaffected. </p>
     *        <p>
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). This is an optional parameter for label
     * detection stream processors and should not be used to create a face search stream processor. You can supply the
     * Amazon Resource Name (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN.
     * The key is used to encrypt results and data published to your Amazon S3 bucket, which includes image frames and
     * hero images. Your source images are unaffected.
     * </p>
     * <p>
     * </p>
     * 
     * @return The identifier for your AWS Key Management Service key (AWS KMS key). This is an optional parameter for
     *         label detection stream processors and should not be used to create a face search stream processor. You
     *         can supply the Amazon Resource Name (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS
     *         key, or an alias ARN. The key is used to encrypt results and data published to your Amazon S3 bucket,
     *         which includes image frames and hero images. Your source images are unaffected. </p>
     *         <p>
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). This is an optional parameter for label
     * detection stream processors and should not be used to create a face search stream processor. You can supply the
     * Amazon Resource Name (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN.
     * The key is used to encrypt results and data published to your Amazon S3 bucket, which includes image frames and
     * hero images. Your source images are unaffected.
     * </p>
     * <p>
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier for your AWS Key Management Service key (AWS KMS key). This is an optional parameter for
     *        label detection stream processors and should not be used to create a face search stream processor. You can
     *        supply the Amazon Resource Name (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key,
     *        or an alias ARN. The key is used to encrypt results and data published to your Amazon S3 bucket, which
     *        includes image frames and hero images. Your source images are unaffected. </p>
     *        <p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamProcessorRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies locations in the frames where Amazon Rekognition checks for objects or people. You can specify up to 10
     * regions of interest, and each region has either a polygon or a bounding box. This is an optional parameter for
     * label detection stream processors and should not be used to create a face search stream processor.
     * </p>
     * 
     * @return Specifies locations in the frames where Amazon Rekognition checks for objects or people. You can specify
     *         up to 10 regions of interest, and each region has either a polygon or a bounding box. This is an optional
     *         parameter for label detection stream processors and should not be used to create a face search stream
     *         processor.
     */

    public java.util.List<RegionOfInterest> getRegionsOfInterest() {
        return regionsOfInterest;
    }

    /**
     * <p>
     * Specifies locations in the frames where Amazon Rekognition checks for objects or people. You can specify up to 10
     * regions of interest, and each region has either a polygon or a bounding box. This is an optional parameter for
     * label detection stream processors and should not be used to create a face search stream processor.
     * </p>
     * 
     * @param regionsOfInterest
     *        Specifies locations in the frames where Amazon Rekognition checks for objects or people. You can specify
     *        up to 10 regions of interest, and each region has either a polygon or a bounding box. This is an optional
     *        parameter for label detection stream processors and should not be used to create a face search stream
     *        processor.
     */

    public void setRegionsOfInterest(java.util.Collection<RegionOfInterest> regionsOfInterest) {
        if (regionsOfInterest == null) {
            this.regionsOfInterest = null;
            return;
        }

        this.regionsOfInterest = new java.util.ArrayList<RegionOfInterest>(regionsOfInterest);
    }

    /**
     * <p>
     * Specifies locations in the frames where Amazon Rekognition checks for objects or people. You can specify up to 10
     * regions of interest, and each region has either a polygon or a bounding box. This is an optional parameter for
     * label detection stream processors and should not be used to create a face search stream processor.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegionsOfInterest(java.util.Collection)} or {@link #withRegionsOfInterest(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param regionsOfInterest
     *        Specifies locations in the frames where Amazon Rekognition checks for objects or people. You can specify
     *        up to 10 regions of interest, and each region has either a polygon or a bounding box. This is an optional
     *        parameter for label detection stream processors and should not be used to create a face search stream
     *        processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamProcessorRequest withRegionsOfInterest(RegionOfInterest... regionsOfInterest) {
        if (this.regionsOfInterest == null) {
            setRegionsOfInterest(new java.util.ArrayList<RegionOfInterest>(regionsOfInterest.length));
        }
        for (RegionOfInterest ele : regionsOfInterest) {
            this.regionsOfInterest.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies locations in the frames where Amazon Rekognition checks for objects or people. You can specify up to 10
     * regions of interest, and each region has either a polygon or a bounding box. This is an optional parameter for
     * label detection stream processors and should not be used to create a face search stream processor.
     * </p>
     * 
     * @param regionsOfInterest
     *        Specifies locations in the frames where Amazon Rekognition checks for objects or people. You can specify
     *        up to 10 regions of interest, and each region has either a polygon or a bounding box. This is an optional
     *        parameter for label detection stream processors and should not be used to create a face search stream
     *        processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamProcessorRequest withRegionsOfInterest(java.util.Collection<RegionOfInterest> regionsOfInterest) {
        setRegionsOfInterest(regionsOfInterest);
        return this;
    }

    /**
     * <p>
     * Shows whether you are sharing data with Rekognition to improve model performance. You can choose this option at
     * the account level or on a per-stream basis. Note that if you opt out at the account level this setting is ignored
     * on individual streams.
     * </p>
     * 
     * @param dataSharingPreference
     *        Shows whether you are sharing data with Rekognition to improve model performance. You can choose this
     *        option at the account level or on a per-stream basis. Note that if you opt out at the account level this
     *        setting is ignored on individual streams.
     */

    public void setDataSharingPreference(StreamProcessorDataSharingPreference dataSharingPreference) {
        this.dataSharingPreference = dataSharingPreference;
    }

    /**
     * <p>
     * Shows whether you are sharing data with Rekognition to improve model performance. You can choose this option at
     * the account level or on a per-stream basis. Note that if you opt out at the account level this setting is ignored
     * on individual streams.
     * </p>
     * 
     * @return Shows whether you are sharing data with Rekognition to improve model performance. You can choose this
     *         option at the account level or on a per-stream basis. Note that if you opt out at the account level this
     *         setting is ignored on individual streams.
     */

    public StreamProcessorDataSharingPreference getDataSharingPreference() {
        return this.dataSharingPreference;
    }

    /**
     * <p>
     * Shows whether you are sharing data with Rekognition to improve model performance. You can choose this option at
     * the account level or on a per-stream basis. Note that if you opt out at the account level this setting is ignored
     * on individual streams.
     * </p>
     * 
     * @param dataSharingPreference
     *        Shows whether you are sharing data with Rekognition to improve model performance. You can choose this
     *        option at the account level or on a per-stream basis. Note that if you opt out at the account level this
     *        setting is ignored on individual streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamProcessorRequest withDataSharingPreference(StreamProcessorDataSharingPreference dataSharingPreference) {
        setDataSharingPreference(dataSharingPreference);
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
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getOutput() != null)
            sb.append("Output: ").append(getOutput()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getNotificationChannel() != null)
            sb.append("NotificationChannel: ").append(getNotificationChannel()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getRegionsOfInterest() != null)
            sb.append("RegionsOfInterest: ").append(getRegionsOfInterest()).append(",");
        if (getDataSharingPreference() != null)
            sb.append("DataSharingPreference: ").append(getDataSharingPreference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStreamProcessorRequest == false)
            return false;
        CreateStreamProcessorRequest other = (CreateStreamProcessorRequest) obj;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getNotificationChannel() == null ^ this.getNotificationChannel() == null)
            return false;
        if (other.getNotificationChannel() != null && other.getNotificationChannel().equals(this.getNotificationChannel()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getRegionsOfInterest() == null ^ this.getRegionsOfInterest() == null)
            return false;
        if (other.getRegionsOfInterest() != null && other.getRegionsOfInterest().equals(this.getRegionsOfInterest()) == false)
            return false;
        if (other.getDataSharingPreference() == null ^ this.getDataSharingPreference() == null)
            return false;
        if (other.getDataSharingPreference() != null && other.getDataSharingPreference().equals(this.getDataSharingPreference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getNotificationChannel() == null) ? 0 : getNotificationChannel().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getRegionsOfInterest() == null) ? 0 : getRegionsOfInterest().hashCode());
        hashCode = prime * hashCode + ((getDataSharingPreference() == null) ? 0 : getDataSharingPreference().hashCode());
        return hashCode;
    }

    @Override
    public CreateStreamProcessorRequest clone() {
        return (CreateStreamProcessorRequest) super.clone();
    }

}
