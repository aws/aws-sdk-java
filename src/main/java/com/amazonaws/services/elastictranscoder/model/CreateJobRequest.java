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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#createJob(CreateJobRequest) CreateJob operation}.
 * <p>
 * When you create a job, Elastic Transcoder returns JSON data that includes the values that you specified plus information about the job that is
 * created.
 * </p>
 * <p>
 * If you have specified more than one output for your jobs (for example, one output for the Kindle Fire and another output for the Apple iPhone 4s), you
 * currently must use the Elastic Transcoder API to list the jobs (as opposed to the AWS Console).
 * </p>
 *
 * @see com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#createJob(CreateJobRequest)
 */
public class CreateJobRequest extends AmazonWebServiceRequest implements Serializable {

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
     * The <code>CreateJobOutput</code> structure.
     */
    private CreateJobOutput output;

    /**
     * A section of the request body that provides information about the
     * transcoded (target) files. We recommend that you use the
     * <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CreateJobOutput> outputs;

    /**
     * The value, if any, that you want Elastic Transcoder to prepend to the
     * names of all files that this job creates, including output files,
     * thumbnails, and playlists.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String outputKeyPrefix;

    /**
     * If you specify a preset in <code>PresetId</code> for which the value
     * of <code>Container</code> is ts (MPEG-TS), Playlists contains
     * information about the master playlists that you want Elastic
     * Transcoder to create. <p>We recommend that you create only one master
     * playlist. The maximum number of master playlists in a job is 30.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CreateJobPlaylist> playlists;

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
     * The <code>CreateJobOutput</code> structure.
     *
     * @return The <code>CreateJobOutput</code> structure.
     */
    public CreateJobOutput getOutput() {
        return output;
    }
    
    /**
     * The <code>CreateJobOutput</code> structure.
     *
     * @param output The <code>CreateJobOutput</code> structure.
     */
    public void setOutput(CreateJobOutput output) {
        this.output = output;
    }
    
    /**
     * The <code>CreateJobOutput</code> structure.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param output The <code>CreateJobOutput</code> structure.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobRequest withOutput(CreateJobOutput output) {
        this.output = output;
        return this;
    }

    /**
     * A section of the request body that provides information about the
     * transcoded (target) files. We recommend that you use the
     * <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @return A section of the request body that provides information about the
     *         transcoded (target) files. We recommend that you use the
     *         <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     */
    public java.util.List<CreateJobOutput> getOutputs() {
        if (outputs == null) {
              outputs = new com.amazonaws.internal.ListWithAutoConstructFlag<CreateJobOutput>();
              outputs.setAutoConstruct(true);
        }
        return outputs;
    }
    
    /**
     * A section of the request body that provides information about the
     * transcoded (target) files. We recommend that you use the
     * <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param outputs A section of the request body that provides information about the
     *         transcoded (target) files. We recommend that you use the
     *         <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     */
    public void setOutputs(java.util.Collection<CreateJobOutput> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CreateJobOutput> outputsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CreateJobOutput>(outputs.size());
        outputsCopy.addAll(outputs);
        this.outputs = outputsCopy;
    }
    
    /**
     * A section of the request body that provides information about the
     * transcoded (target) files. We recommend that you use the
     * <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param outputs A section of the request body that provides information about the
     *         transcoded (target) files. We recommend that you use the
     *         <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobRequest withOutputs(CreateJobOutput... outputs) {
        if (getOutputs() == null) setOutputs(new java.util.ArrayList<CreateJobOutput>(outputs.length));
        for (CreateJobOutput value : outputs) {
            getOutputs().add(value);
        }
        return this;
    }
    
    /**
     * A section of the request body that provides information about the
     * transcoded (target) files. We recommend that you use the
     * <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param outputs A section of the request body that provides information about the
     *         transcoded (target) files. We recommend that you use the
     *         <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobRequest withOutputs(java.util.Collection<CreateJobOutput> outputs) {
        if (outputs == null) {
            this.outputs = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CreateJobOutput> outputsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CreateJobOutput>(outputs.size());
            outputsCopy.addAll(outputs);
            this.outputs = outputsCopy;
        }

        return this;
    }

    /**
     * The value, if any, that you want Elastic Transcoder to prepend to the
     * names of all files that this job creates, including output files,
     * thumbnails, and playlists.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The value, if any, that you want Elastic Transcoder to prepend to the
     *         names of all files that this job creates, including output files,
     *         thumbnails, and playlists.
     */
    public String getOutputKeyPrefix() {
        return outputKeyPrefix;
    }
    
    /**
     * The value, if any, that you want Elastic Transcoder to prepend to the
     * names of all files that this job creates, including output files,
     * thumbnails, and playlists.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param outputKeyPrefix The value, if any, that you want Elastic Transcoder to prepend to the
     *         names of all files that this job creates, including output files,
     *         thumbnails, and playlists.
     */
    public void setOutputKeyPrefix(String outputKeyPrefix) {
        this.outputKeyPrefix = outputKeyPrefix;
    }
    
