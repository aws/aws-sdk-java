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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartCallAnalyticsJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartCallAnalyticsJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique name, chosen by you, for your Call Analytics job.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new job with the same name as an existing job, you get a <code>ConflictException</code>
     * error.
     * </p>
     */
    private String callAnalyticsJobName;
    /**
     * <p>
     * Describes the Amazon S3 location of the media file you want to use in your Call Analytics request.
     * </p>
     */
    private Media media;
    /**
     * <p>
     * The Amazon S3 location where you want your Call Analytics transcription output stored. You can use any of the
     * following formats to specify the output location:
     * </p>
     * <ol>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET/my-output-folder/
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET/my-output-folder/my-call-analytics-job.json
     * </p>
     * </li>
     * </ol>
     * <p>
     * Unless you specify a file name (option 3), the name of your output file has a default value that matches the name
     * you specified for your transcription job using the <code>CallAnalyticsJobName</code> parameter.
     * </p>
     * <p>
     * You can specify a KMS key to encrypt your output using the <code>OutputEncryptionKMSKeyId</code> parameter. If
     * you don't specify a KMS key, Amazon Transcribe uses the default Amazon S3 key for server-side encryption.
     * </p>
     * <p>
     * If you don't specify <code>OutputLocation</code>, your transcript is placed in a service-managed Amazon S3 bucket
     * and you are provided with a URI to access your transcript.
     * </p>
     */
    private String outputLocation;
    /**
     * <p>
     * The KMS key you want to use to encrypt your Call Analytics output.
     * </p>
     * <p>
     * If using a key located in the <b>current</b> Amazon Web Services account, you can specify your KMS key in one of
     * four ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the KMS key ID itself. For example, <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an alias for the KMS key ID. For example, <code>alias/ExampleAlias</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the Amazon Resource Name (ARN) for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example, <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If using a key located in a <b>different</b> Amazon Web Services account than the current Amazon Web Services
     * account, you can specify your KMS key in one of two ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the ARN for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example, <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you don't specify an encryption key, your output is encrypted with the default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an output location using the
     * <code>OutputLocation</code> parameter.
     * </p>
     * <p>
     * Note that the user making the request must have permission to use the specified KMS key.
     * </p>
     */
    private String outputEncryptionKMSKeyId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains
     * your input files. If the role that you specify doesn’t have the appropriate permissions to access the specified
     * Amazon S3 location, your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For example:
     * <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM ARNs</a>.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * Specify additional optional settings in your request, including content redaction; allows you to apply custom
     * language models, vocabulary filters, and custom vocabularies to your Call Analytics job.
     * </p>
     */
    private CallAnalyticsJobSettings settings;
    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For example, if your agent is the first
     * participant to speak, you would set <code>ChannelId</code> to <code>0</code> (to indicate the first channel) and
     * <code>ParticipantRole</code> to <code>AGENT</code> (to indicate that it's the agent speaking).
     * </p>
     */
    private java.util.List<ChannelDefinition> channelDefinitions;

    /**
     * <p>
     * A unique name, chosen by you, for your Call Analytics job.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new job with the same name as an existing job, you get a <code>ConflictException</code>
     * error.
     * </p>
     * 
     * @param callAnalyticsJobName
     *        A unique name, chosen by you, for your Call Analytics job.</p>
     *        <p>
     *        This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *        account. If you try to create a new job with the same name as an existing job, you get a
     *        <code>ConflictException</code> error.
     */

    public void setCallAnalyticsJobName(String callAnalyticsJobName) {
        this.callAnalyticsJobName = callAnalyticsJobName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your Call Analytics job.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new job with the same name as an existing job, you get a <code>ConflictException</code>
     * error.
     * </p>
     * 
     * @return A unique name, chosen by you, for your Call Analytics job.</p>
     *         <p>
     *         This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *         account. If you try to create a new job with the same name as an existing job, you get a
     *         <code>ConflictException</code> error.
     */

    public String getCallAnalyticsJobName() {
        return this.callAnalyticsJobName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your Call Analytics job.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new job with the same name as an existing job, you get a <code>ConflictException</code>
     * error.
     * </p>
     * 
     * @param callAnalyticsJobName
     *        A unique name, chosen by you, for your Call Analytics job.</p>
     *        <p>
     *        This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *        account. If you try to create a new job with the same name as an existing job, you get a
     *        <code>ConflictException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCallAnalyticsJobRequest withCallAnalyticsJobName(String callAnalyticsJobName) {
        setCallAnalyticsJobName(callAnalyticsJobName);
        return this;
    }

    /**
     * <p>
     * Describes the Amazon S3 location of the media file you want to use in your Call Analytics request.
     * </p>
     * 
     * @param media
     *        Describes the Amazon S3 location of the media file you want to use in your Call Analytics request.
     */

    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * <p>
     * Describes the Amazon S3 location of the media file you want to use in your Call Analytics request.
     * </p>
     * 
     * @return Describes the Amazon S3 location of the media file you want to use in your Call Analytics request.
     */

    public Media getMedia() {
        return this.media;
    }

    /**
     * <p>
     * Describes the Amazon S3 location of the media file you want to use in your Call Analytics request.
     * </p>
     * 
     * @param media
     *        Describes the Amazon S3 location of the media file you want to use in your Call Analytics request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCallAnalyticsJobRequest withMedia(Media media) {
        setMedia(media);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location where you want your Call Analytics transcription output stored. You can use any of the
     * following formats to specify the output location:
     * </p>
     * <ol>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET/my-output-folder/
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET/my-output-folder/my-call-analytics-job.json
     * </p>
     * </li>
     * </ol>
     * <p>
     * Unless you specify a file name (option 3), the name of your output file has a default value that matches the name
     * you specified for your transcription job using the <code>CallAnalyticsJobName</code> parameter.
     * </p>
     * <p>
     * You can specify a KMS key to encrypt your output using the <code>OutputEncryptionKMSKeyId</code> parameter. If
     * you don't specify a KMS key, Amazon Transcribe uses the default Amazon S3 key for server-side encryption.
     * </p>
     * <p>
     * If you don't specify <code>OutputLocation</code>, your transcript is placed in a service-managed Amazon S3 bucket
     * and you are provided with a URI to access your transcript.
     * </p>
     * 
     * @param outputLocation
     *        The Amazon S3 location where you want your Call Analytics transcription output stored. You can use any of
     *        the following formats to specify the output location:</p>
     *        <ol>
     *        <li>
     *        <p>
     *        s3://DOC-EXAMPLE-BUCKET
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        s3://DOC-EXAMPLE-BUCKET/my-output-folder/
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        s3://DOC-EXAMPLE-BUCKET/my-output-folder/my-call-analytics-job.json
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        Unless you specify a file name (option 3), the name of your output file has a default value that matches
     *        the name you specified for your transcription job using the <code>CallAnalyticsJobName</code> parameter.
     *        </p>
     *        <p>
     *        You can specify a KMS key to encrypt your output using the <code>OutputEncryptionKMSKeyId</code>
     *        parameter. If you don't specify a KMS key, Amazon Transcribe uses the default Amazon S3 key for
     *        server-side encryption.
     *        </p>
     *        <p>
     *        If you don't specify <code>OutputLocation</code>, your transcript is placed in a service-managed Amazon S3
     *        bucket and you are provided with a URI to access your transcript.
     */

    public void setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * The Amazon S3 location where you want your Call Analytics transcription output stored. You can use any of the
     * following formats to specify the output location:
     * </p>
     * <ol>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET/my-output-folder/
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET/my-output-folder/my-call-analytics-job.json
     * </p>
     * </li>
     * </ol>
     * <p>
     * Unless you specify a file name (option 3), the name of your output file has a default value that matches the name
     * you specified for your transcription job using the <code>CallAnalyticsJobName</code> parameter.
     * </p>
     * <p>
     * You can specify a KMS key to encrypt your output using the <code>OutputEncryptionKMSKeyId</code> parameter. If
     * you don't specify a KMS key, Amazon Transcribe uses the default Amazon S3 key for server-side encryption.
     * </p>
     * <p>
     * If you don't specify <code>OutputLocation</code>, your transcript is placed in a service-managed Amazon S3 bucket
     * and you are provided with a URI to access your transcript.
     * </p>
     * 
     * @return The Amazon S3 location where you want your Call Analytics transcription output stored. You can use any of
     *         the following formats to specify the output location:</p>
     *         <ol>
     *         <li>
     *         <p>
     *         s3://DOC-EXAMPLE-BUCKET
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         s3://DOC-EXAMPLE-BUCKET/my-output-folder/
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         s3://DOC-EXAMPLE-BUCKET/my-output-folder/my-call-analytics-job.json
     *         </p>
     *         </li>
     *         </ol>
     *         <p>
     *         Unless you specify a file name (option 3), the name of your output file has a default value that matches
     *         the name you specified for your transcription job using the <code>CallAnalyticsJobName</code> parameter.
     *         </p>
     *         <p>
     *         You can specify a KMS key to encrypt your output using the <code>OutputEncryptionKMSKeyId</code>
     *         parameter. If you don't specify a KMS key, Amazon Transcribe uses the default Amazon S3 key for
     *         server-side encryption.
     *         </p>
     *         <p>
     *         If you don't specify <code>OutputLocation</code>, your transcript is placed in a service-managed Amazon
     *         S3 bucket and you are provided with a URI to access your transcript.
     */

    public String getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * <p>
     * The Amazon S3 location where you want your Call Analytics transcription output stored. You can use any of the
     * following formats to specify the output location:
     * </p>
     * <ol>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET/my-output-folder/
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET/my-output-folder/my-call-analytics-job.json
     * </p>
     * </li>
     * </ol>
     * <p>
     * Unless you specify a file name (option 3), the name of your output file has a default value that matches the name
     * you specified for your transcription job using the <code>CallAnalyticsJobName</code> parameter.
     * </p>
     * <p>
     * You can specify a KMS key to encrypt your output using the <code>OutputEncryptionKMSKeyId</code> parameter. If
     * you don't specify a KMS key, Amazon Transcribe uses the default Amazon S3 key for server-side encryption.
     * </p>
     * <p>
     * If you don't specify <code>OutputLocation</code>, your transcript is placed in a service-managed Amazon S3 bucket
     * and you are provided with a URI to access your transcript.
     * </p>
     * 
     * @param outputLocation
     *        The Amazon S3 location where you want your Call Analytics transcription output stored. You can use any of
     *        the following formats to specify the output location:</p>
     *        <ol>
     *        <li>
     *        <p>
     *        s3://DOC-EXAMPLE-BUCKET
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        s3://DOC-EXAMPLE-BUCKET/my-output-folder/
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        s3://DOC-EXAMPLE-BUCKET/my-output-folder/my-call-analytics-job.json
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        Unless you specify a file name (option 3), the name of your output file has a default value that matches
     *        the name you specified for your transcription job using the <code>CallAnalyticsJobName</code> parameter.
     *        </p>
     *        <p>
     *        You can specify a KMS key to encrypt your output using the <code>OutputEncryptionKMSKeyId</code>
     *        parameter. If you don't specify a KMS key, Amazon Transcribe uses the default Amazon S3 key for
     *        server-side encryption.
     *        </p>
     *        <p>
     *        If you don't specify <code>OutputLocation</code>, your transcript is placed in a service-managed Amazon S3
     *        bucket and you are provided with a URI to access your transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCallAnalyticsJobRequest withOutputLocation(String outputLocation) {
        setOutputLocation(outputLocation);
        return this;
    }

    /**
     * <p>
     * The KMS key you want to use to encrypt your Call Analytics output.
     * </p>
     * <p>
     * If using a key located in the <b>current</b> Amazon Web Services account, you can specify your KMS key in one of
     * four ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the KMS key ID itself. For example, <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an alias for the KMS key ID. For example, <code>alias/ExampleAlias</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the Amazon Resource Name (ARN) for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example, <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If using a key located in a <b>different</b> Amazon Web Services account than the current Amazon Web Services
     * account, you can specify your KMS key in one of two ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the ARN for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example, <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you don't specify an encryption key, your output is encrypted with the default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an output location using the
     * <code>OutputLocation</code> parameter.
     * </p>
     * <p>
     * Note that the user making the request must have permission to use the specified KMS key.
     * </p>
     * 
     * @param outputEncryptionKMSKeyId
     *        The KMS key you want to use to encrypt your Call Analytics output.</p>
     *        <p>
     *        If using a key located in the <b>current</b> Amazon Web Services account, you can specify your KMS key in
     *        one of four ways:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Use the KMS key ID itself. For example, <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use an alias for the KMS key ID. For example, <code>alias/ExampleAlias</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use the Amazon Resource Name (ARN) for the KMS key ID. For example,
     *        <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use the ARN for the KMS key alias. For example,
     *        <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        If using a key located in a <b>different</b> Amazon Web Services account than the current Amazon Web
     *        Services account, you can specify your KMS key in one of two ways:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Use the ARN for the KMS key ID. For example,
     *        <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use the ARN for the KMS key alias. For example,
     *        <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        If you don't specify an encryption key, your output is encrypted with the default Amazon S3 key (SSE-S3).
     *        </p>
     *        <p>
     *        If you specify a KMS key to encrypt your output, you must also specify an output location using the
     *        <code>OutputLocation</code> parameter.
     *        </p>
     *        <p>
     *        Note that the user making the request must have permission to use the specified KMS key.
     */

    public void setOutputEncryptionKMSKeyId(String outputEncryptionKMSKeyId) {
        this.outputEncryptionKMSKeyId = outputEncryptionKMSKeyId;
    }

    /**
     * <p>
     * The KMS key you want to use to encrypt your Call Analytics output.
     * </p>
     * <p>
     * If using a key located in the <b>current</b> Amazon Web Services account, you can specify your KMS key in one of
     * four ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the KMS key ID itself. For example, <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an alias for the KMS key ID. For example, <code>alias/ExampleAlias</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the Amazon Resource Name (ARN) for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example, <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If using a key located in a <b>different</b> Amazon Web Services account than the current Amazon Web Services
     * account, you can specify your KMS key in one of two ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the ARN for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example, <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you don't specify an encryption key, your output is encrypted with the default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an output location using the
     * <code>OutputLocation</code> parameter.
     * </p>
     * <p>
     * Note that the user making the request must have permission to use the specified KMS key.
     * </p>
     * 
     * @return The KMS key you want to use to encrypt your Call Analytics output.</p>
     *         <p>
     *         If using a key located in the <b>current</b> Amazon Web Services account, you can specify your KMS key in
     *         one of four ways:
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         Use the KMS key ID itself. For example, <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use an alias for the KMS key ID. For example, <code>alias/ExampleAlias</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use the Amazon Resource Name (ARN) for the KMS key ID. For example,
     *         <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use the ARN for the KMS key alias. For example,
     *         <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     *         </p>
     *         </li>
     *         </ol>
     *         <p>
     *         If using a key located in a <b>different</b> Amazon Web Services account than the current Amazon Web
     *         Services account, you can specify your KMS key in one of two ways:
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         Use the ARN for the KMS key ID. For example,
     *         <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use the ARN for the KMS key alias. For example,
     *         <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     *         </p>
     *         </li>
     *         </ol>
     *         <p>
     *         If you don't specify an encryption key, your output is encrypted with the default Amazon S3 key (SSE-S3).
     *         </p>
     *         <p>
     *         If you specify a KMS key to encrypt your output, you must also specify an output location using the
     *         <code>OutputLocation</code> parameter.
     *         </p>
     *         <p>
     *         Note that the user making the request must have permission to use the specified KMS key.
     */

    public String getOutputEncryptionKMSKeyId() {
        return this.outputEncryptionKMSKeyId;
    }

    /**
     * <p>
     * The KMS key you want to use to encrypt your Call Analytics output.
     * </p>
     * <p>
     * If using a key located in the <b>current</b> Amazon Web Services account, you can specify your KMS key in one of
     * four ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the KMS key ID itself. For example, <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an alias for the KMS key ID. For example, <code>alias/ExampleAlias</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the Amazon Resource Name (ARN) for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example, <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If using a key located in a <b>different</b> Amazon Web Services account than the current Amazon Web Services
     * account, you can specify your KMS key in one of two ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the ARN for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example, <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you don't specify an encryption key, your output is encrypted with the default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an output location using the
     * <code>OutputLocation</code> parameter.
     * </p>
     * <p>
     * Note that the user making the request must have permission to use the specified KMS key.
     * </p>
     * 
     * @param outputEncryptionKMSKeyId
     *        The KMS key you want to use to encrypt your Call Analytics output.</p>
     *        <p>
     *        If using a key located in the <b>current</b> Amazon Web Services account, you can specify your KMS key in
     *        one of four ways:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Use the KMS key ID itself. For example, <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use an alias for the KMS key ID. For example, <code>alias/ExampleAlias</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use the Amazon Resource Name (ARN) for the KMS key ID. For example,
     *        <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use the ARN for the KMS key alias. For example,
     *        <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        If using a key located in a <b>different</b> Amazon Web Services account than the current Amazon Web
     *        Services account, you can specify your KMS key in one of two ways:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Use the ARN for the KMS key ID. For example,
     *        <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use the ARN for the KMS key alias. For example,
     *        <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        If you don't specify an encryption key, your output is encrypted with the default Amazon S3 key (SSE-S3).
     *        </p>
     *        <p>
     *        If you specify a KMS key to encrypt your output, you must also specify an output location using the
     *        <code>OutputLocation</code> parameter.
     *        </p>
     *        <p>
     *        Note that the user making the request must have permission to use the specified KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCallAnalyticsJobRequest withOutputEncryptionKMSKeyId(String outputEncryptionKMSKeyId) {
        setOutputEncryptionKMSKeyId(outputEncryptionKMSKeyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains
     * your input files. If the role that you specify doesn’t have the appropriate permissions to access the specified
     * Amazon S3 location, your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For example:
     * <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM ARNs</a>.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that
     *        contains your input files. If the role that you specify doesn’t have the appropriate permissions to access
     *        the specified Amazon S3 location, your request fails.</p>
     *        <p>
     *        IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     *        example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM
     *        ARNs</a>.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains
     * your input files. If the role that you specify doesn’t have the appropriate permissions to access the specified
     * Amazon S3 location, your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For example:
     * <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM ARNs</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that
     *         contains your input files. If the role that you specify doesn’t have the appropriate permissions to
     *         access the specified Amazon S3 location, your request fails.</p>
     *         <p>
     *         IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     *         example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM
     *         ARNs</a>.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains
     * your input files. If the role that you specify doesn’t have the appropriate permissions to access the specified
     * Amazon S3 location, your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For example:
     * <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM ARNs</a>.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that
     *        contains your input files. If the role that you specify doesn’t have the appropriate permissions to access
     *        the specified Amazon S3 location, your request fails.</p>
     *        <p>
     *        IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     *        example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM
     *        ARNs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCallAnalyticsJobRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * Specify additional optional settings in your request, including content redaction; allows you to apply custom
     * language models, vocabulary filters, and custom vocabularies to your Call Analytics job.
     * </p>
     * 
     * @param settings
     *        Specify additional optional settings in your request, including content redaction; allows you to apply
     *        custom language models, vocabulary filters, and custom vocabularies to your Call Analytics job.
     */

    public void setSettings(CallAnalyticsJobSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Specify additional optional settings in your request, including content redaction; allows you to apply custom
     * language models, vocabulary filters, and custom vocabularies to your Call Analytics job.
     * </p>
     * 
     * @return Specify additional optional settings in your request, including content redaction; allows you to apply
     *         custom language models, vocabulary filters, and custom vocabularies to your Call Analytics job.
     */

    public CallAnalyticsJobSettings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * Specify additional optional settings in your request, including content redaction; allows you to apply custom
     * language models, vocabulary filters, and custom vocabularies to your Call Analytics job.
     * </p>
     * 
     * @param settings
     *        Specify additional optional settings in your request, including content redaction; allows you to apply
     *        custom language models, vocabulary filters, and custom vocabularies to your Call Analytics job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCallAnalyticsJobRequest withSettings(CallAnalyticsJobSettings settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For example, if your agent is the first
     * participant to speak, you would set <code>ChannelId</code> to <code>0</code> (to indicate the first channel) and
     * <code>ParticipantRole</code> to <code>AGENT</code> (to indicate that it's the agent speaking).
     * </p>
     * 
     * @return Makes it possible to specify which speaker is on which channel. For example, if your agent is the first
     *         participant to speak, you would set <code>ChannelId</code> to <code>0</code> (to indicate the first
     *         channel) and <code>ParticipantRole</code> to <code>AGENT</code> (to indicate that it's the agent
     *         speaking).
     */

    public java.util.List<ChannelDefinition> getChannelDefinitions() {
        return channelDefinitions;
    }

    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For example, if your agent is the first
     * participant to speak, you would set <code>ChannelId</code> to <code>0</code> (to indicate the first channel) and
     * <code>ParticipantRole</code> to <code>AGENT</code> (to indicate that it's the agent speaking).
     * </p>
     * 
     * @param channelDefinitions
     *        Makes it possible to specify which speaker is on which channel. For example, if your agent is the first
     *        participant to speak, you would set <code>ChannelId</code> to <code>0</code> (to indicate the first
     *        channel) and <code>ParticipantRole</code> to <code>AGENT</code> (to indicate that it's the agent
     *        speaking).
     */

    public void setChannelDefinitions(java.util.Collection<ChannelDefinition> channelDefinitions) {
        if (channelDefinitions == null) {
            this.channelDefinitions = null;
            return;
        }

        this.channelDefinitions = new java.util.ArrayList<ChannelDefinition>(channelDefinitions);
    }

    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For example, if your agent is the first
     * participant to speak, you would set <code>ChannelId</code> to <code>0</code> (to indicate the first channel) and
     * <code>ParticipantRole</code> to <code>AGENT</code> (to indicate that it's the agent speaking).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannelDefinitions(java.util.Collection)} or {@link #withChannelDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param channelDefinitions
     *        Makes it possible to specify which speaker is on which channel. For example, if your agent is the first
     *        participant to speak, you would set <code>ChannelId</code> to <code>0</code> (to indicate the first
     *        channel) and <code>ParticipantRole</code> to <code>AGENT</code> (to indicate that it's the agent
     *        speaking).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCallAnalyticsJobRequest withChannelDefinitions(ChannelDefinition... channelDefinitions) {
        if (this.channelDefinitions == null) {
            setChannelDefinitions(new java.util.ArrayList<ChannelDefinition>(channelDefinitions.length));
        }
        for (ChannelDefinition ele : channelDefinitions) {
            this.channelDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For example, if your agent is the first
     * participant to speak, you would set <code>ChannelId</code> to <code>0</code> (to indicate the first channel) and
     * <code>ParticipantRole</code> to <code>AGENT</code> (to indicate that it's the agent speaking).
     * </p>
     * 
     * @param channelDefinitions
     *        Makes it possible to specify which speaker is on which channel. For example, if your agent is the first
     *        participant to speak, you would set <code>ChannelId</code> to <code>0</code> (to indicate the first
     *        channel) and <code>ParticipantRole</code> to <code>AGENT</code> (to indicate that it's the agent
     *        speaking).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCallAnalyticsJobRequest withChannelDefinitions(java.util.Collection<ChannelDefinition> channelDefinitions) {
        setChannelDefinitions(channelDefinitions);
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
        if (getCallAnalyticsJobName() != null)
            sb.append("CallAnalyticsJobName: ").append(getCallAnalyticsJobName()).append(",");
        if (getMedia() != null)
            sb.append("Media: ").append(getMedia()).append(",");
        if (getOutputLocation() != null)
            sb.append("OutputLocation: ").append(getOutputLocation()).append(",");
        if (getOutputEncryptionKMSKeyId() != null)
            sb.append("OutputEncryptionKMSKeyId: ").append(getOutputEncryptionKMSKeyId()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
        if (getChannelDefinitions() != null)
            sb.append("ChannelDefinitions: ").append(getChannelDefinitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartCallAnalyticsJobRequest == false)
            return false;
        StartCallAnalyticsJobRequest other = (StartCallAnalyticsJobRequest) obj;
        if (other.getCallAnalyticsJobName() == null ^ this.getCallAnalyticsJobName() == null)
            return false;
        if (other.getCallAnalyticsJobName() != null && other.getCallAnalyticsJobName().equals(this.getCallAnalyticsJobName()) == false)
            return false;
        if (other.getMedia() == null ^ this.getMedia() == null)
            return false;
        if (other.getMedia() != null && other.getMedia().equals(this.getMedia()) == false)
            return false;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        if (other.getOutputEncryptionKMSKeyId() == null ^ this.getOutputEncryptionKMSKeyId() == null)
            return false;
        if (other.getOutputEncryptionKMSKeyId() != null && other.getOutputEncryptionKMSKeyId().equals(this.getOutputEncryptionKMSKeyId()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getChannelDefinitions() == null ^ this.getChannelDefinitions() == null)
            return false;
        if (other.getChannelDefinitions() != null && other.getChannelDefinitions().equals(this.getChannelDefinitions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCallAnalyticsJobName() == null) ? 0 : getCallAnalyticsJobName().hashCode());
        hashCode = prime * hashCode + ((getMedia() == null) ? 0 : getMedia().hashCode());
        hashCode = prime * hashCode + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        hashCode = prime * hashCode + ((getOutputEncryptionKMSKeyId() == null) ? 0 : getOutputEncryptionKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getChannelDefinitions() == null) ? 0 : getChannelDefinitions().hashCode());
        return hashCode;
    }

    @Override
    public StartCallAnalyticsJobRequest clone() {
        return (StartCallAnalyticsJobRequest) super.clone();
    }

}
