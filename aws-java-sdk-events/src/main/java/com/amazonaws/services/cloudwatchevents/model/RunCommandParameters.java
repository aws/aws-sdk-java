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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This parameter contains the criteria (either InstanceIds or a tag) used to specify which EC2 instances are to be sent
 * the command.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/RunCommandParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunCommandParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Currently, we support including only one RunCommandTarget block, which specifies either an array of InstanceIds
     * or a tag.
     * </p>
     */
    private java.util.List<RunCommandTarget> runCommandTargets;

    /**
     * <p>
     * Currently, we support including only one RunCommandTarget block, which specifies either an array of InstanceIds
     * or a tag.
     * </p>
     * 
     * @return Currently, we support including only one RunCommandTarget block, which specifies either an array of
     *         InstanceIds or a tag.
     */

    public java.util.List<RunCommandTarget> getRunCommandTargets() {
        return runCommandTargets;
    }

    /**
     * <p>
     * Currently, we support including only one RunCommandTarget block, which specifies either an array of InstanceIds
     * or a tag.
     * </p>
     * 
     * @param runCommandTargets
     *        Currently, we support including only one RunCommandTarget block, which specifies either an array of
     *        InstanceIds or a tag.
     */

    public void setRunCommandTargets(java.util.Collection<RunCommandTarget> runCommandTargets) {
        if (runCommandTargets == null) {
            this.runCommandTargets = null;
            return;
        }

        this.runCommandTargets = new java.util.ArrayList<RunCommandTarget>(runCommandTargets);
    }

    /**
     * <p>
     * Currently, we support including only one RunCommandTarget block, which specifies either an array of InstanceIds
     * or a tag.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRunCommandTargets(java.util.Collection)} or {@link #withRunCommandTargets(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param runCommandTargets
     *        Currently, we support including only one RunCommandTarget block, which specifies either an array of
     *        InstanceIds or a tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunCommandParameters withRunCommandTargets(RunCommandTarget... runCommandTargets) {
        if (this.runCommandTargets == null) {
            setRunCommandTargets(new java.util.ArrayList<RunCommandTarget>(runCommandTargets.length));
        }
        for (RunCommandTarget ele : runCommandTargets) {
            this.runCommandTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Currently, we support including only one RunCommandTarget block, which specifies either an array of InstanceIds
     * or a tag.
     * </p>
     * 
     * @param runCommandTargets
     *        Currently, we support including only one RunCommandTarget block, which specifies either an array of
     *        InstanceIds or a tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunCommandParameters withRunCommandTargets(java.util.Collection<RunCommandTarget> runCommandTargets) {
        setRunCommandTargets(runCommandTargets);
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
        if (getRunCommandTargets() != null)
            sb.append("RunCommandTargets: ").append(getRunCommandTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunCommandParameters == false)
            return false;
        RunCommandParameters other = (RunCommandParameters) obj;
        if (other.getRunCommandTargets() == null ^ this.getRunCommandTargets() == null)
            return false;
        if (other.getRunCommandTargets() != null && other.getRunCommandTargets().equals(this.getRunCommandTargets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRunCommandTargets() == null) ? 0 : getRunCommandTargets().hashCode());
        return hashCode;
    }

    @Override
    public RunCommandParameters clone() {
        try {
            return (RunCommandParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.RunCommandParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
