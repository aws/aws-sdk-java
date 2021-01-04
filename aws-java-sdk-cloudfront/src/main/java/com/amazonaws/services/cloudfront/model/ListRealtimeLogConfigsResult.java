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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListRealtimeLogConfigs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRealtimeLogConfigsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of real-time log configurations.
     * </p>
     */
    private RealtimeLogConfigs realtimeLogConfigs;

    /**
     * <p>
     * A list of real-time log configurations.
     * </p>
     * 
     * @param realtimeLogConfigs
     *        A list of real-time log configurations.
     */

    public void setRealtimeLogConfigs(RealtimeLogConfigs realtimeLogConfigs) {
        this.realtimeLogConfigs = realtimeLogConfigs;
    }

    /**
     * <p>
     * A list of real-time log configurations.
     * </p>
     * 
     * @return A list of real-time log configurations.
     */

    public RealtimeLogConfigs getRealtimeLogConfigs() {
        return this.realtimeLogConfigs;
    }

    /**
     * <p>
     * A list of real-time log configurations.
     * </p>
     * 
     * @param realtimeLogConfigs
     *        A list of real-time log configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRealtimeLogConfigsResult withRealtimeLogConfigs(RealtimeLogConfigs realtimeLogConfigs) {
        setRealtimeLogConfigs(realtimeLogConfigs);
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
        if (getRealtimeLogConfigs() != null)
            sb.append("RealtimeLogConfigs: ").append(getRealtimeLogConfigs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRealtimeLogConfigsResult == false)
            return false;
        ListRealtimeLogConfigsResult other = (ListRealtimeLogConfigsResult) obj;
        if (other.getRealtimeLogConfigs() == null ^ this.getRealtimeLogConfigs() == null)
            return false;
        if (other.getRealtimeLogConfigs() != null && other.getRealtimeLogConfigs().equals(this.getRealtimeLogConfigs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRealtimeLogConfigs() == null) ? 0 : getRealtimeLogConfigs().hashCode());
        return hashCode;
    }

    @Override
    public ListRealtimeLogConfigsResult clone() {
        try {
            return (ListRealtimeLogConfigsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
