/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * AWS Systems Manager (SSM) specific remediation controls.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/SsmControls" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SsmControls implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum percentage of remediation actions allowed to run in parallel on the non-compliant resources for that
     * specific rule. You can specify a percentage, such as 10%. The default value is 10.
     * </p>
     */
    private Integer concurrentExecutionRatePercentage;
    /**
     * <p>
     * The percentage of errors that are allowed before SSM stops running automations on non-compliant resources for
     * that specific rule. You can specify a percentage of errors, for example 10%. If you do not specifiy a percentage,
     * the default is 50%. For example, if you set the ErrorPercentage to 40% for 10 non-compliant resources, then SSM
     * stops running the automations when the fifth error is received.
     * </p>
     */
    private Integer errorPercentage;

    /**
     * <p>
     * The maximum percentage of remediation actions allowed to run in parallel on the non-compliant resources for that
     * specific rule. You can specify a percentage, such as 10%. The default value is 10.
     * </p>
     * 
     * @param concurrentExecutionRatePercentage
     *        The maximum percentage of remediation actions allowed to run in parallel on the non-compliant resources
     *        for that specific rule. You can specify a percentage, such as 10%. The default value is 10.
     */

    public void setConcurrentExecutionRatePercentage(Integer concurrentExecutionRatePercentage) {
        this.concurrentExecutionRatePercentage = concurrentExecutionRatePercentage;
    }

    /**
     * <p>
     * The maximum percentage of remediation actions allowed to run in parallel on the non-compliant resources for that
     * specific rule. You can specify a percentage, such as 10%. The default value is 10.
     * </p>
     * 
     * @return The maximum percentage of remediation actions allowed to run in parallel on the non-compliant resources
     *         for that specific rule. You can specify a percentage, such as 10%. The default value is 10.
     */

    public Integer getConcurrentExecutionRatePercentage() {
        return this.concurrentExecutionRatePercentage;
    }

    /**
     * <p>
     * The maximum percentage of remediation actions allowed to run in parallel on the non-compliant resources for that
     * specific rule. You can specify a percentage, such as 10%. The default value is 10.
     * </p>
     * 
     * @param concurrentExecutionRatePercentage
     *        The maximum percentage of remediation actions allowed to run in parallel on the non-compliant resources
     *        for that specific rule. You can specify a percentage, such as 10%. The default value is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SsmControls withConcurrentExecutionRatePercentage(Integer concurrentExecutionRatePercentage) {
        setConcurrentExecutionRatePercentage(concurrentExecutionRatePercentage);
        return this;
    }

    /**
     * <p>
     * The percentage of errors that are allowed before SSM stops running automations on non-compliant resources for
     * that specific rule. You can specify a percentage of errors, for example 10%. If you do not specifiy a percentage,
     * the default is 50%. For example, if you set the ErrorPercentage to 40% for 10 non-compliant resources, then SSM
     * stops running the automations when the fifth error is received.
     * </p>
     * 
     * @param errorPercentage
     *        The percentage of errors that are allowed before SSM stops running automations on non-compliant resources
     *        for that specific rule. You can specify a percentage of errors, for example 10%. If you do not specifiy a
     *        percentage, the default is 50%. For example, if you set the ErrorPercentage to 40% for 10 non-compliant
     *        resources, then SSM stops running the automations when the fifth error is received.
     */

    public void setErrorPercentage(Integer errorPercentage) {
        this.errorPercentage = errorPercentage;
    }

    /**
     * <p>
     * The percentage of errors that are allowed before SSM stops running automations on non-compliant resources for
     * that specific rule. You can specify a percentage of errors, for example 10%. If you do not specifiy a percentage,
     * the default is 50%. For example, if you set the ErrorPercentage to 40% for 10 non-compliant resources, then SSM
     * stops running the automations when the fifth error is received.
     * </p>
     * 
     * @return The percentage of errors that are allowed before SSM stops running automations on non-compliant resources
     *         for that specific rule. You can specify a percentage of errors, for example 10%. If you do not specifiy a
     *         percentage, the default is 50%. For example, if you set the ErrorPercentage to 40% for 10 non-compliant
     *         resources, then SSM stops running the automations when the fifth error is received.
     */

    public Integer getErrorPercentage() {
        return this.errorPercentage;
    }

    /**
     * <p>
     * The percentage of errors that are allowed before SSM stops running automations on non-compliant resources for
     * that specific rule. You can specify a percentage of errors, for example 10%. If you do not specifiy a percentage,
     * the default is 50%. For example, if you set the ErrorPercentage to 40% for 10 non-compliant resources, then SSM
     * stops running the automations when the fifth error is received.
     * </p>
     * 
     * @param errorPercentage
     *        The percentage of errors that are allowed before SSM stops running automations on non-compliant resources
     *        for that specific rule. You can specify a percentage of errors, for example 10%. If you do not specifiy a
     *        percentage, the default is 50%. For example, if you set the ErrorPercentage to 40% for 10 non-compliant
     *        resources, then SSM stops running the automations when the fifth error is received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SsmControls withErrorPercentage(Integer errorPercentage) {
        setErrorPercentage(errorPercentage);
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
        if (getConcurrentExecutionRatePercentage() != null)
            sb.append("ConcurrentExecutionRatePercentage: ").append(getConcurrentExecutionRatePercentage()).append(",");
        if (getErrorPercentage() != null)
            sb.append("ErrorPercentage: ").append(getErrorPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SsmControls == false)
            return false;
        SsmControls other = (SsmControls) obj;
        if (other.getConcurrentExecutionRatePercentage() == null ^ this.getConcurrentExecutionRatePercentage() == null)
            return false;
        if (other.getConcurrentExecutionRatePercentage() != null
                && other.getConcurrentExecutionRatePercentage().equals(this.getConcurrentExecutionRatePercentage()) == false)
            return false;
        if (other.getErrorPercentage() == null ^ this.getErrorPercentage() == null)
            return false;
        if (other.getErrorPercentage() != null && other.getErrorPercentage().equals(this.getErrorPercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConcurrentExecutionRatePercentage() == null) ? 0 : getConcurrentExecutionRatePercentage().hashCode());
        hashCode = prime * hashCode + ((getErrorPercentage() == null) ? 0 : getErrorPercentage().hashCode());
        return hashCode;
    }

    @Override
    public SsmControls clone() {
        try {
            return (SsmControls) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.SsmControlsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
