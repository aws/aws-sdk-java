/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elastictranscoder.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#createPipeline(CreatePipelineRequest) CreatePipeline operation}.
 * <p>
 * To create a pipeline, send a POST request to the <code>2012-09-25/pipelines</code> resource.
 * </p>
 *
 * @see com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#createPipeline(CreatePipelineRequest)
 */
public class CreatePipelineRequest extends AmazonWebServiceRequest {

    /**
     * The name of the pipeline. We recommend that the name be unique within
     * the AWS account, but uniqueness is not enforced. <p>Constraints:
     * Maximum 40 characters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     */
    private String name;

    /**
     * The Amazon S3 bucket in which you saved the media files that you want
     * to transcode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String inputBucket;

    /**
     * The Amazon S3 bucket in which you want Elastic Transcoder to save the
     * transcoded files.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String outputBucket;

    /**
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     * Transcoder to use to create the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:iam::\w{12}:role/.+$<br/>
     */
    private String role;

    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic that you
     * want to notify to report job status. <important>To receive
     * notifications, you must also subscribe to the new topic in the Amazon
     * SNS console.</important> <ul> <li><b>Progressing</b>: The Amazon
     * Simple Notification Service (Amazon SNS) topic that you want to notify
     * when Elastic Transcoder has started to process the job.</li>
     * <li><b>Completed</b>: The Amazon SNS topic that you want to notify
     * when Elastic Transcoder has finished processing the job.</li>
     * <li><b>Warning</b>: The Amazon SNS topic that you want to notify when
     * Elastic Transcoder encounters a warning condition.</li>
     * <li><b>Error</b>: The Amazon SNS topic that you want to notify when
     * Elastic Transcoder encounters an error condition.</li> </ul>
     */
    private Notifications notifications;

    /**
     * The name of the pipeline. We recommend that the name be unique within
     * the AWS account, but uniqueness is not enforced. <p>Constraints:
     * Maximum 40 characters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @return The name of the pipeline. We recommend that the name be unique within
     *         the AWS account, but uniqueness is not enforced. <p>Constraints:
     *         Maximum 40 characters.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the pipeline. We recommend that the name be unique within
     * the AWS account, but uniqueness is not enforced. <p>Constraints:
     * Maximum 40 characters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param name The name of the pipeline. We recommend that the name be unique within
     *         the AWS account, but uniqueness is not enforced. <p>Constraints:
     *         Maximum 40 characters.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the pipeline. We recommend that the name be unique within
     * the AWS account, but uniqueness is not enforced. <p>Constraints:
     * Maximum 40 characters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param name The name of the pipeline. We recommend that the name be unique within
     *         the AWS account, but uniqueness is not enforced. <p>Constraints:
     *         Maximum 40 characters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreatePipelineRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * The Amazon S3 bucket in which you saved the media files that you want
     * to transcode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The Amazon S3 bucket in which you saved the media files that you want
     *         to transcode.
     */
    public String getInputBucket() {
        return inputBucket;
    }
    
    /**
     * The Amazon S3 bucket in which you saved the media files that you want
     * to transcode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param inputBucket The Amazon S3 bucket in which you saved the media files that you want
     *         to transcode.
     */
    public void setInputBucket(String inputBucket) {
        this.inputBucket = inputBucket;
    }
    
    /**
     * The Amazon S3 bucket in which you saved the media files that you want
     * to transcode.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param inputBucket The Amazon S3 bucket in which you saved the media files that you want
     *         to transcode.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreatePipelineRequest withInputBucket(String inputBucket) {
        this.inputBucket = inputBucket;
        return this;
    }
    
    
    /**
     * The Amazon S3 bucket in which you want Elastic Transcoder to save the
     * transcoded files.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The Amazon S3 bucket in which you want Elastic Transcoder to save the
     *         transcoded files.
     */
    public String getOutputBucket() {
        return outputBucket;
    }
    
