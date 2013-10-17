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


/**
 * <p>
 * A section of the response body that provides information about the job that is created.
 * </p>
 */
public class Job implements Serializable {

    /**
     * The identifier that Elastic Transcoder assigned to the job. You use
     * this value to get settings for the job or to delete the job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     */
    private String id;

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
     * A section of the request or response body that provides information
     * about the file that is being transcoded.
     */
    private JobInput input;

    /**
     * If you specified one output for a job, information about that output.
     * If you specified multiple outputs for a job, the Output object lists
     * information about the first output. This duplicates the information
     * that is listed for the first output in the Outputs object.
     * <p><important>Outputs recommended instead.</important> A section of
     * the request or response body that provides information about the
     * transcoded (target) file.
     */
    private JobOutput output;

    /**
     * Information about the output files. We recommend that you use the
     * <code>Outputs</code> syntax for all jobs, even when you want Elastic
     * Transcoder to transcode a file into only one format. Do not use both
     * the <code>Outputs</code> and <code>Output</code> syntaxes in the same
     * request. You can create a maximum of 30 outputs per job. <p> If you
     * specify more than one output for a job, Elastic Transcoder creates the
     * files for each output in the order in which you specify them in the
     * job.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<JobOutput> outputs;

    /**
     * The value, if any, that you want Elastic Transcoder to prepend to the
     * names of all files that this job creates, including output files,
     * thumbnails, and playlists. We recommend that you add a / or some other
     * delimiter to the end of the <code>OutputKeyPrefix</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String outputKeyPrefix;

    /**
     * <important>Outputs in MPEG-TS format only.</important>If you specify a
     * preset in <code>PresetId</code> for which the value of
     * <code>Container</code> is ts (MPEG-TS), <code>Playlists</code>
     * contains information about the master playlists that you want Elastic
     * Transcoder to create. <p>We recommend that you create only one master
     * playlist. The maximum number of master playlists in a job is 30.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Playlist> playlists;

    /**
     * The status of the job: <code>Submitted</code>,
     * <code>Progressing</code>, <code>Complete</code>,
     * <code>Canceled</code>, or <code>Error</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)<br/>
     */
    private String status;

    /**
     * The identifier that Elastic Transcoder assigned to the job. You use
     * this value to get settings for the job or to delete the job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @return The identifier that Elastic Transcoder assigned to the job. You use
     *         this value to get settings for the job or to delete the job.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The identifier that Elastic Transcoder assigned to the job. You use
     * this value to get settings for the job or to delete the job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param id The identifier that Elastic Transcoder assigned to the job. You use
     *         this value to get settings for the job or to delete the job.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The identifier that Elastic Transcoder assigned to the job. You use
     * this value to get settings for the job or to delete the job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param id The identifier that Elastic Transcoder assigned to the job. You use
     *         this value to get settings for the job or to delete the job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Job withId(String id) {
        this.id = id;
        return this;
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
    public Job withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * A section of the request or response body that provides information
     * about the file that is being transcoded.
     *
     * @return A section of the request or response body that provides information
     *         about the file that is being transcoded.
     */
    public JobInput getInput() {
        return input;
    }
    
    /**
     * A section of the request or response body that provides information
     * about the file that is being transcoded.
     *
     * @param input A section of the request or response body that provides information
     *         about the file that is being transcoded.
     */
    public void setInput(JobInput input) {
        this.input = input;
    }
    
    /**
     * A section of the request or response body that provides information
     * about the file that is being transcoded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param input A section of the request or response body that provides information
     *         about the file that is being transcoded.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Job withInput(JobInput input) {
        this.input = input;
        return this;
    }

    /**
     * If you specified one output for a job, information about that output.
     * If you specified multiple outputs for a job, the Output object lists
     * information about the first output. This duplicates the information
     * that is listed for the first output in the Outputs object.
     * <p><important>Outputs recommended instead.</important> A section of
     * the request or response body that provides information about the
     * transcoded (target) file.
     *
     * @return If you specified one output for a job, information about that output.
     *         If you specified multiple outputs for a job, the Output object lists
     *         information about the first output. This duplicates the information
     *         that is listed for the first output in the Outputs object.
     *         <p><important>Outputs recommended instead.</important> A section of
     *         the request or response body that provides information about the
     *         transcoded (target) file.
     */
    public JobOutput getOutput() {
        return output;
    }
    
