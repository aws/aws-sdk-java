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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The AccountLimit data type. For more information about account limits, see <a
 * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cloudformation-limits.html">AWS CloudFormation
 * Limits</a> in the <i>AWS CloudFormation User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/AccountLimit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountLimit implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the account limit.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value that is associated with the account limit name.
     * </p>
     */
    private Integer value;

    /**
     * <p>
     * The name of the account limit.
     * </p>
     * 
     * @param name
     *        The name of the account limit.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the account limit.
     * </p>
     * 
     * @return The name of the account limit.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the account limit.
     * </p>
     * 
     * @param name
     *        The name of the account limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLimit withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value that is associated with the account limit name.
     * </p>
     * 
     * @param value
     *        The value that is associated with the account limit name.
     */

    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * <p>
     * The value that is associated with the account limit name.
     * </p>
     * 
     * @return The value that is associated with the account limit name.
     */

    public Integer getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value that is associated with the account limit name.
     * </p>
     * 
     * @param value
     *        The value that is associated with the account limit name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLimit withValue(Integer value) {
        setValue(value);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountLimit == false)
            return false;
        AccountLimit other = (AccountLimit) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public AccountLimit clone() {
        try {
            return (AccountLimit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
