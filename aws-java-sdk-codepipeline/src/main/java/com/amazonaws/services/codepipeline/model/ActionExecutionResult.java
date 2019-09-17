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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Execution result information, such as the external execution ID.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ActionExecutionResult" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionExecutionResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action provider's external ID for the action execution.
     * </p>
     */
    private String externalExecutionId;
    /**
     * <p>
     * The action provider's summary for the action execution.
     * </p>
     */
    private String externalExecutionSummary;
    /**
     * <p>
     * The deepest external link to the external resource (for example, a repository URL or deployment endpoint) that is
     * used when running the action.
     * </p>
     */
    private String externalExecutionUrl;

    /**
     * <p>
     * The action provider's external ID for the action execution.
     * </p>
     * 
     * @param externalExecutionId
     *        The action provider's external ID for the action execution.
     */

    public void setExternalExecutionId(String externalExecutionId) {
        this.externalExecutionId = externalExecutionId;
    }

    /**
     * <p>
     * The action provider's external ID for the action execution.
     * </p>
     * 
     * @return The action provider's external ID for the action execution.
     */

    public String getExternalExecutionId() {
        return this.externalExecutionId;
    }

    /**
     * <p>
     * The action provider's external ID for the action execution.
     * </p>
     * 
     * @param externalExecutionId
     *        The action provider's external ID for the action execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionResult withExternalExecutionId(String externalExecutionId) {
        setExternalExecutionId(externalExecutionId);
        return this;
    }

    /**
     * <p>
     * The action provider's summary for the action execution.
     * </p>
     * 
     * @param externalExecutionSummary
     *        The action provider's summary for the action execution.
     */

    public void setExternalExecutionSummary(String externalExecutionSummary) {
        this.externalExecutionSummary = externalExecutionSummary;
    }

    /**
     * <p>
     * The action provider's summary for the action execution.
     * </p>
     * 
     * @return The action provider's summary for the action execution.
     */

    public String getExternalExecutionSummary() {
        return this.externalExecutionSummary;
    }

    /**
     * <p>
     * The action provider's summary for the action execution.
     * </p>
     * 
     * @param externalExecutionSummary
     *        The action provider's summary for the action execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionResult withExternalExecutionSummary(String externalExecutionSummary) {
        setExternalExecutionSummary(externalExecutionSummary);
        return this;
    }

    /**
     * <p>
     * The deepest external link to the external resource (for example, a repository URL or deployment endpoint) that is
     * used when running the action.
     * </p>
     * 
     * @param externalExecutionUrl
     *        The deepest external link to the external resource (for example, a repository URL or deployment endpoint)
     *        that is used when running the action.
     */

    public void setExternalExecutionUrl(String externalExecutionUrl) {
        this.externalExecutionUrl = externalExecutionUrl;
    }

    /**
     * <p>
     * The deepest external link to the external resource (for example, a repository URL or deployment endpoint) that is
     * used when running the action.
     * </p>
     * 
     * @return The deepest external link to the external resource (for example, a repository URL or deployment endpoint)
     *         that is used when running the action.
     */

    public String getExternalExecutionUrl() {
        return this.externalExecutionUrl;
    }

    /**
     * <p>
     * The deepest external link to the external resource (for example, a repository URL or deployment endpoint) that is
     * used when running the action.
     * </p>
     * 
     * @param externalExecutionUrl
     *        The deepest external link to the external resource (for example, a repository URL or deployment endpoint)
     *        that is used when running the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionResult withExternalExecutionUrl(String externalExecutionUrl) {
        setExternalExecutionUrl(externalExecutionUrl);
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
        if (getExternalExecutionId() != null)
            sb.append("ExternalExecutionId: ").append(getExternalExecutionId()).append(",");
        if (getExternalExecutionSummary() != null)
            sb.append("ExternalExecutionSummary: ").append(getExternalExecutionSummary()).append(",");
        if (getExternalExecutionUrl() != null)
            sb.append("ExternalExecutionUrl: ").append(getExternalExecutionUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionExecutionResult == false)
            return false;
        ActionExecutionResult other = (ActionExecutionResult) obj;
        if (other.getExternalExecutionId() == null ^ this.getExternalExecutionId() == null)
            return false;
        if (other.getExternalExecutionId() != null && other.getExternalExecutionId().equals(this.getExternalExecutionId()) == false)
            return false;
        if (other.getExternalExecutionSummary() == null ^ this.getExternalExecutionSummary() == null)
            return false;
        if (other.getExternalExecutionSummary() != null && other.getExternalExecutionSummary().equals(this.getExternalExecutionSummary()) == false)
            return false;
        if (other.getExternalExecutionUrl() == null ^ this.getExternalExecutionUrl() == null)
            return false;
        if (other.getExternalExecutionUrl() != null && other.getExternalExecutionUrl().equals(this.getExternalExecutionUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExternalExecutionId() == null) ? 0 : getExternalExecutionId().hashCode());
        hashCode = prime * hashCode + ((getExternalExecutionSummary() == null) ? 0 : getExternalExecutionSummary().hashCode());
        hashCode = prime * hashCode + ((getExternalExecutionUrl() == null) ? 0 : getExternalExecutionUrl().hashCode());
        return hashCode;
    }

    @Override
    public ActionExecutionResult clone() {
        try {
            return (ActionExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ActionExecutionResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
