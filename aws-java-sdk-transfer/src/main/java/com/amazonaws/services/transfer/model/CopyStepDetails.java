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
 * Each step type has its own <code>StepDetails</code> structure.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CopyStepDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyStepDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the step, used as an identifier.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the location for the file being copied. Only applicable for Copy type workflow steps. Use
     * <code>${Transfer:username}</code> in this field to parametrize the destination prefix by username.
     * </p>
     */
    private InputFileLocation destinationFileLocation;
    /**
     * <p>
     * A flag that indicates whether or not to overwrite an existing file of the same name. The default is
     * <code>FALSE</code>.
     * </p>
     */
    private String overwriteExisting;
    /**
     * <p>
     * Specifies which file to use as input to the workflow step: either the output from the previous step, or the
     * originally uploaded file for the workflow.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enter <code>${previous.file}</code> to use the previous file as the input. In this case, this workflow step uses
     * the output file from the previous workflow step as input. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Enter <code>${original.file}</code> to use the originally-uploaded file location as input for this step.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceFileLocation;

    /**
     * <p>
     * The name of the step, used as an identifier.
     * </p>
     * 
     * @param name
     *        The name of the step, used as an identifier.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the step, used as an identifier.
     * </p>
     * 
     * @return The name of the step, used as an identifier.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the step, used as an identifier.
     * </p>
     * 
     * @param name
     *        The name of the step, used as an identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyStepDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the location for the file being copied. Only applicable for Copy type workflow steps. Use
     * <code>${Transfer:username}</code> in this field to parametrize the destination prefix by username.
     * </p>
     * 
     * @param destinationFileLocation
     *        Specifies the location for the file being copied. Only applicable for Copy type workflow steps. Use
     *        <code>${Transfer:username}</code> in this field to parametrize the destination prefix by username.
     */

    public void setDestinationFileLocation(InputFileLocation destinationFileLocation) {
        this.destinationFileLocation = destinationFileLocation;
    }

    /**
     * <p>
     * Specifies the location for the file being copied. Only applicable for Copy type workflow steps. Use
     * <code>${Transfer:username}</code> in this field to parametrize the destination prefix by username.
     * </p>
     * 
     * @return Specifies the location for the file being copied. Only applicable for Copy type workflow steps. Use
     *         <code>${Transfer:username}</code> in this field to parametrize the destination prefix by username.
     */

    public InputFileLocation getDestinationFileLocation() {
        return this.destinationFileLocation;
    }

    /**
     * <p>
     * Specifies the location for the file being copied. Only applicable for Copy type workflow steps. Use
     * <code>${Transfer:username}</code> in this field to parametrize the destination prefix by username.
     * </p>
     * 
     * @param destinationFileLocation
     *        Specifies the location for the file being copied. Only applicable for Copy type workflow steps. Use
     *        <code>${Transfer:username}</code> in this field to parametrize the destination prefix by username.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyStepDetails withDestinationFileLocation(InputFileLocation destinationFileLocation) {
        setDestinationFileLocation(destinationFileLocation);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether or not to overwrite an existing file of the same name. The default is
     * <code>FALSE</code>.
     * </p>
     * 
     * @param overwriteExisting
     *        A flag that indicates whether or not to overwrite an existing file of the same name. The default is
     *        <code>FALSE</code>.
     * @see OverwriteExisting
     */

    public void setOverwriteExisting(String overwriteExisting) {
        this.overwriteExisting = overwriteExisting;
    }

    /**
     * <p>
     * A flag that indicates whether or not to overwrite an existing file of the same name. The default is
     * <code>FALSE</code>.
     * </p>
     * 
     * @return A flag that indicates whether or not to overwrite an existing file of the same name. The default is
     *         <code>FALSE</code>.
     * @see OverwriteExisting
     */

    public String getOverwriteExisting() {
        return this.overwriteExisting;
    }

    /**
     * <p>
     * A flag that indicates whether or not to overwrite an existing file of the same name. The default is
     * <code>FALSE</code>.
     * </p>
     * 
     * @param overwriteExisting
     *        A flag that indicates whether or not to overwrite an existing file of the same name. The default is
     *        <code>FALSE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OverwriteExisting
     */

    public CopyStepDetails withOverwriteExisting(String overwriteExisting) {
        setOverwriteExisting(overwriteExisting);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether or not to overwrite an existing file of the same name. The default is
     * <code>FALSE</code>.
     * </p>
     * 
     * @param overwriteExisting
     *        A flag that indicates whether or not to overwrite an existing file of the same name. The default is
     *        <code>FALSE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OverwriteExisting
     */

    public CopyStepDetails withOverwriteExisting(OverwriteExisting overwriteExisting) {
        this.overwriteExisting = overwriteExisting.toString();
        return this;
    }

    /**
     * <p>
     * Specifies which file to use as input to the workflow step: either the output from the previous step, or the
     * originally uploaded file for the workflow.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enter <code>${previous.file}</code> to use the previous file as the input. In this case, this workflow step uses
     * the output file from the previous workflow step as input. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Enter <code>${original.file}</code> to use the originally-uploaded file location as input for this step.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceFileLocation
     *        Specifies which file to use as input to the workflow step: either the output from the previous step, or
     *        the originally uploaded file for the workflow.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Enter <code>${previous.file}</code> to use the previous file as the input. In this case, this workflow
     *        step uses the output file from the previous workflow step as input. This is the default value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Enter <code>${original.file}</code> to use the originally-uploaded file location as input for this step.
     *        </p>
     *        </li>
     */

    public void setSourceFileLocation(String sourceFileLocation) {
        this.sourceFileLocation = sourceFileLocation;
    }

    /**
     * <p>
     * Specifies which file to use as input to the workflow step: either the output from the previous step, or the
     * originally uploaded file for the workflow.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enter <code>${previous.file}</code> to use the previous file as the input. In this case, this workflow step uses
     * the output file from the previous workflow step as input. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Enter <code>${original.file}</code> to use the originally-uploaded file location as input for this step.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies which file to use as input to the workflow step: either the output from the previous step, or
     *         the originally uploaded file for the workflow.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Enter <code>${previous.file}</code> to use the previous file as the input. In this case, this workflow
     *         step uses the output file from the previous workflow step as input. This is the default value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Enter <code>${original.file}</code> to use the originally-uploaded file location as input for this step.
     *         </p>
     *         </li>
     */

    public String getSourceFileLocation() {
        return this.sourceFileLocation;
    }

    /**
     * <p>
     * Specifies which file to use as input to the workflow step: either the output from the previous step, or the
     * originally uploaded file for the workflow.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enter <code>${previous.file}</code> to use the previous file as the input. In this case, this workflow step uses
     * the output file from the previous workflow step as input. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Enter <code>${original.file}</code> to use the originally-uploaded file location as input for this step.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceFileLocation
     *        Specifies which file to use as input to the workflow step: either the output from the previous step, or
     *        the originally uploaded file for the workflow.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Enter <code>${previous.file}</code> to use the previous file as the input. In this case, this workflow
     *        step uses the output file from the previous workflow step as input. This is the default value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Enter <code>${original.file}</code> to use the originally-uploaded file location as input for this step.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyStepDetails withSourceFileLocation(String sourceFileLocation) {
        setSourceFileLocation(sourceFileLocation);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDestinationFileLocation() != null)
            sb.append("DestinationFileLocation: ").append(getDestinationFileLocation()).append(",");
        if (getOverwriteExisting() != null)
            sb.append("OverwriteExisting: ").append(getOverwriteExisting()).append(",");
        if (getSourceFileLocation() != null)
            sb.append("SourceFileLocation: ").append(getSourceFileLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyStepDetails == false)
            return false;
        CopyStepDetails other = (CopyStepDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDestinationFileLocation() == null ^ this.getDestinationFileLocation() == null)
            return false;
        if (other.getDestinationFileLocation() != null && other.getDestinationFileLocation().equals(this.getDestinationFileLocation()) == false)
            return false;
        if (other.getOverwriteExisting() == null ^ this.getOverwriteExisting() == null)
            return false;
        if (other.getOverwriteExisting() != null && other.getOverwriteExisting().equals(this.getOverwriteExisting()) == false)
            return false;
        if (other.getSourceFileLocation() == null ^ this.getSourceFileLocation() == null)
            return false;
        if (other.getSourceFileLocation() != null && other.getSourceFileLocation().equals(this.getSourceFileLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDestinationFileLocation() == null) ? 0 : getDestinationFileLocation().hashCode());
        hashCode = prime * hashCode + ((getOverwriteExisting() == null) ? 0 : getOverwriteExisting().hashCode());
        hashCode = prime * hashCode + ((getSourceFileLocation() == null) ? 0 : getSourceFileLocation().hashCode());
        return hashCode;
    }

    @Override
    public CopyStepDetails clone() {
        try {
            return (CopyStepDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.CopyStepDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
