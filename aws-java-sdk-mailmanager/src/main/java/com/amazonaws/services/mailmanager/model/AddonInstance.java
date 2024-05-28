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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An Add On instance represents a specific configuration of an Add On.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/AddonInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddonInstance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Add On instance.
     * </p>
     */
    private String addonInstanceArn;
    /**
     * <p>
     * The unique ID of the Add On instance.
     * </p>
     */
    private String addonInstanceId;
    /**
     * <p>
     * The name of the Add On for the instance.
     * </p>
     */
    private String addonName;
    /**
     * <p>
     * The subscription ID for the instance.
     * </p>
     */
    private String addonSubscriptionId;
    /**
     * <p>
     * The timestamp of when the Add On instance was created.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Add On instance.
     * </p>
     * 
     * @param addonInstanceArn
     *        The Amazon Resource Name (ARN) of the Add On instance.
     */

    public void setAddonInstanceArn(String addonInstanceArn) {
        this.addonInstanceArn = addonInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Add On instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Add On instance.
     */

    public String getAddonInstanceArn() {
        return this.addonInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Add On instance.
     * </p>
     * 
     * @param addonInstanceArn
     *        The Amazon Resource Name (ARN) of the Add On instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonInstance withAddonInstanceArn(String addonInstanceArn) {
        setAddonInstanceArn(addonInstanceArn);
        return this;
    }

    /**
     * <p>
     * The unique ID of the Add On instance.
     * </p>
     * 
     * @param addonInstanceId
     *        The unique ID of the Add On instance.
     */

    public void setAddonInstanceId(String addonInstanceId) {
        this.addonInstanceId = addonInstanceId;
    }

    /**
     * <p>
     * The unique ID of the Add On instance.
     * </p>
     * 
     * @return The unique ID of the Add On instance.
     */

    public String getAddonInstanceId() {
        return this.addonInstanceId;
    }

    /**
     * <p>
     * The unique ID of the Add On instance.
     * </p>
     * 
     * @param addonInstanceId
     *        The unique ID of the Add On instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonInstance withAddonInstanceId(String addonInstanceId) {
        setAddonInstanceId(addonInstanceId);
        return this;
    }

    /**
     * <p>
     * The name of the Add On for the instance.
     * </p>
     * 
     * @param addonName
     *        The name of the Add On for the instance.
     */

    public void setAddonName(String addonName) {
        this.addonName = addonName;
    }

    /**
     * <p>
     * The name of the Add On for the instance.
     * </p>
     * 
     * @return The name of the Add On for the instance.
     */

    public String getAddonName() {
        return this.addonName;
    }

    /**
     * <p>
     * The name of the Add On for the instance.
     * </p>
     * 
     * @param addonName
     *        The name of the Add On for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonInstance withAddonName(String addonName) {
        setAddonName(addonName);
        return this;
    }

    /**
     * <p>
     * The subscription ID for the instance.
     * </p>
     * 
     * @param addonSubscriptionId
     *        The subscription ID for the instance.
     */

    public void setAddonSubscriptionId(String addonSubscriptionId) {
        this.addonSubscriptionId = addonSubscriptionId;
    }

    /**
     * <p>
     * The subscription ID for the instance.
     * </p>
     * 
     * @return The subscription ID for the instance.
     */

    public String getAddonSubscriptionId() {
        return this.addonSubscriptionId;
    }

    /**
     * <p>
     * The subscription ID for the instance.
     * </p>
     * 
     * @param addonSubscriptionId
     *        The subscription ID for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonInstance withAddonSubscriptionId(String addonSubscriptionId) {
        setAddonSubscriptionId(addonSubscriptionId);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the Add On instance was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp of when the Add On instance was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the Add On instance was created.
     * </p>
     * 
     * @return The timestamp of when the Add On instance was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the Add On instance was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp of when the Add On instance was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonInstance withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
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
        if (getAddonInstanceArn() != null)
            sb.append("AddonInstanceArn: ").append(getAddonInstanceArn()).append(",");
        if (getAddonInstanceId() != null)
            sb.append("AddonInstanceId: ").append(getAddonInstanceId()).append(",");
        if (getAddonName() != null)
            sb.append("AddonName: ").append(getAddonName()).append(",");
        if (getAddonSubscriptionId() != null)
            sb.append("AddonSubscriptionId: ").append(getAddonSubscriptionId()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddonInstance == false)
            return false;
        AddonInstance other = (AddonInstance) obj;
        if (other.getAddonInstanceArn() == null ^ this.getAddonInstanceArn() == null)
            return false;
        if (other.getAddonInstanceArn() != null && other.getAddonInstanceArn().equals(this.getAddonInstanceArn()) == false)
            return false;
        if (other.getAddonInstanceId() == null ^ this.getAddonInstanceId() == null)
            return false;
        if (other.getAddonInstanceId() != null && other.getAddonInstanceId().equals(this.getAddonInstanceId()) == false)
            return false;
        if (other.getAddonName() == null ^ this.getAddonName() == null)
            return false;
        if (other.getAddonName() != null && other.getAddonName().equals(this.getAddonName()) == false)
            return false;
        if (other.getAddonSubscriptionId() == null ^ this.getAddonSubscriptionId() == null)
            return false;
        if (other.getAddonSubscriptionId() != null && other.getAddonSubscriptionId().equals(this.getAddonSubscriptionId()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddonInstanceArn() == null) ? 0 : getAddonInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getAddonInstanceId() == null) ? 0 : getAddonInstanceId().hashCode());
        hashCode = prime * hashCode + ((getAddonName() == null) ? 0 : getAddonName().hashCode());
        hashCode = prime * hashCode + ((getAddonSubscriptionId() == null) ? 0 : getAddonSubscriptionId().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public AddonInstance clone() {
        try {
            return (AddonInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.AddonInstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
