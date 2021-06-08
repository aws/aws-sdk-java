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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteRealtimeLogConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRealtimeLogConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the real-time log configuration to delete.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the real-time log configuration to delete.
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * The name of the real-time log configuration to delete.
     * </p>
     * 
     * @param name
     *        The name of the real-time log configuration to delete.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the real-time log configuration to delete.
     * </p>
     * 
     * @return The name of the real-time log configuration to delete.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the real-time log configuration to delete.
     * </p>
     * 
     * @param name
     *        The name of the real-time log configuration to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRealtimeLogConfigRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the real-time log configuration to delete.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the real-time log configuration to delete.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the real-time log configuration to delete.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the real-time log configuration to delete.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the real-time log configuration to delete.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the real-time log configuration to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRealtimeLogConfigRequest withARN(String aRN) {
        setARN(aRN);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRealtimeLogConfigRequest == false)
            return false;
        DeleteRealtimeLogConfigRequest other = (DeleteRealtimeLogConfigRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRealtimeLogConfigRequest clone() {
        return (DeleteRealtimeLogConfigRequest) super.clone();
    }

}
