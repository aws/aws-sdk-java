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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelLoaderJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelLoaderJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the load job to be deleted.
     * </p>
     */
    private String loadId;

    /**
     * <p>
     * The ID of the load job to be deleted.
     * </p>
     * 
     * @param loadId
     *        The ID of the load job to be deleted.
     */

    public void setLoadId(String loadId) {
        this.loadId = loadId;
    }

    /**
     * <p>
     * The ID of the load job to be deleted.
     * </p>
     * 
     * @return The ID of the load job to be deleted.
     */

    public String getLoadId() {
        return this.loadId;
    }

    /**
     * <p>
     * The ID of the load job to be deleted.
     * </p>
     * 
     * @param loadId
     *        The ID of the load job to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelLoaderJobRequest withLoadId(String loadId) {
        setLoadId(loadId);
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
        if (getLoadId() != null)
            sb.append("LoadId: ").append(getLoadId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelLoaderJobRequest == false)
            return false;
        CancelLoaderJobRequest other = (CancelLoaderJobRequest) obj;
        if (other.getLoadId() == null ^ this.getLoadId() == null)
            return false;
        if (other.getLoadId() != null && other.getLoadId().equals(this.getLoadId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadId() == null) ? 0 : getLoadId().hashCode());
        return hashCode;
    }

    @Override
    public CancelLoaderJobRequest clone() {
        return (CancelLoaderJobRequest) super.clone();
    }

}
