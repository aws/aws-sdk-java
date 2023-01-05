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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A control to display a text box that is used to enter a single entry.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ParameterTextFieldControl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterTextFieldControl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the <code>ParameterTextFieldControl</code>.
     * </p>
     */
    private String parameterControlId;
    /**
     * <p>
     * The title of the <code>ParameterTextFieldControl</code>.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The source parameter name of the <code>ParameterTextFieldControl</code>.
     * </p>
     */
    private String sourceParameterName;
    /**
     * <p>
     * The display options of a control.
     * </p>
     */
    private TextFieldControlDisplayOptions displayOptions;

    /**
     * <p>
     * The ID of the <code>ParameterTextFieldControl</code>.
     * </p>
     * 
     * @param parameterControlId
     *        The ID of the <code>ParameterTextFieldControl</code>.
     */

    public void setParameterControlId(String parameterControlId) {
        this.parameterControlId = parameterControlId;
    }

    /**
     * <p>
     * The ID of the <code>ParameterTextFieldControl</code>.
     * </p>
     * 
     * @return The ID of the <code>ParameterTextFieldControl</code>.
     */

    public String getParameterControlId() {
        return this.parameterControlId;
    }

    /**
     * <p>
     * The ID of the <code>ParameterTextFieldControl</code>.
     * </p>
     * 
     * @param parameterControlId
     *        The ID of the <code>ParameterTextFieldControl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterTextFieldControl withParameterControlId(String parameterControlId) {
        setParameterControlId(parameterControlId);
        return this;
    }

    /**
     * <p>
     * The title of the <code>ParameterTextFieldControl</code>.
     * </p>
     * 
     * @param title
     *        The title of the <code>ParameterTextFieldControl</code>.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the <code>ParameterTextFieldControl</code>.
     * </p>
     * 
     * @return The title of the <code>ParameterTextFieldControl</code>.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the <code>ParameterTextFieldControl</code>.
     * </p>
     * 
     * @param title
     *        The title of the <code>ParameterTextFieldControl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterTextFieldControl withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The source parameter name of the <code>ParameterTextFieldControl</code>.
     * </p>
     * 
     * @param sourceParameterName
     *        The source parameter name of the <code>ParameterTextFieldControl</code>.
     */

    public void setSourceParameterName(String sourceParameterName) {
        this.sourceParameterName = sourceParameterName;
    }

    /**
     * <p>
     * The source parameter name of the <code>ParameterTextFieldControl</code>.
     * </p>
     * 
     * @return The source parameter name of the <code>ParameterTextFieldControl</code>.
     */

    public String getSourceParameterName() {
        return this.sourceParameterName;
    }

    /**
     * <p>
     * The source parameter name of the <code>ParameterTextFieldControl</code>.
     * </p>
     * 
     * @param sourceParameterName
     *        The source parameter name of the <code>ParameterTextFieldControl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterTextFieldControl withSourceParameterName(String sourceParameterName) {
        setSourceParameterName(sourceParameterName);
        return this;
    }

    /**
     * <p>
     * The display options of a control.
     * </p>
     * 
     * @param displayOptions
     *        The display options of a control.
     */

    public void setDisplayOptions(TextFieldControlDisplayOptions displayOptions) {
        this.displayOptions = displayOptions;
    }

    /**
     * <p>
     * The display options of a control.
     * </p>
     * 
     * @return The display options of a control.
     */

    public TextFieldControlDisplayOptions getDisplayOptions() {
        return this.displayOptions;
    }

    /**
     * <p>
     * The display options of a control.
     * </p>
     * 
     * @param displayOptions
     *        The display options of a control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterTextFieldControl withDisplayOptions(TextFieldControlDisplayOptions displayOptions) {
        setDisplayOptions(displayOptions);
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
        if (getParameterControlId() != null)
            sb.append("ParameterControlId: ").append(getParameterControlId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getSourceParameterName() != null)
            sb.append("SourceParameterName: ").append(getSourceParameterName()).append(",");
        if (getDisplayOptions() != null)
            sb.append("DisplayOptions: ").append(getDisplayOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterTextFieldControl == false)
            return false;
        ParameterTextFieldControl other = (ParameterTextFieldControl) obj;
        if (other.getParameterControlId() == null ^ this.getParameterControlId() == null)
            return false;
        if (other.getParameterControlId() != null && other.getParameterControlId().equals(this.getParameterControlId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getSourceParameterName() == null ^ this.getSourceParameterName() == null)
            return false;
        if (other.getSourceParameterName() != null && other.getSourceParameterName().equals(this.getSourceParameterName()) == false)
            return false;
        if (other.getDisplayOptions() == null ^ this.getDisplayOptions() == null)
            return false;
        if (other.getDisplayOptions() != null && other.getDisplayOptions().equals(this.getDisplayOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterControlId() == null) ? 0 : getParameterControlId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getSourceParameterName() == null) ? 0 : getSourceParameterName().hashCode());
        hashCode = prime * hashCode + ((getDisplayOptions() == null) ? 0 : getDisplayOptions().hashCode());
        return hashCode;
    }

    @Override
    public ParameterTextFieldControl clone() {
        try {
            return (ParameterTextFieldControl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ParameterTextFieldControlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
