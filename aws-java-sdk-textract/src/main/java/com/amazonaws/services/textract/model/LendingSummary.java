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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information regarding DocumentGroups and UndetectedDocumentTypes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/LendingSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LendingSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains an array of all DocumentGroup objects.
     * </p>
     */
    private java.util.List<DocumentGroup> documentGroups;
    /**
     * <p>
     * UndetectedDocumentTypes.
     * </p>
     */
    private java.util.List<String> undetectedDocumentTypes;

    /**
     * <p>
     * Contains an array of all DocumentGroup objects.
     * </p>
     * 
     * @return Contains an array of all DocumentGroup objects.
     */

    public java.util.List<DocumentGroup> getDocumentGroups() {
        return documentGroups;
    }

    /**
     * <p>
     * Contains an array of all DocumentGroup objects.
     * </p>
     * 
     * @param documentGroups
     *        Contains an array of all DocumentGroup objects.
     */

    public void setDocumentGroups(java.util.Collection<DocumentGroup> documentGroups) {
        if (documentGroups == null) {
            this.documentGroups = null;
            return;
        }

        this.documentGroups = new java.util.ArrayList<DocumentGroup>(documentGroups);
    }

    /**
     * <p>
     * Contains an array of all DocumentGroup objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentGroups(java.util.Collection)} or {@link #withDocumentGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param documentGroups
     *        Contains an array of all DocumentGroup objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LendingSummary withDocumentGroups(DocumentGroup... documentGroups) {
        if (this.documentGroups == null) {
            setDocumentGroups(new java.util.ArrayList<DocumentGroup>(documentGroups.length));
        }
        for (DocumentGroup ele : documentGroups) {
            this.documentGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains an array of all DocumentGroup objects.
     * </p>
     * 
     * @param documentGroups
     *        Contains an array of all DocumentGroup objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LendingSummary withDocumentGroups(java.util.Collection<DocumentGroup> documentGroups) {
        setDocumentGroups(documentGroups);
        return this;
    }

    /**
     * <p>
     * UndetectedDocumentTypes.
     * </p>
     * 
     * @return UndetectedDocumentTypes.
     */

    public java.util.List<String> getUndetectedDocumentTypes() {
        return undetectedDocumentTypes;
    }

    /**
     * <p>
     * UndetectedDocumentTypes.
     * </p>
     * 
     * @param undetectedDocumentTypes
     *        UndetectedDocumentTypes.
     */

    public void setUndetectedDocumentTypes(java.util.Collection<String> undetectedDocumentTypes) {
        if (undetectedDocumentTypes == null) {
            this.undetectedDocumentTypes = null;
            return;
        }

        this.undetectedDocumentTypes = new java.util.ArrayList<String>(undetectedDocumentTypes);
    }

    /**
     * <p>
     * UndetectedDocumentTypes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUndetectedDocumentTypes(java.util.Collection)} or
     * {@link #withUndetectedDocumentTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param undetectedDocumentTypes
     *        UndetectedDocumentTypes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LendingSummary withUndetectedDocumentTypes(String... undetectedDocumentTypes) {
        if (this.undetectedDocumentTypes == null) {
            setUndetectedDocumentTypes(new java.util.ArrayList<String>(undetectedDocumentTypes.length));
        }
        for (String ele : undetectedDocumentTypes) {
            this.undetectedDocumentTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * UndetectedDocumentTypes.
     * </p>
     * 
     * @param undetectedDocumentTypes
     *        UndetectedDocumentTypes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LendingSummary withUndetectedDocumentTypes(java.util.Collection<String> undetectedDocumentTypes) {
        setUndetectedDocumentTypes(undetectedDocumentTypes);
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
        if (getDocumentGroups() != null)
            sb.append("DocumentGroups: ").append(getDocumentGroups()).append(",");
        if (getUndetectedDocumentTypes() != null)
            sb.append("UndetectedDocumentTypes: ").append(getUndetectedDocumentTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LendingSummary == false)
            return false;
        LendingSummary other = (LendingSummary) obj;
        if (other.getDocumentGroups() == null ^ this.getDocumentGroups() == null)
            return false;
        if (other.getDocumentGroups() != null && other.getDocumentGroups().equals(this.getDocumentGroups()) == false)
            return false;
        if (other.getUndetectedDocumentTypes() == null ^ this.getUndetectedDocumentTypes() == null)
            return false;
        if (other.getUndetectedDocumentTypes() != null && other.getUndetectedDocumentTypes().equals(this.getUndetectedDocumentTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentGroups() == null) ? 0 : getDocumentGroups().hashCode());
        hashCode = prime * hashCode + ((getUndetectedDocumentTypes() == null) ? 0 : getUndetectedDocumentTypes().hashCode());
        return hashCode;
    }

    @Override
    public LendingSummary clone() {
        try {
            return (LendingSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.LendingSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
