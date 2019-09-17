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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Specifies the user and group whose permissions are used when running the Lambda function. You can specify one or both
 * values to override the default values. We recommend that you avoid running as root unless absolutely necessary to
 * minimize the risk of unintended changes or malicious attacks. To run as root, you must set ''IsolationMode'' to
 * ''NoContainer'' and update config.json in ''greengrass-root/config'' to set ''allowFunctionsToRunAsRoot'' to ''yes''.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/FunctionRunAsConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunctionRunAsConfig implements Serializable, Cloneable, StructuredPojo {

    /** The group ID whose permissions are used to run a Lambda function. */
    private Integer gid;
    /** The user ID whose permissions are used to run a Lambda function. */
    private Integer uid;

    /**
     * The group ID whose permissions are used to run a Lambda function.
     * 
     * @param gid
     *        The group ID whose permissions are used to run a Lambda function.
     */

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    /**
     * The group ID whose permissions are used to run a Lambda function.
     * 
     * @return The group ID whose permissions are used to run a Lambda function.
     */

    public Integer getGid() {
        return this.gid;
    }

    /**
     * The group ID whose permissions are used to run a Lambda function.
     * 
     * @param gid
     *        The group ID whose permissions are used to run a Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionRunAsConfig withGid(Integer gid) {
        setGid(gid);
        return this;
    }

    /**
     * The user ID whose permissions are used to run a Lambda function.
     * 
     * @param uid
     *        The user ID whose permissions are used to run a Lambda function.
     */

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * The user ID whose permissions are used to run a Lambda function.
     * 
     * @return The user ID whose permissions are used to run a Lambda function.
     */

    public Integer getUid() {
        return this.uid;
    }

    /**
     * The user ID whose permissions are used to run a Lambda function.
     * 
     * @param uid
     *        The user ID whose permissions are used to run a Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionRunAsConfig withUid(Integer uid) {
        setUid(uid);
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
        if (getGid() != null)
            sb.append("Gid: ").append(getGid()).append(",");
        if (getUid() != null)
            sb.append("Uid: ").append(getUid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FunctionRunAsConfig == false)
            return false;
        FunctionRunAsConfig other = (FunctionRunAsConfig) obj;
        if (other.getGid() == null ^ this.getGid() == null)
            return false;
        if (other.getGid() != null && other.getGid().equals(this.getGid()) == false)
            return false;
        if (other.getUid() == null ^ this.getUid() == null)
            return false;
        if (other.getUid() != null && other.getUid().equals(this.getUid()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGid() == null) ? 0 : getGid().hashCode());
        hashCode = prime * hashCode + ((getUid() == null) ? 0 : getUid().hashCode());
        return hashCode;
    }

    @Override
    public FunctionRunAsConfig clone() {
        try {
            return (FunctionRunAsConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.FunctionRunAsConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
