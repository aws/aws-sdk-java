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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DeregisterTargets"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregisterTargetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     */
    private String targetGroupArn;
    /**
     * <p>
     * The targets. If you specified a port override when you registered a target, you must specify both the target ID
     * and the port when you deregister it.
     * </p>
     */
    private java.util.List<TargetDescription> targets;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @param targetGroupArn
     *        The Amazon Resource Name (ARN) of the target group.
     */

    public void setTargetGroupArn(String targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the target group.
     */

    public String getTargetGroupArn() {
        return this.targetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @param targetGroupArn
     *        The Amazon Resource Name (ARN) of the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterTargetsRequest withTargetGroupArn(String targetGroupArn) {
        setTargetGroupArn(targetGroupArn);
        return this;
    }

    /**
     * <p>
     * The targets. If you specified a port override when you registered a target, you must specify both the target ID
     * and the port when you deregister it.
     * </p>
     * 
     * @return The targets. If you specified a port override when you registered a target, you must specify both the
     *         target ID and the port when you deregister it.
     */

    public java.util.List<TargetDescription> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The targets. If you specified a port override when you registered a target, you must specify both the target ID
     * and the port when you deregister it.
     * </p>
     * 
     * @param targets
     *        The targets. If you specified a port override when you registered a target, you must specify both the
     *        target ID and the port when you deregister it.
     */

    public void setTargets(java.util.Collection<TargetDescription> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<TargetDescription>(targets);
    }

    /**
     * <p>
     * The targets. If you specified a port override when you registered a target, you must specify both the target ID
     * and the port when you deregister it.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The targets. If you specified a port override when you registered a target, you must specify both the
     *        target ID and the port when you deregister it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterTargetsRequest withTargets(TargetDescription... targets) {
        if (this.targets == null) {
            setTargets(new java.util.ArrayList<TargetDescription>(targets.length));
        }
        for (TargetDescription ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The targets. If you specified a port override when you registered a target, you must specify both the target ID
     * and the port when you deregister it.
     * </p>
     * 
     * @param targets
     *        The targets. If you specified a port override when you registered a target, you must specify both the
     *        target ID and the port when you deregister it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterTargetsRequest withTargets(java.util.Collection<TargetDescription> targets) {
        setTargets(targets);
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
        if (getTargetGroupArn() != null)
            sb.append("TargetGroupArn: ").append(getTargetGroupArn()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterTargetsRequest == false)
            return false;
        DeregisterTargetsRequest other = (DeregisterTargetsRequest) obj;
        if (other.getTargetGroupArn() == null ^ this.getTargetGroupArn() == null)
            return false;
        if (other.getTargetGroupArn() != null && other.getTargetGroupArn().equals(this.getTargetGroupArn()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetGroupArn() == null) ? 0 : getTargetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterTargetsRequest clone() {
        return (DeregisterTargetsRequest) super.clone();
    }

}
