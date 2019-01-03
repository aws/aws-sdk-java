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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a filter for Session Manager information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/SessionFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the filter.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The filter value. Valid values for each filter key are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * InvokedAfter: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see
     * sessions that started August 29, 2018, and later.
     * </p>
     * </li>
     * <li>
     * <p>
     * InvokedBefore: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see
     * sessions that started before August 29, 2018.
     * </p>
     * </li>
     * <li>
     * <p>
     * Target: Specify an instance to which session connections have been made.
     * </p>
     * </li>
     * <li>
     * <p>
     * Owner: Specify an AWS user account to see a list of sessions started by that user.
     * </p>
     * </li>
     * <li>
     * <p>
     * Status: Specify a valid session status to see a list of all sessions with that status. Status values you can
     * specify include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Connected
     * </p>
     * </li>
     * <li>
     * <p>
     * Connecting
     * </p>
     * </li>
     * <li>
     * <p>
     * Disconnected
     * </p>
     * </li>
     * <li>
     * <p>
     * Terminated
     * </p>
     * </li>
     * <li>
     * <p>
     * Terminating
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String value;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param key
     *        The name of the filter.
     * @see SessionFilterKey
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @return The name of the filter.
     * @see SessionFilterKey
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param key
     *        The name of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionFilterKey
     */

    public SessionFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param key
     *        The name of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionFilterKey
     */

    public SessionFilter withKey(SessionFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * The filter value. Valid values for each filter key are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * InvokedAfter: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see
     * sessions that started August 29, 2018, and later.
     * </p>
     * </li>
     * <li>
     * <p>
     * InvokedBefore: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see
     * sessions that started before August 29, 2018.
     * </p>
     * </li>
     * <li>
     * <p>
     * Target: Specify an instance to which session connections have been made.
     * </p>
     * </li>
     * <li>
     * <p>
     * Owner: Specify an AWS user account to see a list of sessions started by that user.
     * </p>
     * </li>
     * <li>
     * <p>
     * Status: Specify a valid session status to see a list of all sessions with that status. Status values you can
     * specify include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Connected
     * </p>
     * </li>
     * <li>
     * <p>
     * Connecting
     * </p>
     * </li>
     * <li>
     * <p>
     * Disconnected
     * </p>
     * </li>
     * <li>
     * <p>
     * Terminated
     * </p>
     * </li>
     * <li>
     * <p>
     * Terminating
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param value
     *        The filter value. Valid values for each filter key are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        InvokedAfter: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see
     *        sessions that started August 29, 2018, and later.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        InvokedBefore: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see
     *        sessions that started before August 29, 2018.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Target: Specify an instance to which session connections have been made.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Owner: Specify an AWS user account to see a list of sessions started by that user.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Status: Specify a valid session status to see a list of all sessions with that status. Status values you
     *        can specify include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Connected
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Connecting
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Disconnected
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Terminated
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Terminating
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The filter value. Valid values for each filter key are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * InvokedAfter: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see
     * sessions that started August 29, 2018, and later.
     * </p>
     * </li>
     * <li>
     * <p>
     * InvokedBefore: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see
     * sessions that started before August 29, 2018.
     * </p>
     * </li>
     * <li>
     * <p>
     * Target: Specify an instance to which session connections have been made.
     * </p>
     * </li>
     * <li>
     * <p>
     * Owner: Specify an AWS user account to see a list of sessions started by that user.
     * </p>
     * </li>
     * <li>
     * <p>
     * Status: Specify a valid session status to see a list of all sessions with that status. Status values you can
     * specify include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Connected
     * </p>
     * </li>
     * <li>
     * <p>
     * Connecting
     * </p>
     * </li>
     * <li>
     * <p>
     * Disconnected
     * </p>
     * </li>
     * <li>
     * <p>
     * Terminated
     * </p>
     * </li>
     * <li>
     * <p>
     * Terminating
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The filter value. Valid values for each filter key are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         InvokedAfter: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see
     *         sessions that started August 29, 2018, and later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         InvokedBefore: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to
     *         see sessions that started before August 29, 2018.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Target: Specify an instance to which session connections have been made.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Owner: Specify an AWS user account to see a list of sessions started by that user.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Status: Specify a valid session status to see a list of all sessions with that status. Status values you
     *         can specify include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Connected
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Connecting
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Disconnected
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Terminated
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Terminating
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The filter value. Valid values for each filter key are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * InvokedAfter: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see
     * sessions that started August 29, 2018, and later.
     * </p>
     * </li>
     * <li>
     * <p>
     * InvokedBefore: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see
     * sessions that started before August 29, 2018.
     * </p>
     * </li>
     * <li>
     * <p>
     * Target: Specify an instance to which session connections have been made.
     * </p>
     * </li>
     * <li>
     * <p>
     * Owner: Specify an AWS user account to see a list of sessions started by that user.
     * </p>
     * </li>
     * <li>
     * <p>
     * Status: Specify a valid session status to see a list of all sessions with that status. Status values you can
     * specify include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Connected
     * </p>
     * </li>
     * <li>
     * <p>
     * Connecting
     * </p>
     * </li>
     * <li>
     * <p>
     * Disconnected
     * </p>
     * </li>
     * <li>
     * <p>
     * Terminated
     * </p>
     * </li>
     * <li>
     * <p>
     * Terminating
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param value
     *        The filter value. Valid values for each filter key are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        InvokedAfter: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see
     *        sessions that started August 29, 2018, and later.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        InvokedBefore: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see
     *        sessions that started before August 29, 2018.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Target: Specify an instance to which session connections have been made.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Owner: Specify an AWS user account to see a list of sessions started by that user.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Status: Specify a valid session status to see a list of all sessions with that status. Status values you
     *        can specify include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Connected
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Connecting
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Disconnected
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Terminated
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Terminating
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionFilter withValue(String value) {
        setValue(value);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SessionFilter == false)
            return false;
        SessionFilter other = (SessionFilter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public SessionFilter clone() {
        try {
            return (SessionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.SessionFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
