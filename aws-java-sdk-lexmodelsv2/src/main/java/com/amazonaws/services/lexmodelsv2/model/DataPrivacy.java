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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * By default, data stored by Amazon Lex is encrypted. The <code>DataPrivacy</code> structure provides settings that
 * determine how Amazon Lex handles special cases of securing the data for your bot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DataPrivacy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataPrivacy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of
     * Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in
     * part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying
     * <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By specifying <code>true</code>
     * in the <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is</b> related to a website,
     * program, or other application that is directed or targeted, in whole or in part, to children under age 13 and
     * subject to COPPA. By specifying <code>false</code> in the <code>childDirected</code> field, you confirm that your
     * use of Amazon Lex <b>is not</b> related to a website, program, or other application that is directed or targeted,
     * in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the
     * <code>childDirected</code> field that does not accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in whole or in part, to children under age
     * 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or other application that is
     * directed in whole or in part, to children under age 13, you must obtain any required verifiable parental consent
     * under COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or other
     * applications that are directed or targeted, in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ</a>.
     * </p>
     */
    private Boolean childDirected;

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of
     * Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in
     * part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying
     * <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By specifying <code>true</code>
     * in the <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is</b> related to a website,
     * program, or other application that is directed or targeted, in whole or in part, to children under age 13 and
     * subject to COPPA. By specifying <code>false</code> in the <code>childDirected</code> field, you confirm that your
     * use of Amazon Lex <b>is not</b> related to a website, program, or other application that is directed or targeted,
     * in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the
     * <code>childDirected</code> field that does not accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in whole or in part, to children under age
     * 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or other application that is
     * directed in whole or in part, to children under age 13, you must obtain any required verifiable parental consent
     * under COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or other
     * applications that are directed or targeted, in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ</a>.
     * </p>
     * 
     * @param childDirected
     *        For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your
     *        use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in
     *        whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act
     *        (COPPA) by specifying <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By
     *        specifying <code>true</code> in the <code>childDirected</code> field, you confirm that your use of Amazon
     *        Lex <b>is</b> related to a website, program, or other application that is directed or targeted, in whole
     *        or in part, to children under age 13 and subject to COPPA. By specifying <code>false</code> in the
     *        <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is not</b> related to a
     *        website, program, or other application that is directed or targeted, in whole or in part, to children
     *        under age 13 and subject to COPPA. You may not specify a default value for the <code>childDirected</code>
     *        field that does not accurately reflect whether your use of Amazon Lex is related to a website, program, or
     *        other application that is directed or targeted, in whole or in part, to children under age 13 and subject
     *        to COPPA. If your use of Amazon Lex relates to a website, program, or other application that is directed
     *        in whole or in part, to children under age 13, you must obtain any required verifiable parental consent
     *        under COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or
     *        other applications that are directed or targeted, in whole or in part, to children under age 13, see the
     *        <a href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ</a>.
     */

    public void setChildDirected(Boolean childDirected) {
        this.childDirected = childDirected;
    }

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of
     * Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in
     * part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying
     * <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By specifying <code>true</code>
     * in the <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is</b> related to a website,
     * program, or other application that is directed or targeted, in whole or in part, to children under age 13 and
     * subject to COPPA. By specifying <code>false</code> in the <code>childDirected</code> field, you confirm that your
     * use of Amazon Lex <b>is not</b> related to a website, program, or other application that is directed or targeted,
     * in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the
     * <code>childDirected</code> field that does not accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in whole or in part, to children under age
     * 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or other application that is
     * directed in whole or in part, to children under age 13, you must obtain any required verifiable parental consent
     * under COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or other
     * applications that are directed or targeted, in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ</a>.
     * </p>
     * 
     * @return For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your
     *         use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in
     *         whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act
     *         (COPPA) by specifying <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By
     *         specifying <code>true</code> in the <code>childDirected</code> field, you confirm that your use of Amazon
     *         Lex <b>is</b> related to a website, program, or other application that is directed or targeted, in whole
     *         or in part, to children under age 13 and subject to COPPA. By specifying <code>false</code> in the
     *         <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is not</b> related to a
     *         website, program, or other application that is directed or targeted, in whole or in part, to children
     *         under age 13 and subject to COPPA. You may not specify a default value for the <code>childDirected</code>
     *         field that does not accurately reflect whether your use of Amazon Lex is related to a website, program,
     *         or other application that is directed or targeted, in whole or in part, to children under age 13 and
     *         subject to COPPA. If your use of Amazon Lex relates to a website, program, or other application that is
     *         directed in whole or in part, to children under age 13, you must obtain any required verifiable parental
     *         consent under COPPA. For information regarding the use of Amazon Lex in connection with websites,
     *         programs, or other applications that are directed or targeted, in whole or in part, to children under age
     *         13, see the <a href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ</a>.
     */

    public Boolean getChildDirected() {
        return this.childDirected;
    }

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of
     * Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in
     * part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying
     * <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By specifying <code>true</code>
     * in the <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is</b> related to a website,
     * program, or other application that is directed or targeted, in whole or in part, to children under age 13 and
     * subject to COPPA. By specifying <code>false</code> in the <code>childDirected</code> field, you confirm that your
     * use of Amazon Lex <b>is not</b> related to a website, program, or other application that is directed or targeted,
     * in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the
     * <code>childDirected</code> field that does not accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in whole or in part, to children under age
     * 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or other application that is
     * directed in whole or in part, to children under age 13, you must obtain any required verifiable parental consent
     * under COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or other
     * applications that are directed or targeted, in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ</a>.
     * </p>
     * 
     * @param childDirected
     *        For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your
     *        use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in
     *        whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act
     *        (COPPA) by specifying <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By
     *        specifying <code>true</code> in the <code>childDirected</code> field, you confirm that your use of Amazon
     *        Lex <b>is</b> related to a website, program, or other application that is directed or targeted, in whole
     *        or in part, to children under age 13 and subject to COPPA. By specifying <code>false</code> in the
     *        <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is not</b> related to a
     *        website, program, or other application that is directed or targeted, in whole or in part, to children
     *        under age 13 and subject to COPPA. You may not specify a default value for the <code>childDirected</code>
     *        field that does not accurately reflect whether your use of Amazon Lex is related to a website, program, or
     *        other application that is directed or targeted, in whole or in part, to children under age 13 and subject
     *        to COPPA. If your use of Amazon Lex relates to a website, program, or other application that is directed
     *        in whole or in part, to children under age 13, you must obtain any required verifiable parental consent
     *        under COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or
     *        other applications that are directed or targeted, in whole or in part, to children under age 13, see the
     *        <a href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataPrivacy withChildDirected(Boolean childDirected) {
        setChildDirected(childDirected);
        return this;
    }

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of
     * Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in
     * part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying
     * <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By specifying <code>true</code>
     * in the <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is</b> related to a website,
     * program, or other application that is directed or targeted, in whole or in part, to children under age 13 and
     * subject to COPPA. By specifying <code>false</code> in the <code>childDirected</code> field, you confirm that your
     * use of Amazon Lex <b>is not</b> related to a website, program, or other application that is directed or targeted,
     * in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the
     * <code>childDirected</code> field that does not accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in whole or in part, to children under age
     * 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or other application that is
     * directed in whole or in part, to children under age 13, you must obtain any required verifiable parental consent
     * under COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or other
     * applications that are directed or targeted, in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ</a>.
     * </p>
     * 
     * @return For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your
     *         use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in
     *         whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act
     *         (COPPA) by specifying <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By
     *         specifying <code>true</code> in the <code>childDirected</code> field, you confirm that your use of Amazon
     *         Lex <b>is</b> related to a website, program, or other application that is directed or targeted, in whole
     *         or in part, to children under age 13 and subject to COPPA. By specifying <code>false</code> in the
     *         <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is not</b> related to a
     *         website, program, or other application that is directed or targeted, in whole or in part, to children
     *         under age 13 and subject to COPPA. You may not specify a default value for the <code>childDirected</code>
     *         field that does not accurately reflect whether your use of Amazon Lex is related to a website, program,
     *         or other application that is directed or targeted, in whole or in part, to children under age 13 and
     *         subject to COPPA. If your use of Amazon Lex relates to a website, program, or other application that is
     *         directed in whole or in part, to children under age 13, you must obtain any required verifiable parental
     *         consent under COPPA. For information regarding the use of Amazon Lex in connection with websites,
     *         programs, or other applications that are directed or targeted, in whole or in part, to children under age
     *         13, see the <a href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ</a>.
     */

    public Boolean isChildDirected() {
        return this.childDirected;
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
        if (getChildDirected() != null)
            sb.append("ChildDirected: ").append(getChildDirected());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataPrivacy == false)
            return false;
        DataPrivacy other = (DataPrivacy) obj;
        if (other.getChildDirected() == null ^ this.getChildDirected() == null)
            return false;
        if (other.getChildDirected() != null && other.getChildDirected().equals(this.getChildDirected()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChildDirected() == null) ? 0 : getChildDirected().hashCode());
        return hashCode;
    }

    @Override
    public DataPrivacy clone() {
        try {
            return (DataPrivacy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.DataPrivacyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
