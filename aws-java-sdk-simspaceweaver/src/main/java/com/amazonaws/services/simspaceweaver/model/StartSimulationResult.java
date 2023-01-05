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
package com.amazonaws.services.simspaceweaver.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StartSimulation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSimulationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC since the
     * Unix epoch (0:0:0.000, January 1, 1970).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A universally unique identifier (UUID) for this simulation.
     * </p>
     */
    private String executionId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC since the
     * Unix epoch (0:0:0.000, January 1, 1970).
     * </p>
     * 
     * @param creationTime
     *        The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC since
     *        the Unix epoch (0:0:0.000, January 1, 1970).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC since the
     * Unix epoch (0:0:0.000, January 1, 1970).
     * </p>
     * 
     * @return The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC
     *         since the Unix epoch (0:0:0.000, January 1, 1970).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC since the
     * Unix epoch (0:0:0.000, January 1, 1970).
     * </p>
     * 
     * @param creationTime
     *        The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC since
     *        the Unix epoch (0:0:0.000, January 1, 1970).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A universally unique identifier (UUID) for this simulation.
     * </p>
     * 
     * @param executionId
     *        A universally unique identifier (UUID) for this simulation.
     */

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * A universally unique identifier (UUID) for this simulation.
     * </p>
     * 
     * @return A universally unique identifier (UUID) for this simulation.
     */

    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * <p>
     * A universally unique identifier (UUID) for this simulation.
     * </p>
     * 
     * @param executionId
     *        A universally unique identifier (UUID) for this simulation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationResult withExecutionId(String executionId) {
        setExecutionId(executionId);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getExecutionId() != null)
            sb.append("ExecutionId: ").append(getExecutionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSimulationResult == false)
            return false;
        StartSimulationResult other = (StartSimulationResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null)
            return false;
        if (other.getExecutionId() != null && other.getExecutionId().equals(this.getExecutionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        return hashCode;
    }

    @Override
    public StartSimulationResult clone() {
        try {
            return (StartSimulationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
