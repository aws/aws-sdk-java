/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateGuardrailVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGuardrailVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the guardrail.
     * </p>
     */
    private String guardrailId;
    /**
     * <p>
     * The number of the version of the guardrail.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The unique identifier of the guardrail.
     * </p>
     * 
     * @param guardrailId
     *        The unique identifier of the guardrail.
     */

    public void setGuardrailId(String guardrailId) {
        this.guardrailId = guardrailId;
    }

    /**
     * <p>
     * The unique identifier of the guardrail.
     * </p>
     * 
     * @return The unique identifier of the guardrail.
     */

    public String getGuardrailId() {
        return this.guardrailId;
    }

    /**
     * <p>
     * The unique identifier of the guardrail.
     * </p>
     * 
     * @param guardrailId
     *        The unique identifier of the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGuardrailVersionResult withGuardrailId(String guardrailId) {
        setGuardrailId(guardrailId);
        return this;
    }

    /**
     * <p>
     * The number of the version of the guardrail.
     * </p>
     * 
     * @param version
     *        The number of the version of the guardrail.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The number of the version of the guardrail.
     * </p>
     * 
     * @return The number of the version of the guardrail.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The number of the version of the guardrail.
     * </p>
     * 
     * @param version
     *        The number of the version of the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGuardrailVersionResult withVersion(String version) {
        setVersion(version);
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
        if (getGuardrailId() != null)
            sb.append("GuardrailId: ").append(getGuardrailId()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGuardrailVersionResult == false)
            return false;
        CreateGuardrailVersionResult other = (CreateGuardrailVersionResult) obj;
        if (other.getGuardrailId() == null ^ this.getGuardrailId() == null)
            return false;
        if (other.getGuardrailId() != null && other.getGuardrailId().equals(this.getGuardrailId()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGuardrailId() == null) ? 0 : getGuardrailId().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreateGuardrailVersionResult clone() {
        try {
            return (CreateGuardrailVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
