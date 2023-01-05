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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A port range to specify the source ports to inspect for.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/RuleGroupSourceStatelessRuleMatchAttributesSourcePorts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleGroupSourceStatelessRuleMatchAttributesSourcePorts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The starting port value for the port range.
     * </p>
     */
    private Integer fromPort;
    /**
     * <p>
     * The ending port value for the port range.
     * </p>
     */
    private Integer toPort;

    /**
     * <p>
     * The starting port value for the port range.
     * </p>
     * 
     * @param fromPort
     *        The starting port value for the port range.
     */

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * The starting port value for the port range.
     * </p>
     * 
     * @return The starting port value for the port range.
     */

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * The starting port value for the port range.
     * </p>
     * 
     * @param fromPort
     *        The starting port value for the port range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleMatchAttributesSourcePorts withFromPort(Integer fromPort) {
        setFromPort(fromPort);
        return this;
    }

    /**
     * <p>
     * The ending port value for the port range.
     * </p>
     * 
     * @param toPort
     *        The ending port value for the port range.
     */

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * The ending port value for the port range.
     * </p>
     * 
     * @return The ending port value for the port range.
     */

    public Integer getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * The ending port value for the port range.
     * </p>
     * 
     * @param toPort
     *        The ending port value for the port range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleMatchAttributesSourcePorts withToPort(Integer toPort) {
        setToPort(toPort);
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
        if (getFromPort() != null)
            sb.append("FromPort: ").append(getFromPort()).append(",");
        if (getToPort() != null)
            sb.append("ToPort: ").append(getToPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleGroupSourceStatelessRuleMatchAttributesSourcePorts == false)
            return false;
        RuleGroupSourceStatelessRuleMatchAttributesSourcePorts other = (RuleGroupSourceStatelessRuleMatchAttributesSourcePorts) obj;
        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        return hashCode;
    }

    @Override
    public RuleGroupSourceStatelessRuleMatchAttributesSourcePorts clone() {
        try {
            return (RuleGroupSourceStatelessRuleMatchAttributesSourcePorts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.RuleGroupSourceStatelessRuleMatchAttributesSourcePortsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
