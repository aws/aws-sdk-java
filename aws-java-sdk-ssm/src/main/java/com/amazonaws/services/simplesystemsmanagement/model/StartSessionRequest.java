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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The instance to connect to for the session.
     * </p>
     */
    private String target;
    /**
     * <p>
     * The name of the SSM document to define the parameters and plugin settings for the session. For example,
     * <code>SSM-SessionManagerRunShell</code>. If no document name is provided, a shell to the instance is launched by
     * default.
     * </p>
     */
    private String documentName;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;

    /**
     * <p>
     * The instance to connect to for the session.
     * </p>
     * 
     * @param target
     *        The instance to connect to for the session.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The instance to connect to for the session.
     * </p>
     * 
     * @return The instance to connect to for the session.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The instance to connect to for the session.
     * </p>
     * 
     * @param target
     *        The instance to connect to for the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSessionRequest withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The name of the SSM document to define the parameters and plugin settings for the session. For example,
     * <code>SSM-SessionManagerRunShell</code>. If no document name is provided, a shell to the instance is launched by
     * default.
     * </p>
     * 
     * @param documentName
     *        The name of the SSM document to define the parameters and plugin settings for the session. For example,
     *        <code>SSM-SessionManagerRunShell</code>. If no document name is provided, a shell to the instance is
     *        launched by default.
     */

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * The name of the SSM document to define the parameters and plugin settings for the session. For example,
     * <code>SSM-SessionManagerRunShell</code>. If no document name is provided, a shell to the instance is launched by
     * default.
     * </p>
     * 
     * @return The name of the SSM document to define the parameters and plugin settings for the session. For example,
     *         <code>SSM-SessionManagerRunShell</code>. If no document name is provided, a shell to the instance is
     *         launched by default.
     */

    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * <p>
     * The name of the SSM document to define the parameters and plugin settings for the session. For example,
     * <code>SSM-SessionManagerRunShell</code>. If no document name is provided, a shell to the instance is launched by
     * default.
     * </p>
     * 
     * @param documentName
     *        The name of the SSM document to define the parameters and plugin settings for the session. For example,
     *        <code>SSM-SessionManagerRunShell</code>. If no document name is provided, a shell to the instance is
     *        launched by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSessionRequest withDocumentName(String documentName) {
        setDocumentName(documentName);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param parameters
     *        Reserved for future use.
     */

    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param parameters
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSessionRequest withParameters(java.util.Map<String, java.util.List<String>> parameters) {
        setParameters(parameters);
        return this;
    }

    public StartSessionRequest addParametersEntry(String key, java.util.List<String> value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSessionRequest clearParametersEntries() {
        this.parameters = null;
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
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getDocumentName() != null)
            sb.append("DocumentName: ").append(getDocumentName()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSessionRequest == false)
            return false;
        StartSessionRequest other = (StartSessionRequest) obj;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getDocumentName() == null ^ this.getDocumentName() == null)
            return false;
        if (other.getDocumentName() != null && other.getDocumentName().equals(this.getDocumentName()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public StartSessionRequest clone() {
        return (StartSessionRequest) super.clone();
    }

}
