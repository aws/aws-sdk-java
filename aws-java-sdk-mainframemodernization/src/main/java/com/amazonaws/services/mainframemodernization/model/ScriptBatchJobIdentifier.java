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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A batch job identifier in which the batch job to run is identified by the script name.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ScriptBatchJobIdentifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScriptBatchJobIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the script containing the batch job definition.
     * </p>
     */
    private String scriptName;

    /**
     * <p>
     * The name of the script containing the batch job definition.
     * </p>
     * 
     * @param scriptName
     *        The name of the script containing the batch job definition.
     */

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    /**
     * <p>
     * The name of the script containing the batch job definition.
     * </p>
     * 
     * @return The name of the script containing the batch job definition.
     */

    public String getScriptName() {
        return this.scriptName;
    }

    /**
     * <p>
     * The name of the script containing the batch job definition.
     * </p>
     * 
     * @param scriptName
     *        The name of the script containing the batch job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScriptBatchJobIdentifier withScriptName(String scriptName) {
        setScriptName(scriptName);
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
        if (getScriptName() != null)
            sb.append("ScriptName: ").append(getScriptName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScriptBatchJobIdentifier == false)
            return false;
        ScriptBatchJobIdentifier other = (ScriptBatchJobIdentifier) obj;
        if (other.getScriptName() == null ^ this.getScriptName() == null)
            return false;
        if (other.getScriptName() != null && other.getScriptName().equals(this.getScriptName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScriptName() == null) ? 0 : getScriptName().hashCode());
        return hashCode;
    }

    @Override
    public ScriptBatchJobIdentifier clone() {
        try {
            return (ScriptBatchJobIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.ScriptBatchJobIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
