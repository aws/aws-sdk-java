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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The basic building block of a workflow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/WorkflowStep" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowStep implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Currently, the following step types are supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>COPY</i>: Copy the file to another location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DELETE</i>: Delete the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TAG</i>: Add a tag to the file.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * Details for a step that performs a file copy.
     * </p>
     * <p>
     * Consists of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A description
     * </p>
     * </li>
     * <li>
     * <p>
     * An S3 location for the destination of the file copy.
     * </p>
     * </li>
     * <li>
     * <p>
     * A flag that indicates whether or not to overwrite an existing file of the same name. The default is
     * <code>FALSE</code>.
     * </p>
     * </li>
     * </ul>
     */
    private CopyStepDetails copyStepDetails;
    /**
     * <p>
     * Details for a step that invokes a lambda function.
     * </p>
     * <p>
     * Consists of the lambda function name, target, and timeout (in seconds).
     * </p>
     */
    private CustomStepDetails customStepDetails;
    /**
     * <p>
     * Details for a step that deletes the file.
     * </p>
     */
    private DeleteStepDetails deleteStepDetails;
    /**
     * <p>
     * Details for a step that creates one or more tags.
     * </p>
     * <p>
     * You specify one or more tags: each tag contains a key/value pair.
     * </p>
     */
    private TagStepDetails tagStepDetails;

    private DecryptStepDetails decryptStepDetails;

    /**
     * <p>
     * Currently, the following step types are supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>COPY</i>: Copy the file to another location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DELETE</i>: Delete the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TAG</i>: Add a tag to the file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Currently, the following step types are supported. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>COPY</i>: Copy the file to another location.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DELETE</i>: Delete the file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>TAG</i>: Add a tag to the file.
     *        </p>
     *        </li>
     * @see WorkflowStepType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Currently, the following step types are supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>COPY</i>: Copy the file to another location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DELETE</i>: Delete the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TAG</i>: Add a tag to the file.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Currently, the following step types are supported. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>COPY</i>: Copy the file to another location.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>DELETE</i>: Delete the file.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>TAG</i>: Add a tag to the file.
     *         </p>
     *         </li>
     * @see WorkflowStepType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Currently, the following step types are supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>COPY</i>: Copy the file to another location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DELETE</i>: Delete the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TAG</i>: Add a tag to the file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Currently, the following step types are supported. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>COPY</i>: Copy the file to another location.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DELETE</i>: Delete the file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>TAG</i>: Add a tag to the file.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowStepType
     */

    public WorkflowStep withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Currently, the following step types are supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>COPY</i>: Copy the file to another location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DELETE</i>: Delete the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TAG</i>: Add a tag to the file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Currently, the following step types are supported. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>COPY</i>: Copy the file to another location.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DELETE</i>: Delete the file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>TAG</i>: Add a tag to the file.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowStepType
     */

    public WorkflowStep withType(WorkflowStepType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Details for a step that performs a file copy.
     * </p>
     * <p>
     * Consists of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A description
     * </p>
     * </li>
     * <li>
     * <p>
     * An S3 location for the destination of the file copy.
     * </p>
     * </li>
     * <li>
     * <p>
     * A flag that indicates whether or not to overwrite an existing file of the same name. The default is
     * <code>FALSE</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param copyStepDetails
     *        Details for a step that performs a file copy.</p>
     *        <p>
     *        Consists of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A description
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An S3 location for the destination of the file copy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A flag that indicates whether or not to overwrite an existing file of the same name. The default is
     *        <code>FALSE</code>.
     *        </p>
     *        </li>
     */

    public void setCopyStepDetails(CopyStepDetails copyStepDetails) {
        this.copyStepDetails = copyStepDetails;
    }

    /**
     * <p>
     * Details for a step that performs a file copy.
     * </p>
     * <p>
     * Consists of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A description
     * </p>
     * </li>
     * <li>
     * <p>
     * An S3 location for the destination of the file copy.
     * </p>
     * </li>
     * <li>
     * <p>
     * A flag that indicates whether or not to overwrite an existing file of the same name. The default is
     * <code>FALSE</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Details for a step that performs a file copy.</p>
     *         <p>
     *         Consists of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A description
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An S3 location for the destination of the file copy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A flag that indicates whether or not to overwrite an existing file of the same name. The default is
     *         <code>FALSE</code>.
     *         </p>
     *         </li>
     */

    public CopyStepDetails getCopyStepDetails() {
        return this.copyStepDetails;
    }

    /**
     * <p>
     * Details for a step that performs a file copy.
     * </p>
     * <p>
     * Consists of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A description
     * </p>
     * </li>
     * <li>
     * <p>
     * An S3 location for the destination of the file copy.
     * </p>
     * </li>
     * <li>
     * <p>
     * A flag that indicates whether or not to overwrite an existing file of the same name. The default is
     * <code>FALSE</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param copyStepDetails
     *        Details for a step that performs a file copy.</p>
     *        <p>
     *        Consists of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A description
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An S3 location for the destination of the file copy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A flag that indicates whether or not to overwrite an existing file of the same name. The default is
     *        <code>FALSE</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStep withCopyStepDetails(CopyStepDetails copyStepDetails) {
        setCopyStepDetails(copyStepDetails);
        return this;
    }

    /**
     * <p>
     * Details for a step that invokes a lambda function.
     * </p>
     * <p>
     * Consists of the lambda function name, target, and timeout (in seconds).
     * </p>
     * 
     * @param customStepDetails
     *        Details for a step that invokes a lambda function.</p>
     *        <p>
     *        Consists of the lambda function name, target, and timeout (in seconds).
     */

    public void setCustomStepDetails(CustomStepDetails customStepDetails) {
        this.customStepDetails = customStepDetails;
    }

    /**
     * <p>
     * Details for a step that invokes a lambda function.
     * </p>
     * <p>
     * Consists of the lambda function name, target, and timeout (in seconds).
     * </p>
     * 
     * @return Details for a step that invokes a lambda function.</p>
     *         <p>
     *         Consists of the lambda function name, target, and timeout (in seconds).
     */

    public CustomStepDetails getCustomStepDetails() {
        return this.customStepDetails;
    }

    /**
     * <p>
     * Details for a step that invokes a lambda function.
     * </p>
     * <p>
     * Consists of the lambda function name, target, and timeout (in seconds).
     * </p>
     * 
     * @param customStepDetails
     *        Details for a step that invokes a lambda function.</p>
     *        <p>
     *        Consists of the lambda function name, target, and timeout (in seconds).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStep withCustomStepDetails(CustomStepDetails customStepDetails) {
        setCustomStepDetails(customStepDetails);
        return this;
    }

    /**
     * <p>
     * Details for a step that deletes the file.
     * </p>
     * 
     * @param deleteStepDetails
     *        Details for a step that deletes the file.
     */

    public void setDeleteStepDetails(DeleteStepDetails deleteStepDetails) {
        this.deleteStepDetails = deleteStepDetails;
    }

    /**
     * <p>
     * Details for a step that deletes the file.
     * </p>
     * 
     * @return Details for a step that deletes the file.
     */

    public DeleteStepDetails getDeleteStepDetails() {
        return this.deleteStepDetails;
    }

    /**
     * <p>
     * Details for a step that deletes the file.
     * </p>
     * 
     * @param deleteStepDetails
     *        Details for a step that deletes the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStep withDeleteStepDetails(DeleteStepDetails deleteStepDetails) {
        setDeleteStepDetails(deleteStepDetails);
        return this;
    }

    /**
     * <p>
     * Details for a step that creates one or more tags.
     * </p>
     * <p>
     * You specify one or more tags: each tag contains a key/value pair.
     * </p>
     * 
     * @param tagStepDetails
     *        Details for a step that creates one or more tags.</p>
     *        <p>
     *        You specify one or more tags: each tag contains a key/value pair.
     */

    public void setTagStepDetails(TagStepDetails tagStepDetails) {
        this.tagStepDetails = tagStepDetails;
    }

    /**
     * <p>
     * Details for a step that creates one or more tags.
     * </p>
     * <p>
     * You specify one or more tags: each tag contains a key/value pair.
     * </p>
     * 
     * @return Details for a step that creates one or more tags.</p>
     *         <p>
     *         You specify one or more tags: each tag contains a key/value pair.
     */

    public TagStepDetails getTagStepDetails() {
        return this.tagStepDetails;
    }

    /**
     * <p>
     * Details for a step that creates one or more tags.
     * </p>
     * <p>
     * You specify one or more tags: each tag contains a key/value pair.
     * </p>
     * 
     * @param tagStepDetails
     *        Details for a step that creates one or more tags.</p>
     *        <p>
     *        You specify one or more tags: each tag contains a key/value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStep withTagStepDetails(TagStepDetails tagStepDetails) {
        setTagStepDetails(tagStepDetails);
        return this;
    }

    /**
     * @param decryptStepDetails
     */

    public void setDecryptStepDetails(DecryptStepDetails decryptStepDetails) {
        this.decryptStepDetails = decryptStepDetails;
    }

    /**
     * @return
     */

    public DecryptStepDetails getDecryptStepDetails() {
        return this.decryptStepDetails;
    }

    /**
     * @param decryptStepDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStep withDecryptStepDetails(DecryptStepDetails decryptStepDetails) {
        setDecryptStepDetails(decryptStepDetails);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getCopyStepDetails() != null)
            sb.append("CopyStepDetails: ").append(getCopyStepDetails()).append(",");
        if (getCustomStepDetails() != null)
            sb.append("CustomStepDetails: ").append(getCustomStepDetails()).append(",");
        if (getDeleteStepDetails() != null)
            sb.append("DeleteStepDetails: ").append(getDeleteStepDetails()).append(",");
        if (getTagStepDetails() != null)
            sb.append("TagStepDetails: ").append(getTagStepDetails()).append(",");
        if (getDecryptStepDetails() != null)
            sb.append("DecryptStepDetails: ").append(getDecryptStepDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowStep == false)
            return false;
        WorkflowStep other = (WorkflowStep) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCopyStepDetails() == null ^ this.getCopyStepDetails() == null)
            return false;
        if (other.getCopyStepDetails() != null && other.getCopyStepDetails().equals(this.getCopyStepDetails()) == false)
            return false;
        if (other.getCustomStepDetails() == null ^ this.getCustomStepDetails() == null)
            return false;
        if (other.getCustomStepDetails() != null && other.getCustomStepDetails().equals(this.getCustomStepDetails()) == false)
            return false;
        if (other.getDeleteStepDetails() == null ^ this.getDeleteStepDetails() == null)
            return false;
        if (other.getDeleteStepDetails() != null && other.getDeleteStepDetails().equals(this.getDeleteStepDetails()) == false)
            return false;
        if (other.getTagStepDetails() == null ^ this.getTagStepDetails() == null)
            return false;
        if (other.getTagStepDetails() != null && other.getTagStepDetails().equals(this.getTagStepDetails()) == false)
            return false;
        if (other.getDecryptStepDetails() == null ^ this.getDecryptStepDetails() == null)
            return false;
        if (other.getDecryptStepDetails() != null && other.getDecryptStepDetails().equals(this.getDecryptStepDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCopyStepDetails() == null) ? 0 : getCopyStepDetails().hashCode());
        hashCode = prime * hashCode + ((getCustomStepDetails() == null) ? 0 : getCustomStepDetails().hashCode());
        hashCode = prime * hashCode + ((getDeleteStepDetails() == null) ? 0 : getDeleteStepDetails().hashCode());
        hashCode = prime * hashCode + ((getTagStepDetails() == null) ? 0 : getTagStepDetails().hashCode());
        hashCode = prime * hashCode + ((getDecryptStepDetails() == null) ? 0 : getDecryptStepDetails().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowStep clone() {
        try {
            return (WorkflowStep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.WorkflowStepMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
