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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A code and name pair that represents the severity level of a support case. The available values depend on the support
 * plan for the account. For more information, see <a
 * href="https://docs.aws.amazon.com/awssupport/latest/user/case-management.html#choosing-severity">Choosing a
 * severity</a> in the <i>AWS Support User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/SeverityLevel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SeverityLevel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The code for case severity level.
     * </p>
     * <p>
     * Valid values: <code>low</code> | <code>normal</code> | <code>high</code> | <code>urgent</code> |
     * <code>critical</code>
     * </p>
     */
    private String code;
    /**
     * <p>
     * The name of the severity level that corresponds to the severity level code.
     * </p>
     * <note>
     * <p>
     * The values returned by the API are different from the values that appear in the AWS Support Center. For example,
     * the API uses the code <code>low</code>, but the name appears as General guidance in Support Center.
     * </p>
     * <p>
     * The following are the API code names and how they appear in the console:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>low</code> - General guidance
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>normal</code> - System impaired
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>high</code> - Production system impaired
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>urgent</code> - Production system down
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>critical</code> - Business-critical system down
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/awssupport/latest/user/case-management.html#choosing-severity">Choosing a
     * severity</a> in the <i>AWS Support User Guide</i>.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The code for case severity level.
     * </p>
     * <p>
     * Valid values: <code>low</code> | <code>normal</code> | <code>high</code> | <code>urgent</code> |
     * <code>critical</code>
     * </p>
     * 
     * @param code
     *        The code for case severity level.</p>
     *        <p>
     *        Valid values: <code>low</code> | <code>normal</code> | <code>high</code> | <code>urgent</code> |
     *        <code>critical</code>
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The code for case severity level.
     * </p>
     * <p>
     * Valid values: <code>low</code> | <code>normal</code> | <code>high</code> | <code>urgent</code> |
     * <code>critical</code>
     * </p>
     * 
     * @return The code for case severity level.</p>
     *         <p>
     *         Valid values: <code>low</code> | <code>normal</code> | <code>high</code> | <code>urgent</code> |
     *         <code>critical</code>
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The code for case severity level.
     * </p>
     * <p>
     * Valid values: <code>low</code> | <code>normal</code> | <code>high</code> | <code>urgent</code> |
     * <code>critical</code>
     * </p>
     * 
     * @param code
     *        The code for case severity level.</p>
     *        <p>
     *        Valid values: <code>low</code> | <code>normal</code> | <code>high</code> | <code>urgent</code> |
     *        <code>critical</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SeverityLevel withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The name of the severity level that corresponds to the severity level code.
     * </p>
     * <note>
     * <p>
     * The values returned by the API are different from the values that appear in the AWS Support Center. For example,
     * the API uses the code <code>low</code>, but the name appears as General guidance in Support Center.
     * </p>
     * <p>
     * The following are the API code names and how they appear in the console:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>low</code> - General guidance
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>normal</code> - System impaired
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>high</code> - Production system impaired
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>urgent</code> - Production system down
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>critical</code> - Business-critical system down
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/awssupport/latest/user/case-management.html#choosing-severity">Choosing a
     * severity</a> in the <i>AWS Support User Guide</i>.
     * </p>
     * 
     * @param name
     *        The name of the severity level that corresponds to the severity level code.</p> <note>
     *        <p>
     *        The values returned by the API are different from the values that appear in the AWS Support Center. For
     *        example, the API uses the code <code>low</code>, but the name appears as General guidance in Support
     *        Center.
     *        </p>
     *        <p>
     *        The following are the API code names and how they appear in the console:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>low</code> - General guidance
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>normal</code> - System impaired
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>high</code> - Production system impaired
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>urgent</code> - Production system down
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>critical</code> - Business-critical system down
     *        </p>
     *        </li>
     *        </ul>
     *        </note>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/awssupport/latest/user/case-management.html#choosing-severity">Choosing
     *        a severity</a> in the <i>AWS Support User Guide</i>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the severity level that corresponds to the severity level code.
     * </p>
     * <note>
     * <p>
     * The values returned by the API are different from the values that appear in the AWS Support Center. For example,
     * the API uses the code <code>low</code>, but the name appears as General guidance in Support Center.
     * </p>
     * <p>
     * The following are the API code names and how they appear in the console:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>low</code> - General guidance
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>normal</code> - System impaired
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>high</code> - Production system impaired
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>urgent</code> - Production system down
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>critical</code> - Business-critical system down
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/awssupport/latest/user/case-management.html#choosing-severity">Choosing a
     * severity</a> in the <i>AWS Support User Guide</i>.
     * </p>
     * 
     * @return The name of the severity level that corresponds to the severity level code.</p> <note>
     *         <p>
     *         The values returned by the API are different from the values that appear in the AWS Support Center. For
     *         example, the API uses the code <code>low</code>, but the name appears as General guidance in Support
     *         Center.
     *         </p>
     *         <p>
     *         The following are the API code names and how they appear in the console:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>low</code> - General guidance
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>normal</code> - System impaired
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>high</code> - Production system impaired
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>urgent</code> - Production system down
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>critical</code> - Business-critical system down
     *         </p>
     *         </li>
     *         </ul>
     *         </note>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/awssupport/latest/user/case-management.html#choosing-severity">Choosing
     *         a severity</a> in the <i>AWS Support User Guide</i>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the severity level that corresponds to the severity level code.
     * </p>
     * <note>
     * <p>
     * The values returned by the API are different from the values that appear in the AWS Support Center. For example,
     * the API uses the code <code>low</code>, but the name appears as General guidance in Support Center.
     * </p>
     * <p>
     * The following are the API code names and how they appear in the console:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>low</code> - General guidance
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>normal</code> - System impaired
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>high</code> - Production system impaired
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>urgent</code> - Production system down
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>critical</code> - Business-critical system down
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/awssupport/latest/user/case-management.html#choosing-severity">Choosing a
     * severity</a> in the <i>AWS Support User Guide</i>.
     * </p>
     * 
     * @param name
     *        The name of the severity level that corresponds to the severity level code.</p> <note>
     *        <p>
     *        The values returned by the API are different from the values that appear in the AWS Support Center. For
     *        example, the API uses the code <code>low</code>, but the name appears as General guidance in Support
     *        Center.
     *        </p>
     *        <p>
     *        The following are the API code names and how they appear in the console:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>low</code> - General guidance
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>normal</code> - System impaired
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>high</code> - Production system impaired
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>urgent</code> - Production system down
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>critical</code> - Business-critical system down
     *        </p>
     *        </li>
     *        </ul>
     *        </note>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/awssupport/latest/user/case-management.html#choosing-severity">Choosing
     *        a severity</a> in the <i>AWS Support User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SeverityLevel withName(String name) {
        setName(name);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SeverityLevel == false)
            return false;
        SeverityLevel other = (SeverityLevel) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public SeverityLevel clone() {
        try {
            return (SeverityLevel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.support.model.transform.SeverityLevelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
