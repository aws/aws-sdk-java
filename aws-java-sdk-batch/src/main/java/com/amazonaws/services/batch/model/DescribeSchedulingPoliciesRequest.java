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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for <code>DescribeSchedulingPolicies</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DescribeSchedulingPolicies" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSchedulingPoliciesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of up to 100 scheduling policy Amazon Resource Name (ARN) entries.
     * </p>
     */
    private java.util.List<String> arns;

    /**
     * <p>
     * A list of up to 100 scheduling policy Amazon Resource Name (ARN) entries.
     * </p>
     * 
     * @return A list of up to 100 scheduling policy Amazon Resource Name (ARN) entries.
     */

    public java.util.List<String> getArns() {
        return arns;
    }

    /**
     * <p>
     * A list of up to 100 scheduling policy Amazon Resource Name (ARN) entries.
     * </p>
     * 
     * @param arns
     *        A list of up to 100 scheduling policy Amazon Resource Name (ARN) entries.
     */

    public void setArns(java.util.Collection<String> arns) {
        if (arns == null) {
            this.arns = null;
            return;
        }

        this.arns = new java.util.ArrayList<String>(arns);
    }

    /**
     * <p>
     * A list of up to 100 scheduling policy Amazon Resource Name (ARN) entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArns(java.util.Collection)} or {@link #withArns(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param arns
     *        A list of up to 100 scheduling policy Amazon Resource Name (ARN) entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSchedulingPoliciesRequest withArns(String... arns) {
        if (this.arns == null) {
            setArns(new java.util.ArrayList<String>(arns.length));
        }
        for (String ele : arns) {
            this.arns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 100 scheduling policy Amazon Resource Name (ARN) entries.
     * </p>
     * 
     * @param arns
     *        A list of up to 100 scheduling policy Amazon Resource Name (ARN) entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSchedulingPoliciesRequest withArns(java.util.Collection<String> arns) {
        setArns(arns);
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
        if (getArns() != null)
            sb.append("Arns: ").append(getArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSchedulingPoliciesRequest == false)
            return false;
        DescribeSchedulingPoliciesRequest other = (DescribeSchedulingPoliciesRequest) obj;
        if (other.getArns() == null ^ this.getArns() == null)
            return false;
        if (other.getArns() != null && other.getArns().equals(this.getArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArns() == null) ? 0 : getArns().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSchedulingPoliciesRequest clone() {
        return (DescribeSchedulingPoliciesRequest) super.clone();
    }

}
