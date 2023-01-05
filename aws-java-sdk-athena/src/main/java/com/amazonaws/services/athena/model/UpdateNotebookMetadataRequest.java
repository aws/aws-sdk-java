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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateNotebookMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateNotebookMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the notebook to update the metadata for.
     * </p>
     */
    private String notebookId;
    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the notebook is idempotent (executes only
     * once).
     * </p>
     * <important>
     * <p>
     * This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services SDK
     * for Java) auto-generate the token for you. If you are not using the Amazon Web Services SDK or the Amazon Web
     * Services CLI, you must provide this token or the action will fail.
     * </p>
     * </important>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The name to update the notebook to.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The ID of the notebook to update the metadata for.
     * </p>
     * 
     * @param notebookId
     *        The ID of the notebook to update the metadata for.
     */

    public void setNotebookId(String notebookId) {
        this.notebookId = notebookId;
    }

    /**
     * <p>
     * The ID of the notebook to update the metadata for.
     * </p>
     * 
     * @return The ID of the notebook to update the metadata for.
     */

    public String getNotebookId() {
        return this.notebookId;
    }

    /**
     * <p>
     * The ID of the notebook to update the metadata for.
     * </p>
     * 
     * @param notebookId
     *        The ID of the notebook to update the metadata for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotebookMetadataRequest withNotebookId(String notebookId) {
        setNotebookId(notebookId);
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the notebook is idempotent (executes only
     * once).
     * </p>
     * <important>
     * <p>
     * This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services SDK
     * for Java) auto-generate the token for you. If you are not using the Amazon Web Services SDK or the Amazon Web
     * Services CLI, you must provide this token or the action will fail.
     * </p>
     * </important>
     * 
     * @param clientRequestToken
     *        A unique case-sensitive string used to ensure the request to create the notebook is idempotent (executes
     *        only once).</p> <important>
     *        <p>
     *        This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services
     *        SDK for Java) auto-generate the token for you. If you are not using the Amazon Web Services SDK or the
     *        Amazon Web Services CLI, you must provide this token or the action will fail.
     *        </p>
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the notebook is idempotent (executes only
     * once).
     * </p>
     * <important>
     * <p>
     * This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services SDK
     * for Java) auto-generate the token for you. If you are not using the Amazon Web Services SDK or the Amazon Web
     * Services CLI, you must provide this token or the action will fail.
     * </p>
     * </important>
     * 
     * @return A unique case-sensitive string used to ensure the request to create the notebook is idempotent (executes
     *         only once).</p> <important>
     *         <p>
     *         This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web
     *         Services SDK for Java) auto-generate the token for you. If you are not using the Amazon Web Services SDK
     *         or the Amazon Web Services CLI, you must provide this token or the action will fail.
     *         </p>
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the notebook is idempotent (executes only
     * once).
     * </p>
     * <important>
     * <p>
     * This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services SDK
     * for Java) auto-generate the token for you. If you are not using the Amazon Web Services SDK or the Amazon Web
     * Services CLI, you must provide this token or the action will fail.
     * </p>
     * </important>
     * 
     * @param clientRequestToken
     *        A unique case-sensitive string used to ensure the request to create the notebook is idempotent (executes
     *        only once).</p> <important>
     *        <p>
     *        This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services
     *        SDK for Java) auto-generate the token for you. If you are not using the Amazon Web Services SDK or the
     *        Amazon Web Services CLI, you must provide this token or the action will fail.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotebookMetadataRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The name to update the notebook to.
     * </p>
     * 
     * @param name
     *        The name to update the notebook to.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name to update the notebook to.
     * </p>
     * 
     * @return The name to update the notebook to.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name to update the notebook to.
     * </p>
     * 
     * @param name
     *        The name to update the notebook to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotebookMetadataRequest withName(String name) {
        setName(name);
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
        if (getNotebookId() != null)
            sb.append("NotebookId: ").append(getNotebookId()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateNotebookMetadataRequest == false)
            return false;
        UpdateNotebookMetadataRequest other = (UpdateNotebookMetadataRequest) obj;
        if (other.getNotebookId() == null ^ this.getNotebookId() == null)
            return false;
        if (other.getNotebookId() != null && other.getNotebookId().equals(this.getNotebookId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotebookId() == null) ? 0 : getNotebookId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateNotebookMetadataRequest clone() {
        return (UpdateNotebookMetadataRequest) super.clone();
    }

}
