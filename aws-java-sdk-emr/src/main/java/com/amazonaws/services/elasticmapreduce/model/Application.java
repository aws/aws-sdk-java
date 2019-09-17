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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * With Amazon EMR release version 4.0 and later, the only accepted parameter is the application name. To pass arguments
 * to applications, you use configuration classifications specified using configuration JSON objects. For more
 * information, see <a href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html">Configuring
 * Applications</a>.
 * </p>
 * <p>
 * With earlier Amazon EMR releases, the application is any Amazon or third-party software that you can add to the
 * cluster. This structure contains a list of strings that indicates the software to use with the cluster and accepts a
 * user argument list. Amazon EMR accepts and forwards the argument list to the corresponding installation script as
 * bootstrap action argument.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/Application" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Application implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version of the application.
     * </p>
     */
    private String version;
    /**
     * <p>
     * Arguments for Amazon EMR to pass to the application.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> args;
    /**
     * <p>
     * This option is for advanced users only. This is meta information about third-party applications that third-party
     * vendors use for testing purposes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> additionalInfo;

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param name
     *        The name of the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @return The name of the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param name
     *        The name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @param version
     *        The version of the application.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @return The version of the application.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @param version
     *        The version of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * Arguments for Amazon EMR to pass to the application.
     * </p>
     * 
     * @return Arguments for Amazon EMR to pass to the application.
     */

    public java.util.List<String> getArgs() {
        if (args == null) {
            args = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return args;
    }

    /**
     * <p>
     * Arguments for Amazon EMR to pass to the application.
     * </p>
     * 
     * @param args
     *        Arguments for Amazon EMR to pass to the application.
     */

    public void setArgs(java.util.Collection<String> args) {
        if (args == null) {
            this.args = null;
            return;
        }

        this.args = new com.amazonaws.internal.SdkInternalList<String>(args);
    }

    /**
     * <p>
     * Arguments for Amazon EMR to pass to the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArgs(java.util.Collection)} or {@link #withArgs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param args
     *        Arguments for Amazon EMR to pass to the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withArgs(String... args) {
        if (this.args == null) {
            setArgs(new com.amazonaws.internal.SdkInternalList<String>(args.length));
        }
        for (String ele : args) {
            this.args.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Arguments for Amazon EMR to pass to the application.
     * </p>
     * 
     * @param args
     *        Arguments for Amazon EMR to pass to the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withArgs(java.util.Collection<String> args) {
        setArgs(args);
        return this;
    }

    /**
     * <p>
     * This option is for advanced users only. This is meta information about third-party applications that third-party
     * vendors use for testing purposes.
     * </p>
     * 
     * @return This option is for advanced users only. This is meta information about third-party applications that
     *         third-party vendors use for testing purposes.
     */

    public java.util.Map<String, String> getAdditionalInfo() {
        if (additionalInfo == null) {
            additionalInfo = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return additionalInfo;
    }

    /**
     * <p>
     * This option is for advanced users only. This is meta information about third-party applications that third-party
     * vendors use for testing purposes.
     * </p>
     * 
     * @param additionalInfo
     *        This option is for advanced users only. This is meta information about third-party applications that
     *        third-party vendors use for testing purposes.
     */

    public void setAdditionalInfo(java.util.Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(additionalInfo);
    }

    /**
     * <p>
     * This option is for advanced users only. This is meta information about third-party applications that third-party
     * vendors use for testing purposes.
     * </p>
     * 
     * @param additionalInfo
     *        This option is for advanced users only. This is meta information about third-party applications that
     *        third-party vendors use for testing purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withAdditionalInfo(java.util.Map<String, String> additionalInfo) {
        setAdditionalInfo(additionalInfo);
        return this;
    }

    public Application addAdditionalInfoEntry(String key, String value) {
        if (null == this.additionalInfo) {
            this.additionalInfo = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.additionalInfo.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.additionalInfo.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalInfo.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application clearAdditionalInfoEntries() {
        this.additionalInfo = null;
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getArgs() != null)
            sb.append("Args: ").append(getArgs()).append(",");
        if (getAdditionalInfo() != null)
            sb.append("AdditionalInfo: ").append(getAdditionalInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Application == false)
            return false;
        Application other = (Application) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getArgs() == null ^ this.getArgs() == null)
            return false;
        if (other.getArgs() != null && other.getArgs().equals(this.getArgs()) == false)
            return false;
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null)
            return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getArgs() == null) ? 0 : getArgs().hashCode());
        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        return hashCode;
    }

    @Override
    public Application clone() {
        try {
            return (Application) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.ApplicationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
