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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Custom rewrite / redirect rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CustomRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source pattern for a URL rewrite or redirect rule.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The target pattern for a URL rewrite or redirect rule.
     * </p>
     */
    private String target;
    /**
     * <p>
     * The status code for a URL rewrite or redirect rule.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The condition for a URL rewrite or redirect rule, e.g. country code.
     * </p>
     */
    private String condition;

    /**
     * <p>
     * The source pattern for a URL rewrite or redirect rule.
     * </p>
     * 
     * @param source
     *        The source pattern for a URL rewrite or redirect rule.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source pattern for a URL rewrite or redirect rule.
     * </p>
     * 
     * @return The source pattern for a URL rewrite or redirect rule.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source pattern for a URL rewrite or redirect rule.
     * </p>
     * 
     * @param source
     *        The source pattern for a URL rewrite or redirect rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomRule withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The target pattern for a URL rewrite or redirect rule.
     * </p>
     * 
     * @param target
     *        The target pattern for a URL rewrite or redirect rule.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The target pattern for a URL rewrite or redirect rule.
     * </p>
     * 
     * @return The target pattern for a URL rewrite or redirect rule.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The target pattern for a URL rewrite or redirect rule.
     * </p>
     * 
     * @param target
     *        The target pattern for a URL rewrite or redirect rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomRule withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The status code for a URL rewrite or redirect rule.
     * </p>
     * 
     * @param status
     *        The status code for a URL rewrite or redirect rule.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status code for a URL rewrite or redirect rule.
     * </p>
     * 
     * @return The status code for a URL rewrite or redirect rule.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status code for a URL rewrite or redirect rule.
     * </p>
     * 
     * @param status
     *        The status code for a URL rewrite or redirect rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomRule withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The condition for a URL rewrite or redirect rule, e.g. country code.
     * </p>
     * 
     * @param condition
     *        The condition for a URL rewrite or redirect rule, e.g. country code.
     */

    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The condition for a URL rewrite or redirect rule, e.g. country code.
     * </p>
     * 
     * @return The condition for a URL rewrite or redirect rule, e.g. country code.
     */

    public String getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * The condition for a URL rewrite or redirect rule, e.g. country code.
     * </p>
     * 
     * @param condition
     *        The condition for a URL rewrite or redirect rule, e.g. country code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomRule withCondition(String condition) {
        setCondition(condition);
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomRule == false)
            return false;
        CustomRule other = (CustomRule) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        return hashCode;
    }

    @Override
    public CustomRule clone() {
        try {
            return (CustomRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplify.model.transform.CustomRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
