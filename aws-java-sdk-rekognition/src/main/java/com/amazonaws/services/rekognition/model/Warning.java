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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Warning implements Serializable, Cloneable, StructuredPojo {

    private String errorCode;

    private String message;

    private java.util.List<Section> sections;

    /**
     * @param errorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @param errorCode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Warning withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * @param message
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * @param message
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Warning withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Section> getSections() {
        return sections;
    }

    /**
     * @param sections
     */

    public void setSections(java.util.Collection<Section> sections) {
        if (sections == null) {
            this.sections = null;
            return;
        }

        this.sections = new java.util.ArrayList<Section>(sections);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSections(java.util.Collection)} or {@link #withSections(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sections
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Warning withSections(Section... sections) {
        if (this.sections == null) {
            setSections(new java.util.ArrayList<Section>(sections.length));
        }
        for (Section ele : sections) {
            this.sections.add(ele);
        }
        return this;
    }

    /**
     * @param sections
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Warning withSections(java.util.Collection<Section> sections) {
        setSections(sections);
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getSections() != null)
            sb.append("Sections: ").append(getSections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Warning == false)
            return false;
        Warning other = (Warning) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSections() == null ^ this.getSections() == null)
            return false;
        if (other.getSections() != null && other.getSections().equals(this.getSections()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSections() == null) ? 0 : getSections().hashCode());
        return hashCode;
    }

    @Override
    public Warning clone() {
        try {
            return (Warning) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.WarningMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