    /**
     * If you specified one output for a job, information about that output.
     * If you specified multiple outputs for a job, the Output object lists
     * information about the first output. This duplicates the information
     * that is listed for the first output in the Outputs object.
     * <p><important>Outputs recommended instead.</important> A section of
     * the request or response body that provides information about the
     * transcoded (target) file.
     *
     * @param output If you specified one output for a job, information about that output.
     *         If you specified multiple outputs for a job, the Output object lists
     *         information about the first output. This duplicates the information
     *         that is listed for the first output in the Outputs object.
     *         <p><important>Outputs recommended instead.</important> A section of
     *         the request or response body that provides information about the
     *         transcoded (target) file.
     */
    public void setOutput(JobOutput output) {
        this.output = output;
    }
    
    /**
     * If you specified one output for a job, information about that output.
     * If you specified multiple outputs for a job, the Output object lists
     * information about the first output. This duplicates the information
     * that is listed for the first output in the Outputs object.
     * <p><important>Outputs recommended instead.</important> A section of
     * the request or response body that provides information about the
     * transcoded (target) file.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param output If you specified one output for a job, information about that output.
     *         If you specified multiple outputs for a job, the Output object lists
     *         information about the first output. This duplicates the information
     *         that is listed for the first output in the Outputs object.
     *         <p><important>Outputs recommended instead.</important> A section of
     *         the request or response body that provides information about the
     *         transcoded (target) file.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Job withOutput(JobOutput output) {
        this.output = output;
        return this;
    }

    /**
     * Information about the output files. We recommend that you use the
     * <code>Outputs</code> syntax for all jobs, even when you want Elastic
     * Transcoder to transcode a file into only one format. Do not use both
     * the <code>Outputs</code> and <code>Output</code> syntaxes in the same
     * request. You can create a maximum of 30 outputs per job. <p> If you
     * specify more than one output for a job, Elastic Transcoder creates the
     * files for each output in the order in which you specify them in the
     * job.
     *
     * @return Information about the output files. We recommend that you use the
     *         <code>Outputs</code> syntax for all jobs, even when you want Elastic
     *         Transcoder to transcode a file into only one format. Do not use both
     *         the <code>Outputs</code> and <code>Output</code> syntaxes in the same
     *         request. You can create a maximum of 30 outputs per job. <p> If you
     *         specify more than one output for a job, Elastic Transcoder creates the
     *         files for each output in the order in which you specify them in the
     *         job.
     */
    public java.util.List<JobOutput> getOutputs() {
        if (outputs == null) {
              outputs = new com.amazonaws.internal.ListWithAutoConstructFlag<JobOutput>();
              outputs.setAutoConstruct(true);
        }
        return outputs;
    }
    
    /**
     * Information about the output files. We recommend that you use the
     * <code>Outputs</code> syntax for all jobs, even when you want Elastic
     * Transcoder to transcode a file into only one format. Do not use both
     * the <code>Outputs</code> and <code>Output</code> syntaxes in the same
     * request. You can create a maximum of 30 outputs per job. <p> If you
     * specify more than one output for a job, Elastic Transcoder creates the
     * files for each output in the order in which you specify them in the
     * job.
     *
     * @param outputs Information about the output files. We recommend that you use the
     *         <code>Outputs</code> syntax for all jobs, even when you want Elastic
     *         Transcoder to transcode a file into only one format. Do not use both
     *         the <code>Outputs</code> and <code>Output</code> syntaxes in the same
     *         request. You can create a maximum of 30 outputs per job. <p> If you
     *         specify more than one output for a job, Elastic Transcoder creates the
     *         files for each output in the order in which you specify them in the
     *         job.
     */
    public void setOutputs(java.util.Collection<JobOutput> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<JobOutput> outputsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<JobOutput>(outputs.size());
        outputsCopy.addAll(outputs);
        this.outputs = outputsCopy;
    }
    
