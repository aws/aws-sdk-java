/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMLTransform" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMLTransformResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the transform, generated at the time that the transform was created.
     * </p>
     */
    private String transformId;
    /**
     * <p>
     * The unique name given to the transform when it was created.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the transform.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The last known status of the transform (to indicate whether it can be used or not). One of "NOT_READY", "READY",
     * or "DELETING".
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time when the transform was created.
     * </p>
     */
    private java.util.Date createdOn;
    /**
     * <p>
     * The date and time when the transform was last modified.
     * </p>
     */
    private java.util.Date lastModifiedOn;
    /**
     * <p>
     * A list of AWS Glue table definitions used by the transform.
     * </p>
     */
    private java.util.List<GlueTable> inputRecordTables;
    /**
     * <p>
     * The configuration parameters that are specific to the algorithm used.
     * </p>
     */
    private TransformParameters parameters;
    /**
     * <p>
     * The latest evaluation metrics.
     * </p>
     */
    private EvaluationMetrics evaluationMetrics;
    /**
     * <p>
     * The number of labels available for this transform.
     * </p>
     */
    private Integer labelCount;
    /**
     * <p>
     * The <code>Map&lt;Column, Type&gt;</code> object that represents the schema that this transform accepts. Has an
     * upper bound of 100 columns.
     * </p>
     */
    private java.util.List<SchemaColumn> schema;
    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
     * </p>
     */
    private String role;
    /**
     * <p>
     * This value determines which version of AWS Glue this machine learning transform is compatible with. Glue 1.0 is
     * recommended for most customers. If the value is not set, the Glue compatibility defaults to Glue 0.9. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions">AWS Glue Versions</a>
     * in the developer guide.
     * </p>
     */
    private String glueVersion;
    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can
     * allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power that consists of
     * 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the <a
     * href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * </p>
     * <p>
     * When the <code>WorkerType</code> field is set to a value other than <code>Standard</code>, the
     * <code>MaxCapacity</code> field is set automatically and becomes read-only.
     * </p>
     */
    private Double maxCapacity;
    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * </ul>
     */
    private String workerType;
    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated when this task runs.
     * </p>
     */
    private Integer numberOfWorkers;
    /**
     * <p>
     * The timeout for a task run for this transform in minutes. This is the maximum time that a task run for this
     * transform can consume resources before it is terminated and enters <code>TIMEOUT</code> status. The default is
     * 2,880 minutes (48 hours).
     * </p>
     */
    private Integer timeout;
    /**
     * <p>
     * The maximum number of times to retry a task for this transform after a task run fails.
     * </p>
     */
    private Integer maxRetries;

    /**
     * <p>
     * The unique identifier of the transform, generated at the time that the transform was created.
     * </p>
     * 
     * @param transformId
     *        The unique identifier of the transform, generated at the time that the transform was created.
     */

    public void setTransformId(String transformId) {
        this.transformId = transformId;
    }

    /**
     * <p>
     * The unique identifier of the transform, generated at the time that the transform was created.
     * </p>
     * 
     * @return The unique identifier of the transform, generated at the time that the transform was created.
     */

    public String getTransformId() {
        return this.transformId;
    }

    /**
     * <p>
     * The unique identifier of the transform, generated at the time that the transform was created.
     * </p>
     * 
     * @param transformId
     *        The unique identifier of the transform, generated at the time that the transform was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformResult withTransformId(String transformId) {
        setTransformId(transformId);
        return this;
    }

    /**
     * <p>
     * The unique name given to the transform when it was created.
     * </p>
     * 
     * @param name
     *        The unique name given to the transform when it was created.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique name given to the transform when it was created.
     * </p>
     * 
     * @return The unique name given to the transform when it was created.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique name given to the transform when it was created.
     * </p>
     * 
     * @param name
     *        The unique name given to the transform when it was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the transform.
     * </p>
     * 
     * @param description
     *        A description of the transform.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the transform.
     * </p>
     * 
     * @return A description of the transform.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the transform.
     * </p>
     * 
     * @param description
     *        A description of the transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The last known status of the transform (to indicate whether it can be used or not). One of "NOT_READY", "READY",
     * or "DELETING".
     * </p>
     * 
     * @param status
     *        The last known status of the transform (to indicate whether it can be used or not). One of "NOT_READY",
     *        "READY", or "DELETING".
     * @see TransformStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The last known status of the transform (to indicate whether it can be used or not). One of "NOT_READY", "READY",
     * or "DELETING".
     * </p>
     * 
     * @return The last known status of the transform (to indicate whether it can be used or not). One of "NOT_READY",
     *         "READY", or "DELETING".
     * @see TransformStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The last known status of the transform (to indicate whether it can be used or not). One of "NOT_READY", "READY",
     * or "DELETING".
     * </p>
     * 
     * @param status
     *        The last known status of the transform (to indicate whether it can be used or not). One of "NOT_READY",
     *        "READY", or "DELETING".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformStatusType
     */

    public GetMLTransformResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The last known status of the transform (to indicate whether it can be used or not). One of "NOT_READY", "READY",
     * or "DELETING".
     * </p>
     * 
     * @param status
     *        The last known status of the transform (to indicate whether it can be used or not). One of "NOT_READY",
     *        "READY", or "DELETING".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformStatusType
     */

    public GetMLTransformResult withStatus(TransformStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the transform was created.
     * </p>
     * 
     * @param createdOn
     *        The date and time when the transform was created.
     */

    public void setCreatedOn(java.util.Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * <p>
     * The date and time when the transform was created.
     * </p>
     * 
     * @return The date and time when the transform was created.
     */

    public java.util.Date getCreatedOn() {
        return this.createdOn;
    }

    /**
     * <p>
     * The date and time when the transform was created.
     * </p>
     * 
     * @param createdOn
     *        The date and time when the transform was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformResult withCreatedOn(java.util.Date createdOn) {
        setCreatedOn(createdOn);
        return this;
    }

    /**
     * <p>
     * The date and time when the transform was last modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        The date and time when the transform was last modified.
     */

    public void setLastModifiedOn(java.util.Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    /**
     * <p>
     * The date and time when the transform was last modified.
     * </p>
     * 
     * @return The date and time when the transform was last modified.
     */

    public java.util.Date getLastModifiedOn() {
        return this.lastModifiedOn;
    }

    /**
     * <p>
     * The date and time when the transform was last modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        The date and time when the transform was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformResult withLastModifiedOn(java.util.Date lastModifiedOn) {
        setLastModifiedOn(lastModifiedOn);
        return this;
    }

    /**
     * <p>
     * A list of AWS Glue table definitions used by the transform.
     * </p>
     * 
     * @return A list of AWS Glue table definitions used by the transform.
     */

    public java.util.List<GlueTable> getInputRecordTables() {
        return inputRecordTables;
    }

    /**
     * <p>
     * A list of AWS Glue table definitions used by the transform.
     * </p>
     * 
     * @param inputRecordTables
     *        A list of AWS Glue table definitions used by the transform.
     */

    public void setInputRecordTables(java.util.Collection<GlueTable> inputRecordTables) {
        if (inputRecordTables == null) {
            this.inputRecordTables = null;
            return;
        }

        this.inputRecordTables = new java.util.ArrayList<GlueTable>(inputRecordTables);
    }

    /**
     * <p>
     * A list of AWS Glue table definitions used by the transform.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputRecordTables(java.util.Collection)} or {@link #withInputRecordTables(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inputRecordTables
     *        A list of AWS Glue table definitions used by the transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformResult withInputRecordTables(GlueTable... inputRecordTables) {
        if (this.inputRecordTables == null) {
            setInputRecordTables(new java.util.ArrayList<GlueTable>(inputRecordTables.length));
        }
        for (GlueTable ele : inputRecordTables) {
            this.inputRecordTables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of AWS Glue table definitions used by the transform.
     * </p>
     * 
     * @param inputRecordTables
     *        A list of AWS Glue table definitions used by the transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformResult withInputRecordTables(java.util.Collection<GlueTable> inputRecordTables) {
        setInputRecordTables(inputRecordTables);
        return this;
    }

    /**
     * <p>
     * The configuration parameters that are specific to the algorithm used.
     * </p>
     * 
     * @param parameters
     *        The configuration parameters that are specific to the algorithm used.
     */

    public void setParameters(TransformParameters parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The configuration parameters that are specific to the algorithm used.
     * </p>
     * 
     * @return The configuration parameters that are specific to the algorithm used.
     */

    public TransformParameters getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * The configuration parameters that are specific to the algorithm used.
     * </p>
     * 
     * @param parameters
     *        The configuration parameters that are specific to the algorithm used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformResult withParameters(TransformParameters parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The latest evaluation metrics.
     * </p>
     * 
     * @param evaluationMetrics
     *        The latest evaluation metrics.
     */

    public void setEvaluationMetrics(EvaluationMetrics evaluationMetrics) {
        this.evaluationMetrics = evaluationMetrics;
    }

    /**
     * <p>
     * The latest evaluation metrics.
     * </p>
     * 
     * @return The latest evaluation metrics.
     */

    public EvaluationMetrics getEvaluationMetrics() {
        return this.evaluationMetrics;
    }

    /**
     * <p>
     * The latest evaluation metrics.
     * </p>
     * 
     * @param evaluationMetrics
     *        The latest evaluation metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformResult withEvaluationMetrics(EvaluationMetrics evaluationMetrics) {
        setEvaluationMetrics(evaluationMetrics);
        return this;
    }

    /**
     * <p>
     * The number of labels available for this transform.
     * </p>
     * 
     * @param labelCount
     *        The number of labels available for this transform.
     */

    public void setLabelCount(Integer labelCount) {
        this.labelCount = labelCount;
    }

    /**
     * <p>
     * The number of labels available for this transform.
     * </p>
     * 
     * @return The number of labels available for this transform.
     */

    public Integer getLabelCount() {
        return this.labelCount;
    }

    /**
     * <p>
     * The number of labels available for this transform.
     * </p>
     * 
     * @param labelCount
     *        The number of labels available for this transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformResult withLabelCount(Integer labelCount) {
        setLabelCount(labelCount);
        return this;
    }

    /**
     * <p>
     * The <code>Map&lt;Column, Type&gt;</code> object that represents the schema that this transform accepts. Has an
     * upper bound of 100 columns.
     * </p>
     * 
     * @return The <code>Map&lt;Column, Type&gt;</code> object that represents the schema that this transform accepts.
     *         Has an upper bound of 100 columns.
     */

    public java.util.List<SchemaColumn> getSchema() {
        return schema;
    }

    /**
     * <p>
     * The <code>Map&lt;Column, Type&gt;</code> object that represents the schema that this transform accepts. Has an
     * upper bound of 100 columns.
     * </p>
     * 
     * @param schema
     *        The <code>Map&lt;Column, Type&gt;</code> object that represents the schema that this transform accepts.
     *        Has an upper bound of 100 columns.
     */

    public void setSchema(java.util.Collection<SchemaColumn> schema) {
        if (schema == null) {
            this.schema = null;
            return;
        }

        this.schema = new java.util.ArrayList<SchemaColumn>(schema);
    }

    /**
     * <p>
     * The <code>Map&lt;Column, Type&gt;</code> object that represents the schema that this transform accepts. Has an
     * upper bound of 100 columns.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchema(java.util.Collection)} or {@link #withSchema(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param schema
     *        The <code>Map&lt;Column, Type&gt;</code> object that represents the schema that this transform accepts.
     *        Has an upper bound of 100 columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformResult withSchema(SchemaColumn... schema) {
        if (this.schema == null) {
            setSchema(new java.util.ArrayList<SchemaColumn>(schema.length));
        }
        for (SchemaColumn ele : schema) {
            this.schema.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>Map&lt;Column, Type&gt;</code> object that represents the schema that this transform accepts. Has an
     * upper bound of 100 columns.
     * </p>
     * 
     * @param schema
     *        The <code>Map&lt;Column, Type&gt;</code> object that represents the schema that this transform accepts.
     *        Has an upper bound of 100 columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformResult withSchema(java.util.Collection<SchemaColumn> schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
     * </p>
     * 
     * @param role
     *        The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
     * </p>
     * 
     * @param role
     *        The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformResult withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * This value determines which version of AWS Glue this machine learning transform is compatible with. Glue 1.0 is
     * recommended for most customers. If the value is not set, the Glue compatibility defaults to Glue 0.9. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions">AWS Glue Versions</a>
     * in the developer guide.
     * </p>
     * 
     * @param glueVersion
     *        This value determines which version of AWS Glue this machine learning transform is compatible with. Glue
     *        1.0 is recommended for most customers. If the value is not set, the Glue compatibility defaults to Glue
     *        0.9. For more information, see <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions">AWS Glue
     *        Versions</a> in the developer guide.
     */

    public void setGlueVersion(String glueVersion) {
        this.glueVersion = glueVersion;
    }

    /**
     * <p>
     * This value determines which version of AWS Glue this machine learning transform is compatible with. Glue 1.0 is
     * recommended for most customers. If the value is not set, the Glue compatibility defaults to Glue 0.9. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions">AWS Glue Versions</a>
     * in the developer guide.
     * </p>
     * 
     * @return This value determines which version of AWS Glue this machine learning transform is compatible with. Glue
     *         1.0 is recommended for most customers. If the value is not set, the Glue compatibility defaults to Glue
     *         0.9. For more information, see <a
     *         href="https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions">AWS Glue
     *         Versions</a> in the developer guide.
     */

    public String getGlueVersion() {
        return this.glueVersion;
    }

    /**
     * <p>
     * This value determines which version of AWS Glue this machine learning transform is compatible with. Glue 1.0 is
     * recommended for most customers. If the value is not set, the Glue compatibility defaults to Glue 0.9. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions">AWS Glue Versions</a>
     * in the developer guide.
     * </p>
     * 
     * @param glueVersion
     *        This value determines which version of AWS Glue this machine learning transform is compatible with. Glue
     *        1.0 is recommended for most customers. If the value is not set, the Glue compatibility defaults to Glue
     *        0.9. For more information, see <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions">AWS Glue
     *        Versions</a> in the developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformResult withGlueVersion(String glueVersion) {
        setGlueVersion(glueVersion);
        return this;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can
     * allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power that consists of
     * 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the <a
     * href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * </p>
     * <p>
     * When the <code>WorkerType</code> field is set to a value other than <code>Standard</code>, the
     * <code>MaxCapacity</code> field is set automatically and becomes read-only.
     * </p>
     * 
     * @param maxCapacity
     *        The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform.
     *        You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power
     *        that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the <a
     *        href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>. </p>
     *        <p>
     *        When the <code>WorkerType</code> field is set to a value other than <code>Standard</code>, the
     *        <code>MaxCapacity</code> field is set automatically and becomes read-only.
     */

    public void setMaxCapacity(Double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can
     * allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power that consists of
     * 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the <a
     * href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * </p>
     * <p>
     * When the <code>WorkerType</code> field is set to a value other than <code>Standard</code>, the
     * <code>MaxCapacity</code> field is set automatically and becomes read-only.
     * </p>
     * 
     * @return The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform.
     *         You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power
     *         that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the <a
     *         href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>. </p>
     *         <p>
     *         When the <code>WorkerType</code> field is set to a value other than <code>Standard</code>, the
     *         <code>MaxCapacity</code> field is set automatically and becomes read-only.
     */

    public Double getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can
     * allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power that consists of
     * 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the <a
     * href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * </p>
     * <p>
     * When the <code>WorkerType</code> field is set to a value other than <code>Standard</code>, the
     * <code>MaxCapacity</code> field is set automatically and becomes read-only.
     * </p>
     * 
     * @param maxCapacity
     *        The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform.
     *        You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power
     *        that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the <a
     *        href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>. </p>
     *        <p>
     *        When the <code>WorkerType</code> field is set to a value other than <code>Standard</code>, the
     *        <code>MaxCapacity</code> field is set automatically and becomes read-only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformResult withMaxCapacity(Double maxCapacity) {
        setMaxCapacity(maxCapacity);
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * </ul>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or
     *        G.2X.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *        and 2 executors per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     *        executor per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and
     *        1 executor per worker.
     *        </p>
     *        </li>
     * @see WorkerType
     */

    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X,
     *         or G.2X.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *         and 2 executors per worker.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and
     *         1 executor per worker.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and
     *         1 executor per worker.
     *         </p>
     *         </li>
     * @see WorkerType
     */

    public String getWorkerType() {
        return this.workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * </ul>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or
     *        G.2X.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *        and 2 executors per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     *        executor per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and
     *        1 executor per worker.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkerType
     */

    public GetMLTransformResult withWorkerType(String workerType) {
        setWorkerType(workerType);
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * </ul>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or
     *        G.2X.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *        and 2 executors per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     *        executor per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and
     *        1 executor per worker.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkerType
     */

    public GetMLTransformResult withWorkerType(WorkerType workerType) {
        this.workerType = workerType.toString();
        return this;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated when this task runs.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of workers of a defined <code>workerType</code> that are allocated when this task runs.
     */

    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated when this task runs.
     * </p>
     * 
     * @return The number of workers of a defined <code>workerType</code> that are allocated when this task runs.
     */

    public Integer getNumberOfWorkers() {
        return this.numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated when this task runs.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of workers of a defined <code>workerType</code> that are allocated when this task runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformResult withNumberOfWorkers(Integer numberOfWorkers) {
        setNumberOfWorkers(numberOfWorkers);
        return this;
    }

    /**
     * <p>
     * The timeout for a task run for this transform in minutes. This is the maximum time that a task run for this
     * transform can consume resources before it is terminated and enters <code>TIMEOUT</code> status. The default is
     * 2,880 minutes (48 hours).
     * </p>
     * 
     * @param timeout
     *        The timeout for a task run for this transform in minutes. This is the maximum time that a task run for
     *        this transform can consume resources before it is terminated and enters <code>TIMEOUT</code> status. The
     *        default is 2,880 minutes (48 hours).
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The timeout for a task run for this transform in minutes. This is the maximum time that a task run for this
     * transform can consume resources before it is terminated and enters <code>TIMEOUT</code> status. The default is
     * 2,880 minutes (48 hours).
     * </p>
     * 
     * @return The timeout for a task run for this transform in minutes. This is the maximum time that a task run for
     *         this transform can consume resources before it is terminated and enters <code>TIMEOUT</code> status. The
     *         default is 2,880 minutes (48 hours).
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The timeout for a task run for this transform in minutes. This is the maximum time that a task run for this
     * transform can consume resources before it is terminated and enters <code>TIMEOUT</code> status. The default is
     * 2,880 minutes (48 hours).
     * </p>
     * 
     * @param timeout
     *        The timeout for a task run for this transform in minutes. This is the maximum time that a task run for
     *        this transform can consume resources before it is terminated and enters <code>TIMEOUT</code> status. The
     *        default is 2,880 minutes (48 hours).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformResult withTimeout(Integer timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * The maximum number of times to retry a task for this transform after a task run fails.
     * </p>
     * 
     * @param maxRetries
     *        The maximum number of times to retry a task for this transform after a task run fails.
     */

    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry a task for this transform after a task run fails.
     * </p>
     * 
     * @return The maximum number of times to retry a task for this transform after a task run fails.
     */

    public Integer getMaxRetries() {
        return this.maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry a task for this transform after a task run fails.
     * </p>
     * 
     * @param maxRetries
     *        The maximum number of times to retry a task for this transform after a task run fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformResult withMaxRetries(Integer maxRetries) {
        setMaxRetries(maxRetries);
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
        if (getTransformId() != null)
            sb.append("TransformId: ").append(getTransformId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedOn() != null)
            sb.append("CreatedOn: ").append(getCreatedOn()).append(",");
        if (getLastModifiedOn() != null)
            sb.append("LastModifiedOn: ").append(getLastModifiedOn()).append(",");
        if (getInputRecordTables() != null)
            sb.append("InputRecordTables: ").append(getInputRecordTables()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getEvaluationMetrics() != null)
            sb.append("EvaluationMetrics: ").append(getEvaluationMetrics()).append(",");
        if (getLabelCount() != null)
            sb.append("LabelCount: ").append(getLabelCount()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getGlueVersion() != null)
            sb.append("GlueVersion: ").append(getGlueVersion()).append(",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: ").append(getMaxCapacity()).append(",");
        if (getWorkerType() != null)
            sb.append("WorkerType: ").append(getWorkerType()).append(",");
        if (getNumberOfWorkers() != null)
            sb.append("NumberOfWorkers: ").append(getNumberOfWorkers()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout()).append(",");
        if (getMaxRetries() != null)
            sb.append("MaxRetries: ").append(getMaxRetries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMLTransformResult == false)
            return false;
        GetMLTransformResult other = (GetMLTransformResult) obj;
        if (other.getTransformId() == null ^ this.getTransformId() == null)
            return false;
        if (other.getTransformId() != null && other.getTransformId().equals(this.getTransformId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedOn() == null ^ this.getCreatedOn() == null)
            return false;
        if (other.getCreatedOn() != null && other.getCreatedOn().equals(this.getCreatedOn()) == false)
            return false;
        if (other.getLastModifiedOn() == null ^ this.getLastModifiedOn() == null)
            return false;
        if (other.getLastModifiedOn() != null && other.getLastModifiedOn().equals(this.getLastModifiedOn()) == false)
            return false;
        if (other.getInputRecordTables() == null ^ this.getInputRecordTables() == null)
            return false;
        if (other.getInputRecordTables() != null && other.getInputRecordTables().equals(this.getInputRecordTables()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getEvaluationMetrics() == null ^ this.getEvaluationMetrics() == null)
            return false;
        if (other.getEvaluationMetrics() != null && other.getEvaluationMetrics().equals(this.getEvaluationMetrics()) == false)
            return false;
        if (other.getLabelCount() == null ^ this.getLabelCount() == null)
            return false;
        if (other.getLabelCount() != null && other.getLabelCount().equals(this.getLabelCount()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getGlueVersion() == null ^ this.getGlueVersion() == null)
            return false;
        if (other.getGlueVersion() != null && other.getGlueVersion().equals(this.getGlueVersion()) == false)
            return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null)
            return false;
        if (other.getMaxCapacity() != null && other.getMaxCapacity().equals(this.getMaxCapacity()) == false)
            return false;
        if (other.getWorkerType() == null ^ this.getWorkerType() == null)
            return false;
        if (other.getWorkerType() != null && other.getWorkerType().equals(this.getWorkerType()) == false)
            return false;
        if (other.getNumberOfWorkers() == null ^ this.getNumberOfWorkers() == null)
            return false;
        if (other.getNumberOfWorkers() != null && other.getNumberOfWorkers().equals(this.getNumberOfWorkers()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getMaxRetries() == null ^ this.getMaxRetries() == null)
            return false;
        if (other.getMaxRetries() != null && other.getMaxRetries().equals(this.getMaxRetries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransformId() == null) ? 0 : getTransformId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedOn() == null) ? 0 : getCreatedOn().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedOn() == null) ? 0 : getLastModifiedOn().hashCode());
        hashCode = prime * hashCode + ((getInputRecordTables() == null) ? 0 : getInputRecordTables().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getEvaluationMetrics() == null) ? 0 : getEvaluationMetrics().hashCode());
        hashCode = prime * hashCode + ((getLabelCount() == null) ? 0 : getLabelCount().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getGlueVersion() == null) ? 0 : getGlueVersion().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime * hashCode + ((getWorkerType() == null) ? 0 : getWorkerType().hashCode());
        hashCode = prime * hashCode + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getMaxRetries() == null) ? 0 : getMaxRetries().hashCode());
        return hashCode;
    }

    @Override
    public GetMLTransformResult clone() {
        try {
            return (GetMLTransformResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
