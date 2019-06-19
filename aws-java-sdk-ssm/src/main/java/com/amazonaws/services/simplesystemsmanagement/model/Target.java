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
 * An array of search criteria that targets instances using a Key,Value combination that you specify.
 * <code>Targets</code> is required if you don't provide one or more instance IDs in the call.
 * </p>
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/Target" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Target implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * User-defined criteria for sending commands that target instances that meet the criteria. <code>Key</code> can be
     * <code>tag:&lt;Amazon EC2 tag&gt;</code> or <code>InstanceIds</code>. For more information about how to send
     * commands that target instances using <code>Key,Value</code> parameters, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-targeting"
     * >Using Targets and Rate Controls to Send Commands to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private String key;
    /**
     * <p>
     * User-defined criteria that maps to <code>Key</code>. For example, if you specified <code>tag:ServerRole</code>,
     * you could specify <code>value:WebServer</code> to run a command on instances that include Amazon EC2 tags of
     * <code>ServerRole,WebServer</code>. For more information about how to send commands that target instances using
     * <code>Key,Value</code> parameters, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Using Targets and
     * Rate Controls to Send Commands to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;

    /**
     * <p>
     * User-defined criteria for sending commands that target instances that meet the criteria. <code>Key</code> can be
     * <code>tag:&lt;Amazon EC2 tag&gt;</code> or <code>InstanceIds</code>. For more information about how to send
     * commands that target instances using <code>Key,Value</code> parameters, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-targeting"
     * >Using Targets and Rate Controls to Send Commands to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param key
     *        User-defined criteria for sending commands that target instances that meet the criteria. <code>Key</code>
     *        can be <code>tag:&lt;Amazon EC2 tag&gt;</code> or <code>InstanceIds</code>. For more information about how
     *        to send commands that target instances using <code>Key,Value</code> parameters, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-targeting"
     *        >Using Targets and Rate Controls to Send Commands to a Fleet</a> in the <i>AWS Systems Manager User
     *        Guide</i>.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * User-defined criteria for sending commands that target instances that meet the criteria. <code>Key</code> can be
     * <code>tag:&lt;Amazon EC2 tag&gt;</code> or <code>InstanceIds</code>. For more information about how to send
     * commands that target instances using <code>Key,Value</code> parameters, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-targeting"
     * >Using Targets and Rate Controls to Send Commands to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @return User-defined criteria for sending commands that target instances that meet the criteria. <code>Key</code>
     *         can be <code>tag:&lt;Amazon EC2 tag&gt;</code> or <code>InstanceIds</code>. For more information about
     *         how to send commands that target instances using <code>Key,Value</code> parameters, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-targeting"
     *         >Using Targets and Rate Controls to Send Commands to a Fleet</a> in the <i>AWS Systems Manager User
     *         Guide</i>.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * User-defined criteria for sending commands that target instances that meet the criteria. <code>Key</code> can be
     * <code>tag:&lt;Amazon EC2 tag&gt;</code> or <code>InstanceIds</code>. For more information about how to send
     * commands that target instances using <code>Key,Value</code> parameters, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-targeting"
     * >Using Targets and Rate Controls to Send Commands to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param key
     *        User-defined criteria for sending commands that target instances that meet the criteria. <code>Key</code>
     *        can be <code>tag:&lt;Amazon EC2 tag&gt;</code> or <code>InstanceIds</code>. For more information about how
     *        to send commands that target instances using <code>Key,Value</code> parameters, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-targeting"
     *        >Using Targets and Rate Controls to Send Commands to a Fleet</a> in the <i>AWS Systems Manager User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * User-defined criteria that maps to <code>Key</code>. For example, if you specified <code>tag:ServerRole</code>,
     * you could specify <code>value:WebServer</code> to run a command on instances that include Amazon EC2 tags of
     * <code>ServerRole,WebServer</code>. For more information about how to send commands that target instances using
     * <code>Key,Value</code> parameters, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Using Targets and
     * Rate Controls to Send Commands to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @return User-defined criteria that maps to <code>Key</code>. For example, if you specified
     *         <code>tag:ServerRole</code>, you could specify <code>value:WebServer</code> to run a command on instances
     *         that include Amazon EC2 tags of <code>ServerRole,WebServer</code>. For more information about how to send
     *         commands that target instances using <code>Key,Value</code> parameters, see <a
     *         href="https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Using
     *         Targets and Rate Controls to Send Commands to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * User-defined criteria that maps to <code>Key</code>. For example, if you specified <code>tag:ServerRole</code>,
     * you could specify <code>value:WebServer</code> to run a command on instances that include Amazon EC2 tags of
     * <code>ServerRole,WebServer</code>. For more information about how to send commands that target instances using
     * <code>Key,Value</code> parameters, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Using Targets and
     * Rate Controls to Send Commands to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param values
     *        User-defined criteria that maps to <code>Key</code>. For example, if you specified
     *        <code>tag:ServerRole</code>, you could specify <code>value:WebServer</code> to run a command on instances
     *        that include Amazon EC2 tags of <code>ServerRole,WebServer</code>. For more information about how to send
     *        commands that target instances using <code>Key,Value</code> parameters, see <a
     *        href="https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Using
     *        Targets and Rate Controls to Send Commands to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new com.amazonaws.internal.SdkInternalList<String>(values);
    }

    /**
     * <p>
     * User-defined criteria that maps to <code>Key</code>. For example, if you specified <code>tag:ServerRole</code>,
     * you could specify <code>value:WebServer</code> to run a command on instances that include Amazon EC2 tags of
     * <code>ServerRole,WebServer</code>. For more information about how to send commands that target instances using
     * <code>Key,Value</code> parameters, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Using Targets and
     * Rate Controls to Send Commands to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        User-defined criteria that maps to <code>Key</code>. For example, if you specified
     *        <code>tag:ServerRole</code>, you could specify <code>value:WebServer</code> to run a command on instances
     *        that include Amazon EC2 tags of <code>ServerRole,WebServer</code>. For more information about how to send
     *        commands that target instances using <code>Key,Value</code> parameters, see <a
     *        href="https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Using
     *        Targets and Rate Controls to Send Commands to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withValues(String... values) {
        if (this.values == null) {
            setValues(new com.amazonaws.internal.SdkInternalList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * User-defined criteria that maps to <code>Key</code>. For example, if you specified <code>tag:ServerRole</code>,
     * you could specify <code>value:WebServer</code> to run a command on instances that include Amazon EC2 tags of
     * <code>ServerRole,WebServer</code>. For more information about how to send commands that target instances using
     * <code>Key,Value</code> parameters, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Using Targets and
     * Rate Controls to Send Commands to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param values
     *        User-defined criteria that maps to <code>Key</code>. For example, if you specified
     *        <code>tag:ServerRole</code>, you could specify <code>value:WebServer</code> to run a command on instances
     *        that include Amazon EC2 tags of <code>ServerRole,WebServer</code>. For more information about how to send
     *        commands that target instances using <code>Key,Value</code> parameters, see <a
     *        href="https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Using
     *        Targets and Rate Controls to Send Commands to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Target == false)
            return false;
        Target other = (Target) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public Target clone() {
        try {
            return (Target) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.TargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
