/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object which contains <code>ReplacementTemplateData</code> to be used for a specific <code>BulkEmailEntry</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ReplacementTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplacementTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of
     * key-value pairs in which the keys correspond to replacement tags in the email template.
     * </p>
     */
    private String replacementTemplateData;

    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of
     * key-value pairs in which the keys correspond to replacement tags in the email template.
     * </p>
     * 
     * @param replacementTemplateData
     *        A list of replacement values to apply to the template. This parameter is a JSON object, typically
     *        consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
     */

    public void setReplacementTemplateData(String replacementTemplateData) {
        this.replacementTemplateData = replacementTemplateData;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of
     * key-value pairs in which the keys correspond to replacement tags in the email template.
     * </p>
     * 
     * @return A list of replacement values to apply to the template. This parameter is a JSON object, typically
     *         consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
     */

    public String getReplacementTemplateData() {
        return this.replacementTemplateData;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of
     * key-value pairs in which the keys correspond to replacement tags in the email template.
     * </p>
     * 
     * @param replacementTemplateData
     *        A list of replacement values to apply to the template. This parameter is a JSON object, typically
     *        consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplacementTemplate withReplacementTemplateData(String replacementTemplateData) {
        setReplacementTemplateData(replacementTemplateData);
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
        if (getReplacementTemplateData() != null)
            sb.append("ReplacementTemplateData: ").append(getReplacementTemplateData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplacementTemplate == false)
            return false;
        ReplacementTemplate other = (ReplacementTemplate) obj;
        if (other.getReplacementTemplateData() == null ^ this.getReplacementTemplateData() == null)
            return false;
        if (other.getReplacementTemplateData() != null && other.getReplacementTemplateData().equals(this.getReplacementTemplateData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplacementTemplateData() == null) ? 0 : getReplacementTemplateData().hashCode());
        return hashCode;
    }

    @Override
    public ReplacementTemplate clone() {
        try {
            return (ReplacementTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.ReplacementTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
