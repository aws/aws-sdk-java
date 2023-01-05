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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a runtime used by an Amazon Web Services AppSync pipeline resolver or Amazon Web Services AppSync function.
 * Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be
 * specified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/AppSyncRuntime" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppSyncRuntime implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>name</code> of the runtime to use. Currently, the only allowed value is <code>APPSYNC_JS</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The <code>version</code> of the runtime to use. Currently, the only allowed version is <code>1.0.0</code>.
     * </p>
     */
    private String runtimeVersion;

    /**
     * <p>
     * The <code>name</code> of the runtime to use. Currently, the only allowed value is <code>APPSYNC_JS</code>.
     * </p>
     * 
     * @param name
     *        The <code>name</code> of the runtime to use. Currently, the only allowed value is <code>APPSYNC_JS</code>.
     * @see RuntimeName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The <code>name</code> of the runtime to use. Currently, the only allowed value is <code>APPSYNC_JS</code>.
     * </p>
     * 
     * @return The <code>name</code> of the runtime to use. Currently, the only allowed value is <code>APPSYNC_JS</code>
     *         .
     * @see RuntimeName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The <code>name</code> of the runtime to use. Currently, the only allowed value is <code>APPSYNC_JS</code>.
     * </p>
     * 
     * @param name
     *        The <code>name</code> of the runtime to use. Currently, the only allowed value is <code>APPSYNC_JS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuntimeName
     */

    public AppSyncRuntime withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The <code>name</code> of the runtime to use. Currently, the only allowed value is <code>APPSYNC_JS</code>.
     * </p>
     * 
     * @param name
     *        The <code>name</code> of the runtime to use. Currently, the only allowed value is <code>APPSYNC_JS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuntimeName
     */

    public AppSyncRuntime withName(RuntimeName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The <code>version</code> of the runtime to use. Currently, the only allowed version is <code>1.0.0</code>.
     * </p>
     * 
     * @param runtimeVersion
     *        The <code>version</code> of the runtime to use. Currently, the only allowed version is <code>1.0.0</code>.
     */

    public void setRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
    }

    /**
     * <p>
     * The <code>version</code> of the runtime to use. Currently, the only allowed version is <code>1.0.0</code>.
     * </p>
     * 
     * @return The <code>version</code> of the runtime to use. Currently, the only allowed version is <code>1.0.0</code>
     *         .
     */

    public String getRuntimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * <p>
     * The <code>version</code> of the runtime to use. Currently, the only allowed version is <code>1.0.0</code>.
     * </p>
     * 
     * @param runtimeVersion
     *        The <code>version</code> of the runtime to use. Currently, the only allowed version is <code>1.0.0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSyncRuntime withRuntimeVersion(String runtimeVersion) {
        setRuntimeVersion(runtimeVersion);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRuntimeVersion() != null)
            sb.append("RuntimeVersion: ").append(getRuntimeVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppSyncRuntime == false)
            return false;
        AppSyncRuntime other = (AppSyncRuntime) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRuntimeVersion() == null ^ this.getRuntimeVersion() == null)
            return false;
        if (other.getRuntimeVersion() != null && other.getRuntimeVersion().equals(this.getRuntimeVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRuntimeVersion() == null) ? 0 : getRuntimeVersion().hashCode());
        return hashCode;
    }

    @Override
    public AppSyncRuntime clone() {
        try {
            return (AppSyncRuntime) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.AppSyncRuntimeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
