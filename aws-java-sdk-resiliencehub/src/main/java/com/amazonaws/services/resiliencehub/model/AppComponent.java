/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines an Application Component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/AppComponent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppComponent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one
     * associated account.
     * </p>
     * <p>
     * Key: <code>"failover-regions"</code>
     * </p>
     * <p>
     * Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     * </p>
     * </note>
     */
    private java.util.Map<String, java.util.List<String>> additionalInfo;
    /**
     * <p>
     * Identifier of the Application Component.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Name of the Application Component.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of Application Component.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one
     * associated account.
     * </p>
     * <p>
     * Key: <code>"failover-regions"</code>
     * </p>
     * <p>
     * Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     * </p>
     * </note>
     * 
     * @return Additional configuration parameters for an Resilience Hub application. If you want to implement
     *         <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     *         href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     *         application configuration parameters</a>.</p> <note>
     *         <p>
     *         Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region
     *         and one associated account.
     *         </p>
     *         <p>
     *         Key: <code>"failover-regions"</code>
     *         </p>
     *         <p>
     *         Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     *         </p>
     */

    public java.util.Map<String, java.util.List<String>> getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one
     * associated account.
     * </p>
     * <p>
     * Key: <code>"failover-regions"</code>
     * </p>
     * <p>
     * Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     * </p>
     * </note>
     * 
     * @param additionalInfo
     *        Additional configuration parameters for an Resilience Hub application. If you want to implement
     *        <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     *        href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     *        application configuration parameters</a>.</p> <note>
     *        <p>
     *        Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and
     *        one associated account.
     *        </p>
     *        <p>
     *        Key: <code>"failover-regions"</code>
     *        </p>
     *        <p>
     *        Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     *        </p>
     */

    public void setAdditionalInfo(java.util.Map<String, java.util.List<String>> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one
     * associated account.
     * </p>
     * <p>
     * Key: <code>"failover-regions"</code>
     * </p>
     * <p>
     * Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     * </p>
     * </note>
     * 
     * @param additionalInfo
     *        Additional configuration parameters for an Resilience Hub application. If you want to implement
     *        <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     *        href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     *        application configuration parameters</a>.</p> <note>
     *        <p>
     *        Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and
     *        one associated account.
     *        </p>
     *        <p>
     *        Key: <code>"failover-regions"</code>
     *        </p>
     *        <p>
     *        Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppComponent withAdditionalInfo(java.util.Map<String, java.util.List<String>> additionalInfo) {
        setAdditionalInfo(additionalInfo);
        return this;
    }

    /**
     * Add a single AdditionalInfo entry
     *
     * @see AppComponent#withAdditionalInfo
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AppComponent addAdditionalInfoEntry(String key, java.util.List<String> value) {
        if (null == this.additionalInfo) {
            this.additionalInfo = new java.util.HashMap<String, java.util.List<String>>();
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

    public AppComponent clearAdditionalInfoEntries() {
        this.additionalInfo = null;
        return this;
    }

    /**
     * <p>
     * Identifier of the Application Component.
     * </p>
     * 
     * @param id
     *        Identifier of the Application Component.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Identifier of the Application Component.
     * </p>
     * 
     * @return Identifier of the Application Component.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Identifier of the Application Component.
     * </p>
     * 
     * @param id
     *        Identifier of the Application Component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppComponent withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Name of the Application Component.
     * </p>
     * 
     * @param name
     *        Name of the Application Component.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the Application Component.
     * </p>
     * 
     * @return Name of the Application Component.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the Application Component.
     * </p>
     * 
     * @param name
     *        Name of the Application Component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppComponent withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of Application Component.
     * </p>
     * 
     * @param type
     *        The type of Application Component.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of Application Component.
     * </p>
     * 
     * @return The type of Application Component.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of Application Component.
     * </p>
     * 
     * @param type
     *        The type of Application Component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppComponent withType(String type) {
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
        if (getAdditionalInfo() != null)
            sb.append("AdditionalInfo: ").append(getAdditionalInfo()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof AppComponent == false)
            return false;
        AppComponent other = (AppComponent) obj;
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null)
            return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AppComponent clone() {
        try {
            return (AppComponent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.AppComponentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
