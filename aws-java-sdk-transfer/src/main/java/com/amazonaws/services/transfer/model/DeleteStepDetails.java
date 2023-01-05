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
 * The name of the step, used to identify the delete step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteStepDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteStepDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the step, used as an identifier.
     * </p>
     */
    private String name;
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

    public DeleteStepDetails withName(String name) {
        setName(name);
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

    public DeleteStepDetails withSourceFileLocation(String sourceFileLocation) {
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

        if (obj instanceof DeleteStepDetails == false)
            return false;
        DeleteStepDetails other = (DeleteStepDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        hashCode = prime * hashCode + ((getSourceFileLocation() == null) ? 0 : getSourceFileLocation().hashCode());
        return hashCode;
    }

    @Override
    public DeleteStepDetails clone() {
        try {
            return (DeleteStepDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.DeleteStepDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
