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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeTargetHealth"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTargetHealthResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the health of the targets.
     * </p>
     */
    private java.util.List<TargetHealthDescription> targetHealthDescriptions;

    /**
     * <p>
     * Information about the health of the targets.
     * </p>
     * 
     * @return Information about the health of the targets.
     */

    public java.util.List<TargetHealthDescription> getTargetHealthDescriptions() {
        return targetHealthDescriptions;
    }

    /**
     * <p>
     * Information about the health of the targets.
     * </p>
     * 
     * @param targetHealthDescriptions
     *        Information about the health of the targets.
     */

    public void setTargetHealthDescriptions(java.util.Collection<TargetHealthDescription> targetHealthDescriptions) {
        if (targetHealthDescriptions == null) {
            this.targetHealthDescriptions = null;
            return;
        }

        this.targetHealthDescriptions = new java.util.ArrayList<TargetHealthDescription>(targetHealthDescriptions);
    }

    /**
     * <p>
     * Information about the health of the targets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetHealthDescriptions(java.util.Collection)} or
     * {@link #withTargetHealthDescriptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param targetHealthDescriptions
     *        Information about the health of the targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTargetHealthResult withTargetHealthDescriptions(TargetHealthDescription... targetHealthDescriptions) {
        if (this.targetHealthDescriptions == null) {
            setTargetHealthDescriptions(new java.util.ArrayList<TargetHealthDescription>(targetHealthDescriptions.length));
        }
        for (TargetHealthDescription ele : targetHealthDescriptions) {
            this.targetHealthDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the health of the targets.
     * </p>
     * 
     * @param targetHealthDescriptions
     *        Information about the health of the targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTargetHealthResult withTargetHealthDescriptions(java.util.Collection<TargetHealthDescription> targetHealthDescriptions) {
        setTargetHealthDescriptions(targetHealthDescriptions);
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
        if (getTargetHealthDescriptions() != null)
            sb.append("TargetHealthDescriptions: ").append(getTargetHealthDescriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTargetHealthResult == false)
            return false;
        DescribeTargetHealthResult other = (DescribeTargetHealthResult) obj;
        if (other.getTargetHealthDescriptions() == null ^ this.getTargetHealthDescriptions() == null)
            return false;
        if (other.getTargetHealthDescriptions() != null && other.getTargetHealthDescriptions().equals(this.getTargetHealthDescriptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetHealthDescriptions() == null) ? 0 : getTargetHealthDescriptions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTargetHealthResult clone() {
        try {
            return (DescribeTargetHealthResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
