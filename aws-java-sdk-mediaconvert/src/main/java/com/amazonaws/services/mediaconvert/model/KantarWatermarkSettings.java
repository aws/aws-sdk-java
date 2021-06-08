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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Use these settings only when you use Kantar watermarking. Specify the values that MediaConvert uses to generate and
 * place Kantar watermarks in your output audio. These settings apply to every output in your job. In addition to
 * specifying these values, you also need to store your Kantar credentials in AWS Secrets Manager. For more information,
 * see https://docs.aws.amazon.com/mediaconvert/latest/ug/kantar-watermarking.html.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/KantarWatermarkSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KantarWatermarkSettings implements Serializable, Cloneable, StructuredPojo {

    /** Provide an audio channel name from your Kantar audio license. */
    private String channelName;
    /** Specify a unique identifier for Kantar to use for this piece of content. */
    private String contentReference;
    /**
     * Provide the name of the AWS Secrets Manager secret where your Kantar credentials are stored. Note that your
     * MediaConvert service role must provide access to this secret. For more information, see
     * https://docs.aws.amazon.com
     * /mediaconvert/latest/ug/granting-permissions-for-mediaconvert-to-access-secrets-manager-secret.html. For
     * instructions on creating a secret, see
     * https://docs.aws.amazon.com/secretsmanager/latest/userguide/tutorials_basic.html, in the AWS Secrets Manager User
     * Guide.
     */
    private String credentialsSecretName;
    /**
     * Optional. Specify an offset, in whole seconds, from the start of your output and the beginning of the
     * watermarking. When you don't specify an offset, Kantar defaults to zero.
     */
    private Double fileOffset;
    /** Provide your Kantar license ID number. You should get this number from Kantar. */
    private Integer kantarLicenseId;
    /** Provide the HTTPS endpoint to the Kantar server. You should get this endpoint from Kantar. */
    private String kantarServerUrl;
    /**
     * Optional. Specify the Amazon S3 bucket where you want MediaConvert to store your Kantar watermark XML logs. When
     * you don't specify a bucket, MediaConvert doesn't save these logs. Note that your MediaConvert service role must
     * provide access to this location. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     */
    private String logDestination;
    /**
     * You can optionally use this field to specify the first timestamp that Kantar embeds during watermarking. Kantar
     * suggests that you be very cautious when using this Kantar feature, and that you use it only on channels that are
     * managed specifically for use with this feature by your Audience Measurement Operator. For more information about
     * this feature, contact Kantar technical support.
     */
    private String metadata3;
    /** Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters. */
    private String metadata4;
    /** Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters. */
    private String metadata5;
    /** Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters. */
    private String metadata6;
    /** Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters. */
    private String metadata7;
    /** Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters. */
    private String metadata8;

    /**
     * Provide an audio channel name from your Kantar audio license.
     * 
     * @param channelName
     *        Provide an audio channel name from your Kantar audio license.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * Provide an audio channel name from your Kantar audio license.
     * 
     * @return Provide an audio channel name from your Kantar audio license.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * Provide an audio channel name from your Kantar audio license.
     * 
     * @param channelName
     *        Provide an audio channel name from your Kantar audio license.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KantarWatermarkSettings withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * Specify a unique identifier for Kantar to use for this piece of content.
     * 
     * @param contentReference
     *        Specify a unique identifier for Kantar to use for this piece of content.
     */

    public void setContentReference(String contentReference) {
        this.contentReference = contentReference;
    }

    /**
     * Specify a unique identifier for Kantar to use for this piece of content.
     * 
     * @return Specify a unique identifier for Kantar to use for this piece of content.
     */

    public String getContentReference() {
        return this.contentReference;
    }

    /**
     * Specify a unique identifier for Kantar to use for this piece of content.
     * 
     * @param contentReference
     *        Specify a unique identifier for Kantar to use for this piece of content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KantarWatermarkSettings withContentReference(String contentReference) {
        setContentReference(contentReference);
        return this;
    }

    /**
     * Provide the name of the AWS Secrets Manager secret where your Kantar credentials are stored. Note that your
     * MediaConvert service role must provide access to this secret. For more information, see
     * https://docs.aws.amazon.com
     * /mediaconvert/latest/ug/granting-permissions-for-mediaconvert-to-access-secrets-manager-secret.html. For
     * instructions on creating a secret, see
     * https://docs.aws.amazon.com/secretsmanager/latest/userguide/tutorials_basic.html, in the AWS Secrets Manager User
     * Guide.
     * 
     * @param credentialsSecretName
     *        Provide the name of the AWS Secrets Manager secret where your Kantar credentials are stored. Note that
     *        your MediaConvert service role must provide access to this secret. For more information, see
     *        https://docs.aws
     *        .amazon.com/mediaconvert/latest/ug/granting-permissions-for-mediaconvert-to-access-secrets-
     *        manager-secret.html. For instructions on creating a secret, see
     *        https://docs.aws.amazon.com/secretsmanager/latest/userguide/tutorials_basic.html, in the AWS Secrets
     *        Manager User Guide.
     */

    public void setCredentialsSecretName(String credentialsSecretName) {
        this.credentialsSecretName = credentialsSecretName;
    }

    /**
     * Provide the name of the AWS Secrets Manager secret where your Kantar credentials are stored. Note that your
     * MediaConvert service role must provide access to this secret. For more information, see
     * https://docs.aws.amazon.com
     * /mediaconvert/latest/ug/granting-permissions-for-mediaconvert-to-access-secrets-manager-secret.html. For
     * instructions on creating a secret, see
     * https://docs.aws.amazon.com/secretsmanager/latest/userguide/tutorials_basic.html, in the AWS Secrets Manager User
     * Guide.
     * 
     * @return Provide the name of the AWS Secrets Manager secret where your Kantar credentials are stored. Note that
     *         your MediaConvert service role must provide access to this secret. For more information, see
     *         https://docs.
     *         aws.amazon.com/mediaconvert/latest/ug/granting-permissions-for-mediaconvert-to-access-secrets
     *         -manager-secret.html. For instructions on creating a secret, see
     *         https://docs.aws.amazon.com/secretsmanager/latest/userguide/tutorials_basic.html, in the AWS Secrets
     *         Manager User Guide.
     */

    public String getCredentialsSecretName() {
        return this.credentialsSecretName;
    }

    /**
     * Provide the name of the AWS Secrets Manager secret where your Kantar credentials are stored. Note that your
     * MediaConvert service role must provide access to this secret. For more information, see
     * https://docs.aws.amazon.com
     * /mediaconvert/latest/ug/granting-permissions-for-mediaconvert-to-access-secrets-manager-secret.html. For
     * instructions on creating a secret, see
     * https://docs.aws.amazon.com/secretsmanager/latest/userguide/tutorials_basic.html, in the AWS Secrets Manager User
     * Guide.
     * 
     * @param credentialsSecretName
     *        Provide the name of the AWS Secrets Manager secret where your Kantar credentials are stored. Note that
     *        your MediaConvert service role must provide access to this secret. For more information, see
     *        https://docs.aws
     *        .amazon.com/mediaconvert/latest/ug/granting-permissions-for-mediaconvert-to-access-secrets-
     *        manager-secret.html. For instructions on creating a secret, see
     *        https://docs.aws.amazon.com/secretsmanager/latest/userguide/tutorials_basic.html, in the AWS Secrets
     *        Manager User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KantarWatermarkSettings withCredentialsSecretName(String credentialsSecretName) {
        setCredentialsSecretName(credentialsSecretName);
        return this;
    }

    /**
     * Optional. Specify an offset, in whole seconds, from the start of your output and the beginning of the
     * watermarking. When you don't specify an offset, Kantar defaults to zero.
     * 
     * @param fileOffset
     *        Optional. Specify an offset, in whole seconds, from the start of your output and the beginning of the
     *        watermarking. When you don't specify an offset, Kantar defaults to zero.
     */

    public void setFileOffset(Double fileOffset) {
        this.fileOffset = fileOffset;
    }

    /**
     * Optional. Specify an offset, in whole seconds, from the start of your output and the beginning of the
     * watermarking. When you don't specify an offset, Kantar defaults to zero.
     * 
     * @return Optional. Specify an offset, in whole seconds, from the start of your output and the beginning of the
     *         watermarking. When you don't specify an offset, Kantar defaults to zero.
     */

    public Double getFileOffset() {
        return this.fileOffset;
    }

    /**
     * Optional. Specify an offset, in whole seconds, from the start of your output and the beginning of the
     * watermarking. When you don't specify an offset, Kantar defaults to zero.
     * 
     * @param fileOffset
     *        Optional. Specify an offset, in whole seconds, from the start of your output and the beginning of the
     *        watermarking. When you don't specify an offset, Kantar defaults to zero.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KantarWatermarkSettings withFileOffset(Double fileOffset) {
        setFileOffset(fileOffset);
        return this;
    }

    /**
     * Provide your Kantar license ID number. You should get this number from Kantar.
     * 
     * @param kantarLicenseId
     *        Provide your Kantar license ID number. You should get this number from Kantar.
     */

    public void setKantarLicenseId(Integer kantarLicenseId) {
        this.kantarLicenseId = kantarLicenseId;
    }

    /**
     * Provide your Kantar license ID number. You should get this number from Kantar.
     * 
     * @return Provide your Kantar license ID number. You should get this number from Kantar.
     */

    public Integer getKantarLicenseId() {
        return this.kantarLicenseId;
    }

    /**
     * Provide your Kantar license ID number. You should get this number from Kantar.
     * 
     * @param kantarLicenseId
     *        Provide your Kantar license ID number. You should get this number from Kantar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KantarWatermarkSettings withKantarLicenseId(Integer kantarLicenseId) {
        setKantarLicenseId(kantarLicenseId);
        return this;
    }

    /**
     * Provide the HTTPS endpoint to the Kantar server. You should get this endpoint from Kantar.
     * 
     * @param kantarServerUrl
     *        Provide the HTTPS endpoint to the Kantar server. You should get this endpoint from Kantar.
     */

    public void setKantarServerUrl(String kantarServerUrl) {
        this.kantarServerUrl = kantarServerUrl;
    }

    /**
     * Provide the HTTPS endpoint to the Kantar server. You should get this endpoint from Kantar.
     * 
     * @return Provide the HTTPS endpoint to the Kantar server. You should get this endpoint from Kantar.
     */

    public String getKantarServerUrl() {
        return this.kantarServerUrl;
    }

    /**
     * Provide the HTTPS endpoint to the Kantar server. You should get this endpoint from Kantar.
     * 
     * @param kantarServerUrl
     *        Provide the HTTPS endpoint to the Kantar server. You should get this endpoint from Kantar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KantarWatermarkSettings withKantarServerUrl(String kantarServerUrl) {
        setKantarServerUrl(kantarServerUrl);
        return this;
    }

    /**
     * Optional. Specify the Amazon S3 bucket where you want MediaConvert to store your Kantar watermark XML logs. When
     * you don't specify a bucket, MediaConvert doesn't save these logs. Note that your MediaConvert service role must
     * provide access to this location. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     * 
     * @param logDestination
     *        Optional. Specify the Amazon S3 bucket where you want MediaConvert to store your Kantar watermark XML
     *        logs. When you don't specify a bucket, MediaConvert doesn't save these logs. Note that your MediaConvert
     *        service role must provide access to this location. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     */

    public void setLogDestination(String logDestination) {
        this.logDestination = logDestination;
    }

    /**
     * Optional. Specify the Amazon S3 bucket where you want MediaConvert to store your Kantar watermark XML logs. When
     * you don't specify a bucket, MediaConvert doesn't save these logs. Note that your MediaConvert service role must
     * provide access to this location. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     * 
     * @return Optional. Specify the Amazon S3 bucket where you want MediaConvert to store your Kantar watermark XML
     *         logs. When you don't specify a bucket, MediaConvert doesn't save these logs. Note that your MediaConvert
     *         service role must provide access to this location. For more information, see
     *         https://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     */

    public String getLogDestination() {
        return this.logDestination;
    }

    /**
     * Optional. Specify the Amazon S3 bucket where you want MediaConvert to store your Kantar watermark XML logs. When
     * you don't specify a bucket, MediaConvert doesn't save these logs. Note that your MediaConvert service role must
     * provide access to this location. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     * 
     * @param logDestination
     *        Optional. Specify the Amazon S3 bucket where you want MediaConvert to store your Kantar watermark XML
     *        logs. When you don't specify a bucket, MediaConvert doesn't save these logs. Note that your MediaConvert
     *        service role must provide access to this location. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KantarWatermarkSettings withLogDestination(String logDestination) {
        setLogDestination(logDestination);
        return this;
    }

    /**
     * You can optionally use this field to specify the first timestamp that Kantar embeds during watermarking. Kantar
     * suggests that you be very cautious when using this Kantar feature, and that you use it only on channels that are
     * managed specifically for use with this feature by your Audience Measurement Operator. For more information about
     * this feature, contact Kantar technical support.
     * 
     * @param metadata3
     *        You can optionally use this field to specify the first timestamp that Kantar embeds during watermarking.
     *        Kantar suggests that you be very cautious when using this Kantar feature, and that you use it only on
     *        channels that are managed specifically for use with this feature by your Audience Measurement Operator.
     *        For more information about this feature, contact Kantar technical support.
     */

    public void setMetadata3(String metadata3) {
        this.metadata3 = metadata3;
    }

    /**
     * You can optionally use this field to specify the first timestamp that Kantar embeds during watermarking. Kantar
     * suggests that you be very cautious when using this Kantar feature, and that you use it only on channels that are
     * managed specifically for use with this feature by your Audience Measurement Operator. For more information about
     * this feature, contact Kantar technical support.
     * 
     * @return You can optionally use this field to specify the first timestamp that Kantar embeds during watermarking.
     *         Kantar suggests that you be very cautious when using this Kantar feature, and that you use it only on
     *         channels that are managed specifically for use with this feature by your Audience Measurement Operator.
     *         For more information about this feature, contact Kantar technical support.
     */

    public String getMetadata3() {
        return this.metadata3;
    }

    /**
     * You can optionally use this field to specify the first timestamp that Kantar embeds during watermarking. Kantar
     * suggests that you be very cautious when using this Kantar feature, and that you use it only on channels that are
     * managed specifically for use with this feature by your Audience Measurement Operator. For more information about
     * this feature, contact Kantar technical support.
     * 
     * @param metadata3
     *        You can optionally use this field to specify the first timestamp that Kantar embeds during watermarking.
     *        Kantar suggests that you be very cautious when using this Kantar feature, and that you use it only on
     *        channels that are managed specifically for use with this feature by your Audience Measurement Operator.
     *        For more information about this feature, contact Kantar technical support.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KantarWatermarkSettings withMetadata3(String metadata3) {
        setMetadata3(metadata3);
        return this;
    }

    /**
     * Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     * 
     * @param metadata4
     *        Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     */

    public void setMetadata4(String metadata4) {
        this.metadata4 = metadata4;
    }

    /**
     * Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     * 
     * @return Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     */

    public String getMetadata4() {
        return this.metadata4;
    }

    /**
     * Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     * 
     * @param metadata4
     *        Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KantarWatermarkSettings withMetadata4(String metadata4) {
        setMetadata4(metadata4);
        return this;
    }

    /**
     * Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     * 
     * @param metadata5
     *        Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     */

    public void setMetadata5(String metadata5) {
        this.metadata5 = metadata5;
    }

    /**
     * Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     * 
     * @return Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     */

    public String getMetadata5() {
        return this.metadata5;
    }

    /**
     * Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     * 
     * @param metadata5
     *        Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KantarWatermarkSettings withMetadata5(String metadata5) {
        setMetadata5(metadata5);
        return this;
    }

    /**
     * Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     * 
     * @param metadata6
     *        Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     */

    public void setMetadata6(String metadata6) {
        this.metadata6 = metadata6;
    }

    /**
     * Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     * 
     * @return Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     */

    public String getMetadata6() {
        return this.metadata6;
    }

    /**
     * Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     * 
     * @param metadata6
     *        Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KantarWatermarkSettings withMetadata6(String metadata6) {
        setMetadata6(metadata6);
        return this;
    }

    /**
     * Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     * 
     * @param metadata7
     *        Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     */

    public void setMetadata7(String metadata7) {
        this.metadata7 = metadata7;
    }

    /**
     * Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     * 
     * @return Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     */

    public String getMetadata7() {
        return this.metadata7;
    }

    /**
     * Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     * 
     * @param metadata7
     *        Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KantarWatermarkSettings withMetadata7(String metadata7) {
        setMetadata7(metadata7);
        return this;
    }

    /**
     * Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     * 
     * @param metadata8
     *        Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     */

    public void setMetadata8(String metadata8) {
        this.metadata8 = metadata8;
    }

    /**
     * Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     * 
     * @return Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     */

    public String getMetadata8() {
        return this.metadata8;
    }

    /**
     * Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     * 
     * @param metadata8
     *        Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KantarWatermarkSettings withMetadata8(String metadata8) {
        setMetadata8(metadata8);
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
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getContentReference() != null)
            sb.append("ContentReference: ").append(getContentReference()).append(",");
        if (getCredentialsSecretName() != null)
            sb.append("CredentialsSecretName: ").append(getCredentialsSecretName()).append(",");
        if (getFileOffset() != null)
            sb.append("FileOffset: ").append(getFileOffset()).append(",");
        if (getKantarLicenseId() != null)
            sb.append("KantarLicenseId: ").append(getKantarLicenseId()).append(",");
        if (getKantarServerUrl() != null)
            sb.append("KantarServerUrl: ").append(getKantarServerUrl()).append(",");
        if (getLogDestination() != null)
            sb.append("LogDestination: ").append(getLogDestination()).append(",");
        if (getMetadata3() != null)
            sb.append("Metadata3: ").append(getMetadata3()).append(",");
        if (getMetadata4() != null)
            sb.append("Metadata4: ").append(getMetadata4()).append(",");
        if (getMetadata5() != null)
            sb.append("Metadata5: ").append(getMetadata5()).append(",");
        if (getMetadata6() != null)
            sb.append("Metadata6: ").append(getMetadata6()).append(",");
        if (getMetadata7() != null)
            sb.append("Metadata7: ").append(getMetadata7()).append(",");
        if (getMetadata8() != null)
            sb.append("Metadata8: ").append(getMetadata8());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KantarWatermarkSettings == false)
            return false;
        KantarWatermarkSettings other = (KantarWatermarkSettings) obj;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getContentReference() == null ^ this.getContentReference() == null)
            return false;
        if (other.getContentReference() != null && other.getContentReference().equals(this.getContentReference()) == false)
            return false;
        if (other.getCredentialsSecretName() == null ^ this.getCredentialsSecretName() == null)
            return false;
        if (other.getCredentialsSecretName() != null && other.getCredentialsSecretName().equals(this.getCredentialsSecretName()) == false)
            return false;
        if (other.getFileOffset() == null ^ this.getFileOffset() == null)
            return false;
        if (other.getFileOffset() != null && other.getFileOffset().equals(this.getFileOffset()) == false)
            return false;
        if (other.getKantarLicenseId() == null ^ this.getKantarLicenseId() == null)
            return false;
        if (other.getKantarLicenseId() != null && other.getKantarLicenseId().equals(this.getKantarLicenseId()) == false)
            return false;
        if (other.getKantarServerUrl() == null ^ this.getKantarServerUrl() == null)
            return false;
        if (other.getKantarServerUrl() != null && other.getKantarServerUrl().equals(this.getKantarServerUrl()) == false)
            return false;
        if (other.getLogDestination() == null ^ this.getLogDestination() == null)
            return false;
        if (other.getLogDestination() != null && other.getLogDestination().equals(this.getLogDestination()) == false)
            return false;
        if (other.getMetadata3() == null ^ this.getMetadata3() == null)
            return false;
        if (other.getMetadata3() != null && other.getMetadata3().equals(this.getMetadata3()) == false)
            return false;
        if (other.getMetadata4() == null ^ this.getMetadata4() == null)
            return false;
        if (other.getMetadata4() != null && other.getMetadata4().equals(this.getMetadata4()) == false)
            return false;
        if (other.getMetadata5() == null ^ this.getMetadata5() == null)
            return false;
        if (other.getMetadata5() != null && other.getMetadata5().equals(this.getMetadata5()) == false)
            return false;
        if (other.getMetadata6() == null ^ this.getMetadata6() == null)
            return false;
        if (other.getMetadata6() != null && other.getMetadata6().equals(this.getMetadata6()) == false)
            return false;
        if (other.getMetadata7() == null ^ this.getMetadata7() == null)
            return false;
        if (other.getMetadata7() != null && other.getMetadata7().equals(this.getMetadata7()) == false)
            return false;
        if (other.getMetadata8() == null ^ this.getMetadata8() == null)
            return false;
        if (other.getMetadata8() != null && other.getMetadata8().equals(this.getMetadata8()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getContentReference() == null) ? 0 : getContentReference().hashCode());
        hashCode = prime * hashCode + ((getCredentialsSecretName() == null) ? 0 : getCredentialsSecretName().hashCode());
        hashCode = prime * hashCode + ((getFileOffset() == null) ? 0 : getFileOffset().hashCode());
        hashCode = prime * hashCode + ((getKantarLicenseId() == null) ? 0 : getKantarLicenseId().hashCode());
        hashCode = prime * hashCode + ((getKantarServerUrl() == null) ? 0 : getKantarServerUrl().hashCode());
        hashCode = prime * hashCode + ((getLogDestination() == null) ? 0 : getLogDestination().hashCode());
        hashCode = prime * hashCode + ((getMetadata3() == null) ? 0 : getMetadata3().hashCode());
        hashCode = prime * hashCode + ((getMetadata4() == null) ? 0 : getMetadata4().hashCode());
        hashCode = prime * hashCode + ((getMetadata5() == null) ? 0 : getMetadata5().hashCode());
        hashCode = prime * hashCode + ((getMetadata6() == null) ? 0 : getMetadata6().hashCode());
        hashCode = prime * hashCode + ((getMetadata7() == null) ? 0 : getMetadata7().hashCode());
        hashCode = prime * hashCode + ((getMetadata8() == null) ? 0 : getMetadata8().hashCode());
        return hashCode;
    }

    @Override
    public KantarWatermarkSettings clone() {
        try {
            return (KantarWatermarkSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.KantarWatermarkSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
