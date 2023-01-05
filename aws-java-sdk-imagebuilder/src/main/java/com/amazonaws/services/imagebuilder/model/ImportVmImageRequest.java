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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ImportVmImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportVmImageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the base image that is created by the import process.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The semantic version to attach to the base image that was created during the . You can assign values for the
     * first three, and can filter on all of them.
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
     * The description for the base image that is created by the import process.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The operating system platform for the imported VM.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The operating system version for the imported VM.
     * </p>
     */
    private String osVersion;
    /**
     * <p>
     * The <code>importTaskId</code> (API) or <code>ImportTaskId</code> (CLI) from the Amazon EC2 VM import process.
     * Image Builder retrieves information from the import process to pull in the AMI that is created from the VM source
     * as the base image for your recipe.
     * </p>
     */
    private String vmImportTaskId;
    /**
     * <p>
     * Tags that are attached to the import resources.
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
     * The name of the base image that is created by the import process.
     * </p>
     * 
     * @param name
     *        The name of the base image that is created by the import process.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the base image that is created by the import process.
     * </p>
     * 
     * @return The name of the base image that is created by the import process.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the base image that is created by the import process.
     * </p>
     * 
     * @param name
     *        The name of the base image that is created by the import process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportVmImageRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The semantic version to attach to the base image that was created during the import process. This version follows
     * the semantic version syntax.
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
     *        The semantic version to attach to the base image that was created during the import process. This version
     *        follows the semantic version syntax.</p> <note>
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
     * The semantic version to attach to the base image that was created during the import process. This version follows
     * the semantic version syntax.
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
     * @return The semantic version to attach to the base image that was created during the import process. This version
     *         follows the semantic version syntax.</p> <note>
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
     * The semantic version to attach to the base image that was created during the import process. This version follows
     * the semantic version syntax.
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
     *        The semantic version to attach to the base image that was created during the import process. This version
     *        follows the semantic version syntax.</p> <note>
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

    public ImportVmImageRequest withSemanticVersion(String semanticVersion) {
        setSemanticVersion(semanticVersion);
        return this;
    }

    /**
     * <p>
     * The description for the base image that is created by the import process.
     * </p>
     * 
     * @param description
     *        The description for the base image that is created by the import process.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the base image that is created by the import process.
     * </p>
     * 
     * @return The description for the base image that is created by the import process.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the base image that is created by the import process.
     * </p>
     * 
     * @param description
     *        The description for the base image that is created by the import process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportVmImageRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The operating system platform for the imported VM.
     * </p>
     * 
     * @param platform
     *        The operating system platform for the imported VM.
     * @see Platform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The operating system platform for the imported VM.
     * </p>
     * 
     * @return The operating system platform for the imported VM.
     * @see Platform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The operating system platform for the imported VM.
     * </p>
     * 
     * @param platform
     *        The operating system platform for the imported VM.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public ImportVmImageRequest withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The operating system platform for the imported VM.
     * </p>
     * 
     * @param platform
     *        The operating system platform for the imported VM.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public ImportVmImageRequest withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The operating system version for the imported VM.
     * </p>
     * 
     * @param osVersion
     *        The operating system version for the imported VM.
     */

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * <p>
     * The operating system version for the imported VM.
     * </p>
     * 
     * @return The operating system version for the imported VM.
     */

    public String getOsVersion() {
        return this.osVersion;
    }

    /**
     * <p>
     * The operating system version for the imported VM.
     * </p>
     * 
     * @param osVersion
     *        The operating system version for the imported VM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportVmImageRequest withOsVersion(String osVersion) {
        setOsVersion(osVersion);
        return this;
    }

    /**
     * <p>
     * The <code>importTaskId</code> (API) or <code>ImportTaskId</code> (CLI) from the Amazon EC2 VM import process.
     * Image Builder retrieves information from the import process to pull in the AMI that is created from the VM source
     * as the base image for your recipe.
     * </p>
     * 
     * @param vmImportTaskId
     *        The <code>importTaskId</code> (API) or <code>ImportTaskId</code> (CLI) from the Amazon EC2 VM import
     *        process. Image Builder retrieves information from the import process to pull in the AMI that is created
     *        from the VM source as the base image for your recipe.
     */

    public void setVmImportTaskId(String vmImportTaskId) {
        this.vmImportTaskId = vmImportTaskId;
    }

    /**
     * <p>
     * The <code>importTaskId</code> (API) or <code>ImportTaskId</code> (CLI) from the Amazon EC2 VM import process.
     * Image Builder retrieves information from the import process to pull in the AMI that is created from the VM source
     * as the base image for your recipe.
     * </p>
     * 
     * @return The <code>importTaskId</code> (API) or <code>ImportTaskId</code> (CLI) from the Amazon EC2 VM import
     *         process. Image Builder retrieves information from the import process to pull in the AMI that is created
     *         from the VM source as the base image for your recipe.
     */

    public String getVmImportTaskId() {
        return this.vmImportTaskId;
    }

    /**
     * <p>
     * The <code>importTaskId</code> (API) or <code>ImportTaskId</code> (CLI) from the Amazon EC2 VM import process.
     * Image Builder retrieves information from the import process to pull in the AMI that is created from the VM source
     * as the base image for your recipe.
     * </p>
     * 
     * @param vmImportTaskId
     *        The <code>importTaskId</code> (API) or <code>ImportTaskId</code> (CLI) from the Amazon EC2 VM import
     *        process. Image Builder retrieves information from the import process to pull in the AMI that is created
     *        from the VM source as the base image for your recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportVmImageRequest withVmImportTaskId(String vmImportTaskId) {
        setVmImportTaskId(vmImportTaskId);
        return this;
    }

    /**
     * <p>
     * Tags that are attached to the import resources.
     * </p>
     * 
     * @return Tags that are attached to the import resources.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags that are attached to the import resources.
     * </p>
     * 
     * @param tags
     *        Tags that are attached to the import resources.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags that are attached to the import resources.
     * </p>
     * 
     * @param tags
     *        Tags that are attached to the import resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportVmImageRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ImportVmImageRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ImportVmImageRequest addTagsEntry(String key, String value) {
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

    public ImportVmImageRequest clearTagsEntries() {
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

    public ImportVmImageRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getOsVersion() != null)
            sb.append("OsVersion: ").append(getOsVersion()).append(",");
        if (getVmImportTaskId() != null)
            sb.append("VmImportTaskId: ").append(getVmImportTaskId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportVmImageRequest == false)
            return false;
        ImportVmImageRequest other = (ImportVmImageRequest) obj;
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
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getOsVersion() == null ^ this.getOsVersion() == null)
            return false;
        if (other.getOsVersion() != null && other.getOsVersion().equals(this.getOsVersion()) == false)
            return false;
        if (other.getVmImportTaskId() == null ^ this.getVmImportTaskId() == null)
            return false;
        if (other.getVmImportTaskId() != null && other.getVmImportTaskId().equals(this.getVmImportTaskId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getOsVersion() == null) ? 0 : getOsVersion().hashCode());
        hashCode = prime * hashCode + ((getVmImportTaskId() == null) ? 0 : getVmImportTaskId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public ImportVmImageRequest clone() {
        return (ImportVmImageRequest) super.clone();
    }

}
