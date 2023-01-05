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
 * Defines the details of a batch job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/BatchJobDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchJobDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies a file containing a batch job definition.
     * </p>
     */
    private FileBatchJobDefinition fileBatchJobDefinition;
    /**
     * <p>
     * A script containing a batch job definition.
     * </p>
     */
    private ScriptBatchJobDefinition scriptBatchJobDefinition;

    /**
     * <p>
     * Specifies a file containing a batch job definition.
     * </p>
     * 
     * @param fileBatchJobDefinition
     *        Specifies a file containing a batch job definition.
     */

    public void setFileBatchJobDefinition(FileBatchJobDefinition fileBatchJobDefinition) {
        this.fileBatchJobDefinition = fileBatchJobDefinition;
    }

    /**
     * <p>
     * Specifies a file containing a batch job definition.
     * </p>
     * 
     * @return Specifies a file containing a batch job definition.
     */

    public FileBatchJobDefinition getFileBatchJobDefinition() {
        return this.fileBatchJobDefinition;
    }

    /**
     * <p>
     * Specifies a file containing a batch job definition.
     * </p>
     * 
     * @param fileBatchJobDefinition
     *        Specifies a file containing a batch job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchJobDefinition withFileBatchJobDefinition(FileBatchJobDefinition fileBatchJobDefinition) {
        setFileBatchJobDefinition(fileBatchJobDefinition);
        return this;
    }

    /**
     * <p>
     * A script containing a batch job definition.
     * </p>
     * 
     * @param scriptBatchJobDefinition
     *        A script containing a batch job definition.
     */

    public void setScriptBatchJobDefinition(ScriptBatchJobDefinition scriptBatchJobDefinition) {
        this.scriptBatchJobDefinition = scriptBatchJobDefinition;
    }

    /**
     * <p>
     * A script containing a batch job definition.
     * </p>
     * 
     * @return A script containing a batch job definition.
     */

    public ScriptBatchJobDefinition getScriptBatchJobDefinition() {
        return this.scriptBatchJobDefinition;
    }

    /**
     * <p>
     * A script containing a batch job definition.
     * </p>
     * 
     * @param scriptBatchJobDefinition
     *        A script containing a batch job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchJobDefinition withScriptBatchJobDefinition(ScriptBatchJobDefinition scriptBatchJobDefinition) {
        setScriptBatchJobDefinition(scriptBatchJobDefinition);
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
        if (getFileBatchJobDefinition() != null)
            sb.append("FileBatchJobDefinition: ").append(getFileBatchJobDefinition()).append(",");
        if (getScriptBatchJobDefinition() != null)
            sb.append("ScriptBatchJobDefinition: ").append(getScriptBatchJobDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchJobDefinition == false)
            return false;
        BatchJobDefinition other = (BatchJobDefinition) obj;
        if (other.getFileBatchJobDefinition() == null ^ this.getFileBatchJobDefinition() == null)
            return false;
        if (other.getFileBatchJobDefinition() != null && other.getFileBatchJobDefinition().equals(this.getFileBatchJobDefinition()) == false)
            return false;
        if (other.getScriptBatchJobDefinition() == null ^ this.getScriptBatchJobDefinition() == null)
            return false;
        if (other.getScriptBatchJobDefinition() != null && other.getScriptBatchJobDefinition().equals(this.getScriptBatchJobDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileBatchJobDefinition() == null) ? 0 : getFileBatchJobDefinition().hashCode());
        hashCode = prime * hashCode + ((getScriptBatchJobDefinition() == null) ? 0 : getScriptBatchJobDefinition().hashCode());
        return hashCode;
    }

    @Override
    public BatchJobDefinition clone() {
        try {
            return (BatchJobDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.BatchJobDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
