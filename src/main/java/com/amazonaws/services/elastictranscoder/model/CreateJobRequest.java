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
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#createJob(CreateJobRequest) CreateJob operation}.
 * <p>
 * To create a job, send a POST request to the <code>/2012-09-25/jobs</code> resource.
 * </p>
 * <p>
 * When you create a job, Elastic Transcoder returns JSON data that includes the values that you specified plus information about the job that is
 * created.
 * </p>
 *
 * @see com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#createJob(CreateJobRequest)
 */
public class CreateJobRequest extends AmazonWebServiceRequest  implements Serializable  {

    /**
     * The <code>Id</code> of the pipeline that you want Elastic Transcoder
     * to use for transcoding. The pipeline determines several settings,
     * including the Amazon S3 bucket from which Elastic Transcoder gets the
     * files to transcode and the bucket into which Elastic Transcoder puts
     * the transcoded files.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     */
    private String pipelineId;

    /**
     * A section of the request body that provides information about the file
     * that is being transcoded.
     */
    private JobInput input;

    /**
     * A section of the request body that provides information about the
     * transcoded (target) file.
     */
    private CreateJobOutput output;

    /**
     * The <code>Id</code> of the pipeline that you want Elastic Transcoder
     * to use for transcoding. The pipeline determines several settings,
     * including the Amazon S3 bucket from which Elastic Transcoder gets the
     * files to transcode and the bucket into which Elastic Transcoder puts
     * the transcoded files.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @return The <code>Id</code> of the pipeline that you want Elastic Transcoder
     *         to use for transcoding. The pipeline determines several settings,
     *         including the Amazon S3 bucket from which Elastic Transcoder gets the
     *         files to transcode and the bucket into which Elastic Transcoder puts
     *         the transcoded files.
     */
    public String getPipelineId() {
        return pipelineId;
    }
    
    /**
     * The <code>Id</code> of the pipeline that you want Elastic Transcoder
     * to use for transcoding. The pipeline determines several settings,
     * including the Amazon S3 bucket from which Elastic Transcoder gets the
     * files to transcode and the bucket into which Elastic Transcoder puts
     * the transcoded files.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param pipelineId The <code>Id</code> of the pipeline that you want Elastic Transcoder
     *         to use for transcoding. The pipeline determines several settings,
     *         including the Amazon S3 bucket from which Elastic Transcoder gets the
     *         files to transcode and the bucket into which Elastic Transcoder puts
     *         the transcoded files.
     */
    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }
    
    /**
     * The <code>Id</code> of the pipeline that you want Elastic Transcoder
     * to use for transcoding. The pipeline determines several settings,
     * including the Amazon S3 bucket from which Elastic Transcoder gets the
     * files to transcode and the bucket into which Elastic Transcoder puts
     * the transcoded files.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param pipelineId The <code>Id</code> of the pipeline that you want Elastic Transcoder
     *         to use for transcoding. The pipeline determines several settings,
     *         including the Amazon S3 bucket from which Elastic Transcoder gets the
     *         files to transcode and the bucket into which Elastic Transcoder puts
     *         the transcoded files.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateJobRequest withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    
    
    /**
     * A section of the request body that provides information about the file
     * that is being transcoded.
     *
     * @return A section of the request body that provides information about the file
     *         that is being transcoded.
     */
    public JobInput getInput() {
        return input;
    }
    
    /**
     * A section of the request body that provides information about the file
     * that is being transcoded.
     *
     * @param input A section of the request body that provides information about the file
     *         that is being transcoded.
     */
    public void setInput(JobInput input) {
        this.input = input;
    }
    
    /**
     * A section of the request body that provides information about the file
     * that is being transcoded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param input A section of the request body that provides information about the file
     *         that is being transcoded.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateJobRequest withInput(JobInput input) {
        this.input = input;
        return this;
    }
    
    
    /**
     * A section of the request body that provides information about the
     * transcoded (target) file.
     *
     * @return A section of the request body that provides information about the
     *         transcoded (target) file.
     */
    public CreateJobOutput getOutput() {
        return output;
    }
    
    /**
     * A section of the request body that provides information about the
     * transcoded (target) file.
     *
     * @param output A section of the request body that provides information about the
     *         transcoded (target) file.
     */
    public void setOutput(CreateJobOutput output) {
        this.output = output;
    }
    
    /**
     * A section of the request body that provides information about the
     * transcoded (target) file.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param output A section of the request body that provides information about the
     *         transcoded (target) file.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateJobRequest withOutput(CreateJobOutput output) {
        this.output = output;
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
        if (getPipelineId() != null) sb.append("PipelineId: " + getPipelineId() + ",");    	
        if (getInput() != null) sb.append("Input: " + getInput() + ",");    	
        if (getOutput() != null) sb.append("Output: " + getOutput() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode()); 
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode()); 
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateJobRequest == false) return false;
        CreateJobRequest other = (CreateJobRequest)obj;
        
        if (other.getPipelineId() == null ^ this.getPipelineId() == null) return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false) return false; 
        if (other.getInput() == null ^ this.getInput() == null) return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false) return false; 
        if (other.getOutput() == null ^ this.getOutput() == null) return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false) return false; 
        return true;
    }
    
}
    