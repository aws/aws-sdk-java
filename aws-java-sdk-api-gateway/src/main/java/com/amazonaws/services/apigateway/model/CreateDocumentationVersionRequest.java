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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new documentation version of a given API.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDocumentationVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * [Required] The version identifier of the new snapshot.
     * </p>
     */
    private String documentationVersion;
    /**
     * <p>
     * The stage name to be associated with the new documentation snapshot.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * A description about the new documentation snapshot.
     * </p>
     */
    private String description;

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @return [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentationVersionRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * [Required] The version identifier of the new snapshot.
     * </p>
     * 
     * @param documentationVersion
     *        [Required] The version identifier of the new snapshot.
     */

    public void setDocumentationVersion(String documentationVersion) {
        this.documentationVersion = documentationVersion;
    }

    /**
     * <p>
     * [Required] The version identifier of the new snapshot.
     * </p>
     * 
     * @return [Required] The version identifier of the new snapshot.
     */

    public String getDocumentationVersion() {
        return this.documentationVersion;
    }

    /**
     * <p>
     * [Required] The version identifier of the new snapshot.
     * </p>
     * 
     * @param documentationVersion
     *        [Required] The version identifier of the new snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentationVersionRequest withDocumentationVersion(String documentationVersion) {
        setDocumentationVersion(documentationVersion);
        return this;
    }

    /**
     * <p>
     * The stage name to be associated with the new documentation snapshot.
     * </p>
     * 
     * @param stageName
     *        The stage name to be associated with the new documentation snapshot.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The stage name to be associated with the new documentation snapshot.
     * </p>
     * 
     * @return The stage name to be associated with the new documentation snapshot.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The stage name to be associated with the new documentation snapshot.
     * </p>
     * 
     * @param stageName
     *        The stage name to be associated with the new documentation snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentationVersionRequest withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * A description about the new documentation snapshot.
     * </p>
     * 
     * @param description
     *        A description about the new documentation snapshot.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description about the new documentation snapshot.
     * </p>
     * 
     * @return A description about the new documentation snapshot.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description about the new documentation snapshot.
     * </p>
     * 
     * @param description
     *        A description about the new documentation snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentationVersionRequest withDescription(String description) {
        setDescription(description);
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
        if (getRestApiId() != null)
            sb.append("RestApiId: ").append(getRestApiId()).append(",");
        if (getDocumentationVersion() != null)
            sb.append("DocumentationVersion: ").append(getDocumentationVersion()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDocumentationVersionRequest == false)
            return false;
        CreateDocumentationVersionRequest other = (CreateDocumentationVersionRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getDocumentationVersion() == null ^ this.getDocumentationVersion() == null)
            return false;
        if (other.getDocumentationVersion() != null && other.getDocumentationVersion().equals(this.getDocumentationVersion()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getDocumentationVersion() == null) ? 0 : getDocumentationVersion().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreateDocumentationVersionRequest clone() {
        return (CreateDocumentationVersionRequest) super.clone();
    }

}
