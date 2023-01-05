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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Amazon Security Lake collects logs and events from supported Amazon Web Services and custom sources. For the list of
 * supported Amazon Web Services, see the <a
 * href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security Lake User
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/AccountSources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountSources implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Security Lake account for which logs are collected.
     * </p>
     */
    private String account;
    /**
     * <p>
     * Initializes a new instance of the Event class.
     * </p>
     */
    private String eventClass;
    /**
     * <p>
     * The log status for the Security Lake account.
     * </p>
     */
    private java.util.List<LogsStatus> logsStatus;
    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. Amazon Security Lake supports log and
     * event collection for natively supported Amazon Web Services.
     * </p>
     */
    private String sourceType;

    /**
     * <p>
     * The ID of the Security Lake account for which logs are collected.
     * </p>
     * 
     * @param account
     *        The ID of the Security Lake account for which logs are collected.
     */

    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>
     * The ID of the Security Lake account for which logs are collected.
     * </p>
     * 
     * @return The ID of the Security Lake account for which logs are collected.
     */

    public String getAccount() {
        return this.account;
    }

    /**
     * <p>
     * The ID of the Security Lake account for which logs are collected.
     * </p>
     * 
     * @param account
     *        The ID of the Security Lake account for which logs are collected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountSources withAccount(String account) {
        setAccount(account);
        return this;
    }

    /**
     * <p>
     * Initializes a new instance of the Event class.
     * </p>
     * 
     * @param eventClass
     *        Initializes a new instance of the Event class.
     * @see OcsfEventClass
     */

    public void setEventClass(String eventClass) {
        this.eventClass = eventClass;
    }

    /**
     * <p>
     * Initializes a new instance of the Event class.
     * </p>
     * 
     * @return Initializes a new instance of the Event class.
     * @see OcsfEventClass
     */

    public String getEventClass() {
        return this.eventClass;
    }

    /**
     * <p>
     * Initializes a new instance of the Event class.
     * </p>
     * 
     * @param eventClass
     *        Initializes a new instance of the Event class.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OcsfEventClass
     */

    public AccountSources withEventClass(String eventClass) {
        setEventClass(eventClass);
        return this;
    }

    /**
     * <p>
     * Initializes a new instance of the Event class.
     * </p>
     * 
     * @param eventClass
     *        Initializes a new instance of the Event class.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OcsfEventClass
     */

    public AccountSources withEventClass(OcsfEventClass eventClass) {
        this.eventClass = eventClass.toString();
        return this;
    }

    /**
     * <p>
     * The log status for the Security Lake account.
     * </p>
     * 
     * @return The log status for the Security Lake account.
     */

    public java.util.List<LogsStatus> getLogsStatus() {
        return logsStatus;
    }

    /**
     * <p>
     * The log status for the Security Lake account.
     * </p>
     * 
     * @param logsStatus
     *        The log status for the Security Lake account.
     */

    public void setLogsStatus(java.util.Collection<LogsStatus> logsStatus) {
        if (logsStatus == null) {
            this.logsStatus = null;
            return;
        }

        this.logsStatus = new java.util.ArrayList<LogsStatus>(logsStatus);
    }

    /**
     * <p>
     * The log status for the Security Lake account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogsStatus(java.util.Collection)} or {@link #withLogsStatus(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param logsStatus
     *        The log status for the Security Lake account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountSources withLogsStatus(LogsStatus... logsStatus) {
        if (this.logsStatus == null) {
            setLogsStatus(new java.util.ArrayList<LogsStatus>(logsStatus.length));
        }
        for (LogsStatus ele : logsStatus) {
            this.logsStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The log status for the Security Lake account.
     * </p>
     * 
     * @param logsStatus
     *        The log status for the Security Lake account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountSources withLogsStatus(java.util.Collection<LogsStatus> logsStatus) {
        setLogsStatus(logsStatus);
        return this;
    }

    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. Amazon Security Lake supports log and
     * event collection for natively supported Amazon Web Services.
     * </p>
     * 
     * @param sourceType
     *        The supported Amazon Web Services from which logs and events are collected. Amazon Security Lake supports
     *        log and event collection for natively supported Amazon Web Services.
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. Amazon Security Lake supports log and
     * event collection for natively supported Amazon Web Services.
     * </p>
     * 
     * @return The supported Amazon Web Services from which logs and events are collected. Amazon Security Lake supports
     *         log and event collection for natively supported Amazon Web Services.
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. Amazon Security Lake supports log and
     * event collection for natively supported Amazon Web Services.
     * </p>
     * 
     * @param sourceType
     *        The supported Amazon Web Services from which logs and events are collected. Amazon Security Lake supports
     *        log and event collection for natively supported Amazon Web Services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountSources withSourceType(String sourceType) {
        setSourceType(sourceType);
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
        if (getAccount() != null)
            sb.append("Account: ").append(getAccount()).append(",");
        if (getEventClass() != null)
            sb.append("EventClass: ").append(getEventClass()).append(",");
        if (getLogsStatus() != null)
            sb.append("LogsStatus: ").append(getLogsStatus()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountSources == false)
            return false;
        AccountSources other = (AccountSources) obj;
        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        if (other.getEventClass() == null ^ this.getEventClass() == null)
            return false;
        if (other.getEventClass() != null && other.getEventClass().equals(this.getEventClass()) == false)
            return false;
        if (other.getLogsStatus() == null ^ this.getLogsStatus() == null)
            return false;
        if (other.getLogsStatus() != null && other.getLogsStatus().equals(this.getLogsStatus()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        hashCode = prime * hashCode + ((getEventClass() == null) ? 0 : getEventClass().hashCode());
        hashCode = prime * hashCode + ((getLogsStatus() == null) ? 0 : getLogsStatus().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        return hashCode;
    }

    @Override
    public AccountSources clone() {
        try {
            return (AccountSources) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.AccountSourcesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
