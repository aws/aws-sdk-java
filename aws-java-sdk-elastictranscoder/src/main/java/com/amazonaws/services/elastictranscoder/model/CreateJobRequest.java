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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The <code>CreateJobRequest</code> structure.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * A section of the request body that provides information about the file that is being transcoded.
     * </p>
     */
    private JobInput input;
    /**
     * <p>
     * A section of the request body that provides information about the files that are being transcoded.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<JobInput> inputs;
    /**
     * <p>
     * A section of the request body that provides information about the transcoded (target) file. We strongly recommend
     * that you use the <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     * </p>
     */
    private CreateJobOutput output;
    /**
     * <p>
     * A section of the request body that provides information about the transcoded (target) files. We recommend that
     * you use the <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CreateJobOutput> outputs;
    /**
     * <p>
     * The value, if any, that you want Elastic Transcoder to prepend to the names of all files that this job creates,
     * including output files, thumbnails, and playlists.
     * </p>
     */
    private String outputKeyPrefix;
    /**
     * <p>
     * If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is fmp4
     * (Fragmented MP4) or ts (MPEG-TS), Playlists contains information about the master playlists that you want Elastic
     * Transcoder to create.
     * </p>
     * <p>
     * The maximum number of master playlists in a job is 30.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CreateJobPlaylist> playlists;
    /**
     * <p>
     * User-defined metadata that you want to associate with an Elastic Transcoder job. You specify metadata in
     * <code>key/value</code> pairs, and you can add up to 10 <code>key/value</code> pairs per job. Elastic Transcoder
     * does not guarantee that <code>key/value</code> pairs are returned in the same order in which you specify them.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> userMetadata;

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

    public CreateJobRequest withPipelineId(String pipelineId) {
        setPipelineId(pipelineId);
        return this;
    }

    /**
     * <p>
     * A section of the request body that provides information about the file that is being transcoded.
     * </p>
     * 
     * @param input
     *        A section of the request body that provides information about the file that is being transcoded.
     */

    public void setInput(JobInput input) {
        this.input = input;
    }

    /**
     * <p>
     * A section of the request body that provides information about the file that is being transcoded.
     * </p>
     * 
     * @return A section of the request body that provides information about the file that is being transcoded.
     */

    public JobInput getInput() {
        return this.input;
    }

    /**
     * <p>
     * A section of the request body that provides information about the file that is being transcoded.
     * </p>
     * 
     * @param input
     *        A section of the request body that provides information about the file that is being transcoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withInput(JobInput input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * A section of the request body that provides information about the files that are being transcoded.
     * </p>
     * 
     * @return A section of the request body that provides information about the files that are being transcoded.
     */

    public java.util.List<JobInput> getInputs() {
        if (inputs == null) {
            inputs = new com.amazonaws.internal.SdkInternalList<JobInput>();
        }
        return inputs;
    }

    /**
     * <p>
     * A section of the request body that provides information about the files that are being transcoded.
     * </p>
     * 
     * @param inputs
     *        A section of the request body that provides information about the files that are being transcoded.
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
     * A section of the request body that provides information about the files that are being transcoded.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        A section of the request body that provides information about the files that are being transcoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withInputs(JobInput... inputs) {
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
     * A section of the request body that provides information about the files that are being transcoded.
     * </p>
     * 
     * @param inputs
     *        A section of the request body that provides information about the files that are being transcoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withInputs(java.util.Collection<JobInput> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * A section of the request body that provides information about the transcoded (target) file. We strongly recommend
     * that you use the <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     * </p>
     * 
     * @param output
     *        A section of the request body that provides information about the transcoded (target) file. We strongly
     *        recommend that you use the <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     */

    public void setOutput(CreateJobOutput output) {
        this.output = output;
    }

    /**
     * <p>
     * A section of the request body that provides information about the transcoded (target) file. We strongly recommend
     * that you use the <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     * </p>
     * 
     * @return A section of the request body that provides information about the transcoded (target) file. We strongly
     *         recommend that you use the <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     */

    public CreateJobOutput getOutput() {
        return this.output;
    }

    /**
     * <p>
     * A section of the request body that provides information about the transcoded (target) file. We strongly recommend
     * that you use the <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     * </p>
     * 
     * @param output
     *        A section of the request body that provides information about the transcoded (target) file. We strongly
     *        recommend that you use the <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withOutput(CreateJobOutput output) {
        setOutput(output);
        return this;
    }

    /**
     * <p>
     * A section of the request body that provides information about the transcoded (target) files. We recommend that
     * you use the <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     * </p>
     * 
     * @return A section of the request body that provides information about the transcoded (target) files. We recommend
     *         that you use the <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     */

    public java.util.List<CreateJobOutput> getOutputs() {
        if (outputs == null) {
            outputs = new com.amazonaws.internal.SdkInternalList<CreateJobOutput>();
        }
        return outputs;
    }

    /**
     * <p>
     * A section of the request body that provides information about the transcoded (target) files. We recommend that
     * you use the <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     * </p>
     * 
     * @param outputs
     *        A section of the request body that provides information about the transcoded (target) files. We recommend
     *        that you use the <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     */

    public void setOutputs(java.util.Collection<CreateJobOutput> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new com.amazonaws.internal.SdkInternalList<CreateJobOutput>(outputs);
    }

    /**
     * <p>
     * A section of the request body that provides information about the transcoded (target) files. We recommend that
     * you use the <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        A section of the request body that provides information about the transcoded (target) files. We recommend
     *        that you use the <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withOutputs(CreateJobOutput... outputs) {
        if (this.outputs == null) {
            setOutputs(new com.amazonaws.internal.SdkInternalList<CreateJobOutput>(outputs.length));
        }
        for (CreateJobOutput ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A section of the request body that provides information about the transcoded (target) files. We recommend that
     * you use the <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     * </p>
     * 
     * @param outputs
     *        A section of the request body that provides information about the transcoded (target) files. We recommend
     *        that you use the <code>Outputs</code> syntax instead of the <code>Output</code> syntax.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withOutputs(java.util.Collection<CreateJobOutput> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * The value, if any, that you want Elastic Transcoder to prepend to the names of all files that this job creates,
     * including output files, thumbnails, and playlists.
     * </p>
     * 
     * @param outputKeyPrefix
     *        The value, if any, that you want Elastic Transcoder to prepend to the names of all files that this job
     *        creates, including output files, thumbnails, and playlists.
     */

    public void setOutputKeyPrefix(String outputKeyPrefix) {
        this.outputKeyPrefix = outputKeyPrefix;
    }

    /**
     * <p>
     * The value, if any, that you want Elastic Transcoder to prepend to the names of all files that this job creates,
     * including output files, thumbnails, and playlists.
     * </p>
     * 
     * @return The value, if any, that you want Elastic Transcoder to prepend to the names of all files that this job
     *         creates, including output files, thumbnails, and playlists.
     */

    public String getOutputKeyPrefix() {
        return this.outputKeyPrefix;
    }

    /**
     * <p>
     * The value, if any, that you want Elastic Transcoder to prepend to the names of all files that this job creates,
     * including output files, thumbnails, and playlists.
     * </p>
     * 
     * @param outputKeyPrefix
     *        The value, if any, that you want Elastic Transcoder to prepend to the names of all files that this job
     *        creates, including output files, thumbnails, and playlists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withOutputKeyPrefix(String outputKeyPrefix) {
        setOutputKeyPrefix(outputKeyPrefix);
        return this;
    }

    /**
     * <p>
     * If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is fmp4
     * (Fragmented MP4) or ts (MPEG-TS), Playlists contains information about the master playlists that you want Elastic
     * Transcoder to create.
     * </p>
     * <p>
     * The maximum number of master playlists in a job is 30.
     * </p>
     * 
     * @return If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is fmp4
     *         (Fragmented MP4) or ts (MPEG-TS), Playlists contains information about the master playlists that you want
     *         Elastic Transcoder to create.</p>
     *         <p>
     *         The maximum number of master playlists in a job is 30.
     */

    public java.util.List<CreateJobPlaylist> getPlaylists() {
        if (playlists == null) {
            playlists = new com.amazonaws.internal.SdkInternalList<CreateJobPlaylist>();
        }
        return playlists;
    }

    /**
     * <p>
     * If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is fmp4
     * (Fragmented MP4) or ts (MPEG-TS), Playlists contains information about the master playlists that you want Elastic
     * Transcoder to create.
     * </p>
     * <p>
     * The maximum number of master playlists in a job is 30.
     * </p>
     * 
     * @param playlists
     *        If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is fmp4
     *        (Fragmented MP4) or ts (MPEG-TS), Playlists contains information about the master playlists that you want
     *        Elastic Transcoder to create.</p>
     *        <p>
     *        The maximum number of master playlists in a job is 30.
     */

    public void setPlaylists(java.util.Collection<CreateJobPlaylist> playlists) {
        if (playlists == null) {
            this.playlists = null;
            return;
        }

        this.playlists = new com.amazonaws.internal.SdkInternalList<CreateJobPlaylist>(playlists);
    }

    /**
     * <p>
     * If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is fmp4
     * (Fragmented MP4) or ts (MPEG-TS), Playlists contains information about the master playlists that you want Elastic
     * Transcoder to create.
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
     *        If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is fmp4
     *        (Fragmented MP4) or ts (MPEG-TS), Playlists contains information about the master playlists that you want
     *        Elastic Transcoder to create.</p>
     *        <p>
     *        The maximum number of master playlists in a job is 30.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withPlaylists(CreateJobPlaylist... playlists) {
        if (this.playlists == null) {
            setPlaylists(new com.amazonaws.internal.SdkInternalList<CreateJobPlaylist>(playlists.length));
        }
        for (CreateJobPlaylist ele : playlists) {
            this.playlists.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is fmp4
     * (Fragmented MP4) or ts (MPEG-TS), Playlists contains information about the master playlists that you want Elastic
     * Transcoder to create.
     * </p>
     * <p>
     * The maximum number of master playlists in a job is 30.
     * </p>
     * 
     * @param playlists
     *        If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is fmp4
     *        (Fragmented MP4) or ts (MPEG-TS), Playlists contains information about the master playlists that you want
     *        Elastic Transcoder to create.</p>
     *        <p>
     *        The maximum number of master playlists in a job is 30.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withPlaylists(java.util.Collection<CreateJobPlaylist> playlists) {
        setPlaylists(playlists);
        return this;
    }

    /**
     * <p>
     * User-defined metadata that you want to associate with an Elastic Transcoder job. You specify metadata in
     * <code>key/value</code> pairs, and you can add up to 10 <code>key/value</code> pairs per job. Elastic Transcoder
     * does not guarantee that <code>key/value</code> pairs are returned in the same order in which you specify them.
     * </p>
     * 
     * @return User-defined metadata that you want to associate with an Elastic Transcoder job. You specify metadata in
     *         <code>key/value</code> pairs, and you can add up to 10 <code>key/value</code> pairs per job. Elastic
     *         Transcoder does not guarantee that <code>key/value</code> pairs are returned in the same order in which
     *         you specify them.
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
     * 
     * @param userMetadata
     *        User-defined metadata that you want to associate with an Elastic Transcoder job. You specify metadata in
     *        <code>key/value</code> pairs, and you can add up to 10 <code>key/value</code> pairs per job. Elastic
     *        Transcoder does not guarantee that <code>key/value</code> pairs are returned in the same order in which
     *        you specify them.
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
     * 
     * @param userMetadata
     *        User-defined metadata that you want to associate with an Elastic Transcoder job. You specify metadata in
     *        <code>key/value</code> pairs, and you can add up to 10 <code>key/value</code> pairs per job. Elastic
     *        Transcoder does not guarantee that <code>key/value</code> pairs are returned in the same order in which
     *        you specify them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withUserMetadata(java.util.Map<String, String> userMetadata) {
        setUserMetadata(userMetadata);
        return this;
    }

    public CreateJobRequest addUserMetadataEntry(String key, String value) {
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

    public CreateJobRequest clearUserMetadataEntries() {
        this.userMetadata = null;
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
        if (getUserMetadata() != null)
            sb.append("UserMetadata: ").append(getUserMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateJobRequest == false)
            return false;
        CreateJobRequest other = (CreateJobRequest) obj;
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
        if (other.getUserMetadata() == null ^ this.getUserMetadata() == null)
            return false;
        if (other.getUserMetadata() != null && other.getUserMetadata().equals(this.getUserMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getOutputKeyPrefix() == null) ? 0 : getOutputKeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getPlaylists() == null) ? 0 : getPlaylists().hashCode());
        hashCode = prime * hashCode + ((getUserMetadata() == null) ? 0 : getUserMetadata().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobRequest clone() {
        return (CreateJobRequest) super.clone();
    }

}