    /**
     * The value, if any, that you want Elastic Transcoder to prepend to the
     * names of all files that this job creates, including output files,
     * thumbnails, and playlists.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param outputKeyPrefix The value, if any, that you want Elastic Transcoder to prepend to the
     *         names of all files that this job creates, including output files,
     *         thumbnails, and playlists.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobRequest withOutputKeyPrefix(String outputKeyPrefix) {
        this.outputKeyPrefix = outputKeyPrefix;
        return this;
    }

    /**
     * If you specify a preset in <code>PresetId</code> for which the value
     * of <code>Container</code> is ts (MPEG-TS), Playlists contains
     * information about the master playlists that you want Elastic
     * Transcoder to create. <p>We recommend that you create only one master
     * playlist. The maximum number of master playlists in a job is 30.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @return If you specify a preset in <code>PresetId</code> for which the value
     *         of <code>Container</code> is ts (MPEG-TS), Playlists contains
     *         information about the master playlists that you want Elastic
     *         Transcoder to create. <p>We recommend that you create only one master
     *         playlist. The maximum number of master playlists in a job is 30.
     */
    public java.util.List<CreateJobPlaylist> getPlaylists() {
        if (playlists == null) {
              playlists = new com.amazonaws.internal.ListWithAutoConstructFlag<CreateJobPlaylist>();
              playlists.setAutoConstruct(true);
        }
        return playlists;
    }
    
    /**
     * If you specify a preset in <code>PresetId</code> for which the value
     * of <code>Container</code> is ts (MPEG-TS), Playlists contains
     * information about the master playlists that you want Elastic
     * Transcoder to create. <p>We recommend that you create only one master
     * playlist. The maximum number of master playlists in a job is 30.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param playlists If you specify a preset in <code>PresetId</code> for which the value
     *         of <code>Container</code> is ts (MPEG-TS), Playlists contains
     *         information about the master playlists that you want Elastic
     *         Transcoder to create. <p>We recommend that you create only one master
     *         playlist. The maximum number of master playlists in a job is 30.
     */
    public void setPlaylists(java.util.Collection<CreateJobPlaylist> playlists) {
        if (playlists == null) {
            this.playlists = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CreateJobPlaylist> playlistsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CreateJobPlaylist>(playlists.size());
        playlistsCopy.addAll(playlists);
        this.playlists = playlistsCopy;
    }
    
    /**
     * If you specify a preset in <code>PresetId</code> for which the value
     * of <code>Container</code> is ts (MPEG-TS), Playlists contains
     * information about the master playlists that you want Elastic
     * Transcoder to create. <p>We recommend that you create only one master
     * playlist. The maximum number of master playlists in a job is 30.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param playlists If you specify a preset in <code>PresetId</code> for which the value
     *         of <code>Container</code> is ts (MPEG-TS), Playlists contains
     *         information about the master playlists that you want Elastic
     *         Transcoder to create. <p>We recommend that you create only one master
     *         playlist. The maximum number of master playlists in a job is 30.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobRequest withPlaylists(CreateJobPlaylist... playlists) {
        if (getPlaylists() == null) setPlaylists(new java.util.ArrayList<CreateJobPlaylist>(playlists.length));
        for (CreateJobPlaylist value : playlists) {
            getPlaylists().add(value);
        }
        return this;
    }
    
    /**
     * If you specify a preset in <code>PresetId</code> for which the value
     * of <code>Container</code> is ts (MPEG-TS), Playlists contains
     * information about the master playlists that you want Elastic
     * Transcoder to create. <p>We recommend that you create only one master
     * playlist. The maximum number of master playlists in a job is 30.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param playlists If you specify a preset in <code>PresetId</code> for which the value
     *         of <code>Container</code> is ts (MPEG-TS), Playlists contains
     *         information about the master playlists that you want Elastic
     *         Transcoder to create. <p>We recommend that you create only one master
     *         playlist. The maximum number of master playlists in a job is 30.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobRequest withPlaylists(java.util.Collection<CreateJobPlaylist> playlists) {
        if (playlists == null) {
            this.playlists = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CreateJobPlaylist> playlistsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CreateJobPlaylist>(playlists.size());
            playlistsCopy.addAll(playlists);
            this.playlists = playlistsCopy;
        }

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
        if (getOutput() != null) sb.append("Output: " + getOutput() + ",");
        if (getOutputs() != null) sb.append("Outputs: " + getOutputs() + ",");
        if (getOutputKeyPrefix() != null) sb.append("OutputKeyPrefix: " + getOutputKeyPrefix() + ",");
        if (getPlaylists() != null) sb.append("Playlists: " + getPlaylists() );
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
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode()); 
        hashCode = prime * hashCode + ((getOutputKeyPrefix() == null) ? 0 : getOutputKeyPrefix().hashCode()); 
        hashCode = prime * hashCode + ((getPlaylists() == null) ? 0 : getPlaylists().hashCode()); 
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
        if (other.getOutputs() == null ^ this.getOutputs() == null) return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false) return false; 
        if (other.getOutputKeyPrefix() == null ^ this.getOutputKeyPrefix() == null) return false;
        if (other.getOutputKeyPrefix() != null && other.getOutputKeyPrefix().equals(this.getOutputKeyPrefix()) == false) return false; 
        if (other.getPlaylists() == null ^ this.getPlaylists() == null) return false;
        if (other.getPlaylists() != null && other.getPlaylists().equals(this.getPlaylists()) == false) return false; 
        return true;
    }
    
}
    