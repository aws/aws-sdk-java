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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the structure of actions and stages to be performed in the pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PipelineDeclaration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineDeclaration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for CodePipeline to use to either perform actions with no
     * <code>actionRoleArn</code>, or to use to assume roles for actions with an <code>actionRoleArn</code>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Represents information about the S3 bucket where artifacts are stored for the pipeline.
     * </p>
     * <note>
     * <p>
     * You must include either <code>artifactStore</code> or <code>artifactStores</code> in your pipeline, but you
     * cannot use both. If you create a cross-region action in your pipeline, you must use <code>artifactStores</code>.
     * </p>
     * </note>
     */
    private ArtifactStore artifactStore;
    /**
     * <p>
     * A mapping of <code>artifactStore</code> objects and their corresponding Amazon Web Services Regions. There must
     * be an artifact store for the pipeline Region and for each cross-region action in the pipeline.
     * </p>
     * <note>
     * <p>
     * You must include either <code>artifactStore</code> or <code>artifactStores</code> in your pipeline, but you
     * cannot use both. If you create a cross-region action in your pipeline, you must use <code>artifactStores</code>.
     * </p>
     * </note>
     */
    private java.util.Map<String, ArtifactStore> artifactStores;
    /**
     * <p>
     * The stage in which to perform the action.
     * </p>
     */
    private java.util.List<StageDeclaration> stages;
    /**
     * <p>
     * The version number of the pipeline. A new pipeline always has a version number of 1. This number is incremented
     * when a pipeline is updated.
     * </p>
     */
    private Integer version;
    /**
     * <p>
     * The method that the pipeline will use to handle multiple executions. The default mode is SUPERSEDED.
     * </p>
     */
    private String executionMode;
    /**
     * <p>
     * CodePipeline provides the following pipeline types, which differ in characteristics and price, so that you can
     * tailor your pipeline features and cost to the needs of your applications.
     * </p>
     * <ul>
     * <li>
     * <p>
     * V1 type pipelines have a JSON structure that contains standard pipeline, stage, and action-level parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * V2 type pipelines have the same structure as a V1 type, along with additional parameters for release safety and
     * trigger configuration.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or updating a pipeline
     * will result in the pipeline having the V2 type of pipeline and the associated costs.
     * </p>
     * </important>
     * <p>
     * For information about pricing for CodePipeline, see <a
     * href="http://aws.amazon.com/codepipeline/pricing/">Pricing</a>.
     * </p>
     * <p>
     * For information about which type of pipeline to choose, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html">What type of
     * pipeline is right for me?</a>.
     * </p>
     */
    private String pipelineType;
    /**
     * <p>
     * A list that defines the pipeline variables for a pipeline resource. Variable names can have alphanumeric and
     * underscore characters, and the values must match <code>[A-Za-z0-9@\-_]+</code>.
     * </p>
     */
    private java.util.List<PipelineVariableDeclaration> variables;
    /**
     * <p>
     * The trigger configuration specifying a type of event, such as Git tags, that starts the pipeline.
     * </p>
     * <note>
     * <p>
     * When a trigger configuration is specified, default change detection for repository and branch commits is
     * disabled.
     * </p>
     * </note>
     */
    private java.util.List<PipelineTriggerDeclaration> triggers;

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @param name
     *        The name of the pipeline.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @return The name of the pipeline.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @param name
     *        The name of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDeclaration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for CodePipeline to use to either perform actions with no
     * <code>actionRoleArn</code>, or to use to assume roles for actions with an <code>actionRoleArn</code>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) for CodePipeline to use to either perform actions with no
     *        <code>actionRoleArn</code>, or to use to assume roles for actions with an <code>actionRoleArn</code>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for CodePipeline to use to either perform actions with no
     * <code>actionRoleArn</code>, or to use to assume roles for actions with an <code>actionRoleArn</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for CodePipeline to use to either perform actions with no
     *         <code>actionRoleArn</code>, or to use to assume roles for actions with an <code>actionRoleArn</code>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for CodePipeline to use to either perform actions with no
     * <code>actionRoleArn</code>, or to use to assume roles for actions with an <code>actionRoleArn</code>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) for CodePipeline to use to either perform actions with no
     *        <code>actionRoleArn</code>, or to use to assume roles for actions with an <code>actionRoleArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDeclaration withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Represents information about the S3 bucket where artifacts are stored for the pipeline.
     * </p>
     * <note>
     * <p>
     * You must include either <code>artifactStore</code> or <code>artifactStores</code> in your pipeline, but you
     * cannot use both. If you create a cross-region action in your pipeline, you must use <code>artifactStores</code>.
     * </p>
     * </note>
     * 
     * @param artifactStore
     *        Represents information about the S3 bucket where artifacts are stored for the pipeline.</p> <note>
     *        <p>
     *        You must include either <code>artifactStore</code> or <code>artifactStores</code> in your pipeline, but
     *        you cannot use both. If you create a cross-region action in your pipeline, you must use
     *        <code>artifactStores</code>.
     *        </p>
     */

    public void setArtifactStore(ArtifactStore artifactStore) {
        this.artifactStore = artifactStore;
    }

    /**
     * <p>
     * Represents information about the S3 bucket where artifacts are stored for the pipeline.
     * </p>
     * <note>
     * <p>
     * You must include either <code>artifactStore</code> or <code>artifactStores</code> in your pipeline, but you
     * cannot use both. If you create a cross-region action in your pipeline, you must use <code>artifactStores</code>.
     * </p>
     * </note>
     * 
     * @return Represents information about the S3 bucket where artifacts are stored for the pipeline.</p> <note>
     *         <p>
     *         You must include either <code>artifactStore</code> or <code>artifactStores</code> in your pipeline, but
     *         you cannot use both. If you create a cross-region action in your pipeline, you must use
     *         <code>artifactStores</code>.
     *         </p>
     */

    public ArtifactStore getArtifactStore() {
        return this.artifactStore;
    }

    /**
     * <p>
     * Represents information about the S3 bucket where artifacts are stored for the pipeline.
     * </p>
     * <note>
     * <p>
     * You must include either <code>artifactStore</code> or <code>artifactStores</code> in your pipeline, but you
     * cannot use both. If you create a cross-region action in your pipeline, you must use <code>artifactStores</code>.
     * </p>
     * </note>
     * 
     * @param artifactStore
     *        Represents information about the S3 bucket where artifacts are stored for the pipeline.</p> <note>
     *        <p>
     *        You must include either <code>artifactStore</code> or <code>artifactStores</code> in your pipeline, but
     *        you cannot use both. If you create a cross-region action in your pipeline, you must use
     *        <code>artifactStores</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDeclaration withArtifactStore(ArtifactStore artifactStore) {
        setArtifactStore(artifactStore);
        return this;
    }

    /**
     * <p>
     * A mapping of <code>artifactStore</code> objects and their corresponding Amazon Web Services Regions. There must
     * be an artifact store for the pipeline Region and for each cross-region action in the pipeline.
     * </p>
     * <note>
     * <p>
     * You must include either <code>artifactStore</code> or <code>artifactStores</code> in your pipeline, but you
     * cannot use both. If you create a cross-region action in your pipeline, you must use <code>artifactStores</code>.
     * </p>
     * </note>
     * 
     * @return A mapping of <code>artifactStore</code> objects and their corresponding Amazon Web Services Regions.
     *         There must be an artifact store for the pipeline Region and for each cross-region action in the
     *         pipeline.</p> <note>
     *         <p>
     *         You must include either <code>artifactStore</code> or <code>artifactStores</code> in your pipeline, but
     *         you cannot use both. If you create a cross-region action in your pipeline, you must use
     *         <code>artifactStores</code>.
     *         </p>
     */

    public java.util.Map<String, ArtifactStore> getArtifactStores() {
        return artifactStores;
    }

    /**
     * <p>
     * A mapping of <code>artifactStore</code> objects and their corresponding Amazon Web Services Regions. There must
     * be an artifact store for the pipeline Region and for each cross-region action in the pipeline.
     * </p>
     * <note>
     * <p>
     * You must include either <code>artifactStore</code> or <code>artifactStores</code> in your pipeline, but you
     * cannot use both. If you create a cross-region action in your pipeline, you must use <code>artifactStores</code>.
     * </p>
     * </note>
     * 
     * @param artifactStores
     *        A mapping of <code>artifactStore</code> objects and their corresponding Amazon Web Services Regions. There
     *        must be an artifact store for the pipeline Region and for each cross-region action in the pipeline.</p>
     *        <note>
     *        <p>
     *        You must include either <code>artifactStore</code> or <code>artifactStores</code> in your pipeline, but
     *        you cannot use both. If you create a cross-region action in your pipeline, you must use
     *        <code>artifactStores</code>.
     *        </p>
     */

    public void setArtifactStores(java.util.Map<String, ArtifactStore> artifactStores) {
        this.artifactStores = artifactStores;
    }

    /**
     * <p>
     * A mapping of <code>artifactStore</code> objects and their corresponding Amazon Web Services Regions. There must
     * be an artifact store for the pipeline Region and for each cross-region action in the pipeline.
     * </p>
     * <note>
     * <p>
     * You must include either <code>artifactStore</code> or <code>artifactStores</code> in your pipeline, but you
     * cannot use both. If you create a cross-region action in your pipeline, you must use <code>artifactStores</code>.
     * </p>
     * </note>
     * 
     * @param artifactStores
     *        A mapping of <code>artifactStore</code> objects and their corresponding Amazon Web Services Regions. There
     *        must be an artifact store for the pipeline Region and for each cross-region action in the pipeline.</p>
     *        <note>
     *        <p>
     *        You must include either <code>artifactStore</code> or <code>artifactStores</code> in your pipeline, but
     *        you cannot use both. If you create a cross-region action in your pipeline, you must use
     *        <code>artifactStores</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDeclaration withArtifactStores(java.util.Map<String, ArtifactStore> artifactStores) {
        setArtifactStores(artifactStores);
        return this;
    }

    /**
     * Add a single ArtifactStores entry
     *
     * @see PipelineDeclaration#withArtifactStores
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDeclaration addArtifactStoresEntry(String key, ArtifactStore value) {
        if (null == this.artifactStores) {
            this.artifactStores = new java.util.HashMap<String, ArtifactStore>();
        }
        if (this.artifactStores.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.artifactStores.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ArtifactStores.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDeclaration clearArtifactStoresEntries() {
        this.artifactStores = null;
        return this;
    }

    /**
     * <p>
     * The stage in which to perform the action.
     * </p>
     * 
     * @return The stage in which to perform the action.
     */

    public java.util.List<StageDeclaration> getStages() {
        return stages;
    }

    /**
     * <p>
     * The stage in which to perform the action.
     * </p>
     * 
     * @param stages
     *        The stage in which to perform the action.
     */

    public void setStages(java.util.Collection<StageDeclaration> stages) {
        if (stages == null) {
            this.stages = null;
            return;
        }

        this.stages = new java.util.ArrayList<StageDeclaration>(stages);
    }

    /**
     * <p>
     * The stage in which to perform the action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStages(java.util.Collection)} or {@link #withStages(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param stages
     *        The stage in which to perform the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDeclaration withStages(StageDeclaration... stages) {
        if (this.stages == null) {
            setStages(new java.util.ArrayList<StageDeclaration>(stages.length));
        }
        for (StageDeclaration ele : stages) {
            this.stages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The stage in which to perform the action.
     * </p>
     * 
     * @param stages
     *        The stage in which to perform the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDeclaration withStages(java.util.Collection<StageDeclaration> stages) {
        setStages(stages);
        return this;
    }

    /**
     * <p>
     * The version number of the pipeline. A new pipeline always has a version number of 1. This number is incremented
     * when a pipeline is updated.
     * </p>
     * 
     * @param version
     *        The version number of the pipeline. A new pipeline always has a version number of 1. This number is
     *        incremented when a pipeline is updated.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number of the pipeline. A new pipeline always has a version number of 1. This number is incremented
     * when a pipeline is updated.
     * </p>
     * 
     * @return The version number of the pipeline. A new pipeline always has a version number of 1. This number is
     *         incremented when a pipeline is updated.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version number of the pipeline. A new pipeline always has a version number of 1. This number is incremented
     * when a pipeline is updated.
     * </p>
     * 
     * @param version
     *        The version number of the pipeline. A new pipeline always has a version number of 1. This number is
     *        incremented when a pipeline is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDeclaration withVersion(Integer version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The method that the pipeline will use to handle multiple executions. The default mode is SUPERSEDED.
     * </p>
     * 
     * @param executionMode
     *        The method that the pipeline will use to handle multiple executions. The default mode is SUPERSEDED.
     * @see ExecutionMode
     */

    public void setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
    }

    /**
     * <p>
     * The method that the pipeline will use to handle multiple executions. The default mode is SUPERSEDED.
     * </p>
     * 
     * @return The method that the pipeline will use to handle multiple executions. The default mode is SUPERSEDED.
     * @see ExecutionMode
     */

    public String getExecutionMode() {
        return this.executionMode;
    }

    /**
     * <p>
     * The method that the pipeline will use to handle multiple executions. The default mode is SUPERSEDED.
     * </p>
     * 
     * @param executionMode
     *        The method that the pipeline will use to handle multiple executions. The default mode is SUPERSEDED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionMode
     */

    public PipelineDeclaration withExecutionMode(String executionMode) {
        setExecutionMode(executionMode);
        return this;
    }

    /**
     * <p>
     * The method that the pipeline will use to handle multiple executions. The default mode is SUPERSEDED.
     * </p>
     * 
     * @param executionMode
     *        The method that the pipeline will use to handle multiple executions. The default mode is SUPERSEDED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionMode
     */

    public PipelineDeclaration withExecutionMode(ExecutionMode executionMode) {
        this.executionMode = executionMode.toString();
        return this;
    }

    /**
     * <p>
     * CodePipeline provides the following pipeline types, which differ in characteristics and price, so that you can
     * tailor your pipeline features and cost to the needs of your applications.
     * </p>
     * <ul>
     * <li>
     * <p>
     * V1 type pipelines have a JSON structure that contains standard pipeline, stage, and action-level parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * V2 type pipelines have the same structure as a V1 type, along with additional parameters for release safety and
     * trigger configuration.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or updating a pipeline
     * will result in the pipeline having the V2 type of pipeline and the associated costs.
     * </p>
     * </important>
     * <p>
     * For information about pricing for CodePipeline, see <a
     * href="http://aws.amazon.com/codepipeline/pricing/">Pricing</a>.
     * </p>
     * <p>
     * For information about which type of pipeline to choose, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html">What type of
     * pipeline is right for me?</a>.
     * </p>
     * 
     * @param pipelineType
     *        CodePipeline provides the following pipeline types, which differ in characteristics and price, so that you
     *        can tailor your pipeline features and cost to the needs of your applications.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        V1 type pipelines have a JSON structure that contains standard pipeline, stage, and action-level
     *        parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        V2 type pipelines have the same structure as a V1 type, along with additional parameters for release
     *        safety and trigger configuration.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or updating a
     *        pipeline will result in the pipeline having the V2 type of pipeline and the associated costs.
     *        </p>
     *        </important>
     *        <p>
     *        For information about pricing for CodePipeline, see <a
     *        href="http://aws.amazon.com/codepipeline/pricing/">Pricing</a>.
     *        </p>
     *        <p>
     *        For information about which type of pipeline to choose, see <a
     *        href="https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html">What type of
     *        pipeline is right for me?</a>.
     * @see PipelineType
     */

    public void setPipelineType(String pipelineType) {
        this.pipelineType = pipelineType;
    }

    /**
     * <p>
     * CodePipeline provides the following pipeline types, which differ in characteristics and price, so that you can
     * tailor your pipeline features and cost to the needs of your applications.
     * </p>
     * <ul>
     * <li>
     * <p>
     * V1 type pipelines have a JSON structure that contains standard pipeline, stage, and action-level parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * V2 type pipelines have the same structure as a V1 type, along with additional parameters for release safety and
     * trigger configuration.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or updating a pipeline
     * will result in the pipeline having the V2 type of pipeline and the associated costs.
     * </p>
     * </important>
     * <p>
     * For information about pricing for CodePipeline, see <a
     * href="http://aws.amazon.com/codepipeline/pricing/">Pricing</a>.
     * </p>
     * <p>
     * For information about which type of pipeline to choose, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html">What type of
     * pipeline is right for me?</a>.
     * </p>
     * 
     * @return CodePipeline provides the following pipeline types, which differ in characteristics and price, so that
     *         you can tailor your pipeline features and cost to the needs of your applications.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         V1 type pipelines have a JSON structure that contains standard pipeline, stage, and action-level
     *         parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         V2 type pipelines have the same structure as a V1 type, along with additional parameters for release
     *         safety and trigger configuration.
     *         </p>
     *         </li>
     *         </ul>
     *         <important>
     *         <p>
     *         Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or updating a
     *         pipeline will result in the pipeline having the V2 type of pipeline and the associated costs.
     *         </p>
     *         </important>
     *         <p>
     *         For information about pricing for CodePipeline, see <a
     *         href="http://aws.amazon.com/codepipeline/pricing/">Pricing</a>.
     *         </p>
     *         <p>
     *         For information about which type of pipeline to choose, see <a
     *         href="https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html">What type
     *         of pipeline is right for me?</a>.
     * @see PipelineType
     */

    public String getPipelineType() {
        return this.pipelineType;
    }

    /**
     * <p>
     * CodePipeline provides the following pipeline types, which differ in characteristics and price, so that you can
     * tailor your pipeline features and cost to the needs of your applications.
     * </p>
     * <ul>
     * <li>
     * <p>
     * V1 type pipelines have a JSON structure that contains standard pipeline, stage, and action-level parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * V2 type pipelines have the same structure as a V1 type, along with additional parameters for release safety and
     * trigger configuration.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or updating a pipeline
     * will result in the pipeline having the V2 type of pipeline and the associated costs.
     * </p>
     * </important>
     * <p>
     * For information about pricing for CodePipeline, see <a
     * href="http://aws.amazon.com/codepipeline/pricing/">Pricing</a>.
     * </p>
     * <p>
     * For information about which type of pipeline to choose, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html">What type of
     * pipeline is right for me?</a>.
     * </p>
     * 
     * @param pipelineType
     *        CodePipeline provides the following pipeline types, which differ in characteristics and price, so that you
     *        can tailor your pipeline features and cost to the needs of your applications.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        V1 type pipelines have a JSON structure that contains standard pipeline, stage, and action-level
     *        parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        V2 type pipelines have the same structure as a V1 type, along with additional parameters for release
     *        safety and trigger configuration.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or updating a
     *        pipeline will result in the pipeline having the V2 type of pipeline and the associated costs.
     *        </p>
     *        </important>
     *        <p>
     *        For information about pricing for CodePipeline, see <a
     *        href="http://aws.amazon.com/codepipeline/pricing/">Pricing</a>.
     *        </p>
     *        <p>
     *        For information about which type of pipeline to choose, see <a
     *        href="https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html">What type of
     *        pipeline is right for me?</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineType
     */

    public PipelineDeclaration withPipelineType(String pipelineType) {
        setPipelineType(pipelineType);
        return this;
    }

    /**
     * <p>
     * CodePipeline provides the following pipeline types, which differ in characteristics and price, so that you can
     * tailor your pipeline features and cost to the needs of your applications.
     * </p>
     * <ul>
     * <li>
     * <p>
     * V1 type pipelines have a JSON structure that contains standard pipeline, stage, and action-level parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * V2 type pipelines have the same structure as a V1 type, along with additional parameters for release safety and
     * trigger configuration.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or updating a pipeline
     * will result in the pipeline having the V2 type of pipeline and the associated costs.
     * </p>
     * </important>
     * <p>
     * For information about pricing for CodePipeline, see <a
     * href="http://aws.amazon.com/codepipeline/pricing/">Pricing</a>.
     * </p>
     * <p>
     * For information about which type of pipeline to choose, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html">What type of
     * pipeline is right for me?</a>.
     * </p>
     * 
     * @param pipelineType
     *        CodePipeline provides the following pipeline types, which differ in characteristics and price, so that you
     *        can tailor your pipeline features and cost to the needs of your applications.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        V1 type pipelines have a JSON structure that contains standard pipeline, stage, and action-level
     *        parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        V2 type pipelines have the same structure as a V1 type, along with additional parameters for release
     *        safety and trigger configuration.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or updating a
     *        pipeline will result in the pipeline having the V2 type of pipeline and the associated costs.
     *        </p>
     *        </important>
     *        <p>
     *        For information about pricing for CodePipeline, see <a
     *        href="http://aws.amazon.com/codepipeline/pricing/">Pricing</a>.
     *        </p>
     *        <p>
     *        For information about which type of pipeline to choose, see <a
     *        href="https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html">What type of
     *        pipeline is right for me?</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineType
     */

    public PipelineDeclaration withPipelineType(PipelineType pipelineType) {
        this.pipelineType = pipelineType.toString();
        return this;
    }

    /**
     * <p>
     * A list that defines the pipeline variables for a pipeline resource. Variable names can have alphanumeric and
     * underscore characters, and the values must match <code>[A-Za-z0-9@\-_]+</code>.
     * </p>
     * 
     * @return A list that defines the pipeline variables for a pipeline resource. Variable names can have alphanumeric
     *         and underscore characters, and the values must match <code>[A-Za-z0-9@\-_]+</code>.
     */

    public java.util.List<PipelineVariableDeclaration> getVariables() {
        return variables;
    }

    /**
     * <p>
     * A list that defines the pipeline variables for a pipeline resource. Variable names can have alphanumeric and
     * underscore characters, and the values must match <code>[A-Za-z0-9@\-_]+</code>.
     * </p>
     * 
     * @param variables
     *        A list that defines the pipeline variables for a pipeline resource. Variable names can have alphanumeric
     *        and underscore characters, and the values must match <code>[A-Za-z0-9@\-_]+</code>.
     */

    public void setVariables(java.util.Collection<PipelineVariableDeclaration> variables) {
        if (variables == null) {
            this.variables = null;
            return;
        }

        this.variables = new java.util.ArrayList<PipelineVariableDeclaration>(variables);
    }

    /**
     * <p>
     * A list that defines the pipeline variables for a pipeline resource. Variable names can have alphanumeric and
     * underscore characters, and the values must match <code>[A-Za-z0-9@\-_]+</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVariables(java.util.Collection)} or {@link #withVariables(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param variables
     *        A list that defines the pipeline variables for a pipeline resource. Variable names can have alphanumeric
     *        and underscore characters, and the values must match <code>[A-Za-z0-9@\-_]+</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDeclaration withVariables(PipelineVariableDeclaration... variables) {
        if (this.variables == null) {
            setVariables(new java.util.ArrayList<PipelineVariableDeclaration>(variables.length));
        }
        for (PipelineVariableDeclaration ele : variables) {
            this.variables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that defines the pipeline variables for a pipeline resource. Variable names can have alphanumeric and
     * underscore characters, and the values must match <code>[A-Za-z0-9@\-_]+</code>.
     * </p>
     * 
     * @param variables
     *        A list that defines the pipeline variables for a pipeline resource. Variable names can have alphanumeric
     *        and underscore characters, and the values must match <code>[A-Za-z0-9@\-_]+</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDeclaration withVariables(java.util.Collection<PipelineVariableDeclaration> variables) {
        setVariables(variables);
        return this;
    }

    /**
     * <p>
     * The trigger configuration specifying a type of event, such as Git tags, that starts the pipeline.
     * </p>
     * <note>
     * <p>
     * When a trigger configuration is specified, default change detection for repository and branch commits is
     * disabled.
     * </p>
     * </note>
     * 
     * @return The trigger configuration specifying a type of event, such as Git tags, that starts the pipeline.</p>
     *         <note>
     *         <p>
     *         When a trigger configuration is specified, default change detection for repository and branch commits is
     *         disabled.
     *         </p>
     */

    public java.util.List<PipelineTriggerDeclaration> getTriggers() {
        return triggers;
    }

    /**
     * <p>
     * The trigger configuration specifying a type of event, such as Git tags, that starts the pipeline.
     * </p>
     * <note>
     * <p>
     * When a trigger configuration is specified, default change detection for repository and branch commits is
     * disabled.
     * </p>
     * </note>
     * 
     * @param triggers
     *        The trigger configuration specifying a type of event, such as Git tags, that starts the pipeline.</p>
     *        <note>
     *        <p>
     *        When a trigger configuration is specified, default change detection for repository and branch commits is
     *        disabled.
     *        </p>
     */

    public void setTriggers(java.util.Collection<PipelineTriggerDeclaration> triggers) {
        if (triggers == null) {
            this.triggers = null;
            return;
        }

        this.triggers = new java.util.ArrayList<PipelineTriggerDeclaration>(triggers);
    }

    /**
     * <p>
     * The trigger configuration specifying a type of event, such as Git tags, that starts the pipeline.
     * </p>
     * <note>
     * <p>
     * When a trigger configuration is specified, default change detection for repository and branch commits is
     * disabled.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTriggers(java.util.Collection)} or {@link #withTriggers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param triggers
     *        The trigger configuration specifying a type of event, such as Git tags, that starts the pipeline.</p>
     *        <note>
     *        <p>
     *        When a trigger configuration is specified, default change detection for repository and branch commits is
     *        disabled.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDeclaration withTriggers(PipelineTriggerDeclaration... triggers) {
        if (this.triggers == null) {
            setTriggers(new java.util.ArrayList<PipelineTriggerDeclaration>(triggers.length));
        }
        for (PipelineTriggerDeclaration ele : triggers) {
            this.triggers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The trigger configuration specifying a type of event, such as Git tags, that starts the pipeline.
     * </p>
     * <note>
     * <p>
     * When a trigger configuration is specified, default change detection for repository and branch commits is
     * disabled.
     * </p>
     * </note>
     * 
     * @param triggers
     *        The trigger configuration specifying a type of event, such as Git tags, that starts the pipeline.</p>
     *        <note>
     *        <p>
     *        When a trigger configuration is specified, default change detection for repository and branch commits is
     *        disabled.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDeclaration withTriggers(java.util.Collection<PipelineTriggerDeclaration> triggers) {
        setTriggers(triggers);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getArtifactStore() != null)
            sb.append("ArtifactStore: ").append(getArtifactStore()).append(",");
        if (getArtifactStores() != null)
            sb.append("ArtifactStores: ").append(getArtifactStores()).append(",");
        if (getStages() != null)
            sb.append("Stages: ").append(getStages()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getExecutionMode() != null)
            sb.append("ExecutionMode: ").append(getExecutionMode()).append(",");
        if (getPipelineType() != null)
            sb.append("PipelineType: ").append(getPipelineType()).append(",");
        if (getVariables() != null)
            sb.append("Variables: ").append(getVariables()).append(",");
        if (getTriggers() != null)
            sb.append("Triggers: ").append(getTriggers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineDeclaration == false)
            return false;
        PipelineDeclaration other = (PipelineDeclaration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getArtifactStore() == null ^ this.getArtifactStore() == null)
            return false;
        if (other.getArtifactStore() != null && other.getArtifactStore().equals(this.getArtifactStore()) == false)
            return false;
        if (other.getArtifactStores() == null ^ this.getArtifactStores() == null)
            return false;
        if (other.getArtifactStores() != null && other.getArtifactStores().equals(this.getArtifactStores()) == false)
            return false;
        if (other.getStages() == null ^ this.getStages() == null)
            return false;
        if (other.getStages() != null && other.getStages().equals(this.getStages()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getExecutionMode() == null ^ this.getExecutionMode() == null)
            return false;
        if (other.getExecutionMode() != null && other.getExecutionMode().equals(this.getExecutionMode()) == false)
            return false;
        if (other.getPipelineType() == null ^ this.getPipelineType() == null)
            return false;
        if (other.getPipelineType() != null && other.getPipelineType().equals(this.getPipelineType()) == false)
            return false;
        if (other.getVariables() == null ^ this.getVariables() == null)
            return false;
        if (other.getVariables() != null && other.getVariables().equals(this.getVariables()) == false)
            return false;
        if (other.getTriggers() == null ^ this.getTriggers() == null)
            return false;
        if (other.getTriggers() != null && other.getTriggers().equals(this.getTriggers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getArtifactStore() == null) ? 0 : getArtifactStore().hashCode());
        hashCode = prime * hashCode + ((getArtifactStores() == null) ? 0 : getArtifactStores().hashCode());
        hashCode = prime * hashCode + ((getStages() == null) ? 0 : getStages().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getExecutionMode() == null) ? 0 : getExecutionMode().hashCode());
        hashCode = prime * hashCode + ((getPipelineType() == null) ? 0 : getPipelineType().hashCode());
        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        hashCode = prime * hashCode + ((getTriggers() == null) ? 0 : getTriggers().hashCode());
        return hashCode;
    }

    @Override
    public PipelineDeclaration clone() {
        try {
            return (PipelineDeclaration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.PipelineDeclarationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