    /**
     * Information about the output files. We recommend that you use the
     * <code>Outputs</code> syntax for all jobs, even when you want Elastic
     * Transcoder to transcode a file into only one format. Do not use both
     * the <code>Outputs</code> and <code>Output</code> syntaxes in the same
     * request. You can create a maximum of 30 outputs per job. <p> If you
     * specify more than one output for a job, Elastic Transcoder creates the
     * files for each output in the order in which you specify them in the
     * job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param outputs Information about the output files. We recommend that you use the
     *         <code>Outputs</code> syntax for all jobs, even when you want Elastic
     *         Transcoder to transcode a file into only one format. Do not use both
     *         the <code>Outputs</code> and <code>Output</code> syntaxes in the same
     *         request. You can create a maximum of 30 outputs per job. <p> If you
     *         specify more than one output for a job, Elastic Transcoder creates the
     *         files for each output in the order in which you specify them in the
     *         job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Job withOutputs(JobOutput... outputs) {
        if (getOutputs() == null) setOutputs(new java.util.ArrayList<JobOutput>(outputs.length));
        for (JobOutput value : outputs) {
            getOutputs().add(value);
        }
        return this;
    }
    
    /**
     * Information about the output files. We recommend that you use the
     * <code>Outputs</code> syntax for all jobs, even when you want Elastic
     * Transcoder to transcode a file into only one format. Do not use both
     * the <code>Outputs</code> and <code>Output</code> syntaxes in the same
     * request. You can create a maximum of 30 outputs per job. <p> If you
     * specify more than one output for a job, Elastic Transcoder creates the
     * files for each output in the order in which you specify them in the
     * job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param outputs Information about the output files. We recommend that you use the
     *         <code>Outputs</code> syntax for all jobs, even when you want Elastic
     *         Transcoder to transcode a file into only one format. Do not use both
     *         the <code>Outputs</code> and <code>Output</code> syntaxes in the same
     *         request. You can create a maximum of 30 outputs per job. <p> If you
     *         specify more than one output for a job, Elastic Transcoder creates the
     *         files for each output in the order in which you specify them in the
     *         job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Job withOutputs(java.util.Collection<JobOutput> outputs) {
        if (outputs == null) {
            this.outputs = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<JobOutput> outputsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<JobOutput>(outputs.size());
            outputsCopy.addAll(outputs);
            this.outputs = outputsCopy;
        }

        return this;
    }

    /**
     * The value, if any, that you want Elastic Transcoder to prepend to the
     * names of all files that this job creates, including output files,
     * thumbnails, and playlists. We recommend that you add a / or some other
     * delimiter to the end of the <code>OutputKeyPrefix</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The value, if any, that you want Elastic Transcoder to prepend to the
     *         names of all files that this job creates, including output files,
     *         thumbnails, and playlists. We recommend that you add a / or some other
     *         delimiter to the end of the <code>OutputKeyPrefix</code>.
     */
    public String getOutputKeyPrefix() {
        return outputKeyPrefix;
    }
    
    /**
     * The value, if any, that you want Elastic Transcoder to prepend to the
     * names of all files that this job creates, including output files,
     * thumbnails, and playlists. We recommend that you add a / or some other
     * delimiter to the end of the <code>OutputKeyPrefix</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param outputKeyPrefix The value, if any, that you want Elastic Transcoder to prepend to the
     *         names of all files that this job creates, including output files,
     *         thumbnails, and playlists. We recommend that you add a / or some other
     *         delimiter to the end of the <code>OutputKeyPrefix</code>.
     */
    public void setOutputKeyPrefix(String outputKeyPrefix) {
        this.outputKeyPrefix = outputKeyPrefix;
    }
    
    /**
     * The value, if any, that you want Elastic Transcoder to prepend to the
     * names of all files that this job creates, including output files,
     * thumbnails, and playlists. We recommend that you add a / or some other
     * delimiter to the end of the <code>OutputKeyPrefix</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param outputKeyPrefix The value, if any, that you want Elastic Transcoder to prepend to the
     *         names of all files that this job creates, including output files,
     *         thumbnails, and playlists. We recommend that you add a / or some other
     *         delimiter to the end of the <code>OutputKeyPrefix</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Job withOutputKeyPrefix(String outputKeyPrefix) {
        this.outputKeyPrefix = outputKeyPrefix;
        return this;
    }

    /**
     * <important>Outputs in MPEG-TS format only.</important>If you specify a
     * preset in <code>PresetId</code> for which the value of
     * <code>Container</code> is ts (MPEG-TS), <code>Playlists</code>
     * contains information about the master playlists that you want Elastic
     * Transcoder to create. <p>We recommend that you create only one master
     * playlist. The maximum number of master playlists in a job is 30.
     *
     * @return <important>Outputs in MPEG-TS format only.</important>If you specify a
     *         preset in <code>PresetId</code> for which the value of
     *         <code>Container</code> is ts (MPEG-TS), <code>Playlists</code>
     *         contains information about the master playlists that you want Elastic
     *         Transcoder to create. <p>We recommend that you create only one master
     *         playlist. The maximum number of master playlists in a job is 30.
     */
    public java.util.List<Playlist> getPlaylists() {
        if (playlists == null) {
              playlists = new com.amazonaws.internal.ListWithAutoConstructFlag<Playlist>();
              playlists.setAutoConstruct(true);
        }
        return playlists;
    }
    