    /**
     * The Amazon S3 bucket in which you want Elastic Transcoder to save the
     * transcoded files.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param outputBucket The Amazon S3 bucket in which you want Elastic Transcoder to save the
     *         transcoded files.
     */
    public void setOutputBucket(String outputBucket) {
        this.outputBucket = outputBucket;
    }
    
    /**
     * The Amazon S3 bucket in which you want Elastic Transcoder to save the
     * transcoded files.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param outputBucket The Amazon S3 bucket in which you want Elastic Transcoder to save the
     *         transcoded files.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreatePipelineRequest withOutputBucket(String outputBucket) {
        this.outputBucket = outputBucket;
        return this;
    }
    
    
    /**
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     * Transcoder to use to create the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:iam::\w{12}:role/.+$<br/>
     *
     * @return The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     *         Transcoder to use to create the pipeline.
     */
    public String getRole() {
        return role;
    }
    
    /**
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     * Transcoder to use to create the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:iam::\w{12}:role/.+$<br/>
     *
     * @param role The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     *         Transcoder to use to create the pipeline.
     */
    public void setRole(String role) {
        this.role = role;
    }
    
    /**
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     * Transcoder to use to create the pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:iam::\w{12}:role/.+$<br/>
     *
     * @param role The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     *         Transcoder to use to create the pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreatePipelineRequest withRole(String role) {
        this.role = role;
        return this;
    }
    
    
    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic that you
     * want to notify to report job status. <important>To receive
     * notifications, you must also subscribe to the new topic in the Amazon
     * SNS console.</important> <ul> <li><b>Progressing</b>: The Amazon
     * Simple Notification Service (Amazon SNS) topic that you want to notify
     * when Elastic Transcoder has started to process the job.</li>
     * <li><b>Completed</b>: The Amazon SNS topic that you want to notify
     * when Elastic Transcoder has finished processing the job.</li>
     * <li><b>Warning</b>: The Amazon SNS topic that you want to notify when
     * Elastic Transcoder encounters a warning condition.</li>
     * <li><b>Error</b>: The Amazon SNS topic that you want to notify when
     * Elastic Transcoder encounters an error condition.</li> </ul>
     *
     * @return The Amazon Simple Notification Service (Amazon SNS) topic that you
     *         want to notify to report job status. <important>To receive
     *         notifications, you must also subscribe to the new topic in the Amazon
     *         SNS console.</important> <ul> <li><b>Progressing</b>: The Amazon
     *         Simple Notification Service (Amazon SNS) topic that you want to notify
     *         when Elastic Transcoder has started to process the job.</li>
     *         <li><b>Completed</b>: The Amazon SNS topic that you want to notify
     *         when Elastic Transcoder has finished processing the job.</li>
     *         <li><b>Warning</b>: The Amazon SNS topic that you want to notify when
     *         Elastic Transcoder encounters a warning condition.</li>
     *         <li><b>Error</b>: The Amazon SNS topic that you want to notify when
     *         Elastic Transcoder encounters an error condition.</li> </ul>
     */
    public Notifications getNotifications() {
        return notifications;
    }
    
    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic that you
     * want to notify to report job status. <important>To receive
     * notifications, you must also subscribe to the new topic in the Amazon
     * SNS console.</important> <ul> <li><b>Progressing</b>: The Amazon
     * Simple Notification Service (Amazon SNS) topic that you want to notify
     * when Elastic Transcoder has started to process the job.</li>
     * <li><b>Completed</b>: The Amazon SNS topic that you want to notify
     * when Elastic Transcoder has finished processing the job.</li>
     * <li><b>Warning</b>: The Amazon SNS topic that you want to notify when
     * Elastic Transcoder encounters a warning condition.</li>
     * <li><b>Error</b>: The Amazon SNS topic that you want to notify when
     * Elastic Transcoder encounters an error condition.</li> </ul>
     *
     * @param notifications The Amazon Simple Notification Service (Amazon SNS) topic that you
     *         want to notify to report job status. <important>To receive
     *         notifications, you must also subscribe to the new topic in the Amazon
     *         SNS console.</important> <ul> <li><b>Progressing</b>: The Amazon
     *         Simple Notification Service (Amazon SNS) topic that you want to notify
     *         when Elastic Transcoder has started to process the job.</li>
     *         <li><b>Completed</b>: The Amazon SNS topic that you want to notify
     *         when Elastic Transcoder has finished processing the job.</li>
     *         <li><b>Warning</b>: The Amazon SNS topic that you want to notify when
     *         Elastic Transcoder encounters a warning condition.</li>
     *         <li><b>Error</b>: The Amazon SNS topic that you want to notify when
     *         Elastic Transcoder encounters an error condition.</li> </ul>
     */
    public void setNotifications(Notifications notifications) {
        this.notifications = notifications;
    }
    
    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic that you
     * want to notify to report job status. <important>To receive
     * notifications, you must also subscribe to the new topic in the Amazon
     * SNS console.</important> <ul> <li><b>Progressing</b>: The Amazon
     * Simple Notification Service (Amazon SNS) topic that you want to notify
     * when Elastic Transcoder has started to process the job.</li>
     * <li><b>Completed</b>: The Amazon SNS topic that you want to notify
     * when Elastic Transcoder has finished processing the job.</li>
     * <li><b>Warning</b>: The Amazon SNS topic that you want to notify when
     * Elastic Transcoder encounters a warning condition.</li>
     * <li><b>Error</b>: The Amazon SNS topic that you want to notify when
     * Elastic Transcoder encounters an error condition.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notifications The Amazon Simple Notification Service (Amazon SNS) topic that you
     *         want to notify to report job status. <important>To receive
     *         notifications, you must also subscribe to the new topic in the Amazon
     *         SNS console.</important> <ul> <li><b>Progressing</b>: The Amazon
     *         Simple Notification Service (Amazon SNS) topic that you want to notify
     *         when Elastic Transcoder has started to process the job.</li>
     *         <li><b>Completed</b>: The Amazon SNS topic that you want to notify
     *         when Elastic Transcoder has finished processing the job.</li>
     *         <li><b>Warning</b>: The Amazon SNS topic that you want to notify when
     *         Elastic Transcoder encounters a warning condition.</li>
     *         <li><b>Error</b>: The Amazon SNS topic that you want to notify when
     *         Elastic Transcoder encounters an error condition.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreatePipelineRequest withNotifications(Notifications notifications) {
        this.notifications = notifications;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ", ");
        if (getInputBucket() != null) sb.append("InputBucket: " + getInputBucket() + ", ");
        if (getOutputBucket() != null) sb.append("OutputBucket: " + getOutputBucket() + ", ");
        if (getRole() != null) sb.append("Role: " + getRole() + ", ");
        if (getNotifications() != null) sb.append("Notifications: " + getNotifications() + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getInputBucket() == null) ? 0 : getInputBucket().hashCode()); 
        hashCode = prime * hashCode + ((getOutputBucket() == null) ? 0 : getOutputBucket().hashCode()); 
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode()); 
        hashCode = prime * hashCode + ((getNotifications() == null) ? 0 : getNotifications().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreatePipelineRequest == false) return false;
        CreatePipelineRequest other = (CreatePipelineRequest)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getInputBucket() == null ^ this.getInputBucket() == null) return false;
        if (other.getInputBucket() != null && other.getInputBucket().equals(this.getInputBucket()) == false) return false; 
        if (other.getOutputBucket() == null ^ this.getOutputBucket() == null) return false;
        if (other.getOutputBucket() != null && other.getOutputBucket().equals(this.getOutputBucket()) == false) return false; 
        if (other.getRole() == null ^ this.getRole() == null) return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false) return false; 
        if (other.getNotifications() == null ^ this.getNotifications() == null) return false;
        if (other.getNotifications() != null && other.getNotifications().equals(this.getNotifications()) == false) return false; 
        return true;
    }
    
}
    