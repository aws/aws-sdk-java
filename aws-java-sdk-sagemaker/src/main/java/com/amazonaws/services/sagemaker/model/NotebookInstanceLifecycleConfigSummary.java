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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a summary of a notebook instance lifecycle configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/NotebookInstanceLifecycleConfigSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotebookInstanceLifecycleConfigSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the lifecycle configuration.
     * </p>
     */
    private String notebookInstanceLifecycleConfigName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle configuration.
     * </p>
     */
    private String notebookInstanceLifecycleConfigArn;
    /**
     * <p>
     * A timestamp that tells when the lifecycle configuration was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A timestamp that tells when the lifecycle configuration was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The name of the lifecycle configuration.
     * </p>
     * 
     * @param notebookInstanceLifecycleConfigName
     *        The name of the lifecycle configuration.
     */

    public void setNotebookInstanceLifecycleConfigName(String notebookInstanceLifecycleConfigName) {
        this.notebookInstanceLifecycleConfigName = notebookInstanceLifecycleConfigName;
    }

    /**
     * <p>
     * The name of the lifecycle configuration.
     * </p>
     * 
     * @return The name of the lifecycle configuration.
     */

    public String getNotebookInstanceLifecycleConfigName() {
        return this.notebookInstanceLifecycleConfigName;
    }

    /**
     * <p>
     * The name of the lifecycle configuration.
     * </p>
     * 
     * @param notebookInstanceLifecycleConfigName
     *        The name of the lifecycle configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookInstanceLifecycleConfigSummary withNotebookInstanceLifecycleConfigName(String notebookInstanceLifecycleConfigName) {
        setNotebookInstanceLifecycleConfigName(notebookInstanceLifecycleConfigName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle configuration.
     * </p>
     * 
     * @param notebookInstanceLifecycleConfigArn
     *        The Amazon Resource Name (ARN) of the lifecycle configuration.
     */

    public void setNotebookInstanceLifecycleConfigArn(String notebookInstanceLifecycleConfigArn) {
        this.notebookInstanceLifecycleConfigArn = notebookInstanceLifecycleConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the lifecycle configuration.
     */

    public String getNotebookInstanceLifecycleConfigArn() {
        return this.notebookInstanceLifecycleConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle configuration.
     * </p>
     * 
     * @param notebookInstanceLifecycleConfigArn
     *        The Amazon Resource Name (ARN) of the lifecycle configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookInstanceLifecycleConfigSummary withNotebookInstanceLifecycleConfigArn(String notebookInstanceLifecycleConfigArn) {
        setNotebookInstanceLifecycleConfigArn(notebookInstanceLifecycleConfigArn);
        return this;
    }

    /**
     * <p>
     * A timestamp that tells when the lifecycle configuration was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that tells when the lifecycle configuration was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that tells when the lifecycle configuration was created.
     * </p>
     * 
     * @return A timestamp that tells when the lifecycle configuration was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that tells when the lifecycle configuration was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that tells when the lifecycle configuration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookInstanceLifecycleConfigSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that tells when the lifecycle configuration was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that tells when the lifecycle configuration was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that tells when the lifecycle configuration was last modified.
     * </p>
     * 
     * @return A timestamp that tells when the lifecycle configuration was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that tells when the lifecycle configuration was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that tells when the lifecycle configuration was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookInstanceLifecycleConfigSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getNotebookInstanceLifecycleConfigName() != null)
            sb.append("NotebookInstanceLifecycleConfigName: ").append(getNotebookInstanceLifecycleConfigName()).append(",");
        if (getNotebookInstanceLifecycleConfigArn() != null)
            sb.append("NotebookInstanceLifecycleConfigArn: ").append(getNotebookInstanceLifecycleConfigArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotebookInstanceLifecycleConfigSummary == false)
            return false;
        NotebookInstanceLifecycleConfigSummary other = (NotebookInstanceLifecycleConfigSummary) obj;
        if (other.getNotebookInstanceLifecycleConfigName() == null ^ this.getNotebookInstanceLifecycleConfigName() == null)
            return false;
        if (other.getNotebookInstanceLifecycleConfigName() != null
                && other.getNotebookInstanceLifecycleConfigName().equals(this.getNotebookInstanceLifecycleConfigName()) == false)
            return false;
        if (other.getNotebookInstanceLifecycleConfigArn() == null ^ this.getNotebookInstanceLifecycleConfigArn() == null)
            return false;
        if (other.getNotebookInstanceLifecycleConfigArn() != null
                && other.getNotebookInstanceLifecycleConfigArn().equals(this.getNotebookInstanceLifecycleConfigArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotebookInstanceLifecycleConfigName() == null) ? 0 : getNotebookInstanceLifecycleConfigName().hashCode());
        hashCode = prime * hashCode + ((getNotebookInstanceLifecycleConfigArn() == null) ? 0 : getNotebookInstanceLifecycleConfigArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public NotebookInstanceLifecycleConfigSummary clone() {
        try {
            return (NotebookInstanceLifecycleConfigSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.NotebookInstanceLifecycleConfigSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
