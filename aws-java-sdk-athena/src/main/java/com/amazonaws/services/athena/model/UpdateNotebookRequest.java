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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateNotebook" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateNotebookRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the notebook to update.
     * </p>
     */
    private String notebookId;
    /**
     * <p>
     * The updated content for the notebook.
     * </p>
     */
    private String payload;
    /**
     * <p>
     * The notebook content type. Currently, the only valid type is <code>IPYNB</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The ID of the session in which the notebook will be updated.
     * </p>
     */
    private String sessionId;
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
     * The ID of the notebook to update.
     * </p>
     * 
     * @param notebookId
     *        The ID of the notebook to update.
     */

    public void setNotebookId(String notebookId) {
        this.notebookId = notebookId;
    }

    /**
     * <p>
     * The ID of the notebook to update.
     * </p>
     * 
     * @return The ID of the notebook to update.
     */

    public String getNotebookId() {
        return this.notebookId;
    }

    /**
     * <p>
     * The ID of the notebook to update.
     * </p>
     * 
     * @param notebookId
     *        The ID of the notebook to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotebookRequest withNotebookId(String notebookId) {
        setNotebookId(notebookId);
        return this;
    }

    /**
     * <p>
     * The updated content for the notebook.
     * </p>
     * 
     * @param payload
     *        The updated content for the notebook.
     */

    public void setPayload(String payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * The updated content for the notebook.
     * </p>
     * 
     * @return The updated content for the notebook.
     */

    public String getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * The updated content for the notebook.
     * </p>
     * 
     * @param payload
     *        The updated content for the notebook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotebookRequest withPayload(String payload) {
        setPayload(payload);
        return this;
    }

    /**
     * <p>
     * The notebook content type. Currently, the only valid type is <code>IPYNB</code>.
     * </p>
     * 
     * @param type
     *        The notebook content type. Currently, the only valid type is <code>IPYNB</code>.
     * @see NotebookType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The notebook content type. Currently, the only valid type is <code>IPYNB</code>.
     * </p>
     * 
     * @return The notebook content type. Currently, the only valid type is <code>IPYNB</code>.
     * @see NotebookType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The notebook content type. Currently, the only valid type is <code>IPYNB</code>.
     * </p>
     * 
     * @param type
     *        The notebook content type. Currently, the only valid type is <code>IPYNB</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookType
     */

    public UpdateNotebookRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The notebook content type. Currently, the only valid type is <code>IPYNB</code>.
     * </p>
     * 
     * @param type
     *        The notebook content type. Currently, the only valid type is <code>IPYNB</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookType
     */

    public UpdateNotebookRequest withType(NotebookType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the session in which the notebook will be updated.
     * </p>
     * 
     * @param sessionId
     *        The ID of the session in which the notebook will be updated.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The ID of the session in which the notebook will be updated.
     * </p>
     * 
     * @return The ID of the session in which the notebook will be updated.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The ID of the session in which the notebook will be updated.
     * </p>
     * 
     * @param sessionId
     *        The ID of the session in which the notebook will be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotebookRequest withSessionId(String sessionId) {
        setSessionId(sessionId);
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

    public UpdateNotebookRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getPayload() != null)
            sb.append("Payload: ").append(getPayload()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateNotebookRequest == false)
            return false;
        UpdateNotebookRequest other = (UpdateNotebookRequest) obj;
        if (other.getNotebookId() == null ^ this.getNotebookId() == null)
            return false;
        if (other.getNotebookId() != null && other.getNotebookId().equals(this.getNotebookId()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotebookId() == null) ? 0 : getNotebookId().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateNotebookRequest clone() {
        return (UpdateNotebookRequest) super.clone();
    }

}
