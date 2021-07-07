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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateMediaCapturePipeline" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMediaCapturePipelineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Source type from which the media artifacts will be captured. A Chime SDK Meeting is the only supported source.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * ARN of the source from which the media artifacts are captured.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * Destination type to which the media artifacts are saved. You must use an S3 bucket.
     * </p>
     */
    private String sinkType;
    /**
     * <p>
     * The ARN of the sink type.
     * </p>
     */
    private String sinkArn;
    /**
     * <p>
     * The token assigned to the client making the pipeline request.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * Source type from which the media artifacts will be captured. A Chime SDK Meeting is the only supported source.
     * </p>
     * 
     * @param sourceType
     *        Source type from which the media artifacts will be captured. A Chime SDK Meeting is the only supported
     *        source.
     * @see MediaPipelineSourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * Source type from which the media artifacts will be captured. A Chime SDK Meeting is the only supported source.
     * </p>
     * 
     * @return Source type from which the media artifacts will be captured. A Chime SDK Meeting is the only supported
     *         source.
     * @see MediaPipelineSourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * Source type from which the media artifacts will be captured. A Chime SDK Meeting is the only supported source.
     * </p>
     * 
     * @param sourceType
     *        Source type from which the media artifacts will be captured. A Chime SDK Meeting is the only supported
     *        source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineSourceType
     */

    public CreateMediaCapturePipelineRequest withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * Source type from which the media artifacts will be captured. A Chime SDK Meeting is the only supported source.
     * </p>
     * 
     * @param sourceType
     *        Source type from which the media artifacts will be captured. A Chime SDK Meeting is the only supported
     *        source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineSourceType
     */

    public CreateMediaCapturePipelineRequest withSourceType(MediaPipelineSourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * ARN of the source from which the media artifacts are captured.
     * </p>
     * 
     * @param sourceArn
     *        ARN of the source from which the media artifacts are captured.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * ARN of the source from which the media artifacts are captured.
     * </p>
     * 
     * @return ARN of the source from which the media artifacts are captured.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * ARN of the source from which the media artifacts are captured.
     * </p>
     * 
     * @param sourceArn
     *        ARN of the source from which the media artifacts are captured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaCapturePipelineRequest withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * Destination type to which the media artifacts are saved. You must use an S3 bucket.
     * </p>
     * 
     * @param sinkType
     *        Destination type to which the media artifacts are saved. You must use an S3 bucket.
     * @see MediaPipelineSinkType
     */

    public void setSinkType(String sinkType) {
        this.sinkType = sinkType;
    }

    /**
     * <p>
     * Destination type to which the media artifacts are saved. You must use an S3 bucket.
     * </p>
     * 
     * @return Destination type to which the media artifacts are saved. You must use an S3 bucket.
     * @see MediaPipelineSinkType
     */

    public String getSinkType() {
        return this.sinkType;
    }

    /**
     * <p>
     * Destination type to which the media artifacts are saved. You must use an S3 bucket.
     * </p>
     * 
     * @param sinkType
     *        Destination type to which the media artifacts are saved. You must use an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineSinkType
     */

    public CreateMediaCapturePipelineRequest withSinkType(String sinkType) {
        setSinkType(sinkType);
        return this;
    }

    /**
     * <p>
     * Destination type to which the media artifacts are saved. You must use an S3 bucket.
     * </p>
     * 
     * @param sinkType
     *        Destination type to which the media artifacts are saved. You must use an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineSinkType
     */

    public CreateMediaCapturePipelineRequest withSinkType(MediaPipelineSinkType sinkType) {
        this.sinkType = sinkType.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the sink type.
     * </p>
     * 
     * @param sinkArn
     *        The ARN of the sink type.
     */

    public void setSinkArn(String sinkArn) {
        this.sinkArn = sinkArn;
    }

    /**
     * <p>
     * The ARN of the sink type.
     * </p>
     * 
     * @return The ARN of the sink type.
     */

    public String getSinkArn() {
        return this.sinkArn;
    }

    /**
     * <p>
     * The ARN of the sink type.
     * </p>
     * 
     * @param sinkArn
     *        The ARN of the sink type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaCapturePipelineRequest withSinkArn(String sinkArn) {
        setSinkArn(sinkArn);
        return this;
    }

    /**
     * <p>
     * The token assigned to the client making the pipeline request.
     * </p>
     * 
     * @param clientRequestToken
     *        The token assigned to the client making the pipeline request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The token assigned to the client making the pipeline request.
     * </p>
     * 
     * @return The token assigned to the client making the pipeline request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The token assigned to the client making the pipeline request.
     * </p>
     * 
     * @param clientRequestToken
     *        The token assigned to the client making the pipeline request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaCapturePipelineRequest withClientRequestToken(String clientRequestToken) {
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
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getSinkType() != null)
            sb.append("SinkType: ").append(getSinkType()).append(",");
        if (getSinkArn() != null)
            sb.append("SinkArn: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof CreateMediaCapturePipelineRequest == false)
            return false;
        CreateMediaCapturePipelineRequest other = (CreateMediaCapturePipelineRequest) obj;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getSinkType() == null ^ this.getSinkType() == null)
            return false;
        if (other.getSinkType() != null && other.getSinkType().equals(this.getSinkType()) == false)
            return false;
        if (other.getSinkArn() == null ^ this.getSinkArn() == null)
            return false;
        if (other.getSinkArn() != null && other.getSinkArn().equals(this.getSinkArn()) == false)
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

        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getSinkType() == null) ? 0 : getSinkType().hashCode());
        hashCode = prime * hashCode + ((getSinkArn() == null) ? 0 : getSinkArn().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateMediaCapturePipelineRequest clone() {
        return (CreateMediaCapturePipelineRequest) super.clone();
    }

}
