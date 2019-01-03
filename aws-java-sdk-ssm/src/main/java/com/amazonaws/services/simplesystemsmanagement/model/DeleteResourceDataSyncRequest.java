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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteResourceDataSync" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteResourceDataSyncRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration to delete.
     * </p>
     */
    private String syncName;

    /**
     * <p>
     * The name of the configuration to delete.
     * </p>
     * 
     * @param syncName
     *        The name of the configuration to delete.
     */

    public void setSyncName(String syncName) {
        this.syncName = syncName;
    }

    /**
     * <p>
     * The name of the configuration to delete.
     * </p>
     * 
     * @return The name of the configuration to delete.
     */

    public String getSyncName() {
        return this.syncName;
    }

    /**
     * <p>
     * The name of the configuration to delete.
     * </p>
     * 
     * @param syncName
     *        The name of the configuration to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteResourceDataSyncRequest withSyncName(String syncName) {
        setSyncName(syncName);
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
        if (getSyncName() != null)
            sb.append("SyncName: ").append(getSyncName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteResourceDataSyncRequest == false)
            return false;
        DeleteResourceDataSyncRequest other = (DeleteResourceDataSyncRequest) obj;
        if (other.getSyncName() == null ^ this.getSyncName() == null)
            return false;
        if (other.getSyncName() != null && other.getSyncName().equals(this.getSyncName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSyncName() == null) ? 0 : getSyncName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteResourceDataSyncRequest clone() {
        return (DeleteResourceDataSyncRequest) super.clone();
    }

}
