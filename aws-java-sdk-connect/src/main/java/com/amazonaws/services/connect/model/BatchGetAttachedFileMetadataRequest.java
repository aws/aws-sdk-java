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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/BatchGetAttachedFileMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetAttachedFileMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifiers of the attached file resource.
     * </p>
     */
    private java.util.List<String> fileIds;
    /**
     * <p>
     * The unique identifier of the Connect instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a> are
     * the only current supported resource.
     * </p>
     * <note>
     * <p>
     * This value must be a valid ARN.
     * </p>
     * </note>
     */
    private String associatedResourceArn;

    /**
     * <p>
     * The unique identifiers of the attached file resource.
     * </p>
     * 
     * @return The unique identifiers of the attached file resource.
     */

    public java.util.List<String> getFileIds() {
        return fileIds;
    }

    /**
     * <p>
     * The unique identifiers of the attached file resource.
     * </p>
     * 
     * @param fileIds
     *        The unique identifiers of the attached file resource.
     */

    public void setFileIds(java.util.Collection<String> fileIds) {
        if (fileIds == null) {
            this.fileIds = null;
            return;
        }

        this.fileIds = new java.util.ArrayList<String>(fileIds);
    }

    /**
     * <p>
     * The unique identifiers of the attached file resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFileIds(java.util.Collection)} or {@link #withFileIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param fileIds
     *        The unique identifiers of the attached file resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAttachedFileMetadataRequest withFileIds(String... fileIds) {
        if (this.fileIds == null) {
            setFileIds(new java.util.ArrayList<String>(fileIds.length));
        }
        for (String ele : fileIds) {
            this.fileIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifiers of the attached file resource.
     * </p>
     * 
     * @param fileIds
     *        The unique identifiers of the attached file resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAttachedFileMetadataRequest withFileIds(java.util.Collection<String> fileIds) {
        setFileIds(fileIds);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The unique identifier of the Connect instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The unique identifier of the Connect instance.
     * </p>
     * 
     * @return The unique identifier of the Connect instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The unique identifier of the Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The unique identifier of the Connect instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAttachedFileMetadataRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a> are
     * the only current supported resource.
     * </p>
     * <note>
     * <p>
     * This value must be a valid ARN.
     * </p>
     * </note>
     * 
     * @param associatedResourceArn
     *        The resource to which the attached file is (being) uploaded to. <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a>
     *        are the only current supported resource.</p> <note>
     *        <p>
     *        This value must be a valid ARN.
     *        </p>
     */

    public void setAssociatedResourceArn(String associatedResourceArn) {
        this.associatedResourceArn = associatedResourceArn;
    }

    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a> are
     * the only current supported resource.
     * </p>
     * <note>
     * <p>
     * This value must be a valid ARN.
     * </p>
     * </note>
     * 
     * @return The resource to which the attached file is (being) uploaded to. <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     *         >Cases</a> are the only current supported resource.</p> <note>
     *         <p>
     *         This value must be a valid ARN.
     *         </p>
     */

    public String getAssociatedResourceArn() {
        return this.associatedResourceArn;
    }

    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a> are
     * the only current supported resource.
     * </p>
     * <note>
     * <p>
     * This value must be a valid ARN.
     * </p>
     * </note>
     * 
     * @param associatedResourceArn
     *        The resource to which the attached file is (being) uploaded to. <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a>
     *        are the only current supported resource.</p> <note>
     *        <p>
     *        This value must be a valid ARN.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAttachedFileMetadataRequest withAssociatedResourceArn(String associatedResourceArn) {
        setAssociatedResourceArn(associatedResourceArn);
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
        if (getFileIds() != null)
            sb.append("FileIds: ").append(getFileIds()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getAssociatedResourceArn() != null)
            sb.append("AssociatedResourceArn: ").append(getAssociatedResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetAttachedFileMetadataRequest == false)
            return false;
        BatchGetAttachedFileMetadataRequest other = (BatchGetAttachedFileMetadataRequest) obj;
        if (other.getFileIds() == null ^ this.getFileIds() == null)
            return false;
        if (other.getFileIds() != null && other.getFileIds().equals(this.getFileIds()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getAssociatedResourceArn() == null ^ this.getAssociatedResourceArn() == null)
            return false;
        if (other.getAssociatedResourceArn() != null && other.getAssociatedResourceArn().equals(this.getAssociatedResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileIds() == null) ? 0 : getFileIds().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getAssociatedResourceArn() == null) ? 0 : getAssociatedResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetAttachedFileMetadataRequest clone() {
        return (BatchGetAttachedFileMetadataRequest) super.clone();
    }

}
