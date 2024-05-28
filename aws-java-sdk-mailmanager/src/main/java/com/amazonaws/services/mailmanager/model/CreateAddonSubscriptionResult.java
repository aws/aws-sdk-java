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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateAddonSubscription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAddonSubscriptionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the Add On subscription created by this API.
     * </p>
     */
    private String addonSubscriptionId;

    /**
     * <p>
     * The unique ID of the Add On subscription created by this API.
     * </p>
     * 
     * @param addonSubscriptionId
     *        The unique ID of the Add On subscription created by this API.
     */

    public void setAddonSubscriptionId(String addonSubscriptionId) {
        this.addonSubscriptionId = addonSubscriptionId;
    }

    /**
     * <p>
     * The unique ID of the Add On subscription created by this API.
     * </p>
     * 
     * @return The unique ID of the Add On subscription created by this API.
     */

    public String getAddonSubscriptionId() {
        return this.addonSubscriptionId;
    }

    /**
     * <p>
     * The unique ID of the Add On subscription created by this API.
     * </p>
     * 
     * @param addonSubscriptionId
     *        The unique ID of the Add On subscription created by this API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAddonSubscriptionResult withAddonSubscriptionId(String addonSubscriptionId) {
        setAddonSubscriptionId(addonSubscriptionId);
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
        if (getAddonSubscriptionId() != null)
            sb.append("AddonSubscriptionId: ").append(getAddonSubscriptionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAddonSubscriptionResult == false)
            return false;
        CreateAddonSubscriptionResult other = (CreateAddonSubscriptionResult) obj;
        if (other.getAddonSubscriptionId() == null ^ this.getAddonSubscriptionId() == null)
            return false;
        if (other.getAddonSubscriptionId() != null && other.getAddonSubscriptionId().equals(this.getAddonSubscriptionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddonSubscriptionId() == null) ? 0 : getAddonSubscriptionId().hashCode());
        return hashCode;
    }

    @Override
    public CreateAddonSubscriptionResult clone() {
        try {
            return (CreateAddonSubscriptionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
