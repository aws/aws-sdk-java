/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a set of conditions to be met, and an action to take (<code>RETRY</code> or <code>EXIT</code>) if all
 * conditions are met.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/EvaluateOnExit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluateOnExit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains a glob pattern to match against the <code>StatusReason</code> returned for a job. The pattern can be up
     * to 512 characters long, and can contain letters, numbers, periods (.), colons (:), and white space (including
     * spaces or tabs). It can optionally end with an asterisk (*) so that only the start of the string needs to be an
     * exact match.
     * </p>
     */
    private String onStatusReason;
    /**
     * <p>
     * Contains a glob pattern to match against the <code>Reason</code> returned for a job. The pattern can be up to 512
     * characters long, and can contain letters, numbers, periods (.), colons (:), and white space (including spaces and
     * tabs). It can optionally end with an asterisk (*) so that only the start of the string needs to be an exact
     * match.
     * </p>
     */
    private String onReason;
    /**
     * <p>
     * Contains a glob pattern to match against the decimal representation of the <code>ExitCode</code> returned for a
     * job. The pattern can be up to 512 characters long, can contain only numbers, and can optionally end with an
     * asterisk (*) so that only the start of the string needs to be an exact match.
     * </p>
     */
    private String onExitCode;
    /**
     * <p>
     * Specifies the action to take if all of the specified conditions (<code>onStatusReason</code>,
     * <code>onReason</code>, and <code>onExitCode</code>) are met. The values aren't case sensitive.
     * </p>
     */
    private String action;

    /**
     * <p>
     * Contains a glob pattern to match against the <code>StatusReason</code> returned for a job. The pattern can be up
     * to 512 characters long, and can contain letters, numbers, periods (.), colons (:), and white space (including
     * spaces or tabs). It can optionally end with an asterisk (*) so that only the start of the string needs to be an
     * exact match.
     * </p>
     * 
     * @param onStatusReason
     *        Contains a glob pattern to match against the <code>StatusReason</code> returned for a job. The pattern can
     *        be up to 512 characters long, and can contain letters, numbers, periods (.), colons (:), and white space
     *        (including spaces or tabs). It can optionally end with an asterisk (*) so that only the start of the
     *        string needs to be an exact match.
     */

    public void setOnStatusReason(String onStatusReason) {
        this.onStatusReason = onStatusReason;
    }

    /**
     * <p>
     * Contains a glob pattern to match against the <code>StatusReason</code> returned for a job. The pattern can be up
     * to 512 characters long, and can contain letters, numbers, periods (.), colons (:), and white space (including
     * spaces or tabs). It can optionally end with an asterisk (*) so that only the start of the string needs to be an
     * exact match.
     * </p>
     * 
     * @return Contains a glob pattern to match against the <code>StatusReason</code> returned for a job. The pattern
     *         can be up to 512 characters long, and can contain letters, numbers, periods (.), colons (:), and white
     *         space (including spaces or tabs). It can optionally end with an asterisk (*) so that only the start of
     *         the string needs to be an exact match.
     */

    public String getOnStatusReason() {
        return this.onStatusReason;
    }

    /**
     * <p>
     * Contains a glob pattern to match against the <code>StatusReason</code> returned for a job. The pattern can be up
     * to 512 characters long, and can contain letters, numbers, periods (.), colons (:), and white space (including
     * spaces or tabs). It can optionally end with an asterisk (*) so that only the start of the string needs to be an
     * exact match.
     * </p>
     * 
     * @param onStatusReason
     *        Contains a glob pattern to match against the <code>StatusReason</code> returned for a job. The pattern can
     *        be up to 512 characters long, and can contain letters, numbers, periods (.), colons (:), and white space
     *        (including spaces or tabs). It can optionally end with an asterisk (*) so that only the start of the
     *        string needs to be an exact match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateOnExit withOnStatusReason(String onStatusReason) {
        setOnStatusReason(onStatusReason);
        return this;
    }

    /**
     * <p>
     * Contains a glob pattern to match against the <code>Reason</code> returned for a job. The pattern can be up to 512
     * characters long, and can contain letters, numbers, periods (.), colons (:), and white space (including spaces and
     * tabs). It can optionally end with an asterisk (*) so that only the start of the string needs to be an exact
     * match.
     * </p>
     * 
     * @param onReason
     *        Contains a glob pattern to match against the <code>Reason</code> returned for a job. The pattern can be up
     *        to 512 characters long, and can contain letters, numbers, periods (.), colons (:), and white space
     *        (including spaces and tabs). It can optionally end with an asterisk (*) so that only the start of the
     *        string needs to be an exact match.
     */

    public void setOnReason(String onReason) {
        this.onReason = onReason;
    }

    /**
     * <p>
     * Contains a glob pattern to match against the <code>Reason</code> returned for a job. The pattern can be up to 512
     * characters long, and can contain letters, numbers, periods (.), colons (:), and white space (including spaces and
     * tabs). It can optionally end with an asterisk (*) so that only the start of the string needs to be an exact
     * match.
     * </p>
     * 
     * @return Contains a glob pattern to match against the <code>Reason</code> returned for a job. The pattern can be
     *         up to 512 characters long, and can contain letters, numbers, periods (.), colons (:), and white space
     *         (including spaces and tabs). It can optionally end with an asterisk (*) so that only the start of the
     *         string needs to be an exact match.
     */

    public String getOnReason() {
        return this.onReason;
    }

    /**
     * <p>
     * Contains a glob pattern to match against the <code>Reason</code> returned for a job. The pattern can be up to 512
     * characters long, and can contain letters, numbers, periods (.), colons (:), and white space (including spaces and
     * tabs). It can optionally end with an asterisk (*) so that only the start of the string needs to be an exact
     * match.
     * </p>
     * 
     * @param onReason
     *        Contains a glob pattern to match against the <code>Reason</code> returned for a job. The pattern can be up
     *        to 512 characters long, and can contain letters, numbers, periods (.), colons (:), and white space
     *        (including spaces and tabs). It can optionally end with an asterisk (*) so that only the start of the
     *        string needs to be an exact match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateOnExit withOnReason(String onReason) {
        setOnReason(onReason);
        return this;
    }

    /**
     * <p>
     * Contains a glob pattern to match against the decimal representation of the <code>ExitCode</code> returned for a
     * job. The pattern can be up to 512 characters long, can contain only numbers, and can optionally end with an
     * asterisk (*) so that only the start of the string needs to be an exact match.
     * </p>
     * 
     * @param onExitCode
     *        Contains a glob pattern to match against the decimal representation of the <code>ExitCode</code> returned
     *        for a job. The pattern can be up to 512 characters long, can contain only numbers, and can optionally end
     *        with an asterisk (*) so that only the start of the string needs to be an exact match.
     */

    public void setOnExitCode(String onExitCode) {
        this.onExitCode = onExitCode;
    }

    /**
     * <p>
     * Contains a glob pattern to match against the decimal representation of the <code>ExitCode</code> returned for a
     * job. The pattern can be up to 512 characters long, can contain only numbers, and can optionally end with an
     * asterisk (*) so that only the start of the string needs to be an exact match.
     * </p>
     * 
     * @return Contains a glob pattern to match against the decimal representation of the <code>ExitCode</code> returned
     *         for a job. The pattern can be up to 512 characters long, can contain only numbers, and can optionally end
     *         with an asterisk (*) so that only the start of the string needs to be an exact match.
     */

    public String getOnExitCode() {
        return this.onExitCode;
    }

    /**
     * <p>
     * Contains a glob pattern to match against the decimal representation of the <code>ExitCode</code> returned for a
     * job. The pattern can be up to 512 characters long, can contain only numbers, and can optionally end with an
     * asterisk (*) so that only the start of the string needs to be an exact match.
     * </p>
     * 
     * @param onExitCode
     *        Contains a glob pattern to match against the decimal representation of the <code>ExitCode</code> returned
     *        for a job. The pattern can be up to 512 characters long, can contain only numbers, and can optionally end
     *        with an asterisk (*) so that only the start of the string needs to be an exact match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateOnExit withOnExitCode(String onExitCode) {
        setOnExitCode(onExitCode);
        return this;
    }

    /**
     * <p>
     * Specifies the action to take if all of the specified conditions (<code>onStatusReason</code>,
     * <code>onReason</code>, and <code>onExitCode</code>) are met. The values aren't case sensitive.
     * </p>
     * 
     * @param action
     *        Specifies the action to take if all of the specified conditions (<code>onStatusReason</code>,
     *        <code>onReason</code>, and <code>onExitCode</code>) are met. The values aren't case sensitive.
     * @see RetryAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies the action to take if all of the specified conditions (<code>onStatusReason</code>,
     * <code>onReason</code>, and <code>onExitCode</code>) are met. The values aren't case sensitive.
     * </p>
     * 
     * @return Specifies the action to take if all of the specified conditions (<code>onStatusReason</code>,
     *         <code>onReason</code>, and <code>onExitCode</code>) are met. The values aren't case sensitive.
     * @see RetryAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies the action to take if all of the specified conditions (<code>onStatusReason</code>,
     * <code>onReason</code>, and <code>onExitCode</code>) are met. The values aren't case sensitive.
     * </p>
     * 
     * @param action
     *        Specifies the action to take if all of the specified conditions (<code>onStatusReason</code>,
     *        <code>onReason</code>, and <code>onExitCode</code>) are met. The values aren't case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetryAction
     */

    public EvaluateOnExit withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies the action to take if all of the specified conditions (<code>onStatusReason</code>,
     * <code>onReason</code>, and <code>onExitCode</code>) are met. The values aren't case sensitive.
     * </p>
     * 
     * @param action
     *        Specifies the action to take if all of the specified conditions (<code>onStatusReason</code>,
     *        <code>onReason</code>, and <code>onExitCode</code>) are met. The values aren't case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetryAction
     */

    public EvaluateOnExit withAction(RetryAction action) {
        this.action = action.toString();
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
        if (getOnStatusReason() != null)
            sb.append("OnStatusReason: ").append(getOnStatusReason()).append(",");
        if (getOnReason() != null)
            sb.append("OnReason: ").append(getOnReason()).append(",");
        if (getOnExitCode() != null)
            sb.append("OnExitCode: ").append(getOnExitCode()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluateOnExit == false)
            return false;
        EvaluateOnExit other = (EvaluateOnExit) obj;
        if (other.getOnStatusReason() == null ^ this.getOnStatusReason() == null)
            return false;
        if (other.getOnStatusReason() != null && other.getOnStatusReason().equals(this.getOnStatusReason()) == false)
            return false;
        if (other.getOnReason() == null ^ this.getOnReason() == null)
            return false;
        if (other.getOnReason() != null && other.getOnReason().equals(this.getOnReason()) == false)
            return false;
        if (other.getOnExitCode() == null ^ this.getOnExitCode() == null)
            return false;
        if (other.getOnExitCode() != null && other.getOnExitCode().equals(this.getOnExitCode()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOnStatusReason() == null) ? 0 : getOnStatusReason().hashCode());
        hashCode = prime * hashCode + ((getOnReason() == null) ? 0 : getOnReason().hashCode());
        hashCode = prime * hashCode + ((getOnExitCode() == null) ? 0 : getOnExitCode().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public EvaluateOnExit clone() {
        try {
            return (EvaluateOnExit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.EvaluateOnExitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
