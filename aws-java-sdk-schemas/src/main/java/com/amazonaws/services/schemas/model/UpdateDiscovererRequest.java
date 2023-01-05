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
package com.amazonaws.services.schemas.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UpdateDiscoverer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDiscovererRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the discoverer to update.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     */
    private String discovererId;
    /**
     * <p>
     * Support discovery of schemas in events sent to the bus from another account. (default: true)
     * </p>
     */
    private Boolean crossAccount;

    /**
     * <p>
     * The description of the discoverer to update.
     * </p>
     * 
     * @param description
     *        The description of the discoverer to update.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the discoverer to update.
     * </p>
     * 
     * @return The description of the discoverer to update.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the discoverer to update.
     * </p>
     * 
     * @param description
     *        The description of the discoverer to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDiscovererRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     * 
     * @param discovererId
     *        The ID of the discoverer.
     */

    public void setDiscovererId(String discovererId) {
        this.discovererId = discovererId;
    }

    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     * 
     * @return The ID of the discoverer.
     */

    public String getDiscovererId() {
        return this.discovererId;
    }

    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     * 
     * @param discovererId
     *        The ID of the discoverer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDiscovererRequest withDiscovererId(String discovererId) {
        setDiscovererId(discovererId);
        return this;
    }

    /**
     * <p>
     * Support discovery of schemas in events sent to the bus from another account. (default: true)
     * </p>
     * 
     * @param crossAccount
     *        Support discovery of schemas in events sent to the bus from another account. (default: true)
     */

    public void setCrossAccount(Boolean crossAccount) {
        this.crossAccount = crossAccount;
    }

    /**
     * <p>
     * Support discovery of schemas in events sent to the bus from another account. (default: true)
     * </p>
     * 
     * @return Support discovery of schemas in events sent to the bus from another account. (default: true)
     */

    public Boolean getCrossAccount() {
        return this.crossAccount;
    }

    /**
     * <p>
     * Support discovery of schemas in events sent to the bus from another account. (default: true)
     * </p>
     * 
     * @param crossAccount
     *        Support discovery of schemas in events sent to the bus from another account. (default: true)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDiscovererRequest withCrossAccount(Boolean crossAccount) {
        setCrossAccount(crossAccount);
        return this;
    }

    /**
     * <p>
     * Support discovery of schemas in events sent to the bus from another account. (default: true)
     * </p>
     * 
     * @return Support discovery of schemas in events sent to the bus from another account. (default: true)
     */

    public Boolean isCrossAccount() {
        return this.crossAccount;
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDiscovererId() != null)
            sb.append("DiscovererId: ").append(getDiscovererId()).append(",");
        if (getCrossAccount() != null)
            sb.append("CrossAccount: ").append(getCrossAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDiscovererRequest == false)
            return false;
        UpdateDiscovererRequest other = (UpdateDiscovererRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDiscovererId() == null ^ this.getDiscovererId() == null)
            return false;
        if (other.getDiscovererId() != null && other.getDiscovererId().equals(this.getDiscovererId()) == false)
            return false;
        if (other.getCrossAccount() == null ^ this.getCrossAccount() == null)
            return false;
        if (other.getCrossAccount() != null && other.getCrossAccount().equals(this.getCrossAccount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDiscovererId() == null) ? 0 : getDiscovererId().hashCode());
        hashCode = prime * hashCode + ((getCrossAccount() == null) ? 0 : getCrossAccount().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDiscovererRequest clone() {
        return (UpdateDiscovererRequest) super.clone();
    }

}
