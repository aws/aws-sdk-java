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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/StartVoiceToneAnalysisTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartVoiceToneAnalysisTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the resource to be updated. Valid values include the ID and ARN of the media insights
     * pipeline.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The language code.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The task configuration for the Kinesis video stream source of the media insights pipeline.
     * </p>
     */
    private KinesisVideoStreamSourceTaskConfiguration kinesisVideoStreamSourceTaskConfiguration;
    /**
     * <p>
     * The unique identifier for the client request. Use a different token for different voice tone analysis tasks.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The unique identifier of the resource to be updated. Valid values include the ID and ARN of the media insights
     * pipeline.
     * </p>
     * 
     * @param identifier
     *        The unique identifier of the resource to be updated. Valid values include the ID and ARN of the media
     *        insights pipeline.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The unique identifier of the resource to be updated. Valid values include the ID and ARN of the media insights
     * pipeline.
     * </p>
     * 
     * @return The unique identifier of the resource to be updated. Valid values include the ID and ARN of the media
     *         insights pipeline.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The unique identifier of the resource to be updated. Valid values include the ID and ARN of the media insights
     * pipeline.
     * </p>
     * 
     * @param identifier
     *        The unique identifier of the resource to be updated. Valid values include the ID and ARN of the media
     *        insights pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartVoiceToneAnalysisTaskRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * 
     * @param languageCode
     *        The language code.
     * @see VoiceAnalyticsLanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * 
     * @return The language code.
     * @see VoiceAnalyticsLanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * 
     * @param languageCode
     *        The language code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceAnalyticsLanguageCode
     */

    public StartVoiceToneAnalysisTaskRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * 
     * @param languageCode
     *        The language code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceAnalyticsLanguageCode
     */

    public StartVoiceToneAnalysisTaskRequest withLanguageCode(VoiceAnalyticsLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The task configuration for the Kinesis video stream source of the media insights pipeline.
     * </p>
     * 
     * @param kinesisVideoStreamSourceTaskConfiguration
     *        The task configuration for the Kinesis video stream source of the media insights pipeline.
     */

    public void setKinesisVideoStreamSourceTaskConfiguration(KinesisVideoStreamSourceTaskConfiguration kinesisVideoStreamSourceTaskConfiguration) {
        this.kinesisVideoStreamSourceTaskConfiguration = kinesisVideoStreamSourceTaskConfiguration;
    }

    /**
     * <p>
     * The task configuration for the Kinesis video stream source of the media insights pipeline.
     * </p>
     * 
     * @return The task configuration for the Kinesis video stream source of the media insights pipeline.
     */

    public KinesisVideoStreamSourceTaskConfiguration getKinesisVideoStreamSourceTaskConfiguration() {
        return this.kinesisVideoStreamSourceTaskConfiguration;
    }

    /**
     * <p>
     * The task configuration for the Kinesis video stream source of the media insights pipeline.
     * </p>
     * 
     * @param kinesisVideoStreamSourceTaskConfiguration
     *        The task configuration for the Kinesis video stream source of the media insights pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartVoiceToneAnalysisTaskRequest withKinesisVideoStreamSourceTaskConfiguration(
            KinesisVideoStreamSourceTaskConfiguration kinesisVideoStreamSourceTaskConfiguration) {
        setKinesisVideoStreamSourceTaskConfiguration(kinesisVideoStreamSourceTaskConfiguration);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the client request. Use a different token for different voice tone analysis tasks.
     * </p>
     * 
     * @param clientRequestToken
     *        The unique identifier for the client request. Use a different token for different voice tone analysis
     *        tasks.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The unique identifier for the client request. Use a different token for different voice tone analysis tasks.
     * </p>
     * 
     * @return The unique identifier for the client request. Use a different token for different voice tone analysis
     *         tasks.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The unique identifier for the client request. Use a different token for different voice tone analysis tasks.
     * </p>
     * 
     * @param clientRequestToken
     *        The unique identifier for the client request. Use a different token for different voice tone analysis
     *        tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartVoiceToneAnalysisTaskRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getKinesisVideoStreamSourceTaskConfiguration() != null)
            sb.append("KinesisVideoStreamSourceTaskConfiguration: ").append(getKinesisVideoStreamSourceTaskConfiguration()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartVoiceToneAnalysisTaskRequest == false)
            return false;
        StartVoiceToneAnalysisTaskRequest other = (StartVoiceToneAnalysisTaskRequest) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getKinesisVideoStreamSourceTaskConfiguration() == null ^ this.getKinesisVideoStreamSourceTaskConfiguration() == null)
            return false;
        if (other.getKinesisVideoStreamSourceTaskConfiguration() != null
                && other.getKinesisVideoStreamSourceTaskConfiguration().equals(this.getKinesisVideoStreamSourceTaskConfiguration()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getKinesisVideoStreamSourceTaskConfiguration() == null) ? 0 : getKinesisVideoStreamSourceTaskConfiguration().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public StartVoiceToneAnalysisTaskRequest clone() {
        return (StartVoiceToneAnalysisTaskRequest) super.clone();
    }

}
