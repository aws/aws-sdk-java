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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The system identified one of the following warnings while processing the input document:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The document to classify is plain text, but the classifier is a native document model.
 * </p>
 * </li>
 * <li>
 * <p>
 * The document to classify is semi-structured, but the classifier is a plain-text model.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/WarningsListItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WarningsListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Page number in the input document.
     * </p>
     */
    private Integer page;
    /**
     * <p>
     * The type of warning.
     * </p>
     */
    private String warnCode;
    /**
     * <p>
     * Text message associated with the warning.
     * </p>
     */
    private String warnMessage;

    /**
     * <p>
     * Page number in the input document.
     * </p>
     * 
     * @param page
     *        Page number in the input document.
     */

    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * <p>
     * Page number in the input document.
     * </p>
     * 
     * @return Page number in the input document.
     */

    public Integer getPage() {
        return this.page;
    }

    /**
     * <p>
     * Page number in the input document.
     * </p>
     * 
     * @param page
     *        Page number in the input document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WarningsListItem withPage(Integer page) {
        setPage(page);
        return this;
    }

    /**
     * <p>
     * The type of warning.
     * </p>
     * 
     * @param warnCode
     *        The type of warning.
     * @see PageBasedWarningCode
     */

    public void setWarnCode(String warnCode) {
        this.warnCode = warnCode;
    }

    /**
     * <p>
     * The type of warning.
     * </p>
     * 
     * @return The type of warning.
     * @see PageBasedWarningCode
     */

    public String getWarnCode() {
        return this.warnCode;
    }

    /**
     * <p>
     * The type of warning.
     * </p>
     * 
     * @param warnCode
     *        The type of warning.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PageBasedWarningCode
     */

    public WarningsListItem withWarnCode(String warnCode) {
        setWarnCode(warnCode);
        return this;
    }

    /**
     * <p>
     * The type of warning.
     * </p>
     * 
     * @param warnCode
     *        The type of warning.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PageBasedWarningCode
     */

    public WarningsListItem withWarnCode(PageBasedWarningCode warnCode) {
        this.warnCode = warnCode.toString();
        return this;
    }

    /**
     * <p>
     * Text message associated with the warning.
     * </p>
     * 
     * @param warnMessage
     *        Text message associated with the warning.
     */

    public void setWarnMessage(String warnMessage) {
        this.warnMessage = warnMessage;
    }

    /**
     * <p>
     * Text message associated with the warning.
     * </p>
     * 
     * @return Text message associated with the warning.
     */

    public String getWarnMessage() {
        return this.warnMessage;
    }

    /**
     * <p>
     * Text message associated with the warning.
     * </p>
     * 
     * @param warnMessage
     *        Text message associated with the warning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WarningsListItem withWarnMessage(String warnMessage) {
        setWarnMessage(warnMessage);
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
        if (getPage() != null)
            sb.append("Page: ").append(getPage()).append(",");
        if (getWarnCode() != null)
            sb.append("WarnCode: ").append(getWarnCode()).append(",");
        if (getWarnMessage() != null)
            sb.append("WarnMessage: ").append(getWarnMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WarningsListItem == false)
            return false;
        WarningsListItem other = (WarningsListItem) obj;
        if (other.getPage() == null ^ this.getPage() == null)
            return false;
        if (other.getPage() != null && other.getPage().equals(this.getPage()) == false)
            return false;
        if (other.getWarnCode() == null ^ this.getWarnCode() == null)
            return false;
        if (other.getWarnCode() != null && other.getWarnCode().equals(this.getWarnCode()) == false)
            return false;
        if (other.getWarnMessage() == null ^ this.getWarnMessage() == null)
            return false;
        if (other.getWarnMessage() != null && other.getWarnMessage().equals(this.getWarnMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPage() == null) ? 0 : getPage().hashCode());
        hashCode = prime * hashCode + ((getWarnCode() == null) ? 0 : getWarnCode().hashCode());
        hashCode = prime * hashCode + ((getWarnMessage() == null) ? 0 : getWarnMessage().hashCode());
        return hashCode;
    }

    @Override
    public WarningsListItem clone() {
        try {
            return (WarningsListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.WarningsListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
