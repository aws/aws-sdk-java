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
 * Identifies a specific batch job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/BatchJobIdentifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchJobIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies a file associated with a specific batch job.
     * </p>
     */
    private FileBatchJobIdentifier fileBatchJobIdentifier;
    /**
     * <p>
     * A batch job identifier in which the batch job to run is identified by the script name.
     * </p>
     */
    private ScriptBatchJobIdentifier scriptBatchJobIdentifier;

    /**
     * <p>
     * Specifies a file associated with a specific batch job.
     * </p>
     * 
     * @param fileBatchJobIdentifier
     *        Specifies a file associated with a specific batch job.
     */

    public void setFileBatchJobIdentifier(FileBatchJobIdentifier fileBatchJobIdentifier) {
        this.fileBatchJobIdentifier = fileBatchJobIdentifier;
    }

    /**
     * <p>
     * Specifies a file associated with a specific batch job.
     * </p>
     * 
     * @return Specifies a file associated with a specific batch job.
     */

    public FileBatchJobIdentifier getFileBatchJobIdentifier() {
        return this.fileBatchJobIdentifier;
    }

    /**
     * <p>
     * Specifies a file associated with a specific batch job.
     * </p>
     * 
     * @param fileBatchJobIdentifier
     *        Specifies a file associated with a specific batch job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchJobIdentifier withFileBatchJobIdentifier(FileBatchJobIdentifier fileBatchJobIdentifier) {
        setFileBatchJobIdentifier(fileBatchJobIdentifier);
        return this;
    }

    /**
     * <p>
     * A batch job identifier in which the batch job to run is identified by the script name.
     * </p>
     * 
     * @param scriptBatchJobIdentifier
     *        A batch job identifier in which the batch job to run is identified by the script name.
     */

    public void setScriptBatchJobIdentifier(ScriptBatchJobIdentifier scriptBatchJobIdentifier) {
        this.scriptBatchJobIdentifier = scriptBatchJobIdentifier;
    }

    /**
     * <p>
     * A batch job identifier in which the batch job to run is identified by the script name.
     * </p>
     * 
     * @return A batch job identifier in which the batch job to run is identified by the script name.
     */

    public ScriptBatchJobIdentifier getScriptBatchJobIdentifier() {
        return this.scriptBatchJobIdentifier;
    }

    /**
     * <p>
     * A batch job identifier in which the batch job to run is identified by the script name.
     * </p>
     * 
     * @param scriptBatchJobIdentifier
     *        A batch job identifier in which the batch job to run is identified by the script name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchJobIdentifier withScriptBatchJobIdentifier(ScriptBatchJobIdentifier scriptBatchJobIdentifier) {
        setScriptBatchJobIdentifier(scriptBatchJobIdentifier);
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
        if (getFileBatchJobIdentifier() != null)
            sb.append("FileBatchJobIdentifier: ").append(getFileBatchJobIdentifier()).append(",");
        if (getScriptBatchJobIdentifier() != null)
            sb.append("ScriptBatchJobIdentifier: ").append(getScriptBatchJobIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchJobIdentifier == false)
            return false;
        BatchJobIdentifier other = (BatchJobIdentifier) obj;
        if (other.getFileBatchJobIdentifier() == null ^ this.getFileBatchJobIdentifier() == null)
            return false;
        if (other.getFileBatchJobIdentifier() != null && other.getFileBatchJobIdentifier().equals(this.getFileBatchJobIdentifier()) == false)
            return false;
        if (other.getScriptBatchJobIdentifier() == null ^ this.getScriptBatchJobIdentifier() == null)
            return false;
        if (other.getScriptBatchJobIdentifier() != null && other.getScriptBatchJobIdentifier().equals(this.getScriptBatchJobIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileBatchJobIdentifier() == null) ? 0 : getFileBatchJobIdentifier().hashCode());
        hashCode = prime * hashCode + ((getScriptBatchJobIdentifier() == null) ? 0 : getScriptBatchJobIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public BatchJobIdentifier clone() {
        try {
            return (BatchJobIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.BatchJobIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
