/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an Auto Scaling group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/AutoScalingGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Auto Scaling group name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the launch hook that CodeDeploy installed into the Auto Scaling group.
     * </p>
     * <p>
     * For more information about the launch hook, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors"
     * >How Amazon EC2 Auto Scaling works with CodeDeploy</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     */
    private String hook;
    /**
     * <p>
     * The name of the termination hook that CodeDeploy installed into the Auto Scaling group.
     * </p>
     * <p>
     * For more information about the termination hook, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors-hook-enable"
     * >Enabling termination deployments during Auto Scaling scale-in events</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     */
    private String terminationHook;

    /**
     * <p>
     * The Auto Scaling group name.
     * </p>
     * 
     * @param name
     *        The Auto Scaling group name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The Auto Scaling group name.
     * </p>
     * 
     * @return The Auto Scaling group name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The Auto Scaling group name.
     * </p>
     * 
     * @param name
     *        The Auto Scaling group name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the launch hook that CodeDeploy installed into the Auto Scaling group.
     * </p>
     * <p>
     * For more information about the launch hook, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors"
     * >How Amazon EC2 Auto Scaling works with CodeDeploy</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     * 
     * @param hook
     *        The name of the launch hook that CodeDeploy installed into the Auto Scaling group.</p>
     *        <p>
     *        For more information about the launch hook, see <a href=
     *        "https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors"
     *        >How Amazon EC2 Auto Scaling works with CodeDeploy</a> in the <i>CodeDeploy User Guide</i>.
     */

    public void setHook(String hook) {
        this.hook = hook;
    }

    /**
     * <p>
     * The name of the launch hook that CodeDeploy installed into the Auto Scaling group.
     * </p>
     * <p>
     * For more information about the launch hook, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors"
     * >How Amazon EC2 Auto Scaling works with CodeDeploy</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     * 
     * @return The name of the launch hook that CodeDeploy installed into the Auto Scaling group.</p>
     *         <p>
     *         For more information about the launch hook, see <a href=
     *         "https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors"
     *         >How Amazon EC2 Auto Scaling works with CodeDeploy</a> in the <i>CodeDeploy User Guide</i>.
     */

    public String getHook() {
        return this.hook;
    }

    /**
     * <p>
     * The name of the launch hook that CodeDeploy installed into the Auto Scaling group.
     * </p>
     * <p>
     * For more information about the launch hook, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors"
     * >How Amazon EC2 Auto Scaling works with CodeDeploy</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     * 
     * @param hook
     *        The name of the launch hook that CodeDeploy installed into the Auto Scaling group.</p>
     *        <p>
     *        For more information about the launch hook, see <a href=
     *        "https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors"
     *        >How Amazon EC2 Auto Scaling works with CodeDeploy</a> in the <i>CodeDeploy User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withHook(String hook) {
        setHook(hook);
        return this;
    }

    /**
     * <p>
     * The name of the termination hook that CodeDeploy installed into the Auto Scaling group.
     * </p>
     * <p>
     * For more information about the termination hook, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors-hook-enable"
     * >Enabling termination deployments during Auto Scaling scale-in events</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     * 
     * @param terminationHook
     *        The name of the termination hook that CodeDeploy installed into the Auto Scaling group.</p>
     *        <p>
     *        For more information about the termination hook, see <a href=
     *        "https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors-hook-enable"
     *        >Enabling termination deployments during Auto Scaling scale-in events</a> in the <i>CodeDeploy User
     *        Guide</i>.
     */

    public void setTerminationHook(String terminationHook) {
        this.terminationHook = terminationHook;
    }

    /**
     * <p>
     * The name of the termination hook that CodeDeploy installed into the Auto Scaling group.
     * </p>
     * <p>
     * For more information about the termination hook, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors-hook-enable"
     * >Enabling termination deployments during Auto Scaling scale-in events</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     * 
     * @return The name of the termination hook that CodeDeploy installed into the Auto Scaling group.</p>
     *         <p>
     *         For more information about the termination hook, see <a href=
     *         "https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors-hook-enable"
     *         >Enabling termination deployments during Auto Scaling scale-in events</a> in the <i>CodeDeploy User
     *         Guide</i>.
     */

    public String getTerminationHook() {
        return this.terminationHook;
    }

    /**
     * <p>
     * The name of the termination hook that CodeDeploy installed into the Auto Scaling group.
     * </p>
     * <p>
     * For more information about the termination hook, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors-hook-enable"
     * >Enabling termination deployments during Auto Scaling scale-in events</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     * 
     * @param terminationHook
     *        The name of the termination hook that CodeDeploy installed into the Auto Scaling group.</p>
     *        <p>
     *        For more information about the termination hook, see <a href=
     *        "https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors-hook-enable"
     *        >Enabling termination deployments during Auto Scaling scale-in events</a> in the <i>CodeDeploy User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withTerminationHook(String terminationHook) {
        setTerminationHook(terminationHook);
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
        if (getHook() != null)
            sb.append("Hook: ").append(getHook()).append(",");
        if (getTerminationHook() != null)
            sb.append("TerminationHook: ").append(getTerminationHook());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingGroup == false)
            return false;
        AutoScalingGroup other = (AutoScalingGroup) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getHook() == null ^ this.getHook() == null)
            return false;
        if (other.getHook() != null && other.getHook().equals(this.getHook()) == false)
            return false;
        if (other.getTerminationHook() == null ^ this.getTerminationHook() == null)
            return false;
        if (other.getTerminationHook() != null && other.getTerminationHook().equals(this.getTerminationHook()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getHook() == null) ? 0 : getHook().hashCode());
        hashCode = prime * hashCode + ((getTerminationHook() == null) ? 0 : getTerminationHook().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingGroup clone() {
        try {
            return (AutoScalingGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.AutoScalingGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
