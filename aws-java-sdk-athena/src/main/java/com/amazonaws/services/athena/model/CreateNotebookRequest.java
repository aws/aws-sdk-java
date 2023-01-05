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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateNotebook" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNotebookRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Spark enabled workgroup in which the notebook will be created.
     * </p>
     */
    private String workGroup;
    /**
     * <p>
     * The name of the <code>ipynb</code> file to be created in the Spark workgroup, without the <code>.ipynb</code>
     * extension.
     * </p>
     */
    private String name;
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
     * The name of the Spark enabled workgroup in which the notebook will be created.
     * </p>
     * 
     * @param workGroup
     *        The name of the Spark enabled workgroup in which the notebook will be created.
     */

    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * <p>
     * The name of the Spark enabled workgroup in which the notebook will be created.
     * </p>
     * 
     * @return The name of the Spark enabled workgroup in which the notebook will be created.
     */

    public String getWorkGroup() {
        return this.workGroup;
    }

    /**
     * <p>
     * The name of the Spark enabled workgroup in which the notebook will be created.
     * </p>
     * 
     * @param workGroup
     *        The name of the Spark enabled workgroup in which the notebook will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookRequest withWorkGroup(String workGroup) {
        setWorkGroup(workGroup);
        return this;
    }

    /**
     * <p>
     * The name of the <code>ipynb</code> file to be created in the Spark workgroup, without the <code>.ipynb</code>
     * extension.
     * </p>
     * 
     * @param name
     *        The name of the <code>ipynb</code> file to be created in the Spark workgroup, without the
     *        <code>.ipynb</code> extension.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <code>ipynb</code> file to be created in the Spark workgroup, without the <code>.ipynb</code>
     * extension.
     * </p>
     * 
     * @return The name of the <code>ipynb</code> file to be created in the Spark workgroup, without the
     *         <code>.ipynb</code> extension.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the <code>ipynb</code> file to be created in the Spark workgroup, without the <code>.ipynb</code>
     * extension.
     * </p>
     * 
     * @param name
     *        The name of the <code>ipynb</code> file to be created in the Spark workgroup, without the
     *        <code>.ipynb</code> extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookRequest withName(String name) {
        setName(name);
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

    public CreateNotebookRequest withClientRequestToken(String clientRequestToken) {
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
        if (getWorkGroup() != null)
            sb.append("WorkGroup: ").append(getWorkGroup()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof CreateNotebookRequest == false)
            return false;
        CreateNotebookRequest other = (CreateNotebookRequest) obj;
        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null && other.getWorkGroup().equals(this.getWorkGroup()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateNotebookRequest clone() {
        return (CreateNotebookRequest) super.clone();
    }

}
