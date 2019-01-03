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
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Configuration parameters used to update the Channel.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/UpdateChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** A short text description of the Channel. */
    private String description;
    /** The ID of the Channel to update. */
    private String id;

    /**
     * A short text description of the Channel.
     * 
     * @param description
     *        A short text description of the Channel.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A short text description of the Channel.
     * 
     * @return A short text description of the Channel.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * A short text description of the Channel.
     * 
     * @param description
     *        A short text description of the Channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * The ID of the Channel to update.
     * 
     * @param id
     *        The ID of the Channel to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The ID of the Channel to update.
     * 
     * @return The ID of the Channel to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The ID of the Channel to update.
     * 
     * @param id
     *        The ID of the Channel to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withId(String id) {
        setId(id);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateChannelRequest == false)
            return false;
        UpdateChannelRequest other = (UpdateChannelRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateChannelRequest clone() {
        return (UpdateChannelRequest) super.clone();
    }

}
