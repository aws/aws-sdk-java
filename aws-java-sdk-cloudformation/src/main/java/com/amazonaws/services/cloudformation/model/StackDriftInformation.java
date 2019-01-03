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
 * Contains information about whether the stack's actual configuration differs, or has <i>drifted</i>, from its expected
 * configuration, as defined in the stack template and any values specified as template parameters. A stack is
 * considered to have drifted if one or more of its resources have drifted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StackDriftInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackDriftInformation implements Serializable, Cloneable {

    /**
     * <p>
     * Status of the stack's actual configuration compared to its expected template configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The stack differs from its expected template configuration. A stack is considered to have
     * drifted if one or more of its resources have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the stack differs from its expected template
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The stack's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     */
    private String stackDriftStatus;
    /**
     * <p>
     * Most recent time when a drift detection operation was initiated on the stack, or any of its individual resources
     * that support drift detection.
     * </p>
     */
    private java.util.Date lastCheckTimestamp;

    /**
     * <p>
     * Status of the stack's actual configuration compared to its expected template configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The stack differs from its expected template configuration. A stack is considered to have
     * drifted if one or more of its resources have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the stack differs from its expected template
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The stack's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stackDriftStatus
     *        Status of the stack's actual configuration compared to its expected template configuration. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DRIFTED</code>: The stack differs from its expected template configuration. A stack is considered to
     *        have drifted if one or more of its resources have drifted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the stack differs from its expected
     *        template configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The stack's actual configuration matches its expected template configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNKNOWN</code>: This value is reserved for future use.
     *        </p>
     *        </li>
     * @see StackDriftStatus
     */

    public void setStackDriftStatus(String stackDriftStatus) {
        this.stackDriftStatus = stackDriftStatus;
    }

    /**
     * <p>
     * Status of the stack's actual configuration compared to its expected template configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The stack differs from its expected template configuration. A stack is considered to have
     * drifted if one or more of its resources have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the stack differs from its expected template
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The stack's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Status of the stack's actual configuration compared to its expected template configuration. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DRIFTED</code>: The stack differs from its expected template configuration. A stack is considered
     *         to have drifted if one or more of its resources have drifted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the stack differs from its expected
     *         template configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_SYNC</code>: The stack's actual configuration matches its expected template configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNKNOWN</code>: This value is reserved for future use.
     *         </p>
     *         </li>
     * @see StackDriftStatus
     */

    public String getStackDriftStatus() {
        return this.stackDriftStatus;
    }

    /**
     * <p>
     * Status of the stack's actual configuration compared to its expected template configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The stack differs from its expected template configuration. A stack is considered to have
     * drifted if one or more of its resources have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the stack differs from its expected template
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The stack's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stackDriftStatus
     *        Status of the stack's actual configuration compared to its expected template configuration. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DRIFTED</code>: The stack differs from its expected template configuration. A stack is considered to
     *        have drifted if one or more of its resources have drifted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the stack differs from its expected
     *        template configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The stack's actual configuration matches its expected template configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNKNOWN</code>: This value is reserved for future use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackDriftStatus
     */

    public StackDriftInformation withStackDriftStatus(String stackDriftStatus) {
        setStackDriftStatus(stackDriftStatus);
        return this;
    }

    /**
     * <p>
     * Status of the stack's actual configuration compared to its expected template configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The stack differs from its expected template configuration. A stack is considered to have
     * drifted if one or more of its resources have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the stack differs from its expected template
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The stack's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stackDriftStatus
     *        Status of the stack's actual configuration compared to its expected template configuration. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DRIFTED</code>: The stack differs from its expected template configuration. A stack is considered to
     *        have drifted if one or more of its resources have drifted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the stack differs from its expected
     *        template configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The stack's actual configuration matches its expected template configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNKNOWN</code>: This value is reserved for future use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackDriftStatus
     */

    public StackDriftInformation withStackDriftStatus(StackDriftStatus stackDriftStatus) {
        this.stackDriftStatus = stackDriftStatus.toString();
        return this;
    }

    /**
     * <p>
     * Most recent time when a drift detection operation was initiated on the stack, or any of its individual resources
     * that support drift detection.
     * </p>
     * 
     * @param lastCheckTimestamp
     *        Most recent time when a drift detection operation was initiated on the stack, or any of its individual
     *        resources that support drift detection.
     */

    public void setLastCheckTimestamp(java.util.Date lastCheckTimestamp) {
        this.lastCheckTimestamp = lastCheckTimestamp;
    }

    /**
     * <p>
     * Most recent time when a drift detection operation was initiated on the stack, or any of its individual resources
     * that support drift detection.
     * </p>
     * 
     * @return Most recent time when a drift detection operation was initiated on the stack, or any of its individual
     *         resources that support drift detection.
     */

    public java.util.Date getLastCheckTimestamp() {
        return this.lastCheckTimestamp;
    }

    /**
     * <p>
     * Most recent time when a drift detection operation was initiated on the stack, or any of its individual resources
     * that support drift detection.
     * </p>
     * 
     * @param lastCheckTimestamp
     *        Most recent time when a drift detection operation was initiated on the stack, or any of its individual
     *        resources that support drift detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackDriftInformation withLastCheckTimestamp(java.util.Date lastCheckTimestamp) {
        setLastCheckTimestamp(lastCheckTimestamp);
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
        if (getStackDriftStatus() != null)
            sb.append("StackDriftStatus: ").append(getStackDriftStatus()).append(",");
        if (getLastCheckTimestamp() != null)
            sb.append("LastCheckTimestamp: ").append(getLastCheckTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackDriftInformation == false)
            return false;
        StackDriftInformation other = (StackDriftInformation) obj;
        if (other.getStackDriftStatus() == null ^ this.getStackDriftStatus() == null)
            return false;
        if (other.getStackDriftStatus() != null && other.getStackDriftStatus().equals(this.getStackDriftStatus()) == false)
            return false;
        if (other.getLastCheckTimestamp() == null ^ this.getLastCheckTimestamp() == null)
            return false;
        if (other.getLastCheckTimestamp() != null && other.getLastCheckTimestamp().equals(this.getLastCheckTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackDriftStatus() == null) ? 0 : getStackDriftStatus().hashCode());
        hashCode = prime * hashCode + ((getLastCheckTimestamp() == null) ? 0 : getLastCheckTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public StackDriftInformation clone() {
        try {
            return (StackDriftInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
