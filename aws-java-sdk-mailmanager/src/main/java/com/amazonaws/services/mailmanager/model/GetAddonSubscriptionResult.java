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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetAddonSubscription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAddonSubscriptionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Add On for the subscription.
     * </p>
     */
    private String addonName;
    /**
     * <p>
     * Amazon Resource Name (ARN) for the subscription.
     * </p>
     */
    private String addonSubscriptionArn;
    /**
     * <p>
     * The timestamp of when the Add On subscription was created.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The name of the Add On for the subscription.
     * </p>
     * 
     * @param addonName
     *        The name of the Add On for the subscription.
     */

    public void setAddonName(String addonName) {
        this.addonName = addonName;
    }

    /**
     * <p>
     * The name of the Add On for the subscription.
     * </p>
     * 
     * @return The name of the Add On for the subscription.
     */

    public String getAddonName() {
        return this.addonName;
    }

    /**
     * <p>
     * The name of the Add On for the subscription.
     * </p>
     * 
     * @param addonName
     *        The name of the Add On for the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAddonSubscriptionResult withAddonName(String addonName) {
        setAddonName(addonName);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) for the subscription.
     * </p>
     * 
     * @param addonSubscriptionArn
     *        Amazon Resource Name (ARN) for the subscription.
     */

    public void setAddonSubscriptionArn(String addonSubscriptionArn) {
        this.addonSubscriptionArn = addonSubscriptionArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) for the subscription.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) for the subscription.
     */

    public String getAddonSubscriptionArn() {
        return this.addonSubscriptionArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) for the subscription.
     * </p>
     * 
     * @param addonSubscriptionArn
     *        Amazon Resource Name (ARN) for the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAddonSubscriptionResult withAddonSubscriptionArn(String addonSubscriptionArn) {
        setAddonSubscriptionArn(addonSubscriptionArn);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the Add On subscription was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp of when the Add On subscription was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the Add On subscription was created.
     * </p>
     * 
     * @return The timestamp of when the Add On subscription was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the Add On subscription was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp of when the Add On subscription was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAddonSubscriptionResult withCreatedTimestamp(java.util.Date createdTimestamp) {
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
        if (getAddonName() != null)
            sb.append("AddonName: ").append(getAddonName()).append(",");
        if (getAddonSubscriptionArn() != null)
            sb.append("AddonSubscriptionArn: ").append(getAddonSubscriptionArn()).append(",");
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

        if (obj instanceof GetAddonSubscriptionResult == false)
            return false;
        GetAddonSubscriptionResult other = (GetAddonSubscriptionResult) obj;
        if (other.getAddonName() == null ^ this.getAddonName() == null)
            return false;
        if (other.getAddonName() != null && other.getAddonName().equals(this.getAddonName()) == false)
            return false;
        if (other.getAddonSubscriptionArn() == null ^ this.getAddonSubscriptionArn() == null)
            return false;
        if (other.getAddonSubscriptionArn() != null && other.getAddonSubscriptionArn().equals(this.getAddonSubscriptionArn()) == false)
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

        hashCode = prime * hashCode + ((getAddonName() == null) ? 0 : getAddonName().hashCode());
        hashCode = prime * hashCode + ((getAddonSubscriptionArn() == null) ? 0 : getAddonSubscriptionArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public GetAddonSubscriptionResult clone() {
        try {
            return (GetAddonSubscriptionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
