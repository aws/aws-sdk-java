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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A section of the response body that provides information about the job that is created.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Job implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier that Elastic Transcoder assigned to the job. You use this value to get settings for the job or to
     * delete the job.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the job.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The <code>Id</code> of the pipeline that you want Elastic Transcoder to use for transcoding. The pipeline
     * determines several settings, including the Amazon S3 bucket from which Elastic Transcoder gets the files to
     * transcode and the bucket into which Elastic Transcoder puts the transcoded files.
     * </p>
     */
    private String pipelineId;
    /**
     * <p>
     * A section of the request or response body that provides information about the file that is being transcoded.
     * </p>
     */
    private JobInput input;
    /**
     * <p>
     * Information about the files that you're transcoding. If you specified multiple files for this job, Elastic
     * Transcoder stitches the files together to make one output.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<JobInput> inputs;
    /**
     * <p>
     * If you specified one output for a job, information about that output. If you specified multiple outputs for a
     * job, the Output object lists information about the first output. This duplicates the information that is listed
     * for the first output in the Outputs object.
     * </p>
     * <important>
     * <p>
     * Outputs recommended instead.
     * </p>
     * </important>
     * <p>
     * A section of the request or response body that provides information about the transcoded (target) file.
     * </p>
     */
    private JobOutput output;
    /**
     * <p>
     * Information about the output files. We recommend that you use the <code>Outputs</code> syntax for all jobs, even
     * when you want Elastic Transcoder to transcode a file into only one format. Do not use both the
     * <code>Outputs</code> and <code>Output</code> syntaxes in the same request. You can create a maximum of 30 outputs
     * per job.
     * </p>
     * <p>
     * If you specify more than one output for a job, Elastic Transcoder creates the files for each output in the order
     * in which you specify them in the job.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<JobOutput> outputs;
    /**
     * <p>
     * The value, if any, that you want Elastic Transcoder to prepend to the names of all files that this job creates,
     * including output files, thumbnails, and playlists. We recommend that you add a / or some other delimiter to the
     * end of the <code>OutputKeyPrefix</code>.
     * </p>
     */
    private String outputKeyPrefix;
    /**
     * <important>
     * <p>
     * Outputs in Fragmented MP4 or MPEG-TS format only.
     * </p>
     * </important>
     * <p>
     * If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is fmp4
     * (Fragmented MP4) or ts (MPEG-TS), <code>Playlists</code> contains information about the master playlists that you
     * want Elastic Transcoder to create.
     * </p>
     * <p>
     * The maximum number of master playlists in a job is 30.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Playlist> playlists;
    /**
     * <p>
     * The status of the job: <code>Submitted</code>, <code>Progressing</code>, <code>Complete</code>,
     * <code>Canceled</code>, or <code>Error</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * User-defined metadata that you want to associate with an Elastic Transcoder job. You specify metadata in
     * <code>key/value</code> pairs, and you can add up to 10 <code>key/value</code> pairs per job. Elastic Transcoder
     * does not guarantee that <code>key/value</code> pairs are returned in the same order in which you specify them.
     * </p>
     * <p>
     * Metadata <code>keys</code> and <code>values</code> must use characters from the following list:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0-9</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>A-Z</code> and <code>a-z</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Space</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The following symbols: <code>_.:/=+-%@</code>
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> userMetadata;
    /**
     * <p>
     * Details about the timing of a job.
     * </p>
     */
    private Timing timing;

    /**
     * <p>
     * The identifier that Elastic Transcoder assigned to the job. You use this value to get settings for the job or to
     * delete the job.
     * </p>
     * 
     * @param id
     *        The identifier that Elastic Transcoder assigned to the job. You use this value to get settings for the job
     *        or to delete the job.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier that Elastic Transcoder assigned to the job. You use this value to get settings for the job or to
     * delete the job.
     * </p>
     * 
     * @return The identifier that Elastic Transcoder assigned to the job. You use this value to get settings for the
     *         job or to delete the job.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier that Elastic Transcoder assigned to the job. You use this value to get settings for the job or to
     * delete the job.
     * </p>
     * 
     * @param id
     *        The identifier that Elastic Transcoder assigned to the job. You use this value to get settings for the job
     *        or to delete the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the job.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the job.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the job.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the job.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The <code>Id</code> of the pipeline that you want Elastic Transcoder to use for transcoding. The pipeline
     * determines several settings, including the Amazon S3 bucket from which Elastic Transcoder gets the files to
     * transcode and the bucket into which Elastic Transcoder puts the transcoded files.
     * </p>
     * 
     * @param pipelineId
     *        The <code>Id</code> of the pipeline that you want Elastic Transcoder to use for transcoding. The pipeline
     *        determines several settings, including the Amazon S3 bucket from which Elastic Transcoder gets the files
     *        to transcode and the bucket into which Elastic Transcoder puts the transcoded files.
     */

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * <p>
     * The <code>Id</code> of the pipeline that you want Elastic Transcoder to use for transcoding. The pipeline
     * determines several settings, including the Amazon S3 bucket from which Elastic Transcoder gets the files to
     * transcode and the bucket into which Elastic Transcoder puts the transcoded files.
     * </p>
     * 
     * @return The <code>Id</code> of the pipeline that you want Elastic Transcoder to use for transcoding. The pipeline
     *         determines several settings, including the Amazon S3 bucket from which Elastic Transcoder gets the files
     *         to transcode and the bucket into which Elastic Transcoder puts the transcoded files.
     */

    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * <p>
     * The <code>Id</code> of the pipeline that you want Elastic Transcoder to use for transcoding. The pipeline
     * determines several settings, including the Amazon S3 bucket from which Elastic Transcoder gets the files to
     * transcode and the bucket into which Elastic Transcoder puts the transcoded files.
     * </p>
     * 
     * @param pipelineId
     *        The <code>Id</code> of the pipeline that you want Elastic Transcoder to use for transcoding. The pipeline
     *        determines several settings, including the Amazon S3 bucket from which Elastic Transcoder gets the files
     *        to transcode and the bucket into which Elastic Transcoder puts the transcoded files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withPipelineId(String pipelineId) {
        setPipelineId(pipelineId);
        return this;
    }

    /**
     * <p>
     * A section of the request or response body that provides information about the file that is being transcoded.
     * </p>
     * 
     * @param input
     *        A section of the request or response body that provides information about the file that is being
     *        transcoded.
     */

    public void setInput(JobInput input) {
        this.input = input;
    }

    /**
     * <p>
     * A section of the request or response body that provides information about the file that is being transcoded.
     * </p>
     * 
     * @return A section of the request or response body that provides information about the file that is being
     *         transcoded.
     */

    public JobInput getInput() {
        return this.input;
    }

    /**
     * <p>
     * A section of the request or response body that provides information about the file that is being transcoded.
     * </p>
     * 
     * @param input
     *        A section of the request or response body that provides information about the file that is being
     *        transcoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withInput(JobInput input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * Information about the files that you're transcoding. If you specified multiple files for this job, Elastic
     * Transcoder stitches the files together to make one output.
     * </p>
     * 
     * @return Information about the files that you're transcoding. If you specified multiple files for this job,
     *         Elastic Transcoder stitches the files together to make one output.
     */

    public java.util.List<JobInput> getInputs() {
        if (inputs == null) {
            inputs = new com.amazonaws.internal.SdkInternalList<JobInput>();
        }
        return inputs;
    }

    /**
     * <p>
     * Information about the files that you're transcoding. If you specified multiple files for this job, Elastic
     * Transcoder stitches the files together to make one output.
     * </p>
     * 
     * @param inputs
     *        Information about the files that you're transcoding. If you specified multiple files for this job, Elastic
     *        Transcoder stitches the files together to make one output.
     */

    public void setInputs(java.util.Collection<JobInput> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new com.amazonaws.internal.SdkInternalList<JobInput>(inputs);
    }

    /**
     * <p>
     * Information about the files that you're transcoding. If you specified multiple files for this job, Elastic
     * Transcoder stitches the files together to make one output.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        Information about the files that you're transcoding. If you specified multiple files for this job, Elastic
     *        Transcoder stitches the files together to make one output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withInputs(JobInput... inputs) {
        if (this.inputs == null) {
            setInputs(new com.amazonaws.internal.SdkInternalList<JobInput>(inputs.length));
        }
        for (JobInput ele : inputs) {
            this.inputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the files that you're transcoding. If you specified multiple files for this job, Elastic
     * Transcoder stitches the files together to make one output.
     * </p>
     * 
     * @param inputs
     *        Information about the files that you're transcoding. If you specified multiple files for this job, Elastic
     *        Transcoder stitches the files together to make one output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withInputs(java.util.Collection<JobInput> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * If you specified one output for a job, information about that output. If you specified multiple outputs for a
     * job, the Output object lists information about the first output. This duplicates the information that is listed
     * for the first output in the Outputs object.
     * </p>
     * <important>
     * <p>
     * Outputs recommended instead.
     * </p>
     * </important>
     * <p>
     * A section of the request or response body that provides information about the transcoded (target) file.
     * </p>
     * 
     * @param output
     *        If you specified one output for a job, information about that output. If you specified multiple outputs
     *        for a job, the Output object lists information about the first output. This duplicates the information
     *        that is listed for the first output in the Outputs object.</p> <important>
     *        <p>
     *        Outputs recommended instead.
     *        </p>
     *        </important>
     *        <p>
     *        A section of the request or response body that provides information about the transcoded (target) file.
     */

    public void setOutput(JobOutput output) {
        this.output = output;
    }

    /**
     * <p>
     * If you specified one output for a job, information about that output. If you specified multiple outputs for a
     * job, the Output object lists information about the first output. This duplicates the information that is listed
     * for the first output in the Outputs object.
     * </p>
     * <important>
     * <p>
     * Outputs recommended instead.
     * </p>
     * </important>
     * <p>
     * A section of the request or response body that provides information about the transcoded (target) file.
     * </p>
     * 
     * @return If you specified one output for a job, information about that output. If you specified multiple outputs
     *         for a job, the Output object lists information about the first output. This duplicates the information
     *         that is listed for the first output in the Outputs object.</p> <important>
     *         <p>
     *         Outputs recommended instead.
     *         </p>
     *         </important>
     *         <p>
     *         A section of the request or response body that provides information about the transcoded (target) file.
     */

    public JobOutput getOutput() {
        return this.output;
    }

    /**
     * <p>
     * If you specified one output for a job, information about that output. If you specified multiple outputs for a
     * job, the Output object lists information about the first output. This duplicates the information that is listed
     * for the first output in the Outputs object.
     * </p>
     * <important>
     * <p>
     * Outputs recommended instead.
     * </p>
     * </important>
     * <p>
     * A section of the request or response body that provides information about the transcoded (target) file.
     * </p>
     * 
     * @param output
     *        If you specified one output for a job, information about that output. If you specified multiple outputs
     *        for a job, the Output object lists information about the first output. This duplicates the information
     *        that is listed for the first output in the Outputs object.</p> <important>
     *        <p>
     *        Outputs recommended instead.
     *        </p>
     *        </important>
     *        <p>
     *        A section of the request or response body that provides information about the transcoded (target) file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withOutput(JobOutput output) {
        setOutput(output);
        return this;
    }

    /**
     * <p>
     * Information about the output files. We recommend that you use the <code>Outputs</code> syntax for all jobs, even
     * when you want Elastic Transcoder to transcode a file into only one format. Do not use both the
     * <code>Outputs</code> and <code>Output</code> syntaxes in the same request. You can create a maximum of 30 outputs
     * per job.
     * </p>
     * <p>
     * If you specify more than one output for a job, Elastic Transcoder creates the files for each output in the order
     * in which you specify them in the job.
     * </p>
     * 
     * @return Information about the output files. We recommend that you use the <code>Outputs</code> syntax for all
     *         jobs, even when you want Elastic Transcoder to transcode a file into only one format. Do not use both the
     *         <code>Outputs</code> and <code>Output</code> syntaxes in the same request. You can create a maximum of 30
     *         outputs per job. </p>
     *         <p>
     *         If you specify more than one output for a job, Elastic Transcoder creates the files for each output in
     *         the order in which you specify them in the job.
     */

    public java.util.List<JobOutput> getOutputs() {
        if (outputs == null) {
            outputs = new com.amazonaws.internal.SdkInternalList<JobOutput>();
        }
        return outputs;
    }

    /**
     * <p>
     * Information about the output files. We recommend that you use the <code>Outputs</code> syntax for all jobs, even
     * when you want Elastic Transcoder to transcode a file into only one format. Do not use both the
     * <code>Outputs</code> and <code>Output</code> syntaxes in the same request. You can create a maximum of 30 outputs
     * per job.
     * </p>
     * <p>
     * If you specify more than one output for a job, Elastic Transcoder creates the files for each output in the order
     * in which you specify them in the job.
     * </p>
     * 
     * @param outputs
     *        Information about the output files. We recommend that you use the <code>Outputs</code> syntax for all
     *        jobs, even when you want Elastic Transcoder to transcode a file into only one format. Do not use both the
     *        <code>Outputs</code> and <code>Output</code> syntaxes in the same request. You can create a maximum of 30
     *        outputs per job. </p>
     *        <p>
     *        If you specify more than one output for a job, Elastic Transcoder creates the files for each output in the
     *        order in which you specify them in the job.
     */

    public void setOutputs(java.util.Collection<JobOutput> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new com.amazonaws.internal.SdkInternalList<JobOutput>(outputs);
    }

    /**
     * <p>
     * Information about the output files. We recommend that you use the <code>Outputs</code> syntax for all jobs, even
     * when you want Elastic Transcoder to transcode a file into only one format. Do not use both the
     * <code>Outputs</code> and <code>Output</code> syntaxes in the same request. You can create a maximum of 30 outputs
     * per job.
     * </p>
     * <p>
     * If you specify more than one output for a job, Elastic Transcoder creates the files for each output in the order
     * in which you specify them in the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        Information about the output files. We recommend that you use the <code>Outputs</code> syntax for all
     *        jobs, even when you want Elastic Transcoder to transcode a file into only one format. Do not use both the
     *        <code>Outputs</code> and <code>Output</code> syntaxes in the same request. You can create a maximum of 30
     *        outputs per job. </p>
     *        <p>
     *        If you specify more than one output for a job, Elastic Transcoder creates the files for each output in the
     *        order in which you specify them in the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withOutputs(JobOutput... outputs) {
        if (this.outputs == null) {
            setOutputs(new com.amazonaws.internal.SdkInternalList<JobOutput>(outputs.length));
        }
        for (JobOutput ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the output files. We recommend that you use the <code>Outputs</code> syntax for all jobs, even
     * when you want Elastic Transcoder to transcode a file into only one format. Do not use both the
     * <code>Outputs</code> and <code>Output</code> syntaxes in the same request. You can create a maximum of 30 outputs
     * per job.
     * </p>
     * <p>
     * If you specify more than one output for a job, Elastic Transcoder creates the files for each output in the order
     * in which you specify them in the job.
     * </p>
     * 
     * @param outputs
     *        Information about the output files. We recommend that you use the <code>Outputs</code> syntax for all
     *        jobs, even when you want Elastic Transcoder to transcode a file into only one format. Do not use both the
     *        <code>Outputs</code> and <code>Output</code> syntaxes in the same request. You can create a maximum of 30
     *        outputs per job. </p>
     *        <p>
     *        If you specify more than one output for a job, Elastic Transcoder creates the files for each output in the
     *        order in which you specify them in the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withOutputs(java.util.Collection<JobOutput> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * The value, if any, that you want Elastic Transcoder to prepend to the names of all files that this job creates,
     * including output files, thumbnails, and playlists. We recommend that you add a / or some other delimiter to the
     * end of the <code>OutputKeyPrefix</code>.
     * </p>
     * 
     * @param outputKeyPrefix
     *        The value, if any, that you want Elastic Transcoder to prepend to the names of all files that this job
     *        creates, including output files, thumbnails, and playlists. We recommend that you add a / or some other
     *        delimiter to the end of the <code>OutputKeyPrefix</code>.
     */

    public void setOutputKeyPrefix(String outputKeyPrefix) {
        this.outputKeyPrefix = outputKeyPrefix;
    }

    /**
     * <p>
     * The value, if any, that you want Elastic Transcoder to prepend to the names of all files that this job creates,
     * including output files, thumbnails, and playlists. We recommend that you add a / or some other delimiter to the
     * end of the <code>OutputKeyPrefix</code>.
     * </p>
     * 
     * @return The value, if any, that you want Elastic Transcoder to prepend to the names of all files that this job
     *         creates, including output files, thumbnails, and playlists. We recommend that you add a / or some other
     *         delimiter to the end of the <code>OutputKeyPrefix</code>.
     */

    public String getOutputKeyPrefix() {
        return this.outputKeyPrefix;
    }

    /**
     * <p>
     * The value, if any, that you want Elastic Transcoder to prepend to the names of all files that this job creates,
     * including output files, thumbnails, and playlists. We recommend that you add a / or some other delimiter to the
     * end of the <code>OutputKeyPrefix</code>.
     * </p>
     * 
     * @param outputKeyPrefix
     *        The value, if any, that you want Elastic Transcoder to prepend to the names of all files that this job
     *        creates, including output files, thumbnails, and playlists. We recommend that you add a / or some other
     *        delimiter to the end of the <code>OutputKeyPrefix</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withOutputKeyPrefix(String outputKeyPrefix) {
        setOutputKeyPrefix(outputKeyPrefix);
        return this;
    }

    /**
     * <important>
     * <p>
     * Outputs in Fragmented MP4 or MPEG-TS format only.
     * </p>
     * </important>
     * <p>
     * If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is fmp4
     * (Fragmented MP4) or ts (MPEG-TS), <code>Playlists</code> contains information about the master playlists that you
     * want Elastic Transcoder to create.
     * </p>
     * <p>
     * The maximum number of master playlists in a job is 30.
     * </p>
     * 
     * @return <p>
     *         Outputs in Fragmented MP4 or MPEG-TS format only.
     *         </p>
     *         </important>
     *         <p>
     *         If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is fmp4
     *         (Fragmented MP4) or ts (MPEG-TS), <code>Playlists</code> contains information about the master playlists
     *         that you want Elastic Transcoder to create.
     *         </p>
     *         <p>
     *         The maximum number of master playlists in a job is 30.
     */

    public java.util.List<Playlist> getPlaylists() {
        if (playlists == null) {
            playlists = new com.amazonaws.internal.SdkInternalList<Playlist>();
        }
        return playlists;
    }

    /**
     * <important>
     * <p>
     * Outputs in Fragmented MP4 or MPEG-TS format only.
     * </p>
     * </important>
     * <p>
     * If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is fmp4
     * (Fragmented MP4) or ts (MPEG-TS), <code>Playlists</code> contains information about the master playlists that you
     * want Elastic Transcoder to create.
     * </p>
     * <p>
     * The maximum number of master playlists in a job is 30.
     * </p>
     * 
     * @param playlists
     *        <p>
     *        Outputs in Fragmented MP4 or MPEG-TS format only.
     *        </p>
     *        </important>
     *        <p>
     *        If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is fmp4
     *        (Fragmented MP4) or ts (MPEG-TS), <code>Playlists</code> contains information about the master playlists
     *        that you want Elastic Transcoder to create.
     *        </p>
     *        <p>
     *        The maximum number of master playlists in a job is 30.
     */

    public void setPlaylists(java.util.Collection<Playlist> playlists) {
        if (playlists == null) {
            this.playlists = null;
            return;
        }

        this.playlists = new com.amazonaws.internal.SdkInternalList<Playlist>(playlists);
    }

    /**
     * <important>
     * <p>
     * Outputs in Fragmented MP4 or MPEG-TS format only.
     * </p>
     * </important>
     * <p>
     * If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is fmp4
     * (Fragmented MP4) or ts (MPEG-TS), <code>Playlists</code> contains information about the master playlists that you
     * want Elastic Transcoder to create.
     * </p>
     * <p>
     * The maximum number of master playlists in a job is 30.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlaylists(java.util.Collection)} or {@link #withPlaylists(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param playlists
     *        <p>
     *        Outputs in Fragmented MP4 or MPEG-TS format only.
     *        </p>
     *        </important>
     *        <p>
     *        If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is fmp4
     *        (Fragmented MP4) or ts (MPEG-TS), <code>Playlists</code> contains information about the master playlists
     *        that you want Elastic Transcoder to create.
     *        </p>
     *        <p>
     *        The maximum number of master playlists in a job is 30.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withPlaylists(Playlist... playlists) {
        if (this.playlists == null) {
            setPlaylists(new com.amazonaws.internal.SdkInternalList<Playlist>(playlists.length));
        }
        for (Playlist ele : playlists) {
            this.playlists.add(ele);
        }
        return this;
    }

    /**
     * <important>
     * <p>
     * Outputs in Fragmented MP4 or MPEG-TS format only.
     * </p>
     * </important>
     * <p>
     * If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is fmp4
     * (Fragmented MP4) or ts (MPEG-TS), <code>Playlists</code> contains information about the master playlists that you
     * want Elastic Transcoder to create.
     * </p>
     * <p>
     * The maximum number of master playlists in a job is 30.
     * </p>
     * 
     * @param playlists
     *        <p>
     *        Outputs in Fragmented MP4 or MPEG-TS format only.
     *        </p>
     *        </important>
     *        <p>
     *        If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is fmp4
     *        (Fragmented MP4) or ts (MPEG-TS), <code>Playlists</code> contains information about the master playlists
     *        that you want Elastic Transcoder to create.
     *        </p>
     *        <p>
     *        The maximum number of master playlists in a job is 30.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withPlaylists(java.util.Collection<Playlist> playlists) {
        setPlaylists(playlists);
        return this;
    }

    /**
     * <p>
     * The status of the job: <code>Submitted</code>, <code>Progressing</code>, <code>Complete</code>,
     * <code>Canceled</code>, or <code>Error</code>.
     * </p>
     * 
     * @param status
     *        The status of the job: <code>Submitted</code>, <code>Progressing</code>, <code>Complete</code>,
     *        <code>Canceled</code>, or <code>Error</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the job: <code>Submitted</code>, <code>Progressing</code>, <code>Complete</code>,
     * <code>Canceled</code>, or <code>Error</code>.
     * </p>
     * 
     * @return The status of the job: <code>Submitted</code>, <code>Progressing</code>, <code>Complete</code>,
     *         <code>Canceled</code>, or <code>Error</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the job: <code>Submitted</code>, <code>Progressing</code>, <code>Complete</code>,
     * <code>Canceled</code>, or <code>Error</code>.
     * </p>
     * 
     * @param status
     *        The status of the job: <code>Submitted</code>, <code>Progressing</code>, <code>Complete</code>,
     *        <code>Canceled</code>, or <code>Error</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * User-defined metadata that you want to associate with an Elastic Transcoder job. You specify metadata in
     * <code>key/value</code> pairs, and you can add up to 10 <code>key/value</code> pairs per job. Elastic Transcoder
     * does not guarantee that <code>key/value</code> pairs are returned in the same order in which you specify them.
     * </p>
     * <p>
     * Metadata <code>keys</code> and <code>values</code> must use characters from the following list:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0-9</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>A-Z</code> and <code>a-z</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Space</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The following symbols: <code>_.:/=+-%@</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return User-defined metadata that you want to associate with an Elastic Transcoder job. You specify metadata in
     *         <code>key/value</code> pairs, and you can add up to 10 <code>key/value</code> pairs per job. Elastic
     *         Transcoder does not guarantee that <code>key/value</code> pairs are returned in the same order in which
     *         you specify them.</p>
     *         <p>
     *         Metadata <code>keys</code> and <code>values</code> must use characters from the following list:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>0-9</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>A-Z</code> and <code>a-z</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Space</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The following symbols: <code>_.:/=+-%@</code>
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getUserMetadata() {
        if (userMetadata == null) {
            userMetadata = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return userMetadata;
    }

    /**
     * <p>
     * User-defined metadata that you want to associate with an Elastic Transcoder job. You specify metadata in
     * <code>key/value</code> pairs, and you can add up to 10 <code>key/value</code> pairs per job. Elastic Transcoder
     * does not guarantee that <code>key/value</code> pairs are returned in the same order in which you specify them.
     * </p>
     * <p>
     * Metadata <code>keys</code> and <code>values</code> must use characters from the following list:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0-9</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>A-Z</code> and <code>a-z</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Space</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The following symbols: <code>_.:/=+-%@</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param userMetadata
     *        User-defined metadata that you want to associate with an Elastic Transcoder job. You specify metadata in
     *        <code>key/value</code> pairs, and you can add up to 10 <code>key/value</code> pairs per job. Elastic
     *        Transcoder does not guarantee that <code>key/value</code> pairs are returned in the same order in which
     *        you specify them.</p>
     *        <p>
     *        Metadata <code>keys</code> and <code>values</code> must use characters from the following list:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>0-9</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>A-Z</code> and <code>a-z</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Space</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The following symbols: <code>_.:/=+-%@</code>
     *        </p>
     *        </li>
     */

    public void setUserMetadata(java.util.Map<String, String> userMetadata) {
        this.userMetadata = userMetadata == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(userMetadata);
    }

    /**
     * <p>
     * User-defined metadata that you want to associate with an Elastic Transcoder job. You specify metadata in
     * <code>key/value</code> pairs, and you can add up to 10 <code>key/value</code> pairs per job. Elastic Transcoder
     * does not guarantee that <code>key/value</code> pairs are returned in the same order in which you specify them.
     * </p>
     * <p>
     * Metadata <code>keys</code> and <code>values</code> must use characters from the following list:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0-9</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>A-Z</code> and <code>a-z</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Space</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The following symbols: <code>_.:/=+-%@</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param userMetadata
     *        User-defined metadata that you want to associate with an Elastic Transcoder job. You specify metadata in
     *        <code>key/value</code> pairs, and you can add up to 10 <code>key/value</code> pairs per job. Elastic
     *        Transcoder does not guarantee that <code>key/value</code> pairs are returned in the same order in which
     *        you specify them.</p>
     *        <p>
     *        Metadata <code>keys</code> and <code>values</code> must use characters from the following list:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>0-9</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>A-Z</code> and <code>a-z</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Space</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The following symbols: <code>_.:/=+-%@</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withUserMetadata(java.util.Map<String, String> userMetadata) {
        setUserMetadata(userMetadata);
        return this;
    }

    public Job addUserMetadataEntry(String key, String value) {
        if (null == this.userMetadata) {
            this.userMetadata = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.userMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.userMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UserMetadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job clearUserMetadataEntries() {
        this.userMetadata = null;
        return this;
    }

    /**
     * <p>
     * Details about the timing of a job.
     * </p>
     * 
     * @param timing
     *        Details about the timing of a job.
     */

    public void setTiming(Timing timing) {
        this.timing = timing;
    }

    /**
     * <p>
     * Details about the timing of a job.
     * </p>
     * 
     * @return Details about the timing of a job.
     */

    public Timing getTiming() {
        return this.timing;
    }

    /**
     * <p>
     * Details about the timing of a job.
     * </p>
     * 
     * @param timing
     *        Details about the timing of a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withTiming(Timing timing) {
        setTiming(timing);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getPipelineId() != null)
            sb.append("PipelineId: ").append(getPipelineId()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
        if (getOutput() != null)
            sb.append("Output: ").append(getOutput()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getOutputKeyPrefix() != null)
            sb.append("OutputKeyPrefix: ").append(getOutputKeyPrefix()).append(",");
        if (getPlaylists() != null)
            sb.append("Playlists: ").append(getPlaylists()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUserMetadata() != null)
            sb.append("UserMetadata: ").append(getUserMetadata()).append(",");
        if (getTiming() != null)
            sb.append("Timing: ").append(getTiming());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Job == false)
            return false;
        Job other = (Job) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getPipelineId() == null ^ this.getPipelineId() == null)
            return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getOutputKeyPrefix() == null ^ this.getOutputKeyPrefix() == null)
            return false;
        if (other.getOutputKeyPrefix() != null && other.getOutputKeyPrefix().equals(this.getOutputKeyPrefix()) == false)
            return false;
        if (other.getPlaylists() == null ^ this.getPlaylists() == null)
            return false;
        if (other.getPlaylists() != null && other.getPlaylists().equals(this.getPlaylists()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUserMetadata() == null ^ this.getUserMetadata() == null)
            return false;
        if (other.getUserMetadata() != null && other.getUserMetadata().equals(this.getUserMetadata()) == false)
            return false;
        if (other.getTiming() == null ^ this.getTiming() == null)
            return false;
        if (other.getTiming() != null && other.getTiming().equals(this.getTiming()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getOutputKeyPrefix() == null) ? 0 : getOutputKeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getPlaylists() == null) ? 0 : getPlaylists().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUserMetadata() == null) ? 0 : getUserMetadata().hashCode());
        hashCode = prime * hashCode + ((getTiming() == null) ? 0 : getTiming().hashCode());
        return hashCode;
    }

    @Override
    public Job clone() {
        try {
            return (Job) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.JobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
