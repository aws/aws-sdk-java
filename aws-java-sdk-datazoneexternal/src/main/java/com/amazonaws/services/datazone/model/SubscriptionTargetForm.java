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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the subscription target configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SubscriptionTargetForm" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubscriptionTargetForm implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The content of the subscription target configuration.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The form name included in the subscription target configuration.
     * </p>
     */
    private String formName;

    /**
     * <p>
     * The content of the subscription target configuration.
     * </p>
     * 
     * @param content
     *        The content of the subscription target configuration.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the subscription target configuration.
     * </p>
     * 
     * @return The content of the subscription target configuration.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the subscription target configuration.
     * </p>
     * 
     * @param content
     *        The content of the subscription target configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriptionTargetForm withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The form name included in the subscription target configuration.
     * </p>
     * 
     * @param formName
     *        The form name included in the subscription target configuration.
     */

    public void setFormName(String formName) {
        this.formName = formName;
    }

    /**
     * <p>
     * The form name included in the subscription target configuration.
     * </p>
     * 
     * @return The form name included in the subscription target configuration.
     */

    public String getFormName() {
        return this.formName;
    }

    /**
     * <p>
     * The form name included in the subscription target configuration.
     * </p>
     * 
     * @param formName
     *        The form name included in the subscription target configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriptionTargetForm withFormName(String formName) {
        setFormName(formName);
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getFormName() != null)
            sb.append("FormName: ").append(getFormName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubscriptionTargetForm == false)
            return false;
        SubscriptionTargetForm other = (SubscriptionTargetForm) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getFormName() == null ^ this.getFormName() == null)
            return false;
        if (other.getFormName() != null && other.getFormName().equals(this.getFormName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getFormName() == null) ? 0 : getFormName().hashCode());
        return hashCode;
    }

    @Override
    public SubscriptionTargetForm clone() {
        try {
            return (SubscriptionTargetForm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.SubscriptionTargetFormMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
