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
 * A text box.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SheetTextBox" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SheetTextBox implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for a text box. This identifier must be unique within the context of a dashboard, template,
     * or analysis. Two dashboards, analyses, or templates can have text boxes that share identifiers.
     * </p>
     */
    private String sheetTextBoxId;
    /**
     * <p>
     * The content that is displayed in the text box.
     * </p>
     */
    private String content;

    /**
     * <p>
     * The unique identifier for a text box. This identifier must be unique within the context of a dashboard, template,
     * or analysis. Two dashboards, analyses, or templates can have text boxes that share identifiers.
     * </p>
     * 
     * @param sheetTextBoxId
     *        The unique identifier for a text box. This identifier must be unique within the context of a dashboard,
     *        template, or analysis. Two dashboards, analyses, or templates can have text boxes that share identifiers.
     */

    public void setSheetTextBoxId(String sheetTextBoxId) {
        this.sheetTextBoxId = sheetTextBoxId;
    }

    /**
     * <p>
     * The unique identifier for a text box. This identifier must be unique within the context of a dashboard, template,
     * or analysis. Two dashboards, analyses, or templates can have text boxes that share identifiers.
     * </p>
     * 
     * @return The unique identifier for a text box. This identifier must be unique within the context of a dashboard,
     *         template, or analysis. Two dashboards, analyses, or templates can have text boxes that share identifiers.
     */

    public String getSheetTextBoxId() {
        return this.sheetTextBoxId;
    }

    /**
     * <p>
     * The unique identifier for a text box. This identifier must be unique within the context of a dashboard, template,
     * or analysis. Two dashboards, analyses, or templates can have text boxes that share identifiers.
     * </p>
     * 
     * @param sheetTextBoxId
     *        The unique identifier for a text box. This identifier must be unique within the context of a dashboard,
     *        template, or analysis. Two dashboards, analyses, or templates can have text boxes that share identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetTextBox withSheetTextBoxId(String sheetTextBoxId) {
        setSheetTextBoxId(sheetTextBoxId);
        return this;
    }

    /**
     * <p>
     * The content that is displayed in the text box.
     * </p>
     * 
     * @param content
     *        The content that is displayed in the text box.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content that is displayed in the text box.
     * </p>
     * 
     * @return The content that is displayed in the text box.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content that is displayed in the text box.
     * </p>
     * 
     * @param content
     *        The content that is displayed in the text box.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetTextBox withContent(String content) {
        setContent(content);
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
        if (getSheetTextBoxId() != null)
            sb.append("SheetTextBoxId: ").append(getSheetTextBoxId()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SheetTextBox == false)
            return false;
        SheetTextBox other = (SheetTextBox) obj;
        if (other.getSheetTextBoxId() == null ^ this.getSheetTextBoxId() == null)
            return false;
        if (other.getSheetTextBoxId() != null && other.getSheetTextBoxId().equals(this.getSheetTextBoxId()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSheetTextBoxId() == null) ? 0 : getSheetTextBoxId().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public SheetTextBox clone() {
        try {
            return (SheetTextBox) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SheetTextBoxMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
