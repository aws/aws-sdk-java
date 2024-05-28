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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/UpdateAdapter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAdapterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A string containing a unique ID for the adapter that will be updated.
     * </p>
     */
    private String adapterId;
    /**
     * <p>
     * The new description to be applied to the adapter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The new name to be applied to the adapter.
     * </p>
     */
    private String adapterName;
    /**
     * <p>
     * The new auto-update status to be applied to the adapter.
     * </p>
     */
    private String autoUpdate;

    /**
     * <p>
     * A string containing a unique ID for the adapter that will be updated.
     * </p>
     * 
     * @param adapterId
     *        A string containing a unique ID for the adapter that will be updated.
     */

    public void setAdapterId(String adapterId) {
        this.adapterId = adapterId;
    }

    /**
     * <p>
     * A string containing a unique ID for the adapter that will be updated.
     * </p>
     * 
     * @return A string containing a unique ID for the adapter that will be updated.
     */

    public String getAdapterId() {
        return this.adapterId;
    }

    /**
     * <p>
     * A string containing a unique ID for the adapter that will be updated.
     * </p>
     * 
     * @param adapterId
     *        A string containing a unique ID for the adapter that will be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAdapterRequest withAdapterId(String adapterId) {
        setAdapterId(adapterId);
        return this;
    }

    /**
     * <p>
     * The new description to be applied to the adapter.
     * </p>
     * 
     * @param description
     *        The new description to be applied to the adapter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new description to be applied to the adapter.
     * </p>
     * 
     * @return The new description to be applied to the adapter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The new description to be applied to the adapter.
     * </p>
     * 
     * @param description
     *        The new description to be applied to the adapter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAdapterRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The new name to be applied to the adapter.
     * </p>
     * 
     * @param adapterName
     *        The new name to be applied to the adapter.
     */

    public void setAdapterName(String adapterName) {
        this.adapterName = adapterName;
    }

    /**
     * <p>
     * The new name to be applied to the adapter.
     * </p>
     * 
     * @return The new name to be applied to the adapter.
     */

    public String getAdapterName() {
        return this.adapterName;
    }

    /**
     * <p>
     * The new name to be applied to the adapter.
     * </p>
     * 
     * @param adapterName
     *        The new name to be applied to the adapter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAdapterRequest withAdapterName(String adapterName) {
        setAdapterName(adapterName);
        return this;
    }

    /**
     * <p>
     * The new auto-update status to be applied to the adapter.
     * </p>
     * 
     * @param autoUpdate
     *        The new auto-update status to be applied to the adapter.
     * @see AutoUpdate
     */

    public void setAutoUpdate(String autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    /**
     * <p>
     * The new auto-update status to be applied to the adapter.
     * </p>
     * 
     * @return The new auto-update status to be applied to the adapter.
     * @see AutoUpdate
     */

    public String getAutoUpdate() {
        return this.autoUpdate;
    }

    /**
     * <p>
     * The new auto-update status to be applied to the adapter.
     * </p>
     * 
     * @param autoUpdate
     *        The new auto-update status to be applied to the adapter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoUpdate
     */

    public UpdateAdapterRequest withAutoUpdate(String autoUpdate) {
        setAutoUpdate(autoUpdate);
        return this;
    }

    /**
     * <p>
     * The new auto-update status to be applied to the adapter.
     * </p>
     * 
     * @param autoUpdate
     *        The new auto-update status to be applied to the adapter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoUpdate
     */

    public UpdateAdapterRequest withAutoUpdate(AutoUpdate autoUpdate) {
        this.autoUpdate = autoUpdate.toString();
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
        if (getAdapterId() != null)
            sb.append("AdapterId: ").append(getAdapterId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAdapterName() != null)
            sb.append("AdapterName: ").append(getAdapterName()).append(",");
        if (getAutoUpdate() != null)
            sb.append("AutoUpdate: ").append(getAutoUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAdapterRequest == false)
            return false;
        UpdateAdapterRequest other = (UpdateAdapterRequest) obj;
        if (other.getAdapterId() == null ^ this.getAdapterId() == null)
            return false;
        if (other.getAdapterId() != null && other.getAdapterId().equals(this.getAdapterId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAdapterName() == null ^ this.getAdapterName() == null)
            return false;
        if (other.getAdapterName() != null && other.getAdapterName().equals(this.getAdapterName()) == false)
            return false;
        if (other.getAutoUpdate() == null ^ this.getAutoUpdate() == null)
            return false;
        if (other.getAutoUpdate() != null && other.getAutoUpdate().equals(this.getAutoUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdapterId() == null) ? 0 : getAdapterId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAdapterName() == null) ? 0 : getAdapterName().hashCode());
        hashCode = prime * hashCode + ((getAutoUpdate() == null) ? 0 : getAutoUpdate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAdapterRequest clone() {
        return (UpdateAdapterRequest) super.clone();
    }

}
