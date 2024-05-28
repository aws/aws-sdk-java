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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateWorkflow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkflowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the workflow to create.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The semantic version of this workflow resource. The semantic version syntax adheres to the following rules.
     * </p>
     * <note>
     * <p>
     * The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can assign
     * values for the first three, and can filter on all of them.
     * </p>
     * <p>
     * <b>Assignment:</b> For the first three nodes you can assign any positive integer value, including zero, with an
     * upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically assigns the build number to the
     * fourth node.
     * </p>
     * <p>
     * <b>Patterns:</b> You can use any numeric pattern that adheres to the assignment requirements for the nodes that
     * you can assign. For example, you might choose a software version pattern, such as 1.0.0, or a date, such as
     * 2021.01.01.
     * </p>
     * </note>
     */
    private String semanticVersion;
    /**
     * <p>
     * Describes the workflow.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Describes what change has been made in this version of the workflow, or what makes this version different from
     * other versions of the workflow.
     * </p>
     */
    private String changeDescription;
    /**
     * <p>
     * Contains the UTF-8 encoded YAML document content for the workflow. Alternatively, you can specify the
     * <code>uri</code> of a YAML document file stored in Amazon S3. However, you cannot specify both properties.
     * </p>
     */
    private String data;
    /**
     * <p>
     * The <code>uri</code> of a YAML component document file. This must be an S3 URL (<code>s3://bucket/key</code>),
     * and the requester must have permission to access the S3 bucket it points to. If you use Amazon S3, you can
     * specify component content up to your service quota.
     * </p>
     * <p>
     * Alternatively, you can specify the YAML document inline, using the component <code>data</code> property. You
     * cannot specify both properties.
     * </p>
     */
    private String uri;
    /**
     * <p>
     * The ID of the KMS key that is used to encrypt this workflow resource.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Tags that apply to the workflow resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The phase in the image build process for which the workflow resource is responsible.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name of the workflow to create.
     * </p>
     * 
     * @param name
     *        The name of the workflow to create.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the workflow to create.
     * </p>
     * 
     * @return The name of the workflow to create.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the workflow to create.
     * </p>
     * 
     * @param name
     *        The name of the workflow to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The semantic version of this workflow resource. The semantic version syntax adheres to the following rules.
     * </p>
     * <note>
     * <p>
     * The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can assign
     * values for the first three, and can filter on all of them.
     * </p>
     * <p>
     * <b>Assignment:</b> For the first three nodes you can assign any positive integer value, including zero, with an
     * upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically assigns the build number to the
     * fourth node.
     * </p>
     * <p>
     * <b>Patterns:</b> You can use any numeric pattern that adheres to the assignment requirements for the nodes that
     * you can assign. For example, you might choose a software version pattern, such as 1.0.0, or a date, such as
     * 2021.01.01.
     * </p>
     * </note>
     * 
     * @param semanticVersion
     *        The semantic version of this workflow resource. The semantic version syntax adheres to the following
     *        rules.</p> <note>
     *        <p>
     *        The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can
     *        assign values for the first three, and can filter on all of them.
     *        </p>
     *        <p>
     *        <b>Assignment:</b> For the first three nodes you can assign any positive integer value, including zero,
     *        with an upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically assigns the build
     *        number to the fourth node.
     *        </p>
     *        <p>
     *        <b>Patterns:</b> You can use any numeric pattern that adheres to the assignment requirements for the nodes
     *        that you can assign. For example, you might choose a software version pattern, such as 1.0.0, or a date,
     *        such as 2021.01.01.
     *        </p>
     */

    public void setSemanticVersion(String semanticVersion) {
        this.semanticVersion = semanticVersion;
    }

    /**
     * <p>
     * The semantic version of this workflow resource. The semantic version syntax adheres to the following rules.
     * </p>
     * <note>
     * <p>
     * The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can assign
     * values for the first three, and can filter on all of them.
     * </p>
     * <p>
     * <b>Assignment:</b> For the first three nodes you can assign any positive integer value, including zero, with an
     * upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically assigns the build number to the
     * fourth node.
     * </p>
     * <p>
     * <b>Patterns:</b> You can use any numeric pattern that adheres to the assignment requirements for the nodes that
     * you can assign. For example, you might choose a software version pattern, such as 1.0.0, or a date, such as
     * 2021.01.01.
     * </p>
     * </note>
     * 
     * @return The semantic version of this workflow resource. The semantic version syntax adheres to the following
     *         rules.</p> <note>
     *         <p>
     *         The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can
     *         assign values for the first three, and can filter on all of them.
     *         </p>
     *         <p>
     *         <b>Assignment:</b> For the first three nodes you can assign any positive integer value, including zero,
     *         with an upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically assigns the build
     *         number to the fourth node.
     *         </p>
     *         <p>
     *         <b>Patterns:</b> You can use any numeric pattern that adheres to the assignment requirements for the
     *         nodes that you can assign. For example, you might choose a software version pattern, such as 1.0.0, or a
     *         date, such as 2021.01.01.
     *         </p>
     */

    public String getSemanticVersion() {
        return this.semanticVersion;
    }

    /**
     * <p>
     * The semantic version of this workflow resource. The semantic version syntax adheres to the following rules.
     * </p>
     * <note>
     * <p>
     * The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can assign
     * values for the first three, and can filter on all of them.
     * </p>
     * <p>
     * <b>Assignment:</b> For the first three nodes you can assign any positive integer value, including zero, with an
     * upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically assigns the build number to the
     * fourth node.
     * </p>
     * <p>
     * <b>Patterns:</b> You can use any numeric pattern that adheres to the assignment requirements for the nodes that
     * you can assign. For example, you might choose a software version pattern, such as 1.0.0, or a date, such as
     * 2021.01.01.
     * </p>
     * </note>
     * 
     * @param semanticVersion
     *        The semantic version of this workflow resource. The semantic version syntax adheres to the following
     *        rules.</p> <note>
     *        <p>
     *        The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can
     *        assign values for the first three, and can filter on all of them.
     *        </p>
     *        <p>
     *        <b>Assignment:</b> For the first three nodes you can assign any positive integer value, including zero,
     *        with an upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically assigns the build
     *        number to the fourth node.
     *        </p>
     *        <p>
     *        <b>Patterns:</b> You can use any numeric pattern that adheres to the assignment requirements for the nodes
     *        that you can assign. For example, you might choose a software version pattern, such as 1.0.0, or a date,
     *        such as 2021.01.01.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withSemanticVersion(String semanticVersion) {
        setSemanticVersion(semanticVersion);
        return this;
    }

    /**
     * <p>
     * Describes the workflow.
     * </p>
     * 
     * @param description
     *        Describes the workflow.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Describes the workflow.
     * </p>
     * 
     * @return Describes the workflow.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Describes the workflow.
     * </p>
     * 
     * @param description
     *        Describes the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Describes what change has been made in this version of the workflow, or what makes this version different from
     * other versions of the workflow.
     * </p>
     * 
     * @param changeDescription
     *        Describes what change has been made in this version of the workflow, or what makes this version different
     *        from other versions of the workflow.
     */

    public void setChangeDescription(String changeDescription) {
        this.changeDescription = changeDescription;
    }

    /**
     * <p>
     * Describes what change has been made in this version of the workflow, or what makes this version different from
     * other versions of the workflow.
     * </p>
     * 
     * @return Describes what change has been made in this version of the workflow, or what makes this version different
     *         from other versions of the workflow.
     */

    public String getChangeDescription() {
        return this.changeDescription;
    }

    /**
     * <p>
     * Describes what change has been made in this version of the workflow, or what makes this version different from
     * other versions of the workflow.
     * </p>
     * 
     * @param changeDescription
     *        Describes what change has been made in this version of the workflow, or what makes this version different
     *        from other versions of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withChangeDescription(String changeDescription) {
        setChangeDescription(changeDescription);
        return this;
    }

    /**
     * <p>
     * Contains the UTF-8 encoded YAML document content for the workflow. Alternatively, you can specify the
     * <code>uri</code> of a YAML document file stored in Amazon S3. However, you cannot specify both properties.
     * </p>
     * 
     * @param data
     *        Contains the UTF-8 encoded YAML document content for the workflow. Alternatively, you can specify the
     *        <code>uri</code> of a YAML document file stored in Amazon S3. However, you cannot specify both properties.
     */

    public void setData(String data) {
        this.data = data;
    }

    /**
     * <p>
     * Contains the UTF-8 encoded YAML document content for the workflow. Alternatively, you can specify the
     * <code>uri</code> of a YAML document file stored in Amazon S3. However, you cannot specify both properties.
     * </p>
     * 
     * @return Contains the UTF-8 encoded YAML document content for the workflow. Alternatively, you can specify the
     *         <code>uri</code> of a YAML document file stored in Amazon S3. However, you cannot specify both
     *         properties.
     */

    public String getData() {
        return this.data;
    }

    /**
     * <p>
     * Contains the UTF-8 encoded YAML document content for the workflow. Alternatively, you can specify the
     * <code>uri</code> of a YAML document file stored in Amazon S3. However, you cannot specify both properties.
     * </p>
     * 
     * @param data
     *        Contains the UTF-8 encoded YAML document content for the workflow. Alternatively, you can specify the
     *        <code>uri</code> of a YAML document file stored in Amazon S3. However, you cannot specify both properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withData(String data) {
        setData(data);
        return this;
    }

    /**
     * <p>
     * The <code>uri</code> of a YAML component document file. This must be an S3 URL (<code>s3://bucket/key</code>),
     * and the requester must have permission to access the S3 bucket it points to. If you use Amazon S3, you can
     * specify component content up to your service quota.
     * </p>
     * <p>
     * Alternatively, you can specify the YAML document inline, using the component <code>data</code> property. You
     * cannot specify both properties.
     * </p>
     * 
     * @param uri
     *        The <code>uri</code> of a YAML component document file. This must be an S3 URL (
     *        <code>s3://bucket/key</code>), and the requester must have permission to access the S3 bucket it points
     *        to. If you use Amazon S3, you can specify component content up to your service quota.</p>
     *        <p>
     *        Alternatively, you can specify the YAML document inline, using the component <code>data</code> property.
     *        You cannot specify both properties.
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * The <code>uri</code> of a YAML component document file. This must be an S3 URL (<code>s3://bucket/key</code>),
     * and the requester must have permission to access the S3 bucket it points to. If you use Amazon S3, you can
     * specify component content up to your service quota.
     * </p>
     * <p>
     * Alternatively, you can specify the YAML document inline, using the component <code>data</code> property. You
     * cannot specify both properties.
     * </p>
     * 
     * @return The <code>uri</code> of a YAML component document file. This must be an S3 URL (
     *         <code>s3://bucket/key</code>), and the requester must have permission to access the S3 bucket it points
     *         to. If you use Amazon S3, you can specify component content up to your service quota.</p>
     *         <p>
     *         Alternatively, you can specify the YAML document inline, using the component <code>data</code> property.
     *         You cannot specify both properties.
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * The <code>uri</code> of a YAML component document file. This must be an S3 URL (<code>s3://bucket/key</code>),
     * and the requester must have permission to access the S3 bucket it points to. If you use Amazon S3, you can
     * specify component content up to your service quota.
     * </p>
     * <p>
     * Alternatively, you can specify the YAML document inline, using the component <code>data</code> property. You
     * cannot specify both properties.
     * </p>
     * 
     * @param uri
     *        The <code>uri</code> of a YAML component document file. This must be an S3 URL (
     *        <code>s3://bucket/key</code>), and the requester must have permission to access the S3 bucket it points
     *        to. If you use Amazon S3, you can specify component content up to your service quota.</p>
     *        <p>
     *        Alternatively, you can specify the YAML document inline, using the component <code>data</code> property.
     *        You cannot specify both properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withUri(String uri) {
        setUri(uri);
        return this;
    }

    /**
     * <p>
     * The ID of the KMS key that is used to encrypt this workflow resource.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the KMS key that is used to encrypt this workflow resource.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key that is used to encrypt this workflow resource.
     * </p>
     * 
     * @return The ID of the KMS key that is used to encrypt this workflow resource.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key that is used to encrypt this workflow resource.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the KMS key that is used to encrypt this workflow resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Tags that apply to the workflow resource.
     * </p>
     * 
     * @return Tags that apply to the workflow resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags that apply to the workflow resource.
     * </p>
     * 
     * @param tags
     *        Tags that apply to the workflow resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags that apply to the workflow resource.
     * </p>
     * 
     * @param tags
     *        Tags that apply to the workflow resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateWorkflowRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *         see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The phase in the image build process for which the workflow resource is responsible.
     * </p>
     * 
     * @param type
     *        The phase in the image build process for which the workflow resource is responsible.
     * @see WorkflowType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The phase in the image build process for which the workflow resource is responsible.
     * </p>
     * 
     * @return The phase in the image build process for which the workflow resource is responsible.
     * @see WorkflowType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The phase in the image build process for which the workflow resource is responsible.
     * </p>
     * 
     * @param type
     *        The phase in the image build process for which the workflow resource is responsible.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public CreateWorkflowRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The phase in the image build process for which the workflow resource is responsible.
     * </p>
     * 
     * @param type
     *        The phase in the image build process for which the workflow resource is responsible.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public CreateWorkflowRequest withType(WorkflowType type) {
        this.type = type.toString();
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
        if (getSemanticVersion() != null)
            sb.append("SemanticVersion: ").append(getSemanticVersion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getChangeDescription() != null)
            sb.append("ChangeDescription: ").append(getChangeDescription()).append(",");
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
        if (getUri() != null)
            sb.append("Uri: ").append(getUri()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkflowRequest == false)
            return false;
        CreateWorkflowRequest other = (CreateWorkflowRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSemanticVersion() == null ^ this.getSemanticVersion() == null)
            return false;
        if (other.getSemanticVersion() != null && other.getSemanticVersion().equals(this.getSemanticVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getChangeDescription() == null ^ this.getChangeDescription() == null)
            return false;
        if (other.getChangeDescription() != null && other.getChangeDescription().equals(this.getChangeDescription()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSemanticVersion() == null) ? 0 : getSemanticVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getChangeDescription() == null) ? 0 : getChangeDescription().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkflowRequest clone() {
        return (CreateWorkflowRequest) super.clone();
    }

}
