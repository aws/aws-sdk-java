/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateWorldExportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorldExportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * A list of Amazon Resource Names (arns) that correspond to worlds to export.
     * </p>
     */
    private java.util.List<String> worlds;

    private OutputLocation outputLocation;
    /**
     * <p>
     * The IAM role that the world export process uses to access the Amazon S3 bucket and put the export.
     * </p>
     */
    private String iamRole;
    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the world export job.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldExportJobRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (arns) that correspond to worlds to export.
     * </p>
     * 
     * @return A list of Amazon Resource Names (arns) that correspond to worlds to export.
     */

    public java.util.List<String> getWorlds() {
        return worlds;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (arns) that correspond to worlds to export.
     * </p>
     * 
     * @param worlds
     *        A list of Amazon Resource Names (arns) that correspond to worlds to export.
     */

    public void setWorlds(java.util.Collection<String> worlds) {
        if (worlds == null) {
            this.worlds = null;
            return;
        }

        this.worlds = new java.util.ArrayList<String>(worlds);
    }

    /**
     * <p>
     * A list of Amazon Resource Names (arns) that correspond to worlds to export.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorlds(java.util.Collection)} or {@link #withWorlds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param worlds
     *        A list of Amazon Resource Names (arns) that correspond to worlds to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldExportJobRequest withWorlds(String... worlds) {
        if (this.worlds == null) {
            setWorlds(new java.util.ArrayList<String>(worlds.length));
        }
        for (String ele : worlds) {
            this.worlds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (arns) that correspond to worlds to export.
     * </p>
     * 
     * @param worlds
     *        A list of Amazon Resource Names (arns) that correspond to worlds to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldExportJobRequest withWorlds(java.util.Collection<String> worlds) {
        setWorlds(worlds);
        return this;
    }

    /**
     * @param outputLocation
     */

    public void setOutputLocation(OutputLocation outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * @return
     */

    public OutputLocation getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * @param outputLocation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldExportJobRequest withOutputLocation(OutputLocation outputLocation) {
        setOutputLocation(outputLocation);
        return this;
    }

    /**
     * <p>
     * The IAM role that the world export process uses to access the Amazon S3 bucket and put the export.
     * </p>
     * 
     * @param iamRole
     *        The IAM role that the world export process uses to access the Amazon S3 bucket and put the export.
     */

    public void setIamRole(String iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>
     * The IAM role that the world export process uses to access the Amazon S3 bucket and put the export.
     * </p>
     * 
     * @return The IAM role that the world export process uses to access the Amazon S3 bucket and put the export.
     */

    public String getIamRole() {
        return this.iamRole;
    }

    /**
     * <p>
     * The IAM role that the world export process uses to access the Amazon S3 bucket and put the export.
     * </p>
     * 
     * @param iamRole
     *        The IAM role that the world export process uses to access the Amazon S3 bucket and put the export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldExportJobRequest withIamRole(String iamRole) {
        setIamRole(iamRole);
        return this;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the world export job.
     * </p>
     * 
     * @return A map that contains tag keys and tag values that are attached to the world export job.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the world export job.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the world export job.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the world export job.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the world export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldExportJobRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateWorldExportJobRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldExportJobRequest addTagsEntry(String key, String value) {
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

    public CreateWorldExportJobRequest clearTagsEntries() {
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getWorlds() != null)
            sb.append("Worlds: ").append(getWorlds()).append(",");
        if (getOutputLocation() != null)
            sb.append("OutputLocation: ").append(getOutputLocation()).append(",");
        if (getIamRole() != null)
            sb.append("IamRole: ").append(getIamRole()).append(",");
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

        if (obj instanceof CreateWorldExportJobRequest == false)
            return false;
        CreateWorldExportJobRequest other = (CreateWorldExportJobRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getWorlds() == null ^ this.getWorlds() == null)
            return false;
        if (other.getWorlds() != null && other.getWorlds().equals(this.getWorlds()) == false)
            return false;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        if (other.getIamRole() == null ^ this.getIamRole() == null)
            return false;
        if (other.getIamRole() != null && other.getIamRole().equals(this.getIamRole()) == false)
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

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getWorlds() == null) ? 0 : getWorlds().hashCode());
        hashCode = prime * hashCode + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorldExportJobRequest clone() {
        return (CreateWorldExportJobRequest) super.clone();
    }

}
