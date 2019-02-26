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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summarizes all DDoS attacks for a specified time period.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/AttackSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttackSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier (ID) of the attack.
     * </p>
     */
    private String attackId;
    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource that was attacked.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The start time of the attack, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time of the attack, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The list of attacks for a specified time period.
     * </p>
     */
    private java.util.List<AttackVectorDescription> attackVectors;

    /**
     * <p>
     * The unique identifier (ID) of the attack.
     * </p>
     * 
     * @param attackId
     *        The unique identifier (ID) of the attack.
     */

    public void setAttackId(String attackId) {
        this.attackId = attackId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the attack.
     * </p>
     * 
     * @return The unique identifier (ID) of the attack.
     */

    public String getAttackId() {
        return this.attackId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the attack.
     * </p>
     * 
     * @param attackId
     *        The unique identifier (ID) of the attack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackSummary withAttackId(String attackId) {
        setAttackId(attackId);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource that was attacked.
     * </p>
     * 
     * @param resourceArn
     *        The ARN (Amazon Resource Name) of the resource that was attacked.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource that was attacked.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) of the resource that was attacked.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource that was attacked.
     * </p>
     * 
     * @param resourceArn
     *        The ARN (Amazon Resource Name) of the resource that was attacked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackSummary withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The start time of the attack, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     * 
     * @param startTime
     *        The start time of the attack, in Unix time in seconds. For more information see <a
     *        href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the attack, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     * 
     * @return The start time of the attack, in Unix time in seconds. For more information see <a
     *         href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *         >timestamp</a>.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the attack, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     * 
     * @param startTime
     *        The start time of the attack, in Unix time in seconds. For more information see <a
     *        href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time of the attack, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     * 
     * @param endTime
     *        The end time of the attack, in Unix time in seconds. For more information see <a
     *        href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the attack, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     * 
     * @return The end time of the attack, in Unix time in seconds. For more information see <a
     *         href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *         >timestamp</a>.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the attack, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     * 
     * @param endTime
     *        The end time of the attack, in Unix time in seconds. For more information see <a
     *        href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackSummary withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The list of attacks for a specified time period.
     * </p>
     * 
     * @return The list of attacks for a specified time period.
     */

    public java.util.List<AttackVectorDescription> getAttackVectors() {
        return attackVectors;
    }

    /**
     * <p>
     * The list of attacks for a specified time period.
     * </p>
     * 
     * @param attackVectors
     *        The list of attacks for a specified time period.
     */

    public void setAttackVectors(java.util.Collection<AttackVectorDescription> attackVectors) {
        if (attackVectors == null) {
            this.attackVectors = null;
            return;
        }

        this.attackVectors = new java.util.ArrayList<AttackVectorDescription>(attackVectors);
    }

    /**
     * <p>
     * The list of attacks for a specified time period.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttackVectors(java.util.Collection)} or {@link #withAttackVectors(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param attackVectors
     *        The list of attacks for a specified time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackSummary withAttackVectors(AttackVectorDescription... attackVectors) {
        if (this.attackVectors == null) {
            setAttackVectors(new java.util.ArrayList<AttackVectorDescription>(attackVectors.length));
        }
        for (AttackVectorDescription ele : attackVectors) {
            this.attackVectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of attacks for a specified time period.
     * </p>
     * 
     * @param attackVectors
     *        The list of attacks for a specified time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackSummary withAttackVectors(java.util.Collection<AttackVectorDescription> attackVectors) {
        setAttackVectors(attackVectors);
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
        if (getAttackId() != null)
            sb.append("AttackId: ").append(getAttackId()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getAttackVectors() != null)
            sb.append("AttackVectors: ").append(getAttackVectors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttackSummary == false)
            return false;
        AttackSummary other = (AttackSummary) obj;
        if (other.getAttackId() == null ^ this.getAttackId() == null)
            return false;
        if (other.getAttackId() != null && other.getAttackId().equals(this.getAttackId()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getAttackVectors() == null ^ this.getAttackVectors() == null)
            return false;
        if (other.getAttackVectors() != null && other.getAttackVectors().equals(this.getAttackVectors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttackId() == null) ? 0 : getAttackId().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getAttackVectors() == null) ? 0 : getAttackVectors().hashCode());
        return hashCode;
    }

    @Override
    public AttackSummary clone() {
        try {
            return (AttackSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.AttackSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