    /**
     * <important>Outputs in MPEG-TS format only.</important>If you specify a
     * preset in <code>PresetId</code> for which the value of
     * <code>Container</code> is ts (MPEG-TS), <code>Playlists</code>
     * contains information about the master playlists that you want Elastic
     * Transcoder to create. <p>We recommend that you create only one master
     * playlist. The maximum number of master playlists in a job is 30.
     *
     * @param playlists <important>Outputs in MPEG-TS format only.</important>If you specify a
     *         preset in <code>PresetId</code> for which the value of
     *         <code>Container</code> is ts (MPEG-TS), <code>Playlists</code>
     *         contains information about the master playlists that you want Elastic
     *         Transcoder to create. <p>We recommend that you create only one master
     *         playlist. The maximum number of master playlists in a job is 30.
     */
    public void setPlaylists(java.util.Collection<Playlist> playlists) {
        if (playlists == null) {
            this.playlists = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Playlist> playlistsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Playlist>(playlists.size());
        playlistsCopy.addAll(playlists);
        this.playlists = playlistsCopy;
    }
    
    /**
     * <important>Outputs in MPEG-TS format only.</important>If you specify a
     * preset in <code>PresetId</code> for which the value of
     * <code>Container</code> is ts (MPEG-TS), <code>Playlists</code>
     * contains information about the master playlists that you want Elastic
     * Transcoder to create. <p>We recommend that you create only one master
     * playlist. The maximum number of master playlists in a job is 30.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param playlists <important>Outputs in MPEG-TS format only.</important>If you specify a
     *         preset in <code>PresetId</code> for which the value of
     *         <code>Container</code> is ts (MPEG-TS), <code>Playlists</code>
     *         contains information about the master playlists that you want Elastic
     *         Transcoder to create. <p>We recommend that you create only one master
     *         playlist. The maximum number of master playlists in a job is 30.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Job withPlaylists(Playlist... playlists) {
        if (getPlaylists() == null) setPlaylists(new java.util.ArrayList<Playlist>(playlists.length));
        for (Playlist value : playlists) {
            getPlaylists().add(value);
        }
        return this;
    }
    
    /**
     * <important>Outputs in MPEG-TS format only.</important>If you specify a
     * preset in <code>PresetId</code> for which the value of
     * <code>Container</code> is ts (MPEG-TS), <code>Playlists</code>
     * contains information about the master playlists that you want Elastic
     * Transcoder to create. <p>We recommend that you create only one master
     * playlist. The maximum number of master playlists in a job is 30.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param playlists <important>Outputs in MPEG-TS format only.</important>If you specify a
     *         preset in <code>PresetId</code> for which the value of
     *         <code>Container</code> is ts (MPEG-TS), <code>Playlists</code>
     *         contains information about the master playlists that you want Elastic
     *         Transcoder to create. <p>We recommend that you create only one master
     *         playlist. The maximum number of master playlists in a job is 30.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Job withPlaylists(java.util.Collection<Playlist> playlists) {
        if (playlists == null) {
            this.playlists = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Playlist> playlistsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Playlist>(playlists.size());
            playlistsCopy.addAll(playlists);
            this.playlists = playlistsCopy;
        }

        return this;
    }

    /**
     * The status of the job: <code>Submitted</code>,
     * <code>Progressing</code>, <code>Complete</code>,
     * <code>Canceled</code>, or <code>Error</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)<br/>
     *
     * @return The status of the job: <code>Submitted</code>,
     *         <code>Progressing</code>, <code>Complete</code>,
     *         <code>Canceled</code>, or <code>Error</code>.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the job: <code>Submitted</code>,
     * <code>Progressing</code>, <code>Complete</code>,
     * <code>Canceled</code>, or <code>Error</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)<br/>
     *
     * @param status The status of the job: <code>Submitted</code>,
     *         <code>Progressing</code>, <code>Complete</code>,
     *         <code>Canceled</code>, or <code>Error</code>.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the job: <code>Submitted</code>,
     * <code>Progressing</code>, <code>Complete</code>,
     * <code>Canceled</code>, or <code>Error</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)<br/>
     *
     * @param status The status of the job: <code>Submitted</code>,
     *         <code>Progressing</code>, <code>Complete</code>,
     *         <code>Canceled</code>, or <code>Error</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Job withStatus(String status) {
        this.status = status;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getPipelineId() != null) sb.append("PipelineId: " + getPipelineId() + ",");
        if (getInput() != null) sb.append("Input: " + getInput() + ",");
        if (getOutput() != null) sb.append("Output: " + getOutput() + ",");
        if (getOutputs() != null) sb.append("Outputs: " + getOutputs() + ",");
        if (getOutputKeyPrefix() != null) sb.append("OutputKeyPrefix: " + getOutputKeyPrefix() + ",");
        if (getPlaylists() != null) sb.append("Playlists: " + getPlaylists() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode()); 
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode()); 
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode()); 
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode()); 
        hashCode = prime * hashCode + ((getOutputKeyPrefix() == null) ? 0 : getOutputKeyPrefix().hashCode()); 
        hashCode = prime * hashCode + ((getPlaylists() == null) ? 0 : getPlaylists().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Job == false) return false;
        Job other = (Job)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
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
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    