/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/StartInstanceRefresh" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartInstanceRefreshResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique ID for tracking the progress of the request.
     * </p>
     */
    private String instanceRefreshId;

    /**
     * <p>
     * A unique ID for tracking the progress of the request.
     * </p>
     * 
     * @param instanceRefreshId
     *        A unique ID for tracking the progress of the request.
     */

    public void setInstanceRefreshId(String instanceRefreshId) {
        this.instanceRefreshId = instanceRefreshId;
    }

    /**
     * <p>
     * A unique ID for tracking the progress of the request.
     * </p>
     * 
     * @return A unique ID for tracking the progress of the request.
     */

    public String getInstanceRefreshId() {
        return this.instanceRefreshId;
    }

    /**
     * <p>
     * A unique ID for tracking the progress of the request.
     * </p>
     * 
     * @param instanceRefreshId
     *        A unique ID for tracking the progress of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartInstanceRefreshResult withInstanceRefreshId(String instanceRefreshId) {
        setInstanceRefreshId(instanceRefreshId);
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
        if (getInstanceRefreshId() != null)
            sb.append("InstanceRefreshId: ").append(getInstanceRefreshId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartInstanceRefreshResult == false)
            return false;
        StartInstanceRefreshResult other = (StartInstanceRefreshResult) obj;
        if (other.getInstanceRefreshId() == null ^ this.getInstanceRefreshId() == null)
            return false;
        if (other.getInstanceRefreshId() != null && other.getInstanceRefreshId().equals(this.getInstanceRefreshId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceRefreshId() == null) ? 0 : getInstanceRefreshId().hashCode());
        return hashCode;
    }

    @Override
    public StartInstanceRefreshResult clone() {
        try {
            return (StartInstanceRefreshResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
