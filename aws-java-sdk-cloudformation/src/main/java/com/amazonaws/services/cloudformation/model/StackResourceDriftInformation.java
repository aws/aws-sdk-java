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
 * Contains information about whether the resource's actual configuration differs, or has <i>drifted</i>, from its
 * expected configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StackResourceDriftInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackResourceDriftInformation implements Serializable, Cloneable {

    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected configuration in that it has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: The resource differs from its expected configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the resource differs from its expected
     * configuration.
     * </p>
     * <p>
     * Any resources that do not currently support drift detection have a status of <code>NOT_CHECKED</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its expected configuration.
     * </p>
     * </li>
     * </ul>
     */
    private String stackResourceDriftStatus;
    /**
     * <p>
     * When AWS CloudFormation last checked if the resource had drifted from its expected configuration.
     * </p>
     */
    private java.util.Date lastCheckTimestamp;

    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected configuration in that it has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: The resource differs from its expected configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the resource differs from its expected
     * configuration.
     * </p>
     * <p>
     * Any resources that do not currently support drift detection have a status of <code>NOT_CHECKED</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its expected configuration.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stackResourceDriftStatus
     *        Status of the resource's actual configuration compared to its expected configuration</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETED</code>: The resource differs from its expected configuration in that it has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFIED</code>: The resource differs from its expected configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the resource differs from its expected
     *        configuration.
     *        </p>
     *        <p>
     *        Any resources that do not currently support drift detection have a status of <code>NOT_CHECKED</code>. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     *        >Resources that Support Drift Detection</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The resources's actual configuration matches its expected configuration.
     *        </p>
     *        </li>
     * @see StackResourceDriftStatus
     */

    public void setStackResourceDriftStatus(String stackResourceDriftStatus) {
        this.stackResourceDriftStatus = stackResourceDriftStatus;
    }

    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected configuration in that it has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: The resource differs from its expected configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the resource differs from its expected
     * configuration.
     * </p>
     * <p>
     * Any resources that do not currently support drift detection have a status of <code>NOT_CHECKED</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its expected configuration.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Status of the resource's actual configuration compared to its expected configuration</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DELETED</code>: The resource differs from its expected configuration in that it has been deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MODIFIED</code>: The resource differs from its expected configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the resource differs from its expected
     *         configuration.
     *         </p>
     *         <p>
     *         Any resources that do not currently support drift detection have a status of <code>NOT_CHECKED</code>.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     *         >Resources that Support Drift Detection</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_SYNC</code>: The resources's actual configuration matches its expected configuration.
     *         </p>
     *         </li>
     * @see StackResourceDriftStatus
     */

    public String getStackResourceDriftStatus() {
        return this.stackResourceDriftStatus;
    }

    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected configuration in that it has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: The resource differs from its expected configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the resource differs from its expected
     * configuration.
     * </p>
     * <p>
     * Any resources that do not currently support drift detection have a status of <code>NOT_CHECKED</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its expected configuration.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stackResourceDriftStatus
     *        Status of the resource's actual configuration compared to its expected configuration</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETED</code>: The resource differs from its expected configuration in that it has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFIED</code>: The resource differs from its expected configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the resource differs from its expected
     *        configuration.
     *        </p>
     *        <p>
     *        Any resources that do not currently support drift detection have a status of <code>NOT_CHECKED</code>. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     *        >Resources that Support Drift Detection</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The resources's actual configuration matches its expected configuration.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackResourceDriftStatus
     */

    public StackResourceDriftInformation withStackResourceDriftStatus(String stackResourceDriftStatus) {
        setStackResourceDriftStatus(stackResourceDriftStatus);
        return this;
    }

    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected configuration in that it has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: The resource differs from its expected configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the resource differs from its expected
     * configuration.
     * </p>
     * <p>
     * Any resources that do not currently support drift detection have a status of <code>NOT_CHECKED</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its expected configuration.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stackResourceDriftStatus
     *        Status of the resource's actual configuration compared to its expected configuration</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETED</code>: The resource differs from its expected configuration in that it has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFIED</code>: The resource differs from its expected configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the resource differs from its expected
     *        configuration.
     *        </p>
     *        <p>
     *        Any resources that do not currently support drift detection have a status of <code>NOT_CHECKED</code>. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     *        >Resources that Support Drift Detection</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The resources's actual configuration matches its expected configuration.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackResourceDriftStatus
     */

    public StackResourceDriftInformation withStackResourceDriftStatus(StackResourceDriftStatus stackResourceDriftStatus) {
        this.stackResourceDriftStatus = stackResourceDriftStatus.toString();
        return this;
    }

    /**
     * <p>
     * When AWS CloudFormation last checked if the resource had drifted from its expected configuration.
     * </p>
     * 
     * @param lastCheckTimestamp
     *        When AWS CloudFormation last checked if the resource had drifted from its expected configuration.
     */

    public void setLastCheckTimestamp(java.util.Date lastCheckTimestamp) {
        this.lastCheckTimestamp = lastCheckTimestamp;
    }

    /**
     * <p>
     * When AWS CloudFormation last checked if the resource had drifted from its expected configuration.
     * </p>
     * 
     * @return When AWS CloudFormation last checked if the resource had drifted from its expected configuration.
     */

    public java.util.Date getLastCheckTimestamp() {
        return this.lastCheckTimestamp;
    }

    /**
     * <p>
     * When AWS CloudFormation last checked if the resource had drifted from its expected configuration.
     * </p>
     * 
     * @param lastCheckTimestamp
     *        When AWS CloudFormation last checked if the resource had drifted from its expected configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackResourceDriftInformation withLastCheckTimestamp(java.util.Date lastCheckTimestamp) {
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
        if (getStackResourceDriftStatus() != null)
            sb.append("StackResourceDriftStatus: ").append(getStackResourceDriftStatus()).append(",");
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

        if (obj instanceof StackResourceDriftInformation == false)
            return false;
        StackResourceDriftInformation other = (StackResourceDriftInformation) obj;
        if (other.getStackResourceDriftStatus() == null ^ this.getStackResourceDriftStatus() == null)
            return false;
        if (other.getStackResourceDriftStatus() != null && other.getStackResourceDriftStatus().equals(this.getStackResourceDriftStatus()) == false)
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

        hashCode = prime * hashCode + ((getStackResourceDriftStatus() == null) ? 0 : getStackResourceDriftStatus().hashCode());
        hashCode = prime * hashCode + ((getLastCheckTimestamp() == null) ? 0 : getLastCheckTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public StackResourceDriftInformation clone() {
        try {
            return (StackResourceDriftInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
