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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An activity that computes an arithmetic expression using the message's attributes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/MathActivity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MathActivity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the 'math' activity.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the attribute that contains the result of the math operation.
     * </p>
     */
    private String attribute;
    /**
     * <p>
     * An expression that uses one or more existing attributes and must return an integer value.
     * </p>
     */
    private String math;
    /**
     * <p>
     * The next activity in the pipeline.
     * </p>
     */
    private String next;

    /**
     * <p>
     * The name of the 'math' activity.
     * </p>
     * 
     * @param name
     *        The name of the 'math' activity.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the 'math' activity.
     * </p>
     * 
     * @return The name of the 'math' activity.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the 'math' activity.
     * </p>
     * 
     * @param name
     *        The name of the 'math' activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MathActivity withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the attribute that contains the result of the math operation.
     * </p>
     * 
     * @param attribute
     *        The name of the attribute that contains the result of the math operation.
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The name of the attribute that contains the result of the math operation.
     * </p>
     * 
     * @return The name of the attribute that contains the result of the math operation.
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The name of the attribute that contains the result of the math operation.
     * </p>
     * 
     * @param attribute
     *        The name of the attribute that contains the result of the math operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MathActivity withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * An expression that uses one or more existing attributes and must return an integer value.
     * </p>
     * 
     * @param math
     *        An expression that uses one or more existing attributes and must return an integer value.
     */

    public void setMath(String math) {
        this.math = math;
    }

    /**
     * <p>
     * An expression that uses one or more existing attributes and must return an integer value.
     * </p>
     * 
     * @return An expression that uses one or more existing attributes and must return an integer value.
     */

    public String getMath() {
        return this.math;
    }

    /**
     * <p>
     * An expression that uses one or more existing attributes and must return an integer value.
     * </p>
     * 
     * @param math
     *        An expression that uses one or more existing attributes and must return an integer value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MathActivity withMath(String math) {
        setMath(math);
        return this;
    }

    /**
     * <p>
     * The next activity in the pipeline.
     * </p>
     * 
     * @param next
     *        The next activity in the pipeline.
     */

    public void setNext(String next) {
        this.next = next;
    }

    /**
     * <p>
     * The next activity in the pipeline.
     * </p>
     * 
     * @return The next activity in the pipeline.
     */

    public String getNext() {
        return this.next;
    }

    /**
     * <p>
     * The next activity in the pipeline.
     * </p>
     * 
     * @param next
     *        The next activity in the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MathActivity withNext(String next) {
        setNext(next);
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
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute()).append(",");
        if (getMath() != null)
            sb.append("Math: ").append(getMath()).append(",");
        if (getNext() != null)
            sb.append("Next: ").append(getNext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MathActivity == false)
            return false;
        MathActivity other = (MathActivity) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getMath() == null ^ this.getMath() == null)
            return false;
        if (other.getMath() != null && other.getMath().equals(this.getMath()) == false)
            return false;
        if (other.getNext() == null ^ this.getNext() == null)
            return false;
        if (other.getNext() != null && other.getNext().equals(this.getNext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getMath() == null) ? 0 : getMath().hashCode());
        hashCode = prime * hashCode + ((getNext() == null) ? 0 : getNext().hashCode());
        return hashCode;
    }

    @Override
    public MathActivity clone() {
        try {
            return (MathActivity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.MathActivityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
