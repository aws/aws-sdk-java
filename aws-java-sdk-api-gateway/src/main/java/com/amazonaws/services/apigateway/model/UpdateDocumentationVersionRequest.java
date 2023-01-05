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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates an existing documentation version of an API.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDocumentationVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The string identifier of the associated RestApi..
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The version identifier of the to-be-updated documentation version.
     * </p>
     */
    private String documentationVersion;
    /**
     * <p>
     * For more information about supported patch operations, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/api/patch-operations.html">Patch Operations</a>.
     * </p>
     */
    private java.util.List<PatchOperation> patchOperations;

    /**
     * <p>
     * The string identifier of the associated RestApi..
     * </p>
     * 
     * @param restApiId
     *        The string identifier of the associated RestApi..
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The string identifier of the associated RestApi..
     * </p>
     * 
     * @return The string identifier of the associated RestApi..
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The string identifier of the associated RestApi..
     * </p>
     * 
     * @param restApiId
     *        The string identifier of the associated RestApi..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentationVersionRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The version identifier of the to-be-updated documentation version.
     * </p>
     * 
     * @param documentationVersion
     *        The version identifier of the to-be-updated documentation version.
     */

    public void setDocumentationVersion(String documentationVersion) {
        this.documentationVersion = documentationVersion;
    }

    /**
     * <p>
     * The version identifier of the to-be-updated documentation version.
     * </p>
     * 
     * @return The version identifier of the to-be-updated documentation version.
     */

    public String getDocumentationVersion() {
        return this.documentationVersion;
    }

    /**
     * <p>
     * The version identifier of the to-be-updated documentation version.
     * </p>
     * 
     * @param documentationVersion
     *        The version identifier of the to-be-updated documentation version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentationVersionRequest withDocumentationVersion(String documentationVersion) {
        setDocumentationVersion(documentationVersion);
        return this;
    }

    /**
     * <p>
     * For more information about supported patch operations, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/api/patch-operations.html">Patch Operations</a>.
     * </p>
     * 
     * @return For more information about supported patch operations, see <a
     *         href="https://docs.aws.amazon.com/apigateway/latest/api/patch-operations.html">Patch Operations</a>.
     */

    public java.util.List<PatchOperation> getPatchOperations() {
        return patchOperations;
    }

    /**
     * <p>
     * For more information about supported patch operations, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/api/patch-operations.html">Patch Operations</a>.
     * </p>
     * 
     * @param patchOperations
     *        For more information about supported patch operations, see <a
     *        href="https://docs.aws.amazon.com/apigateway/latest/api/patch-operations.html">Patch Operations</a>.
     */

    public void setPatchOperations(java.util.Collection<PatchOperation> patchOperations) {
        if (patchOperations == null) {
            this.patchOperations = null;
            return;
        }

        this.patchOperations = new java.util.ArrayList<PatchOperation>(patchOperations);
    }

    /**
     * <p>
     * For more information about supported patch operations, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/api/patch-operations.html">Patch Operations</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPatchOperations(java.util.Collection)} or {@link #withPatchOperations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param patchOperations
     *        For more information about supported patch operations, see <a
     *        href="https://docs.aws.amazon.com/apigateway/latest/api/patch-operations.html">Patch Operations</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentationVersionRequest withPatchOperations(PatchOperation... patchOperations) {
        if (this.patchOperations == null) {
            setPatchOperations(new java.util.ArrayList<PatchOperation>(patchOperations.length));
        }
        for (PatchOperation ele : patchOperations) {
            this.patchOperations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For more information about supported patch operations, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/api/patch-operations.html">Patch Operations</a>.
     * </p>
     * 
     * @param patchOperations
     *        For more information about supported patch operations, see <a
     *        href="https://docs.aws.amazon.com/apigateway/latest/api/patch-operations.html">Patch Operations</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentationVersionRequest withPatchOperations(java.util.Collection<PatchOperation> patchOperations) {
        setPatchOperations(patchOperations);
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
        if (getPatchOperations() != null)
            sb.append("PatchOperations: ").append(getPatchOperations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDocumentationVersionRequest == false)
            return false;
        UpdateDocumentationVersionRequest other = (UpdateDocumentationVersionRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getDocumentationVersion() == null ^ this.getDocumentationVersion() == null)
            return false;
        if (other.getDocumentationVersion() != null && other.getDocumentationVersion().equals(this.getDocumentationVersion()) == false)
            return false;
        if (other.getPatchOperations() == null ^ this.getPatchOperations() == null)
            return false;
        if (other.getPatchOperations() != null && other.getPatchOperations().equals(this.getPatchOperations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getDocumentationVersion() == null) ? 0 : getDocumentationVersion().hashCode());
        hashCode = prime * hashCode + ((getPatchOperations() == null) ? 0 : getPatchOperations().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDocumentationVersionRequest clone() {
        return (UpdateDocumentationVersionRequest) super.clone();
    }

}
