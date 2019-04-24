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
 * A rollback trigger AWS CloudFormation monitors during creation and updating of stacks. If any of the alarms you
 * specify goes to ALARM state during the stack operation or within the specified monitoring period afterwards,
 * CloudFormation rolls back the entire stack operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackTrigger" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RollbackTrigger implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rollback trigger.
     * </p>
     * <p>
     * If a specified trigger is missing, the entire stack operation fails and is rolled back.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The resource type of the rollback trigger. Currently, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html"
     * >AWS::CloudWatch::Alarm</a> is the only supported resource type.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rollback trigger.
     * </p>
     * <p>
     * If a specified trigger is missing, the entire stack operation fails and is rolled back.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the rollback trigger.</p>
     *        <p>
     *        If a specified trigger is missing, the entire stack operation fails and is rolled back.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rollback trigger.
     * </p>
     * <p>
     * If a specified trigger is missing, the entire stack operation fails and is rolled back.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the rollback trigger.</p>
     *         <p>
     *         If a specified trigger is missing, the entire stack operation fails and is rolled back.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rollback trigger.
     * </p>
     * <p>
     * If a specified trigger is missing, the entire stack operation fails and is rolled back.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the rollback trigger.</p>
     *        <p>
     *        If a specified trigger is missing, the entire stack operation fails and is rolled back.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollbackTrigger withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The resource type of the rollback trigger. Currently, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html"
     * >AWS::CloudWatch::Alarm</a> is the only supported resource type.
     * </p>
     * 
     * @param type
     *        The resource type of the rollback trigger. Currently, <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html"
     *        >AWS::CloudWatch::Alarm</a> is the only supported resource type.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The resource type of the rollback trigger. Currently, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html"
     * >AWS::CloudWatch::Alarm</a> is the only supported resource type.
     * </p>
     * 
     * @return The resource type of the rollback trigger. Currently, <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html"
     *         >AWS::CloudWatch::Alarm</a> is the only supported resource type.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The resource type of the rollback trigger. Currently, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html"
     * >AWS::CloudWatch::Alarm</a> is the only supported resource type.
     * </p>
     * 
     * @param type
     *        The resource type of the rollback trigger. Currently, <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html"
     *        >AWS::CloudWatch::Alarm</a> is the only supported resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollbackTrigger withType(String type) {
        setType(type);
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
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RollbackTrigger == false)
            return false;
        RollbackTrigger other = (RollbackTrigger) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public RollbackTrigger clone() {
        try {
            return (RollbackTrigger) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
