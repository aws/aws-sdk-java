/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the <code>GetSMSAttributes</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/GetSMSAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSMSAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the individual attribute names, such as <code>MonthlySpendLimit</code>, for which you want values.
     * </p>
     * <p>
     * For all attribute names, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetSMSAttributes.html">SetSMSAttributes</a>.
     * </p>
     * <p>
     * If you don't use this parameter, Amazon SNS returns all SMS attributes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> attributes;

    /**
     * <p>
     * A list of the individual attribute names, such as <code>MonthlySpendLimit</code>, for which you want values.
     * </p>
     * <p>
     * For all attribute names, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetSMSAttributes.html">SetSMSAttributes</a>.
     * </p>
     * <p>
     * If you don't use this parameter, Amazon SNS returns all SMS attributes.
     * </p>
     * 
     * @return A list of the individual attribute names, such as <code>MonthlySpendLimit</code>, for which you want
     *         values.</p>
     *         <p>
     *         For all attribute names, see <a
     *         href="http://docs.aws.amazon.com/sns/latest/api/API_SetSMSAttributes.html">SetSMSAttributes</a>.
     *         </p>
     *         <p>
     *         If you don't use this parameter, Amazon SNS returns all SMS attributes.
     */

    public java.util.List<String> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return attributes;
    }

    /**
     * <p>
     * A list of the individual attribute names, such as <code>MonthlySpendLimit</code>, for which you want values.
     * </p>
     * <p>
     * For all attribute names, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetSMSAttributes.html">SetSMSAttributes</a>.
     * </p>
     * <p>
     * If you don't use this parameter, Amazon SNS returns all SMS attributes.
     * </p>
     * 
     * @param attributes
     *        A list of the individual attribute names, such as <code>MonthlySpendLimit</code>, for which you want
     *        values.</p>
     *        <p>
     *        For all attribute names, see <a
     *        href="http://docs.aws.amazon.com/sns/latest/api/API_SetSMSAttributes.html">SetSMSAttributes</a>.
     *        </p>
     *        <p>
     *        If you don't use this parameter, Amazon SNS returns all SMS attributes.
     */

    public void setAttributes(java.util.Collection<String> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new com.amazonaws.internal.SdkInternalList<String>(attributes);
    }

    /**
     * <p>
     * A list of the individual attribute names, such as <code>MonthlySpendLimit</code>, for which you want values.
     * </p>
     * <p>
     * For all attribute names, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetSMSAttributes.html">SetSMSAttributes</a>.
     * </p>
     * <p>
     * If you don't use this parameter, Amazon SNS returns all SMS attributes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        A list of the individual attribute names, such as <code>MonthlySpendLimit</code>, for which you want
     *        values.</p>
     *        <p>
     *        For all attribute names, see <a
     *        href="http://docs.aws.amazon.com/sns/latest/api/API_SetSMSAttributes.html">SetSMSAttributes</a>.
     *        </p>
     *        <p>
     *        If you don't use this parameter, Amazon SNS returns all SMS attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSMSAttributesRequest withAttributes(String... attributes) {
        if (this.attributes == null) {
            setAttributes(new com.amazonaws.internal.SdkInternalList<String>(attributes.length));
        }
        for (String ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the individual attribute names, such as <code>MonthlySpendLimit</code>, for which you want values.
     * </p>
     * <p>
     * For all attribute names, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetSMSAttributes.html">SetSMSAttributes</a>.
     * </p>
     * <p>
     * If you don't use this parameter, Amazon SNS returns all SMS attributes.
     * </p>
     * 
     * @param attributes
     *        A list of the individual attribute names, such as <code>MonthlySpendLimit</code>, for which you want
     *        values.</p>
     *        <p>
     *        For all attribute names, see <a
     *        href="http://docs.aws.amazon.com/sns/latest/api/API_SetSMSAttributes.html">SetSMSAttributes</a>.
     *        </p>
     *        <p>
     *        If you don't use this parameter, Amazon SNS returns all SMS attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSMSAttributesRequest withAttributes(java.util.Collection<String> attributes) {
        setAttributes(attributes);
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSMSAttributesRequest == false)
            return false;
        GetSMSAttributesRequest other = (GetSMSAttributesRequest) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public GetSMSAttributesRequest clone() {
        return (GetSMSAttributesRequest) super.clone();
    }

}
