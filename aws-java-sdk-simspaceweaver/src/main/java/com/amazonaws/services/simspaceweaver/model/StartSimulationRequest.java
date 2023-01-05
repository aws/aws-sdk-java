/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simspaceweaver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StartSimulation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSimulationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A value that you provide to ensure that repeated calls to this API operation using the same parameters complete
     * only once. A <code>ClientToken</code> is also known as an <i>idempotency token</i>. A <code>ClientToken</code>
     * expires after 24 hours.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The description of the simulation.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The maximum running time of the simulation, specified as a number of months (m or M), hours (h or H), or days (d
     * or D). The simulation stops when it reaches this limit.
     * </p>
     */
    private String maximumDuration;
    /**
     * <p>
     * The name of the simulation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that the simulation assumes to
     * perform actions. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. For more information about IAM roles, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM roles</a> in the <i>Identity and Access
     * Management User Guide</i>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The location of the simulation schema in Amazon Simple Storage Service (Amazon S3). For more information about
     * Amazon S3, see the <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html"> <i>Amazon Simple
     * Storage Service User Guide</i> </a>.
     * </p>
     */
    private S3Location schemaS3Location;
    /**
     * <p>
     * A list of tags for the simulation. For more information about tags, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A value that you provide to ensure that repeated calls to this API operation using the same parameters complete
     * only once. A <code>ClientToken</code> is also known as an <i>idempotency token</i>. A <code>ClientToken</code>
     * expires after 24 hours.
     * </p>
     * 
     * @param clientToken
     *        A value that you provide to ensure that repeated calls to this API operation using the same parameters
     *        complete only once. A <code>ClientToken</code> is also known as an <i>idempotency token</i>. A
     *        <code>ClientToken</code> expires after 24 hours.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A value that you provide to ensure that repeated calls to this API operation using the same parameters complete
     * only once. A <code>ClientToken</code> is also known as an <i>idempotency token</i>. A <code>ClientToken</code>
     * expires after 24 hours.
     * </p>
     * 
     * @return A value that you provide to ensure that repeated calls to this API operation using the same parameters
     *         complete only once. A <code>ClientToken</code> is also known as an <i>idempotency token</i>. A
     *         <code>ClientToken</code> expires after 24 hours.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A value that you provide to ensure that repeated calls to this API operation using the same parameters complete
     * only once. A <code>ClientToken</code> is also known as an <i>idempotency token</i>. A <code>ClientToken</code>
     * expires after 24 hours.
     * </p>
     * 
     * @param clientToken
     *        A value that you provide to ensure that repeated calls to this API operation using the same parameters
     *        complete only once. A <code>ClientToken</code> is also known as an <i>idempotency token</i>. A
     *        <code>ClientToken</code> expires after 24 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The description of the simulation.
     * </p>
     * 
     * @param description
     *        The description of the simulation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the simulation.
     * </p>
     * 
     * @return The description of the simulation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the simulation.
     * </p>
     * 
     * @param description
     *        The description of the simulation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The maximum running time of the simulation, specified as a number of months (m or M), hours (h or H), or days (d
     * or D). The simulation stops when it reaches this limit.
     * </p>
     * 
     * @param maximumDuration
     *        The maximum running time of the simulation, specified as a number of months (m or M), hours (h or H), or
     *        days (d or D). The simulation stops when it reaches this limit.
     */

    public void setMaximumDuration(String maximumDuration) {
        this.maximumDuration = maximumDuration;
    }

    /**
     * <p>
     * The maximum running time of the simulation, specified as a number of months (m or M), hours (h or H), or days (d
     * or D). The simulation stops when it reaches this limit.
     * </p>
     * 
     * @return The maximum running time of the simulation, specified as a number of months (m or M), hours (h or H), or
     *         days (d or D). The simulation stops when it reaches this limit.
     */

    public String getMaximumDuration() {
        return this.maximumDuration;
    }

    /**
     * <p>
     * The maximum running time of the simulation, specified as a number of months (m or M), hours (h or H), or days (d
     * or D). The simulation stops when it reaches this limit.
     * </p>
     * 
     * @param maximumDuration
     *        The maximum running time of the simulation, specified as a number of months (m or M), hours (h or H), or
     *        days (d or D). The simulation stops when it reaches this limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationRequest withMaximumDuration(String maximumDuration) {
        setMaximumDuration(maximumDuration);
        return this;
    }

    /**
     * <p>
     * The name of the simulation.
     * </p>
     * 
     * @param name
     *        The name of the simulation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the simulation.
     * </p>
     * 
     * @return The name of the simulation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the simulation.
     * </p>
     * 
     * @param name
     *        The name of the simulation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that the simulation assumes to
     * perform actions. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. For more information about IAM roles, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM roles</a> in the <i>Identity and Access
     * Management User Guide</i>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that the simulation
     *        assumes to perform actions. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. For more information about IAM roles, see
     *        <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM roles</a> in the <i>Identity
     *        and Access Management User Guide</i>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that the simulation assumes to
     * perform actions. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. For more information about IAM roles, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM roles</a> in the <i>Identity and Access
     * Management User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that the simulation
     *         assumes to perform actions. For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. For more information about IAM roles, see
     *         <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM roles</a> in the <i>Identity
     *         and Access Management User Guide</i>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that the simulation assumes to
     * perform actions. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. For more information about IAM roles, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM roles</a> in the <i>Identity and Access
     * Management User Guide</i>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that the simulation
     *        assumes to perform actions. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. For more information about IAM roles, see
     *        <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM roles</a> in the <i>Identity
     *        and Access Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The location of the simulation schema in Amazon Simple Storage Service (Amazon S3). For more information about
     * Amazon S3, see the <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html"> <i>Amazon Simple
     * Storage Service User Guide</i> </a>.
     * </p>
     * 
     * @param schemaS3Location
     *        The location of the simulation schema in Amazon Simple Storage Service (Amazon S3). For more information
     *        about Amazon S3, see the <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html">
     *        <i>Amazon Simple Storage Service User Guide</i> </a>.
     */

    public void setSchemaS3Location(S3Location schemaS3Location) {
        this.schemaS3Location = schemaS3Location;
    }

    /**
     * <p>
     * The location of the simulation schema in Amazon Simple Storage Service (Amazon S3). For more information about
     * Amazon S3, see the <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html"> <i>Amazon Simple
     * Storage Service User Guide</i> </a>.
     * </p>
     * 
     * @return The location of the simulation schema in Amazon Simple Storage Service (Amazon S3). For more information
     *         about Amazon S3, see the <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html">
     *         <i>Amazon Simple Storage Service User Guide</i> </a>.
     */

    public S3Location getSchemaS3Location() {
        return this.schemaS3Location;
    }

    /**
     * <p>
     * The location of the simulation schema in Amazon Simple Storage Service (Amazon S3). For more information about
     * Amazon S3, see the <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html"> <i>Amazon Simple
     * Storage Service User Guide</i> </a>.
     * </p>
     * 
     * @param schemaS3Location
     *        The location of the simulation schema in Amazon Simple Storage Service (Amazon S3). For more information
     *        about Amazon S3, see the <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html">
     *        <i>Amazon Simple Storage Service User Guide</i> </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationRequest withSchemaS3Location(S3Location schemaS3Location) {
        setSchemaS3Location(schemaS3Location);
        return this;
    }

    /**
     * <p>
     * A list of tags for the simulation. For more information about tags, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return A list of tags for the simulation. For more information about tags, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         resources</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags for the simulation. For more information about tags, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param tags
     *        A list of tags for the simulation. For more information about tags, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of tags for the simulation. For more information about tags, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param tags
     *        A list of tags for the simulation. For more information about tags, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StartSimulationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationRequest addTagsEntry(String key, String value) {
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

    public StartSimulationRequest clearTagsEntries() {
        this.tags = null;
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getMaximumDuration() != null)
            sb.append("MaximumDuration: ").append(getMaximumDuration()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSchemaS3Location() != null)
            sb.append("SchemaS3Location: ").append(getSchemaS3Location()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSimulationRequest == false)
            return false;
        StartSimulationRequest other = (StartSimulationRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMaximumDuration() == null ^ this.getMaximumDuration() == null)
            return false;
        if (other.getMaximumDuration() != null && other.getMaximumDuration().equals(this.getMaximumDuration()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSchemaS3Location() == null ^ this.getSchemaS3Location() == null)
            return false;
        if (other.getSchemaS3Location() != null && other.getSchemaS3Location().equals(this.getSchemaS3Location()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMaximumDuration() == null) ? 0 : getMaximumDuration().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSchemaS3Location() == null) ? 0 : getSchemaS3Location().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartSimulationRequest clone() {
        return (StartSimulationRequest) super.clone();
    }

}
