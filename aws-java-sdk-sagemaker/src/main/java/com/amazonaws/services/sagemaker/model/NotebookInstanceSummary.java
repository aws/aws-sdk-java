/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides summary information for an Amazon SageMaker notebook instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/NotebookInstanceSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotebookInstanceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the notebook instance that you want a summary for.
     * </p>
     */
    private String notebookInstanceName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notebook instance.
     * </p>
     */
    private String notebookInstanceArn;
    /**
     * <p>
     * The status of the notebook instance.
     * </p>
     */
    private String notebookInstanceStatus;
    /**
     * <p>
     * The URL that you use to connect to the Jupyter instance running in your notebook instance.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The type of ML compute instance that the notebook instance is running on.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * A timestamp that shows when the notebook instance was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A timestamp that shows when the notebook instance was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The name of the notebook instance that you want a summary for.
     * </p>
     * 
     * @param notebookInstanceName
     *        The name of the notebook instance that you want a summary for.
     */

    public void setNotebookInstanceName(String notebookInstanceName) {
        this.notebookInstanceName = notebookInstanceName;
    }

    /**
     * <p>
     * The name of the notebook instance that you want a summary for.
     * </p>
     * 
     * @return The name of the notebook instance that you want a summary for.
     */

    public String getNotebookInstanceName() {
        return this.notebookInstanceName;
    }

    /**
     * <p>
     * The name of the notebook instance that you want a summary for.
     * </p>
     * 
     * @param notebookInstanceName
     *        The name of the notebook instance that you want a summary for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookInstanceSummary withNotebookInstanceName(String notebookInstanceName) {
        setNotebookInstanceName(notebookInstanceName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notebook instance.
     * </p>
     * 
     * @param notebookInstanceArn
     *        The Amazon Resource Name (ARN) of the notebook instance.
     */

    public void setNotebookInstanceArn(String notebookInstanceArn) {
        this.notebookInstanceArn = notebookInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notebook instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the notebook instance.
     */

    public String getNotebookInstanceArn() {
        return this.notebookInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notebook instance.
     * </p>
     * 
     * @param notebookInstanceArn
     *        The Amazon Resource Name (ARN) of the notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookInstanceSummary withNotebookInstanceArn(String notebookInstanceArn) {
        setNotebookInstanceArn(notebookInstanceArn);
        return this;
    }

    /**
     * <p>
     * The status of the notebook instance.
     * </p>
     * 
     * @param notebookInstanceStatus
     *        The status of the notebook instance.
     * @see NotebookInstanceStatus
     */

    public void setNotebookInstanceStatus(String notebookInstanceStatus) {
        this.notebookInstanceStatus = notebookInstanceStatus;
    }

    /**
     * <p>
     * The status of the notebook instance.
     * </p>
     * 
     * @return The status of the notebook instance.
     * @see NotebookInstanceStatus
     */

    public String getNotebookInstanceStatus() {
        return this.notebookInstanceStatus;
    }

    /**
     * <p>
     * The status of the notebook instance.
     * </p>
     * 
     * @param notebookInstanceStatus
     *        The status of the notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookInstanceStatus
     */

    public NotebookInstanceSummary withNotebookInstanceStatus(String notebookInstanceStatus) {
        setNotebookInstanceStatus(notebookInstanceStatus);
        return this;
    }

    /**
     * <p>
     * The status of the notebook instance.
     * </p>
     * 
     * @param notebookInstanceStatus
     *        The status of the notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookInstanceStatus
     */

    public NotebookInstanceSummary withNotebookInstanceStatus(NotebookInstanceStatus notebookInstanceStatus) {
        this.notebookInstanceStatus = notebookInstanceStatus.toString();
        return this;
    }

    /**
     * <p>
     * The URL that you use to connect to the Jupyter instance running in your notebook instance.
     * </p>
     * 
     * @param url
     *        The URL that you use to connect to the Jupyter instance running in your notebook instance.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL that you use to connect to the Jupyter instance running in your notebook instance.
     * </p>
     * 
     * @return The URL that you use to connect to the Jupyter instance running in your notebook instance.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL that you use to connect to the Jupyter instance running in your notebook instance.
     * </p>
     * 
     * @param url
     *        The URL that you use to connect to the Jupyter instance running in your notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookInstanceSummary withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The type of ML compute instance that the notebook instance is running on.
     * </p>
     * 
     * @param instanceType
     *        The type of ML compute instance that the notebook instance is running on.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of ML compute instance that the notebook instance is running on.
     * </p>
     * 
     * @return The type of ML compute instance that the notebook instance is running on.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The type of ML compute instance that the notebook instance is running on.
     * </p>
     * 
     * @param instanceType
     *        The type of ML compute instance that the notebook instance is running on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public NotebookInstanceSummary withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The type of ML compute instance that the notebook instance is running on.
     * </p>
     * 
     * @param instanceType
     *        The type of ML compute instance that the notebook instance is running on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public NotebookInstanceSummary withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the notebook instance was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the notebook instance was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the notebook instance was created.
     * </p>
     * 
     * @return A timestamp that shows when the notebook instance was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the notebook instance was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the notebook instance was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookInstanceSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the notebook instance was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that shows when the notebook instance was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that shows when the notebook instance was last modified.
     * </p>
     * 
     * @return A timestamp that shows when the notebook instance was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that shows when the notebook instance was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that shows when the notebook instance was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookInstanceSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNotebookInstanceName() != null)
            sb.append("NotebookInstanceName: ").append(getNotebookInstanceName()).append(",");
        if (getNotebookInstanceArn() != null)
            sb.append("NotebookInstanceArn: ").append(getNotebookInstanceArn()).append(",");
        if (getNotebookInstanceStatus() != null)
            sb.append("NotebookInstanceStatus: ").append(getNotebookInstanceStatus()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
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

        if (obj instanceof NotebookInstanceSummary == false)
            return false;
        NotebookInstanceSummary other = (NotebookInstanceSummary) obj;
        if (other.getNotebookInstanceName() == null ^ this.getNotebookInstanceName() == null)
            return false;
        if (other.getNotebookInstanceName() != null && other.getNotebookInstanceName().equals(this.getNotebookInstanceName()) == false)
            return false;
        if (other.getNotebookInstanceArn() == null ^ this.getNotebookInstanceArn() == null)
            return false;
        if (other.getNotebookInstanceArn() != null && other.getNotebookInstanceArn().equals(this.getNotebookInstanceArn()) == false)
            return false;
        if (other.getNotebookInstanceStatus() == null ^ this.getNotebookInstanceStatus() == null)
            return false;
        if (other.getNotebookInstanceStatus() != null && other.getNotebookInstanceStatus().equals(this.getNotebookInstanceStatus()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
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

        hashCode = prime * hashCode + ((getNotebookInstanceName() == null) ? 0 : getNotebookInstanceName().hashCode());
        hashCode = prime * hashCode + ((getNotebookInstanceArn() == null) ? 0 : getNotebookInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getNotebookInstanceStatus() == null) ? 0 : getNotebookInstanceStatus().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public NotebookInstanceSummary clone() {
        try {
            return (NotebookInstanceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.NotebookInstanceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
